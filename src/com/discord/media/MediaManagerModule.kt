package com.discord.media

import Q8.n
import Q8.s
import X8.b
import android.media.MediaCodecInfo
import android.media.MediaCodecList
import android.media.MediaCodecInfo.VideoCapabilities
import android.net.Uri
import android.os.BatteryManager
import android.os.PowerManager
import android.os.Build.VERSION
import android.webkit.URLUtil
import com.discord.crash_reporting.CrashReporting
import com.discord.device.e
import com.discord.file_downloader.DownloadState
import com.discord.file_downloader.PublicFileDownloader
import com.discord.media.react.events.CompressionProgressEvent
import com.discord.media.utils.EncodingConfig
import com.discord.media.utils.MediaResolver
import com.discord.react.utilities.NativeMapExtensionsKt
import com.discord.reactevents.ReactEvents
import com.facebook.react.bridge.Arguments
import com.facebook.react.bridge.Promise
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod
import com.facebook.react.bridge.ReadableMap
import com.facebook.react.bridge.WritableArray
import com.facebook.react.bridge.WritableMap
import java.util.Map.Entry
import java.util.concurrent.CancellationException
import kotlin.coroutines.Continuation
import kotlin.jvm.functions.Function2
import kotlin.jvm.internal.G
import kotlin.jvm.internal.q
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.g
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector
import za.K
import za.f

public class MediaManagerModule(reactContext: ReactApplicationContext) : ReactContextBaseJavaModule {
   private final val reactEvents: ReactEvents
   private final val scope: CoroutineScope
   private final val mediaResolver: MediaResolver

   init {
      q.h(var1, "reactContext");
      super(var1);
      this.reactEvents = new ReactEvents(s.a("compression-progress", G.b(CompressionProgressEvent.class)));
      this.scope = g.b();
      this.mediaResolver = new MediaResolver(var1, new a(this));
   }

   private fun checkEncodingConstraints(width: Int, height: Int, frameRate: Double, videoCapabilities: VideoCapabilities): WritableArray {
      val var8: WritableArray = Arguments.createArray();
      if (var1 % var5.getWidthAlignment() != 0 || var2 % var5.getHeightAlignment() != 0) {
         val var16: WritableMap = Arguments.createMap();
         var16.putString("type", "resolution_alignment");
         val var6: Int = var5.getWidthAlignment();
         val var7: Int = var5.getHeightAlignment();
         val var17: StringBuilder = new StringBuilder();
         var17.append("Resolution must be aligned to ");
         var17.append(var6);
         var17.append("x");
         var17.append(var7);
         var16.putString("message", var17.toString());
         val var11: WritableMap = Arguments.createMap();
         var11.putInt("width", var1);
         var11.putInt("height", var2);
         var16.putMap("current", var11);
         val var19: WritableMap = Arguments.createMap();
         var19.putInt("width", var5.getWidthAlignment());
         var19.putInt("height", var5.getHeightAlignment());
         var16.putMap("alignment", var19);
         var8.pushMap(var16);
      } else if (!var5.isSizeSupported(var1, var2)) {
         val var12: WritableMap = Arguments.createMap();
         var12.putString("type", "resolution");
         val var9: StringBuilder = new StringBuilder();
         var9.append("Resolution ");
         var9.append(var1);
         var9.append("x");
         var9.append(var2);
         var9.append(" not supported");
         var12.putString("message", var9.toString());
         val var14: WritableMap = Arguments.createMap();
         var14.putInt("width", var1);
         var14.putInt("height", var2);
         var12.putMap("current", var14);
         var8.pushMap(var12);
      } else if (!var5.areSizeAndRateSupported(var1, var2, var3)) {
         val var13: WritableMap = Arguments.createMap();
         var13.putString("type", "frameRate");
         val var15: StringBuilder = new StringBuilder();
         var15.append("Frame rate ");
         var15.append(var3);
         var15.append(" not supported at resolution ");
         var15.append(var1);
         var15.append("x");
         var15.append(var2);
         var13.putString("message", var15.toString());
         var13.putDouble("current", var3);
         var8.pushMap(var13);
      }

      q.e(var8);
      return var8;
   }

   private fun createCapabilitiesMap(videoCapabilities: VideoCapabilities): WritableMap {
      val var2: WritableMap = Arguments.createMap();
      var var3: WritableMap = Arguments.createMap();
      var var4: java.lang.Comparable = var1.getSupportedWidths().getLower();
      q.g(var4, "getLower(...)");
      var3.putInt("minWidth", (var4 as java.lang.Number).intValue());
      var4 = var1.getSupportedWidths().getUpper();
      q.g(var4, "getUpper(...)");
      var3.putInt("maxWidth", (var4 as java.lang.Number).intValue());
      var4 = var1.getSupportedHeights().getLower();
      q.g(var4, "getLower(...)");
      var3.putInt("minHeight", (var4 as java.lang.Number).intValue());
      var4 = var1.getSupportedHeights().getUpper();
      q.g(var4, "getUpper(...)");
      var3.putInt("maxHeight", (var4 as java.lang.Number).intValue());
      var2.putMap("resolution", var3);
      var3 = Arguments.createMap();
      val var11: Int = var1.getSupportedFrameRates().getLower() as Int;
      if (var11 != null) {
         var3.putDouble("min", (double)var11.intValue());
      }

      val var12: Int = var1.getSupportedFrameRates().getUpper() as Int;
      if (var12 != null) {
         var3.putDouble("max", (double)var12.intValue());
      }

      var2.putMap("frameRate", var3);
      var3 = Arguments.createMap();
      var4 = var1.getBitrateRange().getLower();
      q.g(var4, "getLower(...)");
      var3.putInt("min", (var4 as java.lang.Number).intValue());
      var4 = var1.getBitrateRange().getUpper();
      q.g(var4, "getUpper(...)");
      var3.putInt("max", (var4 as java.lang.Number).intValue());
      var2.putMap("bitrate", var3);
      var3 = Arguments.createMap();
      var3.putInt("widthAlignment", var1.getWidthAlignment());
      var3.putInt("heightAlignment", var1.getHeightAlignment());
      var2.putMap("blockSize", var3);
      q.e(var2);
      return var2;
   }

   private fun getEncoderInfo(mimeType: String): MediaCodecInfo? {
      val var8: Array<MediaCodecInfo> = new MediaCodecList(0).getCodecInfos();
      q.g(var8, "getCodecInfos(...)");
      val var4: Int = var8.length;

      for (int var2 = 0; var2 < var4; var2++) {
         val var6: MediaCodecInfo = var8[var2];
         if (var8[var2].isEncoder()) {
            val var7: Array<java.lang.String> = var6.getSupportedTypes();
            q.g(var7, "getSupportedTypes(...)");
            val var5: Int = var7.length;

            for (int var3 = 0; var3 < var5; var3++) {
               if (q.c(var7[var3], var1)) {
                  return var6;
               }
            }
         }
      }

      return null;
   }

   @JvmStatic
   fun `mediaResolver$lambda$0`(var0: MediaManagerModule, var1: Uri, var2: Int): Unit {
      q.h(var1, "uri");
      val var3: ReactEvents = var0.reactEvents;
      val var4: ReactApplicationContext = var0.getReactApplicationContext();
      q.g(var4, "getReactApplicationContext(...)");
      val var5: java.lang.String = var1.toString();
      q.g(var5, "toString(...)");
      var3.emitModuleEvent(var4, new CompressionProgressEvent(var5, var2));
      return Unit.a;
   }

   @ReactMethod
   public fun addListener(type: String) {
      q.h(var1, "type");
   }

   @ReactMethod
   public fun cancelResolveToMediaFilePath(uri: String, options: ReadableMap?, promise: Promise) {
      q.h(var1, "uri");
      q.h(var3, "promise");
      val var5: MediaResolver = this.mediaResolver;
      val var4: Uri = Uri.parse(var1);
      q.g(var4, "parse(...)");
      var5.cancel(var4);
      var3.resolve(null);
   }

   @ReactMethod
   public fun convertBase64ToGIF(uri: String, options: ReadableMap?, promise: Promise) {
      q.h(var1, "uri");
      q.h(var3, "promise");
      throw new IllegalStateException("Unused on Android");
   }

   @ReactMethod
   public fun convertBase64ToJPEG(uri: String, options: ReadableMap?, promise: Promise) {
      q.h(var1, "uri");
      q.h(var3, "promise");
      throw new IllegalStateException("Unused on Android");
   }

   @ReactMethod
   public fun convertToCompatibleMOV(uri: String, options: ReadableMap?, promise: Promise) {
      q.h(var1, "uri");
      q.h(var3, "promise");
      throw new IllegalStateException("Unused on Android");
   }

   @ReactMethod
   public fun convertToJPEG(uri: String, options: ReadableMap?, promise: Promise) {
      q.h(var1, "uri");
      q.h(var3, "promise");
      throw new IllegalStateException("Unused on Android");
   }

   @ReactMethod
   public fun convertToVideoFilePath(uri: String, options: ReadableMap?, promise: Promise) {
      q.h(var1, "uri");
      q.h(var3, "promise");
      throw new IllegalStateException("Unused on Android");
   }

   @ReactMethod
   public fun downloadMediaAsset(uri: String, mediaType: Int, promise: Promise) {
      q.h(var1, "uri");
      q.h(var3, "promise");
      f.d(this.scope, K.b(), null, new Function2(this, var1, var3, null) {
         final Promise $promise;
         final java.lang.String $uri;
         int label;
         final MediaManagerModule this$0;

         {
            super(2, var4);
            this.this$0 = var1;
            this.$uri = var2x;
            this.$promise = var3;
         }

         public final Continuation create(Object var1, Continuation var2) {
            return new <anonymous constructor>(this.this$0, this.$uri, this.$promise, var2);
         }

         public final Object invoke(CoroutineScope var1, Continuation var2x) {
            return (this.create(var1, var2x) as <unrepresentable>).invokeSuspend(Unit.a);
         }

         public final Object invokeSuspend(Object var1) {
            val var3: Any = b.e();
            if (this.label != 0) {
               if (this.label != 1) {
                  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
               }

               c.b(var1);
            } else {
               c.b(var1);
               val var5: PublicFileDownloader = PublicFileDownloader.INSTANCE;
               val var6: ReactApplicationContext = MediaManagerModule.access$getReactApplicationContext(this.this$0);
               q.g(var6, "access$getReactApplicationContext(...)");
               val var4: java.lang.String = this.$uri;
               var1 = URLUtil.guessFileName(this.$uri, null, null);
               q.g(var1, "guessFileName(...)");
               val var9: Flow = PublicFileDownloader.downloadFile$default(var5, var6, var4, var1, null, 8, null);
               val var8: FlowCollector = new FlowCollector(this.$promise) {
                  final Promise $promise;

                  {
                     this.$promise = var1;
                  }

                  public final Object emit(DownloadState var1, Continuation var2x) {
                     if (var1 is DownloadState.Completed) {
                        this.$promise.resolve(kotlin.coroutines.jvm.internal.b.a(true));
                     } else if (var1 is DownloadState.Failure) {
                        this.$promise.reject(new IllegalStateException("Unable to download asset."));
                     } else if (var1 !is DownloadState.InProgress) {
                        throw new n();
                     }

                     return Unit.a;
                  }
               };
               this.label = 1;
               if (var9.collect(var8, this) === var3) {
                  return var3;
               }
            }

            return Unit.a;
         }
      }, 2, null);
   }

   public open fun getConstants(): Map<String, List<String>> {
      return R8.q.e(s.a("supportedExtensions", i.n(new java.lang.String[]{"mp4", "mov", "png", "jpg", "jpeg", "gif", "webp"})));
   }

   @ReactMethod
   public fun getDeviceStateInfo(promise: Promise) {
      q.h(var1, "promise");
      val var8: ReactApplicationContext = this.getReactApplicationContext();
      q.g(var8, "getReactApplicationContext(...)");
      var var6: Any = var8.getSystemService("batterymanager");
      q.f(var6, "null cannot be cast to non-null type android.os.BatteryManager");
      val var2: Double = (var6 as BatteryManager).getIntProperty(4) / 100.0;
      var6 = "UNKNOWN";
      if (VERSION.SDK_INT >= 29) {
         var6 = var8.getSystemService("power");
         q.f(var6, "null cannot be cast to non-null type android.os.PowerManager");
         val var9: Int = e.a(var6 as PowerManager);
         if (var9 != 0) {
            if (var9 == 1 || var9 == 2) {
               var6 = "FAIR";
            } else if (var9 != 3) {
               if (var9 != 4 && var9 != 5) {
                  var6 = "UNKNOWN";
               } else {
                  var6 = "CRITICAL";
               }
            } else {
               var6 = "SERIOUS";
            }
         } else {
            var6 = "NOMINAL";
         }
      }

      var var12: WritableMap = (WritableMap)var8.getSystemService("power");
      q.f(var12, "null cannot be cast to non-null type android.os.PowerManager");
      val var5: Boolean = (var12 as PowerManager).isPowerSaveMode();
      var12 = Arguments.createMap();
      var12.putString("thermalState", (java.lang.String)var6);
      var12.putDouble("batteryLevel", var2);
      var12.putBoolean("isLowPowerMode", var5);
      q.g(var12, "apply(...)");
      var1.resolve(var12);
   }

   @ReactMethod
   public fun getLosslessImageData(uri: String, promise: Promise) {
      q.h(var1, "uri");
      q.h(var2, "promise");
      var2.resolve(var1);
   }

   public open fun getName(): String {
      return "MediaManager";
   }

   @ReactMethod
   public fun getVideoMetadata(uri: String, options: ReadableMap?, promise: Promise) {
      q.h(var1, "uri");
      q.h(var3, "promise");
      f.d(
         this.scope,
         null,
         null,
         new Function2(this, Uri.parse(var1), var3, null) {
            final Uri $inputUri;
            final Promise $promise;
            private Object L$0;
            int label;
            final MediaManagerModule this$0;

            {
               super(2, var4);
               this.this$0 = var1;
               this.$inputUri = var2x;
               this.$promise = var3x;
            }

            public final Continuation create(Object var1, Continuation var2) {
               val var3: Function2 = new <anonymous constructor>(this.this$0, this.$inputUri, this.$promise, var2);
               var3.L$0 = var1;
               return var3;
            }

            public final Object invoke(CoroutineScope var1, Continuation var2x) {
               return (this.create(var1, var2x) as <unrepresentable>).invokeSuspend(Unit.a);
            }

            // $VF: Duplicated exception handlers to handle obfuscated exceptions
            // $VF: Could not inline inconsistent finally blocks
            // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
            public final Object invokeSuspend(Object var1) {
               b.e();
               if (this.label == 0) {
                  c.b(var1);
                  var1 = this.L$0 as CoroutineScope;
                  var var4: MediaManagerModule = this.this$0;
                  val var2x: Uri = this.$inputUri;
                  var1 = this.$promise;

                  label77: {
                     var var5: java.util.Iterator;
                     var var63: WritableMap;
                     try {
                        val var3x: kotlin.Result.a = Result.k;
                        val var62: MediaResolver = MediaManagerModule.access$getMediaResolver$p(var4);
                        q.e(var2x);
                        val var59: java.util.Map = var62.handleVideoMetadata(var2x);
                        var63 = Arguments.createMap();
                        q.g(var63, "createMap(...)");
                        var5 = var59.entrySet().iterator();
                     } catch (var8: java.lang.Throwable) {
                        val var50: kotlin.Result.a = Result.k;
                        var1 = Result.b(c.a(var8));
                        break label77;
                     }

                     label76:
                     while (true) {
                        while (true) {
                           try {
                              if (!var5.hasNext()) {
                                 break;
                              }

                              val var65: Entry = var5.next() as Entry;
                              var60 = var65.getKey() as java.lang.String;
                              var4 = (MediaManagerModule)var65.getValue();
                              if (var4 is Int) {
                                 var63.putInt(var60, (var4 as java.lang.Number).intValue());
                                 continue;
                              }
                           } catch (var11: java.lang.Throwable) {
                              val var52: kotlin.Result.a = Result.k;
                              var1 = Result.b(c.a(var11));
                              break label76;
                           }

                           try {
                              if (var4 is java.lang.Boolean) {
                                 var63.putBoolean(var60, var4 as java.lang.Boolean);
                                 continue;
                              }
                           } catch (var10: java.lang.Throwable) {
                              val var53: kotlin.Result.a = Result.k;
                              var1 = Result.b(c.a(var10));
                              break label76;
                           }

                           try {
                              if (var4 is java.lang.String) {
                                 var63.putString(var60, var4 as java.lang.String);
                                 continue;
                              }
                           } catch (var9: java.lang.Throwable) {
                              val var54: kotlin.Result.a = Result.k;
                              var1 = Result.b(c.a(var9));
                              break label76;
                           }

                           try {
                              val var64: java.lang.String = var4.getClass().getName();
                              val var67: StringBuilder = new StringBuilder();
                              var67.append("Unsupported value type ");
                              var67.append(var64);
                              var67.append(" for key [");
                              var67.append(var60);
                              var67.append("]");
                              throw new IllegalArgumentException(var67.toString());
                           } catch (var7: java.lang.Throwable) {
                              val var55: kotlin.Result.a = Result.k;
                              var1 = Result.b(c.a(var7));
                              break label76;
                           }
                        }

                        try {
                           var1.resolve(var63);
                           var1 = Result.b(Unit.a);
                           break;
                        } catch (var6: java.lang.Throwable) {
                           val var57: kotlin.Result.a = Result.k;
                           var1 = Result.b(c.a(var6));
                           break;
                        }
                     }
                  }

                  val var61: Promise = this.$promise;
                  val var58: java.lang.Throwable = Result.e(var1);
                  if (var58 != null) {
                     var61.reject(var58);
                  }

                  return Unit.a;
               } else {
                  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
               }
            }
         },
         3,
         null
      );
   }

   public open fun invalidate() {
      super.invalidate();
      g.d(this.scope, new CancellationException("Module destroyed"));
   }

   @ReactMethod
   public fun isHEVCEncodingSupported(promise: Promise) {
      q.h(var1, "promise");

      var var2: Boolean;
      label23: {
         label22: {
            try {
               if (this.getEncoderInfo("video/hevc") != null) {
                  break label22;
               }
            } catch (var5: Exception) {
               var1.resolve(java.lang.Boolean.FALSE);
               return;
            }

            var2 = false;
            break label23;
         }

         var2 = true;
      }

      try {
         var1.resolve(var2);
      } catch (var4: Exception) {
         var1.resolve(java.lang.Boolean.FALSE);
      }
   }

   @ReactMethod
   public fun isVideoEncodingSupported(options: ReadableMap, promise: Promise) {
      q.h(var1, "options");
      q.h(var2, "promise");

      var var3: Double;
      var var5: Int;
      var var6: Int;
      label58: {
         label57: {
            try {
               var5 = var1.getInt("width");
               var6 = var1.getInt("height");
               var3 = var1.getDouble("frameRate");
               if (var1.getBoolean("isHEVC")) {
                  break label57;
               }
            } catch (var16: Exception) {
               val var17: java.lang.String = var16.getMessage();
               val var7: StringBuilder = new StringBuilder();
               var7.append("Error checking video encoding support: ");
               var7.append(var17);
               var2.reject("ERROR", var7.toString());
               return;
            }

            var18 = "video/avc";
            break label58;
         }

         var18 = "video/hevc";
      }

      var var8: MediaCodecInfo;
      var var27: WritableMap;
      try {
         var27 = Arguments.createMap();
         var8 = this.getEncoderInfo(var18);
      } catch (var15: Exception) {
         val var19: java.lang.String = var15.getMessage();
         val var26: StringBuilder = new StringBuilder();
         var26.append("Error checking video encoding support: ");
         var26.append(var19);
         var2.reject("ERROR", var26.toString());
         return;
      }

      if (var8 == null) {
         try {
            var27.putBoolean("isSupported", false);
            val var9: WritableArray = Arguments.createArray();
            val var32: WritableMap = Arguments.createMap();
            var32.putString("type", "codec_not_found");
            val var10: StringBuilder = new StringBuilder();
            var10.append("No encoder found for mime type: ");
            var10.append(var18);
            var32.putString("message", var10.toString());
            var9.pushMap(var32);
            var27.putArray("failures", var9);
            var27.putMap("capabilities", Arguments.createMap());
            var2.resolve(var27);
            return;
         } catch (var14: Exception) {
            val var20: java.lang.String = var14.getMessage();
            val var28: StringBuilder = new StringBuilder();
            var28.append("Error checking video encoding support: ");
            var28.append(var20);
            var2.reject("ERROR", var28.toString());
         }
      } else {
         label42: {
            try {
               var27.putString("encoderName", var8.getName());
               val var22: VideoCapabilities = var8.getCapabilitiesForType(var18).getVideoCapabilities();
               q.e(var22);
               var27.putMap("capabilities", this.createCapabilitiesMap(var22));
               val var23: WritableArray = this.checkEncodingConstraints(var5, var6, var3, var22);
               if (var23.size() > 0) {
                  var27.putBoolean("isSupported", false);
                  var27.putArray("failures", var23);
                  break label42;
               }
            } catch (var13: Exception) {
               val var21: java.lang.String = var13.getMessage();
               val var29: StringBuilder = new StringBuilder();
               var29.append("Error checking video encoding support: ");
               var29.append(var21);
               var2.reject("ERROR", var29.toString());
               return;
            }

            try {
               var27.putBoolean("isSupported", true);
            } catch (var12: Exception) {
               val var24: java.lang.String = var12.getMessage();
               val var30: StringBuilder = new StringBuilder();
               var30.append("Error checking video encoding support: ");
               var30.append(var24);
               var2.reject("ERROR", var30.toString());
               return;
            }
         }

         try {
            var2.resolve(var27);
         } catch (var11: Exception) {
            val var25: java.lang.String = var11.getMessage();
            val var31: StringBuilder = new StringBuilder();
            var31.append("Error checking video encoding support: ");
            var31.append(var25);
            var2.reject("ERROR", var31.toString());
         }
      }
   }

   @ReactMethod
   public fun removeListeners(count: Int) {
   }

   @ReactMethod
   public fun resolveToMediaFilePath(uri: String, options: ReadableMap?, promise: Promise) {
      var var7: Int;
      var var10: Boolean;
      var var11: Boolean;
      var var12: Boolean;
      var var13: Uri;
      label17: {
         q.h(var1, "uri");
         q.h(var3, "promise");
         var13 = Uri.parse(var1);
         var7 = (int)(NativeMapExtensionsKt.getDouble(var2, "compressionQuality", 1.0) * 100);
         var10 = NativeMapExtensionsKt.getBoolean(var2, "isLowQuality", false);
         var12 = NativeMapExtensionsKt.getBoolean(var2, "skipVideoTranscode", false);
         var11 = NativeMapExtensionsKt.getBoolean(var2, "useOriginalIfSmaller", false);
         if (var2 != null) {
            var2 = var2.getMap("encodingConfig");
            if (var2 != null) {
               try {
                  var17 = new EncodingConfig(
                     var2.getInt("targetWidth"),
                     var2.getInt("targetHeight"),
                     var2.getDouble("frameRate"),
                     var2.getDouble("keyFrameIntervalSeconds"),
                     var2.getInt("targetBitrate"),
                     var2.getBoolean("useHEVC"),
                     var2.getBoolean("createHDR"),
                     var2.getInt("rotationDegrees"),
                     var2.getInt("progressUpdateGranularity")
                  );
                  break label17;
               } catch (var14: Exception) {
                  val var18: java.lang.String = var14.getMessage();
                  val var15: StringBuilder = new StringBuilder();
                  var15.append("Invalid encodingConfig: ");
                  var15.append(var18);
                  var3.reject(new IllegalArgumentException(var15.toString()));
                  return;
               }
            }
         }

         var17 = null;
      }

      f.d(
         this.scope,
         null,
         null,
         new Function2(this, var13, var7, var10, var12, var11, var17, var3, var1, null) {
            final EncodingConfig $encodingConfig;
            final int $imageCompressionQuality;
            final Uri $inputUri;
            final boolean $isLowQuality;
            final Promise $promise;
            final boolean $skipVideoTranscode;
            final java.lang.String $uri;
            final boolean $useOriginalIfSmaller;
            private Object L$0;
            int label;
            final MediaManagerModule this$0;

            {
               super(2, var10);
               this.this$0 = var1;
               this.$inputUri = var2x;
               this.$imageCompressionQuality = var3x;
               this.$isLowQuality = var4;
               this.$skipVideoTranscode = var5;
               this.$useOriginalIfSmaller = var6;
               this.$encodingConfig = var7;
               this.$promise = var8;
               this.$uri = var9;
            }

            public final Continuation create(Object var1, Continuation var2) {
               val var3: Function2 = new <anonymous constructor>(
                  this.this$0,
                  this.$inputUri,
                  this.$imageCompressionQuality,
                  this.$isLowQuality,
                  this.$skipVideoTranscode,
                  this.$useOriginalIfSmaller,
                  this.$encodingConfig,
                  this.$promise,
                  this.$uri,
                  var2
               );
               var3.L$0 = var1;
               return var3;
            }

            public final Object invoke(CoroutineScope var1, Continuation var2x) {
               return (this.create(var1, var2x) as <unrepresentable>).invokeSuspend(Unit.a);
            }

            // $VF: Duplicated exception handlers to handle obfuscated exceptions
            // $VF: Could not inline inconsistent finally blocks
            // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
            public final Object invokeSuspend(Object var1) {
               label49: {
                  var var6: Promise = (Promise)b.e();
                  var var7: Any;
                  if (this.label != 0) {
                     if (this.label != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                     }

                     var6 = this.L$0 as Promise;

                     try {
                        c.b(var1);
                     } catch (var13: java.lang.Throwable) {
                        val var29: kotlin.Result.a = Result.k;
                        var1 = Result.b(c.a(var13));
                        break label49;
                     }

                     var7 = var1;
                  } else {
                     c.b(var1);
                     var1 = this.L$0 as CoroutineScope;
                     val var9: MediaManagerModule = this.this$0;
                     val var8: Uri = this.$inputUri;
                     val var27: Int = this.$imageCompressionQuality;
                     val var3x: Boolean = this.$isLowQuality;
                     val var4: Boolean = this.$skipVideoTranscode;
                     val var5: Boolean = this.$useOriginalIfSmaller;
                     var7 = this.$encodingConfig;
                     val var25: Promise = this.$promise;

                     try {
                        val var10: kotlin.Result.a = Result.k;
                        val var37: MediaResolver = MediaManagerModule.access$getMediaResolver$p(var9);
                        q.e(var8);
                        this.L$0 = var25;
                        this.label = 1;
                        var7 = var37.resolveToUri$media_release(var8, var27, var3x, var4, var5, (EncodingConfig)var7, this);
                     } catch (var12: java.lang.Throwable) {
                        val var30: kotlin.Result.a = Result.k;
                        var1 = Result.b(c.a(var12));
                        break label49;
                     }

                     if (var7 === var6) {
                        return var6;
                     }

                     var6 = var25;
                  }

                  label37:
                  try {
                     var6.resolve((var7 as Uri).toString());
                     var1 = Result.b(Unit.a);
                  } catch (var11: java.lang.Throwable) {
                     val var31: kotlin.Result.a = Result.k;
                     var1 = Result.b(c.a(var11));
                     break label37;
                  }
               }

               val var32: Promise = this.$promise;
               val var39: java.lang.String = this.$uri;
               val var35: MediaManagerModule = this.this$0;
               val var34: Uri = this.$inputUri;
               val var38: java.lang.Throwable = Result.e(var1);
               if (var38 != null) {
                  if (var38 is CancellationException) {
                     var32.reject(var38);
                  }

                  val var26: CrashReporting = CrashReporting.INSTANCE;
                  val var40: Pair = s.a("uri", var39);
                  val var36: MediaResolver = MediaManagerModule.access$getMediaResolver$p(var35);
                  q.e(var34);
                  CrashReporting.addBreadcrumb$default(
                     var26,
                     "Failed to resolve URI to file",
                     R8.q.l(new Pair[]{var40, s.a("mimeType", java.lang.String.valueOf(var36.getMimeType(var34)))}),
                     null,
                     4,
                     null
                  );
                  CrashReporting.captureException$default(var26, var38, false, 2, null);
                  var32.reject(var38);
               }

               return Unit.a;
            }
         },
         3,
         null
      );
   }
}

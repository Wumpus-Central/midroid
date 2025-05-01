package com.discord.media

import O9.K
import O9.f
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
import f8.r
import f8.s
import f8.w
import f8.r.a
import java.util.Map.Entry
import java.util.concurrent.CancellationException
import kotlin.coroutines.Continuation
import kotlin.jvm.functions.Function2
import kotlin.jvm.internal.E
import kotlin.jvm.internal.q
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.g
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector
import l8.b

public class MediaManagerModule(reactContext: ReactApplicationContext) : ReactContextBaseJavaModule {
   private final val mediaResolver: MediaResolver
   private final val reactEvents: ReactEvents
   private final val scope: CoroutineScope

   init {
      q.h(var1, "reactContext");
      super(var1);
      this.reactEvents = new ReactEvents(w.a("compression-progress", E.b(CompressionProgressEvent.class)));
      this.scope = g.b();
      this.mediaResolver = new MediaResolver(var1, new Function2(this) {
         final MediaManagerModule this$0;

         {
            super(2);
            this.this$0 = var1;
         }

         public final void invoke(Uri var1, int var2) {
            q.h(var1, "uri");
            val var3: ReactEvents = MediaManagerModule.access$getReactEvents$p(this.this$0);
            val var4: ReactApplicationContext = MediaManagerModule.access$getReactApplicationContext(this.this$0);
            q.g(var4, "access$getReactApplicationContext(...)");
            val var5: java.lang.String = var1.toString();
            q.g(var5, "toString(...)");
            var3.emitModuleEvent(var4, new CompressionProgressEvent(var5, var2));
         }
      });
   }

   private fun checkEncodingConstraints(width: Int, height: Int, frameRate: Double, videoCapabilities: VideoCapabilities): WritableArray {
      val var8: WritableArray = Arguments.createArray();
      if (var1 % var5.getWidthAlignment() != 0 || var2 % var5.getHeightAlignment() != 0) {
         val var16: WritableMap = Arguments.createMap();
         var16.putString("type", "resolution_alignment");
         val var7: Int = var5.getWidthAlignment();
         val var6: Int = var5.getHeightAlignment();
         val var17: StringBuilder = new StringBuilder();
         var17.append("Resolution must be aligned to ");
         var17.append(var7);
         var17.append("x");
         var17.append(var6);
         var16.putString("message", var17.toString());
         val var18: WritableMap = Arguments.createMap();
         var18.putInt("width", var1);
         var18.putInt("height", var2);
         var16.putMap("current", var18);
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
         val var10: WritableMap = Arguments.createMap();
         var10.putInt("width", var1);
         var10.putInt("height", var2);
         var12.putMap("current", var10);
         var8.pushMap(var12);
      } else if (!var5.areSizeAndRateSupported(var1, var2, var3)) {
         val var15: WritableMap = Arguments.createMap();
         var15.putString("type", "frameRate");
         val var13: StringBuilder = new StringBuilder();
         var13.append("Frame rate ");
         var13.append(var3);
         var13.append(" not supported at resolution ");
         var13.append(var1);
         var13.append("x");
         var13.append(var2);
         var15.putString("message", var13.toString());
         var15.putDouble("current", var3);
         var8.pushMap(var15);
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

               s.b(var1);
            } else {
               s.b(var1);
               var1 = PublicFileDownloader.INSTANCE;
               val var6: ReactApplicationContext = MediaManagerModule.access$getReactApplicationContext(this.this$0);
               q.g(var6, "access$getReactApplicationContext(...)");
               val var4: java.lang.String = this.$uri;
               val var5: java.lang.String = URLUtil.guessFileName(this.$uri, null, null);
               q.g(var5, "guessFileName(...)");
               val var8: Flow = PublicFileDownloader.downloadFile$default(var1, var6, var4, var5, null, 8, null);
               val var9: FlowCollector = new FlowCollector(this.$promise) {
                  final Promise $promise;

                  {
                     this.$promise = var1;
                  }

                  public final Object emit(DownloadState var1, Continuation var2x) {
                     if (var1 is DownloadState.Completed) {
                        this.$promise.resolve(kotlin.coroutines.jvm.internal.b.a(true));
                     } else if (var1 is DownloadState.Failure) {
                        this.$promise.reject(new IllegalStateException("Unable to download asset."));
                     } else {
                        val var3x: Boolean = var1 is DownloadState.InProgress;
                     }

                     return Unit.a;
                  }
               };
               this.label = 1;
               if (var8.collect(var9, this) === var3) {
                  return var3;
               }
            }

            return Unit.a;
         }
      }, 2, null);
   }

   public open fun getConstants(): Map<String, List<String>> {
      return g8.q.e(w.a("supportedExtensions", i.n(new java.lang.String[]{"mp4", "mov", "png", "jpg", "jpeg", "gif", "webp"})));
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
                  s.b(var1);
                  var1 = this.L$0 as CoroutineScope;
                  val var3x: MediaManagerModule = this.this$0;
                  val var2x: Uri = this.$inputUri;
                  var1 = this.$promise;

                  label77: {
                     var var5: java.util.Iterator;
                     try {
                        val var4: a = r.k;
                        val var62: MediaResolver = MediaManagerModule.access$getMediaResolver$p(var3x);
                        q.e(var2x);
                        val var59: java.util.Map = var62.handleVideoMetadata(var2x);
                        var63 = Arguments.createMap();
                        q.g(var63, "createMap(...)");
                        var5 = var59.entrySet().iterator();
                     } catch (var8: java.lang.Throwable) {
                        val var50: a = r.k;
                        var1 = r.b(s.a(var8));
                        break label77;
                     }

                     label76:
                     while (true) {
                        while (true) {
                           var var66: Entry;
                           try {
                              if (!var5.hasNext()) {
                                 break;
                              }

                              var66 = var5.next() as Entry;
                              var60 = var66.getKey() as java.lang.String;
                              var66 = (Entry)var66.getValue();
                              if (var66 is Int) {
                                 var63.putInt(var60, (var66 as java.lang.Number).intValue());
                                 continue;
                              }
                           } catch (var11: java.lang.Throwable) {
                              val var52: a = r.k;
                              var1 = r.b(s.a(var11));
                              break label76;
                           }

                           try {
                              if (var66 is java.lang.Boolean) {
                                 var63.putBoolean(var60, var66 as java.lang.Boolean);
                                 continue;
                              }
                           } catch (var10: java.lang.Throwable) {
                              val var53: a = r.k;
                              var1 = r.b(s.a(var10));
                              break label76;
                           }

                           try {
                              if (var66 is java.lang.String) {
                                 var63.putString(var60, var66 as java.lang.String);
                                 continue;
                              }
                           } catch (var9: java.lang.Throwable) {
                              val var54: a = r.k;
                              var1 = r.b(s.a(var9));
                              break label76;
                           }

                           try {
                              val var67: java.lang.String = var66.getClass().getName();
                              val var64: StringBuilder = new StringBuilder();
                              var64.append("Unsupported value type ");
                              var64.append(var67);
                              var64.append(" for key [");
                              var64.append(var60);
                              var64.append("]");
                              throw new IllegalArgumentException(var64.toString());
                           } catch (var7: java.lang.Throwable) {
                              val var55: a = r.k;
                              var1 = r.b(s.a(var7));
                              break label76;
                           }
                        }

                        try {
                           var1.resolve(var63);
                           var1 = r.b(Unit.a);
                           break;
                        } catch (var6: java.lang.Throwable) {
                           val var57: a = r.k;
                           var1 = r.b(s.a(var6));
                           break;
                        }
                     }
                  }

                  val var61: Promise = this.$promise;
                  val var58: java.lang.Throwable = r.e(var1);
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
               val var7: java.lang.String = var16.getMessage();
               val var17: StringBuilder = new StringBuilder();
               var17.append("Error checking video encoding support: ");
               var17.append(var7);
               var2.reject("ERROR", var17.toString());
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
         val var26: java.lang.String = var15.getMessage();
         val var19: StringBuilder = new StringBuilder();
         var19.append("Error checking video encoding support: ");
         var19.append(var26);
         var2.reject("ERROR", var19.toString());
         return;
      }

      if (var8 == null) {
         try {
            var27.putBoolean("isSupported", false);
            val var10: WritableArray = Arguments.createArray();
            val var9: WritableMap = Arguments.createMap();
            var9.putString("type", "codec_not_found");
            val var32: StringBuilder = new StringBuilder();
            var32.append("No encoder found for mime type: ");
            var32.append(var18);
            var9.putString("message", var32.toString());
            var10.pushMap(var9);
            var27.putArray("failures", var10);
            var27.putMap("capabilities", Arguments.createMap());
            var2.resolve(var27);
            return;
         } catch (var14: Exception) {
            val var28: java.lang.String = var14.getMessage();
            val var20: StringBuilder = new StringBuilder();
            var20.append("Error checking video encoding support: ");
            var20.append(var28);
            var2.reject("ERROR", var20.toString());
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
               val var29: java.lang.String = var13.getMessage();
               val var21: StringBuilder = new StringBuilder();
               var21.append("Error checking video encoding support: ");
               var21.append(var29);
               var2.reject("ERROR", var21.toString());
               return;
            }

            try {
               var27.putBoolean("isSupported", true);
            } catch (var12: Exception) {
               val var30: java.lang.String = var12.getMessage();
               val var24: StringBuilder = new StringBuilder();
               var24.append("Error checking video encoding support: ");
               var24.append(var30);
               var2.reject("ERROR", var24.toString());
               return;
            }
         }

         try {
            var2.resolve(var27);
         } catch (var11: Exception) {
            val var31: java.lang.String = var11.getMessage();
            val var25: StringBuilder = new StringBuilder();
            var25.append("Error checking video encoding support: ");
            var25.append(var31);
            var2.reject("ERROR", var25.toString());
         }
      }
   }

   @ReactMethod
   public fun removeListeners(count: Int) {
   }

   @ReactMethod
   public fun resolveToMediaFilePath(uri: String, options: ReadableMap?, promise: Promise) {
      var var8: Int;
      var var10: Boolean;
      var var11: Boolean;
      var var12: Boolean;
      var var13: Uri;
      label17: {
         q.h(var1, "uri");
         q.h(var3, "promise");
         var13 = Uri.parse(var1);
         var8 = (int)(NativeMapExtensionsKt.getDouble(var2, "compressionQuality", 1.0) * 100);
         var12 = NativeMapExtensionsKt.getBoolean(var2, "isLowQuality", false);
         var10 = NativeMapExtensionsKt.getBoolean(var2, "skipVideoTranscode", false);
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
         new Function2(this, var13, var8, var12, var10, var11, var17, var3, var1, null) {
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
               label47: {
                  val var7: Any = b.e();
                  val var6: Promise;
                  if (this.label != 0) {
                     if (this.label != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                     }

                     var6 = this.L$0 as Promise;

                     try {
                        s.b(var1);
                     } catch (var13: java.lang.Throwable) {
                        var1 = r.k;
                        var1 = r.b(s.a(var13));
                        break label47;
                     }
                  } else {
                     s.b(var1);
                     val var25: CoroutineScope = this.L$0 as CoroutineScope;
                     val var10: MediaManagerModule = this.this$0;
                     val var26: Uri = this.$inputUri;
                     val var30: Int = this.$imageCompressionQuality;
                     val var5: Boolean = this.$isLowQuality;
                     val var3x: Boolean = this.$skipVideoTranscode;
                     val var4: Boolean = this.$useOriginalIfSmaller;
                     val var8: EncodingConfig = this.$encodingConfig;
                     var6 = this.$promise;

                     try {
                        val var9: a = r.k;
                        val var35: MediaResolver = MediaManagerModule.access$getMediaResolver$p(var10);
                        q.e(var26);
                        this.L$0 = var6;
                        this.label = 1;
                        var1 = (a)var35.resolveToUri$media_release(var26, var30, var5, var3x, var4, var8, this);
                     } catch (var12: java.lang.Throwable) {
                        var1 = r.k;
                        var1 = r.b(s.a(var12));
                        break label47;
                     }

                     if (var1 === var7) {
                        return var7;
                     }
                  }

                  label35:
                  try {
                     var6.resolve((var1 as Uri).toString());
                     var1 = r.b(Unit.a);
                  } catch (var11: java.lang.Throwable) {
                     var1 = r.k;
                     var1 = r.b(s.a(var11));
                     break label35;
                  }
               }

               val var32: Promise = this.$promise;
               val var37: java.lang.String = this.$uri;
               val var33: MediaManagerModule = this.this$0;
               val var31: Uri = this.$inputUri;
               val var29: java.lang.Throwable = r.e(var1);
               if (var29 != null) {
                  if (var29 is CancellationException) {
                     var32.reject(var29);
                  }

                  val var36: CrashReporting = CrashReporting.INSTANCE;
                  val var38: Pair = w.a("uri", var37);
                  val var34: MediaResolver = MediaManagerModule.access$getMediaResolver$p(var33);
                  q.e(var31);
                  CrashReporting.addBreadcrumb$default(
                     var36,
                     "Failed to resolve URI to file",
                     g8.q.l(new Pair[]{var38, w.a("mimeType", java.lang.String.valueOf(var34.getMimeType(var31)))}),
                     null,
                     4,
                     null
                  );
                  CrashReporting.captureException$default(var36, var29, false, 2, null);
                  var32.reject(var29);
               }

               return Unit.a;
            }
         },
         3,
         null
      );
   }
}

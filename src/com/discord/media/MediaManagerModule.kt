package com.discord.media

import B9.n
import B9.s
import G9.b
import android.media.MediaCodecInfo
import android.media.MediaCodecList
import android.media.MediaCodecInfo.VideoCapabilities
import android.net.Uri
import android.os.BatteryManager
import android.os.PowerManager
import android.os.Build.VERSION
import com.discord.crash_reporting.CrashReporting
import com.discord.device.e
import com.discord.file_downloader.DownloadState
import com.discord.file_downloader.PublicFileDownloader
import com.discord.logging.Log
import com.discord.media.react.events.CompressionProgressEvent
import com.discord.media.utils.EncodingConfig
import com.discord.media.utils.ImageQualityCalculator
import com.discord.media.utils.MediaAssetUtils
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
import db.K
import db.f
import java.util.Locale
import java.util.Map.Entry
import java.util.concurrent.CancellationException
import kotlin.coroutines.Continuation
import kotlin.jvm.functions.Function2
import kotlin.jvm.internal.SourceDebugExtension
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.g
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector

@SourceDebugExtension(["SMAP\nMediaManagerModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MediaManagerModule.kt\ncom/discord/media/MediaManagerModule\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,748:1\n1310#2:749\n12574#2,2:750\n1311#2:752\n1#3:753\n*S KotlinDebug\n*F\n+ 1 MediaManagerModule.kt\ncom/discord/media/MediaManagerModule\n*L\n337#1:749\n338#1:750,2\n337#1:752\n*E\n"])
public class MediaManagerModule(reactContext: ReactApplicationContext) : ReactContextBaseJavaModule(var1) {
   private final val reactEvents: ReactEvents = new ReactEvents(s.a("compression-progress", CompressionProgressEvent::class))
   private final val scope: CoroutineScope = g.b()
   private final val mediaResolver: MediaResolver

   init {
      this.mediaResolver = new MediaResolver(var1, new a(this));
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

      return var8;
   }

   private fun createCapabilitiesMap(videoCapabilities: VideoCapabilities): WritableMap {
      val var2: WritableMap = Arguments.createMap();
      var var3: WritableMap = Arguments.createMap();
      var var4: java.lang.Comparable = var1.getSupportedWidths().getLower();
      var3.putInt("minWidth", (var4 as java.lang.Number).intValue());
      var4 = var1.getSupportedWidths().getUpper();
      var3.putInt("maxWidth", (var4 as java.lang.Number).intValue());
      var4 = var1.getSupportedHeights().getLower();
      var3.putInt("minHeight", (var4 as java.lang.Number).intValue());
      var4 = var1.getSupportedHeights().getUpper();
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
      var3.putInt("min", (var4 as java.lang.Number).intValue());
      var4 = var1.getBitrateRange().getUpper();
      var3.putInt("max", (var4 as java.lang.Number).intValue());
      var2.putMap("bitrate", var3);
      var3 = Arguments.createMap();
      var3.putInt("widthAlignment", var1.getWidthAlignment());
      var3.putInt("heightAlignment", var1.getHeightAlignment());
      var2.putMap("blockSize", var3);
      return var2;
   }

   private fun detectFileOrigin(parsedUri: Uri): WritableMap {
      val var5: WritableMap = Arguments.createMap();
      val var4: java.lang.String = var1.getPath();
      var var2: java.lang.String = var4;
      if (var4 == null) {
         var2 = "";
      }

      var var6: java.lang.String = var1.getLastPathSegment();
      if (var6 == null) {
         var6 = "";
      }

      if (StringsKt.N(var2, "/tmp/", false, 2, null) || StringsKt.N(var2, "/temp/", false, 2, null) || StringsKt.N(var2, "/cache/", false, 2, null)) {
         var5.putString("source", "picker");
         var5.putString("confidence", "medium");
      } else if (StringsKt.N(var2, "/DCIM/Camera/", false, 2, null) || StringsKt.I(var6, "IMG_", false, 2, null)) {
         var5.putString("source", "camera");
         var5.putString("confidence", "high");
      } else if (StringsKt.N(var2, "/DCIM/Screenshots/", false, 2, null)
         || StringsKt.N(var2, "/Pictures/Screenshots/", false, 2, null)
         || StringsKt.N(var6, "Screenshot", false, 2, null)
         || StringsKt.N(var6, "Screen Shot", false, 2, null)) {
         var5.putString("source", "screenshot");
         var5.putString("confidence", "high");
      } else if (StringsKt.N(var2, "/Download/", false, 2, null)) {
         var5.putString("source", "downloads");
         var5.putString("confidence", "medium");
      } else if (!StringsKt.N(var6, "edited", false, 2, null) && !StringsKt.N(var2, "edited", false, 2, null)) {
         var5.putString("source", "file");
         var5.putString("confidence", "low");
      } else {
         var5.putString("source", "edited");
         var5.putString("confidence", "medium");
      }

      var var8: java.lang.String = var6;
      if (var6.length() == 0) {
         var8 = "unknown";
      }

      var5.putString("filename", var8);
      var var7: java.lang.String = var2;
      if (var2.length() == 0) {
         var7 = "unknown";
      }

      var5.putString("path", var7);
      return var5;
   }

   private fun detectMediaOrigin(uri: String): WritableMap {
      val var4: WritableMap = Arguments.createMap();
      var4.putString("source", "unknown");
      var4.putString("confidence", "low");

      label126: {
         var var3: java.lang.String;
         var var22: Uri;
         try {
            var22 = Uri.parse(var1);
            var3 = var22.getScheme();
         } catch (var19: Exception) {
            val var5: Log = Log.INSTANCE;
            val var6: StringBuilder = new StringBuilder();
            var6.append("Error parsing URI for origin detection: ");
            var6.append(var1);
            var5.w("MediaManagerModule", var6.toString(), var19);
            break label126;
         }

         if (var3 != null) {
            try {
               var3 = var3.toLowerCase(Locale.ROOT);
            } catch (var18: Exception) {
               val var23: Log = Log.INSTANCE;
               val var35: StringBuilder = new StringBuilder();
               var35.append("Error parsing URI for origin detection: ");
               var35.append(var1);
               var23.w("MediaManagerModule", var35.toString(), var18);
               break label126;
            }
         } else {
            var3 = null;
         }

         label89:
         if (var3 != null) {
            var var2: Int;
            try {
               var2 = var3.hashCode();
            } catch (var13: Exception) {
               val var24: Log = Log.INSTANCE;
               val var36: StringBuilder = new StringBuilder();
               var36.append("Error parsing URI for origin detection: ");
               var36.append(var1);
               var24.w("MediaManagerModule", var36.toString(), var13);
               break label126;
            }

            switch (var2) {
               case 3143036:
                  try {
                     if (!var3.equals("file")) {
                        break label89;
                     }
                  } catch (var15: Exception) {
                     val var32: Log = Log.INSTANCE;
                     val var44: StringBuilder = new StringBuilder();
                     var44.append("Error parsing URI for origin detection: ");
                     var44.append(var1);
                     var32.w("MediaManagerModule", var44.toString(), var15);
                     break label126;
                  }

                  try {
                     return this.detectFileOrigin(var22);
                  } catch (var12: Exception) {
                     val var33: Log = Log.INSTANCE;
                     val var45: StringBuilder = new StringBuilder();
                     var45.append("Error parsing URI for origin detection: ");
                     var45.append(var1);
                     var33.w("MediaManagerModule", var45.toString(), var12);
                     break label126;
                  }
               case 3213448:
                  try {
                     if (!var3.equals("http")) {
                        break label89;
                     }
                     break;
                  } catch (var17: Exception) {
                     val var30: Log = Log.INSTANCE;
                     val var42: StringBuilder = new StringBuilder();
                     var42.append("Error parsing URI for origin detection: ");
                     var42.append(var1);
                     var30.w("MediaManagerModule", var42.toString(), var17);
                     break label126;
                  }
               case 99617003:
                  try {
                     if (!var3.equals("https")) {
                        break label89;
                     }
                     break;
                  } catch (var16: Exception) {
                     val var29: Log = Log.INSTANCE;
                     val var41: StringBuilder = new StringBuilder();
                     var41.append("Error parsing URI for origin detection: ");
                     var41.append(var1);
                     var29.w("MediaManagerModule", var41.toString(), var16);
                     break label126;
                  }
               case 951530617:
                  try {
                     if (!var3.equals("content")) {
                        break label89;
                     }

                     var3 = var22.getAuthority();
                  } catch (var14: Exception) {
                     val var25: Log = Log.INSTANCE;
                     val var37: StringBuilder = new StringBuilder();
                     var37.append("Error parsing URI for origin detection: ");
                     var37.append(var1);
                     var25.w("MediaManagerModule", var37.toString(), var14);
                     break label126;
                  }

                  if (var3 != null) {
                     try {
                        if (StringsKt.N(var3, "media", false, 2, null)) {
                           var4.putString("source", "gallery");
                           var4.putString("confidence", "medium");
                           break label126;
                        }
                     } catch (var11: Exception) {
                        val var26: Log = Log.INSTANCE;
                        val var38: StringBuilder = new StringBuilder();
                        var38.append("Error parsing URI for origin detection: ");
                        var38.append(var1);
                        var26.w("MediaManagerModule", var38.toString(), var11);
                        break label126;
                     }
                  }

                  if (var3 != null) {
                     try {
                        if (StringsKt.N(var3, "downloads", false, 2, null)) {
                           var4.putString("source", "downloads");
                           var4.putString("confidence", "medium");
                           break label126;
                        }
                     } catch (var10: Exception) {
                        val var27: Log = Log.INSTANCE;
                        val var39: StringBuilder = new StringBuilder();
                        var39.append("Error parsing URI for origin detection: ");
                        var39.append(var1);
                        var27.w("MediaManagerModule", var39.toString(), var10);
                        break label126;
                     }
                  }

                  try {
                     var4.putString("source", "gallery");
                     var4.putString("confidence", "low");
                  } catch (var9: Exception) {
                     val var28: Log = Log.INSTANCE;
                     val var40: StringBuilder = new StringBuilder();
                     var40.append("Error parsing URI for origin detection: ");
                     var40.append(var1);
                     var28.w("MediaManagerModule", var40.toString(), var9);
                  }
                  break label126;
               default:
                  break label89;
            }

            try {
               var4.putString("source", "network");
               var4.putString("confidence", "medium");
            } catch (var8: Exception) {
               val var31: Log = Log.INSTANCE;
               val var43: StringBuilder = new StringBuilder();
               var43.append("Error parsing URI for origin detection: ");
               var43.append(var1);
               var31.w("MediaManagerModule", var43.toString(), var8);
            }
            break label126;
         }

         try {
            var4.putString("source", "unknown");
            var4.putString("confidence", "low");
         } catch (var7: Exception) {
            val var34: Log = Log.INSTANCE;
            val var46: StringBuilder = new StringBuilder();
            var46.append("Error parsing URI for origin detection: ");
            var46.append(var1);
            var34.w("MediaManagerModule", var46.toString(), var7);
         }
      }

      return var4;
   }

   private fun getEncoderInfo(mimeType: String): MediaCodecInfo? {
      val var8: Array<MediaCodecInfo> = new MediaCodecList(0).getCodecInfos();
      val var4: Int = var8.length;

      for (int var2 = 0; var2 < var4; var2++) {
         val var6: MediaCodecInfo = var8[var2];
         if (var8[var2].isEncoder()) {
            val var7: Array<java.lang.String> = var6.getSupportedTypes();
            val var5: Int = var7.length;

            for (int var3 = 0; var3 < var5; var3++) {
               if (var7[var3] == var1) {
                  return var6;
               }
            }
         }
      }

      return null;
   }

   private suspend fun getImageDimensions(uri: String): Pair<Int, Int>? {
      return f.g(
         K.b(),
         new Function2<CoroutineScope, Continuation, Object>(var1, this, null)// $VF: Couldn't be decompiled
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   ,
         var2
      );
   }

   private suspend fun loadImageDataFromUri(uri: String): ByteArray? {
      return f.g(
         K.b(),
         new Function2<CoroutineScope, Continuation, Object>(var1, this, null)// $VF: Couldn't be decompiled
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   ,
         var2
      );
   }

   @JvmStatic
   fun `mediaResolver$lambda$0`(var0: MediaManagerModule, var1: Uri, var2: Int): Unit {
      val var3: ReactEvents = var0.reactEvents;
      val var4: ReactApplicationContext = var0.getReactApplicationContext();
      val var5: java.lang.String = var1.toString();
      var3.emitModuleEvent(var4, new CompressionProgressEvent(var5, var2));
      return Unit.a;
   }

   @ReactMethod
   public fun addListener(type: String) {
   }

   @ReactMethod
   public fun calculateImageQualityMetrics(originalUri: String, compressedUri: String, promise: Promise) {
      f.d(
         this.scope,
         null,
         null,
         new Function2<CoroutineScope, Continuation, Object>(this, var1, var2, var3, null) {
            final java.lang.String $compressedUri;
            final java.lang.String $originalUri;
            final Promise $promise;
            private Object L$0;
            Object L$1;
            Object L$2;
            Object L$3;
            Object L$4;
            int label;
            final MediaManagerModule this$0;

            {
               super(2, var5);
               this.this$0 = var1;
               this.$originalUri = var2x;
               this.$compressedUri = var3x;
               this.$promise = var4;
            }

            public final Continuation create(Object var1, Continuation var2) {
               val var3: Function2 = new <anonymous constructor>(this.this$0, this.$originalUri, this.$compressedUri, this.$promise, var2);
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
               label241: {
                  label240: {
                     var var717: Pair;
                     var var729: Pair;
                     label245: {
                        label3537: {
                           var var673: StringBuilder;
                           label3533: {
                              var var10: Any;
                              var var702: java.lang.String;
                              var var713: ByteArray;
                              label249: {
                                 label250: {
                                    var var732: Any;
                                    label251: {
                                       var10 = b.e();
                                       val var6: Promise;
                                       var var7: Any;
                                       val var662: java.lang.String;
                                       val var701: MediaManagerModule;
                                       if (this.label != 0) {
                                          if (this.label != 1) {
                                             if (this.label != 2) {
                                                if (this.label != 3) {
                                                   if (this.label != 4) {
                                                      if (this.label != 5) {
                                                         throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                      }

                                                      val var703: Promise = this.L$0 as Promise;

                                                      try {
                                                         c.b(var1);
                                                      } catch (var18: java.lang.Throwable) {
                                                         var673 = Result.e;
                                                         var1 = Result.b(c.a(var18));
                                                         break label241;
                                                      }

                                                      var673 = var1;
                                                      var1 = var703;
                                                      break label3533;
                                                   }

                                                   var713 = this.L$3 as ByteArray;
                                                   val var727: Promise = this.L$2 as Promise;
                                                   var702 = this.L$1 as java.lang.String;
                                                   var673 = this.L$0 as java.lang.String;

                                                   try {
                                                      c.b(var1);
                                                   } catch (var25: java.lang.Throwable) {
                                                      var673 = Result.e;
                                                      var1 = Result.b(c.a(var25));
                                                      break label241;
                                                   }

                                                   var719 = var1;
                                                   var1 = var727;
                                                   break label249;
                                                }

                                                val var712: Promise = this.L$3 as Promise;
                                                var702 = this.L$2 as java.lang.String;
                                                var673 = this.L$1 as java.lang.String;
                                                val var726: MediaManagerModule = this.L$0 as MediaManagerModule;

                                                try {
                                                   c.b(var1);
                                                } catch (var24: java.lang.Throwable) {
                                                   var673 = Result.e;
                                                   var1 = Result.b(c.a(var24));
                                                   break label241;
                                                }

                                                var718 = var1;
                                                var1 = var712;
                                                var711 = var726;
                                                break label250;
                                             }

                                             var717 = this.L$4 as Pair;
                                             var732 = this.L$3 as Promise;
                                             var702 = this.L$2 as java.lang.String;
                                             var673 = this.L$1 as java.lang.String;
                                             var711 = this.L$0 as MediaManagerModule;

                                             try {
                                                c.b(var1);
                                             } catch (var33: java.lang.Throwable) {
                                                var673 = Result.e;
                                                var1 = Result.b(c.a(var33));
                                                break label241;
                                             }

                                             var1 = (Promise)var732;
                                             var732 = var1;
                                             break label251;
                                          }

                                          var6 = this.L$3 as Promise;
                                          var702 = this.L$2 as java.lang.String;
                                          var673 = this.L$1 as java.lang.String;
                                          val var8: MediaManagerModule = this.L$0 as MediaManagerModule;

                                          try {
                                             c.b(var1);
                                          } catch (var32: java.lang.Throwable) {
                                             var673 = Result.e;
                                             var1 = Result.b(c.a(var32));
                                             break label241;
                                          }

                                          var7 = var1;
                                          var662 = var702;
                                          var701 = var8;
                                       } else {
                                          c.b(var1);
                                          val var664: CoroutineScope = this.L$0 as CoroutineScope;
                                          var701 = this.this$0;
                                          var673 = this.$originalUri;
                                          var662 = this.$compressedUri;
                                          var6 = this.$promise;

                                          try {
                                             var7 = Result.e;
                                             this.L$0 = var701;
                                             this.L$1 = var673;
                                             this.L$2 = var662;
                                             this.L$3 = var6;
                                             this.label = 1;
                                             var7 = MediaManagerModule.access$getImageDimensions(var701, (java.lang.String)var673, this);
                                          } catch (var31: java.lang.Throwable) {
                                             var673 = Result.e;
                                             var1 = Result.b(c.a(var31));
                                             break label241;
                                          }

                                          if (var7 === var10) {
                                             return var10;
                                          }
                                       }

                                       try {
                                          var717 = var7 as Pair;
                                          this.L$0 = var701;
                                          this.L$1 = var673;
                                          this.L$2 = var662;
                                          this.L$3 = var6;
                                          this.L$4 = var717;
                                          this.label = 2;
                                          var732 = MediaManagerModule.access$getImageDimensions(var701, var662, this);
                                       } catch (var30: java.lang.Throwable) {
                                          var673 = Result.e;
                                          var1 = Result.b(c.a(var30));
                                          break label241;
                                       }

                                       if (var732 === var10) {
                                          return var10;
                                       }

                                       var711 = var701;
                                       var702 = var662;
                                       var1 = var6;
                                    }

                                    try {
                                       var729 = var732 as Pair;
                                    } catch (var29: java.lang.Throwable) {
                                       var673 = Result.e;
                                       var1 = Result.b(c.a(var29));
                                       break label241;
                                    }

                                    if (var717 == null) {
                                       try {
                                          val var708: StringBuilder = new StringBuilder();
                                          var708.append("Failed to get original image dimensions from URI: ");
                                          var708.append((java.lang.String)var673);
                                          var1.reject("quality_metrics_error", var708.toString());
                                          break label240;
                                       } catch (var28: java.lang.Throwable) {
                                          var673 = Result.e;
                                          var1 = Result.b(c.a(var28));
                                          break label241;
                                       }
                                    }

                                    if (var729 == null) {
                                       try {
                                          var673 = new StringBuilder();
                                          var673.append("Failed to get compressed image dimensions from URI: ");
                                          var673.append(var702);
                                          var1.reject("quality_metrics_error", var673.toString());
                                          break label240;
                                       } catch (var27: java.lang.Throwable) {
                                          val var696: kotlin.Result.a = Result.e;
                                          var1 = Result.b(c.a(var27));
                                          break label241;
                                       }
                                    }

                                    var var3x: Int;
                                    var var667: Int;
                                    try {
                                       var3x = (var717.c() as java.lang.Number).intValue();
                                       var667 = (var729.c() as java.lang.Number).intValue();
                                    } catch (var26: java.lang.Throwable) {
                                       val var677: kotlin.Result.a = Result.e;
                                       var1 = Result.b(c.a(var26));
                                       break label241;
                                    }

                                    if (var3x != var667) {
                                       break label245;
                                    }

                                    try {
                                       if ((var717.d() as java.lang.Number).intValue() != (var729.d() as java.lang.Number).intValue()) {
                                          break label245;
                                       }
                                    } catch (var34: java.lang.Throwable) {
                                       val var678: kotlin.Result.a = Result.e;
                                       var1 = Result.b(c.a(var34));
                                       break label241;
                                    }

                                    try {
                                       if ((var717.c() as java.lang.Number).intValue() > 8192 || (var717.d() as java.lang.Number).intValue() > 8192) {
                                          break label3537;
                                       }
                                    } catch (var35: java.lang.Throwable) {
                                       val var679: kotlin.Result.a = Result.e;
                                       var1 = Result.b(c.a(var35));
                                       break label241;
                                    }

                                    try {
                                       this.L$0 = var711;
                                       this.L$1 = var673;
                                       this.L$2 = var702;
                                       this.L$3 = var1;
                                       this.L$4 = null;
                                       this.label = 3;
                                       var718 = MediaManagerModule.access$loadImageDataFromUri(var711, (java.lang.String)var673, this);
                                    } catch (var23: java.lang.Throwable) {
                                       val var680: kotlin.Result.a = Result.e;
                                       var1 = Result.b(c.a(var23));
                                       break label241;
                                    }

                                    if (var718 === var10) {
                                       return var10;
                                    }
                                 }

                                 try {
                                    var721 = var718 as ByteArray;
                                    this.L$0 = var673;
                                    this.L$1 = var702;
                                    this.L$2 = var1;
                                    this.L$3 = var721;
                                    this.label = 4;
                                    var730 = MediaManagerModule.access$loadImageDataFromUri(var711, var702, this);
                                 } catch (var22: java.lang.Throwable) {
                                    val var681: kotlin.Result.a = Result.e;
                                    var1 = Result.b(c.a(var22));
                                    break label241;
                                 }

                                 var713 = var721;
                                 var719 = var730;
                                 if (var730 === var10) {
                                    return var10;
                                 }
                              }

                              try {
                                 var722 = var719 as ByteArray;
                              } catch (var21: java.lang.Throwable) {
                                 val var682: kotlin.Result.a = Result.e;
                                 var1 = Result.b(c.a(var21));
                                 break label241;
                              }

                              if (var713 == null) {
                                 try {
                                    val var705: StringBuilder = new StringBuilder();
                                    var705.append("Failed to load original image data from URI: ");
                                    var705.append((java.lang.String)var673);
                                    var1.reject("quality_metrics_error", var705.toString());
                                    break label240;
                                 } catch (var20: java.lang.Throwable) {
                                    val var691: kotlin.Result.a = Result.e;
                                    var1 = Result.b(c.a(var20));
                                    break label241;
                                 }
                              }

                              if (var722 == null) {
                                 try {
                                    var673 = new StringBuilder();
                                    var673.append("Failed to load compressed image data from URI: ");
                                    var673.append(var702);
                                    var1.reject("quality_metrics_error", var673.toString());
                                    break label240;
                                 } catch (var19: java.lang.Throwable) {
                                    val var689: kotlin.Result.a = Result.e;
                                    var1 = Result.b(c.a(var19));
                                    break label241;
                                 }
                              }

                              try {
                                 val var684: ImageQualityCalculator = ImageQualityCalculator.INSTANCE;
                                 this.L$0 = var1;
                                 this.L$1 = null;
                                 this.L$2 = null;
                                 this.L$3 = null;
                                 this.label = 5;
                                 var673 = (StringBuilder)var684.calculateQualityMetrics(var713, var722, this);
                              } catch (var17: java.lang.Throwable) {
                                 val var683: kotlin.Result.a = Result.e;
                                 var1 = Result.b(c.a(var17));
                                 break label241;
                              }

                              if (var673 === var10) {
                                 return var10;
                              }
                           }

                           try {
                              var686 = var673 as ImageQualityCalculator.ImageQualityMetrics;
                           } catch (var16: java.lang.Throwable) {
                              val var685: kotlin.Result.a = Result.e;
                              var1 = Result.b(c.a(var16));
                              break label241;
                           }

                           if (var686 == null) {
                              try {
                                 var1.reject("quality_metrics_error", "Failed to calculate quality metrics");
                              } catch (var15: java.lang.Throwable) {
                                 val var687: kotlin.Result.a = Result.e;
                                 var1 = Result.b(c.a(var15));
                                 break label241;
                              }
                           } else {
                              try {
                                 val var704: WritableMap = Arguments.createMap();
                                 var704.putDouble("psnr", var686.getPsnr());
                                 var704.putDouble("ssim", var686.getSsim());
                                 var704.putInt("psnrCalculationTimeMs", (int)var686.getPsnrCalculationTimeMs());
                                 var704.putInt("ssimCalculationTimeMs", (int)var686.getSsimCalculationTimeMs());
                                 var1.resolve(var704);
                              } catch (var14: java.lang.Throwable) {
                                 val var688: kotlin.Result.a = Result.e;
                                 var1 = Result.b(c.a(var14));
                                 break label241;
                              }
                           }
                           break label240;
                        }

                        try {
                           val var693: Any = var717.c();
                           val var714: Any = var717.d();
                           val var706: StringBuilder = new StringBuilder();
                           var706.append("Image too large for quality metrics calculation: ");
                           var706.append(var693);
                           var706.append("x");
                           var706.append(var714);
                           var706.append(" (max: 8192x8192)");
                           var1.reject("quality_metrics_error", var706.toString());
                           break label240;
                        } catch (var13: java.lang.Throwable) {
                           val var692: kotlin.Result.a = Result.e;
                           var1 = Result.b(c.a(var13));
                           break label241;
                        }
                     }

                     try {
                        val var695: Any = var717.c();
                        val var707: Any = var717.d();
                        val var715: Any = var729.c();
                        val var723: Any = var729.d();
                        val var731: StringBuilder = new StringBuilder();
                        var731.append("Image dimensions do not match: original(");
                        var731.append(var695);
                        var731.append("x");
                        var731.append(var707);
                        var731.append(") vs compressed(");
                        var731.append(var715);
                        var731.append("x");
                        var731.append(var723);
                        var731.append(")");
                        var1.reject("quality_metrics_error", var731.toString());
                     } catch (var12: java.lang.Throwable) {
                        val var694: kotlin.Result.a = Result.e;
                        var1 = Result.b(c.a(var12));
                        break label241;
                     }
                  }

                  label139:
                  try {
                     var1 = Result.b(Unit.a);
                  } catch (var11: java.lang.Throwable) {
                     val var699: kotlin.Result.a = Result.e;
                     var1 = Result.b(c.a(var11));
                     break label139;
                  }
               }

               val var716: java.lang.String = this.$originalUri;
               val var709: java.lang.String = this.$compressedUri;
               val var700: Promise = this.$promise;
               val var665: java.lang.Throwable = Result.e(var1);
               if (var665 != null) {
                  val var724: CrashReporting = CrashReporting.INSTANCE;
                  CrashReporting.addBreadcrumb$default(
                     CrashReporting.INSTANCE,
                     "Failed to calculate image quality metrics",
                     L.l(new Pair[]{s.a("originalUri", var716), s.a("compressedUri", var709)}),
                     null,
                     null,
                     12,
                     null
                  );
                  CrashReporting.captureException$default(var724, var665, false, 2, null);
                  val var666: java.lang.String = var665.getMessage();
                  val var710: StringBuilder = new StringBuilder();
                  var710.append("Error calculating image quality metrics: ");
                  var710.append(var666);
                  var700.reject("quality_metrics_error", var710.toString());
               }

               return Unit.a;
            }
         },
         3,
         null
      );
   }

   @ReactMethod
   public fun cancelResolveToMediaFilePath(uri: String, options: ReadableMap?, promise: Promise) {
      val var5: MediaResolver = this.mediaResolver;
      val var4: Uri = Uri.parse(var1);
      var5.cancel(var4);
      var3.resolve(null);
   }

   @ReactMethod
   public fun convertBase64ToGIF(uri: String, options: ReadableMap?, promise: Promise) {
      throw new IllegalStateException("Unused on Android");
   }

   @ReactMethod
   public fun convertBase64ToJPEG(uri: String, options: ReadableMap?, promise: Promise) {
      throw new IllegalStateException("Unused on Android");
   }

   @ReactMethod
   public fun convertToCompatibleMOV(uri: String, options: ReadableMap?, promise: Promise) {
      throw new IllegalStateException("Unused on Android");
   }

   @ReactMethod
   public fun convertToJPEG(uri: String, options: ReadableMap?, promise: Promise) {
      throw new IllegalStateException("Unused on Android");
   }

   @ReactMethod
   public fun convertToVideoFilePath(uri: String, options: ReadableMap?, promise: Promise) {
      throw new IllegalStateException("Unused on Android");
   }

   @ReactMethod
   public fun downloadMediaAsset(uri: String, mediaType: Int, promise: Promise) {
      this.downloadMediaAssetWithContentType(var1, var2, null, var3);
   }

   @ReactMethod
   public fun downloadMediaAssetWithContentType(uri: String, mediaType: Int, contentType: String?, promise: Promise) {
      f.d(this.scope, K.b(), null, new Function2<CoroutineScope, Continuation, Object>(var1, var3, this, var4, null) {
         final java.lang.String $contentType;
         final Promise $promise;
         final java.lang.String $uri;
         int label;
         final MediaManagerModule this$0;

         {
            super(2, var5);
            this.$uri = var1;
            this.$contentType = var2x;
            this.this$0 = var3;
            this.$promise = var4;
         }

         public final Continuation create(Object var1, Continuation var2) {
            return new <anonymous constructor>(this.$uri, this.$contentType, this.this$0, this.$promise, var2);
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
               val var4: java.lang.String = MediaAssetUtils.INSTANCE.guessFileName(this.$uri, this.$contentType);
               var1 = PublicFileDownloader.INSTANCE;
               val var5: ReactApplicationContext = MediaManagerModule.access$getReactApplicationContext(this.this$0);
               val var7: Flow = PublicFileDownloader.downloadFile$default(var1, var5, this.$uri, var4, null, 8, null);
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
               if (var7.collect(var8, this) === var3) {
                  return var3;
               }
            }

            return Unit.a;
         }
      }, 2, null);
   }

   public open fun getConstants(): Map<String, List<String>> {
      return L.e(s.a("supportedExtensions", CollectionsKt.n(new java.lang.String[]{"mp4", "mov", "png", "jpg", "jpeg", "gif", "webp"})));
   }

   @ReactMethod
   public fun getDeviceStateInfo(promise: Promise) {
      val var8: ReactApplicationContext = this.getReactApplicationContext();
      var var6: Any = var8.getSystemService("batterymanager");
      val var2: Double = (var6 as BatteryManager).getIntProperty(4) / 100.0;
      var6 = "UNKNOWN";
      if (VERSION.SDK_INT >= 29) {
         var6 = var8.getSystemService("power");
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
      val var5: Boolean = (var12 as PowerManager).isPowerSaveMode();
      var12 = Arguments.createMap();
      var12.putString("thermalState", (java.lang.String)var6);
      var12.putDouble("batteryLevel", var2);
      var12.putBoolean("isLowPowerMode", var5);
      var1.resolve(var12);
   }

   @ReactMethod
   public fun getLosslessImageData(uri: String, promise: Promise) {
      var2.resolve(var1);
   }

   @ReactMethod
   public fun getMediaOrigin(uri: String, promise: Promise) {
      try {
         var2.resolve(this.detectMediaOrigin(var1));
      } catch (var6: Exception) {
         val var5: Log = Log.INSTANCE;
         val var4: StringBuilder = new StringBuilder();
         var4.append("Failed to detect media origin for URI: ");
         var4.append(var1);
         var5.e("MediaManagerModule", var4.toString(), var6);
         val var7: WritableMap = Arguments.createMap();
         var7.putString("source", "unknown");
         var7.putString("confidence", "low");
         var2.resolve(var7);
      }
   }

   public open fun getName(): String {
      return "MediaManager";
   }

   @ReactMethod
   public fun getVideoMetadata(uri: String, options: ReadableMap?, promise: Promise) {
      f.d(
         this.scope,
         null,
         null,
         new Function2<CoroutineScope, Continuation, Object>(this, Uri.parse(var1), var3, null) {
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
                  val var3x: MediaManagerModule = this.this$0;
                  val var2x: Uri = this.$inputUri;
                  var1 = this.$promise;

                  label77: {
                     var var5: java.util.Iterator;
                     try {
                        val var4: kotlin.Result.a = Result.e;
                        val var62: MediaResolver = MediaManagerModule.access$getMediaResolver$p(var3x);
                        val var54: java.util.Map = var62.handleVideoMetadata(var2x);
                        var63 = Arguments.createMap();
                        var5 = var54.entrySet().iterator();
                     } catch (var8: java.lang.Throwable) {
                        val var53: kotlin.Result.a = Result.e;
                        var1 = Result.b(c.a(var8));
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
                              var56 = var66.getKey() as java.lang.String;
                              var66 = (Entry)var66.getValue();
                              if (var66 is Int) {
                                 var63.putInt(var56, (var66 as java.lang.Number).intValue());
                                 continue;
                              }
                           } catch (var11: java.lang.Throwable) {
                              val var55: kotlin.Result.a = Result.e;
                              var1 = Result.b(c.a(var11));
                              break label76;
                           }

                           try {
                              if (var66 is java.lang.Boolean) {
                                 var63.putBoolean(var56, var66 as java.lang.Boolean);
                                 continue;
                              }
                           } catch (var10: java.lang.Throwable) {
                              val var57: kotlin.Result.a = Result.e;
                              var1 = Result.b(c.a(var10));
                              break label76;
                           }

                           try {
                              if (var66 is java.lang.String) {
                                 var63.putString(var56, var66 as java.lang.String);
                                 continue;
                              }
                           } catch (var9: java.lang.Throwable) {
                              val var58: kotlin.Result.a = Result.e;
                              var1 = Result.b(c.a(var9));
                              break label76;
                           }

                           try {
                              val var64: java.lang.String = var66.getClass().getName();
                              val var67: StringBuilder = new StringBuilder();
                              var67.append("Unsupported value type ");
                              var67.append(var64);
                              var67.append(" for key [");
                              var67.append(var56);
                              var67.append("]");
                              throw new IllegalArgumentException(var67.toString());
                           } catch (var7: java.lang.Throwable) {
                              val var59: kotlin.Result.a = Result.e;
                              var1 = Result.b(c.a(var7));
                              break label76;
                           }
                        }

                        try {
                           var1.resolve(var63);
                           var1 = Result.b(Unit.a);
                           break;
                        } catch (var6: java.lang.Throwable) {
                           val var60: kotlin.Result.a = Result.e;
                           var1 = Result.b(c.a(var6));
                           break;
                        }
                     }
                  }

                  val var61: Promise = this.$promise;
                  val var52: java.lang.Throwable = Result.e(var1);
                  if (var52 != null) {
                     var61.reject(var52);
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
            val var32: WritableArray = Arguments.createArray();
            val var10: WritableMap = Arguments.createMap();
            var10.putString("type", "codec_not_found");
            val var9: StringBuilder = new StringBuilder();
            var9.append("No encoder found for mime type: ");
            var9.append(var18);
            var10.putString("message", var9.toString());
            var32.pushMap(var10);
            var27.putArray("failures", var32);
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
      var var6: Int;
      var var10: Boolean;
      var var11: Boolean;
      var var12: Boolean;
      var var13: Uri;
      label17: {
         var13 = Uri.parse(var1);
         var6 = (int)(NativeMapExtensionsKt.getDouble(var2, "compressionQuality", 1.0) * 100);
         var12 = NativeMapExtensionsKt.getBoolean(var2, "isLowQuality", false);
         var11 = NativeMapExtensionsKt.getBoolean(var2, "skipVideoTranscode", false);
         var10 = NativeMapExtensionsKt.getBoolean(var2, "useOriginalIfSmaller", false);
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
                  var1 = var14.getMessage();
                  val var18: StringBuilder = new StringBuilder();
                  var18.append("Invalid encodingConfig: ");
                  var18.append(var1);
                  var3.reject(new IllegalArgumentException(var18.toString()));
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
         new Function2<CoroutineScope, Continuation, Object>(this, var13, var6, var12, var11, var10, var17, var3, var1, null) {
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
                        var1 = Result.e;
                        var1 = Result.b(c.a(var13));
                        break label49;
                     }

                     var7 = var1;
                  } else {
                     c.b(var1);
                     val var25: CoroutineScope = this.L$0 as CoroutineScope;
                     val var9: MediaManagerModule = this.this$0;
                     val var8: Uri = this.$inputUri;
                     val var30: Int = this.$imageCompressionQuality;
                     val var5: Boolean = this.$isLowQuality;
                     val var4: Boolean = this.$skipVideoTranscode;
                     val var3x: Boolean = this.$useOriginalIfSmaller;
                     var7 = this.$encodingConfig;
                     val var26: Promise = this.$promise;

                     try {
                        val var10: kotlin.Result.a = Result.e;
                        val var37: MediaResolver = MediaManagerModule.access$getMediaResolver$p(var9);
                        this.L$0 = var26;
                        this.label = 1;
                        var7 = var37.resolveToUri$media_release(var8, var30, var5, var4, var3x, (EncodingConfig)var7, this);
                     } catch (var12: java.lang.Throwable) {
                        var1 = Result.e;
                        var1 = Result.b(c.a(var12));
                        break label49;
                     }

                     if (var7 === var6) {
                        return var6;
                     }

                     var6 = var26;
                  }

                  label37:
                  try {
                     var6.resolve((var7 as Uri).toString());
                     var1 = Result.b(Unit.a);
                  } catch (var11: java.lang.Throwable) {
                     var1 = Result.e;
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

                  val var29: CrashReporting = CrashReporting.INSTANCE;
                  val var40: Pair = s.a("uri", var39);
                  val var36: MediaResolver = MediaManagerModule.access$getMediaResolver$p(var35);
                  CrashReporting.addBreadcrumb$default(
                     var29,
                     "Failed to resolve URI to file",
                     L.l(new Pair[]{var40, s.a("mimeType", java.lang.String.valueOf(var36.getMimeType(var34)))}),
                     null,
                     null,
                     12,
                     null
                  );
                  CrashReporting.captureException$default(var29, var38, false, 2, null);
                  var32.reject(var38);
               }

               return Unit.a;
            }
         },
         3,
         null
      );
   }

   public companion object {
      private const val MAX_IMAGE_DATA_SIZE: Int
      private const val MAX_IMAGE_DIMENSION: Int
      private const val QUALITY_METRICS_ERROR: String
   }
}

package com.discord.media

import android.media.MediaCodecInfo
import android.media.MediaCodecList
import android.media.MediaCodecInfo.VideoCapabilities
import android.net.Uri
import android.os.BatteryManager
import android.os.PowerManager
import android.os.Build.VERSION
import com.discord.crash_reporting.CrashReporting
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
import gu.g
import gu.m0
import ht.p
import ht.v
import java.util.Locale
import java.util.Map.Entry
import java.util.concurrent.CancellationException
import kotlin.coroutines.Continuation
import kotlin.jvm.functions.Function2
import kotlin.jvm.internal.SourceDebugExtension
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.i
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector
import ot.b

@SourceDebugExtension(["SMAP\nMediaManagerModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MediaManagerModule.kt\ncom/discord/media/MediaManagerModule\n+ 2 Uri.kt\nandroidx/core/net/UriKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,749:1\n29#2:750\n29#2:751\n29#2:752\n29#2:758\n1310#3:753\n12574#3,2:754\n1311#3:756\n1#4:757\n*S KotlinDebug\n*F\n+ 1 MediaManagerModule.kt\ncom/discord/media/MediaManagerModule\n*L\n105#1:750\n115#1:751\n212#1:752\n609#1:758\n338#1:753\n339#1:754,2\n338#1:756\n*E\n"])
public class MediaManagerModule(reactContext: ReactApplicationContext) : ReactContextBaseJavaModule(var1) {
   private final val reactEvents: ReactEvents = new ReactEvents(v.a("compression-progress", CompressionProgressEvent::class))
   private final val scope: CoroutineScope = i.b()
   private final val mediaResolver: MediaResolver

   init {
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

      if (StringsKt.T(var2, "/tmp/", false, 2, null) || StringsKt.T(var2, "/temp/", false, 2, null) || StringsKt.T(var2, "/cache/", false, 2, null)) {
         var5.putString("source", "picker");
         var5.putString("confidence", "medium");
      } else if (StringsKt.T(var2, "/DCIM/Camera/", false, 2, null) || StringsKt.N(var6, "IMG_", false, 2, null)) {
         var5.putString("source", "camera");
         var5.putString("confidence", "high");
      } else if (StringsKt.T(var2, "/DCIM/Screenshots/", false, 2, null)
         || StringsKt.T(var2, "/Pictures/Screenshots/", false, 2, null)
         || StringsKt.T(var6, "Screenshot", false, 2, null)
         || StringsKt.T(var6, "Screen Shot", false, 2, null)) {
         var5.putString("source", "screenshot");
         var5.putString("confidence", "high");
      } else if (StringsKt.T(var2, "/Download/", false, 2, null)) {
         var5.putString("source", "downloads");
         var5.putString("confidence", "medium");
      } else if (!StringsKt.T(var6, "edited", false, 2, null) && !StringsKt.T(var2, "edited", false, 2, null)) {
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
         var var20: java.lang.String;
         var var35: Uri;
         try {
            var35 = Uri.parse(var1);
            var20 = var35.getScheme();
         } catch (var19: Exception) {
            val var3: Log = Log.INSTANCE;
            val var5: StringBuilder = new StringBuilder();
            var5.append("Error parsing URI for origin detection: ");
            var5.append(var1);
            var3.w("MediaManagerModule", var5.toString(), var19);
            break label126;
         }

         if (var20 != null) {
            try {
               var20 = var20.toLowerCase(Locale.ROOT);
            } catch (var18: Exception) {
               val var21: Log = Log.INSTANCE;
               val var36: StringBuilder = new StringBuilder();
               var36.append("Error parsing URI for origin detection: ");
               var36.append(var1);
               var21.w("MediaManagerModule", var36.toString(), var18);
               break label126;
            }
         } else {
            var20 = null;
         }

         label89:
         if (var20 != null) {
            var var2: Int;
            try {
               var2 = var20.hashCode();
            } catch (var13: Exception) {
               val var23: Log = Log.INSTANCE;
               val var37: StringBuilder = new StringBuilder();
               var37.append("Error parsing URI for origin detection: ");
               var37.append(var1);
               var23.w("MediaManagerModule", var37.toString(), var13);
               break label126;
            }

            switch (var2) {
               case 3143036:
                  try {
                     if (!var20.equals("file")) {
                        break label89;
                     }
                  } catch (var15: Exception) {
                     val var32: Log = Log.INSTANCE;
                     val var45: StringBuilder = new StringBuilder();
                     var45.append("Error parsing URI for origin detection: ");
                     var45.append(var1);
                     var32.w("MediaManagerModule", var45.toString(), var15);
                     break label126;
                  }

                  try {
                     return this.detectFileOrigin(var35);
                  } catch (var12: Exception) {
                     val var33: Log = Log.INSTANCE;
                     val var46: StringBuilder = new StringBuilder();
                     var46.append("Error parsing URI for origin detection: ");
                     var46.append(var1);
                     var33.w("MediaManagerModule", var46.toString(), var12);
                     break label126;
                  }
               case 3213448:
                  try {
                     if (!var20.equals("http")) {
                        break label89;
                     }
                     break;
                  } catch (var17: Exception) {
                     val var30: Log = Log.INSTANCE;
                     val var43: StringBuilder = new StringBuilder();
                     var43.append("Error parsing URI for origin detection: ");
                     var43.append(var1);
                     var30.w("MediaManagerModule", var43.toString(), var17);
                     break label126;
                  }
               case 99617003:
                  try {
                     if (!var20.equals("https")) {
                        break label89;
                     }
                     break;
                  } catch (var16: Exception) {
                     val var29: Log = Log.INSTANCE;
                     val var42: StringBuilder = new StringBuilder();
                     var42.append("Error parsing URI for origin detection: ");
                     var42.append(var1);
                     var29.w("MediaManagerModule", var42.toString(), var16);
                     break label126;
                  }
               case 951530617:
                  try {
                     if (!var20.equals("content")) {
                        break label89;
                     }

                     var20 = var35.getAuthority();
                  } catch (var14: Exception) {
                     val var24: Log = Log.INSTANCE;
                     val var38: StringBuilder = new StringBuilder();
                     var38.append("Error parsing URI for origin detection: ");
                     var38.append(var1);
                     var24.w("MediaManagerModule", var38.toString(), var14);
                     break label126;
                  }

                  if (var20 != null) {
                     try {
                        if (StringsKt.T(var20, "media", false, 2, null)) {
                           var4.putString("source", "gallery");
                           var4.putString("confidence", "medium");
                           break label126;
                        }
                     } catch (var11: Exception) {
                        val var26: Log = Log.INSTANCE;
                        val var39: StringBuilder = new StringBuilder();
                        var39.append("Error parsing URI for origin detection: ");
                        var39.append(var1);
                        var26.w("MediaManagerModule", var39.toString(), var11);
                        break label126;
                     }
                  }

                  if (var20 != null) {
                     try {
                        if (StringsKt.T(var20, "downloads", false, 2, null)) {
                           var4.putString("source", "downloads");
                           var4.putString("confidence", "medium");
                           break label126;
                        }
                     } catch (var10: Exception) {
                        val var27: Log = Log.INSTANCE;
                        val var40: StringBuilder = new StringBuilder();
                        var40.append("Error parsing URI for origin detection: ");
                        var40.append(var1);
                        var27.w("MediaManagerModule", var40.toString(), var10);
                        break label126;
                     }
                  }

                  try {
                     var4.putString("source", "gallery");
                     var4.putString("confidence", "low");
                  } catch (var9: Exception) {
                     val var28: Log = Log.INSTANCE;
                     val var41: StringBuilder = new StringBuilder();
                     var41.append("Error parsing URI for origin detection: ");
                     var41.append(var1);
                     var28.w("MediaManagerModule", var41.toString(), var9);
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
               val var44: StringBuilder = new StringBuilder();
               var44.append("Error parsing URI for origin detection: ");
               var44.append(var1);
               var31.w("MediaManagerModule", var44.toString(), var8);
            }
            break label126;
         }

         try {
            var4.putString("source", "unknown");
            var4.putString("confidence", "low");
         } catch (var7: Exception) {
            val var34: Log = Log.INSTANCE;
            val var47: StringBuilder = new StringBuilder();
            var47.append("Error parsing URI for origin detection: ");
            var47.append(var1);
            var34.w("MediaManagerModule", var47.toString(), var7);
         }
      }

      return var4;
   }

   private fun getEncoderInfo(mimeType: String): MediaCodecInfo? {
      val var7: Array<MediaCodecInfo> = new MediaCodecList(0).getCodecInfos();
      val var4: Int = var7.length;

      for (int var2 = 0; var2 < var4; var2++) {
         val var8: MediaCodecInfo = var7[var2];
         if (var7[var2].isEncoder()) {
            val var6: Array<java.lang.String> = var8.getSupportedTypes();
            val var5: Int = var6.length;

            for (int var3 = 0; var3 < var5; var3++) {
               if (var6[var3] == var1) {
                  return var8;
               }
            }
         }
      }

      return null;
   }

   private suspend fun getImageDimensions(uri: String): Pair<Int, Int>? {
      return g.g(
         m0.b(),
         new Function2<CoroutineScope, Continuation<? super Pair<? extends Integer, ? extends Integer>>, Object>(var1, this, null)// $VF: Couldn't be decompiled
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   // java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.modules.decompiler.stats.Statement.getVarDefinitions()" because "stat" is null
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1468)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1679)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1496)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1545)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.remapClashingNames(VarDefinitionHelper.java:1458)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarProcessor.rerunClashing(VarProcessor.java:99)
   //   at org.jetbrains.java.decompiler.main.ClassWriter.invokeProcessors(ClassWriter.java:118)
   //   at org.jetbrains.java.decompiler.main.ClassWriter.writeClass(ClassWriter.java:352)
   //   at org.jetbrains.java.decompiler.modules.decompiler.exps.NewExprent.toJava(NewExprent.java:407)
   //   at org.jetbrains.java.decompiler.modules.decompiler.ExprProcessor.getCastedExprent(ExprProcessor.java:1014)
   //   at org.jetbrains.java.decompiler.modules.decompiler.exps.InvocationExprent.appendParamList(InvocationExprent.java:1153)
   //   at org.jetbrains.java.decompiler.modules.decompiler.exps.InvocationExprent.toJava(InvocationExprent.java:904)
   //   at org.jetbrains.java.decompiler.modules.decompiler.ExprProcessor.getCastedExprent(ExprProcessor.java:1014)
   //   at org.jetbrains.java.decompiler.modules.decompiler.exps.ExitExprent.toJava(ExitExprent.java:86)
   //   at org.jetbrains.java.decompiler.modules.decompiler.ExprProcessor.listToJava(ExprProcessor.java:891)
   //   at org.jetbrains.java.decompiler.modules.decompiler.stats.BasicBlockStatement.toJava(BasicBlockStatement.java:91)
   //   at org.jetbrains.java.decompiler.modules.decompiler.stats.RootStatement.toJava(RootStatement.java:36)
   ,
         var2
      );
   }

   private suspend fun loadImageDataFromUri(uri: String): ByteArray? {
      return g.g(
         m0.b(),
         new Function2<CoroutineScope, Continuation<byte[]>, Object>(var1, this, null)// $VF: Couldn't be decompiled
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   // java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.modules.decompiler.stats.Statement.getVarDefinitions()" because "stat" is null
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1468)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1679)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1496)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1545)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.remapClashingNames(VarDefinitionHelper.java:1458)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarProcessor.rerunClashing(VarProcessor.java:99)
   //   at org.jetbrains.java.decompiler.main.ClassWriter.invokeProcessors(ClassWriter.java:118)
   //   at org.jetbrains.java.decompiler.main.ClassWriter.writeClass(ClassWriter.java:352)
   //   at org.jetbrains.java.decompiler.modules.decompiler.exps.NewExprent.toJava(NewExprent.java:407)
   //   at org.jetbrains.java.decompiler.modules.decompiler.ExprProcessor.getCastedExprent(ExprProcessor.java:1014)
   //   at org.jetbrains.java.decompiler.modules.decompiler.exps.InvocationExprent.appendParamList(InvocationExprent.java:1153)
   //   at org.jetbrains.java.decompiler.modules.decompiler.exps.InvocationExprent.toJava(InvocationExprent.java:904)
   //   at org.jetbrains.java.decompiler.modules.decompiler.ExprProcessor.getCastedExprent(ExprProcessor.java:1014)
   //   at org.jetbrains.java.decompiler.modules.decompiler.exps.ExitExprent.toJava(ExitExprent.java:86)
   //   at org.jetbrains.java.decompiler.modules.decompiler.ExprProcessor.listToJava(ExprProcessor.java:891)
   //   at org.jetbrains.java.decompiler.modules.decompiler.stats.BasicBlockStatement.toJava(BasicBlockStatement.java:91)
   //   at org.jetbrains.java.decompiler.modules.decompiler.stats.RootStatement.toJava(RootStatement.java:36)
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
      g.d(
         this.scope,
         null,
         null,
         new Function2<CoroutineScope, Continuation<? super Unit>, Object>(this, var1, var2, var3, null) {
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

            public final Continuation<Unit> create(Object var1, Continuation<?> var2) {
               val var3: Function2 = new <anonymous constructor>(this.this$0, this.$originalUri, this.$compressedUri, this.$promise, var2);
               var3.L$0 = var1;
               return var3;
            }

            public final Object invoke(CoroutineScope var1, Continuation<? super Unit> var2x) {
               return (this.create(var1, var2x) as <unrepresentable>).invokeSuspend(Unit.a);
            }

            // $VF: Duplicated exception handlers to handle obfuscated exceptions
            // $VF: Could not inline inconsistent finally blocks
            // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
            public final Object invokeSuspend(Object var1) {
               label244: {
                  label243: {
                     var var718: Pair;
                     var var730: Pair;
                     label249: {
                        label3616: {
                           var var693: StringBuilder;
                           label3612: {
                              var var10: Any;
                              var var702: java.lang.String;
                              var var714: ByteArray;
                              label253: {
                                 label254: {
                                    label255: {
                                       var10 = b.f();
                                       val var6: Promise;
                                       var var7: Any;
                                       val var663: java.lang.String;
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
                                                         val var668: kotlin.Result.a = Result.e;
                                                         var1 = Result.b(c.a(var18));
                                                         break label244;
                                                      }

                                                      var693 = var1;
                                                      var1 = var703;
                                                      break label3612;
                                                   }

                                                   var714 = this.L$3 as ByteArray;
                                                   val var729: Promise = this.L$2 as Promise;
                                                   var702 = this.L$1 as java.lang.String;
                                                   var693 = this.L$0 as java.lang.String;

                                                   try {
                                                      c.b(var1);
                                                   } catch (var25: java.lang.Throwable) {
                                                      val var667: kotlin.Result.a = Result.e;
                                                      var1 = Result.b(c.a(var25));
                                                      break label244;
                                                   }

                                                   var720 = var1;
                                                   var1 = var729;
                                                   break label253;
                                                }

                                                val var712: Promise = this.L$3 as Promise;
                                                var702 = this.L$2 as java.lang.String;
                                                var693 = this.L$1 as java.lang.String;
                                                val var728: MediaManagerModule = this.L$0 as MediaManagerModule;

                                                try {
                                                   c.b(var1);
                                                } catch (var24: java.lang.Throwable) {
                                                   val var666: kotlin.Result.a = Result.e;
                                                   var1 = Result.b(c.a(var24));
                                                   break label244;
                                                }

                                                var719 = var1;
                                                var1 = var712;
                                                var713 = var728;
                                                break label254;
                                             }

                                             var718 = this.L$4 as Pair;
                                             val var9: Promise = this.L$3 as Promise;
                                             var711 = this.L$2 as java.lang.String;
                                             var693 = this.L$1 as java.lang.String;
                                             var701 = this.L$0 as MediaManagerModule;

                                             try {
                                                c.b(var1);
                                             } catch (var33: java.lang.Throwable) {
                                                val var664: kotlin.Result.a = Result.e;
                                                var1 = Result.b(c.a(var33));
                                                break label244;
                                             }

                                             var727 = var1;
                                             var1 = var9;
                                             break label255;
                                          }

                                          var6 = this.L$3 as Promise;
                                          var702 = this.L$2 as java.lang.String;
                                          var693 = this.L$1 as java.lang.String;
                                          val var8: MediaManagerModule = this.L$0 as MediaManagerModule;

                                          try {
                                             c.b(var1);
                                          } catch (var32: java.lang.Throwable) {
                                             val var661: kotlin.Result.a = Result.e;
                                             var1 = Result.b(c.a(var32));
                                             break label244;
                                          }

                                          var7 = var1;
                                          var663 = var702;
                                          var701 = var8;
                                       } else {
                                          c.b(var1);
                                          val var669: CoroutineScope = this.L$0 as CoroutineScope;
                                          var701 = this.this$0;
                                          var693 = this.$originalUri;
                                          var663 = this.$compressedUri;
                                          var6 = this.$promise;

                                          try {
                                             var7 = Result.e;
                                             this.L$0 = var701;
                                             this.L$1 = var693;
                                             this.L$2 = var663;
                                             this.L$3 = var6;
                                             this.label = 1;
                                             var7 = MediaManagerModule.access$getImageDimensions(var701, (java.lang.String)var693, this);
                                          } catch (var31: java.lang.Throwable) {
                                             val var670: kotlin.Result.a = Result.e;
                                             var1 = Result.b(c.a(var31));
                                             break label244;
                                          }

                                          if (var7 === var10) {
                                             return var10;
                                          }
                                       }

                                       try {
                                          var718 = var7 as Pair;
                                          this.L$0 = var701;
                                          this.L$1 = var693;
                                          this.L$2 = var663;
                                          this.L$3 = var6;
                                          this.L$4 = var718;
                                          this.label = 2;
                                          var727 = MediaManagerModule.access$getImageDimensions(var701, var663, this);
                                       } catch (var30: java.lang.Throwable) {
                                          val var671: kotlin.Result.a = Result.e;
                                          var1 = Result.b(c.a(var30));
                                          break label244;
                                       }

                                       if (var727 === var10) {
                                          return var10;
                                       }

                                       var711 = var663;
                                       var1 = var6;
                                    }

                                    try {
                                       var730 = var727 as Pair;
                                    } catch (var29: java.lang.Throwable) {
                                       val var672: kotlin.Result.a = Result.e;
                                       var1 = Result.b(c.a(var29));
                                       break label244;
                                    }

                                    if (var718 == null) {
                                       try {
                                          val var708: StringBuilder = new StringBuilder();
                                          var708.append("Failed to get original image dimensions from URI: ");
                                          var708.append((java.lang.String)var693);
                                          var1.reject("quality_metrics_error", var708.toString());
                                          break label243;
                                       } catch (var28: java.lang.Throwable) {
                                          val var688: kotlin.Result.a = Result.e;
                                          var1 = Result.b(c.a(var28));
                                          break label244;
                                       }
                                    }

                                    if (var730 == null) {
                                       try {
                                          var693 = new StringBuilder();
                                          var693.append("Failed to get compressed image dimensions from URI: ");
                                          var693.append(var711);
                                          var1.reject("quality_metrics_error", var693.toString());
                                          break label243;
                                       } catch (var27: java.lang.Throwable) {
                                          val var687: kotlin.Result.a = Result.e;
                                          var1 = Result.b(c.a(var27));
                                          break label244;
                                       }
                                    }

                                    var var3x: Int;
                                    var var692: Int;
                                    try {
                                       var3x = (var718.c() as java.lang.Number).intValue();
                                       var692 = (var730.c() as java.lang.Number).intValue();
                                    } catch (var26: java.lang.Throwable) {
                                       val var673: kotlin.Result.a = Result.e;
                                       var1 = Result.b(c.a(var26));
                                       break label244;
                                    }

                                    if (var3x != var692) {
                                       break label249;
                                    }

                                    try {
                                       if ((var718.d() as java.lang.Number).intValue() != (var730.d() as java.lang.Number).intValue()) {
                                          break label249;
                                       }
                                    } catch (var34: java.lang.Throwable) {
                                       val var674: kotlin.Result.a = Result.e;
                                       var1 = Result.b(c.a(var34));
                                       break label244;
                                    }

                                    try {
                                       if ((var718.c() as java.lang.Number).intValue() > 8192 || (var718.d() as java.lang.Number).intValue() > 8192) {
                                          break label3616;
                                       }
                                    } catch (var35: java.lang.Throwable) {
                                       val var675: kotlin.Result.a = Result.e;
                                       var1 = Result.b(c.a(var35));
                                       break label244;
                                    }

                                    try {
                                       this.L$0 = var701;
                                       this.L$1 = var693;
                                       this.L$2 = var711;
                                       this.L$3 = var1;
                                       this.L$4 = null;
                                       this.label = 3;
                                       var731 = MediaManagerModule.access$loadImageDataFromUri(var701, (java.lang.String)var693, this);
                                    } catch (var23: java.lang.Throwable) {
                                       val var676: kotlin.Result.a = Result.e;
                                       var1 = Result.b(c.a(var23));
                                       break label244;
                                    }

                                    if (var731 === var10) {
                                       return var10;
                                    }

                                    var713 = var701;
                                    var702 = var711;
                                    var719 = var731;
                                 }

                                 try {
                                    var723 = var719 as ByteArray;
                                    this.L$0 = var693;
                                    this.L$1 = var702;
                                    this.L$2 = var1;
                                    this.L$3 = var723;
                                    this.label = 4;
                                    var732 = MediaManagerModule.access$loadImageDataFromUri(var713, var702, this);
                                 } catch (var22: java.lang.Throwable) {
                                    val var677: kotlin.Result.a = Result.e;
                                    var1 = Result.b(c.a(var22));
                                    break label244;
                                 }

                                 var714 = var723;
                                 var720 = var732;
                                 if (var732 === var10) {
                                    return var10;
                                 }
                              }

                              try {
                                 var724 = var720 as ByteArray;
                              } catch (var21: java.lang.Throwable) {
                                 val var678: kotlin.Result.a = Result.e;
                                 var1 = Result.b(c.a(var21));
                                 break label244;
                              }

                              if (var714 == null) {
                                 try {
                                    val var705: StringBuilder = new StringBuilder();
                                    var705.append("Failed to load original image data from URI: ");
                                    var705.append((java.lang.String)var693);
                                    var1.reject("quality_metrics_error", var705.toString());
                                    break label243;
                                 } catch (var20: java.lang.Throwable) {
                                    val var684: kotlin.Result.a = Result.e;
                                    var1 = Result.b(c.a(var20));
                                    break label244;
                                 }
                              }

                              if (var724 == null) {
                                 try {
                                    var693 = new StringBuilder();
                                    var693.append("Failed to load compressed image data from URI: ");
                                    var693.append(var702);
                                    var1.reject("quality_metrics_error", var693.toString());
                                    break label243;
                                 } catch (var19: java.lang.Throwable) {
                                    val var683: kotlin.Result.a = Result.e;
                                    var1 = Result.b(c.a(var19));
                                    break label244;
                                 }
                              }

                              try {
                                 val var694: ImageQualityCalculator = ImageQualityCalculator.INSTANCE;
                                 this.L$0 = var1;
                                 this.L$1 = null;
                                 this.L$2 = null;
                                 this.L$3 = null;
                                 this.label = 5;
                                 var693 = (StringBuilder)var694.calculateQualityMetrics(var714, var724, this);
                              } catch (var17: java.lang.Throwable) {
                                 val var679: kotlin.Result.a = Result.e;
                                 var1 = Result.b(c.a(var17));
                                 break label244;
                              }

                              if (var693 === var10) {
                                 return var10;
                              }
                           }

                           var var704: ImageQualityCalculator.ImageQualityMetrics;
                           try {
                              var704 = var693 as ImageQualityCalculator.ImageQualityMetrics;
                           } catch (var16: java.lang.Throwable) {
                              val var680: kotlin.Result.a = Result.e;
                              var1 = Result.b(c.a(var16));
                              break label244;
                           }

                           if (var704 == null) {
                              try {
                                 var1.reject("quality_metrics_error", "Failed to calculate quality metrics");
                              } catch (var15: java.lang.Throwable) {
                                 val var681: kotlin.Result.a = Result.e;
                                 var1 = Result.b(c.a(var15));
                                 break label244;
                              }
                           } else {
                              try {
                                 val var695: WritableMap = Arguments.createMap();
                                 var695.putDouble("psnr", var704.getPsnr());
                                 var695.putDouble("ssim", var704.getSsim());
                                 var695.putInt("psnrCalculationTimeMs", (int)var704.getPsnrCalculationTimeMs());
                                 var695.putInt("ssimCalculationTimeMs", (int)var704.getSsimCalculationTimeMs());
                                 var1.resolve(var695);
                              } catch (var14: java.lang.Throwable) {
                                 val var682: kotlin.Result.a = Result.e;
                                 var1 = Result.b(c.a(var14));
                                 break label244;
                              }
                           }
                           break label243;
                        }

                        try {
                           val var697: Any = var718.c();
                           val var706: Any = var718.d();
                           val var715: StringBuilder = new StringBuilder();
                           var715.append("Image too large for quality metrics calculation: ");
                           var715.append(var697);
                           var715.append("x");
                           var715.append(var706);
                           var715.append(" (max: 8192x8192)");
                           var1.reject("quality_metrics_error", var715.toString());
                           break label243;
                        } catch (var13: java.lang.Throwable) {
                           val var685: kotlin.Result.a = Result.e;
                           var1 = Result.b(c.a(var13));
                           break label244;
                        }
                     }

                     try {
                        val var698: Any = var718.c();
                        val var716: Any = var718.d();
                        val var707: Any = var730.c();
                        val var725: Any = var730.d();
                        val var733: StringBuilder = new StringBuilder();
                        var733.append("Image dimensions do not match: original(");
                        var733.append(var698);
                        var733.append("x");
                        var733.append(var716);
                        var733.append(") vs compressed(");
                        var733.append(var707);
                        var733.append("x");
                        var733.append(var725);
                        var733.append(")");
                        var1.reject("quality_metrics_error", var733.toString());
                     } catch (var12: java.lang.Throwable) {
                        val var686: kotlin.Result.a = Result.e;
                        var1 = Result.b(c.a(var12));
                        break label244;
                     }
                  }

                  label134:
                  try {
                     var1 = Result.b(Unit.a);
                  } catch (var11: java.lang.Throwable) {
                     val var689: kotlin.Result.a = Result.e;
                     var1 = Result.b(c.a(var11));
                     break label134;
                  }
               }

               var var709: java.lang.String = this.$originalUri;
               val var717: java.lang.String = this.$compressedUri;
               val var700: Promise = this.$promise;
               val var690: java.lang.Throwable = Result.e(var1);
               if (var690 != null) {
                  val var726: CrashReporting = CrashReporting.INSTANCE;
                  CrashReporting.addBreadcrumb$default(
                     CrashReporting.INSTANCE,
                     "Failed to calculate image quality metrics",
                     s0.m(new Pair[]{v.a("originalUri", var709), v.a("compressedUri", var717)}),
                     null,
                     null,
                     12,
                     null
                  );
                  CrashReporting.captureException$default(var726, var690, false, 2, null);
                  var709 = var690.getMessage();
                  val var691: StringBuilder = new StringBuilder();
                  var691.append("Error calculating image quality metrics: ");
                  var691.append(var709);
                  var700.reject("quality_metrics_error", var691.toString());
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
      this.mediaResolver.cancel(Uri.parse(var1));
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
      g.d(this.scope, m0.b(), null, new Function2<CoroutineScope, Continuation<? super Unit>, Object>(var1, var3, this, var4, null) {
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

         public final Continuation<Unit> create(Object var1, Continuation<?> var2) {
            return new <anonymous constructor>(this.$uri, this.$contentType, this.this$0, this.$promise, var2);
         }

         public final Object invoke(CoroutineScope var1, Continuation<? super Unit> var2x) {
            return (this.create(var1, var2x) as <unrepresentable>).invokeSuspend(Unit.a);
         }

         public final Object invokeSuspend(Object var1) {
            val var3: Any = b.f();
            if (this.label != 0) {
               if (this.label != 1) {
                  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
               }

               c.b(var1);
            } else {
               c.b(var1);
               var1 = MediaAssetUtils.INSTANCE.guessFileName(this.$uri, this.$contentType);
               val var4: PublicFileDownloader = PublicFileDownloader.INSTANCE;
               val var5: ReactApplicationContext = MediaManagerModule.access$getReactApplicationContext(this.this$0);
               val var7: Flow = PublicFileDownloader.downloadFile$default(var4, var5, this.$uri, var1, null, 8, null);
               val var8: FlowCollector = new FlowCollector(this.$promise) {
                  final Promise $promise;

                  {
                     this.$promise = var1;
                  }

                  public final Object emit(DownloadState var1, Continuation<? super Unit> var2x) {
                     if (var1 is DownloadState.Completed) {
                        this.$promise.resolve(kotlin.coroutines.jvm.internal.b.a(true));
                     } else if (var1 is DownloadState.Failure) {
                        this.$promise.reject(new IllegalStateException("Unable to download asset."));
                     } else if (var1 !is DownloadState.InProgress) {
                        throw new p();
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

   public override fun getConstants(): Map<String, List<String>> {
      return s0.f(v.a("supportedExtensions", CollectionsKt.o(new java.lang.String[]{"mp4", "mov", "png", "jpg", "jpeg", "gif", "webp"})));
   }

   @ReactMethod
   public fun getDeviceStateInfo(promise: Promise) {
      val var8: ReactApplicationContext = this.getReactApplicationContext();
      var var6: Any = var8.getSystemService("batterymanager");
      val var2: Double = (var6 as BatteryManager).getIntProperty(4) / 100.0;
      var6 = "UNKNOWN";
      if (VERSION.SDK_INT >= 29) {
         var6 = var8.getSystemService("power");
         val var9: Int = (var6 as PowerManager).getCurrentThermalStatus();
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
         val var3: Log = Log.INSTANCE;
         val var4: StringBuilder = new StringBuilder();
         var4.append("Failed to detect media origin for URI: ");
         var4.append(var1);
         var3.e("MediaManagerModule", var4.toString(), var6);
         val var7: WritableMap = Arguments.createMap();
         var7.putString("source", "unknown");
         var7.putString("confidence", "low");
         var2.resolve(var7);
      }
   }

   public override fun getName(): String {
      return "MediaManager";
   }

   @ReactMethod
   public fun getVideoMetadata(uri: String, options: ReadableMap?, promise: Promise) {
      g.d(
         this.scope,
         null,
         null,
         new Function2<CoroutineScope, Continuation<? super Unit>, Object>(this, Uri.parse(var1), var3, null) {
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

            public final Continuation<Unit> create(Object var1, Continuation<?> var2) {
               val var3: Function2 = new <anonymous constructor>(this.this$0, this.$inputUri, this.$promise, var2);
               var3.L$0 = var1;
               return var3;
            }

            public final Object invoke(CoroutineScope var1, Continuation<? super Unit> var2x) {
               return (this.create(var1, var2x) as <unrepresentable>).invokeSuspend(Unit.a);
            }

            // $VF: Duplicated exception handlers to handle obfuscated exceptions
            // $VF: Could not inline inconsistent finally blocks
            // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
            public final Object invokeSuspend(Object var1) {
               b.f();
               if (this.label == 0) {
                  c.b(var1);
                  var1 = this.L$0 as CoroutineScope;
                  var var4: MediaManagerModule = this.this$0;
                  val var3x: Uri = this.$inputUri;
                  var1 = this.$promise;

                  label77: {
                     var var5: java.util.Iterator;
                     try {
                        val var2x: kotlin.Result.a = Result.e;
                        val var59: java.util.Map = MediaManagerModule.access$getMediaResolver$p(var4).handleVideoMetadata(var3x);
                        var62 = Arguments.createMap();
                        var5 = var59.entrySet().iterator();
                     } catch (var8: java.lang.Throwable) {
                        val var50: kotlin.Result.a = Result.e;
                        var1 = Result.b(c.a(var8));
                        break label77;
                     }

                     label76:
                     while (true) {
                        while (true) {
                           var var60: java.lang.String;
                           try {
                              if (!var5.hasNext()) {
                                 break;
                              }

                              val var64: Entry = var5.next() as Entry;
                              var60 = var64.getKey() as java.lang.String;
                              var4 = (MediaManagerModule)var64.getValue();
                              if (var4 is Int) {
                                 var62.putInt(var60, (var4 as java.lang.Number).intValue());
                                 continue;
                              }
                           } catch (var11: java.lang.Throwable) {
                              val var52: kotlin.Result.a = Result.e;
                              var1 = Result.b(c.a(var11));
                              break label76;
                           }

                           try {
                              if (var4 is java.lang.Boolean) {
                                 var62.putBoolean(var60, var4 as java.lang.Boolean);
                                 continue;
                              }
                           } catch (var10: java.lang.Throwable) {
                              val var53: kotlin.Result.a = Result.e;
                              var1 = Result.b(c.a(var10));
                              break label76;
                           }

                           try {
                              if (var4 is java.lang.String) {
                                 var62.putString(var60, var4 as java.lang.String);
                                 continue;
                              }
                           } catch (var9: java.lang.Throwable) {
                              val var54: kotlin.Result.a = Result.e;
                              var1 = Result.b(c.a(var9));
                              break label76;
                           }

                           try {
                              val var66: java.lang.String = var4.getClass().getName();
                              val var63: StringBuilder = new StringBuilder();
                              var63.append("Unsupported value type ");
                              var63.append(var66);
                              var63.append(" for key [");
                              var63.append(var60);
                              var63.append("]");
                              throw new IllegalArgumentException(var63.toString());
                           } catch (var7: java.lang.Throwable) {
                              val var55: kotlin.Result.a = Result.e;
                              var1 = Result.b(c.a(var7));
                              break label76;
                           }
                        }

                        try {
                           var1.resolve(var62);
                           var1 = Result.b(Unit.a);
                           break;
                        } catch (var6: java.lang.Throwable) {
                           val var57: kotlin.Result.a = Result.e;
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

   public override fun invalidate() {
      super.invalidate();
      i.d(this.scope, new CancellationException("Module destroyed"));
   }

   @ReactMethod
   public fun isHEVCEncodingSupported(promise: Promise) {
      var var2: Boolean;
      label21: {
         label20: {
            try {
               if (this.getEncoderInfo("video/hevc") != null) {
                  break label20;
               }
            } catch (var5: Exception) {
               var1.resolve(java.lang.Boolean.FALSE);
               return;
            }

            var2 = false;
            break label21;
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
      label53: {
         label52: {
            try {
               var6 = var1.getInt("width");
               var5 = var1.getInt("height");
               var3 = var1.getDouble("frameRate");
               if (var1.getBoolean("isHEVC")) {
                  break label52;
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
            break label53;
         }

         var18 = "video/hevc";
      }

      var var8: MediaCodecInfo;
      var var27: WritableMap;
      try {
         var27 = Arguments.createMap();
         var8 = this.getEncoderInfo(var18);
      } catch (var14: Exception) {
         val var19: java.lang.String = var14.getMessage();
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
            val var10: WritableMap = Arguments.createMap();
            var10.putString("type", "codec_not_found");
            val var32: StringBuilder = new StringBuilder();
            var32.append("No encoder found for mime type: ");
            var32.append(var18);
            var10.putString("message", var32.toString());
            var9.pushMap(var10);
            var27.putArray("failures", var9);
            var27.putMap("capabilities", Arguments.createMap());
            var2.resolve(var27);
         } catch (var11: Exception) {
            val var25: java.lang.String = var11.getMessage();
            val var31: StringBuilder = new StringBuilder();
            var31.append("Error checking video encoding support: ");
            var31.append(var25);
            var2.reject("ERROR", var31.toString());
         }
      } else {
         label44: {
            try {
               var27.putString("encoderName", var8.getName());
               val var21: VideoCapabilities = var8.getCapabilitiesForType(var18).getVideoCapabilities();
               var27.putMap("capabilities", this.createCapabilitiesMap(var21));
               val var22: WritableArray = this.checkEncodingConstraints(var6, var5, var3, var21);
               if (var22.size() > 0) {
                  var27.putBoolean("isSupported", false);
                  var27.putArray("failures", var22);
                  break label44;
               }
            } catch (var15: Exception) {
               val var20: java.lang.String = var15.getMessage();
               val var28: StringBuilder = new StringBuilder();
               var28.append("Error checking video encoding support: ");
               var28.append(var20);
               var2.reject("ERROR", var28.toString());
               return;
            }

            try {
               var27.putBoolean("isSupported", true);
            } catch (var13: Exception) {
               val var23: java.lang.String = var13.getMessage();
               val var29: StringBuilder = new StringBuilder();
               var29.append("Error checking video encoding support: ");
               var29.append(var23);
               var2.reject("ERROR", var29.toString());
               return;
            }
         }

         try {
            var2.resolve(var27);
         } catch (var12: Exception) {
            val var24: java.lang.String = var12.getMessage();
            val var30: StringBuilder = new StringBuilder();
            var30.append("Error checking video encoding support: ");
            var30.append(var24);
            var2.reject("ERROR", var30.toString());
         }
      }
   }

   @ReactMethod
   public fun removeListeners(count: Int) {
   }

   @ReactMethod
   public fun resolveToMediaFilePath(uri: String, options: ReadableMap?, promise: Promise) {
      var var9: Int;
      var var10: Boolean;
      var var11: Boolean;
      var var12: Boolean;
      var var13: Uri;
      label17: {
         var13 = Uri.parse(var1);
         var9 = (int)(NativeMapExtensionsKt.getDouble(var2, "compressionQuality", 1.0) * 100);
         var11 = NativeMapExtensionsKt.getBoolean(var2, "isLowQuality", false);
         var10 = NativeMapExtensionsKt.getBoolean(var2, "skipVideoTranscode", false);
         var12 = NativeMapExtensionsKt.getBoolean(var2, "useOriginalIfSmaller", false);
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

      g.d(
         this.scope,
         null,
         null,
         new Function2<CoroutineScope, Continuation<? super Unit>, Object>(this, var13, var9, var11, var10, var12, var17, var3, var1, null) {
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

            public final Continuation<Unit> create(Object var1, Continuation<?> var2) {
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

            public final Object invoke(CoroutineScope var1, Continuation<? super Unit> var2x) {
               return (this.create(var1, var2x) as <unrepresentable>).invokeSuspend(Unit.a);
            }

            // $VF: Duplicated exception handlers to handle obfuscated exceptions
            // $VF: Could not inline inconsistent finally blocks
            // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
            public final Object invokeSuspend(Object var1) {
               label47: {
                  val var8: Any = b.f();
                  val var6: Promise;
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
                        break label47;
                     }
                  } else {
                     c.b(var1);
                     val var25: CoroutineScope = this.L$0 as CoroutineScope;
                     val var10: MediaManagerModule = this.this$0;
                     var var7: Uri = this.$inputUri;
                     val var30: Int = this.$imageCompressionQuality;
                     val var4: Boolean = this.$isLowQuality;
                     val var3x: Boolean = this.$skipVideoTranscode;
                     val var5: Boolean = this.$useOriginalIfSmaller;
                     val var26: EncodingConfig = this.$encodingConfig;
                     var6 = this.$promise;

                     try {
                        val var9: kotlin.Result.a = Result.e;
                        val var35: MediaResolver = MediaManagerModule.access$getMediaResolver$p(var10);
                        this.L$0 = var6;
                        this.label = 1;
                        var7 = (Uri)var35.resolveToUri$media_release(var7, var30, var4, var3x, var5, var26, this);
                     } catch (var12: java.lang.Throwable) {
                        var1 = Result.e;
                        var1 = Result.b(c.a(var12));
                        break label47;
                     }

                     var1 = var7;
                     if (var7 === var8) {
                        return var8;
                     }
                  }

                  label35:
                  try {
                     var6.resolve((var1 as Uri).toString());
                     var1 = Result.b(Unit.a);
                  } catch (var11: java.lang.Throwable) {
                     var1 = Result.e;
                     var1 = Result.b(c.a(var11));
                     break label35;
                  }
               }

               val var33: Promise = this.$promise;
               val var34: java.lang.String = this.$uri;
               val var31: MediaManagerModule = this.this$0;
               val var36: Uri = this.$inputUri;
               val var37: java.lang.Throwable = Result.e(var1);
               if (var37 != null) {
                  if (var37 is CancellationException) {
                     var33.reject(var37);
                  }

                  val var29: CrashReporting = CrashReporting.INSTANCE;
                  CrashReporting.addBreadcrumb$default(
                     CrashReporting.INSTANCE,
                     "Failed to resolve URI to file",
                     s0.m(
                        new Pair[]{
                           v.a("uri", var34), v.a("mimeType", java.lang.String.valueOf(MediaManagerModule.access$getMediaResolver$p(var31).getMimeType(var36)))
                        }
                     ),
                     null,
                     null,
                     12,
                     null
                  );
                  CrashReporting.captureException$default(var29, var37, false, 2, null);
                  var33.reject(var37);
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

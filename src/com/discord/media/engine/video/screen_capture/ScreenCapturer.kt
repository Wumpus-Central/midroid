package com.discord.media.engine.video.screen_capture

import android.content.Context
import android.content.Intent
import android.graphics.Point
import android.graphics.Rect
import android.media.AudioPlaybackCaptureConfiguration
import android.media.AudioRecord
import android.media.AudioRecord.Builder
import android.media.projection.MediaProjection.Callback
import android.os.Build.VERSION
import android.view.WindowManager
import co.discord.media_engine.NativeCapturerObserver
import co.discord.media_engine.SoundshareAudioSource
import com.discord.logging.Log
import kotlin.jvm.internal.q
import org.webrtc.CapturerObserver
import org.webrtc.ScreenCapturerAndroid
import org.webrtc.SurfaceTextureHelper
import org.webrtc.TimestampAligner
import org.webrtc.VideoFrame

internal class ScreenCapturer(mediaProjectionPermissionResultData: Intent) : ScreenCapturerAndroid {
   public final var thumbnailEmitter: ThumbnailEmitter?
      internal final set(value) {
         if (this.thumbnailEmitter != null) {
            this.thumbnailEmitter.release();
         }

         this.thumbnailEmitter = var1;
      }


   private final val watchdog: com.discord.media.engine.video.screen_capture.ScreenCapturer.Watchdog
   private final lateinit var nativeObserver: NativeCapturerObserver
   private final lateinit var surfaceTextureHelper: SurfaceTextureHelper
   private final lateinit var context: Context
   public final val soundshare: SoundshareAudioSource
   private final var framerate: Int
   private final var intervalNanos: Int
   private final var lastFrameTimestamp: Long?
   private final val lastMeasuredSize: Rect
   private final val currentMeasuredSize: Rect
   private final val calculatedSize: Point
   private final var maxPixelCount: Int

   init {
      q.h(var1, "mediaProjectionPermissionResultData");
      super(var1, ScreenCapturer.MediaProjectionObserver.INSTANCE);
      this.watchdog = new ScreenCapturer.Watchdog(this);
      this.soundshare = new SoundshareAudioSource();
      this.lastMeasuredSize = new Rect();
      this.currentMeasuredSize = new Rect();
      this.calculatedSize = new Point();
   }

   private fun createRecorder(): AudioRecord? {
      var var1: AudioRecord = null;
      if (this.mediaProjection != null) {
         val var7: AudioPlaybackCaptureConfiguration = b.a(a.a(a.a(a.a(e.a(this.mediaProjection), 1), 14), 0));
         q.g(var7, "build(...)");

         try {
            var1 = c.a(
                  new Builder().setAudioFormat(new android.media.AudioFormat.Builder().setEncoding(2).setSampleRate(44100).setChannelMask(16).build()), var7
               )
               .build();
         } catch (var5: SecurityException) {
            Log.INSTANCE.e("ScreenCapturer", "Failed to record audio", var5);
            var1 = null;
         }
      }

      return var1;
   }

   private fun getScreenSize(context: Context): Rect {
      val var3: Rect = this.currentMeasuredSize;
      if (VERSION.SDK_INT >= 34) {
         this.currentMeasuredSize.set(ScreenCapturer.MediaProjectionObserver.INSTANCE.getCurrentCaptureSize());
      } else if (VERSION.SDK_INT >= 30) {
         val var4: Any = var1.getSystemService("window");
         q.f(var4, "null cannot be cast to non-null type android.view.WindowManager");
         var3.set(E0.c.a(d.a(var4 as WindowManager)));
      } else {
         this.currentMeasuredSize.set(0, 0, var1.getResources().getDisplayMetrics().widthPixels, var1.getResources().getDisplayMetrics().heightPixels);
      }

      return var3;
   }

   private fun setFramerate(framerate: Int) {
      if (var1 <= 0) {
         this.framerate = 0;
         this.intervalNanos = 0;
      } else {
         this.framerate = var1;
         this.intervalNanos = 1000000000 / Math.max(10, var1 / 2);
      }
   }

   private fun startWatchdog() {
      this.scheduleWatchdog();
   }

   private fun stopWatchdog() {
      this.framerate = 0;
      this.lastFrameTimestamp = null;
   }

   public open fun changeCaptureFormat(width: Int, height: Int, framerate: Int) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
      //   at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:100)
      //   at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:106)
      //   at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:302)
      //   at java.base/java.util.Objects.checkIndex(Objects.java:385)
      //   at java.base/java.util.ArrayList.remove(ArrayList.java:551)
      //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.removeExceptionInstructionsEx(FinallyProcessor.java:1057)
      //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.verifyFinallyEx(FinallyProcessor.java:572)
      //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.iterateGraph(FinallyProcessor.java:90)
      //
      // Bytecode:
      // 00: aload 0
      // 01: monitorenter
      // 02: aload 0
      // 03: aload 0
      // 04: getfield com/discord/media/engine/video/screen_capture/ScreenCapturer.lastMeasuredSize Landroid/graphics/Rect;
      // 07: iload 1
      // 08: iload 2
      // 09: imul
      // 0a: invokevirtual com/discord/media/engine/video/screen_capture/ScreenCapturer.changeCaptureFormatInternal (Landroid/graphics/Rect;I)V
      // 0d: aload 0
      // 0e: iload 3
      // 0f: invokespecial com/discord/media/engine/video/screen_capture/ScreenCapturer.setFramerate (I)V
      // 12: aload 0
      // 13: monitorexit
      // 14: return
      // 15: astore 4
      // 17: aload 0
      // 18: monitorexit
      // 19: aload 4
      // 1b: athrow
   }

   public fun changeCaptureFormatInternal(measuredSize: Rect, maxPixelCount: Int) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
      //   at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:100)
      //   at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:106)
      //   at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:302)
      //   at java.base/java.util.Objects.checkIndex(Objects.java:385)
      //   at java.base/java.util.ArrayList.remove(ArrayList.java:551)
      //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.removeExceptionInstructionsEx(FinallyProcessor.java:1057)
      //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.verifyFinallyEx(FinallyProcessor.java:572)
      //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.iterateGraph(FinallyProcessor.java:90)
      //
      // Bytecode:
      // 00: aload 0
      // 01: monitorenter
      // 02: aload 1
      // 03: ldc_w "measuredSize"
      // 06: invokestatic kotlin/jvm/internal/q.h (Ljava/lang/Object;Ljava/lang/String;)V
      // 09: aload 1
      // 0a: invokevirtual android/graphics/Rect.width ()I
      // 0d: aload 1
      // 0e: invokevirtual android/graphics/Rect.height ()I
      // 11: imul
      // 12: istore 4
      // 14: iload 4
      // 16: ifle 7b
      // 19: iload 2
      // 1a: i2f
      // 1b: iload 4
      // 1d: i2f
      // 1e: fdiv
      // 1f: f2d
      // 20: invokestatic java/lang/Math.sqrt (D)D
      // 23: d2f
      // 24: fstore 3
      // 25: aload 0
      // 26: getfield com/discord/media/engine/video/screen_capture/ScreenCapturer.calculatedSize Landroid/graphics/Point;
      // 29: aload 1
      // 2a: invokevirtual android/graphics/Rect.width ()I
      // 2d: i2f
      // 2e: fload 3
      // 2f: fmul
      // 30: f2i
      // 31: aload 1
      // 32: invokevirtual android/graphics/Rect.height ()I
      // 35: i2f
      // 36: fload 3
      // 37: fmul
      // 38: f2i
      // 39: invokevirtual android/graphics/Point.set (II)V
      // 3c: aload 0
      // 3d: getfield com/discord/media/engine/video/screen_capture/ScreenCapturer.calculatedSize Landroid/graphics/Point;
      // 40: astore 1
      // 41: getstatic com/discord/media/engine/video/screen_capture/ScreenCapturer.Companion Lcom/discord/media/engine/video/screen_capture/ScreenCapturer$Companion;
      // 44: astore 5
      // 46: aload 1
      // 47: aload 5
      // 49: aload 1
      // 4a: getfield android/graphics/Point.x I
      // 4d: invokestatic com/discord/media/engine/video/screen_capture/ScreenCapturer$Companion.access$closestMod16 (Lcom/discord/media/engine/video/screen_capture/ScreenCapturer$Companion;I)I
      // 50: aload 5
      // 52: aload 0
      // 53: getfield com/discord/media/engine/video/screen_capture/ScreenCapturer.calculatedSize Landroid/graphics/Point;
      // 56: getfield android/graphics/Point.y I
      // 59: invokestatic com/discord/media/engine/video/screen_capture/ScreenCapturer$Companion.access$closestMod16 (Lcom/discord/media/engine/video/screen_capture/ScreenCapturer$Companion;I)I
      // 5c: invokevirtual android/graphics/Point.set (II)V
      // 5f: aload 0
      // 60: getfield com/discord/media/engine/video/screen_capture/ScreenCapturer.calculatedSize Landroid/graphics/Point;
      // 63: astore 1
      // 64: aload 0
      // 65: aload 1
      // 66: getfield android/graphics/Point.x I
      // 69: aload 1
      // 6a: getfield android/graphics/Point.y I
      // 6d: aload 0
      // 6e: getfield com/discord/media/engine/video/screen_capture/ScreenCapturer.framerate I
      // 71: invokespecial org/webrtc/ScreenCapturerAndroid.changeCaptureFormat (III)V
      // 74: goto 7b
      // 77: astore 1
      // 78: goto 7e
      // 7b: aload 0
      // 7c: monitorexit
      // 7d: return
      // 7e: aload 0
      // 7f: monitorexit
      // 80: aload 1
      // 81: athrow
   }

   public open fun dispose() {
      this.release();
      super.dispose();
   }

   public open fun initialize(surfaceTextureHelper: SurfaceTextureHelper, applicationContext: Context, capturerObserver: CapturerObserver) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
      //   at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:100)
      //   at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:106)
      //   at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:302)
      //   at java.base/java.util.Objects.checkIndex(Objects.java:385)
      //   at java.base/java.util.ArrayList.remove(ArrayList.java:551)
      //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.removeExceptionInstructionsEx(FinallyProcessor.java:1057)
      //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.verifyFinallyEx(FinallyProcessor.java:572)
      //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.iterateGraph(FinallyProcessor.java:90)
      //
      // Bytecode:
      // 00: aload 0
      // 01: monitorenter
      // 02: aload 1
      // 03: ldc_w "surfaceTextureHelper"
      // 06: invokestatic kotlin/jvm/internal/q.h (Ljava/lang/Object;Ljava/lang/String;)V
      // 09: aload 2
      // 0a: ldc_w "applicationContext"
      // 0d: invokestatic kotlin/jvm/internal/q.h (Ljava/lang/Object;Ljava/lang/String;)V
      // 10: aload 3
      // 11: ldc_w "capturerObserver"
      // 14: invokestatic kotlin/jvm/internal/q.h (Ljava/lang/Object;Ljava/lang/String;)V
      // 17: aload 0
      // 18: aload 1
      // 19: putfield com/discord/media/engine/video/screen_capture/ScreenCapturer.surfaceTextureHelper Lorg/webrtc/SurfaceTextureHelper;
      // 1c: aload 0
      // 1d: aload 2
      // 1e: putfield com/discord/media/engine/video/screen_capture/ScreenCapturer.context Landroid/content/Context;
      // 21: aload 0
      // 22: aload 3
      // 23: checkcast co/discord/media_engine/NativeCapturerObserver
      // 26: putfield com/discord/media/engine/video/screen_capture/ScreenCapturer.nativeObserver Lco/discord/media_engine/NativeCapturerObserver;
      // 29: aload 0
      // 2a: aload 1
      // 2b: aload 2
      // 2c: aload 3
      // 2d: invokespecial org/webrtc/ScreenCapturerAndroid.initialize (Lorg/webrtc/SurfaceTextureHelper;Landroid/content/Context;Lorg/webrtc/CapturerObserver;)V
      // 30: aload 0
      // 31: monitorexit
      // 32: return
      // 33: astore 1
      // 34: aload 0
      // 35: monitorexit
      // 36: aload 1
      // 37: athrow
   }

   public open fun onFrame(frame: VideoFrame?) {
      if (var1 != null) {
         var var2: Context = this.context;
         if (this.context == null) {
            q.y("context");
            var2 = null;
         }

         val var4: Rect = this.getScreenSize(var2);
         if (!q.c(var4, this.lastMeasuredSize)) {
            this.lastMeasuredSize.set(var4);
            this.changeCaptureFormatInternal(var4, this.maxPixelCount);
         }

         this.lastFrameTimestamp = var1.getTimestampNs();
         if (this.thumbnailEmitter != null) {
            this.thumbnailEmitter.onFrame(var1);
         }
      }

      super.onFrame(var1);
   }

   public fun release() {
      this.stopCapture();
      this.soundshare.release();
      this.setThumbnailEmitter(null);
   }

   public fun scheduleWatchdog() {
      if (this.framerate > 0) {
         var var1: SurfaceTextureHelper = this.surfaceTextureHelper;
         if (this.surfaceTextureHelper == null) {
            q.y("surfaceTextureHelper");
            var1 = null;
         }

         var1.getHandler().postDelayed(this.watchdog, (long)this.intervalNanos / 1000000L);
      }
   }

   public open fun startCapture(width: Int, height: Int, framerate: Int) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
      //   at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:100)
      //   at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:106)
      //   at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:302)
      //   at java.base/java.util.Objects.checkIndex(Objects.java:385)
      //   at java.base/java.util.ArrayList.remove(ArrayList.java:551)
      //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.removeExceptionInstructionsEx(FinallyProcessor.java:1057)
      //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.verifyFinallyEx(FinallyProcessor.java:572)
      //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.iterateGraph(FinallyProcessor.java:90)
      //
      // Bytecode:
      // 00: aload 0
      // 01: monitorenter
      // 02: aload 0
      // 03: iload 1
      // 04: iload 2
      // 05: iload 3
      // 06: invokespecial org/webrtc/ScreenCapturerAndroid.startCapture (III)V
      // 09: aload 0
      // 0a: iload 1
      // 0b: iload 2
      // 0c: imul
      // 0d: putfield com/discord/media/engine/video/screen_capture/ScreenCapturer.maxPixelCount I
      // 10: aload 0
      // 11: iload 3
      // 12: invokespecial com/discord/media/engine/video/screen_capture/ScreenCapturer.setFramerate (I)V
      // 15: getstatic android/os/Build$VERSION.SDK_INT I
      // 18: bipush 29
      // 1a: if_icmplt 3a
      // 1d: aload 0
      // 1e: invokespecial com/discord/media/engine/video/screen_capture/ScreenCapturer.createRecorder ()Landroid/media/AudioRecord;
      // 21: astore 4
      // 23: aload 4
      // 25: ifnull 3a
      // 28: aload 0
      // 29: getfield com/discord/media/engine/video/screen_capture/ScreenCapturer.soundshare Lco/discord/media_engine/SoundshareAudioSource;
      // 2c: aload 4
      // 2e: invokevirtual co/discord/media_engine/SoundshareAudioSource.startRecording (Landroid/media/AudioRecord;)Z
      // 31: pop
      // 32: goto 3a
      // 35: astore 4
      // 37: goto 41
      // 3a: aload 0
      // 3b: invokespecial com/discord/media/engine/video/screen_capture/ScreenCapturer.startWatchdog ()V
      // 3e: aload 0
      // 3f: monitorexit
      // 40: return
      // 41: aload 0
      // 42: monitorexit
      // 43: aload 4
      // 45: athrow
   }

   public open fun stopCapture() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
      //   at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:100)
      //   at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:106)
      //   at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:302)
      //   at java.base/java.util.Objects.checkIndex(Objects.java:385)
      //   at java.base/java.util.ArrayList.remove(ArrayList.java:551)
      //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.removeExceptionInstructionsEx(FinallyProcessor.java:1057)
      //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.verifyFinallyEx(FinallyProcessor.java:572)
      //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.iterateGraph(FinallyProcessor.java:90)
      //
      // Bytecode:
      // 00: aload 0
      // 01: monitorenter
      // 02: aload 0
      // 03: invokespecial org/webrtc/ScreenCapturerAndroid.stopCapture ()V
      // 06: aload 0
      // 07: getfield com/discord/media/engine/video/screen_capture/ScreenCapturer.soundshare Lco/discord/media_engine/SoundshareAudioSource;
      // 0a: invokevirtual co/discord/media_engine/SoundshareAudioSource.stopRecording ()Z
      // 0d: pop
      // 0e: aload 0
      // 0f: invokespecial com/discord/media/engine/video/screen_capture/ScreenCapturer.stopWatchdog ()V
      // 12: aload 0
      // 13: monitorexit
      // 14: return
      // 15: astore 1
      // 16: aload 0
      // 17: monitorexit
      // 18: aload 1
      // 19: athrow
   }

   protected open fun updateVirtualDisplay() {
      try {
         super.updateVirtualDisplay();
      } catch (var2: java.lang.Throwable) {
         Log.INSTANCE.e("ScreenCapturer", "error in updateVirtualDisplay", var2);
         return;
      }
   }

   public companion object {
      private const val TAG: String
      private const val SAMPLING_RATE_IN_HZ: Int
      private const val CHANNEL_CONFIG: Int
      private const val AUDIO_FORMAT: Int
      private const val MIN_REPEAT_FRAMERATE: Int

      private fun closestMod16(n: Int): Int {
         val var2: Int = var1 % 16;
         if (var1 % 16 >= 8) {
            var1 += 16;
         }

         return var1 - var2;
      }
   }

   public object MediaProjectionObserver : Callback {
      public final var currentCaptureSize: Rect = new Rect()
         internal set

      public open fun onCapturedContentResize(width: Int, height: Int) {
         currentCaptureSize.set(0, 0, var1, var2);
      }
   }

   private inner class Watchdog : Runnable {
      init {
         this.this$0 = var1;
      }

      public override fun run() {
         if (ScreenCapturer.access$getFramerate$p(this.this$0) > 0) {
            val var3: java.lang.Long = ScreenCapturer.access$getLastFrameTimestamp$p(this.this$0);
            if (var3 != null) {
               val var4: ScreenCapturer = this.this$0;
               if (TimestampAligner.getRtcTimeNanos() - var3.longValue() > ScreenCapturer.access$getIntervalNanos$p(var4)) {
                  val var6: NativeCapturerObserver = ScreenCapturer.access$getNativeObserver$p(var4);
                  var var5: NativeCapturerObserver = var6;
                  if (var6 == null) {
                     q.y("nativeObserver");
                     var5 = null;
                  }

                  var5.repeatLastFrame();
               }
            }

            this.this$0.scheduleWatchdog();
         }
      }
   }
}

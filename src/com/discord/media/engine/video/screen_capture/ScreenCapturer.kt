package com.discord.media.engine.video.screen_capture

import android.content.Context
import android.content.Intent
import android.graphics.Point
import android.graphics.Rect
import android.media.AudioPlaybackCaptureConfiguration
import android.media.AudioRecord
import android.media.AudioPlaybackCaptureConfiguration.Builder
import android.media.projection.MediaProjection.Callback
import android.os.Build.VERSION
import android.view.WindowManager
import co.discord.media_engine.NativeCapturerObserver
import co.discord.media_engine.SoundshareAudioSource
import com.discord.logging.Log
import kotlin.jvm.internal.r
import org.webrtc.CapturerObserver
import org.webrtc.ScreenCapturerAndroid
import org.webrtc.SurfaceTextureHelper
import org.webrtc.TimestampAligner
import org.webrtc.VideoFrame

internal class ScreenCapturer(mediaProjectionPermissionResultData: Intent) : ScreenCapturerAndroid {
   private final val calculatedSize: Point
   private final lateinit var context: Context
   private final val currentMeasuredSize: Rect
   private final var framerate: Int
   private final var intervalNanos: Int
   private final var lastFrameTimestamp: Long?
   private final val lastMeasuredSize: Rect
   private final var maxDimension: Int
   private final lateinit var nativeObserver: NativeCapturerObserver
   public final val soundshare: SoundshareAudioSource
   private final lateinit var surfaceTextureHelper: SurfaceTextureHelper

   public final var thumbnailEmitter: ThumbnailEmitter?
      internal final set(value) {
         if (this.thumbnailEmitter != null) {
            this.thumbnailEmitter.release();
         }

         this.thumbnailEmitter = var1;
      }


   private final val watchdog: com.discord.media.engine.video.screen_capture.ScreenCapturer.Watchdog

   init {
      r.h(var1, "mediaProjectionPermissionResultData");
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
         val var6: AudioPlaybackCaptureConfiguration = d.a(c.a(c.a(c.a(new Builder(this.mediaProjection), 1), 14), 0));
         r.g(var6, "Builder(mediaProjection)…\n                .build()");

         try {
            var1 = e.a(
                  new android.media.AudioRecord.Builder()
                     .setAudioFormat(new android.media.AudioFormat.Builder().setEncoding(2).setSampleRate(44100).setChannelMask(16).build()),
                  var6
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
         r.f(var4, "null cannot be cast to non-null type android.view.WindowManager");
         var3.set(b.a(a.a(var4 as WindowManager)));
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

   public override fun changeCaptureFormat(width: Int, height: Int, framerate: Int) {
      label13: {
         synchronized (this){} // $VF: monitorenter 

         try {
            this.changeCaptureFormatInternal(this.lastMeasuredSize, Math.max(var1, var2));
            this.setFramerate(var3);
         } catch (var5: java.lang.Throwable) {
            // $VF: monitorexit
         }

         // $VF: monitorexit
      }
   }

   public fun changeCaptureFormatInternal(measuredSize: Rect, maxDimension: Int) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.IndexOutOfBoundsException: Index -1 out of bounds for length 0
      //   at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:100)
      //   at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:106)
      //   at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:302)
      //   at java.base/java.util.Objects.checkIndex(Objects.java:385)
      //   at java.base/java.util.ArrayList.remove(ArrayList.java:551)
      //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.removeExceptionInstructionsEx(FinallyProcessor.java:1054)
      //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.verifyFinallyEx(FinallyProcessor.java:555)
      //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.iterateGraph(FinallyProcessor.java:91)
      //
      // Bytecode:
      // 00: aload 0
      // 01: monitorenter
      // 02: aload 1
      // 03: ldc_w "measuredSize"
      // 06: invokestatic kotlin/jvm/internal/r.h (Ljava/lang/Object;Ljava/lang/String;)V
      // 09: aload 1
      // 0a: invokevirtual android/graphics/Rect.width ()I
      // 0d: aload 1
      // 0e: invokevirtual android/graphics/Rect.height ()I
      // 11: invokestatic java/lang/Math.max (II)I
      // 14: istore 4
      // 16: iload 4
      // 18: ifle 71
      // 1b: iload 2
      // 1c: i2f
      // 1d: iload 4
      // 1f: i2f
      // 20: fdiv
      // 21: fstore 3
      // 22: aload 0
      // 23: getfield com/discord/media/engine/video/screen_capture/ScreenCapturer.calculatedSize Landroid/graphics/Point;
      // 26: aload 1
      // 27: invokevirtual android/graphics/Rect.width ()I
      // 2a: i2f
      // 2b: fload 3
      // 2c: fmul
      // 2d: f2i
      // 2e: aload 1
      // 2f: invokevirtual android/graphics/Rect.height ()I
      // 32: i2f
      // 33: fload 3
      // 34: fmul
      // 35: f2i
      // 36: invokevirtual android/graphics/Point.set (II)V
      // 39: aload 0
      // 3a: getfield com/discord/media/engine/video/screen_capture/ScreenCapturer.calculatedSize Landroid/graphics/Point;
      // 3d: astore 5
      // 3f: getstatic com/discord/media/engine/video/screen_capture/ScreenCapturer.Companion Lcom/discord/media/engine/video/screen_capture/ScreenCapturer$Companion;
      // 42: astore 1
      // 43: aload 5
      // 45: aload 1
      // 46: aload 5
      // 48: getfield android/graphics/Point.x I
      // 4b: invokestatic com/discord/media/engine/video/screen_capture/ScreenCapturer$Companion.access$closestMod16 (Lcom/discord/media/engine/video/screen_capture/ScreenCapturer$Companion;I)I
      // 4e: aload 1
      // 4f: aload 0
      // 50: getfield com/discord/media/engine/video/screen_capture/ScreenCapturer.calculatedSize Landroid/graphics/Point;
      // 53: getfield android/graphics/Point.y I
      // 56: invokestatic com/discord/media/engine/video/screen_capture/ScreenCapturer$Companion.access$closestMod16 (Lcom/discord/media/engine/video/screen_capture/ScreenCapturer$Companion;I)I
      // 59: invokevirtual android/graphics/Point.set (II)V
      // 5c: aload 0
      // 5d: getfield com/discord/media/engine/video/screen_capture/ScreenCapturer.calculatedSize Landroid/graphics/Point;
      // 60: astore 1
      // 61: aload 0
      // 62: aload 1
      // 63: getfield android/graphics/Point.x I
      // 66: aload 1
      // 67: getfield android/graphics/Point.y I
      // 6a: aload 0
      // 6b: getfield com/discord/media/engine/video/screen_capture/ScreenCapturer.framerate I
      // 6e: invokespecial org/webrtc/ScreenCapturerAndroid.changeCaptureFormat (III)V
      // 71: aload 0
      // 72: monitorexit
      // 73: return
      // 74: astore 1
      // 75: aload 0
      // 76: monitorexit
      // 77: aload 1
      // 78: athrow
   }

   public override fun dispose() {
      this.release();
      super.dispose();
   }

   public override fun initialize(surfaceTextureHelper: SurfaceTextureHelper, applicationContext: Context, capturerObserver: CapturerObserver) {
      label13: {
         synchronized (this){} // $VF: monitorenter 

         try {
            r.h(var1, "surfaceTextureHelper");
            r.h(var2, "applicationContext");
            r.h(var3, "capturerObserver");
            this.surfaceTextureHelper = var1;
            this.context = var2;
            this.nativeObserver = var3 as NativeCapturerObserver;
            super.initialize(var1, var2, var3);
         } catch (var4: java.lang.Throwable) {
            // $VF: monitorexit
         }

         // $VF: monitorexit
      }
   }

   public override fun onFrame(frame: VideoFrame?) {
      if (var1 != null) {
         var var2: Context = this.context;
         if (this.context == null) {
            r.y("context");
            var2 = null;
         }

         val var4: Rect = this.getScreenSize(var2);
         if (!r.c(var4, this.lastMeasuredSize)) {
            this.lastMeasuredSize.set(var4);
            this.changeCaptureFormatInternal(var4, this.maxDimension);
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
            r.y("surfaceTextureHelper");
            var1 = null;
         }

         var1.getHandler().postDelayed(this.watchdog, (long)this.intervalNanos / 1000000L);
      }
   }

   public override fun startCapture(width: Int, height: Int, framerate: Int) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.IndexOutOfBoundsException: Index -1 out of bounds for length 0
      //   at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:100)
      //   at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:106)
      //   at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:302)
      //   at java.base/java.util.Objects.checkIndex(Objects.java:385)
      //   at java.base/java.util.ArrayList.remove(ArrayList.java:551)
      //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.removeExceptionInstructionsEx(FinallyProcessor.java:1054)
      //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.verifyFinallyEx(FinallyProcessor.java:555)
      //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.iterateGraph(FinallyProcessor.java:91)
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
      // 0c: invokestatic java/lang/Math.max (II)I
      // 0f: putfield com/discord/media/engine/video/screen_capture/ScreenCapturer.maxDimension I
      // 12: aload 0
      // 13: iload 3
      // 14: invokespecial com/discord/media/engine/video/screen_capture/ScreenCapturer.setFramerate (I)V
      // 17: getstatic android/os/Build$VERSION.SDK_INT I
      // 1a: bipush 29
      // 1c: if_icmplt 34
      // 1f: aload 0
      // 20: invokespecial com/discord/media/engine/video/screen_capture/ScreenCapturer.createRecorder ()Landroid/media/AudioRecord;
      // 23: astore 4
      // 25: aload 4
      // 27: ifnull 34
      // 2a: aload 0
      // 2b: getfield com/discord/media/engine/video/screen_capture/ScreenCapturer.soundshare Lco/discord/media_engine/SoundshareAudioSource;
      // 2e: aload 4
      // 30: invokevirtual co/discord/media_engine/SoundshareAudioSource.startRecording (Landroid/media/AudioRecord;)Z
      // 33: pop
      // 34: aload 0
      // 35: invokespecial com/discord/media/engine/video/screen_capture/ScreenCapturer.startWatchdog ()V
      // 38: aload 0
      // 39: monitorexit
      // 3a: return
      // 3b: astore 4
      // 3d: aload 0
      // 3e: monitorexit
      // 3f: aload 4
      // 41: athrow
   }

   public override fun stopCapture() {
      label13: {
         synchronized (this){} // $VF: monitorenter 

         try {
            super.stopCapture();
            this.soundshare.stopRecording();
            this.stopWatchdog();
         } catch (var2: java.lang.Throwable) {
            // $VF: monitorexit
         }

         // $VF: monitorexit
      }
   }

   protected override fun updateVirtualDisplay() {
      try {
         super.updateVirtualDisplay();
      } catch (var2: java.lang.Throwable) {
         Log.INSTANCE.e("ScreenCapturer", "error in updateVirtualDisplay", var2);
         return;
      }
   }

   public companion object {
      private const val AUDIO_FORMAT: Int
      private const val CHANNEL_CONFIG: Int
      private const val MIN_REPEAT_FRAMERATE: Int
      private const val SAMPLING_RATE_IN_HZ: Int
      private const val TAG: String

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
            val var4: java.lang.Long = ScreenCapturer.access$getLastFrameTimestamp$p(this.this$0);
            if (var4 != null) {
               val var3: ScreenCapturer = this.this$0;
               if (TimestampAligner.getRtcTimeNanos() - var4.longValue() > ScreenCapturer.access$getIntervalNanos$p(var3)) {
                  val var6: NativeCapturerObserver = ScreenCapturer.access$getNativeObserver$p(var3);
                  var var5: NativeCapturerObserver = var6;
                  if (var6 == null) {
                     r.y("nativeObserver");
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

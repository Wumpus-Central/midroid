package com.discord.media.engine.video.egl_renderer

import android.graphics.Matrix
import android.graphics.SurfaceTexture
import android.os.Handler
import android.os.HandlerThread
import android.os.Looper
import android.view.Surface
import co.discord.media_engine.SharedEglBaseContext
import com.discord.media.engine.types.Debug
import java.util.concurrent.CountDownLatch
import java.util.concurrent.TimeUnit
import kotlin.jvm.functions.Function0
import kotlin.jvm.functions.Function1
import kotlin.jvm.internal.q
import org.webrtc.EglBase
import org.webrtc.EglHelper
import org.webrtc.GlRectDrawer
import org.webrtc.Logging
import org.webrtc.ThreadUtils
import org.webrtc.VideoFrame
import org.webrtc.VideoFrameDrawer
import org.webrtc.VideoSink
import org.webrtc.RendererCommon.GlDrawer

internal open class EglRenderer(name: String) : VideoSink {
   private final val drawMatrix: Matrix
   private final val drawer: GlDrawer
   private final var eglBase: EglBase?
   private final val eglSurfaceCreationRunnable: com.discord.media.engine.video.egl_renderer.EglRenderer.EglSurfaceCreation
   private final var errorCallback: ErrorCallback?
   private final val fpsReductionLock: Any
   private final val frameDrawer: VideoFrameDrawer
   private final val frameLock: Any
   private final var framesDropped: Int
   private final var framesReceived: Int
   private final var framesRendered: Int
   private final val handlerLock: Any
   private final var layoutAspectRatio: Float
   private final val layoutLock: Any
   private final val logStatisticsRunnable: Runnable
   private final var minRenderPeriodNs: Long
   protected final val name: String
   private final var nextFrameTimeNs: Long
   private final var pendingFrame: VideoFrame?
   private final var renderSwapBufferTimeNs: Long
   private final var renderThreadHandler: Handler?
   private final var renderTimeNs: Long
   private final val statisticsLock: Any
   private final var statisticsStartTimeNs: Long

   init {
      q.h(var1, "name");
      super();
      this.name = var1;
      this.handlerLock = new Object();
      this.fpsReductionLock = new Object();
      this.frameDrawer = new VideoFrameDrawer();
      this.drawer = new GlRectDrawer();
      this.drawMatrix = new Matrix();
      this.frameLock = new Object();
      this.layoutLock = new Object();
      this.statisticsLock = new Object();
      this.logStatisticsRunnable = new f(this);
      this.eglSurfaceCreationRunnable = new EglRenderer.EglSurfaceCreation(this);
   }

   private fun createEglSurfaceInternal(surface: Any) {
      this.eglSurfaceCreationRunnable.setSurface(var1);
      this.postToRenderThread(this.eglSurfaceCreationRunnable);
   }

   @JvmStatic
   fun `init$lambda$8$lambda$7`(var0: EglRenderer, var1: Long) {
      q.h(var0, "this$0");
      var0.logD("Creating EglBase");
      var0.eglBase = EglHelper.create(SharedEglBaseContext.getEglContext(), EglBase.CONFIG_PLAIN);
      val var3: Debug = Debug.INSTANCE;
   }

   private fun logD(string: String) {
      val var3: java.lang.String = this.name;
      val var2: StringBuilder = new StringBuilder();
      var2.append("name: ");
      var2.append(var1);
      Logging.d(var3, var2.toString());
   }

   private fun logE(string: String, e: Throwable) {
      val var3: java.lang.String = this.name;
      val var4: StringBuilder = new StringBuilder();
      var4.append("name: ");
      var4.append(var1);
      Logging.e(var3, var4.toString(), var2);
   }

   private fun logStatistics() {
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
      // 000: new java/text/DecimalFormat
      // 003: dup
      // 004: ldc_w "#.0"
      // 007: invokespecial java/text/DecimalFormat.<init> (Ljava/lang/String;)V
      // 00a: astore 10
      // 00c: invokestatic java/lang/System.nanoTime ()J
      // 00f: lstore 5
      // 011: aload 0
      // 012: getfield com/discord/media/engine/video/egl_renderer/EglRenderer.statisticsLock Ljava/lang/Object;
      // 015: astore 9
      // 017: aload 9
      // 019: monitorenter
      // 01a: lload 5
      // 01c: aload 0
      // 01d: getfield com/discord/media/engine/video/egl_renderer/EglRenderer.statisticsStartTimeNs J
      // 020: lsub
      // 021: lstore 7
      // 023: lload 7
      // 025: lconst_0
      // 026: lcmp
      // 027: ifle 13d
      // 02a: aload 0
      // 02b: getfield com/discord/media/engine/video/egl_renderer/EglRenderer.minRenderPeriodNs J
      // 02e: ldc2_w 9223372036854775807
      // 031: lcmp
      // 032: ifne 044
      // 035: aload 0
      // 036: getfield com/discord/media/engine/video/egl_renderer/EglRenderer.framesReceived I
      // 039: ifne 044
      // 03c: goto 13d
      // 03f: astore 10
      // 041: goto 141
      // 044: aload 0
      // 045: getfield com/discord/media/engine/video/egl_renderer/EglRenderer.framesRendered I
      // 048: i2l
      // 049: getstatic java/util/concurrent/TimeUnit.SECONDS Ljava/util/concurrent/TimeUnit;
      // 04c: lconst_1
      // 04d: invokevirtual java/util/concurrent/TimeUnit.toNanos (J)J
      // 050: lmul
      // 051: l2f
      // 052: lload 7
      // 054: l2f
      // 055: fdiv
      // 056: fstore 1
      // 057: getstatic java/util/concurrent/TimeUnit.NANOSECONDS Ljava/util/concurrent/TimeUnit;
      // 05a: lload 7
      // 05c: invokevirtual java/util/concurrent/TimeUnit.toMillis (J)J
      // 05f: lstore 7
      // 061: aload 0
      // 062: getfield com/discord/media/engine/video/egl_renderer/EglRenderer.framesReceived I
      // 065: istore 3
      // 066: aload 0
      // 067: getfield com/discord/media/engine/video/egl_renderer/EglRenderer.framesDropped I
      // 06a: istore 2
      // 06b: aload 0
      // 06c: getfield com/discord/media/engine/video/egl_renderer/EglRenderer.framesRendered I
      // 06f: istore 4
      // 071: aload 10
      // 073: fload 1
      // 074: f2d
      // 075: invokevirtual java/text/NumberFormat.format (D)Ljava/lang/String;
      // 078: astore 10
      // 07a: getstatic com/discord/media/engine/video/egl_renderer/EglRenderer.Companion Lcom/discord/media/engine/video/egl_renderer/EglRenderer$Companion;
      // 07d: astore 12
      // 07f: aload 12
      // 081: aload 0
      // 082: getfield com/discord/media/engine/video/egl_renderer/EglRenderer.renderTimeNs J
      // 085: aload 0
      // 086: getfield com/discord/media/engine/video/egl_renderer/EglRenderer.framesRendered I
      // 089: invokestatic com/discord/media/engine/video/egl_renderer/EglRenderer$Companion.access$averageTimeAsString (Lcom/discord/media/engine/video/egl_renderer/EglRenderer$Companion;JI)Ljava/lang/String;
      // 08c: astore 11
      // 08e: aload 12
      // 090: aload 0
      // 091: getfield com/discord/media/engine/video/egl_renderer/EglRenderer.renderSwapBufferTimeNs J
      // 094: aload 0
      // 095: getfield com/discord/media/engine/video/egl_renderer/EglRenderer.framesRendered I
      // 098: invokestatic com/discord/media/engine/video/egl_renderer/EglRenderer$Companion.access$averageTimeAsString (Lcom/discord/media/engine/video/egl_renderer/EglRenderer$Companion;JI)Ljava/lang/String;
      // 09b: astore 13
      // 09d: new java/lang/StringBuilder
      // 0a0: astore 12
      // 0a2: aload 12
      // 0a4: invokespecial java/lang/StringBuilder.<init> ()V
      // 0a7: aload 12
      // 0a9: ldc_w "[logStatistics] Duration: "
      // 0ac: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0af: pop
      // 0b0: aload 12
      // 0b2: lload 7
      // 0b4: invokevirtual java/lang/StringBuilder.append (J)Ljava/lang/StringBuilder;
      // 0b7: pop
      // 0b8: aload 12
      // 0ba: ldc_w " ms. Frames received: "
      // 0bd: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0c0: pop
      // 0c1: aload 12
      // 0c3: iload 3
      // 0c4: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 0c7: pop
      // 0c8: aload 12
      // 0ca: ldc_w ". Dropped: "
      // 0cd: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0d0: pop
      // 0d1: aload 12
      // 0d3: iload 2
      // 0d4: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 0d7: pop
      // 0d8: aload 12
      // 0da: ldc_w ". Rendered: "
      // 0dd: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0e0: pop
      // 0e1: aload 12
      // 0e3: iload 4
      // 0e5: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 0e8: pop
      // 0e9: aload 12
      // 0eb: ldc_w ". Render fps: "
      // 0ee: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0f1: pop
      // 0f2: aload 12
      // 0f4: aload 10
      // 0f6: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0f9: pop
      // 0fa: aload 12
      // 0fc: ldc_w ". Average render time: "
      // 0ff: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 102: pop
      // 103: aload 12
      // 105: aload 11
      // 107: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 10a: pop
      // 10b: aload 12
      // 10d: ldc_w ". Average swapBuffer time: "
      // 110: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 113: pop
      // 114: aload 12
      // 116: aload 13
      // 118: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 11b: pop
      // 11c: aload 12
      // 11e: ldc_w "."
      // 121: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 124: pop
      // 125: aload 0
      // 126: aload 12
      // 128: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 12b: invokespecial com/discord/media/engine/video/egl_renderer/EglRenderer.logD (Ljava/lang/String;)V
      // 12e: aload 0
      // 12f: lload 5
      // 131: invokespecial com/discord/media/engine/video/egl_renderer/EglRenderer.resetStatistics (J)V
      // 134: getstatic kotlin/Unit.a Lkotlin/Unit;
      // 137: astore 10
      // 139: aload 9
      // 13b: monitorexit
      // 13c: return
      // 13d: aload 9
      // 13f: monitorexit
      // 140: return
      // 141: aload 9
      // 143: monitorexit
      // 144: aload 10
      // 146: athrow
   }

   private fun logStatisticsTask(): Runnable {
      return this.logStatisticsRunnable;
   }

   @JvmStatic
   fun `onFrame$lambda$24$lambda$23$lambda$22`(var0: EglRenderer) {
      q.h(var0, "this$0");
      var0.renderFrameOnRenderThread();
   }

   private fun postToRenderThread(runnable: Runnable) {
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
      // 01: getfield com/discord/media/engine/video/egl_renderer/EglRenderer.handlerLock Ljava/lang/Object;
      // 04: astore 2
      // 05: aload 2
      // 06: monitorenter
      // 07: aload 0
      // 08: getfield com/discord/media/engine/video/egl_renderer/EglRenderer.renderThreadHandler Landroid/os/Handler;
      // 0b: astore 3
      // 0c: aload 3
      // 0d: ifnull 1d
      // 10: aload 3
      // 11: aload 1
      // 12: invokevirtual android/os/Handler.post (Ljava/lang/Runnable;)Z
      // 15: pop
      // 16: goto 1d
      // 19: astore 1
      // 1a: goto 20
      // 1d: aload 2
      // 1e: monitorexit
      // 1f: return
      // 20: aload 2
      // 21: monitorexit
      // 22: aload 1
      // 23: athrow
   }

   @JvmStatic
   fun `release$lambda$13$lambda$12`(var0: EglRenderer, var1: Looper) {
      q.h(var0, "this$0");
      q.h(var1, "$renderLooper");
      var0.logD("Quitting render thread.");
      var1.quit();
   }

   @JvmStatic
   fun `releaseEglSurface$lambda$29$lambda$28$lambda$27`(var0: EglRenderer, var1: Function0) {
      q.h(var0, "this$0");
      q.h(var1, "$completionCallback");
      val var2: EglBase = var0.eglBase;
      if (var0.eglBase != null) {
         var0.eglBase.detachCurrent();
         var2.releaseSurface();
      }

      var1.invoke();
   }

   private fun renderFrameOnRenderThread() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      //
      // Bytecode:
      // 000: aload 0
      // 001: getfield com/discord/media/engine/video/egl_renderer/EglRenderer.frameLock Ljava/lang/Object;
      // 004: astore 12
      // 006: aload 12
      // 008: monitorenter
      // 009: aload 0
      // 00a: getfield com/discord/media/engine/video/egl_renderer/EglRenderer.pendingFrame Lorg/webrtc/VideoFrame;
      // 00d: astore 11
      // 00f: aload 11
      // 011: ifnull 1f0
      // 014: aload 0
      // 015: aconst_null
      // 016: putfield com/discord/media/engine/video/egl_renderer/EglRenderer.pendingFrame Lorg/webrtc/VideoFrame;
      // 019: aload 12
      // 01b: monitorexit
      // 01c: aload 0
      // 01d: getfield com/discord/media/engine/video/egl_renderer/EglRenderer.eglBase Lorg/webrtc/EglBase;
      // 020: astore 12
      // 022: aload 12
      // 024: ifnull 1de
      // 027: aload 12
      // 029: invokeinterface org/webrtc/EglBase.hasSurface ()Z 1
      // 02e: ifne 034
      // 031: goto 1de
      // 034: invokestatic java/lang/System.nanoTime ()J
      // 037: lstore 5
      // 039: aload 0
      // 03a: getfield com/discord/media/engine/video/egl_renderer/EglRenderer.fpsReductionLock Ljava/lang/Object;
      // 03d: astore 13
      // 03f: aload 13
      // 041: monitorenter
      // 042: aload 0
      // 043: getfield com/discord/media/engine/video/egl_renderer/EglRenderer.minRenderPeriodNs J
      // 046: lstore 9
      // 048: lload 9
      // 04a: lconst_0
      // 04b: lcmp
      // 04c: ifgt 055
      // 04f: bipush 1
      // 050: istore 4
      // 052: goto 09c
      // 055: bipush 0
      // 056: istore 4
      // 058: lload 9
      // 05a: ldc2_w 9223372036854775807
      // 05d: lcmp
      // 05e: ifne 064
      // 061: goto 09c
      // 064: aload 0
      // 065: getfield com/discord/media/engine/video/egl_renderer/EglRenderer.nextFrameTimeNs J
      // 068: lstore 7
      // 06a: lload 5
      // 06c: lload 7
      // 06e: lcmp
      // 06f: ifge 081
      // 072: aload 0
      // 073: ldc_w "Skipping frame rendering - fps reduction is active."
      // 076: invokespecial com/discord/media/engine/video/egl_renderer/EglRenderer.logD (Ljava/lang/String;)V
      // 079: goto 09c
      // 07c: astore 11
      // 07e: goto 1d8
      // 081: lload 7
      // 083: lload 9
      // 085: ladd
      // 086: lstore 7
      // 088: aload 0
      // 089: lload 7
      // 08b: putfield com/discord/media/engine/video/egl_renderer/EglRenderer.nextFrameTimeNs J
      // 08e: aload 0
      // 08f: lload 7
      // 091: lload 5
      // 093: invokestatic kotlin/ranges/f.d (JJ)J
      // 096: putfield com/discord/media/engine/video/egl_renderer/EglRenderer.nextFrameTimeNs J
      // 099: goto 04f
      // 09c: aload 13
      // 09e: monitorexit
      // 09f: aload 11
      // 0a1: invokestatic com/discord/media/engine/video/egl_renderer/WebRtcExtensionsKt.getRotatedAspectRatio (Lorg/webrtc/VideoFrame;)F
      // 0a4: fstore 2
      // 0a5: aload 0
      // 0a6: getfield com/discord/media/engine/video/egl_renderer/EglRenderer.layoutLock Ljava/lang/Object;
      // 0a9: astore 13
      // 0ab: aload 13
      // 0ad: monitorenter
      // 0ae: aload 0
      // 0af: getfield com/discord/media/engine/video/egl_renderer/EglRenderer.layoutAspectRatio F
      // 0b2: fstore 3
      // 0b3: fload 3
      // 0b4: fstore 1
      // 0b5: fload 3
      // 0b6: fconst_0
      // 0b7: fcmpg
      // 0b8: ifne 0bd
      // 0bb: fload 2
      // 0bc: fstore 1
      // 0bd: aload 13
      // 0bf: monitorexit
      // 0c0: fconst_1
      // 0c1: fstore 3
      // 0c2: fload 2
      // 0c3: fload 1
      // 0c4: fcmpl
      // 0c5: ifle 0d1
      // 0c8: fload 1
      // 0c9: fload 2
      // 0ca: fdiv
      // 0cb: fstore 1
      // 0cc: fconst_1
      // 0cd: fstore 2
      // 0ce: goto 0d7
      // 0d1: fload 2
      // 0d2: fload 1
      // 0d3: fdiv
      // 0d4: fstore 2
      // 0d5: fload 3
      // 0d6: fstore 1
      // 0d7: aload 0
      // 0d8: getfield com/discord/media/engine/video/egl_renderer/EglRenderer.drawMatrix Landroid/graphics/Matrix;
      // 0db: invokevirtual android/graphics/Matrix.reset ()V
      // 0de: aload 0
      // 0df: getfield com/discord/media/engine/video/egl_renderer/EglRenderer.drawMatrix Landroid/graphics/Matrix;
      // 0e2: ldc_w 0.5
      // 0e5: ldc_w 0.5
      // 0e8: invokevirtual android/graphics/Matrix.preTranslate (FF)Z
      // 0eb: pop
      // 0ec: aload 0
      // 0ed: getfield com/discord/media/engine/video/egl_renderer/EglRenderer.drawMatrix Landroid/graphics/Matrix;
      // 0f0: fload 1
      // 0f1: fload 2
      // 0f2: invokevirtual android/graphics/Matrix.preScale (FF)Z
      // 0f5: pop
      // 0f6: aload 0
      // 0f7: getfield com/discord/media/engine/video/egl_renderer/EglRenderer.drawMatrix Landroid/graphics/Matrix;
      // 0fa: ldc_w -0.5
      // 0fd: ldc_w -0.5
      // 100: invokevirtual android/graphics/Matrix.preTranslate (FF)Z
      // 103: pop
      // 104: iload 4
      // 106: ifeq 1bf
      // 109: fconst_0
      // 10a: fconst_0
      // 10b: fconst_0
      // 10c: fconst_0
      // 10d: invokestatic android/opengl/GLES20.glClearColor (FFFF)V
      // 110: sipush 16384
      // 113: invokestatic android/opengl/GLES20.glClear (I)V
      // 116: aload 0
      // 117: getfield com/discord/media/engine/video/egl_renderer/EglRenderer.frameDrawer Lorg/webrtc/VideoFrameDrawer;
      // 11a: aload 11
      // 11c: aload 0
      // 11d: getfield com/discord/media/engine/video/egl_renderer/EglRenderer.drawer Lorg/webrtc/RendererCommon$GlDrawer;
      // 120: aload 0
      // 121: getfield com/discord/media/engine/video/egl_renderer/EglRenderer.drawMatrix Landroid/graphics/Matrix;
      // 124: bipush 0
      // 125: bipush 0
      // 126: aload 12
      // 128: invokeinterface org/webrtc/EglBase.surfaceWidth ()I 1
      // 12d: aload 12
      // 12f: invokeinterface org/webrtc/EglBase.surfaceHeight ()I 1
      // 134: invokevirtual org/webrtc/VideoFrameDrawer.drawFrame (Lorg/webrtc/VideoFrame;Lorg/webrtc/RendererCommon$GlDrawer;Landroid/graphics/Matrix;IIII)V
      // 137: invokestatic java/lang/System.nanoTime ()J
      // 13a: lstore 7
      // 13c: aload 12
      // 13e: invokeinterface org/webrtc/EglBase.swapBuffers ()V 1
      // 143: invokestatic java/lang/System.nanoTime ()J
      // 146: lstore 9
      // 148: aload 0
      // 149: getfield com/discord/media/engine/video/egl_renderer/EglRenderer.statisticsLock Ljava/lang/Object;
      // 14c: astore 12
      // 14e: aload 12
      // 150: monitorenter
      // 151: aload 0
      // 152: aload 0
      // 153: getfield com/discord/media/engine/video/egl_renderer/EglRenderer.framesRendered I
      // 156: bipush 1
      // 157: iadd
      // 158: putfield com/discord/media/engine/video/egl_renderer/EglRenderer.framesRendered I
      // 15b: aload 0
      // 15c: aload 0
      // 15d: getfield com/discord/media/engine/video/egl_renderer/EglRenderer.renderTimeNs J
      // 160: lload 9
      // 162: lload 5
      // 164: lsub
      // 165: ladd
      // 166: putfield com/discord/media/engine/video/egl_renderer/EglRenderer.renderTimeNs J
      // 169: aload 0
      // 16a: aload 0
      // 16b: getfield com/discord/media/engine/video/egl_renderer/EglRenderer.renderSwapBufferTimeNs J
      // 16e: lload 9
      // 170: lload 7
      // 172: lsub
      // 173: ladd
      // 174: putfield com/discord/media/engine/video/egl_renderer/EglRenderer.renderSwapBufferTimeNs J
      // 177: getstatic kotlin/Unit.a Lkotlin/Unit;
      // 17a: astore 13
      // 17c: aload 12
      // 17e: monitorexit
      // 17f: goto 1bf
      // 182: astore 12
      // 184: goto 1c7
      // 187: astore 12
      // 189: goto 194
      // 18c: astore 13
      // 18e: aload 12
      // 190: monitorexit
      // 191: aload 13
      // 193: athrow
      // 194: aload 0
      // 195: ldc_w "Error while drawing frame"
      // 198: aload 12
      // 19a: invokespecial com/discord/media/engine/video/egl_renderer/EglRenderer.logE (Ljava/lang/String;Ljava/lang/Throwable;)V
      // 19d: aload 0
      // 19e: getfield com/discord/media/engine/video/egl_renderer/EglRenderer.errorCallback Lcom/discord/media/engine/video/egl_renderer/ErrorCallback;
      // 1a1: astore 12
      // 1a3: aload 12
      // 1a5: ifnull 1af
      // 1a8: aload 12
      // 1aa: invokeinterface com/discord/media/engine/video/egl_renderer/ErrorCallback.onGlOutOfMemory ()V 1
      // 1af: aload 0
      // 1b0: getfield com/discord/media/engine/video/egl_renderer/EglRenderer.drawer Lorg/webrtc/RendererCommon$GlDrawer;
      // 1b3: invokeinterface org/webrtc/RendererCommon$GlDrawer.release ()V 1
      // 1b8: aload 0
      // 1b9: getfield com/discord/media/engine/video/egl_renderer/EglRenderer.frameDrawer Lorg/webrtc/VideoFrameDrawer;
      // 1bc: invokevirtual org/webrtc/VideoFrameDrawer.release ()V
      // 1bf: aload 11
      // 1c1: invokevirtual org/webrtc/VideoFrame.release ()V
      // 1c4: goto 1cf
      // 1c7: aload 11
      // 1c9: invokevirtual org/webrtc/VideoFrame.release ()V
      // 1cc: aload 12
      // 1ce: athrow
      // 1cf: return
      // 1d0: astore 11
      // 1d2: aload 13
      // 1d4: monitorexit
      // 1d5: aload 11
      // 1d7: athrow
      // 1d8: aload 13
      // 1da: monitorexit
      // 1db: aload 11
      // 1dd: athrow
      // 1de: aload 0
      // 1df: ldc_w "Dropping frame - No surface"
      // 1e2: invokespecial com/discord/media/engine/video/egl_renderer/EglRenderer.logD (Ljava/lang/String;)V
      // 1e5: aload 11
      // 1e7: invokevirtual org/webrtc/VideoFrame.release ()V
      // 1ea: return
      // 1eb: astore 11
      // 1ed: goto 1f4
      // 1f0: aload 12
      // 1f2: monitorexit
      // 1f3: return
      // 1f4: aload 12
      // 1f6: monitorexit
      // 1f7: aload 11
      // 1f9: athrow
   }

   private fun resetStatistics(currentTimeNs: Long = System.nanoTime()) {
      label13: {
         val var3: Any = this.statisticsLock;
         synchronized (this.statisticsLock){} // $VF: monitorenter 

         try {
            this.statisticsStartTimeNs = var1;
            this.framesReceived = 0;
            this.framesDropped = 0;
            this.framesRendered = 0;
            this.renderTimeNs = 0L;
            this.renderSwapBufferTimeNs = 0L;
         } catch (var5: java.lang.Throwable) {
            // $VF: monitorexit
         }

         // $VF: monitorexit
      }
   }

   public fun createEglSurface(surfaceTexture: SurfaceTexture) {
      q.h(var1, "surfaceTexture");
      this.createEglSurfaceInternal(var1);
   }

   public fun createEglSurface(surface: Surface) {
      q.h(var1, "surface");
      this.createEglSurfaceInternal(var1);
   }

   public fun disableFpsReduction() {
      this.setFpsReduction(java.lang.Float.POSITIVE_INFINITY);
   }

   public fun init() {
      val var1: Long = System.nanoTime();
      val var3: Any = this.handlerLock;
      synchronized (this.handlerLock) {
         if (this.renderThreadHandler != null) {
            val var14: java.lang.String = this.name;
            val var9: StringBuilder = new StringBuilder();
            var9.append(var14);
            var9.append(": already initialized");
            throw new IllegalStateException(var9.toString().toString());
         }

         this.logD("Initializing EglRenderer");
         val var4: java.lang.String = this.name;
         val var6: StringBuilder = new StringBuilder();
         var6.append(var4);
         var6.append("EglRenderer");
         val var5: HandlerThread = new HandlerThread(var6.toString());
         var5.start();
         val var16: Looper = var5.getLooper();
         q.g(var16, "getLooper(...)");
         val var8: HandlerWithExceptionCallback = new HandlerWithExceptionCallback(var16, new Function1(this) {
            final EglRenderer this$0;

            {
               super(1);
               this.this$0 = var1;
            }

            public final void invoke(Exception var1) {
               label13: {
                  q.h(var1, "ex");
                  Logging.e("EglRenderer", "Exception on EglRenderer thread", var1);
                  val var5: Any = EglRenderer.access$getHandlerLock$p(this.this$0);
                  val var2: EglRenderer = this.this$0;
                  synchronized (var5){} // $VF: monitorenter 

                  try {
                     EglRenderer.access$setRenderThreadHandler$p(var2, null);
                  } catch (var3: java.lang.Throwable) {
                     // $VF: monitorexit
                  }

                  // $VF: monitorexit
               }
            }
         });
         this.renderThreadHandler = var8;
         val var12: Debug = Debug.INSTANCE;
         ThreadUtils.invokeAtFrontUninterruptibly(var8, new c(this, var1));
         var8.post(this.eglSurfaceCreationRunnable);
         resetStatistics$default(this, 0L, 1, null);
         var8.postDelayed(this.logStatisticsRunnable, 4000L);
      }

      // $VF: monitorexit
   }

   public open fun onFrame(frame: VideoFrame) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.createStatement(DomHelper.java:27)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:156)
      //
      // Bytecode:
      // 00: aload 1
      // 01: ldc_w "frame"
      // 04: invokestatic kotlin/jvm/internal/q.h (Ljava/lang/Object;Ljava/lang/String;)V
      // 07: aload 0
      // 08: getfield com/discord/media/engine/video/egl_renderer/EglRenderer.statisticsLock Ljava/lang/Object;
      // 0b: astore 3
      // 0c: aload 3
      // 0d: monitorenter
      // 0e: aload 0
      // 0f: aload 0
      // 10: getfield com/discord/media/engine/video/egl_renderer/EglRenderer.framesReceived I
      // 13: bipush 1
      // 14: iadd
      // 15: putfield com/discord/media/engine/video/egl_renderer/EglRenderer.framesReceived I
      // 18: aload 3
      // 19: monitorexit
      // 1a: aload 0
      // 1b: getfield com/discord/media/engine/video/egl_renderer/EglRenderer.handlerLock Ljava/lang/Object;
      // 1e: astore 3
      // 1f: aload 3
      // 20: monitorenter
      // 21: aload 0
      // 22: getfield com/discord/media/engine/video/egl_renderer/EglRenderer.renderThreadHandler Landroid/os/Handler;
      // 25: astore 5
      // 27: aload 5
      // 29: ifnonnull 3a
      // 2c: aload 0
      // 2d: ldc_w "Dropping frame - Not initialized or already released."
      // 30: invokespecial com/discord/media/engine/video/egl_renderer/EglRenderer.logD (Ljava/lang/String;)V
      // 33: aload 3
      // 34: monitorexit
      // 35: return
      // 36: astore 1
      // 37: goto a1
      // 3a: aload 0
      // 3b: getfield com/discord/media/engine/video/egl_renderer/EglRenderer.frameLock Ljava/lang/Object;
      // 3e: astore 4
      // 40: aload 4
      // 42: monitorenter
      // 43: aload 0
      // 44: getfield com/discord/media/engine/video/egl_renderer/EglRenderer.pendingFrame Lorg/webrtc/VideoFrame;
      // 47: astore 6
      // 49: aload 6
      // 4b: ifnull 5c
      // 4e: aload 6
      // 50: invokevirtual org/webrtc/VideoFrame.release ()V
      // 53: bipush 1
      // 54: istore 2
      // 55: goto 5e
      // 58: astore 1
      // 59: goto 9c
      // 5c: bipush 0
      // 5d: istore 2
      // 5e: aload 1
      // 5f: invokevirtual org/webrtc/VideoFrame.retain ()V
      // 62: aload 0
      // 63: aload 1
      // 64: putfield com/discord/media/engine/video/egl_renderer/EglRenderer.pendingFrame Lorg/webrtc/VideoFrame;
      // 67: new com/discord/media/engine/video/egl_renderer/e
      // 6a: astore 1
      // 6b: aload 1
      // 6c: aload 0
      // 6d: invokespecial com/discord/media/engine/video/egl_renderer/e.<init> (Lcom/discord/media/engine/video/egl_renderer/EglRenderer;)V
      // 70: aload 5
      // 72: aload 1
      // 73: invokevirtual android/os/Handler.post (Ljava/lang/Runnable;)Z
      // 76: pop
      // 77: aload 4
      // 79: monitorexit
      // 7a: aload 3
      // 7b: monitorexit
      // 7c: iload 2
      // 7d: ifeq 9b
      // 80: aload 0
      // 81: getfield com/discord/media/engine/video/egl_renderer/EglRenderer.statisticsLock Ljava/lang/Object;
      // 84: astore 1
      // 85: aload 1
      // 86: monitorenter
      // 87: aload 0
      // 88: aload 0
      // 89: getfield com/discord/media/engine/video/egl_renderer/EglRenderer.framesDropped I
      // 8c: bipush 1
      // 8d: iadd
      // 8e: putfield com/discord/media/engine/video/egl_renderer/EglRenderer.framesDropped I
      // 91: aload 1
      // 92: monitorexit
      // 93: goto 9b
      // 96: astore 3
      // 97: aload 1
      // 98: monitorexit
      // 99: aload 3
      // 9a: athrow
      // 9b: return
      // 9c: aload 4
      // 9e: monitorexit
      // 9f: aload 1
      // a0: athrow
      // a1: aload 3
      // a2: monitorexit
      // a3: aload 1
      // a4: athrow
      // a5: astore 1
      // a6: aload 3
      // a7: monitorexit
      // a8: aload 1
      // a9: athrow
   }

   public fun pauseVideo() {
      this.setFpsReduction(0.0F);
   }

   public fun release() {
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
      // 01: ldc_w "Releasing."
      // 04: invokespecial com/discord/media/engine/video/egl_renderer/EglRenderer.logD (Ljava/lang/String;)V
      // 07: invokestatic java/lang/System.nanoTime ()J
      // 0a: lstore 1
      // 0b: new java/util/concurrent/CountDownLatch
      // 0e: dup
      // 0f: bipush 1
      // 10: invokespecial java/util/concurrent/CountDownLatch.<init> (I)V
      // 13: astore 4
      // 15: aload 0
      // 16: getfield com/discord/media/engine/video/egl_renderer/EglRenderer.handlerLock Ljava/lang/Object;
      // 19: astore 3
      // 1a: aload 3
      // 1b: monitorenter
      // 1c: aload 0
      // 1d: getfield com/discord/media/engine/video/egl_renderer/EglRenderer.renderThreadHandler Landroid/os/Handler;
      // 20: astore 5
      // 22: aload 5
      // 24: ifnonnull 36
      // 27: aload 0
      // 28: ldc_w "Already released"
      // 2b: invokespecial com/discord/media/engine/video/egl_renderer/EglRenderer.logD (Ljava/lang/String;)V
      // 2e: aload 3
      // 2f: monitorexit
      // 30: return
      // 31: astore 4
      // 33: goto e7
      // 36: aload 5
      // 38: aload 0
      // 39: getfield com/discord/media/engine/video/egl_renderer/EglRenderer.logStatisticsRunnable Ljava/lang/Runnable;
      // 3c: invokevirtual android/os/Handler.removeCallbacks (Ljava/lang/Runnable;)V
      // 3f: new com/discord/media/engine/video/egl_renderer/a
      // 42: astore 6
      // 44: aload 6
      // 46: aload 0
      // 47: aload 4
      // 49: invokespecial com/discord/media/engine/video/egl_renderer/a.<init> (Lcom/discord/media/engine/video/egl_renderer/EglRenderer;Ljava/util/concurrent/CountDownLatch;)V
      // 4c: aload 5
      // 4e: aload 6
      // 50: invokevirtual android/os/Handler.postAtFrontOfQueue (Ljava/lang/Runnable;)Z
      // 53: pop
      // 54: aload 5
      // 56: invokevirtual android/os/Handler.getLooper ()Landroid/os/Looper;
      // 59: astore 6
      // 5b: aload 6
      // 5d: ldc_w "getLooper(...)"
      // 60: invokestatic kotlin/jvm/internal/q.g (Ljava/lang/Object;Ljava/lang/String;)V
      // 63: new com/discord/media/engine/video/egl_renderer/b
      // 66: astore 7
      // 68: aload 7
      // 6a: aload 0
      // 6b: aload 6
      // 6d: invokespecial com/discord/media/engine/video/egl_renderer/b.<init> (Lcom/discord/media/engine/video/egl_renderer/EglRenderer;Landroid/os/Looper;)V
      // 70: aload 5
      // 72: aload 7
      // 74: invokevirtual android/os/Handler.post (Ljava/lang/Runnable;)Z
      // 77: pop
      // 78: aload 0
      // 79: aconst_null
      // 7a: putfield com/discord/media/engine/video/egl_renderer/EglRenderer.renderThreadHandler Landroid/os/Handler;
      // 7d: getstatic kotlin/Unit.a Lkotlin/Unit;
      // 80: astore 5
      // 82: aload 3
      // 83: monitorexit
      // 84: aload 4
      // 86: invokestatic org/webrtc/ThreadUtils.awaitUninterruptibly (Ljava/util/concurrent/CountDownLatch;)V
      // 89: aload 0
      // 8a: getfield com/discord/media/engine/video/egl_renderer/EglRenderer.frameLock Ljava/lang/Object;
      // 8d: astore 3
      // 8e: aload 3
      // 8f: monitorenter
      // 90: aload 0
      // 91: getfield com/discord/media/engine/video/egl_renderer/EglRenderer.pendingFrame Lorg/webrtc/VideoFrame;
      // 94: astore 4
      // 96: aload 4
      // 98: ifnull a8
      // 9b: aload 4
      // 9d: invokevirtual org/webrtc/VideoFrame.release ()V
      // a0: goto a8
      // a3: astore 4
      // a5: goto e2
      // a8: aload 0
      // a9: aconst_null
      // aa: putfield com/discord/media/engine/video/egl_renderer/EglRenderer.pendingFrame Lorg/webrtc/VideoFrame;
      // ad: aload 3
      // ae: monitorexit
      // af: getstatic java/util/concurrent/TimeUnit.NANOSECONDS Ljava/util/concurrent/TimeUnit;
      // b2: invokestatic java/lang/System.nanoTime ()J
      // b5: lload 1
      // b6: lsub
      // b7: invokevirtual java/util/concurrent/TimeUnit.toMillis (J)J
      // ba: lstore 1
      // bb: new java/lang/StringBuilder
      // be: dup
      // bf: invokespecial java/lang/StringBuilder.<init> ()V
      // c2: astore 3
      // c3: aload 3
      // c4: ldc_w "release done: "
      // c7: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // ca: pop
      // cb: aload 3
      // cc: lload 1
      // cd: invokevirtual java/lang/StringBuilder.append (J)Ljava/lang/StringBuilder;
      // d0: pop
      // d1: aload 3
      // d2: ldc_w " ms"
      // d5: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // d8: pop
      // d9: aload 0
      // da: aload 3
      // db: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // de: invokespecial com/discord/media/engine/video/egl_renderer/EglRenderer.logD (Ljava/lang/String;)V
      // e1: return
      // e2: aload 3
      // e3: monitorexit
      // e4: aload 4
      // e6: athrow
      // e7: aload 3
      // e8: monitorexit
      // e9: aload 4
      // eb: athrow
   }

   public fun releaseEglSurface(completionCallback: () -> Unit) {
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
      // 00: aload 1
      // 01: ldc_w "completionCallback"
      // 04: invokestatic kotlin/jvm/internal/q.h (Ljava/lang/Object;Ljava/lang/String;)V
      // 07: aload 0
      // 08: getfield com/discord/media/engine/video/egl_renderer/EglRenderer.eglSurfaceCreationRunnable Lcom/discord/media/engine/video/egl_renderer/EglRenderer$EglSurfaceCreation;
      // 0b: aconst_null
      // 0c: invokevirtual com/discord/media/engine/video/egl_renderer/EglRenderer$EglSurfaceCreation.setSurface (Ljava/lang/Object;)V
      // 0f: aload 0
      // 10: getfield com/discord/media/engine/video/egl_renderer/EglRenderer.handlerLock Ljava/lang/Object;
      // 13: astore 2
      // 14: aload 2
      // 15: monitorenter
      // 16: aload 0
      // 17: getfield com/discord/media/engine/video/egl_renderer/EglRenderer.renderThreadHandler Landroid/os/Handler;
      // 1a: astore 3
      // 1b: aload 3
      // 1c: ifnull 41
      // 1f: aload 3
      // 20: aload 0
      // 21: getfield com/discord/media/engine/video/egl_renderer/EglRenderer.eglSurfaceCreationRunnable Lcom/discord/media/engine/video/egl_renderer/EglRenderer$EglSurfaceCreation;
      // 24: invokevirtual android/os/Handler.removeCallbacks (Ljava/lang/Runnable;)V
      // 27: new com/discord/media/engine/video/egl_renderer/d
      // 2a: astore 4
      // 2c: aload 4
      // 2e: aload 0
      // 2f: aload 1
      // 30: invokespecial com/discord/media/engine/video/egl_renderer/d.<init> (Lcom/discord/media/engine/video/egl_renderer/EglRenderer;Lkotlin/jvm/functions/Function0;)V
      // 33: aload 3
      // 34: aload 4
      // 36: invokevirtual android/os/Handler.postAtFrontOfQueue (Ljava/lang/Runnable;)Z
      // 39: pop
      // 3a: aload 2
      // 3b: monitorexit
      // 3c: return
      // 3d: astore 1
      // 3e: goto 4b
      // 41: aload 2
      // 42: monitorexit
      // 43: aload 1
      // 44: invokeinterface kotlin/jvm/functions/Function0.invoke ()Ljava/lang/Object; 1
      // 49: pop
      // 4a: return
      // 4b: aload 2
      // 4c: monitorexit
      // 4d: aload 1
      // 4e: athrow
   }

   public fun setErrorCallback(errorCallback: ErrorCallback?) {
      this.errorCallback = var1;
   }

   public fun setFpsReduction(fps: Float) {
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
      // 00: new java/lang/StringBuilder
      // 03: dup
      // 04: invokespecial java/lang/StringBuilder.<init> ()V
      // 07: astore 6
      // 09: aload 6
      // 0b: ldc_w "setFpsReduction: "
      // 0e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 11: pop
      // 12: aload 6
      // 14: fload 1
      // 15: invokevirtual java/lang/StringBuilder.append (F)Ljava/lang/StringBuilder;
      // 18: pop
      // 19: aload 0
      // 1a: aload 6
      // 1c: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1f: invokespecial com/discord/media/engine/video/egl_renderer/EglRenderer.logD (Ljava/lang/String;)V
      // 22: aload 0
      // 23: getfield com/discord/media/engine/video/egl_renderer/EglRenderer.fpsReductionLock Ljava/lang/Object;
      // 26: astore 6
      // 28: aload 6
      // 2a: monitorenter
      // 2b: aload 0
      // 2c: getfield com/discord/media/engine/video/egl_renderer/EglRenderer.minRenderPeriodNs J
      // 2f: lstore 4
      // 31: fload 1
      // 32: fconst_0
      // 33: fcmpg
      // 34: ifgt 3e
      // 37: ldc2_w 9223372036854775807
      // 3a: lstore 2
      // 3b: goto 4a
      // 3e: getstatic java/util/concurrent/TimeUnit.SECONDS Ljava/util/concurrent/TimeUnit;
      // 41: lconst_1
      // 42: invokevirtual java/util/concurrent/TimeUnit.toNanos (J)J
      // 45: l2f
      // 46: fload 1
      // 47: fdiv
      // 48: f2l
      // 49: lstore 2
      // 4a: aload 0
      // 4b: lload 2
      // 4c: putfield com/discord/media/engine/video/egl_renderer/EglRenderer.minRenderPeriodNs J
      // 4f: lload 2
      // 50: lload 4
      // 52: lcmp
      // 53: ifeq 65
      // 56: aload 0
      // 57: invokestatic java/lang/System.nanoTime ()J
      // 5a: putfield com/discord/media/engine/video/egl_renderer/EglRenderer.nextFrameTimeNs J
      // 5d: goto 65
      // 60: astore 7
      // 62: goto 6e
      // 65: getstatic kotlin/Unit.a Lkotlin/Unit;
      // 68: astore 7
      // 6a: aload 6
      // 6c: monitorexit
      // 6d: return
      // 6e: aload 6
      // 70: monitorexit
      // 71: aload 7
      // 73: athrow
   }

   public fun setLayoutAspectRatio(layoutAspectRatio: Float) {
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
      // 00: new java/lang/StringBuilder
      // 03: dup
      // 04: invokespecial java/lang/StringBuilder.<init> ()V
      // 07: astore 2
      // 08: aload 2
      // 09: ldc_w "setLayoutAspectRatio: "
      // 0c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0f: pop
      // 10: aload 2
      // 11: fload 1
      // 12: invokevirtual java/lang/StringBuilder.append (F)Ljava/lang/StringBuilder;
      // 15: pop
      // 16: aload 0
      // 17: aload 2
      // 18: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1b: invokespecial com/discord/media/engine/video/egl_renderer/EglRenderer.logD (Ljava/lang/String;)V
      // 1e: aload 0
      // 1f: getfield com/discord/media/engine/video/egl_renderer/EglRenderer.layoutLock Ljava/lang/Object;
      // 22: astore 2
      // 23: aload 2
      // 24: monitorenter
      // 25: fload 1
      // 26: invokestatic java/lang/Float.isInfinite (F)Z
      // 29: ifne 3f
      // 2c: fload 1
      // 2d: invokestatic java/lang/Float.isNaN (F)Z
      // 30: ifne 3f
      // 33: aload 0
      // 34: fload 1
      // 35: putfield com/discord/media/engine/video/egl_renderer/EglRenderer.layoutAspectRatio F
      // 38: goto 44
      // 3b: astore 3
      // 3c: goto 4b
      // 3f: aload 0
      // 40: fconst_0
      // 41: putfield com/discord/media/engine/video/egl_renderer/EglRenderer.layoutAspectRatio F
      // 44: getstatic kotlin/Unit.a Lkotlin/Unit;
      // 47: astore 3
      // 48: aload 2
      // 49: monitorexit
      // 4a: return
      // 4b: aload 2
      // 4c: monitorexit
      // 4d: aload 3
      // 4e: athrow
   }

   public companion object {
      private const val LOG_INTERVAL_MS: Long
      private const val TAG: String
      private const val USE_PRESENTATION_TIMESTAMP: Boolean

      private fun averageTimeAsString(sumTimeNs: Long, count: Int): String {
         val var4: java.lang.String;
         if (var3 <= 0) {
            var4 = "NA";
         } else {
            var1 = TimeUnit.NANOSECONDS.toMicros(var1 / (long)var3);
            val var6: StringBuilder = new StringBuilder();
            var6.append(var1);
            var6.append(" us");
            var4 = var6.toString();
         }

         return var4;
      }
   }

   private inner class EglSurfaceCreation : Runnable {
      private final var surface: Any?

      init {
         this.this$0 = var1;
      }

      public override fun run() {
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
         // 03: getfield com/discord/media/engine/video/egl_renderer/EglRenderer$EglSurfaceCreation.surface Ljava/lang/Object;
         // 06: astore 2
         // 07: aload 2
         // 08: ifnonnull 0e
         // 0b: aload 0
         // 0c: monitorexit
         // 0d: return
         // 0e: aload 0
         // 0f: getfield com/discord/media/engine/video/egl_renderer/EglRenderer$EglSurfaceCreation.this$0 Lcom/discord/media/engine/video/egl_renderer/EglRenderer;
         // 12: invokestatic com/discord/media/engine/video/egl_renderer/EglRenderer.access$getEglBase$p (Lcom/discord/media/engine/video/egl_renderer/EglRenderer;)Lorg/webrtc/EglBase;
         // 15: astore 3
         // 16: aload 3
         // 17: ifnonnull 1d
         // 1a: aload 0
         // 1b: monitorexit
         // 1c: return
         // 1d: aload 3
         // 1e: invokeinterface org/webrtc/EglBase.hasSurface ()Z 1
         // 23: istore 1
         // 24: iload 1
         // 25: ifeq 2b
         // 28: aload 0
         // 29: monitorexit
         // 2a: return
         // 2b: aload 2
         // 2c: instanceof android/view/Surface
         // 2f: ifeq 43
         // 32: aload 3
         // 33: aload 2
         // 34: checkcast android/view/Surface
         // 37: invokeinterface org/webrtc/EglBase.createSurface (Landroid/view/Surface;)V 2
         // 3c: goto 54
         // 3f: astore 2
         // 40: goto 8f
         // 43: aload 2
         // 44: instanceof android/graphics/SurfaceTexture
         // 47: ifeq 64
         // 4a: aload 3
         // 4b: aload 2
         // 4c: checkcast android/graphics/SurfaceTexture
         // 4f: invokeinterface org/webrtc/EglBase.createSurface (Landroid/graphics/SurfaceTexture;)V 2
         // 54: aload 3
         // 55: invokeinterface org/webrtc/EglBase.makeCurrent ()V 1
         // 5a: sipush 3317
         // 5d: bipush 1
         // 5e: invokestatic android/opengl/GLES20.glPixelStorei (II)V
         // 61: aload 0
         // 62: monitorexit
         // 63: return
         // 64: new java/lang/IllegalStateException
         // 67: astore 3
         // 68: new java/lang/StringBuilder
         // 6b: astore 4
         // 6d: aload 4
         // 6f: invokespecial java/lang/StringBuilder.<init> ()V
         // 72: aload 4
         // 74: ldc "Invalid surface: "
         // 76: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
         // 79: pop
         // 7a: aload 4
         // 7c: aload 2
         // 7d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
         // 80: pop
         // 81: aload 3
         // 82: aload 4
         // 84: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
         // 87: invokevirtual java/lang/Object.toString ()Ljava/lang/String;
         // 8a: invokespecial java/lang/IllegalStateException.<init> (Ljava/lang/String;)V
         // 8d: aload 3
         // 8e: athrow
         // 8f: aload 0
         // 90: monitorexit
         // 91: aload 2
         // 92: athrow
      }

      public fun setSurface(surface: Any?) {
         label13: {
            synchronized (this){} // $VF: monitorenter 

            try {
               this.surface = var1;
            } catch (var2: java.lang.Throwable) {
               // $VF: monitorexit
            }

            // $VF: monitorexit
         }
      }
   }
}

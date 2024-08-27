package com.discord.media.engine.video.egl_renderer

import android.graphics.Matrix
import android.graphics.SurfaceTexture
import android.os.Handler
import android.os.Looper
import android.view.Surface
import co.discord.media_engine.SharedEglBaseContext
import com.discord.media.engine.types.Debug
import java.util.concurrent.CountDownLatch
import java.util.concurrent.TimeUnit
import kotlin.jvm.functions.Function0
import kotlin.jvm.internal.r
import org.webrtc.EglBase
import org.webrtc.EglHelper
import org.webrtc.GlRectDrawer
import org.webrtc.Logging
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
      r.h(var1, "name");
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
      r.h(var0, "this$0");
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
      // 027: ifle 138
      // 02a: aload 0
      // 02b: getfield com/discord/media/engine/video/egl_renderer/EglRenderer.minRenderPeriodNs J
      // 02e: ldc2_w 9223372036854775807
      // 031: lcmp
      // 032: ifne 03f
      // 035: aload 0
      // 036: getfield com/discord/media/engine/video/egl_renderer/EglRenderer.framesReceived I
      // 039: ifne 03f
      // 03c: goto 138
      // 03f: aload 0
      // 040: getfield com/discord/media/engine/video/egl_renderer/EglRenderer.framesRendered I
      // 043: i2l
      // 044: getstatic java/util/concurrent/TimeUnit.SECONDS Ljava/util/concurrent/TimeUnit;
      // 047: lconst_1
      // 048: invokevirtual java/util/concurrent/TimeUnit.toNanos (J)J
      // 04b: lmul
      // 04c: l2f
      // 04d: lload 7
      // 04f: l2f
      // 050: fdiv
      // 051: fstore 1
      // 052: getstatic java/util/concurrent/TimeUnit.NANOSECONDS Ljava/util/concurrent/TimeUnit;
      // 055: lload 7
      // 057: invokevirtual java/util/concurrent/TimeUnit.toMillis (J)J
      // 05a: lstore 7
      // 05c: aload 0
      // 05d: getfield com/discord/media/engine/video/egl_renderer/EglRenderer.framesReceived I
      // 060: istore 2
      // 061: aload 0
      // 062: getfield com/discord/media/engine/video/egl_renderer/EglRenderer.framesDropped I
      // 065: istore 4
      // 067: aload 0
      // 068: getfield com/discord/media/engine/video/egl_renderer/EglRenderer.framesRendered I
      // 06b: istore 3
      // 06c: aload 10
      // 06e: fload 1
      // 06f: f2d
      // 070: invokevirtual java/text/NumberFormat.format (D)Ljava/lang/String;
      // 073: astore 11
      // 075: getstatic com/discord/media/engine/video/egl_renderer/EglRenderer.Companion Lcom/discord/media/engine/video/egl_renderer/EglRenderer$Companion;
      // 078: astore 12
      // 07a: aload 12
      // 07c: aload 0
      // 07d: getfield com/discord/media/engine/video/egl_renderer/EglRenderer.renderTimeNs J
      // 080: aload 0
      // 081: getfield com/discord/media/engine/video/egl_renderer/EglRenderer.framesRendered I
      // 084: invokestatic com/discord/media/engine/video/egl_renderer/EglRenderer$Companion.access$averageTimeAsString (Lcom/discord/media/engine/video/egl_renderer/EglRenderer$Companion;JI)Ljava/lang/String;
      // 087: astore 10
      // 089: aload 12
      // 08b: aload 0
      // 08c: getfield com/discord/media/engine/video/egl_renderer/EglRenderer.renderSwapBufferTimeNs J
      // 08f: aload 0
      // 090: getfield com/discord/media/engine/video/egl_renderer/EglRenderer.framesRendered I
      // 093: invokestatic com/discord/media/engine/video/egl_renderer/EglRenderer$Companion.access$averageTimeAsString (Lcom/discord/media/engine/video/egl_renderer/EglRenderer$Companion;JI)Ljava/lang/String;
      // 096: astore 12
      // 098: new java/lang/StringBuilder
      // 09b: astore 13
      // 09d: aload 13
      // 09f: invokespecial java/lang/StringBuilder.<init> ()V
      // 0a2: aload 13
      // 0a4: ldc_w "[logStatistics] Duration: "
      // 0a7: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0aa: pop
      // 0ab: aload 13
      // 0ad: lload 7
      // 0af: invokevirtual java/lang/StringBuilder.append (J)Ljava/lang/StringBuilder;
      // 0b2: pop
      // 0b3: aload 13
      // 0b5: ldc_w " ms. Frames received: "
      // 0b8: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0bb: pop
      // 0bc: aload 13
      // 0be: iload 2
      // 0bf: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 0c2: pop
      // 0c3: aload 13
      // 0c5: ldc_w ". Dropped: "
      // 0c8: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0cb: pop
      // 0cc: aload 13
      // 0ce: iload 4
      // 0d0: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 0d3: pop
      // 0d4: aload 13
      // 0d6: ldc_w ". Rendered: "
      // 0d9: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0dc: pop
      // 0dd: aload 13
      // 0df: iload 3
      // 0e0: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 0e3: pop
      // 0e4: aload 13
      // 0e6: ldc_w ". Render fps: "
      // 0e9: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0ec: pop
      // 0ed: aload 13
      // 0ef: aload 11
      // 0f1: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0f4: pop
      // 0f5: aload 13
      // 0f7: ldc_w ". Average render time: "
      // 0fa: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0fd: pop
      // 0fe: aload 13
      // 100: aload 10
      // 102: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 105: pop
      // 106: aload 13
      // 108: ldc_w ". Average swapBuffer time: "
      // 10b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 10e: pop
      // 10f: aload 13
      // 111: aload 12
      // 113: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 116: pop
      // 117: aload 13
      // 119: ldc_w "."
      // 11c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 11f: pop
      // 120: aload 0
      // 121: aload 13
      // 123: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 126: invokespecial com/discord/media/engine/video/egl_renderer/EglRenderer.logD (Ljava/lang/String;)V
      // 129: aload 0
      // 12a: lload 5
      // 12c: invokespecial com/discord/media/engine/video/egl_renderer/EglRenderer.resetStatistics (J)V
      // 12f: getstatic kotlin/Unit.a Lkotlin/Unit;
      // 132: astore 10
      // 134: aload 9
      // 136: monitorexit
      // 137: return
      // 138: aload 9
      // 13a: monitorexit
      // 13b: return
      // 13c: astore 10
      // 13e: aload 9
      // 140: monitorexit
      // 141: aload 10
      // 143: athrow
   }

   private fun logStatisticsTask(): Runnable {
      return this.logStatisticsRunnable;
   }

   @JvmStatic
   fun `onFrame$lambda$24$lambda$23$lambda$22`(var0: EglRenderer) {
      r.h(var0, "this$0");
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
      // 0d: ifnull 16
      // 10: aload 3
      // 11: aload 1
      // 12: invokevirtual android/os/Handler.post (Ljava/lang/Runnable;)Z
      // 15: pop
      // 16: aload 2
      // 17: monitorexit
      // 18: return
      // 19: astore 1
      // 1a: aload 2
      // 1b: monitorexit
      // 1c: aload 1
      // 1d: athrow
   }

   @JvmStatic
   fun `release$lambda$13$lambda$12`(var0: EglRenderer, var1: Looper) {
      r.h(var0, "this$0");
      r.h(var1, "$renderLooper");
      var0.logD("Quitting render thread.");
      var1.quit();
   }

   @JvmStatic
   fun `releaseEglSurface$lambda$29$lambda$28$lambda$27`(var0: EglRenderer, var1: Function0) {
      r.h(var0, "this$0");
      r.h(var1, "$completionCallback");
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
      // java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.createStatement(DomHelper.java:27)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:156)
      //
      // Bytecode:
      // 000: aload 0
      // 001: getfield com/discord/media/engine/video/egl_renderer/EglRenderer.frameLock Ljava/lang/Object;
      // 004: astore 13
      // 006: aload 13
      // 008: monitorenter
      // 009: aload 0
      // 00a: getfield com/discord/media/engine/video/egl_renderer/EglRenderer.pendingFrame Lorg/webrtc/VideoFrame;
      // 00d: astore 12
      // 00f: aload 12
      // 011: ifnull 1f1
      // 014: aload 0
      // 015: aconst_null
      // 016: putfield com/discord/media/engine/video/egl_renderer/EglRenderer.pendingFrame Lorg/webrtc/VideoFrame;
      // 019: aload 13
      // 01b: monitorexit
      // 01c: aload 0
      // 01d: getfield com/discord/media/engine/video/egl_renderer/EglRenderer.eglBase Lorg/webrtc/EglBase;
      // 020: astore 14
      // 022: aload 14
      // 024: ifnull 1e4
      // 027: aload 14
      // 029: invokeinterface org/webrtc/EglBase.hasSurface ()Z 1
      // 02e: ifne 034
      // 031: goto 1e4
      // 034: invokestatic java/lang/System.nanoTime ()J
      // 037: lstore 6
      // 039: aload 0
      // 03a: getfield com/discord/media/engine/video/egl_renderer/EglRenderer.fpsReductionLock Ljava/lang/Object;
      // 03d: astore 13
      // 03f: aload 13
      // 041: monitorenter
      // 042: aload 0
      // 043: getfield com/discord/media/engine/video/egl_renderer/EglRenderer.minRenderPeriodNs J
      // 046: lstore 10
      // 048: bipush 0
      // 049: istore 5
      // 04b: lload 10
      // 04d: lconst_0
      // 04e: lcmp
      // 04f: ifgt 058
      // 052: bipush 1
      // 053: istore 4
      // 055: goto 09a
      // 058: lload 10
      // 05a: ldc2_w 9223372036854775807
      // 05d: lcmp
      // 05e: ifne 067
      // 061: bipush 0
      // 062: istore 4
      // 064: goto 09a
      // 067: aload 0
      // 068: getfield com/discord/media/engine/video/egl_renderer/EglRenderer.nextFrameTimeNs J
      // 06b: lstore 8
      // 06d: lload 6
      // 06f: lload 8
      // 071: lcmp
      // 072: ifge 07f
      // 075: aload 0
      // 076: ldc_w "Skipping frame rendering - fps reduction is active."
      // 079: invokespecial com/discord/media/engine/video/egl_renderer/EglRenderer.logD (Ljava/lang/String;)V
      // 07c: goto 061
      // 07f: lload 8
      // 081: lload 10
      // 083: ladd
      // 084: lstore 8
      // 086: aload 0
      // 087: lload 8
      // 089: putfield com/discord/media/engine/video/egl_renderer/EglRenderer.nextFrameTimeNs J
      // 08c: aload 0
      // 08d: lload 8
      // 08f: lload 6
      // 091: invokestatic vh/h.d (JJ)J
      // 094: putfield com/discord/media/engine/video/egl_renderer/EglRenderer.nextFrameTimeNs J
      // 097: goto 052
      // 09a: aload 13
      // 09c: monitorexit
      // 09d: aload 12
      // 09f: invokestatic com/discord/media/engine/video/egl_renderer/WebRtcExtensionsKt.getRotatedAspectRatio (Lorg/webrtc/VideoFrame;)F
      // 0a2: fstore 2
      // 0a3: aload 0
      // 0a4: getfield com/discord/media/engine/video/egl_renderer/EglRenderer.layoutLock Ljava/lang/Object;
      // 0a7: astore 13
      // 0a9: aload 13
      // 0ab: monitorenter
      // 0ac: aload 0
      // 0ad: getfield com/discord/media/engine/video/egl_renderer/EglRenderer.layoutAspectRatio F
      // 0b0: fstore 1
      // 0b1: fload 1
      // 0b2: fconst_0
      // 0b3: fcmpg
      // 0b4: ifne 0ba
      // 0b7: bipush 1
      // 0b8: istore 5
      // 0ba: iload 5
      // 0bc: ifne 0c2
      // 0bf: goto 0c4
      // 0c2: fload 2
      // 0c3: fstore 1
      // 0c4: aload 13
      // 0c6: monitorexit
      // 0c7: fconst_1
      // 0c8: fstore 3
      // 0c9: fload 2
      // 0ca: fload 1
      // 0cb: fcmpl
      // 0cc: ifle 0d8
      // 0cf: fload 1
      // 0d0: fload 2
      // 0d1: fdiv
      // 0d2: fstore 1
      // 0d3: fconst_1
      // 0d4: fstore 2
      // 0d5: goto 0de
      // 0d8: fload 2
      // 0d9: fload 1
      // 0da: fdiv
      // 0db: fstore 2
      // 0dc: fload 3
      // 0dd: fstore 1
      // 0de: aload 0
      // 0df: getfield com/discord/media/engine/video/egl_renderer/EglRenderer.drawMatrix Landroid/graphics/Matrix;
      // 0e2: invokevirtual android/graphics/Matrix.reset ()V
      // 0e5: aload 0
      // 0e6: getfield com/discord/media/engine/video/egl_renderer/EglRenderer.drawMatrix Landroid/graphics/Matrix;
      // 0e9: ldc_w 0.5
      // 0ec: ldc_w 0.5
      // 0ef: invokevirtual android/graphics/Matrix.preTranslate (FF)Z
      // 0f2: pop
      // 0f3: aload 0
      // 0f4: getfield com/discord/media/engine/video/egl_renderer/EglRenderer.drawMatrix Landroid/graphics/Matrix;
      // 0f7: fload 1
      // 0f8: fload 2
      // 0f9: invokevirtual android/graphics/Matrix.preScale (FF)Z
      // 0fc: pop
      // 0fd: aload 0
      // 0fe: getfield com/discord/media/engine/video/egl_renderer/EglRenderer.drawMatrix Landroid/graphics/Matrix;
      // 101: ldc_w -0.5
      // 104: ldc_w -0.5
      // 107: invokevirtual android/graphics/Matrix.preTranslate (FF)Z
      // 10a: pop
      // 10b: iload 4
      // 10d: ifeq 1ce
      // 110: fconst_0
      // 111: fconst_0
      // 112: fconst_0
      // 113: fconst_0
      // 114: invokestatic android/opengl/GLES20.glClearColor (FFFF)V
      // 117: sipush 16384
      // 11a: invokestatic android/opengl/GLES20.glClear (I)V
      // 11d: aload 0
      // 11e: getfield com/discord/media/engine/video/egl_renderer/EglRenderer.frameDrawer Lorg/webrtc/VideoFrameDrawer;
      // 121: aload 12
      // 123: aload 0
      // 124: getfield com/discord/media/engine/video/egl_renderer/EglRenderer.drawer Lorg/webrtc/RendererCommon$GlDrawer;
      // 127: aload 0
      // 128: getfield com/discord/media/engine/video/egl_renderer/EglRenderer.drawMatrix Landroid/graphics/Matrix;
      // 12b: bipush 0
      // 12c: bipush 0
      // 12d: aload 14
      // 12f: invokeinterface org/webrtc/EglBase.surfaceWidth ()I 1
      // 134: aload 14
      // 136: invokeinterface org/webrtc/EglBase.surfaceHeight ()I 1
      // 13b: invokevirtual org/webrtc/VideoFrameDrawer.drawFrame (Lorg/webrtc/VideoFrame;Lorg/webrtc/RendererCommon$GlDrawer;Landroid/graphics/Matrix;IIII)V
      // 13e: invokestatic java/lang/System.nanoTime ()J
      // 141: lstore 10
      // 143: aload 14
      // 145: invokeinterface org/webrtc/EglBase.swapBuffers ()V 1
      // 14a: invokestatic java/lang/System.nanoTime ()J
      // 14d: lstore 8
      // 14f: aload 0
      // 150: getfield com/discord/media/engine/video/egl_renderer/EglRenderer.statisticsLock Ljava/lang/Object;
      // 153: astore 13
      // 155: aload 13
      // 157: monitorenter
      // 158: aload 0
      // 159: aload 0
      // 15a: getfield com/discord/media/engine/video/egl_renderer/EglRenderer.framesRendered I
      // 15d: bipush 1
      // 15e: iadd
      // 15f: putfield com/discord/media/engine/video/egl_renderer/EglRenderer.framesRendered I
      // 162: aload 0
      // 163: aload 0
      // 164: getfield com/discord/media/engine/video/egl_renderer/EglRenderer.renderTimeNs J
      // 167: lload 8
      // 169: lload 6
      // 16b: lsub
      // 16c: ladd
      // 16d: putfield com/discord/media/engine/video/egl_renderer/EglRenderer.renderTimeNs J
      // 170: aload 0
      // 171: aload 0
      // 172: getfield com/discord/media/engine/video/egl_renderer/EglRenderer.renderSwapBufferTimeNs J
      // 175: lload 8
      // 177: lload 10
      // 179: lsub
      // 17a: ladd
      // 17b: putfield com/discord/media/engine/video/egl_renderer/EglRenderer.renderSwapBufferTimeNs J
      // 17e: getstatic kotlin/Unit.a Lkotlin/Unit;
      // 181: astore 14
      // 183: aload 13
      // 185: monitorexit
      // 186: goto 1ce
      // 189: astore 14
      // 18b: aload 13
      // 18d: monitorexit
      // 18e: aload 14
      // 190: athrow
      // 191: astore 13
      // 193: goto 1c6
      // 196: astore 13
      // 198: aload 0
      // 199: ldc_w "Error while drawing frame"
      // 19c: aload 13
      // 19e: invokespecial com/discord/media/engine/video/egl_renderer/EglRenderer.logE (Ljava/lang/String;Ljava/lang/Throwable;)V
      // 1a1: aload 0
      // 1a2: getfield com/discord/media/engine/video/egl_renderer/EglRenderer.errorCallback Lcom/discord/media/engine/video/egl_renderer/ErrorCallback;
      // 1a5: astore 13
      // 1a7: aload 13
      // 1a9: ifnull 1b3
      // 1ac: aload 13
      // 1ae: invokeinterface com/discord/media/engine/video/egl_renderer/ErrorCallback.onGlOutOfMemory ()V 1
      // 1b3: aload 0
      // 1b4: getfield com/discord/media/engine/video/egl_renderer/EglRenderer.drawer Lorg/webrtc/RendererCommon$GlDrawer;
      // 1b7: invokeinterface org/webrtc/RendererCommon$GlDrawer.release ()V 1
      // 1bc: aload 0
      // 1bd: getfield com/discord/media/engine/video/egl_renderer/EglRenderer.frameDrawer Lorg/webrtc/VideoFrameDrawer;
      // 1c0: invokevirtual org/webrtc/VideoFrameDrawer.release ()V
      // 1c3: goto 1ce
      // 1c6: aload 12
      // 1c8: invokevirtual org/webrtc/VideoFrame.release ()V
      // 1cb: aload 13
      // 1cd: athrow
      // 1ce: aload 12
      // 1d0: invokevirtual org/webrtc/VideoFrame.release ()V
      // 1d3: return
      // 1d4: astore 12
      // 1d6: aload 13
      // 1d8: monitorexit
      // 1d9: aload 12
      // 1db: athrow
      // 1dc: astore 12
      // 1de: aload 13
      // 1e0: monitorexit
      // 1e1: aload 12
      // 1e3: athrow
      // 1e4: aload 0
      // 1e5: ldc_w "Dropping frame - No surface"
      // 1e8: invokespecial com/discord/media/engine/video/egl_renderer/EglRenderer.logD (Ljava/lang/String;)V
      // 1eb: aload 12
      // 1ed: invokevirtual org/webrtc/VideoFrame.release ()V
      // 1f0: return
      // 1f1: aload 13
      // 1f3: monitorexit
      // 1f4: return
      // 1f5: astore 12
      // 1f7: aload 13
      // 1f9: monitorexit
      // 1fa: aload 12
      // 1fc: athrow
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
      r.h(var1, "surfaceTexture");
      this.createEglSurfaceInternal(var1);
   }

   public fun createEglSurface(surface: Surface) {
      r.h(var1, "surface");
      this.createEglSurfaceInternal(var1);
   }

   public fun disableFpsReduction() {
      this.setFpsReduction(java.lang.Float.POSITIVE_INFINITY);
   }

   public fun init() {
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
      // 000: invokestatic java/lang/System.nanoTime ()J
      // 003: lstore 2
      // 004: aload 0
      // 005: getfield com/discord/media/engine/video/egl_renderer/EglRenderer.handlerLock Ljava/lang/Object;
      // 008: astore 4
      // 00a: aload 4
      // 00c: monitorenter
      // 00d: aload 0
      // 00e: getfield com/discord/media/engine/video/egl_renderer/EglRenderer.renderThreadHandler Landroid/os/Handler;
      // 011: ifnonnull 019
      // 014: bipush 1
      // 015: istore 1
      // 016: goto 01b
      // 019: bipush 0
      // 01a: istore 1
      // 01b: iload 1
      // 01c: ifeq 0c2
      // 01f: aload 0
      // 020: ldc_w "Initializing EglRenderer"
      // 023: invokespecial com/discord/media/engine/video/egl_renderer/EglRenderer.logD (Ljava/lang/String;)V
      // 026: new android/os/HandlerThread
      // 029: astore 6
      // 02b: aload 0
      // 02c: getfield com/discord/media/engine/video/egl_renderer/EglRenderer.name Ljava/lang/String;
      // 02f: astore 7
      // 031: new java/lang/StringBuilder
      // 034: astore 5
      // 036: aload 5
      // 038: invokespecial java/lang/StringBuilder.<init> ()V
      // 03b: aload 5
      // 03d: aload 7
      // 03f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 042: pop
      // 043: aload 5
      // 045: ldc "EglRenderer"
      // 047: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 04a: pop
      // 04b: aload 6
      // 04d: aload 5
      // 04f: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 052: invokespecial android/os/HandlerThread.<init> (Ljava/lang/String;)V
      // 055: aload 6
      // 057: invokevirtual java/lang/Thread.start ()V
      // 05a: new com/discord/media/engine/video/egl_renderer/HandlerWithExceptionCallback
      // 05d: astore 5
      // 05f: aload 6
      // 061: invokevirtual android/os/HandlerThread.getLooper ()Landroid/os/Looper;
      // 064: astore 7
      // 066: aload 7
      // 068: ldc_w "renderThread.looper"
      // 06b: invokestatic kotlin/jvm/internal/r.g (Ljava/lang/Object;Ljava/lang/String;)V
      // 06e: new com/discord/media/engine/video/egl_renderer/EglRenderer$init$1$handler$1
      // 071: astore 6
      // 073: aload 6
      // 075: aload 0
      // 076: invokespecial com/discord/media/engine/video/egl_renderer/EglRenderer$init$1$handler$1.<init> (Lcom/discord/media/engine/video/egl_renderer/EglRenderer;)V
      // 079: aload 5
      // 07b: aload 7
      // 07d: aload 6
      // 07f: invokespecial com/discord/media/engine/video/egl_renderer/HandlerWithExceptionCallback.<init> (Landroid/os/Looper;Lkotlin/jvm/functions/Function1;)V
      // 082: aload 0
      // 083: aload 5
      // 085: putfield com/discord/media/engine/video/egl_renderer/EglRenderer.renderThreadHandler Landroid/os/Handler;
      // 088: getstatic com/discord/media/engine/types/Debug.INSTANCE Lcom/discord/media/engine/types/Debug;
      // 08b: astore 6
      // 08d: new com/discord/media/engine/video/egl_renderer/c
      // 090: astore 6
      // 092: aload 6
      // 094: aload 0
      // 095: lload 2
      // 096: invokespecial com/discord/media/engine/video/egl_renderer/c.<init> (Lcom/discord/media/engine/video/egl_renderer/EglRenderer;J)V
      // 099: aload 5
      // 09b: aload 6
      // 09d: invokestatic org/webrtc/ThreadUtils.invokeAtFrontUninterruptibly (Landroid/os/Handler;Ljava/lang/Runnable;)V
      // 0a0: aload 5
      // 0a2: aload 0
      // 0a3: getfield com/discord/media/engine/video/egl_renderer/EglRenderer.eglSurfaceCreationRunnable Lcom/discord/media/engine/video/egl_renderer/EglRenderer$EglSurfaceCreation;
      // 0a6: invokevirtual android/os/Handler.post (Ljava/lang/Runnable;)Z
      // 0a9: pop
      // 0aa: aload 0
      // 0ab: lconst_0
      // 0ac: bipush 1
      // 0ad: aconst_null
      // 0ae: invokestatic com/discord/media/engine/video/egl_renderer/EglRenderer.resetStatistics$default (Lcom/discord/media/engine/video/egl_renderer/EglRenderer;JILjava/lang/Object;)V
      // 0b1: aload 5
      // 0b3: aload 0
      // 0b4: getfield com/discord/media/engine/video/egl_renderer/EglRenderer.logStatisticsRunnable Ljava/lang/Runnable;
      // 0b7: ldc2_w 4000
      // 0ba: invokevirtual android/os/Handler.postDelayed (Ljava/lang/Runnable;J)Z
      // 0bd: pop
      // 0be: aload 4
      // 0c0: monitorexit
      // 0c1: return
      // 0c2: aload 0
      // 0c3: getfield com/discord/media/engine/video/egl_renderer/EglRenderer.name Ljava/lang/String;
      // 0c6: astore 5
      // 0c8: new java/lang/StringBuilder
      // 0cb: astore 6
      // 0cd: aload 6
      // 0cf: invokespecial java/lang/StringBuilder.<init> ()V
      // 0d2: aload 6
      // 0d4: aload 5
      // 0d6: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0d9: pop
      // 0da: aload 6
      // 0dc: ldc_w ": already initialized"
      // 0df: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0e2: pop
      // 0e3: aload 6
      // 0e5: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0e8: astore 5
      // 0ea: new java/lang/IllegalStateException
      // 0ed: astore 6
      // 0ef: aload 6
      // 0f1: aload 5
      // 0f3: invokevirtual java/lang/Object.toString ()Ljava/lang/String;
      // 0f6: invokespecial java/lang/IllegalStateException.<init> (Ljava/lang/String;)V
      // 0f9: aload 6
      // 0fb: athrow
      // 0fc: astore 5
      // 0fe: aload 4
      // 100: monitorexit
      // 101: aload 5
      // 103: athrow
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
      // 04: invokestatic kotlin/jvm/internal/r.h (Ljava/lang/Object;Ljava/lang/String;)V
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
      // 29: ifnonnull 36
      // 2c: aload 0
      // 2d: ldc_w "Dropping frame - Not initialized or already released."
      // 30: invokespecial com/discord/media/engine/video/egl_renderer/EglRenderer.logD (Ljava/lang/String;)V
      // 33: aload 3
      // 34: monitorexit
      // 35: return
      // 36: aload 0
      // 37: getfield com/discord/media/engine/video/egl_renderer/EglRenderer.frameLock Ljava/lang/Object;
      // 3a: astore 4
      // 3c: aload 4
      // 3e: monitorenter
      // 3f: aload 0
      // 40: getfield com/discord/media/engine/video/egl_renderer/EglRenderer.pendingFrame Lorg/webrtc/VideoFrame;
      // 43: astore 6
      // 45: aload 6
      // 47: ifnull 54
      // 4a: aload 6
      // 4c: invokevirtual org/webrtc/VideoFrame.release ()V
      // 4f: bipush 1
      // 50: istore 2
      // 51: goto 56
      // 54: bipush 0
      // 55: istore 2
      // 56: aload 1
      // 57: invokevirtual org/webrtc/VideoFrame.retain ()V
      // 5a: aload 0
      // 5b: aload 1
      // 5c: putfield com/discord/media/engine/video/egl_renderer/EglRenderer.pendingFrame Lorg/webrtc/VideoFrame;
      // 5f: new com/discord/media/engine/video/egl_renderer/e
      // 62: astore 1
      // 63: aload 1
      // 64: aload 0
      // 65: invokespecial com/discord/media/engine/video/egl_renderer/e.<init> (Lcom/discord/media/engine/video/egl_renderer/EglRenderer;)V
      // 68: aload 5
      // 6a: aload 1
      // 6b: invokevirtual android/os/Handler.post (Ljava/lang/Runnable;)Z
      // 6e: pop
      // 6f: aload 4
      // 71: monitorexit
      // 72: aload 3
      // 73: monitorexit
      // 74: iload 2
      // 75: ifeq 93
      // 78: aload 0
      // 79: getfield com/discord/media/engine/video/egl_renderer/EglRenderer.statisticsLock Ljava/lang/Object;
      // 7c: astore 3
      // 7d: aload 3
      // 7e: monitorenter
      // 7f: aload 0
      // 80: aload 0
      // 81: getfield com/discord/media/engine/video/egl_renderer/EglRenderer.framesDropped I
      // 84: bipush 1
      // 85: iadd
      // 86: putfield com/discord/media/engine/video/egl_renderer/EglRenderer.framesDropped I
      // 89: aload 3
      // 8a: monitorexit
      // 8b: goto 93
      // 8e: astore 1
      // 8f: aload 3
      // 90: monitorexit
      // 91: aload 1
      // 92: athrow
      // 93: return
      // 94: astore 1
      // 95: aload 4
      // 97: monitorexit
      // 98: aload 1
      // 99: athrow
      // 9a: astore 1
      // 9b: aload 3
      // 9c: monitorexit
      // 9d: aload 1
      // 9e: athrow
      // 9f: astore 1
      // a0: aload 3
      // a1: monitorexit
      // a2: aload 1
      // a3: athrow
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
      // 24: ifnonnull 31
      // 27: aload 0
      // 28: ldc_w "Already released"
      // 2b: invokespecial com/discord/media/engine/video/egl_renderer/EglRenderer.logD (Ljava/lang/String;)V
      // 2e: aload 3
      // 2f: monitorexit
      // 30: return
      // 31: aload 5
      // 33: aload 0
      // 34: getfield com/discord/media/engine/video/egl_renderer/EglRenderer.logStatisticsRunnable Ljava/lang/Runnable;
      // 37: invokevirtual android/os/Handler.removeCallbacks (Ljava/lang/Runnable;)V
      // 3a: new com/discord/media/engine/video/egl_renderer/a
      // 3d: astore 6
      // 3f: aload 6
      // 41: aload 0
      // 42: aload 4
      // 44: invokespecial com/discord/media/engine/video/egl_renderer/a.<init> (Lcom/discord/media/engine/video/egl_renderer/EglRenderer;Ljava/util/concurrent/CountDownLatch;)V
      // 47: aload 5
      // 49: aload 6
      // 4b: invokevirtual android/os/Handler.postAtFrontOfQueue (Ljava/lang/Runnable;)Z
      // 4e: pop
      // 4f: aload 5
      // 51: invokevirtual android/os/Handler.getLooper ()Landroid/os/Looper;
      // 54: astore 6
      // 56: aload 6
      // 58: ldc_w "handler.looper"
      // 5b: invokestatic kotlin/jvm/internal/r.g (Ljava/lang/Object;Ljava/lang/String;)V
      // 5e: new com/discord/media/engine/video/egl_renderer/b
      // 61: astore 7
      // 63: aload 7
      // 65: aload 0
      // 66: aload 6
      // 68: invokespecial com/discord/media/engine/video/egl_renderer/b.<init> (Lcom/discord/media/engine/video/egl_renderer/EglRenderer;Landroid/os/Looper;)V
      // 6b: aload 5
      // 6d: aload 7
      // 6f: invokevirtual android/os/Handler.post (Ljava/lang/Runnable;)Z
      // 72: pop
      // 73: aload 0
      // 74: aconst_null
      // 75: putfield com/discord/media/engine/video/egl_renderer/EglRenderer.renderThreadHandler Landroid/os/Handler;
      // 78: getstatic kotlin/Unit.a Lkotlin/Unit;
      // 7b: astore 5
      // 7d: aload 3
      // 7e: monitorexit
      // 7f: aload 4
      // 81: invokestatic org/webrtc/ThreadUtils.awaitUninterruptibly (Ljava/util/concurrent/CountDownLatch;)V
      // 84: aload 0
      // 85: getfield com/discord/media/engine/video/egl_renderer/EglRenderer.frameLock Ljava/lang/Object;
      // 88: astore 3
      // 89: aload 3
      // 8a: monitorenter
      // 8b: aload 0
      // 8c: getfield com/discord/media/engine/video/egl_renderer/EglRenderer.pendingFrame Lorg/webrtc/VideoFrame;
      // 8f: astore 4
      // 91: aload 4
      // 93: ifnull 9b
      // 96: aload 4
      // 98: invokevirtual org/webrtc/VideoFrame.release ()V
      // 9b: aload 0
      // 9c: aconst_null
      // 9d: putfield com/discord/media/engine/video/egl_renderer/EglRenderer.pendingFrame Lorg/webrtc/VideoFrame;
      // a0: aload 3
      // a1: monitorexit
      // a2: getstatic java/util/concurrent/TimeUnit.NANOSECONDS Ljava/util/concurrent/TimeUnit;
      // a5: invokestatic java/lang/System.nanoTime ()J
      // a8: lload 1
      // a9: lsub
      // aa: invokevirtual java/util/concurrent/TimeUnit.toMillis (J)J
      // ad: lstore 1
      // ae: new java/lang/StringBuilder
      // b1: dup
      // b2: invokespecial java/lang/StringBuilder.<init> ()V
      // b5: astore 3
      // b6: aload 3
      // b7: ldc_w "release done: "
      // ba: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // bd: pop
      // be: aload 3
      // bf: lload 1
      // c0: invokevirtual java/lang/StringBuilder.append (J)Ljava/lang/StringBuilder;
      // c3: pop
      // c4: aload 3
      // c5: ldc_w " ms"
      // c8: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // cb: pop
      // cc: aload 0
      // cd: aload 3
      // ce: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // d1: invokespecial com/discord/media/engine/video/egl_renderer/EglRenderer.logD (Ljava/lang/String;)V
      // d4: return
      // d5: astore 4
      // d7: aload 3
      // d8: monitorexit
      // d9: aload 4
      // db: athrow
      // dc: astore 4
      // de: aload 3
      // df: monitorexit
      // e0: aload 4
      // e2: athrow
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
      // 04: invokestatic kotlin/jvm/internal/r.h (Ljava/lang/Object;Ljava/lang/String;)V
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
      // 1c: ifnull 3d
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
      // 3d: aload 2
      // 3e: monitorexit
      // 3f: aload 1
      // 40: invokeinterface kotlin/jvm/functions/Function0.invoke ()Ljava/lang/Object; 1
      // 45: pop
      // 46: return
      // 47: astore 1
      // 48: aload 2
      // 49: monitorexit
      // 4a: aload 1
      // 4b: athrow
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
      // 53: ifeq 5d
      // 56: aload 0
      // 57: invokestatic java/lang/System.nanoTime ()J
      // 5a: putfield com/discord/media/engine/video/egl_renderer/EglRenderer.nextFrameTimeNs J
      // 5d: getstatic kotlin/Unit.a Lkotlin/Unit;
      // 60: astore 7
      // 62: aload 6
      // 64: monitorexit
      // 65: return
      // 66: astore 7
      // 68: aload 6
      // 6a: monitorexit
      // 6b: aload 7
      // 6d: athrow
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
      // 07: astore 3
      // 08: aload 3
      // 09: ldc_w "setLayoutAspectRatio: "
      // 0c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0f: pop
      // 10: aload 3
      // 11: fload 1
      // 12: invokevirtual java/lang/StringBuilder.append (F)Ljava/lang/StringBuilder;
      // 15: pop
      // 16: aload 0
      // 17: aload 3
      // 18: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1b: invokespecial com/discord/media/engine/video/egl_renderer/EglRenderer.logD (Ljava/lang/String;)V
      // 1e: aload 0
      // 1f: getfield com/discord/media/engine/video/egl_renderer/EglRenderer.layoutLock Ljava/lang/Object;
      // 22: astore 3
      // 23: aload 3
      // 24: monitorenter
      // 25: fload 1
      // 26: invokestatic java/lang/Float.isInfinite (F)Z
      // 29: ifne 38
      // 2c: fload 1
      // 2d: invokestatic java/lang/Float.isNaN (F)Z
      // 30: ifne 38
      // 33: bipush 1
      // 34: istore 2
      // 35: goto 3a
      // 38: bipush 0
      // 39: istore 2
      // 3a: iload 2
      // 3b: ifeq 46
      // 3e: aload 0
      // 3f: fload 1
      // 40: putfield com/discord/media/engine/video/egl_renderer/EglRenderer.layoutAspectRatio F
      // 43: goto 4b
      // 46: aload 0
      // 47: fconst_0
      // 48: putfield com/discord/media/engine/video/egl_renderer/EglRenderer.layoutAspectRatio F
      // 4b: getstatic kotlin/Unit.a Lkotlin/Unit;
      // 4e: astore 4
      // 50: aload 3
      // 51: monitorexit
      // 52: return
      // 53: astore 4
      // 55: aload 3
      // 56: monitorexit
      // 57: aload 4
      // 59: athrow
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
         // 2f: ifeq 3f
         // 32: aload 3
         // 33: aload 2
         // 34: checkcast android/view/Surface
         // 37: invokeinterface org/webrtc/EglBase.createSurface (Landroid/view/Surface;)V 2
         // 3c: goto 50
         // 3f: aload 2
         // 40: instanceof android/graphics/SurfaceTexture
         // 43: ifeq 60
         // 46: aload 3
         // 47: aload 2
         // 48: checkcast android/graphics/SurfaceTexture
         // 4b: invokeinterface org/webrtc/EglBase.createSurface (Landroid/graphics/SurfaceTexture;)V 2
         // 50: aload 3
         // 51: invokeinterface org/webrtc/EglBase.makeCurrent ()V 1
         // 56: sipush 3317
         // 59: bipush 1
         // 5a: invokestatic android/opengl/GLES20.glPixelStorei (II)V
         // 5d: aload 0
         // 5e: monitorexit
         // 5f: return
         // 60: new java/lang/IllegalStateException
         // 63: astore 4
         // 65: new java/lang/StringBuilder
         // 68: astore 3
         // 69: aload 3
         // 6a: invokespecial java/lang/StringBuilder.<init> ()V
         // 6d: aload 3
         // 6e: ldc "Invalid surface: "
         // 70: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
         // 73: pop
         // 74: aload 3
         // 75: aload 2
         // 76: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
         // 79: pop
         // 7a: aload 4
         // 7c: aload 3
         // 7d: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
         // 80: invokevirtual java/lang/Object.toString ()Ljava/lang/String;
         // 83: invokespecial java/lang/IllegalStateException.<init> (Ljava/lang/String;)V
         // 86: aload 4
         // 88: athrow
         // 89: astore 2
         // 8a: aload 0
         // 8b: monitorexit
         // 8c: aload 2
         // 8d: athrow
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

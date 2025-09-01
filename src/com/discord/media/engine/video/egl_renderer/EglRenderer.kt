package com.discord.media.engine.video.egl_renderer

import android.graphics.Matrix
import android.graphics.SurfaceTexture
import android.os.Handler
import android.os.HandlerThread
import android.os.Looper
import android.view.Surface
import co.discord.media_engine.SharedEglBaseContext
import com.discord.media.engine.types.Debug
import com.discord.media.engine.types.VideoSink
import java.util.concurrent.CountDownLatch
import java.util.concurrent.TimeUnit
import kotlin.jvm.functions.Function0
import kotlin.jvm.internal.SourceDebugExtension
import org.webrtc.EglBase
import org.webrtc.EglHelper
import org.webrtc.GlRectDrawer
import org.webrtc.Logging
import org.webrtc.ThreadUtils
import org.webrtc.VideoFrame
import org.webrtc.VideoFrameDrawer
import org.webrtc.RendererCommon.GlDrawer

@SourceDebugExtension(["SMAP\nEglRenderer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EglRenderer.kt\ncom/discord/media/engine/video/egl_renderer/EglRenderer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Debug.kt\ncom/discord/media/engine/types/Debug\n*L\n1#1,524:1\n1#2:525\n44#3,7:526\n44#3,7:533\n*S KotlinDebug\n*F\n+ 1 EglRenderer.kt\ncom/discord/media/engine/video/egl_renderer/EglRenderer\n*L\n168#1:526,7\n179#1:533,7\n*E\n"])
internal open class EglRenderer(name: String) : VideoSink {
   protected final val name: String
   private final val handlerLock: Any
   private final var renderThreadHandler: Handler?
   private final var errorCallback: ErrorCallback?
   private final val fpsReductionLock: Any
   private final var nextFrameTimeNs: Long
   private final var minRenderPeriodNs: Long
   private final var eglBase: EglBase?
   private final val frameDrawer: VideoFrameDrawer
   private final val drawer: GlDrawer
   private final val drawMatrix: Matrix
   private final val frameLock: Any
   private final var pendingFrame: VideoFrame?
   private final var pendingFrameMirror: Boolean
   private final val layoutLock: Any
   private final var layoutAspectRatio: Float
   private final val statisticsLock: Any
   private final var framesReceived: Int
   private final var framesDropped: Int
   private final var framesRendered: Int
   private final var statisticsStartTimeNs: Long
   private final var renderTimeNs: Long
   private final var renderSwapBufferTimeNs: Long
   private final val logStatisticsRunnable: Runnable
   private final val eglSurfaceCreationRunnable: com.discord.media.engine.video.egl_renderer.EglRenderer.EglSurfaceCreation

   init {
      this.name = var1;
      this.handlerLock = new Object();
      this.fpsReductionLock = new Object();
      this.frameDrawer = new VideoFrameDrawer();
      this.drawer = new GlRectDrawer();
      this.drawMatrix = new Matrix();
      this.frameLock = new Object();
      this.layoutLock = new Object();
      this.statisticsLock = new Object();
      this.logStatisticsRunnable = new c(this);
      this.eglSurfaceCreationRunnable = new EglRenderer.EglSurfaceCreation(this);
   }

   private fun createEglSurfaceInternal(surface: Any) {
      this.eglSurfaceCreationRunnable.setSurface(var1);
      this.postToRenderThread(this.eglSurfaceCreationRunnable);
   }

   @JvmStatic
   fun `init$lambda$10$lambda$6`(var0: EglRenderer, var1: Exception): Unit {
      label13: {
         Logging.e("EglRenderer", "Exception on EglRenderer thread", var1);
         val var4: Any = var0.handlerLock;
         synchronized (var0.handlerLock){} // $VF: monitorenter 

         try {
            var0.renderThreadHandler = null;
         } catch (var2: java.lang.Throwable) {
            // $VF: monitorexit
         }

         // $VF: monitorexit
      }
   }

   @JvmStatic
   fun `init$lambda$10$lambda$9`(var0: EglRenderer, var1: Long) {
      var0.logD("Creating EglBase");
      var0.eglBase = EglHelper.create(SharedEglBaseContext.getEglContext(), EglBase.CONFIG_PLAIN);
      val var3: Debug = Debug.INSTANCE;
   }

   private fun logD(string: String) {
      val var2: java.lang.String = this.name;
      val var3: StringBuilder = new StringBuilder();
      var3.append("name: ");
      var3.append(var1);
      Logging.d(var2, var3.toString());
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
      //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.removeExceptionInstructionsEx(FinallyProcessor.java:1064)
      //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.verifyFinallyEx(FinallyProcessor.java:565)
      //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.iterateGraph(FinallyProcessor.java:90)
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
      // 065: istore 2
      // 066: aload 0
      // 067: getfield com/discord/media/engine/video/egl_renderer/EglRenderer.framesDropped I
      // 06a: istore 4
      // 06c: aload 0
      // 06d: getfield com/discord/media/engine/video/egl_renderer/EglRenderer.framesRendered I
      // 070: istore 3
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
      // 09b: astore 12
      // 09d: new java/lang/StringBuilder
      // 0a0: astore 13
      // 0a2: aload 13
      // 0a4: invokespecial java/lang/StringBuilder.<init> ()V
      // 0a7: aload 13
      // 0a9: ldc_w "[logStatistics] Duration: "
      // 0ac: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0af: pop
      // 0b0: aload 13
      // 0b2: lload 7
      // 0b4: invokevirtual java/lang/StringBuilder.append (J)Ljava/lang/StringBuilder;
      // 0b7: pop
      // 0b8: aload 13
      // 0ba: ldc_w " ms. Frames received: "
      // 0bd: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0c0: pop
      // 0c1: aload 13
      // 0c3: iload 2
      // 0c4: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 0c7: pop
      // 0c8: aload 13
      // 0ca: ldc_w ". Dropped: "
      // 0cd: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0d0: pop
      // 0d1: aload 13
      // 0d3: iload 4
      // 0d5: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 0d8: pop
      // 0d9: aload 13
      // 0db: ldc_w ". Rendered: "
      // 0de: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0e1: pop
      // 0e2: aload 13
      // 0e4: iload 3
      // 0e5: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 0e8: pop
      // 0e9: aload 13
      // 0eb: ldc_w ". Render fps: "
      // 0ee: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0f1: pop
      // 0f2: aload 13
      // 0f4: aload 10
      // 0f6: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0f9: pop
      // 0fa: aload 13
      // 0fc: ldc_w ". Average render time: "
      // 0ff: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 102: pop
      // 103: aload 13
      // 105: aload 11
      // 107: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 10a: pop
      // 10b: aload 13
      // 10d: ldc_w ". Average swapBuffer time: "
      // 110: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 113: pop
      // 114: aload 13
      // 116: aload 12
      // 118: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 11b: pop
      // 11c: aload 13
      // 11e: ldc_w "."
      // 121: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 124: pop
      // 125: aload 0
      // 126: aload 13
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
   fun `onFrame$lambda$26$lambda$25$lambda$24`(var0: EglRenderer) {
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
      //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.removeExceptionInstructionsEx(FinallyProcessor.java:1064)
      //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.verifyFinallyEx(FinallyProcessor.java:565)
      //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.iterateGraph(FinallyProcessor.java:90)
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
   fun `release$lambda$15$lambda$14`(var0: EglRenderer, var1: Looper) {
      var0.logD("Quitting render thread.");
      var1.quit();
   }

   @JvmStatic
   fun `releaseEglSurface$lambda$31$lambda$30$lambda$29`(var0: EglRenderer, var1: Function0) {
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
      // 011: ifnull 20c
      // 014: aload 0
      // 015: aconst_null
      // 016: putfield com/discord/media/engine/video/egl_renderer/EglRenderer.pendingFrame Lorg/webrtc/VideoFrame;
      // 019: aload 12
      // 01b: monitorexit
      // 01c: aload 0
      // 01d: getfield com/discord/media/engine/video/egl_renderer/EglRenderer.eglBase Lorg/webrtc/EglBase;
      // 020: astore 12
      // 022: aload 12
      // 024: ifnull 1fa
      // 027: aload 12
      // 029: invokeinterface org/webrtc/EglBase.hasSurface ()Z 1
      // 02e: ifne 034
      // 031: goto 1fa
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
      // 07e: goto 1f4
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
      // 093: invokestatic kotlin/ranges/d.e (JJ)J
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
      // 0c0: fload 2
      // 0c1: fload 1
      // 0c2: fcmpl
      // 0c3: ifle 0cf
      // 0c6: fload 1
      // 0c7: fload 2
      // 0c8: fdiv
      // 0c9: fstore 2
      // 0ca: fconst_1
      // 0cb: fstore 1
      // 0cc: goto 0d5
      // 0cf: fload 2
      // 0d0: fload 1
      // 0d1: fdiv
      // 0d2: fstore 1
      // 0d3: fconst_1
      // 0d4: fstore 2
      // 0d5: aload 0
      // 0d6: getfield com/discord/media/engine/video/egl_renderer/EglRenderer.drawMatrix Landroid/graphics/Matrix;
      // 0d9: invokevirtual android/graphics/Matrix.reset ()V
      // 0dc: aload 0
      // 0dd: getfield com/discord/media/engine/video/egl_renderer/EglRenderer.drawMatrix Landroid/graphics/Matrix;
      // 0e0: ldc_w 0.5
      // 0e3: ldc_w 0.5
      // 0e6: invokevirtual android/graphics/Matrix.preTranslate (FF)Z
      // 0e9: pop
      // 0ea: aload 0
      // 0eb: getfield com/discord/media/engine/video/egl_renderer/EglRenderer.drawMatrix Landroid/graphics/Matrix;
      // 0ee: astore 13
      // 0f0: aload 0
      // 0f1: getfield com/discord/media/engine/video/egl_renderer/EglRenderer.pendingFrameMirror Z
      // 0f4: ifeq 0fe
      // 0f7: ldc_w -1.0
      // 0fa: fstore 3
      // 0fb: goto 100
      // 0fe: fconst_1
      // 0ff: fstore 3
      // 100: aload 13
      // 102: fload 3
      // 103: fconst_1
      // 104: invokevirtual android/graphics/Matrix.preScale (FF)Z
      // 107: pop
      // 108: aload 0
      // 109: getfield com/discord/media/engine/video/egl_renderer/EglRenderer.drawMatrix Landroid/graphics/Matrix;
      // 10c: fload 2
      // 10d: fload 1
      // 10e: invokevirtual android/graphics/Matrix.preScale (FF)Z
      // 111: pop
      // 112: aload 0
      // 113: getfield com/discord/media/engine/video/egl_renderer/EglRenderer.drawMatrix Landroid/graphics/Matrix;
      // 116: ldc_w -0.5
      // 119: ldc_w -0.5
      // 11c: invokevirtual android/graphics/Matrix.preTranslate (FF)Z
      // 11f: pop
      // 120: iload 4
      // 122: ifeq 1db
      // 125: fconst_0
      // 126: fconst_0
      // 127: fconst_0
      // 128: fconst_0
      // 129: invokestatic android/opengl/GLES20.glClearColor (FFFF)V
      // 12c: sipush 16384
      // 12f: invokestatic android/opengl/GLES20.glClear (I)V
      // 132: aload 0
      // 133: getfield com/discord/media/engine/video/egl_renderer/EglRenderer.frameDrawer Lorg/webrtc/VideoFrameDrawer;
      // 136: aload 11
      // 138: aload 0
      // 139: getfield com/discord/media/engine/video/egl_renderer/EglRenderer.drawer Lorg/webrtc/RendererCommon$GlDrawer;
      // 13c: aload 0
      // 13d: getfield com/discord/media/engine/video/egl_renderer/EglRenderer.drawMatrix Landroid/graphics/Matrix;
      // 140: bipush 0
      // 141: bipush 0
      // 142: aload 12
      // 144: invokeinterface org/webrtc/EglBase.surfaceWidth ()I 1
      // 149: aload 12
      // 14b: invokeinterface org/webrtc/EglBase.surfaceHeight ()I 1
      // 150: invokevirtual org/webrtc/VideoFrameDrawer.drawFrame (Lorg/webrtc/VideoFrame;Lorg/webrtc/RendererCommon$GlDrawer;Landroid/graphics/Matrix;IIII)V
      // 153: invokestatic java/lang/System.nanoTime ()J
      // 156: lstore 9
      // 158: aload 12
      // 15a: invokeinterface org/webrtc/EglBase.swapBuffers ()V 1
      // 15f: invokestatic java/lang/System.nanoTime ()J
      // 162: lstore 7
      // 164: aload 0
      // 165: getfield com/discord/media/engine/video/egl_renderer/EglRenderer.statisticsLock Ljava/lang/Object;
      // 168: astore 12
      // 16a: aload 12
      // 16c: monitorenter
      // 16d: aload 0
      // 16e: aload 0
      // 16f: getfield com/discord/media/engine/video/egl_renderer/EglRenderer.framesRendered I
      // 172: bipush 1
      // 173: iadd
      // 174: putfield com/discord/media/engine/video/egl_renderer/EglRenderer.framesRendered I
      // 177: aload 0
      // 178: aload 0
      // 179: getfield com/discord/media/engine/video/egl_renderer/EglRenderer.renderTimeNs J
      // 17c: lload 7
      // 17e: lload 5
      // 180: lsub
      // 181: ladd
      // 182: putfield com/discord/media/engine/video/egl_renderer/EglRenderer.renderTimeNs J
      // 185: aload 0
      // 186: aload 0
      // 187: getfield com/discord/media/engine/video/egl_renderer/EglRenderer.renderSwapBufferTimeNs J
      // 18a: lload 7
      // 18c: lload 9
      // 18e: lsub
      // 18f: ladd
      // 190: putfield com/discord/media/engine/video/egl_renderer/EglRenderer.renderSwapBufferTimeNs J
      // 193: getstatic kotlin/Unit.a Lkotlin/Unit;
      // 196: astore 13
      // 198: aload 12
      // 19a: monitorexit
      // 19b: goto 1db
      // 19e: astore 12
      // 1a0: goto 1e3
      // 1a3: astore 12
      // 1a5: goto 1b0
      // 1a8: astore 13
      // 1aa: aload 12
      // 1ac: monitorexit
      // 1ad: aload 13
      // 1af: athrow
      // 1b0: aload 0
      // 1b1: ldc_w "Error while drawing frame"
      // 1b4: aload 12
      // 1b6: invokespecial com/discord/media/engine/video/egl_renderer/EglRenderer.logE (Ljava/lang/String;Ljava/lang/Throwable;)V
      // 1b9: aload 0
      // 1ba: getfield com/discord/media/engine/video/egl_renderer/EglRenderer.errorCallback Lcom/discord/media/engine/video/egl_renderer/ErrorCallback;
      // 1bd: astore 12
      // 1bf: aload 12
      // 1c1: ifnull 1cb
      // 1c4: aload 12
      // 1c6: invokeinterface com/discord/media/engine/video/egl_renderer/ErrorCallback.onGlOutOfMemory ()V 1
      // 1cb: aload 0
      // 1cc: getfield com/discord/media/engine/video/egl_renderer/EglRenderer.drawer Lorg/webrtc/RendererCommon$GlDrawer;
      // 1cf: invokeinterface org/webrtc/RendererCommon$GlDrawer.release ()V 1
      // 1d4: aload 0
      // 1d5: getfield com/discord/media/engine/video/egl_renderer/EglRenderer.frameDrawer Lorg/webrtc/VideoFrameDrawer;
      // 1d8: invokevirtual org/webrtc/VideoFrameDrawer.release ()V
      // 1db: aload 11
      // 1dd: invokevirtual org/webrtc/VideoFrame.release ()V
      // 1e0: goto 1eb
      // 1e3: aload 11
      // 1e5: invokevirtual org/webrtc/VideoFrame.release ()V
      // 1e8: aload 12
      // 1ea: athrow
      // 1eb: return
      // 1ec: astore 11
      // 1ee: aload 13
      // 1f0: monitorexit
      // 1f1: aload 11
      // 1f3: athrow
      // 1f4: aload 13
      // 1f6: monitorexit
      // 1f7: aload 11
      // 1f9: athrow
      // 1fa: aload 0
      // 1fb: ldc_w "Dropping frame - No surface"
      // 1fe: invokespecial com/discord/media/engine/video/egl_renderer/EglRenderer.logD (Ljava/lang/String;)V
      // 201: aload 11
      // 203: invokevirtual org/webrtc/VideoFrame.release ()V
      // 206: return
      // 207: astore 11
      // 209: goto 210
      // 20c: aload 12
      // 20e: monitorexit
      // 20f: return
      // 210: aload 12
      // 212: monitorexit
      // 213: aload 11
      // 215: athrow
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
      this.createEglSurfaceInternal(var1);
   }

   public fun createEglSurface(surface: Surface) {
      this.createEglSurfaceInternal(var1);
   }

   public fun disableFpsReduction() {
      this.setFpsReduction(java.lang.Float.POSITIVE_INFINITY);
   }

   public fun init() {
      val var1: Long = System.nanoTime();
      synchronized (this.handlerLock) {
         if (this.renderThreadHandler != null) {
            val var9: java.lang.String = this.name;
            val var14: StringBuilder = new StringBuilder();
            var14.append(var9);
            var14.append(": already initialized");
            throw new IllegalStateException(var14.toString().toString());
         }

         this.logD("Initializing EglRenderer");
         val var6: java.lang.String = this.name;
         val var4: StringBuilder = new StringBuilder();
         var4.append(var6);
         var4.append("EglRenderer");
         val var5: HandlerThread = new HandlerThread(var4.toString());
         var5.start();
         val var16: Looper = var5.getLooper();
         val var8: HandlerWithExceptionCallback = new HandlerWithExceptionCallback(var16, new f(this));
         this.renderThreadHandler = var8;
         val var12: Debug = Debug.INSTANCE;
         ThreadUtils.invokeAtFrontUninterruptibly(var8, new g(this, var1));
         var8.post(this.eglSurfaceCreationRunnable);
         resetStatistics$default(this, 0L, 1, null);
         var8.postDelayed(this.logStatisticsRunnable, 4000L);
      }
   }

   public override fun onFrame(frame: VideoFrame, mirror: Boolean) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.createStatement(DomHelper.java:27)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:157)
      //
      // Bytecode:
      // 00: aload 1
      // 01: ldc_w "frame"
      // 04: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
      // 07: aload 0
      // 08: getfield com/discord/media/engine/video/egl_renderer/EglRenderer.statisticsLock Ljava/lang/Object;
      // 0b: astore 4
      // 0d: aload 4
      // 0f: monitorenter
      // 10: aload 0
      // 11: aload 0
      // 12: getfield com/discord/media/engine/video/egl_renderer/EglRenderer.framesReceived I
      // 15: bipush 1
      // 16: iadd
      // 17: putfield com/discord/media/engine/video/egl_renderer/EglRenderer.framesReceived I
      // 1a: aload 4
      // 1c: monitorexit
      // 1d: aload 0
      // 1e: getfield com/discord/media/engine/video/egl_renderer/EglRenderer.handlerLock Ljava/lang/Object;
      // 21: astore 4
      // 23: aload 4
      // 25: monitorenter
      // 26: aload 0
      // 27: getfield com/discord/media/engine/video/egl_renderer/EglRenderer.renderThreadHandler Landroid/os/Handler;
      // 2a: astore 6
      // 2c: aload 6
      // 2e: ifnonnull 40
      // 31: aload 0
      // 32: ldc_w "Dropping frame - Not initialized or already released."
      // 35: invokespecial com/discord/media/engine/video/egl_renderer/EglRenderer.logD (Ljava/lang/String;)V
      // 38: aload 4
      // 3a: monitorexit
      // 3b: return
      // 3c: astore 1
      // 3d: goto b1
      // 40: aload 0
      // 41: getfield com/discord/media/engine/video/egl_renderer/EglRenderer.frameLock Ljava/lang/Object;
      // 44: astore 5
      // 46: aload 5
      // 48: monitorenter
      // 49: aload 0
      // 4a: getfield com/discord/media/engine/video/egl_renderer/EglRenderer.pendingFrame Lorg/webrtc/VideoFrame;
      // 4d: astore 7
      // 4f: aload 7
      // 51: ifnull 62
      // 54: aload 7
      // 56: invokevirtual org/webrtc/VideoFrame.release ()V
      // 59: bipush 1
      // 5a: istore 3
      // 5b: goto 64
      // 5e: astore 1
      // 5f: goto ac
      // 62: bipush 0
      // 63: istore 3
      // 64: aload 1
      // 65: invokevirtual org/webrtc/VideoFrame.retain ()V
      // 68: aload 0
      // 69: aload 1
      // 6a: putfield com/discord/media/engine/video/egl_renderer/EglRenderer.pendingFrame Lorg/webrtc/VideoFrame;
      // 6d: aload 0
      // 6e: iload 2
      // 6f: putfield com/discord/media/engine/video/egl_renderer/EglRenderer.pendingFrameMirror Z
      // 72: new com/discord/media/engine/video/egl_renderer/b
      // 75: astore 1
      // 76: aload 1
      // 77: aload 0
      // 78: invokespecial com/discord/media/engine/video/egl_renderer/b.<init> (Lcom/discord/media/engine/video/egl_renderer/EglRenderer;)V
      // 7b: aload 6
      // 7d: aload 1
      // 7e: invokevirtual android/os/Handler.post (Ljava/lang/Runnable;)Z
      // 81: pop
      // 82: aload 5
      // 84: monitorexit
      // 85: aload 4
      // 87: monitorexit
      // 88: iload 3
      // 89: ifeq ab
      // 8c: aload 0
      // 8d: getfield com/discord/media/engine/video/egl_renderer/EglRenderer.statisticsLock Ljava/lang/Object;
      // 90: astore 4
      // 92: aload 4
      // 94: monitorenter
      // 95: aload 0
      // 96: aload 0
      // 97: getfield com/discord/media/engine/video/egl_renderer/EglRenderer.framesDropped I
      // 9a: bipush 1
      // 9b: iadd
      // 9c: putfield com/discord/media/engine/video/egl_renderer/EglRenderer.framesDropped I
      // 9f: aload 4
      // a1: monitorexit
      // a2: goto ab
      // a5: astore 1
      // a6: aload 4
      // a8: monitorexit
      // a9: aload 1
      // aa: athrow
      // ab: return
      // ac: aload 5
      // ae: monitorexit
      // af: aload 1
      // b0: athrow
      // b1: aload 4
      // b3: monitorexit
      // b4: aload 1
      // b5: athrow
      // b6: astore 1
      // b7: aload 4
      // b9: monitorexit
      // ba: aload 1
      // bb: athrow
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
      //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.removeExceptionInstructionsEx(FinallyProcessor.java:1064)
      //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.verifyFinallyEx(FinallyProcessor.java:565)
      //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.iterateGraph(FinallyProcessor.java:90)
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
      // 3f: new com/discord/media/engine/video/egl_renderer/d
      // 42: astore 6
      // 44: aload 6
      // 46: aload 0
      // 47: aload 4
      // 49: invokespecial com/discord/media/engine/video/egl_renderer/d.<init> (Lcom/discord/media/engine/video/egl_renderer/EglRenderer;Ljava/util/concurrent/CountDownLatch;)V
      // 4c: aload 5
      // 4e: aload 6
      // 50: invokevirtual android/os/Handler.postAtFrontOfQueue (Ljava/lang/Runnable;)Z
      // 53: pop
      // 54: aload 5
      // 56: invokevirtual android/os/Handler.getLooper ()Landroid/os/Looper;
      // 59: astore 7
      // 5b: aload 7
      // 5d: ldc_w "getLooper(...)"
      // 60: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 63: new com/discord/media/engine/video/egl_renderer/e
      // 66: astore 6
      // 68: aload 6
      // 6a: aload 0
      // 6b: aload 7
      // 6d: invokespecial com/discord/media/engine/video/egl_renderer/e.<init> (Lcom/discord/media/engine/video/egl_renderer/EglRenderer;Landroid/os/Looper;)V
      // 70: aload 5
      // 72: aload 6
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
      //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.removeExceptionInstructionsEx(FinallyProcessor.java:1064)
      //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.verifyFinallyEx(FinallyProcessor.java:565)
      //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.iterateGraph(FinallyProcessor.java:90)
      //
      // Bytecode:
      // 00: aload 1
      // 01: ldc_w "completionCallback"
      // 04: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
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
      // 1a: astore 4
      // 1c: aload 4
      // 1e: ifnull 42
      // 21: aload 4
      // 23: aload 0
      // 24: getfield com/discord/media/engine/video/egl_renderer/EglRenderer.eglSurfaceCreationRunnable Lcom/discord/media/engine/video/egl_renderer/EglRenderer$EglSurfaceCreation;
      // 27: invokevirtual android/os/Handler.removeCallbacks (Ljava/lang/Runnable;)V
      // 2a: new com/discord/media/engine/video/egl_renderer/a
      // 2d: astore 3
      // 2e: aload 3
      // 2f: aload 0
      // 30: aload 1
      // 31: invokespecial com/discord/media/engine/video/egl_renderer/a.<init> (Lcom/discord/media/engine/video/egl_renderer/EglRenderer;Lkotlin/jvm/functions/Function0;)V
      // 34: aload 4
      // 36: aload 3
      // 37: invokevirtual android/os/Handler.postAtFrontOfQueue (Ljava/lang/Runnable;)Z
      // 3a: pop
      // 3b: aload 2
      // 3c: monitorexit
      // 3d: return
      // 3e: astore 1
      // 3f: goto 4c
      // 42: aload 2
      // 43: monitorexit
      // 44: aload 1
      // 45: invokeinterface kotlin/jvm/functions/Function0.invoke ()Ljava/lang/Object; 1
      // 4a: pop
      // 4b: return
      // 4c: aload 2
      // 4d: monitorexit
      // 4e: aload 1
      // 4f: athrow
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
      //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.removeExceptionInstructionsEx(FinallyProcessor.java:1064)
      //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.verifyFinallyEx(FinallyProcessor.java:565)
      //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.iterateGraph(FinallyProcessor.java:90)
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
      //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.removeExceptionInstructionsEx(FinallyProcessor.java:1064)
      //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.verifyFinallyEx(FinallyProcessor.java:565)
      //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.iterateGraph(FinallyProcessor.java:90)
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
      private const val TAG: String
      private const val LOG_INTERVAL_MS: Long
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
         // 40: goto 8d
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
         // 67: astore 4
         // 69: new java/lang/StringBuilder
         // 6c: astore 3
         // 6d: aload 3
         // 6e: invokespecial java/lang/StringBuilder.<init> ()V
         // 71: aload 3
         // 72: ldc "Invalid surface: "
         // 74: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
         // 77: pop
         // 78: aload 3
         // 79: aload 2
         // 7a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
         // 7d: pop
         // 7e: aload 4
         // 80: aload 3
         // 81: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
         // 84: invokevirtual java/lang/Object.toString ()Ljava/lang/String;
         // 87: invokespecial java/lang/IllegalStateException.<init> (Ljava/lang/String;)V
         // 8a: aload 4
         // 8c: athrow
         // 8d: aload 0
         // 8e: monitorexit
         // 8f: aload 2
         // 90: athrow
      }

      public fun setSurface(surface: Any?) {
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
         // 0: aload 0
         // 1: monitorenter
         // 2: aload 0
         // 3: aload 1
         // 4: putfield com/discord/media/engine/video/egl_renderer/EglRenderer$EglSurfaceCreation.surface Ljava/lang/Object;
         // 7: aload 0
         // 8: monitorexit
         // 9: return
         // a: astore 1
         // b: aload 0
         // c: monitorexit
         // d: aload 1
         // e: athrow
      }
   }
}

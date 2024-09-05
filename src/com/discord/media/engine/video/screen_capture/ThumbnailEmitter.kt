package com.discord.media.engine.video.screen_capture

import android.graphics.Bitmap
import android.graphics.Matrix
import android.graphics.Bitmap.Config
import android.opengl.GLES20
import java.nio.Buffer
import java.nio.ByteBuffer
import kotlin.jvm.internal.q
import org.webrtc.GlRectDrawer
import org.webrtc.GlTextureFrameBuffer
import org.webrtc.GlUtil
import org.webrtc.JniCommon
import org.webrtc.VideoFrame
import org.webrtc.VideoFrameDrawer

internal class ThumbnailEmitter(width: Int, height: Int, periodMs: Long, onNextThumbnail: (Bitmap) -> Unit) {
   private final val frameDrawer: VideoFrameDrawer
   private final val height: Int
   private final var lastTimestampNs: Long
   private final val onNextThumbnail: (Bitmap) -> Unit
   private final val outputByteBuffer: ByteBuffer
   private final val periodNs: Long
   private final val rectDrawer: GlRectDrawer
   private final var released: Boolean
   private final val width: Int

   @JvmStatic
   fun {
      val var0: Matrix = new Matrix();
      var0.preTranslate(0.5F, 0.5F);
      var0.preScale(1.0F, -1.0F);
      var0.preTranslate(-0.5F, -0.5F);
      renderMatrix = var0;
   }

   init {
      q.h(var5, "onNextThumbnail");
      super();
      this.width = var1;
      this.height = var2;
      this.onNextThumbnail = var5;
      this.outputByteBuffer = JniCommon.nativeAllocateByteBuffer(var1 * var2 * 4);
      this.rectDrawer = new GlRectDrawer();
      this.frameDrawer = new VideoFrameDrawer();
      var3 = ThumbnailEmitter.Companion.access$toNanoSeconds(Companion, var3);
      this.periodNs = var3;
      this.lastTimestampNs = -var3;
   }

   private fun createThumbnail(frame: VideoFrame): Bitmap {
      val var8: GlTextureFrameBuffer = new GlTextureFrameBuffer(6408);
      var8.setSize(this.width, this.height);
      GLES20.glBindFramebuffer(36160, var8.getFrameBufferId());
      GlUtil.checkNoGLES2Error("glBindFramebuffer");
      GLES20.glClearColor(0.0F, 0.0F, 0.0F, 1.0F);
      GLES20.glClear(16384);
      val var3: Float = var1.getRotatedWidth();
      val var5: Float = var1.getRotatedHeight();
      if (var3 / var5 < (float)this.width / this.height) {
         val var10: Float = var3 * (this.height / var5);
         this.frameDrawer
            .drawFrame(
               var1, this.rectDrawer, renderMatrix, kk.a.b(((float)this.width - var3 * ((float)this.height / var5)) / 2.0F), 0, kk.a.b(var10), this.height
            );
      } else {
         val var11: Float = var5 * (this.width / var3);
         this.frameDrawer
            .drawFrame(
               var1, this.rectDrawer, renderMatrix, 0, kk.a.b(((float)this.height - var5 * ((float)this.width / var3)) / 2.0F), this.width, kk.a.b(var11)
            );
      }

      ((Buffer)this.outputByteBuffer).rewind();
      GLES20.glReadPixels(0, 0, var8.getWidth(), var8.getHeight(), 6408, 5121, this.outputByteBuffer);
      GlUtil.checkNoGLES2Error("ThumbnailEmitter.createThumbnail");
      var8.release();
      ((Buffer)this.outputByteBuffer).rewind();
      val var9: Bitmap = Bitmap.createBitmap(this.width, this.height, Config.ARGB_8888);
      q.g(var9, "createBitmap(...)");
      var9.copyPixelsFromBuffer(this.outputByteBuffer);
      return var9;
   }

   public fun onFrame(frame: VideoFrame) {
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
      // 03: ldc "frame"
      // 05: invokestatic kotlin/jvm/internal/q.h (Ljava/lang/Object;Ljava/lang/String;)V
      // 08: aload 0
      // 09: getfield com/discord/media/engine/video/screen_capture/ThumbnailEmitter.released Z
      // 0c: istore 4
      // 0e: iload 4
      // 10: ifeq 16
      // 13: aload 0
      // 14: monitorexit
      // 15: return
      // 16: aload 1
      // 17: invokevirtual org/webrtc/VideoFrame.getTimestampNs ()J
      // 1a: lstore 2
      // 1b: lload 2
      // 1c: aload 0
      // 1d: getfield com/discord/media/engine/video/screen_capture/ThumbnailEmitter.lastTimestampNs J
      // 20: lsub
      // 21: aload 0
      // 22: getfield com/discord/media/engine/video/screen_capture/ThumbnailEmitter.periodNs J
      // 25: lcmp
      // 26: ifle 44
      // 29: aload 0
      // 2a: lload 2
      // 2b: putfield com/discord/media/engine/video/screen_capture/ThumbnailEmitter.lastTimestampNs J
      // 2e: aload 0
      // 2f: getfield com/discord/media/engine/video/screen_capture/ThumbnailEmitter.onNextThumbnail Lkotlin/jvm/functions/Function1;
      // 32: aload 0
      // 33: aload 1
      // 34: invokespecial com/discord/media/engine/video/screen_capture/ThumbnailEmitter.createThumbnail (Lorg/webrtc/VideoFrame;)Landroid/graphics/Bitmap;
      // 37: invokeinterface kotlin/jvm/functions/Function1.invoke (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 3c: pop
      // 3d: goto 44
      // 40: astore 1
      // 41: goto 47
      // 44: aload 0
      // 45: monitorexit
      // 46: return
      // 47: aload 0
      // 48: monitorexit
      // 49: aload 1
      // 4a: athrow
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
      // 01: monitorenter
      // 02: aload 0
      // 03: getfield com/discord/media/engine/video/screen_capture/ThumbnailEmitter.released Z
      // 06: istore 1
      // 07: iload 1
      // 08: ifeq 0e
      // 0b: aload 0
      // 0c: monitorexit
      // 0d: return
      // 0e: aload 0
      // 0f: bipush 1
      // 10: putfield com/discord/media/engine/video/screen_capture/ThumbnailEmitter.released Z
      // 13: aload 0
      // 14: getfield com/discord/media/engine/video/screen_capture/ThumbnailEmitter.frameDrawer Lorg/webrtc/VideoFrameDrawer;
      // 17: invokevirtual org/webrtc/VideoFrameDrawer.release ()V
      // 1a: aload 0
      // 1b: getfield com/discord/media/engine/video/screen_capture/ThumbnailEmitter.rectDrawer Lorg/webrtc/GlRectDrawer;
      // 1e: invokevirtual org/webrtc/GlRectDrawer.release ()V
      // 21: aload 0
      // 22: getfield com/discord/media/engine/video/screen_capture/ThumbnailEmitter.outputByteBuffer Ljava/nio/ByteBuffer;
      // 25: invokestatic org/webrtc/JniCommon.nativeFreeByteBuffer (Ljava/nio/ByteBuffer;)V
      // 28: aload 0
      // 29: monitorexit
      // 2a: return
      // 2b: astore 2
      // 2c: aload 0
      // 2d: monitorexit
      // 2e: aload 2
      // 2f: athrow
   }

   public companion object {
      private final val renderMatrix: Matrix

      private fun toNanoSeconds(milliseconds: Long): Long {
         return var1 * 1000 * 1000;
      }
   }
}

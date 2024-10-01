package com.discord.media.engine.video.texture_view

import android.graphics.SurfaceTexture
import android.view.TextureView.SurfaceTextureListener
import com.discord.logging.Log
import com.discord.media.engine.types.Debug
import com.discord.media.engine.video.egl_renderer.EglRenderer
import com.discord.media.engine.video.egl_renderer.ErrorCallback
import com.discord.misc.utilities.threading.ThreadUtilsKt
import java.util.Arrays
import java.util.Locale
import java.util.concurrent.CountDownLatch
import java.util.concurrent.atomic.AtomicInteger
import kotlin.jvm.functions.Function0
import kotlin.jvm.internal.l0
import kotlin.jvm.internal.q
import org.webrtc.ThreadUtils
import org.webrtc.VideoFrame
import org.webrtc.RendererCommon.RendererEvents

internal class TextureViewEglRenderer(name: String) : EglRenderer, SurfaceTextureListener, ErrorCallback {
   private final var frameRotation: Int
   private final var isFirstFrameRendered: Boolean
   private final val layoutLock: Any
   private final var rendererEvents: RendererEvents?
   private final var rotatedFrameHeight: Int
   private final var rotatedFrameWidth: Int
   private final var surfaceTextureFrameCount: Int
   private final var webRtcFrameCount: Int

   init {
      q.h(var1, "name");
      super(var1);
      this.layoutLock = new Object();
   }

   private fun debugOnFrame() {
      val var1: Int = this.webRtcFrameCount + 1;
      this.webRtcFrameCount += 1;
      if (var1 % 100 == 0) {
         val var2: Debug = Debug.INSTANCE;
         this.getName();
      }
   }

   private fun updateFrameDimensionsAndReportEvents(frame: VideoFrame) {
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
      // 01: getfield com/discord/media/engine/video/texture_view/TextureViewEglRenderer.layoutLock Ljava/lang/Object;
      // 04: astore 2
      // 05: aload 2
      // 06: monitorenter
      // 07: aload 0
      // 08: getfield com/discord/media/engine/video/texture_view/TextureViewEglRenderer.isFirstFrameRendered Z
      // 0b: ifne 29
      // 0e: aload 0
      // 0f: bipush 1
      // 10: putfield com/discord/media/engine/video/texture_view/TextureViewEglRenderer.isFirstFrameRendered Z
      // 13: aload 0
      // 14: getfield com/discord/media/engine/video/texture_view/TextureViewEglRenderer.rendererEvents Lorg/webrtc/RendererCommon$RendererEvents;
      // 17: astore 3
      // 18: aload 3
      // 19: ifnull 29
      // 1c: aload 3
      // 1d: invokeinterface org/webrtc/RendererCommon$RendererEvents.onFirstFrameRendered ()V 1
      // 22: goto 29
      // 25: astore 1
      // 26: goto 8e
      // 29: aload 0
      // 2a: getfield com/discord/media/engine/video/texture_view/TextureViewEglRenderer.rotatedFrameWidth I
      // 2d: aload 1
      // 2e: invokevirtual org/webrtc/VideoFrame.getRotatedWidth ()I
      // 31: if_icmpne 4a
      // 34: aload 0
      // 35: getfield com/discord/media/engine/video/texture_view/TextureViewEglRenderer.rotatedFrameHeight I
      // 38: aload 1
      // 39: invokevirtual org/webrtc/VideoFrame.getRotatedHeight ()I
      // 3c: if_icmpne 4a
      // 3f: aload 0
      // 40: getfield com/discord/media/engine/video/texture_view/TextureViewEglRenderer.frameRotation I
      // 43: aload 1
      // 44: invokevirtual org/webrtc/VideoFrame.getRotation ()I
      // 47: if_icmpeq 87
      // 4a: aload 0
      // 4b: getfield com/discord/media/engine/video/texture_view/TextureViewEglRenderer.rendererEvents Lorg/webrtc/RendererCommon$RendererEvents;
      // 4e: astore 3
      // 4f: aload 3
      // 50: ifnull 6f
      // 53: aload 3
      // 54: aload 1
      // 55: invokevirtual org/webrtc/VideoFrame.getBuffer ()Lorg/webrtc/VideoFrame$Buffer;
      // 58: invokeinterface org/webrtc/VideoFrame$Buffer.getWidth ()I 1
      // 5d: aload 1
      // 5e: invokevirtual org/webrtc/VideoFrame.getBuffer ()Lorg/webrtc/VideoFrame$Buffer;
      // 61: invokeinterface org/webrtc/VideoFrame$Buffer.getHeight ()I 1
      // 66: aload 1
      // 67: invokevirtual org/webrtc/VideoFrame.getRotation ()I
      // 6a: invokeinterface org/webrtc/RendererCommon$RendererEvents.onFrameResolutionChanged (III)V 4
      // 6f: aload 0
      // 70: aload 1
      // 71: invokevirtual org/webrtc/VideoFrame.getRotatedWidth ()I
      // 74: putfield com/discord/media/engine/video/texture_view/TextureViewEglRenderer.rotatedFrameWidth I
      // 77: aload 0
      // 78: aload 1
      // 79: invokevirtual org/webrtc/VideoFrame.getRotatedHeight ()I
      // 7c: putfield com/discord/media/engine/video/texture_view/TextureViewEglRenderer.rotatedFrameHeight I
      // 7f: aload 0
      // 80: aload 1
      // 81: invokevirtual org/webrtc/VideoFrame.getRotation ()I
      // 84: putfield com/discord/media/engine/video/texture_view/TextureViewEglRenderer.frameRotation I
      // 87: getstatic kotlin/Unit.a Lkotlin/Unit;
      // 8a: astore 1
      // 8b: aload 2
      // 8c: monitorexit
      // 8d: return
      // 8e: aload 2
      // 8f: monitorexit
      // 90: aload 1
      // 91: athrow
   }

   public fun initialize(rendererEvents: RendererEvents) {
      q.h(var1, "rendererEvents");
      label15:
      if (ThreadUtilsKt.isOnMainThread()) {
         access$setRendererEvents$p(this, var1);
         val var6: Any = access$getLayoutLock$p(this);
         synchronized (var6){} // $VF: monitorenter 

         try {
            access$setFirstFrameRendered$p(this, false);
            access$setRotatedFrameWidth$p(this, 0);
            access$setRotatedFrameHeight$p(this, 0);
            access$setFrameRotation$p(this, 0);
         } catch (var3: java.lang.Throwable) {
            // $VF: monitorexit
         }

         // $VF: monitorexit
      } else {
         val var5: Thread = Thread.currentThread();
         val var2: StringBuilder = new StringBuilder();
         var2.append("Expected to be on android main thread. Current: ");
         var2.append(var5);
         throw new IllegalStateException(var2.toString().toString());
      }
   }

   public override fun onFrame(frame: VideoFrame) {
      q.h(var1, "frame");
      this.updateFrameDimensionsAndReportEvents(var1);
      super.onFrame(var1);
   }

   public override fun onGlOutOfMemory() {
      Log.e$default(Log.INSTANCE, this.getName(), "onGlOutOfMemory on render thread", null, 4, null);
   }

   public open fun onSurfaceTextureAvailable(surface: SurfaceTexture, width: Int, height: Int) {
      q.h(var1, "surface");
      if (ThreadUtilsKt.isOnMainThread()) {
         val var9: Log = Log.INSTANCE;
         val var5: java.lang.String = access$getName(this);
         var2 = access$getCount$cp().incrementAndGet();
         val var6: StringBuilder = new StringBuilder();
         var6.append("createEglSurface (");
         var6.append(var2);
         var6.append(" total)");
         Log.i$default(var9, var5, var6.toString(), null, 4, null);
         this.createEglSurface(var1);
      } else {
         val var4: Thread = Thread.currentThread();
         val var7: StringBuilder = new StringBuilder();
         var7.append("Expected to be on android main thread. Current: ");
         var7.append(var4);
         throw new IllegalStateException(var7.toString().toString());
      }
   }

   public open fun onSurfaceTextureDestroyed(surface: SurfaceTexture): Boolean {
      q.h(var1, "surface");
      if (ThreadUtilsKt.isOnMainThread()) {
         val var5: Long = System.currentTimeMillis();
         val var10: CountDownLatch = new CountDownLatch(1);
         this.releaseEglSurface(new Function0(var10) {
            final CountDownLatch $completionLatch;

            {
               super(0);
               this.$completionLatch = var1;
            }

            public final void invoke() {
               this.$completionLatch.countDown();
            }
         });
         ThreadUtils.awaitUninterruptibly(var10, java.lang.Long.MAX_VALUE);
         val var3: Long = System.currentTimeMillis();
         val var12: Log = Log.INSTANCE;
         val var11: java.lang.String = access$getName(this);
         val var2: Int = access$getCount$cp().decrementAndGet();
         val var8: StringBuilder = new StringBuilder();
         var8.append("releaseEglSurface (");
         var8.append(var3 - var5);
         var8.append(" ms) (");
         var8.append(var2);
         var8.append(" total)");
         Log.i$default(var12, var11, var8.toString(), null, 4, null);
         return true;
      } else {
         val var9: Thread = Thread.currentThread();
         val var7: StringBuilder = new StringBuilder();
         var7.append("Expected to be on android main thread. Current: ");
         var7.append(var9);
         throw new IllegalStateException(var7.toString().toString());
      }
   }

   public open fun onSurfaceTextureSizeChanged(surface: SurfaceTexture, w: Int, h: Int) {
      q.h(var1, "surface");
   }

   public open fun onSurfaceTextureUpdated(surface: SurfaceTexture) {
      q.h(var1, "surface");
   }

   public companion object {
      private final val count: AtomicInteger

      private fun Float.toNiceString(): String {
         val var2: l0 = l0.a;
         val var3: java.lang.String = java.lang.String.format(Locale.getDefault(), "%.3f", Arrays.copyOf(new Object[]{var1}, 1));
         q.g(var3, "format(...)");
         return var3;
      }
   }
}

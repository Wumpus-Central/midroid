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
import kotlin.jvm.internal.m0
import kotlin.jvm.internal.r
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
      r.h(var1, "name");
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
      //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.removeExceptionInstructionsEx(FinallyProcessor.java:1054)
      //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.verifyFinallyEx(FinallyProcessor.java:555)
      //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.iterateGraph(FinallyProcessor.java:91)
      //
      // Bytecode:
      // 00: aload 0
      // 01: getfield com/discord/media/engine/video/texture_view/TextureViewEglRenderer.layoutLock Ljava/lang/Object;
      // 04: astore 2
      // 05: aload 2
      // 06: monitorenter
      // 07: aload 0
      // 08: getfield com/discord/media/engine/video/texture_view/TextureViewEglRenderer.isFirstFrameRendered Z
      // 0b: ifne 22
      // 0e: aload 0
      // 0f: bipush 1
      // 10: putfield com/discord/media/engine/video/texture_view/TextureViewEglRenderer.isFirstFrameRendered Z
      // 13: aload 0
      // 14: getfield com/discord/media/engine/video/texture_view/TextureViewEglRenderer.rendererEvents Lorg/webrtc/RendererCommon$RendererEvents;
      // 17: astore 3
      // 18: aload 3
      // 19: ifnull 22
      // 1c: aload 3
      // 1d: invokeinterface org/webrtc/RendererCommon$RendererEvents.onFirstFrameRendered ()V 1
      // 22: aload 0
      // 23: getfield com/discord/media/engine/video/texture_view/TextureViewEglRenderer.rotatedFrameWidth I
      // 26: aload 1
      // 27: invokevirtual org/webrtc/VideoFrame.getRotatedWidth ()I
      // 2a: if_icmpne 43
      // 2d: aload 0
      // 2e: getfield com/discord/media/engine/video/texture_view/TextureViewEglRenderer.rotatedFrameHeight I
      // 31: aload 1
      // 32: invokevirtual org/webrtc/VideoFrame.getRotatedHeight ()I
      // 35: if_icmpne 43
      // 38: aload 0
      // 39: getfield com/discord/media/engine/video/texture_view/TextureViewEglRenderer.frameRotation I
      // 3c: aload 1
      // 3d: invokevirtual org/webrtc/VideoFrame.getRotation ()I
      // 40: if_icmpeq 80
      // 43: aload 0
      // 44: getfield com/discord/media/engine/video/texture_view/TextureViewEglRenderer.rendererEvents Lorg/webrtc/RendererCommon$RendererEvents;
      // 47: astore 3
      // 48: aload 3
      // 49: ifnull 68
      // 4c: aload 3
      // 4d: aload 1
      // 4e: invokevirtual org/webrtc/VideoFrame.getBuffer ()Lorg/webrtc/VideoFrame$Buffer;
      // 51: invokeinterface org/webrtc/VideoFrame$Buffer.getWidth ()I 1
      // 56: aload 1
      // 57: invokevirtual org/webrtc/VideoFrame.getBuffer ()Lorg/webrtc/VideoFrame$Buffer;
      // 5a: invokeinterface org/webrtc/VideoFrame$Buffer.getHeight ()I 1
      // 5f: aload 1
      // 60: invokevirtual org/webrtc/VideoFrame.getRotation ()I
      // 63: invokeinterface org/webrtc/RendererCommon$RendererEvents.onFrameResolutionChanged (III)V 4
      // 68: aload 0
      // 69: aload 1
      // 6a: invokevirtual org/webrtc/VideoFrame.getRotatedWidth ()I
      // 6d: putfield com/discord/media/engine/video/texture_view/TextureViewEglRenderer.rotatedFrameWidth I
      // 70: aload 0
      // 71: aload 1
      // 72: invokevirtual org/webrtc/VideoFrame.getRotatedHeight ()I
      // 75: putfield com/discord/media/engine/video/texture_view/TextureViewEglRenderer.rotatedFrameHeight I
      // 78: aload 0
      // 79: aload 1
      // 7a: invokevirtual org/webrtc/VideoFrame.getRotation ()I
      // 7d: putfield com/discord/media/engine/video/texture_view/TextureViewEglRenderer.frameRotation I
      // 80: getstatic kotlin/Unit.a Lkotlin/Unit;
      // 83: astore 1
      // 84: aload 2
      // 85: monitorexit
      // 86: return
      // 87: astore 1
      // 88: aload 2
      // 89: monitorexit
      // 8a: aload 1
      // 8b: athrow
   }

   public fun initialize(rendererEvents: RendererEvents) {
      r.h(var1, "rendererEvents");
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
         val var2: Thread = Thread.currentThread();
         val var5: StringBuilder = new StringBuilder();
         var5.append("Expected to be on android main thread. Current: ");
         var5.append(var2);
         throw new IllegalStateException(var5.toString().toString());
      }
   }

   public override fun onFrame(frame: VideoFrame) {
      r.h(var1, "frame");
      this.updateFrameDimensionsAndReportEvents(var1);
      super.onFrame(var1);
   }

   public override fun onGlOutOfMemory() {
      Log.e$default(Log.INSTANCE, this.getName(), "onGlOutOfMemory on render thread", null, 4, null);
   }

   public open fun onSurfaceTextureAvailable(surface: SurfaceTexture, width: Int, height: Int) {
      r.h(var1, "surface");
      if (ThreadUtilsKt.isOnMainThread()) {
         val var9: Log = Log.INSTANCE;
         val var6: java.lang.String = access$getName(this);
         var2 = access$getCount$cp().incrementAndGet();
         val var5: StringBuilder = new StringBuilder();
         var5.append("createEglSurface (");
         var5.append(var2);
         var5.append(" total)");
         Log.i$default(var9, var6, var5.toString(), null, 4, null);
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
      r.h(var1, "surface");
      if (ThreadUtilsKt.isOnMainThread()) {
         val var5: Long = System.currentTimeMillis();
         val var10: CountDownLatch = new CountDownLatch(1);
         this.releaseEglSurface(new Function0<Unit>(var10) {
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
         val var11: Log = Log.INSTANCE;
         val var8: java.lang.String = access$getName(this);
         val var2: Int = access$getCount$cp().decrementAndGet();
         val var12: StringBuilder = new StringBuilder();
         var12.append("releaseEglSurface (");
         var12.append(var3 - var5);
         var12.append(" ms) (");
         var12.append(var2);
         var12.append(" total)");
         Log.i$default(var11, var8, var12.toString(), null, 4, null);
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
      r.h(var1, "surface");
   }

   public open fun onSurfaceTextureUpdated(surface: SurfaceTexture) {
      r.h(var1, "surface");
   }

   public companion object {
      private final val count: AtomicInteger

      private fun Float.toNiceString(): String {
         val var2: m0 = m0.a;
         val var3: java.lang.String = java.lang.String.format(Locale.getDefault(), "%.3f", Arrays.copyOf(new Object[]{var1}, 1));
         r.g(var3, "format(locale, format, *args)");
         return var3;
      }
   }
}

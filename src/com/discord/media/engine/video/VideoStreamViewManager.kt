package com.discord.media.engine.video

import android.view.View
import com.discord.media.engine.video.events.OnReadyEvent
import com.discord.media.engine.video.events.OnSizeEvent
import com.discord.media.engine.video.texture_view.VideoStreamTextureView
import com.discord.reactevents.ReactEvents
import com.facebook.react.module.annotations.ReactModule
import com.facebook.react.uimanager.SimpleViewManager
import com.facebook.react.uimanager.ThemedReactContext
import com.facebook.react.uimanager.annotations.ReactProp
import com.facebook.react.viewmanagers.DCDVideoRendererManagerDelegate
import com.facebook.react.viewmanagers.DCDVideoRendererManagerInterface
import kotlin.jvm.internal.r
import org.webrtc.RendererCommon

@ReactModule(name = "DCDVideoRenderer")
public class VideoStreamViewManager : SimpleViewManager<VideoStreamTextureView>, DCDVideoRendererManagerInterface<VideoStreamTextureView> {
   private final val delegate: DCDVideoRendererManagerDelegate<VideoStreamTextureView, VideoStreamViewManager> = new DCDVideoRendererManagerDelegate(this)

   protected open fun createViewInstance(reactContext: ThemedReactContext): VideoStreamTextureView {
      r.h(var1, "reactContext");
      return new VideoStreamTextureView(var1, null, 2, null);
   }

   protected open fun getDelegate(): DCDVideoRendererManagerDelegate<VideoStreamTextureView, VideoStreamViewManager> {
      return this.delegate;
   }

   public open fun getExportedCustomDirectEventTypeConstants(): MutableMap<String, Any> {
      return reactEvents.exportEventConstants();
   }

   public open fun getName(): String {
      return "DCDVideoRenderer";
   }

   public open fun onDropViewInstance(view: VideoStreamTextureView) {
      r.h(var1, "view");
      this.setStreamId(var1, null);
   }

   @ReactProp(name = "streamId")
   public open fun setStreamId(view: VideoStreamTextureView, value: String?) {
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
      // 01: ldc "view"
      // 03: invokestatic kotlin/jvm/internal/r.h (Ljava/lang/Object;Ljava/lang/String;)V
      // 06: aload 2
      // 07: ifnull 1a
      // 0a: aload 1
      // 0b: aload 2
      // 0c: new com/discord/media/engine/video/VideoStreamViewManager$RenderListener
      // 0f: dup
      // 10: aload 1
      // 11: invokespecial com/discord/media/engine/video/VideoStreamViewManager$RenderListener.<init> (Landroid/view/View;)V
      // 14: invokevirtual com/discord/media/engine/video/texture_view/VideoStreamTextureView.startRenderingStream (Ljava/lang/String;Lorg/webrtc/RendererCommon$RendererEvents;)V
      // 17: goto 1e
      // 1a: aload 1
      // 1b: invokevirtual com/discord/media/engine/video/texture_view/VideoStreamTextureView.reset ()V
      // 1e: aload 0
      // 1f: monitorenter
      // 20: aload 1
      // 21: invokevirtual android/view/View.getContext ()Landroid/content/Context;
      // 24: astore 1
      // 25: aload 1
      // 26: ldc "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext"
      // 28: invokestatic kotlin/jvm/internal/r.f (Ljava/lang/Object;Ljava/lang/String;)V
      // 2b: aload 1
      // 2c: checkcast com/facebook/react/bridge/ReactContext
      // 2f: invokevirtual com/facebook/react/bridge/ReactContext.getCurrentActivity ()Landroid/app/Activity;
      // 32: astore 2
      // 33: aload 2
      // 34: ifnull 5e
      // 37: getstatic com/discord/media/engine/video/AttachedVideoSinks.INSTANCE Lcom/discord/media/engine/video/AttachedVideoSinks;
      // 3a: astore 1
      // 3b: aload 1
      // 3c: invokevirtual com/discord/media/engine/video/AttachedVideoSinks.anySinksActive ()Z
      // 3f: ifeq 4e
      // 42: getstatic com/discord/wakelock/ScreenWakeLock.INSTANCE Lcom/discord/wakelock/ScreenWakeLock;
      // 45: aload 2
      // 46: ldc "DCDVideoRenderer"
      // 48: invokevirtual com/discord/wakelock/ScreenWakeLock.requestLock (Landroid/app/Activity;Ljava/lang/String;)V
      // 4b: goto 5e
      // 4e: aload 1
      // 4f: invokevirtual com/discord/media/engine/video/AttachedVideoSinks.anySinksActive ()Z
      // 52: ifne 5e
      // 55: getstatic com/discord/wakelock/ScreenWakeLock.INSTANCE Lcom/discord/wakelock/ScreenWakeLock;
      // 58: aload 2
      // 59: ldc "DCDVideoRenderer"
      // 5b: invokevirtual com/discord/wakelock/ScreenWakeLock.releaseLock (Landroid/app/Activity;Ljava/lang/String;)V
      // 5e: getstatic kotlin/Unit.a Lkotlin/Unit;
      // 61: astore 1
      // 62: aload 0
      // 63: monitorexit
      // 64: return
      // 65: astore 1
      // 66: aload 0
      // 67: monitorexit
      // 68: aload 1
      // 69: athrow
   }

   public companion object {
      public const val NAME: String
      public const val WAKE_LOCK_KEY: String
      private final val reactEvents: ReactEvents
   }

   private class RenderListener(view: View) : RendererCommon.RendererEvents {
      private final val view: View

      init {
         r.h(var1, "view");
         super();
         this.view = var1;
      }

      public override fun onFirstFrameRendered() {
         VideoStreamViewManager.access$getReactEvents$cp().emitEvent(this.view, new OnReadyEvent());
      }

      public override fun onFrameResolutionChanged(width: Int, height: Int, rotation: Int) {
         val var4: Int = var3 % 180;
         if (var3 % 180 == 0) {
            var3 = var1;
         } else {
            var3 = var2;
         }

         if (var4 == 0) {
            var1 = var2;
         }

         VideoStreamViewManager.access$getReactEvents$cp().emitEvent(this.view, new OnSizeEvent(var3, var1));
      }
   }
}

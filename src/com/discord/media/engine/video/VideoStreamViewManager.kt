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
import kotlin.jvm.internal.q
import org.webrtc.RendererCommon.RendererEvents

@ReactModule(name = "DCDVideoRenderer")
public class VideoStreamViewManager : SimpleViewManager<VideoStreamTextureView>, DCDVideoRendererManagerInterface<VideoStreamTextureView> {
   private final val delegate: DCDVideoRendererManagerDelegate<VideoStreamTextureView, VideoStreamViewManager> = new DCDVideoRendererManagerDelegate(this)

   protected open fun createViewInstance(reactContext: ThemedReactContext): VideoStreamTextureView {
      q.h(var1, "reactContext");
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
      q.h(var1, "view");
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
      // 03: invokestatic kotlin/jvm/internal/q.h (Ljava/lang/Object;Ljava/lang/String;)V
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
      // 28: invokestatic kotlin/jvm/internal/q.f (Ljava/lang/Object;Ljava/lang/String;)V
      // 2b: aload 1
      // 2c: checkcast com/facebook/react/bridge/ReactContext
      // 2f: invokevirtual com/facebook/react/bridge/ReactContext.getCurrentActivity ()Landroid/app/Activity;
      // 32: astore 1
      // 33: aload 1
      // 34: ifnull 62
      // 37: getstatic com/discord/media/engine/video/AttachedVideoSinks.INSTANCE Lcom/discord/media/engine/video/AttachedVideoSinks;
      // 3a: astore 2
      // 3b: aload 2
      // 3c: invokevirtual com/discord/media/engine/video/AttachedVideoSinks.anySinksActive ()Z
      // 3f: ifeq 52
      // 42: getstatic com/discord/wakelock/ScreenWakeLock.INSTANCE Lcom/discord/wakelock/ScreenWakeLock;
      // 45: aload 1
      // 46: ldc "DCDVideoRenderer"
      // 48: invokevirtual com/discord/wakelock/ScreenWakeLock.requestLock (Landroid/app/Activity;Ljava/lang/String;)V
      // 4b: goto 62
      // 4e: astore 1
      // 4f: goto 69
      // 52: aload 2
      // 53: invokevirtual com/discord/media/engine/video/AttachedVideoSinks.anySinksActive ()Z
      // 56: ifne 62
      // 59: getstatic com/discord/wakelock/ScreenWakeLock.INSTANCE Lcom/discord/wakelock/ScreenWakeLock;
      // 5c: aload 1
      // 5d: ldc "DCDVideoRenderer"
      // 5f: invokevirtual com/discord/wakelock/ScreenWakeLock.releaseLock (Landroid/app/Activity;Ljava/lang/String;)V
      // 62: getstatic kotlin/Unit.a Lkotlin/Unit;
      // 65: astore 1
      // 66: aload 0
      // 67: monitorexit
      // 68: return
      // 69: aload 0
      // 6a: monitorexit
      // 6b: aload 1
      // 6c: athrow
   }

   public companion object {
      public const val NAME: String
      public const val WAKE_LOCK_KEY: String
      private final val reactEvents: ReactEvents
   }

   private class RenderListener(view: View) : RendererEvents {
      private final val view: View

      init {
         q.h(var1, "view");
         super();
         this.view = var1;
      }

      public open fun onFirstFrameRendered() {
         VideoStreamViewManager.access$getReactEvents$cp().emitEvent(this.view, new OnReadyEvent());
      }

      public open fun onFrameResolutionChanged(width: Int, height: Int, rotation: Int) {
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

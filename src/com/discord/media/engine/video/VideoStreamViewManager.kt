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
import java.util.HashMap
import org.webrtc.RendererCommon.RendererEvents

@ReactModule(name = "DCDVideoRenderer")
public class VideoStreamViewManager : SimpleViewManager<VideoStreamTextureView>, DCDVideoRendererManagerInterface<VideoStreamTextureView> {
   private final val delegate: DCDVideoRendererManagerDelegate<VideoStreamTextureView, VideoStreamViewManager> = new DCDVideoRendererManagerDelegate(this)
   private final val prevStreamIdByViewId: HashMap<Int, String?> = new HashMap()

   protected open fun createViewInstance(reactContext: ThemedReactContext): VideoStreamTextureView {
      return new VideoStreamTextureView(var1, null, 2, null);
   }

   protected open fun getDelegate(): DCDVideoRendererManagerDelegate<VideoStreamTextureView, VideoStreamViewManager> {
      return this.delegate;
   }

   public override fun getExportedCustomDirectEventTypeConstants(): MutableMap<String, Any> {
      return reactEvents.exportEventConstants();
   }

   public override fun getName(): String {
      return "DCDVideoRenderer";
   }

   public open fun onDropViewInstance(view: VideoStreamTextureView) {
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
      //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.removeExceptionInstructionsEx(FinallyProcessor.java:1064)
      //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.verifyFinallyEx(FinallyProcessor.java:565)
      //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.iterateGraph(FinallyProcessor.java:90)
      //
      // Bytecode:
      // 00: aload 1
      // 01: ldc "view"
      // 03: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
      // 06: aload 0
      // 07: getfield com/discord/media/engine/video/VideoStreamViewManager.prevStreamIdByViewId Ljava/util/HashMap;
      // 0a: aload 1
      // 0b: invokevirtual android/view/View.getId ()I
      // 0e: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 11: invokevirtual java/util/HashMap.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 14: checkcast java/lang/String
      // 17: astore 3
      // 18: aload 3
      // 19: ifnull 25
      // 1c: aload 2
      // 1d: aload 3
      // 1e: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
      // 21: ifeq 25
      // 24: return
      // 25: aload 0
      // 26: getfield com/discord/media/engine/video/VideoStreamViewManager.prevStreamIdByViewId Ljava/util/HashMap;
      // 29: aload 1
      // 2a: invokevirtual android/view/View.getId ()I
      // 2d: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 30: aload 2
      // 31: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 36: pop
      // 37: aload 2
      // 38: ifnull 4b
      // 3b: aload 1
      // 3c: aload 2
      // 3d: new com/discord/media/engine/video/VideoStreamViewManager$RenderListener
      // 40: dup
      // 41: aload 1
      // 42: invokespecial com/discord/media/engine/video/VideoStreamViewManager$RenderListener.<init> (Landroid/view/View;)V
      // 45: invokevirtual com/discord/media/engine/video/texture_view/VideoStreamTextureView.startRenderingStream (Ljava/lang/String;Lorg/webrtc/RendererCommon$RendererEvents;)V
      // 48: goto 4f
      // 4b: aload 1
      // 4c: invokevirtual com/discord/media/engine/video/texture_view/VideoStreamTextureView.reset ()V
      // 4f: aload 0
      // 50: monitorenter
      // 51: aload 1
      // 52: invokevirtual android/view/View.getContext ()Landroid/content/Context;
      // 55: astore 1
      // 56: aload 1
      // 57: ldc "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext"
      // 59: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;Ljava/lang/String;)V
      // 5c: aload 1
      // 5d: checkcast com/facebook/react/bridge/ReactContext
      // 60: invokevirtual com/facebook/react/bridge/ReactContext.getCurrentActivity ()Landroid/app/Activity;
      // 63: astore 2
      // 64: aload 2
      // 65: ifnull 93
      // 68: getstatic com/discord/media/engine/video/AttachedVideoSinks.INSTANCE Lcom/discord/media/engine/video/AttachedVideoSinks;
      // 6b: astore 1
      // 6c: aload 1
      // 6d: invokevirtual com/discord/media/engine/video/AttachedVideoSinks.anySinksActive ()Z
      // 70: ifeq 83
      // 73: getstatic com/discord/wakelock/ScreenWakeLock.INSTANCE Lcom/discord/wakelock/ScreenWakeLock;
      // 76: aload 2
      // 77: ldc "DCDVideoRenderer"
      // 79: invokevirtual com/discord/wakelock/ScreenWakeLock.requestLock (Landroid/app/Activity;Ljava/lang/String;)V
      // 7c: goto 93
      // 7f: astore 1
      // 80: goto 9a
      // 83: aload 1
      // 84: invokevirtual com/discord/media/engine/video/AttachedVideoSinks.anySinksActive ()Z
      // 87: ifne 93
      // 8a: getstatic com/discord/wakelock/ScreenWakeLock.INSTANCE Lcom/discord/wakelock/ScreenWakeLock;
      // 8d: aload 2
      // 8e: ldc "DCDVideoRenderer"
      // 90: invokevirtual com/discord/wakelock/ScreenWakeLock.releaseLock (Landroid/app/Activity;Ljava/lang/String;)V
      // 93: getstatic kotlin/Unit.a Lkotlin/Unit;
      // 96: astore 1
      // 97: aload 0
      // 98: monitorexit
      // 99: return
      // 9a: aload 0
      // 9b: monitorexit
      // 9c: aload 1
      // 9d: athrow
   }

   public companion object {
      private final val reactEvents: ReactEvents
      public const val WAKE_LOCK_KEY: String
      public const val NAME: String
   }

   private class RenderListener(view: View) : RendererEvents {
      private final val view: View

      init {
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

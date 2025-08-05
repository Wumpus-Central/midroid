package com.discord.avatar.react

import A9.s
import com.discord.avatar.decoration.DecorationView
import com.discord.avatar.react.events.OnImageLoadedEvent
import com.discord.image.animated_image.apng.APNGImageView
import com.discord.reactevents.ReactEvents
import com.facebook.react.module.annotations.ReactModule
import com.facebook.react.uimanager.SimpleViewManager
import com.facebook.react.uimanager.ThemedReactContext
import com.facebook.react.uimanager.annotations.ReactProp
import com.facebook.react.viewmanagers.APNGDecorationViewManagerDelegate
import com.facebook.react.viewmanagers.APNGDecorationViewManagerInterface
import kotlin.jvm.internal.H
import kotlin.jvm.internal.r

@ReactModule(name = "APNGDecorationView")
internal class APNGDecorationViewManager : SimpleViewManager<DecorationView>, APNGDecorationViewManagerInterface<DecorationView> {
   private final val delegate: APNGDecorationViewManagerDelegate<DecorationView, APNGDecorationViewManager> = new APNGDecorationViewManagerDelegate(this)
   internal final val reactEvents: ReactEvents = new ReactEvents(s.a("onLoad", H.b(OnImageLoadedEvent.class)))

   protected open fun createViewInstance(reactContext: ThemedReactContext): DecorationView {
      r.h(var1, "reactContext");
      val var2: DecorationView = new DecorationView(var1, null, 0, 6, null);
      var2.setEventHandler(new APNGImageView.APNGImageViewEventHandler(this, var1, var2) {
         final DecorationView $decorationView;
         final ThemedReactContext $reactContext;
         final APNGDecorationViewManager this$0;

         {
            this.this$0 = var1;
            this.$reactContext = var2;
            this.$decorationView = var3;
         }

         @Override
         public void onImageLoaded(java.lang.String var1) {
            r.h(var1, "url");
            this.this$0.getReactEvents$avatar_release().emitEvent(this.$reactContext, this.$decorationView, new OnImageLoadedEvent(var1));
         }
      });
      var2.inflateApngView(false);
      return var2;
   }

   protected open fun getDelegate(): APNGDecorationViewManagerDelegate<DecorationView, APNGDecorationViewManager> {
      return this.delegate;
   }

   public open fun getExportedCustomDirectEventTypeConstants(): MutableMap<String, Any> {
      return this.reactEvents.exportEventConstants();
   }

   public open fun getName(): String {
      return "APNGDecorationView";
   }

   protected open fun onAfterUpdateTransaction(view: DecorationView) {
      r.h(var1, "view");
      var1.maybeUpdateView();
   }

   public open fun onDropViewInstance(view: DecorationView) {
      r.h(var1, "view");
      var1.recycle();
   }

   public open fun pause(view: DecorationView) {
      r.h(var1, "view");
      var1.pause();
   }

   public open fun play(view: DecorationView) {
      r.h(var1, "view");
      var1.play();
   }

   public open fun seek(view: DecorationView, value: Int) {
      r.h(var1, "view");
      var1.seek((long)var2);
   }

   @ReactProp(name = "autoplay")
   public open fun setAutoplay(view: DecorationView, value: Boolean) {
      r.h(var1, "view");
      var1.setAutoplay(var2);
   }

   @ReactProp(name = "url")
   public open fun setUrl(view: DecorationView, value: String?) {
      r.h(var1, "view");
      if (var2 != null) {
         var1.setUrl(var2);
      }
   }

   public companion object {
      public const val NAME: String
   }
}

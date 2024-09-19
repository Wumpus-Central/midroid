package com.discord.sticker_picker.react

import com.discord.reactevents.ReactEvents
import com.discord.sticker_picker.StickerPickerRowView
import com.discord.sticker_picker.react_events.OnLongPressStickerEvent
import com.discord.sticker_picker.react_events.OnPressStickerEvent
import com.facebook.react.bridge.ReadableMap
import com.facebook.react.module.annotations.ReactModule
import com.facebook.react.uimanager.SimpleViewManager
import com.facebook.react.uimanager.ThemedReactContext
import com.facebook.react.uimanager.annotations.ReactProp
import com.facebook.react.viewmanagers.StickerPickerRowViewManagerDelegate
import com.facebook.react.viewmanagers.StickerPickerRowViewManagerInterface
import fh.w
import kotlin.jvm.functions.Function1
import kotlin.jvm.internal.g0
import kotlin.jvm.internal.q

@ReactModule(name = "StickerPickerRowView")
internal class StickerPickerRowViewManager : SimpleViewManager<StickerPickerRowView>, StickerPickerRowViewManagerInterface<StickerPickerRowView> {
   private final val delegate: StickerPickerRowViewManagerDelegate<StickerPickerRowView, StickerPickerRowViewManager> =
      new StickerPickerRowViewManagerDelegate(this)
      private final val reactEvents: ReactEvents =
      new ReactEvents(w.a("onPressSticker", g0.b(OnPressStickerEvent.class)), w.a("onLongPressSticker", g0.b(OnLongPressStickerEvent.class)))

   protected open fun createViewInstance(reactContext: ThemedReactContext): StickerPickerRowView {
      q.h(var1, "reactContext");
      val var2: StickerPickerRowView = new StickerPickerRowView(var1);
      var2.setOnPressSticker(new Function1(this, var1, var2) {
         final ThemedReactContext $reactContext;
         final StickerPickerRowView $view;
         final StickerPickerRowViewManager this$0;

         {
            super(1);
            this.this$0 = var1;
            this.$reactContext = var2;
            this.$view = var3;
         }

         public final void invoke(java.lang.String var1) {
            q.h(var1, "stickerId");
            StickerPickerRowViewManager.access$getReactEvents$p(this.this$0).emitEvent(this.$reactContext, this.$view, new OnPressStickerEvent(var1));
         }
      });
      var2.setOnLongPressSticker(new Function1(this, var1, var2) {
         final ThemedReactContext $reactContext;
         final StickerPickerRowView $view;
         final StickerPickerRowViewManager this$0;

         {
            super(1);
            this.this$0 = var1;
            this.$reactContext = var2;
            this.$view = var3;
         }

         public final void invoke(java.lang.String var1) {
            q.h(var1, "stickerId");
            StickerPickerRowViewManager.access$getReactEvents$p(this.this$0).emitEvent(this.$reactContext, this.$view, new OnLongPressStickerEvent(var1));
         }
      });
      return var2;
   }

   protected open fun getDelegate(): StickerPickerRowViewManagerDelegate<StickerPickerRowView, StickerPickerRowViewManager> {
      return this.delegate;
   }

   public open fun getExportedCustomDirectEventTypeConstants(): MutableMap<String, Any> {
      return this.reactEvents.exportEventConstants();
   }

   public open fun getName(): String {
      return "StickerPickerRowView";
   }

   public open fun onDropViewInstance(view: StickerPickerRowView) {
      q.h(var1, "view");
      super.onDropViewInstance(var1);
      var1.clean();
   }

   @ReactProp(name = "rowData")
   public open fun setRowData(view: StickerPickerRowView, value: ReadableMap?) {
      q.h(var1, "view");
      if (var2 != null) {
         var1.setRowData(StickerPickerRowDataSerializationUtilsKt.deserializeStickerPickerRowData(var2));
      }
   }

   public companion object {
      public const val NAME: String
   }
}

package com.discord.sticker_picker.react

import A9.s
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
import kotlin.jvm.internal.H
import kotlin.jvm.internal.r

@ReactModule(name = "StickerPickerRowView")
internal class StickerPickerRowViewManager : SimpleViewManager<StickerPickerRowView>, StickerPickerRowViewManagerInterface<StickerPickerRowView> {
   private final val delegate: StickerPickerRowViewManagerDelegate<StickerPickerRowView, StickerPickerRowViewManager> =
      new StickerPickerRowViewManagerDelegate(this)
      private final val reactEvents: ReactEvents =
      new ReactEvents(s.a("onPressSticker", H.b(OnPressStickerEvent.class)), s.a("onLongPressSticker", H.b(OnLongPressStickerEvent.class)))

   @JvmStatic
   fun `createViewInstance$lambda$2$lambda$0`(var0: StickerPickerRowViewManager, var1: ThemedReactContext, var2: StickerPickerRowView, var3: java.lang.String): Unit {
      r.h(var3, "stickerId");
      var0.reactEvents.emitEvent(var1, var2, new OnPressStickerEvent(var3));
      return Unit.a;
   }

   @JvmStatic
   fun `createViewInstance$lambda$2$lambda$1`(var0: StickerPickerRowViewManager, var1: ThemedReactContext, var2: StickerPickerRowView, var3: java.lang.String): Unit {
      r.h(var3, "stickerId");
      var0.reactEvents.emitEvent(var1, var2, new OnLongPressStickerEvent(var3));
      return Unit.a;
   }

   protected open fun createViewInstance(reactContext: ThemedReactContext): StickerPickerRowView {
      r.h(var1, "reactContext");
      val var2: StickerPickerRowView = new StickerPickerRowView(var1);
      var2.setOnPressSticker(new a(this, var1, var2));
      var2.setOnLongPressSticker(new b(this, var1, var2));
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
      r.h(var1, "view");
      super.onDropViewInstance(var1);
      var1.clean();
   }

   @ReactProp(name = "rowData")
   public open fun setRowData(view: StickerPickerRowView, value: ReadableMap?) {
      r.h(var1, "view");
      if (var2 != null) {
         var1.setRowData(StickerPickerRowDataSerializationUtilsKt.deserializeStickerPickerRowData(var2));
      }
   }

   public companion object {
      public const val NAME: String
   }
}

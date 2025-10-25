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
import xa.v

@ReactModule(name = "StickerPickerRowView")
internal class StickerPickerRowViewManager : SimpleViewManager<StickerPickerRowView>, StickerPickerRowViewManagerInterface<StickerPickerRowView> {
   private final val delegate: StickerPickerRowViewManagerDelegate<StickerPickerRowView, StickerPickerRowViewManager> =
      new StickerPickerRowViewManagerDelegate(this)
      private final val reactEvents: ReactEvents =
      new ReactEvents(v.a("onPressSticker", OnPressStickerEvent::class), v.a("onLongPressSticker", OnLongPressStickerEvent::class))

   @JvmStatic
   fun `createViewInstance$lambda$2$lambda$0`(var0: StickerPickerRowViewManager, var1: ThemedReactContext, var2: StickerPickerRowView, var3: java.lang.String): Unit {
      var0.reactEvents.emitEvent(var1, var2, new OnPressStickerEvent(var3));
      return Unit.a;
   }

   @JvmStatic
   fun `createViewInstance$lambda$2$lambda$1`(var0: StickerPickerRowViewManager, var1: ThemedReactContext, var2: StickerPickerRowView, var3: java.lang.String): Unit {
      var0.reactEvents.emitEvent(var1, var2, new OnLongPressStickerEvent(var3));
      return Unit.a;
   }

   protected open fun createViewInstance(reactContext: ThemedReactContext): StickerPickerRowView {
      val var2: StickerPickerRowView = new StickerPickerRowView(var1);
      var2.setOnPressSticker(new a(this, var1, var2));
      var2.setOnLongPressSticker(new b(this, var1, var2));
      return var2;
   }

   protected open fun getDelegate(): StickerPickerRowViewManagerDelegate<StickerPickerRowView, StickerPickerRowViewManager> {
      return this.delegate;
   }

   public override fun getExportedCustomDirectEventTypeConstants(): MutableMap<String, Any> {
      return this.reactEvents.exportEventConstants();
   }

   public override fun getName(): String {
      return "StickerPickerRowView";
   }

   public open fun onDropViewInstance(view: StickerPickerRowView) {
      super.onDropViewInstance(var1);
      var1.clean();
   }

   @ReactProp(name = "rowData")
   public open fun setRowData(view: StickerPickerRowView, value: ReadableMap?) {
      if (var2 != null) {
         var1.setRowData(StickerPickerRowDataSerializationUtilsKt.deserializeStickerPickerRowData(var2));
      }
   }

   public companion object {
      public const val NAME: String
   }
}

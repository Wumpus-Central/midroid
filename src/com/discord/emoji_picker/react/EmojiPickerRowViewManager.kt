package com.discord.emoji_picker.react

import A9.s
import com.discord.emoji_picker.EmojiPickerRowView
import com.discord.emoji_picker.react_events.OnLongPressEmojiEvent
import com.discord.emoji_picker.react_events.OnPressEmojiEvent
import com.discord.reactevents.ReactEvents
import com.facebook.react.bridge.ReadableMap
import com.facebook.react.module.annotations.ReactModule
import com.facebook.react.uimanager.SimpleViewManager
import com.facebook.react.uimanager.ThemedReactContext
import com.facebook.react.uimanager.annotations.ReactProp
import com.facebook.react.viewmanagers.EmojiPickerRowViewManagerInterface
import kotlin.jvm.internal.G
import kotlin.jvm.internal.q

@ReactModule(name = "EmojiPickerRowView")
internal class EmojiPickerRowViewManager : SimpleViewManager<EmojiPickerRowView>, EmojiPickerRowViewManagerInterface<EmojiPickerRowView> {
   private final val reactEvents: ReactEvents =
      new ReactEvents(s.a("onPressEmoji", G.b(OnPressEmojiEvent.class)), s.a("onLongPressEmoji", G.b(OnLongPressEmojiEvent.class)))

   @JvmStatic
   fun `createViewInstance$lambda$2$lambda$0`(var0: EmojiPickerRowViewManager, var1: ThemedReactContext, var2: EmojiPickerRowView, var3: java.lang.String): Unit {
      q.h(var3, "emojiName");
      var0.reactEvents.emitEvent(var1, var2, new OnPressEmojiEvent(var3, null, 2, null));
      return Unit.a;
   }

   @JvmStatic
   fun `createViewInstance$lambda$2$lambda$1`(var0: EmojiPickerRowViewManager, var1: ThemedReactContext, var2: EmojiPickerRowView, var3: java.lang.String): Unit {
      q.h(var3, "emojiName");
      var0.reactEvents.emitEvent(var1, var2, new OnLongPressEmojiEvent(var3, null, 2, null));
      return Unit.a;
   }

   protected open fun createViewInstance(reactContext: ThemedReactContext): EmojiPickerRowView {
      q.h(var1, "reactContext");
      val var2: EmojiPickerRowView = new EmojiPickerRowView(var1);
      var2.setOnPressEmoji(new a(this, var1, var2));
      var2.setOnLongPressEmoji(new b(this, var1, var2));
      return var2;
   }

   public open fun getExportedCustomDirectEventTypeConstants(): MutableMap<String, Any> {
      return this.reactEvents.exportEventConstants();
   }

   public open fun getName(): String {
      return "EmojiPickerRowView";
   }

   @ReactProp(name = "rowData")
   public open fun setRowData(view: EmojiPickerRowView, data: ReadableMap?) {
      q.h(var1, "view");
      if (var2 != null) {
         var1.setRowData(EmojiPickerRowDataSerializationUtilsKt.deserializeEmojiPickerRowData(var2));
      }
   }

   public companion object {
      public const val NAME: String
   }
}

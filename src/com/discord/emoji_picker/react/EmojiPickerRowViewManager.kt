package com.discord.emoji_picker.react

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
import kotlin.jvm.functions.Function1
import kotlin.jvm.internal.g0
import kotlin.jvm.internal.q
import lj.w

@ReactModule(name = "EmojiPickerRowView")
internal class EmojiPickerRowViewManager : SimpleViewManager<EmojiPickerRowView>, EmojiPickerRowViewManagerInterface<EmojiPickerRowView> {
   private final val reactEvents: ReactEvents =
      new ReactEvents(new Pair[]{w.a("onPressEmoji", g0.b(OnPressEmojiEvent.class)), w.a("onLongPressEmoji", g0.b(OnLongPressEmojiEvent.class))})

   protected open fun createViewInstance(reactContext: ThemedReactContext): EmojiPickerRowView {
      q.h(var1, "reactContext");
      val var2: EmojiPickerRowView = new EmojiPickerRowView(var1);
      var2.setOnPressEmoji(
         new Function1(this, var1, var2) {
            final ThemedReactContext $reactContext;
            final EmojiPickerRowView $view;
            final EmojiPickerRowViewManager this$0;

            {
               super(1);
               this.this$0 = var1;
               this.$reactContext = var2;
               this.$view = var3;
            }

            public final void invoke(java.lang.String var1) {
               q.h(var1, "emojiName");
               EmojiPickerRowViewManager.access$getReactEvents$p(this.this$0)
                  .emitEvent(this.$reactContext, this.$view, new OnPressEmojiEvent(var1, null, 2, null));
            }
         }
      );
      var2.setOnLongPressEmoji(
         new Function1(this, var1, var2) {
            final ThemedReactContext $reactContext;
            final EmojiPickerRowView $view;
            final EmojiPickerRowViewManager this$0;

            {
               super(1);
               this.this$0 = var1;
               this.$reactContext = var2;
               this.$view = var3;
            }

            public final void invoke(java.lang.String var1) {
               q.h(var1, "emojiName");
               EmojiPickerRowViewManager.access$getReactEvents$p(this.this$0)
                  .emitEvent(this.$reactContext, this.$view, new OnLongPressEmojiEvent(var1, null, 2, null));
            }
         }
      );
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

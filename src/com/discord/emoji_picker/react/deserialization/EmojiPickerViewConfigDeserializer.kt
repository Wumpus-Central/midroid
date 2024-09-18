package com.discord.emoji_picker.react.deserialization

import com.discord.emoji_picker.EmojiPickerView
import com.discord.emoji_picker.EmojiPickerView.Config
import com.discord.emoji_picker.EmojiPickerView.Config.Companion
import com.discord.react.utilities.NativeMapExtensionsKt
import com.facebook.react.bridge.ReadableMap
import kotlin.jvm.internal.q

internal object EmojiPickerViewConfigDeserializer {
   public fun Companion.deserialize(map: ReadableMap): Config {
      q.h(var1, "<this>");
      q.h(var2, "map");
      return new EmojiPickerView.Config(
         NativeMapExtensionsKt.getBoolean(var2, "animateEmoji", true),
         NativeMapExtensionsKt.getBoolean$default(var2, "scrollFastOptimizationEnabled", false, 2, null),
         NativeMapExtensionsKt.getInt(var2, "scrollFastVelocity", Integer.MAX_VALUE),
         NativeMapExtensionsKt.getBoolean$default(var2, "disableAnimationsOnScroll", false, 2, null)
      );
   }
}

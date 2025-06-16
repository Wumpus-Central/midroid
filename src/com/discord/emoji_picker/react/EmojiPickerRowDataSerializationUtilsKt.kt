package com.discord.emoji_picker.react

import com.discord.emoji_picker.EmojiPickerRow
import com.discord.react.utilities.NativeArrayExtensionsKt
import com.discord.react.utilities.NativeMapExtensionsKt
import com.facebook.react.bridge.ReadableArray
import com.facebook.react.bridge.ReadableMap
import java.util.ArrayList
import kotlin.jvm.internal.q
import u9.n

internal fun deserializeEmojiPickerRowData(data: ReadableMap): EmojiPickerRow {
   q.h(var0, "data");
   val var3: Int = var0.getInt("rowContentWidth");
   val var1: Int = var0.getInt("rowContentPaddingVertical");
   val var2: Int = var0.getInt("itemSize");
   val var5: ReadableArray = NativeMapExtensionsKt.getNonNullArray(var0, "items");
   val var4: IntRange = NativeArrayExtensionsKt.sizeRange(var5);
   val var6: ArrayList = new ArrayList(kotlin.collections.i.v(var4, 10));
   val var7: java.util.Iterator = var4.iterator();

   while (var7.hasNext()) {
      val var8: ReadableMap = var5.getMap((var7 as n).a());
      q.e(var8);
      val var9: EmojiPickerRow.Emoji;
      if (!kotlin.text.h.c0(NativeMapExtensionsKt.getNonNullString(var8, "url"))) {
         var9 = new EmojiPickerRow.Emoji(
            var8.getString("id"),
            NativeMapExtensionsKt.getNonNullString(var8, "name"),
            NativeMapExtensionsKt.getNonNullString(var8, "url"),
            var8.getBoolean("animated"),
            var8.getBoolean("disabled")
         );
      } else {
         var9 = null;
      }

      var6.add(var9);
   }

   return new EmojiPickerRow(var3, var1, var2, var6, var0.getBoolean("isSectionNitroLocked"));
}

package com.discord.emoji_picker.react

import com.discord.emoji_picker.EmojiPickerRow
import com.discord.react.utilities.NativeArrayExtensionsKt
import com.discord.react.utilities.NativeMapExtensionsKt
import com.facebook.react.bridge.ReadableArray
import com.facebook.react.bridge.ReadableMap
import java.util.ArrayList
import kotlin.jvm.internal.q
import lh.o

internal fun deserializeEmojiPickerRowData(data: ReadableMap): EmojiPickerRow {
   q.h(var0, "data");
   val var3: Int = var0.getInt("rowContentWidth");
   val var1: Int = var0.getInt("rowContentPaddingVertical");
   val var2: Int = var0.getInt("itemSize");
   val var6: ReadableArray = NativeMapExtensionsKt.getNonNullArray(var0, "items");
   val var4: IntRange = NativeArrayExtensionsKt.sizeRange(var6);
   val var5: ArrayList = new ArrayList(i.v(var4, 10));
   val var7: java.util.Iterator = var4.iterator();

   while (var7.hasNext()) {
      val var8: ReadableMap = var6.getMap((var7 as o).c());
      q.g(var8, "getMap(...)");
      val var9: EmojiPickerRow.Emoji;
      if (h.x(NativeMapExtensionsKt.getNonNullString(var8, "url")) xor true) {
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

      var5.add(var9);
   }

   return new EmojiPickerRow(var3, var1, var2, var5, var0.getBoolean("isSectionNitroLocked"));
}

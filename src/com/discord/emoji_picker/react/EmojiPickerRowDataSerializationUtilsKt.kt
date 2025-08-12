package com.discord.emoji_picker.react

import B9.n
import com.discord.emoji_picker.EmojiPickerRow
import com.discord.react.utilities.NativeArrayExtensionsKt
import com.discord.react.utilities.NativeMapExtensionsKt
import com.facebook.react.bridge.ReadableArray
import com.facebook.react.bridge.ReadableMap
import java.util.ArrayList
import kotlin.jvm.internal.r

internal fun deserializeEmojiPickerRowData(data: ReadableMap): EmojiPickerRow {
   r.h(var0, "data");
   val var1: Double = var0.getDouble("rowContentWidth");
   val var4: Int = var0.getInt("rowContentPaddingVertical");
   val var3: Int = var0.getInt("itemSize");
   val var6: ReadableArray = NativeMapExtensionsKt.getNonNullArray(var0, "items");
   val var5: IntRange = NativeArrayExtensionsKt.sizeRange(var6);
   val var7: ArrayList = new ArrayList(kotlin.collections.i.v(var5, 10));
   val var8: java.util.Iterator = var5.iterator();

   while (var8.hasNext()) {
      val var9: ReadableMap = var6.getMap((var8 as n).a());
      r.e(var9);
      val var10: EmojiPickerRow.Emoji;
      if (!kotlin.text.h.c0(NativeMapExtensionsKt.getNonNullString(var9, "url"))) {
         var10 = new EmojiPickerRow.Emoji(
            var9.getString("id"),
            NativeMapExtensionsKt.getNonNullString(var9, "name"),
            NativeMapExtensionsKt.getNonNullString(var9, "url"),
            var9.getBoolean("animated"),
            var9.getBoolean("disabled")
         );
      } else {
         var10 = null;
      }

      var7.add(var10);
   }

   return new EmojiPickerRow(var1, var4, var3, var7, var0.getBoolean("isSectionNitroLocked"));
}

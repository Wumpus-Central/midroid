@file:SourceDebugExtension(["SMAP\nEmojiPickerRowDataSerializationUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EmojiPickerRowDataSerializationUtils.kt\ncom/discord/emoji_picker/react/EmojiPickerRowDataSerializationUtilsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,35:1\n1557#2:36\n1628#2,3:37\n*S KotlinDebug\n*F\n+ 1 EmojiPickerRowDataSerializationUtils.kt\ncom/discord/emoji_picker/react/EmojiPickerRowDataSerializationUtilsKt\n*L\n17#1:36\n17#1:37,3\n*E\n"])

package com.discord.emoji_picker.react

import com.discord.emoji_picker.EmojiPickerRow
import com.discord.react.utilities.NativeArrayExtensionsKt
import com.discord.react.utilities.NativeMapExtensionsKt
import com.facebook.react.bridge.ReadableArray
import com.facebook.react.bridge.ReadableMap
import java.util.ArrayList
import kotlin.jvm.internal.SourceDebugExtension

internal fun deserializeEmojiPickerRowData(data: ReadableMap): EmojiPickerRow {
   val var1: Double = var0.getDouble("rowContentWidth");
   val var4: Int = var0.getInt("rowContentPaddingVertical");
   val var3: Int = var0.getInt("itemSize");
   val var7: ReadableArray = NativeMapExtensionsKt.getNonNullArray(var0, "items");
   val var5: IntRange = NativeArrayExtensionsKt.sizeRange(var7);
   val var6: ArrayList = new ArrayList(CollectionsKt.v(var5, 10));
   val var8: java.util.Iterator = var5.iterator();

   while (var8.hasNext()) {
      val var9: ReadableMap = var7.getMap((var8 as I).nextInt());
      val var10: EmojiPickerRow.Emoji;
      if (!StringsKt.c0(NativeMapExtensionsKt.getNonNullString(var9, "url"))) {
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

      var6.add(var10);
   }

   return new EmojiPickerRow(var1, var4, var3, var6, var0.getBoolean("isSectionNitroLocked"));
}

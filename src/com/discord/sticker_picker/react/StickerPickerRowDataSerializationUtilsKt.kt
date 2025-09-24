@file:SourceDebugExtension(["SMAP\nStickerPickerRowDataSerializationUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StickerPickerRowDataSerializationUtils.kt\ncom/discord/sticker_picker/react/StickerPickerRowDataSerializationUtilsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,44:1\n1557#2:45\n1628#2,3:46\n*S KotlinDebug\n*F\n+ 1 StickerPickerRowDataSerializationUtils.kt\ncom/discord/sticker_picker/react/StickerPickerRowDataSerializationUtilsKt\n*L\n17#1:45\n17#1:46,3\n*E\n"])

package com.discord.sticker_picker.react

import com.discord.react.utilities.NativeArrayExtensionsKt
import com.discord.react.utilities.NativeMapExtensionsKt
import com.discord.sticker_picker.StickerPickerRow
import com.facebook.react.bridge.ReadableArray
import com.facebook.react.bridge.ReadableMap
import java.util.ArrayList
import kotlin.jvm.internal.SourceDebugExtension

internal fun deserializeStickerPickerRowData(data: ReadableMap): StickerPickerRow {
   val var1: Double = var0.getDouble("rowContentWidth");
   val var4: Int = var0.getInt("rowContentPaddingVertical");
   val var3: Int = var0.getInt("itemSize");
   val var10: ReadableArray = NativeMapExtensionsKt.getNonNullArray(var0, "items");
   val var14: IntRange = NativeArrayExtensionsKt.sizeRange(var10);
   val var9: ArrayList = new ArrayList(CollectionsKt.v(var14, 10));
   val var11: java.util.Iterator = var14.iterator();

   while (var11.hasNext()) {
      var var5: Int = (var11 as I).nextInt();
      val var6: Boolean = var10.isNull(var5);
      var var15: StickerPickerRow.Sticker = null;
      if (!var6) {
         var0 = var10.getMap(var5);
         var var7: java.lang.String;
         if (var0 != null) {
            var7 = var0.getString("stickerId");
         } else {
            var7 = null;
         }

         var15 = null;
         if (var7 != null) {
            val var21: ReadableMap = var10.getMap(var5);
            var7 = NativeMapExtensionsKt.getNonNullString(var21, "stickerId");
            val var12: java.lang.String = NativeMapExtensionsKt.getNonNullString(var21, "stickerName");
            var5 = var21.getInt("stickerType");
            val var17: StickerPickerRow.Sticker.Type;
            if (var5 != 1) {
               if (var5 != 2) {
                  if (var5 != 3) {
                     if (var5 != 4) {
                        val var18: StringBuilder = new StringBuilder();
                        var18.append("Unknown type ");
                        var18.append(var5);
                        throw new IllegalArgumentException(var18.toString());
                     }

                     var17 = StickerPickerRow.Sticker.Type.GIF;
                  } else {
                     var17 = StickerPickerRow.Sticker.Type.LOTTIE;
                  }
               } else {
                  var17 = StickerPickerRow.Sticker.Type.APNG;
               }
            } else {
               var17 = StickerPickerRow.Sticker.Type.PNG;
            }

            var15 = new StickerPickerRow.Sticker(
               var7,
               var12,
               var17,
               var21.getBoolean("stickerAnimated"),
               NativeMapExtensionsKt.getNonNullString(var21, "stickerUrl"),
               var21.getBoolean("stickerDisabled"),
               var21.getBoolean("stickerOpaque")
            );
         }
      }

      var9.add(var15);
   }

   return new StickerPickerRow(var1, var4, var3, var9);
}

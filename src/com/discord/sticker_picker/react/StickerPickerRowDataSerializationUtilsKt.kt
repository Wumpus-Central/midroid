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
   val var3: Int = var0.getInt("rowContentPaddingVertical");
   val var4: Int = var0.getInt("itemSize");
   val var9: ReadableArray = NativeMapExtensionsKt.getNonNullArray(var0, "items");
   val var14: IntRange = NativeArrayExtensionsKt.sizeRange(var9);
   val var10: ArrayList = new ArrayList(CollectionsKt.v(var14, 10));
   val var11: java.util.Iterator = var14.iterator();

   while (var11.hasNext()) {
      var var5: Int = (var11 as I).nextInt();
      val var6: Boolean = var9.isNull(var5);
      var var7: StickerPickerRow.Sticker = null;
      if (!var6) {
         var0 = var9.getMap(var5);
         val var16: java.lang.String;
         if (var0 != null) {
            var16 = var0.getString("stickerId");
         } else {
            var16 = null;
         }

         var7 = null;
         if (var16 != null) {
            val var20: ReadableMap = var9.getMap(var5);
            val var12: java.lang.String = NativeMapExtensionsKt.getNonNullString(var20, "stickerId");
            val var21: java.lang.String = NativeMapExtensionsKt.getNonNullString(var20, "stickerName");
            var5 = var20.getInt("stickerType");
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

            var7 = new StickerPickerRow.Sticker(
               var12,
               var21,
               var17,
               var20.getBoolean("stickerAnimated"),
               NativeMapExtensionsKt.getNonNullString(var20, "stickerUrl"),
               var20.getBoolean("stickerDisabled"),
               var20.getBoolean("stickerOpaque")
            );
         }
      }

      var10.add(var7);
   }

   return new StickerPickerRow(var1, var3, var4, var10);
}

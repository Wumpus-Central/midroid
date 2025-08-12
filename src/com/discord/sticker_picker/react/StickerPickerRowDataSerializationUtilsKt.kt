package com.discord.sticker_picker.react

import B9.n
import com.discord.react.utilities.NativeArrayExtensionsKt
import com.discord.react.utilities.NativeMapExtensionsKt
import com.discord.sticker_picker.StickerPickerRow
import com.facebook.react.bridge.ReadableArray
import com.facebook.react.bridge.ReadableMap
import java.util.ArrayList
import kotlin.jvm.internal.r

internal fun deserializeStickerPickerRowData(data: ReadableMap): StickerPickerRow {
   r.h(var0, "data");
   val var1: Double = var0.getDouble("rowContentWidth");
   val var3: Int = var0.getInt("rowContentPaddingVertical");
   val var4: Int = var0.getInt("itemSize");
   val var9: ReadableArray = NativeMapExtensionsKt.getNonNullArray(var0, "items");
   val var14: IntRange = NativeArrayExtensionsKt.sizeRange(var9);
   val var10: ArrayList = new ArrayList(i.v(var14, 10));
   val var11: java.util.Iterator = var14.iterator();

   while (var11.hasNext()) {
      var var5: Int = (var11 as n).a();
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
            val var21: ReadableMap = var9.getMap(var5);
            r.e(var21);
            val var20: java.lang.String = NativeMapExtensionsKt.getNonNullString(var21, "stickerId");
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

            var7 = new StickerPickerRow.Sticker(
               var20,
               var12,
               var17,
               var21.getBoolean("stickerAnimated"),
               NativeMapExtensionsKt.getNonNullString(var21, "stickerUrl"),
               var21.getBoolean("stickerDisabled"),
               var21.getBoolean("stickerOpaque")
            );
         }
      }

      var10.add(var7);
   }

   return new StickerPickerRow(var1, var3, var4, var10);
}

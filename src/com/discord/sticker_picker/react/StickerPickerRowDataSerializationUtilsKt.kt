package com.discord.sticker_picker.react

import com.discord.react.utilities.NativeArrayExtensionsKt
import com.discord.react.utilities.NativeMapExtensionsKt
import com.discord.sticker_picker.StickerPickerRow
import com.facebook.react.bridge.ReadableArray
import com.facebook.react.bridge.ReadableMap
import java.util.ArrayList
import kotlin.jvm.internal.q
import lh.o

internal fun deserializeStickerPickerRowData(data: ReadableMap): StickerPickerRow {
   q.h(var0, "data");
   val var3: Int = var0.getInt("rowContentWidth");
   val var1: Int = var0.getInt("rowContentPaddingVertical");
   val var2: Int = var0.getInt("itemSize");
   val var6: ReadableArray = NativeMapExtensionsKt.getNonNullArray(var0, "items");
   val var12: IntRange = NativeArrayExtensionsKt.sizeRange(var6);
   val var5: ArrayList = new ArrayList(i.v(var12, 10));
   val var7: java.util.Iterator = var12.iterator();

   while (var7.hasNext()) {
      var var4: Int = (var7 as o).a();
      val var15: StickerPickerRow.Sticker;
      if (!var6.isNull(var4)) {
         val var9: ReadableMap = var6.getMap(var4);
         q.e(var9);
         val var10: java.lang.String = NativeMapExtensionsKt.getNonNullString(var9, "stickerId");
         val var8: java.lang.String = NativeMapExtensionsKt.getNonNullString(var9, "stickerName");
         var4 = var9.getInt("stickerType");
         val var13: StickerPickerRow.Sticker.Type;
         if (var4 != 1) {
            if (var4 != 2) {
               if (var4 != 3) {
                  if (var4 != 4) {
                     val var14: StringBuilder = new StringBuilder();
                     var14.append("Unknown type ");
                     var14.append(var4);
                     throw new IllegalArgumentException(var14.toString());
                  }

                  var13 = StickerPickerRow.Sticker.Type.GIF;
               } else {
                  var13 = StickerPickerRow.Sticker.Type.LOTTIE;
               }
            } else {
               var13 = StickerPickerRow.Sticker.Type.APNG;
            }
         } else {
            var13 = StickerPickerRow.Sticker.Type.PNG;
         }

         var15 = new StickerPickerRow.Sticker(
            var10,
            var8,
            var13,
            var9.getBoolean("stickerAnimated"),
            NativeMapExtensionsKt.getNonNullString(var9, "stickerUrl"),
            var9.getBoolean("stickerDisabled"),
            var9.getBoolean("stickerOpaque")
         );
      } else {
         var15 = null;
      }

      var5.add(var15);
   }

   return new StickerPickerRow(var3, var1, var2, var5);
}

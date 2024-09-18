package com.discord.sticker_picker.react

import com.discord.react.utilities.NativeArrayExtensionsKt
import com.discord.react.utilities.NativeMapExtensionsKt
import com.discord.sticker_picker.StickerPickerRow
import com.facebook.react.bridge.ReadableArray
import com.facebook.react.bridge.ReadableMap
import eh.o
import java.util.ArrayList
import kotlin.jvm.internal.q

internal fun deserializeStickerPickerRowData(data: ReadableMap): StickerPickerRow {
   q.h(var0, "data");
   val var1: Int = var0.getInt("rowContentWidth");
   val var2: Int = var0.getInt("rowContentPaddingVertical");
   val var3: Int = var0.getInt("itemSize");
   val var5: ReadableArray = NativeMapExtensionsKt.getNonNullArray(var0, "items");
   val var12: IntRange = NativeArrayExtensionsKt.sizeRange(var5);
   val var6: ArrayList = new ArrayList(i.u(var12, 10));
   val var7: java.util.Iterator = var12.iterator();

   while (var7.hasNext()) {
      var var4: Int = (var7 as o).c();
      val var15: StickerPickerRow.Sticker;
      if (!var5.isNull(var4)) {
         val var10: ReadableMap = var5.getMap(var4);
         q.e(var10);
         val var9: java.lang.String = NativeMapExtensionsKt.getNonNullString(var10, "stickerId");
         val var8: java.lang.String = NativeMapExtensionsKt.getNonNullString(var10, "stickerName");
         var4 = var10.getInt("stickerType");
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
            var9,
            var8,
            var13,
            var10.getBoolean("stickerAnimated"),
            NativeMapExtensionsKt.getNonNullString(var10, "stickerUrl"),
            var10.getBoolean("stickerDisabled"),
            var10.getBoolean("stickerOpaque")
         );
      } else {
         var15 = null;
      }

      var6.add(var15);
   }

   return new StickerPickerRow(var1, var2, var3, var6);
}

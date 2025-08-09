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
   val var4: Int = var0.getInt("rowContentPaddingVertical");
   val var3: Int = var0.getInt("itemSize");
   val var6: ReadableArray = NativeMapExtensionsKt.getNonNullArray(var0, "items");
   val var13: IntRange = NativeArrayExtensionsKt.sizeRange(var6);
   val var7: ArrayList = new ArrayList(i.v(var13, 10));
   val var8: java.util.Iterator = var13.iterator();

   while (var8.hasNext()) {
      var var5: Int = (var8 as n).a();
      val var16: StickerPickerRow.Sticker;
      if (!var6.isNull(var5)) {
         val var10: ReadableMap = var6.getMap(var5);
         r.e(var10);
         val var11: java.lang.String = NativeMapExtensionsKt.getNonNullString(var10, "stickerId");
         val var9: java.lang.String = NativeMapExtensionsKt.getNonNullString(var10, "stickerName");
         var5 = var10.getInt("stickerType");
         val var14: StickerPickerRow.Sticker.Type;
         if (var5 != 1) {
            if (var5 != 2) {
               if (var5 != 3) {
                  if (var5 != 4) {
                     val var15: StringBuilder = new StringBuilder();
                     var15.append("Unknown type ");
                     var15.append(var5);
                     throw new IllegalArgumentException(var15.toString());
                  }

                  var14 = StickerPickerRow.Sticker.Type.GIF;
               } else {
                  var14 = StickerPickerRow.Sticker.Type.LOTTIE;
               }
            } else {
               var14 = StickerPickerRow.Sticker.Type.APNG;
            }
         } else {
            var14 = StickerPickerRow.Sticker.Type.PNG;
         }

         var16 = new StickerPickerRow.Sticker(
            var11,
            var9,
            var14,
            var10.getBoolean("stickerAnimated"),
            NativeMapExtensionsKt.getNonNullString(var10, "stickerUrl"),
            var10.getBoolean("stickerDisabled"),
            var10.getBoolean("stickerOpaque")
         );
      } else {
         var16 = null;
      }

      var7.add(var16);
   }

   return new StickerPickerRow(var1, var4, var3, var7);
}

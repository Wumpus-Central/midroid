package com.discord.fastest_list.react

import com.discord.fastest_list.android.placeholder.FastestListPlaceholderAlignment
import com.discord.fastest_list.android.placeholder.FastestListPlaceholderType
import com.discord.fastest_list.android.placeholder.FastestListPlaceholderType.Shape.Type
import com.discord.fastest_list.android.placeholder.FastestListPlaceholderType.Shape.Type.Companion
import com.discord.misc.utilities.size.SizeUtilsKt
import com.discord.react.utilities.NativeMapExtensionsKt
import com.discord.theme.utils.ColorUtilsKt
import com.facebook.react.bridge.ReadableMap

private const val PLACEHOLDER_TYPE_NONE: Int = 0
private const val PLACEHOLDER_TYPE_SHAPE: Int = 1
private const val PLACEHOLDER_TYPE_FEED_ITEM: Int = 2

private operator fun Companion.invoke(key: String, value: ReadableMap): Type {
   var1 = NativeMapExtensionsKt.getNonNullString(var2, var1, "circle");
   if (var1 == "circle") {
      return FastestListPlaceholderType.Shape.Type.CIRCLE;
   } else if (var1 == "rect") {
      return FastestListPlaceholderType.Shape.Type.RECT;
   } else {
      val var3: StringBuilder = new StringBuilder();
      var3.append("Unknown placeholder shape type ");
      var3.append(var1);
      throw new IllegalArgumentException(var3.toString());
   }
}

internal operator fun com.discord.fastest_list.android.placeholder.FastestListPlaceholderType.Companion.invoke(value: ReadableMap): FastestListPlaceholderType {
   var var15: Int = var1.getInt("placeholderType");
   if (var15 != 0) {
      if (var15 != 1) {
         if (var15 == 2) {
            return new FastestListPlaceholderType.FeedItem(
               ColorUtilsKt.rgbaToArgb(var1.getString("placeholderFeedBackgroundColorRgba")),
               SizeUtilsKt.getDpToPx(var1.getInt("borderRadius")),
               SizeUtilsKt.getDpToPx(var1.getInt("borderTopLeftRadius")),
               SizeUtilsKt.getDpToPx(var1.getInt("borderTopRightRadius")),
               SizeUtilsKt.getDpToPx(var1.getInt("borderBottomLeftRadius")),
               SizeUtilsKt.getDpToPx(var1.getInt("borderBottomRightRadius")),
               ColorUtilsKt.rgbaToArgb(NativeMapExtensionsKt.getNonNullString(var1, "placeholderFeedColorRgba")),
               var1.getBoolean("divider"),
               ColorUtilsKt.rgbaToArgb(var1.getString("dividerColorRgba")),
               SizeUtilsKt.getDpToPx(var1.getInt("dividerPaddingLeft")),
               SizeUtilsKt.getDpToPx(var1.getInt("dividerPaddingRight")),
               SizeUtilsKt.getDpToPx(var1.getInt("placeholderFeedPadding")),
               invoke(FastestListPlaceholderType.Shape.Type.Companion, "placeholderFeedShape", var1),
               SizeUtilsKt.getDpToPx(var1.getInt("placeholderFeedShapeSize")),
               SizeUtilsKt.getDpToPx(var1.getInt("placeholderFeedLabelPadding")),
               (float)var1.getDouble("placeholderFeedLabelPaddingInnerRatio"),
               SizeUtilsKt.getDpToPx(var1.getInt("placeholderFeedLabelSize")),
               SizeUtilsKt.getDpToPx(var1.getInt("placeholderFeedLabelSecondarySize"))
            );
         } else {
            val var24: StringBuilder = new StringBuilder();
            var24.append("Unknown placeholder type ");
            var24.append(var15);
            throw new IllegalArgumentException(var24.toString());
         }
      } else {
         val var2: Float = SizeUtilsKt.getDpToPx(var1.getInt("borderRadius"));
         var15 = ColorUtilsKt.rgbaToArgb(NativeMapExtensionsKt.getNonNullString(var1, "placeholderShapeColorRgba"));
         val var16: Int = var1.getInt("placeholderShapeCount");
         val var5: Float = SizeUtilsKt.getDpToPx(var1.getInt("placeholderShapeGap"));
         val var20: FastestListPlaceholderType.Shape.Type = invoke(FastestListPlaceholderType.Shape.Type.Companion, "placeholderShape", var1);
         val var4: Float = SizeUtilsKt.getDpToPx(var1.getInt("placeholderShapePaddingHorizontal"));
         val var3: Float = SizeUtilsKt.getDpToPx(var1.getInt("placeholderShapePaddingVertical"));
         var var19: java.lang.Float = null;
         val var22: Int = NativeMapExtensionsKt.getNullableInt$default(var1, "width", null, 2, null);
         val var23: java.lang.Float;
         if (var22 != null) {
            var23 = (float)SizeUtilsKt.getDpToPx(var22);
         } else {
            var23 = null;
         }

         val var21: Int = NativeMapExtensionsKt.getNullableInt$default(var1, "height", null, 2, null);
         if (var21 != null) {
            var19 = (float)SizeUtilsKt.getDpToPx(var21);
         }

         return new FastestListPlaceholderType.Shape(
            var2,
            var15,
            var16,
            var5,
            var4,
            var3,
            var23,
            var19,
            var20,
            FastestListPlaceholderAlignment.Vertical.Companion.parse(NativeMapExtensionsKt.getNonNullString(var1, "verticalAlignment")),
            FastestListPlaceholderAlignment.Horizontal.Companion.parse(NativeMapExtensionsKt.getNonNullString(var1, "horizontalAlignment"))
         );
      }
   } else {
      return FastestListPlaceholderType.None.INSTANCE;
   }
}

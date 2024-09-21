package com.discord.fastest_list.react

import com.discord.fastest_list.android.placeholder.FastestListPlaceholderAlignment
import com.discord.fastest_list.android.placeholder.FastestListPlaceholderType
import com.discord.fastest_list.android.placeholder.FastestListPlaceholderType.Shape.Type
import com.discord.fastest_list.android.placeholder.FastestListPlaceholderType.Shape.Type.Companion
import com.discord.misc.utilities.size.SizeUtilsKt
import com.discord.react.utilities.NativeMapExtensionsKt
import com.discord.theme.utils.ColorUtilsKt
import com.facebook.react.bridge.ReadableMap
import kotlin.jvm.internal.q

private const val PLACEHOLDER_TYPE_FEED_ITEM: Int = 2
private const val PLACEHOLDER_TYPE_NONE: Int = 0
private const val PLACEHOLDER_TYPE_SHAPE: Int = 1

private operator fun Companion.invoke(key: String, value: ReadableMap): Type {
   q.h(var0, "<this>");
   var1 = NativeMapExtensionsKt.getNonNullString(var2, var1, "circle");
   val var3: FastestListPlaceholderType.Shape.Type;
   if (q.c(var1, "circle")) {
      var3 = FastestListPlaceholderType.Shape.Type.CIRCLE;
   } else {
      if (!q.c(var1, "rect")) {
         val var4: StringBuilder = new StringBuilder();
         var4.append("Unknown placeholder shape type ");
         var4.append(var1);
         throw new IllegalArgumentException(var4.toString());
      }

      var3 = FastestListPlaceholderType.Shape.Type.RECT;
   }

   return var3;
}

internal operator fun com.discord.fastest_list.android.placeholder.FastestListPlaceholderType.Companion.invoke(value: ReadableMap): FastestListPlaceholderType {
   q.h(var0, "<this>");
   q.h(var1, "value");
   var var15: Int = var1.getInt("placeholderType");
   val var22: Any;
   if (var15 != 0) {
      if (var15 != 1) {
         if (var15 != 2) {
            val var23: StringBuilder = new StringBuilder();
            var23.append("Unknown placeholder type ");
            var23.append(var15);
            throw new IllegalArgumentException(var23.toString());
         }

         var22 = new FastestListPlaceholderType.FeedItem(
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
         val var26: Float = SizeUtilsKt.getDpToPx(var1.getInt("borderRadius"));
         var15 = ColorUtilsKt.rgbaToArgb(NativeMapExtensionsKt.getNonNullString(var1, "placeholderShapeColorRgba"));
         val var32: Int = var1.getInt("placeholderShapeCount");
         val var27: Float = SizeUtilsKt.getDpToPx(var1.getInt("placeholderShapeGap"));
         val var20: FastestListPlaceholderType.Shape.Type = invoke(FastestListPlaceholderType.Shape.Type.Companion, "placeholderShape", var1);
         val var29: Float = SizeUtilsKt.getDpToPx(var1.getInt("placeholderShapePaddingHorizontal"));
         val var28: Float = SizeUtilsKt.getDpToPx(var1.getInt("placeholderShapePaddingVertical"));
         val var24: Int = NativeMapExtensionsKt.getNullableInt$default(var1, "width", null, 2, null);
         val var25: java.lang.Float;
         if (var24 != null) {
            var25 = (float)SizeUtilsKt.getDpToPx(var24);
         } else {
            var25 = null;
         }

         val var19: Int = NativeMapExtensionsKt.getNullableInt$default(var1, "height", null, 2, null);
         val var33: java.lang.Float;
         if (var19 != null) {
            var33 = (float)SizeUtilsKt.getDpToPx(var19);
         } else {
            var33 = null;
         }

         var22 = new FastestListPlaceholderType.Shape(
            var26,
            var15,
            var32,
            var27,
            var29,
            var28,
            var25,
            var33,
            var20,
            FastestListPlaceholderAlignment.Vertical.Companion.parse(NativeMapExtensionsKt.getNonNullString(var1, "verticalAlignment")),
            FastestListPlaceholderAlignment.Horizontal.Companion.parse(NativeMapExtensionsKt.getNonNullString(var1, "horizontalAlignment"))
         );
      }
   } else {
      var22 = FastestListPlaceholderType.None.INSTANCE;
   }

   return (FastestListPlaceholderType)var22;
}

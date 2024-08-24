package com.discord.fastest_list.android.placeholder

import kotlin.jvm.internal.r

internal sealed class FastestListPlaceholderType protected constructor() {
   public companion object

   public data class FeedItem(backgroundColor: Int,
         borderRadius: Float,
         borderTopLeftRadius: Float,
         borderTopRightRadius: Float,
         borderBottomLeftRadius: Float,
         borderBottomRightRadius: Float,
         color: Int,
         divider: Boolean,
         dividerColor: Int,
         dividerPaddingLeft: Float,
         dividerPaddingRight: Float,
         padding: Float,
         shapeType: com.discord.fastest_list.android.placeholder.FastestListPlaceholderType.Shape.Type,
         shapeSize: Float,
         labelPadding: Float,
         labelPaddingInnerRatio: Float,
         labelSize: Float,
         labelSecondarySize: Float
      )
      : FastestListPlaceholderType {
      public final val backgroundColor: Int
      public final val borderBottomLeftRadius: Float
      public final val borderBottomRightRadius: Float
      public final val borderRadius: Float
      public final val borderTopLeftRadius: Float
      public final val borderTopRightRadius: Float
      public final val color: Int
      public final val divider: Boolean
      public final val dividerColor: Int
      public final val dividerPaddingLeft: Float
      public final val dividerPaddingRight: Float
      public final val labelPadding: Float
      public final val labelPaddingInnerRatio: Float
      public final val labelSecondarySize: Float
      public final val labelSize: Float
      public final val padding: Float
      public final val shapeSize: Float
      public final val shapeType: com.discord.fastest_list.android.placeholder.FastestListPlaceholderType.Shape.Type

      init {
         r.h(var13, "shapeType");
         super(null);
         this.backgroundColor = var1;
         this.borderRadius = var2;
         this.borderTopLeftRadius = var3;
         this.borderTopRightRadius = var4;
         this.borderBottomLeftRadius = var5;
         this.borderBottomRightRadius = var6;
         this.color = var7;
         this.divider = var8;
         this.dividerColor = var9;
         this.dividerPaddingLeft = var10;
         this.dividerPaddingRight = var11;
         this.padding = var12;
         this.shapeType = var13;
         this.shapeSize = var14;
         this.labelPadding = var15;
         this.labelPaddingInnerRatio = var16;
         this.labelSize = var17;
         this.labelSecondarySize = var18;
      }

      public operator fun component1(): Int {
         return this.backgroundColor;
      }

      public operator fun component10(): Float {
         return this.dividerPaddingLeft;
      }

      public operator fun component11(): Float {
         return this.dividerPaddingRight;
      }

      public operator fun component12(): Float {
         return this.padding;
      }

      public operator fun component13(): com.discord.fastest_list.android.placeholder.FastestListPlaceholderType.Shape.Type {
         return this.shapeType;
      }

      public operator fun component14(): Float {
         return this.shapeSize;
      }

      public operator fun component15(): Float {
         return this.labelPadding;
      }

      public operator fun component16(): Float {
         return this.labelPaddingInnerRatio;
      }

      public operator fun component17(): Float {
         return this.labelSize;
      }

      public operator fun component18(): Float {
         return this.labelSecondarySize;
      }

      public operator fun component2(): Float {
         return this.borderRadius;
      }

      public operator fun component3(): Float {
         return this.borderTopLeftRadius;
      }

      public operator fun component4(): Float {
         return this.borderTopRightRadius;
      }

      public operator fun component5(): Float {
         return this.borderBottomLeftRadius;
      }

      public operator fun component6(): Float {
         return this.borderBottomRightRadius;
      }

      public operator fun component7(): Int {
         return this.color;
      }

      public operator fun component8(): Boolean {
         return this.divider;
      }

      public operator fun component9(): Int {
         return this.dividerColor;
      }

      public fun copy(
         backgroundColor: Int = var0.backgroundColor,
         borderRadius: Float = var0.borderRadius,
         borderTopLeftRadius: Float = var0.borderTopLeftRadius,
         borderTopRightRadius: Float = var0.borderTopRightRadius,
         borderBottomLeftRadius: Float = var0.borderBottomLeftRadius,
         borderBottomRightRadius: Float = var0.borderBottomRightRadius,
         color: Int = var0.color,
         divider: Boolean = var0.divider,
         dividerColor: Int = var0.dividerColor,
         dividerPaddingLeft: Float = var0.dividerPaddingLeft,
         dividerPaddingRight: Float = var0.dividerPaddingRight,
         padding: Float = var0.padding,
         shapeType: com.discord.fastest_list.android.placeholder.FastestListPlaceholderType.Shape.Type = var0.shapeType,
         shapeSize: Float = var0.shapeSize,
         labelPadding: Float = var0.labelPadding,
         labelPaddingInnerRatio: Float = var0.labelPaddingInnerRatio,
         labelSize: Float = var0.labelSize,
         labelSecondarySize: Float = var0.labelSecondarySize
      ): com.discord.fastest_list.android.placeholder.FastestListPlaceholderType.FeedItem {
         r.h(var13, "shapeType");
         return new FastestListPlaceholderType.FeedItem(
            var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, var18
         );
      }

      public override operator fun equals(other: Any?): Boolean {
         if (this === var1) {
            return true;
         } else if (var1 !is FastestListPlaceholderType.FeedItem) {
            return false;
         } else {
            var1 = var1;
            if (this.backgroundColor != var1.backgroundColor) {
               return false;
            } else if (java.lang.Float.compare(this.borderRadius, var1.borderRadius) != 0) {
               return false;
            } else if (java.lang.Float.compare(this.borderTopLeftRadius, var1.borderTopLeftRadius) != 0) {
               return false;
            } else if (java.lang.Float.compare(this.borderTopRightRadius, var1.borderTopRightRadius) != 0) {
               return false;
            } else if (java.lang.Float.compare(this.borderBottomLeftRadius, var1.borderBottomLeftRadius) != 0) {
               return false;
            } else if (java.lang.Float.compare(this.borderBottomRightRadius, var1.borderBottomRightRadius) != 0) {
               return false;
            } else if (this.color != var1.color) {
               return false;
            } else if (this.divider != var1.divider) {
               return false;
            } else if (this.dividerColor != var1.dividerColor) {
               return false;
            } else if (java.lang.Float.compare(this.dividerPaddingLeft, var1.dividerPaddingLeft) != 0) {
               return false;
            } else if (java.lang.Float.compare(this.dividerPaddingRight, var1.dividerPaddingRight) != 0) {
               return false;
            } else if (java.lang.Float.compare(this.padding, var1.padding) != 0) {
               return false;
            } else if (this.shapeType != var1.shapeType) {
               return false;
            } else if (java.lang.Float.compare(this.shapeSize, var1.shapeSize) != 0) {
               return false;
            } else if (java.lang.Float.compare(this.labelPadding, var1.labelPadding) != 0) {
               return false;
            } else if (java.lang.Float.compare(this.labelPaddingInnerRatio, var1.labelPaddingInnerRatio) != 0) {
               return false;
            } else if (java.lang.Float.compare(this.labelSize, var1.labelSize) != 0) {
               return false;
            } else {
               return java.lang.Float.compare(this.labelSecondarySize, var1.labelSecondarySize) == 0;
            }
         }
      }

      public override fun hashCode(): Int {
         val var3: Int = Integer.hashCode(this.backgroundColor);
         val var7: Int = java.lang.Float.hashCode(this.borderRadius);
         val var4: Int = java.lang.Float.hashCode(this.borderTopLeftRadius);
         val var5: Int = java.lang.Float.hashCode(this.borderTopRightRadius);
         val var9: Int = java.lang.Float.hashCode(this.borderBottomLeftRadius);
         val var8: Int = java.lang.Float.hashCode(this.borderBottomRightRadius);
         val var6: Int = Integer.hashCode(this.color);
         var var1: Byte = this.divider;
         if (this.divider != 0) {
            var1 = 1;
         }

         return (
                  (
                           (
                                    (
                                             (
                                                      (
                                                               (
                                                                        (
                                                                                 (
                                                                                          (
                                                                                                   (
                                                                                                            (
                                                                                                                     (
                                                                                                                              (
                                                                                                                                       (
                                                                                                                                                (
                                                                                                                                                         var3
                                                                                                                                                               * 31
                                                                                                                                                            + var7
                                                                                                                                                      )
                                                                                                                                                      * 31
                                                                                                                                                   + var4
                                                                                                                                             )
                                                                                                                                             * 31
                                                                                                                                          + var5
                                                                                                                                    )
                                                                                                                                    * 31
                                                                                                                                 + var9
                                                                                                                           )
                                                                                                                           * 31
                                                                                                                        + var8
                                                                                                                  )
                                                                                                                  * 31
                                                                                                               + var6
                                                                                                         )
                                                                                                         * 31
                                                                                                      + var1
                                                                                                )
                                                                                                * 31
                                                                                             + Integer.hashCode(this.dividerColor)
                                                                                       )
                                                                                       * 31
                                                                                    + java.lang.Float.hashCode(this.dividerPaddingLeft)
                                                                              )
                                                                              * 31
                                                                           + java.lang.Float.hashCode(this.dividerPaddingRight)
                                                                     )
                                                                     * 31
                                                                  + java.lang.Float.hashCode(this.padding)
                                                            )
                                                            * 31
                                                         + this.shapeType.hashCode()
                                                   )
                                                   * 31
                                                + java.lang.Float.hashCode(this.shapeSize)
                                          )
                                          * 31
                                       + java.lang.Float.hashCode(this.labelPadding)
                                 )
                                 * 31
                              + java.lang.Float.hashCode(this.labelPaddingInnerRatio)
                        )
                        * 31
                     + java.lang.Float.hashCode(this.labelSize)
               )
               * 31
            + java.lang.Float.hashCode(this.labelSecondarySize);
      }

      public override fun toString(): String {
         val var14: Int = this.backgroundColor;
         val var4: Float = this.borderRadius;
         val var9: Float = this.borderTopLeftRadius;
         val var2: Float = this.borderTopRightRadius;
         val var3: Float = this.borderBottomLeftRadius;
         val var6: Float = this.borderBottomRightRadius;
         val var16: Int = this.color;
         val var17: Boolean = this.divider;
         val var15: Int = this.dividerColor;
         val var8: Float = this.dividerPaddingLeft;
         val var10: Float = this.dividerPaddingRight;
         val var11: Float = this.padding;
         val var18: FastestListPlaceholderType.Shape.Type = this.shapeType;
         val var5: Float = this.shapeSize;
         val var7: Float = this.labelPadding;
         val var13: Float = this.labelPaddingInnerRatio;
         val var12: Float = this.labelSize;
         val var1: Float = this.labelSecondarySize;
         val var19: StringBuilder = new StringBuilder();
         var19.append("FeedItem(backgroundColor=");
         var19.append(var14);
         var19.append(", borderRadius=");
         var19.append(var4);
         var19.append(", borderTopLeftRadius=");
         var19.append(var9);
         var19.append(", borderTopRightRadius=");
         var19.append(var2);
         var19.append(", borderBottomLeftRadius=");
         var19.append(var3);
         var19.append(", borderBottomRightRadius=");
         var19.append(var6);
         var19.append(", color=");
         var19.append(var16);
         var19.append(", divider=");
         var19.append(var17);
         var19.append(", dividerColor=");
         var19.append(var15);
         var19.append(", dividerPaddingLeft=");
         var19.append(var8);
         var19.append(", dividerPaddingRight=");
         var19.append(var10);
         var19.append(", padding=");
         var19.append(var11);
         var19.append(", shapeType=");
         var19.append(var18);
         var19.append(", shapeSize=");
         var19.append(var5);
         var19.append(", labelPadding=");
         var19.append(var7);
         var19.append(", labelPaddingInnerRatio=");
         var19.append(var13);
         var19.append(", labelSize=");
         var19.append(var12);
         var19.append(", labelSecondarySize=");
         var19.append(var1);
         var19.append(")");
         return var19.toString();
      }
   }

   public object None : FastestListPlaceholderType()

   public data class Shape(borderRadius: Float,
         color: Int,
         count: Int,
         paddingHorizontal: Float,
         paddingVertical: Float,
         width: Float?,
         height: Float?,
         type: com.discord.fastest_list.android.placeholder.FastestListPlaceholderType.Shape.Type
      )
      : FastestListPlaceholderType {
      public final val borderRadius: Float
      public final val color: Int
      public final val count: Int
      public final val height: Float?
      public final val paddingHorizontal: Float
      public final val paddingVertical: Float
      public final val type: com.discord.fastest_list.android.placeholder.FastestListPlaceholderType.Shape.Type
      public final val width: Float?

      init {
         r.h(var8, "type");
         super(null);
         this.borderRadius = var1;
         this.color = var2;
         this.count = var3;
         this.paddingHorizontal = var4;
         this.paddingVertical = var5;
         this.width = var6;
         this.height = var7;
         this.type = var8;
      }

      public operator fun component1(): Float {
         return this.borderRadius;
      }

      public operator fun component2(): Int {
         return this.color;
      }

      public operator fun component3(): Int {
         return this.count;
      }

      public operator fun component4(): Float {
         return this.paddingHorizontal;
      }

      public operator fun component5(): Float {
         return this.paddingVertical;
      }

      public operator fun component6(): Float? {
         return this.width;
      }

      public operator fun component7(): Float? {
         return this.height;
      }

      public operator fun component8(): com.discord.fastest_list.android.placeholder.FastestListPlaceholderType.Shape.Type {
         return this.type;
      }

      public fun copy(
         borderRadius: Float = var0.borderRadius,
         color: Int = var0.color,
         count: Int = var0.count,
         paddingHorizontal: Float = var0.paddingHorizontal,
         paddingVertical: Float = var0.paddingVertical,
         width: Float? = var0.width,
         height: Float? = var0.height,
         type: com.discord.fastest_list.android.placeholder.FastestListPlaceholderType.Shape.Type = var0.type
      ): com.discord.fastest_list.android.placeholder.FastestListPlaceholderType.Shape {
         r.h(var8, "type");
         return new FastestListPlaceholderType.Shape(var1, var2, var3, var4, var5, var6, var7, var8);
      }

      public override operator fun equals(other: Any?): Boolean {
         if (this === var1) {
            return true;
         } else if (var1 !is FastestListPlaceholderType.Shape) {
            return false;
         } else {
            var1 = var1;
            if (java.lang.Float.compare(this.borderRadius, var1.borderRadius) != 0) {
               return false;
            } else if (this.color != var1.color) {
               return false;
            } else if (this.count != var1.count) {
               return false;
            } else if (java.lang.Float.compare(this.paddingHorizontal, var1.paddingHorizontal) != 0) {
               return false;
            } else if (java.lang.Float.compare(this.paddingVertical, var1.paddingVertical) != 0) {
               return false;
            } else if (!r.c(this.width, var1.width)) {
               return false;
            } else if (!r.c(this.height, var1.height)) {
               return false;
            } else {
               return this.type === var1.type;
            }
         }
      }

      public override fun hashCode(): Int {
         val var7: Int = java.lang.Float.hashCode(this.borderRadius);
         val var4: Int = Integer.hashCode(this.color);
         val var3: Int = Integer.hashCode(this.count);
         val var5: Int = java.lang.Float.hashCode(this.paddingHorizontal);
         val var6: Int = java.lang.Float.hashCode(this.paddingVertical);
         var var2: Int = 0;
         val var1: Int;
         if (this.width == null) {
            var1 = 0;
         } else {
            var1 = this.width.hashCode();
         }

         if (this.height != null) {
            var2 = this.height.hashCode();
         }

         return ((((((var7 * 31 + var4) * 31 + var3) * 31 + var5) * 31 + var6) * 31 + var1) * 31 + var2) * 31 + this.type.hashCode();
      }

      public override fun toString(): String {
         val var3: Float = this.borderRadius;
         val var4: Int = this.color;
         val var5: Int = this.count;
         val var2: Float = this.paddingHorizontal;
         val var1: Float = this.paddingVertical;
         val var9: java.lang.Float = this.width;
         val var8: java.lang.Float = this.height;
         val var6: FastestListPlaceholderType.Shape.Type = this.type;
         val var7: StringBuilder = new StringBuilder();
         var7.append("Shape(borderRadius=");
         var7.append(var3);
         var7.append(", color=");
         var7.append(var4);
         var7.append(", count=");
         var7.append(var5);
         var7.append(", paddingHorizontal=");
         var7.append(var2);
         var7.append(", paddingVertical=");
         var7.append(var1);
         var7.append(", width=");
         var7.append(var9);
         var7.append(", height=");
         var7.append(var8);
         var7.append(", type=");
         var7.append(var6);
         var7.append(")");
         return var7.toString();
      }

      public enum class Type {
         CIRCLE,
         RECT         @JvmStatic
         private FastestListPlaceholderType.Shape.Type[] $VALUES = $values();
         @JvmStatic
         public FastestListPlaceholderType.Shape.Type.Companion Companion = new FastestListPlaceholderType.Shape.Type.Companion(null);

         public companion object
      }
   }
}

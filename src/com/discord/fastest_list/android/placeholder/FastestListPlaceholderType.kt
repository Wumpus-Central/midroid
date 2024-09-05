package com.discord.fastest_list.android.placeholder

import ck.a
import kotlin.enums.EnumEntries
import kotlin.jvm.internal.q

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
         q.h(var13, "shapeType");
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
         q.h(var13, "shapeType");
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
                                                                                                                                                         Integer.hashCode(
                                                                                                                                                                  this.backgroundColor
                                                                                                                                                               )
                                                                                                                                                               * 31
                                                                                                                                                            + java.lang.Float.hashCode(
                                                                                                                                                               this.borderRadius
                                                                                                                                                            )
                                                                                                                                                      )
                                                                                                                                                      * 31
                                                                                                                                                   + java.lang.Float.hashCode(
                                                                                                                                                      this.borderTopLeftRadius
                                                                                                                                                   )
                                                                                                                                             )
                                                                                                                                             * 31
                                                                                                                                          + java.lang.Float.hashCode(
                                                                                                                                             this.borderTopRightRadius
                                                                                                                                          )
                                                                                                                                    )
                                                                                                                                    * 31
                                                                                                                                 + java.lang.Float.hashCode(
                                                                                                                                    this.borderBottomLeftRadius
                                                                                                                                 )
                                                                                                                           )
                                                                                                                           * 31
                                                                                                                        + java.lang.Float.hashCode(
                                                                                                                           this.borderBottomRightRadius
                                                                                                                        )
                                                                                                                  )
                                                                                                                  * 31
                                                                                                               + Integer.hashCode(this.color)
                                                                                                         )
                                                                                                         * 31
                                                                                                      + java.lang.Boolean.hashCode(this.divider)
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
         val var15: Int = this.backgroundColor;
         val var6: Float = this.borderRadius;
         val var5: Float = this.borderTopLeftRadius;
         val var9: Float = this.borderTopRightRadius;
         val var7: Float = this.borderBottomLeftRadius;
         val var8: Float = this.borderBottomRightRadius;
         val var16: Int = this.color;
         val var17: Boolean = this.divider;
         val var14: Int = this.dividerColor;
         val var3: Float = this.dividerPaddingLeft;
         val var12: Float = this.dividerPaddingRight;
         val var1: Float = this.padding;
         val var19: FastestListPlaceholderType.Shape.Type = this.shapeType;
         val var4: Float = this.shapeSize;
         val var10: Float = this.labelPadding;
         val var11: Float = this.labelPaddingInnerRatio;
         val var13: Float = this.labelSize;
         val var2: Float = this.labelSecondarySize;
         val var18: StringBuilder = new StringBuilder();
         var18.append("FeedItem(backgroundColor=");
         var18.append(var15);
         var18.append(", borderRadius=");
         var18.append(var6);
         var18.append(", borderTopLeftRadius=");
         var18.append(var5);
         var18.append(", borderTopRightRadius=");
         var18.append(var9);
         var18.append(", borderBottomLeftRadius=");
         var18.append(var7);
         var18.append(", borderBottomRightRadius=");
         var18.append(var8);
         var18.append(", color=");
         var18.append(var16);
         var18.append(", divider=");
         var18.append(var17);
         var18.append(", dividerColor=");
         var18.append(var14);
         var18.append(", dividerPaddingLeft=");
         var18.append(var3);
         var18.append(", dividerPaddingRight=");
         var18.append(var12);
         var18.append(", padding=");
         var18.append(var1);
         var18.append(", shapeType=");
         var18.append(var19);
         var18.append(", shapeSize=");
         var18.append(var4);
         var18.append(", labelPadding=");
         var18.append(var10);
         var18.append(", labelPaddingInnerRatio=");
         var18.append(var11);
         var18.append(", labelSize=");
         var18.append(var13);
         var18.append(", labelSecondarySize=");
         var18.append(var2);
         var18.append(")");
         return var18.toString();
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
         q.h(var8, "type");
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
         q.h(var8, "type");
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
            } else if (!q.c(this.width, var1.width)) {
               return false;
            } else if (!q.c(this.height, var1.height)) {
               return false;
            } else {
               return this.type === var1.type;
            }
         }
      }

      public override fun hashCode(): Int {
         val var7: Int = java.lang.Float.hashCode(this.borderRadius);
         val var6: Int = Integer.hashCode(this.color);
         val var4: Int = Integer.hashCode(this.count);
         val var5: Int = java.lang.Float.hashCode(this.paddingHorizontal);
         val var3: Int = java.lang.Float.hashCode(this.paddingVertical);
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

         return ((((((var7 * 31 + var6) * 31 + var4) * 31 + var5) * 31 + var3) * 31 + var1) * 31 + var2) * 31 + this.type.hashCode();
      }

      public override fun toString(): String {
         val var2: Float = this.borderRadius;
         val var5: Int = this.color;
         val var4: Int = this.count;
         val var3: Float = this.paddingHorizontal;
         val var1: Float = this.paddingVertical;
         val var6: java.lang.Float = this.width;
         val var8: java.lang.Float = this.height;
         val var7: FastestListPlaceholderType.Shape.Type = this.type;
         val var9: StringBuilder = new StringBuilder();
         var9.append("Shape(borderRadius=");
         var9.append(var2);
         var9.append(", color=");
         var9.append(var5);
         var9.append(", count=");
         var9.append(var4);
         var9.append(", paddingHorizontal=");
         var9.append(var3);
         var9.append(", paddingVertical=");
         var9.append(var1);
         var9.append(", width=");
         var9.append(var6);
         var9.append(", height=");
         var9.append(var8);
         var9.append(", type=");
         var9.append(var7);
         var9.append(")");
         return var9.toString();
      }

      public enum class Type {
         CIRCLE,
         RECT         @JvmStatic
         private EnumEntries $ENTRIES;
         @JvmStatic
         private FastestListPlaceholderType.Shape.Type[] $VALUES;
         @JvmStatic
         public FastestListPlaceholderType.Shape.Type.Companion Companion = new FastestListPlaceholderType.Shape.Type.Companion(null);

         @JvmStatic
         fun {
            val var0: Array<FastestListPlaceholderType.Shape.Type> = $values();
            $VALUES = var0;
            $ENTRIES = a.a(var0);
         }

         @JvmStatic
         fun getEntries(): EnumEntries {
            return $ENTRIES;
         }

         public companion object
      }
   }
}

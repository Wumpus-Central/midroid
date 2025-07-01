package com.discord.chat.bridge.polls

import com.discord.misc.utilities.size.SizeUtilsKt
import com.discord.react.utilities.ReactColorToAndroidColorKt
import com.discord.theme.ThemeManagerKt
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import tb.f

@f
public data class PollStyleSet(border: Int? = null,
      borderWidth: Int = 0,
      fill: Int? = null,
      label: Int? = null,
      opacity: Float = 1.0F,
      answerBackground: Int? = null,
      answerFill: Int? = null,
      radioStyle: PollRadioStyle? = null,
      radioBackground: Int? = null,
      radioForeground: Int? = null
   ) :
   IPollStyleSet {
   private final val border: Int?
   private final val borderWidth: Int
   private final val fill: Int?
   private final val label: Int?
   public final val opacity: Float
   private final val answerBackground: Int?
   private final val answerFill: Int?
   public final val radioStyle: PollRadioStyle?
   private final val radioBackground: Int?
   private final val radioForeground: Int?

   public open val borderColor: Int
      public open get() {
         val var1: Int;
         if (this.border != null) {
            var1 = ReactColorToAndroidColorKt.reactColorToAndroidColor(this.border.intValue());
         } else {
            var1 = ThemeManagerKt.getTheme().getBackgroundTertiary();
         }

         return var1;
      }


   public open val borderWidthPx: Int
      public open get() {
         return SizeUtilsKt.getDpToPx(this.borderWidth);
      }


   public open val fillColor: Int
      public open get() {
         val var1: Int;
         if (this.fill != null) {
            var1 = ReactColorToAndroidColorKt.reactColorToAndroidColor(this.fill.intValue());
         } else {
            var1 = ThemeManagerKt.getTheme().getBackgroundSecondary();
         }

         return var1;
      }


   public open val labelColor: Int
      public open get() {
         val var1: Int;
         if (this.label != null) {
            var1 = ReactColorToAndroidColorKt.reactColorToAndroidColor(this.label.intValue());
         } else {
            var1 = ThemeManagerKt.getTheme().getTextPrimary();
         }

         return var1;
      }


   public open val answerBackgroundColor: Int
      public open get() {
         val var1: Int;
         if (this.answerBackground != null) {
            var1 = ReactColorToAndroidColorKt.reactColorToAndroidColor(this.answerBackground.intValue());
         } else {
            var1 = ThemeManagerKt.getTheme().getBackgroundSecondary();
         }

         return var1;
      }


   public open val answerFillColor: Int
      public open get() {
         val var1: Int;
         if (this.answerFill != null) {
            var1 = ReactColorToAndroidColorKt.reactColorToAndroidColor(this.answerFill.intValue());
         } else {
            var1 = ThemeManagerKt.getTheme().getBackgroundTertiary();
         }

         return var1;
      }


   public open val radioBackgroundColor: Int
      public open get() {
         val var1: Int;
         if (this.radioBackground != null) {
            var1 = ReactColorToAndroidColorKt.reactColorToAndroidColor(this.radioBackground.intValue());
         } else {
            var1 = ThemeManagerKt.getTheme().getInteractiveNormal();
         }

         return var1;
      }


   public open val radioForegroundColor: Int
      public open get() {
         val var1: Int;
         if (this.radioForeground != null) {
            var1 = ReactColorToAndroidColorKt.reactColorToAndroidColor(this.radioForeground.intValue());
         } else {
            var1 = ThemeManagerKt.getTheme().getWhite();
         }

         return var1;
      }


   fun PollStyleSet() {
      this(null, 0, null, null, 0.0F, null, null, null, null, null, 1023, null);
   }

   init {
      this.border = var1;
      this.borderWidth = var2;
      this.fill = var3;
      this.label = var4;
      this.opacity = var5;
      this.answerBackground = var6;
      this.answerFill = var7;
      this.radioStyle = var8;
      this.radioBackground = var9;
      this.radioForeground = var10;
   }

   @JvmStatic
   fun `DEFAULT_delegate$lambda$6`(): PollStyleSet {
      return new PollStyleSet(null, 0, null, null, 0.0F, null, null, null, null, null, 1023, null);
   }

   private operator fun component1(): Int? {
      return this.border;
   }

   private operator fun component10(): Int? {
      return this.radioForeground;
   }

   private operator fun component2(): Int {
      return this.borderWidth;
   }

   private operator fun component3(): Int? {
      return this.fill;
   }

   private operator fun component4(): Int? {
      return this.label;
   }

   private operator fun component6(): Int? {
      return this.answerBackground;
   }

   private operator fun component7(): Int? {
      return this.answerFill;
   }

   private operator fun component9(): Int? {
      return this.radioBackground;
   }

   public operator fun component5(): Float {
      return this.opacity;
   }

   public operator fun component8(): PollRadioStyle? {
      return this.radioStyle;
   }

   public fun copy(
      border: Int? = var0.border,
      borderWidth: Int = var0.borderWidth,
      fill: Int? = var0.fill,
      label: Int? = var0.label,
      opacity: Float = var0.opacity,
      answerBackground: Int? = var0.answerBackground,
      answerFill: Int? = var0.answerFill,
      radioStyle: PollRadioStyle? = var0.radioStyle,
      radioBackground: Int? = var0.radioBackground,
      radioForeground: Int? = var0.radioForeground
   ): PollStyleSet {
      return new PollStyleSet(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is PollStyleSet) {
         return false;
      } else {
         var1 = var1;
         if (!q.c(this.border, var1.border)) {
            return false;
         } else if (this.borderWidth != var1.borderWidth) {
            return false;
         } else if (!q.c(this.fill, var1.fill)) {
            return false;
         } else if (!q.c(this.label, var1.label)) {
            return false;
         } else if (java.lang.Float.compare(this.opacity, var1.opacity) != 0) {
            return false;
         } else if (!q.c(this.answerBackground, var1.answerBackground)) {
            return false;
         } else if (!q.c(this.answerFill, var1.answerFill)) {
            return false;
         } else if (this.radioStyle != var1.radioStyle) {
            return false;
         } else if (!q.c(this.radioBackground, var1.radioBackground)) {
            return false;
         } else {
            return q.c(this.radioForeground, var1.radioForeground);
         }
      }
   }

   public override fun hashCode(): Int {
      var var8: Int = 0;
      val var1: Int;
      if (this.border == null) {
         var1 = 0;
      } else {
         var1 = this.border.hashCode();
      }

      val var9: Int = Integer.hashCode(this.borderWidth);
      val var2: Int;
      if (this.fill == null) {
         var2 = 0;
      } else {
         var2 = this.fill.hashCode();
      }

      val var3: Int;
      if (this.label == null) {
         var3 = 0;
      } else {
         var3 = this.label.hashCode();
      }

      val var10: Int = java.lang.Float.hashCode(this.opacity);
      val var4: Int;
      if (this.answerBackground == null) {
         var4 = 0;
      } else {
         var4 = this.answerBackground.hashCode();
      }

      val var5: Int;
      if (this.answerFill == null) {
         var5 = 0;
      } else {
         var5 = this.answerFill.hashCode();
      }

      val var6: Int;
      if (this.radioStyle == null) {
         var6 = 0;
      } else {
         var6 = this.radioStyle.hashCode();
      }

      val var7: Int;
      if (this.radioBackground == null) {
         var7 = 0;
      } else {
         var7 = this.radioBackground.hashCode();
      }

      if (this.radioForeground != null) {
         var8 = this.radioForeground.hashCode();
      }

      return ((((((((var1 * 31 + var9) * 31 + var2) * 31 + var3) * 31 + var10) * 31 + var4) * 31 + var5) * 31 + var6) * 31 + var7) * 31 + var8;
   }

   public override fun toString(): String {
      val var4: Int = this.border;
      val var2: Int = this.borderWidth;
      val var7: Int = this.fill;
      val var3: Int = this.label;
      val var1: Float = this.opacity;
      val var9: Int = this.answerBackground;
      val var6: Int = this.answerFill;
      val var5: PollRadioStyle = this.radioStyle;
      val var10: Int = this.radioBackground;
      val var11: Int = this.radioForeground;
      val var8: StringBuilder = new StringBuilder();
      var8.append("PollStyleSet(border=");
      var8.append(var4);
      var8.append(", borderWidth=");
      var8.append(var2);
      var8.append(", fill=");
      var8.append(var7);
      var8.append(", label=");
      var8.append(var3);
      var8.append(", opacity=");
      var8.append(var1);
      var8.append(", answerBackground=");
      var8.append(var9);
      var8.append(", answerFill=");
      var8.append(var6);
      var8.append(", radioStyle=");
      var8.append(var5);
      var8.append(", radioBackground=");
      var8.append(var10);
      var8.append(", radioForeground=");
      var8.append(var11);
      var8.append(")");
      return var8.toString();
   }

   public companion object {
      public const val DEFAULT_KEY: String

      public final val DEFAULT: PollStyleSet
         public final get() {
            return PollStyleSet.access$getDEFAULT$delegate$cp().getValue() as PollStyleSet;
         }


      public fun serializer(): KSerializer<PollStyleSet> {
         return PollStyleSet.$serializer.INSTANCE;
      }
   }
}

package com.discord.chat.bridge.polls

import com.discord.misc.utilities.size.SizeUtilsKt
import com.discord.react.utilities.ReactColorToAndroidColorKt
import com.discord.theme.ThemeManagerKt
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
import nn.f
import nn.n
import on.a
import qn.f0
import qn.g0
import qn.n0

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
   private final val answerBackground: Int?

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


   private final val answerFill: Int?

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


   private final val border: Int?

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


   private final val borderWidth: Int

   public open val borderWidthPx: Int
      public open get() {
         return SizeUtilsKt.getDpToPx(this.borderWidth);
      }


   private final val fill: Int?

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


   private final val label: Int?

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


   public final val opacity: Float
   private final val radioBackground: Int?

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


   private final val radioForeground: Int?

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


   public final val radioStyle: PollRadioStyle?

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
      val var11: Int = this.border;
      val var2: Int = this.borderWidth;
      val var8: Int = this.fill;
      val var5: Int = this.label;
      val var1: Float = this.opacity;
      val var6: Int = this.answerBackground;
      val var9: Int = this.answerFill;
      val var3: PollRadioStyle = this.radioStyle;
      val var10: Int = this.radioBackground;
      val var7: Int = this.radioForeground;
      val var4: StringBuilder = new StringBuilder();
      var4.append("PollStyleSet(border=");
      var4.append(var11);
      var4.append(", borderWidth=");
      var4.append(var2);
      var4.append(", fill=");
      var4.append(var8);
      var4.append(", label=");
      var4.append(var5);
      var4.append(", opacity=");
      var4.append(var1);
      var4.append(", answerBackground=");
      var4.append(var6);
      var4.append(", answerFill=");
      var4.append(var9);
      var4.append(", radioStyle=");
      var4.append(var3);
      var4.append(", radioBackground=");
      var4.append(var10);
      var4.append(", radioForeground=");
      var4.append(var7);
      var4.append(")");
      return var4.toString();
   }

   public object `$serializer` : g0 {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: PollStyleSet.$serializer = new PollStyleSet.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.bridge.polls.PollStyleSet", var0, 10);
         var1.c("border", true);
         var1.c("borderWidth", true);
         var1.c("fill", true);
         var1.c("label", true);
         var1.c("opacity", true);
         var1.c("answerBackground", true);
         var1.c("answerFill", true);
         var1.c("radioStyle", true);
         var1.c("radioBackground", true);
         var1.c("radioForeground", true);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         val var1: n0 = n0.a;
         return new KSerializer[]{
            a.u(n0.a), var1, a.u(var1), a.u(var1), f0.a, a.u(var1), a.u(var1), a.u(PollRadioStyle.Serializer.INSTANCE), a.u(var1), a.u(var1)
         };
      }

      public open fun deserialize(decoder: Decoder): PollStyleSet {
         q.h(var1, "decoder");
         val var19: SerialDescriptor = this.getDescriptor();
         val var20: c = var1.b(var19);
         val var8: Boolean = var20.p();
         var var5: Int = 9;
         var var2: Float;
         var var4: Int;
         var var9: Int;
         var var11: Int;
         var var12: Int;
         var var13: Int;
         var var15: Int;
         val var16: Int;
         val var17: Any;
         var var30: Int;
         if (var8) {
            val var14: n0 = n0.a;
            var15 = var20.n(var19, 0, n0.a, null) as Int;
            val var3: Int = var20.i(var19, 1);
            var11 = var20.n(var19, 2, var14, null) as Int;
            var13 = var20.n(var19, 3, var14, null) as Int;
            var2 = var20.u(var19, 4);
            var12 = var20.n(var19, 5, var14, null) as Int;
            var9 = var20.n(var19, 6, var14, null) as Int;
            val var21: PollRadioStyle = var20.n(var19, 7, PollRadioStyle.Serializer.INSTANCE, null) as PollRadioStyle;
            val var10: Int = var20.n(var19, 8, var14, null) as Int;
            var30 = var20.n(var19, 9, var14, null) as Int;
            var5 = 1023;
            var4 = var3;
            var17 = var21;
            var16 = var10;
         } else {
            var var6: Boolean = true;
            var4 = 0;
            var15 = null;
            var30 = null;
            var12 = null;
            var13 = null;
            var11 = null;
            var var26: Int = null;
            var var22: Int = null;
            var9 = null;
            var2 = 0.0F;
            var var23: Int = 0;

            while (var6) {
               val var7: Int = var20.o(var19);
               switch (var7) {
                  case -1:
                     var6 = false;
                     continue;
                  case 0:
                     var22 = var20.n(var19, 0, n0.a, var22) as Int;
                     var23 |= 1;
                     break;
                  case 1:
                     var4 = var20.i(var19, 1);
                     var23 |= 2;
                     break;
                  case 2:
                     var9 = var20.n(var19, 2, n0.a, var9) as Int;
                     var23 |= 4;
                     break;
                  case 3:
                     var26 = var20.n(var19, 3, n0.a, var26) as Int;
                     var23 |= 8;
                     break;
                  case 4:
                     var2 = var20.u(var19, 4);
                     var23 |= 16;
                     break;
                  case 5:
                     var11 = var20.n(var19, 5, n0.a, var11) as Int;
                     var23 |= 32;
                     break;
                  case 6:
                     var12 = var20.n(var19, 6, n0.a, var12) as Int;
                     var23 |= 64;
                     break;
                  case 7:
                     var13 = var20.n(var19, 7, PollRadioStyle.Serializer.INSTANCE, var13) as PollRadioStyle;
                     var23 |= 128;
                     var5 = 9;
                     continue;
                  case 8:
                     var30 = var20.n(var19, 8, n0.a, var30) as Int;
                     var23 |= 256;
                     continue;
                  case 9:
                     var15 = var20.n(var19, var5, n0.a, var15) as Int;
                     var23 |= 512;
                     continue;
                  default:
                     throw new n(var7);
               }

               var5 = 9;
            }

            var16 = var30;
            var30 = var15;
            var17 = var13;
            var9 = var12;
            var12 = var11;
            var13 = var26;
            var11 = var9;
            var15 = var22;
            var5 = var23;
         }

         var20.c(var19);
         return new PollStyleSet(var5, var15, var4, var11, var13, var2, var12, var9, (PollRadioStyle)var17, var16, var30, null);
      }

      public open fun serialize(encoder: Encoder, value: PollStyleSet) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         PollStyleSet.write$Self$chat_release(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return qn.g0.a.a(this);
      }
   }

   public companion object {
      public final val DEFAULT: PollStyleSet
         public final get() {
            return PollStyleSet.access$getDEFAULT$delegate$cp().getValue() as PollStyleSet;
         }


      public const val DEFAULT_KEY: String

      public fun serializer(): KSerializer<PollStyleSet> {
         return PollStyleSet.$serializer.INSTANCE;
      }
   }
}

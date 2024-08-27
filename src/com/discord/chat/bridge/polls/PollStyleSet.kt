package com.discord.chat.bridge.polls

import com.discord.misc.utilities.size.SizeUtilsKt
import com.discord.react.utilities.ReactColorToAndroidColorKt
import com.discord.theme.ThemeManagerKt
import kotlin.jvm.internal.r
import kotlinx.serialization.DeserializationStrategy
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
import uk.f
import uk.n
import vk.a
import xk.e0
import xk.f0
import xk.m0

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
      super();
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

   @JvmStatic
   public fun `write$Self`(self: PollStyleSet, output: CompositeEncoder, serialDesc: SerialDescriptor) {
      r.h(var0, "self");
      r.h(var1, "output");
      r.h(var2, "serialDesc");
      var var3: Boolean;
      if (!var1.A(var2, 0) && var0.border == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 0, m0.a, var0.border);
      }

      if (!var1.A(var2, 1) && var0.borderWidth == 0) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.w(var2, 1, var0.borderWidth);
      }

      if (!var1.A(var2, 2) && var0.fill == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 2, m0.a, var0.fill);
      }

      if (!var1.A(var2, 3) && var0.label == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 3, m0.a, var0.label);
      }

      if (!var1.A(var2, 4) && java.lang.Float.compare(var0.opacity, 1.0F) == 0) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.r(var2, 4, var0.opacity);
      }

      if (!var1.A(var2, 5) && var0.answerBackground == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 5, m0.a, var0.answerBackground);
      }

      if (!var1.A(var2, 6) && var0.answerFill == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 6, m0.a, var0.answerFill);
      }

      if (!var1.A(var2, 7) && var0.radioStyle == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 7, PollRadioStyle.Serializer.INSTANCE, var0.radioStyle);
      }

      if (!var1.A(var2, 8) && var0.radioBackground == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 8, m0.a, var0.radioBackground);
      }

      label88: {
         if (!var1.A(var2, 9)) {
            var3 = false;
            if (var0.radioForeground == null) {
               break label88;
            }
         }

         var3 = true;
      }

      if (var3) {
         var1.m(var2, 9, m0.a, var0.radioForeground);
      }
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
         if (!r.c(this.border, var1.border)) {
            return false;
         } else if (this.borderWidth != var1.borderWidth) {
            return false;
         } else if (!r.c(this.fill, var1.fill)) {
            return false;
         } else if (!r.c(this.label, var1.label)) {
            return false;
         } else if (java.lang.Float.compare(this.opacity, var1.opacity) != 0) {
            return false;
         } else if (!r.c(this.answerBackground, var1.answerBackground)) {
            return false;
         } else if (!r.c(this.answerFill, var1.answerFill)) {
            return false;
         } else if (this.radioStyle != var1.radioStyle) {
            return false;
         } else if (!r.c(this.radioBackground, var1.radioBackground)) {
            return false;
         } else {
            return r.c(this.radioForeground, var1.radioForeground);
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
      val var10: Int = this.border;
      val var2: Int = this.borderWidth;
      val var8: Int = this.fill;
      val var3: Int = this.label;
      val var1: Float = this.opacity;
      val var4: Int = this.answerBackground;
      val var5: Int = this.answerFill;
      val var9: PollRadioStyle = this.radioStyle;
      val var7: Int = this.radioBackground;
      val var6: Int = this.radioForeground;
      val var11: StringBuilder = new StringBuilder();
      var11.append("PollStyleSet(border=");
      var11.append(var10);
      var11.append(", borderWidth=");
      var11.append(var2);
      var11.append(", fill=");
      var11.append(var8);
      var11.append(", label=");
      var11.append(var3);
      var11.append(", opacity=");
      var11.append(var1);
      var11.append(", answerBackground=");
      var11.append(var4);
      var11.append(", answerFill=");
      var11.append(var5);
      var11.append(", radioStyle=");
      var11.append(var9);
      var11.append(", radioBackground=");
      var11.append(var7);
      var11.append(", radioForeground=");
      var11.append(var6);
      var11.append(")");
      return var11.toString();
   }

   public object `$serializer` : f0<PollStyleSet> {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: PollStyleSet.$serializer = new PollStyleSet.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.bridge.polls.PollStyleSet", var0, 10);
         var1.l("border", true);
         var1.l("borderWidth", true);
         var1.l("fill", true);
         var1.l("label", true);
         var1.l("opacity", true);
         var1.l("answerBackground", true);
         var1.l("answerFill", true);
         var1.l("radioStyle", true);
         var1.l("radioBackground", true);
         var1.l("radioForeground", true);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         val var1: m0 = m0.a;
         return new KSerializer[]{
            a.u(m0.a), var1, a.u(var1), a.u(var1), e0.a, a.u(var1), a.u(var1), a.u(PollRadioStyle.Serializer.INSTANCE), a.u(var1), a.u(var1)
         };
      }

      public open fun deserialize(decoder: Decoder): PollStyleSet {
         r.h(var1, "decoder");
         val var17: SerialDescriptor = this.getDescriptor();
         val var18: c = var1.b(var17);
         val var8: Boolean = var18.p();
         var var5: Int = 9;
         var var2: Float;
         var var4: Int;
         var var9: Any;
         var var11: Any;
         var var12: Any;
         var var13: Any;
         var var14: Any;
         var var15: Any;
         val var16: Any;
         var var24: Any;
         if (var8) {
            var24 = m0.a;
            val var19: Any = var18.n(var17, 0, m0.a, null);
            val var3: Int = var18.i(var17, 1);
            var14 = var18.n(var17, 2, (DeserializationStrategy)var24, null);
            var11 = var18.n(var17, 3, (DeserializationStrategy)var24, null);
            var2 = var18.u(var17, 4);
            var9 = var18.n(var17, 5, (DeserializationStrategy)var24, null);
            var12 = var18.n(var17, 6, (DeserializationStrategy)var24, null);
            var13 = var18.n(var17, 7, PollRadioStyle.Serializer.INSTANCE, null);
            var16 = var18.n(var17, 8, (DeserializationStrategy)var24, null);
            var15 = var18.n(var17, 9, (DeserializationStrategy)var24, null);
            var5 = 1023;
            var4 = var3;
            var24 = var19;
         } else {
            var var6: Boolean = true;
            var4 = 0;
            var15 = null;
            var14 = null;
            var12 = null;
            var13 = null;
            var var20: Any = null;
            var11 = null;
            var24 = null;
            var9 = null;
            var2 = 0.0F;
            var var21: Int = 0;

            while (var6) {
               label38: {
                  val var7: Int = var18.o(var17);
                  switch (var7) {
                     case -1:
                        var6 = false;
                        continue;
                     case 0:
                        var24 = var18.n(var17, 0, m0.a, var24);
                        var21 |= 1;
                        break;
                     case 1:
                        var4 = var18.i(var17, 1);
                        var21 |= 2;
                        break;
                     case 2:
                        var9 = var18.n(var17, 2, m0.a, var9);
                        var21 |= 4;
                        break;
                     case 3:
                        var11 = var18.n(var17, 3, m0.a, var11);
                        var21 |= 8;
                        break;
                     case 4:
                        var2 = var18.u(var17, 4);
                        var21 |= 16;
                        break label38;
                     case 5:
                        var20 = var18.n(var17, 5, m0.a, var20);
                        var21 |= 32;
                        break label38;
                     case 6:
                        var12 = var18.n(var17, 6, m0.a, var12);
                        var21 |= 64;
                        break label38;
                     case 7:
                        var13 = var18.n(var17, 7, PollRadioStyle.Serializer.INSTANCE, var13);
                        var21 |= 128;
                        var5 = 9;
                        continue;
                     case 8:
                        var14 = var18.n(var17, 8, m0.a, var14);
                        var21 |= 256;
                        continue;
                     case 9:
                        var15 = var18.n(var17, var5, m0.a, var15);
                        var21 |= 512;
                        continue;
                     default:
                        throw new n(var7);
                  }

                  var5 = 9;
                  continue;
               }

               var5 = 9;
            }

            var16 = var14;
            var14 = var9;
            var9 = var20;
            var5 = var21;
         }

         var18.c(var17);
         return new PollStyleSet(
            var5, var24 as Int, var4, var14 as Int, var11 as Int, var2, var9 as Int, var12 as Int, var13 as PollRadioStyle, var16 as Int, var15 as Int, null
         );
      }

      public open fun serialize(encoder: Encoder, value: PollStyleSet) {
         r.h(var1, "encoder");
         r.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         PollStyleSet.write$Self(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer<?>> {
         return xk.f0.a.a(this);
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

package com.discord.chat.bridge.reaction

import com.discord.reactions.BurstReactionView.BurstColorPalette
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
import xk.a2
import xk.e0
import xk.f0

@f
public data class BurstReactionColorPalette(backgroundColor: String?, accentColor: String?, highlightColor: String?, opacity: Float) : BurstColorPalette {
   public open val accentColor: String?
   public open val backgroundColor: String?
   public open val highlightColor: String?
   public open val opacity: Float

   init {
      super();
      this.backgroundColor = var1;
      this.accentColor = var2;
      this.highlightColor = var3;
      this.opacity = var4;
   }

   @JvmStatic
   public fun `write$Self`(self: BurstReactionColorPalette, output: CompositeEncoder, serialDesc: SerialDescriptor) {
      r.h(var0, "self");
      r.h(var1, "output");
      r.h(var2, "serialDesc");
      val var3: a2 = a2.a;
      var1.m(var2, 0, a2.a, var0.getBackgroundColor());
      var1.m(var2, 1, var3, var0.getAccentColor());
      var1.m(var2, 2, var3, var0.getHighlightColor());
      var1.r(var2, 3, var0.getOpacity());
   }

   public operator fun component1(): String? {
      return this.getBackgroundColor();
   }

   public operator fun component2(): String? {
      return this.getAccentColor();
   }

   public operator fun component3(): String? {
      return this.getHighlightColor();
   }

   public operator fun component4(): Float {
      return this.getOpacity();
   }

   public fun copy(
      backgroundColor: String? = var0.getBackgroundColor(),
      accentColor: String? = var0.getAccentColor(),
      highlightColor: String? = var0.getHighlightColor(),
      opacity: Float = var0.getOpacity()
   ): BurstReactionColorPalette {
      return new BurstReactionColorPalette(var1, var2, var3, var4);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is BurstReactionColorPalette) {
         return false;
      } else {
         var1 = var1;
         if (!r.c(this.getBackgroundColor(), var1.getBackgroundColor())) {
            return false;
         } else if (!r.c(this.getAccentColor(), var1.getAccentColor())) {
            return false;
         } else if (!r.c(this.getHighlightColor(), var1.getHighlightColor())) {
            return false;
         } else {
            return java.lang.Float.compare(this.getOpacity(), var1.getOpacity()) == 0;
         }
      }
   }

   public override fun hashCode(): Int {
      val var4: java.lang.String = this.getBackgroundColor();
      var var3: Int = 0;
      val var1: Int;
      if (var4 == null) {
         var1 = 0;
      } else {
         var1 = this.getBackgroundColor().hashCode();
      }

      val var2: Int;
      if (this.getAccentColor() == null) {
         var2 = 0;
      } else {
         var2 = this.getAccentColor().hashCode();
      }

      if (this.getHighlightColor() != null) {
         var3 = this.getHighlightColor().hashCode();
      }

      return ((var1 * 31 + var2) * 31 + var3) * 31 + java.lang.Float.hashCode(this.getOpacity());
   }

   public override fun toString(): String {
      val var3: java.lang.String = this.getBackgroundColor();
      val var2: java.lang.String = this.getAccentColor();
      val var5: java.lang.String = this.getHighlightColor();
      val var1: Float = this.getOpacity();
      val var4: StringBuilder = new StringBuilder();
      var4.append("BurstReactionColorPalette(backgroundColor=");
      var4.append(var3);
      var4.append(", accentColor=");
      var4.append(var2);
      var4.append(", highlightColor=");
      var4.append(var5);
      var4.append(", opacity=");
      var4.append(var1);
      var4.append(")");
      return var4.toString();
   }

   public object `$serializer` : f0<BurstReactionColorPalette> {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: BurstReactionColorPalette.$serializer = new BurstReactionColorPalette.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.bridge.reaction.BurstReactionColorPalette", var0, 4);
         var1.l("backgroundColor", false);
         var1.l("accentColor", false);
         var1.l("highlightColor", false);
         var1.l("opacity", false);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         val var1: a2 = a2.a;
         return new KSerializer[]{a.u(a2.a), a.u(var1), a.u(var1), e0.a};
      }

      public open fun deserialize(decoder: Decoder): BurstReactionColorPalette {
         r.h(var1, "decoder");
         val var8: SerialDescriptor = this.getDescriptor();
         val var9: c = var1.b(var8);
         var var2: Float;
         var var3: Int;
         var var6: Any;
         var var7: Any;
         var var11: Any;
         if (var9.p()) {
            var11 = a2.a;
            var7 = var9.n(var8, 0, a2.a, null);
            var6 = var9.n(var8, 1, (DeserializationStrategy)var11, null);
            var11 = var9.n(var8, 2, (DeserializationStrategy)var11, null);
            var2 = var9.u(var8, 3);
            var3 = 15;
         } else {
            var2 = 0.0F;
            var var4: Boolean = true;
            var7 = null;
            var6 = null;
            var11 = null;
            var3 = 0;

            while (var4) {
               val var5: Int = var9.o(var8);
               if (var5 != -1) {
                  if (var5 != 0) {
                     if (var5 != 1) {
                        if (var5 != 2) {
                           if (var5 != 3) {
                              throw new n(var5);
                           }

                           var2 = var9.u(var8, 3);
                           var3 |= 8;
                        } else {
                           var11 = var9.n(var8, 2, a2.a, var11);
                           var3 |= 4;
                        }
                     } else {
                        var6 = var9.n(var8, 1, a2.a, var6);
                        var3 |= 2;
                     }
                  } else {
                     var7 = var9.n(var8, 0, a2.a, var7);
                     var3 |= 1;
                  }
               } else {
                  var4 = false;
               }
            }
         }

         var9.c(var8);
         return new BurstReactionColorPalette(var3, var7 as java.lang.String, var6 as java.lang.String, var11 as java.lang.String, var2, null);
      }

      public open fun serialize(encoder: Encoder, value: BurstReactionColorPalette) {
         r.h(var1, "encoder");
         r.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         BurstReactionColorPalette.write$Self(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer<?>> {
         return xk.f0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<BurstReactionColorPalette> {
         return BurstReactionColorPalette.$serializer.INSTANCE;
      }
   }
}

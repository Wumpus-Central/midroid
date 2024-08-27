package com.discord.chat.bridge.reaction

import com.discord.reactions.BurstReactionView.ThemedBurstColorPalette
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
import xk.f0
import xk.f0.a

@f
public data class ThemedBurstReactionColorPalette(light: BurstReactionColorPalette, dark: BurstReactionColorPalette) : ThemedBurstColorPalette {
   public open val dark: BurstReactionColorPalette
   public open val light: BurstReactionColorPalette

   init {
      r.h(var1, "light");
      r.h(var2, "dark");
      super();
      this.light = var1;
      this.dark = var2;
   }

   @JvmStatic
   public fun `write$Self`(self: ThemedBurstReactionColorPalette, output: CompositeEncoder, serialDesc: SerialDescriptor) {
      r.h(var0, "self");
      r.h(var1, "output");
      r.h(var2, "serialDesc");
      val var3: BurstReactionColorPalette.$serializer = BurstReactionColorPalette.$serializer.INSTANCE;
      var1.y(var2, 0, BurstReactionColorPalette.$serializer.INSTANCE, var0.getLight());
      var1.y(var2, 1, var3, var0.getDark());
   }

   public operator fun component1(): BurstReactionColorPalette {
      return this.getLight();
   }

   public operator fun component2(): BurstReactionColorPalette {
      return this.getDark();
   }

   public fun copy(light: BurstReactionColorPalette = var0.getLight(), dark: BurstReactionColorPalette = var0.getDark()): ThemedBurstReactionColorPalette {
      r.h(var1, "light");
      r.h(var2, "dark");
      return new ThemedBurstReactionColorPalette(var1, var2);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is ThemedBurstReactionColorPalette) {
         return false;
      } else {
         var1 = var1;
         if (!r.c(this.getLight(), var1.getLight())) {
            return false;
         } else {
            return r.c(this.getDark(), var1.getDark());
         }
      }
   }

   public override fun hashCode(): Int {
      return this.getLight().hashCode() * 31 + this.getDark().hashCode();
   }

   public override fun toString(): String {
      val var2: BurstReactionColorPalette = this.getLight();
      val var3: BurstReactionColorPalette = this.getDark();
      val var1: StringBuilder = new StringBuilder();
      var1.append("ThemedBurstReactionColorPalette(light=");
      var1.append(var2);
      var1.append(", dark=");
      var1.append(var3);
      var1.append(")");
      return var1.toString();
   }

   public object `$serializer` : f0<ThemedBurstReactionColorPalette> {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: ThemedBurstReactionColorPalette.$serializer = new ThemedBurstReactionColorPalette.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor(
            "com.discord.chat.bridge.reaction.ThemedBurstReactionColorPalette", var0, 2
         );
         var1.l("LIGHT", false);
         var1.l("DARK", false);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{BurstReactionColorPalette.$serializer.INSTANCE, BurstReactionColorPalette.$serializer.INSTANCE};
      }

      public open fun deserialize(decoder: Decoder): ThemedBurstReactionColorPalette {
         r.h(var1, "decoder");
         val var6: SerialDescriptor = this.getDescriptor();
         val var7: c = var1.b(var6);
         var var2: Int;
         var var5: Any;
         var var9: Any;
         if (var7.p()) {
            var9 = BurstReactionColorPalette.$serializer.INSTANCE;
            var5 = var7.y(var6, 0, BurstReactionColorPalette.$serializer.INSTANCE, null);
            var9 = var7.y(var6, 1, (DeserializationStrategy)var9, null);
            var2 = 3;
         } else {
            var var3: Boolean = true;
            var2 = 0;
            var9 = null;
            var5 = null;

            while (var3) {
               val var4: Int = var7.o(var6);
               if (var4 != -1) {
                  if (var4 != 0) {
                     if (var4 != 1) {
                        throw new n(var4);
                     }

                     var9 = var7.y(var6, 1, BurstReactionColorPalette.$serializer.INSTANCE, var9);
                     var2 |= 2;
                  } else {
                     var5 = var7.y(var6, 0, BurstReactionColorPalette.$serializer.INSTANCE, var5);
                     var2 |= 1;
                  }
               } else {
                  var3 = false;
               }
            }
         }

         var7.c(var6);
         return new ThemedBurstReactionColorPalette(var2, var5 as BurstReactionColorPalette, var9 as BurstReactionColorPalette, null);
      }

      public open fun serialize(encoder: Encoder, value: ThemedBurstReactionColorPalette) {
         r.h(var1, "encoder");
         r.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         ThemedBurstReactionColorPalette.write$Self(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer<?>> {
         return a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<ThemedBurstReactionColorPalette> {
         return ThemedBurstReactionColorPalette.$serializer.INSTANCE;
      }
   }
}

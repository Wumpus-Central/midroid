package com.discord.chat.bridge.reaction

import bl.g0
import bl.g0.a
import com.discord.reactions.BurstReactionView
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
import yk.f
import yk.n

@f
public data class ThemedBurstReactionColorPalette(light: BurstReactionColorPalette, dark: BurstReactionColorPalette) :
   BurstReactionView.ThemedBurstColorPalette {
   public open val dark: BurstReactionColorPalette
   public open val light: BurstReactionColorPalette

   init {
      q.h(var1, "light");
      q.h(var2, "dark");
      super();
      this.light = var1;
      this.dark = var2;
   }

   public operator fun component1(): BurstReactionColorPalette {
      return this.light;
   }

   public operator fun component2(): BurstReactionColorPalette {
      return this.dark;
   }

   public fun copy(light: BurstReactionColorPalette = var0.light, dark: BurstReactionColorPalette = var0.dark): ThemedBurstReactionColorPalette {
      q.h(var1, "light");
      q.h(var2, "dark");
      return new ThemedBurstReactionColorPalette(var1, var2);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is ThemedBurstReactionColorPalette) {
         return false;
      } else {
         var1 = var1;
         if (!q.c(this.light, var1.light)) {
            return false;
         } else {
            return q.c(this.dark, var1.dark);
         }
      }
   }

   public override fun hashCode(): Int {
      return this.light.hashCode() * 31 + this.dark.hashCode();
   }

   public override fun toString(): String {
      val var3: BurstReactionColorPalette = this.light;
      val var2: BurstReactionColorPalette = this.dark;
      val var1: StringBuilder = new StringBuilder();
      var1.append("ThemedBurstReactionColorPalette(light=");
      var1.append(var3);
      var1.append(", dark=");
      var1.append(var2);
      var1.append(")");
      return var1.toString();
   }

   public object `$serializer` : g0 {
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
         q.h(var1, "decoder");
         val var6: SerialDescriptor = this.getDescriptor();
         val var7: c = var1.c(var6);
         var var2: Int;
         var var5: BurstReactionColorPalette;
         var var9: BurstReactionColorPalette;
         if (var7.y()) {
            val var8: BurstReactionColorPalette.$serializer = BurstReactionColorPalette.$serializer.INSTANCE;
            var5 = var7.m(var6, 0, BurstReactionColorPalette.$serializer.INSTANCE, null) as BurstReactionColorPalette;
            var9 = var7.m(var6, 1, var8, null) as BurstReactionColorPalette;
            var2 = 3;
         } else {
            var var3: Boolean = true;
            var2 = 0;
            var9 = null;
            var5 = null;

            while (var3) {
               val var4: Int = var7.x(var6);
               if (var4 != -1) {
                  if (var4 != 0) {
                     if (var4 != 1) {
                        throw new n(var4);
                     }

                     var9 = var7.m(var6, 1, BurstReactionColorPalette.$serializer.INSTANCE, var9) as BurstReactionColorPalette;
                     var2 |= 2;
                  } else {
                     var5 = var7.m(var6, 0, BurstReactionColorPalette.$serializer.INSTANCE, var5) as BurstReactionColorPalette;
                     var2 |= 1;
                  }
               } else {
                  var3 = false;
               }
            }
         }

         var7.b(var6);
         return new ThemedBurstReactionColorPalette(var2, var5, var9, null);
      }

      public open fun serialize(encoder: Encoder, value: ThemedBurstReactionColorPalette) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.c(var3);
         ThemedBurstReactionColorPalette.write$Self$chat_release(var2, var4, var3);
         var4.b(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<ThemedBurstReactionColorPalette> {
         return ThemedBurstReactionColorPalette.$serializer.INSTANCE;
      }
   }
}

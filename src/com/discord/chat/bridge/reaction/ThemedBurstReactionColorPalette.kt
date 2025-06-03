package com.discord.chat.bridge.reaction

import Ka.f
import com.discord.reactions.ReactionView
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer

@f
public data class ThemedBurstReactionColorPalette(light: BurstReactionColorPalette, dark: BurstReactionColorPalette) : ReactionView.ThemedBurstColorPalette {
   public open val light: BurstReactionColorPalette
   public open val dark: BurstReactionColorPalette

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
      val var1: BurstReactionColorPalette = this.light;
      val var2: BurstReactionColorPalette = this.dark;
      val var3: StringBuilder = new StringBuilder();
      var3.append("ThemedBurstReactionColorPalette(light=");
      var3.append(var1);
      var3.append(", dark=");
      var3.append(var2);
      var3.append(")");
      return var3.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<ThemedBurstReactionColorPalette> {
         return ThemedBurstReactionColorPalette.$serializer.INSTANCE;
      }
   }
}

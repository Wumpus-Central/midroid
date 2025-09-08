package com.discord.chat.bridge.reaction

import com.discord.reactions.ReactionView
import kotlinx.serialization.KSerializer
import mb.g

@g
public data class ThemedBurstReactionColorPalette(light: BurstReactionColorPalette, dark: BurstReactionColorPalette) : ReactionView.ThemedBurstColorPalette {
   public open val light: BurstReactionColorPalette
   public open val dark: BurstReactionColorPalette

   init {
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
      return new ThemedBurstReactionColorPalette(var1, var2);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is ThemedBurstReactionColorPalette) {
         return false;
      } else {
         var1 = var1;
         if (!(this.light == var1.light)) {
            return false;
         } else {
            return this.dark == var1.dark;
         }
      }
   }

   public override fun hashCode(): Int {
      return this.light.hashCode() * 31 + this.dark.hashCode();
   }

   public override fun toString(): String {
      val var2: BurstReactionColorPalette = this.light;
      val var3: BurstReactionColorPalette = this.dark;
      val var1: StringBuilder = new StringBuilder();
      var1.append("ThemedBurstReactionColorPalette(light=");
      var1.append(var2);
      var1.append(", dark=");
      var1.append(var3);
      var1.append(")");
      return var1.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<ThemedBurstReactionColorPalette> {
         return ThemedBurstReactionColorPalette.$serializer.INSTANCE;
      }
   }
}

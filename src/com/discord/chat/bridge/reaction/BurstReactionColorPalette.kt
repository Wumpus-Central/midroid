package com.discord.chat.bridge.reaction

import com.discord.reactions.ReactionView.BurstColorPalette
import kc.m
import kotlinx.serialization.KSerializer

@m
public data class BurstReactionColorPalette(backgroundColor: String?, accentColor: String?, highlightColor: String?, opacity: Float) : BurstColorPalette {
   public open val backgroundColor: String?
   public open val accentColor: String?
   public open val highlightColor: String?
   public open val opacity: Float

   init {
      super();
      this.backgroundColor = var1;
      this.accentColor = var2;
      this.highlightColor = var3;
      this.opacity = var4;
   }

   public operator fun component1(): String? {
      return this.backgroundColor;
   }

   public operator fun component2(): String? {
      return this.accentColor;
   }

   public operator fun component3(): String? {
      return this.highlightColor;
   }

   public operator fun component4(): Float {
      return this.opacity;
   }

   public fun copy(
      backgroundColor: String? = var0.backgroundColor,
      accentColor: String? = var0.accentColor,
      highlightColor: String? = var0.highlightColor,
      opacity: Float = var0.opacity
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
         if (!(this.backgroundColor == var1.backgroundColor)) {
            return false;
         } else if (!(this.accentColor == var1.accentColor)) {
            return false;
         } else if (!(this.highlightColor == var1.highlightColor)) {
            return false;
         } else {
            return java.lang.Float.compare(this.opacity, var1.opacity) == 0;
         }
      }
   }

   public override fun hashCode(): Int {
      var var3: Int = 0;
      val var1: Int;
      if (this.backgroundColor == null) {
         var1 = 0;
      } else {
         var1 = this.backgroundColor.hashCode();
      }

      val var2: Int;
      if (this.accentColor == null) {
         var2 = 0;
      } else {
         var2 = this.accentColor.hashCode();
      }

      if (this.highlightColor != null) {
         var3 = this.highlightColor.hashCode();
      }

      return ((var1 * 31 + var2) * 31 + var3) * 31 + java.lang.Float.hashCode(this.opacity);
   }

   public override fun toString(): String {
      val var5: java.lang.String = this.backgroundColor;
      val var4: java.lang.String = this.accentColor;
      val var2: java.lang.String = this.highlightColor;
      val var1: Float = this.opacity;
      val var3: StringBuilder = new StringBuilder();
      var3.append("BurstReactionColorPalette(backgroundColor=");
      var3.append(var5);
      var3.append(", accentColor=");
      var3.append(var4);
      var3.append(", highlightColor=");
      var3.append(var2);
      var3.append(", opacity=");
      var3.append(var1);
      var3.append(")");
      return var3.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<BurstReactionColorPalette> {
         return BurstReactionColorPalette.$serializer.INSTANCE;
      }
   }
}

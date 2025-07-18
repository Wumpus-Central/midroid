package com.discord.chat.bridge.reaction

import com.discord.reactions.ReactionView
import kotlin.jvm.internal.r
import kotlinx.serialization.KSerializer
import sb.g

@g
public data class ReactionsTheme(reactionBackgroundColor: Int? = null,
      reactionBorderColor: Int? = null,
      reactionTextColor: Int? = null,
      activeReactionBackgroundColor: Int? = null,
      activeReactionBorderColor: Int? = null,
      activeReactionTextColor: Int? = null
   ) :
   ReactionView.ReactionsTheme {
   public open val reactionBackgroundColor: Int?
   public open val reactionBorderColor: Int?
   public open val reactionTextColor: Int?
   public open val activeReactionBackgroundColor: Int?
   public open val activeReactionBorderColor: Int?
   public open val activeReactionTextColor: Int?

   fun ReactionsTheme() {
      this(null, null, null, null, null, null, 63, null);
   }

   init {
      this.reactionBackgroundColor = var1;
      this.reactionBorderColor = var2;
      this.reactionTextColor = var3;
      this.activeReactionBackgroundColor = var4;
      this.activeReactionBorderColor = var5;
      this.activeReactionTextColor = var6;
   }

   public operator fun component1(): Int? {
      return this.reactionBackgroundColor;
   }

   public operator fun component2(): Int? {
      return this.reactionBorderColor;
   }

   public operator fun component3(): Int? {
      return this.reactionTextColor;
   }

   public operator fun component4(): Int? {
      return this.activeReactionBackgroundColor;
   }

   public operator fun component5(): Int? {
      return this.activeReactionBorderColor;
   }

   public operator fun component6(): Int? {
      return this.activeReactionTextColor;
   }

   public fun copy(
      reactionBackgroundColor: Int? = var0.reactionBackgroundColor,
      reactionBorderColor: Int? = var0.reactionBorderColor,
      reactionTextColor: Int? = var0.reactionTextColor,
      activeReactionBackgroundColor: Int? = var0.activeReactionBackgroundColor,
      activeReactionBorderColor: Int? = var0.activeReactionBorderColor,
      activeReactionTextColor: Int? = var0.activeReactionTextColor
   ): ReactionsTheme {
      return new ReactionsTheme(var1, var2, var3, var4, var5, var6);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is ReactionsTheme) {
         return false;
      } else {
         var1 = var1;
         if (!r.c(this.reactionBackgroundColor, var1.reactionBackgroundColor)) {
            return false;
         } else if (!r.c(this.reactionBorderColor, var1.reactionBorderColor)) {
            return false;
         } else if (!r.c(this.reactionTextColor, var1.reactionTextColor)) {
            return false;
         } else if (!r.c(this.activeReactionBackgroundColor, var1.activeReactionBackgroundColor)) {
            return false;
         } else if (!r.c(this.activeReactionBorderColor, var1.activeReactionBorderColor)) {
            return false;
         } else {
            return r.c(this.activeReactionTextColor, var1.activeReactionTextColor);
         }
      }
   }

   public override fun hashCode(): Int {
      var var6: Int = 0;
      val var1: Int;
      if (this.reactionBackgroundColor == null) {
         var1 = 0;
      } else {
         var1 = this.reactionBackgroundColor.hashCode();
      }

      val var2: Int;
      if (this.reactionBorderColor == null) {
         var2 = 0;
      } else {
         var2 = this.reactionBorderColor.hashCode();
      }

      val var3: Int;
      if (this.reactionTextColor == null) {
         var3 = 0;
      } else {
         var3 = this.reactionTextColor.hashCode();
      }

      val var4: Int;
      if (this.activeReactionBackgroundColor == null) {
         var4 = 0;
      } else {
         var4 = this.activeReactionBackgroundColor.hashCode();
      }

      val var5: Int;
      if (this.activeReactionBorderColor == null) {
         var5 = 0;
      } else {
         var5 = this.activeReactionBorderColor.hashCode();
      }

      if (this.activeReactionTextColor != null) {
         var6 = this.activeReactionTextColor.hashCode();
      }

      return ((((var1 * 31 + var2) * 31 + var3) * 31 + var4) * 31 + var5) * 31 + var6;
   }

   public override fun toString(): String {
      val var1: Int = this.reactionBackgroundColor;
      val var3: Int = this.reactionBorderColor;
      val var4: Int = this.reactionTextColor;
      val var5: Int = this.activeReactionBackgroundColor;
      val var2: Int = this.activeReactionBorderColor;
      val var6: Int = this.activeReactionTextColor;
      val var7: StringBuilder = new StringBuilder();
      var7.append("ReactionsTheme(reactionBackgroundColor=");
      var7.append(var1);
      var7.append(", reactionBorderColor=");
      var7.append(var3);
      var7.append(", reactionTextColor=");
      var7.append(var4);
      var7.append(", activeReactionBackgroundColor=");
      var7.append(var5);
      var7.append(", activeReactionBorderColor=");
      var7.append(var2);
      var7.append(", activeReactionTextColor=");
      var7.append(var6);
      var7.append(")");
      return var7.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<ReactionsTheme> {
         return ReactionsTheme.$serializer.INSTANCE;
      }
   }
}

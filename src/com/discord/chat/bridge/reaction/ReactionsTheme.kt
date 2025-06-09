package com.discord.chat.bridge.reaction

import Ka.f
import com.discord.reactions.ReactionView
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer

@f
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
         if (!q.c(this.reactionBackgroundColor, var1.reactionBackgroundColor)) {
            return false;
         } else if (!q.c(this.reactionBorderColor, var1.reactionBorderColor)) {
            return false;
         } else if (!q.c(this.reactionTextColor, var1.reactionTextColor)) {
            return false;
         } else if (!q.c(this.activeReactionBackgroundColor, var1.activeReactionBackgroundColor)) {
            return false;
         } else if (!q.c(this.activeReactionBorderColor, var1.activeReactionBorderColor)) {
            return false;
         } else {
            return q.c(this.activeReactionTextColor, var1.activeReactionTextColor);
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
      val var7: Int = this.reactionBackgroundColor;
      val var2: Int = this.reactionBorderColor;
      val var1: Int = this.reactionTextColor;
      val var5: Int = this.activeReactionBackgroundColor;
      val var6: Int = this.activeReactionBorderColor;
      val var3: Int = this.activeReactionTextColor;
      val var4: StringBuilder = new StringBuilder();
      var4.append("ReactionsTheme(reactionBackgroundColor=");
      var4.append(var7);
      var4.append(", reactionBorderColor=");
      var4.append(var2);
      var4.append(", reactionTextColor=");
      var4.append(var1);
      var4.append(", activeReactionBackgroundColor=");
      var4.append(var5);
      var4.append(", activeReactionBorderColor=");
      var4.append(var6);
      var4.append(", activeReactionTextColor=");
      var4.append(var3);
      var4.append(")");
      return var4.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<ReactionsTheme> {
         return ReactionsTheme.$serializer.INSTANCE;
      }
   }
}

package com.discord.chat.bridge.reaction

import com.discord.reactions.ReactionView.Reaction
import com.discord.reactions.ReactionView.Reaction.DefaultImpls
import kotlinx.serialization.KSerializer
import qc.m

@m
public data class MessageReaction(count: Int,
      me: Boolean,
      isMeBurst: Boolean = false,
      emoji: MessageReactionEmoji,
      burstCount: Int = 0,
      themedBurstColors: ThemedBurstReactionColorPalette? = null
   ) :
   Reaction {
   public open val count: Int
   public final val me: Boolean
   public open val isMeBurst: Boolean
   public open val emoji: MessageReactionEmoji
   public open val burstCount: Int
   public open val themedBurstColors: ThemedBurstReactionColorPalette?
   public open val isMe: Boolean

   init {
      super();
      this.count = var1;
      this.me = var2;
      this.isMeBurst = var3;
      this.emoji = var4;
      this.burstCount = var5;
      this.themedBurstColors = var6;
      this.isMe = var2;
   }

   public operator fun component1(): Int {
      return this.count;
   }

   public operator fun component2(): Boolean {
      return this.me;
   }

   public operator fun component3(): Boolean {
      return this.isMeBurst;
   }

   public operator fun component4(): MessageReactionEmoji {
      return this.emoji;
   }

   public operator fun component5(): Int {
      return this.burstCount;
   }

   public operator fun component6(): ThemedBurstReactionColorPalette? {
      return this.themedBurstColors;
   }

   public fun copy(
      count: Int = var0.count,
      me: Boolean = var0.me,
      isMeBurst: Boolean = var0.isMeBurst,
      emoji: MessageReactionEmoji = var0.emoji,
      burstCount: Int = var0.burstCount,
      themedBurstColors: ThemedBurstReactionColorPalette? = var0.themedBurstColors
   ): MessageReaction {
      return new MessageReaction(var1, var2, var3, var4, var5, var6);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is MessageReaction) {
         return false;
      } else {
         var1 = var1;
         if (this.count != var1.count) {
            return false;
         } else if (this.me != var1.me) {
            return false;
         } else if (this.isMeBurst != var1.isMeBurst) {
            return false;
         } else if (!(this.emoji == var1.emoji)) {
            return false;
         } else if (this.burstCount != var1.burstCount) {
            return false;
         } else {
            return this.themedBurstColors == var1.themedBurstColors;
         }
      }
   }

   fun getItemId(): java.lang.Long {
      return DefaultImpls.getItemId(this);
   }

   public override fun hashCode(): Int {
      val var5: Int = Integer.hashCode(this.count);
      val var6: Int = java.lang.Boolean.hashCode(this.me);
      val var2: Int = java.lang.Boolean.hashCode(this.isMeBurst);
      val var3: Int = this.emoji.hashCode();
      val var4: Int = Integer.hashCode(this.burstCount);
      val var1: Int;
      if (this.themedBurstColors == null) {
         var1 = 0;
      } else {
         var1 = this.themedBurstColors.hashCode();
      }

      return ((((var5 * 31 + var6) * 31 + var2) * 31 + var3) * 31 + var4) * 31 + var1;
   }

   fun isBurstReaction(): Boolean {
      return DefaultImpls.isBurstReaction(this);
   }

   public override fun toString(): String {
      val var2: Int = this.count;
      val var4: Boolean = this.me;
      val var3: Boolean = this.isMeBurst;
      val var5: MessageReactionEmoji = this.emoji;
      val var1: Int = this.burstCount;
      val var6: ThemedBurstReactionColorPalette = this.themedBurstColors;
      val var7: StringBuilder = new StringBuilder();
      var7.append("MessageReaction(count=");
      var7.append(var2);
      var7.append(", me=");
      var7.append(var4);
      var7.append(", isMeBurst=");
      var7.append(var3);
      var7.append(", emoji=");
      var7.append(var5);
      var7.append(", burstCount=");
      var7.append(var1);
      var7.append(", themedBurstColors=");
      var7.append(var6);
      var7.append(")");
      return var7.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<MessageReaction> {
         return MessageReaction.$serializer.INSTANCE;
      }
   }
}

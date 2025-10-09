package com.discord.chat.bridge.forums

import com.discord.chat.bridge.reaction.MessageReaction
import kotlinx.serialization.KSerializer
import nb.g

@g
public data class ForumPostActions(numDisplayedReactions: Int,
   isFollowing: Boolean,
   followIcon: String? = null,
   followLabel: String,
   shareIcon: String? = null,
   shareLabel: String,
   defaultReaction: MessageReaction? = null,
   sharePrompt: PostSharePrompt? = null
) {
   public final val numDisplayedReactions: Int
   public final val isFollowing: Boolean
   public final val followIcon: String?
   public final val followLabel: String
   public final val shareIcon: String?
   public final val shareLabel: String
   public final val defaultReaction: MessageReaction?
   public final val sharePrompt: PostSharePrompt?

   init {
      super();
      this.numDisplayedReactions = var1;
      this.isFollowing = var2;
      this.followIcon = var3;
      this.followLabel = var4;
      this.shareIcon = var5;
      this.shareLabel = var6;
      this.defaultReaction = var7;
      this.sharePrompt = var8;
   }

   public operator fun component1(): Int {
      return this.numDisplayedReactions;
   }

   public operator fun component2(): Boolean {
      return this.isFollowing;
   }

   public operator fun component3(): String? {
      return this.followIcon;
   }

   public operator fun component4(): String {
      return this.followLabel;
   }

   public operator fun component5(): String? {
      return this.shareIcon;
   }

   public operator fun component6(): String {
      return this.shareLabel;
   }

   public operator fun component7(): MessageReaction? {
      return this.defaultReaction;
   }

   public operator fun component8(): PostSharePrompt? {
      return this.sharePrompt;
   }

   public fun copy(
      numDisplayedReactions: Int = var0.numDisplayedReactions,
      isFollowing: Boolean = var0.isFollowing,
      followIcon: String? = var0.followIcon,
      followLabel: String = var0.followLabel,
      shareIcon: String? = var0.shareIcon,
      shareLabel: String = var0.shareLabel,
      defaultReaction: MessageReaction? = var0.defaultReaction,
      sharePrompt: PostSharePrompt? = var0.sharePrompt
   ): ForumPostActions {
      return new ForumPostActions(var1, var2, var3, var4, var5, var6, var7, var8);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is ForumPostActions) {
         return false;
      } else {
         var1 = var1;
         if (this.numDisplayedReactions != var1.numDisplayedReactions) {
            return false;
         } else if (this.isFollowing != var1.isFollowing) {
            return false;
         } else if (!(this.followIcon == var1.followIcon)) {
            return false;
         } else if (!(this.followLabel == var1.followLabel)) {
            return false;
         } else if (!(this.shareIcon == var1.shareIcon)) {
            return false;
         } else if (!(this.shareLabel == var1.shareLabel)) {
            return false;
         } else if (!(this.defaultReaction == var1.defaultReaction)) {
            return false;
         } else {
            return this.sharePrompt == var1.sharePrompt;
         }
      }
   }

   public override fun hashCode(): Int {
      val var5: Int = Integer.hashCode(this.numDisplayedReactions);
      val var6: Int = java.lang.Boolean.hashCode(this.isFollowing);
      var var4: Int = 0;
      val var1: Int;
      if (this.followIcon == null) {
         var1 = 0;
      } else {
         var1 = this.followIcon.hashCode();
      }

      val var7: Int = this.followLabel.hashCode();
      val var2: Int;
      if (this.shareIcon == null) {
         var2 = 0;
      } else {
         var2 = this.shareIcon.hashCode();
      }

      val var8: Int = this.shareLabel.hashCode();
      val var3: Int;
      if (this.defaultReaction == null) {
         var3 = 0;
      } else {
         var3 = this.defaultReaction.hashCode();
      }

      if (this.sharePrompt != null) {
         var4 = this.sharePrompt.hashCode();
      }

      return ((((((var5 * 31 + var6) * 31 + var1) * 31 + var7) * 31 + var2) * 31 + var8) * 31 + var3) * 31 + var4;
   }

   public override fun toString(): String {
      val var1: Int = this.numDisplayedReactions;
      val var2: Boolean = this.isFollowing;
      val var4: java.lang.String = this.followIcon;
      val var6: java.lang.String = this.followLabel;
      val var8: java.lang.String = this.shareIcon;
      val var7: java.lang.String = this.shareLabel;
      val var9: MessageReaction = this.defaultReaction;
      val var3: PostSharePrompt = this.sharePrompt;
      val var5: StringBuilder = new StringBuilder();
      var5.append("ForumPostActions(numDisplayedReactions=");
      var5.append(var1);
      var5.append(", isFollowing=");
      var5.append(var2);
      var5.append(", followIcon=");
      var5.append(var4);
      var5.append(", followLabel=");
      var5.append(var6);
      var5.append(", shareIcon=");
      var5.append(var8);
      var5.append(", shareLabel=");
      var5.append(var7);
      var5.append(", defaultReaction=");
      var5.append(var9);
      var5.append(", sharePrompt=");
      var5.append(var3);
      var5.append(")");
      return var5.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<ForumPostActions> {
         return ForumPostActions.$serializer.INSTANCE;
      }
   }
}

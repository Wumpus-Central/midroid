package com.discord.chat.bridge.botuikit

import com.discord.primitives.UserId
import kotlinx.serialization.KSerializer
import xu.m

@m
public data class CheckpointDataV2025(authorId: UserId,
   cardId: String,
   cardAssetUrl: String,
   powerLevel: String,
   powerLevelUnits: Int,
   messagesString: String,
   voiceString: String,
   reactionString: String,
   clickable: CheckpointCardClickable? = ...,
   topEmoji: CheckpointEmoji? = ...,
   topGuild: CheckpointGuild? = ...,
   topGame: CheckpointApplication? = ...
) : CheckpointDataV2025(var1, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13) {
   public final val authorId: UserId
   public final val cardId: String
   public final val cardAssetUrl: String
   public final val powerLevel: String
   public final val powerLevelUnits: Int
   public final val messagesString: String
   public final val voiceString: String
   public final val reactionString: String
   public final val clickable: CheckpointCardClickable?
   public final val topEmoji: CheckpointEmoji?
   public final val topGuild: CheckpointGuild?
   public final val topGame: CheckpointApplication?

   fun CheckpointDataV2025(
      var1: Long,
      var3: java.lang.String,
      var4: java.lang.String,
      var5: java.lang.String,
      var6: Int,
      var7: java.lang.String,
      var8: java.lang.String,
      var9: java.lang.String,
      var10: CheckpointCardClickable,
      var11: CheckpointEmoji,
      var12: CheckpointGuild,
      var13: CheckpointApplication
   ) {
      super();
      this.authorId = var1;
      this.cardId = var3;
      this.cardAssetUrl = var4;
      this.powerLevel = var5;
      this.powerLevelUnits = var6;
      this.messagesString = var7;
      this.voiceString = var8;
      this.reactionString = var9;
      this.clickable = var10;
      this.topEmoji = var11;
      this.topGuild = var12;
      this.topGame = var13;
   }

   public operator fun component1(): UserId {
      return this.authorId;
   }

   public operator fun component10(): CheckpointEmoji? {
      return this.topEmoji;
   }

   public operator fun component11(): CheckpointGuild? {
      return this.topGuild;
   }

   public operator fun component12(): CheckpointApplication? {
      return this.topGame;
   }

   public operator fun component2(): String {
      return this.cardId;
   }

   public operator fun component3(): String {
      return this.cardAssetUrl;
   }

   public operator fun component4(): String {
      return this.powerLevel;
   }

   public operator fun component5(): Int {
      return this.powerLevelUnits;
   }

   public operator fun component6(): String {
      return this.messagesString;
   }

   public operator fun component7(): String {
      return this.voiceString;
   }

   public operator fun component8(): String {
      return this.reactionString;
   }

   public operator fun component9(): CheckpointCardClickable? {
      return this.clickable;
   }

   public fun copy(
      authorId: UserId = ...,
      cardId: String = ...,
      cardAssetUrl: String = ...,
      powerLevel: String = ...,
      powerLevelUnits: Int = ...,
      messagesString: String = ...,
      voiceString: String = ...,
      reactionString: String = ...,
      clickable: CheckpointCardClickable? = ...,
      topEmoji: CheckpointEmoji? = ...,
      topGuild: CheckpointGuild? = ...,
      topGame: CheckpointApplication? = ...
   ): CheckpointDataV2025 {
      return new CheckpointDataV2025(var1, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, null);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is CheckpointDataV2025) {
         return false;
      } else {
         var1 = var1;
         if (!UserId.equals-impl0(this.authorId, var1.authorId)) {
            return false;
         } else if (!(this.cardId == var1.cardId)) {
            return false;
         } else if (!(this.cardAssetUrl == var1.cardAssetUrl)) {
            return false;
         } else if (!(this.powerLevel == var1.powerLevel)) {
            return false;
         } else if (this.powerLevelUnits != var1.powerLevelUnits) {
            return false;
         } else if (!(this.messagesString == var1.messagesString)) {
            return false;
         } else if (!(this.voiceString == var1.voiceString)) {
            return false;
         } else if (!(this.reactionString == var1.reactionString)) {
            return false;
         } else if (!(this.clickable == var1.clickable)) {
            return false;
         } else if (!(this.topEmoji == var1.topEmoji)) {
            return false;
         } else if (!(this.topGuild == var1.topGuild)) {
            return false;
         } else {
            return this.topGame == var1.topGame;
         }
      }
   }

   public override fun hashCode(): Int {
      val var10: Int = UserId.hashCode-impl(this.authorId);
      val var7: Int = this.cardId.hashCode();
      val var9: Int = this.cardAssetUrl.hashCode();
      val var8: Int = this.powerLevel.hashCode();
      val var6: Int = Integer.hashCode(this.powerLevelUnits);
      val var12: Int = this.messagesString.hashCode();
      val var11: Int = this.voiceString.hashCode();
      val var5: Int = this.reactionString.hashCode();
      var var4: Int = 0;
      val var1: Int;
      if (this.clickable == null) {
         var1 = 0;
      } else {
         var1 = this.clickable.hashCode();
      }

      val var2: Int;
      if (this.topEmoji == null) {
         var2 = 0;
      } else {
         var2 = this.topEmoji.hashCode();
      }

      val var3: Int;
      if (this.topGuild == null) {
         var3 = 0;
      } else {
         var3 = this.topGuild.hashCode();
      }

      if (this.topGame != null) {
         var4 = this.topGame.hashCode();
      }

      return ((((((((((var10 * 31 + var7) * 31 + var9) * 31 + var8) * 31 + var6) * 31 + var12) * 31 + var11) * 31 + var5) * 31 + var1) * 31 + var2) * 31 + var3)
            * 31
         + var4;
   }

   public override fun toString(): String {
      val var3: java.lang.String = UserId.toString-impl(this.authorId);
      val var12: java.lang.String = this.cardId;
      val var13: java.lang.String = this.cardAssetUrl;
      val var2: java.lang.String = this.powerLevel;
      val var1: Int = this.powerLevelUnits;
      val var6: java.lang.String = this.messagesString;
      val var4: java.lang.String = this.voiceString;
      val var11: java.lang.String = this.reactionString;
      val var10: CheckpointCardClickable = this.clickable;
      val var7: CheckpointEmoji = this.topEmoji;
      val var5: CheckpointGuild = this.topGuild;
      val var8: CheckpointApplication = this.topGame;
      val var9: StringBuilder = new StringBuilder();
      var9.append("CheckpointDataV2025(authorId=");
      var9.append(var3);
      var9.append(", cardId=");
      var9.append(var12);
      var9.append(", cardAssetUrl=");
      var9.append(var13);
      var9.append(", powerLevel=");
      var9.append(var2);
      var9.append(", powerLevelUnits=");
      var9.append(var1);
      var9.append(", messagesString=");
      var9.append(var6);
      var9.append(", voiceString=");
      var9.append(var4);
      var9.append(", reactionString=");
      var9.append(var11);
      var9.append(", clickable=");
      var9.append(var10);
      var9.append(", topEmoji=");
      var9.append(var7);
      var9.append(", topGuild=");
      var9.append(var5);
      var9.append(", topGame=");
      var9.append(var8);
      var9.append(")");
      return var9.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<CheckpointDataV2025> {
         return CheckpointDataV2025.$serializer.INSTANCE;
      }
   }
}

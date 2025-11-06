package com.discord.chat.bridge.botuikit

import kotlinx.serialization.KSerializer
import xu.m

@m
public data class CheckpointEmoji(emojiId: Long? = null, emojiName: String, emojiSurrogateName: String? = null) {
   public final val emojiId: Long?
   public final val emojiName: String
   public final val emojiSurrogateName: String?

   init {
      super();
      this.emojiId = var1;
      this.emojiName = var2;
      this.emojiSurrogateName = var3;
   }

   public operator fun component1(): Long? {
      return this.emojiId;
   }

   public operator fun component2(): String {
      return this.emojiName;
   }

   public operator fun component3(): String? {
      return this.emojiSurrogateName;
   }

   public fun copy(emojiId: Long? = var0.emojiId, emojiName: String = var0.emojiName, emojiSurrogateName: String? = var0.emojiSurrogateName): CheckpointEmoji {
      return new CheckpointEmoji(var1, var2, var3);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is CheckpointEmoji) {
         return false;
      } else {
         var1 = var1;
         if (!(this.emojiId == var1.emojiId)) {
            return false;
         } else if (!(this.emojiName == var1.emojiName)) {
            return false;
         } else {
            return this.emojiSurrogateName == var1.emojiSurrogateName;
         }
      }
   }

   public override fun hashCode(): Int {
      var var2: Int = 0;
      val var1: Int;
      if (this.emojiId == null) {
         var1 = 0;
      } else {
         var1 = this.emojiId.hashCode();
      }

      val var3: Int = this.emojiName.hashCode();
      if (this.emojiSurrogateName != null) {
         var2 = this.emojiSurrogateName.hashCode();
      }

      return (var1 * 31 + var3) * 31 + var2;
   }

   public override fun toString(): String {
      val var3: java.lang.Long = this.emojiId;
      val var2: java.lang.String = this.emojiName;
      val var4: java.lang.String = this.emojiSurrogateName;
      val var1: StringBuilder = new StringBuilder();
      var1.append("CheckpointEmoji(emojiId=");
      var1.append(var3);
      var1.append(", emojiName=");
      var1.append(var2);
      var1.append(", emojiSurrogateName=");
      var1.append(var4);
      var1.append(")");
      return var1.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<CheckpointEmoji> {
         return CheckpointEmoji.$serializer.INSTANCE;
      }
   }
}

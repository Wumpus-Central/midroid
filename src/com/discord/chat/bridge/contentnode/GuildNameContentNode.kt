package com.discord.chat.bridge.contentnode

import kotlinx.serialization.KSerializer
import nb.g

@g
public data class GuildNameContentNode(guildId: String? = null, content: String, icon: String? = null) : ContentNode() {
   public final val guildId: String?
   public final val content: String
   public final val icon: String?

   init {
      this.guildId = var1;
      this.content = var2;
      this.icon = var3;
   }

   public operator fun component1(): String? {
      return this.guildId;
   }

   public operator fun component2(): String {
      return this.content;
   }

   public operator fun component3(): String? {
      return this.icon;
   }

   public fun copy(guildId: String? = var0.guildId, content: String = var0.content, icon: String? = var0.icon): GuildNameContentNode {
      return new GuildNameContentNode(var1, var2, var3);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is GuildNameContentNode) {
         return false;
      } else {
         var1 = var1;
         if (!(this.guildId == var1.guildId)) {
            return false;
         } else if (!(this.content == var1.content)) {
            return false;
         } else {
            return this.icon == var1.icon;
         }
      }
   }

   public override fun hashCode(): Int {
      var var2: Int = 0;
      val var1: Int;
      if (this.guildId == null) {
         var1 = 0;
      } else {
         var1 = this.guildId.hashCode();
      }

      val var3: Int = this.content.hashCode();
      if (this.icon != null) {
         var2 = this.icon.hashCode();
      }

      return (var1 * 31 + var3) * 31 + var2;
   }

   public override fun toString(): String {
      val var2: java.lang.String = this.guildId;
      val var1: java.lang.String = this.content;
      val var3: java.lang.String = this.icon;
      val var4: StringBuilder = new StringBuilder();
      var4.append("GuildNameContentNode(guildId=");
      var4.append(var2);
      var4.append(", content=");
      var4.append(var1);
      var4.append(", icon=");
      var4.append(var3);
      var4.append(")");
      return var4.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<GuildNameContentNode> {
         return GuildNameContentNode.$serializer.INSTANCE;
      }
   }
}

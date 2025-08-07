package com.discord.chat.bridge.contentnode

import kotlin.jvm.internal.r
import kotlinx.serialization.KSerializer
import tb.g

@g
public data class GuildNameContentNode(guildId: String? = null, content: String, icon: String? = null) : ContentNode {
   public final val guildId: String?
   public final val content: String
   public final val icon: String?

   init {
      r.h(var2, "content");
      super(null);
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
      r.h(var2, "content");
      return new GuildNameContentNode(var1, var2, var3);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is GuildNameContentNode) {
         return false;
      } else {
         var1 = var1;
         if (!r.c(this.guildId, var1.guildId)) {
            return false;
         } else if (!r.c(this.content, var1.content)) {
            return false;
         } else {
            return r.c(this.icon, var1.icon);
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
      val var4: java.lang.String = this.guildId;
      val var2: java.lang.String = this.content;
      val var3: java.lang.String = this.icon;
      val var1: StringBuilder = new StringBuilder();
      var1.append("GuildNameContentNode(guildId=");
      var1.append(var4);
      var1.append(", content=");
      var1.append(var2);
      var1.append(", icon=");
      var1.append(var3);
      var1.append(")");
      return var1.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<GuildNameContentNode> {
         return GuildNameContentNode.$serializer.INSTANCE;
      }
   }
}

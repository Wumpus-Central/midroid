package com.discord.chat.bridge.contentnode

import kb.f
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer

@f
public data class GuildNameContentNode(guildId: String? = null, content: String, icon: String? = null) : ContentNode {
   public final val guildId: String?
   public final val content: String
   public final val icon: String?

   init {
      q.h(var2, "content");
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
      q.h(var2, "content");
      return new GuildNameContentNode(var1, var2, var3);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is GuildNameContentNode) {
         return false;
      } else {
         var1 = var1;
         if (!q.c(this.guildId, var1.guildId)) {
            return false;
         } else if (!q.c(this.content, var1.content)) {
            return false;
         } else {
            return q.c(this.icon, var1.icon);
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
      val var1: java.lang.String = this.icon;
      val var3: StringBuilder = new StringBuilder();
      var3.append("GuildNameContentNode(guildId=");
      var3.append(var4);
      var3.append(", content=");
      var3.append(var2);
      var3.append(", icon=");
      var3.append(var1);
      var3.append(")");
      return var3.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<GuildNameContentNode> {
         return GuildNameContentNode.$serializer.INSTANCE;
      }
   }
}

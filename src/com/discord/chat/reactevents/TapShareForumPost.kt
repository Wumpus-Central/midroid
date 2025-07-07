package com.discord.chat.reactevents

import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import lb.f

@f
public data class TapShareForumPost(channelId: String, guildId: String) : ReactEvent {
   public final val channelId: String
   public final val guildId: String

   init {
      q.h(var1, "channelId");
      q.h(var2, "guildId");
      super();
      this.channelId = var1;
      this.guildId = var2;
   }

   public operator fun component1(): String {
      return this.channelId;
   }

   public operator fun component2(): String {
      return this.guildId;
   }

   public fun copy(channelId: String = var0.channelId, guildId: String = var0.guildId): TapShareForumPost {
      q.h(var1, "channelId");
      q.h(var2, "guildId");
      return new TapShareForumPost(var1, var2);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is TapShareForumPost) {
         return false;
      } else {
         var1 = var1;
         if (!q.c(this.channelId, var1.channelId)) {
            return false;
         } else {
            return q.c(this.guildId, var1.guildId);
         }
      }
   }

   public override fun hashCode(): Int {
      return this.channelId.hashCode() * 31 + this.guildId.hashCode();
   }

   override fun serialize(): WritableMap {
      return ReactEvent.DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var3: java.lang.String = this.channelId;
      val var1: java.lang.String = this.guildId;
      val var2: StringBuilder = new StringBuilder();
      var2.append("TapShareForumPost(channelId=");
      var2.append(var3);
      var2.append(", guildId=");
      var2.append(var1);
      var2.append(")");
      return var2.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<TapShareForumPost> {
         return TapShareForumPost.$serializer.INSTANCE;
      }
   }
}

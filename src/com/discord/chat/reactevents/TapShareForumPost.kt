package com.discord.chat.reactevents

import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import kotlinx.serialization.KSerializer
import mb.g

@g
public data class TapShareForumPost(channelId: String, guildId: String) : ReactEvent {
   public final val channelId: String
   public final val guildId: String

   init {
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
      return new TapShareForumPost(var1, var2);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is TapShareForumPost) {
         return false;
      } else {
         var1 = var1;
         if (!(this.channelId == var1.channelId)) {
            return false;
         } else {
            return this.guildId == var1.guildId;
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
      val var2: java.lang.String = this.guildId;
      val var1: StringBuilder = new StringBuilder();
      var1.append("TapShareForumPost(channelId=");
      var1.append(var3);
      var1.append(", guildId=");
      var1.append(var2);
      var1.append(")");
      return var1.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<TapShareForumPost> {
         return TapShareForumPost.$serializer.INSTANCE;
      }
   }
}

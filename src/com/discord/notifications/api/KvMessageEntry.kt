package com.discord.notifications.api

import com.discord.primitives.ChannelId
import com.discord.primitives.MessageId
import kotlinx.serialization.KSerializer
import kotlinx.serialization.json.JsonObject
import nb.g
import qb.f
import rb.q

@g
public data class KvMessageEntry(members: List<JsonObject> = ..., users: List<JsonObject> = ..., message: JsonObject, id: MessageId, channelId: ChannelId) : KvMessageEntry(
      var1, var2, var3, var4, var5
   ) {
   public final val members: List<JsonObject>
   public final val users: List<JsonObject>
   public final val message: JsonObject
   public final val id: MessageId
   public final val channelId: ChannelId

   @JvmStatic
   fun {
      val var0: q = q.a;
      $childSerializers = new KSerializer[]{new f(q.a), new f(var0), null, null, null};
   }

   fun KvMessageEntry(var1: MutableList<JsonObject>, var2: MutableList<JsonObject>, var3: JsonObject, var4: java.lang.String, var5: Long) {
      super();
      this.members = var1;
      this.users = var2;
      this.message = var3;
      this.id = var4;
      this.channelId = var5;
   }

   public operator fun component1(): List<JsonObject> {
      return this.members;
   }

   public operator fun component2(): List<JsonObject> {
      return this.users;
   }

   public operator fun component3(): JsonObject {
      return this.message;
   }

   public operator fun component4(): MessageId {
      return this.id;
   }

   public operator fun component5(): ChannelId {
      return this.channelId;
   }

   public fun copy(members: List<JsonObject> = ..., users: List<JsonObject> = ..., message: JsonObject = ..., id: MessageId = ..., channelId: ChannelId = ...): KvMessageEntry {
      return new KvMessageEntry(var1, var2, var3, var4, var5, null);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is KvMessageEntry) {
         return false;
      } else {
         var1 = var1;
         if (!(this.members == var1.members)) {
            return false;
         } else if (!(this.users == var1.users)) {
            return false;
         } else if (!(this.message == var1.message)) {
            return false;
         } else if (!MessageId.equals-impl0(this.id, var1.id)) {
            return false;
         } else {
            return ChannelId.equals-impl0(this.channelId, var1.channelId);
         }
      }
   }

   public override fun hashCode(): Int {
      return (((this.members.hashCode() * 31 + this.users.hashCode()) * 31 + this.message.hashCode()) * 31 + MessageId.hashCode-impl(this.id)) * 31
         + ChannelId.hashCode-impl(this.channelId);
   }

   public override fun toString(): String {
      val var5: java.util.List = this.members;
      val var3: java.util.List = this.users;
      val var6: JsonObject = this.message;
      val var4: java.lang.String = MessageId.toString-impl(this.id);
      val var2: java.lang.String = ChannelId.toString-impl(this.channelId);
      val var1: StringBuilder = new StringBuilder();
      var1.append("KvMessageEntry(members=");
      var1.append(var5);
      var1.append(", users=");
      var1.append(var3);
      var1.append(", message=");
      var1.append(var6);
      var1.append(", id=");
      var1.append(var4);
      var1.append(", channelId=");
      var1.append(var2);
      var1.append(")");
      return var1.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<KvMessageEntry> {
         return KvMessageEntry.$serializer.INSTANCE;
      }
   }
}

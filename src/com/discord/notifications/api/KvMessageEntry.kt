package com.discord.notifications.api

import com.discord.primitives.ChannelId
import com.discord.primitives.MessageId
import kb.f
import kotlinx.serialization.KSerializer
import kotlinx.serialization.json.JsonObject
import ob.q

@f
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
      $childSerializers = new KSerializer[]{new nb.f(q.a), new nb.f(var0), null, null, null};
   }

   fun KvMessageEntry(var1: MutableList<JsonObject>, var2: MutableList<JsonObject>, var3: JsonObject, var4: java.lang.String, var5: Long) {
      kotlin.jvm.internal.q.h(var1, "members");
      kotlin.jvm.internal.q.h(var2, "users");
      kotlin.jvm.internal.q.h(var3, "message");
      kotlin.jvm.internal.q.h(var4, "id");
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
      kotlin.jvm.internal.q.h(var1, "members");
      kotlin.jvm.internal.q.h(var2, "users");
      kotlin.jvm.internal.q.h(var3, "message");
      kotlin.jvm.internal.q.h(var4, "id");
      return new KvMessageEntry(var1, var2, var3, var4, var5, null);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is KvMessageEntry) {
         return false;
      } else {
         var1 = var1;
         if (!kotlin.jvm.internal.q.c(this.members, var1.members)) {
            return false;
         } else if (!kotlin.jvm.internal.q.c(this.users, var1.users)) {
            return false;
         } else if (!kotlin.jvm.internal.q.c(this.message, var1.message)) {
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
      val var3: java.util.List = this.members;
      val var4: java.util.List = this.users;
      val var1: JsonObject = this.message;
      val var6: java.lang.String = MessageId.toString-impl(this.id);
      val var5: java.lang.String = ChannelId.toString-impl(this.channelId);
      val var2: StringBuilder = new StringBuilder();
      var2.append("KvMessageEntry(members=");
      var2.append(var3);
      var2.append(", users=");
      var2.append(var4);
      var2.append(", message=");
      var2.append(var1);
      var2.append(", id=");
      var2.append(var6);
      var2.append(", channelId=");
      var2.append(var5);
      var2.append(")");
      return var2.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<KvMessageEntry> {
         return KvMessageEntry.$serializer.INSTANCE;
      }
   }
}

package com.discord.contact_sync

import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import tb.f

@f
public data class ContactSyncPayloadEntry(friendId: String) {
   public final val friendId: String

   init {
      q.h(var1, "friendId");
      super();
      this.friendId = var1;
   }

   public operator fun component1(): String {
      return this.friendId;
   }

   public fun copy(friendId: String = var0.friendId): ContactSyncPayloadEntry {
      q.h(var1, "friendId");
      return new ContactSyncPayloadEntry(var1);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is ContactSyncPayloadEntry) {
         return false;
      } else {
         return q.c(this.friendId, (var1 as ContactSyncPayloadEntry).friendId);
      }
   }

   public override fun hashCode(): Int {
      return this.friendId.hashCode();
   }

   public override fun toString(): String {
      val var1: java.lang.String = this.friendId;
      val var2: StringBuilder = new StringBuilder();
      var2.append("ContactSyncPayloadEntry(friendId=");
      var2.append(var1);
      var2.append(")");
      return var2.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<ContactSyncPayloadEntry> {
         return ContactSyncPayloadEntry.$serializer.INSTANCE;
      }
   }
}

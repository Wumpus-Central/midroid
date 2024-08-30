package com.discord.chat.presentation.list.item

import kotlin.jvm.internal.q

public data class DeserializationErrorChatListItem(id: String, json: String, causeMessage: String) : ChatListItem {
   public final val causeMessage: String
   public open val id: String
   public final val json: String

   init {
      q.h(var1, "id");
      q.h(var2, "json");
      q.h(var3, "causeMessage");
      super(var1, null);
      this.id = var1;
      this.json = var2;
      this.causeMessage = var3;
   }

   public operator fun component1(): String {
      return this.id;
   }

   public operator fun component2(): String {
      return this.json;
   }

   public operator fun component3(): String {
      return this.causeMessage;
   }

   public fun copy(id: String = var0.id, json: String = var0.json, causeMessage: String = var0.causeMessage): DeserializationErrorChatListItem {
      q.h(var1, "id");
      q.h(var2, "json");
      q.h(var3, "causeMessage");
      return new DeserializationErrorChatListItem(var1, var2, var3);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is DeserializationErrorChatListItem) {
         return false;
      } else {
         var1 = var1;
         if (!q.c(this.id, var1.id)) {
            return false;
         } else if (!q.c(this.json, var1.json)) {
            return false;
         } else {
            return q.c(this.causeMessage, var1.causeMessage);
         }
      }
   }

   public override fun hashCode(): Int {
      return (this.id.hashCode() * 31 + this.json.hashCode()) * 31 + this.causeMessage.hashCode();
   }

   public override fun toString(): String {
      val var1: java.lang.String = this.id;
      val var4: java.lang.String = this.json;
      val var3: java.lang.String = this.causeMessage;
      val var2: StringBuilder = new StringBuilder();
      var2.append("DeserializationErrorChatListItem(id=");
      var2.append(var1);
      var2.append(", json=");
      var2.append(var4);
      var2.append(", causeMessage=");
      var2.append(var3);
      var2.append(")");
      return var2.toString();
   }
}

package com.discord.chat.presentation.list.item

import kotlin.jvm.internal.r

public data class DeserializationErrorChatListItem(id: String, json: String, causeMessage: String) : ChatListItem {
   public final val causeMessage: String
   public open val id: String
   public final val json: String

   init {
      r.h(var1, "id");
      r.h(var2, "json");
      r.h(var3, "causeMessage");
      super(var1, null);
      this.id = var1;
      this.json = var2;
      this.causeMessage = var3;
   }

   public operator fun component1(): String {
      return this.getId();
   }

   public operator fun component2(): String {
      return this.json;
   }

   public operator fun component3(): String {
      return this.causeMessage;
   }

   public fun copy(id: String = var0.getId(), json: String = var0.json, causeMessage: String = var0.causeMessage): DeserializationErrorChatListItem {
      r.h(var1, "id");
      r.h(var2, "json");
      r.h(var3, "causeMessage");
      return new DeserializationErrorChatListItem(var1, var2, var3);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is DeserializationErrorChatListItem) {
         return false;
      } else {
         var1 = var1;
         if (!r.c(this.getId(), var1.getId())) {
            return false;
         } else if (!r.c(this.json, var1.json)) {
            return false;
         } else {
            return r.c(this.causeMessage, var1.causeMessage);
         }
      }
   }

   public override fun hashCode(): Int {
      return (this.getId().hashCode() * 31 + this.json.hashCode()) * 31 + this.causeMessage.hashCode();
   }

   public override fun toString(): String {
      val var1: java.lang.String = this.getId();
      val var2: java.lang.String = this.json;
      val var4: java.lang.String = this.causeMessage;
      val var3: StringBuilder = new StringBuilder();
      var3.append("DeserializationErrorChatListItem(id=");
      var3.append(var1);
      var3.append(", json=");
      var3.append(var2);
      var3.append(", causeMessage=");
      var3.append(var4);
      var3.append(")");
      return var3.toString();
   }
}

package com.discord.chat.reactevents

import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import mb.f

@f
public data class LongPressUsernameData(messageId: String, userId: String) : ReactEvent {
   public final val messageId: String
   public final val userId: String

   init {
      q.h(var1, "messageId");
      q.h(var2, "userId");
      super();
      this.messageId = var1;
      this.userId = var2;
   }

   public operator fun component1(): String {
      return this.messageId;
   }

   public operator fun component2(): String {
      return this.userId;
   }

   public fun copy(messageId: String = var0.messageId, userId: String = var0.userId): LongPressUsernameData {
      q.h(var1, "messageId");
      q.h(var2, "userId");
      return new LongPressUsernameData(var1, var2);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is LongPressUsernameData) {
         return false;
      } else {
         var1 = var1;
         if (!q.c(this.messageId, var1.messageId)) {
            return false;
         } else {
            return q.c(this.userId, var1.userId);
         }
      }
   }

   public override fun hashCode(): Int {
      return this.messageId.hashCode() * 31 + this.userId.hashCode();
   }

   override fun serialize(): WritableMap {
      return ReactEvent.DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var3: java.lang.String = this.messageId;
      val var2: java.lang.String = this.userId;
      val var1: StringBuilder = new StringBuilder();
      var1.append("LongPressUsernameData(messageId=");
      var1.append(var3);
      var1.append(", userId=");
      var1.append(var2);
      var1.append(")");
      return var1.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<LongPressUsernameData> {
         return LongPressUsernameData.$serializer.INSTANCE;
      }
   }
}

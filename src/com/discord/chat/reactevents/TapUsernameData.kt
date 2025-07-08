package com.discord.chat.reactevents

import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import kotlin.jvm.internal.r
import kotlinx.serialization.KSerializer
import sb.f

@f
public data class TapUsernameData(messageId: String, userId: String) : ReactEvent {
   public final val messageId: String
   public final val userId: String

   init {
      r.h(var1, "messageId");
      r.h(var2, "userId");
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

   public fun copy(messageId: String = var0.messageId, userId: String = var0.userId): TapUsernameData {
      r.h(var1, "messageId");
      r.h(var2, "userId");
      return new TapUsernameData(var1, var2);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is TapUsernameData) {
         return false;
      } else {
         var1 = var1;
         if (!r.c(this.messageId, var1.messageId)) {
            return false;
         } else {
            return r.c(this.userId, var1.userId);
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
      val var1: java.lang.String = this.userId;
      val var2: StringBuilder = new StringBuilder();
      var2.append("TapUsernameData(messageId=");
      var2.append(var3);
      var2.append(", userId=");
      var2.append(var1);
      var2.append(")");
      return var2.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<TapUsernameData> {
         return TapUsernameData.$serializer.INSTANCE;
      }
   }
}

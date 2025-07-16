package com.discord.chat.bridge

import com.discord.primitives.MessageId
import kotlin.jvm.internal.r
import kotlinx.serialization.KSerializer
import sb.g

@g
public data class ErrorMessage(id: MessageId, stackTrace: String) : ErrorMessage(var1, var2) {
   public final val id: MessageId
   public final val stackTrace: String

   fun ErrorMessage(var1: java.lang.String, var2: java.lang.String) {
      r.h(var1, "id");
      r.h(var2, "stackTrace");
      super(null);
      this.id = var1;
      this.stackTrace = var2;
   }

   public operator fun component1(): MessageId {
      return this.id;
   }

   public operator fun component2(): String {
      return this.stackTrace;
   }

   public fun copy(id: MessageId = ..., stackTrace: String = ...): ErrorMessage {
      r.h(var1, "id");
      r.h(var2, "stackTrace");
      return new ErrorMessage(var1, var2, null);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is ErrorMessage) {
         return false;
      } else {
         var1 = var1;
         if (!MessageId.equals-impl0(this.id, var1.id)) {
            return false;
         } else {
            return r.c(this.stackTrace, var1.stackTrace);
         }
      }
   }

   public override fun hashCode(): Int {
      return MessageId.hashCode-impl(this.id) * 31 + this.stackTrace.hashCode();
   }

   public override fun toString(): String {
      val var3: java.lang.String = MessageId.toString-impl(this.id);
      val var2: java.lang.String = this.stackTrace;
      val var1: StringBuilder = new StringBuilder();
      var1.append("ErrorMessage(id=");
      var1.append(var3);
      var1.append(", stackTrace=");
      var1.append(var2);
      var1.append(")");
      return var1.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<ErrorMessage> {
         return ErrorMessage.$serializer.INSTANCE;
      }
   }
}

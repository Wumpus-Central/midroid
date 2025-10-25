package com.discord.chat.bridge

import com.discord.primitives.MessageId
import kc.m
import kotlinx.serialization.KSerializer

@m
public data class ErrorMessage(id: MessageId, stackTrace: String) : ErrorMessage(var1, var2) {
   public final val id: MessageId
   public final val stackTrace: String

   fun ErrorMessage(var1: java.lang.String, var2: java.lang.String) {
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
            return this.stackTrace == var1.stackTrace;
         }
      }
   }

   public override fun hashCode(): Int {
      return MessageId.hashCode-impl(this.id) * 31 + this.stackTrace.hashCode();
   }

   public override fun toString(): String {
      val var1: java.lang.String = MessageId.toString-impl(this.id);
      val var2: java.lang.String = this.stackTrace;
      val var3: StringBuilder = new StringBuilder();
      var3.append("ErrorMessage(id=");
      var3.append(var1);
      var3.append(", stackTrace=");
      var3.append(var2);
      var3.append(")");
      return var3.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<ErrorMessage> {
         return ErrorMessage.$serializer.INSTANCE;
      }
   }
}

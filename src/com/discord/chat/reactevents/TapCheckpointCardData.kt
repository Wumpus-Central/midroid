package com.discord.chat.reactevents

import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import kotlinx.serialization.KSerializer
import xu.m

@m
public data class TapCheckpointCardData(messageId: String, authorId: String) : ReactEvent {
   public final val messageId: String
   public final val authorId: String

   init {
      super();
      this.messageId = var1;
      this.authorId = var2;
   }

   public operator fun component1(): String {
      return this.messageId;
   }

   public operator fun component2(): String {
      return this.authorId;
   }

   public fun copy(messageId: String = var0.messageId, authorId: String = var0.authorId): TapCheckpointCardData {
      return new TapCheckpointCardData(var1, var2);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is TapCheckpointCardData) {
         return false;
      } else {
         var1 = var1;
         if (!(this.messageId == var1.messageId)) {
            return false;
         } else {
            return this.authorId == var1.authorId;
         }
      }
   }

   public override fun hashCode(): Int {
      return this.messageId.hashCode() * 31 + this.authorId.hashCode();
   }

   override fun serialize(): WritableMap {
      return ReactEvent.DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var1: java.lang.String = this.messageId;
      val var2: java.lang.String = this.authorId;
      val var3: StringBuilder = new StringBuilder();
      var3.append("TapCheckpointCardData(messageId=");
      var3.append(var1);
      var3.append(", authorId=");
      var3.append(var2);
      var3.append(")");
      return var3.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<TapCheckpointCardData> {
         return TapCheckpointCardData.$serializer.INSTANCE;
      }
   }
}

package com.discord.chat.reactevents

import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import kotlinx.serialization.KSerializer
import nb.g

@g
public data class TapPollAction(channelId: String, messageId: String, type: String) : ReactEvent {
   public final val channelId: String
   public final val messageId: String
   public final val type: String

   init {
      super();
      this.channelId = var1;
      this.messageId = var2;
      this.type = var3;
   }

   public operator fun component1(): String {
      return this.channelId;
   }

   public operator fun component2(): String {
      return this.messageId;
   }

   public operator fun component3(): String {
      return this.type;
   }

   public fun copy(channelId: String = var0.channelId, messageId: String = var0.messageId, type: String = var0.type): TapPollAction {
      return new TapPollAction(var1, var2, var3);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is TapPollAction) {
         return false;
      } else {
         var1 = var1;
         if (!(this.channelId == var1.channelId)) {
            return false;
         } else if (!(this.messageId == var1.messageId)) {
            return false;
         } else {
            return this.type == var1.type;
         }
      }
   }

   public override fun hashCode(): Int {
      return (this.channelId.hashCode() * 31 + this.messageId.hashCode()) * 31 + this.type.hashCode();
   }

   override fun serialize(): WritableMap {
      return ReactEvent.DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var3: java.lang.String = this.channelId;
      val var4: java.lang.String = this.messageId;
      val var2: java.lang.String = this.type;
      val var1: StringBuilder = new StringBuilder();
      var1.append("TapPollAction(channelId=");
      var1.append(var3);
      var1.append(", messageId=");
      var1.append(var4);
      var1.append(", type=");
      var1.append(var2);
      var1.append(")");
      return var1.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<TapPollAction> {
         return TapPollAction.$serializer.INSTANCE;
      }
   }
}

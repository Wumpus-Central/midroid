package com.discord.chat.reactevents

import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import mb.f

@f
public data class TapPollAction(channelId: String, messageId: String, type: String) : ReactEvent {
   public final val channelId: String
   public final val messageId: String
   public final val type: String

   init {
      q.h(var1, "channelId");
      q.h(var2, "messageId");
      q.h(var3, "type");
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
      q.h(var1, "channelId");
      q.h(var2, "messageId");
      q.h(var3, "type");
      return new TapPollAction(var1, var2, var3);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is TapPollAction) {
         return false;
      } else {
         var1 = var1;
         if (!q.c(this.channelId, var1.channelId)) {
            return false;
         } else if (!q.c(this.messageId, var1.messageId)) {
            return false;
         } else {
            return q.c(this.type, var1.type);
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
      val var2: java.lang.String = this.channelId;
      val var1: java.lang.String = this.messageId;
      val var3: java.lang.String = this.type;
      val var4: StringBuilder = new StringBuilder();
      var4.append("TapPollAction(channelId=");
      var4.append(var2);
      var4.append(", messageId=");
      var4.append(var1);
      var4.append(", type=");
      var4.append(var3);
      var4.append(")");
      return var4.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<TapPollAction> {
         return TapPollAction.$serializer.INSTANCE;
      }
   }
}

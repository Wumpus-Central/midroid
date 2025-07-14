package com.discord.chat.reactevents

import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import kotlin.jvm.internal.r
import kotlinx.serialization.KSerializer
import sb.f

@f
public data class TapInviteAcceptEvent(messageId: String, index: Int) : ReactEvent {
   public final val messageId: String
   public final val index: Int

   init {
      r.h(var1, "messageId");
      super();
      this.messageId = var1;
      this.index = var2;
   }

   public operator fun component1(): String {
      return this.messageId;
   }

   public operator fun component2(): Int {
      return this.index;
   }

   public fun copy(messageId: String = var0.messageId, index: Int = var0.index): TapInviteAcceptEvent {
      r.h(var1, "messageId");
      return new TapInviteAcceptEvent(var1, var2);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is TapInviteAcceptEvent) {
         return false;
      } else {
         var1 = var1;
         if (!r.c(this.messageId, var1.messageId)) {
            return false;
         } else {
            return this.index == var1.index;
         }
      }
   }

   public override fun hashCode(): Int {
      return this.messageId.hashCode() * 31 + Integer.hashCode(this.index);
   }

   override fun serialize(): WritableMap {
      return ReactEvent.DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var3: java.lang.String = this.messageId;
      val var1: Int = this.index;
      val var2: StringBuilder = new StringBuilder();
      var2.append("TapInviteAcceptEvent(messageId=");
      var2.append(var3);
      var2.append(", index=");
      var2.append(var1);
      var2.append(")");
      return var2.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<TapInviteAcceptEvent> {
         return TapInviteAcceptEvent.$serializer.INSTANCE;
      }
   }
}

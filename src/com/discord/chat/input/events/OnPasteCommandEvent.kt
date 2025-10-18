package com.discord.chat.input.events

import com.discord.reactevents.ReactEvent
import com.discord.reactevents.ReactEvent.DefaultImpls
import com.facebook.react.bridge.WritableMap
import kotlinx.serialization.KSerializer
import qc.m

@m
public data class OnPasteCommandEvent(data: String) : ReactEvent {
   public final val data: String

   init {
      super();
      this.data = var1;
   }

   public operator fun component1(): String {
      return this.data;
   }

   public fun copy(data: String = var0.data): OnPasteCommandEvent {
      return new OnPasteCommandEvent(var1);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is OnPasteCommandEvent) {
         return false;
      } else {
         return this.data == (var1 as OnPasteCommandEvent).data;
      }
   }

   public override fun hashCode(): Int {
      return this.data.hashCode();
   }

   fun serialize(): WritableMap {
      return DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var1: java.lang.String = this.data;
      val var2: StringBuilder = new StringBuilder();
      var2.append("OnPasteCommandEvent(data=");
      var2.append(var1);
      var2.append(")");
      return var2.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<OnPasteCommandEvent> {
         return OnPasteCommandEvent.$serializer.INSTANCE;
      }
   }
}

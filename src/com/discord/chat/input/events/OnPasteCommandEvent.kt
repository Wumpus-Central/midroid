package com.discord.chat.input.events

import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import kotlin.jvm.internal.r
import kotlinx.serialization.KSerializer
import sb.f

@f
public data class OnPasteCommandEvent(data: String) : ReactEvent {
   public final val data: String

   init {
      r.h(var1, "data");
      super();
      this.data = var1;
   }

   public operator fun component1(): String {
      return this.data;
   }

   public fun copy(data: String = var0.data): OnPasteCommandEvent {
      r.h(var1, "data");
      return new OnPasteCommandEvent(var1);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is OnPasteCommandEvent) {
         return false;
      } else {
         return r.c(this.data, (var1 as OnPasteCommandEvent).data);
      }
   }

   public override fun hashCode(): Int {
      return this.data.hashCode();
   }

   override fun serialize(): WritableMap {
      return ReactEvent.DefaultImpls.serialize(this);
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

package com.discord.chat.input.events

import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import sb.f

@f
internal data class OnEndBlurEvent(text: String) : ReactEvent {
   public final val text: String

   init {
      q.h(var1, "text");
      super();
      this.text = var1;
   }

   public operator fun component1(): String {
      return this.text;
   }

   public fun copy(text: String = var0.text): OnEndBlurEvent {
      q.h(var1, "text");
      return new OnEndBlurEvent(var1);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is OnEndBlurEvent) {
         return false;
      } else {
         return q.c(this.text, (var1 as OnEndBlurEvent).text);
      }
   }

   public override fun hashCode(): Int {
      return this.text.hashCode();
   }

   override fun serialize(): WritableMap {
      return ReactEvent.DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var2: java.lang.String = this.text;
      val var1: StringBuilder = new StringBuilder();
      var1.append("OnEndBlurEvent(text=");
      var1.append(var2);
      var1.append(")");
      return var1.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<OnEndBlurEvent> {
         return OnEndBlurEvent.$serializer.INSTANCE;
      }
   }
}

package com.discord.chat.input.events

import com.discord.reactevents.ReactEvent
import com.discord.reactevents.ReactEvent.DefaultImpls
import com.facebook.react.bridge.WritableMap
import kotlinx.serialization.KSerializer
import tp.m

@m
internal data class OnEndBlurEvent(text: String) : ReactEvent {
   public final val text: String

   init {
      super();
      this.text = var1;
   }

   public operator fun component1(): String {
      return this.text;
   }

   public fun copy(text: String = var0.text): OnEndBlurEvent {
      return new OnEndBlurEvent(var1);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is OnEndBlurEvent) {
         return false;
      } else {
         return this.text == (var1 as OnEndBlurEvent).text;
      }
   }

   public override fun hashCode(): Int {
      return this.text.hashCode();
   }

   fun serialize(): WritableMap {
      return DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var1: java.lang.String = this.text;
      val var2: StringBuilder = new StringBuilder();
      var2.append("OnEndBlurEvent(text=");
      var2.append(var1);
      var2.append(")");
      return var2.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<OnEndBlurEvent> {
         return OnEndBlurEvent.$serializer.INSTANCE;
      }
   }
}

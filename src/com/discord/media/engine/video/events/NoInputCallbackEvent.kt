package com.discord.media.engine.video.events

import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import kotlinx.serialization.KSerializer
import sb.g

@g
internal data class NoInputCallbackEvent(input: Boolean) : ReactEvent {
   public final val input: Boolean

   init {
      super();
      this.input = var1;
   }

   public operator fun component1(): Boolean {
      return this.input;
   }

   public fun copy(input: Boolean = var0.input): NoInputCallbackEvent {
      return new NoInputCallbackEvent(var1);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is NoInputCallbackEvent) {
         return false;
      } else {
         return this.input == (var1 as NoInputCallbackEvent).input;
      }
   }

   public override fun hashCode(): Int {
      return java.lang.Boolean.hashCode(this.input);
   }

   override fun serialize(): WritableMap {
      return ReactEvent.DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var1: Boolean = this.input;
      val var2: StringBuilder = new StringBuilder();
      var2.append("NoInputCallbackEvent(input=");
      var2.append(var1);
      var2.append(")");
      return var2.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<NoInputCallbackEvent> {
         return NoInputCallbackEvent.$serializer.INSTANCE;
      }
   }
}

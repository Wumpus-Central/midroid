package com.discord.external_pip.react_events

import com.discord.reactevents.ReactEvent
import com.discord.reactevents.ReactEvent.DefaultImpls
import com.facebook.react.bridge.WritableMap
import kotlinx.serialization.KSerializer
import wc.m

@m
internal data class OnPipModeChangedEvent(isInPipMode: Boolean) : ReactEvent {
   public final val isInPipMode: Boolean

   init {
      super();
      this.isInPipMode = var1;
   }

   public operator fun component1(): Boolean {
      return this.isInPipMode;
   }

   public fun copy(isInPipMode: Boolean = var0.isInPipMode): OnPipModeChangedEvent {
      return new OnPipModeChangedEvent(var1);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is OnPipModeChangedEvent) {
         return false;
      } else {
         return this.isInPipMode == (var1 as OnPipModeChangedEvent).isInPipMode;
      }
   }

   public override fun hashCode(): Int {
      return java.lang.Boolean.hashCode(this.isInPipMode);
   }

   fun serialize(): WritableMap {
      return DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var1: Boolean = this.isInPipMode;
      val var2: StringBuilder = new StringBuilder();
      var2.append("OnPipModeChangedEvent(isInPipMode=");
      var2.append(var1);
      var2.append(")");
      return var2.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<OnPipModeChangedEvent> {
         return OnPipModeChangedEvent.$serializer.INSTANCE;
      }
   }
}

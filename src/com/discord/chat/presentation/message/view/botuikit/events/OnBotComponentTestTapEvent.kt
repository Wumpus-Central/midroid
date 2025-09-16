package com.discord.chat.presentation.message.view.botuikit.events

import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import kotlinx.serialization.KSerializer
import mb.g

@g
internal data class OnBotComponentTestTapEvent(dummy: Boolean = true) : ReactEvent {
   public final val dummy: Boolean

   fun OnBotComponentTestTapEvent() {
      this(false, 1, null);
   }

   init {
      this.dummy = var1;
   }

   public operator fun component1(): Boolean {
      return this.dummy;
   }

   public fun copy(dummy: Boolean = var0.dummy): OnBotComponentTestTapEvent {
      return new OnBotComponentTestTapEvent(var1);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is OnBotComponentTestTapEvent) {
         return false;
      } else {
         return this.dummy == (var1 as OnBotComponentTestTapEvent).dummy;
      }
   }

   public override fun hashCode(): Int {
      return java.lang.Boolean.hashCode(this.dummy);
   }

   override fun serialize(): WritableMap {
      return ReactEvent.DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var1: Boolean = this.dummy;
      val var2: StringBuilder = new StringBuilder();
      var2.append("OnBotComponentTestTapEvent(dummy=");
      var2.append(var1);
      var2.append(")");
      return var2.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<OnBotComponentTestTapEvent> {
         return OnBotComponentTestTapEvent.$serializer.INSTANCE;
      }
   }
}

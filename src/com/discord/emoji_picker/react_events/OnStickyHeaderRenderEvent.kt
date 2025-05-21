package com.discord.emoji_picker.react_events

import Za.f
import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import kotlinx.serialization.KSerializer

@f
internal data class OnStickyHeaderRenderEvent(index: Int) : ReactEvent {
   public final val index: Int

   init {
      this.index = var1;
   }

   public operator fun component1(): Int {
      return this.index;
   }

   public fun copy(index: Int = var0.index): OnStickyHeaderRenderEvent {
      return new OnStickyHeaderRenderEvent(var1);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is OnStickyHeaderRenderEvent) {
         return false;
      } else {
         return this.index == (var1 as OnStickyHeaderRenderEvent).index;
      }
   }

   public override fun hashCode(): Int {
      return Integer.hashCode(this.index);
   }

   override fun serialize(): WritableMap {
      return ReactEvent.DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var1: Int = this.index;
      val var2: StringBuilder = new StringBuilder();
      var2.append("OnStickyHeaderRenderEvent(index=");
      var2.append(var1);
      var2.append(")");
      return var2.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<OnStickyHeaderRenderEvent> {
         return OnStickyHeaderRenderEvent.$serializer.INSTANCE;
      }
   }
}

package com.discord.emoji_picker.react_events

import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import kb.f
import kotlinx.serialization.KSerializer

@f
internal data class OnShowNitroUpsell(showNitroUpsell: Boolean) : ReactEvent {
   public final val showNitroUpsell: Boolean

   init {
      super();
      this.showNitroUpsell = var1;
   }

   public operator fun component1(): Boolean {
      return this.showNitroUpsell;
   }

   public fun copy(showNitroUpsell: Boolean = var0.showNitroUpsell): OnShowNitroUpsell {
      return new OnShowNitroUpsell(var1);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is OnShowNitroUpsell) {
         return false;
      } else {
         return this.showNitroUpsell == (var1 as OnShowNitroUpsell).showNitroUpsell;
      }
   }

   public override fun hashCode(): Int {
      return java.lang.Boolean.hashCode(this.showNitroUpsell);
   }

   override fun serialize(): WritableMap {
      return ReactEvent.DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var1: Boolean = this.showNitroUpsell;
      val var2: StringBuilder = new StringBuilder();
      var2.append("OnShowNitroUpsell(showNitroUpsell=");
      var2.append(var1);
      var2.append(")");
      return var2.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<OnShowNitroUpsell> {
         return OnShowNitroUpsell.$serializer.INSTANCE;
      }
   }
}

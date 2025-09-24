package com.discord.chat.reactevents

import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import kotlinx.serialization.KSerializer
import mb.g

@g
internal data class TapShowAltTextData(description: String) : ReactEvent {
   public final val description: String

   init {
      super();
      this.description = var1;
   }

   public operator fun component1(): String {
      return this.description;
   }

   public fun copy(description: String = var0.description): TapShowAltTextData {
      return new TapShowAltTextData(var1);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is TapShowAltTextData) {
         return false;
      } else {
         return this.description == (var1 as TapShowAltTextData).description;
      }
   }

   public override fun hashCode(): Int {
      return this.description.hashCode();
   }

   override fun serialize(): WritableMap {
      return ReactEvent.DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var1: java.lang.String = this.description;
      val var2: StringBuilder = new StringBuilder();
      var2.append("TapShowAltTextData(description=");
      var2.append(var1);
      var2.append(")");
      return var2.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<TapShowAltTextData> {
         return TapShowAltTextData.$serializer.INSTANCE;
      }
   }
}

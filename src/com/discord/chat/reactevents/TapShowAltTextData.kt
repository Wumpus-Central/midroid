package com.discord.chat.reactevents

import Za.f
import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer

@f
internal data class TapShowAltTextData(description: String) : ReactEvent {
   public final val description: String

   init {
      q.h(var1, "description");
      super();
      this.description = var1;
   }

   public operator fun component1(): String {
      return this.description;
   }

   public fun copy(description: String = var0.description): TapShowAltTextData {
      q.h(var1, "description");
      return new TapShowAltTextData(var1);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is TapShowAltTextData) {
         return false;
      } else {
         return q.c(this.description, (var1 as TapShowAltTextData).description);
      }
   }

   public override fun hashCode(): Int {
      return this.description.hashCode();
   }

   override fun serialize(): WritableMap {
      return ReactEvent.DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var2: java.lang.String = this.description;
      val var1: StringBuilder = new StringBuilder();
      var1.append("TapShowAltTextData(description=");
      var1.append(var2);
      var1.append(")");
      return var1.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<TapShowAltTextData> {
         return TapShowAltTextData.$serializer.INSTANCE;
      }
   }
}

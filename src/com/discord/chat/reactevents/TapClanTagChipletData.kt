package com.discord.chat.reactevents

import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import sb.f

@f
public data class TapClanTagChipletData(guildId: String) : ReactEvent {
   public final val guildId: String

   init {
      q.h(var1, "guildId");
      super();
      this.guildId = var1;
   }

   public operator fun component1(): String {
      return this.guildId;
   }

   public fun copy(guildId: String = var0.guildId): TapClanTagChipletData {
      q.h(var1, "guildId");
      return new TapClanTagChipletData(var1);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is TapClanTagChipletData) {
         return false;
      } else {
         return q.c(this.guildId, (var1 as TapClanTagChipletData).guildId);
      }
   }

   public override fun hashCode(): Int {
      return this.guildId.hashCode();
   }

   override fun serialize(): WritableMap {
      return ReactEvent.DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var2: java.lang.String = this.guildId;
      val var1: StringBuilder = new StringBuilder();
      var1.append("TapClanTagChipletData(guildId=");
      var1.append(var2);
      var1.append(")");
      return var1.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<TapClanTagChipletData> {
         return TapClanTagChipletData.$serializer.INSTANCE;
      }
   }
}

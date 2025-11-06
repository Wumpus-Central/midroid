package com.discord.chat.reactevents

import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import kotlinx.serialization.KSerializer
import xu.m

@m
public data class TapClanTagChipletData(guildId: String) : ReactEvent {
   public final val guildId: String

   init {
      super();
      this.guildId = var1;
   }

   public operator fun component1(): String {
      return this.guildId;
   }

   public fun copy(guildId: String = var0.guildId): TapClanTagChipletData {
      return new TapClanTagChipletData(var1);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is TapClanTagChipletData) {
         return false;
      } else {
         return this.guildId == (var1 as TapClanTagChipletData).guildId;
      }
   }

   public override fun hashCode(): Int {
      return this.guildId.hashCode();
   }

   override fun serialize(): WritableMap {
      return ReactEvent.DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var1: java.lang.String = this.guildId;
      val var2: StringBuilder = new StringBuilder();
      var2.append("TapClanTagChipletData(guildId=");
      var2.append(var1);
      var2.append(")");
      return var2.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<TapClanTagChipletData> {
         return TapClanTagChipletData.$serializer.INSTANCE;
      }
   }
}

package com.discord.chat.reactevents

import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import kb.f
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer

@f
public data class TapGameIconData(gameApplicationId: String, timestamp: String) : ReactEvent {
   public final val gameApplicationId: String
   public final val timestamp: String

   init {
      q.h(var1, "gameApplicationId");
      q.h(var2, "timestamp");
      super();
      this.gameApplicationId = var1;
      this.timestamp = var2;
   }

   public operator fun component1(): String {
      return this.gameApplicationId;
   }

   public operator fun component2(): String {
      return this.timestamp;
   }

   public fun copy(gameApplicationId: String = var0.gameApplicationId, timestamp: String = var0.timestamp): TapGameIconData {
      q.h(var1, "gameApplicationId");
      q.h(var2, "timestamp");
      return new TapGameIconData(var1, var2);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is TapGameIconData) {
         return false;
      } else {
         var1 = var1;
         if (!q.c(this.gameApplicationId, var1.gameApplicationId)) {
            return false;
         } else {
            return q.c(this.timestamp, var1.timestamp);
         }
      }
   }

   public override fun hashCode(): Int {
      return this.gameApplicationId.hashCode() * 31 + this.timestamp.hashCode();
   }

   override fun serialize(): WritableMap {
      return ReactEvent.DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var3: java.lang.String = this.gameApplicationId;
      val var2: java.lang.String = this.timestamp;
      val var1: StringBuilder = new StringBuilder();
      var1.append("TapGameIconData(gameApplicationId=");
      var1.append(var3);
      var1.append(", timestamp=");
      var1.append(var2);
      var1.append(")");
      return var1.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<TapGameIconData> {
         return TapGameIconData.$serializer.INSTANCE;
      }
   }
}

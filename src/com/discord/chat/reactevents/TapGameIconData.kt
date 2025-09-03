package com.discord.chat.reactevents

import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import kotlinx.serialization.KSerializer
import nb.g

@g
public data class TapGameIconData(gameApplicationId: String, timestamp: String) : ReactEvent {
   public final val gameApplicationId: String
   public final val timestamp: String

   init {
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
      return new TapGameIconData(var1, var2);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is TapGameIconData) {
         return false;
      } else {
         var1 = var1;
         if (!(this.gameApplicationId == var1.gameApplicationId)) {
            return false;
         } else {
            return this.timestamp == var1.timestamp;
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
      val var1: java.lang.String = this.gameApplicationId;
      val var3: java.lang.String = this.timestamp;
      val var2: StringBuilder = new StringBuilder();
      var2.append("TapGameIconData(gameApplicationId=");
      var2.append(var1);
      var2.append(", timestamp=");
      var2.append(var3);
      var2.append(")");
      return var2.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<TapGameIconData> {
         return TapGameIconData.$serializer.INSTANCE;
      }
   }
}

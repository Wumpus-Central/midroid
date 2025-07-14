package com.discord.media.engine.video.events

import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import kotlinx.serialization.KSerializer
import sb.f

@f
internal data class OnVoiceEvent(level: Float, speaking: Int) : ReactEvent {
   public final val level: Float
   public final val speaking: Int

   init {
      this.level = var1;
      this.speaking = var2;
   }

   public operator fun component1(): Float {
      return this.level;
   }

   public operator fun component2(): Int {
      return this.speaking;
   }

   public fun copy(level: Float = var0.level, speaking: Int = var0.speaking): OnVoiceEvent {
      return new OnVoiceEvent(var1, var2);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is OnVoiceEvent) {
         return false;
      } else {
         var1 = var1;
         if (java.lang.Float.compare(this.level, var1.level) != 0) {
            return false;
         } else {
            return this.speaking == var1.speaking;
         }
      }
   }

   public override fun hashCode(): Int {
      return java.lang.Float.hashCode(this.level) * 31 + Integer.hashCode(this.speaking);
   }

   override fun serialize(): WritableMap {
      return ReactEvent.DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var1: Float = this.level;
      val var2: Int = this.speaking;
      val var3: StringBuilder = new StringBuilder();
      var3.append("OnVoiceEvent(level=");
      var3.append(var1);
      var3.append(", speaking=");
      var3.append(var2);
      var3.append(")");
      return var3.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<OnVoiceEvent> {
         return OnVoiceEvent.$serializer.INSTANCE;
      }
   }
}

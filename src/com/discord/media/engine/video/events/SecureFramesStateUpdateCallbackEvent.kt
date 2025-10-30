package com.discord.media.engine.video.events

import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import kotlinx.serialization.KSerializer
import tp.m

@m
internal data class SecureFramesStateUpdateCallbackEvent(connectionId: Int, stateUpdateJSON: String) : ReactEvent {
   public final val connectionId: Int
   public final val stateUpdateJSON: String

   init {
      super();
      this.connectionId = var1;
      this.stateUpdateJSON = var2;
   }

   public operator fun component1(): Int {
      return this.connectionId;
   }

   public operator fun component2(): String {
      return this.stateUpdateJSON;
   }

   public fun copy(connectionId: Int = var0.connectionId, stateUpdateJSON: String = var0.stateUpdateJSON): SecureFramesStateUpdateCallbackEvent {
      return new SecureFramesStateUpdateCallbackEvent(var1, var2);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is SecureFramesStateUpdateCallbackEvent) {
         return false;
      } else {
         var1 = var1;
         if (this.connectionId != var1.connectionId) {
            return false;
         } else {
            return this.stateUpdateJSON == var1.stateUpdateJSON;
         }
      }
   }

   public override fun hashCode(): Int {
      return Integer.hashCode(this.connectionId) * 31 + this.stateUpdateJSON.hashCode();
   }

   override fun serialize(): WritableMap {
      return ReactEvent.DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var1: Int = this.connectionId;
      val var3: java.lang.String = this.stateUpdateJSON;
      val var2: StringBuilder = new StringBuilder();
      var2.append("SecureFramesStateUpdateCallbackEvent(connectionId=");
      var2.append(var1);
      var2.append(", stateUpdateJSON=");
      var2.append(var3);
      var2.append(")");
      return var2.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<SecureFramesStateUpdateCallbackEvent> {
         return SecureFramesStateUpdateCallbackEvent.$serializer.INSTANCE;
      }
   }
}

package com.discord.media.engine.video.events

import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import kb.f
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer

@f
internal data class ActiveSinksChangeEvent(streamId: String, active: Boolean) : ReactEvent {
   public final val streamId: String
   public final val active: Boolean

   init {
      q.h(var1, "streamId");
      super();
      this.streamId = var1;
      this.active = var2;
   }

   public operator fun component1(): String {
      return this.streamId;
   }

   public operator fun component2(): Boolean {
      return this.active;
   }

   public fun copy(streamId: String = var0.streamId, active: Boolean = var0.active): ActiveSinksChangeEvent {
      q.h(var1, "streamId");
      return new ActiveSinksChangeEvent(var1, var2);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is ActiveSinksChangeEvent) {
         return false;
      } else {
         var1 = var1;
         if (!q.c(this.streamId, var1.streamId)) {
            return false;
         } else {
            return this.active == var1.active;
         }
      }
   }

   public override fun hashCode(): Int {
      return this.streamId.hashCode() * 31 + java.lang.Boolean.hashCode(this.active);
   }

   override fun serialize(): WritableMap {
      return ReactEvent.DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var2: java.lang.String = this.streamId;
      val var1: Boolean = this.active;
      val var3: StringBuilder = new StringBuilder();
      var3.append("ActiveSinksChangeEvent(streamId=");
      var3.append(var2);
      var3.append(", active=");
      var3.append(var1);
      var3.append(")");
      return var3.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<ActiveSinksChangeEvent> {
         return ActiveSinksChangeEvent.$serializer.INSTANCE;
      }
   }
}

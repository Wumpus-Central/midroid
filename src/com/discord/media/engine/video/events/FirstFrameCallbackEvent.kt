package com.discord.media.engine.video.events

import Ka.f
import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer

@f
internal data class FirstFrameCallbackEvent(connectionId: Int, userId: String, ssrc: Long, streamId: String) : ReactEvent {
   public final val connectionId: Int
   public final val userId: String
   public final val ssrc: Long
   public final val streamId: String

   init {
      q.h(var2, "userId");
      q.h(var5, "streamId");
      super();
      this.connectionId = var1;
      this.userId = var2;
      this.ssrc = var3;
      this.streamId = var5;
   }

   public operator fun component1(): Int {
      return this.connectionId;
   }

   public operator fun component2(): String {
      return this.userId;
   }

   public operator fun component3(): Long {
      return this.ssrc;
   }

   public operator fun component4(): String {
      return this.streamId;
   }

   public fun copy(connectionId: Int = var0.connectionId, userId: String = var0.userId, ssrc: Long = var0.ssrc, streamId: String = var0.streamId): FirstFrameCallbackEvent {
      q.h(var2, "userId");
      q.h(var5, "streamId");
      return new FirstFrameCallbackEvent(var1, var2, var3, var5);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is FirstFrameCallbackEvent) {
         return false;
      } else {
         var1 = var1;
         if (this.connectionId != var1.connectionId) {
            return false;
         } else if (!q.c(this.userId, var1.userId)) {
            return false;
         } else if (this.ssrc != var1.ssrc) {
            return false;
         } else {
            return q.c(this.streamId, var1.streamId);
         }
      }
   }

   public override fun hashCode(): Int {
      return ((Integer.hashCode(this.connectionId) * 31 + this.userId.hashCode()) * 31 + java.lang.Long.hashCode(this.ssrc)) * 31 + this.streamId.hashCode();
   }

   override fun serialize(): WritableMap {
      return ReactEvent.DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var1: Int = this.connectionId;
      val var4: java.lang.String = this.userId;
      val var2: Long = this.ssrc;
      val var5: java.lang.String = this.streamId;
      val var6: StringBuilder = new StringBuilder();
      var6.append("FirstFrameCallbackEvent(connectionId=");
      var6.append(var1);
      var6.append(", userId=");
      var6.append(var4);
      var6.append(", ssrc=");
      var6.append(var2);
      var6.append(", streamId=");
      var6.append(var5);
      var6.append(")");
      return var6.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<FirstFrameCallbackEvent> {
         return FirstFrameCallbackEvent.$serializer.INSTANCE;
      }
   }
}

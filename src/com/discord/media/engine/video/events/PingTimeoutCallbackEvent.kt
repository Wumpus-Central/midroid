package com.discord.media.engine.video.events

import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import kotlin.jvm.internal.r
import kotlinx.serialization.KSerializer
import tb.g

@g
internal data class PingTimeoutCallbackEvent(connectionId: Int, server: String, port: Int, seq: Int, timeout: Int) : ReactEvent {
   public final val connectionId: Int
   public final val server: String
   public final val port: Int
   public final val seq: Int
   public final val timeout: Int

   init {
      r.h(var2, "server");
      super();
      this.connectionId = var1;
      this.server = var2;
      this.port = var3;
      this.seq = var4;
      this.timeout = var5;
   }

   public operator fun component1(): Int {
      return this.connectionId;
   }

   public operator fun component2(): String {
      return this.server;
   }

   public operator fun component3(): Int {
      return this.port;
   }

   public operator fun component4(): Int {
      return this.seq;
   }

   public operator fun component5(): Int {
      return this.timeout;
   }

   public fun copy(connectionId: Int = var0.connectionId, server: String = var0.server, port: Int = var0.port, seq: Int = var0.seq, timeout: Int = var0.timeout): PingTimeoutCallbackEvent {
      r.h(var2, "server");
      return new PingTimeoutCallbackEvent(var1, var2, var3, var4, var5);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is PingTimeoutCallbackEvent) {
         return false;
      } else {
         var1 = var1;
         if (this.connectionId != var1.connectionId) {
            return false;
         } else if (!r.c(this.server, var1.server)) {
            return false;
         } else if (this.port != var1.port) {
            return false;
         } else if (this.seq != var1.seq) {
            return false;
         } else {
            return this.timeout == var1.timeout;
         }
      }
   }

   public override fun hashCode(): Int {
      return (((Integer.hashCode(this.connectionId) * 31 + this.server.hashCode()) * 31 + Integer.hashCode(this.port)) * 31 + Integer.hashCode(this.seq)) * 31
         + Integer.hashCode(this.timeout);
   }

   override fun serialize(): WritableMap {
      return ReactEvent.DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var3: Int = this.connectionId;
      val var5: java.lang.String = this.server;
      val var1: Int = this.port;
      val var4: Int = this.seq;
      val var2: Int = this.timeout;
      val var6: StringBuilder = new StringBuilder();
      var6.append("PingTimeoutCallbackEvent(connectionId=");
      var6.append(var3);
      var6.append(", server=");
      var6.append(var5);
      var6.append(", port=");
      var6.append(var1);
      var6.append(", seq=");
      var6.append(var4);
      var6.append(", timeout=");
      var6.append(var2);
      var6.append(")");
      return var6.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<PingTimeoutCallbackEvent> {
         return PingTimeoutCallbackEvent.$serializer.INSTANCE;
      }
   }
}

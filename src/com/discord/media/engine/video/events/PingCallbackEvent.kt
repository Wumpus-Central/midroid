package com.discord.media.engine.video.events

import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import kotlinx.serialization.KSerializer
import xu.m

@m
internal data class PingCallbackEvent(connectionId: Int, ping: Int, server: String, port: Int, seq: Int) : ReactEvent {
   public final val connectionId: Int
   public final val ping: Int
   public final val server: String
   public final val port: Int
   public final val seq: Int

   init {
      super();
      this.connectionId = var1;
      this.ping = var2;
      this.server = var3;
      this.port = var4;
      this.seq = var5;
   }

   public operator fun component1(): Int {
      return this.connectionId;
   }

   public operator fun component2(): Int {
      return this.ping;
   }

   public operator fun component3(): String {
      return this.server;
   }

   public operator fun component4(): Int {
      return this.port;
   }

   public operator fun component5(): Int {
      return this.seq;
   }

   public fun copy(connectionId: Int = var0.connectionId, ping: Int = var0.ping, server: String = var0.server, port: Int = var0.port, seq: Int = var0.seq): PingCallbackEvent {
      return new PingCallbackEvent(var1, var2, var3, var4, var5);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is PingCallbackEvent) {
         return false;
      } else {
         var1 = var1;
         if (this.connectionId != var1.connectionId) {
            return false;
         } else if (this.ping != var1.ping) {
            return false;
         } else if (!(this.server == var1.server)) {
            return false;
         } else if (this.port != var1.port) {
            return false;
         } else {
            return this.seq == var1.seq;
         }
      }
   }

   public override fun hashCode(): Int {
      return (((Integer.hashCode(this.connectionId) * 31 + Integer.hashCode(this.ping)) * 31 + this.server.hashCode()) * 31 + Integer.hashCode(this.port)) * 31
         + Integer.hashCode(this.seq);
   }

   override fun serialize(): WritableMap {
      return ReactEvent.DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var2: Int = this.connectionId;
      val var3: Int = this.ping;
      val var5: java.lang.String = this.server;
      val var1: Int = this.port;
      val var4: Int = this.seq;
      val var6: StringBuilder = new StringBuilder();
      var6.append("PingCallbackEvent(connectionId=");
      var6.append(var2);
      var6.append(", ping=");
      var6.append(var3);
      var6.append(", server=");
      var6.append(var5);
      var6.append(", port=");
      var6.append(var1);
      var6.append(", seq=");
      var6.append(var4);
      var6.append(")");
      return var6.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<PingCallbackEvent> {
         return PingCallbackEvent.$serializer.INSTANCE;
      }
   }
}

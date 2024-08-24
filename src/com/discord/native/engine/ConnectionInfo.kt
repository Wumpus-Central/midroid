package com.discord.native.engine

import kotlin.jvm.internal.r

public data class ConnectionInfo(isConnected: Boolean, protocol: String, localAddress: String, localPort: Int) {
   public final val isConnected: Boolean
   public final val localAddress: String
   public final val localPort: Int
   public final val protocol: String

   init {
      r.h(var2, "protocol");
      r.h(var3, "localAddress");
      super();
      this.isConnected = var1;
      this.protocol = var2;
      this.localAddress = var3;
      this.localPort = var4;
   }

   public operator fun component1(): Boolean {
      return this.isConnected;
   }

   public operator fun component2(): String {
      return this.protocol;
   }

   public operator fun component3(): String {
      return this.localAddress;
   }

   public operator fun component4(): Int {
      return this.localPort;
   }

   public fun copy(
      isConnected: Boolean = var0.isConnected,
      protocol: String = var0.protocol,
      localAddress: String = var0.localAddress,
      localPort: Int = var0.localPort
   ): ConnectionInfo {
      r.h(var2, "protocol");
      r.h(var3, "localAddress");
      return new ConnectionInfo(var1, var2, var3, var4);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is ConnectionInfo) {
         return false;
      } else {
         var1 = var1;
         if (this.isConnected != var1.isConnected) {
            return false;
         } else if (!r.c(this.protocol, var1.protocol)) {
            return false;
         } else if (!r.c(this.localAddress, var1.localAddress)) {
            return false;
         } else {
            return this.localPort == var1.localPort;
         }
      }
   }

   public override fun hashCode(): Int {
      var var1: Byte = this.isConnected;
      if (this.isConnected != 0) {
         var1 = 1;
      }

      return ((var1 * 31 + this.protocol.hashCode()) * 31 + this.localAddress.hashCode()) * 31 + Integer.hashCode(this.localPort);
   }

   public override fun toString(): String {
      val var2: Boolean = this.isConnected;
      val var4: java.lang.String = this.protocol;
      val var3: java.lang.String = this.localAddress;
      val var1: Int = this.localPort;
      val var5: StringBuilder = new StringBuilder();
      var5.append("ConnectionInfo(isConnected=");
      var5.append(var2);
      var5.append(", protocol=");
      var5.append(var4);
      var5.append(", localAddress=");
      var5.append(var3);
      var5.append(", localPort=");
      var5.append(var1);
      var5.append(")");
      return var5.toString();
   }
}

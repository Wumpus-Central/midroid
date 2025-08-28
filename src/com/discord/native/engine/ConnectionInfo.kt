package com.discord.native.engine

public data class ConnectionInfo(isConnected: Boolean, protocol: String, localAddress: String, localPort: Int, createConnectionTime: Int?, connectTime: Int?) {
   public final val connectTime: Int?
   public final val createConnectionTime: Int?
   public final val isConnected: Boolean
   public final val localAddress: String
   public final val localPort: Int
   public final val protocol: String

   init {
      this.isConnected = var1;
      this.protocol = var2;
      this.localAddress = var3;
      this.localPort = var4;
      this.createConnectionTime = var5;
      this.connectTime = var6;
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

   public operator fun component5(): Int? {
      return this.createConnectionTime;
   }

   public operator fun component6(): Int? {
      return this.connectTime;
   }

   public fun copy(
      isConnected: Boolean = var0.isConnected,
      protocol: String = var0.protocol,
      localAddress: String = var0.localAddress,
      localPort: Int = var0.localPort,
      createConnectionTime: Int? = var0.createConnectionTime,
      connectTime: Int? = var0.connectTime
   ): ConnectionInfo {
      return new ConnectionInfo(var1, var2, var3, var4, var5, var6);
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
         } else if (!(this.protocol == var1.protocol)) {
            return false;
         } else if (!(this.localAddress == var1.localAddress)) {
            return false;
         } else if (this.localPort != var1.localPort) {
            return false;
         } else if (!(this.createConnectionTime == var1.createConnectionTime)) {
            return false;
         } else {
            return this.connectTime == var1.connectTime;
         }
      }
   }

   public override fun hashCode(): Int {
      val var4: Int = java.lang.Boolean.hashCode(this.isConnected);
      val var6: Int = this.protocol.hashCode();
      val var3: Int = this.localAddress.hashCode();
      val var5: Int = Integer.hashCode(this.localPort);
      var var2: Int = 0;
      val var1: Int;
      if (this.createConnectionTime == null) {
         var1 = 0;
      } else {
         var1 = this.createConnectionTime.hashCode();
      }

      if (this.connectTime != null) {
         var2 = this.connectTime.hashCode();
      }

      return ((((var4 * 31 + var6) * 31 + var3) * 31 + var5) * 31 + var1) * 31 + var2;
   }

   public override fun toString(): String {
      val var2: Boolean = this.isConnected;
      val var3: java.lang.String = this.protocol;
      val var5: java.lang.String = this.localAddress;
      val var1: Int = this.localPort;
      val var6: Int = this.createConnectionTime;
      val var4: Int = this.connectTime;
      val var7: StringBuilder = new StringBuilder();
      var7.append("ConnectionInfo(isConnected=");
      var7.append(var2);
      var7.append(", protocol=");
      var7.append(var3);
      var7.append(", localAddress=");
      var7.append(var5);
      var7.append(", localPort=");
      var7.append(var1);
      var7.append(", createConnectionTime=");
      var7.append(var6);
      var7.append(", connectTime=");
      var7.append(var4);
      var7.append(")");
      return var7.toString();
   }
}

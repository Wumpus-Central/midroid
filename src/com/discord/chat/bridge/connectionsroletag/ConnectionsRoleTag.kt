package com.discord.chat.bridge.connectionsroletag

import kotlinx.serialization.KSerializer
import qc.m

@m
public data class ConnectionsRoleTag(id: String, name: String, backgroundColor: Int, iconColor: Int) {
   public final val id: String
   public final val name: String
   public final val backgroundColor: Int
   public final val iconColor: Int

   init {
      super();
      this.id = var1;
      this.name = var2;
      this.backgroundColor = var3;
      this.iconColor = var4;
   }

   public operator fun component1(): String {
      return this.id;
   }

   public operator fun component2(): String {
      return this.name;
   }

   public operator fun component3(): Int {
      return this.backgroundColor;
   }

   public operator fun component4(): Int {
      return this.iconColor;
   }

   public fun copy(id: String = var0.id, name: String = var0.name, backgroundColor: Int = var0.backgroundColor, iconColor: Int = var0.iconColor): ConnectionsRoleTag {
      return new ConnectionsRoleTag(var1, var2, var3, var4);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is ConnectionsRoleTag) {
         return false;
      } else {
         var1 = var1;
         if (!(this.id == var1.id)) {
            return false;
         } else if (!(this.name == var1.name)) {
            return false;
         } else if (this.backgroundColor != var1.backgroundColor) {
            return false;
         } else {
            return this.iconColor == var1.iconColor;
         }
      }
   }

   public override fun hashCode(): Int {
      return ((this.id.hashCode() * 31 + this.name.hashCode()) * 31 + Integer.hashCode(this.backgroundColor)) * 31 + Integer.hashCode(this.iconColor);
   }

   public override fun toString(): String {
      val var4: java.lang.String = this.id;
      val var3: java.lang.String = this.name;
      val var1: Int = this.backgroundColor;
      val var2: Int = this.iconColor;
      val var5: StringBuilder = new StringBuilder();
      var5.append("ConnectionsRoleTag(id=");
      var5.append(var4);
      var5.append(", name=");
      var5.append(var3);
      var5.append(", backgroundColor=");
      var5.append(var1);
      var5.append(", iconColor=");
      var5.append(var2);
      var5.append(")");
      return var5.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<ConnectionsRoleTag> {
         return ConnectionsRoleTag.$serializer.INSTANCE;
      }
   }
}

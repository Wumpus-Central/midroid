package com.discord.chat.bridge.connectionsroletag

import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
import nn.f
import nn.n
import qn.b2
import qn.g0
import qn.n0
import qn.g0.a

@f
public data class ConnectionsRoleTag(id: String, name: String, backgroundColor: Int, iconColor: Int) {
   public final val backgroundColor: Int
   public final val iconColor: Int
   public final val id: String
   public final val name: String

   init {
      q.h(var1, "id");
      q.h(var2, "name");
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
      q.h(var1, "id");
      q.h(var2, "name");
      return new ConnectionsRoleTag(var1, var2, var3, var4);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is ConnectionsRoleTag) {
         return false;
      } else {
         var1 = var1;
         if (!q.c(this.id, var1.id)) {
            return false;
         } else if (!q.c(this.name, var1.name)) {
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
      val var5: java.lang.String = this.id;
      val var3: java.lang.String = this.name;
      val var2: Int = this.backgroundColor;
      val var1: Int = this.iconColor;
      val var4: StringBuilder = new StringBuilder();
      var4.append("ConnectionsRoleTag(id=");
      var4.append(var5);
      var4.append(", name=");
      var4.append(var3);
      var4.append(", backgroundColor=");
      var4.append(var2);
      var4.append(", iconColor=");
      var4.append(var1);
      var4.append(")");
      return var4.toString();
   }

   public object `$serializer` : g0 {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: ConnectionsRoleTag.$serializer = new ConnectionsRoleTag.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor(
            "com.discord.chat.bridge.connectionsroletag.ConnectionsRoleTag", var0, 4
         );
         var1.c("id", false);
         var1.c("name", false);
         var1.c("backgroundColor", false);
         var1.c("iconColor", false);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{b2.a, b2.a, n0.a, n0.a};
      }

      public open fun deserialize(decoder: Decoder): ConnectionsRoleTag {
         q.h(var1, "decoder");
         val var8: SerialDescriptor = this.getDescriptor();
         val var9: c = var1.b(var8);
         var var2: Int;
         var var3: Int;
         val var5: Int;
         var var7: java.lang.String;
         var var10: java.lang.String;
         if (var9.p()) {
            var7 = var9.m(var8, 0);
            var10 = var9.m(var8, 1);
            var3 = var9.i(var8, 2);
            var2 = var9.i(var8, 3);
            var5 = 15;
         } else {
            var7 = null;
            var10 = null;
            var var12: Boolean = true;
            var var4: Int = 0;
            var3 = 0;
            var2 = 0;

            while (var12) {
               val var6: Int = var9.o(var8);
               if (var6 != -1) {
                  if (var6 != 0) {
                     if (var6 != 1) {
                        if (var6 != 2) {
                           if (var6 != 3) {
                              throw new n(var6);
                           }

                           var4 = var9.i(var8, 3);
                           var2 |= 8;
                        } else {
                           var3 = var9.i(var8, 2);
                           var2 |= 4;
                        }
                     } else {
                        var10 = var9.m(var8, 1);
                        var2 |= 2;
                     }
                  } else {
                     var7 = var9.m(var8, 0);
                     var2 |= 1;
                  }
               } else {
                  var12 = false;
               }
            }

            var5 = var2;
            var2 = var4;
         }

         var9.c(var8);
         return new ConnectionsRoleTag(var5, var7, var10, var3, var2, null);
      }

      public open fun serialize(encoder: Encoder, value: ConnectionsRoleTag) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         ConnectionsRoleTag.write$Self$chat_release(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<ConnectionsRoleTag> {
         return ConnectionsRoleTag.$serializer.INSTANCE;
      }
   }
}

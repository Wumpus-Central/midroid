package com.discord.chat.bridge.connectionsroletag

import kotlin.jvm.internal.r
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
import uk.f
import uk.n
import xk.a2
import xk.f0
import xk.m0
import xk.f0.a

@f
public data class ConnectionsRoleTag(id: String, name: String, backgroundColor: Int, iconColor: Int) {
   public final val backgroundColor: Int
   public final val iconColor: Int
   public final val id: String
   public final val name: String

   init {
      r.h(var1, "id");
      r.h(var2, "name");
      super();
      this.id = var1;
      this.name = var2;
      this.backgroundColor = var3;
      this.iconColor = var4;
   }

   @JvmStatic
   public fun `write$Self`(self: ConnectionsRoleTag, output: CompositeEncoder, serialDesc: SerialDescriptor) {
      r.h(var0, "self");
      r.h(var1, "output");
      r.h(var2, "serialDesc");
      var1.z(var2, 0, var0.id);
      var1.z(var2, 1, var0.name);
      var1.w(var2, 2, var0.backgroundColor);
      var1.w(var2, 3, var0.iconColor);
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
      r.h(var1, "id");
      r.h(var2, "name");
      return new ConnectionsRoleTag(var1, var2, var3, var4);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is ConnectionsRoleTag) {
         return false;
      } else {
         var1 = var1;
         if (!r.c(this.id, var1.id)) {
            return false;
         } else if (!r.c(this.name, var1.name)) {
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
      val var3: java.lang.String = this.id;
      val var5: java.lang.String = this.name;
      val var1: Int = this.backgroundColor;
      val var2: Int = this.iconColor;
      val var4: StringBuilder = new StringBuilder();
      var4.append("ConnectionsRoleTag(id=");
      var4.append(var3);
      var4.append(", name=");
      var4.append(var5);
      var4.append(", backgroundColor=");
      var4.append(var1);
      var4.append(", iconColor=");
      var4.append(var2);
      var4.append(")");
      return var4.toString();
   }

   public object `$serializer` : f0<ConnectionsRoleTag> {
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
         var1.l("id", false);
         var1.l("name", false);
         var1.l("backgroundColor", false);
         var1.l("iconColor", false);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{a2.a, a2.a, m0.a, m0.a};
      }

      public open fun deserialize(decoder: Decoder): ConnectionsRoleTag {
         r.h(var1, "decoder");
         val var9: SerialDescriptor = this.getDescriptor();
         val var10: c = var1.b(var9);
         var var2: Int;
         var var3: Int;
         val var5: Int;
         val var8: java.lang.String;
         var var12: java.lang.String;
         if (var10.p()) {
            val var11: java.lang.String = var10.m(var9, 0);
            val var7: java.lang.String = var10.m(var9, 1);
            var5 = var10.i(var9, 2);
            var2 = var10.i(var9, 3);
            var3 = 15;
            var8 = var11;
            var12 = var7;
         } else {
            var var16: java.lang.String = null;
            var12 = null;
            var var15: Boolean = true;
            var var4: Int = 0;
            var3 = 0;
            var2 = 0;

            while (var15) {
               val var6: Int = var10.o(var9);
               if (var6 != -1) {
                  if (var6 != 0) {
                     if (var6 != 1) {
                        if (var6 != 2) {
                           if (var6 != 3) {
                              throw new n(var6);
                           }

                           var4 = var10.i(var9, 3);
                           var2 |= 8;
                        } else {
                           var3 = var10.i(var9, 2);
                           var2 |= 4;
                        }
                     } else {
                        var12 = var10.m(var9, 1);
                        var2 |= 2;
                     }
                  } else {
                     var16 = var10.m(var9, 0);
                     var2 |= 1;
                  }
               } else {
                  var15 = false;
               }
            }

            var5 = var3;
            var3 = var2;
            var2 = var4;
            var8 = var16;
         }

         var10.c(var9);
         return new ConnectionsRoleTag(var3, var8, var12, var5, var2, null);
      }

      public open fun serialize(encoder: Encoder, value: ConnectionsRoleTag) {
         r.h(var1, "encoder");
         r.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         ConnectionsRoleTag.write$Self(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer<?>> {
         return a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<ConnectionsRoleTag> {
         return ConnectionsRoleTag.$serializer.INSTANCE;
      }
   }
}

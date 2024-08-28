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
      val var4: java.lang.String = this.name;
      val var1: Int = this.backgroundColor;
      val var2: Int = this.iconColor;
      val var5: StringBuilder = new StringBuilder();
      var5.append("ConnectionsRoleTag(id=");
      var5.append(var3);
      var5.append(", name=");
      var5.append(var4);
      var5.append(", backgroundColor=");
      var5.append(var1);
      var5.append(", iconColor=");
      var5.append(var2);
      var5.append(")");
      return var5.toString();
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
         val var8: SerialDescriptor = this.getDescriptor();
         val var9: c = var1.b(var8);
         var var3: Int;
         var var4: Int;
         val var5: Int;
         var var7: java.lang.String;
         var var10: java.lang.String;
         if (var9.p()) {
            var7 = var9.m(var8, 0);
            var10 = var9.m(var8, 1);
            var3 = var9.i(var8, 2);
            val var2: Int = var9.i(var8, 3);
            var5 = 15;
            var4 = var2;
         } else {
            var7 = null;
            var10 = null;
            var var12: Boolean = true;
            var4 = 0;
            var3 = 0;
            var var11: Int = 0;

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
                           var11 |= 8;
                        } else {
                           var3 = var9.i(var8, 2);
                           var11 |= 4;
                        }
                     } else {
                        var10 = var9.m(var8, 1);
                        var11 |= 2;
                     }
                  } else {
                     var7 = var9.m(var8, 0);
                     var11 |= 1;
                  }
               } else {
                  var12 = false;
               }
            }

            var5 = var11;
         }

         var9.c(var8);
         return new ConnectionsRoleTag(var5, var7, var10, var3, var4, null);
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

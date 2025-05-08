package com.discord.chat.bridge.rolecolors

import ha.f
import ha.n
import ia.a
import ka.G
import ka.N
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor

@f
public data class RoleColors(primaryColor: Int, secondaryColor: Int? = null, tertiaryColor: Int? = null) {
   public final val primaryColor: Int
   public final val secondaryColor: Int?
   public final val tertiaryColor: Int?

   init {
      super();
      this.primaryColor = var1;
      this.secondaryColor = var2;
      this.tertiaryColor = var3;
   }

   public operator fun component1(): Int {
      return this.primaryColor;
   }

   public operator fun component2(): Int? {
      return this.secondaryColor;
   }

   public operator fun component3(): Int? {
      return this.tertiaryColor;
   }

   public fun copy(primaryColor: Int = var0.primaryColor, secondaryColor: Int? = var0.secondaryColor, tertiaryColor: Int? = var0.tertiaryColor): RoleColors {
      return new RoleColors(var1, var2, var3);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is RoleColors) {
         return false;
      } else {
         var1 = var1;
         if (this.primaryColor != var1.primaryColor) {
            return false;
         } else if (!q.c(this.secondaryColor, var1.secondaryColor)) {
            return false;
         } else {
            return q.c(this.tertiaryColor, var1.tertiaryColor);
         }
      }
   }

   public override fun hashCode(): Int {
      val var3: Int = Integer.hashCode(this.primaryColor);
      var var2: Int = 0;
      val var1: Int;
      if (this.secondaryColor == null) {
         var1 = 0;
      } else {
         var1 = this.secondaryColor.hashCode();
      }

      if (this.tertiaryColor != null) {
         var2 = this.tertiaryColor.hashCode();
      }

      return (var3 * 31 + var1) * 31 + var2;
   }

   public override fun toString(): String {
      val var1: Int = this.primaryColor;
      val var2: Int = this.secondaryColor;
      val var4: Int = this.tertiaryColor;
      val var3: StringBuilder = new StringBuilder();
      var3.append("RoleColors(primaryColor=");
      var3.append(var1);
      var3.append(", secondaryColor=");
      var3.append(var2);
      var3.append(", tertiaryColor=");
      var3.append(var4);
      var3.append(")");
      return var3.toString();
   }

   public object `$serializer` : G {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: RoleColors.$serializer = new RoleColors.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.bridge.rolecolors.RoleColors", var0, 3);
         var1.l("primaryColor", false);
         var1.l("secondaryColor", true);
         var1.l("tertiaryColor", true);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         val var1: N = N.a;
         return new KSerializer[]{N.a, a.u(N.a), a.u(var1)};
      }

      public open fun deserialize(decoder: Decoder): RoleColors {
         q.h(var1, "decoder");
         val var7: SerialDescriptor = this.getDescriptor();
         val var8: c = var1.c(var7);
         var var2: Int;
         var var3: Int;
         var var6: Int;
         var var10: Int;
         if (var8.y()) {
            var2 = var8.k(var7, 0);
            val var9: N = N.a;
            var6 = var8.v(var7, 1, N.a, null) as Int;
            var10 = var8.v(var7, 2, var9, null) as Int;
            var3 = 7;
         } else {
            var var4: Boolean = true;
            var3 = 0;
            var6 = null;
            var10 = null;
            var2 = 0;

            while (var4) {
               val var5: Int = var8.x(var7);
               if (var5 != -1) {
                  if (var5 != 0) {
                     if (var5 != 1) {
                        if (var5 != 2) {
                           throw new n(var5);
                        }

                        var10 = var8.v(var7, 2, N.a, var10) as Int;
                        var2 |= 4;
                     } else {
                        var6 = var8.v(var7, 1, N.a, var6) as Int;
                        var2 |= 2;
                     }
                  } else {
                     var3 = var8.k(var7, 0);
                     var2 |= 1;
                  }
               } else {
                  var4 = false;
               }
            }

            var2 = var3;
            var3 = var2;
         }

         var8.b(var7);
         return new RoleColors(var3, var2, var6, var10, null);
      }

      public open fun serialize(encoder: Encoder, value: RoleColors) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.c(var3);
         RoleColors.write$Self$chat_release(var2, var4, var3);
         var4.b(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return ka.G.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<RoleColors> {
         return RoleColors.$serializer.INSTANCE;
      }
   }
}

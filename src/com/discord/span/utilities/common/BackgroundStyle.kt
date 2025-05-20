package com.discord.span.utilities.common

import ha.f
import ha.n
import ka.G
import ka.N
import ka.G.a
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor

@f
public data class BackgroundStyle(backgroundColor: Int, cornerRadius: Int = 0, marginVertical: Int = 0) {
   public final val backgroundColor: Int
   public final val cornerRadius: Int
   public final val marginVertical: Int

   init {
      this.backgroundColor = var1;
      this.cornerRadius = var2;
      this.marginVertical = var3;
   }

   public operator fun component1(): Int {
      return this.backgroundColor;
   }

   public operator fun component2(): Int {
      return this.cornerRadius;
   }

   public operator fun component3(): Int {
      return this.marginVertical;
   }

   public fun copy(backgroundColor: Int = var0.backgroundColor, cornerRadius: Int = var0.cornerRadius, marginVertical: Int = var0.marginVertical): BackgroundStyle {
      return new BackgroundStyle(var1, var2, var3);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is BackgroundStyle) {
         return false;
      } else {
         var1 = var1;
         if (this.backgroundColor != var1.backgroundColor) {
            return false;
         } else if (this.cornerRadius != var1.cornerRadius) {
            return false;
         } else {
            return this.marginVertical == var1.marginVertical;
         }
      }
   }

   public override fun hashCode(): Int {
      return (Integer.hashCode(this.backgroundColor) * 31 + Integer.hashCode(this.cornerRadius)) * 31 + Integer.hashCode(this.marginVertical);
   }

   public override fun toString(): String {
      val var3: Int = this.backgroundColor;
      val var2: Int = this.cornerRadius;
      val var1: Int = this.marginVertical;
      val var4: StringBuilder = new StringBuilder();
      var4.append("BackgroundStyle(backgroundColor=");
      var4.append(var3);
      var4.append(", cornerRadius=");
      var4.append(var2);
      var4.append(", marginVertical=");
      var4.append(var1);
      var4.append(")");
      return var4.toString();
   }

   public object `$serializer` : G {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: BackgroundStyle.$serializer = new BackgroundStyle.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.span.utilities.common.BackgroundStyle", var0, 3);
         var1.l("backgroundColor", false);
         var1.l("cornerRadius", true);
         var1.l("marginVertical", true);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{N.a, N.a, N.a};
      }

      public open fun deserialize(decoder: Decoder): BackgroundStyle {
         q.h(var1, "decoder");
         val var8: SerialDescriptor = this.getDescriptor();
         val var9: c = var1.c(var8);
         var var3: Int;
         var var4: Int;
         var var5: Int;
         val var6: Int;
         if (var9.y()) {
            var5 = var9.k(var8, 0);
            var6 = var9.k(var8, 1);
            val var2: Int = var9.k(var8, 2);
            var3 = 7;
            var4 = var2;
         } else {
            var var12: Boolean = true;
            var5 = 0;
            var4 = 0;
            var3 = 0;
            var var10: Int = 0;

            while (var12) {
               val var7: Int = var9.x(var8);
               if (var7 != -1) {
                  if (var7 != 0) {
                     if (var7 != 1) {
                        if (var7 != 2) {
                           throw new n(var7);
                        }

                        var4 = var9.k(var8, 2);
                        var10 |= 4;
                     } else {
                        var3 = var9.k(var8, 1);
                        var10 |= 2;
                     }
                  } else {
                     var5 = var9.k(var8, 0);
                     var10 |= 1;
                  }
               } else {
                  var12 = false;
               }
            }

            var6 = var3;
            var3 = var10;
         }

         var9.b(var8);
         return new BackgroundStyle(var3, var5, var6, var4, null);
      }

      public open fun serialize(encoder: Encoder, value: BackgroundStyle) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.c(var3);
         BackgroundStyle.write$Self$span_utilities_release(var2, var4, var3);
         var4.b(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<BackgroundStyle> {
         return BackgroundStyle.$serializer.INSTANCE;
      }
   }
}

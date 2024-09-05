package com.discord.chat.bridge.botuikit

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
import qn.f0
import qn.g0
import qn.n0
import qn.g0.a

@f
public data class GradientColor(r: Int, g: Int, b: Int, a: Float) {
   public final val a: Float
   public final val b: Int
   public final val g: Int
   public final val r: Int

   init {
      this.r = var1;
      this.g = var2;
      this.b = var3;
      this.a = var4;
   }

   public operator fun component1(): Int {
      return this.r;
   }

   public operator fun component2(): Int {
      return this.g;
   }

   public operator fun component3(): Int {
      return this.b;
   }

   public operator fun component4(): Float {
      return this.a;
   }

   public fun copy(r: Int = var0.r, g: Int = var0.g, b: Int = var0.b, a: Float = var0.a): GradientColor {
      return new GradientColor(var1, var2, var3, var4);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is GradientColor) {
         return false;
      } else {
         var1 = var1;
         if (this.r != var1.r) {
            return false;
         } else if (this.g != var1.g) {
            return false;
         } else if (this.b != var1.b) {
            return false;
         } else {
            return java.lang.Float.compare(this.a, var1.a) == 0;
         }
      }
   }

   public override fun hashCode(): Int {
      return ((Integer.hashCode(this.r) * 31 + Integer.hashCode(this.g)) * 31 + Integer.hashCode(this.b)) * 31 + java.lang.Float.hashCode(this.a);
   }

   public override fun toString(): String {
      val var2: Int = this.r;
      val var4: Int = this.g;
      val var3: Int = this.b;
      val var1: Float = this.a;
      val var5: StringBuilder = new StringBuilder();
      var5.append("GradientColor(r=");
      var5.append(var2);
      var5.append(", g=");
      var5.append(var4);
      var5.append(", b=");
      var5.append(var3);
      var5.append(", a=");
      var5.append(var1);
      var5.append(")");
      return var5.toString();
   }

   public object `$serializer` : g0 {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: GradientColor.$serializer = new GradientColor.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.bridge.botuikit.GradientColor", var0, 4);
         var1.c("r", false);
         var1.c("g", false);
         var1.c("b", false);
         var1.c("a", false);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{n0.a, n0.a, n0.a, f0.a};
      }

      public open fun deserialize(decoder: Decoder): GradientColor {
         q.h(var1, "decoder");
         val var9: SerialDescriptor = this.getDescriptor();
         val var10: c = var1.b(var9);
         var var2: Float;
         var var4: Int;
         var var5: Int;
         var var6: Int;
         val var7: Int;
         if (var10.p()) {
            var6 = var10.i(var9, 0);
            var4 = var10.i(var9, 1);
            val var3: Int = var10.i(var9, 2);
            var2 = var10.u(var9, 3);
            var5 = 15;
            var7 = var3;
         } else {
            var2 = 0.0F;
            var var13: Boolean = true;
            var6 = 0;
            var5 = 0;
            var4 = 0;
            var var11: Int = 0;

            while (var13) {
               val var8: Int = var10.o(var9);
               if (var8 != -1) {
                  if (var8 != 0) {
                     if (var8 != 1) {
                        if (var8 != 2) {
                           if (var8 != 3) {
                              throw new n(var8);
                           }

                           var2 = var10.u(var9, 3);
                           var11 |= 8;
                        } else {
                           var5 = var10.i(var9, 2);
                           var11 |= 4;
                        }
                     } else {
                        var4 = var10.i(var9, 1);
                        var11 |= 2;
                     }
                  } else {
                     var6 = var10.i(var9, 0);
                     var11 |= 1;
                  }
               } else {
                  var13 = false;
               }
            }

            var7 = var5;
            var5 = var11;
         }

         var10.c(var9);
         return new GradientColor(var5, var6, var4, var7, var2, null);
      }

      public open fun serialize(encoder: Encoder, value: GradientColor) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         GradientColor.write$Self$chat_release(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return qn.g0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<GradientColor> {
         return GradientColor.$serializer.INSTANCE;
      }
   }
}

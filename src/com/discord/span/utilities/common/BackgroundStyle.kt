package com.discord.span.utilities.common

import cl.f
import cl.n
import fl.g0
import fl.n0
import fl.g0.a
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor

@f
public data class BackgroundStyle(backgroundColor: Int, cornerRadius: Int) {
   public final val backgroundColor: Int
   public final val cornerRadius: Int

   init {
      this.backgroundColor = var1;
      this.cornerRadius = var2;
   }

   public operator fun component1(): Int {
      return this.backgroundColor;
   }

   public operator fun component2(): Int {
      return this.cornerRadius;
   }

   public fun copy(backgroundColor: Int = var0.backgroundColor, cornerRadius: Int = var0.cornerRadius): BackgroundStyle {
      return new BackgroundStyle(var1, var2);
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
         } else {
            return this.cornerRadius == var1.cornerRadius;
         }
      }
   }

   public override fun hashCode(): Int {
      return Integer.hashCode(this.backgroundColor) * 31 + Integer.hashCode(this.cornerRadius);
   }

   public override fun toString(): String {
      val var2: Int = this.backgroundColor;
      val var1: Int = this.cornerRadius;
      val var3: StringBuilder = new StringBuilder();
      var3.append("BackgroundStyle(backgroundColor=");
      var3.append(var2);
      var3.append(", cornerRadius=");
      var3.append(var1);
      var3.append(")");
      return var3.toString();
   }

   public object `$serializer` : g0 {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: BackgroundStyle.$serializer = new BackgroundStyle.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.span.utilities.common.BackgroundStyle", var0, 2);
         var1.l("backgroundColor", false);
         var1.l("cornerRadius", false);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{n0.a, n0.a};
      }

      public open fun deserialize(decoder: Decoder): BackgroundStyle {
         q.h(var1, "decoder");
         val var7: SerialDescriptor = this.getDescriptor();
         val var8: c = var1.c(var7);
         var var2: Int;
         var var3: Int;
         var var4: Int;
         if (var8.y()) {
            var3 = var8.k(var7, 0);
            var4 = var8.k(var7, 1);
            var2 = 3;
         } else {
            var var5: Boolean = true;
            var3 = 0;
            var4 = 0;
            var2 = 0;

            while (var5) {
               val var6: Int = var8.x(var7);
               if (var6 != -1) {
                  if (var6 != 0) {
                     if (var6 != 1) {
                        throw new n(var6);
                     }

                     var4 = var8.k(var7, 1);
                     var2 |= 2;
                  } else {
                     var3 = var8.k(var7, 0);
                     var2 |= 1;
                  }
               } else {
                  var5 = false;
               }
            }
         }

         var8.b(var7);
         return new BackgroundStyle(var2, var3, var4, null);
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

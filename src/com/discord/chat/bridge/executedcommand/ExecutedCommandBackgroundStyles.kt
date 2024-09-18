package com.discord.chat.bridge.executedcommand

import bl.g0
import bl.h
import bl.n0
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
import yk.f
import yk.n
import zk.a

@f
public data class ExecutedCommandBackgroundStyles(color: Int? = null, borderRadius: Int? = null, spaceAround: Boolean? = java.lang.Boolean.FALSE) {
   public final val borderRadius: Int?
   public final val color: Int?
   public final val spaceAround: Boolean?

   fun ExecutedCommandBackgroundStyles() {
      this(null, null, null, 7, null);
   }

   init {
      this.color = var1;
      this.borderRadius = var2;
      this.spaceAround = var3;
   }

   public operator fun component1(): Int? {
      return this.color;
   }

   public operator fun component2(): Int? {
      return this.borderRadius;
   }

   public operator fun component3(): Boolean? {
      return this.spaceAround;
   }

   public fun copy(color: Int? = var0.color, borderRadius: Int? = var0.borderRadius, spaceAround: Boolean? = var0.spaceAround): ExecutedCommandBackgroundStyles {
      return new ExecutedCommandBackgroundStyles(var1, var2, var3);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is ExecutedCommandBackgroundStyles) {
         return false;
      } else {
         var1 = var1;
         if (!q.c(this.color, var1.color)) {
            return false;
         } else if (!q.c(this.borderRadius, var1.borderRadius)) {
            return false;
         } else {
            return q.c(this.spaceAround, var1.spaceAround);
         }
      }
   }

   public override fun hashCode(): Int {
      var var3: Int = 0;
      val var1: Int;
      if (this.color == null) {
         var1 = 0;
      } else {
         var1 = this.color.hashCode();
      }

      val var2: Int;
      if (this.borderRadius == null) {
         var2 = 0;
      } else {
         var2 = this.borderRadius.hashCode();
      }

      if (this.spaceAround != null) {
         var3 = this.spaceAround.hashCode();
      }

      return (var1 * 31 + var2) * 31 + var3;
   }

   public override fun toString(): String {
      val var3: Int = this.color;
      val var1: Int = this.borderRadius;
      val var4: java.lang.Boolean = this.spaceAround;
      val var2: StringBuilder = new StringBuilder();
      var2.append("ExecutedCommandBackgroundStyles(color=");
      var2.append(var3);
      var2.append(", borderRadius=");
      var2.append(var1);
      var2.append(", spaceAround=");
      var2.append(var4);
      var2.append(")");
      return var2.toString();
   }

   public object `$serializer` : g0 {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: ExecutedCommandBackgroundStyles.$serializer = new ExecutedCommandBackgroundStyles.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor(
            "com.discord.chat.bridge.executedcommand.ExecutedCommandBackgroundStyles", var0, 3
         );
         var1.l("color", true);
         var1.l("borderRadius", true);
         var1.l("spaceAround", true);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         val var1: n0 = n0.a;
         return new KSerializer[]{a.u(n0.a), a.u(var1), a.u(h.a)};
      }

      public open fun deserialize(decoder: Decoder): ExecutedCommandBackgroundStyles {
         q.h(var1, "decoder");
         val var9: SerialDescriptor = this.getDescriptor();
         val var10: c = var1.c(var9);
         val var5: Boolean = var10.y();
         var var7: Int = null;
         var var2: Int;
         val var6: java.lang.Boolean;
         val var12: Int;
         if (var5) {
            val var11: n0 = n0.a;
            var7 = var10.v(var9, 0, n0.a, null) as Int;
            var12 = var10.v(var9, 1, var11, null) as Int;
            var6 = var10.v(var9, 2, h.a, null) as java.lang.Boolean;
            var2 = 7;
         } else {
            var var3: Boolean = true;
            var2 = 0;
            var var14: Int = null;
            var var13: java.lang.Boolean = null;

            while (var3) {
               val var4: Int = var10.x(var9);
               if (var4 != -1) {
                  if (var4 != 0) {
                     if (var4 != 1) {
                        if (var4 != 2) {
                           throw new n(var4);
                        }

                        var13 = var10.v(var9, 2, h.a, var13) as java.lang.Boolean;
                        var2 |= 4;
                     } else {
                        var14 = var10.v(var9, 1, n0.a, var14) as Int;
                        var2 |= 2;
                     }
                  } else {
                     var7 = var10.v(var9, 0, n0.a, var7) as Int;
                     var2 |= 1;
                  }
               } else {
                  var3 = false;
               }
            }

            var6 = var13;
            var12 = var14;
         }

         var10.b(var9);
         return new ExecutedCommandBackgroundStyles(var2, var7, var12, var6, null);
      }

      public open fun serialize(encoder: Encoder, value: ExecutedCommandBackgroundStyles) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.c(var3);
         ExecutedCommandBackgroundStyles.write$Self$chat_release(var2, var4, var3);
         var4.b(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return bl.g0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<ExecutedCommandBackgroundStyles> {
         return ExecutedCommandBackgroundStyles.$serializer.INSTANCE;
      }
   }
}

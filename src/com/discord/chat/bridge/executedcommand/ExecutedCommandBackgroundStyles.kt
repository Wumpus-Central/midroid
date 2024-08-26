package com.discord.chat.bridge.executedcommand

import kotlin.jvm.internal.r
import kotlinx.serialization.DeserializationStrategy
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
import uk.f
import uk.n
import vk.a
import xk.f0
import xk.h
import xk.m0

@f
public data class ExecutedCommandBackgroundStyles(color: Int? = null, borderRadius: Int? = null, spaceAround: Boolean? = java.lang.Boolean.FALSE) {
   public final val borderRadius: Int?
   public final val color: Int?
   public final val spaceAround: Boolean?

   fun ExecutedCommandBackgroundStyles() {
      this(null, null, null, 7, null);
   }

   init {
      super();
      this.color = var1;
      this.borderRadius = var2;
      this.spaceAround = var3;
   }

   @JvmStatic
   public fun `write$Self`(self: ExecutedCommandBackgroundStyles, output: CompositeEncoder, serialDesc: SerialDescriptor) {
      r.h(var0, "self");
      r.h(var1, "output");
      r.h(var2, "serialDesc");
      var var3: Boolean;
      if (!var1.A(var2, 0) && var0.color == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 0, m0.a, var0.color);
      }

      if (!var1.A(var2, 1) && var0.borderRadius == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 1, m0.a, var0.borderRadius);
      }

      label32: {
         if (!var1.A(var2, 2)) {
            var3 = false;
            if (r.c(var0.spaceAround, java.lang.Boolean.FALSE)) {
               break label32;
            }
         }

         var3 = true;
      }

      if (var3) {
         var1.m(var2, 2, h.a, var0.spaceAround);
      }
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
         if (!r.c(this.color, var1.color)) {
            return false;
         } else if (!r.c(this.borderRadius, var1.borderRadius)) {
            return false;
         } else {
            return r.c(this.spaceAround, var1.spaceAround);
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
      val var2: Int = this.borderRadius;
      val var4: java.lang.Boolean = this.spaceAround;
      val var1: StringBuilder = new StringBuilder();
      var1.append("ExecutedCommandBackgroundStyles(color=");
      var1.append(var3);
      var1.append(", borderRadius=");
      var1.append(var2);
      var1.append(", spaceAround=");
      var1.append(var4);
      var1.append(")");
      return var1.toString();
   }

   public object `$serializer` : f0<ExecutedCommandBackgroundStyles> {
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
         val var1: m0 = m0.a;
         return new KSerializer[]{a.u(m0.a), a.u(var1), a.u(h.a)};
      }

      public open fun deserialize(decoder: Decoder): ExecutedCommandBackgroundStyles {
         r.h(var1, "decoder");
         val var8: SerialDescriptor = this.getDescriptor();
         val var9: c = var1.b(var8);
         val var5: Boolean = var9.p();
         var var6: Any = null;
         var var2: Int;
         var var7: Any;
         var var11: Any;
         if (var5) {
            var11 = m0.a;
            var6 = var9.n(var8, 0, m0.a, null);
            var7 = var9.n(var8, 1, (DeserializationStrategy)var11, null);
            var11 = var9.n(var8, 2, h.a, null);
            var2 = 7;
         } else {
            var var3: Boolean = true;
            var2 = 0;
            var7 = null;
            var11 = null;

            while (var3) {
               val var4: Int = var9.o(var8);
               if (var4 != -1) {
                  if (var4 != 0) {
                     if (var4 != 1) {
                        if (var4 != 2) {
                           throw new n(var4);
                        }

                        var11 = var9.n(var8, 2, h.a, var11);
                        var2 |= 4;
                     } else {
                        var7 = var9.n(var8, 1, m0.a, var7);
                        var2 |= 2;
                     }
                  } else {
                     var6 = var9.n(var8, 0, m0.a, var6);
                     var2 |= 1;
                  }
               } else {
                  var3 = false;
               }
            }
         }

         var9.c(var8);
         return new ExecutedCommandBackgroundStyles(var2, var6 as Integer, var7 as Integer, var11 as java.lang.Boolean, null);
      }

      public open fun serialize(encoder: Encoder, value: ExecutedCommandBackgroundStyles) {
         r.h(var1, "encoder");
         r.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         ExecutedCommandBackgroundStyles.write$Self(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer<?>> {
         return xk.f0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<ExecutedCommandBackgroundStyles> {
         return ExecutedCommandBackgroundStyles.$serializer.INSTANCE;
      }
   }
}

package com.discord.chat.bridge

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
import xk.m0

@f
public data class BackgroundHighlight(backgroundColor: Int? = null, gutterColor: Int? = null) {
   public final val backgroundColor: Int?
   public final val gutterColor: Int?

   fun BackgroundHighlight() {
      this(null, null, 3, null);
   }

   init {
      super();
      this.backgroundColor = var1;
      this.gutterColor = var2;
   }

   @JvmStatic
   public fun `write$Self`(self: BackgroundHighlight, output: CompositeEncoder, serialDesc: SerialDescriptor) {
      r.h(var0, "self");
      r.h(var1, "output");
      r.h(var2, "serialDesc");
      var var3: Boolean;
      if (!var1.A(var2, 0) && var0.backgroundColor == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 0, m0.a, var0.backgroundColor);
      }

      label24: {
         if (!var1.A(var2, 1)) {
            var3 = false;
            if (var0.gutterColor == null) {
               break label24;
            }
         }

         var3 = true;
      }

      if (var3) {
         var1.m(var2, 1, m0.a, var0.gutterColor);
      }
   }

   public operator fun component1(): Int? {
      return this.backgroundColor;
   }

   public operator fun component2(): Int? {
      return this.gutterColor;
   }

   public fun copy(backgroundColor: Int? = var0.backgroundColor, gutterColor: Int? = var0.gutterColor): BackgroundHighlight {
      return new BackgroundHighlight(var1, var2);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is BackgroundHighlight) {
         return false;
      } else {
         var1 = var1;
         if (!r.c(this.backgroundColor, var1.backgroundColor)) {
            return false;
         } else {
            return r.c(this.gutterColor, var1.gutterColor);
         }
      }
   }

   public override fun hashCode(): Int {
      var var2: Int = 0;
      val var1: Int;
      if (this.backgroundColor == null) {
         var1 = 0;
      } else {
         var1 = this.backgroundColor.hashCode();
      }

      if (this.gutterColor != null) {
         var2 = this.gutterColor.hashCode();
      }

      return var1 * 31 + var2;
   }

   public override fun toString(): String {
      val var1: Int = this.backgroundColor;
      val var3: Int = this.gutterColor;
      val var2: StringBuilder = new StringBuilder();
      var2.append("BackgroundHighlight(backgroundColor=");
      var2.append(var1);
      var2.append(", gutterColor=");
      var2.append(var3);
      var2.append(")");
      return var2.toString();
   }

   public object `$serializer` : f0<BackgroundHighlight> {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: BackgroundHighlight.$serializer = new BackgroundHighlight.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.bridge.BackgroundHighlight", var0, 2);
         var1.l("backgroundColor", true);
         var1.l("gutterColor", true);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         val var1: m0 = m0.a;
         return new KSerializer[]{a.u(m0.a), a.u(var1)};
      }

      public open fun deserialize(decoder: Decoder): BackgroundHighlight {
         r.h(var1, "decoder");
         val var6: SerialDescriptor = this.getDescriptor();
         val var7: c = var1.b(var6);
         var var2: Int;
         var var5: Any;
         var var9: Any;
         if (var7.p()) {
            var9 = m0.a;
            var5 = var7.n(var6, 0, m0.a, null);
            var9 = var7.n(var6, 1, (DeserializationStrategy)var9, null);
            var2 = 3;
         } else {
            var var3: Boolean = true;
            var2 = 0;
            var9 = null;
            var5 = null;

            while (var3) {
               val var4: Int = var7.o(var6);
               if (var4 != -1) {
                  if (var4 != 0) {
                     if (var4 != 1) {
                        throw new n(var4);
                     }

                     var9 = var7.n(var6, 1, m0.a, var9);
                     var2 |= 2;
                  } else {
                     var5 = var7.n(var6, 0, m0.a, var5);
                     var2 |= 1;
                  }
               } else {
                  var3 = false;
               }
            }
         }

         var7.c(var6);
         return new BackgroundHighlight(var2, var5 as Integer, var9 as Integer, null);
      }

      public open fun serialize(encoder: Encoder, value: BackgroundHighlight) {
         r.h(var1, "encoder");
         r.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         BackgroundHighlight.write$Self(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer<?>> {
         return xk.f0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<BackgroundHighlight> {
         return BackgroundHighlight.$serializer.INSTANCE;
      }
   }
}

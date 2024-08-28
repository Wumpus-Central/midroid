package com.discord.chat.bridge

import dn.f
import dn.n
import en.a
import gn.g0
import gn.n0
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor

@f
public data class BackgroundHighlight(backgroundColor: Int? = null, gutterColor: Int? = null) {
   public final val backgroundColor: Int?
   public final val gutterColor: Int?

   fun BackgroundHighlight() {
      this(null, null, 3, null);
   }

   init {
      this.backgroundColor = var1;
      this.gutterColor = var2;
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
         if (!q.c(this.backgroundColor, var1.backgroundColor)) {
            return false;
         } else {
            return q.c(this.gutterColor, var1.gutterColor);
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
      val var2: Int = this.gutterColor;
      val var3: StringBuilder = new StringBuilder();
      var3.append("BackgroundHighlight(backgroundColor=");
      var3.append(var1);
      var3.append(", gutterColor=");
      var3.append(var2);
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
         val var0: BackgroundHighlight.$serializer = new BackgroundHighlight.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.bridge.BackgroundHighlight", var0, 2);
         var1.l("backgroundColor", true);
         var1.l("gutterColor", true);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         val var1: n0 = n0.a;
         return new KSerializer[]{a.u(n0.a), a.u(var1)};
      }

      public open fun deserialize(decoder: Decoder): BackgroundHighlight {
         q.h(var1, "decoder");
         val var6: SerialDescriptor = this.getDescriptor();
         val var7: c = var1.b(var6);
         var var2: Int;
         var var5: Int;
         var var9: Int;
         if (var7.p()) {
            val var8: n0 = n0.a;
            var5 = var7.n(var6, 0, n0.a, null) as Int;
            var9 = var7.n(var6, 1, var8, null) as Int;
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

                     var9 = var7.n(var6, 1, n0.a, var9) as Int;
                     var2 |= 2;
                  } else {
                     var5 = var7.n(var6, 0, n0.a, var5) as Int;
                     var2 |= 1;
                  }
               } else {
                  var3 = false;
               }
            }
         }

         var7.c(var6);
         return new BackgroundHighlight(var2, var5, var9, null);
      }

      public open fun serialize(encoder: Encoder, value: BackgroundHighlight) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         BackgroundHighlight.write$Self$chat_release(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return gn.g0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<BackgroundHighlight> {
         return BackgroundHighlight.$serializer.INSTANCE;
      }
   }
}

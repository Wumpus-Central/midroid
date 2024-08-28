package com.discord.chat.bridge.botuikit

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
import vk.a
import xk.a2
import xk.f0

@f
public data class Subtitle(badgeUrl: String? = null, text: String) {
   public final val badgeUrl: String?
   public final val text: String

   init {
      r.h(var2, "text");
      super();
      this.badgeUrl = var1;
      this.text = var2;
   }

   @JvmStatic
   public fun `write$Self`(self: Subtitle, output: CompositeEncoder, serialDesc: SerialDescriptor) {
      r.h(var0, "self");
      r.h(var1, "output");
      r.h(var2, "serialDesc");
      val var3: Boolean;
      if (!var1.A(var2, 0) && var0.badgeUrl == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 0, a2.a, var0.badgeUrl);
      }

      var1.z(var2, 1, var0.text);
   }

   public operator fun component1(): String? {
      return this.badgeUrl;
   }

   public operator fun component2(): String {
      return this.text;
   }

   public fun copy(badgeUrl: String? = var0.badgeUrl, text: String = var0.text): Subtitle {
      r.h(var2, "text");
      return new Subtitle(var1, var2);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is Subtitle) {
         return false;
      } else {
         var1 = var1;
         if (!r.c(this.badgeUrl, var1.badgeUrl)) {
            return false;
         } else {
            return r.c(this.text, var1.text);
         }
      }
   }

   public override fun hashCode(): Int {
      val var1: Int;
      if (this.badgeUrl == null) {
         var1 = 0;
      } else {
         var1 = this.badgeUrl.hashCode();
      }

      return var1 * 31 + this.text.hashCode();
   }

   public override fun toString(): String {
      val var3: java.lang.String = this.badgeUrl;
      val var2: java.lang.String = this.text;
      val var1: StringBuilder = new StringBuilder();
      var1.append("Subtitle(badgeUrl=");
      var1.append(var3);
      var1.append(", text=");
      var1.append(var2);
      var1.append(")");
      return var1.toString();
   }

   public object `$serializer` : f0<Subtitle> {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: Subtitle.$serializer = new Subtitle.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.bridge.botuikit.Subtitle", var0, 2);
         var1.l("badgeUrl", true);
         var1.l("text", false);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         val var1: a2 = a2.a;
         return new KSerializer[]{a.u(a2.a), var1};
      }

      public open fun deserialize(decoder: Decoder): Subtitle {
         r.h(var1, "decoder");
         val var6: SerialDescriptor = this.getDescriptor();
         val var7: c = var1.b(var6);
         var var2: Int;
         var var5: java.lang.String;
         var var8: Any;
         if (var7.p()) {
            var8 = var7.n(var6, 0, a2.a, null);
            var5 = var7.m(var6, 1);
            var2 = 3;
         } else {
            var var3: Boolean = true;
            var2 = 0;
            var8 = null;
            var5 = null;

            while (var3) {
               val var4: Int = var7.o(var6);
               if (var4 != -1) {
                  if (var4 != 0) {
                     if (var4 != 1) {
                        throw new n(var4);
                     }

                     var5 = var7.m(var6, 1);
                     var2 |= 2;
                  } else {
                     var8 = var7.n(var6, 0, a2.a, var8);
                     var2 |= 1;
                  }
               } else {
                  var3 = false;
               }
            }
         }

         var7.c(var6);
         return new Subtitle(var2, var8 as java.lang.String, var5, null);
      }

      public open fun serialize(encoder: Encoder, value: Subtitle) {
         r.h(var1, "encoder");
         r.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         Subtitle.write$Self(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer<?>> {
         return xk.f0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<Subtitle> {
         return Subtitle.$serializer.INSTANCE;
      }
   }
}

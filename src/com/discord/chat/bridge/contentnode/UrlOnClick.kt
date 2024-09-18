package com.discord.chat.bridge.contentnode

import cl.f
import cl.n
import dl.a
import fl.b2
import fl.g0
import fl.n0
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor

@f
public data class UrlOnClick(url: String, linkColor: Int? = null) {
   public final val linkColor: Int?
   public final val url: String

   init {
      q.h(var1, "url");
      super();
      this.url = var1;
      this.linkColor = var2;
   }

   public operator fun component1(): String {
      return this.url;
   }

   public operator fun component2(): Int? {
      return this.linkColor;
   }

   public fun copy(url: String = var0.url, linkColor: Int? = var0.linkColor): UrlOnClick {
      q.h(var1, "url");
      return new UrlOnClick(var1, var2);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is UrlOnClick) {
         return false;
      } else {
         var1 = var1;
         if (!q.c(this.url, var1.url)) {
            return false;
         } else {
            return q.c(this.linkColor, var1.linkColor);
         }
      }
   }

   public override fun hashCode(): Int {
      val var2: Int = this.url.hashCode();
      val var1: Int;
      if (this.linkColor == null) {
         var1 = 0;
      } else {
         var1 = this.linkColor.hashCode();
      }

      return var2 * 31 + var1;
   }

   public override fun toString(): String {
      val var2: java.lang.String = this.url;
      val var1: Int = this.linkColor;
      val var3: StringBuilder = new StringBuilder();
      var3.append("UrlOnClick(url=");
      var3.append(var2);
      var3.append(", linkColor=");
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
         val var0: UrlOnClick.$serializer = new UrlOnClick.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.bridge.contentnode.UrlOnClick", var0, 2);
         var1.l("url", false);
         var1.l("linkColor", true);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{b2.a, a.u(n0.a)};
      }

      public open fun deserialize(decoder: Decoder): UrlOnClick {
         q.h(var1, "decoder");
         val var6: SerialDescriptor = this.getDescriptor();
         val var7: c = var1.c(var6);
         var var2: Int;
         var var5: Int;
         var var8: java.lang.String;
         if (var7.y()) {
            var8 = var7.t(var6, 0);
            var5 = var7.v(var6, 1, n0.a, null) as Int;
            var2 = 3;
         } else {
            var var3: Boolean = true;
            var2 = 0;
            var8 = null;
            var5 = null;

            while (var3) {
               val var4: Int = var7.x(var6);
               if (var4 != -1) {
                  if (var4 != 0) {
                     if (var4 != 1) {
                        throw new n(var4);
                     }

                     var5 = var7.v(var6, 1, n0.a, var5) as Int;
                     var2 |= 2;
                  } else {
                     var8 = var7.t(var6, 0);
                     var2 |= 1;
                  }
               } else {
                  var3 = false;
               }
            }
         }

         var7.b(var6);
         return new UrlOnClick(var2, var8, var5, null);
      }

      public open fun serialize(encoder: Encoder, value: UrlOnClick) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.c(var3);
         UrlOnClick.write$Self$chat_release(var2, var4, var3);
         var4.b(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return fl.g0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<UrlOnClick> {
         return UrlOnClick.$serializer.INSTANCE;
      }
   }
}

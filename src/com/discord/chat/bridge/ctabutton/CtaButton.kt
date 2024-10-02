package com.discord.chat.bridge.ctabutton

import cl.f
import cl.n
import dl.a
import fl.b2
import fl.g0
import fl.n0
import kotlin.jvm.internal.q
import kotlinx.serialization.DeserializationStrategy
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor

@f
public data class CtaButton(text: String, textColor: Int? = null, backgroundColor: Int? = null, callback: String? = null) {
   public final val backgroundColor: Int?
   public final val callback: String?
   public final val text: String
   public final val textColor: Int?

   init {
      q.h(var1, "text");
      super();
      this.text = var1;
      this.textColor = var2;
      this.backgroundColor = var3;
      this.callback = var4;
   }

   public operator fun component1(): String {
      return this.text;
   }

   public operator fun component2(): Int? {
      return this.textColor;
   }

   public operator fun component3(): Int? {
      return this.backgroundColor;
   }

   public operator fun component4(): String? {
      return this.callback;
   }

   public fun copy(text: String = var0.text, textColor: Int? = var0.textColor, backgroundColor: Int? = var0.backgroundColor, callback: String? = var0.callback): CtaButton {
      q.h(var1, "text");
      return new CtaButton(var1, var2, var3, var4);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is CtaButton) {
         return false;
      } else {
         var1 = var1;
         if (!q.c(this.text, var1.text)) {
            return false;
         } else if (!q.c(this.textColor, var1.textColor)) {
            return false;
         } else if (!q.c(this.backgroundColor, var1.backgroundColor)) {
            return false;
         } else {
            return q.c(this.callback, var1.callback);
         }
      }
   }

   public override fun hashCode(): Int {
      val var4: Int = this.text.hashCode();
      var var3: Int = 0;
      val var1: Int;
      if (this.textColor == null) {
         var1 = 0;
      } else {
         var1 = this.textColor.hashCode();
      }

      val var2: Int;
      if (this.backgroundColor == null) {
         var2 = 0;
      } else {
         var2 = this.backgroundColor.hashCode();
      }

      if (this.callback != null) {
         var3 = this.callback.hashCode();
      }

      return ((var4 * 31 + var1) * 31 + var2) * 31 + var3;
   }

   public override fun toString(): String {
      val var1: java.lang.String = this.text;
      val var5: Int = this.textColor;
      val var4: Int = this.backgroundColor;
      val var2: java.lang.String = this.callback;
      val var3: StringBuilder = new StringBuilder();
      var3.append("CtaButton(text=");
      var3.append(var1);
      var3.append(", textColor=");
      var3.append(var5);
      var3.append(", backgroundColor=");
      var3.append(var4);
      var3.append(", callback=");
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
         val var0: CtaButton.$serializer = new CtaButton.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.bridge.ctabutton.CtaButton", var0, 4);
         var1.l("text", false);
         var1.l("textColor", true);
         var1.l("backgroundColor", true);
         var1.l("callback", true);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         val var1: b2 = b2.a;
         val var2: n0 = n0.a;
         return new KSerializer[]{b2.a, a.u(n0.a), a.u(var2), a.u(var1)};
      }

      public open fun deserialize(decoder: Decoder): CtaButton {
         q.h(var1, "decoder");
         val var10: SerialDescriptor = this.getDescriptor();
         val var11: c = var1.c(var10);
         val var5: Boolean = var11.y();
         var var8: java.lang.String = null;
         var var2: Int;
         val var9: Int;
         var var13: Any;
         var var14: Int;
         if (var5) {
            val var6: java.lang.String = var11.t(var10, 0);
            var13 = n0.a;
            var9 = var11.v(var10, 1, n0.a, null) as Int;
            val var7: Int = var11.v(var10, 2, (DeserializationStrategy)var13, null) as Int;
            var13 = var11.v(var10, 3, b2.a, null) as java.lang.String;
            var2 = 15;
            var8 = var6;
            var14 = var7;
         } else {
            var var3: Boolean = true;
            var2 = 0;
            var var15: Int = null;
            var14 = null;
            var13 = null;

            while (var3) {
               val var4: Int = var11.x(var10);
               if (var4 != -1) {
                  if (var4 != 0) {
                     if (var4 != 1) {
                        if (var4 != 2) {
                           if (var4 != 3) {
                              throw new n(var4);
                           }

                           var13 = var11.v(var10, 3, b2.a, var13) as java.lang.String;
                           var2 |= 8;
                        } else {
                           var14 = var11.v(var10, 2, n0.a, var14) as Int;
                           var2 |= 4;
                        }
                     } else {
                        var15 = var11.v(var10, 1, n0.a, var15) as Int;
                        var2 |= 2;
                     }
                  } else {
                     var8 = var11.t(var10, 0);
                     var2 |= 1;
                  }
               } else {
                  var3 = false;
               }
            }

            var9 = var15;
         }

         var11.b(var10);
         return new CtaButton(var2, var8, var9, var14, (java.lang.String)var13, null);
      }

      public open fun serialize(encoder: Encoder, value: CtaButton) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.c(var3);
         CtaButton.write$Self$chat_release(var2, var4, var3);
         var4.b(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return fl.g0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<CtaButton> {
         return CtaButton.$serializer.INSTANCE;
      }
   }
}

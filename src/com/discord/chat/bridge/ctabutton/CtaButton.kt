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
      val var2: java.lang.String = this.text;
      val var1: Int = this.textColor;
      val var4: Int = this.backgroundColor;
      val var3: java.lang.String = this.callback;
      val var5: StringBuilder = new StringBuilder();
      var5.append("CtaButton(text=");
      var5.append(var2);
      var5.append(", textColor=");
      var5.append(var1);
      var5.append(", backgroundColor=");
      var5.append(var4);
      var5.append(", callback=");
      var5.append(var3);
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
         val var2: b2 = b2.a;
         val var1: n0 = n0.a;
         return new KSerializer[]{b2.a, a.u(n0.a), a.u(var1), a.u(var2)};
      }

      public open fun deserialize(decoder: Decoder): CtaButton {
         q.h(var1, "decoder");
         val var9: SerialDescriptor = this.getDescriptor();
         val var10: c = var1.c(var9);
         val var5: Boolean = var10.y();
         var var8: java.lang.String = null;
         var var2: Int;
         var var6: Int;
         var var7: Int;
         var var12: Any;
         if (var5) {
            var8 = var10.t(var9, 0);
            var12 = n0.a;
            var7 = var10.v(var9, 1, n0.a, null) as Int;
            var6 = var10.v(var9, 2, (DeserializationStrategy)var12, null) as Int;
            var12 = var10.v(var9, 3, b2.a, null) as java.lang.String;
            var2 = 15;
         } else {
            var var3: Boolean = true;
            var2 = 0;
            var7 = null;
            var6 = null;
            var12 = null;

            while (var3) {
               val var4: Int = var10.x(var9);
               if (var4 != -1) {
                  if (var4 != 0) {
                     if (var4 != 1) {
                        if (var4 != 2) {
                           if (var4 != 3) {
                              throw new n(var4);
                           }

                           var12 = var10.v(var9, 3, b2.a, var12) as java.lang.String;
                           var2 |= 8;
                        } else {
                           var6 = var10.v(var9, 2, n0.a, var6) as Int;
                           var2 |= 4;
                        }
                     } else {
                        var7 = var10.v(var9, 1, n0.a, var7) as Int;
                        var2 |= 2;
                     }
                  } else {
                     var8 = var10.t(var9, 0);
                     var2 |= 1;
                  }
               } else {
                  var3 = false;
               }
            }
         }

         var10.b(var9);
         return new CtaButton(var2, var8, var7, var6, (java.lang.String)var12, null);
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

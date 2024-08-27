package com.discord.chat.bridge.ctabutton

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
import xk.a2
import xk.f0
import xk.m0

@f
public data class CtaButton(text: String, textColor: Int? = null, backgroundColor: Int? = null, callback: String? = null) {
   public final val backgroundColor: Int?
   public final val callback: String?
   public final val text: String
   public final val textColor: Int?

   init {
      r.h(var1, "text");
      super();
      this.text = var1;
      this.textColor = var2;
      this.backgroundColor = var3;
      this.callback = var4;
   }

   @JvmStatic
   public fun `write$Self`(self: CtaButton, output: CompositeEncoder, serialDesc: SerialDescriptor) {
      r.h(var0, "self");
      r.h(var1, "output");
      r.h(var2, "serialDesc");
      var1.z(var2, 0, var0.text);
      var var3: Boolean;
      if (!var1.A(var2, 1) && var0.textColor == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 1, m0.a, var0.textColor);
      }

      if (!var1.A(var2, 2) && var0.backgroundColor == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 2, m0.a, var0.backgroundColor);
      }

      label32: {
         if (!var1.A(var2, 3)) {
            var3 = false;
            if (var0.callback == null) {
               break label32;
            }
         }

         var3 = true;
      }

      if (var3) {
         var1.m(var2, 3, a2.a, var0.callback);
      }
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
      r.h(var1, "text");
      return new CtaButton(var1, var2, var3, var4);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is CtaButton) {
         return false;
      } else {
         var1 = var1;
         if (!r.c(this.text, var1.text)) {
            return false;
         } else if (!r.c(this.textColor, var1.textColor)) {
            return false;
         } else if (!r.c(this.backgroundColor, var1.backgroundColor)) {
            return false;
         } else {
            return r.c(this.callback, var1.callback);
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
      val var5: java.lang.String = this.text;
      val var4: Int = this.textColor;
      val var1: Int = this.backgroundColor;
      val var2: java.lang.String = this.callback;
      val var3: StringBuilder = new StringBuilder();
      var3.append("CtaButton(text=");
      var3.append(var5);
      var3.append(", textColor=");
      var3.append(var4);
      var3.append(", backgroundColor=");
      var3.append(var1);
      var3.append(", callback=");
      var3.append(var2);
      var3.append(")");
      return var3.toString();
   }

   public object `$serializer` : f0<CtaButton> {
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
         val var2: a2 = a2.a;
         val var1: m0 = m0.a;
         return new KSerializer[]{a2.a, a.u(m0.a), a.u(var1), a.u(var2)};
      }

      public open fun deserialize(decoder: Decoder): CtaButton {
         r.h(var1, "decoder");
         val var9: SerialDescriptor = this.getDescriptor();
         val var10: c = var1.b(var9);
         val var5: Boolean = var10.p();
         var var8: java.lang.String = null;
         var var2: Int;
         var var6: Any;
         var var7: Any;
         var var12: Any;
         if (var5) {
            var8 = var10.m(var9, 0);
            var12 = m0.a;
            var7 = var10.n(var9, 1, m0.a, null);
            var6 = var10.n(var9, 2, (DeserializationStrategy)var12, null);
            var12 = var10.n(var9, 3, a2.a, null);
            var2 = 15;
         } else {
            var var3: Boolean = true;
            var2 = 0;
            var7 = null;
            var6 = null;
            var12 = null;

            while (var3) {
               val var4: Int = var10.o(var9);
               if (var4 != -1) {
                  if (var4 != 0) {
                     if (var4 != 1) {
                        if (var4 != 2) {
                           if (var4 != 3) {
                              throw new n(var4);
                           }

                           var12 = var10.n(var9, 3, a2.a, var12);
                           var2 |= 8;
                        } else {
                           var6 = var10.n(var9, 2, m0.a, var6);
                           var2 |= 4;
                        }
                     } else {
                        var7 = var10.n(var9, 1, m0.a, var7);
                        var2 |= 2;
                     }
                  } else {
                     var8 = var10.m(var9, 0);
                     var2 |= 1;
                  }
               } else {
                  var3 = false;
               }
            }
         }

         var10.c(var9);
         return new CtaButton(var2, var8, var7 as Integer, var6 as Integer, var12 as java.lang.String, null);
      }

      public open fun serialize(encoder: Encoder, value: CtaButton) {
         r.h(var1, "encoder");
         r.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         CtaButton.write$Self(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer<?>> {
         return xk.f0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<CtaButton> {
         return CtaButton.$serializer.INSTANCE;
      }
   }
}

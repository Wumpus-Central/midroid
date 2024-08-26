package com.discord.chat.bridge.forwarding

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
public data class ForwardFooterInfo(timestampLabel: String, originLabel: String, accessibilityLabel: String, originIconUrl: String? = null) {
   public final val accessibilityLabel: String
   public final val originIconUrl: String?
   public final val originLabel: String
   public final val timestampLabel: String

   init {
      r.h(var1, "timestampLabel");
      r.h(var2, "originLabel");
      r.h(var3, "accessibilityLabel");
      super();
      this.timestampLabel = var1;
      this.originLabel = var2;
      this.accessibilityLabel = var3;
      this.originIconUrl = var4;
   }

   @JvmStatic
   public fun `write$Self`(self: ForwardFooterInfo, output: CompositeEncoder, serialDesc: SerialDescriptor) {
      r.h(var0, "self");
      r.h(var1, "output");
      r.h(var2, "serialDesc");
      var var3: Boolean = false;
      var1.z(var2, 0, var0.timestampLabel);
      var1.z(var2, 1, var0.originLabel);
      var1.z(var2, 2, var0.accessibilityLabel);
      if (var1.A(var2, 3) || var0.originIconUrl != null) {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 3, a2.a, var0.originIconUrl);
      }
   }

   public operator fun component1(): String {
      return this.timestampLabel;
   }

   public operator fun component2(): String {
      return this.originLabel;
   }

   public operator fun component3(): String {
      return this.accessibilityLabel;
   }

   public operator fun component4(): String? {
      return this.originIconUrl;
   }

   public fun copy(
      timestampLabel: String = var0.timestampLabel,
      originLabel: String = var0.originLabel,
      accessibilityLabel: String = var0.accessibilityLabel,
      originIconUrl: String? = var0.originIconUrl
   ): ForwardFooterInfo {
      r.h(var1, "timestampLabel");
      r.h(var2, "originLabel");
      r.h(var3, "accessibilityLabel");
      return new ForwardFooterInfo(var1, var2, var3, var4);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is ForwardFooterInfo) {
         return false;
      } else {
         var1 = var1;
         if (!r.c(this.timestampLabel, var1.timestampLabel)) {
            return false;
         } else if (!r.c(this.originLabel, var1.originLabel)) {
            return false;
         } else if (!r.c(this.accessibilityLabel, var1.accessibilityLabel)) {
            return false;
         } else {
            return r.c(this.originIconUrl, var1.originIconUrl);
         }
      }
   }

   public override fun hashCode(): Int {
      val var2: Int = this.timestampLabel.hashCode();
      val var3: Int = this.originLabel.hashCode();
      val var4: Int = this.accessibilityLabel.hashCode();
      val var1: Int;
      if (this.originIconUrl == null) {
         var1 = 0;
      } else {
         var1 = this.originIconUrl.hashCode();
      }

      return ((var2 * 31 + var3) * 31 + var4) * 31 + var1;
   }

   public override fun toString(): String {
      val var4: java.lang.String = this.timestampLabel;
      val var2: java.lang.String = this.originLabel;
      val var1: java.lang.String = this.accessibilityLabel;
      val var5: java.lang.String = this.originIconUrl;
      val var3: StringBuilder = new StringBuilder();
      var3.append("ForwardFooterInfo(timestampLabel=");
      var3.append(var4);
      var3.append(", originLabel=");
      var3.append(var2);
      var3.append(", accessibilityLabel=");
      var3.append(var1);
      var3.append(", originIconUrl=");
      var3.append(var5);
      var3.append(")");
      return var3.toString();
   }

   public object `$serializer` : f0<ForwardFooterInfo> {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: ForwardFooterInfo.$serializer = new ForwardFooterInfo.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.bridge.forwarding.ForwardFooterInfo", var0, 4);
         var1.l("timestampLabel", false);
         var1.l("originLabel", false);
         var1.l("accessibilityLabel", false);
         var1.l("originIconUrl", true);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{a2.a, a2.a, a2.a, a.u(a2.a)};
      }

      public open fun deserialize(decoder: Decoder): ForwardFooterInfo {
         r.h(var1, "decoder");
         val var10: SerialDescriptor = this.getDescriptor();
         val var11: c = var1.b(var10);
         val var5: Boolean = var11.p();
         var var8: java.lang.String = null;
         var var2: Int;
         var var7: Any;
         val var9: java.lang.String;
         var var14: java.lang.String;
         if (var5) {
            var14 = var11.m(var10, 0);
            var9 = var11.m(var10, 1);
            val var12: java.lang.String = var11.m(var10, 2);
            var7 = var11.n(var10, 3, a2.a, null);
            var2 = 15;
            var8 = var14;
            var14 = var12;
         } else {
            var var3: Boolean = true;
            var2 = 0;
            var7 = null;
            var14 = null;
            var var13: Any = null;

            while (var3) {
               val var4: Int = var11.o(var10);
               if (var4 != -1) {
                  if (var4 != 0) {
                     if (var4 != 1) {
                        if (var4 != 2) {
                           if (var4 != 3) {
                              throw new n(var4);
                           }

                           var13 = var11.n(var10, 3, a2.a, var13);
                           var2 |= 8;
                        } else {
                           var14 = var11.m(var10, 2);
                           var2 |= 4;
                        }
                     } else {
                        var7 = var11.m(var10, 1);
                        var2 |= 2;
                     }
                  } else {
                     var8 = var11.m(var10, 0);
                     var2 |= 1;
                  }
               } else {
                  var3 = false;
               }
            }

            var9 = (java.lang.String)var7;
            var7 = var13;
         }

         var11.c(var10);
         return new ForwardFooterInfo(var2, var8, var9, var14, var7 as java.lang.String, null);
      }

      public open fun serialize(encoder: Encoder, value: ForwardFooterInfo) {
         r.h(var1, "encoder");
         r.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         ForwardFooterInfo.write$Self(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer<?>> {
         return xk.f0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<ForwardFooterInfo> {
         return ForwardFooterInfo.$serializer.INSTANCE;
      }
   }
}

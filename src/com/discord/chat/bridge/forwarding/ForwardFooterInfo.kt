package com.discord.chat.bridge.forwarding

import dn.f
import dn.n
import en.a
import gn.b2
import gn.g0
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor

@f
public data class ForwardFooterInfo(timestampLabel: String, originLabel: String, accessibilityLabel: String, originIconUrl: String? = null) {
   public final val accessibilityLabel: String
   public final val originIconUrl: String?
   public final val originLabel: String
   public final val timestampLabel: String

   init {
      q.h(var1, "timestampLabel");
      q.h(var2, "originLabel");
      q.h(var3, "accessibilityLabel");
      super();
      this.timestampLabel = var1;
      this.originLabel = var2;
      this.accessibilityLabel = var3;
      this.originIconUrl = var4;
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
      q.h(var1, "timestampLabel");
      q.h(var2, "originLabel");
      q.h(var3, "accessibilityLabel");
      return new ForwardFooterInfo(var1, var2, var3, var4);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is ForwardFooterInfo) {
         return false;
      } else {
         var1 = var1;
         if (!q.c(this.timestampLabel, var1.timestampLabel)) {
            return false;
         } else if (!q.c(this.originLabel, var1.originLabel)) {
            return false;
         } else if (!q.c(this.accessibilityLabel, var1.accessibilityLabel)) {
            return false;
         } else {
            return q.c(this.originIconUrl, var1.originIconUrl);
         }
      }
   }

   public override fun hashCode(): Int {
      val var2: Int = this.timestampLabel.hashCode();
      val var4: Int = this.originLabel.hashCode();
      val var3: Int = this.accessibilityLabel.hashCode();
      val var1: Int;
      if (this.originIconUrl == null) {
         var1 = 0;
      } else {
         var1 = this.originIconUrl.hashCode();
      }

      return ((var2 * 31 + var4) * 31 + var3) * 31 + var1;
   }

   public override fun toString(): String {
      val var5: java.lang.String = this.timestampLabel;
      val var1: java.lang.String = this.originLabel;
      val var3: java.lang.String = this.accessibilityLabel;
      val var2: java.lang.String = this.originIconUrl;
      val var4: StringBuilder = new StringBuilder();
      var4.append("ForwardFooterInfo(timestampLabel=");
      var4.append(var5);
      var4.append(", originLabel=");
      var4.append(var1);
      var4.append(", accessibilityLabel=");
      var4.append(var3);
      var4.append(", originIconUrl=");
      var4.append(var2);
      var4.append(")");
      return var4.toString();
   }

   public object `$serializer` : g0 {
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
         return new KSerializer[]{b2.a, b2.a, b2.a, a.u(b2.a)};
      }

      public open fun deserialize(decoder: Decoder): ForwardFooterInfo {
         q.h(var1, "decoder");
         val var10: SerialDescriptor = this.getDescriptor();
         val var11: c = var1.b(var10);
         val var5: Boolean = var11.p();
         var var8: java.lang.String = null;
         var var2: Int;
         val var9: java.lang.String;
         var var12: java.lang.String;
         var var13: java.lang.String;
         if (var5) {
            var13 = var11.m(var10, 0);
            var9 = var11.m(var10, 1);
            val var7: java.lang.String = var11.m(var10, 2);
            var12 = var11.n(var10, 3, b2.a, null) as java.lang.String;
            var2 = 15;
            var8 = var13;
            var13 = var7;
         } else {
            var var3: Boolean = true;
            var2 = 0;
            var var14: java.lang.String = null;
            var13 = null;
            var12 = null;

            while (var3) {
               val var4: Int = var11.o(var10);
               if (var4 != -1) {
                  if (var4 != 0) {
                     if (var4 != 1) {
                        if (var4 != 2) {
                           if (var4 != 3) {
                              throw new n(var4);
                           }

                           var12 = var11.n(var10, 3, b2.a, var12) as java.lang.String;
                           var2 |= 8;
                        } else {
                           var13 = var11.m(var10, 2);
                           var2 |= 4;
                        }
                     } else {
                        var14 = var11.m(var10, 1);
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

            var9 = var14;
         }

         var11.c(var10);
         return new ForwardFooterInfo(var2, var8, var9, var13, var12, null);
      }

      public open fun serialize(encoder: Encoder, value: ForwardFooterInfo) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         ForwardFooterInfo.write$Self$chat_release(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return gn.g0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<ForwardFooterInfo> {
         return ForwardFooterInfo.$serializer.INSTANCE;
      }
   }
}

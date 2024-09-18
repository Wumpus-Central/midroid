package com.discord.chat.bridge.forwarding

import bl.b2
import bl.g0
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
import yk.f
import yk.n
import zk.a

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
      val var4: java.lang.String = this.timestampLabel;
      val var5: java.lang.String = this.originLabel;
      val var2: java.lang.String = this.accessibilityLabel;
      val var3: java.lang.String = this.originIconUrl;
      val var1: StringBuilder = new StringBuilder();
      var1.append("ForwardFooterInfo(timestampLabel=");
      var1.append(var4);
      var1.append(", originLabel=");
      var1.append(var5);
      var1.append(", accessibilityLabel=");
      var1.append(var2);
      var1.append(", originIconUrl=");
      var1.append(var3);
      var1.append(")");
      return var1.toString();
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
         val var9: SerialDescriptor = this.getDescriptor();
         val var10: c = var1.c(var9);
         val var5: Boolean = var10.y();
         var var8: java.lang.String = null;
         var var2: Int;
         var var6: java.lang.String;
         var var7: java.lang.String;
         var var11: java.lang.String;
         if (var5) {
            var8 = var10.t(var9, 0);
            var7 = var10.t(var9, 1);
            var6 = var10.t(var9, 2);
            var11 = var10.v(var9, 3, b2.a, null) as java.lang.String;
            var2 = 15;
         } else {
            var var3: Boolean = true;
            var2 = 0;
            var7 = null;
            var6 = null;
            var11 = null;

            while (var3) {
               val var4: Int = var10.x(var9);
               if (var4 != -1) {
                  if (var4 != 0) {
                     if (var4 != 1) {
                        if (var4 != 2) {
                           if (var4 != 3) {
                              throw new n(var4);
                           }

                           var11 = var10.v(var9, 3, b2.a, var11) as java.lang.String;
                           var2 |= 8;
                        } else {
                           var6 = var10.t(var9, 2);
                           var2 |= 4;
                        }
                     } else {
                        var7 = var10.t(var9, 1);
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
         return new ForwardFooterInfo(var2, var8, var7, var6, var11, null);
      }

      public open fun serialize(encoder: Encoder, value: ForwardFooterInfo) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.c(var3);
         ForwardFooterInfo.write$Self$chat_release(var2, var4, var3);
         var4.b(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return bl.g0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<ForwardFooterInfo> {
         return ForwardFooterInfo.$serializer.INSTANCE;
      }
   }
}

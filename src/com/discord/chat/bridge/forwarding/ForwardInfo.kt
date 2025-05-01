package com.discord.chat.bridge.forwarding

import aa.f
import aa.n
import ba.a
import da.G
import da.N
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor

@f
public data class ForwardInfo(snapshotIndex: Int, footerInfo: ForwardFooterInfo? = null) {
   public final val footerInfo: ForwardFooterInfo?
   public final val snapshotIndex: Int

   init {
      super();
      this.snapshotIndex = var1;
      this.footerInfo = var2;
   }

   public operator fun component1(): Int {
      return this.snapshotIndex;
   }

   public operator fun component2(): ForwardFooterInfo? {
      return this.footerInfo;
   }

   public fun copy(snapshotIndex: Int = var0.snapshotIndex, footerInfo: ForwardFooterInfo? = var0.footerInfo): ForwardInfo {
      return new ForwardInfo(var1, var2);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is ForwardInfo) {
         return false;
      } else {
         var1 = var1;
         if (this.snapshotIndex != var1.snapshotIndex) {
            return false;
         } else {
            return q.c(this.footerInfo, var1.footerInfo);
         }
      }
   }

   public override fun hashCode(): Int {
      val var2: Int = Integer.hashCode(this.snapshotIndex);
      val var1: Int;
      if (this.footerInfo == null) {
         var1 = 0;
      } else {
         var1 = this.footerInfo.hashCode();
      }

      return var2 * 31 + var1;
   }

   public override fun toString(): String {
      val var1: Int = this.snapshotIndex;
      val var2: ForwardFooterInfo = this.footerInfo;
      val var3: StringBuilder = new StringBuilder();
      var3.append("ForwardInfo(snapshotIndex=");
      var3.append(var1);
      var3.append(", footerInfo=");
      var3.append(var2);
      var3.append(")");
      return var3.toString();
   }

   public object `$serializer` : G {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: ForwardInfo.$serializer = new ForwardInfo.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.bridge.forwarding.ForwardInfo", var0, 2);
         var1.l("snapshotIndex", false);
         var1.l("footerInfo", true);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{N.a, a.u(ForwardFooterInfo.$serializer.INSTANCE)};
      }

      public open fun deserialize(decoder: Decoder): ForwardInfo {
         q.h(var1, "decoder");
         val var6: SerialDescriptor = this.getDescriptor();
         val var7: c = var1.c(var6);
         var var2: Int;
         var var3: Int;
         var var8: ForwardFooterInfo;
         if (var7.y()) {
            var3 = var7.k(var6, 0);
            var8 = var7.v(var6, 1, ForwardFooterInfo.$serializer.INSTANCE, null) as ForwardFooterInfo;
            var2 = 3;
         } else {
            var var4: Boolean = true;
            var3 = 0;
            var2 = 0;
            var8 = null;

            while (var4) {
               val var5: Int = var7.x(var6);
               if (var5 != -1) {
                  if (var5 != 0) {
                     if (var5 != 1) {
                        throw new n(var5);
                     }

                     var8 = var7.v(var6, 1, ForwardFooterInfo.$serializer.INSTANCE, var8) as ForwardFooterInfo;
                     var2 |= 2;
                  } else {
                     var3 = var7.k(var6, 0);
                     var2 |= 1;
                  }
               } else {
                  var4 = false;
               }
            }
         }

         var7.b(var6);
         return new ForwardInfo(var2, var3, var8, null);
      }

      public open fun serialize(encoder: Encoder, value: ForwardInfo) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.c(var3);
         ForwardInfo.write$Self$chat_release(var2, var4, var3);
         var4.b(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return da.G.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<ForwardInfo> {
         return ForwardInfo.$serializer.INSTANCE;
      }
   }
}

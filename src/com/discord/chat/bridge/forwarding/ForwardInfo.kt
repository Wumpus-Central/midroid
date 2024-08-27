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
import xk.f0
import xk.h
import xk.m0

@f
public data class ForwardInfo(snapshotIndex: Int, footerInfo: ForwardFooterInfo? = null, useOldIcon: Boolean) {
   public final val footerInfo: ForwardFooterInfo?
   public final val snapshotIndex: Int
   public final val useOldIcon: Boolean

   init {
      super();
      this.snapshotIndex = var1;
      this.footerInfo = var2;
      this.useOldIcon = var3;
   }

   @JvmStatic
   public fun `write$Self`(self: ForwardInfo, output: CompositeEncoder, serialDesc: SerialDescriptor) {
      r.h(var0, "self");
      r.h(var1, "output");
      r.h(var2, "serialDesc");
      var var3: Boolean = false;
      var1.w(var2, 0, var0.snapshotIndex);
      if (var1.A(var2, 1) || var0.footerInfo != null) {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 1, ForwardFooterInfo.$serializer.INSTANCE, var0.footerInfo);
      }

      var1.x(var2, 2, var0.useOldIcon);
   }

   public operator fun component1(): Int {
      return this.snapshotIndex;
   }

   public operator fun component2(): ForwardFooterInfo? {
      return this.footerInfo;
   }

   public operator fun component3(): Boolean {
      return this.useOldIcon;
   }

   public fun copy(snapshotIndex: Int = var0.snapshotIndex, footerInfo: ForwardFooterInfo? = var0.footerInfo, useOldIcon: Boolean = var0.useOldIcon): ForwardInfo {
      return new ForwardInfo(var1, var2, var3);
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
         } else if (!r.c(this.footerInfo, var1.footerInfo)) {
            return false;
         } else {
            return this.useOldIcon == var1.useOldIcon;
         }
      }
   }

   public override fun hashCode(): Int {
      val var4: Int = Integer.hashCode(this.snapshotIndex);
      val var1: Int;
      if (this.footerInfo == null) {
         var1 = 0;
      } else {
         var1 = this.footerInfo.hashCode();
      }

      var var2: Byte = this.useOldIcon;
      if (this.useOldIcon != 0) {
         var2 = 1;
      }

      return (var4 * 31 + var1) * 31 + var2;
   }

   public override fun toString(): String {
      val var1: Int = this.snapshotIndex;
      val var4: ForwardFooterInfo = this.footerInfo;
      val var2: Boolean = this.useOldIcon;
      val var3: StringBuilder = new StringBuilder();
      var3.append("ForwardInfo(snapshotIndex=");
      var3.append(var1);
      var3.append(", footerInfo=");
      var3.append(var4);
      var3.append(", useOldIcon=");
      var3.append(var2);
      var3.append(")");
      return var3.toString();
   }

   public object `$serializer` : f0<ForwardInfo> {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: ForwardInfo.$serializer = new ForwardInfo.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.bridge.forwarding.ForwardInfo", var0, 3);
         var1.l("snapshotIndex", false);
         var1.l("footerInfo", true);
         var1.l("useOldIcon", false);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{m0.a, a.u(ForwardFooterInfo.$serializer.INSTANCE), h.a};
      }

      public open fun deserialize(decoder: Decoder): ForwardInfo {
         r.h(var1, "decoder");
         val var7: SerialDescriptor = this.getDescriptor();
         val var8: c = var1.b(var7);
         var var3: Int;
         var var4: Int;
         val var5: Int;
         var var9: Any;
         if (var8.p()) {
            val var2: Int = var8.i(var7, 0);
            var9 = var8.n(var7, 1, ForwardFooterInfo.$serializer.INSTANCE, null);
            var5 = var8.C(var7, 2);
            var3 = 7;
            var4 = var2;
         } else {
            var var12: Boolean = true;
            var4 = 0;
            var var10: Int = 0;
            var9 = null;
            var3 = 0;

            while (var12) {
               val var6: Int = var8.o(var7);
               if (var6 != -1) {
                  if (var6 != 0) {
                     if (var6 != 1) {
                        if (var6 != 2) {
                           throw new n(var6);
                        }

                        var3 = var8.C(var7, 2);
                        var10 |= 4;
                     } else {
                        var9 = var8.n(var7, 1, ForwardFooterInfo.$serializer.INSTANCE, var9);
                        var10 |= 2;
                     }
                  } else {
                     var4 = var8.i(var7, 0);
                     var10 |= 1;
                  }
               } else {
                  var12 = false;
               }
            }

            var5 = var3;
            var3 = var10;
         }

         var8.c(var7);
         return new ForwardInfo(var3, var4, var9 as ForwardFooterInfo, (boolean)var5, null);
      }

      public open fun serialize(encoder: Encoder, value: ForwardInfo) {
         r.h(var1, "encoder");
         r.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         ForwardInfo.write$Self(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer<?>> {
         return xk.f0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<ForwardInfo> {
         return ForwardInfo.$serializer.INSTANCE;
      }
   }
}

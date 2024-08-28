package com.discord.chat.bridge.forwarding

import dn.f
import dn.n
import en.a
import gn.g0
import gn.h
import gn.n0
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor

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
         } else if (!q.c(this.footerInfo, var1.footerInfo)) {
            return false;
         } else {
            return this.useOldIcon == var1.useOldIcon;
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

      return (var2 * 31 + var1) * 31 + java.lang.Boolean.hashCode(this.useOldIcon);
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

   public object `$serializer` : g0 {
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
         return new KSerializer[]{n0.a, a.u(ForwardFooterInfo.$serializer.INSTANCE), h.a};
      }

      public open fun deserialize(decoder: Decoder): ForwardInfo {
         q.h(var1, "decoder");
         val var7: SerialDescriptor = this.getDescriptor();
         val var8: c = var1.b(var7);
         var var2: Int;
         var var3: Int;
         var var4: Int;
         var var9: ForwardFooterInfo;
         if (var8.p()) {
            var4 = var8.i(var7, 0);
            var9 = var8.n(var7, 1, ForwardFooterInfo.$serializer.INSTANCE, null) as ForwardFooterInfo;
            var2 = var8.C(var7, 2);
            var3 = 7;
         } else {
            var var5: Boolean = true;
            var4 = 0;
            var2 = 0;
            var9 = null;
            var3 = 0;

            while (var5) {
               val var6: Int = var8.o(var7);
               if (var6 != -1) {
                  if (var6 != 0) {
                     if (var6 != 1) {
                        if (var6 != 2) {
                           throw new n(var6);
                        }

                        var3 = var8.C(var7, 2);
                        var2 |= 4;
                     } else {
                        var9 = var8.n(var7, 1, ForwardFooterInfo.$serializer.INSTANCE, var9) as ForwardFooterInfo;
                        var2 |= 2;
                     }
                  } else {
                     var4 = var8.i(var7, 0);
                     var2 |= 1;
                  }
               } else {
                  var5 = false;
               }
            }

            var3 = var2;
            var2 = var3;
         }

         var8.c(var7);
         return new ForwardInfo(var3, var4, var9, (boolean)var2, null);
      }

      public open fun serialize(encoder: Encoder, value: ForwardInfo) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         ForwardInfo.write$Self$chat_release(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return gn.g0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<ForwardInfo> {
         return ForwardInfo.$serializer.INSTANCE;
      }
   }
}

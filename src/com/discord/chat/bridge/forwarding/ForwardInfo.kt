package com.discord.chat.bridge.forwarding

import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import mb.f

@f
public data class ForwardInfo(snapshotIndex: Int, footerInfo: ForwardFooterInfo? = null) {
   public final val snapshotIndex: Int
   public final val footerInfo: ForwardFooterInfo?

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
      val var3: ForwardFooterInfo = this.footerInfo;
      val var2: StringBuilder = new StringBuilder();
      var2.append("ForwardInfo(snapshotIndex=");
      var2.append(var1);
      var2.append(", footerInfo=");
      var2.append(var3);
      var2.append(")");
      return var2.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<ForwardInfo> {
         return ForwardInfo.$serializer.INSTANCE;
      }
   }
}

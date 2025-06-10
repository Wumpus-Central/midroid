package com.discord.chat.bridge.forwarding

import Xa.f
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer

@f
public data class ForwardFooterInfo(timestampLabel: String, originLabel: String, accessibilityLabel: String, originIconUrl: String? = null) {
   public final val timestampLabel: String
   public final val originLabel: String
   public final val accessibilityLabel: String
   public final val originIconUrl: String?

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
      val var1: java.lang.String = this.timestampLabel;
      val var2: java.lang.String = this.originLabel;
      val var5: java.lang.String = this.accessibilityLabel;
      val var3: java.lang.String = this.originIconUrl;
      val var4: StringBuilder = new StringBuilder();
      var4.append("ForwardFooterInfo(timestampLabel=");
      var4.append(var1);
      var4.append(", originLabel=");
      var4.append(var2);
      var4.append(", accessibilityLabel=");
      var4.append(var5);
      var4.append(", originIconUrl=");
      var4.append(var3);
      var4.append(")");
      return var4.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<ForwardFooterInfo> {
         return ForwardFooterInfo.$serializer.INSTANCE;
      }
   }
}

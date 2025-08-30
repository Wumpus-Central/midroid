package com.discord.chat.bridge.forwarding

import kotlinx.serialization.KSerializer
import nb.g

@g
public data class ForwardFooterInfo(timestampLabel: String, originLabel: String, accessibilityLabel: String, originIconUrl: String? = null) {
   public final val timestampLabel: String
   public final val originLabel: String
   public final val accessibilityLabel: String
   public final val originIconUrl: String?

   init {
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
      return new ForwardFooterInfo(var1, var2, var3, var4);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is ForwardFooterInfo) {
         return false;
      } else {
         var1 = var1;
         if (!(this.timestampLabel == var1.timestampLabel)) {
            return false;
         } else if (!(this.originLabel == var1.originLabel)) {
            return false;
         } else if (!(this.accessibilityLabel == var1.accessibilityLabel)) {
            return false;
         } else {
            return this.originIconUrl == var1.originIconUrl;
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
      val var4: java.lang.String = this.originLabel;
      val var1: java.lang.String = this.accessibilityLabel;
      val var3: java.lang.String = this.originIconUrl;
      val var2: StringBuilder = new StringBuilder();
      var2.append("ForwardFooterInfo(timestampLabel=");
      var2.append(var5);
      var2.append(", originLabel=");
      var2.append(var4);
      var2.append(", accessibilityLabel=");
      var2.append(var1);
      var2.append(", originIconUrl=");
      var2.append(var3);
      var2.append(")");
      return var2.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<ForwardFooterInfo> {
         return ForwardFooterInfo.$serializer.INSTANCE;
      }
   }
}

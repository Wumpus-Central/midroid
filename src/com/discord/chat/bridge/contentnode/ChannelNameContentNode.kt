package com.discord.chat.bridge.contentnode

import com.discord.chat.bridge.ChannelType
import kotlin.jvm.internal.r
import kotlinx.serialization.KSerializer
import sb.f

@f
public data class ChannelNameContentNode(channelType: ChannelType? = null, iconType: String, icon: String? = null, content: List<ContentNode>) : ContentNode {
   public final val channelType: ChannelType?
   public final val iconType: String
   public final val icon: String?
   public final val content: List<ContentNode>

   init {
      r.h(var2, "iconType");
      r.h(var4, "content");
      super(null);
      this.channelType = var1;
      this.iconType = var2;
      this.icon = var3;
      this.content = var4;
   }

   public operator fun component1(): ChannelType? {
      return this.channelType;
   }

   public operator fun component2(): String {
      return this.iconType;
   }

   public operator fun component3(): String? {
      return this.icon;
   }

   public operator fun component4(): List<ContentNode> {
      return this.content;
   }

   public fun copy(
      channelType: ChannelType? = var0.channelType,
      iconType: String = var0.iconType,
      icon: String? = var0.icon,
      content: List<ContentNode> = var0.content
   ): ChannelNameContentNode {
      r.h(var2, "iconType");
      r.h(var4, "content");
      return new ChannelNameContentNode(var1, var2, var3, var4);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is ChannelNameContentNode) {
         return false;
      } else {
         var1 = var1;
         if (this.channelType != var1.channelType) {
            return false;
         } else if (!r.c(this.iconType, var1.iconType)) {
            return false;
         } else if (!r.c(this.icon, var1.icon)) {
            return false;
         } else {
            return r.c(this.content, var1.content);
         }
      }
   }

   public override fun hashCode(): Int {
      var var2: Int = 0;
      val var1: Int;
      if (this.channelType == null) {
         var1 = 0;
      } else {
         var1 = this.channelType.hashCode();
      }

      val var3: Int = this.iconType.hashCode();
      if (this.icon != null) {
         var2 = this.icon.hashCode();
      }

      return ((var1 * 31 + var3) * 31 + var2) * 31 + this.content.hashCode();
   }

   public override fun toString(): String {
      val var5: ChannelType = this.channelType;
      val var2: java.lang.String = this.iconType;
      val var1: java.lang.String = this.icon;
      val var3: java.util.List = this.content;
      val var4: StringBuilder = new StringBuilder();
      var4.append("ChannelNameContentNode(channelType=");
      var4.append(var5);
      var4.append(", iconType=");
      var4.append(var2);
      var4.append(", icon=");
      var4.append(var1);
      var4.append(", content=");
      var4.append(var3);
      var4.append(")");
      return var4.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<ChannelNameContentNode> {
         return ChannelNameContentNode.$serializer.INSTANCE;
      }
   }
}

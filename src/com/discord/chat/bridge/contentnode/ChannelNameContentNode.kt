package com.discord.chat.bridge.contentnode

import com.discord.chat.bridge.ChannelType
import kotlinx.serialization.KSerializer
import nb.g

@g
public data class ChannelNameContentNode(channelType: ChannelType? = null, iconType: String, icon: String? = null, content: List<ContentNode>) : ContentNode() {
   public final val channelType: ChannelType?
   public final val iconType: String
   public final val icon: String?
   public final val content: List<ContentNode>

   init {
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
         } else if (!(this.iconType == var1.iconType)) {
            return false;
         } else if (!(this.icon == var1.icon)) {
            return false;
         } else {
            return this.content == var1.content;
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
      val var3: ChannelType = this.channelType;
      val var1: java.lang.String = this.iconType;
      val var5: java.lang.String = this.icon;
      val var4: java.util.List = this.content;
      val var2: StringBuilder = new StringBuilder();
      var2.append("ChannelNameContentNode(channelType=");
      var2.append(var3);
      var2.append(", iconType=");
      var2.append(var1);
      var2.append(", icon=");
      var2.append(var5);
      var2.append(", content=");
      var2.append(var4);
      var2.append(")");
      return var2.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<ChannelNameContentNode> {
         return ChannelNameContentNode.$serializer.INSTANCE;
      }
   }
}

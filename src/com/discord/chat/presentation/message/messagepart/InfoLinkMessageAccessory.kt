package com.discord.chat.presentation.message.messagepart

import com.discord.primitives.ChannelId
import com.discord.primitives.MessageId
import com.discord.react_asset_fetcher.ReactAsset
import kotlin.jvm.internal.q

public data class InfoLinkMessageAccessory(messageId: MessageId, channelId: ChannelId, attachmentId: String?, embedId: String?, text: String, icon: ReactAsset) : InfoLinkMessageAccessory(
      var1, var2, var4, var5, var6, var7
   ) {
   public final val attachmentId: String?
   public final val channelId: ChannelId
   public final val embedId: String?
   public final val icon: ReactAsset
   public open val messageId: MessageId
   public final val text: String

   fun InfoLinkMessageAccessory(var1: java.lang.String, var2: Long, var4: java.lang.String, var5: java.lang.String, var6: java.lang.String, var7: ReactAsset) {
      q.h(var1, "messageId");
      q.h(var6, "text");
      q.h(var7, "icon");
      val var8: StringBuilder = new StringBuilder();
      var8.append("info link ");
      var8.append(var4);
      super(var1, var8.toString(), false, 4, null);
      this.messageId = var1;
      this.channelId = var2;
      this.attachmentId = var4;
      this.embedId = var5;
      this.text = var6;
      this.icon = var7;
   }

   public operator fun component1(): MessageId {
      return this.messageId;
   }

   public operator fun component2(): ChannelId {
      return this.channelId;
   }

   public operator fun component3(): String? {
      return this.attachmentId;
   }

   public operator fun component4(): String? {
      return this.embedId;
   }

   public operator fun component5(): String {
      return this.text;
   }

   public operator fun component6(): ReactAsset {
      return this.icon;
   }

   public fun copy(
      messageId: MessageId = ...,
      channelId: ChannelId = ...,
      attachmentId: String? = ...,
      embedId: String? = ...,
      text: String = ...,
      icon: ReactAsset = ...
   ): InfoLinkMessageAccessory {
      q.h(var1, "messageId");
      q.h(var6, "text");
      q.h(var7, "icon");
      return new InfoLinkMessageAccessory(var1, var2, var4, var5, var6, var7, null);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is InfoLinkMessageAccessory) {
         return false;
      } else {
         var1 = var1;
         if (!MessageId.equals-impl0(this.messageId, var1.messageId)) {
            return false;
         } else if (!ChannelId.equals-impl0(this.channelId, var1.channelId)) {
            return false;
         } else if (!q.c(this.attachmentId, var1.attachmentId)) {
            return false;
         } else if (!q.c(this.embedId, var1.embedId)) {
            return false;
         } else if (!q.c(this.text, var1.text)) {
            return false;
         } else {
            return this.icon === var1.icon;
         }
      }
   }

   public override fun hashCode(): Int {
      val var4: Int = MessageId.hashCode-impl(this.messageId);
      val var3: Int = ChannelId.hashCode-impl(this.channelId);
      var var2: Int = 0;
      val var1: Int;
      if (this.attachmentId == null) {
         var1 = 0;
      } else {
         var1 = this.attachmentId.hashCode();
      }

      if (this.embedId != null) {
         var2 = this.embedId.hashCode();
      }

      return ((((var4 * 31 + var3) * 31 + var1) * 31 + var2) * 31 + this.text.hashCode()) * 31 + this.icon.hashCode();
   }

   public override fun toString(): String {
      val var7: java.lang.String = MessageId.toString-impl(this.messageId);
      val var2: java.lang.String = ChannelId.toString-impl(this.channelId);
      val var1: java.lang.String = this.attachmentId;
      val var3: java.lang.String = this.embedId;
      val var4: java.lang.String = this.text;
      val var6: ReactAsset = this.icon;
      val var5: StringBuilder = new StringBuilder();
      var5.append("InfoLinkMessageAccessory(messageId=");
      var5.append(var7);
      var5.append(", channelId=");
      var5.append(var2);
      var5.append(", attachmentId=");
      var5.append(var1);
      var5.append(", embedId=");
      var5.append(var3);
      var5.append(", text=");
      var5.append(var4);
      var5.append(", icon=");
      var5.append(var6);
      var5.append(")");
      return var5.toString();
   }
}

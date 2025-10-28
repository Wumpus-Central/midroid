package com.discord.chat.presentation.message.messagepart

import android.view.View.OnLongClickListener
import com.discord.chat.bridge.embed.Embed
import com.discord.chat.bridge.spoiler.SpoilerAttributes
import com.discord.chat.presentation.media.PortalUiModel
import com.discord.primitives.ChannelId
import com.discord.primitives.MessageId

public data class EmbedMessageAccessory(messageId: MessageId,
      index: Int,
      channelId: ChannelId,
      constrainedWidth: Int,
      radiusPx: Int,
      embed: Embed,
      shouldAutoPlayGifs: Boolean,
      shouldAnimateEmoji: Boolean,
      shouldShowLinkDecorations: Boolean,
      shouldShowRoleDot: Boolean,
      shouldShowRoleOnName: Boolean,
      spoilerAttributes: SpoilerAttributes?,
      onLongClick: OnLongClickListener?,
      isForwardedContent: Boolean
   ) : EmbedMessageAccessory(var1, var2, var3, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15),
   PortalUiModel {
   public open val messageId: MessageId
   public open val index: Int
   public final val channelId: ChannelId
   public final val constrainedWidth: Int
   public final val radiusPx: Int
   public final val embed: Embed
   public final val shouldAutoPlayGifs: Boolean
   public final val shouldAnimateEmoji: Boolean
   public final val shouldShowLinkDecorations: Boolean
   public final val shouldShowRoleDot: Boolean
   public final val shouldShowRoleOnName: Boolean
   public final val spoilerAttributes: SpoilerAttributes?
   public final val onLongClick: OnLongClickListener?
   public final val isForwardedContent: Boolean

   fun EmbedMessageAccessory(
      var1: java.lang.String,
      var2: Int,
      var3: Long,
      var5: Int,
      var6: Int,
      var7: Embed,
      var8: Boolean,
      var9: Boolean,
      var10: Boolean,
      var11: Boolean,
      var12: Boolean,
      var13: SpoilerAttributes,
      var14: OnLongClickListener,
      var15: Boolean
   ) {
      val var16: StringBuilder = new StringBuilder();
      var16.append("embed ");
      var16.append(var2);
      super(var1, var16.toString(), false, 4, null);
      this.messageId = var1;
      this.index = var2;
      this.channelId = var3;
      this.constrainedWidth = var5;
      this.radiusPx = var6;
      this.embed = var7;
      this.shouldAutoPlayGifs = var8;
      this.shouldAnimateEmoji = var9;
      this.shouldShowLinkDecorations = var10;
      this.shouldShowRoleDot = var11;
      this.shouldShowRoleOnName = var12;
      this.spoilerAttributes = var13;
      this.onLongClick = var14;
      this.isForwardedContent = var15;
   }

   public operator fun component1(): MessageId {
      return this.messageId;
   }

   public operator fun component10(): Boolean {
      return this.shouldShowRoleDot;
   }

   public operator fun component11(): Boolean {
      return this.shouldShowRoleOnName;
   }

   public operator fun component12(): SpoilerAttributes? {
      return this.spoilerAttributes;
   }

   public operator fun component13(): OnLongClickListener? {
      return this.onLongClick;
   }

   public operator fun component14(): Boolean {
      return this.isForwardedContent;
   }

   public operator fun component2(): Int {
      return this.index;
   }

   public operator fun component3(): ChannelId {
      return this.channelId;
   }

   public operator fun component4(): Int {
      return this.constrainedWidth;
   }

   public operator fun component5(): Int {
      return this.radiusPx;
   }

   public operator fun component6(): Embed {
      return this.embed;
   }

   public operator fun component7(): Boolean {
      return this.shouldAutoPlayGifs;
   }

   public operator fun component8(): Boolean {
      return this.shouldAnimateEmoji;
   }

   public operator fun component9(): Boolean {
      return this.shouldShowLinkDecorations;
   }

   public fun copy(
      messageId: MessageId = ...,
      index: Int = ...,
      channelId: ChannelId = ...,
      constrainedWidth: Int = ...,
      radiusPx: Int = ...,
      embed: Embed = ...,
      shouldAutoPlayGifs: Boolean = ...,
      shouldAnimateEmoji: Boolean = ...,
      shouldShowLinkDecorations: Boolean = ...,
      shouldShowRoleDot: Boolean = ...,
      shouldShowRoleOnName: Boolean = ...,
      spoilerAttributes: SpoilerAttributes? = ...,
      onLongClick: OnLongClickListener? = ...,
      isForwardedContent: Boolean = ...
   ): EmbedMessageAccessory {
      return new EmbedMessageAccessory(var1, var2, var3, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15, null);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is EmbedMessageAccessory) {
         return false;
      } else {
         var1 = var1;
         if (!MessageId.equals-impl0(this.messageId, var1.messageId)) {
            return false;
         } else if (this.index != var1.index) {
            return false;
         } else if (!ChannelId.equals-impl0(this.channelId, var1.channelId)) {
            return false;
         } else if (this.constrainedWidth != var1.constrainedWidth) {
            return false;
         } else if (this.radiusPx != var1.radiusPx) {
            return false;
         } else if (!(this.embed == var1.embed)) {
            return false;
         } else if (this.shouldAutoPlayGifs != var1.shouldAutoPlayGifs) {
            return false;
         } else if (this.shouldAnimateEmoji != var1.shouldAnimateEmoji) {
            return false;
         } else if (this.shouldShowLinkDecorations != var1.shouldShowLinkDecorations) {
            return false;
         } else if (this.shouldShowRoleDot != var1.shouldShowRoleDot) {
            return false;
         } else if (this.shouldShowRoleOnName != var1.shouldShowRoleOnName) {
            return false;
         } else if (!(this.spoilerAttributes == var1.spoilerAttributes)) {
            return false;
         } else if (!(this.onLongClick == var1.onLongClick)) {
            return false;
         } else {
            return this.isForwardedContent == var1.isForwardedContent;
         }
      }
   }

   override fun getPortal(): Double {
      return PortalUiModel.DefaultImpls.getPortal(this);
   }

   public override fun hashCode(): Int {
      val var12: Int = MessageId.hashCode-impl(this.messageId);
      val var10: Int = Integer.hashCode(this.index);
      val var11: Int = ChannelId.hashCode-impl(this.channelId);
      val var3: Int = Integer.hashCode(this.constrainedWidth);
      val var4: Int = Integer.hashCode(this.radiusPx);
      val var9: Int = this.embed.hashCode();
      val var5: Int = java.lang.Boolean.hashCode(this.shouldAutoPlayGifs);
      val var13: Int = java.lang.Boolean.hashCode(this.shouldAnimateEmoji);
      val var8: Int = java.lang.Boolean.hashCode(this.shouldShowLinkDecorations);
      val var6: Int = java.lang.Boolean.hashCode(this.shouldShowRoleDot);
      val var7: Int = java.lang.Boolean.hashCode(this.shouldShowRoleOnName);
      var var2: Int = 0;
      val var1: Int;
      if (this.spoilerAttributes == null) {
         var1 = 0;
      } else {
         var1 = this.spoilerAttributes.hashCode();
      }

      if (this.onLongClick != null) {
         var2 = this.onLongClick.hashCode();
      }

      return (
               (
                        (
                                 (
                                          (
                                                   (((((((var12 * 31 + var10) * 31 + var11) * 31 + var3) * 31 + var4) * 31 + var9) * 31 + var5) * 31 + var13)
                                                         * 31
                                                      + var8
                                                )
                                                * 31
                                             + var6
                                       )
                                       * 31
                                    + var7
                              )
                              * 31
                           + var1
                     )
                     * 31
                  + var2
            )
            * 31
         + java.lang.Boolean.hashCode(this.isForwardedContent);
   }

   public override fun toString(): String {
      val var10: java.lang.String = MessageId.toString-impl(this.messageId);
      val var2: Int = this.index;
      val var12: java.lang.String = ChannelId.toString-impl(this.channelId);
      val var3: Int = this.constrainedWidth;
      val var1: Int = this.radiusPx;
      val var13: Embed = this.embed;
      val var5: Boolean = this.shouldAutoPlayGifs;
      val var8: Boolean = this.shouldAnimateEmoji;
      val var4: Boolean = this.shouldShowLinkDecorations;
      val var6: Boolean = this.shouldShowRoleDot;
      val var9: Boolean = this.shouldShowRoleOnName;
      val var15: SpoilerAttributes = this.spoilerAttributes;
      val var14: OnLongClickListener = this.onLongClick;
      val var7: Boolean = this.isForwardedContent;
      val var11: StringBuilder = new StringBuilder();
      var11.append("EmbedMessageAccessory(messageId=");
      var11.append(var10);
      var11.append(", index=");
      var11.append(var2);
      var11.append(", channelId=");
      var11.append(var12);
      var11.append(", constrainedWidth=");
      var11.append(var3);
      var11.append(", radiusPx=");
      var11.append(var1);
      var11.append(", embed=");
      var11.append(var13);
      var11.append(", shouldAutoPlayGifs=");
      var11.append(var5);
      var11.append(", shouldAnimateEmoji=");
      var11.append(var8);
      var11.append(", shouldShowLinkDecorations=");
      var11.append(var4);
      var11.append(", shouldShowRoleDot=");
      var11.append(var6);
      var11.append(", shouldShowRoleOnName=");
      var11.append(var9);
      var11.append(", spoilerAttributes=");
      var11.append(var15);
      var11.append(", onLongClick=");
      var11.append(var14);
      var11.append(", isForwardedContent=");
      var11.append(var7);
      var11.append(")");
      return var11.toString();
   }
}

package com.discord.chat.presentation.message.messagepart

import android.view.View.OnLongClickListener
import com.discord.chat.bridge.embed.Embed
import com.discord.chat.bridge.spoiler.SpoilerAttributes
import com.discord.chat.presentation.media.PortalUiModel
import com.discord.primitives.ChannelId
import com.discord.primitives.MessageId
import kotlin.jvm.internal.r

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
      isForwardedContent: Boolean,
      isShowingInlineForward: Boolean,
      useOldForwardIcon: Boolean
   ) : EmbedMessageAccessory(var1, var2, var3, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17),
   PortalUiModel {
   public final val channelId: ChannelId
   public final val constrainedWidth: Int
   public final val embed: Embed
   public open val index: Int
   public final val isForwardedContent: Boolean
   public final val isShowingInlineForward: Boolean
   public open val messageId: MessageId
   public final val onLongClick: OnLongClickListener?
   public final val radiusPx: Int
   public final val shouldAnimateEmoji: Boolean
   public final val shouldAutoPlayGifs: Boolean
   public final val shouldShowLinkDecorations: Boolean
   public final val shouldShowRoleDot: Boolean
   public final val shouldShowRoleOnName: Boolean
   public final val spoilerAttributes: SpoilerAttributes?
   public final val useOldForwardIcon: Boolean

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
      var15: Boolean,
      var16: Boolean,
      var17: Boolean
   ) {
      val var18: StringBuilder = new StringBuilder();
      var18.append("embed ");
      var18.append(var2);
      super(var1, var18.toString(), false, 4, null);
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
      this.isShowingInlineForward = var16;
      this.useOldForwardIcon = var17;
   }

   public operator fun component1(): MessageId {
      return this.getMessageId-3Eiw7ao();
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

   public operator fun component15(): Boolean {
      return this.isShowingInlineForward;
   }

   public operator fun component16(): Boolean {
      return this.useOldForwardIcon;
   }

   public operator fun component2(): Int {
      return this.getIndex();
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
      isForwardedContent: Boolean = ...,
      isShowingInlineForward: Boolean = ...,
      useOldForwardIcon: Boolean = ...
   ): EmbedMessageAccessory {
      r.h(var1, "messageId");
      r.h(var7, "embed");
      return new EmbedMessageAccessory(var1, var2, var3, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, null);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is EmbedMessageAccessory) {
         return false;
      } else {
         var1 = var1;
         if (!MessageId.equals-impl0(this.getMessageId-3Eiw7ao(), var1.getMessageId-3Eiw7ao())) {
            return false;
         } else if (this.getIndex() != var1.getIndex()) {
            return false;
         } else if (!ChannelId.equals-impl0(this.channelId, var1.channelId)) {
            return false;
         } else if (this.constrainedWidth != var1.constrainedWidth) {
            return false;
         } else if (this.radiusPx != var1.radiusPx) {
            return false;
         } else if (!r.c(this.embed, var1.embed)) {
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
         } else if (!r.c(this.spoilerAttributes, var1.spoilerAttributes)) {
            return false;
         } else if (!r.c(this.onLongClick, var1.onLongClick)) {
            return false;
         } else if (this.isForwardedContent != var1.isForwardedContent) {
            return false;
         } else if (this.isShowingInlineForward != var1.isShowingInlineForward) {
            return false;
         } else {
            return this.useOldForwardIcon == var1.useOldForwardIcon;
         }
      }
   }

   override fun getPortal(): Double {
      return PortalUiModel.DefaultImpls.getPortal(this);
   }

   public override fun hashCode(): Int {
      val var16: Int = MessageId.hashCode-impl(this.getMessageId-3Eiw7ao());
      val var15: Int = Integer.hashCode(this.getIndex());
      val var12: Int = ChannelId.hashCode-impl(this.channelId);
      val var17: Int = Integer.hashCode(this.constrainedWidth);
      val var13: Int = Integer.hashCode(this.radiusPx);
      val var14: Int = this.embed.hashCode();
      var var10: Byte = 1;
      var var1: Byte = this.shouldAutoPlayGifs;
      if (this.shouldAutoPlayGifs != 0) {
         var1 = 1;
      }

      var var19: Byte = this.shouldAnimateEmoji;
      if (this.shouldAnimateEmoji != 0) {
         var19 = 1;
      }

      var var20: Byte = this.shouldShowLinkDecorations;
      if (this.shouldShowLinkDecorations != 0) {
         var20 = 1;
      }

      var var21: Byte = this.shouldShowRoleDot;
      if (this.shouldShowRoleDot != 0) {
         var21 = 1;
      }

      var var22: Byte = this.shouldShowRoleOnName;
      if (this.shouldShowRoleOnName != 0) {
         var22 = 1;
      }

      var var7: Int = 0;
      val var23: Int;
      if (this.spoilerAttributes == null) {
         var23 = 0;
      } else {
         var23 = this.spoilerAttributes.hashCode();
      }

      if (this.onLongClick != null) {
         var7 = this.onLongClick.hashCode();
      }

      var var8: Byte = this.isForwardedContent;
      if (this.isForwardedContent != 0) {
         var8 = 1;
      }

      var var24: Byte = this.isShowingInlineForward;
      if (this.isShowingInlineForward != 0) {
         var24 = 1;
      }

      if (this.useOldForwardIcon == 0) {
         var10 = this.useOldForwardIcon;
      }

      return (
               (
                        (
                                 (
                                          (
                                                   (
                                                            (
                                                                     (
                                                                              (
                                                                                       (
                                                                                                (
                                                                                                         (((var16 * 31 + var15) * 31 + var12) * 31 + var17)
                                                                                                               * 31
                                                                                                            + var13
                                                                                                      )
                                                                                                      * 31
                                                                                                   + var14
                                                                                             )
                                                                                             * 31
                                                                                          + var1
                                                                                    )
                                                                                    * 31
                                                                                 + var19
                                                                           )
                                                                           * 31
                                                                        + var20
                                                                  )
                                                                  * 31
                                                               + var21
                                                         )
                                                         * 31
                                                      + var22
                                                )
                                                * 31
                                             + var23
                                       )
                                       * 31
                                    + var7
                              )
                              * 31
                           + var8
                     )
                     * 31
                  + var24
            )
            * 31
         + var10;
   }

   public override fun toString(): String {
      val var17: java.lang.String = MessageId.toString-impl(this.getMessageId-3Eiw7ao());
      val var1: Int = this.getIndex();
      val var12: java.lang.String = ChannelId.toString-impl(this.channelId);
      val var3: Int = this.constrainedWidth;
      val var2: Int = this.radiusPx;
      val var13: Embed = this.embed;
      val var5: Boolean = this.shouldAutoPlayGifs;
      val var11: Boolean = this.shouldAnimateEmoji;
      val var8: Boolean = this.shouldShowLinkDecorations;
      val var7: Boolean = this.shouldShowRoleDot;
      val var6: Boolean = this.shouldShowRoleOnName;
      val var15: SpoilerAttributes = this.spoilerAttributes;
      val var14: OnLongClickListener = this.onLongClick;
      val var9: Boolean = this.isForwardedContent;
      val var4: Boolean = this.isShowingInlineForward;
      val var10: Boolean = this.useOldForwardIcon;
      val var16: StringBuilder = new StringBuilder();
      var16.append("EmbedMessageAccessory(messageId=");
      var16.append(var17);
      var16.append(", index=");
      var16.append(var1);
      var16.append(", channelId=");
      var16.append(var12);
      var16.append(", constrainedWidth=");
      var16.append(var3);
      var16.append(", radiusPx=");
      var16.append(var2);
      var16.append(", embed=");
      var16.append(var13);
      var16.append(", shouldAutoPlayGifs=");
      var16.append(var5);
      var16.append(", shouldAnimateEmoji=");
      var16.append(var11);
      var16.append(", shouldShowLinkDecorations=");
      var16.append(var8);
      var16.append(", shouldShowRoleDot=");
      var16.append(var7);
      var16.append(", shouldShowRoleOnName=");
      var16.append(var6);
      var16.append(", spoilerAttributes=");
      var16.append(var15);
      var16.append(", onLongClick=");
      var16.append(var14);
      var16.append(", isForwardedContent=");
      var16.append(var9);
      var16.append(", isShowingInlineForward=");
      var16.append(var4);
      var16.append(", useOldForwardIcon=");
      var16.append(var10);
      var16.append(")");
      return var16.toString();
   }
}

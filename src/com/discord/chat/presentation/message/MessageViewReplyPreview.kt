package com.discord.chat.presentation.message

import android.content.Context
import android.graphics.Rect
import android.graphics.Paint.FontMetrics
import android.os.Bundle
import android.text.SpannableStringBuilder
import android.text.TextPaint
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.view.View.MeasureSpec
import android.view.View.OnLayoutChangeListener
import android.view.ViewGroup.MarginLayoutParams
import android.widget.LinearLayout
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat
import com.discord.SetTextSizeSpKt
import com.discord.channel_spine.ChannelSpineView
import com.discord.chat.R
import com.discord.chat.bridge.Message
import com.discord.chat.bridge.MessageKt
import com.discord.chat.bridge.contentnode.CommandMentionContentNode
import com.discord.chat.bridge.contentnode.LinkContentNode
import com.discord.chat.bridge.contentnode.LinkContextData
import com.discord.chat.bridge.executedcommand.ExecutedCommand
import com.discord.chat.bridge.executedcommand.ExecutedCommandBackgroundStyles
import com.discord.chat.bridge.referencedmessage.LoadedReferencedMessage
import com.discord.chat.bridge.referencedmessage.ReferencedMessage
import com.discord.chat.bridge.referencedmessage.SystemReferencedMessage
import com.discord.chat.bridge.rolecolors.RoleColors
import com.discord.chat.bridge.rolecolors.RoleColorsKt
import com.discord.chat.bridge.structurabletext.AnnotatedStructurableText
import com.discord.chat.bridge.structurabletext.StructurableText
import com.discord.chat.databinding.MessageViewReplyPreviewBinding
import com.discord.chat.presentation.events.ChatEventHandler
import com.discord.chat.presentation.message.utils.ReplyUtilsKt
import com.discord.chat.presentation.message.view.MessageContentView
import com.discord.chat.presentation.spine.SpineParentMessage
import com.discord.chat.presentation.textutils.LinkBackgroundStyle
import com.discord.chat.presentation.textutils.LinkStyle
import com.discord.chat.presentation.textutils.TextUtilsKt
import com.discord.fonts.DiscordFont
import com.discord.fonts.DiscordFontUtilsKt
import com.discord.misc.utilities.measure.ViewMeasureExtensionsKt
import com.discord.misc.utilities.view.ViewBackgroundUtilsKt
import com.discord.misc.utilities.view.ViewClippingUtilsKt
import com.discord.primitives.MessageId
import com.discord.react_asset_fetcher.ReactAsset
import com.discord.react_asset_fetcher.ReactAssetUtilsKt
import com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchUtilsKt
import com.discord.react_strings.I18nMessage
import com.discord.react_strings.I18nUtilsKt
import com.discord.span.utilities.BackgroundSpanDrawer
import com.discord.span.utilities.SpannableExtensionsKt
import com.discord.theme.ThemeManagerKt
import com.discord.theme.utils.ColorUtilsKt
import com.facebook.drawee.span.DraweeSpanStringBuilder
import com.facebook.drawee.view.SimpleDraweeView
import kotlin.jvm.functions.Function0

public class MessageViewReplyPreview  public constructor(context: Context, attrs: AttributeSet? = null) : ConstraintLayout, SpineParentMessage {
   private final val binding: MessageViewReplyPreviewBinding
   private final val replyTextLineBounds: Rect

   public open val spineOriginView: View
      public open get() {
         var var1: SimpleDraweeView = this.binding.replyAuthorAvatar;
         kotlin.jvm.internal.r.e(this.binding.replyAuthorAvatar);
         if (var1.getVisibility() != 0) {
            var1 = null;
         }

         if (var1 == null) {
            var1 = this.binding.replyIcon;
            kotlin.jvm.internal.r.g(this.binding.replyIcon, "replyIcon");
         }

         return var1;
      }


   fun MessageViewReplyPreview(var1: Context) {
      kotlin.jvm.internal.r.h(var1, "context");
      this(var1, null, 2, null);
   }

   init {
      kotlin.jvm.internal.r.h(var1, "context");
      super(var1, var2);
      val var6: MessageViewReplyPreviewBinding = MessageViewReplyPreviewBinding.inflate(LayoutInflater.from(var1), this);
      kotlin.jvm.internal.r.g(var6, "inflate(...)");
      this.binding = var6;
      this.replyTextLineBounds = new Rect();
      val var8: SimpleDraweeView = var6.replyIcon;
      if (!var6.replyIcon.isInEditMode()) {
         kotlin.jvm.internal.r.e(var8);
         ReactAssetUtilsKt.setReactAsset(var8, ReactAsset.Reply);
         ColorUtilsKt.setTintColor(var8, ThemeManagerKt.getTheme().getInteractiveNormal());
         ViewBackgroundUtilsKt.setBackgroundOval$default(var8, ThemeManagerKt.getTheme().getBackgroundTertiary(), 0, 2, null);
      }

      val var9: TextView = var6.replyAuthorName;
      kotlin.jvm.internal.r.g(var6.replyAuthorName, "replyAuthorName");
      DiscordFontUtilsKt.setDiscordFont(var9, DiscordFont.PrimarySemibold);
      val var10: TextView = var6.replyAuthorName;
      kotlin.jvm.internal.r.g(var6.replyAuthorName, "replyAuthorName");
      SetTextSizeSpKt.setTextSizeSp(var10, 12.0F);
      val var11: SimpleDraweeView = var6.replyLeadingIcon;
      kotlin.jvm.internal.r.g(var6.replyLeadingIcon, "replyLeadingIcon");
      ColorUtilsKt.setTintColor(var11, ThemeManagerKt.getTheme().getHeaderSecondary());
      val var12: SimpleDraweeView = var6.replyTrailingIcon;
      kotlin.jvm.internal.r.g(var6.replyTrailingIcon, "replyTrailingIcon");
      ColorUtilsKt.setTintColor(var12, ThemeManagerKt.getTheme().getHeaderSecondary());
      val var13: SimpleDraweeView = var6.replyAuthorAvatar;
      kotlin.jvm.internal.r.g(var6.replyAuthorAvatar, "replyAuthorAvatar");
      ViewClippingUtilsKt.clipToCircle(var13);
      val var14: MessageContentView = var6.replyText;
      kotlin.jvm.internal.r.e(var6.replyText);
      DiscordFontUtilsKt.setDiscordFont(var14, DiscordFont.PrimaryMedium);
      SetTextSizeSpKt.setTextSizeSp(var14, 12.0F);
      var14.setTextColor(ThemeManagerKt.getTheme().getInteractiveNormal());
      val var3: Float = this.getResources().getDimension(R.dimen.message_start_guideline);
      val var5: Float = var3 / 2 - this.getResources().getDimension(com.discord.channel_spine.R.dimen.spine_width) / 2;
      val var17: Float = this.getResources().getDimension(R.dimen.message_reply_leading_views_margin_start);
      var6.replySpline.configureAsReplySpline();
      val var7: ChannelSpineView = var6.replySpline;
      kotlin.jvm.internal.r.g(var6.replySpline, "replySpline");
      val var15: android.view.ViewGroup.LayoutParams = var7.getLayoutParams();
      if (var15 != null) {
         val var16: MarginLayoutParams = var15 as MarginLayoutParams;
         (var15 as MarginLayoutParams).width = (int)(var3 - var17 - var5);
         var16.setMarginStart((int)var5);
         var7.setLayoutParams(var16);
      } else {
         throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
      }
   }

   private fun configureClanTagChiplet(message: Message) {
      if (var1.getClanTag() != null && var1.getClanTagGuildId-qOKuAAo() != null) {
         this.binding.tagChiplet.configure-D0ylKIU(var1.getClanTag(), var1.getClanBadgeUrl(), var1.getClanTagGuildId-qOKuAAo().unbox-impl(), null, 0.89F);
         val var3: ClanTagChipletView = this.binding.tagChiplet;
         kotlin.jvm.internal.r.g(this.binding.tagChiplet, "tagChiplet");
         var3.setVisibility(0);
      } else {
         val var2: ClanTagChipletView = this.binding.tagChiplet;
         kotlin.jvm.internal.r.g(this.binding.tagChiplet, "tagChiplet");
         var2.setVisibility(8);
      }
   }

   @JvmStatic
   fun `configureExecutedCommand_dB0_bEw$lambda$10`(var0: ChatEventHandler, var1: java.lang.String, var2: ExecutedCommand, var3: View) {
      var0.onTapAvatar-x5gers8(var1, var2.getUserId-re6GcUE());
   }

   @JvmStatic
   fun `configureExecutedCommand_dB0_bEw$lambda$11`(var0: ChatEventHandler, var1: java.lang.String, var2: LinkContentNode): Unit {
      kotlin.jvm.internal.r.h(var2, "it");
      var0.onLinkClicked-ntcYbpo(var1, var2);
      return Unit.a;
   }

   @JvmStatic
   fun `configureExecutedCommand_dB0_bEw$lambda$12`(var0: ChatEventHandler, var1: CommandMentionContentNode): Unit {
      kotlin.jvm.internal.r.h(var1, "it");
      var0.onTapCommand(var1);
      return Unit.a;
   }

   @JvmStatic
   fun `configureExecutedCommand_dB0_bEw$lambda$13`(var0: ChatEventHandler, var1: CommandMentionContentNode): Unit {
      kotlin.jvm.internal.r.h(var1, "it");
      var0.onLongPressCommand(var1);
      return Unit.a;
   }

   @JvmStatic
   fun `configureExecutedCommand_dB0_bEw$lambda$14`(var0: ExecutedCommand, var1: LinkContentNode): LinkStyle {
      kotlin.jvm.internal.r.h(var1, "it");
      val var3: LinkContextData = var1.getTarget();
      val var7: LinkStyle;
      if (var3 is LinkContextData.BindUserMenu) {
         val var6: Int = var1.getLinkColor();
         val var2: Int;
         if (var6 != null) {
            var2 = var6;
         } else {
            var2 = ThemeManagerKt.getTheme().getTextLink();
         }

         var7 = new LinkStyle(DiscordFont.PrimarySemibold, var2, null, null, 12, null);
      } else if (var3 is LinkContextData.BindTapCommandName) {
         val var5: DiscordFont = DiscordFont.PrimarySemibold;
         val var9: ExecutedCommandBackgroundStyles = var0.getCommandNameBackgroundStyles();
         val var10: Int;
         if (var9 != null) {
            var10 = var9.getColor();
         } else {
            var10 = null;
         }

         val var12: ExecutedCommandBackgroundStyles = var0.getCommandNameBackgroundStyles();
         val var13: Int;
         if (var12 != null) {
            var13 = var12.getBorderRadius();
         } else {
            var13 = null;
         }

         val var4: ExecutedCommandBackgroundStyles = var0.getCommandNameBackgroundStyles();
         val var15: java.lang.Boolean;
         if (var4 != null) {
            var15 = var4.getSpaceAround();
         } else {
            var15 = null;
         }

         val var11: LinkBackgroundStyle = new LinkBackgroundStyle(var10, var13, var15);
         val var14: java.lang.Boolean = var0.getShowAppsIcon();
         val var16: java.lang.Boolean = java.lang.Boolean.TRUE;
         val var8: ReactAsset;
         if (kotlin.jvm.internal.r.c(var14, java.lang.Boolean.TRUE)) {
            if (kotlin.jvm.internal.r.c(var0.getShowControllerIcon(), var16)) {
               var8 = ReactAsset.GameController;
            } else {
               var8 = ReactAsset.AppsIcon;
            }
         } else {
            var8 = null;
         }

         var7 = new LinkStyle(var5, 0, var11, var8, 2, null);
      } else {
         var7 = new LinkStyle(DiscordFont.PrimarySemibold, 0, null, null, 14, null);
      }

      return var7;
   }

   private fun configureLeadingIcon(message: Message) {
      var var2: Boolean;
      if (var1.getForwardInfo() != null) {
         var2 = 1;
      } else {
         var2 = 0;
      }

      var var3: Boolean = true;
      if (!var1.isPollResult()) {
         if (var2) {
            var3 = true;
         } else {
            var3 = false;
         }
      }

      if (var3) {
         val var10: SimpleDraweeView = this.binding.replyLeadingIcon;
         kotlin.jvm.internal.r.g(this.binding.replyLeadingIcon, "replyLeadingIcon");
         val var7: ReactAsset;
         if (var1.isPollResult()) {
            var7 = ReactAsset.PollsIcon;
         } else {
            var7 = ReactAsset.ArrowAngleRightUpIcon;
         }

         ReactAssetUtilsKt.setReactAsset(var10, var7);
      }

      val var8: SimpleDraweeView = this.binding.replyLeadingIcon;
      kotlin.jvm.internal.r.g(this.binding.replyLeadingIcon, "replyLeadingIcon");
      if (var3) {
         var2 = 0;
      } else {
         var2 = 8;
      }

      var8.setVisibility(var2);
   }

   @JvmStatic
   fun `configureReply$lambda$5`(var0: Function0, var1: View) {
      var0.invoke();
   }

   private fun configureTrailingIcon(message: Message) {
      var var2: Boolean;
      if (!var1.isVoiceMessage() && !var1.hasAttachments()) {
         var2 = 0;
      } else {
         var2 = 1;
      }

      if (var2) {
         val var5: SimpleDraweeView = this.binding.replyTrailingIcon;
         kotlin.jvm.internal.r.g(this.binding.replyTrailingIcon, "replyTrailingIcon");
         val var6: ReactAsset;
         if (var1.isVoiceMessage()) {
            var6 = ReactAsset.Mic;
         } else {
            var6 = ReactAsset.ImageIcon;
         }

         ReactAssetUtilsKt.setReactAsset(var5, var6);
      }

      val var7: SimpleDraweeView = this.binding.replyTrailingIcon;
      kotlin.jvm.internal.r.g(this.binding.replyTrailingIcon, "replyTrailingIcon");
      if (var2) {
         var2 = 0;
      } else {
         var2 = 8;
      }

      var7.setVisibility(var2);
   }

   private fun measureAndSetReplyLeadingViewsHeight() {
      if (this.binding.replyText.getWidth() > 0) {
         this.binding.replyText.measure(MeasureSpec.makeMeasureSpec(this.binding.replyText.getWidth(), Integer.MIN_VALUE), MeasureSpec.makeMeasureSpec(0, 0));
         this.binding.replyText.getLineBounds(0, this.replyTextLineBounds);
         val var1: Int = this.replyTextLineBounds.bottom;
         val var2: Int = this.replyTextLineBounds.top;
         val var6: LinearLayout = this.binding.replyLeadingViews;
         kotlin.jvm.internal.r.g(this.binding.replyLeadingViews, "replyLeadingViews");
         val var4: android.view.ViewGroup.LayoutParams = var6.getLayoutParams();
         if (var4 != null) {
            var4.height = var1 - var2;
            var6.setLayoutParams(var4);
         } else {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
         }
      }
   }

   public fun clear() {
      val var1: ChannelSpineView = this.binding.replySpline;
      kotlin.jvm.internal.r.g(this.binding.replySpline, "replySpline");
      var1.setVisibility(8);
      val var2: LinearLayout = this.binding.replyLeadingViews;
      kotlin.jvm.internal.r.g(this.binding.replyLeadingViews, "replyLeadingViews");
      var2.setVisibility(8);
      val var3: MessageContentView = this.binding.replyText;
      kotlin.jvm.internal.r.g(this.binding.replyText, "replyText");
      var3.setVisibility(8);
      val var4: SimpleDraweeView = this.binding.replyTrailingIcon;
      kotlin.jvm.internal.r.g(this.binding.replyTrailingIcon, "replyTrailingIcon");
      var4.setVisibility(8);
   }

   public fun configureExecutedCommand(
      messageId: MessageId,
      executedCommand: ExecutedCommand,
      shouldAnimateEmoji: Boolean,
      shouldShowLinkDecorations: Boolean,
      shouldShowRoleDot: Boolean,
      shouldShowRoleOnName: Boolean,
      eventHandler: ChatEventHandler
   ) {
      kotlin.jvm.internal.r.h(var1, "messageId");
      kotlin.jvm.internal.r.h(var2, "executedCommand");
      kotlin.jvm.internal.r.h(var7, "eventHandler");
      val var9: ChannelSpineView = this.binding.replySpline;
      kotlin.jvm.internal.r.g(this.binding.replySpline, "replySpline");
      var9.setVisibility(0);
      val var18: MessageContentView = this.binding.replyText;
      kotlin.jvm.internal.r.g(this.binding.replyText, "replyText");
      var18.setVisibility(0);
      val var19: LinearLayout = this.binding.replyLeadingViews;
      kotlin.jvm.internal.r.g(this.binding.replyLeadingViews, "replyLeadingViews");
      var19.setVisibility(0);
      val var20: SimpleDraweeView = this.binding.replyAuthorAvatar;
      kotlin.jvm.internal.r.g(this.binding.replyAuthorAvatar, "replyAuthorAvatar");
      var20.setVisibility(0);
      val var21: TextView = this.binding.replyAuthorName;
      kotlin.jvm.internal.r.g(this.binding.replyAuthorName, "replyAuthorName");
      var21.setVisibility(8);
      val var22: SimpleDraweeView = this.binding.replyAuthorAvatar;
      kotlin.jvm.internal.r.g(this.binding.replyAuthorAvatar, "replyAuthorAvatar");
      NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(var22, false, new p0(var7, var1, var2), 1, null);
      val var23: SimpleDraweeView = this.binding.replyIcon;
      kotlin.jvm.internal.r.g(this.binding.replyIcon, "replyIcon");
      var23.setVisibility(8);
      val var24: SimpleDraweeView = this.binding.replyTrailingIcon;
      kotlin.jvm.internal.r.g(this.binding.replyTrailingIcon, "replyTrailingIcon");
      var24.setVisibility(8);
      val var25: MessageContentView = this.binding.replyText;
      val var26: LinearLayout = this.binding.replyLeadingViews;
      kotlin.jvm.internal.r.g(this.binding.replyLeadingViews, "replyLeadingViews");
      val var11: AnnotatedStructurableText = var2.getContent();
      val var12: Context = this.getContext();
      kotlin.jvm.internal.r.g(var12, "getContext(...)");
      val var13: FontMetrics = this.binding.replyText.getPaint().getFontMetrics();
      kotlin.jvm.internal.r.g(var13, "getFontMetrics(...)");
      val var8: Float = TextUtilsKt.getBaselineHeightPx(var13);
      val var27: TextPaint = this.binding.replyText.getPaint();
      kotlin.jvm.internal.r.g(var27, "getPaint(...)");
      val var14: DraweeSpanStringBuilder = TextUtilsKt.toSpannable$default(
         var11,
         var12,
         var1,
         var3,
         var4,
         var5,
         var6,
         var27,
         new q0(var7, var1),
         null,
         null,
         null,
         null,
         null,
         null,
         new r0(var7),
         new s0(var7),
         null,
         null,
         null,
         new t0(var2),
         null,
         null,
         false,
         null,
         var8,
         null,
         49757952,
         null
      );
      val var16: MessageContentView = this.binding.replyText;
      kotlin.jvm.internal.r.g(this.binding.replyText, "replyText");
      SpannableExtensionsKt.coverWithSpan(var14, new BackgroundSpanDrawer(var16));
      var25.setDraweeSpanStringBuilder(ReplyUtilsKt.createReplyContent(var26, var14));
      val var15: MessageContentView = this.binding.replyText;
      kotlin.jvm.internal.r.g(this.binding.replyText, "replyText");
      NestedScrollOnTouchUtilsKt.enableNestedSpanClickListener(var15, true);
      this.binding.replyAuthorAvatar.setImageURI(var2.getAvatarURL());
   }

   public fun configureReply(reply: ReferencedMessage, showSpine: Boolean = true, onClick: () -> Unit) {
      kotlin.jvm.internal.r.h(var1, "reply");
      kotlin.jvm.internal.r.h(var3, "onClick");
      NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(this, false, new u0(var3), 1, null);
      if (var1 is LoadedReferencedMessage) {
         val var12: LoadedReferencedMessage = var1 as LoadedReferencedMessage;
         val var11: Message = (var1 as LoadedReferencedMessage).getMessage();
         this.configureLeadingIcon(var11);
         this.configureTrailingIcon(var11);
         this.configureClanTagChiplet(var11);
         val var15: ChannelSpineView = this.binding.replySpline;
         kotlin.jvm.internal.r.g(this.binding.replySpline, "replySpline");
         var var5: Byte;
         if (var2) {
            var5 = 0;
         } else {
            var5 = 8;
         }

         var15.setVisibility(var5);
         val var16: LinearLayout = this.binding.replyLeadingViews;
         kotlin.jvm.internal.r.g(this.binding.replyLeadingViews, "replyLeadingViews");
         var16.setVisibility(0);
         val var17: MessageContentView = this.binding.replyText;
         kotlin.jvm.internal.r.g(this.binding.replyText, "replyText");
         var17.setVisibility(0);
         if (var11.getShouldShowRoleDot()) {
            val var18: RoleDotView = this.binding.replyRoleDot;
            kotlin.jvm.internal.r.g(this.binding.replyRoleDot, "replyRoleDot");
            var18.setVisibility(0);
            val var13: RoleDotView = this.binding.replyRoleDot;
            val var40: RoleColors = RoleColorsKt.toAndroidColors(var11.getRoleColors());
            var var19: RoleColors = var40;
            if (var40 == null) {
               var19 = new RoleColors(MessageKt.roleDotColor$default(var11, 0, 1, null), null, null, 6, null);
            }

            var13.configure(var19, 16);
         } else {
            val var20: RoleDotView = this.binding.replyRoleDot;
            kotlin.jvm.internal.r.g(this.binding.replyRoleDot, "replyRoleDot");
            var20.setVisibility(8);
         }

         val var21: Context = this.getContext();
         kotlin.jvm.internal.r.g(var21, "getContext(...)");
         val var22: java.lang.String = MessageKt.avatarUrl(var11, var21);
         if (var22 != null && var11.getUsername() != null && var11.getAuthorId-wUX8bhU() != null) {
            var var41: SimpleDraweeView = this.binding.replyAuthorAvatar;
            kotlin.jvm.internal.r.g(this.binding.replyAuthorAvatar, "replyAuthorAvatar");
            var41.setVisibility(0);
            var41 = this.binding.replyIcon;
            kotlin.jvm.internal.r.g(this.binding.replyIcon, "replyIcon");
            var41.setVisibility(8);
            this.binding.replyAuthorAvatar.setImageURI(var22);
            val var26: TextView = this.binding.replyAuthorName;
            kotlin.jvm.internal.r.g(this.binding.replyAuthorName, "replyAuthorName");
            var26.setVisibility(0);
            this.binding.replyAuthorName.setText(var11.getUsername());
            val var27: TextView = this.binding.replyAuthorName;
            this.binding.replyAuthorName.setTextColor(MessageKt.usernameColor$default(var11, 0, 1, null));
            kotlin.jvm.internal.r.e(var27);
            MessageUtilsKt.clearOrSetRoleColors(var27, var11);
            kotlin.jvm.internal.r.e(var27);
         } else {
            val var23: SimpleDraweeView = this.binding.replyAuthorAvatar;
            kotlin.jvm.internal.r.g(this.binding.replyAuthorAvatar, "replyAuthorAvatar");
            var23.setVisibility(8);
            val var24: TextView = this.binding.replyAuthorName;
            kotlin.jvm.internal.r.g(this.binding.replyAuthorName, "replyAuthorName");
            var24.setVisibility(8);
            val var25: SimpleDraweeView = this.binding.replyIcon;
            kotlin.jvm.internal.r.g(this.binding.replyIcon, "replyIcon");
            if (!var11.isPollResult()) {
               var5 = 0;
            } else {
               var5 = 8;
            }

            var25.setVisibility(var5);
         }

         if (var12.getSystemContent() != null) {
            val var28: MessageContentView = this.binding.replyText;
            val var44: LinearLayout = this.binding.replyLeadingViews;
            kotlin.jvm.internal.r.g(this.binding.replyLeadingViews, "replyLeadingViews");
            val var63: StructurableText = var12.getSystemContent();
            val var14: Context = this.getContext();
            kotlin.jvm.internal.r.g(var14, "getContext(...)");
            val var69: java.lang.String = var11.getId-3Eiw7ao();
            val var9: Boolean = MessageKt.shouldAnimateEmoji(var11);
            var2 = MessageKt.shouldShowLinkDecorations(var11);
            val var7: Boolean = var11.getShouldShowRoleDot();
            val var8: Boolean = var11.getShouldShowRoleOnName();
            val var55: FontMetrics = this.binding.replyText.getPaint().getFontMetrics();
            kotlin.jvm.internal.r.g(var55, "getFontMetrics(...)");
            val var4: Float = TextUtilsKt.getBaselineHeightPx(var55);
            val var56: TextPaint = this.binding.replyText.getPaint();
            kotlin.jvm.internal.r.g(var56, "getPaint(...)");
            val var57: DraweeSpanStringBuilder = TextUtilsKt.toSpannable$default(
               var63,
               var14,
               var69,
               var9,
               var2,
               var7,
               var8,
               var56,
               null,
               null,
               null,
               null,
               null,
               null,
               null,
               null,
               null,
               null,
               null,
               null,
               null,
               null,
               null,
               true,
               null,
               var4,
               null,
               46137216,
               null
            );
            val var64: MessageContentView = this.binding.replyText;
            kotlin.jvm.internal.r.g(this.binding.replyText, "replyText");
            SpannableExtensionsKt.coverWithSpan(var57, new BackgroundSpanDrawer(var64));
            var28.setDraweeSpanStringBuilder(ReplyUtilsKt.createSystemReplyContentFromBuilder(var44, var57));
         } else if (var11.getContent() != null) {
            val var29: MessageContentView = this.binding.replyText;
            val var46: LinearLayout = this.binding.replyLeadingViews;
            kotlin.jvm.internal.r.g(this.binding.replyLeadingViews, "replyLeadingViews");
            val var66: StructurableText = var11.getContent();
            val var70: Context = this.getContext();
            kotlin.jvm.internal.r.g(var70, "getContext(...)");
            val var71: java.lang.String = var11.getId-3Eiw7ao();
            val var38: Boolean = MessageKt.shouldAnimateEmoji(var11);
            val var37: Boolean = MessageKt.shouldShowLinkDecorations(var11);
            var2 = var11.getShouldShowRoleDot();
            val var39: Boolean = var11.getShouldShowRoleOnName();
            val var58: FontMetrics = this.binding.replyText.getPaint().getFontMetrics();
            kotlin.jvm.internal.r.g(var58, "getFontMetrics(...)");
            val var34: Float = TextUtilsKt.getBaselineHeightPx(var58);
            val var59: TextPaint = this.binding.replyText.getPaint();
            kotlin.jvm.internal.r.g(var59, "getPaint(...)");
            val var60: DraweeSpanStringBuilder = TextUtilsKt.toSpannable$default(
               var66,
               var70,
               var71,
               var38,
               var37,
               var2,
               var39,
               var59,
               null,
               null,
               null,
               null,
               null,
               null,
               null,
               null,
               null,
               null,
               null,
               null,
               null,
               null,
               null,
               true,
               null,
               var34,
               null,
               46137216,
               null
            );
            val var67: MessageContentView = this.binding.replyText;
            kotlin.jvm.internal.r.g(this.binding.replyText, "replyText");
            SpannableExtensionsKt.coverWithSpan(var60, new BackgroundSpanDrawer(var67));
            var29.setDraweeSpanStringBuilder(ReplyUtilsKt.createReplyContent(var46, var60));
         } else {
            this.binding.replyText.setText(null);
         }
      } else {
         if (var1 !is SystemReferencedMessage) {
            throw new A9.n();
         }

         val var47: ChannelSpineView = this.binding.replySpline;
         kotlin.jvm.internal.r.g(this.binding.replySpline, "replySpline");
         val var36: Byte;
         if (var2) {
            var36 = 0;
         } else {
            var36 = 8;
         }

         var47.setVisibility(var36);
         val var48: LinearLayout = this.binding.replyLeadingViews;
         kotlin.jvm.internal.r.g(this.binding.replyLeadingViews, "replyLeadingViews");
         var48.setVisibility(0);
         val var49: SimpleDraweeView = this.binding.replyAuthorAvatar;
         kotlin.jvm.internal.r.g(this.binding.replyAuthorAvatar, "replyAuthorAvatar");
         var49.setVisibility(0);
         val var50: SimpleDraweeView = this.binding.replyAuthorAvatar;
         kotlin.jvm.internal.r.g(this.binding.replyAuthorAvatar, "replyAuthorAvatar");
         ReactAssetUtilsKt.setReactAsset(var50, ReactAsset.DefaultAvatar0);
         val var51: TextView = this.binding.replyAuthorName;
         kotlin.jvm.internal.r.g(this.binding.replyAuthorName, "replyAuthorName");
         var51.setVisibility(8);
         val var52: SimpleDraweeView = this.binding.replyIcon;
         kotlin.jvm.internal.r.g(this.binding.replyIcon, "replyIcon");
         var52.setVisibility(8);
         this.binding.replyIcon.setBackgroundColor(ThemeManagerKt.getTheme().getBackgroundTertiary());
         val var53: MessageContentView = this.binding.replyText;
         kotlin.jvm.internal.r.g(this.binding.replyText, "replyText");
         var53.setVisibility(0);
         val var54: MessageContentView = this.binding.replyText;
         val var62: LinearLayout = this.binding.replyLeadingViews;
         kotlin.jvm.internal.r.g(this.binding.replyLeadingViews, "replyLeadingViews");
         var54.setDraweeSpanStringBuilder(ReplyUtilsKt.createSystemReplyContent(var62, (var1 as SystemReferencedMessage).getContent()));
         val var30: SimpleDraweeView = this.binding.replyTrailingIcon;
         kotlin.jvm.internal.r.g(this.binding.replyTrailingIcon, "replyTrailingIcon");
         var30.setVisibility(8);
      }

      if (this.binding.replyText.isLaidOut() && !this.binding.replyText.isLayoutRequested()) {
         this.measureAndSetReplyLeadingViewsHeight();
      } else {
         val var31: MessageContentView = this.binding.replyText;
         kotlin.jvm.internal.r.g(this.binding.replyText, "replyText");
         var31.addOnLayoutChangeListener(new OnLayoutChangeListener(this) {
            final MessageViewReplyPreview this$0;

            {
               this.this$0 = var1;
            }

            public void onLayoutChange(View var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
               var1.removeOnLayoutChangeListener(this);
               if (MessageViewReplyPreview.access$getBinding$p(this.this$0).replyText.getWidth() > 0) {
                  MessageViewReplyPreview.access$measureAndSetReplyLeadingViewsHeight(this.this$0);
                  ViewMeasureExtensionsKt.measureAndLayout(this.this$0);
               }
            }
         });
      }

      this.setImportantForAccessibility(1);
      androidx.core.view.Z.o0(
         this,
         new androidx.core.view.a(this, var3) {
            final Function0 $onClick;
            final MessageViewReplyPreview this$0;

            {
               this.this$0 = var1;
               this.$onClick = var2;
            }

            @Override
            public void onInitializeAccessibilityNodeInfo(View var1, AccessibilityNodeInfoCompat var2) {
               kotlin.jvm.internal.r.h(var1, "host");
               kotlin.jvm.internal.r.h(var2, "info");
               super.onInitializeAccessibilityNodeInfo(var1, var2);
               val var3: Context = this.this$0.getContext();
               kotlin.jvm.internal.r.g(var3, "getContext(...)");
               val var4: SpannableStringBuilder = new SpannableStringBuilder(
                  I18nUtilsKt.i18nFormat$default(var3, I18nMessage.MOBILE_REPLY_PREVIEW_A11Y_LABEL, null, 2, null)
               );
               var4.append(", ");
               var4.append(MessageViewReplyPreview.access$getBinding$p(this.this$0).replyAuthorName.getText());
               var4.append(", ");
               var4.append(MessageViewReplyPreview.access$getBinding$p(this.this$0).replyText.getText());
               var2.v0(var4);
               val var5: Context = this.this$0.getContext();
               kotlin.jvm.internal.r.g(var5, "getContext(...)");
               var2.b(
                  new AccessibilityNodeInfoCompat.a(
                     16, I18nUtilsKt.i18nFormat$default(var5, I18nMessage.MOBILE_SCROLL_TO_MESSAGE_ACTION_A11Y_LABEL, null, 2, null)
                  )
               );
            }

            @Override
            public boolean performAccessibilityAction(View var1, int var2, Bundle var3) {
               kotlin.jvm.internal.r.h(var1, "host");
               if (var2 == 16) {
                  this.$onClick.invoke();
               }

               return super.performAccessibilityAction(var1, var2, var3);
            }
         }
      );
   }
}

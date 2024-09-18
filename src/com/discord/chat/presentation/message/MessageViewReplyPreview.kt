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
import android.view.ViewGroup.MarginLayoutParams
import android.widget.LinearLayout
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.r0
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat
import com.discord.SetTextSizeSpKt
import com.discord.channel_spine.ChannelSpineView
import com.discord.chat.R
import com.discord.chat.bridge.Message
import com.discord.chat.bridge.MessageKt
import com.discord.chat.bridge.contentnode.CommandMentionContentNode
import com.discord.chat.bridge.contentnode.LinkContentNode
import com.discord.chat.bridge.executedcommand.ExecutedCommand
import com.discord.chat.bridge.executedcommand.ExecutedCommandBackgroundStyles
import com.discord.chat.bridge.referencedmessage.LoadedReferencedMessage
import com.discord.chat.bridge.referencedmessage.ReferencedMessage
import com.discord.chat.bridge.referencedmessage.SystemReferencedMessage
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
import kotlin.jvm.functions.Function1

public class MessageViewReplyPreview  public constructor(context: Context, attrs: AttributeSet? = null) : ConstraintLayout, SpineParentMessage {
   private final val binding: MessageViewReplyPreviewBinding
   private final val replyTextLineBounds: Rect

   public open val spineOriginView: View
      public open get() {
         var var1: SimpleDraweeView = this.binding.replyAuthorAvatar;
         kotlin.jvm.internal.q.e(this.binding.replyAuthorAvatar);
         if (var1.getVisibility() != 0) {
            var1 = null;
         }

         var var2: SimpleDraweeView = var1;
         if (var1 == null) {
            var2 = this.binding.replyIcon;
            kotlin.jvm.internal.q.g(this.binding.replyIcon, "replyIcon");
         }

         return var2;
      }


   fun MessageViewReplyPreview(var1: Context) {
      kotlin.jvm.internal.q.h(var1, "context");
      this(var1, null, 2, null);
   }

   init {
      kotlin.jvm.internal.q.h(var1, "context");
      super(var1, var2);
      val var6: MessageViewReplyPreviewBinding = MessageViewReplyPreviewBinding.inflate(LayoutInflater.from(var1), this);
      kotlin.jvm.internal.q.g(var6, "inflate(...)");
      this.binding = var6;
      this.replyTextLineBounds = new Rect();
      val var8: SimpleDraweeView = var6.replyIcon;
      if (!var6.replyIcon.isInEditMode()) {
         kotlin.jvm.internal.q.e(var8);
         ReactAssetUtilsKt.setReactAsset(var8, ReactAsset.Reply);
         ColorUtilsKt.setTintColor(var8, ThemeManagerKt.getTheme().getInteractiveNormal());
         ViewBackgroundUtilsKt.setBackgroundOval$default(var8, ThemeManagerKt.getTheme().getBackgroundTertiary(), 0, 2, null);
      }

      val var9: TextView = var6.replyAuthorName;
      kotlin.jvm.internal.q.g(var6.replyAuthorName, "replyAuthorName");
      DiscordFontUtilsKt.setDiscordFont(var9, DiscordFont.PrimarySemibold);
      val var10: TextView = var6.replyAuthorName;
      kotlin.jvm.internal.q.g(var6.replyAuthorName, "replyAuthorName");
      SetTextSizeSpKt.setTextSizeSp(var10, 12.0F);
      val var11: SimpleDraweeView = var6.replyLeadingIcon;
      kotlin.jvm.internal.q.g(var6.replyLeadingIcon, "replyLeadingIcon");
      ColorUtilsKt.setTintColor(var11, ThemeManagerKt.getTheme().getHeaderSecondary());
      val var12: SimpleDraweeView = var6.replyTrailingIcon;
      kotlin.jvm.internal.q.g(var6.replyTrailingIcon, "replyTrailingIcon");
      ColorUtilsKt.setTintColor(var12, ThemeManagerKt.getTheme().getHeaderSecondary());
      val var13: SimpleDraweeView = var6.replyAuthorAvatar;
      kotlin.jvm.internal.q.g(var6.replyAuthorAvatar, "replyAuthorAvatar");
      ViewClippingUtilsKt.clipToCircle(var13);
      val var14: MessageContentView = var6.replyText;
      kotlin.jvm.internal.q.e(var6.replyText);
      DiscordFontUtilsKt.setDiscordFont(var14, DiscordFont.PrimaryMedium);
      SetTextSizeSpKt.setTextSizeSp(var14, 12.0F);
      var14.setTextColor(ThemeManagerKt.getTheme().getInteractiveNormal());
      val var3: Float = this.getResources().getDimension(R.dimen.message_start_guideline);
      val var5: Float = var3 / 2 - this.getResources().getDimension(com.discord.channel_spine.R.dimen.spine_width) / 2;
      val var17: Float = this.getResources().getDimension(R.dimen.message_reply_leading_views_margin_start);
      var6.replySpline.configureAsReplySpline();
      val var7: ChannelSpineView = var6.replySpline;
      kotlin.jvm.internal.q.g(var6.replySpline, "replySpline");
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
         kotlin.jvm.internal.q.g(this.binding.tagChiplet, "tagChiplet");
         var3.setVisibility(0);
      } else {
         val var2: ClanTagChipletView = this.binding.tagChiplet;
         kotlin.jvm.internal.q.g(this.binding.tagChiplet, "tagChiplet");
         var2.setVisibility(8);
      }
   }

   @JvmStatic
   fun `configureExecutedCommand_dB0_bEw$lambda$8`(var0: ChatEventHandler, var1: java.lang.String, var2: ExecutedCommand, var3: View) {
      kotlin.jvm.internal.q.h(var0, "$eventHandler");
      kotlin.jvm.internal.q.h(var1, "$messageId");
      kotlin.jvm.internal.q.h(var2, "$executedCommand");
      var0.onTapAvatar-x5gers8(var1, var2.getUserId-re6GcUE());
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
         kotlin.jvm.internal.q.g(this.binding.replyLeadingIcon, "replyLeadingIcon");
         val var7: ReactAsset;
         if (var1.isPollResult()) {
            var7 = ReactAsset.PollsIcon;
         } else if (var1.getForwardInfo() != null && var1.getForwardInfo().getUseOldIcon()) {
            var7 = ReactAsset.ArrowAngleRightUpIcon;
         } else {
            var7 = ReactAsset.ChatArrowRightIcon;
         }

         ReactAssetUtilsKt.setReactAsset(var10, var7);
      }

      val var8: SimpleDraweeView = this.binding.replyLeadingIcon;
      kotlin.jvm.internal.q.g(this.binding.replyLeadingIcon, "replyLeadingIcon");
      if (var3) {
         var2 = 0;
      } else {
         var2 = 8;
      }

      var8.setVisibility(var2);
   }

   @JvmStatic
   fun `configureReply$lambda$4`(var0: Function0, var1: View) {
      kotlin.jvm.internal.q.h(var0, "$onClick");
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
         kotlin.jvm.internal.q.g(this.binding.replyTrailingIcon, "replyTrailingIcon");
         val var6: ReactAsset;
         if (var1.isVoiceMessage()) {
            var6 = ReactAsset.Mic;
         } else {
            var6 = ReactAsset.ImageIcon;
         }

         ReactAssetUtilsKt.setReactAsset(var5, var6);
      }

      val var7: SimpleDraweeView = this.binding.replyTrailingIcon;
      kotlin.jvm.internal.q.g(this.binding.replyTrailingIcon, "replyTrailingIcon");
      if (var2) {
         var2 = 0;
      } else {
         var2 = 8;
      }

      var7.setVisibility(var2);
   }

   public fun clear() {
      val var1: ChannelSpineView = this.binding.replySpline;
      kotlin.jvm.internal.q.g(this.binding.replySpline, "replySpline");
      var1.setVisibility(8);
      val var2: LinearLayout = this.binding.replyLeadingViews;
      kotlin.jvm.internal.q.g(this.binding.replyLeadingViews, "replyLeadingViews");
      var2.setVisibility(8);
      val var3: MessageContentView = this.binding.replyText;
      kotlin.jvm.internal.q.g(this.binding.replyText, "replyText");
      var3.setVisibility(8);
      val var4: SimpleDraweeView = this.binding.replyTrailingIcon;
      kotlin.jvm.internal.q.g(this.binding.replyTrailingIcon, "replyTrailingIcon");
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
      kotlin.jvm.internal.q.h(var1, "messageId");
      kotlin.jvm.internal.q.h(var2, "executedCommand");
      kotlin.jvm.internal.q.h(var7, "eventHandler");
      val var9: ChannelSpineView = this.binding.replySpline;
      kotlin.jvm.internal.q.g(this.binding.replySpline, "replySpline");
      var9.setVisibility(0);
      val var18: MessageContentView = this.binding.replyText;
      kotlin.jvm.internal.q.g(this.binding.replyText, "replyText");
      var18.setVisibility(0);
      val var19: LinearLayout = this.binding.replyLeadingViews;
      kotlin.jvm.internal.q.g(this.binding.replyLeadingViews, "replyLeadingViews");
      var19.setVisibility(0);
      val var20: SimpleDraweeView = this.binding.replyAuthorAvatar;
      kotlin.jvm.internal.q.g(this.binding.replyAuthorAvatar, "replyAuthorAvatar");
      var20.setVisibility(0);
      val var21: TextView = this.binding.replyAuthorName;
      kotlin.jvm.internal.q.g(this.binding.replyAuthorName, "replyAuthorName");
      var21.setVisibility(8);
      val var22: SimpleDraweeView = this.binding.replyAuthorAvatar;
      kotlin.jvm.internal.q.g(this.binding.replyAuthorAvatar, "replyAuthorAvatar");
      NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(var22, false, new v(var7, var1, var2), 1, null);
      val var23: SimpleDraweeView = this.binding.replyIcon;
      kotlin.jvm.internal.q.g(this.binding.replyIcon, "replyIcon");
      var23.setVisibility(8);
      val var24: SimpleDraweeView = this.binding.replyTrailingIcon;
      kotlin.jvm.internal.q.g(this.binding.replyTrailingIcon, "replyTrailingIcon");
      var24.setVisibility(8);
      val var25: MessageContentView = this.binding.replyText;
      val var26: LinearLayout = this.binding.replyLeadingViews;
      kotlin.jvm.internal.q.g(this.binding.replyLeadingViews, "replyLeadingViews");
      val var11: AnnotatedStructurableText = var2.getContent();
      val var12: Context = this.getContext();
      val var13: FontMetrics = this.binding.replyText.getPaint().getFontMetrics();
      kotlin.jvm.internal.q.g(var13, "getFontMetrics(...)");
      val var8: Float = TextUtilsKt.getBaselineHeightPx(var13);
      val var27: TextPaint = this.binding.replyText.getPaint();
      kotlin.jvm.internal.q.e(var12);
      kotlin.jvm.internal.q.e(var27);
      val var14: DraweeSpanStringBuilder = TextUtilsKt.toSpannable$default(var11, var12, var1, var3, var4, var5, var6, var27, new Function1(var7, var1) {
         final ChatEventHandler $eventHandler;
         final java.lang.String $messageId;

         {
            super(1);
            this.$eventHandler = var1;
            this.$messageId = var2;
         }

         public final void invoke(LinkContentNode var1) {
            kotlin.jvm.internal.q.h(var1, "it");
            this.$eventHandler.onLinkClicked-ntcYbpo(this.$messageId, var1);
         }
      }, null, null, null, null, null, null, new Function1(var7) {
         final ChatEventHandler $eventHandler;

         {
            super(1);
            this.$eventHandler = var1;
         }

         public final void invoke(CommandMentionContentNode var1) {
            kotlin.jvm.internal.q.h(var1, "it");
            this.$eventHandler.onTapCommand(var1);
         }
      }, new Function1(var7) {
         final ChatEventHandler $eventHandler;

         {
            super(1);
            this.$eventHandler = var1;
         }

         public final void invoke(CommandMentionContentNode var1) {
            kotlin.jvm.internal.q.h(var1, "it");
            this.$eventHandler.onLongPressCommand(var1);
         }
      }, null, null, new Function1(var2) {
         final ExecutedCommand $executedCommand;

         {
            super(1);
            this.$executedCommand = var1;
         }

         public final LinkStyle invoke(LinkContentNode var1) {
            kotlin.jvm.internal.q.h(var1, "it");
            val var7: java.lang.String = var1.getTarget();
            val var8: LinkStyle;
            if (kotlin.jvm.internal.q.c(var7, "usernameOnClick")) {
               var8 = new LinkStyle(DiscordFont.PrimarySemibold, this.$executedCommand.getUsernameColor(), null, null, 12, null);
            } else if (kotlin.jvm.internal.q.c(var7, "commandNameOnClick")) {
               val var6: DiscordFont = DiscordFont.PrimarySemibold;
               val var9: ExecutedCommandBackgroundStyles = this.$executedCommand.getCommandNameBackgroundStyles();
               val var10: Int;
               if (var9 != null) {
                  var10 = var9.getColor();
               } else {
                  var10 = null;
               }

               val var3: ExecutedCommandBackgroundStyles = this.$executedCommand.getCommandNameBackgroundStyles();
               val var12: Int;
               if (var3 != null) {
                  var12 = var3.getBorderRadius();
               } else {
                  var12 = null;
               }

               val var4: ExecutedCommandBackgroundStyles = this.$executedCommand.getCommandNameBackgroundStyles();
               val var14: java.lang.Boolean;
               if (var4 != null) {
                  var14 = var4.getSpaceAround();
               } else {
                  var14 = null;
               }

               val var13: LinkBackgroundStyle = new LinkBackgroundStyle(var10, var12, var14);
               var var11: ReactAsset = null;
               if (kotlin.jvm.internal.q.c(this.$executedCommand.getShowAppsIcon(), java.lang.Boolean.TRUE)) {
                  var11 = ReactAsset.AppsIcon;
               }

               var8 = new LinkStyle(var6, 0, var13, var11, 2, null);
            } else {
               var8 = new LinkStyle(DiscordFont.PrimarySemibold, 0, null, null, 14, null);
            }

            return var8;
         }
      }, null, false, null, var8, null, 12271360, null);
      val var16: MessageContentView = this.binding.replyText;
      kotlin.jvm.internal.q.g(this.binding.replyText, "replyText");
      SpannableExtensionsKt.coverWithSpan(var14, new BackgroundSpanDrawer(var16));
      var25.setDraweeSpanStringBuilder(ReplyUtilsKt.createReplyContent(var26, var14));
      val var15: MessageContentView = this.binding.replyText;
      kotlin.jvm.internal.q.g(this.binding.replyText, "replyText");
      NestedScrollOnTouchUtilsKt.enableNestedSpanClickListener(var15, true);
      this.binding.replyAuthorAvatar.setImageURI(var2.getAvatarURL());
   }

   public fun configureReply(reply: ReferencedMessage, showSpine: Boolean = true, onClick: () -> Unit) {
      kotlin.jvm.internal.q.h(var1, "reply");
      kotlin.jvm.internal.q.h(var3, "onClick");
      NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(this, false, new w(var3), 1, null);
      if (var1 is LoadedReferencedMessage) {
         val var10: LoadedReferencedMessage = var1 as LoadedReferencedMessage;
         val var15: Message = (var1 as LoadedReferencedMessage).getMessage();
         this.configureLeadingIcon(var15);
         this.configureTrailingIcon(var15);
         this.configureClanTagChiplet(var15);
         val var11: ChannelSpineView = this.binding.replySpline;
         kotlin.jvm.internal.q.g(this.binding.replySpline, "replySpline");
         var var5: Byte;
         if (var2) {
            var5 = 0;
         } else {
            var5 = 8;
         }

         var11.setVisibility(var5);
         val var50: LinearLayout = this.binding.replyLeadingViews;
         kotlin.jvm.internal.q.g(this.binding.replyLeadingViews, "replyLeadingViews");
         var50.setVisibility(0);
         val var51: MessageContentView = this.binding.replyText;
         kotlin.jvm.internal.q.g(this.binding.replyText, "replyText");
         var51.setVisibility(0);
         if (var15.getShouldShowRoleDot()) {
            val var52: RoleDotView = this.binding.replyRoleDot;
            kotlin.jvm.internal.q.g(this.binding.replyRoleDot, "replyRoleDot");
            var52.setVisibility(0);
            this.binding.replyRoleDot.configure(MessageKt.roleDotColor$default(var15, 0, 1, null), 16);
         } else {
            val var53: RoleDotView = this.binding.replyRoleDot;
            kotlin.jvm.internal.q.g(this.binding.replyRoleDot, "replyRoleDot");
            var53.setVisibility(8);
         }

         val var54: Context = this.getContext();
         kotlin.jvm.internal.q.g(var54, "getContext(...)");
         val var55: java.lang.String = MessageKt.avatarUrl(var15, var54);
         if (var55 != null && var15.getUsername() != null && var15.getAuthorId-wUX8bhU() != null) {
            var var12: SimpleDraweeView = this.binding.replyAuthorAvatar;
            kotlin.jvm.internal.q.g(this.binding.replyAuthorAvatar, "replyAuthorAvatar");
            var12.setVisibility(0);
            var12 = this.binding.replyIcon;
            kotlin.jvm.internal.q.g(this.binding.replyIcon, "replyIcon");
            var12.setVisibility(8);
            this.binding.replyAuthorAvatar.setImageURI(var55);
            val var59: TextView = this.binding.replyAuthorName;
            kotlin.jvm.internal.q.g(this.binding.replyAuthorName, "replyAuthorName");
            var59.setVisibility(0);
            this.binding.replyAuthorName.setText(var15.getUsername());
            this.binding.replyAuthorName.setTextColor(MessageKt.usernameColor$default(var15, 0, 1, null));
         } else {
            val var56: SimpleDraweeView = this.binding.replyAuthorAvatar;
            kotlin.jvm.internal.q.g(this.binding.replyAuthorAvatar, "replyAuthorAvatar");
            var56.setVisibility(8);
            val var57: TextView = this.binding.replyAuthorName;
            kotlin.jvm.internal.q.g(this.binding.replyAuthorName, "replyAuthorName");
            var57.setVisibility(8);
            val var58: SimpleDraweeView = this.binding.replyIcon;
            kotlin.jvm.internal.q.g(this.binding.replyIcon, "replyIcon");
            var5 = 8;
            if (var15.isPollResult() xor true) {
               var5 = 0;
            }

            var58.setVisibility(var5);
         }

         if (var10.getSystemContent() != null) {
            val var60: MessageContentView = this.binding.replyText;
            val var67: LinearLayout = this.binding.replyLeadingViews;
            kotlin.jvm.internal.q.g(this.binding.replyLeadingViews, "replyLeadingViews");
            val var14: StructurableText = var10.getSystemContent();
            val var37: Context = this.getContext();
            val var13: java.lang.String = var15.getId-3Eiw7ao();
            val var9: Boolean = MessageKt.shouldAnimateEmoji(var15);
            var2 = MessageKt.shouldShowLinkDecorations(var15);
            val var8: Boolean = var15.getShouldShowRoleDot();
            val var33: Boolean = var15.getShouldShowRoleOnName();
            val var16: FontMetrics = this.binding.replyText.getPaint().getFontMetrics();
            kotlin.jvm.internal.q.g(var16, "getFontMetrics(...)");
            val var4: Float = TextUtilsKt.getBaselineHeightPx(var16);
            val var17: TextPaint = this.binding.replyText.getPaint();
            kotlin.jvm.internal.q.e(var37);
            kotlin.jvm.internal.q.e(var17);
            val var18: DraweeSpanStringBuilder = TextUtilsKt.toSpannable$default(
               var14,
               var37,
               var13,
               var9,
               var2,
               var8,
               var33,
               var17,
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
               11534208,
               null
            );
            val var38: MessageContentView = this.binding.replyText;
            kotlin.jvm.internal.q.g(this.binding.replyText, "replyText");
            SpannableExtensionsKt.coverWithSpan(var18, new BackgroundSpanDrawer(var38));
            var60.setDraweeSpanStringBuilder(ReplyUtilsKt.createSystemReplyContentFromBuilder(var67, var18));
         } else if (var15.getContent() != null) {
            val var40: MessageContentView = this.binding.replyText;
            val var62: LinearLayout = this.binding.replyLeadingViews;
            kotlin.jvm.internal.q.g(this.binding.replyLeadingViews, "replyLeadingViews");
            val var68: StructurableText = var15.getContent();
            val var71: Context = this.getContext();
            val var72: java.lang.String = var15.getId-3Eiw7ao();
            val var36: Boolean = MessageKt.shouldAnimateEmoji(var15);
            val var35: Boolean = MessageKt.shouldShowLinkDecorations(var15);
            var2 = var15.getShouldShowRoleDot();
            val var34: Boolean = var15.getShouldShowRoleOnName();
            val var19: FontMetrics = this.binding.replyText.getPaint().getFontMetrics();
            kotlin.jvm.internal.q.g(var19, "getFontMetrics(...)");
            val var28: Float = TextUtilsKt.getBaselineHeightPx(var19);
            val var20: TextPaint = this.binding.replyText.getPaint();
            kotlin.jvm.internal.q.e(var71);
            kotlin.jvm.internal.q.e(var20);
            val var21: DraweeSpanStringBuilder = TextUtilsKt.toSpannable$default(
               var68,
               var71,
               var72,
               var36,
               var35,
               var2,
               var34,
               var20,
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
               var28,
               null,
               11534208,
               null
            );
            val var69: MessageContentView = this.binding.replyText;
            kotlin.jvm.internal.q.g(this.binding.replyText, "replyText");
            SpannableExtensionsKt.coverWithSpan(var21, new BackgroundSpanDrawer(var69));
            var40.setDraweeSpanStringBuilder(ReplyUtilsKt.createReplyContent(var62, var21));
         } else {
            this.binding.replyText.setText(null);
         }
      } else if (var1 is SystemReferencedMessage) {
         val var41: ChannelSpineView = this.binding.replySpline;
         kotlin.jvm.internal.q.g(this.binding.replySpline, "replySpline");
         val var30: Byte;
         if (var2) {
            var30 = 0;
         } else {
            var30 = 8;
         }

         var41.setVisibility(var30);
         val var42: LinearLayout = this.binding.replyLeadingViews;
         kotlin.jvm.internal.q.g(this.binding.replyLeadingViews, "replyLeadingViews");
         var42.setVisibility(0);
         val var43: SimpleDraweeView = this.binding.replyAuthorAvatar;
         kotlin.jvm.internal.q.g(this.binding.replyAuthorAvatar, "replyAuthorAvatar");
         var43.setVisibility(0);
         val var44: SimpleDraweeView = this.binding.replyAuthorAvatar;
         kotlin.jvm.internal.q.g(this.binding.replyAuthorAvatar, "replyAuthorAvatar");
         ReactAssetUtilsKt.setReactAsset(var44, ReactAsset.DefaultAvatar0);
         val var45: TextView = this.binding.replyAuthorName;
         kotlin.jvm.internal.q.g(this.binding.replyAuthorName, "replyAuthorName");
         var45.setVisibility(8);
         val var46: SimpleDraweeView = this.binding.replyIcon;
         kotlin.jvm.internal.q.g(this.binding.replyIcon, "replyIcon");
         var46.setVisibility(8);
         this.binding.replyIcon.setBackgroundColor(ThemeManagerKt.getTheme().getBackgroundTertiary());
         val var47: MessageContentView = this.binding.replyText;
         kotlin.jvm.internal.q.g(this.binding.replyText, "replyText");
         var47.setVisibility(0);
         val var48: MessageContentView = this.binding.replyText;
         val var64: LinearLayout = this.binding.replyLeadingViews;
         kotlin.jvm.internal.q.g(this.binding.replyLeadingViews, "replyLeadingViews");
         var48.setDraweeSpanStringBuilder(ReplyUtilsKt.createSystemReplyContent(var64, (var1 as SystemReferencedMessage).getContent()));
         val var22: SimpleDraweeView = this.binding.replyTrailingIcon;
         kotlin.jvm.internal.q.g(this.binding.replyTrailingIcon, "replyTrailingIcon");
         var22.setVisibility(8);
      }

      if (this.binding.replyText.isLaidOut() && this.binding.replyText.getWidth() > 0) {
         this.binding.replyText.measure(MeasureSpec.makeMeasureSpec(this.binding.replyText.getWidth(), Integer.MIN_VALUE), MeasureSpec.makeMeasureSpec(0, 0));
         this.binding.replyText.getLineBounds(0, this.replyTextLineBounds);
         val var31: Int = this.replyTextLineBounds.bottom;
         val var32: Int = this.replyTextLineBounds.top;
         val var49: LinearLayout = this.binding.replyLeadingViews;
         kotlin.jvm.internal.q.g(this.binding.replyLeadingViews, "replyLeadingViews");
         val var25: android.view.ViewGroup.LayoutParams = var49.getLayoutParams();
         if (var25 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
         }

         var25.height = var31 - var32;
         var49.setLayoutParams(var25);
      }

      this.setImportantForAccessibility(1);
      r0.q0(
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
               kotlin.jvm.internal.q.h(var1, "host");
               kotlin.jvm.internal.q.h(var2, "info");
               super.onInitializeAccessibilityNodeInfo(var1, var2);
               val var3: Context = this.this$0.getContext();
               kotlin.jvm.internal.q.g(var3, "getContext(...)");
               val var4: SpannableStringBuilder = new SpannableStringBuilder(
                  I18nUtilsKt.i18nFormat$default(var3, I18nMessage.MOBILE_REPLY_PREVIEW_A11Y_LABEL, null, 2, null)
               );
               var4.append(", ");
               var4.append(MessageViewReplyPreview.access$getBinding$p(this.this$0).replyAuthorName.getText());
               var4.append(", ");
               var4.append(MessageViewReplyPreview.access$getBinding$p(this.this$0).replyText.getText());
               var2.u0(var4);
               val var5: Context = this.this$0.getContext();
               kotlin.jvm.internal.q.g(var5, "getContext(...)");
               var2.b(
                  new AccessibilityNodeInfoCompat.a(
                     16, I18nUtilsKt.i18nFormat$default(var5, I18nMessage.MOBILE_SCROLL_TO_MESSAGE_ACTION_A11Y_LABEL, null, 2, null)
                  )
               );
            }

            @Override
            public boolean performAccessibilityAction(View var1, int var2, Bundle var3) {
               kotlin.jvm.internal.q.h(var1, "host");
               if (var2 == 16) {
                  this.$onClick.invoke();
               }

               return super.performAccessibilityAction(var1, var2, var3);
            }
         }
      );
   }
}

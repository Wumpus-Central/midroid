package com.discord.chat.presentation.message.view

import android.content.Context
import android.graphics.Paint.FontMetrics
import android.text.TextPaint
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View.OnClickListener
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import com.discord.SetTextSizeSpKt
import com.discord.chat.bridge.contentnode.LinkContentNode
import com.discord.chat.bridge.forums.PostSharePrompt
import com.discord.chat.bridge.structurabletext.StructurableText
import com.discord.chat.databinding.ForumPostActionBarViewBinding
import com.discord.chat.presentation.root.ChatView
import com.discord.chat.presentation.textutils.TextUtilsKt
import com.discord.core.DCDButton
import com.discord.fonts.DiscordFont
import com.discord.fonts.DiscordFontUtilsKt
import com.discord.image.fresco.SimpleDraweeSpanTextViewUtilsKt
import com.discord.misc.utilities.size.SizeUtilsKt
import com.discord.primitives.MessageId
import com.discord.react_asset_fetcher.ReactAssetUtilsKt
import com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchUtilsKt
import com.discord.react_strings.I18nMessage
import com.discord.react_strings.I18nUtilsKt
import com.discord.react_strings.RenderContext
import com.discord.reactions.AddReactionView
import com.discord.reactions.ReactionsView
import com.discord.reactions.ReactionView.Reaction
import com.discord.reactions.ReactionView.ReactionsTheme
import com.discord.ripple.RippleUtilsKt
import com.discord.theme.ThemeManagerKt
import com.discord.theme.R.color
import com.facebook.drawee.span.SimpleDraweeSpanTextView
import com.facebook.drawee.view.SimpleDraweeView
import kotlin.jvm.functions.Function1
import kotlin.jvm.functions.Function2

public class ForumPostActionBarView  public constructor(context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0) : ConstraintLayout {
   private final val binding: ForumPostActionBarViewBinding

   fun ForumPostActionBarView(var1: Context) {
      kotlin.jvm.internal.q.h(var1, "context");
      this(var1, null, 0, 6, null);
   }

   fun ForumPostActionBarView(var1: Context, var2: AttributeSet) {
      kotlin.jvm.internal.q.h(var1, "context");
      this(var1, var2, 0, 4, null);
   }

   init {
      kotlin.jvm.internal.q.h(var1, "context");
      super(var1, var2, var3);
      val var6: ForumPostActionBarViewBinding = ForumPostActionBarViewBinding.inflate(LayoutInflater.from(var1), this);
      kotlin.jvm.internal.q.g(var6, "inflate(...)");
      this.binding = var6;
      var6.footerDivider.setBackgroundColor(ThemeManagerKt.getTheme().getBackgroundSecondary());
      var6.headerDivider.setBackgroundColor(ThemeManagerKt.getTheme().getBackgroundModifierAccent());
      var var4: DCDButton = var6.followButton;
      var6.followButton.setCornerRadius(SizeUtilsKt.getDpToPx(8));
      var4.setTextSizeSp(14.0F);
      var4.setBackgroundColor(ThemeManagerKt.getTheme().getBackgroundSecondary());
      var4 = var6.shareButton;
      var6.shareButton.setCornerRadius(SizeUtilsKt.getDpToPx(8));
      var4.setTextSizeSp(14.0F);
      var4.setBackgroundColor(ThemeManagerKt.getTheme().getBackgroundSecondary());
      var4.setTextColor(ThemeManagerKt.getTheme().getInteractiveNormal());
      var4.setIconPadding(0);
      var var5: DCDButton = var6.otherReactionsCount;
      val var9: DiscordFont = DiscordFont.PrimarySemibold;
      var6.otherReactionsCount.setDiscordFont(DiscordFont.PrimarySemibold);
      var5.setTextSizeSp(14.0F);
      var5.setBackgroundColor(ThemeManagerKt.getTheme().getBackgroundSecondary());
      var5.setTextColor(ThemeManagerKt.getTheme().getInteractiveNormal());
      val var11: TextView = var6.sharePromptTitle;
      var6.sharePromptTitle.setTextColor(ThemeManagerKt.getTheme().getHeaderPrimary());
      kotlin.jvm.internal.q.e(var11);
      SetTextSizeSpKt.setTextSizeSp(var11, 16.0F);
      DiscordFontUtilsKt.setDiscordFont(var11, var9);
      val var12: SimpleDraweeSpanTextView = var6.sharePromptSubtitle;
      var6.sharePromptSubtitle.setTextColor(ThemeManagerKt.getTheme().getTextNormal());
      kotlin.jvm.internal.q.e(var12);
      SetTextSizeSpKt.setTextSizeSp(var12, 14.0F);
      val var10: DiscordFont = DiscordFont.PrimaryMedium;
      DiscordFontUtilsKt.setDiscordFont(var12, DiscordFont.PrimaryMedium);
      var5 = var6.sharePromptCopyLinkButton;
      var6.sharePromptCopyLinkButton.setCornerRadius(SizeUtilsKt.getDpToPx(20));
      var5.setTextSizeSp(14.0F);
      var5.setBackgroundColor(var1.getColor(color.brand_500));
      var5.setTextColor(ThemeManagerKt.getTheme().getWhite());
      var5.setDiscordFont(var10);
      var5.setIconPadding(8);
      val var7: DCDButton = var6.sharePromptCloseButton;
      var6.sharePromptCloseButton.setTextColor(ThemeManagerKt.getTheme().getInteractiveNormal());
      var7.setBackgroundColor(0);
      var7.setContentDescription(I18nUtilsKt.i18nFormat$default(var1, I18nMessage.DISMISS, null, 2, null));
   }

   private fun setReactions(
      messageId: String,
      reactionsToDisplay: List<Reaction>,
      reactionsTheme: ReactionsTheme?,
      onAddReactionClick: OnClickListener,
      onReactionClick: (Reaction) -> Unit,
      onReactionLongPress: (Reaction) -> Unit = <unrepresentable>.INSTANCE
   ) {
      var var7: ReactionsView = this.binding.reactionsView;
      kotlin.jvm.internal.q.g(this.binding.reactionsView, "reactionsView");
      var7.setVisibility(0);
      var7 = this.binding.reactionsView;
      kotlin.jvm.internal.q.g(this.binding.reactionsView, "reactionsView");
      ReactionsView.setReactions$default(
         var7, var1, var2, false, false, "", "", "", var3, var4, null, var5, var6, null, ChatView.Companion.getAreChatAnimationsEnabled(), 4608, null
      );
   }

   private fun setSharePrompt(
      messageId: MessageId,
      postSharePrompt: PostSharePrompt?,
      onTapShareForumPost: OnClickListener,
      shareIcon: String?,
      onTapDismissSharePrompt: OnClickListener,
      onLinkClicked: (MessageId, LinkContentNode) -> Unit
   ) {
      val var9: ConstraintLayout = this.binding.sharePromptContainer;
      kotlin.jvm.internal.q.g(this.binding.sharePromptContainer, "sharePromptContainer");
      var var8: Boolean;
      if (var2 != null) {
         var8 = 1;
      } else {
         var8 = 0;
      }

      if (var8) {
         var8 = 0;
      } else {
         var8 = 8;
      }

      var9.setVisibility(var8);
      if (var2 != null) {
         this.binding.sharePromptTitle.setText(var2.getTitle());
         val var18: DCDButton = this.binding.sharePromptCopyLinkButton;
         if (var4 != null) {
            this.binding.sharePromptCopyLinkButton.setIcon(var4, SizeUtilsKt.getDpToPx(16));
         }

         this.binding.sharePromptCopyLinkButton.setText(var2.getCta());
         var18.setContentDescription(var2.getCta());
         var18.setOnClickButtonListener(var3);
         val var11: DCDButton = this.binding.sharePromptCloseButton;
         this.binding.sharePromptCloseButton.setIcon(var2.getCloseIcon(), SizeUtilsKt.getDpToPx(16));
         var11.setOnClickButtonListener(var5);
         val var12: SimpleDraweeView = this.binding.sharePromptIcon;
         kotlin.jvm.internal.q.g(this.binding.sharePromptIcon, "sharePromptIcon");
         ReactAssetUtilsKt.setOptionalReactImageUrl(var12, var2.getIcon());
         val var13: SimpleDraweeSpanTextView = this.binding.sharePromptSubtitle;
         kotlin.jvm.internal.q.e(this.binding.sharePromptSubtitle);
         val var10: StructurableText = var2.getSubtitle();
         val var14: Context = var13.getContext();
         val var15: FontMetrics = var13.getPaint().getFontMetrics();
         kotlin.jvm.internal.q.g(var15, "getFontMetrics(...)");
         val var7: Float = TextUtilsKt.getBaselineHeightPx(var15);
         val var16: TextPaint = var13.getPaint();
         kotlin.jvm.internal.q.e(var14);
         kotlin.jvm.internal.q.e(var16);
         SimpleDraweeSpanTextViewUtilsKt.setOptionalText(
            var13, TextUtilsKt.toSpannable$default(var10, var14, var1, false, false, false, false, var16, new Function1(var6, var1) {
               final java.lang.String $messageId;
               final Function2 $onLinkClicked;

               {
                  super(1);
                  this.$onLinkClicked = var1;
                  this.$messageId = var2;
               }

               public final void invoke(LinkContentNode var1) {
                  kotlin.jvm.internal.q.h(var1, "node");
                  this.$onLinkClicked.invoke(MessageId.box-impl(this.$messageId), var1);
               }
            }, null, null, null, null, null, null, null, null, null, null, null, null, false, null, var7, null, 12582656, null)
         );
         NestedScrollOnTouchUtilsKt.enableNestedSpanClickListener$default(var13, false, 1, null);
      }
   }

   public fun configure(
      messageId: MessageId,
      numDisplayedReactions: Int,
      isFollowing: Boolean,
      followIcon: String?,
      followLabel: String,
      shareIcon: String?,
      shareLabel: String,
      reactions: List<Reaction>?,
      defaultReaction: Reaction?,
      canAddNewReactions: Boolean,
      addNewReactionAccessibilityLabel: String,
      reactionsTheme: ReactionsTheme?,
      onAddReactionClick: OnClickListener,
      onReactionClick: (Reaction) -> Unit,
      onReactionLongPress: (Reaction) -> Unit,
      onTapFollowForumPost: OnClickListener,
      onTapShareForumPost: OnClickListener,
      onTapReactionOverflow: OnClickListener,
      sharePrompt: PostSharePrompt?,
      onDismissSharePromptClick: OnClickListener,
      onLinkClicked: (MessageId, LinkContentNode) -> Unit
   ) {
      kotlin.jvm.internal.q.h(var1, "messageId");
      kotlin.jvm.internal.q.h(var5, "followLabel");
      kotlin.jvm.internal.q.h(var7, "shareLabel");
      kotlin.jvm.internal.q.h(var11, "addNewReactionAccessibilityLabel");
      kotlin.jvm.internal.q.h(var13, "onAddReactionClick");
      kotlin.jvm.internal.q.h(var14, "onReactionClick");
      kotlin.jvm.internal.q.h(var15, "onReactionLongPress");
      kotlin.jvm.internal.q.h(var16, "onTapFollowForumPost");
      kotlin.jvm.internal.q.h(var17, "onTapShareForumPost");
      kotlin.jvm.internal.q.h(var18, "onTapReactionOverflow");
      kotlin.jvm.internal.q.h(var20, "onDismissSharePromptClick");
      kotlin.jvm.internal.q.h(var21, "onLinkClicked");
      if (var8 != null && !var8.isEmpty()) {
         val var36: java.util.List = kotlin.collections.i.J0(var8, --var2);
         val var23: ReactionsView = this.binding.reactionsView;
         kotlin.jvm.internal.q.g(this.binding.reactionsView, "reactionsView");
         var23.setVisibility(0);
         this.setReactions(MessageId.toString-impl(var1), var36, var12, var13, var14, var15);
         val var22: Int = Math.max(var8.size() - var2, 0);
         val var37: DCDButton = this.binding.otherReactionsCount;
         kotlin.jvm.internal.q.e(this.binding.otherReactionsCount);
         var var25: Boolean;
         if (var22 != 0) {
            var25 = 1;
         } else {
            var25 = 0;
         }

         if (var25) {
            var25 = 0;
         } else {
            var25 = 8;
         }

         var37.setVisibility(var25);
         if (var37.getVisibility() == 0) {
            val var34: Context = var37.getContext();
            kotlin.jvm.internal.q.g(var34, "getContext(...)");
            var37.setText(I18nUtilsKt.i18nFormat(var34, I18nMessage.FORUM_REACTIONS_OVERFLOW, new Function1(var22) {
               final int $otherReactionsCount;

               {
                  super(1);
                  this.$otherReactionsCount = var1;
               }

               public final void invoke(RenderContext var1) {
                  kotlin.jvm.internal.q.h(var1, "$this$i18nFormat");
                  var1.getArgs().put("count", java.lang.String.valueOf(this.$otherReactionsCount));
               }
            }));
            RippleUtilsKt.addRipple$default(var37, true, 0, 2, null);
            var37.setOnClickButtonListener(var18);
         }
      } else {
         val var31: DCDButton = this.binding.otherReactionsCount;
         kotlin.jvm.internal.q.g(this.binding.otherReactionsCount, "otherReactionsCount");
         var31.setVisibility(8);
         if (var9 != null && var10) {
            setReactions$default(this, MessageId.toString-impl(var1), kotlin.collections.i.e(var9), var12, var13, var14, null, 32, null);
         } else {
            val var32: ReactionsView = this.binding.reactionsView;
            kotlin.jvm.internal.q.g(this.binding.reactionsView, "reactionsView");
            var32.setVisibility(8);
         }
      }

      val var35: DCDButton = this.binding.followButton;
      if (var4 != null) {
         this.binding.followButton.setIcon(var4, SizeUtilsKt.getDpToPx(16));
      }

      this.binding.followButton.setText(var5);
      var35.setContentDescription(var5);
      if (var3) {
         var2 = ThemeManagerKt.getTheme().getTextBrand();
      } else {
         var2 = ThemeManagerKt.getTheme().getInteractiveNormal();
      }

      var35.setTextColor(var2);
      var35.setOnClickButtonListener(var16);
      val var29: DCDButton = this.binding.shareButton;
      if (var6 != null) {
         this.binding.shareButton.setIcon(var6, SizeUtilsKt.getDpToPx(16));
      }

      this.binding.shareButton.setOnClickButtonListener(var17);
      var29.setContentDescription(var7);
      val var30: AddReactionView = this.binding.addReaction;
      kotlin.jvm.internal.q.e(this.binding.addReaction);
      val var28: Byte;
      if (var10) {
         var28 = 0;
      } else {
         var28 = 8;
      }

      var30.setVisibility(var28);
      if (var30.getVisibility() == 0) {
         RippleUtilsKt.addRipple$default(var30, true, 0, 2, null);
         var30.setContentDescription(var11);
         NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(var30, false, var13, 1, null);
      }

      this.setSharePrompt-LdU2QRA(var1, var19, var17, var6, var20, var21);
   }
}

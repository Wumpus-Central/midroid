package com.discord.chat.presentation.list.messagebundling

import android.content.Context
import android.graphics.Rect
import android.graphics.Paint.FontMetrics
import android.text.TextPaint
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.view.View.MeasureSpec
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import com.discord.SetTextSizeSpKt
import com.discord.chat.bridge.Message
import com.discord.chat.bridge.MessageKt
import com.discord.chat.bridge.structurabletext.StructurableText
import com.discord.chat.databinding.MessageBundleConversationViewBinding
import com.discord.chat.presentation.events.ChatEventHandler
import com.discord.chat.presentation.list.item.MessageItem
import com.discord.chat.presentation.message.utils.ReplyUtilsKt
import com.discord.chat.presentation.message.view.MessageContentView
import com.discord.chat.presentation.root.MessageContext
import com.discord.chat.presentation.spine.SpineParentMessage
import com.discord.chat.presentation.textutils.TextUtilsKt
import com.discord.fonts.DiscordFont
import com.discord.fonts.DiscordFontUtilsKt
import com.discord.misc.utilities.view.ViewClippingUtilsKt
import com.discord.misc.utilities.view.ViewUtilsKt
import com.discord.primitives.MessageFlag
import com.discord.primitives.MessageFlagKt
import com.discord.react_strings.I18nMessage
import com.discord.react_strings.I18nUtilsKt
import com.discord.reactions.ReactionView
import com.discord.reactions.ShortcutsFlexbox
import com.discord.span.utilities.BackgroundSpanDrawer
import com.discord.span.utilities.SpannableExtensionsKt
import com.discord.theme.ThemeManagerKt
import com.facebook.drawee.span.DraweeSpanStringBuilder
import com.facebook.drawee.view.SimpleDraweeView
import kotlin.jvm.internal.r

public class MessageBundleConversationView  public constructor(context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0)
   : ConstraintLayout,
   SpineParentMessage {
   private final val binding: MessageBundleConversationViewBinding
   private final val replyTextLineBounds: Rect

   public open val spineOriginView: View
      public open get() {
         val var1: SimpleDraweeView = this.binding.replyAuthorAvatar;
         r.g(this.binding.replyAuthorAvatar, "replyAuthorAvatar");
         return var1;
      }


   fun MessageBundleConversationView(var1: Context) {
      r.h(var1, "context");
      this(var1, null, 0, 6, null);
   }

   fun MessageBundleConversationView(var1: Context, var2: AttributeSet) {
      r.h(var1, "context");
      this(var1, var2, 0, 4, null);
   }

   init {
      r.h(var1, "context");
      super(var1, var2, var3);
      val var4: MessageBundleConversationViewBinding = MessageBundleConversationViewBinding.inflate(LayoutInflater.from(var1), this);
      r.g(var4, "inflate(...)");
      this.binding = var4;
      this.replyTextLineBounds = new Rect();
      val var6: TextView = var4.replyAuthorName;
      r.g(var4.replyAuthorName, "replyAuthorName");
      DiscordFontUtilsKt.setDiscordFont(var6, DiscordFont.PrimarySemibold);
      val var7: TextView = var4.replyAuthorName;
      r.g(var4.replyAuthorName, "replyAuthorName");
      SetTextSizeSpKt.setTextSizeSp(var7, 12.0F);
      val var8: SimpleDraweeView = var4.replyAuthorAvatar;
      r.g(var4.replyAuthorAvatar, "replyAuthorAvatar");
      ViewClippingUtilsKt.clipToCircle(var8);
      val var5: MessageContentView = var4.replyText;
      r.e(var4.replyText);
      DiscordFontUtilsKt.setDiscordFont(var5, DiscordFont.PrimaryMedium);
      SetTextSizeSpKt.setTextSizeSp(var5, 12.0F);
      var5.setTextColor(ThemeManagerKt.getTheme().getTextNormal());
   }

   @JvmStatic
   fun `configure$lambda$7$lambda$5`(var0: ChatEventHandler, var1: Message, var2: View) {
      ChatEventHandler.DefaultImpls.onTapReaction-AFFcxXc$default(var0, var1.getId-3Eiw7ao(), null, null, null, 12, null);
   }

   @JvmStatic
   fun `configure$lambda$7$lambda$6`(var0: ChatEventHandler, var1: Message, var2: ReactionView.Reaction): Unit {
      r.h(var2, "it");
      ChatEventHandler.DefaultImpls.onTapReaction-AFFcxXc$default(var0, var1.getId-3Eiw7ao(), var2, null, null, 12, null);
      return Unit.a;
   }

   public fun configure(messageItem: MessageItem, eventHandler: ChatEventHandler) {
      r.h(var1, "messageItem");
      r.h(var2, "eventHandler");
      val var12: Message = var1.getMessage();
      val var13: MessageContext = var1.getMessageContext();
      val var17: Context = this.getContext();
      r.g(var17, "getContext(...)");
      this.binding.replyAuthorAvatar.setImageURI(MessageKt.avatarUrl(var12, var17));
      val var19: TextView = this.binding.replyAuthorName;
      r.e(this.binding.replyAuthorName);
      ViewUtilsKt.setOptionalText(var19, var12.getUsername());
      var19.setTextColor(MessageKt.usernameColor$default(var12, 0, 1, null));
      val var21: DraweeSpanStringBuilder;
      if (var12.getContent() != null) {
         val var20: TextView = this.binding.replyAuthorName;
         r.g(this.binding.replyAuthorName, "replyAuthorName");
         val var14: StructurableText = var12.getContent();
         val var11: Context = this.getContext();
         r.g(var11, "getContext(...)");
         val var15: java.lang.String = var12.getId-3Eiw7ao();
         val var9: Boolean = MessageKt.shouldAnimateEmoji(var12);
         val var10: Boolean = MessageKt.shouldShowLinkDecorations(var12);
         val var8: Boolean = var12.getShouldShowRoleDot();
         val var7: Boolean = var12.getShouldShowRoleOnName();
         val var16: FontMetrics = this.binding.replyText.getPaint().getFontMetrics();
         r.g(var16, "getFontMetrics(...)");
         val var3: Float = TextUtilsKt.getBaselineHeightPx(var16);
         val var37: TextPaint = this.binding.replyText.getPaint();
         r.g(var37, "getPaint(...)");
         val var28: DraweeSpanStringBuilder = TextUtilsKt.toSpannable$default(
            var14,
            var11,
            var15,
            var9,
            var10,
            var8,
            var7,
            var37,
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
            var3,
            null,
            46137216,
            null
         );
         val var34: MessageContentView = this.binding.replyText;
         r.g(this.binding.replyText, "replyText");
         SpannableExtensionsKt.coverWithSpan(var28, new BackgroundSpanDrawer(var34));
         var21 = ReplyUtilsKt.createReplyContent(var20, var28);
      } else if (MessageFlagKt.hasMessageFlag(var12.getFlags(), MessageFlag.IS_COMPONENTS_V2)) {
         val var29: TextView = this.binding.replyAuthorName;
         r.g(this.binding.replyAuthorName, "replyAuthorName");
         val var22: Context = this.getContext();
         r.g(var22, "getContext(...)");
         var21 = ReplyUtilsKt.createSystemReplyContent(
            var29, I18nUtilsKt.i18nFormat$default(var22, I18nMessage.REPLY_QUOTE_COMPONENTS_V2_MOBILE, null, 2, null).toString()
         );
      } else {
         val var30: TextView = this.binding.replyAuthorName;
         r.g(this.binding.replyAuthorName, "replyAuthorName");
         val var23: Context = this.getContext();
         r.g(var23, "getContext(...)");
         var21 = ReplyUtilsKt.createSystemReplyContent(
            var30, I18nUtilsKt.i18nFormat$default(var23, I18nMessage.REPLY_QUOTE_NO_TEXT_CONTENT_MOBILE, null, 2, null).toString()
         );
      }

      val var31: MessageContentView = this.binding.replyText;
      this.binding.replyText.setDraweeSpanStringBuilder(var21);
      if (var31.isLaidOut() && var31.getWidth() > 0) {
         var31.measure(MeasureSpec.makeMeasureSpec(var31.getWidth(), Integer.MIN_VALUE), MeasureSpec.makeMeasureSpec(0, 0));
         var31.getLineBounds(0, this.replyTextLineBounds);
         val var32: TextView = this.binding.replyAuthorName;
         r.g(this.binding.replyAuthorName, "replyAuthorName");
         val var35: android.view.ViewGroup.LayoutParams = var32.getLayoutParams();
         if (var35 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
         }

         var35.height = this.replyTextLineBounds.bottom - this.replyTextLineBounds.top;
         var32.setLayoutParams(var35);
      }

      val var36: ShortcutsFlexbox = this.binding.reactionsView;
      val var33: java.util.List = var12.getReactions();
      var var25: java.util.List = var33;
      if (var33 == null) {
         var25 = i.k();
      }

      ShortcutsFlexbox.setReactions$default(
         var36,
         var25,
         var13.getCanAddNewReactions(),
         var13.getAddReactionLabel(),
         var13.getAddNewReactionAccessibilityLabel(),
         var13.getReactionsTheme(),
         new e(var2, var12),
         new f(var2, var12),
         null,
         null,
         384,
         null
      );
      r.e(var36);
      val var26: java.util.List = var12.getReactions();
      var var4: Byte = 1;
      if (var26 != null) {
         if (var26.isEmpty()) {
            var4 = 1;
         } else {
            var4 = 0;
         }
      }

      if (!var4) {
         var4 = 0;
      } else {
         var4 = 8;
      }

      var36.setVisibility(var4);
   }
}

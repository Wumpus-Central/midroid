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
import com.discord.chat.presentation.root.ChatView
import com.discord.chat.presentation.root.MessageContext
import com.discord.chat.presentation.spine.SpineParentMessage
import com.discord.chat.presentation.textutils.TextUtilsKt
import com.discord.fonts.DiscordFont
import com.discord.fonts.DiscordFontUtilsKt
import com.discord.misc.utilities.view.ViewClippingUtilsKt
import com.discord.misc.utilities.view.ViewUtilsKt
import com.discord.react_strings.I18nMessage
import com.discord.react_strings.I18nUtilsKt
import com.discord.reactions.ReactionView
import com.discord.reactions.ReactionsView
import com.discord.span.utilities.BackgroundSpanDrawer
import com.discord.span.utilities.SpannableExtensionsKt
import com.discord.theme.ThemeManagerKt
import com.facebook.drawee.span.DraweeSpanStringBuilder
import com.facebook.drawee.view.SimpleDraweeView
import kotlin.jvm.functions.Function1
import kotlin.jvm.internal.q

public class MessageBundleConversationView  public constructor(context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0)
   : ConstraintLayout,
   SpineParentMessage {
   private final val binding: MessageBundleConversationViewBinding
   private final val replyTextLineBounds: Rect

   public open val spineOriginView: View
      public open get() {
         val var1: SimpleDraweeView = this.binding.replyAuthorAvatar;
         q.g(this.binding.replyAuthorAvatar, "replyAuthorAvatar");
         return var1;
      }


   fun MessageBundleConversationView(var1: Context) {
      q.h(var1, "context");
      this(var1, null, 0, 6, null);
   }

   fun MessageBundleConversationView(var1: Context, var2: AttributeSet) {
      q.h(var1, "context");
      this(var1, var2, 0, 4, null);
   }

   init {
      q.h(var1, "context");
      super(var1, var2, var3);
      val var4: MessageBundleConversationViewBinding = MessageBundleConversationViewBinding.inflate(LayoutInflater.from(var1), this);
      q.g(var4, "inflate(...)");
      this.binding = var4;
      this.replyTextLineBounds = new Rect();
      val var6: TextView = var4.replyAuthorName;
      q.g(var4.replyAuthorName, "replyAuthorName");
      DiscordFontUtilsKt.setDiscordFont(var6, DiscordFont.PrimarySemibold);
      val var7: TextView = var4.replyAuthorName;
      q.g(var4.replyAuthorName, "replyAuthorName");
      SetTextSizeSpKt.setTextSizeSp(var7, 12.0F);
      val var8: SimpleDraweeView = var4.replyAuthorAvatar;
      q.g(var4.replyAuthorAvatar, "replyAuthorAvatar");
      ViewClippingUtilsKt.clipToCircle(var8);
      val var5: MessageContentView = var4.replyText;
      q.e(var4.replyText);
      DiscordFontUtilsKt.setDiscordFont(var5, DiscordFont.PrimaryMedium);
      SetTextSizeSpKt.setTextSizeSp(var5, 12.0F);
      var5.setTextColor(ThemeManagerKt.getTheme().getTextNormal());
   }

   @JvmStatic
   fun `configure$lambda$7$lambda$5`(var0: ChatEventHandler, var1: Message, var2: View) {
      q.h(var0, "$eventHandler");
      q.h(var1, "$message");
      ChatEventHandler.DefaultImpls.onTapReaction-u7_MRrM$default(var0, var1.getId-3Eiw7ao(), null, null, 4, null);
   }

   @JvmStatic
   fun `configure$lambda$7$lambda$6`(var0: ChatEventHandler, var1: Message, var2: View) {
      q.h(var0, "$eventHandler");
      q.h(var1, "$message");
      var0.onTapReaction-u7_MRrM(var1.getId-3Eiw7ao(), null, java.lang.Boolean.TRUE);
   }

   public fun configure(messageItem: MessageItem, eventHandler: ChatEventHandler) {
      q.h(var1, "messageItem");
      q.h(var2, "eventHandler");
      val var11: Message = var1.getMessage();
      val var12: MessageContext = var1.getMessageContext();
      val var16: Context = this.getContext();
      q.g(var16, "getContext(...)");
      this.binding.replyAuthorAvatar.setImageURI(MessageKt.avatarUrl(var11, var16));
      val var18: TextView = this.binding.replyAuthorName;
      q.e(this.binding.replyAuthorName);
      ViewUtilsKt.setOptionalText(var18, var11.getUsername());
      var18.setTextColor(MessageKt.usernameColor$default(var11, 0, 1, null));
      val var20: DraweeSpanStringBuilder;
      if (var11.getContent() != null) {
         val var19: TextView = this.binding.replyAuthorName;
         q.g(this.binding.replyAuthorName, "replyAuthorName");
         val var13: StructurableText = var11.getContent();
         val var14: Context = this.getContext();
         val var10: java.lang.String = var11.getId-3Eiw7ao();
         val var8: Boolean = MessageKt.shouldAnimateEmoji(var11);
         val var9: Boolean = MessageKt.shouldShowLinkDecorations(var11);
         val var6: Boolean = var11.getShouldShowRoleDot();
         val var7: Boolean = var11.getShouldShowRoleOnName();
         val var15: FontMetrics = this.binding.replyText.getPaint().getFontMetrics();
         q.g(var15, "getFontMetrics(...)");
         val var3: Float = TextUtilsKt.getBaselineHeightPx(var15);
         val var35: TextPaint = this.binding.replyText.getPaint();
         q.e(var14);
         q.e(var35);
         val var26: DraweeSpanStringBuilder = TextUtilsKt.toSpannable$default(
            var13,
            var14,
            var10,
            var8,
            var9,
            var6,
            var7,
            var35,
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
            11534208,
            null
         );
         val var31: MessageContentView = this.binding.replyText;
         q.g(this.binding.replyText, "replyText");
         SpannableExtensionsKt.coverWithSpan(var26, new BackgroundSpanDrawer(var31));
         var20 = ReplyUtilsKt.createReplyContent(var19, var26);
      } else {
         val var21: TextView = this.binding.replyAuthorName;
         q.g(this.binding.replyAuthorName, "replyAuthorName");
         val var27: Context = this.getContext();
         q.g(var27, "getContext(...)");
         var20 = ReplyUtilsKt.createSystemReplyContent(
            var21, I18nUtilsKt.i18nFormat$default(var27, I18nMessage.REPLY_QUOTE_NO_TEXT_CONTENT_MOBILE, null, 2, null).toString()
         );
      }

      val var28: MessageContentView = this.binding.replyText;
      this.binding.replyText.setDraweeSpanStringBuilder(var20);
      if (var28.isLaidOut() && var28.getWidth() > 0) {
         var28.measure(MeasureSpec.makeMeasureSpec(var28.getWidth(), Integer.MIN_VALUE), MeasureSpec.makeMeasureSpec(0, 0));
         var28.getLineBounds(0, this.replyTextLineBounds);
         val var29: TextView = this.binding.replyAuthorName;
         q.g(this.binding.replyAuthorName, "replyAuthorName");
         val var32: android.view.ViewGroup.LayoutParams = var29.getLayoutParams();
         if (var32 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
         }

         var32.height = this.replyTextLineBounds.bottom - this.replyTextLineBounds.top;
         var29.setLayoutParams(var32);
      }

      val var33: ReactionsView = this.binding.reactionsView;
      q.e(this.binding.reactionsView);
      val var34: java.lang.String = var11.getId-3Eiw7ao();
      val var30: java.util.List = var11.getReactions();
      var var23: java.util.List = var30;
      if (var30 == null) {
         var23 = i.j();
      }

      ReactionsView.setReactions$default(
         var33,
         var34,
         var23,
         var12.getCanAddNewReactions(),
         var12.getUseAddBurstReaction(),
         var12.getAddReactionLabel(),
         var12.getAddNewReactionAccessibilityLabel(),
         var12.getAddNewBurstReactionAccessibilityLabel(),
         var12.getReactionsTheme(),
         new b(var2, var11),
         new c(var2, var11),
         new Function1(var2, var11) {
            final ChatEventHandler $eventHandler;
            final Message $message;

            {
               super(1);
               this.$eventHandler = var1;
               this.$message = var2;
            }

            public final void invoke(ReactionView.Reaction var1) {
               q.h(var1, "it");
               ChatEventHandler.DefaultImpls.onTapReaction-u7_MRrM$default(this.$eventHandler, this.$message.getId-3Eiw7ao(), var1, null, 4, null);
            }
         },
         null,
         null,
         ChatView.Companion.getAreChatAnimationsEnabled(),
         6144,
         null
      );
      val var24: java.util.List = var11.getReactions();
      var var4: Boolean;
      if (var24 != null && !var24.isEmpty()) {
         var4 = 0;
      } else {
         var4 = 1;
      }

      if (true xor var4) {
         var4 = 0;
      } else {
         var4 = 8;
      }

      var33.setVisibility(var4);
   }
}

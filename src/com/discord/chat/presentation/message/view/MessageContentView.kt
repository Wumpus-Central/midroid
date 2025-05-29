package com.discord.chat.presentation.message.view

import android.content.Context
import android.graphics.Paint.FontMetrics
import android.text.Layout
import android.text.SpannableStringBuilder
import android.text.TextPaint
import android.text.style.ForegroundColorSpan
import android.text.style.RelativeSizeSpan
import android.util.AttributeSet
import android.view.View
import android.view.View.MeasureSpec
import android.view.View.OnClickListener
import android.view.ViewGroup.LayoutParams
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat
import com.discord.chat.bridge.contentnode.CommandMentionContentNode
import com.discord.chat.bridge.contentnode.EmojiContentNode
import com.discord.chat.bridge.contentnode.InlineCodeContentNode
import com.discord.chat.bridge.contentnode.LinkContentNode
import com.discord.chat.bridge.contentnode.SoundmojiContentNode
import com.discord.chat.bridge.structurabletext.StructurableText
import com.discord.chat.bridge.truncation.Truncation
import com.discord.chat.presentation.message.MessageAccessoriesView
import com.discord.chat.presentation.message.view.botuikit.MarkdownTextRenderEventHandlers
import com.discord.chat.presentation.message.view.botuikit.MarkdownTextRenderOptions
import com.discord.chat.presentation.textutils.LinkStyle
import com.discord.chat.presentation.textutils.TextUtilsKt
import com.discord.fonts.DiscordFont
import com.discord.primitives.MessageId
import com.discord.react_gesture_handler.nested_touch.NestedClickableSpan
import com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchUtilsKt
import com.discord.react_strings.I18nMessage
import com.discord.react_strings.I18nUtilsKt
import com.discord.recycler_view.decorations.VerticalSpacingItemDecoration
import com.discord.span.utilities.BackgroundSpanDrawer
import com.discord.span.utilities.SpannableExtensionsKt
import com.discord.span.utilities.spannable.BoldSpan
import com.discord.span.utilities.spannable.ClickableSpan
import com.discord.span.utilities.spannable.EmojiAccessibilitySpan
import com.discord.span.utilities.spannable.QuoteSpan
import com.discord.span.utilities.spannable.SpoilerSpan
import com.discord.theme.DiscordThemeObject
import com.discord.theme.ThemeManagerKt
import com.facebook.drawee.span.DraweeSpanStringBuilder
import com.facebook.drawee.span.SimpleDraweeSpanTextView
import kotlin.jvm.functions.Function1

public open class MessageContentView  public constructor(context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0)
   : SimpleDraweeSpanTextView,
   VerticalSpacingItemDecoration.SpacingProviderView {
   private final var bottomSpacingPx: Int?

   private final val shadowView: SimpleDraweeSpanTextView
      private final get() {
         return this.shadowView$delegate.getValue() as SimpleDraweeSpanTextView;
      }


   open fun MessageContentView(var1: Context) {
      kotlin.jvm.internal.q.h(var1, "context");
      this(var1, null, 0, 6, null);
   }

   open fun MessageContentView(var1: Context, var2: AttributeSet) {
      kotlin.jvm.internal.q.h(var1, "context");
      this(var1, var2, 0, 4, null);
   }

   init {
      kotlin.jvm.internal.q.h(var1, "context");
      super(var1, var2, var3);
      this.shadowView$delegate = R8.j.b(new E0(this));
      this.setLineSpacing(0.0F, 1.05F);
   }

   private fun appendEditedLabel(spannableStringBuilder: SpannableStringBuilder, editedLabel: String, editedLabelTextColor: Int?) {
      val var6: Array<Any> = var1.getSpans(var1.length(), var1.length(), QuoteSpan.class);
      kotlin.jvm.internal.q.g(var6, "getSpans(...)");
      val var7: QuoteSpan = kotlin.collections.c.L(var6) as QuoteSpan;
      val var5: Int = var1.length();
      val var8: StringBuilder = new StringBuilder();
      var8.append(" (");
      var8.append(var2);
      var8.append(")");
      var1.append(var8.toString());
      var1.setSpan(new RelativeSizeSpan(0.75F), var5, var1.length(), 33);
      val var4: Int;
      if (var3 != null) {
         var4 = var3;
      } else {
         var4 = ThemeManagerKt.getTheme().getTextMuted();
      }

      var1.setSpan(new ForegroundColorSpan(var4), var5, var1.length(), 33);
      if (var7 != null) {
         var1.setSpan(var7, var1.getSpanStart(var7), var1.length(), var1.getSpanFlags(var7));
      }
   }

   @JvmStatic
   fun `setMessageContent$lambda$1`(var0: LinkContentNode): LinkStyle {
      kotlin.jvm.internal.q.h(var0, "it");
      return new LinkStyle(DiscordFont.PrimaryNormal, ThemeManagerKt.getTheme().getTextLink(), null, null, 12, null);
   }

   @JvmStatic
   fun `setMessageContent_AeCz66Y$lambda$2`(var0: LinkContentNode): LinkStyle {
      kotlin.jvm.internal.q.h(var0, "<unused var>");
      return new LinkStyle(null, 0, null, null, 15, null);
   }

   @JvmStatic
   fun `shadowView_delegate$lambda$0`(var0: MessageContentView): SimpleDraweeSpanTextView {
      val var1: SimpleDraweeSpanTextView = new SimpleDraweeSpanTextView(var0.getContext());
      var1.setBreakStrategy(var0.getBreakStrategy());
      var1.setLayoutParams(new LayoutParams(-1, -2));
      return var1;
   }

   private fun truncate(
      messageId: MessageId,
      truncation: Truncation,
      constrainedWidth: Int,
      spannableStringBuilder: DraweeSpanStringBuilder,
      onTapSeeMore: (MessageId) -> Unit,
      isForwardedContent: Boolean
   ) {
      val var9: Boolean = kotlin.jvm.internal.q.c(var2.getForceShow(), java.lang.Boolean.TRUE);
      var var7: Int = var2.getNumberOfLines();
      val var8: Boolean = var2.getExpandable();
      var3 = MessageAccessoriesView.Companion.getWidth(var3, var6);
      this.getShadowView().setTypeface(this.getTypeface());
      this.getShadowView().setTextSize(0, this.getTextSize());
      this.getShadowView().setLineSpacing(0.0F, 1.05F);
      this.getShadowView().setDraweeSpanStringBuilder(var4);
      this.getShadowView().measure(MeasureSpec.makeMeasureSpec(var3, 1073741824), MeasureSpec.makeMeasureSpec(0, 0));
      this.getShadowView().layout(0, 0, this.getShadowView().getMeasuredWidth(), this.getShadowView().getMeasuredHeight());
      val var10: Layout = this.getShadowView().getLayout();
      var3 = this.getShadowView().getLineCount();
      if (var3 > var7 || var9) {
         if (var9) {
            var3--;
         } else {
            var3 = var7 - 1;
         }

         var7 = var10.getLineVisibleEnd(var3);
         if (var8) {
            val var18: java.lang.String = var2.getSeeMoreLabel();
            val var12: Int = var2.getSeeMoreLabelColor();
            val var11: StringBuilder = new StringBuilder();
            var11.append("\n");
            var11.append(var18);
            var4.replace(var7, var4.length(), var11.toString());
            val var20: NestedClickableSpan.TouchPriority = NestedClickableSpan.TouchPriority.HIGH;
            if (var12 != null) {
               var3 = var12;
            } else {
               var3 = ThemeManagerKt.getTheme().getTextLink();
            }

            var4.setSpan(new ClickableSpan(var20, var3, null, null, 0.0F, null, null, new D0(var5, var1), 124, null), var7, var4.length(), 33);
            var4.setSpan(new BoldSpan(), var7, var4.length(), 33);
         } else {
            var4.delete(var7, var4.length());
         }
      }
   }

   @JvmStatic
   fun `truncate_LdU2QRA$lambda$3`(var0: Function1, var1: java.lang.String, var2: View): Unit {
      kotlin.jvm.internal.q.h(var2, "it");
      var0.invoke(MessageId.box-impl(var1));
      return Unit.a;
   }

   public fun setMessageContent(
      messageContent: StructurableText,
      options: MarkdownTextRenderOptions,
      eventHandlers: MarkdownTextRenderEventHandlers,
      emojiBaselineHeightOverridePx: Float? = null
   ) {
      kotlin.jvm.internal.q.h(var1, "messageContent");
      kotlin.jvm.internal.q.h(var2, "options");
      kotlin.jvm.internal.q.h(var3, "eventHandlers");
      setMessageContent-AeCz66Y$default(
         this,
         var1,
         MessageId.constructor-impl(var2.getContainerId()),
         var2.getShouldAnimateEmoji(),
         var2.getShouldShowLinkDecorations(),
         var2.getShouldShowRoleDot(),
         var2.getShouldShowRoleOnName(),
         var3.getOnLinkClicked(),
         var3.getOnLinkLongClicked(),
         var3.getOnTapChannel(),
         var3.getOnLongPressChannel(),
         var3.getOnTapAttachmentLink(),
         var3.getOnLongPressAttachmentLink(),
         var3.getOnTapMention(),
         var3.getOnTapCommand(),
         var3.getOnLongPressCommand(),
         var3.getOnTapSpoiler(),
         var3.getOnTapTimestamp(),
         var3.getOnTapInlineCode(),
         var3.getOnTapEmoji(),
         <unrepresentable>.INSTANCE,
         var3.getOnTapSoundmoji(),
         new F0(),
         0,
         0,
         false,
         null,
         null,
         null,
         null,
         var4,
         503316480,
         null
      );
   }

   public fun setMessageContent(
      messageContent: StructurableText,
      messageId: MessageId,
      shouldAnimateEmoji: Boolean,
      shouldShowLinkDecorations: Boolean,
      shouldShowRoleDot: Boolean,
      shouldShowRoleOnName: Boolean,
      onTapLink: (LinkContentNode) -> Unit,
      onLongTapLink: (LinkContentNode) -> Unit,
      onTapChannel: (String, String?, String?) -> Unit,
      onLongPressChannel: (String, String?, String?, String?) -> Unit,
      onTapAttachmentLink: (String) -> Unit,
      onLongPressAttachmentLink: (String, String) -> Unit,
      onTapMention: (String?, String, String?, String?) -> Unit,
      onTapCommand: (CommandMentionContentNode) -> Unit,
      onLongPressCommand: (CommandMentionContentNode) -> Unit,
      onTapSpoiler: () -> Unit,
      onTapTimestamp: (String) -> Unit,
      onTapInlineCode: (InlineCodeContentNode) -> Unit,
      onTapEmoji: (EmojiContentNode) -> Unit,
      onTapSeeMore: (MessageId) -> Unit,
      onTapSoundmoji: (SoundmojiContentNode) -> Unit,
      linkStyleProvider: (LinkContentNode) -> LinkStyle = ...,
      bottomSpacingPx: Int,
      constrainedWidth: Int,
      isForwardedContent: Boolean,
      editedLabel: String? = ...,
      editedLabelTextColor: Int? = ...,
      truncation: Truncation? = ...,
      theme: DiscordThemeObject = ...,
      emojiBaselineHeightOverridePx: Float? = ...
   ) {
      kotlin.jvm.internal.q.h(var1, "messageContent");
      kotlin.jvm.internal.q.h(var2, "messageId");
      kotlin.jvm.internal.q.h(var7, "onTapLink");
      kotlin.jvm.internal.q.h(var8, "onLongTapLink");
      kotlin.jvm.internal.q.h(var9, "onTapChannel");
      kotlin.jvm.internal.q.h(var10, "onLongPressChannel");
      kotlin.jvm.internal.q.h(var11, "onTapAttachmentLink");
      kotlin.jvm.internal.q.h(var12, "onLongPressAttachmentLink");
      kotlin.jvm.internal.q.h(var13, "onTapMention");
      kotlin.jvm.internal.q.h(var14, "onTapCommand");
      kotlin.jvm.internal.q.h(var15, "onLongPressCommand");
      kotlin.jvm.internal.q.h(var16, "onTapSpoiler");
      kotlin.jvm.internal.q.h(var17, "onTapTimestamp");
      kotlin.jvm.internal.q.h(var18, "onTapInlineCode");
      kotlin.jvm.internal.q.h(var19, "onTapEmoji");
      kotlin.jvm.internal.q.h(var20, "onTapSeeMore");
      kotlin.jvm.internal.q.h(var21, "onTapSoundmoji");
      kotlin.jvm.internal.q.h(var22, "linkStyleProvider");
      kotlin.jvm.internal.q.h(var29, "theme");
      val var32: Context = this.getContext();
      kotlin.jvm.internal.q.g(var32, "getContext(...)");
      val var33: FontMetrics = this.getPaint().getFontMetrics();
      kotlin.jvm.internal.q.g(var33, "getFontMetrics(...)");
      val var31: Float = TextUtilsKt.getBaselineHeightPx(var33);
      val var35: TextPaint = this.getPaint();
      kotlin.jvm.internal.q.g(var35, "getPaint(...)");
      val var34: DraweeSpanStringBuilder = TextUtilsKt.toSpannable$default(
         var1,
         var32,
         var2,
         var3,
         var4,
         var5,
         var6,
         var35,
         var7,
         var8,
         var9,
         var10,
         var11,
         var12,
         var13,
         var14,
         var15,
         var17,
         var18,
         var19,
         var22,
         var16,
         var21,
         false,
         var29,
         var31,
         var30,
         4194304,
         null
      );
      if (var26 != null && !kotlin.text.h.c0(var26)) {
         this.appendEditedLabel(var34, var26, var27);
      }

      if (var28 != null) {
         this.truncate-LdU2QRA(var2, var28, var24, var34, var20, var25);
      }

      SpannableExtensionsKt.coverWithSpan(var34, new BackgroundSpanDrawer(this));
      this.setDraweeSpanStringBuilder(var34);
      this.bottomSpacingPx = var23;
      NestedScrollOnTouchUtilsKt.enableNestedSpanClickListener(this, true);
      androidx.core.view.a0.p0(this, new MessageContentView.MessageContentViewAccessibilityDelegate(this));
   }

   public open fun setOnClickListener(l: OnClickListener?) {
      throw new UnsupportedOperationException("MessageContentView uses custom touch handling. click listeners are not supported");
   }

   public override fun spacingPxOverride(): Int? {
      return this.bottomSpacingPx;
   }

   public companion object {
      private const val LINE_SPACING_MULT: Float
      private const val LINE_SPACING_ADD: Float
   }

   public class MessageContentViewAccessibilityDelegate(view: MessageContentView) : androidx.core.view.a {
      private final val view: MessageContentView

      init {
         kotlin.jvm.internal.q.h(var1, "view");
         super();
         this.view = var1;
      }

      public override fun onInitializeAccessibilityNodeInfo(host: View, info: AccessibilityNodeInfoCompat) {
         kotlin.jvm.internal.q.h(var1, "host");
         kotlin.jvm.internal.q.h(var2, "info");
         super.onInitializeAccessibilityNodeInfo(var1, var2);
         val var5: SpannableStringBuilder = new SpannableStringBuilder(this.view.getText());
         var var6: java.util.Iterator = kotlin.jvm.internal.b.a(var5.getSpans(0, var5.length(), SpoilerSpan.class));

         while (var6.hasNext()) {
            val var7: SpoilerSpan = var6.next() as SpoilerSpan;
            if (!var7.isRevealed()) {
               val var3: Int = var5.getSpanStart(var7);
               val var4: Int = var5.getSpanEnd(var7);
               val var10: Context = var1.getContext();
               kotlin.jvm.internal.q.g(var10, "getContext(...)");
               var5.replace(var3, var4, I18nUtilsKt.i18nFormat$default(var10, I18nMessage.SPOILER_HIDDEN_A11Y_LABEL, null, 2, null));
            }
         }

         var6 = kotlin.jvm.internal.b.a(var5.getSpans(0, var5.length(), EmojiAccessibilitySpan.class));

         while (var6.hasNext()) {
            val var8: EmojiAccessibilitySpan = var6.next() as EmojiAccessibilitySpan;
            var5.replace(var5.getSpanStart(var8), var5.getSpanEnd(var8), var8.getName());
         }

         var2.U0(var5);
      }
   }
}

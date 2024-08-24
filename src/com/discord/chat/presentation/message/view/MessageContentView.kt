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
import com.discord.chat.bridge.contentnode.CommandMentionContentNode
import com.discord.chat.bridge.contentnode.EmojiContentNode
import com.discord.chat.bridge.contentnode.LinkContentNode
import com.discord.chat.bridge.structurabletext.StructurableText
import com.discord.chat.bridge.truncation.Truncation
import com.discord.chat.presentation.message.MessageAccessoriesView
import com.discord.chat.presentation.message.view.botuikit.MarkdownTextRenderEventHandlers
import com.discord.chat.presentation.message.view.botuikit.MarkdownTextRenderOptions
import com.discord.chat.presentation.textutils.LinkStyle
import com.discord.chat.presentation.textutils.TextUtilsKt
import com.discord.primitives.MessageId
import com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchUtilsKt
import com.discord.react_gesture_handler.nested_touch.NestedClickableSpan.TouchPriority
import com.discord.recycler_view.decorations.VerticalSpacingItemDecoration.SpacingProviderView
import com.discord.span.utilities.BackgroundSpanDrawer
import com.discord.span.utilities.SpannableExtensionsKt
import com.discord.span.utilities.spannable.BoldSpan
import com.discord.span.utilities.spannable.ClickableSpan
import com.discord.span.utilities.spannable.QuoteSpan
import com.discord.theme.DiscordThemeObject
import com.discord.theme.ThemeManagerKt
import com.facebook.drawee.span.DraweeSpanStringBuilder
import com.facebook.drawee.span.SimpleDraweeSpanTextView
import kotlin.jvm.functions.Function0
import kotlin.jvm.functions.Function1

public class MessageContentView  public constructor(context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0)
   : SimpleDraweeSpanTextView,
   SpacingProviderView {
   private final var bottomSpacingPx: Int?

   private final val shadowView: SimpleDraweeSpanTextView
      private final get() {
         return this.shadowView$delegate.getValue() as SimpleDraweeSpanTextView;
      }


   fun MessageContentView(var1: Context) {
      kotlin.jvm.internal.r.h(var1, "context");
      this(var1, null, 0, 6, null);
   }

   fun MessageContentView(var1: Context, var2: AttributeSet) {
      kotlin.jvm.internal.r.h(var1, "context");
      this(var1, var2, 0, 4, null);
   }

   init {
      kotlin.jvm.internal.r.h(var1, "context");
      super(var1, var2, var3);
      this.shadowView$delegate = eh.l.b(new Function0<SimpleDraweeSpanTextView>(this) {
         final MessageContentView this$0;

         {
            super(0);
            this.this$0 = var1;
         }

         public final SimpleDraweeSpanTextView invoke() {
            val var1: SimpleDraweeSpanTextView = new SimpleDraweeSpanTextView(this.this$0.getContext());
            var1.setBreakStrategy(this.this$0.getBreakStrategy());
            var1.setLayoutParams(new LayoutParams(-1, -2));
            return var1;
         }
      });
      this.setLineSpacing(0.0F, 1.05F);
      this.setImportantForAccessibility(4);
   }

   private fun appendEditedLabel(spannableStringBuilder: SpannableStringBuilder, editedLabel: String, editedLabelTextColor: Int?) {
      val var6: Array<Any> = var1.getSpans(var1.length(), var1.length(), QuoteSpan.class);
      kotlin.jvm.internal.r.g(var6, "spannableStringBuilder.g…an::class.java,\n        )");
      val var8: QuoteSpan = kotlin.collections.b.E(var6) as QuoteSpan;
      val var5: Int = var1.length();
      val var7: StringBuilder = new StringBuilder();
      var7.append(" (");
      var7.append(var2);
      var7.append(")");
      var1.append(var7.toString());
      var1.setSpan(new RelativeSizeSpan(0.75F), var5, var1.length(), 33);
      val var4: Int;
      if (var3 != null) {
         var4 = var3;
      } else {
         var4 = ThemeManagerKt.getTheme().getTextMuted();
      }

      var1.setSpan(new ForegroundColorSpan(var4), var5, var1.length(), 33);
      if (var8 != null) {
         var1.setSpan(var8, var1.getSpanStart(var8), var1.length(), var1.getSpanFlags(var8));
      }
   }

   private fun truncate(
      messageId: MessageId,
      truncation: Truncation,
      constrainedWidth: Int,
      spannableStringBuilder: DraweeSpanStringBuilder,
      onTapSeeMore: (MessageId) -> Unit,
      isForwardedContent: Boolean
   ) {
      val var8: Boolean = kotlin.jvm.internal.r.c(var2.getForceShow(), java.lang.Boolean.TRUE);
      var var7: Int = var2.getNumberOfLines();
      val var9: Boolean = var2.getExpandable();
      var3 = MessageAccessoriesView.Companion.getWidth(var3, var6, false);
      this.getShadowView().setTypeface(this.getTypeface());
      this.getShadowView().setTextSize(0, this.getTextSize());
      this.getShadowView().setLineSpacing(0.0F, 1.05F);
      this.getShadowView().setDraweeSpanStringBuilder(var4);
      this.getShadowView().measure(MeasureSpec.makeMeasureSpec(var3, 1073741824), MeasureSpec.makeMeasureSpec(0, 0));
      this.getShadowView().layout(0, 0, this.getShadowView().getMeasuredWidth(), this.getShadowView().getMeasuredHeight());
      val var10: Layout = this.getShadowView().getLayout();
      var3 = this.getShadowView().getLineCount();
      if (var3 > var7 || var8) {
         if (var8) {
            var3--;
         } else {
            var3 = var7 - 1;
         }

         var7 = var10.getLineVisibleEnd(var3);
         if (var9) {
            val var18: java.lang.String = var2.getSeeMoreLabel();
            val var12: Int = var2.getSeeMoreLabelColor();
            val var11: StringBuilder = new StringBuilder();
            var11.append("\n");
            var11.append(var18);
            var4.replace(var7, var4.length(), var11.toString());
            val var20: TouchPriority = TouchPriority.HIGH;
            if (var12 != null) {
               var3 = var12;
            } else {
               var3 = ThemeManagerKt.getTheme().getTextLink();
            }

            var4.setSpan(new ClickableSpan(var20, var3, null, null, new Function1<View, Unit>(var5, var1) {
               final java.lang.String $messageId;
               final Function1<MessageId, Unit> $onTapSeeMore;

               {
                  super(1);
                  this.$onTapSeeMore = var1;
                  this.$messageId = var2;
               }

               public final void invoke(View var1) {
                  kotlin.jvm.internal.r.h(var1, "it");
                  this.$onTapSeeMore.invoke(MessageId.box-impl(this.$messageId));
               }
            }, 12, null), var7, var4.length(), 33);
            var4.setSpan(new BoldSpan(), var7, var4.length(), 33);
         } else {
            var4.delete(var7, var4.length());
         }
      }
   }

   public fun setMessageContent(
      messageContent: StructurableText,
      options: MarkdownTextRenderOptions,
      eventHandlers: MarkdownTextRenderEventHandlers,
      emojiBaselineHeightOverridePx: Float? = null
   ) {
      kotlin.jvm.internal.r.h(var1, "messageContent");
      kotlin.jvm.internal.r.h(var2, "options");
      kotlin.jvm.internal.r.h(var3, "eventHandlers");
      setMessageContent-2ZcwkLU$default(
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
         var3.getOnTapEmoji(),
         <unrepresentable>.INSTANCE,
         <unrepresentable>.INSTANCE,
         0,
         0,
         false,
         null,
         null,
         null,
         null,
         var4,
         125829120,
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
      onTapEmoji: (EmojiContentNode) -> Unit,
      onTapSeeMore: (MessageId) -> Unit,
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
      kotlin.jvm.internal.r.h(var1, "messageContent");
      kotlin.jvm.internal.r.h(var2, "messageId");
      kotlin.jvm.internal.r.h(var7, "onTapLink");
      kotlin.jvm.internal.r.h(var8, "onLongTapLink");
      kotlin.jvm.internal.r.h(var9, "onTapChannel");
      kotlin.jvm.internal.r.h(var10, "onLongPressChannel");
      kotlin.jvm.internal.r.h(var11, "onTapAttachmentLink");
      kotlin.jvm.internal.r.h(var12, "onLongPressAttachmentLink");
      kotlin.jvm.internal.r.h(var13, "onTapMention");
      kotlin.jvm.internal.r.h(var14, "onTapCommand");
      kotlin.jvm.internal.r.h(var15, "onLongPressCommand");
      kotlin.jvm.internal.r.h(var16, "onTapSpoiler");
      kotlin.jvm.internal.r.h(var17, "onTapTimestamp");
      kotlin.jvm.internal.r.h(var18, "onTapEmoji");
      kotlin.jvm.internal.r.h(var19, "onTapSeeMore");
      kotlin.jvm.internal.r.h(var20, "linkStyleProvider");
      kotlin.jvm.internal.r.h(var27, "theme");
      val var31: Context = this.getContext();
      val var32: FontMetrics = this.getPaint().getFontMetrics();
      kotlin.jvm.internal.r.g(var32, "paint.fontMetrics");
      val var29: Float = TextUtilsKt.getBaselineHeightPx(var32);
      val var34: TextPaint = this.getPaint();
      kotlin.jvm.internal.r.g(var31, "context");
      kotlin.jvm.internal.r.g(var34, "paint");
      val var33: DraweeSpanStringBuilder = TextUtilsKt.toSpannable$default(
         var1,
         var31,
         var2,
         var3,
         var4,
         var5,
         var6,
         var34,
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
         var20,
         var16,
         false,
         var27,
         var29,
         var28,
         1048576,
         null
      );
      val var30: Boolean;
      if (var24 != null && !kotlin.text.f.x(var24)) {
         var30 = false;
      } else {
         var30 = true;
      }

      if (!var30) {
         this.appendEditedLabel(var33, var24, var25);
      }

      if (var26 != null) {
         this.truncate-LdU2QRA(var2, var26, var22, var33, var19, var23);
      }

      SpannableExtensionsKt.coverWithSpan(var33, new BackgroundSpanDrawer(this));
      this.setDraweeSpanStringBuilder(var33);
      this.bottomSpacingPx = var21;
      NestedScrollOnTouchUtilsKt.enableNestedSpanClickListener(this, true);
   }

   public open fun setOnClickListener(l: OnClickListener?) {
      throw new UnsupportedOperationException("MessageContentView uses custom touch handling. click listeners are not supported");
   }

   public open fun spacingPxOverride(): Int? {
      return this.bottomSpacingPx;
   }

   public companion object {
      private const val LINE_SPACING_ADD: Float
      private const val LINE_SPACING_MULT: Float
   }
}

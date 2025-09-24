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
import com.discord.recycler_view.decorations.VerticalSpacingItemDecoration
import com.discord.span.utilities.BackgroundSpanDrawer
import com.discord.span.utilities.SpannableExtensionsKt
import com.discord.span.utilities.spannable.BoldSpan
import com.discord.span.utilities.spannable.ClickableSpan
import com.discord.span.utilities.spannable.QuoteSpan
import com.discord.theme.DiscordThemeObject
import com.discord.theme.ThemeManagerKt
import com.facebook.drawee.span.DraweeSpanStringBuilder
import com.facebook.drawee.span.SimpleDraweeSpanTextView
import kotlin.jvm.functions.Function1

public open class MessageContentView  public constructor(context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0) : SimpleDraweeSpanTextView(
         var1, var2, var3
      ),
   VerticalSpacingItemDecoration.SpacingProviderView {
   private final var bottomSpacingPx: Int?

   private final val shadowView: SimpleDraweeSpanTextView by B9.j.b(new E0(this))
      private final get() {
         return this.shadowView$delegate.getValue() as SimpleDraweeSpanTextView;
      }


   open fun MessageContentView(var1: Context) {
      this(var1, null, 0, 6, null);
   }

   open fun MessageContentView(var1: Context, var2: AttributeSet) {
      this(var1, var2, 0, 4, null);
   }

   init {
      this.setLineSpacing(0.0F, 1.05F);
   }

   private fun appendEditedLabel(spannableStringBuilder: SpannableStringBuilder, editedLabel: String, editedLabelTextColor: Int?) {
      val var6: Array<Any> = var1.getSpans(var1.length(), var1.length(), QuoteSpan.class);
      val var7: QuoteSpan = kotlin.collections.h.L(var6) as QuoteSpan;
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
      return new LinkStyle(DiscordFont.PrimaryNormal, ThemeManagerKt.getTheme().getTextLink(), null, null, 12, null);
   }

   @JvmStatic
   fun `setMessageContent_AeCz66Y$lambda$2`(var0: LinkContentNode): LinkStyle {
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
      val var9: Boolean = var2.getForceShow() == java.lang.Boolean.TRUE;
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
      var0.invoke(MessageId.box-impl(var1));
      return Unit.a;
   }

   public fun setMessageContent(
      messageContent: StructurableText,
      options: MarkdownTextRenderOptions,
      eventHandlers: MarkdownTextRenderEventHandlers,
      emojiBaselineHeightOverridePx: Float? = null
   ) {
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
      val var32: Context = this.getContext();
      val var33: FontMetrics = this.getPaint().getFontMetrics();
      val var31: Float = TextUtilsKt.getBaselineHeightPx(var33);
      val var35: TextPaint = this.getPaint();
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
      if (var26 != null && !StringsKt.c0(var26)) {
         this.appendEditedLabel(var34, var26, var27);
      }

      if (var28 != null) {
         this.truncate-LdU2QRA(var2, var28, var24, var34, var20, var25);
      }

      SpannableExtensionsKt.coverWithSpan(var34, new BackgroundSpanDrawer(this));
      this.setDraweeSpanStringBuilder(var34);
      this.bottomSpacingPx = var23;
      NestedScrollOnTouchUtilsKt.enableNestedSpanClickListener(this, true);
      androidx.core.view.Z.o0(this, new MessageContentView.MessageContentViewAccessibilityDelegate(this));
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
         this.view = var1;
      }

      public override fun onInitializeAccessibilityNodeInfo(host: View, info: AccessibilityNodeInfoCompat) {
         // $VF: Couldn't be decompiled
         // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
         // java.lang.NullPointerException: Cannot read field "bytecode" because the return value of "org.jetbrains.java.decompiler.modules.decompiler.exps.InvocationExprent.getInstance()" is null
         //   at org.vineflower.kotlin.pass.KMergePass.matchForEach(KMergePass.java:165)
         //   at org.vineflower.kotlin.pass.KMergePass.enhanceLoop(KMergePass.java:52)
         //   at org.vineflower.kotlin.pass.KMergePass.enhanceLoopsRec(KMergePass.java:39)
         //   at org.vineflower.kotlin.pass.KMergePass.enhanceLoopsRec(KMergePass.java:34)
         //   at org.vineflower.kotlin.pass.KMergePass.enhanceLoopsRec(KMergePass.java:34)
         //   at org.vineflower.kotlin.pass.KMergePass.run(KMergePass.java:23)
         //   at org.jetbrains.java.decompiler.api.plugin.pass.NamedPass.run(NamedPass.java:18)
         //   at org.jetbrains.java.decompiler.api.plugin.pass.LoopingPassBuilder$CompiledPass.run(LoopingPassBuilder.java:43)
         //   at org.jetbrains.java.decompiler.api.plugin.pass.NamedPass.run(NamedPass.java:18)
         //   at org.jetbrains.java.decompiler.api.plugin.pass.LoopingPassBuilder$CompiledPass.run(LoopingPassBuilder.java:43)
         //   at org.jetbrains.java.decompiler.api.plugin.pass.NamedPass.run(NamedPass.java:18)
         //   at org.jetbrains.java.decompiler.api.plugin.pass.MainPassBuilder$CompiledPass.run(MainPassBuilder.java:34)
         //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:160)
         //
         // Bytecode:
         // 00: aload 1
         // 01: ldc "host"
         // 03: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
         // 06: aload 2
         // 07: ldc "info"
         // 09: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
         // 0c: aload 0
         // 0d: aload 1
         // 0e: aload 2
         // 0f: invokespecial androidx/core/view/a.onInitializeAccessibilityNodeInfo (Landroid/view/View;Landroidx/core/view/accessibility/AccessibilityNodeInfoCompat;)V
         // 12: new android/text/SpannableStringBuilder
         // 15: dup
         // 16: aload 0
         // 17: getfield com/discord/chat/presentation/message/view/MessageContentView$MessageContentViewAccessibilityDelegate.view Lcom/discord/chat/presentation/message/view/MessageContentView;
         // 1a: invokevirtual android/widget/TextView.getText ()Ljava/lang/CharSequence;
         // 1d: invokespecial android/text/SpannableStringBuilder.<init> (Ljava/lang/CharSequence;)V
         // 20: astore 5
         // 22: aload 5
         // 24: bipush 0
         // 25: aload 5
         // 27: invokevirtual android/text/SpannableStringBuilder.length ()I
         // 2a: ldc com/discord/span/utilities/spannable/SpoilerSpan
         // 2c: invokevirtual android/text/SpannableStringBuilder.getSpans (IILjava/lang/Class;)[Ljava/lang/Object;
         // 2f: invokestatic kotlin/jvm/internal/ArrayIteratorKt.iterator ([Ljava/lang/Object;)Ljava/util/Iterator;
         // 32: astore 6
         // 34: aload 6
         // 36: invokeinterface java/util/Iterator.hasNext ()Z 1
         // 3b: ifeq 87
         // 3e: aload 6
         // 40: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
         // 45: checkcast com/discord/span/utilities/spannable/SpoilerSpan
         // 48: astore 7
         // 4a: aload 7
         // 4c: invokevirtual com/discord/span/utilities/spannable/SpoilerSpan.isRevealed ()Z
         // 4f: ifne 34
         // 52: aload 5
         // 54: aload 7
         // 56: invokevirtual android/text/SpannableStringBuilder.getSpanStart (Ljava/lang/Object;)I
         // 59: istore 3
         // 5a: aload 5
         // 5c: aload 7
         // 5e: invokevirtual android/text/SpannableStringBuilder.getSpanEnd (Ljava/lang/Object;)I
         // 61: istore 4
         // 63: aload 1
         // 64: invokevirtual android/view/View.getContext ()Landroid/content/Context;
         // 67: astore 7
         // 69: aload 7
         // 6b: ldc "getContext(...)"
         // 6d: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
         // 70: aload 5
         // 72: iload 3
         // 73: iload 4
         // 75: aload 7
         // 77: getstatic com/discord/react_strings/I18nMessage.SPOILER_HIDDEN_A11Y_LABEL Lcom/discord/react_strings/I18nMessage;
         // 7a: aconst_null
         // 7b: bipush 2
         // 7c: aconst_null
         // 7d: invokestatic com/discord/react_strings/I18nUtilsKt.i18nFormat$default (Landroid/content/Context;Lcom/discord/react_strings/I18nMessage;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/CharSequence;
         // 80: invokevirtual android/text/SpannableStringBuilder.replace (IILjava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;
         // 83: pop
         // 84: goto 34
         // 87: aload 5
         // 89: bipush 0
         // 8a: aload 5
         // 8c: invokevirtual android/text/SpannableStringBuilder.length ()I
         // 8f: ldc com/discord/span/utilities/spannable/EmojiAccessibilitySpan
         // 91: invokevirtual android/text/SpannableStringBuilder.getSpans (IILjava/lang/Class;)[Ljava/lang/Object;
         // 94: invokestatic kotlin/jvm/internal/ArrayIteratorKt.iterator ([Ljava/lang/Object;)Ljava/util/Iterator;
         // 97: astore 6
         // 99: aload 6
         // 9b: invokeinterface java/util/Iterator.hasNext ()Z 1
         // a0: ifeq c7
         // a3: aload 6
         // a5: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
         // aa: checkcast com/discord/span/utilities/spannable/EmojiAccessibilitySpan
         // ad: astore 1
         // ae: aload 5
         // b0: aload 5
         // b2: aload 1
         // b3: invokevirtual android/text/SpannableStringBuilder.getSpanStart (Ljava/lang/Object;)I
         // b6: aload 5
         // b8: aload 1
         // b9: invokevirtual android/text/SpannableStringBuilder.getSpanEnd (Ljava/lang/Object;)I
         // bc: aload 1
         // bd: invokevirtual com/discord/span/utilities/spannable/EmojiAccessibilitySpan.getName ()Ljava/lang/String;
         // c0: invokevirtual android/text/SpannableStringBuilder.replace (IILjava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;
         // c3: pop
         // c4: goto 99
         // c7: aload 2
         // c8: aload 5
         // ca: invokevirtual androidx/core/view/accessibility/AccessibilityNodeInfoCompat.V0 (Ljava/lang/CharSequence;)V
         // cd: return
      }
   }
}

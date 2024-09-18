package com.discord.chat.presentation.message.view

import android.content.Context
import android.graphics.Paint.FontMetrics
import android.text.TextPaint
import android.util.AttributeSet
import android.view.LayoutInflater
import androidx.constraintlayout.widget.ConstraintLayout
import com.discord.chat.bridge.contentnode.LinkContentNode
import com.discord.chat.bridge.feedback.SurveyIndication
import com.discord.chat.bridge.structurabletext.StructurableText
import com.discord.chat.databinding.SurveyActionViewBinding
import com.discord.chat.presentation.textutils.TextUtilsKt
import com.discord.fonts.DiscordFont
import com.discord.fonts.DiscordFontUtilsKt
import com.discord.image.fresco.SimpleDraweeSpanTextViewUtilsKt
import com.discord.primitives.MessageId
import com.discord.react_asset_fetcher.ReactAssetUtilsKt
import com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchUtilsKt
import com.discord.span.utilities.BackgroundSpanDrawer
import com.discord.span.utilities.SpannableExtensionsKt
import com.discord.theme.R
import com.discord.theme.ThemeManagerKt
import com.discord.theme.utils.ColorUtilsKt
import com.facebook.drawee.span.DraweeSpanStringBuilder
import com.facebook.drawee.span.SimpleDraweeSpanTextView
import com.facebook.drawee.view.SimpleDraweeView
import kotlin.jvm.functions.Function1
import kotlin.jvm.functions.Function2

public class SurveyIndicationView  public constructor(context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0) : ConstraintLayout {
   private final var binding: SurveyActionViewBinding

   fun SurveyIndicationView(var1: Context) {
      kotlin.jvm.internal.q.h(var1, "context");
      this(var1, null, 0, 6, null);
   }

   fun SurveyIndicationView(var1: Context, var2: AttributeSet) {
      kotlin.jvm.internal.q.h(var1, "context");
      this(var1, var2, 0, 4, null);
   }

   init {
      kotlin.jvm.internal.q.h(var1, "context");
      super(var1, var2, var3);
      val var6: SurveyActionViewBinding = SurveyActionViewBinding.inflate(LayoutInflater.from(var1), this);
      kotlin.jvm.internal.q.g(var6, "inflate(...)");
      this.binding = var6;
      var6.surveyCard.setCardBackgroundColor(ColorUtilsKt.getThemeColor(var1, R.color.white_500, R.color.primary_800));
      val var4: SimpleDraweeView = this.binding.chatListFeedbackIcon;
      kotlin.jvm.internal.q.g(this.binding.chatListFeedbackIcon, "chatListFeedbackIcon");
      ColorUtilsKt.setTintColor(var4, ThemeManagerKt.getTheme().getTextMuted());
      val var5: SimpleDraweeSpanTextView = this.binding.chatListAdapterItemTextFeedback;
      kotlin.jvm.internal.q.e(this.binding.chatListAdapterItemTextFeedback);
      DiscordFontUtilsKt.setDiscordFont(var5, DiscordFont.PrimaryMedium);
      var5.setTextColor(ThemeManagerKt.getTheme().getTextMuted());
   }

   public fun setSurveyIndication(messageId: MessageId, surveyIndication: SurveyIndication, onLinkClicked: (MessageId, LinkContentNode) -> Unit) {
      kotlin.jvm.internal.q.h(var1, "messageId");
      kotlin.jvm.internal.q.h(var2, "surveyIndication");
      kotlin.jvm.internal.q.h(var3, "onLinkClicked");
      val var5: SimpleDraweeView = this.binding.chatListFeedbackIcon;
      kotlin.jvm.internal.q.g(this.binding.chatListFeedbackIcon, "chatListFeedbackIcon");
      ReactAssetUtilsKt.setReactImageUrl(var5, var2.getFeedbackIconUrl());
      val var10: SimpleDraweeSpanTextView = this.binding.chatListAdapterItemTextFeedback;
      kotlin.jvm.internal.q.e(this.binding.chatListAdapterItemTextFeedback);
      val var6: StructurableText = var2.getContent();
      val var9: Context = var10.getContext();
      val var7: FontMetrics = var10.getPaint().getFontMetrics();
      kotlin.jvm.internal.q.g(var7, "getFontMetrics(...)");
      val var4: Float = TextUtilsKt.getBaselineHeightPx(var7);
      val var11: TextPaint = this.binding.chatListAdapterItemTextFeedback.getPaint();
      kotlin.jvm.internal.q.e(var9);
      kotlin.jvm.internal.q.e(var11);
      val var8: DraweeSpanStringBuilder = TextUtilsKt.toSpannable$default(var6, var9, var1, false, false, false, false, var11, new Function1(var3, var1) {
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
      }, null, null, null, null, null, null, null, null, null, null, null, null, false, null, var4, null, 12582656, null);
      SpannableExtensionsKt.coverWithSpan(var8, new BackgroundSpanDrawer(var10));
      SimpleDraweeSpanTextViewUtilsKt.setOptionalText(var10, var8);
      NestedScrollOnTouchUtilsKt.enableNestedSpanClickListener$default(var10, false, 1, null);
   }
}

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
import com.discord.theme.ThemeManagerKt
import com.discord.theme.R.color
import com.discord.theme.utils.ColorUtilsKt
import com.facebook.drawee.span.DraweeSpanStringBuilder
import com.facebook.drawee.span.SimpleDraweeSpanTextView
import com.facebook.drawee.view.SimpleDraweeView
import kotlin.jvm.functions.Function2
import kotlin.jvm.internal.SourceDebugExtension

@SourceDebugExtension(["SMAP\nSurveyIndicationView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SurveyIndicationView.kt\ncom/discord/chat/presentation/message/view/SurveyIndicationView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,72:1\n1#2:73\n*E\n"])
public class SurveyIndicationView  public constructor(context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0) : ConstraintLayout(var1, var2, var3) {
   private final var binding: SurveyActionViewBinding

   fun SurveyIndicationView(var1: Context) {
      this(var1, null, 0, 6, null);
   }

   fun SurveyIndicationView(var1: Context, var2: AttributeSet) {
      this(var1, var2, 0, 4, null);
   }

   init {
      val var6: SurveyActionViewBinding = SurveyActionViewBinding.inflate(LayoutInflater.from(var1), this);
      this.binding = var6;
      var6.surveyCard.setCardBackgroundColor(ColorUtilsKt.getThemeColor(var1, color.white_500, color.primary_800));
      val var4: SimpleDraweeView = this.binding.chatListFeedbackIcon;
      ColorUtilsKt.setTintColor(var4, ThemeManagerKt.getTheme().getTextMuted());
      val var5: SimpleDraweeSpanTextView = this.binding.chatListAdapterItemTextFeedback;
      DiscordFontUtilsKt.setDiscordFont(var5, DiscordFont.PrimaryMedium);
      var5.setTextColor(ThemeManagerKt.getTheme().getTextMuted());
   }

   @JvmStatic
   fun `setSurveyIndication_u7_MRrM$lambda$3$lambda$1`(var0: Function2, var1: java.lang.String, var2: LinkContentNode): Unit {
      var0.invoke(MessageId.box-impl(var1), var2);
      return Unit.a;
   }

   public fun setSurveyIndication(messageId: MessageId, surveyIndication: SurveyIndication, onLinkClicked: (MessageId, LinkContentNode) -> Unit) {
      val var5: SimpleDraweeView = this.binding.chatListFeedbackIcon;
      ReactAssetUtilsKt.setReactImageUrl(var5, var2.getFeedbackIconUrl());
      val var10: SimpleDraweeSpanTextView = this.binding.chatListAdapterItemTextFeedback;
      val var9: StructurableText = var2.getContent();
      val var6: Context = var10.getContext();
      val var7: FontMetrics = var10.getPaint().getFontMetrics();
      val var4: Float = TextUtilsKt.getBaselineHeightPx(var7);
      val var11: TextPaint = this.binding.chatListAdapterItemTextFeedback.getPaint();
      val var8: DraweeSpanStringBuilder = TextUtilsKt.toSpannable$default(
         var9,
         var6,
         var1,
         false,
         false,
         false,
         false,
         var11,
         new W0(var3, var1),
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
         false,
         null,
         var4,
         null,
         50331392,
         null
      );
      SpannableExtensionsKt.coverWithSpan(var8, new BackgroundSpanDrawer(var10));
      SimpleDraweeSpanTextViewUtilsKt.setOptionalText(var10, var8);
      NestedScrollOnTouchUtilsKt.enableNestedSpanClickListener$default(var10, false, 1, null);
   }
}

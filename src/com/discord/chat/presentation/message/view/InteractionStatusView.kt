package com.discord.chat.presentation.message.view

import android.content.Context
import android.graphics.Paint.FontMetrics
import android.text.TextPaint
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import com.discord.chat.bridge.interaction.InteractionStatus
import com.discord.chat.bridge.structurabletext.StructurableText
import com.discord.chat.databinding.InteractionStatusViewBinding
import com.discord.chat.presentation.textutils.TextUtilsKt
import com.discord.misc.utilities.view.ViewUtilsKt
import com.discord.primitives.MessageId
import com.discord.progress_dots.ProgressDots
import com.discord.react_asset_fetcher.ReactAsset
import com.discord.react_asset_fetcher.ReactAssetUtilsKt
import com.discord.span.utilities.BackgroundSpanDrawer
import com.discord.span.utilities.SpannableExtensionsKt
import com.discord.theme.ThemeManagerKt
import com.discord.theme.utils.ColorUtilsKt
import com.facebook.drawee.span.DraweeSpanStringBuilder
import com.facebook.drawee.view.SimpleDraweeView
import kotlin.jvm.internal.SourceDebugExtension

@SourceDebugExtension(["SMAP\nInteractionStatusView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InteractionStatusView.kt\ncom/discord/chat/presentation/message/view/InteractionStatusView\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,60:1\n257#2,2:61\n257#2,2:63\n1#3:65\n*S KotlinDebug\n*F\n+ 1 InteractionStatusView.kt\ncom/discord/chat/presentation/message/view/InteractionStatusView\n*L\n38#1:61,2\n39#1:63,2\n*E\n"])
public class InteractionStatusView  public constructor(context: Context, attrs: AttributeSet? = null) : ConstraintLayout(var1, var2) {
   private final var binding: InteractionStatusViewBinding

   fun InteractionStatusView(var1: Context) {
      this(var1, null, 2, null);
   }

   init {
      val var3: InteractionStatusViewBinding = InteractionStatusViewBinding.inflate(LayoutInflater.from(var1), this);
      this.binding = var3;
      val var4: SimpleDraweeView = var3.viewInteractionStatusDangerIcon;
      ReactAssetUtilsKt.setReactAsset(var4, ReactAsset.Warning);
      ColorUtilsKt.setTintColor(var4, ThemeManagerKt.getTheme().getTextDanger());
   }

   public fun setInteractionStatus(messageId: MessageId, interactionStatus: InteractionStatus) {
      val var7: ProgressDots = this.binding.viewInteractionStatusLoadingDots;
      var var4: Byte;
      if (var2.isLoading()) {
         var4 = 0;
      } else {
         var4 = 8;
      }

      var7.setVisibility(var4);
      val var14: SimpleDraweeView = this.binding.viewInteractionStatusDangerIcon;
      var4 = (byte)8;
      if (var2.isFailed()) {
         var4 = (byte)0;
      }

      var14.setVisibility(var4);
      val var15: TextView = this.binding.viewInteractionStatusLabelMessage;
      val var8: StructurableText = var2.getText();
      val var9: Context = var15.getContext();
      val var10: FontMetrics = var15.getPaint().getFontMetrics();
      val var3: Float = TextUtilsKt.getBaselineHeightPx(var10);
      val var16: TextPaint = var15.getPaint();
      val var11: DraweeSpanStringBuilder = TextUtilsKt.toSpannable$default(
         var8,
         var9,
         var1,
         false,
         false,
         false,
         false,
         var16,
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
         false,
         null,
         var3,
         null,
         50331520,
         null
      );
      SpannableExtensionsKt.coverWithSpan(var11, new BackgroundSpanDrawer(var15));
      ViewUtilsKt.setOptionalText(var15, var11);
      if (var2.isFailed()) {
         var4 = ThemeManagerKt.getTheme().getTextDanger();
      } else {
         var4 = ThemeManagerKt.getTheme().getTextMuted();
      }

      var15.setTextColor(var4);
   }
}

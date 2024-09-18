package com.discord.chat.presentation.message.view

import android.content.Context
import android.graphics.Paint.FontMetrics
import android.text.TextPaint
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import androidx.constraintlayout.widget.ConstraintLayout
import com.discord.SetTextSizeSpKt
import com.discord.chat.bridge.contentnode.LinkContentNode
import com.discord.chat.bridge.ephemeral.EphemeralIndication
import com.discord.chat.bridge.structurabletext.StructurableText
import com.discord.chat.databinding.EphemeralActionViewBinding
import com.discord.chat.presentation.textutils.TextUtilsKt
import com.discord.fonts.DiscordFont
import com.discord.fonts.DiscordFontUtilsKt
import com.discord.image.fresco.SimpleDraweeSpanTextViewUtilsKt
import com.discord.primitives.MessageId
import com.discord.react_asset_fetcher.ReactAsset
import com.discord.react_asset_fetcher.ReactAssetUtilsKt
import com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchUtilsKt
import com.discord.span.utilities.BackgroundSpanDrawer
import com.discord.span.utilities.SpannableExtensionsKt
import com.discord.theme.ThemeManagerKt
import com.discord.theme.utils.ColorUtilsKt
import com.facebook.drawee.span.DraweeSpanStringBuilder
import com.facebook.drawee.span.SimpleDraweeSpanTextView
import com.facebook.drawee.view.SimpleDraweeView
import kotlin.jvm.functions.Function1
import kotlin.jvm.functions.Function2

public class EphemeralIndicationView  public constructor(context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0) : ConstraintLayout {
   private final var binding: EphemeralActionViewBinding

   fun EphemeralIndicationView(var1: Context) {
      kotlin.jvm.internal.q.h(var1, "context");
      this(var1, null, 0, 6, null);
   }

   fun EphemeralIndicationView(var1: Context, var2: AttributeSet) {
      kotlin.jvm.internal.q.h(var1, "context");
      this(var1, var2, 0, 4, null);
   }

   init {
      kotlin.jvm.internal.q.h(var1, "context");
      super(var1, var2, var3);
      val var4: EphemeralActionViewBinding = EphemeralActionViewBinding.inflate(LayoutInflater.from(var1), this);
      kotlin.jvm.internal.q.g(var4, "inflate(...)");
      this.binding = var4;
      val var5: SimpleDraweeSpanTextView = var4.chatListAdapterItemTextDismiss;
      kotlin.jvm.internal.q.e(var4.chatListAdapterItemTextDismiss);
      DiscordFontUtilsKt.setDiscordFont(var5, DiscordFont.PrimaryMedium);
      SetTextSizeSpKt.setTextSizeSp(var5, 12.0F);
      var5.setTextColor(ThemeManagerKt.getTheme().getTextMuted());
      val var6: SimpleDraweeView = this.binding.chatListAdapterItemIconHelp;
      kotlin.jvm.internal.q.e(this.binding.chatListAdapterItemIconHelp);
      ReactAssetUtilsKt.setReactAsset(var6, ReactAsset.Help);
      ColorUtilsKt.setTintColor(var6, ThemeManagerKt.getTheme().getTextMuted());
      val var7: SimpleDraweeView = this.binding.chatListAdapterItemVisibilityIcon;
      kotlin.jvm.internal.q.e(this.binding.chatListAdapterItemVisibilityIcon);
      ReactAssetUtilsKt.setReactAsset(var7, ReactAsset.ShowPassword);
      ColorUtilsKt.setTintColor(var7, ThemeManagerKt.getTheme().getTextMuted());
   }

   @JvmStatic
   fun `setEphemeralIndication_AFFcxXc$lambda$4$lambda$3`(var0: Function1, var1: EphemeralIndication, var2: View) {
      kotlin.jvm.internal.q.h(var0, "$onHelpArticleClicked");
      kotlin.jvm.internal.q.h(var1, "$ephemeralIndication");
      var0.invoke(var1.getHelpArticleLink());
   }

   public fun setEphemeralIndication(
      messageId: MessageId,
      ephemeralIndication: EphemeralIndication,
      onLinkClicked: (MessageId, LinkContentNode) -> Unit,
      onHelpArticleClicked: (String) -> Unit
   ) {
      kotlin.jvm.internal.q.h(var1, "messageId");
      kotlin.jvm.internal.q.h(var2, "ephemeralIndication");
      kotlin.jvm.internal.q.h(var3, "onLinkClicked");
      kotlin.jvm.internal.q.h(var4, "onHelpArticleClicked");
      val var6: SimpleDraweeView = this.binding.chatListAdapterItemIconHelp;
      this.binding.chatListAdapterItemIconHelp.setContentDescription(var2.getHelpButtonAccessibilityLabel());
      var6.setOnClickListener(new x(var4, var2));
      val var10: SimpleDraweeSpanTextView = this.binding.chatListAdapterItemTextDismiss;
      kotlin.jvm.internal.q.e(this.binding.chatListAdapterItemTextDismiss);
      val var9: StructurableText = var2.getContent();
      val var11: Context = var10.getContext();
      val var7: FontMetrics = var10.getPaint().getFontMetrics();
      kotlin.jvm.internal.q.g(var7, "getFontMetrics(...)");
      val var5: Float = TextUtilsKt.getBaselineHeightPx(var7);
      val var12: TextPaint = var10.getPaint();
      kotlin.jvm.internal.q.e(var11);
      kotlin.jvm.internal.q.e(var12);
      val var8: DraweeSpanStringBuilder = TextUtilsKt.toSpannable$default(var9, var11, var1, false, false, false, false, var12, new Function1(var3, var1) {
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
      }, null, null, null, null, null, null, null, null, null, null, null, null, false, null, var5, null, 12582656, null);
      SpannableExtensionsKt.coverWithSpan(var8, new BackgroundSpanDrawer(var10));
      SimpleDraweeSpanTextViewUtilsKt.setOptionalText(var10, var8);
      NestedScrollOnTouchUtilsKt.enableNestedSpanClickListener$default(var10, false, 1, null);
   }
}

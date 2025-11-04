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
import kotlin.jvm.internal.SourceDebugExtension

@SourceDebugExtension(["SMAP\nEphemeralIndicationView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EphemeralIndicationView.kt\ncom/discord/chat/presentation/message/view/EphemeralIndicationView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,80:1\n1#2:81\n*E\n"])
public class EphemeralIndicationView  public constructor(context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0) : ConstraintLayout(
      var1, var2, var3
   ) {
   private final var binding: EphemeralActionViewBinding

   fun EphemeralIndicationView(var1: Context) {
      this(var1, null, 0, 6, null);
   }

   fun EphemeralIndicationView(var1: Context, var2: AttributeSet) {
      this(var1, var2, 0, 4, null);
   }

   init {
      val var4: EphemeralActionViewBinding = EphemeralActionViewBinding.inflate(LayoutInflater.from(var1), this);
      this.binding = var4;
      val var5: SimpleDraweeSpanTextView = var4.chatListAdapterItemTextDismiss;
      DiscordFontUtilsKt.setDiscordFont(var5, DiscordFont.PrimaryMedium);
      SetTextSizeSpKt.setTextSizeSp(var5, 12.0F);
      var5.setTextColor(ThemeManagerKt.getTheme().getTextMuted());
      val var6: SimpleDraweeView = this.binding.chatListAdapterItemIconHelp;
      ReactAssetUtilsKt.setReactAsset(var6, ReactAsset.Help);
      ColorUtilsKt.setTintColor(var6, ThemeManagerKt.getTheme().getTextMuted());
      val var7: SimpleDraweeView = this.binding.chatListAdapterItemVisibilityIcon;
      ReactAssetUtilsKt.setReactAsset(var7, ReactAsset.ShowPassword);
      ColorUtilsKt.setTintColor(var7, ThemeManagerKt.getTheme().getTextMuted());
   }

   @JvmStatic
   fun `setEphemeralIndication_AFFcxXc$lambda$4$lambda$3`(var0: Function1, var1: EphemeralIndication, var2: View) {
      var0.invoke(var1.getHelpArticleLink());
   }

   @JvmStatic
   fun `setEphemeralIndication_AFFcxXc$lambda$7$lambda$5`(var0: Function2, var1: java.lang.String, var2: LinkContentNode): Unit {
      var0.invoke(MessageId.box-impl(var1), var2);
      return Unit.a;
   }

   public fun setEphemeralIndication(
      messageId: MessageId,
      ephemeralIndication: EphemeralIndication,
      onLinkClicked: (MessageId, LinkContentNode) -> Unit,
      onHelpArticleClicked: (String) -> Unit
   ) {
      val var6: SimpleDraweeView = this.binding.chatListAdapterItemIconHelp;
      this.binding.chatListAdapterItemIconHelp.setContentDescription(var2.getHelpButtonAccessibilityLabel());
      var6.setOnClickListener(new g0(var4, var2));
      val var10: SimpleDraweeSpanTextView = this.binding.chatListAdapterItemTextDismiss;
      val var9: StructurableText = var2.getContent();
      val var11: Context = var10.getContext();
      val var7: FontMetrics = var10.getPaint().getFontMetrics();
      val var5: Float = TextUtilsKt.getBaselineHeightPx(var7);
      val var12: TextPaint = var10.getPaint();
      val var8: DraweeSpanStringBuilder = TextUtilsKt.toSpannable$default(
         var9,
         var11,
         var1,
         false,
         false,
         false,
         false,
         var12,
         new h0(var3, var1),
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
         var5,
         null,
         50331392,
         null
      );
      SpannableExtensionsKt.coverWithSpan(var8, new BackgroundSpanDrawer(var10));
      SimpleDraweeSpanTextViewUtilsKt.setOptionalText(var10, var8);
      NestedScrollOnTouchUtilsKt.enableNestedSpanClickListener$default(var10, false, 1, null);
   }
}

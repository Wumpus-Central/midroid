package com.discord.chat.presentation.message.view

import android.content.Context
import android.graphics.Paint.FontMetrics
import android.text.TextPaint
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.view.View.OnClickListener
import android.view.View.OnLongClickListener
import android.widget.FrameLayout
import android.widget.LinearLayout
import android.widget.Space
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import com.discord.SetTextSizeSpKt
import com.discord.chat.R
import com.discord.chat.bridge.contentnode.CommandMentionContentNode
import com.discord.chat.bridge.contentnode.EmojiContentNode
import com.discord.chat.bridge.contentnode.LinkContentNode
import com.discord.chat.bridge.embed.Embed
import com.discord.chat.bridge.embed.EmbedAuthor
import com.discord.chat.bridge.embed.EmbedFailureState
import com.discord.chat.bridge.embed.EmbedField
import com.discord.chat.bridge.embed.EmbedFooter
import com.discord.chat.bridge.embed.EmbedProvider
import com.discord.chat.bridge.embed.EmbedThumbnail
import com.discord.chat.bridge.embed.EmbedUtilsKt
import com.discord.chat.bridge.spoiler.SpoilerConfig
import com.discord.chat.bridge.structurabletext.StructurableText
import com.discord.chat.databinding.EmbedViewBinding
import com.discord.chat.presentation.media.MediaContainingViewResizer
import com.discord.chat.presentation.message.MessageAccessoriesView
import com.discord.chat.presentation.message.utils.GetMediaImagePlaceholderStatesListenerKt
import com.discord.chat.presentation.textutils.TextUtilsKt
import com.discord.fonts.DiscordFont
import com.discord.fonts.DiscordFontUtilsKt
import com.discord.image.fresco.SetOptionalImageUrlKt
import com.discord.image.fresco.SimpleDraweeSpanTextViewUtilsKt
import com.discord.media_player.MediaSource
import com.discord.misc.utilities.view.ViewClippingUtilsKt
import com.discord.misc.utilities.view.ViewGroupUtilsKt
import com.discord.misc.utilities.view.ViewUtilsKt
import com.discord.primitives.ChannelId
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
import kotlin.jvm.functions.Function3

public class EmbedView  public constructor(context: Context, attrs: AttributeSet? = null) : FrameLayout {
   private final val binding: EmbedViewBinding
   private final var embed: Embed?
   private final var maxThumbnailSize: Int

   fun EmbedView(var1: Context) {
      kotlin.jvm.internal.q.h(var1, "context");
      this(var1, null, 2, null);
   }

   init {
      kotlin.jvm.internal.q.h(var1, "context");
      super(var1, var2);
      val var8: EmbedViewBinding = EmbedViewBinding.inflate(LayoutInflater.from(var1), this);
      kotlin.jvm.internal.q.g(var8, "inflate(...)");
      this.binding = var8;
      this.maxThumbnailSize = var1.getResources().getDimensionPixelSize(R.dimen.message_embed_max_thumbnail_size);
      var8.getRoot().setBackgroundColor(ThemeManagerKt.getTheme().getBackgroundSecondary());
      val var3: SimpleDraweeSpanTextView = var8.provider;
      kotlin.jvm.internal.q.e(var8.provider);
      SetTextSizeSpKt.setTextSizeSp(var3, 10.0F);
      val var5: DiscordFont = DiscordFont.PrimaryMedium;
      DiscordFontUtilsKt.setDiscordFont(var3, DiscordFont.PrimaryMedium);
      val var9: SimpleDraweeView = var8.authorAvatar;
      kotlin.jvm.internal.q.g(var8.authorAvatar, "authorAvatar");
      ViewClippingUtilsKt.clipToCircle(var9);
      var var4: TextView = var8.authorName;
      kotlin.jvm.internal.q.g(var8.authorName, "authorName");
      val var10: DiscordFont = DiscordFont.PrimarySemibold;
      DiscordFontUtilsKt.setDiscordFont(var4, DiscordFont.PrimarySemibold);
      var8.authorName.setTextColor(ThemeManagerKt.getTheme().getHeaderPrimary());
      var4 = var8.authorName;
      kotlin.jvm.internal.q.g(var8.authorName, "authorName");
      SetTextSizeSpKt.setTextSizeSp(var4, 12.0F);
      val var14: SimpleDraweeSpanTextView = var8.title;
      kotlin.jvm.internal.q.g(var8.title, "title");
      DiscordFontUtilsKt.setDiscordFont(var14, var10);
      val var15: SimpleDraweeSpanTextView = var8.title;
      kotlin.jvm.internal.q.g(var8.title, "title");
      SetTextSizeSpKt.setTextSizeSp(var15, 16.0F);
      val var16: SimpleDraweeSpanTextView = var8.description;
      kotlin.jvm.internal.q.g(var8.description, "description");
      DiscordFontUtilsKt.setDiscordFont(var16, var5);
      var4 = var8.footerText;
      kotlin.jvm.internal.q.g(var8.footerText, "footerText");
      DiscordFontUtilsKt.setDiscordFont(var4, var10);
      var8.footerText.setTextColor(ThemeManagerKt.getTheme().getTextNormal());
      val var11: TextView = var8.footerText;
      kotlin.jvm.internal.q.g(var8.footerText, "footerText");
      SetTextSizeSpKt.setTextSizeSp(var11, 12.0F);
      val var12: TextView = var8.error;
      kotlin.jvm.internal.q.g(var8.error, "error");
      DiscordFontUtilsKt.setDiscordFont(var12, var5);
      val var6: TextView = var8.error;
      kotlin.jvm.internal.q.g(var8.error, "error");
      SetTextSizeSpKt.setTextSizeSp(var6, 12.0F);
      val var7: SimpleDraweeView = var8.errorIcon;
      kotlin.jvm.internal.q.g(var8.errorIcon, "errorIcon");
      ReactAssetUtilsKt.setReactAsset(var7, ReactAsset.Alert);
      var8.imageBlurBg.setBackgroundColor(ThemeManagerKt.getTheme().getBackgroundMobilePrimary());
   }

   private fun clearAuthor() {
      val var1: TextView = this.binding.authorName;
      kotlin.jvm.internal.q.g(this.binding.authorName, "authorName");
      ViewUtilsKt.setOptionalText(var1, null);
      val var2: SimpleDraweeView = this.binding.authorAvatar;
      kotlin.jvm.internal.q.g(this.binding.authorAvatar, "authorAvatar");
      SetOptionalImageUrlKt.setOptionalImageUrl$default(var2, null, null, null, null, 14, null);
      val var3: LinearLayout = this.binding.authorContainer;
      kotlin.jvm.internal.q.g(this.binding.authorContainer, "authorContainer");
      var3.setVisibility(8);
   }

   private fun clearBorder() {
      val var1: View = this.binding.border;
      kotlin.jvm.internal.q.g(this.binding.border, "border");
      var1.setVisibility(8);
   }

   private fun clearDescription() {
      val var1: SimpleDraweeSpanTextView = this.binding.description;
      kotlin.jvm.internal.q.g(this.binding.description, "description");
      SimpleDraweeSpanTextViewUtilsKt.setOptionalText(var1, null);
   }

   private fun clearError() {
      val var1: TextView = this.binding.error;
      kotlin.jvm.internal.q.g(this.binding.error, "error");
      ViewUtilsKt.setOptionalText(var1, null);
      val var2: SimpleDraweeView = this.binding.errorIcon;
      kotlin.jvm.internal.q.g(this.binding.errorIcon, "errorIcon");
      var2.setVisibility(8);
   }

   private fun clearFields() {
      val var1: LinearLayout = this.binding.fieldsContainer;
      kotlin.jvm.internal.q.g(this.binding.fieldsContainer, "fieldsContainer");
      var1.setVisibility(8);
   }

   private fun clearFooter() {
      val var1: TextView = this.binding.footerText;
      kotlin.jvm.internal.q.g(this.binding.footerText, "footerText");
      ViewUtilsKt.setOptionalText(var1, null);
      val var2: SimpleDraweeView = this.binding.footerAvatar;
      kotlin.jvm.internal.q.g(this.binding.footerAvatar, "footerAvatar");
      SetOptionalImageUrlKt.setOptionalImageUrl$default(var2, null, null, null, null, 14, null);
      val var3: LinearLayout = this.binding.footerContainer;
      kotlin.jvm.internal.q.g(this.binding.footerContainer, "footerContainer");
      var3.setVisibility(8);
      val var4: Space = this.binding.spacer;
      kotlin.jvm.internal.q.g(this.binding.spacer, "spacer");
      var4.setVisibility(0);
   }

   private fun clearInlineMedia() {
      val var4: EmbedViewResizingMediaView = this.binding.inlineMediaView;
      val var3: EmbedViewResizingMediaView = this.binding.inlineMediaView2;
      val var2: EmbedViewResizingMediaView = this.binding.inlineMediaView3;
      val var7: EmbedViewResizingMediaView = this.binding.inlineMediaView4;

      for (int var1 = 0; var1 < 4; var1++) {
         val var6: EmbedViewResizingMediaView = new EmbedViewResizingMediaView[]{var4, var3, var2, var7}[var1];
         MediaView.setMediaData$default(
            var6, null, false, false, false, null, false, null, null, false, false, false, 0, null, null, null, null, null, null, 262142, null
         );
         var6.setOnMediaClickListeners(null, null);
         kotlin.jvm.internal.q.e(var6);
         var6.setVisibility(8);
      }
   }

   private fun clearMedia() {
      val var1: EmbedViewResizingMediaView = this.binding.mediaView;
      MediaView.setMediaData$default(
         this.binding.mediaView, null, false, false, false, null, false, null, null, false, false, false, 0, null, null, null, null, null, null, 262142, null
      );
      kotlin.jvm.internal.q.e(var1);
      var1.setVisibility(8);
   }

   private fun clearProvider() {
      val var1: SimpleDraweeSpanTextView = this.binding.provider;
      kotlin.jvm.internal.q.g(this.binding.provider, "provider");
      SimpleDraweeSpanTextViewUtilsKt.setOptionalText(var1, null);
   }

   private fun clearThumbnail() {
      val var1: SimpleDraweeView = this.binding.thumbnail;
      kotlin.jvm.internal.q.g(this.binding.thumbnail, "thumbnail");
      SetOptionalImageUrlKt.setOptionalImageUrl$default(var1, null, null, null, null, 14, null);
   }

   private fun clearTitle() {
      var var1: SimpleDraweeSpanTextView = this.binding.title;
      kotlin.jvm.internal.q.g(this.binding.title, "title");
      SimpleDraweeSpanTextViewUtilsKt.setOptionalText(var1, null);
      var1 = this.binding.title;
      kotlin.jvm.internal.q.g(this.binding.title, "title");
      NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(var1, false, null, 1, null);
   }

   private fun configureSpoiler(spoilerConfig: SpoilerConfig?, isObscureAwaitingScan: Boolean, obscureHideControls: Boolean, obscureIsOpaque: Boolean) {
      this.binding.spoiler.configure(var1, this);
      this.binding.spoiler.handleObscureAwaitingScan(var2);
      this.binding.spoiler.setRevealButtonVisible(var3 xor true);
      this.binding.spoiler.setOpaqueBackgroundVisible(var4);
      val var6: FrameLayout = this.binding.imageBlurBg;
      kotlin.jvm.internal.q.g(this.binding.imageBlurBg, "imageBlurBg");
      val var5: Byte;
      if (this.binding.spoiler.isOverlayVisible()) {
         var5 = 0;
      } else {
         var5 = 8;
      }

      var6.setVisibility(var5);
   }

   private fun reset() {
      this.clearProvider();
      this.clearTitle();
      this.clearDescription();
      this.clearAuthor();
      this.clearFields();
      this.clearInlineMedia();
      this.clearThumbnail();
      this.clearBorder();
      this.clearMedia();
      this.clearFooter();
      this.clearError();
   }

   private fun setAuthor(authorUrl: String?, authorName: String?) {
      val var5: LinearLayout = this.binding.authorContainer;
      kotlin.jvm.internal.q.g(this.binding.authorContainer, "authorContainer");
      var var3: Boolean;
      if ((var1 == null || kotlin.text.h.c0(var1)) && (var2 == null || kotlin.text.h.c0(var2))) {
         var3 = 0;
      } else {
         var3 = 1;
      }

      if (var3) {
         var3 = 0;
      } else {
         var3 = 8;
      }

      var5.setVisibility(var3);
      val var8: TextView = this.binding.authorName;
      kotlin.jvm.internal.q.g(this.binding.authorName, "authorName");
      ViewUtilsKt.setOptionalText(var8, var2);
      val var6: SimpleDraweeView = this.binding.authorAvatar;
      kotlin.jvm.internal.q.g(this.binding.authorAvatar, "authorAvatar");
      SetOptionalImageUrlKt.setOptionalImageUrl$default(var6, var1, null, null, null, 14, null);
   }

   private fun setAuthorOnClickListener(listener: OnClickListener?, onTapCopyText: (CharSequence) -> Unit) {
      val var3: TextView = this.binding.authorName;
      kotlin.jvm.internal.q.e(this.binding.authorName);
      NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(var3, false, var1, 1, null);
      NestedScrollOnTouchUtilsKt.setOnLongClickListenerNested$default(var3, false, new C(var2, this), 1, null);
   }

   @JvmStatic
   fun `setAuthorOnClickListener$lambda$22$lambda$21`(var0: Function1, var1: EmbedView, var2: View): Boolean {
      val var3: java.lang.CharSequence = var1.binding.authorName.getText();
      kotlin.jvm.internal.q.g(var3, "getText(...)");
      var0.invoke(var3);
      return true;
   }

   private fun setBackgroundColorEnabled(isBackgroundColorEnabled: Boolean, backgroundColor: Int? = null) {
      if (var1) {
         val var4: View = this.binding.getRoot();
         val var3: Int;
         if (var2 != null) {
            var3 = var2;
         } else {
            var3 = ThemeManagerKt.getTheme().getEmbedBackground();
         }

         var4.setBackgroundColor(var3);
      } else {
         this.binding.getRoot().setBackgroundColor(0);
      }
   }

   private fun setBorder(color: Int?) {
      if (var1 != null) {
         this.binding.border.setBackgroundColor(var1.intValue());
      }

      val var4: View = this.binding.border;
      kotlin.jvm.internal.q.g(this.binding.border, "border");
      var var5: Boolean;
      if (var1 != null) {
         var5 = 1;
      } else {
         var5 = 0;
      }

      if (var5) {
         var5 = 0;
      } else {
         var5 = 8;
      }

      var4.setVisibility(var5);
   }

   private fun setDescription(rawDescription: String, description: DraweeSpanStringBuilder?, descriptionColor: Int, onTapCopyText: (CharSequence) -> Unit) {
      val var5: SimpleDraweeSpanTextView = this.binding.description;
      kotlin.jvm.internal.q.e(this.binding.description);
      if (var2 != null) {
         SpannableExtensionsKt.coverWithSpan(var2, new BackgroundSpanDrawer(var5));
      } else {
         var2 = null;
      }

      SimpleDraweeSpanTextViewUtilsKt.setOptionalText(var5, var2);
      var5.setTextColor(var3);
      NestedScrollOnTouchUtilsKt.setOnLongClickListenerNested$default(var5, false, new s(var4, var1), 1, null);
   }

   @JvmStatic
   fun `setDescription$lambda$26$lambda$25`(var0: Function1, var1: java.lang.String, var2: View): Boolean {
      var0.invoke(var1);
      return true;
   }

   @JvmStatic
   fun `setEmbed_0qg1u9A$lambda$11$lambda$10`(var0: Function2, var1: MediaSource, var2: Int, var3: View) {
      val var5: java.lang.Double = var1.getPortal();
      val var4: java.lang.Double;
      if (var5 != null && var1.isValid()) {
         var4 = var5;
      } else {
         var4 = null;
      }

      var0.invoke(var4, var2);
   }

   @JvmStatic
   fun `setEmbed_0qg1u9A$lambda$14$lambda$13`(var0: Function2, var1: MediaSource, var2: Boolean, var3: EmbedView, var4: View) {
      val var6: java.lang.Double = var1.getPortal();
      val var5: java.lang.Double;
      if (var6 != null && var1.isValid()) {
         var5 = var6;
      } else {
         var5 = null;
      }

      var0.invoke(var5, null);
      if (var2) {
         var3.binding.spoiler.makeObscureHideButtonHidden();
      }
   }

   @JvmStatic
   fun `setEmbed_0qg1u9A$lambda$3$lambda$2`(var0: Function2, var1: MediaSource, var2: Boolean, var3: EmbedView, var4: View) {
      val var6: java.lang.Double = var1.getPortal();
      val var5: java.lang.Double;
      if (var6 != null && var1.isValid()) {
         var5 = var6;
      } else {
         var5 = null;
      }

      var0.invoke(var5, null);
      if (var2) {
         var3.binding.spoiler.makeObscureHideButtonHidden();
      }
   }

   @JvmStatic
   fun `setEmbed_0qg1u9A$lambda$5$lambda$4`(var0: Function3, var1: java.lang.String, var2: java.lang.String, var3: DraweeSpanStringBuilder, var4: View) {
      val var7: MessageId = MessageId.box-impl(var1);
      if (var3 != null) {
         var1 = var3.toString();
      } else {
         var1 = null;
      }

      var var6: java.lang.String = var1;
      if (var1 == null) {
         var6 = "";
      }

      var0.invoke(var7, var2, var6);
   }

   @JvmStatic
   fun `setEmbed_0qg1u9A$lambda$6`(var0: Function2, var1: java.lang.String, var2: LinkContentNode): Unit {
      kotlin.jvm.internal.q.h(var2, "node");
      var0.invoke(MessageId.box-impl(var1), var2);
      return Unit.a;
   }

   @JvmStatic
   fun `setEmbed_0qg1u9A$lambda$8$lambda$7`(var0: Function3, var1: java.lang.String, var2: Embed, var3: View) {
      var0.invoke(MessageId.box-impl(var1), var2.getAuthor().getUrl(), var2.getAuthor().getName());
   }

   private fun setError(error: String?, textColor: Int, iconURL: String? = null, iconTint: Int? = null) {
      val var6: TextView = this.binding.error;
      kotlin.jvm.internal.q.e(this.binding.error);
      ViewUtilsKt.setOptionalText(var6, var1);
      DiscordFontUtilsKt.setDiscordFont(var6, DiscordFont.PrimaryMedium);
      var6.setTextColor(var2);
      val var11: SimpleDraweeView = this.binding.errorIcon;
      kotlin.jvm.internal.q.g(this.binding.errorIcon, "errorIcon");
      if (var4 != null) {
         var2 = var4;
      }

      ColorUtilsKt.setTintColor(var11, var2);
      val var10: SimpleDraweeView = this.binding.errorIcon;
      kotlin.jvm.internal.q.g(this.binding.errorIcon, "errorIcon");
      ReactAssetUtilsKt.setOptionalReactImageUrl(var10, var3);
      val var9: SimpleDraweeView = this.binding.errorIcon;
      kotlin.jvm.internal.q.g(this.binding.errorIcon, "errorIcon");
      var var7: Boolean;
      if (var1 != null && !kotlin.text.h.c0(var1)) {
         var7 = 0;
      } else {
         var7 = 1;
      }

      if (!var7) {
         var7 = 0;
      } else {
         var7 = 8;
      }

      var9.setVisibility(var7);
   }

   private fun setFields(
      fields: List<EmbedField>,
      messageId: MessageId,
      shouldAnimateEmoji: Boolean,
      shouldShowLinkDecorations: Boolean,
      shouldShowRoleDot: Boolean,
      shouldShowRoleOnName: Boolean,
      onLinkClicked: (MessageId, LinkContentNode) -> Unit,
      onLinkLongClicked: (LinkContentNode) -> Unit,
      onTapCopyText: (CharSequence) -> Unit,
      onTapSpoiler: () -> Unit,
      onTapEmoji: (EmojiContentNode) -> Unit,
      onTapChannel: (String, String?, String?) -> Unit,
      onTapMention: (String?, String, String?, String?) -> Unit
   ) {
      var var17: u = new u(var7, var2);
      val var25: LinearLayout = this.binding.fieldsContainer;
      kotlin.jvm.internal.q.e(this.binding.fieldsContainer);
      val var14: Byte;
      if (!var1.isEmpty()) {
         var14 = 0;
      } else {
         var14 = 8;
      }

      var25.setVisibility(var14);
      ViewGroupUtilsKt.setUpLayoutForList(var25, var1.size(), new v(var25));
      val var19: java.util.Iterator = var1.iterator();
      val var24: u = var17;

      for (int var26 = 0; var19.hasNext(); var26++) {
         var17 = (u)var19.next();
         if (var26 < 0) {
            kotlin.collections.i.u();
         }

         val var21: EmbedField = var17 as EmbedField;
         val var28: View = var25.getChildAt(var26);
         kotlin.jvm.internal.q.f(var28, "null cannot be cast to non-null type com.discord.chat.presentation.message.view.EmbedFieldView");
         val var20: EmbedFieldView = var28 as EmbedFieldView;
         var var29: java.lang.String = var21.getRawName();
         if (var29 == null) {
            var29 = "";
         }

         val var23: StructurableText = var21.getName();
         var var31: DraweeSpanStringBuilder;
         if (var23 != null) {
            val var22: Context = var20.getContext();
            kotlin.jvm.internal.q.g(var22, "getContext(...)");
            val var18: TextPaint = var20.getBinding().name.getPaint();
            kotlin.jvm.internal.q.g(var18, "getPaint(...)");
            var31 = TextUtilsKt.toSpannable$default(
               var23,
               var22,
               var2,
               var3,
               var4,
               var5,
               var6,
               var18,
               var24,
               var8,
               var12,
               null,
               null,
               null,
               var13,
               null,
               null,
               null,
               null,
               var11,
               null,
               var10,
               null,
               false,
               null,
               0.0F,
               null,
               65788928,
               null
            );
         } else {
            var31 = null;
         }

         var20.setName(var29, var31, var9);
         var var30: java.lang.String = var21.getRawValue();
         if (var30 == null) {
            var30 = "";
         }

         val var35: StructurableText = var21.getValue();
         if (var35 != null) {
            val var36: Context = var20.getContext();
            kotlin.jvm.internal.q.g(var36, "getContext(...)");
            val var32: TextPaint = var20.getBinding().value.getPaint();
            kotlin.jvm.internal.q.g(var32, "getPaint(...)");
            val var34: FontMetrics = var20.getBinding().value.getPaint().getFontMetrics();
            kotlin.jvm.internal.q.g(var34, "getFontMetrics(...)");
            var31 = TextUtilsKt.toSpannable$default(
               var35,
               var36,
               var2,
               var3,
               var4,
               var5,
               var6,
               var32,
               var24,
               var8,
               var12,
               null,
               null,
               null,
               var13,
               null,
               null,
               null,
               null,
               var11,
               null,
               var10,
               null,
               false,
               null,
               TextUtilsKt.getBaselineHeightPx(var34),
               null,
               49011712,
               null
            );
         } else {
            var31 = null;
         }

         var20.setValue(var30, var31, var9);
      }
   }

   @JvmStatic
   fun `setFields_SAQFhFE$lambda$27`(var0: Function2, var1: java.lang.String, var2: LinkContentNode): Unit {
      kotlin.jvm.internal.q.h(var2, "node");
      var0.invoke(MessageId.box-impl(var1), var2);
      return Unit.a;
   }

   @JvmStatic
   fun `setFields_SAQFhFE$lambda$31$lambda$28`(var0: LinearLayout): View {
      val var1: Context = var0.getContext();
      kotlin.jvm.internal.q.g(var1, "getContext(...)");
      return new EmbedFieldView(var1, null, 0, 6, null);
   }

   private fun setFooter(imageUrl: String?, text: String?, onTapCopyText: (CharSequence) -> Unit) {
      val var5: LinearLayout = this.binding.footerContainer;
      kotlin.jvm.internal.q.g(this.binding.footerContainer, "footerContainer");
      var var4: Boolean;
      if ((var1 == null || kotlin.text.h.c0(var1)) && (var2 == null || kotlin.text.h.c0(var2))) {
         var4 = 0;
      } else {
         var4 = 1;
      }

      if (var4) {
         var4 = 0;
      } else {
         var4 = 8;
      }

      var5.setVisibility(var4);
      val var8: SimpleDraweeView = this.binding.footerAvatar;
      kotlin.jvm.internal.q.g(this.binding.footerAvatar, "footerAvatar");
      SetOptionalImageUrlKt.setOptionalImageUrl$default(var8, var1, null, null, null, 14, null);
      val var9: TextView = this.binding.footerText;
      kotlin.jvm.internal.q.e(this.binding.footerText);
      ViewUtilsKt.setOptionalText(var9, var2);
      val var6: r;
      if (var2 != null) {
         var6 = new r(var3, var2);
      } else {
         var6 = null;
      }

      NestedScrollOnTouchUtilsKt.setOnLongClickListenerNested$default(var9, false, var6, 1, null);
   }

   @JvmStatic
   fun `setFooter$lambda$36$lambda$35$lambda$34`(var0: Function1, var1: java.lang.String, var2: View): Boolean {
      var0.invoke(var1);
      return true;
   }

   private fun setMediaEmbed(mediaView: EmbedViewResizingMediaView, embed: Embed, mediaSource: MediaSource, maxHeightPx: Int, maxWidthPx: Int) {
      if (var4 > 0 && var5 > 0) {
         val var10: Pair = EmbedUtilsKt.getTargetDimensions(var2);
         val var9: Int = var10.a() as Int;
         val var12: Int = var10.b() as Int;
         val var6: Int;
         if (var9 != null) {
            var6 = var9;
         } else {
            var6 = 0;
         }

         val var7: Int;
         if (var12 != null) {
            var7 = var12;
         } else {
            var7 = 0;
         }

         var1.setTarget(var6, var7, var4, var5);
      }

      var1.setVisibility(0);
      val var11: EmbedThumbnail = var2.getThumbnail();
      val var8: Boolean;
      if (var11 != null) {
         var8 = kotlin.jvm.internal.q.c(var11.getShowPlayButton(), java.lang.Boolean.TRUE);
      } else {
         var8 = false;
      }

      MediaView.setMediaData$default(
         var1, var3, false, false, false, null, false, null, null, false, var8, false, 0, new t(this), null, null, null, null, null, 257534, null
      );
   }

   @JvmStatic
   fun `setMediaEmbed$lambda$33`(var0: EmbedView): Unit {
      var0.binding.spoiler.makeObscureHideButtonHidden();
      return Unit.a;
   }

   private fun setProvider(provider: CharSequence?, providerColor: Int?, onTapCopyText: (CharSequence) -> Unit) {
      val var5: SimpleDraweeSpanTextView = this.binding.provider;
      kotlin.jvm.internal.q.e(this.binding.provider);
      ViewUtilsKt.setOptionalText(var5, var1);
      val var4: Int;
      if (var2 != null) {
         var4 = var2;
      } else {
         var4 = ThemeManagerKt.getTheme().getTextNormal();
      }

      var5.setTextColor(var4);
      val var6: E;
      if (var1 != null) {
         var6 = new E(var3, var1);
      } else {
         var6 = null;
      }

      NestedScrollOnTouchUtilsKt.setOnLongClickListenerNested$default(var5, false, var6, 1, null);
   }

   @JvmStatic
   fun `setProvider$lambda$17$lambda$16$lambda$15`(var0: Function1, var1: java.lang.CharSequence, var2: View): Boolean {
      var0.invoke(var1);
      return true;
   }

   private fun setThumbnail(thumbnail: EmbedThumbnail?, shouldAutoPlayGifs: Boolean) {
      val var10: SimpleDraweeView = this.binding.thumbnail;
      val var7: MediaContainingViewResizer = MediaContainingViewResizer.INSTANCE;
      kotlin.jvm.internal.q.e(this.binding.thumbnail);
      var var6: Boolean = false;
      val var3: Int;
      if (var1 != null) {
         var3 = var1.getWidth();
      } else {
         var3 = 0;
      }

      val var4: Int;
      if (var1 != null) {
         var4 = var1.getHeight();
      } else {
         var4 = 0;
      }

      MediaContainingViewResizer.resizeLayoutParams$default(var7, var10, var3, var4, this.maxThumbnailSize, this.maxThumbnailSize, null, 16, null);
      var var9: Int = null;
      val var12: java.lang.String;
      if (var1 != null) {
         var12 = var1.getProxyURL();
      } else {
         var12 = null;
      }

      if (var1 != null) {
         var6 = var1.getSrcIsAnimated();
      }

      val var11: SimpleDraweeView = this.binding.thumbnail;
      kotlin.jvm.internal.q.g(this.binding.thumbnail, "thumbnail");
      val var8: java.lang.String;
      if (var1 != null) {
         var8 = var1.getPlaceholder();
      } else {
         var8 = null;
      }

      if (var1 != null) {
         var9 = var1.getPlaceholderVersion();
      }

      SetOptionalImageUrlKt.setOptionalImageUrl(
         var10, var12, var2, var6, GetMediaImagePlaceholderStatesListenerKt.getMediaImagePlaceholderStatesListener(var11, var8, var9)
      );
   }

   private fun setTitle(
      rawTitle: String,
      title: DraweeSpanStringBuilder?,
      titleColor: Int?,
      onClickListener: OnClickListener?,
      onLongClickListener: (String) -> Unit
   ) {
      val var7: SimpleDraweeSpanTextView = this.binding.title;
      kotlin.jvm.internal.q.e(this.binding.title);
      SimpleDraweeSpanTextViewUtilsKt.setOptionalText(var7, var2);
      val var6: Int;
      if (var3 != null) {
         var6 = var3;
      } else {
         var6 = ThemeManagerKt.getTheme().getTextNormal();
      }

      var7.setTextColor(var6);
      NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(var7, false, var4, 1, null);
      val var8: D;
      if (var2 != null) {
         var8 = new D(var5, var1);
      } else {
         var8 = null;
      }

      NestedScrollOnTouchUtilsKt.setOnLongClickListenerNested$default(var7, false, var8, 1, null);
   }

   @JvmStatic
   fun `setTitle$lambda$20$lambda$19$lambda$18`(var0: Function1, var1: java.lang.String, var2: View): Boolean {
      var0.invoke(var1);
      return true;
   }

   public fun setEmbed(
      embed: Embed,
      channelId: ChannelId,
      messageId: MessageId,
      constrainedWidth: Int,
      maxHeightPx: Int,
      radiusPx: Int,
      shouldAutoPlayGifs: Boolean,
      shouldAnimateEmoji: Boolean,
      shouldShowLinkDecorations: Boolean,
      shouldShowRoleDot: Boolean,
      shouldShowRoleOnName: Boolean,
      onTitleLinkClicked: (MessageId, String, String?) -> Unit,
      onAuthorLinkClicked: (MessageId, String, String?) -> Unit,
      onMediaClicked: (Double?, Int?) -> Unit,
      onMediaLongClicked: OnLongClickListener?,
      onLinkClicked: (MessageId, LinkContentNode) -> Unit,
      onLongTapLinkNode: (LinkContentNode) -> Unit,
      onTapCopyText: (CharSequence) -> Unit,
      onTapSpoiler: () -> Unit,
      onTapEmoji: (EmojiContentNode) -> Unit,
      onTapChannel: (String, String?, String?) -> Unit,
      onTapMention: (String?, String, String?, String?) -> Unit,
      onTapCommand: (CommandMentionContentNode) -> Unit,
      spoilerConfig: SpoilerConfig?,
      portal: Double,
      isObscure: Boolean,
      obscureHideControls: Boolean,
      obscureIsOpaque: Boolean,
      isForwardedContent: Boolean
   ) {
      kotlin.jvm.internal.q.h(var1, "embed");
      kotlin.jvm.internal.q.h(var4, "messageId");
      kotlin.jvm.internal.q.h(var13, "onTitleLinkClicked");
      kotlin.jvm.internal.q.h(var14, "onAuthorLinkClicked");
      kotlin.jvm.internal.q.h(var15, "onMediaClicked");
      kotlin.jvm.internal.q.h(var17, "onLinkClicked");
      kotlin.jvm.internal.q.h(var18, "onLongTapLinkNode");
      kotlin.jvm.internal.q.h(var19, "onTapCopyText");
      kotlin.jvm.internal.q.h(var20, "onTapSpoiler");
      kotlin.jvm.internal.q.h(var21, "onTapEmoji");
      kotlin.jvm.internal.q.h(var22, "onTapChannel");
      kotlin.jvm.internal.q.h(var23, "onTapMention");
      kotlin.jvm.internal.q.h(var24, "onTapCommand");
      if (!kotlin.jvm.internal.q.c(var1, this.embed)) {
         this.reset();
         this.embed = var1;
      }

      val var33: View = this.binding.getRoot();
      kotlin.jvm.internal.q.g(var33, "getRoot(...)");
      ViewClippingUtilsKt.clipToRoundedRectangle(var33, var7);
      val var75: ConstraintLayout = this.binding.inlineMediaContainer;
      kotlin.jvm.internal.q.g(this.binding.inlineMediaContainer, "inlineMediaContainer");
      ViewClippingUtilsKt.clipToRoundedRectangle(var75, var7);
      val var76: EmbedViewResizingMediaView = this.binding.mediaView;
      kotlin.jvm.internal.q.g(this.binding.mediaView, "mediaView");
      ViewClippingUtilsKt.clipToRoundedRectangle(var76, var7);
      val var77: SimpleDraweeView = this.binding.thumbnail;
      kotlin.jvm.internal.q.g(this.binding.thumbnail, "thumbnail");
      ViewClippingUtilsKt.clipToRoundedRectangle(var77, var7);
      if (EmbedUtilsKt.isInlineMedia(var1)) {
         val var38: MediaSource = EmbedUtilsKt.toMediaSource-UBIQNlQ(var1, var2, var4, var8, var26);
         if (var38 != null) {
            val var47: Space = this.binding.spacer;
            kotlin.jvm.internal.q.g(this.binding.spacer, "spacer");
            var47.setVisibility(8);
            if (var38.getPreviewUrl() != null) {
               val var48: EmbedViewResizingMediaView = this.binding.mediaView;
               kotlin.jvm.internal.q.g(this.binding.mediaView, "mediaView");
               this.setMediaEmbed(var48, var1, var38, var6, MessageAccessoriesView.Companion.getWidth(var5, var31));
               this.binding.mediaView.setOnMediaClickListeners(new w(var15, var38, var28, this), var16);
               setBackgroundColorEnabled$default(this, false, null, 2, null);
            }
         }
      } else {
         val var78: StructurableText = var1.getTitle();
         val var79: DraweeSpanStringBuilder;
         if (var78 != null) {
            val var35: Context = this.getContext();
            kotlin.jvm.internal.q.g(var35, "getContext(...)");
            val var34: TextPaint = this.binding.title.getPaint();
            kotlin.jvm.internal.q.g(var34, "getPaint(...)");
            var79 = TextUtilsKt.toSpannable$default(
               var78,
               var35,
               var4,
               var9,
               var10,
               var11,
               var12,
               var34,
               null,
               null,
               var22,
               null,
               null,
               null,
               var23,
               var24,
               null,
               null,
               null,
               var21,
               null,
               var20,
               null,
               false,
               null,
               0.0F,
               null,
               65772928,
               null
            );
         } else {
            var79 = null;
         }

         val var84: java.lang.String = var1.getRawTitle();
         var var82: java.lang.String = var84;
         if (var84 == null) {
            var82 = "";
         }

         val var85: Int;
         if (var1.getUrl() != null) {
            var85 = ThemeManagerKt.getTheme().getTextLink();
         } else {
            var85 = var1.getHeaderTextColor();
         }

         val var36: java.lang.String = var1.getUrl();
         val var49: x;
         if (var36 != null) {
            var49 = new x(var13, var4, var36, var79);
         } else {
            var49 = null;
         }

         this.setTitle(var82, var79, var85, var49, var19);
         val var80: java.lang.String = var1.getRawDescription();
         var var50: java.lang.String = var80;
         if (var80 == null) {
            var50 = "";
         }

         val var83: StructurableText = var1.getDescription();
         val var72: DraweeSpanStringBuilder;
         if (var83 != null) {
            val var81: Context = this.getContext();
            kotlin.jvm.internal.q.g(var81, "getContext(...)");
            val var87: TextPaint = this.binding.description.getPaint();
            kotlin.jvm.internal.q.g(var87, "getPaint(...)");
            val var86: FontMetrics = this.binding.description.getPaint().getFontMetrics();
            kotlin.jvm.internal.q.g(var86, "getFontMetrics(...)");
            var72 = TextUtilsKt.toSpannable$default(
               var83,
               var81,
               var4,
               var9,
               var10,
               var11,
               var12,
               var87,
               new y(var17, var4),
               var18,
               var22,
               null,
               null,
               null,
               var23,
               var24,
               null,
               null,
               null,
               var21,
               null,
               var20,
               null,
               false,
               null,
               TextUtilsKt.getBaselineHeightPx(var86),
               null,
               48995328,
               null
            );
         } else {
            var72 = null;
         }

         this.setDescription(var50, var72, var1.getBodyTextColor(), var19);
         val var51: EmbedProvider = var1.getProvider();
         val var52: java.lang.String;
         if (var51 != null) {
            var52 = var51.getName();
         } else {
            var52 = null;
         }

         this.setProvider(var52, var1.getProviderColor(), var19);
         this.setBackgroundColorEnabled(kotlin.jvm.internal.q.c(var1.getDisableBackgroundColor(), java.lang.Boolean.TRUE) xor true, var1.getBackgroundColor());
         this.setBorder(var1.getBorderLeftColor());
         val var53: EmbedAuthor = var1.getAuthor();
         val var54: java.lang.String;
         if (var53 != null) {
            var54 = var53.getImageUrl();
         } else {
            var54 = null;
         }

         val var73: EmbedAuthor = var1.getAuthor();
         val var74: java.lang.String;
         if (var73 != null) {
            var74 = var73.getName();
         } else {
            var74 = null;
         }

         this.setAuthor(var54, var74);
         val var55: EmbedAuthor = var1.getAuthor();
         val var56: z;
         if (var55 != null && var55.getUrl() != null) {
            var56 = new z(var14, var4, var1);
         } else {
            var56 = null;
         }

         this.setAuthorOnClickListener(var56, var19);
         val var65: java.util.List = var1.getFields();
         var var57: java.util.List = var65;
         if (var65 == null) {
            var57 = kotlin.collections.i.k();
         }

         this.setFields-SAQFhFE(var57, var4, var9, var10, var11, var12, var17, var18, var19, var20, var21, var22, var23);
         val var58: EmbedFooter = var1.getFooter();
         val var59: java.lang.String;
         if (var58 != null) {
            var59 = var58.getImageUrl();
         } else {
            var59 = null;
         }

         val var66: EmbedFooter = var1.getFooter();
         val var67: java.lang.String;
         if (var66 != null) {
            var67 = var66.getContent();
         } else {
            var67 = null;
         }

         this.setFooter(var59, var67, var19);
         if (var1.getFailureState() === EmbedFailureState.AUTO_MODERATION_BLOCKED_MESSAGE) {
            this.setError(
               var1.getMessageSendError(),
               ThemeManagerKt.getTheme().getTextMuted(),
               var1.getIconURL(),
               ColorUtilsKt.getColorCompat(this, com.discord.theme.R.color.red_345)
            );
         } else {
            this.setError(var1.getMessageSendError(), var1.getBodyTextColor(), var1.getIconURL(), null);
         }

         val var60: java.util.List = EmbedUtilsKt.toImageMediaSources-SHRpUJI(var1, var2, var4);
         if (var60 != null) {
            var6 = (int)(var6 * 0.75);
            var5 = MessageAccessoriesView.Companion.getWidthForEmbedContent(var5, var31);
            val var39: MediaContainingViewResizer = MediaContainingViewResizer.INSTANCE;
            val var68: ConstraintLayout = this.binding.inlineMediaContainer;
            kotlin.jvm.internal.q.g(this.binding.inlineMediaContainer, "inlineMediaContainer");
            MediaContainingViewResizer.resizeLayoutParams$default(var39, var68, var5, var6, var5, var6, null, 16, null);
            val var41: java.util.Iterator = kotlin.collections.i.b1(
                  var60,
                  new EmbedViewResizingMediaView[]{
                     this.binding.inlineMediaView, this.binding.inlineMediaView2, this.binding.inlineMediaView3, this.binding.inlineMediaView4
                  }
               )
               .iterator();

            for (int var44 = 0; var41.hasNext(); var44++) {
               val var61: Any = var41.next();
               if (var44 < 0) {
                  kotlin.collections.i.u();
               }

               val var62: MediaSource = (var61 as Pair).a() as MediaSource;
               val var70: Any = (var61 as Pair).b();
               kotlin.jvm.internal.q.g(var70, "component2(...)");
               val var71: EmbedViewResizingMediaView = var70 as EmbedViewResizingMediaView;
               this.setMediaEmbed(var70 as EmbedViewResizingMediaView, var1, var62, 0, 0);
               var71.setOnMediaClickListeners(new A(var15, var62, var44), var16);
            }
         } else {
            val var42: MediaSource = EmbedUtilsKt.toMediaSource-UBIQNlQ(var1, var2, var4, var8, var26);
            if (var42 != null) {
               val var63: EmbedViewResizingMediaView = this.binding.inlineMediaView;
               kotlin.jvm.internal.q.g(this.binding.inlineMediaView, "inlineMediaView");
               this.setMediaEmbed(var63, var1, var42, var6, MessageAccessoriesView.Companion.getWidthForEmbedContent(var5, var31));
               this.binding.inlineMediaView.setOnMediaClickListeners(new B(var15, var42, var28, this), var16);
            }

            if (if (EmbedView.WhenMappings.$EnumSwitchMapping$0[var1.getType().ordinal()] == 1) var1.getVideo() == null else var42 == null) {
               this.setThumbnail(var1.getThumbnail(), var8);
            }
         }
      }

      val var37: java.lang.String = var1.getObscureAwaitingScan();
      val var45: Boolean;
      if (var37 != null && !kotlin.text.h.c0(var37)) {
         var45 = false;
      } else {
         var45 = true;
      }

      this.configureSpoiler(var25, var45 xor true, var29, var30);
   }
}

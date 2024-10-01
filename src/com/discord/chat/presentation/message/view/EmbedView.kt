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
import kotlin.jvm.functions.Function0
import kotlin.jvm.functions.Function1
import kotlin.jvm.functions.Function2
import kotlin.jvm.functions.Function3
import kotlin.jvm.functions.Function4

public class EmbedView  public constructor(context: Context, attrs: AttributeSet? = null) : LinearLayout {
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
      this.setOrientation(0);
      var8.embed.setBackgroundColor(ThemeManagerKt.getTheme().getBackgroundSecondary());
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
      SetOptionalImageUrlKt.setOptionalImageUrl$default(var2, null, null, null, 6, null);
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
      SetOptionalImageUrlKt.setOptionalImageUrl$default(var2, null, null, null, 6, null);
      val var3: LinearLayout = this.binding.footerContainer;
      kotlin.jvm.internal.q.g(this.binding.footerContainer, "footerContainer");
      var3.setVisibility(8);
      val var4: Space = this.binding.spacer;
      kotlin.jvm.internal.q.g(this.binding.spacer, "spacer");
      var4.setVisibility(0);
   }

   private fun clearInlineMedia() {
      val var2: EmbedViewResizingMediaView = this.binding.inlineMediaView;
      val var3: EmbedViewResizingMediaView = this.binding.inlineMediaView2;
      val var4: EmbedViewResizingMediaView = this.binding.inlineMediaView3;
      val var6: EmbedViewResizingMediaView = this.binding.inlineMediaView4;

      for (int var1 = 0; var1 < 4; var1++) {
         val var7: EmbedViewResizingMediaView = new EmbedViewResizingMediaView[]{var2, var3, var4, var6}[var1];
         kotlin.jvm.internal.q.e(var7);
         MediaView.setMediaData$default(
            var7, null, false, false, false, null, false, null, null, false, false, false, 0, null, null, null, null, null, null, 262142, null
         );
         var7.setOnMediaClickListeners(null, null);
         var7.setVisibility(8);
      }
   }

   private fun clearMedia() {
      val var1: EmbedViewResizingMediaView = this.binding.mediaView;
      kotlin.jvm.internal.q.e(this.binding.mediaView);
      MediaView.setMediaData$default(
         var1, null, false, false, false, null, false, null, null, false, false, false, 0, null, null, null, null, null, null, 262142, null
      );
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
      SetOptionalImageUrlKt.setOptionalImageUrl$default(var1, null, null, null, 6, null);
   }

   private fun clearTitle() {
      var var1: SimpleDraweeSpanTextView = this.binding.title;
      kotlin.jvm.internal.q.g(this.binding.title, "title");
      SimpleDraweeSpanTextViewUtilsKt.setOptionalText(var1, null);
      var1 = this.binding.title;
      kotlin.jvm.internal.q.g(this.binding.title, "title");
      NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(var1, false, null, 1, null);
   }

   private fun configureSpoiler(spoilerConfig: SpoilerConfig?, isObscureAwaitingScan: Boolean) {
      this.binding.spoiler.configure(var1, this);
      this.binding.spoiler.handleObscureAwaitingScan(var2);
      val var4: FrameLayout = this.binding.imageBlurBg;
      kotlin.jvm.internal.q.g(this.binding.imageBlurBg, "imageBlurBg");
      val var3: Byte;
      if (this.binding.spoiler.isOverlayVisible()) {
         var3 = 0;
      } else {
         var3 = 8;
      }

      var4.setVisibility(var3);
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
      if ((var1 == null || kotlin.text.h.x(var1)) && (var2 == null || kotlin.text.h.x(var2))) {
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
      SetOptionalImageUrlKt.setOptionalImageUrl$default(var6, var1, null, null, 6, null);
   }

   private fun setAuthorOnClickListener(listener: OnClickListener?, onTapCopyText: (CharSequence) -> Unit) {
      val var3: TextView = this.binding.authorName;
      kotlin.jvm.internal.q.e(this.binding.authorName);
      NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(var3, false, var1, 1, null);
      NestedScrollOnTouchUtilsKt.setOnLongClickListenerNested$default(var3, false, new q(var2, this), 1, null);
   }

   @JvmStatic
   fun `setAuthorOnClickListener$lambda$22$lambda$21`(var0: Function1, var1: EmbedView, var2: View): Boolean {
      kotlin.jvm.internal.q.h(var0, "$onTapCopyText");
      kotlin.jvm.internal.q.h(var1, "this$0");
      val var3: java.lang.CharSequence = var1.binding.authorName.getText();
      kotlin.jvm.internal.q.g(var3, "getText(...)");
      var0.invoke(var3);
      return true;
   }

   private fun setBackgroundColorEnabled(isBackgroundColorEnabled: Boolean, backgroundColor: Int? = null) {
      if (var1) {
         val var4: FrameLayout = this.binding.embed;
         val var3: Int;
         if (var2 != null) {
            var3 = var2;
         } else {
            var3 = ThemeManagerKt.getTheme().getEmbedBackground();
         }

         var4.setBackgroundColor(var3);
      } else {
         this.binding.embed.setBackgroundColor(0);
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
      NestedScrollOnTouchUtilsKt.setOnLongClickListenerNested$default(var5, false, new n(var4, var1), 1, null);
   }

   @JvmStatic
   fun `setDescription$lambda$26$lambda$25`(var0: Function1, var1: java.lang.String, var2: View): Boolean {
      kotlin.jvm.internal.q.h(var0, "$onTapCopyText");
      kotlin.jvm.internal.q.h(var1, "$rawDescription");
      var0.invoke(var1);
      return true;
   }

   @JvmStatic
   fun `setEmbed_UEgMTIk$lambda$11$lambda$10`(var0: Function2, var1: MediaSource, var2: Int, var3: View) {
      label12: {
         kotlin.jvm.internal.q.h(var0, "$onMediaClicked");
         kotlin.jvm.internal.q.h(var1, "$mediaSource");
         val var5: java.lang.Double = var1.getPortal();
         if (var5 != null) {
            var5.doubleValue();
            if (var1.isValid()) {
               var4 = var5;
               break label12;
            }
         }

         var4 = null;
      }

      var0.invoke(var4, var2);
   }

   @JvmStatic
   fun `setEmbed_UEgMTIk$lambda$14$lambda$13`(var0: Function2, var1: MediaSource, var2: Boolean, var3: EmbedView, var4: View) {
      label16: {
         kotlin.jvm.internal.q.h(var0, "$onMediaClicked");
         kotlin.jvm.internal.q.h(var3, "this$0");
         val var6: java.lang.Double = var1.getPortal();
         if (var6 != null) {
            var6.doubleValue();
            if (var1.isValid()) {
               var5 = var6;
               break label16;
            }
         }

         var5 = null;
      }

      var0.invoke(var5, null);
      if (var2) {
         var3.binding.spoiler.makeObscureHideButtonHidden();
      }
   }

   @JvmStatic
   fun `setEmbed_UEgMTIk$lambda$4$lambda$3`(var0: Function2, var1: MediaSource, var2: Boolean, var3: EmbedView, var4: View) {
      label16: {
         kotlin.jvm.internal.q.h(var0, "$onMediaClicked");
         kotlin.jvm.internal.q.h(var1, "$mediaSource");
         kotlin.jvm.internal.q.h(var3, "this$0");
         val var6: java.lang.Double = var1.getPortal();
         if (var6 != null) {
            var6.doubleValue();
            if (var1.isValid()) {
               var5 = var6;
               break label16;
            }
         }

         var5 = null;
      }

      var0.invoke(var5, null);
      if (var2) {
         var3.binding.spoiler.makeObscureHideButtonHidden();
      }
   }

   @JvmStatic
   fun `setEmbed_UEgMTIk$lambda$6$lambda$5`(var0: Function3, var1: java.lang.String, var2: java.lang.String, var3: DraweeSpanStringBuilder, var4: View) {
      kotlin.jvm.internal.q.h(var0, "$onTitleLinkClicked");
      kotlin.jvm.internal.q.h(var1, "$messageId");
      kotlin.jvm.internal.q.h(var2, "$url");
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
   fun `setEmbed_UEgMTIk$lambda$8$lambda$7`(var0: Function3, var1: java.lang.String, var2: Embed, var3: View) {
      kotlin.jvm.internal.q.h(var0, "$onAuthorLinkClicked");
      kotlin.jvm.internal.q.h(var1, "$messageId");
      kotlin.jvm.internal.q.h(var2, "$embed");
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
      if (var1 != null && !kotlin.text.h.x(var1)) {
         var7 = 0;
      } else {
         var7 = 1;
      }

      if (var7 xor true) {
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
      var var18: Function1 = new Function1(var7, var2) {
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
      };
      val var26: LinearLayout = this.binding.fieldsContainer;
      kotlin.jvm.internal.q.e(this.binding.fieldsContainer);
      val var15: Byte;
      if (var1.isEmpty() xor true) {
         var15 = 0;
      } else {
         var15 = 8;
      }

      var26.setVisibility(var15);
      ViewGroupUtilsKt.setUpLayoutForList(var26, var1.size(), new Function0(var26) {
         final LinearLayout $this_apply;

         {
            super(0);
            this.$this_apply = var1;
         }

         public final View invoke() {
            val var1: Context = this.$this_apply.getContext();
            kotlin.jvm.internal.q.g(var1, "getContext(...)");
            return new EmbedFieldView(var1, null, 0, 6, null);
         }
      });
      val var20: java.util.Iterator = var1.iterator();
      val var25: Function1 = var18;

      for (int var27 = 0; var20.hasNext(); var27++) {
         var18 = (Function1)var20.next();
         if (var27 < 0) {
            kotlin.collections.i.u();
         }

         val var22: EmbedField = var18 as EmbedField;
         val var29: View = var26.getChildAt(var27);
         kotlin.jvm.internal.q.f(var29, "null cannot be cast to non-null type com.discord.chat.presentation.message.view.EmbedFieldView");
         val var21: EmbedFieldView = var29 as EmbedFieldView;
         var var30: java.lang.String = var22.getRawName();
         if (var30 == null) {
            var30 = "";
         }

         val var19: StructurableText = var22.getName();
         val var32: DraweeSpanStringBuilder;
         if (var19 != null) {
            val var24: Context = var21.getContext();
            val var23: TextPaint = var21.getBinding().name.getPaint();
            kotlin.jvm.internal.q.e(var24);
            kotlin.jvm.internal.q.e(var23);
            var32 = TextUtilsKt.toSpannable$default(
               var19,
               var24,
               var2,
               var3,
               var4,
               var5,
               var6,
               var23,
               var25,
               var8,
               var12,
               null,
               null,
               null,
               var13,
               null,
               null,
               null,
               var11,
               null,
               var10,
               false,
               null,
               0.0F,
               null,
               16112640,
               null
            );
         } else {
            var32 = null;
         }

         var21.setName(var30, var32, var9);
         var var31: java.lang.String = var22.getRawValue();
         if (var31 == null) {
            var31 = "";
         }

         val var35: StructurableText = var22.getValue();
         val var34: DraweeSpanStringBuilder;
         if (var35 != null) {
            val var36: Context = var21.getContext();
            val var37: TextPaint = var21.getBinding().value.getPaint();
            val var33: FontMetrics = var21.getBinding().value.getPaint().getFontMetrics();
            kotlin.jvm.internal.q.g(var33, "getFontMetrics(...)");
            val var14: Float = TextUtilsKt.getBaselineHeightPx(var33);
            kotlin.jvm.internal.q.e(var36);
            kotlin.jvm.internal.q.e(var37);
            var34 = TextUtilsKt.toSpannable$default(
               var35,
               var36,
               var2,
               var3,
               var4,
               var5,
               var6,
               var37,
               var25,
               var8,
               var12,
               null,
               null,
               null,
               var13,
               null,
               null,
               null,
               var11,
               null,
               var10,
               false,
               null,
               var14,
               null,
               11918336,
               null
            );
         } else {
            var34 = null;
         }

         var21.setValue(var31, var34, var9);
      }
   }

   private fun setFooter(imageUrl: String?, text: String?, onTapCopyText: (CharSequence) -> Unit) {
      val var5: LinearLayout = this.binding.footerContainer;
      kotlin.jvm.internal.q.g(this.binding.footerContainer, "footerContainer");
      var var4: Boolean;
      if ((var1 == null || kotlin.text.h.x(var1)) && (var2 == null || kotlin.text.h.x(var2))) {
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
      SetOptionalImageUrlKt.setOptionalImageUrl$default(var8, var1, null, null, 6, null);
      val var9: TextView = this.binding.footerText;
      kotlin.jvm.internal.q.e(this.binding.footerText);
      ViewUtilsKt.setOptionalText(var9, var2);
      val var6: o;
      if (var2 != null) {
         var6 = new o(var3, var2);
      } else {
         var6 = null;
      }

      NestedScrollOnTouchUtilsKt.setOnLongClickListenerNested$default(var9, false, var6, 1, null);
   }

   @JvmStatic
   fun `setFooter$lambda$33$lambda$32$lambda$31`(var0: Function1, var1: java.lang.String, var2: View): Boolean {
      kotlin.jvm.internal.q.h(var0, "$onTapCopyText");
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

      MediaView.setMediaData$default(var1, var3, false, false, false, null, false, null, null, false, var8, false, 0, new Function0(this) {
         final EmbedView this$0;

         {
            super(0);
            this.this$0 = var1;
         }

         public final void invoke() {
            EmbedView.access$getBinding$p(this.this$0).spoiler.makeObscureHideButtonHidden();
         }
      }, null, null, null, null, null, 257534, null);
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
      val var6: w;
      if (var1 != null) {
         var6 = new w(var3, var1);
      } else {
         var6 = null;
      }

      NestedScrollOnTouchUtilsKt.setOnLongClickListenerNested$default(var5, false, var6, 1, null);
   }

   @JvmStatic
   fun `setProvider$lambda$17$lambda$16$lambda$15`(var0: Function1, var1: java.lang.CharSequence, var2: View): Boolean {
      kotlin.jvm.internal.q.h(var0, "$onTapCopyText");
      var0.invoke(var1);
      return true;
   }

   private fun setThumbnail(thumbnail: EmbedThumbnail?) {
      val var8: SimpleDraweeView = this.binding.thumbnail;
      val var5: MediaContainingViewResizer = MediaContainingViewResizer.INSTANCE;
      kotlin.jvm.internal.q.e(this.binding.thumbnail);
      var var3: Int = 0;
      val var2: Int;
      if (var1 != null) {
         var2 = var1.getWidth();
      } else {
         var2 = 0;
      }

      if (var1 != null) {
         var3 = var1.getHeight();
      }

      MediaContainingViewResizer.resizeLayoutParams$default(var5, var8, var2, var3, this.maxThumbnailSize, this.maxThumbnailSize, null, 16, null);
      var var7: Int = null;
      val var10: java.lang.String;
      if (var1 != null) {
         var10 = var1.getProxyURL();
      } else {
         var10 = null;
      }

      val var9: SimpleDraweeView = this.binding.thumbnail;
      kotlin.jvm.internal.q.g(this.binding.thumbnail, "thumbnail");
      val var6: java.lang.String;
      if (var1 != null) {
         var6 = var1.getPlaceholder();
      } else {
         var6 = null;
      }

      if (var1 != null) {
         var7 = var1.getPlaceholderVersion();
      }

      SetOptionalImageUrlKt.setOptionalImageUrl$default(
         var8, var10, null, GetMediaImagePlaceholderStatesListenerKt.getMediaImagePlaceholderStatesListener(var9, var6, var7), 2, null
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
      val var8: p;
      if (var2 != null) {
         var8 = new p(var5, var1);
      } else {
         var8 = null;
      }

      NestedScrollOnTouchUtilsKt.setOnLongClickListenerNested$default(var7, false, var8, 1, null);
   }

   @JvmStatic
   fun `setTitle$lambda$20$lambda$19$lambda$18`(var0: Function1, var1: java.lang.String, var2: View): Boolean {
      kotlin.jvm.internal.q.h(var0, "$onLongClickListener");
      kotlin.jvm.internal.q.h(var1, "$rawTitle");
      var0.invoke(var1);
      return true;
   }

   public fun setEmbed(
      embed: Embed,
      embedIndex: Int,
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
      onTapInlineForward: (ChannelId, MessageId, String, Int?) -> Unit,
      spoilerConfig: SpoilerConfig?,
      portal: Double,
      isObscure: Boolean,
      isForwardedContent: Boolean,
      isShowingInlineForward: Boolean,
      useOldForwardIcon: Boolean
   ) {
      kotlin.jvm.internal.q.h(var1, "embed");
      kotlin.jvm.internal.q.h(var5, "messageId");
      kotlin.jvm.internal.q.h(var14, "onTitleLinkClicked");
      kotlin.jvm.internal.q.h(var15, "onAuthorLinkClicked");
      kotlin.jvm.internal.q.h(var16, "onMediaClicked");
      kotlin.jvm.internal.q.h(var18, "onLinkClicked");
      kotlin.jvm.internal.q.h(var19, "onLongTapLinkNode");
      kotlin.jvm.internal.q.h(var20, "onTapCopyText");
      kotlin.jvm.internal.q.h(var21, "onTapSpoiler");
      kotlin.jvm.internal.q.h(var22, "onTapEmoji");
      kotlin.jvm.internal.q.h(var23, "onTapChannel");
      kotlin.jvm.internal.q.h(var24, "onTapMention");
      kotlin.jvm.internal.q.h(var25, "onTapCommand");
      kotlin.jvm.internal.q.h(var26, "onTapInlineForward");
      if (!kotlin.jvm.internal.q.c(var1, this.embed)) {
         this.reset();
         this.embed = var1;
      }

      val var35: View = this.binding.getRoot();
      kotlin.jvm.internal.q.g(var35, "getRoot(...)");
      ViewClippingUtilsKt.clipToRoundedRectangle(var35, var8);
      val var81: FrameLayout = this.binding.embed;
      kotlin.jvm.internal.q.g(this.binding.embed, "embed");
      ViewClippingUtilsKt.clipToRoundedRectangle(var81, var8);
      val var82: ConstraintLayout = this.binding.inlineMediaContainer;
      kotlin.jvm.internal.q.g(this.binding.inlineMediaContainer, "inlineMediaContainer");
      ViewClippingUtilsKt.clipToRoundedRectangle(var82, var8);
      val var83: EmbedViewResizingMediaView = this.binding.mediaView;
      kotlin.jvm.internal.q.g(this.binding.mediaView, "mediaView");
      ViewClippingUtilsKt.clipToRoundedRectangle(var83, var8);
      val var84: SimpleDraweeView = this.binding.thumbnail;
      kotlin.jvm.internal.q.g(this.binding.thumbnail, "thumbnail");
      ViewClippingUtilsKt.clipToRoundedRectangle(var84, var8);
      val var85: InlineForwardButtonView = this.binding.forward;
      kotlin.jvm.internal.q.e(this.binding.forward);
      var var48: Boolean;
      if (var32 && var1.getFailureState() == null) {
         var48 = 1;
      } else {
         var48 = 0;
      }

      if (var48) {
         var48 = 0;
      } else {
         var48 = 8;
      }

      var85.setVisibility(var48);
      var85.configure(true, new Function0(var26, var3, var5, var2) {
         final long $channelId;
         final int $embedIndex;
         final java.lang.String $messageId;
         final Function4 $onTapInlineForward;

         {
            super(0);
            this.$onTapInlineForward = var1;
            this.$channelId = var2;
            this.$messageId = var4;
            this.$embedIndex = var5;
         }

         public final void invoke() {
            this.$onTapInlineForward.invoke(ChannelId.box-impl(this.$channelId), MessageId.box-impl(this.$messageId), "embed", this.$embedIndex);
         }
      }, var33);
      if (EmbedUtilsKt.isInlineMedia(var1)) {
         val var42: MediaSource = EmbedUtilsKt.toMediaSource-UBIQNlQ(var1, var3, var5, var9, var28);
         if (var42 != null) {
            val var50: Space = this.binding.spacer;
            kotlin.jvm.internal.q.g(this.binding.spacer, "spacer");
            var50.setVisibility(8);
            if (var42.getPreviewUrl() != null) {
               val var51: EmbedViewResizingMediaView = this.binding.mediaView;
               kotlin.jvm.internal.q.g(this.binding.mediaView, "mediaView");
               this.setMediaEmbed(var51, var1, var42, var7, MessageAccessoriesView.Companion.getWidth(var6, var31, var32));
               this.binding.mediaView.setOnMediaClickListeners(new r(var16, var42, var30, this), var17);
               setBackgroundColorEnabled$default(this, false, null, 2, null);
            }
         }
      } else {
         val var77: StructurableText = var1.getTitle();
         val var78: DraweeSpanStringBuilder;
         if (var77 != null) {
            val var36: Context = this.getContext();
            val var86: TextPaint = this.binding.title.getPaint();
            kotlin.jvm.internal.q.e(var36);
            kotlin.jvm.internal.q.e(var86);
            var78 = TextUtilsKt.toSpannable$default(
               var77,
               var36,
               var5,
               var10,
               var11,
               var12,
               var13,
               var86,
               null,
               null,
               var23,
               null,
               null,
               null,
               var24,
               var25,
               null,
               null,
               var22,
               null,
               var21,
               false,
               null,
               0.0F,
               null,
               16096640,
               null
            );
         } else {
            var78 = null;
         }

         var var87: java.lang.String = var1.getRawTitle();
         if (var87 == null) {
            var87 = "";
         }

         val var89: Int;
         if (var1.getUrl() != null) {
            var89 = ThemeManagerKt.getTheme().getTextLink();
         } else {
            var89 = var1.getHeaderTextColor();
         }

         val var37: java.lang.String = var1.getUrl();
         val var52: s;
         if (var37 != null) {
            var52 = new s(var14, var5, var37, var78);
         } else {
            var52 = null;
         }

         this.setTitle(var87, var78, var89, var52, var20);
         val var79: java.lang.String = var1.getRawDescription();
         var var53: java.lang.String = var79;
         if (var79 == null) {
            var53 = "";
         }

         val var90: StructurableText = var1.getDescription();
         val var74: DraweeSpanStringBuilder;
         if (var90 != null) {
            val var80: Context = this.getContext();
            val var91: TextPaint = this.binding.description.getPaint();
            val var88: FontMetrics = this.binding.description.getPaint().getFontMetrics();
            kotlin.jvm.internal.q.g(var88, "getFontMetrics(...)");
            val var34: Float = TextUtilsKt.getBaselineHeightPx(var88);
            kotlin.jvm.internal.q.e(var80);
            kotlin.jvm.internal.q.e(var91);
            var74 = TextUtilsKt.toSpannable$default(var90, var80, var5, var10, var11, var12, var13, var91, new Function1(var18, var5) {
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
            }, var19, var23, null, null, null, var24, var25, null, null, var22, null, var21, false, null, var34, null, 11901952, null);
         } else {
            var74 = null;
         }

         this.setDescription(var53, var74, var1.getBodyTextColor(), var20);
         val var54: EmbedProvider = var1.getProvider();
         val var55: java.lang.String;
         if (var54 != null) {
            var55 = var54.getName();
         } else {
            var55 = null;
         }

         this.setProvider(var55, var1.getProviderColor(), var20);
         this.setBackgroundColorEnabled(kotlin.jvm.internal.q.c(var1.getDisableBackgroundColor(), java.lang.Boolean.TRUE) xor true, var1.getBackgroundColor());
         this.setBorder(var1.getBorderLeftColor());
         val var56: EmbedAuthor = var1.getAuthor();
         val var57: java.lang.String;
         if (var56 != null) {
            var57 = var56.getImageUrl();
         } else {
            var57 = null;
         }

         val var75: EmbedAuthor = var1.getAuthor();
         val var76: java.lang.String;
         if (var75 != null) {
            var76 = var75.getName();
         } else {
            var76 = null;
         }

         this.setAuthor(var57, var76);
         val var58: EmbedAuthor = var1.getAuthor();
         val var59: t;
         if (var58 != null && var58.getUrl() != null) {
            var59 = new t(var15, var5, var1);
         } else {
            var59 = null;
         }

         this.setAuthorOnClickListener(var59, var20);
         val var68: java.util.List = var1.getFields();
         var var60: java.util.List = var68;
         if (var68 == null) {
            var60 = kotlin.collections.i.k();
         }

         this.setFields-SAQFhFE(var60, var5, var10, var11, var12, var13, var18, var19, var20, var21, var22, var23, var24);
         val var61: EmbedFooter = var1.getFooter();
         val var62: java.lang.String;
         if (var61 != null) {
            var62 = var61.getImageUrl();
         } else {
            var62 = null;
         }

         val var69: EmbedFooter = var1.getFooter();
         val var70: java.lang.String;
         if (var69 != null) {
            var70 = var69.getContent();
         } else {
            var70 = null;
         }

         this.setFooter(var62, var70, var20);
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

         val var63: java.util.List = EmbedUtilsKt.toImageMediaSources-SHRpUJI(var1, var3, var5);
         if (var63 != null) {
            var2 = (int)(var7 * 0.75);
            var6 = MessageAccessoriesView.Companion.getWidthForEmbedContent(var6, var31, var32);
            val var71: MediaContainingViewResizer = MediaContainingViewResizer.INSTANCE;
            val var43: ConstraintLayout = this.binding.inlineMediaContainer;
            kotlin.jvm.internal.q.g(this.binding.inlineMediaContainer, "inlineMediaContainer");
            MediaContainingViewResizer.resizeLayoutParams$default(var71, var43, var6, var2, var6, var2, null, 16, null);
            val var45: java.util.Iterator = kotlin.collections.i.Z0(
                  var63,
                  new EmbedViewResizingMediaView[]{
                     this.binding.inlineMediaView, this.binding.inlineMediaView2, this.binding.inlineMediaView3, this.binding.inlineMediaView4
                  }
               )
               .iterator();

            for (int var40 = 0; var45.hasNext(); var40++) {
               val var64: Any = var45.next();
               if (var40 < 0) {
                  kotlin.collections.i.u();
               }

               val var65: MediaSource = (var64 as Pair).a() as MediaSource;
               val var73: EmbedViewResizingMediaView = (var64 as Pair).b() as EmbedViewResizingMediaView;
               kotlin.jvm.internal.q.e(var73);
               this.setMediaEmbed(var73, var1, var65, 0, 0);
               var73.setOnMediaClickListeners(new u(var16, var65, var40), var17);
            }
         } else {
            val var46: MediaSource = EmbedUtilsKt.toMediaSource-UBIQNlQ(var1, var3, var5, var9, var28);
            if (var46 != null) {
               val var66: EmbedViewResizingMediaView = this.binding.inlineMediaView;
               kotlin.jvm.internal.q.g(this.binding.inlineMediaView, "inlineMediaView");
               this.setMediaEmbed(var66, var1, var46, var7, MessageAccessoriesView.Companion.getWidthForEmbedContent(var6, var31, var32));
               this.binding.inlineMediaView.setOnMediaClickListeners(new v(var16, var46, var30, this), var17);
            }

            if (if (EmbedView.WhenMappings.$EnumSwitchMapping$0[var1.getType().ordinal()] == 1) var1.getVideo() == null else var46 == null) {
               this.setThumbnail(var1.getThumbnail());
            }
         }
      }

      val var38: java.lang.String = var1.getObscureAwaitingScan();
      val var41: Boolean;
      if (var38 != null && !kotlin.text.h.x(var38)) {
         var41 = false;
      } else {
         var41 = true;
      }

      this.configureSpoiler(var27, var41 xor true);
   }
}

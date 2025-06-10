package com.discord.chat.presentation.textutils

import android.content.Context
import android.graphics.Color
import android.graphics.Paint
import android.graphics.PorterDuffColorFilter
import android.graphics.Paint.FontMetrics
import android.graphics.Paint.Style
import android.graphics.PorterDuff.Mode
import android.net.Uri
import android.text.SpannableStringBuilder
import android.text.style.AbsoluteSizeSpan
import android.text.style.BackgroundColorSpan
import android.text.style.ForegroundColorSpan
import android.text.style.RelativeSizeSpan
import android.text.style.StrikethroughSpan
import android.text.style.UnderlineSpan
import android.text.style.LeadingMarginSpan.Standard
import android.util.SizeF
import android.view.View
import com.discord.chat.bridge.contentnode.AttachmentLinkContentNode
import com.discord.chat.bridge.contentnode.BlockQuoteContentNode
import com.discord.chat.bridge.contentnode.BulletListContentNode
import com.discord.chat.bridge.contentnode.ChannelMentionContentNode
import com.discord.chat.bridge.contentnode.ChannelNameContentNode
import com.discord.chat.bridge.contentnode.CodeBlockContentNode
import com.discord.chat.bridge.contentnode.CommandMentionContentNode
import com.discord.chat.bridge.contentnode.ContentNode
import com.discord.chat.bridge.contentnode.EmojiContentNode
import com.discord.chat.bridge.contentnode.EmphasisContentNode
import com.discord.chat.bridge.contentnode.ErrorContentNode
import com.discord.chat.bridge.contentnode.GuildNameContentNode
import com.discord.chat.bridge.contentnode.HeadingContentNode
import com.discord.chat.bridge.contentnode.InlineCodeContentNode
import com.discord.chat.bridge.contentnode.LHeadingContentNode
import com.discord.chat.bridge.contentnode.LineBreakContentNode
import com.discord.chat.bridge.contentnode.LinkContentNode
import com.discord.chat.bridge.contentnode.MentionContentNode
import com.discord.chat.bridge.contentnode.NewLineContentNode
import com.discord.chat.bridge.contentnode.ParagraphContentNode
import com.discord.chat.bridge.contentnode.SoundmojiContentNode
import com.discord.chat.bridge.contentnode.SoundmojiContentNodeKt
import com.discord.chat.bridge.contentnode.SpoilerContentNode
import com.discord.chat.bridge.contentnode.StaticChannelMentionContentNode
import com.discord.chat.bridge.contentnode.StaticChannelMentionType
import com.discord.chat.bridge.contentnode.StrikethroughContentNode
import com.discord.chat.bridge.contentnode.StrongContentNode
import com.discord.chat.bridge.contentnode.SubtextContentNode
import com.discord.chat.bridge.contentnode.TextContentNode
import com.discord.chat.bridge.contentnode.TimestampContentNode
import com.discord.chat.bridge.contentnode.UnderlineContentNode
import com.discord.chat.bridge.contentnode.UserOrRoleMentionContentNode
import com.discord.chat.bridge.rolecolors.RoleColors
import com.discord.chat.bridge.rolecolors.RoleColorsKt
import com.discord.chat.bridge.spoiler.SpoilerIdentifier
import com.discord.chat.bridge.spoiler.SpoilerManager
import com.discord.chat.bridge.structurabletext.AnnotatedStructurableText
import com.discord.chat.bridge.structurabletext.PrimitiveStructurableText
import com.discord.chat.bridge.structurabletext.StructurableText
import com.discord.chat.presentation.message.EnhancedRoleColorsSpan
import com.discord.chat.presentation.message.RoleDotSpan
import com.discord.crash_reporting.CrashReporting
import com.discord.emoji.RenderableEmoji
import com.discord.emoji.RenderableEmojiKt
import com.discord.fonts.DiscordFont
import com.discord.misc.utilities.kotlin.ForceExhaustiveKt
import com.discord.misc.utilities.size.SizeUtilsKt
import com.discord.primitives.UserId
import com.discord.react.FontManager
import com.discord.react_asset_fetcher.ReactAsset
import com.discord.react_asset_fetcher.ReactAssetUtilsKt
import com.discord.react_gesture_handler.nested_touch.NestedClickableSpan
import com.discord.span.utilities.GGSansBoldSpan
import com.discord.span.utilities.GGSansItalicSpan
import com.discord.span.utilities.SpannableStringBuilderExtensionsKt
import com.discord.span.utilities.common.BackgroundStyle
import com.discord.span.utilities.common.BorderStyle
import com.discord.span.utilities.common.ShadowStyle
import com.discord.span.utilities.spannable.BackgroundSpan
import com.discord.span.utilities.spannable.BulletSpan
import com.discord.span.utilities.spannable.ClickableSpan
import com.discord.span.utilities.spannable.OrderedListBulletSpan
import com.discord.span.utilities.spannable.QuoteSpan
import com.discord.span.utilities.spannable.SpoilerSpan
import com.discord.span.utilities.spannable.VerticalPaddingSpan
import com.discord.theme.DiscordThemeObject
import com.discord.theme.R
import com.discord.theme.ThemeManagerKt
import com.discord.theme.utils.ColorUtilsKt
import com.facebook.drawee.backends.pipeline.PipelineDraweeControllerBuilder
import com.facebook.drawee.drawable.ScalingUtils$ScaleType
import com.facebook.drawee.generic.GenericDraweeHierarchyBuilder
import com.facebook.drawee.span.DraweeSpanStringBuilder
import com.facebook.imagepipeline.request.ImageRequestBuilder
import java.util.ArrayList
import kotlin.jvm.functions.Function0
import kotlin.jvm.functions.Function1
import kotlin.jvm.functions.Function2
import kotlin.jvm.functions.Function3
import kotlin.jvm.functions.Function4

private const val CHANNEL_PREFIX: String = "#"
private const val COMMAND_PREFIX: String = "/"

@JvmSynthetic
fun A(var0: LinkContentNode): LinkStyle {
   return toSpannable$lambda$12(var0);
}

@JvmSynthetic
fun B(var0: DraweeSpanStringBuilder, var1: ContentNode, var2: Context, var3: RenderContext, var4: SpannableStringBuilder): Unit {
   return toSpannable$lambda$69$lambda$68(var0, var1, var2, var3, var4);
}

@JvmSynthetic
fun C(var0: RenderContext, var1: ContentNode, var2: View): Unit {
   return toSpannable$lambda$69$lambda$62(var0, var1, var2);
}

@JvmSynthetic
fun D(var0: RenderContext, var1: ContentNode, var2: View): Boolean {
   return toSpannable$lambda$69$lambda$37(var0, var1, var2);
}

@JvmSynthetic
fun E(var0: RenderContext, var1: ContentNode, var2: View): Boolean {
   return toSpannable$lambda$69$lambda$32(var0, var1, var2);
}

@JvmSynthetic
fun F(var0: RenderContext, var1: ContentNode, var2: View): Unit {
   return toSpannable$lambda$69$lambda$19(var0, var1, var2);
}

@JvmSynthetic
fun G(var0: java.lang.String, var1: RenderContext, var2: View): Unit {
   return toSpannable$lambda$69$lambda$41(var0, var1, var2);
}

@JvmSynthetic
fun H(var0: RenderContext, var1: ContentNode, var2: View): Unit {
   return toSpannable$lambda$69$lambda$33(var0, var1, var2);
}

@JvmSynthetic
fun a(var0: ContentNode, var1: RenderContext, var2: View): Boolean {
   return toSpannable$lambda$69$lambda$21(var0, var1, var2);
}

private fun DraweeSpanStringBuilder.appendBulletPoint(content: List<ContentNode>, rc: RenderContext, isOrderedList: Boolean) {
   var var5: Int = SizeUtilsKt.getDpToPx(8);
   val var7: Int = var2.getListNestedLevel();
   val var14: Standard = new Standard(SizeUtilsKt.getDpToPx(var7 * 16));
   val var4: Int = SizeUtilsKt.getDpToPx(2);
   val var15: VerticalPaddingSpan = new VerticalPaddingSpan(var4);
   if (var3) {
      var var13: java.lang.Long = var2.getListOrderedIndex();
      val var9: Long;
      if (var13 != null) {
         var9 = var13;
      } else {
         var9 = 1L;
      }

      var13 = var2.getListLargestOrderedIndex();
      val var11: Long;
      if (var13 != null) {
         var11 = var13;
      } else {
         var11 = 1L;
      }

      if (var2.getSingleLine()) {
         val var23: StringBuilder = new StringBuilder();
         var23.append(var9);
         var23.append(".  ");
         appendToExistingBuilder(kotlin.collections.i.e(new TextContentNode(var23.toString())), var2, var0);
         appendToExistingBuilder(var1, var2, var0);
      } else {
         val var24: OrderedListBulletSpan = new OrderedListBulletSpan(var9, var5, var11, var2.getPaint());
         var5 = var0.length();
         appendToExistingBuilder(var1, var2, var0);
         SpannableStringBuilderExtensionsKt.ensureNewline(var0, new AbsoluteSizeSpan(var4));

         for (int var18 = 0; var18 < 3; var18++) {
            val var16: Any = new Object[]{var14, var24, var15}[var18];
            if (var16 != null) {
               var0.setSpan(var16, var5, var0.length(), 33);
            }
         }
      }
   } else if (var2.getSingleLine()) {
      val var25: java.lang.String;
      if (var2.getListNestedLevel() == 0) {
         var25 = "•  ";
      } else {
         var25 = "◦  ";
      }

      appendToExistingBuilder(kotlin.collections.i.e(new TextContentNode(var25)), var2, var0);
      appendToExistingBuilder(var1, var2, var0);
   } else {
      val var6: Int = SizeUtilsKt.getDpToPx(2);
      val var8: Int = ColorUtilsKt.getThemeColor(var2.getContext(), R.color.primary_360, R.color.primary_400, var2.getTheme());
      val var26: Style;
      if (var7 > 0) {
         var26 = Style.STROKE;
      } else {
         var26 = Style.FILL;
      }

      val var27: BulletSpan = new BulletSpan(var8, var5, false, var6, 0.0F, var26, 20, null);
      var5 = var0.length();
      appendToExistingBuilder(var1, var2, var0);
      SpannableStringBuilderExtensionsKt.ensureNewline(var0, new AbsoluteSizeSpan(var4));

      for (int var19 = 0; var19 < 3; var19++) {
         val var17: Any = new Object[]{var14, var27, var15}[var19];
         if (var17 != null) {
            var0.setSpan(var17, var5, var0.length(), 33);
         }
      }
   }
}

public fun DraweeSpanStringBuilder.appendImage(
   context: Context,
   rc: RenderContext,
   imageUrl: String,
   width: Int,
   height: Int,
   foregroundColor: Int? = null,
   cornerRadius: Float = 0.0F,
   iconPadding: Float = 0.0F
) {
   kotlin.jvm.internal.q.h(var0, "<this>");
   kotlin.jvm.internal.q.h(var1, "context");
   kotlin.jvm.internal.q.h(var2, "rc");
   kotlin.jvm.internal.q.h(var3, "imageUrl");
   val var9: Int = var0.length();
   var0.append('\u200b');
   val var10: com.facebook.drawee.controller.a = (u2.d.g().F(ImageRequestBuilder.x(Uri.parse(ReactAssetUtilsKt.getReactImageUrl(var1, var3))).a()) as PipelineDraweeControllerBuilder)
      .d();
   kotlin.jvm.internal.q.g(var10, "build(...)");
   val var11: GenericDraweeHierarchyBuilder = GenericDraweeHierarchyBuilder.u(var1.getResources()).w(ScalingUtils$ScaleType.e);
   val var13: com.facebook.drawee.generic.a = com.facebook.drawee.generic.a.b(var7);
   var13.s(var8);
   var13.v(com.facebook.drawee.generic.a.a.k);
   var11.K(var13);
   if (var2.spoilerIsHidden()) {
      var11.v(new PorterDuffColorFilter(var2.getTheme().getSpoilerHiddenBackground(), Mode.SRC_IN));
   } else if (var6 != null) {
      var11.v(new PorterDuffColorFilter(var6, Mode.SRC_IN));
   }

   kotlin.jvm.internal.q.g(var11, "apply(...)");
   var0.j(var1, var11.a(), var10, var9, var4, var5, false, 2);
}

@JvmSynthetic
fun `appendImage$default`(
   var0: DraweeSpanStringBuilder,
   var1: Context,
   var2: RenderContext,
   var3: java.lang.String,
   var4: Int,
   var5: Int,
   var6: Int,
   var7: Float,
   var8: Float,
   var9: Int,
   var10: Any
) {
   if ((var9 and 32) != 0) {
      var6 = null;
   }

   if ((var9 and 64) != 0) {
      var7 = 0.0F;
   }

   if ((var9 and 128) != 0) {
      var8 = 0.0F;
   }

   appendImage(var0, var1, var2, var3, var4, var5, var6, var7, var8);
}

private fun List<ContentNode>.appendToExistingBuilder(rc: RenderContext, existingBuilder: DraweeSpanStringBuilder) {
   toSpannable(var0, var1, var2);
}

@JvmSynthetic
fun b(var0: RenderContext, var1: ContentNode, var2: View): Unit {
   return toSpannable$lambda$69$lambda$26(var0, var1, var2);
}

@JvmSynthetic
fun c(var0: RenderContext, var1: ContentNode, var2: View): Unit {
   return toSpannable$lambda$69$lambda$38(var0, var1, var2);
}

private fun DraweeSpanStringBuilder.changeTextSizeSp(textSizeSp: Int, renderContext: RenderContext, action: (DraweeSpanStringBuilder, RenderContext) -> Unit) {
   var1 = FontManager.INSTANCE.getScaledSpToPx(var1, var2.getContext());
   var2 = RenderContext.copy$default(
      var2,
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
      null,
      null,
      false,
      false,
      false,
      false,
      false,
      null,
      null,
      0,
      null,
      null,
      false,
      null,
      null,
      getBaselineHeightForFontSizePx(var2.getPaint(), var1),
      null,
      1073741823,
      null
   );
   val var4: AbsoluteSizeSpan = new AbsoluteSizeSpan(var1);
   var1 = var0.length();
   var3.invoke(var0, var2);
   val var8: Any = new Object[]{var4}[0];
   if (var8 != null) {
      var0.setSpan(var8, var1, var0.length(), 33);
   }
}

@JvmSynthetic
fun d(var0: java.lang.String, var1: java.lang.String): Unit {
   return toSpannable$lambda$5(var0, var1);
}

@JvmSynthetic
fun e(var0: LinkContentNode): Unit {
   return toSpannable$lambda$0(var0);
}

@JvmSynthetic
fun f(var0: LinkContentNode): Unit {
   return toSpannable$lambda$1(var0);
}

@JvmSynthetic
fun g(var0: RenderContext, var1: ContentNode, var2: View): Unit {
   return toSpannable$lambda$69$lambda$65(var0, var1, var2);
}

public fun getBaselineHeightForFontSizePx(paint: Paint, fontSizePx: Int): Float {
   kotlin.jvm.internal.q.h(var0, "paint");
   val var2: Float = var0.getTextSize();
   var0.setTextSize((float)var1);
   val var4: FontMetrics = var0.getFontMetrics();
   kotlin.jvm.internal.q.g(var4, "getFontMetrics(...)");
   val var3: Float = getBaselineHeightPx(var4);
   var0.setTextSize(var2);
   return var3;
}

public fun getBaselineHeightPx(fontMetrics: FontMetrics): Float {
   kotlin.jvm.internal.q.h(var0, "fontMetrics");
   return var0.descent - var0.ascent;
}

private fun getIconPaddingMultiplier(iconType: String): Float {
   val var1: Float;
   if (!kotlin.jvm.internal.q.c(var0, "post") && !kotlin.jvm.internal.q.c(var0, "forum")) {
      var1 = 0.0F;
   } else {
      var1 = 0.2F;
   }

   return var1;
}

public fun getIconSize(iconType: String?, baselineHeight: Float): Int {
   var var2: Int = SizeUtilsKt.getDpToPx(20);
   if (var1 >= 0.0F) {
      var2 = (int)(var1 * getIconSizeMultiplier(var0));
   }

   return var2;
}

private fun getIconSizeMultiplier(iconType: String?): Double {
   if (var0 != null) {
      switch (var0.hashCode()) {
         case -1480766844:
            if (var0.equals("_caret")) {
               return 0.55;
            }
            break;
         case -1478565049:
            if (var0.equals("_emoji")) {
               return 0.963;
            }
            break;
         case -1476485388:
            if (var0.equals("_guild")) {
               return 0.85;
            }
            break;
         case 3446944:
            if (var0.equals("post")) {
               return 0.65;
            }
            break;
         case 97619233:
            if (var0.equals("forum")) {
               return 0.65;
            }
         default:
      }
   }

   return 0.75;
}

@JvmSynthetic
fun h(var0: DraweeSpanStringBuilder, var1: ForegroundColorSpan, var2: ContentNode, var3: Boolean, var4: DraweeSpanStringBuilder, var5: RenderContext): Unit {
   return toSpannable$lambda$69$lambda$45(var0, var1, var2, var3, var4, var5);
}

@JvmSynthetic
fun i(var0: CommandMentionContentNode): Unit {
   return toSpannable$lambda$7(var0);
}

@JvmSynthetic
fun j(var0: RenderContext, var1: GenericDraweeHierarchyBuilder): Unit {
   return toSpannable$lambda$69$lambda$68$lambda$67$lambda$66(var0, var1);
}

@JvmSynthetic
fun k(var0: RenderContext, var1: ContentNode, var2: View): Unit {
   return toSpannable$lambda$69$lambda$29(var0, var1, var2);
}

@JvmSynthetic
fun l(var0: RenderContext, var1: ContentNode, var2: View): Unit {
   return toSpannable$lambda$69$lambda$35(var0, var1, var2);
}

@JvmSynthetic
fun m(var0: CommandMentionContentNode): Unit {
   return toSpannable$lambda$8(var0);
}

private fun makeMentionBackgroundSpan(rc: RenderContext, backgroundColor: Int): BackgroundSpan {
   if (var0.spoilerExists()) {
      var1 = var0.getTheme().getSpoilerHiddenBackground();
   }

   val var2: Byte;
   if (var0.spoilerExists()) {
      var2 = 0;
   } else {
      var2 = 3;
   }

   return new BackgroundSpan(new BackgroundStyle(var1, var2, 0, 4, null), null, null, 6, null);
}

@JvmSynthetic
fun n(var0: InlineCodeContentNode): Unit {
   return toSpannable$lambda$10(var0);
}

@JvmSynthetic
fun o(var0: ContentNode, var1: DraweeSpanStringBuilder, var2: DraweeSpanStringBuilder, var3: RenderContext): Unit {
   return toSpannable$lambda$69$lambda$49$lambda$48(var0, var1, var2, var3);
}

@JvmSynthetic
fun p(var0: java.lang.String, var1: java.lang.String, var2: java.lang.String): Unit {
   return toSpannable$lambda$2(var0, var1, var2);
}

@JvmSynthetic
fun q(var0: java.lang.String, var1: java.lang.String, var2: java.lang.String, var3: java.lang.String): Unit {
   return toSpannable$lambda$6(var0, var1, var2, var3);
}

@JvmSynthetic
fun r(var0: RenderContext, var1: ContentNode, var2: View): Boolean {
   return toSpannable$lambda$69$lambda$28(var0, var1, var2);
}

@JvmSynthetic
fun s(var0: java.lang.String): Unit {
   return toSpannable$lambda$9(var0);
}

private fun DraweeSpanStringBuilder.simulateInlineNewline() {
   var0.append("    ");
}

@JvmSynthetic
fun t(var0: java.lang.String): Unit {
   return toSpannable$lambda$4(var0);
}

public fun StructurableText.toSpannable(
   context: Context,
   containerId: String,
   animateEmoji: Boolean,
   showLinkDecorations: Boolean,
   shouldShowRoleDot: Boolean,
   shouldShowRoleOnName: Boolean,
   paint: Paint,
   onLinkClicked: (LinkContentNode) -> Unit = new v(),
   onLongTapLink: (LinkContentNode) -> Unit = new C(),
   onTapChannel: (String, String?, String?) -> Unit = new D(),
   onLongPressChannel: (String, String?, String?, String?) -> Unit = new E(),
   onTapAttachmentLink: (String) -> Unit = new F(),
   onLongPressAttachmentLink: (String, String) -> Unit = new G(),
   onTapMention: (String?, String, String?, String?) -> Unit = new I(),
   onTapCommand: (CommandMentionContentNode) -> Unit = new J(),
   onLongPressCommand: (CommandMentionContentNode) -> Unit = ...,
   onTapTimestamp: (String) -> Unit = ...,
   onTapInlineCode: (InlineCodeContentNode) -> Unit = ...,
   onTapEmoji: (EmojiContentNode) -> Unit = ...,
   linkStyle: (LinkContentNode) -> LinkStyle = ...,
   onTapSpoiler: () -> Unit = ...,
   onTapSoundmoji: (SoundmojiContentNode) -> Unit = ...,
   singleLine: Boolean = ...,
   theme: DiscordThemeObject = ...,
   baselineHeightPx: Float = ...,
   emojiBaselineHeightOverridePx: Float? = null
): DraweeSpanStringBuilder {
   kotlin.jvm.internal.q.h(var0, "<this>");
   kotlin.jvm.internal.q.h(var1, "context");
   kotlin.jvm.internal.q.h(var2, "containerId");
   kotlin.jvm.internal.q.h(var7, "paint");
   kotlin.jvm.internal.q.h(var8, "onLinkClicked");
   kotlin.jvm.internal.q.h(var9, "onLongTapLink");
   kotlin.jvm.internal.q.h(var10, "onTapChannel");
   kotlin.jvm.internal.q.h(var11, "onLongPressChannel");
   kotlin.jvm.internal.q.h(var12, "onTapAttachmentLink");
   kotlin.jvm.internal.q.h(var13, "onLongPressAttachmentLink");
   kotlin.jvm.internal.q.h(var14, "onTapMention");
   kotlin.jvm.internal.q.h(var15, "onTapCommand");
   kotlin.jvm.internal.q.h(var16, "onLongPressCommand");
   kotlin.jvm.internal.q.h(var17, "onTapTimestamp");
   kotlin.jvm.internal.q.h(var18, "onTapInlineCode");
   kotlin.jvm.internal.q.h(var19, "onTapEmoji");
   kotlin.jvm.internal.q.h(var20, "linkStyle");
   kotlin.jvm.internal.q.h(var21, "onTapSpoiler");
   kotlin.jvm.internal.q.h(var22, "onTapSoundmoji");
   kotlin.jvm.internal.q.h(var24, "theme");
   val var27: DraweeSpanStringBuilder;
   if (var0 is AnnotatedStructurableText) {
      var27 = toSpannable$default(
         (var0 as AnnotatedStructurableText).getContent(),
         new RenderContext(
            var1,
            var2,
            var8,
            var9,
            var20,
            var10,
            var11,
            var12,
            var13,
            var14,
            var15,
            var16,
            var21,
            var17,
            var18,
            var19,
            var22,
            var3,
            var4,
            var5,
            var6,
            var23,
            var7,
            null,
            0,
            null,
            null,
            false,
            null,
            var24,
            var25,
            var26,
            528482304,
            null
         ),
         null,
         2,
         null
      );
   } else {
      if (var0 !is PrimitiveStructurableText) {
         throw new e9.n();
      }

      var27 = new DraweeSpanStringBuilder((var0 as PrimitiveStructurableText).getContent());
   }

   return var27;
}

private fun List<ContentNode>.toSpannable(rc: RenderContext, builder: DraweeSpanStringBuilder = new DraweeSpanStringBuilder()): DraweeSpanStringBuilder {
   var var22: RenderContext = var1;
   var var21: DraweeSpanStringBuilder = var2;
   var var5: Int = 1;
   val var25: java.util.Iterator = var0.iterator();
   var var6: Int = 0;
   var var7: Int = 0;

   while (var25.hasNext()) {
      var var23: Int = (Integer)var25.next();
      if (var7 < 0) {
         kotlin.collections.i.u();
      }

      var var27: ContentNode = var23 as ContentNode;
      var var8: Byte;
      if (var7 == kotlin.collections.i.m(var0)) {
         var8 = var5;
      } else {
         var8 = var6;
      }

      label681: {
         label680: {
            var var26: Context = var1.getContext();
            val var29: BackgroundColorSpan = new BackgroundColorSpan(var1.getTheme().getBackgroundSecondary());
            val var30: RelativeSizeSpan = new RelativeSizeSpan(0.85F);
            var var28: DiscordFontSpan = new DiscordFontSpan(var26, DiscordFont.CodeNormal);
            val var13: Int = ColorUtilsKt.getThemeColor(
               var26, com.discord.chat.R.color.chat_mentions_background_light, com.discord.chat.R.color.chat_mentions_background_dark, var1.getTheme()
            );
            var var10: Int = ColorUtilsKt.getThemeColor(
               var26, com.discord.chat.R.color.chat_mentions_foreground_light, com.discord.chat.R.color.chat_mentions_foreground_dark, var1.getTheme()
            );
            val var14: Int = y.c.k(ColorUtilsKt.getThemeColor(var26, R.color.green_330, R.color.green_330, var1.getTheme()), 25);
            val var12: Int = ColorUtilsKt.getThemeColor(var26, R.color.green_330, R.color.green_330, var1.getTheme());
            if (var27 is BlockQuoteContentNode) {
               if (var1.getSingleLine()) {
                  var21.append("> ");
                  appendToExistingBuilder((var27 as BlockQuoteContentNode).getContent(), var22, var21);
               } else {
                  var23 = new QuoteSpan(var1.getTheme().getInteractiveMuted(), SizeUtilsKt.getDpToPx(3), SizeUtilsKt.getDpToPx(8));
                  var8 = var2.length();
                  appendToExistingBuilder((var27 as BlockQuoteContentNode).getContent(), var22.updateInsets(new l((QuoteSpan)var23)), var21);
                  var23 = new Object[]{var23}[var6];
                  if (var23 != null) {
                     var21.setSpan(var23, var8, var2.length(), 13107233);
                  }
               }
            } else if (var27 is CodeBlockContentNode) {
               if (var1.getSingleLine()) {
                  val var105: Int = var2.length();
                  var21.append(kotlin.text.h.B((var27 as CodeBlockContentNode).getContent(), '\n', ' ', false, 4, null));

                  for (int var86 = var6; var86 < 3; var86 += var5) {
                     var23 = new Object[]{var29, var30, var28}[var86];
                     if (var23 != null) {
                        var21.setSpan(var23, var105, var2.length(), 33);
                     }
                  }
               } else {
                  CodeStyle.INSTANCE.renderCodeBlock(var21, var27 as CodeBlockContentNode, var22, (boolean)var8);
               }
            } else if (var27 is EmojiContentNode) {
               EmojiRendererKt.renderEmoji(var21, var27 as EmojiContentNode, var22);
            } else {
               if (var27 !is EmphasisContentNode) {
                  if (var27 is InlineCodeContentNode) {
                     var23 = null;
                     if (!var1.getInLink()) {
                        var23 = new ClickableSpan(null, -1, null, null, 0.0F, null, null, new T(var22, var27), 125, null);
                     }

                     val var235: ForegroundColorSpan = new ForegroundColorSpan(var1.getTheme().getTextNormal());
                     var8 = var2.length();
                     var21.append((var27 as InlineCodeContentNode).getContent());

                     for (int var83 = 0; var83 < 5; var83 += var5) {
                        var26 = (Context)new Object[]{var23, var29, var30, var28, var235}[var83];
                        if (var26 != null) {
                           var21.setSpan(var26, var8, var2.length(), 33);
                        }
                     }

                     var6 = (byte)var5;
                     var5 = (byte)0;
                     break label680;
                  }

                  if (var27 !is LineBreakContentNode && var27 !is NewLineContentNode) {
                     if (var27 is LinkContentNode) {
                        val var277: LinkStyle = var1.getLinkStyle().invoke(var27) as LinkStyle;
                        val var271: LinkContentNode = var27 as LinkContentNode;
                        var23 = (var27 as LinkContentNode).getLinkColor();
                        if (var23 != null) {
                           var5 = var23;
                        } else {
                           var5 = var277.getLinkColor();
                        }

                        val var229: RoleColors;
                        if (kotlin.jvm.internal.q.c(var271.getShouldShowRoleDot(), java.lang.Boolean.TRUE)) {
                           var229 = null;
                        } else {
                           var229 = RoleColorsKt.toAndroidColors(var271.getRoleColors());
                        }

                        if (var229 != null) {
                           var5 = var229.getPrimaryColor();
                        }

                        if (var229 != null) {
                           var23 = var229.getSecondaryColor();
                        } else {
                           var23 = null;
                        }

                        val var230: Int;
                        if (var229 != null) {
                           var230 = var229.getTertiaryColor();
                        } else {
                           var230 = null;
                        }

                        val var216: ClickableSpan = new ClickableSpan(
                           null, var5, var23, var230, 150.0F, var1.getShowLinkDecorations(), new m(var27, var22), new n(var22, var27), 1, null
                        );
                        val var231: LinkBackgroundStyle = var277.getBackgroundStyle();
                        val var122: Boolean;
                        val var185: BackgroundSpan;
                        if (var231 != null) {
                           val var183: Int = var231.getColor();
                           if (var183 != null) {
                              var5 = var183;
                           } else {
                              var5 = 0;
                           }

                           val var184: Int = var231.getBorderRadius();
                           if (var184 != null) {
                              var6 = var184;
                           } else {
                              var6 = 0;
                           }

                           var185 = new BackgroundSpan(new BackgroundStyle(var5, var6, 0, 4, null), null, null, 6, null);
                           val var232: java.lang.Boolean = var231.getSpaceAround();
                           if (var232 != null) {
                              var122 = var232;
                           } else {
                              var122 = false;
                           }
                        } else {
                           var185 = null;
                           var122 = false;
                        }

                        val var234: DiscordFontSpan = new DiscordFontSpan(var1.getContext(), var277.getFont());
                        var5 = var2.length();
                        if (var122) {
                           var21.append(' ');
                        }

                        var6 = getIconSize(null, var1.getBaselineHeightPx());
                        val var262: ReactAsset = var277.getIcon();
                        if (var262 != null) {
                           appendImage$default(var2, var26, var1, var262.getUri(var26), var6, var6, var277.getLinkColor(), 0.0F, 0.0F, 192, null);
                           var21.append(' ');
                        }

                        appendToExistingBuilder(
                           var271.getContent(),
                           RenderContext.copy$default(
                              var1,
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
                              null,
                              null,
                              false,
                              false,
                              false,
                              false,
                              false,
                              null,
                              null,
                              0,
                              null,
                              null,
                              true,
                              null,
                              null,
                              0.0F,
                              null,
                              -134217729,
                              null
                           ),
                           var2
                        );
                        if (var122) {
                           var2.append(' ');
                        }

                        for (int var82 = 0; var82 < 3; var82++) {
                           val var158: Any = new Object[]{var216, var234, var185}[var82];
                           if (var158 != null) {
                              var2.setSpan(var158, var5, var2.length(), 33);
                           }
                        }
                     } else {
                        label724: {
                           if (var27 is MentionContentNode) {
                              label728: {
                                 val var220: DiscordFontSpan = new DiscordFontSpan(var1.getContext(), DiscordFont.PrimarySemibold);
                                 val var160: MentionContentNode = var27 as MentionContentNode;
                                 if (var27 as MentionContentNode is UserOrRoleMentionContentNode) {
                                    val var266: ClickableSpan = new ClickableSpan(null, -1, null, null, 0.0F, null, null, new o(var1, var27), 125, null);
                                    val var258: UserOrRoleMentionContentNode = var27 as UserOrRoleMentionContentNode;
                                    val var11: Int = (var27 as UserOrRoleMentionContentNode).getRoleColor();
                                    val var201: RoleColors = RoleColorsKt.toAndroidColors((var27 as UserOrRoleMentionContentNode).getRoleColors());
                                    val var92: Byte;
                                    if (var1.getShouldShowRoleDot() && var11 > 0) {
                                       var92 = (byte)var5;
                                    } else {
                                       var92 = 0;
                                    }

                                    val var108: Byte;
                                    if (var1.getShouldShowRoleOnName() && var11 > 0) {
                                       var108 = (byte)var5;
                                    } else {
                                       var108 = 0;
                                    }

                                    val var126: UserId = var258.getUserId-wUX8bhU();
                                    val var15: Long = UserId.constructor-impl(1081004946872352958L);
                                    val var118: Boolean;
                                    if (var126 == null) {
                                       var118 = false;
                                    } else {
                                       var118 = UserId.equals-impl0(var126.unbox-impl(), var15);
                                    }

                                    if (var118) {
                                       var5 = var14;
                                    } else if (var108 != 0) {
                                       if (var201 != null) {
                                          var5 = var201.getPrimaryColor();
                                       } else {
                                          var5 = var11;
                                       }

                                       var5 = y.c.k(var5, 25);
                                    } else {
                                       var5 = var13;
                                    }

                                    label697: {
                                       var275 = makeMentionBackgroundSpan(var1, var5);
                                       if (var108 != 0 && !var118) {
                                          val var127: Int;
                                          if (var201 != null) {
                                             var127 = var201.getSecondaryColor();
                                          } else {
                                             var127 = null;
                                          }

                                          if (var127 != null) {
                                             val var129: java.util.List = kotlin.collections.i.q(
                                                new Integer[]{var201.getPrimaryColor(), var201.getSecondaryColor()}
                                             );
                                             if (var201.getTertiaryColor() != null) {
                                                var129.add(var201.getTertiaryColor());
                                             }

                                             var128 = new EnhancedRoleColorsSpan(kotlin.collections.i.Q0(var129));
                                             break label697;
                                          }
                                       }

                                       if (var118) {
                                          var6 = var12;
                                       } else {
                                          var6 = var10;
                                          if (var108 != 0) {
                                             var6 = y.c.k(var11, 255);
                                          }
                                       }

                                       var128 = new ForegroundColorSpan(var6);
                                    }

                                    var6 = var2.length();
                                    if (var92 != 0) {
                                       val var242: RoleDotSpan = new RoleDotSpan(var26, var5, 0, 4, null);
                                       var var171: RoleColors = var201;
                                       if (var201 == null) {
                                          var171 = new RoleColors(var11, null, null);
                                       }

                                       var242.setColors(var171);
                                       var2.append("#");
                                       var2.setSpan(var242, var2.length() - 1, var2.length(), 33);
                                    }

                                    var2.append(toSpannable$default(var258.getContent(), var1, null, 2, null));

                                    for (int var44 = 0; var44 < 4; var44++) {
                                       var22 = (RenderContext)new Object[]{var220, var266, var275, var128}[var44];
                                       if (var22 != null) {
                                          var2.setSpan(var22, var6, var2.length(), 33);
                                       }
                                    }

                                    var21 = var2;
                                 } else {
                                    label725: {
                                       if (var160 is ChannelMentionContentNode) {
                                          val var272: ClickableSpan = new ClickableSpan(
                                             null, -1, null, null, 0.0F, null, new p(var1, var27), new q(var1, var27), 61, null
                                          );
                                          val var263: BackgroundSpan = makeMentionBackgroundSpan(var1, var13);
                                          val var196: ForegroundColorSpan = new ForegroundColorSpan(var10);
                                          var6 = var2.length();
                                          val var161: ChannelMentionContentNode = var27 as ChannelMentionContentNode;
                                          val var255: java.util.List = (var27 as ChannelMentionContentNode).getInContent();
                                          if (var255 != null) {
                                             appendToExistingBuilder(var255, var1, var21);
                                             var5 = getIconSize("_caret", var1.getBaselineHeightPx());
                                             appendImage$default(
                                                var2,
                                                var26,
                                                var1,
                                                ReactAsset.Caret.getUri(var26),
                                                var5,
                                                var5,
                                                var196.getForegroundColor(),
                                                0.0F,
                                                0.0F,
                                                192,
                                                null
                                             );
                                          }

                                          val var162: java.util.List = var161.getContent();
                                          var21 = var2;
                                          if (var162 != null) {
                                             appendToExistingBuilder(var162, var1, var2);
                                          }

                                          var5 = 0;

                                          while (true) {
                                             var164 = var21;
                                             if (var5 >= 4) {
                                                break;
                                             }

                                             var22 = (RenderContext)new Object[]{var220, var272, var263, var196}[var5];
                                             if (var22 != null) {
                                                var21.setSpan(var22, var6, var2.length(), 33);
                                             }

                                             var5++;
                                          }
                                       } else {
                                          if (var160 !is AttachmentLinkContentNode) {
                                             if (var160 !is StaticChannelMentionContentNode) {
                                                val var65: Byte = (byte)var5;
                                                if (var160 !is CommandMentionContentNode) {
                                                   throw new e9.n();
                                                }

                                                val var221: BackgroundSpan = makeMentionBackgroundSpan(var1, var13);
                                                val var199: ForegroundColorSpan = new ForegroundColorSpan(var10);
                                                val var170: ClickableSpan = new ClickableSpan(
                                                   null, -1, null, null, 0.0F, null, new w(var1, var27), new H(var1, var27), 61, null
                                                );
                                                val var241: GGSansBoldSpan = new GGSansBoldSpan(var1.getContext());
                                                var8 = var2.length();
                                                val var107: Int = var2.length();
                                                var21.append("/");
                                                var21.append(toSpannable$default((var27 as CommandMentionContentNode).getContent(), var1, null, 2, null));

                                                for (int var41 = 0; var41 < 3; var41 += var65) {
                                                   var27 = (ContentNode)new Object[]{var170, var221, var199}[var41];
                                                   if (var27 != null) {
                                                      var21.setSpan(var27, var107, var2.length(), 33);
                                                   }
                                                }

                                                var23 = (Integer)new Object[]{var241}[0];
                                                var5 = var65;
                                                var164 = var21;
                                                if (var23 != null) {
                                                   var21.setSpan(var23, var8, var2.length(), 33);
                                                   var164 = var21;
                                                   var5 = var65;
                                                }
                                                break label728;
                                             }

                                             val var198: ClickableSpan = new ClickableSpan(
                                                null, -1, null, null, 0.0F, null, null, new t(var1, var27), 125, null
                                             );
                                             val var265: BackgroundSpan = makeMentionBackgroundSpan(var1, var13);
                                             val var169: ForegroundColorSpan = new ForegroundColorSpan(var10);
                                             var8 = getIconSize(null, var1.getBaselineHeightPx());
                                             var6 = var2.length();
                                             val var256: StaticChannelMentionContentNode = var27 as StaticChannelMentionContentNode;
                                             val var106: Int = TextUtilsKt.WhenMappings.$EnumSwitchMapping$0[(var27 as StaticChannelMentionContentNode)
                                                .getId()
                                                .ordinal()];
                                             if (var106 == var5 || var106 == 2) {
                                                appendImage$default(
                                                   var2,
                                                   var26,
                                                   var1,
                                                   ReactAsset.Home.getUri(var26),
                                                   var8,
                                                   var8,
                                                   var169.getForegroundColor(),
                                                   0.0F,
                                                   0.0F,
                                                   192,
                                                   null
                                                );
                                             } else if (var106 != 3) {
                                                if (var106 != 4) {
                                                   if (var106 != 5) {
                                                      var21.append("#");
                                                   } else {
                                                      appendImage$default(
                                                         var2,
                                                         var26,
                                                         var1,
                                                         ReactAsset.Link.getUri(var26),
                                                         var8,
                                                         var8,
                                                         var169.getForegroundColor(),
                                                         0.0F,
                                                         0.0F,
                                                         192,
                                                         null
                                                      );
                                                   }
                                                } else {
                                                   appendImage$default(
                                                      var2,
                                                      var26,
                                                      var1,
                                                      ReactAsset.ChannelBrowse.getUri(var26),
                                                      var8,
                                                      var8,
                                                      var169.getForegroundColor(),
                                                      0.0F,
                                                      0.0F,
                                                      192,
                                                      null
                                                   );
                                                }
                                             } else {
                                                appendImage$default(
                                                   var2,
                                                   var26,
                                                   var1,
                                                   ReactAsset.ChannelBrowse.getUri(var26),
                                                   var8,
                                                   var8,
                                                   var169.getForegroundColor(),
                                                   0.0F,
                                                   0.0F,
                                                   192,
                                                   null
                                                );
                                             }

                                             var5 = var6;
                                             var21.append(toSpannable$default(var256.getContent(), var1, null, 2, null));
                                             var6 = 0;

                                             while (true) {
                                                if (var6 >= 4) {
                                                   break label725;
                                                }

                                                var26 = (Context)new Object[]{var220, var198, var265, var169}[var6];
                                                if (var26 != null) {
                                                   var21.setSpan(var26, var5, var2.length(), 33);
                                                }

                                                var6++;
                                             }
                                          }

                                          val var273: ClickableSpan = new ClickableSpan(
                                             null, -1, null, null, 0.0F, null, new r(var1, var27), new s(var1, var27), 61, null
                                          );
                                          val var264: BackgroundSpan = makeMentionBackgroundSpan(var1, var13);
                                          val var197: ForegroundColorSpan = new ForegroundColorSpan(var10);
                                          var6 = var2.length();
                                          var5 = getIconSize(null, var1.getBaselineHeightPx());
                                          appendImage$default(
                                             var2,
                                             var26,
                                             var1,
                                             ReactAsset.Attachment.getUri(var26),
                                             var5,
                                             var5,
                                             var197.getForegroundColor(),
                                             0.0F,
                                             0.0F,
                                             192,
                                             null
                                          );
                                          var21.append(' ');
                                          val var166: java.util.List = (var27 as AttachmentLinkContentNode).getContent();
                                          if (var166 != null) {
                                             appendToExistingBuilder(var166, var1, var21);
                                          }

                                          var5 = 0;

                                          while (true) {
                                             var164 = var21;
                                             if (var5 >= 4) {
                                                break;
                                             }

                                             var22 = (RenderContext)new Object[]{var220, var273, var264, var197}[var5];
                                             if (var22 != null) {
                                                var21.setSpan(var22, var6, var2.length(), 33);
                                             }

                                             var5++;
                                          }
                                       }

                                       var5 = 1;
                                       break label728;
                                    }
                                 }

                                 var5 = 1;
                                 var164 = var21;
                              }

                              ForceExhaustiveKt.forceExhaustive(var2);
                              var21 = var164;
                           } else {
                              if (var27 !is ParagraphContentNode) {
                                 if (var27 !is SpoilerContentNode) {
                                    var159 = var21;
                                    if (var27 is StrikethroughContentNode) {
                                       val var132: StrikethroughSpan = new StrikethroughSpan();
                                       var6 = var2.length();
                                       appendToExistingBuilder((var27 as StrikethroughContentNode).getContent(), var1, var21);
                                       val var133: Any = new Object[]{var132}[0];
                                       if (var133 != null) {
                                          var21.setSpan(var133, var6, var2.length(), 33);
                                       }
                                    } else if (var27 is SubtextContentNode) {
                                       if (var1.getSingleLine()) {
                                          appendToExistingBuilder((var27 as SubtextContentNode).getContent(), var1, var21);
                                          if (var8 == 0) {
                                             simulateInlineNewline(var2);
                                          }
                                       } else {
                                          val var70: Byte;
                                          if (FontManager.INSTANCE.getIsClassicChatFontScaleEnabled(var26)) {
                                             var70 = 13;
                                          } else {
                                             var70 = 14;
                                          }

                                          changeTextSizeSp(
                                             var21, var70, var1, new N(var21, new ForegroundColorSpan(var1.getTheme().getTextMuted()), var27, (boolean)var8)
                                          );
                                       }
                                    } else {
                                       var var120: Boolean = var27 is HeadingContentNode;
                                       var var71: Int = 16;
                                       if (var120) {
                                          val var135: DiscordFontSpan = new DiscordFontSpan(var1.getContext(), DiscordFont.PrimaryExtraBold);
                                          if (var1.getSingleLine()) {
                                             var71 = var2.length();
                                             appendToExistingBuilder((var27 as HeadingContentNode).getContent(), var1, var21);
                                             simulateInlineNewline(var2);
                                             val var136: Any = new Object[]{var135}[0];
                                             if (var136 != null) {
                                                var21.setSpan(var136, var71, var2.length(), 33);
                                             }
                                          } else {
                                             var var109: Int = (var27 as HeadingContentNode).getLevel();
                                             if (var109 != var5) {
                                                if (var109 == 2) {
                                                   var71 = 20;
                                                }
                                             } else {
                                                var71 = 24;
                                             }

                                             if (var2.length() > 0) {
                                                var109 = SizeUtilsKt.getDpToPx(8);
                                             } else {
                                                var109 = SizeUtilsKt.getDpToPx(4);
                                             }

                                             val var203: AbsoluteSizeSpan = new AbsoluteSizeSpan(var109);
                                             var109 = var2.length();
                                             var21.append("\n");
                                             var23 = (Integer)new Object[]{var203}[0];
                                             if (var23 != null) {
                                                var21.setSpan(var23, var109, var2.length(), 33);
                                             }

                                             var109 = var2.length();
                                             changeTextSizeSp(var21, var71, var1, new O(var27, var21));
                                             var var137: Any = new Object[]{var135}[0];
                                             if (var137 != null) {
                                                var21.setSpan(var137, var109, var2.length(), 33);
                                             }

                                             if (var8 == 0) {
                                                var137 = new AbsoluteSizeSpan(SizeUtilsKt.getDpToPx(4));
                                                var71 = var2.length();
                                                var21.append("\n");
                                                var137 = new Object[]{var137}[0];
                                                if (var137 != null) {
                                                   var21.setSpan(var137, var71, var2.length(), 33);
                                                }
                                             } else {
                                                var137 = new AbsoluteSizeSpan(0);
                                                var71 = var2.length();
                                                var21.append("\n\u200b");
                                                var137 = new Object[]{var137}[0];
                                                if (var137 != null) {
                                                   var21.setSpan(var137, var71, var2.length(), 33);
                                                }
                                             }
                                          }
                                       } else {
                                          if (var27 !is LHeadingContentNode) {
                                             var6 = (byte)var5;
                                             if (var27 is BulletListContentNode) {
                                                var var155: RenderContext = RenderContext.copy$default(
                                                   var1,
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
                                                   null,
                                                   null,
                                                   false,
                                                   false,
                                                   false,
                                                   false,
                                                   false,
                                                   null,
                                                   null,
                                                   0,
                                                   null,
                                                   null,
                                                   false,
                                                   null,
                                                   null,
                                                   0.0F,
                                                   null,
                                                   -1,
                                                   null
                                                );
                                                val var177: BulletListContentNode = var27 as BulletListContentNode;
                                                val var20: Boolean = (var27 as BulletListContentNode).getOrdered();
                                                val var116: Long;
                                                if (var20) {
                                                   val var212: java.lang.Long = var177.getStart();
                                                   if (var212 != null) {
                                                      var116 = var212;
                                                   } else {
                                                      var116 = 1L;
                                                   }

                                                   var155 = RenderContext.copy$default(
                                                      var155,
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
                                                      null,
                                                      null,
                                                      false,
                                                      false,
                                                      false,
                                                      false,
                                                      false,
                                                      null,
                                                      null,
                                                      0,
                                                      null,
                                                      (long)(var177.getItems().size() - 1) + var116,
                                                      false,
                                                      null,
                                                      null,
                                                      0.0F,
                                                      null,
                                                      -67108865,
                                                      null
                                                   );
                                                } else {
                                                   var116 = 0L;
                                                }

                                                for (java.util.List var178 : var177.getItems()) {
                                                   val var228: ArrayList = new ArrayList();
                                                   val var114: Int = var178.size();
                                                   val var252: java.util.Iterator = var178.iterator();

                                                   for (int var56 = 0; var252.hasNext(); var56++) {
                                                      var22 = (RenderContext)var252.next();
                                                      if (var56 < 0) {
                                                         kotlin.collections.i.u();
                                                      }

                                                      var27 = var22 as ContentNode;
                                                      var120 = var22 as ContentNode is BulletListContentNode;
                                                      val var100: Byte;
                                                      if (var56 == var114 - 1) {
                                                         var100 = var6;
                                                      } else {
                                                         var100 = 0;
                                                      }

                                                      if (!var120) {
                                                         var228.add(var27);
                                                      }

                                                      if (var120 || var100 != 0) {
                                                         var22 = var155;
                                                         if (var20) {
                                                            var var17: Long;
                                                            if (var155.getListOrderedIndex() != null) {
                                                               val var181: java.lang.Long = var155.getListOrderedIndex();
                                                               if (var181 != null) {
                                                                  var17 = var181;
                                                               } else {
                                                                  var17 = 0L;
                                                               }

                                                               var17++;
                                                            } else {
                                                               var17 = var116;
                                                            }

                                                            var22 = RenderContext.copy$default(
                                                               var155,
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
                                                               null,
                                                               null,
                                                               false,
                                                               false,
                                                               false,
                                                               false,
                                                               false,
                                                               null,
                                                               null,
                                                               0,
                                                               var17,
                                                               null,
                                                               false,
                                                               null,
                                                               null,
                                                               0.0F,
                                                               null,
                                                               -33554433,
                                                               null
                                                            );
                                                         }

                                                         var155 = var22;
                                                         appendBulletPoint(var2, var228, var22, var20);
                                                         if (var1.getSingleLine()) {
                                                            simulateInlineNewline(var2);
                                                         }

                                                         var228.clear();
                                                      }

                                                      if (var120) {
                                                         appendToExistingBuilder(
                                                            kotlin.collections.i.e(var27),
                                                            RenderContext.copy$default(
                                                               var155,
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
                                                               null,
                                                               null,
                                                               false,
                                                               false,
                                                               false,
                                                               false,
                                                               false,
                                                               null,
                                                               null,
                                                               var155.getListNestedLevel() + 1,
                                                               null,
                                                               null,
                                                               false,
                                                               null,
                                                               null,
                                                               0.0F,
                                                               null,
                                                               -117440513,
                                                               null
                                                            ),
                                                            var2
                                                         );
                                                      }
                                                   }
                                                }

                                                var159 = var2;
                                             } else {
                                                label726: {
                                                   if (var27 is StrongContentNode) {
                                                      val var144: GGSansBoldSpan = new GGSansBoldSpan(var1.getContext());
                                                      var5 = var2.length();
                                                      appendToExistingBuilder((var27 as StrongContentNode).getContent(), var1, var21);
                                                      val var145: Any = new Object[]{var144}[0];
                                                      if (var145 != null) {
                                                         var21.setSpan(var145, var5, var2.length(), 33);
                                                      }
                                                   } else {
                                                      var123 = var1;
                                                      if (var27 is TextContentNode) {
                                                         val var146: java.lang.String = (var27 as TextContentNode).getContent();
                                                         if (var146 != null) {
                                                            var21.append(var146);
                                                         }
                                                      } else if (var27 is TimestampContentNode) {
                                                         val var148: ClickableSpan = new ClickableSpan(
                                                            null,
                                                            ColorUtilsKt.getThemeColor(var26, R.color.primary_600, R.color.primary_200, var1.getTheme()),
                                                            null,
                                                            null,
                                                            0.0F,
                                                            null,
                                                            null,
                                                            new P(var1, var27),
                                                            125,
                                                            null
                                                         );
                                                         val var206: BackgroundColorSpan = new BackgroundColorSpan(
                                                            ColorUtilsKt.getThemeColor(
                                                               var26,
                                                               R.color.background_modifier_accent_light,
                                                               R.color.background_modifier_accent_dark,
                                                               var1.getTheme()
                                                            )
                                                         );
                                                         var8 = var2.length();
                                                         var21.append((var27 as TimestampContentNode).getFormatted());

                                                         for (int var49 = 0; var49 < 2; var49++) {
                                                            val var225: Any = new Object[]{var148, var206}[var49];
                                                            if (var225 != null) {
                                                               var159.setSpan(var225, var8, var2.length(), 33);
                                                            }
                                                         }
                                                      } else if (var27 is UnderlineContentNode) {
                                                         val var207: UnderlineSpan = new UnderlineSpan();
                                                         var5 = var2.length();
                                                         appendToExistingBuilder((var27 as UnderlineContentNode).getContent(), var1, var21);
                                                         val var149: Any = new Object[]{var207}[0];
                                                         if (var149 != null) {
                                                            var21.setSpan(var149, var5, var2.length(), 33);
                                                         }
                                                      } else if (var27 is ChannelNameContentNode) {
                                                         val var208: ChannelNameContentNode = var27 as ChannelNameContentNode;
                                                         if ((var27 as ChannelNameContentNode).getIcon() != null) {
                                                            var5 = getIconSize(var208.getIconType(), var1.getBaselineHeightPx());
                                                            appendImage$default(
                                                               var2,
                                                               var26,
                                                               var1,
                                                               var208.getIcon(),
                                                               var5,
                                                               var5,
                                                               var10,
                                                               0.0F,
                                                               (float)var5 * getIconPaddingMultiplier(var208.getIconType()),
                                                               64,
                                                               null
                                                            );
                                                         }

                                                         appendToExistingBuilder(var208.getContent(), var1, var21);
                                                      } else {
                                                         if (var27 !is GuildNameContentNode) {
                                                            if (var27 !is SoundmojiContentNode) {
                                                               if (var27 !is ErrorContentNode) {
                                                                  throw new e9.n();
                                                               }

                                                               val var211: CrashReporting = CrashReporting.INSTANCE;
                                                               val var227: java.lang.Throwable = (var27 as ErrorContentNode).getThrowable();
                                                               var5 = (byte)0;
                                                               CrashReporting.captureException$default(var211, var227, false, 2, null);
                                                               var21.append("���");
                                                               break label681;
                                                            }

                                                            val var226: VerticalPaddingSpan = new VerticalPaddingSpan(SizeUtilsKt.getDpToPx(4));
                                                            var28 = new DiscordFontSpan(var1.getContext(), DiscordFont.PrimarySemibold);
                                                            val var210: ClickableSpan = new ClickableSpan(
                                                               null, null, null, null, 0.0F, null, null, new Q(var1, var27), 127, null
                                                            );
                                                            val var276: ForegroundColorSpan = new ForegroundColorSpan(ThemeManagerKt.getTheme().getTextNormal());
                                                            val var279: BackgroundSpan = new BackgroundSpan(
                                                               new BackgroundStyle(ThemeManagerKt.getTheme().getCardPrimaryBg(), 4, 2),
                                                               new BorderStyle(ThemeManagerKt.getTheme().getBorderStrong(), SizeUtilsKt.getDpToPx(var5)),
                                                               new ShadowStyle(Color.argb(63, 0, 0, 0), SizeUtilsKt.getDpToPx(4), new SizeF(0.0F, 4.0F))
                                                            );
                                                            var21.append(" ");
                                                            val var152: S = new S(var21, var27, var26, var1);
                                                            if (var1.spoilerExists() && !var1.spoilerIsRevealed()) {
                                                               var5 = var2.length();
                                                               var152.invoke(var21);
                                                               val var154: Any = new Object[]{var226}[0];
                                                               if (var154 != null) {
                                                                  var21.setSpan(var154, var5, var2.length(), 33);
                                                               }
                                                            } else {
                                                               var8 = var2.length();
                                                               var152.invoke(var21);

                                                               for (int var54 = 0; var54 < 5; var54++) {
                                                                  val var153: Any = new Object[]{var226, var28, var210, var276, var279}[var54];
                                                                  if (var153 != null) {
                                                                     var159.setSpan(var153, var8, var2.length(), 33);
                                                                  }
                                                               }
                                                            }

                                                            var159.append(" ");
                                                            break label726;
                                                         }

                                                         var5 = getIconSize("_guild", var1.getBaselineHeightPx());
                                                         val var209: GuildNameContentNode = var27 as GuildNameContentNode;
                                                         if ((var27 as GuildNameContentNode).getIcon() != null) {
                                                            appendImage$default(
                                                               var2,
                                                               var26,
                                                               var1,
                                                               var209.getIcon(),
                                                               var5,
                                                               var5,
                                                               null,
                                                               (float)var5 * 0.2F,
                                                               (float)var5 * 0.1F,
                                                               32,
                                                               null
                                                            );
                                                         }

                                                         var21.append(var209.getContent());
                                                      }
                                                   }

                                                   var123 = var1;
                                                   var5 = (byte)0;
                                                   break label681;
                                                }
                                             }

                                             var123 = var1;
                                             var5 = (byte)0;
                                             break label681;
                                          }

                                          val var142: DiscordFontSpan = new DiscordFontSpan(var1.getContext(), DiscordFont.PrimaryExtraBold);
                                          if (!var1.getSingleLine()) {
                                             var71 = FontManager.INSTANCE.getScaledSpToPx(16, var1.getContext());
                                             val var3: Float = getBaselineHeightForFontSizePx(var1.getPaint(), var71);
                                             val var245: AbsoluteSizeSpan = new AbsoluteSizeSpan(var71);
                                             val var259: LHeadingContentNode = var27 as LHeadingContentNode;
                                             if (kotlin.text.h.I((var27 as LHeadingContentNode).getClassName(), "added", false, 2, null)) {
                                                var71 = ThemeManagerKt.getTheme().getTextPositive();
                                             } else if (kotlin.text.h.I(var259.getClassName(), "fixed", false, 2, null)) {
                                                var71 = ThemeManagerKt.getTheme().getTextDanger();
                                             } else if (kotlin.text.h.I(var259.getClassName(), "progress", false, 2, null)) {
                                                var71 = ThemeManagerKt.getTheme().getTextWarning();
                                             } else if (kotlin.text.h.I(var259.getClassName(), "improved", false, 2, null)) {
                                                var71 = ThemeManagerKt.getTheme().getTextBrand();
                                             } else {
                                                var71 = ThemeManagerKt.getTheme().getHeaderPrimary();
                                             }

                                             val var205: ForegroundColorSpan = new ForegroundColorSpan(var71);
                                             if (var2.length() > 0) {
                                                var71 = SizeUtilsKt.getDpToPx(8);
                                             } else {
                                                var71 = SizeUtilsKt.getDpToPx(4);
                                             }

                                             val var224: UnderlineSpan = new UnderlineSpan();
                                             val var113: Int = var2.length();
                                             val var267: AbsoluteSizeSpan = new AbsoluteSizeSpan(var71);
                                             var71 = var2.length();
                                             var21.append("\n");
                                             var28 = (DiscordFontSpan)new Object[]{var267}[0];
                                             if (var28 != null) {
                                                var21.setSpan(var28, var71, var2.length(), 33);
                                             }

                                             var10 = var2.length();
                                             val var269: java.util.List = var259.getContent();
                                             var6 = (byte)var5;
                                             var5 = var113;
                                             val var260: RenderContext = RenderContext.copy$default(
                                                var1,
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
                                                null,
                                                null,
                                                false,
                                                false,
                                                false,
                                                false,
                                                false,
                                                null,
                                                null,
                                                0,
                                                null,
                                                null,
                                                false,
                                                null,
                                                null,
                                                var3,
                                                null,
                                                1073741823,
                                                null
                                             );
                                             var159 = var2;
                                             appendToExistingBuilder(var269, var260, var2);
                                             var26 = (Context)new Object[]{var245}[0];
                                             if (var26 != null) {
                                                var2.setSpan(var26, var10, var2.length(), 33);
                                             }

                                             if (var8 == 0) {
                                                val var247: AbsoluteSizeSpan = new AbsoluteSizeSpan(SizeUtilsKt.getDpToPx(4));
                                                var8 = var2.length();
                                                var2.append("\n");
                                                var26 = (Context)new Object[]{var247}[0];
                                                if (var26 != null) {
                                                   var2.setSpan(var26, var8, var2.length(), 33);
                                                }
                                             } else {
                                                val var249: AbsoluteSizeSpan = new AbsoluteSizeSpan(0);
                                                var8 = var2.length();
                                                var2.append("\n\u200b");
                                                var26 = (Context)new Object[]{var249}[0];
                                                if (var26 != null) {
                                                   var2.setSpan(var26, var8, var2.length(), 33);
                                                }
                                             }

                                             for (int var97 = 0; var97 < 3; var97++) {
                                                var26 = (Context)new Object[]{var142, var205, var224}[var97];
                                                if (var26 != null) {
                                                   var159.setSpan(var26, var5, var2.length(), 33);
                                                }
                                             }

                                             var123 = var1;
                                             var5 = (byte)0;
                                             break label681;
                                          }

                                          var71 = var2.length();
                                          appendToExistingBuilder((var27 as LHeadingContentNode).getContent(), var1, var21);
                                          simulateInlineNewline(var2);
                                          val var143: Any = new Object[]{var142}[0];
                                          if (var143 != null) {
                                             var21.setSpan(var143, var71, var2.length(), 33);
                                          }
                                       }
                                    }

                                    var123 = var1;
                                    var6 = (byte)var5;
                                    var5 = (byte)0;
                                    break label681;
                                 }

                                 val var222: SpoilerContentNode = var27 as SpoilerContentNode;
                                 val var243: java.lang.String = SpoilerIdentifier.Companion
                                    .forNode-2sfwrmE(var27 as SpoilerContentNode, var1.getContainerId(), var7);
                                 val var119: Boolean = SpoilerManager.INSTANCE.isRevealed-V2PEE7g(var243);
                                 val var174: RenderContext.SpoilerState;
                                 if (var119) {
                                    var174 = RenderContext.SpoilerState.Revealed;
                                 } else {
                                    var174 = RenderContext.SpoilerState.Hidden;
                                 }

                                 var var131: ClickableSpan = null;
                                 if (!var119) {
                                    var131 = new ClickableSpan(
                                       NestedClickableSpan.TouchPriority.HIGH, null, null, null, 0.0F, null, null, new M(var243, var1), 126, null
                                    );
                                 }

                                 if (var119) {
                                    var5 = var1.getTheme().getSpoilerRevealedBackground();
                                 } else {
                                    var5 = var1.getTheme().getSpoilerHiddenBackground();
                                 }

                                 val var202: BackgroundSpan = new BackgroundSpan(new BackgroundStyle(var5, 0, 0, 6, null), null, null, 6, null);
                                 val var244: SpoilerSpan = new SpoilerSpan(var119);
                                 var5 = var2.length();
                                 appendToExistingBuilder(
                                    var222.getContent(),
                                    RenderContext.copy$default(
                                       var1,
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
                                       null,
                                       null,
                                       false,
                                       false,
                                       false,
                                       false,
                                       false,
                                       null,
                                       var174,
                                       0,
                                       null,
                                       null,
                                       false,
                                       null,
                                       null,
                                       0.0F,
                                       null,
                                       -8388609,
                                       null
                                    ),
                                    var2
                                 );
                                 var6 = 0;

                                 while (true) {
                                    if (var6 >= 3) {
                                       break label724;
                                    }

                                    var22 = (RenderContext)new Object[]{var131, var202, var244}[var6];
                                    if (var22 != null) {
                                       var2.setSpan(var22, var5, var2.length(), 33);
                                    }

                                    var6++;
                                 }
                              }

                              appendToExistingBuilder((var27 as ParagraphContentNode).getContent(), var1, var21);
                              if (var8 == 0) {
                                 var21.append("\n\n");
                              }
                           }

                           var22 = var1;
                           var6 = (byte)var5;
                           var5 = (byte)0;
                           break label680;
                        }
                     }

                     var159 = var2;
                     var123 = var1;
                     var5 = (byte)0;
                     var6 = (byte)1;
                     break label681;
                  }

                  var21.append("\n");
                  var6 = (byte)var5;
                  var159 = var21;
                  var123 = var22;
                  var5 = (byte)0;
                  break label681;
               }

               val var192: GGSansItalicSpan = new GGSansItalicSpan(var1.getContext());
               var8 = var2.length();
               appendToExistingBuilder((var27 as EmphasisContentNode).getContent(), var22, var21);
               var23 = (Integer)new Object[]{var192}[var6];
               if (var23 != null) {
                  var21.setSpan(var23, var8, var2.length(), 33);
               }
            }

            var6 = (byte)var5;
            var5 = (byte)var6;
         }

         var123 = var22;
         var159 = var21;
      }

      var7++;
      var6 = var5;
      var5 = var6;
      var21 = var159;
      var22 = var123;
   }

   return var21;
}

@JvmSynthetic
fun `toSpannable$default`(
   var0: StructurableText,
   var1: Context,
   var2: java.lang.String,
   var3: Boolean,
   var4: Boolean,
   var5: Boolean,
   var6: Boolean,
   var7: Paint,
   var8: Function1,
   var9: Function1,
   var10: Function3,
   var11: Function4,
   var12: Function1,
   var13: Function2,
   var14: Function4,
   var15: Function1,
   var16: Function1,
   var17: Function1,
   var18: Function1,
   var19: Function1,
   var20: Function1,
   var21: Function0,
   var22: Function1,
   var23: Boolean,
   var24: DiscordThemeObject,
   var25: Float,
   var26: java.lang.Float,
   var27: Int,
   var28: Any
): DraweeSpanStringBuilder {
   if ((var27 and 128) != 0) {
      var8 = new v();
   }

   if ((var27 and 256) != 0) {
      var9 = new C();
   }

   if ((var27 and 512) != 0) {
      var10 = new D();
   }

   if ((var27 and 1024) != 0) {
      var11 = new E();
   }

   if ((var27 and 2048) != 0) {
      var12 = new F();
   }

   if ((var27 and 4096) != 0) {
      var13 = new G();
   }

   if ((var27 and 8192) != 0) {
      var14 = new I();
   }

   if ((var27 and 16384) != 0) {
      var15 = new J();
   }

   if (('耀' and var27) != 0) {
      var16 = new K();
   }

   if ((65536 and var27) != 0) {
      var17 = new L();
   }

   if ((131072 and var27) != 0) {
      var18 = new x();
   }

   if ((262144 and var27) != 0) {
      var19 = new y();
   }

   if ((524288 and var27) != 0) {
      var20 = new z();
   }

   if ((1048576 and var27) != 0) {
      var21 = new A();
   }

   if ((2097152 and var27) != 0) {
      var22 = new B();
   }

   if ((4194304 and var27) != 0) {
      var23 = false;
   }

   if ((8388608 and var27) != 0) {
      var24 = ThemeManagerKt.getTheme();
   }

   if ((16777216 and var27) != 0) {
      var25 = -1.0F;
   }

   if ((var27 and 33554432) != 0) {
      var26 = null;
   }

   return toSpannable(
      var0,
      var1,
      var2,
      var3,
      var4,
      var5,
      var6,
      var7,
      (Function1)var8,
      (Function1)var9,
      (Function3)var10,
      (Function4)var11,
      (Function1)var12,
      (Function2)var13,
      (Function4)var14,
      (Function1)var15,
      (Function1)var16,
      (Function1)var17,
      (Function1)var18,
      (Function1)var19,
      (Function1)var20,
      (Function0)var21,
      (Function1)var22,
      var23,
      var24,
      var25,
      var26
   );
}

@JvmSynthetic
fun `toSpannable$default`(var0: java.util.List, var1: RenderContext, var2: DraweeSpanStringBuilder, var3: Int, var4: Any): DraweeSpanStringBuilder {
   if ((var3 and 2) != 0) {
      var2 = new DraweeSpanStringBuilder();
   }

   return toSpannable(var0, var1, var2);
}

fun `toSpannable$lambda$0`(var0: LinkContentNode): Unit {
   kotlin.jvm.internal.q.h(var0, "it");
   return Unit.a;
}

fun `toSpannable$lambda$1`(var0: LinkContentNode): Unit {
   kotlin.jvm.internal.q.h(var0, "it");
   return Unit.a;
}

fun `toSpannable$lambda$10`(var0: InlineCodeContentNode): Unit {
   kotlin.jvm.internal.q.h(var0, "it");
   return Unit.a;
}

fun `toSpannable$lambda$11`(var0: EmojiContentNode): Unit {
   kotlin.jvm.internal.q.h(var0, "it");
   return Unit.a;
}

fun `toSpannable$lambda$12`(var0: LinkContentNode): LinkStyle {
   kotlin.jvm.internal.q.h(var0, "<unused var>");
   return new LinkStyle(null, 0, null, null, 15, null);
}

fun `toSpannable$lambda$13`(): Unit {
   return Unit.a;
}

fun `toSpannable$lambda$14`(var0: SoundmojiContentNode): Unit {
   kotlin.jvm.internal.q.h(var0, "it");
   return Unit.a;
}

fun `toSpannable$lambda$2`(var0: java.lang.String, var1: java.lang.String, var2: java.lang.String): Unit {
   kotlin.jvm.internal.q.h(var0, "<unused var>");
   return Unit.a;
}

fun `toSpannable$lambda$3`(var0: java.lang.String, var1: java.lang.String, var2: java.lang.String, var3: java.lang.String): Unit {
   kotlin.jvm.internal.q.h(var0, "<unused var>");
   return Unit.a;
}

fun `toSpannable$lambda$4`(var0: java.lang.String): Unit {
   kotlin.jvm.internal.q.h(var0, "<unused var>");
   return Unit.a;
}

fun `toSpannable$lambda$5`(var0: java.lang.String, var1: java.lang.String): Unit {
   kotlin.jvm.internal.q.h(var0, "<unused var>");
   kotlin.jvm.internal.q.h(var1, "<unused var>");
   return Unit.a;
}

fun `toSpannable$lambda$6`(var0: java.lang.String, var1: java.lang.String, var2: java.lang.String, var3: java.lang.String): Unit {
   kotlin.jvm.internal.q.h(var1, "<unused var>");
   return Unit.a;
}

fun `toSpannable$lambda$69$lambda$16$lambda$15`(var0: QuoteSpan, var1: RenderContext.Insets): RenderContext.Insets {
   kotlin.jvm.internal.q.h(var1, "$this$updateInsets");
   return RenderContext.Insets.copy$default(var1, 0, 0, var1.getStart() + var0.getInsetStart(), 0, 11, null);
}

fun `toSpannable$lambda$69$lambda$19`(var0: RenderContext, var1: ContentNode, var2: View): Unit {
   kotlin.jvm.internal.q.h(var2, "it");
   var0.getOnTapInlineCode().invoke(var1);
   return Unit.a;
}

fun `toSpannable$lambda$69$lambda$21`(var0: ContentNode, var1: RenderContext, var2: View): Boolean {
   kotlin.jvm.internal.q.h(var2, "it");
   val var3: Boolean;
   if ((var0 as LinkContentNode).isUrl()) {
      var1.getOnLongTapLink().invoke(var0);
      var3 = true;
   } else {
      var3 = false;
   }

   return var3;
}

fun `toSpannable$lambda$69$lambda$22`(var0: RenderContext, var1: ContentNode, var2: View): Unit {
   kotlin.jvm.internal.q.h(var2, "it");
   var0.getOnTapLink().invoke(var1);
   return Unit.a;
}

fun `toSpannable$lambda$69$lambda$26`(var0: RenderContext, var1: ContentNode, var2: View): Unit {
   kotlin.jvm.internal.q.h(var2, "it");
   val var3: Function4 = var0.getOnTapMention();
   val var4: UserOrRoleMentionContentNode = var1 as UserOrRoleMentionContentNode;
   val var6: UserId = (var1 as UserOrRoleMentionContentNode).getUserId-wUX8bhU();
   var var10: java.lang.String = null;
   val var7: java.lang.String;
   if (var6 != null) {
      var7 = UserId.toString-impl(var6.unbox-impl());
   } else {
      var7 = null;
   }

   val var5: java.lang.String = java.lang.String.valueOf(var4.getChannelId-qMVnFVQ());
   val var8: java.lang.String = var4.getRoleName();
   val var9: java.lang.String;
   if (var8 != null) {
      var9 = var8.toString();
   } else {
      var9 = null;
   }

   val var11: java.lang.String = var4.getParsedUserId();
   if (var11 != null) {
      var10 = var11.toString();
   }

   var3.invoke(var7, var5, var9, var10);
   return Unit.a;
}

fun `toSpannable$lambda$69$lambda$28`(var0: RenderContext, var1: ContentNode, var2: View): Boolean {
   kotlin.jvm.internal.q.h(var2, "it");
   var0.getOnLongPressChannel()
      .invoke(
         (var1 as ChannelMentionContentNode).getChannelId(),
         (var1 as ChannelMentionContentNode).getGuildId(),
         (var1 as ChannelMentionContentNode).getMessageId(),
         (var1 as ChannelMentionContentNode).getOriginalLink()
      );
   return true;
}

fun `toSpannable$lambda$69$lambda$29`(var0: RenderContext, var1: ContentNode, var2: View): Unit {
   kotlin.jvm.internal.q.h(var2, "it");
   var0.getOnTapChannel()
      .invoke(
         (var1 as ChannelMentionContentNode).getChannelId(),
         (var1 as ChannelMentionContentNode).getGuildId(),
         (var1 as ChannelMentionContentNode).getMessageId()
      );
   return Unit.a;
}

fun `toSpannable$lambda$69$lambda$32`(var0: RenderContext, var1: ContentNode, var2: View): Boolean {
   kotlin.jvm.internal.q.h(var2, "it");
   var0.getOnLongPressAttachmentLink().invoke((var1 as AttachmentLinkContentNode).getAttachmentUrl(), (var1 as AttachmentLinkContentNode).getAttachmentName());
   return true;
}

fun `toSpannable$lambda$69$lambda$33`(var0: RenderContext, var1: ContentNode, var2: View): Unit {
   kotlin.jvm.internal.q.h(var2, "it");
   var0.getOnTapAttachmentLink().invoke((var1 as AttachmentLinkContentNode).getAttachmentUrl());
   return Unit.a;
}

fun `toSpannable$lambda$69$lambda$35`(var0: RenderContext, var1: ContentNode, var2: View): Unit {
   kotlin.jvm.internal.q.h(var2, "it");
   var0.getOnTapChannel()
      .invoke(
         (var1 as StaticChannelMentionContentNode).getId().getId(),
         java.lang.String.valueOf((var1 as StaticChannelMentionContentNode).getGuildId-qOKuAAo()),
         java.lang.String.valueOf((var1 as StaticChannelMentionContentNode).getItemId())
      );
   return Unit.a;
}

fun `toSpannable$lambda$69$lambda$37`(var0: RenderContext, var1: ContentNode, var2: View): Boolean {
   kotlin.jvm.internal.q.h(var2, "it");
   var0.getOnLongPressCommand().invoke(var1);
   return true;
}

fun `toSpannable$lambda$69$lambda$38`(var0: RenderContext, var1: ContentNode, var2: View): Unit {
   kotlin.jvm.internal.q.h(var2, "it");
   var0.getOnTapCommand().invoke(var1);
   return Unit.a;
}

fun `toSpannable$lambda$69$lambda$41`(var0: java.lang.String, var1: RenderContext, var2: View): Unit {
   kotlin.jvm.internal.q.h(var2, "it");
   SpoilerManager.INSTANCE.markRevealed-V2PEE7g(var0);
   var1.getOnTapSpoiler().invoke();
   return Unit.a;
}

fun `toSpannable$lambda$69$lambda$45`(
   var0: DraweeSpanStringBuilder, var1: ForegroundColorSpan, var2: ContentNode, var3: Boolean, var4: DraweeSpanStringBuilder, var5: RenderContext
): Unit {
   kotlin.jvm.internal.q.h(var4, "$this$changeTextSizeSp");
   kotlin.jvm.internal.q.h(var5, "updatedRC");
   val var6: Int = var0.length();
   appendToExistingBuilder((var2 as SubtextContentNode).getContent(), var5, var0);
   if (!var3) {
      SpannableStringBuilderExtensionsKt.ensureNewline$default(var0, null, 1, null);
   }

   val var7: Any = new Object[]{var1}[0];
   if (var7 != null) {
      var0.setSpan(var7, var6, var0.length(), 13107233);
   }

   return Unit.a;
}

fun `toSpannable$lambda$69$lambda$49$lambda$48`(var0: ContentNode, var1: DraweeSpanStringBuilder, var2: DraweeSpanStringBuilder, var3: RenderContext): Unit {
   kotlin.jvm.internal.q.h(var2, "$this$changeTextSizeSp");
   kotlin.jvm.internal.q.h(var3, "updatedRc");
   appendToExistingBuilder((var0 as HeadingContentNode).getContent(), var3, var1);
   return Unit.a;
}

fun `toSpannable$lambda$69$lambda$62`(var0: RenderContext, var1: ContentNode, var2: View): Unit {
   kotlin.jvm.internal.q.h(var2, "it");
   var0.getOnTapTimestamp().invoke((var1 as TimestampContentNode).getFull());
   return Unit.a;
}

fun `toSpannable$lambda$69$lambda$65`(var0: RenderContext, var1: ContentNode, var2: View): Unit {
   kotlin.jvm.internal.q.h(var2, "it");
   var0.getOnTapSoundmoji().invoke(var1);
   return Unit.a;
}

fun `toSpannable$lambda$69$lambda$68`(var0: DraweeSpanStringBuilder, var1: ContentNode, var2: Context, var3: RenderContext, var4: SpannableStringBuilder): Unit {
   kotlin.jvm.internal.q.h(var4, "<this>");
   var0.append("  ");
   val var7: SoundmojiContentNode = var1 as SoundmojiContentNode;
   val var6: RenderableEmoji = SoundmojiContentNodeKt.toRenderableEmoji(var1 as SoundmojiContentNode);
   if (var6 != null) {
      val var10: java.lang.Float = var3.getEmojiBaselineHeightOverridePx();
      val var5: Float;
      if (var10 != null) {
         var5 = var10;
      } else {
         var5 = var3.getBaselineHeightPx();
      }

      RenderableEmojiKt.renderEmojiInto$default(var0, var6, var2, getIconSize("_emoji", var5 * 0.8F), false, 0, new u(var3), 32, null);
      var0.append(" ");
   }

   val var8: java.lang.String = var7.getContent();
   val var9: java.lang.String;
   if (var8 != null) {
      var9 = kotlin.text.h.C(var8, " ", " ", false, 4, null);
   } else {
      var9 = null;
   }

   var0.append(var9);
   var0.append("  ");
   return Unit.a;
}

fun `toSpannable$lambda$69$lambda$68$lambda$67$lambda$66`(var0: RenderContext, var1: GenericDraweeHierarchyBuilder): Unit {
   kotlin.jvm.internal.q.h(var1, "$this$renderEmojiInto");
   EmojiRendererKt.handleEmojiSpoiler(var1, var0, true);
   return Unit.a;
}

fun `toSpannable$lambda$7`(var0: CommandMentionContentNode): Unit {
   kotlin.jvm.internal.q.h(var0, "it");
   return Unit.a;
}

fun `toSpannable$lambda$8`(var0: CommandMentionContentNode): Unit {
   kotlin.jvm.internal.q.h(var0, "it");
   return Unit.a;
}

fun `toSpannable$lambda$9`(var0: java.lang.String): Unit {
   kotlin.jvm.internal.q.h(var0, "it");
   return Unit.a;
}

@JvmSynthetic
fun u(var0: EmojiContentNode): Unit {
   return toSpannable$lambda$11(var0);
}

@JvmSynthetic
fun v(var0: QuoteSpan, var1: RenderContext.Insets): RenderContext.Insets {
   return toSpannable$lambda$69$lambda$16$lambda$15(var0, var1);
}

@JvmSynthetic
fun w(var0: RenderContext, var1: ContentNode, var2: View): Unit {
   return toSpannable$lambda$69$lambda$22(var0, var1, var2);
}

@JvmSynthetic
fun x(var0: SoundmojiContentNode): Unit {
   return toSpannable$lambda$14(var0);
}

@JvmSynthetic
fun y(var0: java.lang.String, var1: java.lang.String, var2: java.lang.String, var3: java.lang.String): Unit {
   return toSpannable$lambda$3(var0, var1, var2, var3);
}

@JvmSynthetic
fun z(): Unit {
   return toSpannable$lambda$13();
}
// $VF: Class flags could not be determined
@JvmSynthetic
internal class WhenMappings {
   @JvmStatic
   public int[] $EnumSwitchMapping$0;

   @JvmStatic
   fun {
      val var0: IntArray = new int[StaticChannelMentionType.values().length];

      try {
         var0[StaticChannelMentionType.Home.ordinal()] = 1;
      } catch (var6: NoSuchFieldError) {
      }

      try {
         var0[StaticChannelMentionType.Guide.ordinal()] = 2;
      } catch (var5: NoSuchFieldError) {
      }

      try {
         var0[StaticChannelMentionType.Browse.ordinal()] = 3;
      } catch (var4: NoSuchFieldError) {
      }

      try {
         var0[StaticChannelMentionType.Customize.ordinal()] = 4;
      } catch (var3: NoSuchFieldError) {
      }

      try {
         var0[StaticChannelMentionType.LinkedRoles.ordinal()] = 5;
      } catch (var2: NoSuchFieldError) {
      }

      $EnumSwitchMapping$0 = var0;
   }
}

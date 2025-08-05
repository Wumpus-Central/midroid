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
fun B(var0: ContentNode, var1: RenderContext, var2: View): Boolean {
   return toSpannable$lambda$70$lambda$21(var0, var1, var2);
}

@JvmSynthetic
fun C(var0: RenderContext, var1: ContentNode, var2: View): Unit {
   return toSpannable$lambda$70$lambda$66(var0, var1, var2);
}

@JvmSynthetic
fun D(var0: DraweeSpanStringBuilder, var1: ContentNode, var2: Context, var3: RenderContext, var4: SpannableStringBuilder): Unit {
   return toSpannable$lambda$70$lambda$69(var0, var1, var2, var3, var4);
}

@JvmSynthetic
fun E(var0: ContentNode, var1: DraweeSpanStringBuilder, var2: DraweeSpanStringBuilder, var3: RenderContext): Unit {
   return toSpannable$lambda$70$lambda$49$lambda$48(var0, var1, var2, var3);
}

@JvmSynthetic
fun F(var0: RenderContext, var1: ContentNode, var2: View): Unit {
   return toSpannable$lambda$70$lambda$63(var0, var1, var2);
}

@JvmSynthetic
fun G(var0: RenderContext, var1: ContentNode, var2: View): Unit {
   return toSpannable$lambda$70$lambda$19(var0, var1, var2);
}

@JvmSynthetic
fun H(var0: RenderContext, var1: ContentNode, var2: View): Unit {
   return toSpannable$lambda$70$lambda$29(var0, var1, var2);
}

@JvmSynthetic
fun a(var0: RenderContext, var1: ContentNode, var2: View): Unit {
   return toSpannable$lambda$70$lambda$33(var0, var1, var2);
}

private fun DraweeSpanStringBuilder.appendBulletPoint(content: List<ContentNode>, rc: RenderContext, isOrderedList: Boolean) {
   val var7: Int = SizeUtilsKt.getDpToPx(8);
   val var8: Int = var2.getListNestedLevel();
   val var15: Standard = new Standard(SizeUtilsKt.getDpToPx(var8 * 16));
   val var4: Int = SizeUtilsKt.getDpToPx(2);
   val var14: VerticalPaddingSpan = new VerticalPaddingSpan(var4);
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
         val var24: OrderedListBulletSpan = new OrderedListBulletSpan(var9, var7, var11, var2.getPaint());
         SpannableStringBuilderExtensionsKt.ensureNewline(var0, new AbsoluteSizeSpan(var4));
         val var5: Int = var0.length();
         appendToExistingBuilder(var1, var2, var0);

         for (int var18 = 0; var18 < 3; var18++) {
            val var16: Any = new Object[]{var15, var24, var14}[var18];
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
      var var20: Int = ColorUtilsKt.getThemeColor(var2.getContext(), R.color.primary_360, R.color.primary_400, var2.getTheme());
      val var26: Style;
      if (var8 > 0) {
         var26 = Style.STROKE;
      } else {
         var26 = Style.FILL;
      }

      val var27: BulletSpan = new BulletSpan(var20, var7, false, var6, 0.0F, var26, 20, null);
      SpannableStringBuilderExtensionsKt.ensureNewline(var0, new AbsoluteSizeSpan(var4));
      var20 = var0.length();
      appendToExistingBuilder(var1, var2, var0);

      for (int var19 = 0; var19 < 3; var19++) {
         val var17: Any = new Object[]{var15, var27, var14}[var19];
         if (var17 != null) {
            var0.setSpan(var17, var20, var0.length(), 33);
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
   kotlin.jvm.internal.r.h(var0, "<this>");
   kotlin.jvm.internal.r.h(var1, "context");
   kotlin.jvm.internal.r.h(var2, "rc");
   kotlin.jvm.internal.r.h(var3, "imageUrl");
   val var9: Int = var0.length();
   var0.append('\u200b');
   val var13: com.facebook.drawee.controller.a = (I2.d.g().F(ImageRequestBuilder.x(Uri.parse(ReactAssetUtilsKt.getReactImageUrl(var1, var3))).a()) as PipelineDraweeControllerBuilder)
      .d();
   kotlin.jvm.internal.r.g(var13, "build(...)");
   val var10: GenericDraweeHierarchyBuilder = GenericDraweeHierarchyBuilder.u(var1.getResources()).w(ScalingUtils$ScaleType.e);
   val var11: com.facebook.drawee.generic.a = com.facebook.drawee.generic.a.b(var7);
   var11.s(var8);
   var11.v(com.facebook.drawee.generic.a.a.k);
   var10.K(var11);
   if (var2.spoilerIsHidden()) {
      var10.v(new PorterDuffColorFilter(var2.getTheme().getSpoilerHiddenBackground(), Mode.SRC_IN));
   } else if (var6 != null) {
      var10.v(new PorterDuffColorFilter(var6, Mode.SRC_IN));
   }

   kotlin.jvm.internal.r.g(var10, "apply(...)");
   var0.j(var1, var10.a(), var13, var9, var4, var5, false, 2);
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
   toSpannable(var0, var1, var2, false);
}

@JvmSynthetic
fun b(var0: DraweeSpanStringBuilder, var1: ForegroundColorSpan, var2: ContentNode, var3: Boolean, var4: DraweeSpanStringBuilder, var5: RenderContext): Unit {
   return toSpannable$lambda$70$lambda$45(var0, var1, var2, var3, var4, var5);
}

@JvmSynthetic
fun c(var0: java.lang.String, var1: java.lang.String): Unit {
   return toSpannable$lambda$5(var0, var1);
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
fun d(var0: LinkContentNode): Unit {
   return toSpannable$lambda$0(var0);
}

@JvmSynthetic
fun e(var0: RenderContext, var1: ContentNode, var2: View): Unit {
   return toSpannable$lambda$70$lambda$35(var0, var1, var2);
}

@JvmSynthetic
fun f(var0: RenderContext, var1: ContentNode, var2: View): Unit {
   return toSpannable$lambda$70$lambda$38(var0, var1, var2);
}

@JvmSynthetic
fun g(var0: LinkContentNode): Unit {
   return toSpannable$lambda$1(var0);
}

public fun getBaselineHeightForFontSizePx(paint: Paint, fontSizePx: Int): Float {
   kotlin.jvm.internal.r.h(var0, "paint");
   val var3: Float = var0.getTextSize();
   var0.setTextSize((float)var1);
   val var4: FontMetrics = var0.getFontMetrics();
   kotlin.jvm.internal.r.g(var4, "getFontMetrics(...)");
   val var2: Float = getBaselineHeightPx(var4);
   var0.setTextSize(var3);
   return var2;
}

public fun getBaselineHeightPx(fontMetrics: FontMetrics): Float {
   kotlin.jvm.internal.r.h(var0, "fontMetrics");
   return var0.descent - var0.ascent;
}

private fun getIconPaddingMultiplier(iconType: String): Float {
   val var1: Float;
   if (!kotlin.jvm.internal.r.c(var0, "post") && !kotlin.jvm.internal.r.c(var0, "forum")) {
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
fun h(var0: RenderContext, var1: GenericDraweeHierarchyBuilder): Unit {
   return toSpannable$lambda$70$lambda$69$lambda$68$lambda$67(var0, var1);
}

@JvmSynthetic
fun i(var0: RenderContext, var1: ContentNode, var2: View): Boolean {
   return toSpannable$lambda$70$lambda$37(var0, var1, var2);
}

@JvmSynthetic
fun j(var0: CommandMentionContentNode): Unit {
   return toSpannable$lambda$7(var0);
}

@JvmSynthetic
fun k(var0: CommandMentionContentNode): Unit {
   return toSpannable$lambda$8(var0);
}

@JvmSynthetic
fun l(var0: InlineCodeContentNode): Unit {
   return toSpannable$lambda$10(var0);
}

@JvmSynthetic
fun m(var0: QuoteSpan, var1: RenderContext.Insets): RenderContext.Insets {
   return toSpannable$lambda$70$lambda$16$lambda$15(var0, var1);
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

private fun DraweeSpanStringBuilder.maybeAddRoleDot(
   shouldShowRoleDot: Boolean,
   singleLine: Boolean,
   context: Context,
   backgroundColor: Int,
   roleColor: Int,
   roleColors: RoleColors?
) {
   if (var1) {
      val var7: Byte;
      if (var2) {
         var7 = 16;
      } else {
         var7 = 20;
      }

      val var8: RoleDotSpan = new RoleDotSpan(var3, var4, var7);
      var var9: RoleColors = var6;
      if (var6 == null) {
         var9 = new RoleColors(var5, null, null);
      }

      var8.setColors(var9);
      var0.append("#");
      var0.setSpan(var8, var0.length() - 1, var0.length(), 33);
      var0.append(" ");
   }
}

@JvmSynthetic
fun n(var0: RenderContext, var1: ContentNode, var2: View): Boolean {
   return toSpannable$lambda$70$lambda$32(var0, var1, var2);
}

@JvmSynthetic
fun o(var0: java.lang.String, var1: java.lang.String, var2: java.lang.String): Unit {
   return toSpannable$lambda$2(var0, var1, var2);
}

@JvmSynthetic
fun p(var0: java.lang.String, var1: java.lang.String, var2: java.lang.String, var3: java.lang.String): Unit {
   return toSpannable$lambda$6(var0, var1, var2, var3);
}

@JvmSynthetic
fun q(var0: java.lang.String): Unit {
   return toSpannable$lambda$9(var0);
}

@JvmSynthetic
fun r(var0: java.lang.String): Unit {
   return toSpannable$lambda$4(var0);
}

@JvmSynthetic
fun s(var0: EmojiContentNode): Unit {
   return toSpannable$lambda$11(var0);
}

private fun DraweeSpanStringBuilder.simulateInlineNewline() {
   var0.append("    ");
}

@JvmSynthetic
fun t(var0: RenderContext, var1: ContentNode, var2: View): Unit {
   return toSpannable$lambda$70$lambda$22(var0, var1, var2);
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
   kotlin.jvm.internal.r.h(var0, "<this>");
   kotlin.jvm.internal.r.h(var1, "context");
   kotlin.jvm.internal.r.h(var2, "containerId");
   kotlin.jvm.internal.r.h(var7, "paint");
   kotlin.jvm.internal.r.h(var8, "onLinkClicked");
   kotlin.jvm.internal.r.h(var9, "onLongTapLink");
   kotlin.jvm.internal.r.h(var10, "onTapChannel");
   kotlin.jvm.internal.r.h(var11, "onLongPressChannel");
   kotlin.jvm.internal.r.h(var12, "onTapAttachmentLink");
   kotlin.jvm.internal.r.h(var13, "onLongPressAttachmentLink");
   kotlin.jvm.internal.r.h(var14, "onTapMention");
   kotlin.jvm.internal.r.h(var15, "onTapCommand");
   kotlin.jvm.internal.r.h(var16, "onLongPressCommand");
   kotlin.jvm.internal.r.h(var17, "onTapTimestamp");
   kotlin.jvm.internal.r.h(var18, "onTapInlineCode");
   kotlin.jvm.internal.r.h(var19, "onTapEmoji");
   kotlin.jvm.internal.r.h(var20, "linkStyle");
   kotlin.jvm.internal.r.h(var21, "onTapSpoiler");
   kotlin.jvm.internal.r.h(var22, "onTapSoundmoji");
   kotlin.jvm.internal.r.h(var24, "theme");
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
         false,
         6,
         null
      );
   } else {
      if (var0 !is PrimitiveStructurableText) {
         throw new A9.n();
      }

      var27 = new DraweeSpanStringBuilder((var0 as PrimitiveStructurableText).getContent());
   }

   return var27;
}

private fun List<ContentNode>.toSpannable(rc: RenderContext, builder: DraweeSpanStringBuilder = new DraweeSpanStringBuilder(), isRootNode: Boolean = true): DraweeSpanStringBuilder {
   var var21: RenderContext = var1;
   var var22: DraweeSpanStringBuilder = var2;
   var var6: Int = 1;
   val var26: java.util.Iterator = var0.iterator();
   var var7: Int = 0;
   var var8: Int = 0;

   while (var26.hasNext()) {
      var var23: Int = (Integer)var26.next();
      if (var8 < 0) {
         kotlin.collections.i.u();
      }

      var var28: ContentNode = var23 as ContentNode;
      var var9: Byte;
      if (var8 == kotlin.collections.i.m(var0)) {
         var9 = var6;
      } else {
         var9 = var7;
      }

      var var27: Context = var1.getContext();
      var var24: BackgroundColorSpan = new BackgroundColorSpan(var1.getTheme().getBackgroundSecondary());
      val var29: RelativeSizeSpan = new RelativeSizeSpan(0.85F);
      var var25: DiscordFontSpan = new DiscordFontSpan(var27, DiscordFont.CodeNormal);
      var var10: Int = ColorUtilsKt.getThemeColor(
         var27, com.discord.chat.R.color.chat_mentions_background_light, com.discord.chat.R.color.chat_mentions_background_dark, var1.getTheme()
      );
      val var11: Int = ColorUtilsKt.getThemeColor(
         var27, com.discord.chat.R.color.chat_mentions_foreground_light, com.discord.chat.R.color.chat_mentions_foreground_dark, var1.getTheme()
      );
      val var14: Int = y.c.k(ColorUtilsKt.getThemeColor(var27, R.color.green_330, R.color.green_330, var1.getTheme()), 25);
      val var13: Int = ColorUtilsKt.getThemeColor(var27, R.color.green_330, R.color.green_330, var1.getTheme());
      if (var28 is BlockQuoteContentNode) {
         if (var1.getSingleLine()) {
            var22.append("> ");
            appendToExistingBuilder((var28 as BlockQuoteContentNode).getContent(), var21, var22);
         } else {
            var23 = new QuoteSpan(var1.getTheme().getInteractiveMuted(), SizeUtilsKt.getDpToPx(3), SizeUtilsKt.getDpToPx(8));
            var9 = var2.length();
            appendToExistingBuilder((var28 as BlockQuoteContentNode).getContent(), var21.updateInsets(new w((QuoteSpan)var23)), var22);
            var23 = new Object[]{var23}[var7];
            if (var23 != null) {
               var22.setSpan(var23, var9, var2.length(), 13107233);
            }
         }

         var6 = (byte)var7;
         var7 = (byte)var6;
      } else {
         label728: {
            label686: {
               if (var28 is CodeBlockContentNode) {
                  if (var1.getSingleLine()) {
                     var9 = var2.length();
                     var22.append(kotlin.text.h.B((var28 as CodeBlockContentNode).getContent(), '\n', ' ', false, 4, null));

                     for (int var72 = 0; var72 < 3; var72 += var6) {
                        var23 = new Object[]{var24, var29, var25}[var72];
                        if (var23 != null) {
                           var22.setSpan(var23, var9, var2.length(), 33);
                        }
                     }
                  } else {
                     CodeStyle.INSTANCE.renderCodeBlock(var22, var28 as CodeBlockContentNode, var21, (boolean)var9);
                  }
               } else {
                  if (var28 !is EmojiContentNode) {
                     if (var28 is EmphasisContentNode) {
                        var23 = new GGSansItalicSpan(var1.getContext());
                        var7 = var2.length();
                        appendToExistingBuilder((var28 as EmphasisContentNode).getContent(), var21, var22);
                        var23 = new Object[]{var23}[0];
                        if (var23 != null) {
                           var22.setSpan(var23, var7, var2.length(), 33);
                        }

                        var7 = (byte)var6;
                        var6 = (byte)0;
                        break label728;
                     }

                     var var15: Boolean = var28 is InlineCodeContentNode;
                     var23 = null;
                     if (var15) {
                        if (!var1.getInLink()) {
                           var23 = new ClickableSpan(null, -1, null, null, 0.0F, null, null, new m(var21, var28), 125, null);
                        }

                        val var263: ForegroundColorSpan = new ForegroundColorSpan(var1.getTheme().getTextNormal());
                        var7 = var2.length();
                        var22.append((var28 as InlineCodeContentNode).getContent());

                        for (int var71 = 0; var71 < 5; var71++) {
                           var28 = (ContentNode)new Object[]{var23, var24, var29, var25, var263}[var71];
                           if (var28 != null) {
                              var22.setSpan(var28, var7, var2.length(), 33);
                           }
                        }

                        var6 = (byte)0;
                        var7 = (byte)1;
                        break label728;
                     }

                     if (var28 !is LineBreakContentNode && var28 !is NewLineContentNode) {
                        if (var28 is LinkContentNode) {
                           val var280: LinkStyle = var1.getLinkStyle().invoke(var28) as LinkStyle;
                           val var278: LinkContentNode = var28 as LinkContentNode;
                           var23 = (var28 as LinkContentNode).getLinkColor();
                           if (var23 != null) {
                              var6 = var23;
                           } else {
                              var6 = var280.getLinkColor();
                           }

                           val var123: Boolean = kotlin.jvm.internal.r.c(var278.getShouldShowRoleDot(), java.lang.Boolean.TRUE);
                           val var242: RoleColors = RoleColorsKt.toAndroidColors(var278.getRoleColors());
                           val var220: RoleColors;
                           if (var123) {
                              var220 = null;
                           } else {
                              var220 = var242;
                           }

                           if (var220 != null) {
                              var7 = var220.getPrimaryColor();
                           } else {
                              var7 = var6;
                           }

                           if (var220 != null) {
                              var23 = var220.getSecondaryColor();
                           } else {
                              var23 = null;
                           }

                           val var221: Int;
                           if (var220 != null) {
                              var221 = var220.getTertiaryColor();
                           } else {
                              var221 = null;
                           }

                           val var203: ClickableSpan = new ClickableSpan(
                              null, var7, var23, var221, 150.0F, var1.getShowLinkDecorations(), new n(var28, var21), new o(var21, var28), 1, null
                           );
                           val var222: LinkBackgroundStyle = var280.getBackgroundStyle();
                           val var143: BackgroundSpan;
                           if (var222 != null) {
                              val var141: Int = var222.getColor();
                              if (var141 != null) {
                                 var7 = var141;
                              } else {
                                 var7 = 0;
                              }

                              val var142: Int = var222.getBorderRadius();
                              if (var142 != null) {
                                 var9 = var142;
                              } else {
                                 var9 = 0;
                              }

                              var143 = new BackgroundSpan(new BackgroundStyle(var7, var9, 0, 4, null), null, null, 6, null);
                              val var223: java.lang.Boolean = var222.getSpaceAround();
                              if (var223 != null) {
                                 var15 = var223;
                              } else {
                                 var15 = false;
                              }
                           } else {
                              var143 = null;
                              var15 = false;
                           }

                           val var225: DiscordFontSpan = new DiscordFontSpan(var1.getContext(), var280.getFont());
                           var7 = var2.length();
                           maybeAddRoleDot(var2, var123, var1.getSingleLine(), var27, var10, var6, var242);
                           if (var15) {
                              var22.append(' ');
                           }

                           var6 = getIconSize(null, var1.getBaselineHeightPx());
                           val var243: ReactAsset = var280.getIcon();
                           if (var243 != null) {
                              appendImage$default(var2, var27, var1, var243.getUri(var27), var6, var6, var280.getLinkColor(), 0.0F, 0.0F, 192, null);
                              var22.append(' ');
                           }

                           var6 = var7;
                           appendToExistingBuilder(
                              var278.getContent(),
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
                           if (var15) {
                              var2.append(' ');
                           }

                           for (int var93 = 0; var93 < 3; var93++) {
                              val var179: Any = new Object[]{var203, var225, var143}[var93];
                              if (var179 != null) {
                                 var2.setSpan(var179, var6, var2.length(), 33);
                              }
                           }
                        } else {
                           label729: {
                              var var126: DraweeSpanStringBuilder = var22;
                              if (var28 is MentionContentNode) {
                                 val var184: DiscordFontSpan = new DiscordFontSpan(var1.getContext(), DiscordFont.PrimarySemibold);
                                 val var144: MentionContentNode = var28 as MentionContentNode;
                                 if (var28 as MentionContentNode is UserOrRoleMentionContentNode) {
                                    val var213: ClickableSpan = new ClickableSpan(null, -1, null, null, 0.0F, null, null, new p(var1, var28), 125, null);
                                    val var230: UserOrRoleMentionContentNode = var28 as UserOrRoleMentionContentNode;
                                    val var115: Int = (var28 as UserOrRoleMentionContentNode).getRoleColor();
                                    val var275: RoleColors = RoleColorsKt.toAndroidColors((var28 as UserOrRoleMentionContentNode).getRoleColors());
                                    if (var1.getShouldShowRoleDot() && var115 > 0) {
                                       var15 = true;
                                    } else {
                                       var15 = false;
                                    }

                                    val var100: Boolean;
                                    if (var1.getShouldShowRoleOnName() && var115 > 0) {
                                       var100 = true;
                                    } else {
                                       var100 = false;
                                    }

                                    val var150: UserId = var230.getUserId-wUX8bhU();
                                    val var17: Long = UserId.constructor-impl(1081004946872352958L);
                                    val var16: Boolean;
                                    if (var150 == null) {
                                       var16 = false;
                                    } else {
                                       var16 = UserId.equals-impl0(var150.unbox-impl(), var17);
                                    }

                                    if (var16) {
                                       var6 = var14;
                                    } else if (var100) {
                                       if (var275 != null) {
                                          var6 = var275.getPrimaryColor();
                                       } else {
                                          var6 = var115;
                                       }

                                       var6 = y.c.k(var6, 25);
                                    } else {
                                       var6 = var10;
                                    }

                                    label703: {
                                       var266 = makeMentionBackgroundSpan(var1, var6);
                                       if (var100 && !var16) {
                                          val var151: Int;
                                          if (var275 != null) {
                                             var151 = var275.getSecondaryColor();
                                          } else {
                                             var151 = null;
                                          }

                                          if (var151 != null) {
                                             val var153: java.util.List = kotlin.collections.i.q(
                                                new Integer[]{var275.getPrimaryColor(), var275.getSecondaryColor()}
                                             );
                                             if (var275.getTertiaryColor() != null) {
                                                var153.add(var275.getTertiaryColor());
                                             }

                                             var152 = new EnhancedRoleColorsSpan(kotlin.collections.i.T0(var153));
                                             break label703;
                                          }
                                       }

                                       if (var16) {
                                          var7 = var13;
                                       } else {
                                          var7 = var11;
                                          if (var100) {
                                             var7 = y.c.k(var115, 255);
                                          }
                                       }

                                       var152 = new ForegroundColorSpan(var7);
                                    }

                                    var7 = var2.length();
                                    maybeAddRoleDot(var2, var15, var1.getSingleLine(), var27, var6, var115, var275);
                                    var22.append(toSpannable$default(var230.getContent(), var1, null, false, 6, null));

                                    for (int var44 = 0; var44 < 4; var44++) {
                                       var25 = (DiscordFontSpan)new Object[]{var184, var213, var266, var152}[var44];
                                       if (var25 != null) {
                                          var126.setSpan(var25, var7, var2.length(), 33);
                                       }
                                    }
                                 } else if (var144 is ChannelMentionContentNode) {
                                    val var229: ClickableSpan = new ClickableSpan(
                                       null, -1, null, null, 0.0F, null, new q(var1, var28), new r(var1, var28), 61, null
                                    );
                                    val var149: BackgroundSpan = makeMentionBackgroundSpan(var1, var10);
                                    val var212: ForegroundColorSpan = new ForegroundColorSpan(var11);
                                    var7 = var2.length();
                                    val var265: ChannelMentionContentNode = var28 as ChannelMentionContentNode;
                                    val var274: java.util.List = (var28 as ChannelMentionContentNode).getInContent();
                                    if (var274 != null) {
                                       appendToExistingBuilder(var274, var1, var22);
                                       var6 = getIconSize("_caret", var1.getBaselineHeightPx());
                                       appendImage$default(
                                          var2, var27, var1, ReactAsset.Caret.getUri(var27), var6, var6, var212.getForegroundColor(), 0.0F, 0.0F, 192, null
                                       );
                                    }

                                    val var255: java.util.List = var265.getContent();
                                    if (var255 != null) {
                                       appendToExistingBuilder(var255, var1, var22);
                                    }

                                    for (int var41 = 0; var41 < 4; var41++) {
                                       var27 = (Context)new Object[]{var184, var229, var149, var212}[var41];
                                       if (var27 != null) {
                                          var126.setSpan(var27, var7, var2.length(), 33);
                                       }
                                    }
                                 } else if (var144 is AttachmentLinkContentNode) {
                                    val var228: ClickableSpan = new ClickableSpan(
                                       null, -1, null, null, 0.0F, null, new s(var1, var28), new t(var1, var28), 61, null
                                    );
                                    val var148: BackgroundSpan = makeMentionBackgroundSpan(var1, var10);
                                    val var211: ForegroundColorSpan = new ForegroundColorSpan(var11);
                                    var6 = var2.length();
                                    var9 = getIconSize(null, var1.getBaselineHeightPx());
                                    appendImage$default(
                                       var2, var27, var1, ReactAsset.Attachment.getUri(var27), var9, var9, var211.getForegroundColor(), 0.0F, 0.0F, 192, null
                                    );
                                    var22.append(' ');
                                    val var251: java.util.List = (var28 as AttachmentLinkContentNode).getContent();
                                    if (var251 != null) {
                                       appendToExistingBuilder(var251, var1, var22);
                                    }

                                    for (int var77 = 0; var77 < 4; var77++) {
                                       var27 = (Context)new Object[]{var184, var228, var148, var211}[var77];
                                       if (var27 != null) {
                                          var126.setSpan(var27, var6, var2.length(), 33);
                                       }
                                    }
                                 } else if (var144 is StaticChannelMentionContentNode) {
                                    val var227: ClickableSpan = new ClickableSpan(null, -1, null, null, 0.0F, null, null, new u(var1, var28), 125, null);
                                    val var210: BackgroundSpan = makeMentionBackgroundSpan(var1, var10);
                                    val var147: ForegroundColorSpan = new ForegroundColorSpan(var11);
                                    var9 = getIconSize(null, var1.getBaselineHeightPx());
                                    var7 = var2.length();
                                    val var264: StaticChannelMentionContentNode = var28 as StaticChannelMentionContentNode;
                                    var6 = TextUtilsKt.WhenMappings.$EnumSwitchMapping$0[(var28 as StaticChannelMentionContentNode).getId().ordinal()];
                                    if (var6 == 1 || var6 == 2) {
                                       appendImage$default(
                                          var2, var27, var1, ReactAsset.Home.getUri(var27), var9, var9, var147.getForegroundColor(), 0.0F, 0.0F, 192, null
                                       );
                                    } else if (var6 != 3) {
                                       if (var6 != 4) {
                                          if (var6 != 5) {
                                             var22.append("#");
                                          } else {
                                             appendImage$default(
                                                var2,
                                                var27,
                                                var1,
                                                ReactAsset.Link.getUri(var27),
                                                var9,
                                                var9,
                                                var147.getForegroundColor(),
                                                0.0F,
                                                0.0F,
                                                192,
                                                null
                                             );
                                          }
                                       } else {
                                          appendImage$default(
                                             var2,
                                             var27,
                                             var1,
                                             ReactAsset.ChannelBrowse.getUri(var27),
                                             var9,
                                             var9,
                                             var147.getForegroundColor(),
                                             0.0F,
                                             0.0F,
                                             192,
                                             null
                                          );
                                       }
                                    } else {
                                       appendImage$default(
                                          var2,
                                          var27,
                                          var1,
                                          ReactAsset.ChannelBrowse.getUri(var27),
                                          var9,
                                          var9,
                                          var147.getForegroundColor(),
                                          0.0F,
                                          0.0F,
                                          192,
                                          null
                                       );
                                    }

                                    var22.append(toSpannable$default(var264.getContent(), var1, null, false, 6, null));

                                    for (int var38 = 0; var38 < 4; var38++) {
                                       var27 = (Context)new Object[]{var184, var227, var210, var147}[var38];
                                       if (var27 != null) {
                                          var126.setSpan(var27, var7, var2.length(), 33);
                                       }
                                    }
                                 } else {
                                    if (var144 !is CommandMentionContentNode) {
                                       throw new A9.n();
                                    }

                                    val var226: BackgroundSpan = makeMentionBackgroundSpan(var1, var10);
                                    val var145: ForegroundColorSpan = new ForegroundColorSpan(var11);
                                    val var185: ClickableSpan = new ClickableSpan(
                                       null, -1, null, null, 0.0F, null, new H(var1, var28), new M(var1, var28), 61, null
                                    );
                                    val var209: GGSansBoldSpan = new GGSansBoldSpan(var1.getContext());
                                    var7 = var2.length();
                                    var9 = var2.length();
                                    var22.append("/");
                                    var22.append(toSpannable$default((var28 as CommandMentionContentNode).getContent(), var1, null, false, 6, null));

                                    for (int var36 = 0; var36 < 3; var36++) {
                                       var27 = (Context)new Object[]{var185, var226, var145}[var36];
                                       if (var27 != null) {
                                          var126.setSpan(var27, var9, var2.length(), 33);
                                       }
                                    }

                                    val var146: Any = new Object[]{var209}[0];
                                    if (var146 != null) {
                                       var126.setSpan(var146, var7, var2.length(), 33);
                                    }
                                 }

                                 ForceExhaustiveKt.forceExhaustive(var2);
                              } else {
                                 if (var28 !is ParagraphContentNode) {
                                    if (var28 !is SpoilerContentNode) {
                                       if (var28 is StrikethroughContentNode) {
                                          val var157: StrikethroughSpan = new StrikethroughSpan();
                                          var6 = var2.length();
                                          appendToExistingBuilder((var28 as StrikethroughContentNode).getContent(), var1, var22);
                                          val var158: Any = new Object[]{var157}[0];
                                          if (var158 != null) {
                                             var22.setSpan(var158, var6, var2.length(), 33);
                                          }
                                       } else if (var28 is SubtextContentNode) {
                                          if (var1.getSingleLine()) {
                                             appendToExistingBuilder((var28 as SubtextContentNode).getContent(), var1, var22);
                                             if (var9 == 0) {
                                                simulateInlineNewline(var2);
                                             }
                                          } else {
                                             val var48: Byte;
                                             if (FontManager.INSTANCE.getIsClassicChatFontScaleEnabled(var27)) {
                                                var48 = 13;
                                             } else {
                                                var48 = 14;
                                             }

                                             changeTextSizeSp(
                                                var22, var48, var1, new O(var22, new ForegroundColorSpan(var1.getTheme().getTextMuted()), var28, (boolean)var9)
                                             );
                                          }
                                       } else {
                                          var15 = var28 is HeadingContentNode;
                                          var var49: Int = 16;
                                          if (var15) {
                                             val var160: DiscordFontSpan = new DiscordFontSpan(var1.getContext(), DiscordFont.PrimaryExtraBold);
                                             if (var1.getSingleLine()) {
                                                var49 = var2.length();
                                                appendToExistingBuilder((var28 as HeadingContentNode).getContent(), var1, var22);
                                                simulateInlineNewline(var2);
                                                val var161: Any = new Object[]{var160}[0];
                                                if (var161 != null) {
                                                   var22.setSpan(var161, var49, var2.length(), 33);
                                                }
                                             } else {
                                                var7 = (var28 as HeadingContentNode).getLevel();
                                                if (var7 != 1) {
                                                   if (var7 == 2) {
                                                      var49 = 20;
                                                   }
                                                } else {
                                                   var49 = 24;
                                                }

                                                if (var2.length() > 0) {
                                                   var7 = SizeUtilsKt.getDpToPx(8);
                                                } else {
                                                   var7 = SizeUtilsKt.getDpToPx(4);
                                                }

                                                val var188: AbsoluteSizeSpan = new AbsoluteSizeSpan(var7);
                                                var7 = var2.length();
                                                var22.append("\n");
                                                var23 = (Integer)new Object[]{var188}[0];
                                                if (var23 != null) {
                                                   var22.setSpan(var23, var7, var2.length(), 33);
                                                }

                                                var7 = var2.length();
                                                changeTextSizeSp(var22, var49, var1, new P(var28, var22));
                                                var var162: Any = new Object[]{var160}[0];
                                                if (var162 != null) {
                                                   var22.setSpan(var162, var7, var2.length(), 33);
                                                }

                                                if (var9 == 0) {
                                                   var162 = new AbsoluteSizeSpan(SizeUtilsKt.getDpToPx(4));
                                                   var49 = var2.length();
                                                   var22.append("\n");
                                                   var162 = new Object[]{var162}[0];
                                                   if (var162 != null) {
                                                      var22.setSpan(var162, var49, var2.length(), 33);
                                                   }
                                                } else {
                                                   var162 = new AbsoluteSizeSpan(0);
                                                   var49 = var2.length();
                                                   var22.append("\n\u200b");
                                                   var162 = new Object[]{var162}[0];
                                                   if (var162 != null) {
                                                      var22.setSpan(var162, var49, var2.length(), 33);
                                                   }
                                                }
                                             }
                                          } else {
                                             if (var28 !is LHeadingContentNode) {
                                                var7 = (byte)1;
                                                var var193: DraweeSpanStringBuilder;
                                                if (var28 is BulletListContentNode) {
                                                   val var192: java.lang.String = "\n\u200b";
                                                   var21 = RenderContext.copy$default(
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
                                                   val var216: BulletListContentNode = var28 as BulletListContentNode;
                                                   var15 = (var28 as BulletListContentNode).getOrdered();
                                                   val var124: Long;
                                                   if (var15) {
                                                      val var169: java.lang.Long = var216.getStart();
                                                      if (var169 != null) {
                                                         var124 = var169;
                                                      } else {
                                                         var124 = 1L;
                                                      }

                                                      var21 = RenderContext.copy$default(
                                                         var21,
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
                                                         (long)(var216.getItems().size() - 1) + var124,
                                                         false,
                                                         null,
                                                         null,
                                                         0.0F,
                                                         null,
                                                         -67108865,
                                                         null
                                                      );
                                                   } else {
                                                      var124 = 0L;
                                                   }

                                                   val var240: java.util.Iterator = var216.getItems().iterator();

                                                   for (int var59 = 0; var240.hasNext(); var59++) {
                                                      var var170: java.util.List = (java.util.List)var240.next();
                                                      if (var59 < 0) {
                                                         kotlin.collections.i.u();
                                                      }

                                                      var170 = var170;
                                                      val var260: ArrayList = new ArrayList();
                                                      val var116: Int = var170.size();
                                                      var var101: Byte;
                                                      if (var59 == var216.getItems().size() - 1) {
                                                         var101 = var7;
                                                      } else {
                                                         var101 = 0;
                                                      }

                                                      val var270: java.util.Iterator = var170.iterator();

                                                      for (int var111 = 0; var270.hasNext(); var111++) {
                                                         var170 = (java.util.List)var270.next();
                                                         if (var111 < 0) {
                                                            kotlin.collections.i.u();
                                                         }

                                                         val var276: ContentNode = var170 as ContentNode;
                                                         val var122: Boolean = var170 as ContentNode is BulletListContentNode;
                                                         val var113: Byte;
                                                         if (var111 == var116 - 1) {
                                                            var113 = var7;
                                                         } else {
                                                            var113 = 0;
                                                         }

                                                         if (!var122) {
                                                            var260.add(var276);
                                                         }

                                                         if (var122 || var113 != 0) {
                                                            var var173: RenderContext = var21;
                                                            if (var15) {
                                                               var var19: Long;
                                                               if (var21.getListOrderedIndex() != null) {
                                                                  val var174: java.lang.Long = var21.getListOrderedIndex();
                                                                  if (var174 != null) {
                                                                     var19 = var174;
                                                                  } else {
                                                                     var19 = 0L;
                                                                  }

                                                                  var19++;
                                                               } else {
                                                                  var19 = var124;
                                                               }

                                                               var173 = RenderContext.copy$default(
                                                                  var21,
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
                                                                  var19,
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

                                                            var21 = var173;
                                                            appendBulletPoint(var2, var260, var173, var15);
                                                            if (var1.getSingleLine()) {
                                                               simulateInlineNewline(var2);
                                                            }

                                                            var260.clear();
                                                         }

                                                         if (var122) {
                                                            appendToExistingBuilder(
                                                               kotlin.collections.i.e(var276),
                                                               RenderContext.copy$default(
                                                                  var21,
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
                                                                  var21.getListNestedLevel() + 1,
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

                                                      if (var3 && var101 != 0) {
                                                         val var176: AbsoluteSizeSpan = new AbsoluteSizeSpan(SizeUtilsKt.getDpToPx(2));
                                                         var101 = var2.length();
                                                         var2.append(var192);
                                                         var170 = (java.util.List)new Object[]{var176}[0];
                                                         if (var170 != null) {
                                                            var2.setSpan(var170, var101, var2.length(), 33);
                                                         }
                                                      }
                                                   }

                                                   var193 = var2;
                                                } else {
                                                   var22 = var22;
                                                   if (var28 is StrongContentNode) {
                                                      val var133: GGSansBoldSpan = new GGSansBoldSpan(var1.getContext());
                                                      var49 = var2.length();
                                                      appendToExistingBuilder((var28 as StrongContentNode).getContent(), var1, var22);
                                                      var21 = (RenderContext)new Object[]{var133}[0];
                                                      var193 = var22;
                                                      if (var21 != null) {
                                                         var22.setSpan(var21, var49, var2.length(), 33);
                                                         var193 = var22;
                                                      }
                                                   } else {
                                                      var21 = var1;
                                                      if (var28 is TextContentNode) {
                                                         val var135: java.lang.String = (var28 as TextContentNode).getContent();
                                                         var193 = var22;
                                                         if (var135 != null) {
                                                            var22.append(var135);
                                                            var193 = var22;
                                                         }
                                                      } else if (var28 is TimestampContentNode) {
                                                         val var137: ClickableSpan = new ClickableSpan(
                                                            null,
                                                            ColorUtilsKt.getThemeColor(var27, R.color.primary_600, R.color.primary_200, var1.getTheme()),
                                                            null,
                                                            null,
                                                            0.0F,
                                                            null,
                                                            null,
                                                            new Q(var1, var28),
                                                            125,
                                                            null
                                                         );
                                                         var24 = new BackgroundColorSpan(
                                                            ColorUtilsKt.getThemeColor(
                                                               var27,
                                                               R.color.background_modifier_accent_light,
                                                               R.color.background_modifier_accent_dark,
                                                               var1.getTheme()
                                                            )
                                                         );
                                                         var9 = var2.length();
                                                         var22.append((var28 as TimestampContentNode).getFormatted());
                                                         var49 = 0;

                                                         while (true) {
                                                            var193 = var22;
                                                            if (var49 >= 2) {
                                                               break;
                                                            }

                                                            var23 = (Integer)new Object[]{var137, var24}[var49];
                                                            if (var23 != null) {
                                                               var22.setSpan(var23, var9, var2.length(), 33);
                                                            }

                                                            var49++;
                                                         }
                                                      } else if (var28 is UnderlineContentNode) {
                                                         val var195: UnderlineSpan = new UnderlineSpan();
                                                         var49 = var2.length();
                                                         appendToExistingBuilder((var28 as UnderlineContentNode).getContent(), var1, var22);
                                                         var21 = (RenderContext)new Object[]{var195}[0];
                                                         var193 = var22;
                                                         if (var21 != null) {
                                                            var22.setSpan(var21, var49, var2.length(), 33);
                                                            var193 = var22;
                                                         }
                                                      } else if (var28 is ChannelNameContentNode) {
                                                         val var196: ChannelNameContentNode = var28 as ChannelNameContentNode;
                                                         if ((var28 as ChannelNameContentNode).getIcon() != null) {
                                                            var49 = getIconSize(var196.getIconType(), var1.getBaselineHeightPx());
                                                            appendImage$default(
                                                               var2,
                                                               var27,
                                                               var1,
                                                               var196.getIcon(),
                                                               var49,
                                                               var49,
                                                               var11,
                                                               0.0F,
                                                               (float)var49 * getIconPaddingMultiplier(var196.getIconType()),
                                                               64,
                                                               null
                                                            );
                                                         }

                                                         appendToExistingBuilder(var196.getContent(), var1, var22);
                                                         var193 = var22;
                                                      } else {
                                                         if (var28 !is GuildNameContentNode) {
                                                            if (var28 !is SoundmojiContentNode) {
                                                               if (var28 !is ErrorContentNode) {
                                                                  throw new A9.n();
                                                               }

                                                               val var200: CrashReporting = CrashReporting.INSTANCE;
                                                               val var219: java.lang.Throwable = (var28 as ErrorContentNode).getThrowable();
                                                               var6 = (byte)0;
                                                               CrashReporting.captureException$default(var200, var219, false, 2, null);
                                                               var22.append("���");
                                                               break label728;
                                                            }

                                                            val var198: VerticalPaddingSpan = new VerticalPaddingSpan(SizeUtilsKt.getDpToPx(4));
                                                            val var277: DiscordFontSpan = new DiscordFontSpan(var1.getContext(), DiscordFont.PrimarySemibold);
                                                            val var218: ClickableSpan = new ClickableSpan(
                                                               null, null, null, null, 0.0F, null, null, new S(var1, var28), 127, null
                                                            );
                                                            val var241: ForegroundColorSpan = new ForegroundColorSpan(ThemeManagerKt.getTheme().getTextNormal());
                                                            val var279: BackgroundSpan = new BackgroundSpan(
                                                               new BackgroundStyle(ThemeManagerKt.getTheme().getCardPrimaryBg(), 4, 2),
                                                               new BorderStyle(ThemeManagerKt.getTheme().getBorderStrong(), SizeUtilsKt.getDpToPx(1)),
                                                               new ShadowStyle(Color.argb(63, 0, 0, 0), SizeUtilsKt.getDpToPx(4), new SizeF(0.0F, 4.0F))
                                                            );
                                                            var22.append(" ");
                                                            val var261: T = new T(var22, var28, var27, var1);
                                                            if (var1.spoilerExists() && !var1.spoilerIsRevealed()) {
                                                               var49 = var2.length();
                                                               var261.invoke(var22);
                                                               var23 = (Integer)new Object[]{var198}[0];
                                                               if (var23 != null) {
                                                                  var22.setSpan(var23, var49, var2.length(), 33);
                                                               }
                                                            } else {
                                                               var9 = var2.length();
                                                               var261.invoke(var22);

                                                               for (int var66 = 0; var66 < 5; var66++) {
                                                                  var27 = (Context)new Object[]{var198, var277, var218, var241, var279}[var66];
                                                                  if (var27 != null) {
                                                                     var22.setSpan(var27, var9, var2.length(), 33);
                                                                  }
                                                               }
                                                            }

                                                            var22.append(" ");
                                                            break label686;
                                                         }

                                                         var49 = getIconSize("_guild", var1.getBaselineHeightPx());
                                                         val var197: GuildNameContentNode = var28 as GuildNameContentNode;
                                                         if ((var28 as GuildNameContentNode).getIcon() != null) {
                                                            appendImage$default(
                                                               var2,
                                                               var27,
                                                               var1,
                                                               var197.getIcon(),
                                                               var49,
                                                               var49,
                                                               null,
                                                               (float)var49 * 0.2F,
                                                               (float)var49 * 0.1F,
                                                               32,
                                                               null
                                                            );
                                                         }

                                                         var22.append(var197.getContent());
                                                         var193 = var22;
                                                      }
                                                   }
                                                }

                                                var21 = var1;
                                                var6 = (byte)0;
                                                var22 = var193;
                                                break label728;
                                             }

                                             val var167: DiscordFontSpan = new DiscordFontSpan(var1.getContext(), DiscordFont.PrimaryExtraBold);
                                             if (!var1.getSingleLine()) {
                                                var49 = FontManager.INSTANCE.getScaledSpToPx(16, var1.getContext());
                                                val var4: Float = getBaselineHeightForFontSizePx(var1.getPaint(), var49);
                                                val var233: AbsoluteSizeSpan = new AbsoluteSizeSpan(var49);
                                                val var258: LHeadingContentNode = var28 as LHeadingContentNode;
                                                if (kotlin.text.h.I((var28 as LHeadingContentNode).getClassName(), "added", false, 2, null)) {
                                                   var49 = ThemeManagerKt.getTheme().getTextPositive();
                                                } else if (kotlin.text.h.I(var258.getClassName(), "fixed", false, 2, null)) {
                                                   var49 = ThemeManagerKt.getTheme().getTextDanger();
                                                } else if (kotlin.text.h.I(var258.getClassName(), "progress", false, 2, null)) {
                                                   var49 = ThemeManagerKt.getTheme().getTextWarning();
                                                } else if (kotlin.text.h.I(var258.getClassName(), "improved", false, 2, null)) {
                                                   var49 = ThemeManagerKt.getTheme().getTextBrand();
                                                } else {
                                                   var49 = ThemeManagerKt.getTheme().getHeaderPrimary();
                                                }

                                                val var215: ForegroundColorSpan = new ForegroundColorSpan(var49);
                                                if (var2.length() > 0) {
                                                   var49 = SizeUtilsKt.getDpToPx(8);
                                                } else {
                                                   var49 = SizeUtilsKt.getDpToPx(4);
                                                }

                                                val var190: UnderlineSpan = new UnderlineSpan();
                                                var7 = var2.length();
                                                val var267: AbsoluteSizeSpan = new AbsoluteSizeSpan(var49);
                                                var49 = var2.length();
                                                var22.append("\n");
                                                var28 = (ContentNode)new Object[]{var267}[0];
                                                if (var28 != null) {
                                                   var22.setSpan(var28, var49, var2.length(), 33);
                                                }

                                                var10 = var2.length();
                                                val var269: java.util.List = var258.getContent();
                                                var49 = var7;
                                                val var259: RenderContext = RenderContext.copy$default(
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
                                                   var4,
                                                   null,
                                                   1073741823,
                                                   null
                                                );
                                                var126 = var2;
                                                appendToExistingBuilder(var269, var259, var2);
                                                var25 = (DiscordFontSpan)new Object[]{var233}[0];
                                                if (var25 != null) {
                                                   var2.setSpan(var25, var10, var2.length(), 33);
                                                }

                                                if (var9 == 0) {
                                                   val var235: AbsoluteSizeSpan = new AbsoluteSizeSpan(SizeUtilsKt.getDpToPx(4));
                                                   var7 = var2.length();
                                                   var2.append("\n");
                                                   var25 = (DiscordFontSpan)new Object[]{var235}[0];
                                                   if (var25 != null) {
                                                      var2.setSpan(var25, var7, var2.length(), 33);
                                                   }
                                                } else {
                                                   val var237: AbsoluteSizeSpan = new AbsoluteSizeSpan(0);
                                                   var7 = var2.length();
                                                   var2.append("\n\u200b");
                                                   var25 = (DiscordFontSpan)new Object[]{var237}[0];
                                                   if (var25 != null) {
                                                      var2.setSpan(var25, var7, var2.length(), 33);
                                                   }
                                                }

                                                for (int var89 = 0; var89 < 3; var89++) {
                                                   var25 = (DiscordFontSpan)new Object[]{var167, var215, var190}[var89];
                                                   if (var25 != null) {
                                                      var126.setSpan(var25, var49, var2.length(), 33);
                                                   }
                                                }
                                             } else {
                                                var49 = var2.length();
                                                appendToExistingBuilder((var28 as LHeadingContentNode).getContent(), var1, var22);
                                                simulateInlineNewline(var2);
                                                val var168: Any = new Object[]{var167}[0];
                                                if (var168 != null) {
                                                   var22.setSpan(var168, var49, var2.length(), 33);
                                                }
                                             }
                                          }
                                       }

                                       var6 = (byte)0;
                                       var7 = (byte)1;
                                       var21 = var1;
                                       var22 = var126;
                                       break label728;
                                    }

                                    val var186: SpoilerContentNode = var28 as SpoilerContentNode;
                                    val var155: java.lang.String = SpoilerIdentifier.Companion
                                       .forNode-2sfwrmE(var28 as SpoilerContentNode, var1.getContainerId(), var8);
                                    var15 = SpoilerManager.INSTANCE.isRevealed-V2PEE7g(var155);
                                    val var128: RenderContext.SpoilerState;
                                    if (var15) {
                                       var128 = RenderContext.SpoilerState.Revealed;
                                    } else {
                                       var128 = RenderContext.SpoilerState.Hidden;
                                    }

                                    val var156: ClickableSpan;
                                    if (!var15) {
                                       var156 = new ClickableSpan(
                                          NestedClickableSpan.TouchPriority.HIGH, null, null, null, 0.0F, null, null, new N(var155, var1), 126, null
                                       );
                                    } else {
                                       var156 = null;
                                    }

                                    if (var15) {
                                       var6 = var1.getTheme().getSpoilerRevealedBackground();
                                    } else {
                                       var6 = var1.getTheme().getSpoilerHiddenBackground();
                                    }

                                    val var214: BackgroundSpan = new BackgroundSpan(new BackgroundStyle(var6, 0, 0, 6, null), null, null, 6, null);
                                    val var232: SpoilerSpan = new SpoilerSpan(var15);
                                    var6 = var2.length();
                                    appendToExistingBuilder(
                                       var186.getContent(),
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
                                          var128,
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
                                    var7 = 0;

                                    while (true) {
                                       if (var7 >= 3) {
                                          break label729;
                                       }

                                       var21 = (RenderContext)new Object[]{var156, var214, var232}[var7];
                                       if (var21 != null) {
                                          var2.setSpan(var21, var6, var2.length(), 33);
                                       }

                                       var7++;
                                    }
                                 }

                                 appendToExistingBuilder((var28 as ParagraphContentNode).getContent(), var1, var22);
                                 if (var9 == 0) {
                                    var22.append("\n\n");
                                 }
                              }

                              var6 = (byte)0;
                              var22 = var126;
                              var7 = (byte)1;
                              var21 = var1;
                              break label728;
                           }
                        }

                        var21 = var1;
                        var22 = var2;
                        var6 = (byte)0;
                        var7 = (byte)1;
                        break label728;
                     }

                     var6 = (byte)0;
                     var7 = (byte)1;
                     var22.append("\n");
                     break label728;
                  }

                  EmojiRendererKt.renderEmoji(var22, var28 as EmojiContentNode, var21);
               }

               var7 = (byte)var6;
            }

            var6 = (byte)0;
         }
      }

      var8++;
      var6 = var7;
      var7 = var6;
   }

   return var22;
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
fun `toSpannable$default`(var0: java.util.List, var1: RenderContext, var2: DraweeSpanStringBuilder, var3: Boolean, var4: Int, var5: Any): DraweeSpanStringBuilder {
   if ((var4 and 2) != 0) {
      var2 = new DraweeSpanStringBuilder();
   }

   if ((var4 and 4) != 0) {
      var3 = true;
   }

   return toSpannable(var0, var1, var2, var3);
}

fun `toSpannable$lambda$0`(var0: LinkContentNode): Unit {
   kotlin.jvm.internal.r.h(var0, "it");
   return Unit.a;
}

fun `toSpannable$lambda$1`(var0: LinkContentNode): Unit {
   kotlin.jvm.internal.r.h(var0, "it");
   return Unit.a;
}

fun `toSpannable$lambda$10`(var0: InlineCodeContentNode): Unit {
   kotlin.jvm.internal.r.h(var0, "it");
   return Unit.a;
}

fun `toSpannable$lambda$11`(var0: EmojiContentNode): Unit {
   kotlin.jvm.internal.r.h(var0, "it");
   return Unit.a;
}

fun `toSpannable$lambda$12`(var0: LinkContentNode): LinkStyle {
   kotlin.jvm.internal.r.h(var0, "<unused var>");
   return new LinkStyle(null, 0, null, null, 15, null);
}

fun `toSpannable$lambda$13`(): Unit {
   return Unit.a;
}

fun `toSpannable$lambda$14`(var0: SoundmojiContentNode): Unit {
   kotlin.jvm.internal.r.h(var0, "it");
   return Unit.a;
}

fun `toSpannable$lambda$2`(var0: java.lang.String, var1: java.lang.String, var2: java.lang.String): Unit {
   kotlin.jvm.internal.r.h(var0, "<unused var>");
   return Unit.a;
}

fun `toSpannable$lambda$3`(var0: java.lang.String, var1: java.lang.String, var2: java.lang.String, var3: java.lang.String): Unit {
   kotlin.jvm.internal.r.h(var0, "<unused var>");
   return Unit.a;
}

fun `toSpannable$lambda$4`(var0: java.lang.String): Unit {
   kotlin.jvm.internal.r.h(var0, "<unused var>");
   return Unit.a;
}

fun `toSpannable$lambda$5`(var0: java.lang.String, var1: java.lang.String): Unit {
   kotlin.jvm.internal.r.h(var0, "<unused var>");
   kotlin.jvm.internal.r.h(var1, "<unused var>");
   return Unit.a;
}

fun `toSpannable$lambda$6`(var0: java.lang.String, var1: java.lang.String, var2: java.lang.String, var3: java.lang.String): Unit {
   kotlin.jvm.internal.r.h(var1, "<unused var>");
   return Unit.a;
}

fun `toSpannable$lambda$7`(var0: CommandMentionContentNode): Unit {
   kotlin.jvm.internal.r.h(var0, "it");
   return Unit.a;
}

fun `toSpannable$lambda$70$lambda$16$lambda$15`(var0: QuoteSpan, var1: RenderContext.Insets): RenderContext.Insets {
   kotlin.jvm.internal.r.h(var1, "$this$updateInsets");
   return RenderContext.Insets.copy$default(var1, 0, 0, var1.getStart() + var0.getInsetStart(), 0, 11, null);
}

fun `toSpannable$lambda$70$lambda$19`(var0: RenderContext, var1: ContentNode, var2: View): Unit {
   kotlin.jvm.internal.r.h(var2, "it");
   var0.getOnTapInlineCode().invoke(var1);
   return Unit.a;
}

fun `toSpannable$lambda$70$lambda$21`(var0: ContentNode, var1: RenderContext, var2: View): Boolean {
   kotlin.jvm.internal.r.h(var2, "it");
   val var3: Boolean;
   if ((var0 as LinkContentNode).isUrl()) {
      var1.getOnLongTapLink().invoke(var0);
      var3 = true;
   } else {
      var3 = false;
   }

   return var3;
}

fun `toSpannable$lambda$70$lambda$22`(var0: RenderContext, var1: ContentNode, var2: View): Unit {
   kotlin.jvm.internal.r.h(var2, "it");
   var0.getOnTapLink().invoke(var1);
   return Unit.a;
}

fun `toSpannable$lambda$70$lambda$26`(var0: RenderContext, var1: ContentNode, var2: View): Unit {
   kotlin.jvm.internal.r.h(var2, "it");
   val var3: Function4 = var0.getOnTapMention();
   val var5: UserOrRoleMentionContentNode = var1 as UserOrRoleMentionContentNode;
   val var6: UserId = (var1 as UserOrRoleMentionContentNode).getUserId-wUX8bhU();
   var var10: java.lang.String = null;
   val var7: java.lang.String;
   if (var6 != null) {
      var7 = UserId.toString-impl(var6.unbox-impl());
   } else {
      var7 = null;
   }

   val var4: java.lang.String = java.lang.String.valueOf(var5.getChannelId-qMVnFVQ());
   val var8: java.lang.String = var5.getRoleName();
   val var9: java.lang.String;
   if (var8 != null) {
      var9 = var8.toString();
   } else {
      var9 = null;
   }

   val var11: java.lang.String = var5.getParsedUserId();
   if (var11 != null) {
      var10 = var11.toString();
   }

   var3.invoke(var7, var4, var9, var10);
   return Unit.a;
}

fun `toSpannable$lambda$70$lambda$28`(var0: RenderContext, var1: ContentNode, var2: View): Boolean {
   kotlin.jvm.internal.r.h(var2, "it");
   var0.getOnLongPressChannel()
      .invoke(
         (var1 as ChannelMentionContentNode).getChannelId(),
         (var1 as ChannelMentionContentNode).getGuildId(),
         (var1 as ChannelMentionContentNode).getMessageId(),
         (var1 as ChannelMentionContentNode).getOriginalLink()
      );
   return true;
}

fun `toSpannable$lambda$70$lambda$29`(var0: RenderContext, var1: ContentNode, var2: View): Unit {
   kotlin.jvm.internal.r.h(var2, "it");
   var0.getOnTapChannel()
      .invoke(
         (var1 as ChannelMentionContentNode).getChannelId(),
         (var1 as ChannelMentionContentNode).getGuildId(),
         (var1 as ChannelMentionContentNode).getMessageId()
      );
   return Unit.a;
}

fun `toSpannable$lambda$70$lambda$32`(var0: RenderContext, var1: ContentNode, var2: View): Boolean {
   kotlin.jvm.internal.r.h(var2, "it");
   var0.getOnLongPressAttachmentLink().invoke((var1 as AttachmentLinkContentNode).getAttachmentUrl(), (var1 as AttachmentLinkContentNode).getAttachmentName());
   return true;
}

fun `toSpannable$lambda$70$lambda$33`(var0: RenderContext, var1: ContentNode, var2: View): Unit {
   kotlin.jvm.internal.r.h(var2, "it");
   var0.getOnTapAttachmentLink().invoke((var1 as AttachmentLinkContentNode).getAttachmentUrl());
   return Unit.a;
}

fun `toSpannable$lambda$70$lambda$35`(var0: RenderContext, var1: ContentNode, var2: View): Unit {
   kotlin.jvm.internal.r.h(var2, "it");
   var0.getOnTapChannel()
      .invoke(
         (var1 as StaticChannelMentionContentNode).getId().getId(),
         java.lang.String.valueOf((var1 as StaticChannelMentionContentNode).getGuildId-qOKuAAo()),
         java.lang.String.valueOf((var1 as StaticChannelMentionContentNode).getItemId())
      );
   return Unit.a;
}

fun `toSpannable$lambda$70$lambda$37`(var0: RenderContext, var1: ContentNode, var2: View): Boolean {
   kotlin.jvm.internal.r.h(var2, "it");
   var0.getOnLongPressCommand().invoke(var1);
   return true;
}

fun `toSpannable$lambda$70$lambda$38`(var0: RenderContext, var1: ContentNode, var2: View): Unit {
   kotlin.jvm.internal.r.h(var2, "it");
   var0.getOnTapCommand().invoke(var1);
   return Unit.a;
}

fun `toSpannable$lambda$70$lambda$41`(var0: java.lang.String, var1: RenderContext, var2: View): Unit {
   kotlin.jvm.internal.r.h(var2, "it");
   SpoilerManager.INSTANCE.markRevealed-V2PEE7g(var0);
   var1.getOnTapSpoiler().invoke();
   return Unit.a;
}

fun `toSpannable$lambda$70$lambda$45`(
   var0: DraweeSpanStringBuilder, var1: ForegroundColorSpan, var2: ContentNode, var3: Boolean, var4: DraweeSpanStringBuilder, var5: RenderContext
): Unit {
   kotlin.jvm.internal.r.h(var4, "$this$changeTextSizeSp");
   kotlin.jvm.internal.r.h(var5, "updatedRC");
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

fun `toSpannable$lambda$70$lambda$49$lambda$48`(var0: ContentNode, var1: DraweeSpanStringBuilder, var2: DraweeSpanStringBuilder, var3: RenderContext): Unit {
   kotlin.jvm.internal.r.h(var2, "$this$changeTextSizeSp");
   kotlin.jvm.internal.r.h(var3, "updatedRc");
   appendToExistingBuilder((var0 as HeadingContentNode).getContent(), var3, var1);
   return Unit.a;
}

fun `toSpannable$lambda$70$lambda$63`(var0: RenderContext, var1: ContentNode, var2: View): Unit {
   kotlin.jvm.internal.r.h(var2, "it");
   var0.getOnTapTimestamp().invoke((var1 as TimestampContentNode).getFull());
   return Unit.a;
}

fun `toSpannable$lambda$70$lambda$66`(var0: RenderContext, var1: ContentNode, var2: View): Unit {
   kotlin.jvm.internal.r.h(var2, "it");
   var0.getOnTapSoundmoji().invoke(var1);
   return Unit.a;
}

fun `toSpannable$lambda$70$lambda$69`(var0: DraweeSpanStringBuilder, var1: ContentNode, var2: Context, var3: RenderContext, var4: SpannableStringBuilder): Unit {
   kotlin.jvm.internal.r.h(var4, "<this>");
   var0.append("  ");
   val var6: SoundmojiContentNode = var1 as SoundmojiContentNode;
   val var10: RenderableEmoji = SoundmojiContentNodeKt.toRenderableEmoji(var1 as SoundmojiContentNode);
   if (var10 != null) {
      val var7: java.lang.Float = var3.getEmojiBaselineHeightOverridePx();
      val var5: Float;
      if (var7 != null) {
         var5 = var7;
      } else {
         var5 = var3.getBaselineHeightPx();
      }

      RenderableEmojiKt.renderEmojiInto$default(var0, var10, var2, getIconSize("_emoji", var5 * 0.8F), false, 0, new l(var3), 32, null);
      var0.append(" ");
   }

   val var8: java.lang.String = var6.getContent();
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

fun `toSpannable$lambda$70$lambda$69$lambda$68$lambda$67`(var0: RenderContext, var1: GenericDraweeHierarchyBuilder): Unit {
   kotlin.jvm.internal.r.h(var1, "$this$renderEmojiInto");
   EmojiRendererKt.handleEmojiSpoiler(var1, var0, true);
   return Unit.a;
}

fun `toSpannable$lambda$8`(var0: CommandMentionContentNode): Unit {
   kotlin.jvm.internal.r.h(var0, "it");
   return Unit.a;
}

fun `toSpannable$lambda$9`(var0: java.lang.String): Unit {
   kotlin.jvm.internal.r.h(var0, "it");
   return Unit.a;
}

@JvmSynthetic
fun u(var0: RenderContext, var1: ContentNode, var2: View): Unit {
   return toSpannable$lambda$70$lambda$26(var0, var1, var2);
}

@JvmSynthetic
fun v(var0: java.lang.String, var1: RenderContext, var2: View): Unit {
   return toSpannable$lambda$70$lambda$41(var0, var1, var2);
}

@JvmSynthetic
fun w(var0: RenderContext, var1: ContentNode, var2: View): Boolean {
   return toSpannable$lambda$70$lambda$28(var0, var1, var2);
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

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
import com.discord.chat.R.color
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
import com.discord.chat.bridge.contentnode.GameMentionContentNode
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

private const val FIRST_STRONG_ISOLATE: Char = '\u2068'
private const val POP_DIRECTIONAL_ISOLATE: Char = '\u2069'
private const val CHANNEL_PREFIX: String = "#"
private const val COMMAND_PREFIX: String = "/"

@JvmSynthetic
fun A(var0: RenderContext, var1: ContentNode, var2: View): Unit {
   return toSpannable$lambda$71$lambda$67(var0, var1, var2);
}

@JvmSynthetic
fun B(): Unit {
   return toSpannable$lambda$13();
}

@JvmSynthetic
fun C(var0: LinkContentNode): LinkStyle {
   return toSpannable$lambda$12(var0);
}

@JvmSynthetic
fun D(var0: RenderContext, var1: ContentNode, var2: View): Boolean {
   return toSpannable$lambda$71$lambda$28(var0, var1, var2);
}

@JvmSynthetic
fun E(var0: java.lang.String, var1: RenderContext, var2: View): Unit {
   return toSpannable$lambda$71$lambda$42(var0, var1, var2);
}

@JvmSynthetic
fun F(var0: RenderContext, var1: ContentNode, var2: View): Unit {
   return toSpannable$lambda$71$lambda$29(var0, var1, var2);
}

@JvmSynthetic
fun G(var0: RenderContext, var1: ContentNode, var2: View): Boolean {
   return toSpannable$lambda$71$lambda$37(var0, var1, var2);
}

@JvmSynthetic
fun H(var0: RenderContext, var1: ContentNode, var2: View): Unit {
   return toSpannable$lambda$71$lambda$22(var0, var1, var2);
}

@JvmSynthetic
fun a(var0: RenderContext, var1: ContentNode, var2: View): Unit {
   return toSpannable$lambda$71$lambda$38(var0, var1, var2);
}

private fun DraweeSpanStringBuilder.appendBulletPoint(content: List<ContentNode>, rc: RenderContext, isOrderedList: Boolean) {
   var var5: Int = SizeUtilsKt.getDpToPx(8);
   val var8: Int = var2.getListNestedLevel();
   val var15: Standard = new Standard(SizeUtilsKt.getDpToPx(var8 * 16));
   val var6: Int = SizeUtilsKt.getDpToPx(2);
   val var14: VerticalPaddingSpan = new VerticalPaddingSpan(var6);
   if (var3) {
      var var13: java.lang.Long = var2.getListOrderedIndex();
      var var11: Long = 1L;
      val var9: Long;
      if (var13 != null) {
         var9 = var13;
      } else {
         var9 = 1L;
      }

      var13 = var2.getListLargestOrderedIndex();
      if (var13 != null) {
         var11 = var13;
      }

      if (var2.getSingleLine()) {
         val var24: StringBuilder = new StringBuilder();
         var24.append(var9);
         var24.append(".  ");
         appendToExistingBuilder(CollectionsKt.e(new TextContentNode(var24.toString())), var2, var0);
         appendToExistingBuilder(var1, var2, var0);
         return;
      }

      val var23: OrderedListBulletSpan = new OrderedListBulletSpan(var9, var5, var11, var2.getPaint());
      SpannableStringBuilderExtensionsKt.ensureNewline(var0, new AbsoluteSizeSpan(var6));
      var5 = var0.length();
      appendToExistingBuilder(var1, var2, var0);

      for (int var4 = 0; var4 < 3; var4++) {
         val var16: Any = new Object[]{var15, var23, var14}[var4];
         if (var16 != null) {
            var0.setSpan(var16, var5, var0.length(), 33);
         }
      }
   } else {
      if (var2.getSingleLine()) {
         val var27: java.lang.String;
         if (var2.getListNestedLevel() == 0) {
            var27 = "•  ";
         } else {
            var27 = "◦  ";
         }

         appendToExistingBuilder(CollectionsKt.e(new TextContentNode(var27)), var2, var0);
         appendToExistingBuilder(var1, var2, var0);
         return;
      }

      val var7: Int = SizeUtilsKt.getDpToPx(2);
      val var18: Int = ColorUtilsKt.getThemeColor(var2.getContext(), R.color.primary_360, R.color.primary_400, var2.getTheme());
      val var25: Style;
      if (var8 > 0) {
         var25 = Style.STROKE;
      } else {
         var25 = Style.FILL;
      }

      val var26: BulletSpan = new BulletSpan(var18, var5, false, var7, 0.0F, var25, 20, null);
      SpannableStringBuilderExtensionsKt.ensureNewline(var0, new AbsoluteSizeSpan(var6));
      var5 = var0.length();
      appendToExistingBuilder(var1, var2, var0);

      for (int var19 = 0; var19 < 3; var19++) {
         val var17: Any = new Object[]{var15, var26, var14}[var19];
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
   val var9: Int = var0.length();
   var0.append('\u200b');
   val var11: com.facebook.drawee.controller.a = (ja.d.g().E(ImageRequestBuilder.x(Uri.parse(ReactAssetUtilsKt.getReactImageUrl(var1, var3))).a()) as PipelineDraweeControllerBuilder)
      .c();
   val var13: GenericDraweeHierarchyBuilder = GenericDraweeHierarchyBuilder.u(var1.getResources()).w(ScalingUtils$ScaleType.e);
   val var10: com.facebook.drawee.generic.a = com.facebook.drawee.generic.a.c(var7);
   var10.t(var8);
   var10.w(com.facebook.drawee.generic.a.a.e);
   var13.K(var10);
   if (var2.spoilerIsHidden()) {
      var13.v(new PorterDuffColorFilter(var2.getTheme().getSpoilerHiddenBackground(), Mode.SRC_IN));
   } else if (var6 != null) {
      var13.v(new PorterDuffColorFilter(var6, Mode.SRC_IN));
   }

   var0.j(var1, var13.a(), var11, var9, var4, var5, false, 2);
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
fun b(var0: java.lang.String, var1: java.lang.String): Unit {
   return toSpannable$lambda$5(var0, var1);
}

@JvmSynthetic
fun c(var0: DraweeSpanStringBuilder, var1: ForegroundColorSpan, var2: ContentNode, var3: Boolean, var4: DraweeSpanStringBuilder, var5: RenderContext): Unit {
   return toSpannable$lambda$71$lambda$46(var0, var1, var2, var3, var4, var5);
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
fun e(var0: LinkContentNode): Unit {
   return toSpannable$lambda$1(var0);
}

@JvmSynthetic
fun f(var0: RenderContext, var1: ContentNode, var2: View): Boolean {
   return toSpannable$lambda$71$lambda$32(var0, var1, var2);
}

@JvmSynthetic
fun g(var0: CommandMentionContentNode): Unit {
   return toSpannable$lambda$7(var0);
}

public fun getBaselineHeightForFontSizePx(paint: Paint, fontSizePx: Int): Float {
   val var2: Float = var0.getTextSize();
   var0.setTextSize((float)var1);
   val var4: FontMetrics = var0.getFontMetrics();
   val var3: Float = getBaselineHeightPx(var4);
   var0.setTextSize(var2);
   return var3;
}

public fun getBaselineHeightPx(fontMetrics: FontMetrics): Float {
   return var0.descent - var0.ascent;
}

private fun getIconPaddingMultiplier(iconType: String): Float {
   return if (!(var0 == "post") && !(var0 == "forum")) 0.0F else 0.2F;
}

public fun getIconSize(iconType: String?, baselineHeight: Float): Int {
   return if (var1 >= 0.0F) (int)(var1 * getIconSizeMultiplier(var0)) else SizeUtilsKt.getDpToPx(20);
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
fun h(var0: RenderContext, var1: ContentNode, var2: View): Unit {
   return toSpannable$lambda$71$lambda$64(var0, var1, var2);
}

@JvmSynthetic
fun i(var0: RenderContext, var1: ContentNode, var2: View): Unit {
   return toSpannable$lambda$71$lambda$35(var0, var1, var2);
}

@JvmSynthetic
fun j(var0: DraweeSpanStringBuilder, var1: ContentNode, var2: Context, var3: RenderContext, var4: SpannableStringBuilder): Unit {
   return toSpannable$lambda$71$lambda$70(var0, var1, var2, var3, var4);
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
fun m(var0: RenderContext, var1: ContentNode, var2: View): Unit {
   return toSpannable$lambda$71$lambda$26(var0, var1, var2);
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
fun n(var0: RenderContext, var1: GenericDraweeHierarchyBuilder): Unit {
   return toSpannable$lambda$71$lambda$70$lambda$69$lambda$68(var0, var1);
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
fun s(var0: ContentNode, var1: RenderContext, var2: View): Boolean {
   return toSpannable$lambda$71$lambda$21(var0, var1, var2);
}

private fun DraweeSpanStringBuilder.simulateInlineNewline() {
   var0.append("    ");
}

@JvmSynthetic
fun t(var0: EmojiContentNode): Unit {
   return toSpannable$lambda$11(var0);
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
   onLongTapLink: (LinkContentNode) -> Unit = new c0(),
   onTapChannel: (String, String?, String?) -> Unit = new d0(),
   onLongPressChannel: (String, String?, String?, String?) -> Unit = new e0(),
   onTapAttachmentLink: (String) -> Unit = new f0(),
   onLongPressAttachmentLink: (String, String) -> Unit = new g0(),
   onTapMention: (String?, String, String?, String?) -> Unit = new i0(),
   onTapCommand: (CommandMentionContentNode) -> Unit = new j0(),
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
   if (var0 is AnnotatedStructurableText) {
      return toSpannable$default(
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
   } else if (var0 is PrimitiveStructurableText) {
      return new DraweeSpanStringBuilder((var0 as PrimitiveStructurableText).getContent());
   } else {
      throw new ht.p();
   }
}

private fun List<ContentNode>.toSpannable(rc: RenderContext, builder: DraweeSpanStringBuilder = new DraweeSpanStringBuilder(), isRootNode: Boolean = true): DraweeSpanStringBuilder {
   var var20: RenderContext = var1;
   var var21: DraweeSpanStringBuilder = var2;
   val var23: Int = -1;
   val var25: java.util.Iterator = var0.iterator();
   var var6: Int = 0;

   for (int var8 = 0; var25.hasNext(); var8++) {
      var var22: RoleColors = (RoleColors)var25.next();
      if (var8 < 0) {
         CollectionsKt.v();
      }

      var var27: ContentNode = var22 as ContentNode;
      var var7: Byte;
      if (var8 == CollectionsKt.n(var0)) {
         var7 = 1;
      } else {
         var7 = var6;
      }

      var var26: Context = var20.getContext();
      var var9: Int;
      if (var20.spoilerIsHidden()) {
         var9 = var20.getTheme().getSpoilerHiddenBackground();
      } else {
         var9 = var20.getTheme().getBackgroundSecondary();
      }

      var var28: BackgroundSpan = new BackgroundSpan(new BackgroundStyle(var9, 0, 0, 6, null), null, null, 6, null);
      var var24: RelativeSizeSpan = new RelativeSizeSpan(0.85F);
      var var29: DiscordFontSpan = new DiscordFontSpan(var26, DiscordFont.CodeNormal);
      var var11: Int = ColorUtilsKt.getThemeColor(var26, color.chat_mentions_background_light, color.chat_mentions_background_dark, var20.getTheme());
      var9 = ColorUtilsKt.getThemeColor(var26, color.chat_mentions_foreground_light, color.chat_mentions_foreground_dark, var20.getTheme());
      val var13: Int = x2.c.l(ColorUtilsKt.getThemeColor(var26, R.color.green_330, R.color.green_330, var20.getTheme()), 25);
      val var12: Int = ColorUtilsKt.getThemeColor(var26, R.color.green_330, R.color.green_330, var20.getTheme());
      if (var27 is BlockQuoteContentNode) {
         if (var20.getSingleLine()) {
            var21.append("> ");
            appendToExistingBuilder((var27 as BlockQuoteContentNode).getContent(), var20, var21);
         } else {
            var22 = new QuoteSpan(var20.getTheme().getInteractiveMuted(), SizeUtilsKt.getDpToPx(3), SizeUtilsKt.getDpToPx(8));
            var7 = var21.length();
            appendToExistingBuilder((var27 as BlockQuoteContentNode).getContent(), var20.updateInsets(new w((QuoteSpan)var22)), var21);
            var22 = new Object[]{var22}[var6];
            if (var22 != null) {
               var21.setSpan(var22, var7, var21.length(), 13107233);
            }
         }
      } else if (var27 is CodeBlockContentNode) {
         if (var20.getSingleLine()) {
            var9 = var21.length();
            var21.append(StringsKt.G((var27 as CodeBlockContentNode).getContent(), '\n', ' ', false, 4, null));

            for (int var92 = var6; var92 < 3; var92++) {
               var22 = new Object[]{var28, var24, var29}[var92];
               if (var22 != null) {
                  var21.setSpan(var22, var9, var21.length(), 33);
               }
            }
         } else {
            CodeStyle.INSTANCE.renderCodeBlock(var21, var27 as CodeBlockContentNode, var20, (boolean)var7);
         }
      } else if (var27 is EmojiContentNode) {
         EmojiRendererKt.renderEmoji(var21, var27 as EmojiContentNode, var20);
      } else if (var27 is EmphasisContentNode) {
         var22 = new GGSansItalicSpan(var20.getContext());
         var7 = var21.length();
         appendToExistingBuilder((var27 as EmphasisContentNode).getContent(), var20, var21);
         var22 = new Object[]{var22}[var6];
         if (var22 != null) {
            var21.setSpan(var22, var7, var21.length(), 33);
         }
      } else if (var27 is InlineCodeContentNode) {
         val var163: ClickableSpan;
         if (!var20.getInLink()) {
            var163 = new ClickableSpan(null, var23, null, null, 0.0F, null, null, new m(var20, var27), 125, null);
         } else {
            var163 = null;
         }

         if (!var1.getInLink()) {
            var22 = new ForegroundColorSpan(var1.getTheme().getTextNormal());
         } else {
            var22 = null;
         }

         var9 = var21.length();
         var21.append((var27 as InlineCodeContentNode).getContent());

         for (int var90 = var6; var90 < 5; var90++) {
            var26 = (Context)new Object[]{var163, var28, var24, var29, var22}[var90];
            if (var26 != null) {
               var21.setSpan(var26, var9, var21.length(), 33);
            }
         }

         var20 = var1;
      } else if (var27 !is LineBreakContentNode && var27 !is NewLineContentNode) {
         if (var27 is LinkContentNode) {
            val var284: LinkStyle = var1.getLinkStyle().invoke(var27) as LinkStyle;
            val var275: LinkContentNode = var27 as LinkContentNode;
            val var158: Int = (var27 as LinkContentNode).getLinkColor();
            if (var158 != null) {
               var7 = var158;
            } else {
               var7 = var284.getLinkColor();
            }

            val var122: Boolean = var275.getShouldShowRoleDot() == java.lang.Boolean.TRUE;
            val var242: RoleColors = RoleColorsKt.toAndroidColors(var275.getRoleColors());
            if (var122) {
               var22 = null;
            } else {
               var22 = var242;
            }

            if (var22 != null) {
               var9 = var22.getPrimaryColor();
            } else {
               var9 = var7;
            }

            val var159: Int;
            if (var22 != null) {
               var159 = var22.getSecondaryColor();
            } else {
               var159 = null;
            }

            val var218: Int;
            if (var22 != null) {
               var218 = var22.getTertiaryColor();
            } else {
               var218 = null;
            }

            val var219: ClickableSpan = new ClickableSpan(
               null, var9, var159, var218, 150.0F, var1.getShowLinkDecorations(), new n(var27, var1), new o(var1, var27), 1, null
            );
            val var263: LinkBackgroundStyle = var284.getBackgroundStyle();
            val var162: BackgroundSpan;
            if (var263 != null) {
               val var160: Int = var263.getColor();
               if (var160 != null) {
                  var9 = var160;
               } else {
                  var9 = var6;
               }

               val var161: Int = var263.getBorderRadius();
               val var116: Int;
               if (var161 != null) {
                  var116 = var161;
               } else {
                  var116 = var6;
               }

               var162 = new BackgroundSpan(new BackgroundStyle(var9, var116, 0, 4, null), null, null, 6, null);
               val var264: java.lang.Boolean = var263.getSpaceAround();
               if (var264 != null) {
                  var6 = var264;
               }
            } else {
               var162 = null;
            }

            val var266: DiscordFontSpan = new DiscordFontSpan(var1.getContext(), var284.getFont());
            var9 = var21.length();
            maybeAddRoleDot(var21, var122, var1.getSingleLine(), var26, var11, var7, var242);
            if (var6 != 0) {
               var21.append(' ');
            }

            var7 = getIconSize(null, var1.getBaselineHeightPx());
            val var243: ReactAsset = var284.getIcon();
            if (var243 != null) {
               appendImage$default(var21, var26, var1, var243.getUri(var26), var7, var7, var284.getLinkColor(), 0.0F, 0.0F, 192, null);
               var21.append(' ');
            }

            appendToExistingBuilder(
               var275.getContent(),
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
               var21
            );
            if (var6 != 0) {
               var21.append(' ');
            }

            var6 = var9;

            for (int var89 = 0; var89 < 3; var89++) {
               var24 = (RelativeSizeSpan)new Object[]{var219, var266, var162}[var89];
               if (var24 != null) {
                  var21.setSpan(var24, var6, var21.length(), 13107233);
               }
            }
         } else {
            label758: {
               val var130: DraweeSpanStringBuilder;
               if (var27 is MentionContentNode) {
                  var21.append('\u2068');
                  val var229: DiscordFontSpan = new DiscordFontSpan(var1.getContext(), DiscordFont.PrimarySemibold);
                  val var126: MentionContentNode = var27 as MentionContentNode;
                  if (var27 as MentionContentNode is UserOrRoleMentionContentNode) {
                     val var267: ClickableSpan = new ClickableSpan(null, var23, null, null, 0.0F, null, null, new p(var1, var27), 125, null);
                     val var276: UserOrRoleMentionContentNode = var27 as UserOrRoleMentionContentNode;
                     val var113: Int = (var27 as UserOrRoleMentionContentNode).getRoleColor();
                     var22 = RoleColorsKt.toAndroidColors((var27 as UserOrRoleMentionContentNode).getRoleColors());
                     val var118: Boolean;
                     if (var1.getShouldShowRoleDot() && var113 > 0) {
                        var118 = true;
                     } else {
                        var118 = false;
                     }

                     var var66: Boolean;
                     if (var1.getShouldShowRoleOnName() && var113 > 0) {
                        var66 = 1;
                     } else {
                        var66 = 0;
                     }

                     val var127: UserId = var276.getUserId-wUX8bhU();
                     val var16: Long = UserId.constructor-impl(1081004946872352958L);
                     val var15: Boolean;
                     if (var127 == null) {
                        var15 = false;
                     } else {
                        var15 = UserId.equals-impl0(var127.unbox-impl(), var16);
                     }

                     if (var15) {
                        var6 = var13;
                     } else if (var66) {
                        if (var22 != null) {
                           var6 = var22.getPrimaryColor();
                        } else {
                           var6 = var113;
                        }

                        var6 = x2.c.l(var6, 25);
                     } else {
                        var6 = var11;
                     }

                     label726: {
                        var255 = makeMentionBackgroundSpan(var1, var6);
                        if (var66 && !var15) {
                           val var128: Int;
                           if (var22 != null) {
                              var128 = var22.getSecondaryColor();
                           } else {
                              var128 = null;
                           }

                           if (var128 != null) {
                              val var129: java.util.List = CollectionsKt.r(new Integer[]{var22.getPrimaryColor(), var22.getSecondaryColor()});
                              if (var22.getTertiaryColor() != null) {
                                 var129.add(var22.getTertiaryColor());
                              }

                              var164 = new EnhancedRoleColorsSpan(CollectionsKt.g1(var129));
                              break label726;
                           }
                        }

                        if (var15) {
                           var66 = var12;
                        } else if (var66) {
                           var66 = x2.c.l(var113, 255);
                        } else {
                           var66 = var9;
                        }

                        var164 = new ForegroundColorSpan(var66);
                     }

                     var66 = var2.length();
                     maybeAddRoleDot(var2, var118, var1.getSingleLine(), var26, var6, var113, var22);
                     val var191: DraweeSpanStringBuilder = var2;
                     var2.append(toSpannable$default(var276.getContent(), var1, null, false, 6, null));
                     var6 = 0;

                     while (true) {
                        var130 = var191;
                        if (var6 >= 4) {
                           break;
                        }

                        val var131: Any = new Object[]{var229, var267, var255, var164}[var6];
                        if (var131 != null) {
                           var191.setSpan(var131, var66, var191.length(), 33);
                        }

                        var6++;
                     }
                  } else {
                     val var192: DraweeSpanStringBuilder = var21;
                     if (var126 is ChannelMentionContentNode) {
                        val var277: ClickableSpan = new ClickableSpan(null, var23, null, null, 0.0F, null, new q(var1, var27), new r(var1, var27), 61, null);
                        val var165: BackgroundSpan = makeMentionBackgroundSpan(var1, var11);
                        val var268: ForegroundColorSpan = new ForegroundColorSpan(var9);
                        var7 = var21.length();
                        val var132: ChannelMentionContentNode = var27 as ChannelMentionContentNode;
                        val var256: java.util.List = (var27 as ChannelMentionContentNode).getInContent();
                        if (var256 != null) {
                           appendToExistingBuilder(var256, var1, var21);
                           var6 = getIconSize("_caret", var1.getBaselineHeightPx());
                           appendImage$default(
                              var21, var26, var1, ReactAsset.Caret.getUri(var26), var6, var6, var268.getForegroundColor(), 0.0F, 0.0F, 192, null
                           );
                        }

                        val var133: java.util.List = var132.getContent();
                        if (var133 != null) {
                           appendToExistingBuilder(var133, var1, var21);
                        }

                        var6 = 0;

                        while (true) {
                           var130 = var192;
                           if (var6 >= 4) {
                              break;
                           }

                           val var135: Any = new Object[]{var229, var277, var165, var268}[var6];
                           if (var135 != null) {
                              var192.setSpan(var135, var7, var192.length(), 33);
                           }

                           var6++;
                        }
                     } else if (var126 is AttachmentLinkContentNode) {
                        val var193: ClickableSpan = new ClickableSpan(null, var23, null, null, 0.0F, null, new s(var1, var27), new t(var1, var27), 61, null);
                        var28 = makeMentionBackgroundSpan(var1, var11);
                        val var278: ForegroundColorSpan = new ForegroundColorSpan(var9);
                        var7 = var2.length();
                        var6 = getIconSize(null, var1.getBaselineHeightPx());
                        appendImage$default(
                           var2, var26, var1, ReactAsset.Attachment.getUri(var26), var6, var6, var278.getForegroundColor(), 0.0F, 0.0F, 192, null
                        );
                        var21 = var2;
                        var2.append(' ');
                        val var136: java.util.List = (var27 as AttachmentLinkContentNode).getContent();
                        if (var136 != null) {
                           appendToExistingBuilder(var136, var1, var2);
                        }

                        var6 = 0;

                        while (true) {
                           var130 = var21;
                           if (var6 >= 4) {
                              break;
                           }

                           val var138: Any = new Object[]{var229, var193, var28, var278}[var6];
                           if (var138 != null) {
                              var21.setSpan(var138, var7, var21.length(), 33);
                           }

                           var6++;
                        }
                     } else if (var126 !is StaticChannelMentionContentNode) {
                        if (var126 !is CommandMentionContentNode) {
                           if (var126 !is GameMentionContentNode) {
                              throw new ht.p();
                           }

                           var28 = makeMentionBackgroundSpan(var1, var11);
                           val var280: ForegroundColorSpan = new ForegroundColorSpan(var9);
                           var7 = var21.length();
                           var6 = getIconSize(null, var1.getBaselineHeightPx());
                           val var258: GameMentionContentNode = var27 as GameMentionContentNode;
                           if ((var27 as GameMentionContentNode).getIcon() != null) {
                              var21.append(' ');
                              appendImage$default(var21, var26, var1, var258.getIcon(), var6, var6, null, 0.0F, 0.0F, 224, null);
                              var21.append(' ');
                           }

                           val var195: java.util.List = var258.getContent();
                           if (var195 != null) {
                              appendToExistingBuilder(var195, var1, var21);
                           }

                           var6 = 0;

                           while (true) {
                              var130 = var21;
                              if (var6 >= 3) {
                                 break;
                              }

                              val var145: Any = new Object[]{var229, var28, var280}[var6];
                              if (var145 != null) {
                                 var21.setSpan(var145, var7, var21.length(), 33);
                              }

                              var6++;
                           }
                        } else {
                           val var141: BackgroundSpan = makeMentionBackgroundSpan(var1, var11);
                           val var247: ForegroundColorSpan = new ForegroundColorSpan(var9);
                           val var173: ClickableSpan = new ClickableSpan(
                              null, var23, null, null, 0.0F, null, new h0(var1, var27), new m0(var1, var27), 61, null
                           );
                           val var230: GGSansBoldSpan = new GGSansBoldSpan(var1.getContext());
                           var9 = var21.length();
                           var7 = var21.length();
                           var21.append("/");
                           var21.append(toSpannable$default((var27 as CommandMentionContentNode).getContent(), var1, null, false, 6, null));

                           for (int var44 = 0; var44 < 3; var44++) {
                              var27 = (ContentNode)new Object[]{var173, var141, var247}[var44];
                              if (var27 != null) {
                                 var192.setSpan(var27, var7, var192.length(), 33);
                              }
                           }

                           val var142: Any = new Object[]{var230}[0];
                           if (var142 != null) {
                              var192.setSpan(var142, var9, var192.length(), 33);
                           }

                           var130 = var192;
                        }
                     } else {
                        val var194: ClickableSpan = new ClickableSpan(null, var23, null, null, 0.0F, null, null, new u(var1, var27), 125, null);
                        var28 = makeMentionBackgroundSpan(var1, var11);
                        val var279: ForegroundColorSpan = new ForegroundColorSpan(var9);
                        var9 = getIconSize(null, var1.getBaselineHeightPx());
                        var7 = var2.length();
                        val var139: StaticChannelMentionContentNode = var27 as StaticChannelMentionContentNode;
                        var6 = TextUtilsKt.WhenMappings.$EnumSwitchMapping$0[(var27 as StaticChannelMentionContentNode).getId().ordinal()];
                        if (var6 == 1 || var6 == 2) {
                           appendImage$default(var2, var26, var1, ReactAsset.Home.getUri(var26), var9, var9, var279.getForegroundColor(), 0.0F, 0.0F, 192, null);
                        } else if (var6 != 3) {
                           if (var6 != 4) {
                              if (var6 != 5) {
                                 var2.append("#");
                              } else {
                                 appendImage$default(
                                    var2, var26, var1, ReactAsset.Link.getUri(var26), var9, var9, var279.getForegroundColor(), 0.0F, 0.0F, 192, null
                                 );
                              }
                           } else {
                              appendImage$default(
                                 var2, var26, var1, ReactAsset.ChannelBrowse.getUri(var26), var9, var9, var279.getForegroundColor(), 0.0F, 0.0F, 192, null
                              );
                           }
                        } else {
                           appendImage$default(
                              var2, var26, var1, ReactAsset.ChannelBrowse.getUri(var26), var9, var9, var279.getForegroundColor(), 0.0F, 0.0F, 192, null
                           );
                        }

                        var21 = var2;
                        var2.append(toSpannable$default(var139.getContent(), var1, null, false, 6, null));
                        var6 = 0;

                        while (true) {
                           var130 = var21;
                           if (var6 >= 4) {
                              break;
                           }

                           val var140: Any = new Object[]{var229, var194, var28, var279}[var6];
                           if (var140 != null) {
                              var21.setSpan(var140, var7, var21.length(), 33);
                           }

                           var6++;
                        }
                     }
                  }

                  ForceExhaustiveKt.forceExhaustive(var130);
                  var130.append('\u2069');
               } else {
                  var20 = var1;
                  if (var27 !is ParagraphContentNode) {
                     if (var27 !is SpoilerContentNode) {
                        if (var27 is StrikethroughContentNode) {
                           val var199: StrikethroughSpan = new StrikethroughSpan();
                           var6 = var21.length();
                           appendToExistingBuilder((var27 as StrikethroughContentNode).getContent(), var1, var21);
                           var22 = (RoleColors)new Object[]{var199}[0];
                           if (var22 != null) {
                              var21.setSpan(var22, var6, var21.length(), 33);
                           }
                        } else if (var27 is SubtextContentNode) {
                           if (var1.getSingleLine()) {
                              appendToExistingBuilder((var27 as SubtextContentNode).getContent(), var1, var21);
                              if (var7 == 0) {
                                 simulateInlineNewline(var21);
                              }
                           } else {
                              val var50: Byte;
                              if (FontManager.INSTANCE.getIsClassicChatFontScaleEnabled(var26)) {
                                 var50 = 13;
                              } else {
                                 var50 = 14;
                              }

                              changeTextSizeSp(var21, var50, var1, new o0(var21, new ForegroundColorSpan(var1.getTheme().getTextMuted()), var27, (boolean)var7));
                           }
                        } else {
                           var var120: Boolean = var27 is HeadingContentNode;
                           var var51: Int = 16;
                           if (var120) {
                              val var202: DiscordFontSpan = new DiscordFontSpan(var1.getContext(), DiscordFont.PrimaryExtraBold);
                              if (var1.getSingleLine()) {
                                 var51 = var21.length();
                                 appendToExistingBuilder((var27 as HeadingContentNode).getContent(), var1, var21);
                                 simulateInlineNewline(var21);
                                 var22 = (RoleColors)new Object[]{var202}[0];
                                 if (var22 != null) {
                                    var21.setSpan(var22, var51, var21.length(), 33);
                                 }
                              } else {
                                 var9 = (var27 as HeadingContentNode).getLevel();
                                 if (var9 != 1) {
                                    if (var9 == 2) {
                                       var51 = 20;
                                    }
                                 } else {
                                    var51 = 24;
                                 }

                                 if (var21.length() > 0) {
                                    var9 = SizeUtilsKt.getDpToPx(8);
                                 } else {
                                    var9 = SizeUtilsKt.getDpToPx(4);
                                 }

                                 val var233: AbsoluteSizeSpan = new AbsoluteSizeSpan(var9);
                                 var9 = var21.length();
                                 var21.append("\n");
                                 var24 = (RelativeSizeSpan)new Object[]{var233}[0];
                                 if (var24 != null) {
                                    var21.setSpan(var24, var9, var21.length(), 33);
                                 }

                                 var9 = var21.length();
                                 changeTextSizeSp(var21, var51, var1, new p0(var27, var21));
                                 var22 = (RoleColors)new Object[]{var202}[0];
                                 if (var22 != null) {
                                    var21.setSpan(var22, var9, var21.length(), 33);
                                 }

                                 if (var7 == 0) {
                                    val var205: AbsoluteSizeSpan = new AbsoluteSizeSpan(SizeUtilsKt.getDpToPx(4));
                                    var51 = var21.length();
                                    var21.append("\n");
                                    var22 = (RoleColors)new Object[]{var205}[0];
                                    if (var22 != null) {
                                       var21.setSpan(var22, var51, var21.length(), 33);
                                    }
                                 } else {
                                    val var207: AbsoluteSizeSpan = new AbsoluteSizeSpan(0);
                                    var51 = var21.length();
                                    var21.append("\n\u200b");
                                    var22 = (RoleColors)new Object[]{var207}[0];
                                    if (var22 != null) {
                                       var21.setSpan(var22, var51, var21.length(), 33);
                                    }
                                 }
                              }
                           } else {
                              if (var27 !is LHeadingContentNode) {
                                 var var155: DraweeSpanStringBuilder;
                                 if (var27 is BulletListContentNode) {
                                    var20 = RenderContext.copy$default(
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
                                    val var211: BulletListContentNode = var27 as BulletListContentNode;
                                    val var123: Boolean = (var27 as BulletListContentNode).getOrdered();
                                    val var124: Long;
                                    if (var123) {
                                       val var174: java.lang.Long = var211.getStart();
                                       if (var174 != null) {
                                          var124 = var174;
                                       } else {
                                          var124 = 1L;
                                       }

                                       var20 = RenderContext.copy$default(
                                          var20,
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
                                          (long)(var211.getItems().size() - 1) + var124,
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

                                    val var236: java.util.Iterator = var211.getItems().iterator();

                                    for (int var61 = 0; var236.hasNext(); var61++) {
                                       var var175: java.util.List = (java.util.List)var236.next();
                                       if (var61 < 0) {
                                          CollectionsKt.v();
                                       }

                                       var175 = var175;
                                       val var251: ArrayList = new ArrayList();
                                       var11 = var175.size();
                                       var var78: Boolean;
                                       if (var61 == var211.getItems().size() - 1) {
                                          var78 = 1;
                                       } else {
                                          var78 = 0;
                                       }

                                       val var262: java.util.Iterator = var175.iterator();

                                       for (int var103 = 0; var262.hasNext(); var103++) {
                                          var175 = (java.util.List)var262.next();
                                          if (var103 < 0) {
                                             CollectionsKt.v();
                                          }

                                          val var273: ContentNode = var175 as ContentNode;
                                          var120 = var175 as ContentNode is BulletListContentNode;
                                          val var115: Boolean;
                                          if (var103 == var11 - 1) {
                                             var115 = true;
                                          } else {
                                             var115 = false;
                                          }

                                          if (!var120) {
                                             var251.add(var273);
                                          }

                                          if (var120 || var115) {
                                             var var178: RenderContext = var20;
                                             if (var123) {
                                                var var18: Long;
                                                if (var20.getListOrderedIndex() != null) {
                                                   val var179: java.lang.Long = var20.getListOrderedIndex();
                                                   if (var179 != null) {
                                                      var18 = var179;
                                                   } else {
                                                      var18 = 0L;
                                                   }

                                                   var18++;
                                                } else {
                                                   var18 = var124;
                                                }

                                                var178 = RenderContext.copy$default(
                                                   var20,
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
                                                   var18,
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

                                             appendBulletPoint(var2, var251, var178, var123);
                                             if (var1.getSingleLine()) {
                                                simulateInlineNewline(var2);
                                             }

                                             var251.clear();
                                             var20 = var178;
                                          }

                                          if (var120) {
                                             appendToExistingBuilder(
                                                CollectionsKt.e(var273),
                                                RenderContext.copy$default(
                                                   var20,
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
                                                   var20.getListNestedLevel() + 1,
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

                                       if (var3 && var78) {
                                          val var181: AbsoluteSizeSpan = new AbsoluteSizeSpan(SizeUtilsKt.getDpToPx(2));
                                          var78 = var2.length();
                                          var2.append("\n\u200b");
                                          var175 = (java.util.List)new Object[]{var181}[0];
                                          if (var175 != null) {
                                             var2.setSpan(var175, var78, var2.length(), 33);
                                          }
                                       }
                                    }

                                    var155 = var2;
                                 } else {
                                    var20 = var1;
                                    val var212: DraweeSpanStringBuilder = var21;
                                    var6 = 0;
                                    if (var27 is StrongContentNode) {
                                       val var184: GGSansBoldSpan = new GGSansBoldSpan(var1.getContext());
                                       var51 = var21.length();
                                       appendToExistingBuilder((var27 as StrongContentNode).getContent(), var1, var21);
                                       val var185: Any = new Object[]{var184}[0];
                                       var155 = var21;
                                       if (var185 != null) {
                                          var21.setSpan(var185, var51, var21.length(), 33);
                                          var155 = var21;
                                       }
                                    } else if (var27 is TextContentNode) {
                                       val var186: java.lang.String = (var27 as TextContentNode).getContent();
                                       var155 = var21;
                                       if (var186 != null) {
                                          var21.append(var186);
                                          var155 = var21;
                                       }
                                    } else if (var27 is TimestampContentNode) {
                                       val var187: ClickableSpan = new ClickableSpan(
                                          null,
                                          ColorUtilsKt.getThemeColor(var26, R.color.primary_600, R.color.primary_200, var1.getTheme()),
                                          null,
                                          null,
                                          0.0F,
                                          null,
                                          null,
                                          new q0(var1, var27),
                                          125,
                                          null
                                       );
                                       val var237: BackgroundColorSpan = new BackgroundColorSpan(
                                          ColorUtilsKt.getThemeColor(
                                             var26, R.color.background_modifier_accent_light, R.color.background_modifier_accent_dark, var1.getTheme()
                                          )
                                       );
                                       var7 = var21.length();
                                       var21.append((var27 as TimestampContentNode).getFormatted());
                                       var51 = 0;

                                       while (true) {
                                          var155 = var212;
                                          if (var51 >= 2) {
                                             break;
                                          }

                                          val var157: Any = new Object[]{var187, var237}[var51];
                                          if (var157 != null) {
                                             var212.setSpan(var157, var7, var212.length(), 33);
                                          }

                                          var51++;
                                       }
                                    } else {
                                       if (var27 !is UnderlineContentNode) {
                                          if (var27 is ChannelNameContentNode) {
                                             var21.append('\u2068');
                                             val var241: ChannelNameContentNode = var27 as ChannelNameContentNode;
                                             if ((var27 as ChannelNameContentNode).getIcon() != null) {
                                                var7 = getIconSize(var241.getIconType(), var1.getBaselineHeightPx());
                                                appendImage$default(
                                                   var21,
                                                   var26,
                                                   var1,
                                                   var241.getIcon(),
                                                   var7,
                                                   var7,
                                                   var9,
                                                   0.0F,
                                                   (float)var7 * getIconPaddingMultiplier(var241.getIconType()),
                                                   64,
                                                   null
                                                );
                                             }

                                             appendToExistingBuilder(var241.getContent(), var1, var21);
                                             var21.append('\u2069');
                                             continue;
                                          }

                                          var21 = var21;
                                          if (var27 is GuildNameContentNode) {
                                             var21.append('\u2068');
                                             var7 = getIconSize("_guild", var1.getBaselineHeightPx());
                                             val var240: GuildNameContentNode = var27 as GuildNameContentNode;
                                             if ((var27 as GuildNameContentNode).getIcon() != null) {
                                                appendImage$default(
                                                   var21, var26, var1, var240.getIcon(), var7, var7, null, (float)var7 * 0.2F, (float)var7 * 0.1F, 32, null
                                                );
                                             }

                                             var21.append(var240.getContent());
                                             var21.append('\u2069');
                                             continue;
                                          }

                                          if (var27 !is SoundmojiContentNode) {
                                             if (var27 !is ErrorContentNode) {
                                                throw new ht.p();
                                             }

                                             val var215: CrashReporting = CrashReporting.INSTANCE;
                                             val var239: java.lang.Throwable = (var27 as ErrorContentNode).getThrowable();
                                             var6 = 0;
                                             CrashReporting.captureException$default(var215, var239, (boolean)0, 2, null);
                                             var21.append("���");
                                             continue;
                                          }

                                          val var238: VerticalPaddingSpan = new VerticalPaddingSpan(SizeUtilsKt.getDpToPx(4));
                                          val var274: DiscordFontSpan = new DiscordFontSpan(var1.getContext(), DiscordFont.PrimarySemibold);
                                          val var283: ClickableSpan = new ClickableSpan(
                                             null, null, null, null, 0.0F, null, null, new r0(var1, var27), 127, null
                                          );
                                          val var213: ForegroundColorSpan = new ForegroundColorSpan(ThemeManagerKt.getTheme().getTextNormal());
                                          val var32: BackgroundStyle = new BackgroundStyle(ThemeManagerKt.getTheme().getCardPrimaryBg(), 4, 2);
                                          val var31: BorderStyle = new BorderStyle(ThemeManagerKt.getTheme().getBorderStrong(), SizeUtilsKt.getDpToPx(1));
                                          var7 = Color.argb(63, 0, 0, 0);
                                          var6 = 0;
                                          val var285: BackgroundSpan = new BackgroundSpan(
                                             var32, var31, new ShadowStyle(var7, SizeUtilsKt.getDpToPx(4), new SizeF(0.0F, 4.0F))
                                          );
                                          var21.append(" ");
                                          val var252: s0 = new s0(var21, var27, var26, var1);
                                          if (var1.spoilerExists() && !var1.spoilerIsRevealed()) {
                                             var7 = var21.length();
                                             var252.invoke(var21);
                                             var22 = (RoleColors)new Object[]{var238}[0];
                                             if (var22 != null) {
                                                var21.setSpan(var22, var7, var21.length(), 33);
                                             }
                                          } else {
                                             var9 = var21.length();
                                             var252.invoke(var21);

                                             for (int var82 = 0; var82 < 5; var82++) {
                                                var26 = (Context)new Object[]{var238, var274, var283, var213, var285}[var82];
                                                if (var26 != null) {
                                                   var21.setSpan(var26, var9, var21.length(), 33);
                                                }
                                             }
                                          }

                                          var21.append(" ");
                                          continue;
                                       }

                                       val var188: UnderlineSpan = new UnderlineSpan();
                                       var51 = var21.length();
                                       appendToExistingBuilder((var27 as UnderlineContentNode).getContent(), var1, var21);
                                       val var189: Any = new Object[]{var188}[0];
                                       var155 = var21;
                                       if (var189 != null) {
                                          var21.setSpan(var189, var51, var21.length(), 33);
                                          var155 = var21;
                                       }
                                    }
                                 }

                                 var6 = 0;
                                 var21 = var155;
                                 var20 = var1;
                                 continue;
                              }

                              val var209: DiscordFontSpan = new DiscordFontSpan(var1.getContext(), DiscordFont.PrimaryExtraBold);
                              if (!var1.getSingleLine()) {
                                 var51 = FontManager.INSTANCE.getScaledSpToPx(16, var1.getContext());
                                 val var4: Float = getBaselineHeightForFontSizePx(var1.getPaint(), var51);
                                 val var272: AbsoluteSizeSpan = new AbsoluteSizeSpan(var51);
                                 val var260: LHeadingContentNode = var27 as LHeadingContentNode;
                                 if (StringsKt.N((var27 as LHeadingContentNode).getClassName(), "added", false, 2, null)) {
                                    var51 = ThemeManagerKt.getTheme().getTextPositive();
                                 } else if (StringsKt.N(var260.getClassName(), "fixed", false, 2, null)) {
                                    var51 = ThemeManagerKt.getTheme().getTextDanger();
                                 } else if (StringsKt.N(var260.getClassName(), "progress", false, 2, null)) {
                                    var51 = ThemeManagerKt.getTheme().getTextWarning();
                                 } else if (StringsKt.N(var260.getClassName(), "improved", false, 2, null)) {
                                    var51 = ThemeManagerKt.getTheme().getTextBrand();
                                 } else {
                                    var51 = ThemeManagerKt.getTheme().getHeaderPrimary();
                                 }

                                 val var250: ForegroundColorSpan = new ForegroundColorSpan(var51);
                                 if (var21.length() > 0) {
                                    var51 = SizeUtilsKt.getDpToPx(8);
                                 } else {
                                    var51 = SizeUtilsKt.getDpToPx(4);
                                 }

                                 val var235: UnderlineSpan = new UnderlineSpan();
                                 var9 = var21.length();
                                 val var281: AbsoluteSizeSpan = new AbsoluteSizeSpan(var51);
                                 var51 = var21.length();
                                 var21.append("\n");
                                 var29 = (DiscordFontSpan)new Object[]{var281}[0];
                                 if (var29 != null) {
                                    var21.setSpan(var29, var51, var21.length(), 33);
                                 }

                                 val var114: Int = var21.length();
                                 val var261: java.util.List = var260.getContent();
                                 var51 = var9;
                                 appendToExistingBuilder(
                                    var261,
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
                                       false,
                                       null,
                                       null,
                                       var4,
                                       null,
                                       1073741823,
                                       null
                                    ),
                                    var21
                                 );
                                 var var148: Any = new Object[]{var272}[0];
                                 if (var148 != null) {
                                    var21.setSpan(var148, var114, var21.length(), 33);
                                 }

                                 if (var7 == 0) {
                                    var148 = new AbsoluteSizeSpan(SizeUtilsKt.getDpToPx(4));
                                    var7 = var21.length();
                                    var21.append("\n");
                                    var148 = new Object[]{var148}[0];
                                    if (var148 != null) {
                                       var21.setSpan(var148, var7, var21.length(), 33);
                                    }
                                 } else {
                                    var148 = new AbsoluteSizeSpan(0);
                                    var7 = var21.length();
                                    var21.append("\n\u200b");
                                    var148 = new Object[]{var148}[0];
                                    if (var148 != null) {
                                       var21.setSpan(var148, var7, var21.length(), 33);
                                    }
                                 }

                                 for (int var77 = 0; var77 < 3; var77++) {
                                    var148 = new Object[]{var209, var250, var235}[var77];
                                    if (var148 != null) {
                                       var21.setSpan(var148, var51, var21.length(), 33);
                                    }
                                 }

                                 var20 = var1;
                                 var6 = 0;
                                 continue;
                              }

                              var51 = var21.length();
                              appendToExistingBuilder((var27 as LHeadingContentNode).getContent(), var1, var21);
                              simulateInlineNewline(var21);
                              var22 = (RoleColors)new Object[]{var209}[0];
                              if (var22 != null) {
                                 var21.setSpan(var22, var51, var21.length(), 33);
                              }
                           }
                        }

                        var6 = 0;
                        continue;
                     }

                     val var248: SpoilerContentNode = var27 as SpoilerContentNode;
                     val var231: java.lang.String = SpoilerIdentifier.Companion.forNode-2sfwrmE(var27 as SpoilerContentNode, var1.getContainerId(), var8);
                     val var119: Boolean = SpoilerManager.INSTANCE.isRevealed-V2PEE7g(var231);
                     val var197: RenderContext.SpoilerState;
                     if (var119) {
                        var197 = RenderContext.SpoilerState.Revealed;
                     } else {
                        var197 = RenderContext.SpoilerState.Hidden;
                     }

                     val var232: ClickableSpan;
                     if (!var119) {
                        var232 = new ClickableSpan(NestedClickableSpan.TouchPriority.HIGH, null, null, null, 0.0F, null, null, new n0(var231, var1), 126, null);
                     } else {
                        var232 = null;
                     }

                     if (var119) {
                        var6 = var1.getTheme().getSpoilerRevealedBackground();
                     } else {
                        var6 = var1.getTheme().getSpoilerHiddenBackground();
                     }

                     val var259: BackgroundSpan = new BackgroundSpan(new BackgroundStyle(var6, 0, 0, 6, null), null, null, 6, null);
                     val var147: SpoilerSpan = new SpoilerSpan(var119);
                     var6 = var21.length();
                     appendToExistingBuilder(
                        var248.getContent(),
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
                           var197,
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
                        var21
                     );
                     var7 = 0;

                     while (true) {
                        if (var7 >= 3) {
                           break label758;
                        }

                        var22 = (RoleColors)new Object[]{var232, var259, var147}[var7];
                        if (var22 != null) {
                           var21.setSpan(var22, var6, var21.length(), 33);
                        }

                        var7++;
                     }
                  }

                  appendToExistingBuilder((var27 as ParagraphContentNode).getContent(), var1, var21);
                  if (var7 == 0) {
                     var21.append("\n\n");
                  }

                  var130 = var21;
               }

               var6 = 0;
               var21 = var130;
               var20 = var1;
               continue;
            }
         }

         var20 = var1;
         var6 = 0;
      } else {
         var20 = var1;
         var21.append("\n");
      }
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
      var9 = new c0();
   }

   if ((var27 and 512) != 0) {
      var10 = new d0();
   }

   if ((var27 and 1024) != 0) {
      var11 = new e0();
   }

   if ((var27 and 2048) != 0) {
      var12 = new f0();
   }

   if ((var27 and 4096) != 0) {
      var13 = new g0();
   }

   if ((var27 and 8192) != 0) {
      var14 = new i0();
   }

   if ((var27 and 16384) != 0) {
      var15 = new j0();
   }

   if (('耀' and var27) != 0) {
      var16 = new k0();
   }

   if ((65536 and var27) != 0) {
      var17 = new l0();
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
      var21 = new a0();
   }

   if ((2097152 and var27) != 0) {
      var22 = new b0();
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
      (Function1<? super LinkContentNode, Unit>)var8,
      (Function1<? super LinkContentNode, Unit>)var9,
      (Function3)var10,
      (Function4)var11,
      (Function1<? super java.lang.String, Unit>)var12,
      (Function2<? super java.lang.String, ? super java.lang.String, Unit>)var13,
      (Function4)var14,
      (Function1<? super CommandMentionContentNode, Unit>)var15,
      (Function1<? super CommandMentionContentNode, Unit>)var16,
      (Function1<? super java.lang.String, Unit>)var17,
      (Function1<? super InlineCodeContentNode, Unit>)var18,
      (Function1<? super EmojiContentNode, Unit>)var19,
      (Function1<? super LinkContentNode, LinkStyle>)var20,
      (Function0<Unit>)var21,
      (Function1<? super SoundmojiContentNode, Unit>)var22,
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
   return Unit.a;
}

fun `toSpannable$lambda$1`(var0: LinkContentNode): Unit {
   return Unit.a;
}

fun `toSpannable$lambda$10`(var0: InlineCodeContentNode): Unit {
   return Unit.a;
}

fun `toSpannable$lambda$11`(var0: EmojiContentNode): Unit {
   return Unit.a;
}

fun `toSpannable$lambda$12`(var0: LinkContentNode): LinkStyle {
   return new LinkStyle(null, 0, null, null, 15, null);
}

fun `toSpannable$lambda$13`(): Unit {
   return Unit.a;
}

fun `toSpannable$lambda$14`(var0: SoundmojiContentNode): Unit {
   return Unit.a;
}

fun `toSpannable$lambda$2`(var0: java.lang.String, var1: java.lang.String, var2: java.lang.String): Unit {
   return Unit.a;
}

fun `toSpannable$lambda$3`(var0: java.lang.String, var1: java.lang.String, var2: java.lang.String, var3: java.lang.String): Unit {
   return Unit.a;
}

fun `toSpannable$lambda$4`(var0: java.lang.String): Unit {
   return Unit.a;
}

fun `toSpannable$lambda$5`(var0: java.lang.String, var1: java.lang.String): Unit {
   return Unit.a;
}

fun `toSpannable$lambda$6`(var0: java.lang.String, var1: java.lang.String, var2: java.lang.String, var3: java.lang.String): Unit {
   return Unit.a;
}

fun `toSpannable$lambda$7`(var0: CommandMentionContentNode): Unit {
   return Unit.a;
}

fun `toSpannable$lambda$71$lambda$16$lambda$15`(var0: QuoteSpan, var1: RenderContext.Insets): RenderContext.Insets {
   return RenderContext.Insets.copy$default(var1, 0, 0, var1.getStart() + var0.getInsetStart(), 0, 11, null);
}

fun `toSpannable$lambda$71$lambda$19`(var0: RenderContext, var1: ContentNode, var2: View): Unit {
   var0.getOnTapInlineCode().invoke(var1);
   return Unit.a;
}

fun `toSpannable$lambda$71$lambda$21`(var0: ContentNode, var1: RenderContext, var2: View): Boolean {
   if ((var0 as LinkContentNode).isUrl()) {
      var1.getOnLongTapLink().invoke(var0);
      return true;
   } else {
      return false;
   }
}

fun `toSpannable$lambda$71$lambda$22`(var0: RenderContext, var1: ContentNode, var2: View): Unit {
   var0.getOnTapLink().invoke(var1);
   return Unit.a;
}

fun `toSpannable$lambda$71$lambda$26`(var0: RenderContext, var1: ContentNode, var2: View): Unit {
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

fun `toSpannable$lambda$71$lambda$28`(var0: RenderContext, var1: ContentNode, var2: View): Boolean {
   var0.getOnLongPressChannel()
      .invoke(
         (var1 as ChannelMentionContentNode).getChannelId(),
         (var1 as ChannelMentionContentNode).getGuildId(),
         (var1 as ChannelMentionContentNode).getMessageId(),
         (var1 as ChannelMentionContentNode).getOriginalLink()
      );
   return true;
}

fun `toSpannable$lambda$71$lambda$29`(var0: RenderContext, var1: ContentNode, var2: View): Unit {
   var0.getOnTapChannel()
      .invoke(
         (var1 as ChannelMentionContentNode).getChannelId(),
         (var1 as ChannelMentionContentNode).getGuildId(),
         (var1 as ChannelMentionContentNode).getMessageId()
      );
   return Unit.a;
}

fun `toSpannable$lambda$71$lambda$32`(var0: RenderContext, var1: ContentNode, var2: View): Boolean {
   var0.getOnLongPressAttachmentLink().invoke((var1 as AttachmentLinkContentNode).getAttachmentUrl(), (var1 as AttachmentLinkContentNode).getAttachmentName());
   return true;
}

fun `toSpannable$lambda$71$lambda$33`(var0: RenderContext, var1: ContentNode, var2: View): Unit {
   var0.getOnTapAttachmentLink().invoke((var1 as AttachmentLinkContentNode).getAttachmentUrl());
   return Unit.a;
}

fun `toSpannable$lambda$71$lambda$35`(var0: RenderContext, var1: ContentNode, var2: View): Unit {
   var0.getOnTapChannel()
      .invoke(
         (var1 as StaticChannelMentionContentNode).getId().getId(),
         java.lang.String.valueOf((var1 as StaticChannelMentionContentNode).getGuildId-qOKuAAo()),
         java.lang.String.valueOf((var1 as StaticChannelMentionContentNode).getItemId())
      );
   return Unit.a;
}

fun `toSpannable$lambda$71$lambda$37`(var0: RenderContext, var1: ContentNode, var2: View): Boolean {
   var0.getOnLongPressCommand().invoke(var1);
   return true;
}

fun `toSpannable$lambda$71$lambda$38`(var0: RenderContext, var1: ContentNode, var2: View): Unit {
   var0.getOnTapCommand().invoke(var1);
   return Unit.a;
}

fun `toSpannable$lambda$71$lambda$42`(var0: java.lang.String, var1: RenderContext, var2: View): Unit {
   SpoilerManager.INSTANCE.markRevealed-V2PEE7g(var0);
   var1.getOnTapSpoiler().invoke();
   return Unit.a;
}

fun `toSpannable$lambda$71$lambda$46`(
   var0: DraweeSpanStringBuilder, var1: ForegroundColorSpan, var2: ContentNode, var3: Boolean, var4: DraweeSpanStringBuilder, var5: RenderContext
): Unit {
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

fun `toSpannable$lambda$71$lambda$50$lambda$49`(var0: ContentNode, var1: DraweeSpanStringBuilder, var2: DraweeSpanStringBuilder, var3: RenderContext): Unit {
   appendToExistingBuilder((var0 as HeadingContentNode).getContent(), var3, var1);
   return Unit.a;
}

fun `toSpannable$lambda$71$lambda$64`(var0: RenderContext, var1: ContentNode, var2: View): Unit {
   var0.getOnTapTimestamp().invoke((var1 as TimestampContentNode).getFull());
   return Unit.a;
}

fun `toSpannable$lambda$71$lambda$67`(var0: RenderContext, var1: ContentNode, var2: View): Unit {
   var0.getOnTapSoundmoji().invoke(var1);
   return Unit.a;
}

fun `toSpannable$lambda$71$lambda$70`(var0: DraweeSpanStringBuilder, var1: ContentNode, var2: Context, var3: RenderContext, var4: SpannableStringBuilder): Unit {
   var0.append("  ");
   val var12: SoundmojiContentNode = var1 as SoundmojiContentNode;
   val var8: RenderableEmoji = SoundmojiContentNodeKt.toRenderableEmoji(var1 as SoundmojiContentNode);
   if (var8 != null) {
      val var7: java.lang.Float = var3.getEmojiBaselineHeightOverridePx();
      val var5: Float;
      if (var7 != null) {
         var5 = var7;
      } else {
         var5 = var3.getBaselineHeightPx();
      }

      RenderableEmojiKt.renderEmojiInto$default(var0, var8, var2, getIconSize("_emoji", var5 * 0.8F), false, 0, new l(var3), 32, null);
      var0.append(" ");
   }

   val var9: java.lang.String = var12.getContent();
   val var10: java.lang.String;
   if (var9 != null) {
      var10 = StringsKt.H(var9, " ", " ", false, 4, null);
   } else {
      var10 = null;
   }

   var0.append(var10);
   var0.append("  ");
   return Unit.a;
}

fun `toSpannable$lambda$71$lambda$70$lambda$69$lambda$68`(var0: RenderContext, var1: GenericDraweeHierarchyBuilder): Unit {
   EmojiRendererKt.handleEmojiSpoiler(var1, var0, true);
   return Unit.a;
}

fun `toSpannable$lambda$8`(var0: CommandMentionContentNode): Unit {
   return Unit.a;
}

fun `toSpannable$lambda$9`(var0: java.lang.String): Unit {
   return Unit.a;
}

@JvmSynthetic
fun u(var0: QuoteSpan, var1: RenderContext.Insets): RenderContext.Insets {
   return toSpannable$lambda$71$lambda$16$lambda$15(var0, var1);
}

@JvmSynthetic
fun v(var0: RenderContext, var1: ContentNode, var2: View): Unit {
   return toSpannable$lambda$71$lambda$33(var0, var1, var2);
}

@JvmSynthetic
fun w(var0: RenderContext, var1: ContentNode, var2: View): Unit {
   return toSpannable$lambda$71$lambda$19(var0, var1, var2);
}

@JvmSynthetic
fun x(var0: ContentNode, var1: DraweeSpanStringBuilder, var2: DraweeSpanStringBuilder, var3: RenderContext): Unit {
   return toSpannable$lambda$71$lambda$50$lambda$49(var0, var1, var2, var3);
}

@JvmSynthetic
fun y(var0: SoundmojiContentNode): Unit {
   return toSpannable$lambda$14(var0);
}

@JvmSynthetic
fun z(var0: java.lang.String, var1: java.lang.String, var2: java.lang.String, var3: java.lang.String): Unit {
   return toSpannable$lambda$3(var0, var1, var2, var3);
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

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
import com.discord.chat.R
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
import com.discord.react_gesture_handler.nested_touch.NestedClickableSpan.TouchPriority
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
import com.discord.theme.ThemeManagerKt
import com.discord.theme.R.color
import com.discord.theme.utils.ColorUtilsKt
import com.facebook.drawee.backends.pipeline.PipelineDraweeControllerBuilder
import com.facebook.drawee.drawable.ScalingUtils.ScaleType
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
   val var6: Int = var2.getListNestedLevel();
   val var15: Standard = new Standard(SizeUtilsKt.getDpToPx(var6 * 16));
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
         appendToExistingBuilder(CollectionsKt.e(new TextContentNode(var23.toString())), var2, var0);
         appendToExistingBuilder(var1, var2, var0);
      } else {
         val var24: OrderedListBulletSpan = new OrderedListBulletSpan(var9, var5, var11, var2.getPaint());
         SpannableStringBuilderExtensionsKt.ensureNewline(var0, new AbsoluteSizeSpan(var4));
         var5 = var0.length();
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

      appendToExistingBuilder(CollectionsKt.e(new TextContentNode(var25)), var2, var0);
      appendToExistingBuilder(var1, var2, var0);
   } else {
      val var7: Int = SizeUtilsKt.getDpToPx(2);
      val var8: Int = ColorUtilsKt.getThemeColor(var2.getContext(), color.primary_360, color.primary_400, var2.getTheme());
      val var26: Style;
      if (var6 > 0) {
         var26 = Style.STROKE;
      } else {
         var26 = Style.FILL;
      }

      val var27: BulletSpan = new BulletSpan(var8, var5, false, var7, 0.0F, var26, 20, null);
      SpannableStringBuilderExtensionsKt.ensureNewline(var0, new AbsoluteSizeSpan(var4));
      var5 = var0.length();
      appendToExistingBuilder(var1, var2, var0);

      for (int var19 = 0; var19 < 3; var19++) {
         val var17: Any = new Object[]{var15, var27, var14}[var19];
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
   val var11: com.facebook.drawee.controller.a = (G3.d.g().F(ImageRequestBuilder.x(Uri.parse(ReactAssetUtilsKt.getReactImageUrl(var1, var3))).a()) as PipelineDraweeControllerBuilder)
      .d();
   val var13: GenericDraweeHierarchyBuilder = GenericDraweeHierarchyBuilder.u(var1.getResources()).w(ScaleType.e);
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
   val var4: RenderContext = RenderContext.copy$default(
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
   val var7: AbsoluteSizeSpan = new AbsoluteSizeSpan(var1);
   var1 = var0.length();
   var3.invoke(var0, var4);
   val var8: Any = new Object[]{var7}[0];
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
   val var1: Float;
   if (!(var0 == "post") && !(var0 == "forum")) {
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
         throw new Da.p();
      }

      var27 = new DraweeSpanStringBuilder((var0 as PrimitiveStructurableText).getContent());
   }

   return var27;
}

private fun List<ContentNode>.toSpannable(rc: RenderContext, builder: DraweeSpanStringBuilder = new DraweeSpanStringBuilder(), isRootNode: Boolean = true): DraweeSpanStringBuilder {
   var var20: RenderContext = var1;
   var var21: DraweeSpanStringBuilder = var2;
   var var7: Int = 1;
   val var25: java.util.Iterator = var0.iterator();
   var var6: Int = 0;

   for (int var8 = 0; var25.hasNext(); var7 = 1) {
      var var22: Int = (Integer)var25.next();
      if (var8 < 0) {
         CollectionsKt.u();
      }

      var var27: ContentNode = var22 as ContentNode;
      if (var8 != CollectionsKt.m(var0)) {
         var7 = var6;
      }

      var var26: Context = var1.getContext();
      var var9: Int;
      if (var1.spoilerIsHidden()) {
         var9 = var1.getTheme().getSpoilerHiddenBackground();
      } else {
         var9 = var1.getTheme().getBackgroundSecondary();
      }

      val var23: BackgroundSpan = new BackgroundSpan(new BackgroundStyle(var9, 0, 0, 6, null), null, null, 6, null);
      var var24: RelativeSizeSpan = new RelativeSizeSpan(0.85F);
      var var28: DiscordFontSpan = new DiscordFontSpan(var26, DiscordFont.CodeNormal);
      var var10: Int = ColorUtilsKt.getThemeColor(var26, R.color.chat_mentions_background_light, R.color.chat_mentions_background_dark, var1.getTheme());
      var9 = ColorUtilsKt.getThemeColor(var26, R.color.chat_mentions_foreground_light, R.color.chat_mentions_foreground_dark, var1.getTheme());
      val var13: Int = q0.c.k(ColorUtilsKt.getThemeColor(var26, color.green_330, color.green_330, var1.getTheme()), 25);
      val var12: Int = ColorUtilsKt.getThemeColor(var26, color.green_330, color.green_330, var1.getTheme());
      if (var27 is BlockQuoteContentNode) {
         if (var1.getSingleLine()) {
            var21.append("> ");
            appendToExistingBuilder((var27 as BlockQuoteContentNode).getContent(), var20, var21);
         } else {
            var22 = new QuoteSpan(var1.getTheme().getInteractiveMuted(), SizeUtilsKt.getDpToPx(3), SizeUtilsKt.getDpToPx(8));
            var7 = var2.length();
            appendToExistingBuilder((var27 as BlockQuoteContentNode).getContent(), var20.updateInsets(new w((QuoteSpan)var22)), var21);
            var22 = new Object[]{var22}[var6];
            if (var22 != null) {
               var21.setSpan(var22, var7, var2.length(), 13107233);
            }
         }
      } else {
         label778: {
            if (var27 is CodeBlockContentNode) {
               if (var1.getSingleLine()) {
                  var7 = var2.length();
                  var21.append(StringsKt.B((var27 as CodeBlockContentNode).getContent(), '\n', ' ', false, 4, null));

                  for (int var73 = 0; var73 < 3; var73++) {
                     var22 = new Object[]{var23, var24, var28}[var73];
                     if (var22 != null) {
                        var21.setSpan(var22, var7, var2.length(), 33);
                     }
                  }
               } else {
                  CodeStyle.INSTANCE.renderCodeBlock(var21, var27 as CodeBlockContentNode, var20, (boolean)var7);
               }
            } else if (var27 is EmojiContentNode) {
               EmojiRendererKt.renderEmoji(var21, var27 as EmojiContentNode, var20);
            } else {
               if (var27 is EmphasisContentNode) {
                  var22 = new GGSansItalicSpan(var1.getContext());
                  var6 = var2.length();
                  appendToExistingBuilder((var27 as EmphasisContentNode).getContent(), var20, var21);
                  var22 = new Object[]{var22}[0];
                  if (var22 != null) {
                     var21.setSpan(var22, var6, var2.length(), 33);
                  }

                  var6 = 0;
                  break label778;
               }

               var var14: Boolean = var27 is InlineCodeContentNode;
               var22 = null;
               if (var14) {
                  if (!var1.getInLink()) {
                     var22 = new ClickableSpan(null, -1, null, null, 0.0F, null, null, new m(var20, var27), 125, null);
                  }

                  val var260: ForegroundColorSpan = new ForegroundColorSpan(var1.getTheme().getTextNormal());
                  var7 = var2.length();
                  var21.append((var27 as InlineCodeContentNode).getContent());

                  for (int var71 = 0; var71 < 5; var71++) {
                     var27 = (ContentNode)new Object[]{var22, var23, var24, var28, var260}[var71];
                     if (var27 != null) {
                        var21.setSpan(var27, var7, var2.length(), 33);
                     }
                  }

                  var6 = 0;
                  break label778;
               }

               if (var27 is LineBreakContentNode || var27 is NewLineContentNode) {
                  var6 = 0;
                  var21.append("\n");
                  break label778;
               }

               if (var27 is LinkContentNode) {
                  val var282: LinkStyle = var1.getLinkStyle().invoke(var27) as LinkStyle;
                  val var277: LinkContentNode = var27 as LinkContentNode;
                  var22 = (var27 as LinkContentNode).getLinkColor();
                  if (var22 != null) {
                     var6 = var22;
                  } else {
                     var6 = var282.getLinkColor();
                  }

                  val var123: Boolean = var277.getShouldShowRoleDot() == java.lang.Boolean.TRUE;
                  val var237: RoleColors = RoleColorsKt.toAndroidColors(var277.getRoleColors());
                  val var215: RoleColors;
                  if (var123) {
                     var215 = null;
                  } else {
                     var215 = var237;
                  }

                  if (var215 != null) {
                     var7 = var215.getPrimaryColor();
                  } else {
                     var7 = var6;
                  }

                  if (var215 != null) {
                     var22 = var215.getSecondaryColor();
                  } else {
                     var22 = null;
                  }

                  val var216: Int;
                  if (var215 != null) {
                     var216 = var215.getTertiaryColor();
                  } else {
                     var216 = null;
                  }

                  val var198: ClickableSpan = new ClickableSpan(
                     null, var7, var22, var216, 150.0F, var1.getShowLinkDecorations(), new n(var27, var20), new o(var20, var27), 1, null
                  );
                  val var217: LinkBackgroundStyle = var282.getBackgroundStyle();
                  val var146: BackgroundSpan;
                  if (var217 != null) {
                     val var144: Int = var217.getColor();
                     if (var144 != null) {
                        var7 = var144;
                     } else {
                        var7 = 0;
                     }

                     val var145: Int = var217.getBorderRadius();
                     if (var145 != null) {
                        var9 = var145;
                     } else {
                        var9 = 0;
                     }

                     var146 = new BackgroundSpan(new BackgroundStyle(var7, var9, 0, 4, null), null, null, 6, null);
                     val var218: java.lang.Boolean = var217.getSpaceAround();
                     if (var218 != null) {
                        var14 = var218;
                     } else {
                        var14 = false;
                     }
                  } else {
                     var146 = null;
                     var14 = false;
                  }

                  val var220: DiscordFontSpan = new DiscordFontSpan(var1.getContext(), var282.getFont());
                  var7 = var2.length();
                  maybeAddRoleDot(var2, var123, var1.getSingleLine(), var26, var10, var6, var237);
                  if (var14) {
                     var21.append(' ');
                  }

                  var6 = getIconSize(null, var1.getBaselineHeightPx());
                  val var238: ReactAsset = var282.getIcon();
                  if (var238 != null) {
                     appendImage$default(var2, var26, var1, var238.getUri(var26), var6, var6, var282.getLinkColor(), 0.0F, 0.0F, 192, null);
                     var21.append(' ');
                  }

                  var6 = var7;
                  appendToExistingBuilder(
                     var277.getContent(),
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
                  if (var14) {
                     var2.append(' ');
                  }

                  for (int var95 = 0; var95 < 3; var95++) {
                     val var176: Any = new Object[]{var198, var220, var146}[var95];
                     if (var176 != null) {
                        var2.setSpan(var176, var6, var2.length(), 33);
                     }
                  }
               } else {
                  label784: {
                     var var126: DraweeSpanStringBuilder = var21;
                     if (var27 is MentionContentNode) {
                        var21.append('\u2068');
                        val var207: DiscordFontSpan = new DiscordFontSpan(var1.getContext(), DiscordFont.PrimarySemibold);
                        val var178: MentionContentNode = var27 as MentionContentNode;
                        if (var27 as MentionContentNode is UserOrRoleMentionContentNode) {
                           val var226: ClickableSpan = new ClickableSpan(null, -1, null, null, 0.0F, null, null, new p(var1, var27), 125, null);
                           val var265: UserOrRoleMentionContentNode = var27 as UserOrRoleMentionContentNode;
                           val var115: Int = (var27 as UserOrRoleMentionContentNode).getRoleColor();
                           val var280: RoleColors = RoleColorsKt.toAndroidColors((var27 as UserOrRoleMentionContentNode).getRoleColors());
                           if (var1.getShouldShowRoleDot() && var115 > 0) {
                              var14 = true;
                           } else {
                              var14 = false;
                           }

                           var var81: Boolean;
                           if (var1.getShouldShowRoleOnName() && var115 > 0) {
                              var81 = 1;
                           } else {
                              var81 = 0;
                           }

                           val var185: UserId = var265.getUserId-wUX8bhU();
                           val var16: Long = UserId.constructor-impl(1081004946872352958L);
                           val var15: Boolean;
                           if (var185 == null) {
                              var15 = false;
                           } else {
                              var15 = UserId.equals-impl0(var185.unbox-impl(), var16);
                           }

                           if (var15) {
                              var6 = var13;
                           } else if (var81) {
                              if (var280 != null) {
                                 var6 = var280.getPrimaryColor();
                              } else {
                                 var6 = var115;
                              }

                              var6 = q0.c.k(var6, 25);
                           } else {
                              var6 = var10;
                           }

                           label740: {
                              var274 = makeMentionBackgroundSpan(var1, var6);
                              if (var81 && !var15) {
                                 if (var280 != null) {
                                    var22 = var280.getSecondaryColor();
                                 } else {
                                    var22 = null;
                                 }

                                 if (var22 != null) {
                                    val var188: java.util.List = CollectionsKt.q(new Integer[]{var280.getPrimaryColor(), var280.getSecondaryColor()});
                                    if (var280.getTertiaryColor() != null) {
                                       var188.add(var280.getTertiaryColor());
                                    }

                                    var22 = new EnhancedRoleColorsSpan(CollectionsKt.V0(var188));
                                    break label740;
                                 }
                              }

                              if (var15) {
                                 var81 = var12;
                              } else if (var81) {
                                 var81 = q0.c.k(var115, 255);
                              } else {
                                 var81 = var9;
                              }

                              var22 = new ForegroundColorSpan(var81);
                           }

                           var81 = var2.length();
                           maybeAddRoleDot(var2, var14, var1.getSingleLine(), var26, var6, var115, var280);
                           var21.append(toSpannable$default(var265.getContent(), var1, null, false, 6, null));

                           for (int var44 = 0; var44 < 4; var44++) {
                              var26 = (Context)new Object[]{var207, var226, var274, var22}[var44];
                              if (var26 != null) {
                                 var126.setSpan(var26, var81, var2.length(), 33);
                              }
                           }
                        } else if (var178 is ChannelMentionContentNode) {
                           val var273: ClickableSpan = new ClickableSpan(null, -1, null, null, 0.0F, null, new q(var1, var27), new r(var1, var27), 61, null);
                           val var184: BackgroundSpan = makeMentionBackgroundSpan(var1, var10);
                           val var225: ForegroundColorSpan = new ForegroundColorSpan(var9);
                           var7 = var2.length();
                           val var264: ChannelMentionContentNode = var27 as ChannelMentionContentNode;
                           val var279: java.util.List = (var27 as ChannelMentionContentNode).getInContent();
                           if (var279 != null) {
                              appendToExistingBuilder(var279, var1, var21);
                              var6 = getIconSize("_caret", var1.getBaselineHeightPx());
                              appendImage$default(
                                 var2, var26, var1, ReactAsset.Caret.getUri(var26), var6, var6, var225.getForegroundColor(), 0.0F, 0.0F, 192, null
                              );
                           }

                           val var253: java.util.List = var264.getContent();
                           if (var253 != null) {
                              appendToExistingBuilder(var253, var1, var21);
                           }

                           for (int var41 = 0; var41 < 4; var41++) {
                              var26 = (Context)new Object[]{var207, var273, var184, var225}[var41];
                              if (var26 != null) {
                                 var126.setSpan(var26, var7, var2.length(), 33);
                              }
                           }
                        } else if (var178 is AttachmentLinkContentNode) {
                           val var183: ClickableSpan = new ClickableSpan(null, -1, null, null, 0.0F, null, new s(var1, var27), new t(var1, var27), 61, null);
                           val var224: BackgroundSpan = makeMentionBackgroundSpan(var1, var10);
                           val var272: ForegroundColorSpan = new ForegroundColorSpan(var9);
                           var6 = var2.length();
                           var9 = getIconSize(null, var1.getBaselineHeightPx());
                           appendImage$default(
                              var2, var26, var1, ReactAsset.Attachment.getUri(var26), var9, var9, var272.getForegroundColor(), 0.0F, 0.0F, 192, null
                           );
                           var21.append(' ');
                           val var249: java.util.List = (var27 as AttachmentLinkContentNode).getContent();
                           if (var249 != null) {
                              appendToExistingBuilder(var249, var1, var21);
                           }

                           for (int var79 = 0; var79 < 4; var79++) {
                              var26 = (Context)new Object[]{var207, var183, var224, var272}[var79];
                              if (var26 != null) {
                                 var126.setSpan(var26, var6, var2.length(), 33);
                              }
                           }
                        } else if (var178 is StaticChannelMentionContentNode) {
                           val var271: ClickableSpan = new ClickableSpan(null, -1, null, null, 0.0F, null, null, new u(var1, var27), 125, null);
                           val var182: BackgroundSpan = makeMentionBackgroundSpan(var1, var10);
                           val var223: ForegroundColorSpan = new ForegroundColorSpan(var9);
                           var6 = getIconSize(null, var1.getBaselineHeightPx());
                           var7 = var2.length();
                           val var263: StaticChannelMentionContentNode = var27 as StaticChannelMentionContentNode;
                           var9 = TextUtilsKt.WhenMappings.$EnumSwitchMapping$0[(var27 as StaticChannelMentionContentNode).getId().ordinal()];
                           if (var9 == 1 || var9 == 2) {
                              appendImage$default(
                                 var2, var26, var1, ReactAsset.Home.getUri(var26), var6, var6, var223.getForegroundColor(), 0.0F, 0.0F, 192, null
                              );
                           } else if (var9 != 3) {
                              if (var9 != 4) {
                                 if (var9 != 5) {
                                    var21.append("#");
                                 } else {
                                    appendImage$default(
                                       var2, var26, var1, ReactAsset.Link.getUri(var26), var6, var6, var223.getForegroundColor(), 0.0F, 0.0F, 192, null
                                    );
                                 }
                              } else {
                                 appendImage$default(
                                    var2, var26, var1, ReactAsset.ChannelBrowse.getUri(var26), var6, var6, var223.getForegroundColor(), 0.0F, 0.0F, 192, null
                                 );
                              }
                           } else {
                              appendImage$default(
                                 var2, var26, var1, ReactAsset.ChannelBrowse.getUri(var26), var6, var6, var223.getForegroundColor(), 0.0F, 0.0F, 192, null
                              );
                           }

                           var21.append(toSpannable$default(var263.getContent(), var1, null, false, 6, null));

                           for (int var38 = 0; var38 < 4; var38++) {
                              var26 = (Context)new Object[]{var207, var271, var182, var223}[var38];
                              if (var26 != null) {
                                 var126.setSpan(var26, var7, var2.length(), 33);
                              }
                           }
                        } else if (var178 !is CommandMentionContentNode) {
                           if (var178 !is GameMentionContentNode) {
                              throw new Da.p();
                           }

                           val var181: BackgroundSpan = makeMentionBackgroundSpan(var1, var10);
                           val var222: ForegroundColorSpan = new ForegroundColorSpan(var9);
                           var6 = var2.length();
                           var7 = getIconSize(null, var1.getBaselineHeightPx());
                           val var262: GameMentionContentNode = var27 as GameMentionContentNode;
                           if ((var27 as GameMentionContentNode).getIcon() != null) {
                              var21.append(' ');
                              appendImage$default(var2, var26, var1, var262.getIcon(), var7, var7, null, 0.0F, 0.0F, 224, null);
                              var21.append(' ');
                           }

                           val var241: java.util.List = var262.getContent();
                           if (var241 != null) {
                              appendToExistingBuilder(var241, var1, var21);
                           }

                           for (int var76 = 0; var76 < 3; var76++) {
                              var26 = (Context)new Object[]{var207, var181, var222}[var76];
                              if (var26 != null) {
                                 var126.setSpan(var26, var6, var2.length(), 33);
                              }
                           }
                        } else {
                           val var179: BackgroundSpan = makeMentionBackgroundSpan(var1, var10);
                           val var240: ForegroundColorSpan = new ForegroundColorSpan(var9);
                           val var221: ClickableSpan = new ClickableSpan(null, -1, null, null, 0.0F, null, new H(var1, var27), new M(var1, var27), 61, null);
                           val var208: GGSansBoldSpan = new GGSansBoldSpan(var1.getContext());
                           var9 = var2.length();
                           var7 = var2.length();
                           var21.append("/");
                           var21.append(toSpannable$default((var27 as CommandMentionContentNode).getContent(), var1, null, false, 6, null));

                           for (int var35 = 0; var35 < 3; var35++) {
                              var27 = (ContentNode)new Object[]{var221, var179, var240}[var35];
                              if (var27 != null) {
                                 var126.setSpan(var27, var7, var2.length(), 33);
                              }
                           }

                           var22 = (Integer)new Object[]{var208}[0];
                           if (var22 != null) {
                              var126.setSpan(var22, var9, var2.length(), 33);
                           }
                        }

                        ForceExhaustiveKt.forceExhaustive(var2);
                        var126.append('\u2069');
                     } else {
                        label649:
                        if (var27 !is ParagraphContentNode) {
                           if (var27 is SpoilerContentNode) {
                              val var194: SpoilerContentNode = var27 as SpoilerContentNode;
                              val var173: java.lang.String = SpoilerIdentifier.Companion
                                 .forNode-2sfwrmE(var27 as SpoilerContentNode, var1.getContainerId(), var8);
                              var14 = SpoilerManager.INSTANCE.isRevealed-V2PEE7g(var173);
                              val var141: RenderContext.SpoilerState;
                              if (var14) {
                                 var141 = RenderContext.SpoilerState.Revealed;
                              } else {
                                 var141 = RenderContext.SpoilerState.Hidden;
                              }

                              val var174: ClickableSpan;
                              if (!var14) {
                                 var174 = new ClickableSpan(TouchPriority.HIGH, null, null, null, 0.0F, null, null, new N(var173, var1), 126, null);
                              } else {
                                 var174 = null;
                              }

                              if (var14) {
                                 var6 = var1.getTheme().getSpoilerRevealedBackground();
                              } else {
                                 var6 = var1.getTheme().getSpoilerHiddenBackground();
                              }

                              val var236: BackgroundSpan = new BackgroundSpan(new BackgroundStyle(var6, 0, 0, 6, null), null, null, 6, null);
                              val var214: SpoilerSpan = new SpoilerSpan(var14);
                              var6 = var2.length();
                              appendToExistingBuilder(
                                 var194.getContent(),
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
                                    var141,
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
                                    break label784;
                                 }

                                 var20 = (RenderContext)new Object[]{var174, var236, var214}[var7];
                                 if (var20 != null) {
                                    var2.setSpan(var20, var6, var2.length(), 33);
                                 }

                                 var7++;
                              }
                           }

                           if (var27 is StrikethroughContentNode) {
                              val var147: StrikethroughSpan = new StrikethroughSpan();
                              var6 = var2.length();
                              appendToExistingBuilder((var27 as StrikethroughContentNode).getContent(), var1, var21);
                              val var148: Any = new Object[]{var147}[0];
                              if (var148 != null) {
                                 var21.setSpan(var148, var6, var2.length(), 33);
                              }
                           } else if (var27 is SubtextContentNode) {
                              if (var1.getSingleLine()) {
                                 appendToExistingBuilder((var27 as SubtextContentNode).getContent(), var1, var21);
                                 if (var7 == 0) {
                                    simulateInlineNewline(var2);
                                 }
                              } else {
                                 val var46: Byte;
                                 if (FontManager.INSTANCE.getIsClassicChatFontScaleEnabled(var26)) {
                                    var46 = 13;
                                 } else {
                                    var46 = 14;
                                 }

                                 changeTextSizeSp(
                                    var21, var46, var1, new O(var21, new ForegroundColorSpan(var1.getTheme().getTextMuted()), var27, (boolean)var7)
                                 );
                              }
                           } else {
                              var14 = var27 is HeadingContentNode;
                              var var47: Int = 16;
                              if (var14) {
                                 val var150: DiscordFontSpan = new DiscordFontSpan(var1.getContext(), DiscordFont.PrimaryExtraBold);
                                 if (var1.getSingleLine()) {
                                    var47 = var2.length();
                                    appendToExistingBuilder((var27 as HeadingContentNode).getContent(), var1, var21);
                                    simulateInlineNewline(var2);
                                    val var151: Any = new Object[]{var150}[0];
                                    if (var151 != null) {
                                       var21.setSpan(var151, var47, var2.length(), 33);
                                    }
                                 } else {
                                    var9 = (var27 as HeadingContentNode).getLevel();
                                    if (var9 != 1) {
                                       if (var9 == 2) {
                                          var47 = 20;
                                       }
                                    } else {
                                       var47 = 24;
                                    }

                                    if (var2.length() > 0) {
                                       var9 = SizeUtilsKt.getDpToPx(8);
                                    } else {
                                       var9 = SizeUtilsKt.getDpToPx(4);
                                    }

                                    val var189: AbsoluteSizeSpan = new AbsoluteSizeSpan(var9);
                                    var9 = var2.length();
                                    var21.append("\n");
                                    var22 = (Integer)new Object[]{var189}[0];
                                    if (var22 != null) {
                                       var21.setSpan(var22, var9, var2.length(), 33);
                                    }

                                    var9 = var2.length();
                                    changeTextSizeSp(var21, var47, var1, new P(var27, var21));
                                    var var152: Any = new Object[]{var150}[0];
                                    if (var152 != null) {
                                       var21.setSpan(var152, var9, var2.length(), 33);
                                    }

                                    if (var7 == 0) {
                                       var152 = new AbsoluteSizeSpan(SizeUtilsKt.getDpToPx(4));
                                       var47 = var2.length();
                                       var21.append("\n");
                                       var152 = new Object[]{var152}[0];
                                       if (var152 != null) {
                                          var21.setSpan(var152, var47, var2.length(), 33);
                                       }
                                    } else {
                                       var152 = new AbsoluteSizeSpan(0);
                                       var47 = var2.length();
                                       var21.append("\n\u200b");
                                       var152 = new Object[]{var152}[0];
                                       if (var152 != null) {
                                          var21.setSpan(var152, var47, var2.length(), 33);
                                       }
                                    }
                                 }
                              } else {
                                 if (var27 !is LHeadingContentNode) {
                                    if (var27 is BulletListContentNode) {
                                       val var192: java.lang.String = "\n\u200b";
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
                                       val var210: BulletListContentNode = var27 as BulletListContentNode;
                                       val var122: Boolean = (var27 as BulletListContentNode).getOrdered();
                                       val var124: Long;
                                       if (var122) {
                                          val var159: java.lang.Long = var210.getStart();
                                          if (var159 != null) {
                                             var124 = var159;
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
                                             (long)(var210.getItems().size() - 1) + var124,
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

                                       val var234: java.util.Iterator = var210.getItems().iterator();

                                       for (int var57 = 0; var234.hasNext(); var57++) {
                                          var var160: java.util.List = (java.util.List)var234.next();
                                          if (var57 < 0) {
                                             CollectionsKt.u();
                                          }

                                          var160 = var160;
                                          val var259: ArrayList = new ArrayList();
                                          val var116: Int = var160.size();
                                          var var87: Boolean;
                                          if (var57 == var210.getItems().size() - 1) {
                                             var87 = 1;
                                          } else {
                                             var87 = 0;
                                          }

                                          val var269: java.util.Iterator = var160.iterator();

                                          for (int var109 = 0; var269.hasNext(); var109++) {
                                             var160 = (java.util.List)var269.next();
                                             if (var109 < 0) {
                                                CollectionsKt.u();
                                             }

                                             val var275: ContentNode = var160 as ContentNode;
                                             var14 = var160 as ContentNode is BulletListContentNode;
                                             val var113: Boolean;
                                             if (var109 == var116 - 1) {
                                                var113 = true;
                                             } else {
                                                var113 = false;
                                             }

                                             if (!var14) {
                                                var259.add(var275);
                                             }

                                             if (var14 || var113) {
                                                var var163: RenderContext = var20;
                                                if (var122) {
                                                   var var18: Long;
                                                   if (var20.getListOrderedIndex() != null) {
                                                      val var164: java.lang.Long = var20.getListOrderedIndex();
                                                      if (var164 != null) {
                                                         var18 = var164;
                                                      } else {
                                                         var18 = 0L;
                                                      }

                                                      var18++;
                                                   } else {
                                                      var18 = var124;
                                                   }

                                                   var163 = RenderContext.copy$default(
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

                                                var20 = var163;
                                                appendBulletPoint(var2, var259, var163, var122);
                                                if (var1.getSingleLine()) {
                                                   simulateInlineNewline(var2);
                                                }

                                                var259.clear();
                                             }

                                             if (var14) {
                                                appendToExistingBuilder(
                                                   CollectionsKt.e(var275),
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

                                          if (var3 && var87) {
                                             val var166: AbsoluteSizeSpan = new AbsoluteSizeSpan(SizeUtilsKt.getDpToPx(2));
                                             var87 = var2.length();
                                             var2.append(var192);
                                             var160 = (java.util.List)new Object[]{var166}[0];
                                             if (var160 != null) {
                                                var2.setSpan(var160, var87, var2.length(), 33);
                                             }
                                          }
                                       }

                                       var21 = var2;
                                    } else {
                                       val var193: DraweeSpanStringBuilder = var21;
                                       if (var27 is StrongContentNode) {
                                          val var130: GGSansBoldSpan = new GGSansBoldSpan(var1.getContext());
                                          var47 = var2.length();
                                          appendToExistingBuilder((var27 as StrongContentNode).getContent(), var1, var21);
                                          var20 = (RenderContext)new Object[]{var130}[0];
                                          var21 = var21;
                                          if (var20 != null) {
                                             var193.setSpan(var20, var47, var2.length(), 33);
                                             var21 = var193;
                                          }
                                       } else {
                                          var20 = var1;
                                          if (var27 is TextContentNode) {
                                             val var132: java.lang.String = (var27 as TextContentNode).getContent();
                                             var21 = var21;
                                             if (var132 != null) {
                                                var193.append(var132);
                                                var21 = var193;
                                             }
                                          } else if (var27 is TimestampContentNode) {
                                             val var134: ClickableSpan = new ClickableSpan(
                                                null,
                                                ColorUtilsKt.getThemeColor(var26, color.primary_600, color.primary_200, var1.getTheme()),
                                                null,
                                                null,
                                                0.0F,
                                                null,
                                                null,
                                                new Q(var1, var27),
                                                125,
                                                null
                                             );
                                             val var211: BackgroundColorSpan = new BackgroundColorSpan(
                                                ColorUtilsKt.getThemeColor(
                                                   var26, color.background_modifier_accent_light, color.background_modifier_accent_dark, var1.getTheme()
                                                )
                                             );
                                             var7 = var2.length();
                                             var21.append((var27 as TimestampContentNode).getFormatted());
                                             var47 = 0;

                                             while (true) {
                                                var21 = var193;
                                                if (var47 >= 2) {
                                                   break;
                                                }

                                                val var168: Any = new Object[]{var134, var211}[var47];
                                                if (var168 != null) {
                                                   var193.setSpan(var168, var7, var2.length(), 33);
                                                }

                                                var47++;
                                             }
                                          } else if (var27 is UnderlineContentNode) {
                                             val var169: UnderlineSpan = new UnderlineSpan();
                                             var47 = var2.length();
                                             appendToExistingBuilder((var27 as UnderlineContentNode).getContent(), var1, var21);
                                             var20 = (RenderContext)new Object[]{var169}[0];
                                             var21 = var21;
                                             if (var20 != null) {
                                                var193.setSpan(var20, var47, var2.length(), 33);
                                                var21 = var193;
                                             }
                                          } else if (var27 is ChannelNameContentNode) {
                                             var21.append('\u2068');
                                             val var170: ChannelNameContentNode = var27 as ChannelNameContentNode;
                                             if ((var27 as ChannelNameContentNode).getIcon() != null) {
                                                var47 = getIconSize(var170.getIconType(), var1.getBaselineHeightPx());
                                                appendImage$default(
                                                   var2,
                                                   var26,
                                                   var1,
                                                   var170.getIcon(),
                                                   var47,
                                                   var47,
                                                   var9,
                                                   0.0F,
                                                   (float)var47 * getIconPaddingMultiplier(var170.getIconType()),
                                                   64,
                                                   null
                                                );
                                             }

                                             appendToExistingBuilder(var170.getContent(), var1, var21);
                                             var21.append('\u2069');
                                             var21 = var21;
                                          } else {
                                             if (var27 !is GuildNameContentNode) {
                                                if (var27 !is SoundmojiContentNode) {
                                                   if (var27 !is ErrorContentNode) {
                                                      throw new Da.p();
                                                   }

                                                   val var172: CrashReporting = CrashReporting.INSTANCE;
                                                   val var213: java.lang.Throwable = (var27 as ErrorContentNode).getThrowable();
                                                   var6 = 0;
                                                   CrashReporting.captureException$default(var172, var213, false, 2, null);
                                                   var21.append("���");
                                                   var21 = var21;
                                                   break label778;
                                                }

                                                val var212: VerticalPaddingSpan = new VerticalPaddingSpan(SizeUtilsKt.getDpToPx(4));
                                                var28 = new DiscordFontSpan(var1.getContext(), DiscordFont.PrimarySemibold);
                                                val var281: ClickableSpan = new ClickableSpan(
                                                   null, null, null, null, 0.0F, null, null, new S(var1, var27), 127, null
                                                );
                                                val var235: ForegroundColorSpan = new ForegroundColorSpan(ThemeManagerKt.getTheme().getTextNormal());
                                                val var283: BackgroundSpan = new BackgroundSpan(
                                                   new BackgroundStyle(ThemeManagerKt.getTheme().getCardPrimaryBg(), 4, 2),
                                                   new BorderStyle(ThemeManagerKt.getTheme().getBorderStrong(), SizeUtilsKt.getDpToPx(1)),
                                                   new ShadowStyle(Color.argb(63, 0, 0, 0), SizeUtilsKt.getDpToPx(4), new SizeF(0.0F, 4.0F))
                                                );
                                                var21.append(" ");
                                                val var137: T = new T(var21, var27, var26, var1);
                                                if (var1.spoilerExists() && !var1.spoilerIsRevealed()) {
                                                   var47 = var2.length();
                                                   var137.invoke(var21);
                                                   var20 = (RenderContext)new Object[]{var212}[0];
                                                   if (var20 != null) {
                                                      var21.setSpan(var20, var47, var2.length(), 33);
                                                   }
                                                } else {
                                                   var7 = var2.length();
                                                   var137.invoke(var21);

                                                   for (int var64 = 0; var64 < 5; var64++) {
                                                      var20 = (RenderContext)new Object[]{var212, var28, var281, var235, var283}[var64];
                                                      if (var20 != null) {
                                                         var193.setSpan(var20, var7, var2.length(), 33);
                                                      }
                                                   }
                                                }

                                                var193.append(" ");
                                                break label649;
                                             }

                                             var21.append('\u2068');
                                             var47 = getIconSize("_guild", var1.getBaselineHeightPx());
                                             val var171: GuildNameContentNode = var27 as GuildNameContentNode;
                                             if ((var27 as GuildNameContentNode).getIcon() != null) {
                                                appendImage$default(
                                                   var2, var26, var1, var171.getIcon(), var47, var47, null, (float)var47 * 0.2F, (float)var47 * 0.1F, 32, null
                                                );
                                             }

                                             var21.append(var171.getContent());
                                             var21.append('\u2069');
                                             var21 = var21;
                                          }
                                       }
                                    }

                                    var20 = var1;
                                    var6 = 0;
                                    break label778;
                                 }

                                 val var157: DiscordFontSpan = new DiscordFontSpan(var1.getContext(), DiscordFont.PrimaryExtraBold);
                                 if (!var1.getSingleLine()) {
                                    var47 = FontManager.INSTANCE.getScaledSpToPx(16, var1.getContext());
                                    val var4: Float = getBaselineHeightForFontSizePx(var1.getPaint(), var47);
                                    val var227: AbsoluteSizeSpan = new AbsoluteSizeSpan(var47);
                                    val var257: LHeadingContentNode = var27 as LHeadingContentNode;
                                    if (StringsKt.I((var27 as LHeadingContentNode).getClassName(), "added", false, 2, null)) {
                                       var47 = ThemeManagerKt.getTheme().getTextPositive();
                                    } else if (StringsKt.I(var257.getClassName(), "fixed", false, 2, null)) {
                                       var47 = ThemeManagerKt.getTheme().getTextDanger();
                                    } else if (StringsKt.I(var257.getClassName(), "progress", false, 2, null)) {
                                       var47 = ThemeManagerKt.getTheme().getTextWarning();
                                    } else if (StringsKt.I(var257.getClassName(), "improved", false, 2, null)) {
                                       var47 = ThemeManagerKt.getTheme().getTextBrand();
                                    } else {
                                       var47 = ThemeManagerKt.getTheme().getHeaderPrimary();
                                    }

                                    val var191: ForegroundColorSpan = new ForegroundColorSpan(var47);
                                    if (var2.length() > 0) {
                                       var47 = SizeUtilsKt.getDpToPx(8);
                                    } else {
                                       var47 = SizeUtilsKt.getDpToPx(4);
                                    }

                                    val var209: UnderlineSpan = new UnderlineSpan();
                                    var9 = var2.length();
                                    val var266: AbsoluteSizeSpan = new AbsoluteSizeSpan(var47);
                                    var47 = var2.length();
                                    var21.append("\n");
                                    var27 = (ContentNode)new Object[]{var266}[0];
                                    if (var27 != null) {
                                       var21.setSpan(var27, var47, var2.length(), 33);
                                    }

                                    var10 = var2.length();
                                    val var258: java.util.List = var257.getContent();
                                    var47 = var9;
                                    val var268: RenderContext = RenderContext.copy$default(
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
                                    appendToExistingBuilder(var258, var268, var2);
                                    var24 = (RelativeSizeSpan)new Object[]{var227}[0];
                                    if (var24 != null) {
                                       var2.setSpan(var24, var10, var2.length(), 33);
                                    }

                                    if (var7 == 0) {
                                       val var229: AbsoluteSizeSpan = new AbsoluteSizeSpan(SizeUtilsKt.getDpToPx(4));
                                       var7 = var2.length();
                                       var2.append("\n");
                                       var24 = (RelativeSizeSpan)new Object[]{var229}[0];
                                       if (var24 != null) {
                                          var2.setSpan(var24, var7, var2.length(), 33);
                                       }
                                    } else {
                                       val var231: AbsoluteSizeSpan = new AbsoluteSizeSpan(0);
                                       var7 = var2.length();
                                       var2.append("\n\u200b");
                                       var24 = (RelativeSizeSpan)new Object[]{var231}[0];
                                       if (var24 != null) {
                                          var2.setSpan(var24, var7, var2.length(), 33);
                                       }
                                    }

                                    for (int var86 = 0; var86 < 3; var86++) {
                                       var24 = (RelativeSizeSpan)new Object[]{var157, var191, var209}[var86];
                                       if (var24 != null) {
                                          var126.setSpan(var24, var47, var2.length(), 33);
                                       }
                                    }
                                 } else {
                                    var47 = var2.length();
                                    appendToExistingBuilder((var27 as LHeadingContentNode).getContent(), var1, var21);
                                    simulateInlineNewline(var2);
                                    val var158: Any = new Object[]{var157}[0];
                                    if (var158 != null) {
                                       var21.setSpan(var158, var47, var2.length(), 33);
                                    }
                                 }
                              }
                           }

                           var6 = 0;
                           var21 = var126;
                           var20 = var1;
                           break label778;
                        } else {
                           appendToExistingBuilder((var27 as ParagraphContentNode).getContent(), var1, var21);
                           if (var7 == 0) {
                              var21.append("\n\n");
                           }
                        }
                     }

                     var20 = var1;
                     var6 = 0;
                     break label778;
                  }
               }

               var20 = var1;
               var21 = var2;
            }

            var6 = 0;
         }
      }

      var8++;
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
   val var3: Boolean;
   if ((var0 as LinkContentNode).isUrl()) {
      var1.getOnLongTapLink().invoke(var0);
      var3 = true;
   } else {
      var3 = false;
   }

   return var3;
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

      RenderableEmojiKt.renderEmojiInto$default(var0, var6, var2, getIconSize("_emoji", var5 * 0.8F), false, 0, new l(var3), 32, null);
      var0.append(" ");
   }

   val var8: java.lang.String = var7.getContent();
   val var9: java.lang.String;
   if (var8 != null) {
      var9 = StringsKt.C(var8, " ", " ", false, 4, null);
   } else {
      var9 = null;
   }

   var0.append(var9);
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

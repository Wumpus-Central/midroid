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
   val var6: Int = SizeUtilsKt.getDpToPx(8);
   val var7: Int = var2.getListNestedLevel();
   val var15: Standard = new Standard(SizeUtilsKt.getDpToPx(var7 * 16));
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
         val var24: OrderedListBulletSpan = new OrderedListBulletSpan(var9, var6, var11, var2.getPaint());
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

      appendToExistingBuilder(CollectionsKt.e(new TextContentNode(var25)), var2, var0);
      appendToExistingBuilder(var1, var2, var0);
   } else {
      val var8: Int = SizeUtilsKt.getDpToPx(2);
      var var20: Int = ColorUtilsKt.getThemeColor(var2.getContext(), R.color.primary_360, R.color.primary_400, var2.getTheme());
      val var26: Style;
      if (var7 > 0) {
         var26 = Style.STROKE;
      } else {
         var26 = Style.FILL;
      }

      val var27: BulletSpan = new BulletSpan(var20, var6, false, var8, 0.0F, var26, 20, null);
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
   val var9: Int = var0.length();
   var0.append('\u200b');
   val var13: com.facebook.drawee.controller.a = (G2.d.g().F(ImageRequestBuilder.x(Uri.parse(ReactAssetUtilsKt.getReactImageUrl(var1, var3))).a()) as PipelineDraweeControllerBuilder)
      .d();
   val var11: GenericDraweeHierarchyBuilder = GenericDraweeHierarchyBuilder.u(var1.getResources()).w(ScaleType.e);
   val var10: com.facebook.drawee.generic.a = com.facebook.drawee.generic.a.c(var7);
   var10.t(var8);
   var10.w(com.facebook.drawee.generic.a.a.e);
   var11.K(var10);
   if (var2.spoilerIsHidden()) {
      var11.v(new PorterDuffColorFilter(var2.getTheme().getSpoilerHiddenBackground(), Mode.SRC_IN));
   } else if (var6 != null) {
      var11.v(new PorterDuffColorFilter(var6, Mode.SRC_IN));
   }

   var0.j(var1, var11.a(), var13, var9, var4, var5, false, 2);
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
   val var3: Float = var0.getTextSize();
   var0.setTextSize((float)var1);
   val var4: FontMetrics = var0.getFontMetrics();
   val var2: Float = getBaselineHeightPx(var4);
   var0.setTextSize(var3);
   return var2;
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
         CollectionsKt.u();
      }

      var var28: ContentNode = var23 as ContentNode;
      var var9: Byte;
      if (var8 == CollectionsKt.m(var0)) {
         var9 = var6;
      } else {
         var9 = var7;
      }

      var var27: Context = var1.getContext();
      var var24: BackgroundColorSpan = new BackgroundColorSpan(var1.getTheme().getBackgroundSecondary());
      var var25: RelativeSizeSpan = new RelativeSizeSpan(0.85F);
      val var29: DiscordFontSpan = new DiscordFontSpan(var27, DiscordFont.CodeNormal);
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

         var7 = (byte)var6;
         var6 = (byte)var7;
      } else {
         label754: {
            label710: {
               if (var28 is CodeBlockContentNode) {
                  if (var1.getSingleLine()) {
                     var9 = var2.length();
                     var22.append(StringsKt.B((var28 as CodeBlockContentNode).getContent(), '\n', ' ', false, 4, null));

                     for (int var74 = 0; var74 < 3; var74 += var6) {
                        var23 = new Object[]{var24, var25, var29}[var74];
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
                        break label754;
                     }

                     var var19: Boolean = var28 is InlineCodeContentNode;
                     var23 = null;
                     if (var19) {
                        if (!var1.getInLink()) {
                           var23 = new ClickableSpan(null, -1, null, null, 0.0F, null, null, new m(var21, var28), 125, null);
                        }

                        val var272: ForegroundColorSpan = new ForegroundColorSpan(var1.getTheme().getTextNormal());
                        var7 = var2.length();
                        var22.append((var28 as InlineCodeContentNode).getContent());

                        for (int var73 = 0; var73 < 5; var73++) {
                           var28 = (ContentNode)new Object[]{var23, var24, var25, var29, var272}[var73];
                           if (var28 != null) {
                              var22.setSpan(var28, var7, var2.length(), 33);
                           }
                        }

                        var6 = (byte)0;
                        var7 = (byte)1;
                        break label754;
                     }

                     if (var28 !is LineBreakContentNode && var28 !is NewLineContentNode) {
                        if (var28 is LinkContentNode) {
                           val var289: LinkStyle = var1.getLinkStyle().invoke(var28) as LinkStyle;
                           val var287: LinkContentNode = var28 as LinkContentNode;
                           var23 = (var28 as LinkContentNode).getLinkColor();
                           if (var23 != null) {
                              var6 = var23;
                           } else {
                              var6 = var289.getLinkColor();
                           }

                           val var128: Boolean = var287.getShouldShowRoleDot() == java.lang.Boolean.TRUE;
                           val var250: RoleColors = RoleColorsKt.toAndroidColors(var287.getRoleColors());
                           val var225: RoleColors;
                           if (var128) {
                              var225 = null;
                           } else {
                              var225 = var250;
                           }

                           if (var225 != null) {
                              var7 = var225.getPrimaryColor();
                           } else {
                              var7 = var6;
                           }

                           if (var225 != null) {
                              var23 = var225.getSecondaryColor();
                           } else {
                              var23 = null;
                           }

                           val var226: Int;
                           if (var225 != null) {
                              var226 = var225.getTertiaryColor();
                           } else {
                              var226 = null;
                           }

                           val var207: ClickableSpan = new ClickableSpan(
                              null, var7, var23, var226, 150.0F, var1.getShowLinkDecorations(), new n(var28, var21), new o(var21, var28), 1, null
                           );
                           val var227: LinkBackgroundStyle = var289.getBackgroundStyle();
                           val var146: BackgroundSpan;
                           if (var227 != null) {
                              val var144: Int = var227.getColor();
                              if (var144 != null) {
                                 var7 = var144;
                              } else {
                                 var7 = 0;
                              }

                              val var145: Int = var227.getBorderRadius();
                              if (var145 != null) {
                                 var9 = var145;
                              } else {
                                 var9 = 0;
                              }

                              var146 = new BackgroundSpan(new BackgroundStyle(var7, var9, 0, 4, null), null, null, 6, null);
                              val var228: java.lang.Boolean = var227.getSpaceAround();
                              if (var228 != null) {
                                 var19 = var228;
                              } else {
                                 var19 = false;
                              }
                           } else {
                              var146 = null;
                              var19 = false;
                           }

                           val var230: DiscordFontSpan = new DiscordFontSpan(var1.getContext(), var289.getFont());
                           var7 = var2.length();
                           maybeAddRoleDot(var2, var128, var1.getSingleLine(), var27, var10, var6, var250);
                           if (var19) {
                              var22.append(' ');
                           }

                           var6 = getIconSize(null, var1.getBaselineHeightPx());
                           val var251: ReactAsset = var289.getIcon();
                           if (var251 != null) {
                              appendImage$default(var2, var27, var1, var251.getUri(var27), var6, var6, var289.getLinkColor(), 0.0F, 0.0F, 192, null);
                              var22.append(' ');
                           }

                           var6 = var7;
                           appendToExistingBuilder(
                              var287.getContent(),
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
                           if (var19) {
                              var2.append(' ');
                           }

                           for (int var96 = 0; var96 < 3; var96++) {
                              val var183: Any = new Object[]{var207, var230, var146}[var96];
                              if (var183 != null) {
                                 var2.setSpan(var183, var6, var2.length(), 33);
                              }
                           }
                        } else {
                           label755: {
                              var var129: DraweeSpanStringBuilder = var22;
                              if (var28 is MentionContentNode) {
                                 val var188: DiscordFontSpan = new DiscordFontSpan(var1.getContext(), DiscordFont.PrimarySemibold);
                                 val var147: MentionContentNode = var28 as MentionContentNode;
                                 if (var28 as MentionContentNode is UserOrRoleMentionContentNode) {
                                    val var218: ClickableSpan = new ClickableSpan(null, -1, null, null, 0.0F, null, null, new p(var1, var28), 125, null);
                                    val var275: UserOrRoleMentionContentNode = var28 as UserOrRoleMentionContentNode;
                                    val var118: Int = (var28 as UserOrRoleMentionContentNode).getRoleColor();
                                    val var284: RoleColors = RoleColorsKt.toAndroidColors((var28 as UserOrRoleMentionContentNode).getRoleColors());
                                    if (var1.getShouldShowRoleDot() && var118 > 0) {
                                       var19 = true;
                                    } else {
                                       var19 = false;
                                    }

                                    val var103: Boolean;
                                    if (var1.getShouldShowRoleOnName() && var118 > 0) {
                                       var103 = true;
                                    } else {
                                       var103 = false;
                                    }

                                    val var154: UserId = var275.getUserId-wUX8bhU();
                                    val var15: Long = UserId.constructor-impl(1081004946872352958L);
                                    val var20: Boolean;
                                    if (var154 == null) {
                                       var20 = false;
                                    } else {
                                       var20 = UserId.equals-impl0(var154.unbox-impl(), var15);
                                    }

                                    if (var20) {
                                       var6 = var14;
                                    } else if (var103) {
                                       if (var284 != null) {
                                          var6 = var284.getPrimaryColor();
                                       } else {
                                          var6 = var118;
                                       }

                                       var6 = y.c.k(var6, 25);
                                    } else {
                                       var6 = var10;
                                    }

                                    label727: {
                                       var239 = makeMentionBackgroundSpan(var1, var6);
                                       if (var103 && !var20) {
                                          val var155: Int;
                                          if (var284 != null) {
                                             var155 = var284.getSecondaryColor();
                                          } else {
                                             var155 = null;
                                          }

                                          if (var155 != null) {
                                             val var157: java.util.List = CollectionsKt.q(new Integer[]{var284.getPrimaryColor(), var284.getSecondaryColor()});
                                             if (var284.getTertiaryColor() != null) {
                                                var157.add(var284.getTertiaryColor());
                                             }

                                             var156 = new EnhancedRoleColorsSpan(CollectionsKt.S0(var157));
                                             break label727;
                                          }
                                       }

                                       if (var20) {
                                          var7 = var13;
                                       } else {
                                          var7 = var11;
                                          if (var103) {
                                             var7 = y.c.k(var118, 255);
                                          }
                                       }

                                       var156 = new ForegroundColorSpan(var7);
                                    }

                                    var7 = var2.length();
                                    maybeAddRoleDot(var2, var19, var1.getSingleLine(), var27, var6, var118, var284);
                                    var22.append(toSpannable$default(var275.getContent(), var1, null, false, 6, null));

                                    for (int var46 = 0; var46 < 4; var46++) {
                                       var27 = (Context)new Object[]{var188, var218, var239, var156}[var46];
                                       if (var27 != null) {
                                          var129.setSpan(var27, var7, var2.length(), 33);
                                       }
                                    }
                                 } else if (var147 is ChannelMentionContentNode) {
                                    val var217: ClickableSpan = new ClickableSpan(
                                       null, -1, null, null, 0.0F, null, new q(var1, var28), new r(var1, var28), 61, null
                                    );
                                    val var153: BackgroundSpan = makeMentionBackgroundSpan(var1, var10);
                                    val var238: ForegroundColorSpan = new ForegroundColorSpan(var11);
                                    var7 = var2.length();
                                    val var274: ChannelMentionContentNode = var28 as ChannelMentionContentNode;
                                    val var283: java.util.List = (var28 as ChannelMentionContentNode).getInContent();
                                    if (var283 != null) {
                                       appendToExistingBuilder(var283, var1, var22);
                                       var6 = getIconSize("_caret", var1.getBaselineHeightPx());
                                       appendImage$default(
                                          var2, var27, var1, ReactAsset.Caret.getUri(var27), var6, var6, var238.getForegroundColor(), 0.0F, 0.0F, 192, null
                                       );
                                    }

                                    val var263: java.util.List = var274.getContent();
                                    if (var263 != null) {
                                       appendToExistingBuilder(var263, var1, var22);
                                    }

                                    for (int var43 = 0; var43 < 4; var43++) {
                                       var27 = (Context)new Object[]{var188, var217, var153, var238}[var43];
                                       if (var27 != null) {
                                          var129.setSpan(var27, var7, var2.length(), 33);
                                       }
                                    }
                                 } else if (var147 is AttachmentLinkContentNode) {
                                    val var152: ClickableSpan = new ClickableSpan(
                                       null, -1, null, null, 0.0F, null, new s(var1, var28), new t(var1, var28), 61, null
                                    );
                                    val var216: BackgroundSpan = makeMentionBackgroundSpan(var1, var10);
                                    val var237: ForegroundColorSpan = new ForegroundColorSpan(var11);
                                    var6 = var2.length();
                                    var9 = getIconSize(null, var1.getBaselineHeightPx());
                                    appendImage$default(
                                       var2, var27, var1, ReactAsset.Attachment.getUri(var27), var9, var9, var237.getForegroundColor(), 0.0F, 0.0F, 192, null
                                    );
                                    var22.append(' ');
                                    val var259: java.util.List = (var28 as AttachmentLinkContentNode).getContent();
                                    if (var259 != null) {
                                       appendToExistingBuilder(var259, var1, var22);
                                    }

                                    for (int var80 = 0; var80 < 4; var80++) {
                                       var27 = (Context)new Object[]{var188, var152, var216, var237}[var80];
                                       if (var27 != null) {
                                          var129.setSpan(var27, var6, var2.length(), 33);
                                       }
                                    }
                                 } else if (var147 is StaticChannelMentionContentNode) {
                                    val var236: ClickableSpan = new ClickableSpan(null, -1, null, null, 0.0F, null, null, new u(var1, var28), 125, null);
                                    val var215: BackgroundSpan = makeMentionBackgroundSpan(var1, var10);
                                    val var151: ForegroundColorSpan = new ForegroundColorSpan(var11);
                                    var6 = getIconSize(null, var1.getBaselineHeightPx());
                                    var7 = var2.length();
                                    val var273: StaticChannelMentionContentNode = var28 as StaticChannelMentionContentNode;
                                    var9 = TextUtilsKt.WhenMappings.$EnumSwitchMapping$0[(var28 as StaticChannelMentionContentNode).getId().ordinal()];
                                    if (var9 == 1 || var9 == 2) {
                                       appendImage$default(
                                          var2, var27, var1, ReactAsset.Home.getUri(var27), var6, var6, var151.getForegroundColor(), 0.0F, 0.0F, 192, null
                                       );
                                    } else if (var9 != 3) {
                                       if (var9 != 4) {
                                          if (var9 != 5) {
                                             var22.append("#");
                                          } else {
                                             appendImage$default(
                                                var2,
                                                var27,
                                                var1,
                                                ReactAsset.Link.getUri(var27),
                                                var6,
                                                var6,
                                                var151.getForegroundColor(),
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
                                             var6,
                                             var6,
                                             var151.getForegroundColor(),
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
                                          var6,
                                          var6,
                                          var151.getForegroundColor(),
                                          0.0F,
                                          0.0F,
                                          192,
                                          null
                                       );
                                    }

                                    var22.append(toSpannable$default(var273.getContent(), var1, null, false, 6, null));

                                    for (int var40 = 0; var40 < 4; var40++) {
                                       var27 = (Context)new Object[]{var188, var236, var215, var151}[var40];
                                       if (var27 != null) {
                                          var129.setSpan(var27, var7, var2.length(), 33);
                                       }
                                    }
                                 } else if (var147 !is CommandMentionContentNode) {
                                    if (var147 !is GameMentionContentNode) {
                                       throw new A9.n();
                                    }

                                    val var150: BackgroundSpan = makeMentionBackgroundSpan(var1, var10);
                                    val var214: ForegroundColorSpan = new ForegroundColorSpan(var11);
                                    var7 = var2.length();
                                    var6 = getIconSize(null, var1.getBaselineHeightPx());
                                    val var232: GameMentionContentNode = var28 as GameMentionContentNode;
                                    if ((var28 as GameMentionContentNode).getIcon() != null) {
                                       var22.append(' ');
                                       appendImage$default(var2, var27, var1, var232.getIcon(), var6, var6, null, 0.0F, 0.0F, 224, null);
                                       var22.append(' ');
                                    }

                                    val var233: java.util.List = var232.getContent();
                                    if (var233 != null) {
                                       appendToExistingBuilder(var233, var1, var22);
                                    }

                                    for (int var38 = 0; var38 < 3; var38++) {
                                       var25 = (RelativeSizeSpan)new Object[]{var188, var150, var214}[var38];
                                       if (var25 != null) {
                                          var129.setSpan(var25, var7, var2.length(), 33);
                                       }
                                    }
                                 } else {
                                    val var189: BackgroundSpan = makeMentionBackgroundSpan(var1, var10);
                                    val var231: ForegroundColorSpan = new ForegroundColorSpan(var11);
                                    val var213: ClickableSpan = new ClickableSpan(
                                       null, -1, null, null, 0.0F, null, new H(var1, var28), new M(var1, var28), 61, null
                                    );
                                    val var148: GGSansBoldSpan = new GGSansBoldSpan(var1.getContext());
                                    var9 = var2.length();
                                    var7 = var2.length();
                                    var22.append("/");
                                    var22.append(toSpannable$default((var28 as CommandMentionContentNode).getContent(), var1, null, false, 6, null));

                                    for (int var36 = 0; var36 < 3; var36++) {
                                       var27 = (Context)new Object[]{var213, var189, var231}[var36];
                                       if (var27 != null) {
                                          var129.setSpan(var27, var7, var2.length(), 33);
                                       }
                                    }

                                    val var149: Any = new Object[]{var148}[0];
                                    if (var149 != null) {
                                       var129.setSpan(var149, var9, var2.length(), 33);
                                    }
                                 }

                                 ForceExhaustiveKt.forceExhaustive(var2);
                              } else {
                                 if (var28 !is ParagraphContentNode) {
                                    if (var28 !is SpoilerContentNode) {
                                       if (var28 is StrikethroughContentNode) {
                                          val var161: StrikethroughSpan = new StrikethroughSpan();
                                          var6 = var2.length();
                                          appendToExistingBuilder((var28 as StrikethroughContentNode).getContent(), var1, var22);
                                          val var162: Any = new Object[]{var161}[0];
                                          if (var162 != null) {
                                             var22.setSpan(var162, var6, var2.length(), 33);
                                          }
                                       } else if (var28 is SubtextContentNode) {
                                          if (var1.getSingleLine()) {
                                             appendToExistingBuilder((var28 as SubtextContentNode).getContent(), var1, var22);
                                             if (var9 == 0) {
                                                simulateInlineNewline(var2);
                                             }
                                          } else {
                                             val var50: Byte;
                                             if (FontManager.INSTANCE.getIsClassicChatFontScaleEnabled(var27)) {
                                                var50 = 13;
                                             } else {
                                                var50 = 14;
                                             }

                                             changeTextSizeSp(
                                                var22, var50, var1, new O(var22, new ForegroundColorSpan(var1.getTheme().getTextMuted()), var28, (boolean)var9)
                                             );
                                          }
                                       } else {
                                          var19 = var28 is HeadingContentNode;
                                          var var51: Int = 16;
                                          if (var19) {
                                             val var164: DiscordFontSpan = new DiscordFontSpan(var1.getContext(), DiscordFont.PrimaryExtraBold);
                                             if (var1.getSingleLine()) {
                                                var51 = var2.length();
                                                appendToExistingBuilder((var28 as HeadingContentNode).getContent(), var1, var22);
                                                simulateInlineNewline(var2);
                                                val var165: Any = new Object[]{var164}[0];
                                                if (var165 != null) {
                                                   var22.setSpan(var165, var51, var2.length(), 33);
                                                }
                                             } else {
                                                var7 = (var28 as HeadingContentNode).getLevel();
                                                if (var7 != 1) {
                                                   if (var7 == 2) {
                                                      var51 = 20;
                                                   }
                                                } else {
                                                   var51 = 24;
                                                }

                                                if (var2.length() > 0) {
                                                   var7 = SizeUtilsKt.getDpToPx(8);
                                                } else {
                                                   var7 = SizeUtilsKt.getDpToPx(4);
                                                }

                                                val var193: AbsoluteSizeSpan = new AbsoluteSizeSpan(var7);
                                                var7 = var2.length();
                                                var22.append("\n");
                                                var23 = (Integer)new Object[]{var193}[0];
                                                if (var23 != null) {
                                                   var22.setSpan(var23, var7, var2.length(), 33);
                                                }

                                                var7 = var2.length();
                                                changeTextSizeSp(var22, var51, var1, new P(var28, var22));
                                                var var166: Any = new Object[]{var164}[0];
                                                if (var166 != null) {
                                                   var22.setSpan(var166, var7, var2.length(), 33);
                                                }

                                                if (var9 == 0) {
                                                   var166 = new AbsoluteSizeSpan(SizeUtilsKt.getDpToPx(4));
                                                   var51 = var2.length();
                                                   var22.append("\n");
                                                   var166 = new Object[]{var166}[0];
                                                   if (var166 != null) {
                                                      var22.setSpan(var166, var51, var2.length(), 33);
                                                   }
                                                } else {
                                                   var166 = new AbsoluteSizeSpan(0);
                                                   var51 = var2.length();
                                                   var22.append("\n\u200b");
                                                   var166 = new Object[]{var166}[0];
                                                   if (var166 != null) {
                                                      var22.setSpan(var166, var51, var2.length(), 33);
                                                   }
                                                }
                                             }
                                          } else {
                                             if (var28 !is LHeadingContentNode) {
                                                var7 = (byte)1;
                                                var var197: DraweeSpanStringBuilder;
                                                if (var28 is BulletListContentNode) {
                                                   val var196: java.lang.String = "\n\u200b";
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
                                                   val var221: BulletListContentNode = var28 as BulletListContentNode;
                                                   var19 = (var28 as BulletListContentNode).getOrdered();
                                                   val var120: Long;
                                                   if (var19) {
                                                      val var173: java.lang.Long = var221.getStart();
                                                      if (var173 != null) {
                                                         var120 = var173;
                                                      } else {
                                                         var120 = 1L;
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
                                                         (long)(var221.getItems().size() - 1) + var120,
                                                         false,
                                                         null,
                                                         null,
                                                         0.0F,
                                                         null,
                                                         -67108865,
                                                         null
                                                      );
                                                   } else {
                                                      var120 = 0L;
                                                   }

                                                   val var248: java.util.Iterator = var221.getItems().iterator();

                                                   for (int var61 = 0; var248.hasNext(); var61++) {
                                                      var var174: java.util.List = (java.util.List)var248.next();
                                                      if (var61 < 0) {
                                                         CollectionsKt.u();
                                                      }

                                                      var174 = var174;
                                                      val var269: ArrayList = new ArrayList();
                                                      val var119: Int = var174.size();
                                                      var var104: Byte;
                                                      if (var61 == var221.getItems().size() - 1) {
                                                         var104 = var7;
                                                      } else {
                                                         var104 = 0;
                                                      }

                                                      val var279: java.util.Iterator = var174.iterator();

                                                      for (int var114 = 0; var279.hasNext(); var114++) {
                                                         var174 = (java.util.List)var279.next();
                                                         if (var114 < 0) {
                                                            CollectionsKt.u();
                                                         }

                                                         val var285: ContentNode = var174 as ContentNode;
                                                         val var127: Boolean = var174 as ContentNode is BulletListContentNode;
                                                         val var116: Byte;
                                                         if (var114 == var119 - 1) {
                                                            var116 = var7;
                                                         } else {
                                                            var116 = 0;
                                                         }

                                                         if (!var127) {
                                                            var269.add(var285);
                                                         }

                                                         if (var127 || var116 != 0) {
                                                            var var177: RenderContext = var21;
                                                            if (var19) {
                                                               var var17: Long;
                                                               if (var21.getListOrderedIndex() != null) {
                                                                  val var178: java.lang.Long = var21.getListOrderedIndex();
                                                                  if (var178 != null) {
                                                                     var17 = var178;
                                                                  } else {
                                                                     var17 = 0L;
                                                                  }

                                                                  var17++;
                                                               } else {
                                                                  var17 = var120;
                                                               }

                                                               var177 = RenderContext.copy$default(
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

                                                            var21 = var177;
                                                            appendBulletPoint(var2, var269, var177, var19);
                                                            if (var1.getSingleLine()) {
                                                               simulateInlineNewline(var2);
                                                            }

                                                            var269.clear();
                                                         }

                                                         if (var127) {
                                                            appendToExistingBuilder(
                                                               CollectionsKt.e(var285),
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

                                                      if (var3 && var104 != 0) {
                                                         val var180: AbsoluteSizeSpan = new AbsoluteSizeSpan(SizeUtilsKt.getDpToPx(2));
                                                         var104 = var2.length();
                                                         var2.append(var196);
                                                         var174 = (java.util.List)new Object[]{var180}[0];
                                                         if (var174 != null) {
                                                            var2.setSpan(var174, var104, var2.length(), 33);
                                                         }
                                                      }
                                                   }

                                                   var197 = var2;
                                                } else {
                                                   var22 = var22;
                                                   if (var28 is StrongContentNode) {
                                                      val var136: GGSansBoldSpan = new GGSansBoldSpan(var1.getContext());
                                                      var51 = var2.length();
                                                      appendToExistingBuilder((var28 as StrongContentNode).getContent(), var1, var22);
                                                      var21 = (RenderContext)new Object[]{var136}[0];
                                                      var197 = var22;
                                                      if (var21 != null) {
                                                         var22.setSpan(var21, var51, var2.length(), 33);
                                                         var197 = var22;
                                                      }
                                                   } else {
                                                      var21 = var1;
                                                      if (var28 is TextContentNode) {
                                                         val var138: java.lang.String = (var28 as TextContentNode).getContent();
                                                         var197 = var22;
                                                         if (var138 != null) {
                                                            var22.append(var138);
                                                            var197 = var22;
                                                         }
                                                      } else if (var28 is TimestampContentNode) {
                                                         val var140: ClickableSpan = new ClickableSpan(
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
                                                         var51 = 0;

                                                         while (true) {
                                                            var197 = var22;
                                                            if (var51 >= 2) {
                                                               break;
                                                            }

                                                            var23 = (Integer)new Object[]{var140, var24}[var51];
                                                            if (var23 != null) {
                                                               var22.setSpan(var23, var9, var2.length(), 33);
                                                            }

                                                            var51++;
                                                         }
                                                      } else if (var28 is UnderlineContentNode) {
                                                         val var199: UnderlineSpan = new UnderlineSpan();
                                                         var51 = var2.length();
                                                         appendToExistingBuilder((var28 as UnderlineContentNode).getContent(), var1, var22);
                                                         var21 = (RenderContext)new Object[]{var199}[0];
                                                         var197 = var22;
                                                         if (var21 != null) {
                                                            var22.setSpan(var21, var51, var2.length(), 33);
                                                            var197 = var22;
                                                         }
                                                      } else if (var28 is ChannelNameContentNode) {
                                                         val var200: ChannelNameContentNode = var28 as ChannelNameContentNode;
                                                         if ((var28 as ChannelNameContentNode).getIcon() != null) {
                                                            var51 = getIconSize(var200.getIconType(), var1.getBaselineHeightPx());
                                                            appendImage$default(
                                                               var2,
                                                               var27,
                                                               var1,
                                                               var200.getIcon(),
                                                               var51,
                                                               var51,
                                                               var11,
                                                               0.0F,
                                                               (float)var51 * getIconPaddingMultiplier(var200.getIconType()),
                                                               64,
                                                               null
                                                            );
                                                         }

                                                         appendToExistingBuilder(var200.getContent(), var1, var22);
                                                         var197 = var22;
                                                      } else {
                                                         if (var28 !is GuildNameContentNode) {
                                                            if (var28 !is SoundmojiContentNode) {
                                                               if (var28 !is ErrorContentNode) {
                                                                  throw new A9.n();
                                                               }

                                                               val var204: CrashReporting = CrashReporting.INSTANCE;
                                                               val var224: java.lang.Throwable = (var28 as ErrorContentNode).getThrowable();
                                                               var6 = (byte)0;
                                                               CrashReporting.captureException$default(var204, var224, false, 2, null);
                                                               var22.append("���");
                                                               break label754;
                                                            }

                                                            val var249: VerticalPaddingSpan = new VerticalPaddingSpan(SizeUtilsKt.getDpToPx(4));
                                                            val var202: DiscordFontSpan = new DiscordFontSpan(var1.getContext(), DiscordFont.PrimarySemibold);
                                                            val var286: ClickableSpan = new ClickableSpan(
                                                               null, null, null, null, 0.0F, null, null, new S(var1, var28), 127, null
                                                            );
                                                            val var223: ForegroundColorSpan = new ForegroundColorSpan(ThemeManagerKt.getTheme().getTextNormal());
                                                            val var288: BackgroundSpan = new BackgroundSpan(
                                                               new BackgroundStyle(ThemeManagerKt.getTheme().getCardPrimaryBg(), 4, 2),
                                                               new BorderStyle(ThemeManagerKt.getTheme().getBorderStrong(), SizeUtilsKt.getDpToPx(1)),
                                                               new ShadowStyle(Color.argb(63, 0, 0, 0), SizeUtilsKt.getDpToPx(4), new SizeF(0.0F, 4.0F))
                                                            );
                                                            var22.append(" ");
                                                            val var270: T = new T(var22, var28, var27, var1);
                                                            if (var1.spoilerExists() && !var1.spoilerIsRevealed()) {
                                                               var51 = var2.length();
                                                               var270.invoke(var22);
                                                               var23 = (Integer)new Object[]{var249}[0];
                                                               if (var23 != null) {
                                                                  var22.setSpan(var23, var51, var2.length(), 33);
                                                               }
                                                            } else {
                                                               var9 = var2.length();
                                                               var270.invoke(var22);

                                                               for (int var68 = 0; var68 < 5; var68++) {
                                                                  var27 = (Context)new Object[]{var249, var202, var286, var223, var288}[var68];
                                                                  if (var27 != null) {
                                                                     var22.setSpan(var27, var9, var2.length(), 33);
                                                                  }
                                                               }
                                                            }

                                                            var22.append(" ");
                                                            break label710;
                                                         }

                                                         var51 = getIconSize("_guild", var1.getBaselineHeightPx());
                                                         val var143: GuildNameContentNode = var28 as GuildNameContentNode;
                                                         if ((var28 as GuildNameContentNode).getIcon() != null) {
                                                            appendImage$default(
                                                               var2,
                                                               var27,
                                                               var1,
                                                               var143.getIcon(),
                                                               var51,
                                                               var51,
                                                               null,
                                                               (float)var51 * 0.2F,
                                                               (float)var51 * 0.1F,
                                                               32,
                                                               null
                                                            );
                                                         }

                                                         var22.append(var143.getContent());
                                                         var197 = var22;
                                                      }
                                                   }
                                                }

                                                var21 = var1;
                                                var6 = (byte)0;
                                                var22 = var197;
                                                break label754;
                                             }

                                             val var171: DiscordFontSpan = new DiscordFontSpan(var1.getContext(), DiscordFont.PrimaryExtraBold);
                                             if (!var1.getSingleLine()) {
                                                var51 = FontManager.INSTANCE.getScaledSpToPx(16, var1.getContext());
                                                val var4: Float = getBaselineHeightForFontSizePx(var1.getPaint(), var51);
                                                val var241: AbsoluteSizeSpan = new AbsoluteSizeSpan(var51);
                                                val var267: LHeadingContentNode = var28 as LHeadingContentNode;
                                                if (StringsKt.I((var28 as LHeadingContentNode).getClassName(), "added", false, 2, null)) {
                                                   var51 = ThemeManagerKt.getTheme().getTextPositive();
                                                } else if (StringsKt.I(var267.getClassName(), "fixed", false, 2, null)) {
                                                   var51 = ThemeManagerKt.getTheme().getTextDanger();
                                                } else if (StringsKt.I(var267.getClassName(), "progress", false, 2, null)) {
                                                   var51 = ThemeManagerKt.getTheme().getTextWarning();
                                                } else if (StringsKt.I(var267.getClassName(), "improved", false, 2, null)) {
                                                   var51 = ThemeManagerKt.getTheme().getTextBrand();
                                                } else {
                                                   var51 = ThemeManagerKt.getTheme().getHeaderPrimary();
                                                }

                                                val var220: ForegroundColorSpan = new ForegroundColorSpan(var51);
                                                if (var2.length() > 0) {
                                                   var51 = SizeUtilsKt.getDpToPx(8);
                                                } else {
                                                   var51 = SizeUtilsKt.getDpToPx(4);
                                                }

                                                val var195: UnderlineSpan = new UnderlineSpan();
                                                var7 = var2.length();
                                                val var276: AbsoluteSizeSpan = new AbsoluteSizeSpan(var51);
                                                var51 = var2.length();
                                                var22.append("\n");
                                                var28 = (ContentNode)new Object[]{var276}[0];
                                                if (var28 != null) {
                                                   var22.setSpan(var28, var51, var2.length(), 33);
                                                }

                                                var10 = var2.length();
                                                val var268: java.util.List = var267.getContent();
                                                var51 = var7;
                                                val var278: RenderContext = RenderContext.copy$default(
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
                                                var129 = var2;
                                                appendToExistingBuilder(var268, var278, var2);
                                                var25 = (RelativeSizeSpan)new Object[]{var241}[0];
                                                if (var25 != null) {
                                                   var2.setSpan(var25, var10, var2.length(), 33);
                                                }

                                                if (var9 == 0) {
                                                   val var243: AbsoluteSizeSpan = new AbsoluteSizeSpan(SizeUtilsKt.getDpToPx(4));
                                                   var7 = var2.length();
                                                   var2.append("\n");
                                                   var25 = (RelativeSizeSpan)new Object[]{var243}[0];
                                                   if (var25 != null) {
                                                      var2.setSpan(var25, var7, var2.length(), 33);
                                                   }
                                                } else {
                                                   val var245: AbsoluteSizeSpan = new AbsoluteSizeSpan(0);
                                                   var7 = var2.length();
                                                   var2.append("\n\u200b");
                                                   var25 = (RelativeSizeSpan)new Object[]{var245}[0];
                                                   if (var25 != null) {
                                                      var2.setSpan(var25, var7, var2.length(), 33);
                                                   }
                                                }

                                                for (int var92 = 0; var92 < 3; var92++) {
                                                   var25 = (RelativeSizeSpan)new Object[]{var171, var220, var195}[var92];
                                                   if (var25 != null) {
                                                      var129.setSpan(var25, var51, var2.length(), 33);
                                                   }
                                                }
                                             } else {
                                                var51 = var2.length();
                                                appendToExistingBuilder((var28 as LHeadingContentNode).getContent(), var1, var22);
                                                simulateInlineNewline(var2);
                                                val var172: Any = new Object[]{var171}[0];
                                                if (var172 != null) {
                                                   var22.setSpan(var172, var51, var2.length(), 33);
                                                }
                                             }
                                          }
                                       }

                                       var6 = (byte)0;
                                       var7 = (byte)1;
                                       var22 = var129;
                                       var21 = var1;
                                       break label754;
                                    }

                                    val var191: SpoilerContentNode = var28 as SpoilerContentNode;
                                    val var159: java.lang.String = SpoilerIdentifier.Companion
                                       .forNode-2sfwrmE(var28 as SpoilerContentNode, var1.getContainerId(), var8);
                                    var19 = SpoilerManager.INSTANCE.isRevealed-V2PEE7g(var159);
                                    val var131: RenderContext.SpoilerState;
                                    if (var19) {
                                       var131 = RenderContext.SpoilerState.Revealed;
                                    } else {
                                       var131 = RenderContext.SpoilerState.Hidden;
                                    }

                                    val var160: ClickableSpan;
                                    if (!var19) {
                                       var160 = new ClickableSpan(
                                          NestedClickableSpan.TouchPriority.HIGH, null, null, null, 0.0F, null, null, new N(var159, var1), 126, null
                                       );
                                    } else {
                                       var160 = null;
                                    }

                                    if (var19) {
                                       var6 = var1.getTheme().getSpoilerRevealedBackground();
                                    } else {
                                       var6 = var1.getTheme().getSpoilerHiddenBackground();
                                    }

                                    val var240: BackgroundSpan = new BackgroundSpan(new BackgroundStyle(var6, 0, 0, 6, null), null, null, 6, null);
                                    val var219: SpoilerSpan = new SpoilerSpan(var19);
                                    var6 = var2.length();
                                    appendToExistingBuilder(
                                       var191.getContent(),
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
                                          var131,
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
                                          break label755;
                                       }

                                       var21 = (RenderContext)new Object[]{var160, var240, var219}[var7];
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

                              var7 = (byte)1;
                              var21 = var1;
                              var22 = var129;
                              break label710;
                           }
                        }

                        var21 = var1;
                        var22 = var2;
                        var6 = (byte)0;
                        var7 = (byte)1;
                        break label754;
                     }

                     var6 = (byte)0;
                     var7 = (byte)1;
                     var22.append("\n");
                     break label754;
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

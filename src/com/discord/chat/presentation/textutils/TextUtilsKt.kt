package com.discord.chat.presentation.textutils

import android.content.Context
import android.graphics.Paint
import android.graphics.PorterDuffColorFilter
import android.graphics.Paint.FontMetrics
import android.graphics.Paint.Style
import android.graphics.PorterDuff.Mode
import android.net.Uri
import android.text.style.AbsoluteSizeSpan
import android.text.style.BackgroundColorSpan
import android.text.style.ForegroundColorSpan
import android.text.style.RelativeSizeSpan
import android.text.style.StrikethroughSpan
import android.text.style.UnderlineSpan
import android.text.style.LeadingMarginSpan.Standard
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
import com.discord.chat.bridge.contentnode.LinkContext
import com.discord.chat.bridge.contentnode.MentionContentNode
import com.discord.chat.bridge.contentnode.NewLineContentNode
import com.discord.chat.bridge.contentnode.ParagraphContentNode
import com.discord.chat.bridge.contentnode.SoundmojiContentNode
import com.discord.chat.bridge.contentnode.SpoilerContentNode
import com.discord.chat.bridge.contentnode.StaticChannelMentionContentNode
import com.discord.chat.bridge.contentnode.StaticChannelMentionType
import com.discord.chat.bridge.contentnode.StrikethroughContentNode
import com.discord.chat.bridge.contentnode.StrongContentNode
import com.discord.chat.bridge.contentnode.SubtextContentNode
import com.discord.chat.bridge.contentnode.TextContentNode
import com.discord.chat.bridge.contentnode.TimestampContentNode
import com.discord.chat.bridge.contentnode.UnderlineContentNode
import com.discord.chat.bridge.contentnode.UserNameOnClick
import com.discord.chat.bridge.contentnode.UserOrRoleMentionContentNode
import com.discord.chat.bridge.spoiler.SpoilerIdentifier
import com.discord.chat.bridge.spoiler.SpoilerManager
import com.discord.chat.bridge.structurabletext.AnnotatedStructurableText
import com.discord.chat.bridge.structurabletext.PrimitiveStructurableText
import com.discord.chat.bridge.structurabletext.StructurableText
import com.discord.chat.presentation.message.RoleDotSpan
import com.discord.crash_reporting.CrashReporting
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
import fh.p
import java.util.ArrayList
import kotlin.jvm.functions.Function0
import kotlin.jvm.functions.Function1
import kotlin.jvm.functions.Function2
import kotlin.jvm.functions.Function3
import kotlin.jvm.functions.Function4
import kotlin.jvm.internal.q

private const val CHANNEL_PREFIX: String = "#"
private const val COMMAND_PREFIX: String = "/"

@JvmSynthetic
fun `access$appendToExistingBuilder`(var0: java.util.List, var1: RenderContext, var2: DraweeSpanStringBuilder) {
   appendToExistingBuilder(var0, var1, var2);
}

private fun DraweeSpanStringBuilder.appendBulletPoint(content: List<ContentNode>, rc: RenderContext, isOrderedList: Boolean) {
   val var7: Int = SizeUtilsKt.getDpToPx(8);
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
         appendToExistingBuilder(i.e(new TextContentNode(var23.toString())), var2, var0);
         appendToExistingBuilder(var1, var2, var0);
      } else {
         val var24: OrderedListBulletSpan = new OrderedListBulletSpan(var9, var7, var11, var2.getPaint());
         val var5: Int = var0.length();
         appendToExistingBuilder(var1, var2, var0);
         SpannableStringBuilderExtensionsKt.ensureNewline(var0, new AbsoluteSizeSpan(var4));

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

      appendToExistingBuilder(i.e(new TextContentNode(var25)), var2, var0);
      appendToExistingBuilder(var1, var2, var0);
   } else {
      val var8: Int = SizeUtilsKt.getDpToPx(2);
      var var20: Int = ColorUtilsKt.getThemeColor(var2.getContext(), R.color.primary_360, R.color.primary_400, var2.getTheme());
      val var26: Style;
      if (var6 > 0) {
         var26 = Style.STROKE;
      } else {
         var26 = Style.FILL;
      }

      val var27: BulletSpan = new BulletSpan(var20, var7, false, var8, 0.0F, var26, 20, null);
      var20 = var0.length();
      appendToExistingBuilder(var1, var2, var0);
      SpannableStringBuilderExtensionsKt.ensureNewline(var0, new AbsoluteSizeSpan(var4));

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
   q.h(var0, "<this>");
   q.h(var1, "context");
   q.h(var2, "rc");
   q.h(var3, "imageUrl");
   val var9: Int = var0.length();
   var0.append('\u200b');
   val var10: com.facebook.drawee.controller.a = (o4.c.g().F(ImageRequestBuilder.w(Uri.parse(ReactAssetUtilsKt.getReactImageUrl(var1, var3))).a()) as PipelineDraweeControllerBuilder)
      .d();
   q.g(var10, "build(...)");
   val var11: GenericDraweeHierarchyBuilder = GenericDraweeHierarchyBuilder.u(var1.getResources()).w(ScaleType.e);
   val var13: com.facebook.drawee.generic.a = com.facebook.drawee.generic.a.a(var7);
   var13.s(var8);
   var13.v(com.facebook.drawee.generic.a.a.k);
   var11.K(var13);
   if (var2.spoilerIsHidden()) {
      var11.v(new PorterDuffColorFilter(var2.getTheme().getSpoilerHiddenBackground(), Mode.SRC_IN));
   } else if (var6 != null) {
      var11.v(new PorterDuffColorFilter(var6, Mode.SRC_IN));
   }

   q.g(var11, "apply(...)");
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
      null,
      null,
      getBaselineHeightForFontSizePx(var2.getPaint(), var1),
      null,
      134217727,
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

public fun getBaselineHeightForFontSizePx(paint: Paint, fontSizePx: Int): Float {
   q.h(var0, "paint");
   val var2: Float = var0.getTextSize();
   var0.setTextSize((float)var1);
   val var4: FontMetrics = var0.getFontMetrics();
   q.g(var4, "getFontMetrics(...)");
   val var3: Float = getBaselineHeightPx(var4);
   var0.setTextSize(var2);
   return var3;
}

public fun getBaselineHeightPx(fontMetrics: FontMetrics): Float {
   q.h(var0, "fontMetrics");
   return var0.descent - var0.ascent;
}

private fun getIconPaddingMultiplier(iconType: String): Float {
   val var1: Float;
   if (!q.c(var0, "post") && !q.c(var0, "forum")) {
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

   return new BackgroundSpan(new BackgroundStyle(var1, var2));
}

private fun DraweeSpanStringBuilder.simulateInlineNewline() {
   var0.append("    ");
}

public fun StructurableText.toSpannable(
   context: Context,
   containerId: String,
   animateEmoji: Boolean,
   showLinkDecorations: Boolean,
   shouldShowRoleDot: Boolean,
   shouldShowRoleOnName: Boolean,
   paint: Paint,
   onLinkClicked: (LinkContentNode) -> Unit = <unrepresentable>.INSTANCE,
   onLongTapLink: (LinkContentNode) -> Unit = <unrepresentable>.INSTANCE,
   onTapChannel: (String, String?, String?) -> Unit = <unrepresentable>.INSTANCE,
   onLongPressChannel: (String, String?, String?, String?) -> Unit = <unrepresentable>.INSTANCE,
   onTapAttachmentLink: (String) -> Unit = <unrepresentable>.INSTANCE,
   onLongPressAttachmentLink: (String, String) -> Unit = <unrepresentable>.INSTANCE,
   onTapMention: (String?, String, String?, String?) -> Unit = <unrepresentable>.INSTANCE,
   onTapCommand: (CommandMentionContentNode) -> Unit = <unrepresentable>.INSTANCE,
   onLongPressCommand: (CommandMentionContentNode) -> Unit = ...,
   onTapTimestamp: (String) -> Unit = ...,
   onTapEmoji: (EmojiContentNode) -> Unit = ...,
   linkStyle: (LinkContentNode) -> LinkStyle = ...,
   onTapSpoiler: () -> Unit = ...,
   singleLine: Boolean = ...,
   theme: DiscordThemeObject = ...,
   baselineHeightPx: Float = ...,
   emojiBaselineHeightOverridePx: Float? = null
): DraweeSpanStringBuilder {
   q.h(var0, "<this>");
   q.h(var1, "context");
   q.h(var2, "containerId");
   q.h(var7, "paint");
   q.h(var8, "onLinkClicked");
   q.h(var9, "onLongTapLink");
   q.h(var10, "onTapChannel");
   q.h(var11, "onLongPressChannel");
   q.h(var12, "onTapAttachmentLink");
   q.h(var13, "onLongPressAttachmentLink");
   q.h(var14, "onTapMention");
   q.h(var15, "onTapCommand");
   q.h(var16, "onLongPressCommand");
   q.h(var17, "onTapTimestamp");
   q.h(var18, "onTapEmoji");
   q.h(var19, "linkStyle");
   q.h(var20, "onTapSpoiler");
   q.h(var22, "theme");
   val var25: DraweeSpanStringBuilder;
   if (var0 is AnnotatedStructurableText) {
      var25 = toSpannable$default(
         (var0 as AnnotatedStructurableText).getContent(),
         new RenderContext(
            var1,
            var2,
            var8,
            var9,
            var19,
            var10,
            var11,
            var12,
            var13,
            var14,
            var15,
            var16,
            var20,
            var17,
            var18,
            var3,
            var4,
            var5,
            var6,
            var21,
            var7,
            null,
            0,
            null,
            null,
            null,
            var22,
            var23,
            var24,
            65011712,
            null
         ),
         null,
         2,
         null
      );
   } else {
      if (var0 !is PrimitiveStructurableText) {
         throw new p();
      }

      var25 = new DraweeSpanStringBuilder((var0 as PrimitiveStructurableText).getContent());
   }

   return var25;
}

private fun List<ContentNode>.toSpannable(rc: RenderContext, builder: DraweeSpanStringBuilder = new DraweeSpanStringBuilder()): DraweeSpanStringBuilder {
   var var22: RenderContext = var1;
   var var21: DraweeSpanStringBuilder = var2;
   val var25: java.util.Iterator = var0.iterator();
   var var5: Int = 0;
   var var7: Int = 0;

   while (var25.hasNext()) {
      var var23: Int = (Integer)var25.next();
      if (var7 < 0) {
         i.t();
      }

      var var27: ContentNode = var23 as ContentNode;
      var var6: Byte;
      if (var7 == i.l(var0)) {
         var6 = 1;
      } else {
         var6 = var5;
      }

      label573: {
         var var26: Context = var1.getContext();
         var23 = new BackgroundColorSpan(var1.getTheme().getBackgroundSecondary());
         var var24: RelativeSizeSpan = new RelativeSizeSpan(0.85F);
         val var28: DiscordFontSpan = new DiscordFontSpan(var26, DiscordFont.CodeNormal);
         val var12: Int = ColorUtilsKt.getThemeColor(
            var26, com.discord.chat.R.color.chat_mentions_background_light, com.discord.chat.R.color.chat_mentions_background_dark, var1.getTheme()
         );
         val var10: Int = ColorUtilsKt.getThemeColor(
            var26, com.discord.chat.R.color.chat_mentions_foreground_light, com.discord.chat.R.color.chat_mentions_foreground_dark, var1.getTheme()
         );
         val var13: Int = androidx.core.graphics.c.k(ColorUtilsKt.getThemeColor(var26, R.color.green_330, R.color.green_330, var1.getTheme()), 25);
         val var11: Int = ColorUtilsKt.getThemeColor(var26, R.color.green_330, R.color.green_330, var1.getTheme());
         if (var27 is BlockQuoteContentNode) {
            if (var1.getSingleLine()) {
               var21.append("> ");
               appendToExistingBuilder((var27 as BlockQuoteContentNode).getContent(), var22, var21);
            } else {
               var23 = new QuoteSpan(var1.getTheme().getInteractiveMuted(), SizeUtilsKt.getDpToPx(3), SizeUtilsKt.getDpToPx(8));
               var6 = var2.length();
               appendToExistingBuilder((var27 as BlockQuoteContentNode).getContent(), var22.updateInsets(new Function1((QuoteSpan)var23) {
                  final QuoteSpan $quote;

                  {
                     super(1);
                     this.$quote = var1;
                  }

                  public final RenderContext.Insets invoke(RenderContext.Insets var1) {
                     q.h(var1, "$this$updateInsets");
                     return RenderContext.Insets.copy$default(var1, 0, 0, var1.getStart() + this.$quote.getInsetStart(), 0, 11, null);
                  }
               }), var21);
               var23 = new Object[]{var23}[var5];
               if (var23 != null) {
                  var21.setSpan(var23, var6, var2.length(), 13107233);
               }
            }
         } else if (var27 is CodeBlockContentNode) {
            if (var1.getSingleLine()) {
               val var84: Int = var2.length();
               var21.append(kotlin.text.h.C((var27 as CodeBlockContentNode).getContent(), '\n', ' ', false, 4, null));

               for (int var59 = var5; var59 < 3; var59++) {
                  var26 = (Context)new Object[]{var23, var24, var28}[var59];
                  if (var26 != null) {
                     var21.setSpan(var26, var84, var2.length(), 33);
                  }
               }
            } else {
               CodeStyle.INSTANCE.renderCodeBlock(var21, var27 as CodeBlockContentNode, var22);
            }
         } else if (var27 is EmojiContentNode) {
            EmojiRendererKt.renderEmoji(var21, var27 as EmojiContentNode, var22);
         } else if (var27 is EmphasisContentNode) {
            var23 = new GGSansItalicSpan(var1.getContext());
            var6 = var2.length();
            appendToExistingBuilder((var27 as EmphasisContentNode).getContent(), var22, var21);
            var23 = new Object[]{var23}[var5];
            if (var23 != null) {
               var21.setSpan(var23, var6, var2.length(), 33);
            }
         } else if (var27 is InlineCodeContentNode) {
            val var85: Int = var2.length();
            var21.append((var27 as InlineCodeContentNode).getContent());

            for (int var61 = var5; var61 < 3; var61++) {
               var26 = (Context)new Object[]{var23, var24, var28}[var61];
               if (var26 != null) {
                  var21.setSpan(var26, var85, var2.length(), 33);
               }
            }
         } else if (var27 is LineBreakContentNode || var27 is NewLineContentNode) {
            var21.append("\n");
         } else if (var27 is LinkContentNode) {
            label455: {
               var171 = var1.getLinkStyle().invoke(var27) as LinkStyle;
               var217 = var27 as LinkContentNode;
               if (q.c((var27 as LinkContentNode).getTarget(), "usernameOnClick")) {
                  val var148: LinkContext = var217.getContext();
                  if (var148 != null) {
                     val var149: UserNameOnClick = var148.getUsernameOnClick();
                     if (var149 != null) {
                        var23 = var149.getLinkColor();
                        break label455;
                     }
                  }
               }

               var23 = null;
            }

            if (var23 != null) {
               var6 = var23;
            } else {
               var6 = var171.getLinkColor();
            }

            val var206: ClickableSpan = new ClickableSpan(null, var6, var1.getShowLinkDecorations(), new Function1(var27, var22) {
               final ContentNode $contentNode;
               final RenderContext $rc;

               {
                  super(1);
                  this.$contentNode = var1;
                  this.$rc = var2;
               }

               public final java.lang.Boolean invoke(View var1) {
                  q.h(var1, "it");
                  val var2: Boolean;
                  if ((this.$contentNode as LinkContentNode).isUrl()) {
                     this.$rc.getOnLongTapLink().invoke(this.$contentNode);
                     var2 = true;
                  } else {
                     var2 = false;
                  }

                  return var2;
               }
            }, new Function1(var22, var27) {
               final ContentNode $contentNode;
               final RenderContext $rc;

               {
                  super(1);
                  this.$rc = var1;
                  this.$contentNode = var2;
               }

               public final void invoke(View var1) {
                  q.h(var1, "it");
                  this.$rc.getOnTapLink().invoke(this.$contentNode);
               }
            }, 1, null);
            val var29: LinkBackgroundStyle = var171.getBackgroundStyle();
            val var153: BackgroundSpan;
            if (var29 != null) {
               var23 = var29.getColor();
               if (var23 != null) {
                  var6 = var23;
               } else {
                  var6 = var5;
               }

               var23 = var29.getBorderRadius();
               val var86: Int;
               if (var23 != null) {
                  var86 = var23;
               } else {
                  var86 = var5;
               }

               var153 = new BackgroundSpan(new BackgroundStyle(var6, var86));
               val var225: java.lang.Boolean = var29.getSpaceAround();
               if (var225 != null) {
                  var5 = var225;
               }
            } else {
               var153 = null;
            }

            val var227: DiscordFontSpan = new DiscordFontSpan(var1.getContext(), var171.getFont());
            var6 = var2.length();
            if (var5 != 0) {
               var21.append(' ');
            }

            val var87: Int = getIconSize(null, var1.getBaselineHeightPx());
            val var30: ReactAsset = var171.getIcon();
            if (var30 != null) {
               appendImage$default(var2, var26, var1, var30.getUri(var26), var87, var87, var171.getLinkColor(), 0.0F, 0.0F, 192, null);
               var21.append(' ');
            }

            appendToExistingBuilder(var217.getContent(), var22, var21);
            if (var5 != 0) {
               var21.append(' ');
            }

            var5 = var6;

            for (int var65 = 0; var65 < 3; var65++) {
               var24 = (RelativeSizeSpan)new Object[]{var206, var227, var153}[var65];
               if (var24 != null) {
                  var21.setSpan(var24, var5, var2.length(), 33);
               }
            }

            var5 = 0;
         } else {
            if (var27 !is MentionContentNode) {
               if (var27 !is ParagraphContentNode) {
                  if (var27 is SpoilerContentNode) {
                     val var167: SpoilerContentNode = var27 as SpoilerContentNode;
                     val var186: java.lang.String = SpoilerIdentifier.Companion.forNode-2sfwrmE(var27 as SpoilerContentNode, var1.getContainerId(), var7);
                     val var107: Boolean = SpoilerManager.INSTANCE.isRevealed-V2PEE7g(var186);
                     val var127: RenderContext.SpoilerState;
                     if (var107) {
                        var127 = RenderContext.SpoilerState.Revealed;
                     } else {
                        var127 = RenderContext.SpoilerState.Hidden;
                     }

                     val var142: ClickableSpan;
                     if (!var107) {
                        var142 = new ClickableSpan(NestedClickableSpan.TouchPriority.HIGH, null, null, null, new Function1(var186, var22) {
                           final java.lang.String $id;
                           final RenderContext $rc;

                           {
                              super(1);
                              this.$id = var1;
                              this.$rc = var2;
                           }

                           public final void invoke(View var1) {
                              q.h(var1, "it");
                              SpoilerManager.INSTANCE.markRevealed-V2PEE7g(this.$id);
                              this.$rc.getOnTapSpoiler().invoke();
                           }
                        }, 14, null);
                     } else {
                        var142 = null;
                     }

                     val var187: SpoilerSpan = new SpoilerSpan(
                        var107, var1.getTheme().getSpoilerHiddenBackground(), var1.getTheme().getSpoilerRevealedBackground()
                     );
                     var5 = var2.length();
                     appendToExistingBuilder(
                        var167.getContent(),
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
                           false,
                           false,
                           false,
                           false,
                           false,
                           null,
                           var127,
                           0,
                           null,
                           null,
                           null,
                           null,
                           0.0F,
                           null,
                           534773759,
                           null
                        ),
                        var2
                     );

                     for (int var81 = 0; var81 < 2; var81++) {
                        val var129: Any = new Object[]{var142, var187}[var81];
                        if (var129 != null) {
                           var2.setSpan(var129, var5, var2.length(), 33);
                        }
                     }
                  } else {
                     label608: {
                        val var157: DraweeSpanStringBuilder = var21;
                        if (var27 is StrikethroughContentNode) {
                           val var108: StrikethroughSpan = new StrikethroughSpan();
                           var5 = var2.length();
                           appendToExistingBuilder((var27 as StrikethroughContentNode).getContent(), var1, var21);
                           val var109: Any = new Object[]{var108}[0];
                           if (var109 != null) {
                              var21.setSpan(var109, var5, var2.length(), 33);
                           }
                        } else if (var27 is SubtextContentNode) {
                           if (var1.getSingleLine()) {
                              appendToExistingBuilder((var27 as SubtextContentNode).getContent(), var1, var21);
                              if (var6 == 0) {
                                 simulateInlineNewline(var2);
                              }
                           } else {
                              val var42: Byte;
                              if (FontManager.INSTANCE.getIsClassicChatFontScaleEnabled(var26)) {
                                 var42 = 13;
                              } else {
                                 var42 = 14;
                              }

                              changeTextSizeSp(
                                 var21, var42, var1, new Function2(var21, new ForegroundColorSpan(var1.getTheme().getTextMuted()), var27, (boolean)var6) {
                                    final DraweeSpanStringBuilder $builder;
                                    final ContentNode $contentNode;
                                    final ForegroundColorSpan $fontColorSpan;
                                    final boolean $isLastContentNode;

                                    {
                                       super(2);
                                       this.$builder = var1;
                                       this.$fontColorSpan = var2;
                                       this.$contentNode = var3;
                                       this.$isLastContentNode = var4;
                                    }

                                    public final void invoke(DraweeSpanStringBuilder var1, RenderContext var2) {
                                       q.h(var1, "$this$changeTextSizeSp");
                                       q.h(var2, "updatedRC");
                                       var1 = this.$builder;
                                       val var5: ForegroundColorSpan = this.$fontColorSpan;
                                       val var6: ContentNode = this.$contentNode;
                                       val var4: Boolean = this.$isLastContentNode;
                                       val var3: Int = this.$builder.length();
                                       TextUtilsKt.access$appendToExistingBuilder((var6 as SubtextContentNode).getContent(), var2, var1);
                                       if (!var4) {
                                          SpannableStringBuilderExtensionsKt.ensureNewline$default(var1, null, 1, null);
                                       }

                                       val var8: Any = new Object[]{var5}[0];
                                       if (var8 != null) {
                                          var1.setSpan(var8, var3, var1.length(), 13107233);
                                       }
                                    }
                                 }
                              );
                           }
                        } else {
                           var var105: Boolean = var27 is HeadingContentNode;
                           var var43: Int = 16;
                           if (var105) {
                              val var110: DiscordFontSpan = new DiscordFontSpan(var1.getContext(), DiscordFont.PrimaryExtraBold);
                              if (var1.getSingleLine()) {
                                 var43 = var2.length();
                                 appendToExistingBuilder((var27 as HeadingContentNode).getContent(), var1, var21);
                                 simulateInlineNewline(var2);
                                 val var111: Any = new Object[]{var110}[0];
                                 if (var111 != null) {
                                    var21.setSpan(var111, var43, var2.length(), 33);
                                 }
                              } else {
                                 var var93: Int = (var27 as HeadingContentNode).getLevel();
                                 if (var93 != 1) {
                                    if (var93 == 2) {
                                       var43 = 20;
                                    }
                                 } else {
                                    var43 = 24;
                                 }

                                 if (var2.length() > 0) {
                                    var93 = SizeUtilsKt.getDpToPx(8);
                                 } else {
                                    var93 = SizeUtilsKt.getDpToPx(4);
                                 }

                                 val var130: AbsoluteSizeSpan = new AbsoluteSizeSpan(var93);
                                 var93 = var2.length();
                                 var21.append("\n");
                                 var22 = (RenderContext)new Object[]{var130}[0];
                                 if (var22 != null) {
                                    var21.setSpan(var22, var93, var2.length(), 33);
                                 }

                                 var93 = var2.length();
                                 changeTextSizeSp(var21, var43, var1, new Function2(var27, var21) {
                                    final DraweeSpanStringBuilder $builder;
                                    final ContentNode $contentNode;

                                    {
                                       super(2);
                                       this.$contentNode = var1;
                                       this.$builder = var2;
                                    }

                                    public final void invoke(DraweeSpanStringBuilder var1, RenderContext var2) {
                                       q.h(var1, "$this$changeTextSizeSp");
                                       q.h(var2, "updatedRc");
                                       TextUtilsKt.access$appendToExistingBuilder((this.$contentNode as HeadingContentNode).getContent(), var2, this.$builder);
                                    }
                                 });
                                 var var112: Any = new Object[]{var110}[0];
                                 if (var112 != null) {
                                    var21.setSpan(var112, var93, var2.length(), 33);
                                 }

                                 if (var6 == 0) {
                                    var112 = new AbsoluteSizeSpan(SizeUtilsKt.getDpToPx(4));
                                    var43 = var2.length();
                                    var21.append("\n");
                                    var112 = new Object[]{var112}[0];
                                    if (var112 != null) {
                                       var21.setSpan(var112, var43, var2.length(), 33);
                                    }
                                 } else {
                                    var112 = new AbsoluteSizeSpan(0);
                                    var43 = var2.length();
                                    var21.append("\n\u200b");
                                    var112 = new Object[]{var112}[0];
                                    if (var112 != null) {
                                       var21.setSpan(var112, var43, var2.length(), 33);
                                    }
                                 }
                              }
                           } else {
                              if (var27 !is LHeadingContentNode) {
                                 if (var27 !is BulletListContentNode) {
                                    if (var27 is StrongContentNode) {
                                       val var125: GGSansBoldSpan = new GGSansBoldSpan(var1.getContext());
                                       val var100: Int = var2.length();
                                       appendToExistingBuilder((var27 as StrongContentNode).getContent(), var1, var21);
                                       var26 = (Context)new Object[]{var125}[0];
                                       var119 = var1;
                                       var5 = 0;
                                       var132 = var21;
                                       if (var26 != null) {
                                          var21.setSpan(var26, var100, var2.length(), 33);
                                          var119 = var1;
                                          var5 = 0;
                                          var132 = var21;
                                       }
                                       break label573;
                                    }

                                    val var185: RenderContext = var1;
                                    val var99: Byte = 0;
                                    if (var27 is TextContentNode) {
                                       val var204: java.lang.String = (var27 as TextContentNode).getContent();
                                       var119 = var1;
                                       var5 = 0;
                                       var132 = var21;
                                       if (var204 != null) {
                                          var21.append(var204);
                                          var119 = var1;
                                          var5 = 0;
                                          var132 = var21;
                                       }
                                       break label573;
                                    }

                                    if (var27 is TimestampContentNode) {
                                       val var224: ClickableSpan = new ClickableSpan(
                                          null,
                                          ColorUtilsKt.getThemeColor(var26, R.color.primary_600, R.color.primary_200, var1.getTheme()),
                                          null,
                                          null,
                                          new Function1(var1, var27) {
                                             final ContentNode $contentNode;
                                             final RenderContext $rc;

                                             {
                                                super(1);
                                                this.$rc = var1;
                                                this.$contentNode = var2;
                                             }

                                             public final void invoke(View var1) {
                                                q.h(var1, "it");
                                                this.$rc.getOnTapTimestamp().invoke((this.$contentNode as TimestampContentNode).getFull());
                                             }
                                          },
                                          13,
                                          null
                                       );
                                       val var203: BackgroundColorSpan = new BackgroundColorSpan(
                                          ColorUtilsKt.getThemeColor(
                                             var26, R.color.background_modifier_accent_light, R.color.background_modifier_accent_dark, var1.getTheme()
                                          )
                                       );
                                       val var102: Int = var2.length();
                                       var21.append((var27 as TimestampContentNode).getFormatted());
                                       var6 = 0;

                                       while (true) {
                                          var119 = var185;
                                          var5 = var99;
                                          var132 = var157;
                                          if (var6 >= 2) {
                                             break label573;
                                          }

                                          val var124: Any = new Object[]{var224, var203}[var6];
                                          if (var124 != null) {
                                             var157.setSpan(var124, var102, var2.length(), 33);
                                          }

                                          var6++;
                                       }
                                    }

                                    if (var27 is UnderlineContentNode) {
                                       val var121: UnderlineSpan = new UnderlineSpan();
                                       var6 = var2.length();
                                       appendToExistingBuilder((var27 as UnderlineContentNode).getContent(), var1, var21);
                                       var26 = (Context)new Object[]{var121}[0];
                                       var119 = var1;
                                       var5 = 0;
                                       var132 = var21;
                                       if (var26 != null) {
                                          var21.setSpan(var26, var6, var2.length(), 33);
                                          var119 = var1;
                                          var5 = 0;
                                          var132 = var21;
                                       }
                                    } else if (var27 is ChannelNameContentNode) {
                                       val var122: ChannelNameContentNode = var27 as ChannelNameContentNode;
                                       if ((var27 as ChannelNameContentNode).getIcon() != null) {
                                          var43 = getIconSize(var122.getIconType(), var1.getBaselineHeightPx());
                                          appendImage$default(
                                             var2,
                                             var26,
                                             var1,
                                             var122.getIcon(),
                                             var43,
                                             var43,
                                             var10,
                                             0.0F,
                                             (float)var43 * getIconPaddingMultiplier(var122.getIconType()),
                                             64,
                                             null
                                          );
                                       }

                                       appendToExistingBuilder(var122.getContent(), var1, var21);
                                       var119 = var1;
                                       var5 = 0;
                                       var132 = var21;
                                    } else if (var27 is GuildNameContentNode) {
                                       var43 = getIconSize("_guild", var1.getBaselineHeightPx());
                                       val var123: GuildNameContentNode = var27 as GuildNameContentNode;
                                       if ((var27 as GuildNameContentNode).getIcon() != null) {
                                          appendImage$default(
                                             var2, var26, var1, var123.getIcon(), var43, var43, null, (float)var43 * 0.2F, (float)var43 * 0.1F, 32, null
                                          );
                                       }

                                       var21.append(var123.getContent());
                                       var119 = var1;
                                       var5 = 0;
                                       var132 = var21;
                                    } else if (var27 is SoundmojiContentNode) {
                                       var21.append((var27 as SoundmojiContentNode).getSoundId());
                                       var119 = var1;
                                       var5 = 0;
                                       var132 = var21;
                                    } else {
                                       var119 = var1;
                                       var5 = 0;
                                       var132 = var21;
                                       if (var27 is ErrorContentNode) {
                                          CrashReporting.captureException$default(
                                             CrashReporting.INSTANCE, (var27 as ErrorContentNode).getThrowable(), false, 2, null
                                          );
                                          var21.append("���");
                                          var132 = var21;
                                          var5 = 0;
                                          var119 = var1;
                                       }
                                    }
                                    break label573;
                                 }

                                 var var120: RenderContext = RenderContext.copy$default(
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
                                    null,
                                    null,
                                    0.0F,
                                    null,
                                    536870911,
                                    null
                                 );
                                 val var134: BulletListContentNode = var27 as BulletListContentNode;
                                 val var20: Boolean = (var27 as BulletListContentNode).getOrdered();
                                 val var103: Long;
                                 if (var20) {
                                    val var165: java.lang.Long = var134.getStart();
                                    if (var165 != null) {
                                       var103 = var165;
                                    } else {
                                       var103 = 1L;
                                    }

                                    var120 = RenderContext.copy$default(
                                       var120,
                                       null,
                                       null,
                                       null,
                                       null,
                                       null,
                                       null,
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
                                       (long)(var134.getItems().size() - 1) + var103,
                                       null,
                                       null,
                                       0.0F,
                                       null,
                                       520093695,
                                       null
                                    );
                                 } else {
                                    var103 = 0L;
                                 }

                                 val var166: java.util.Iterator = var134.getItems().iterator();

                                 while (true) {
                                    if (!var166.hasNext()) {
                                       break label608;
                                    }

                                    val var135: java.util.List = var166.next() as java.util.List;
                                    val var184: ArrayList = new ArrayList();
                                    val var98: Int = var135.size();
                                    val var201: java.util.Iterator = var135.iterator();

                                    for (int var53 = 0; var201.hasNext(); var53++) {
                                       var22 = (RenderContext)var201.next();
                                       if (var53 < 0) {
                                          i.t();
                                       }

                                       var27 = var22 as ContentNode;
                                       var105 = var22 as ContentNode is BulletListContentNode;
                                       val var77: Boolean;
                                       if (var53 == var98 - 1) {
                                          var77 = true;
                                       } else {
                                          var77 = false;
                                       }

                                       if (!var105) {
                                          var184.add(var27);
                                       }

                                       if (var105 || var77) {
                                          var22 = var120;
                                          if (var20) {
                                             var var17: Long;
                                             if (var120.getListOrderedIndex() != null) {
                                                val var138: java.lang.Long = var120.getListOrderedIndex();
                                                if (var138 != null) {
                                                   var17 = var138;
                                                } else {
                                                   var17 = 0L;
                                                }

                                                var17++;
                                             } else {
                                                var17 = var103;
                                             }

                                             var22 = RenderContext.copy$default(
                                                var120,
                                                null,
                                                null,
                                                null,
                                                null,
                                                null,
                                                null,
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
                                                null,
                                                null,
                                                0.0F,
                                                null,
                                                528482303,
                                                null
                                             );
                                          }

                                          var120 = var22;
                                          appendBulletPoint(var2, var184, var22, var20);
                                          if (var1.getSingleLine()) {
                                             simulateInlineNewline(var2);
                                          }

                                          var184.clear();
                                       }

                                       if (var105) {
                                          appendToExistingBuilder(
                                             i.e(var27),
                                             RenderContext.copy$default(
                                                var120,
                                                null,
                                                null,
                                                null,
                                                null,
                                                null,
                                                null,
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
                                                var120.getListNestedLevel() + 1,
                                                null,
                                                null,
                                                null,
                                                null,
                                                0.0F,
                                                null,
                                                507510783,
                                                null
                                             ),
                                             var2
                                          );
                                       }
                                    }
                                 }
                              }

                              val var117: DiscordFontSpan = new DiscordFontSpan(var1.getContext(), DiscordFont.PrimaryExtraBold);
                              if (!var1.getSingleLine()) {
                                 var43 = FontManager.INSTANCE.getScaledSpToPx(16, var1.getContext());
                                 val var3: Float = getBaselineHeightForFontSizePx(var1.getPaint(), var43);
                                 val var223: AbsoluteSizeSpan = new AbsoluteSizeSpan(var43);
                                 val var133: LHeadingContentNode = var27 as LHeadingContentNode;
                                 if (kotlin.text.h.H((var27 as LHeadingContentNode).getClassName(), "added", false, 2, null)) {
                                    var43 = ThemeManagerKt.getTheme().getTextPositive();
                                 } else if (kotlin.text.h.H(var133.getClassName(), "fixed", false, 2, null)) {
                                    var43 = ThemeManagerKt.getTheme().getTextDanger();
                                 } else if (kotlin.text.h.H(var133.getClassName(), "progress", false, 2, null)) {
                                    var43 = ThemeManagerKt.getTheme().getTextWarning();
                                 } else if (kotlin.text.h.H(var133.getClassName(), "improved", false, 2, null)) {
                                    var43 = ThemeManagerKt.getTheme().getTextBrand();
                                 } else {
                                    var43 = ThemeManagerKt.getTheme().getHeaderPrimary();
                                 }

                                 val var183: ForegroundColorSpan = new ForegroundColorSpan(var43);
                                 if (var2.length() > 0) {
                                    var43 = SizeUtilsKt.getDpToPx(8);
                                 } else {
                                    var43 = SizeUtilsKt.getDpToPx(4);
                                 }

                                 val var200: UnderlineSpan = new UnderlineSpan();
                                 val var97: Int = var2.length();
                                 val var213: AbsoluteSizeSpan = new AbsoluteSizeSpan(var43);
                                 var43 = var2.length();
                                 var21.append("\n");
                                 var27 = (ContentNode)new Object[]{var213}[0];
                                 if (var27 != null) {
                                    var21.setSpan(var27, var43, var2.length(), 33);
                                 }

                                 val var101: Int = var2.length();
                                 val var158: java.util.List = var133.getContent();
                                 var43 = var97;
                                 val var215: RenderContext = RenderContext.copy$default(
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
                                    null,
                                    null,
                                    var3,
                                    null,
                                    134217727,
                                    null
                                 );
                                 var132 = var2;
                                 appendToExistingBuilder(var158, var215, var2);
                                 var23 = (Integer)new Object[]{var223}[0];
                                 if (var23 != null) {
                                    var2.setSpan(var23, var101, var2.length(), 33);
                                 }

                                 if (var6 == 0) {
                                    val var160: AbsoluteSizeSpan = new AbsoluteSizeSpan(SizeUtilsKt.getDpToPx(4));
                                    var6 = var2.length();
                                    var2.append("\n");
                                    var23 = (Integer)new Object[]{var160}[0];
                                    if (var23 != null) {
                                       var2.setSpan(var23, var6, var2.length(), 33);
                                    }
                                 } else {
                                    val var162: AbsoluteSizeSpan = new AbsoluteSizeSpan(0);
                                    var6 = var2.length();
                                    var2.append("\n\u200b");
                                    var23 = (Integer)new Object[]{var162}[0];
                                    if (var23 != null) {
                                       var2.setSpan(var23, var6, var2.length(), 33);
                                    }
                                 }

                                 for (int var76 = 0; var76 < 3; var76++) {
                                    var23 = (Integer)new Object[]{var117, var183, var200}[var76];
                                    if (var23 != null) {
                                       var132.setSpan(var23, var43, var2.length(), 33);
                                    }
                                 }

                                 var119 = var1;
                                 var5 = 0;
                                 break label573;
                              }

                              var43 = var2.length();
                              appendToExistingBuilder((var27 as LHeadingContentNode).getContent(), var1, var21);
                              simulateInlineNewline(var2);
                              val var118: Any = new Object[]{var117}[0];
                              if (var118 != null) {
                                 var21.setSpan(var118, var43, var2.length(), 33);
                              }
                           }
                        }

                        var119 = var1;
                        var5 = 0;
                        var132 = var21;
                        break label573;
                     }
                  }

                  var132 = var2;
                  var119 = var1;
                  var5 = 0;
                  break label573;
               }

               appendToExistingBuilder((var27 as ParagraphContentNode).getContent(), var22, var21);
               if (var6 == 0) {
                  var21.append("\n\n");
               }
            } else {
               val var154: DiscordFontSpan = new DiscordFontSpan(var1.getContext(), DiscordFont.PrimarySemibold);
               val var173: MentionContentNode = var27 as MentionContentNode;
               if (var27 as MentionContentNode is UserOrRoleMentionContentNode) {
                  val var174: ClickableSpan = new ClickableSpan(null, -1, null, null, new Function1(var22, var27) {
                     final ContentNode $contentNode;
                     final RenderContext $rc;

                     {
                        super(1);
                        this.$rc = var1;
                        this.$contentNode = var2;
                     }

                     public final void invoke(View var1) {
                        q.h(var1, "it");
                        val var5: Function4 = this.$rc.getOnTapMention();
                        val var7: UserId = (this.$contentNode as UserOrRoleMentionContentNode).getUserId-wUX8bhU();
                        var var3: java.lang.String = null;
                        val var8: java.lang.String;
                        if (var7 != null) {
                           var8 = UserId.toString-impl(var7.unbox-impl());
                        } else {
                           var8 = null;
                        }

                        val var6: java.lang.String = java.lang.String.valueOf((this.$contentNode as UserOrRoleMentionContentNode).getChannelId-qMVnFVQ());
                        var var2: java.lang.String = (this.$contentNode as UserOrRoleMentionContentNode).getRoleName();
                        if (var2 == null) {
                           var2 = null;
                        }

                        val var4: java.lang.String = (this.$contentNode as UserOrRoleMentionContentNode).getParsedUserId();
                        if (var4 != null) {
                           var3 = var4;
                        }

                        var5.invoke(var8, var6, var2, var3);
                     }
                  }, 13, null);
                  val var228: UserOrRoleMentionContentNode = var27 as UserOrRoleMentionContentNode;
                  val var14: Int = (var27 as UserOrRoleMentionContentNode).getRoleColor();
                  val var89: Boolean;
                  if (var1.getShouldShowRoleDot() && var14 > 0) {
                     var89 = true;
                  } else {
                     var89 = false;
                  }

                  val var9: Boolean;
                  if (var1.getShouldShowRoleOnName() && var14 > 0) {
                     var9 = true;
                  } else {
                     var9 = false;
                  }

                  val var207: UserId = var228.getUserId-wUX8bhU();
                  val var15: Long = UserId.constructor-impl(1081004946872352958L);
                  val var19: Boolean;
                  if (var207 == null) {
                     var19 = false;
                  } else {
                     var19 = UserId.equals-impl0(var207.unbox-impl(), var15);
                  }

                  if (var19) {
                     var5 = var13;
                  } else if (var9) {
                     var5 = androidx.core.graphics.c.k(var14, 25);
                  } else {
                     var5 = var12;
                  }

                  val var208: BackgroundSpan = makeMentionBackgroundSpan(var22, var5);
                  if (var19) {
                     var6 = var11;
                  } else {
                     var6 = var10;
                     if (var9) {
                        var6 = androidx.core.graphics.c.k(var14, 255);
                     }
                  }

                  val var218: ForegroundColorSpan = new ForegroundColorSpan(var6);
                  var6 = var2.length();
                  if (var89) {
                     val var190: RoleDotSpan = new RoleDotSpan(var26, var5, 0, 4, null);
                     var190.setColor(var228.getRoleColor());
                     var21.append("#");
                     var21.setSpan(var190, var2.length() - 1, var2.length(), 33);
                  }

                  var21.append(toSpannable$default(var228.getContent(), var22, null, 2, null));

                  for (int var35 = 0; var35 < 4; var35++) {
                     var26 = (Context)new Object[]{var154, var174, var208, var218}[var35];
                     if (var26 != null) {
                        var21.setSpan(var26, var6, var2.length(), 33);
                     }
                  }
               } else if (var173 is ChannelMentionContentNode) {
                  val var219: ClickableSpan = new ClickableSpan(
                     null,
                     -1,
                     null,
                     new Function1(var22, var27) {
                        final ContentNode $contentNode;
                        final RenderContext $rc;

                        {
                           super(1);
                           this.$rc = var1;
                           this.$contentNode = var2;
                        }

                        public final java.lang.Boolean invoke(View var1) {
                           q.h(var1, "it");
                           this.$rc
                              .getOnLongPressChannel()
                              .invoke(
                                 (this.$contentNode as ChannelMentionContentNode).getChannelId(),
                                 (this.$contentNode as ChannelMentionContentNode).getGuildId(),
                                 (this.$contentNode as ChannelMentionContentNode).getMessageId(),
                                 (this.$contentNode as ChannelMentionContentNode).getOriginalLink()
                              );
                           return java.lang.Boolean.TRUE;
                        }
                     },
                     new Function1(var22, var27) {
                        final ContentNode $contentNode;
                        final RenderContext $rc;

                        {
                           super(1);
                           this.$rc = var1;
                           this.$contentNode = var2;
                        }

                        public final void invoke(View var1) {
                           q.h(var1, "it");
                           this.$rc
                              .getOnTapChannel()
                              .invoke(
                                 (this.$contentNode as ChannelMentionContentNode).getChannelId(),
                                 (this.$contentNode as ChannelMentionContentNode).getGuildId(),
                                 (this.$contentNode as ChannelMentionContentNode).getMessageId()
                              );
                        }
                     },
                     5,
                     null
                  );
                  val var232: BackgroundSpan = makeMentionBackgroundSpan(var22, var12);
                  val var229: ForegroundColorSpan = new ForegroundColorSpan(var10);
                  var6 = var2.length();
                  val var209: java.util.List = (var27 as ChannelMentionContentNode).getInContent();
                  if (var209 != null) {
                     appendToExistingBuilder(var209, var22, var21);
                     var5 = getIconSize("_caret", var1.getBaselineHeightPx());
                     appendImage$default(var2, var26, var1, ReactAsset.Caret.getUri(var26), var5, var5, var229.getForegroundColor(), 0.0F, 0.0F, 192, null);
                  }

                  val var175: java.util.List = var173.getContent();
                  if (var175 != null) {
                     appendToExistingBuilder(var175, var22, var21);
                  }

                  for (int var37 = 0; var37 < 4; var37++) {
                     var24 = (RelativeSizeSpan)new Object[]{var154, var219, var232, var229}[var37];
                     if (var24 != null) {
                        var21.setSpan(var24, var6, var2.length(), 33);
                     }
                  }
               } else if (var173 is AttachmentLinkContentNode) {
                  val var220: ClickableSpan = new ClickableSpan(
                     null,
                     -1,
                     null,
                     new Function1(var22, var27) {
                        final ContentNode $contentNode;
                        final RenderContext $rc;

                        {
                           super(1);
                           this.$rc = var1;
                           this.$contentNode = var2;
                        }

                        public final java.lang.Boolean invoke(View var1) {
                           q.h(var1, "it");
                           this.$rc
                              .getOnLongPressAttachmentLink()
                              .invoke(
                                 (this.$contentNode as AttachmentLinkContentNode).getAttachmentUrl(),
                                 (this.$contentNode as AttachmentLinkContentNode).getAttachmentName()
                              );
                           return java.lang.Boolean.TRUE;
                        }
                     },
                     new Function1(var22, var27) {
                        final ContentNode $contentNode;
                        final RenderContext $rc;

                        {
                           super(1);
                           this.$rc = var1;
                           this.$contentNode = var2;
                        }

                        public final void invoke(View var1) {
                           q.h(var1, "it");
                           this.$rc.getOnTapAttachmentLink().invoke((this.$contentNode as AttachmentLinkContentNode).getAttachmentUrl());
                        }
                     },
                     5,
                     null
                  );
                  val var210: BackgroundSpan = makeMentionBackgroundSpan(var22, var12);
                  val var230: ForegroundColorSpan = new ForegroundColorSpan(var10);
                  var5 = var2.length();
                  val var90: Int = getIconSize(null, var1.getBaselineHeightPx());
                  appendImage$default(var2, var26, var1, ReactAsset.Attachment.getUri(var26), var90, var90, var230.getForegroundColor(), 0.0F, 0.0F, 192, null);
                  var21.append(' ');
                  val var178: java.util.List = var173.getContent();
                  if (var178 != null) {
                     appendToExistingBuilder(var178, var22, var21);
                  }

                  for (int var70 = 0; var70 < 4; var70++) {
                     var24 = (RelativeSizeSpan)new Object[]{var154, var220, var210, var230}[var70];
                     if (var24 != null) {
                        var21.setSpan(var24, var5, var2.length(), 33);
                     }
                  }
               } else if (var173 is StaticChannelMentionContentNode) {
                  val var231: ClickableSpan = new ClickableSpan(
                     null,
                     -1,
                     null,
                     null,
                     new Function1(var22, var27) {
                        final ContentNode $contentNode;
                        final RenderContext $rc;

                        {
                           super(1);
                           this.$rc = var1;
                           this.$contentNode = var2;
                        }

                        public final void invoke(View var1) {
                           q.h(var1, "it");
                           this.$rc
                              .getOnTapChannel()
                              .invoke(
                                 (this.$contentNode as StaticChannelMentionContentNode).getId().getId(),
                                 java.lang.String.valueOf((this.$contentNode as StaticChannelMentionContentNode).getGuildId-qOKuAAo()),
                                 java.lang.String.valueOf((this.$contentNode as StaticChannelMentionContentNode).getItemId())
                              );
                        }
                     },
                     13,
                     null
                  );
                  val var181: BackgroundSpan = makeMentionBackgroundSpan(var22, var12);
                  val var221: ForegroundColorSpan = new ForegroundColorSpan(var10);
                  val var91: Int = getIconSize(null, var1.getBaselineHeightPx());
                  var5 = var2.length();
                  val var211: StaticChannelMentionContentNode = var27 as StaticChannelMentionContentNode;
                  var6 = TextUtilsKt.WhenMappings.$EnumSwitchMapping$0[(var27 as StaticChannelMentionContentNode).getId().ordinal()];
                  if (var6 == 1 || var6 == 2) {
                     appendImage$default(var2, var26, var1, ReactAsset.Home.getUri(var26), var91, var91, var221.getForegroundColor(), 0.0F, 0.0F, 192, null);
                  } else if (var6 != 3) {
                     if (var6 != 4) {
                        if (var6 != 5) {
                           var21.append("#");
                        } else {
                           appendImage$default(
                              var2, var26, var1, ReactAsset.Link.getUri(var26), var91, var91, var221.getForegroundColor(), 0.0F, 0.0F, 192, null
                           );
                        }
                     } else {
                        appendImage$default(
                           var2, var26, var1, ReactAsset.ChannelBrowse.getUri(var26), var91, var91, var221.getForegroundColor(), 0.0F, 0.0F, 192, null
                        );
                     }
                  } else {
                     appendImage$default(
                        var2, var26, var1, ReactAsset.ChannelBrowse.getUri(var26), var91, var91, var221.getForegroundColor(), 0.0F, 0.0F, 192, null
                     );
                  }

                  var21.append(toSpannable$default(var211.getContent(), var22, null, 2, null));

                  for (int var72 = 0; var72 < 4; var72++) {
                     var26 = (Context)new Object[]{var154, var231, var181, var221}[var72];
                     if (var26 != null) {
                        var21.setSpan(var26, var5, var2.length(), 33);
                     }
                  }
               } else {
                  if (var173 !is CommandMentionContentNode) {
                     throw new p();
                  }

                  val var182: BackgroundSpan = makeMentionBackgroundSpan(var22, var12);
                  val var199: ForegroundColorSpan = new ForegroundColorSpan(var10);
                  val var222: ClickableSpan = new ClickableSpan(null, -1, null, new Function1(var22, var27) {
                     final ContentNode $contentNode;
                     final RenderContext $rc;

                     {
                        super(1);
                        this.$rc = var1;
                        this.$contentNode = var2;
                     }

                     public final java.lang.Boolean invoke(View var1) {
                        q.h(var1, "it");
                        this.$rc.getOnLongPressCommand().invoke(this.$contentNode);
                        return java.lang.Boolean.TRUE;
                     }
                  }, new Function1(var22, var27) {
                     final ContentNode $contentNode;
                     final RenderContext $rc;

                     {
                        super(1);
                        this.$rc = var1;
                        this.$contentNode = var2;
                     }

                     public final void invoke(View var1) {
                        q.h(var1, "it");
                        this.$rc.getOnTapCommand().invoke(this.$contentNode);
                     }
                  }, 5, null);
                  val var155: GGSansBoldSpan = new GGSansBoldSpan(var1.getContext());
                  var6 = var2.length();
                  val var92: Int = var2.length();
                  var21.append("/");
                  var21.append(toSpannable$default((var27 as CommandMentionContentNode).getContent(), var22, null, 2, null));

                  for (int var40 = 0; var40 < 3; var40++) {
                     var27 = (ContentNode)new Object[]{var222, var182, var199}[var40];
                     if (var27 != null) {
                        var21.setSpan(var27, var92, var2.length(), 33);
                     }
                  }

                  var23 = (Integer)new Object[]{var155}[0];
                  if (var23 != null) {
                     var21.setSpan(var23, var6, var2.length(), 33);
                  }
               }

               ForceExhaustiveKt.forceExhaustive(var2);
            }

            var5 = 0;
         }

         var132 = var21;
         var119 = var22;
      }

      var7++;
      var21 = var132;
      var22 = var119;
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
   var20: Function0,
   var21: Boolean,
   var22: DiscordThemeObject,
   var23: Float,
   var24: java.lang.Float,
   var25: Int,
   var26: Any
): DraweeSpanStringBuilder {
   if ((var25 and 128) != 0) {
      var8 = <unrepresentable>.INSTANCE;
   }

   if ((var25 and 256) != 0) {
      var9 = <unrepresentable>.INSTANCE;
   }

   if ((var25 and 512) != 0) {
      var10 = <unrepresentable>.INSTANCE;
   }

   if ((var25 and 1024) != 0) {
      var11 = <unrepresentable>.INSTANCE;
   }

   if ((var25 and 2048) != 0) {
      var12 = <unrepresentable>.INSTANCE;
   }

   if ((var25 and 4096) != 0) {
      var13 = <unrepresentable>.INSTANCE;
   }

   if ((var25 and 8192) != 0) {
      var14 = <unrepresentable>.INSTANCE;
   }

   if ((var25 and 16384) != 0) {
      var15 = <unrepresentable>.INSTANCE;
   }

   if (('耀' and var25) != 0) {
      var16 = <unrepresentable>.INSTANCE;
   }

   if ((65536 and var25) != 0) {
      var17 = <unrepresentable>.INSTANCE;
   }

   if ((131072 and var25) != 0) {
      var18 = <unrepresentable>.INSTANCE;
   }

   if ((262144 and var25) != 0) {
      var19 = <unrepresentable>.INSTANCE;
   }

   if ((524288 and var25) != 0) {
      var20 = <unrepresentable>.INSTANCE;
   }

   if ((1048576 and var25) != 0) {
      var21 = false;
   }

   if ((2097152 and var25) != 0) {
      var22 = ThemeManagerKt.getTheme();
   }

   if ((4194304 and var25) != 0) {
      var23 = -1.0F;
   }

   if ((var25 and 8388608) != 0) {
      var24 = null;
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
      (Function0)var20,
      var21,
      var22,
      var23,
      var24
   );
}

@JvmSynthetic
fun `toSpannable$default`(var0: java.util.List, var1: RenderContext, var2: DraweeSpanStringBuilder, var3: Int, var4: Any): DraweeSpanStringBuilder {
   if ((var3 and 2) != 0) {
      var2 = new DraweeSpanStringBuilder();
   }

   return toSpannable(var0, var1, var2);
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

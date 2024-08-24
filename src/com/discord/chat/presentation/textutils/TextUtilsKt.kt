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
import androidx.core.graphics.f0
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
import com.discord.react_gesture_handler.nested_touch.NestedClickableSpan.TouchPriority
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
import com.discord.theme.ThemeManagerKt
import com.discord.theme.R.color
import com.discord.theme.utils.ColorUtilsKt
import com.facebook.drawee.backends.pipeline.PipelineDraweeControllerBuilder
import com.facebook.drawee.drawable.ScalingUtils.ScaleType
import com.facebook.drawee.generic.GenericDraweeHierarchyBuilder
import com.facebook.drawee.span.DraweeSpanStringBuilder
import com.facebook.imagepipeline.request.ImageRequestBuilder
import eh.p
import java.util.ArrayList
import kotlin.jvm.functions.Function0
import kotlin.jvm.functions.Function1
import kotlin.jvm.functions.Function2
import kotlin.jvm.functions.Function3
import kotlin.jvm.functions.Function4
import kotlin.jvm.internal.r

private const val CHANNEL_PREFIX: String = "#"
private const val COMMAND_PREFIX: String = "/"

@JvmSynthetic
fun `access$appendToExistingBuilder`(var0: java.util.List, var1: RenderContext, var2: DraweeSpanStringBuilder) {
   appendToExistingBuilder(var0, var1, var2);
}

private fun DraweeSpanStringBuilder.appendBulletPoint(content: List<ContentNode>, rc: RenderContext, isOrderedList: Boolean) {
   var var5: Int = SizeUtilsKt.getDpToPx(8);
   val var6: Int = var2.getListNestedLevel();
   val var14: Standard = new Standard(SizeUtilsKt.getDpToPx(var6 * 16));
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
         appendToExistingBuilder(kotlin.collections.h.d(new TextContentNode(var23.toString())), var2, var0);
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

      appendToExistingBuilder(kotlin.collections.h.d(new TextContentNode(var25)), var2, var0);
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
   r.h(var0, "<this>");
   r.h(var1, "context");
   r.h(var2, "rc");
   r.h(var3, "imageUrl");
   val var9: Int = var0.length();
   var0.append('\u200b');
   val var13: com.facebook.drawee.controller.a = (l4.c.g().D(ImageRequestBuilder.s(Uri.parse(ReactAssetUtilsKt.getReactImageUrl(var1, var3))).a()) as PipelineDraweeControllerBuilder)
      .c();
   r.g(var13, "newDraweeControllerBuild…build())\n        .build()");
   val var11: GenericDraweeHierarchyBuilder = GenericDraweeHierarchyBuilder.u(var1.getResources()).w(ScaleType.e);
   val var10: com.facebook.drawee.generic.a = com.facebook.drawee.generic.a.a(var7);
   var10.r(var8);
   var10.u(com.facebook.drawee.generic.a.a.k);
   var11.K(var10);
   if (var2.spoilerIsHidden()) {
      var11.v(new PorterDuffColorFilter(var2.getTheme().getSpoilerHiddenBackground(), Mode.SRC_IN));
   } else if (var6 != null) {
      var11.v(new PorterDuffColorFilter(var6, Mode.SRC_IN));
   }

   r.g(var11, "newInstance(context.reso…)\n            }\n        }");
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
   r.h(var0, "paint");
   val var2: Float = var0.getTextSize();
   var0.setTextSize((float)var1);
   val var4: FontMetrics = var0.getFontMetrics();
   r.g(var4, "paint.fontMetrics");
   val var3: Float = getBaselineHeightPx(var4);
   var0.setTextSize(var2);
   return var3;
}

public fun getBaselineHeightPx(fontMetrics: FontMetrics): Float {
   r.h(var0, "fontMetrics");
   return var0.descent - var0.ascent;
}

private fun getIconPaddingMultiplier(iconType: String): Float {
   val var2: Boolean;
   if (r.c(var0, "post")) {
      var2 = true;
   } else {
      var2 = r.c(var0, "forum");
   }

   val var1: Float;
   if (var2) {
      var1 = 0.2F;
   } else {
      var1 = 0.0F;
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
   r.h(var0, "<this>");
   r.h(var1, "context");
   r.h(var2, "containerId");
   r.h(var7, "paint");
   r.h(var8, "onLinkClicked");
   r.h(var9, "onLongTapLink");
   r.h(var10, "onTapChannel");
   r.h(var11, "onLongPressChannel");
   r.h(var12, "onTapAttachmentLink");
   r.h(var13, "onLongPressAttachmentLink");
   r.h(var14, "onTapMention");
   r.h(var15, "onTapCommand");
   r.h(var16, "onLongPressCommand");
   r.h(var17, "onTapTimestamp");
   r.h(var18, "onTapEmoji");
   r.h(var19, "linkStyle");
   r.h(var20, "onTapSpoiler");
   r.h(var22, "theme");
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
   var var21: RenderContext = var1;
   var var22: DraweeSpanStringBuilder = var2;
   val var25: java.util.Iterator = var0.iterator();
   var var5: Int = 0;

   for (int var7 = 0; var25.hasNext(); var7++) {
      var var23: Int = (Integer)var25.next();
      if (var7 < 0) {
         kotlin.collections.h.s();
      }

      var var27: ContentNode = var23 as ContentNode;
      var var6: Byte;
      if (var7 == kotlin.collections.h.k(var0)) {
         var6 = 1;
      } else {
         var6 = var5;
      }

      var var26: Context = var1.getContext();
      var23 = new BackgroundColorSpan(var1.getTheme().getBackgroundSecondary());
      var var28: RelativeSizeSpan = new RelativeSizeSpan(0.85F);
      var var24: DiscordFontSpan = new DiscordFontSpan(var26, DiscordFont.CodeNormal);
      val var13: Int = ColorUtilsKt.getThemeColor(var26, R.color.chat_mentions_background_light, R.color.chat_mentions_background_dark, var1.getTheme());
      val var10: Int = ColorUtilsKt.getThemeColor(var26, R.color.chat_mentions_foreground_light, R.color.chat_mentions_foreground_dark, var1.getTheme());
      var var8: Int = color.green_330;
      val var12: Int = f0.k(ColorUtilsKt.getThemeColor(var26, color.green_330, color.green_330, var1.getTheme()), 25);
      val var11: Int = ColorUtilsKt.getThemeColor(var26, var8, var8, var1.getTheme());
      if (var27 is BlockQuoteContentNode) {
         if (var1.getSingleLine()) {
            var22.append("> ");
            appendToExistingBuilder((var27 as BlockQuoteContentNode).getContent(), var21, var22);
         } else {
            var23 = new QuoteSpan(var1.getTheme().getInteractiveMuted(), SizeUtilsKt.getDpToPx(3), SizeUtilsKt.getDpToPx(8));
            val var177: Array<Any> = new Object[1];
            var177[var5] = var23;
            var6 = var2.length();
            appendToExistingBuilder(
               (var27 as BlockQuoteContentNode).getContent(), var21.updateInsets(new Function1<RenderContext.Insets, RenderContext.Insets>((QuoteSpan)var23) {
                  final QuoteSpan $quote;

                  {
                     super(1);
                     this.$quote = var1;
                  }

                  public final RenderContext.Insets invoke(RenderContext.Insets var1) {
                     r.h(var1, "$this$updateInsets");
                     return RenderContext.Insets.copy$default(var1, 0, 0, var1.getStart() + this.$quote.getInsetStart(), 0, 11, null);
                  }
               }), var22
            );
            var23 = var177[var5];
            if (var177[var5] != null) {
               var22.setSpan(var23, var6, var2.length(), 13107233);
            }
         }
      } else if (var27 is CodeBlockContentNode) {
         if (var1.getSingleLine()) {
            val var204: Array<Any> = new Object[3];
            var204[var5] = var23;
            var204[1] = var28;
            var204[2] = var24;
            var8 = var2.length();
            var22.append(kotlin.text.f.D((var27 as CodeBlockContentNode).getContent(), '\n', ' ', false, 4, null));

            for (int var82 = var5; var82 < 3; var82++) {
               var23 = var204[var82];
               if (var204[var82] != null) {
                  var22.setSpan(var23, var8, var2.length(), 33);
               }
            }
         } else {
            CodeStyle.INSTANCE.renderCodeBlock(var22, var27 as CodeBlockContentNode, var21);
         }
      } else if (var27 is EmojiContentNode) {
         EmojiRendererKt.renderEmoji(var22, var27 as EmojiContentNode, var21);
      } else if (var27 is EmphasisContentNode) {
         var23 = var1.getContext();
         val var176: Array<Any> = new Object[1];
         var176[var5] = new GGSansItalicSpan((Context)var23);
         var6 = var2.length();
         appendToExistingBuilder((var27 as EmphasisContentNode).getContent(), var21, var22);
         var23 = var176[var5];
         if (var176[var5] != null) {
            var22.setSpan(var23, var6, var2.length(), 33);
         }
      } else if (var27 is InlineCodeContentNode) {
         val var203: Array<Any> = new Object[3];
         var203[var5] = var23;
         var203[1] = var28;
         var203[2] = var24;
         var8 = var2.length();
         var22.append((var27 as InlineCodeContentNode).getContent());

         for (int var80 = var5; var80 < 3; var80++) {
            var23 = var203[var80];
            if (var203[var80] != null) {
               var22.setSpan(var23, var8, var2.length(), 33);
            }
         }
      } else {
         var var19: Boolean;
         if (var27 is LineBreakContentNode) {
            var19 = true;
         } else {
            var19 = var27 is NewLineContentNode;
         }

         if (var19) {
            var22.append("\n");
         } else {
            if (var27 is LinkContentNode) {
               label546: {
                  var175 = var1.getLinkStyle().invoke(var27) as LinkStyle;
                  var224 = var27 as LinkContentNode;
                  if (r.c((var27 as LinkContentNode).getTarget(), "usernameOnClick")) {
                     val var149: LinkContext = var224.getContext();
                     if (var149 != null) {
                        val var150: UserNameOnClick = var149.getUsernameOnClick();
                        if (var150 != null) {
                           var23 = var150.getLinkColor();
                           break label546;
                        }
                     }
                  }

                  var23 = null;
               }

               if (var23 != null) {
                  var6 = var23;
               } else {
                  var6 = var175.getLinkColor();
               }

               val var215: ClickableSpan = new ClickableSpan(null, var6, var1.getShowLinkDecorations(), new Function1<View, java.lang.Boolean>(var27, var21) {
                  final ContentNode $contentNode;
                  final RenderContext $rc;

                  {
                     super(1);
                     this.$contentNode = var1;
                     this.$rc = var2;
                  }

                  public final java.lang.Boolean invoke(View var1) {
                     r.h(var1, "it");
                     val var2: Boolean;
                     if ((this.$contentNode as LinkContentNode).isUrl()) {
                        this.$rc.getOnLongTapLink().invoke(this.$contentNode);
                        var2 = true;
                     } else {
                        var2 = false;
                     }

                     return var2;
                  }
               }, new Function1<View, Unit>(var21, var27) {
                  final ContentNode $contentNode;
                  final RenderContext $rc;

                  {
                     super(1);
                     this.$rc = var1;
                     this.$contentNode = var2;
                  }

                  public final void invoke(View var1) {
                     r.h(var1, "it");
                     this.$rc.getOnTapLink().invoke(this.$contentNode);
                  }
               }, 1, null);
               val var227: LinkBackgroundStyle = var175.getBackgroundStyle();
               var var79: Byte;
               val var154: BackgroundSpan;
               if (var227 != null) {
                  var23 = var227.getColor();
                  if (var23 != null) {
                     var79 = var23;
                  } else {
                     var79 = var5;
                  }

                  var23 = var227.getBorderRadius();
                  if (var23 != null) {
                     var8 = var23;
                  } else {
                     var8 = var5;
                  }

                  var154 = new BackgroundSpan(new BackgroundStyle(var79, var8));
                  val var228: java.lang.Boolean = var227.getSpaceAround();
                  if (var228 != null) {
                     var79 = var228;
                  } else {
                     var79 = var5;
                  }
               } else {
                  var154 = null;
                  var79 = var5;
               }

               val var232: DiscordFontSpan = new DiscordFontSpan(var1.getContext(), var175.getFont());
               val var230: Array<Any> = new Object[3];
               var230[var5] = var215;
               var230[1] = var232;
               var230[2] = var154;
               var8 = var2.length();
               if (var79 != 0) {
                  var22.append(' ');
               }

               var5 = getIconSize(null, var1.getBaselineHeightPx());
               val var155: ReactAsset = var175.getIcon();
               if (var155 != null) {
                  appendImage$default(var2, var26, var1, var155.getUri(var26), var5, var5, var175.getLinkColor(), 0.0F, 0.0F, 192, null);
                  var22.append(' ');
               }

               appendToExistingBuilder(var224.getContent(), var21, var22);
               if (var79 != 0) {
                  var22.append(' ');
               }

               for (int var62 = 0; var62 < 3; var62++) {
                  var23 = (Integer)var230[var62];
                  if (var230[var62] != null) {
                     var22.setSpan(var23, var8, var2.length(), 33);
                  }
               }
            } else if (var27 is MentionContentNode) {
               val var144: DiscordFontSpan = new DiscordFontSpan(var1.getContext(), DiscordFont.PrimarySemibold);
               val var29: MentionContentNode = var27 as MentionContentNode;
               if (var27 as MentionContentNode is UserOrRoleMentionContentNode) {
                  val var174: ClickableSpan = new ClickableSpan(null, -1, null, null, new Function1<View, Unit>(var21, var27) {
                     final ContentNode $contentNode;
                     final RenderContext $rc;

                     {
                        super(1);
                        this.$rc = var1;
                        this.$contentNode = var2;
                     }

                     public final void invoke(View var1) {
                        r.h(var1, "it");
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
                  val var223: UserOrRoleMentionContentNode = var27 as UserOrRoleMentionContentNode;
                  val var14: Int = (var27 as UserOrRoleMentionContentNode).getRoleColor();
                  val var94: Boolean;
                  if (var1.getShouldShowRoleDot() && var14 > 0) {
                     var94 = true;
                  } else {
                     var94 = false;
                  }

                  val var100: Boolean;
                  if (var1.getShouldShowRoleOnName() && var14 > 0) {
                     var100 = true;
                  } else {
                     var100 = false;
                  }

                  val var213: UserId = var223.getUserId-wUX8bhU();
                  val var101: Long = UserId.constructor-impl(1081004946872352958L);
                  if (var213 == null) {
                     var19 = false;
                  } else {
                     var19 = UserId.equals-impl0(var213.unbox-impl(), var101);
                  }

                  if (var19) {
                     var5 = var12;
                  } else {
                     var5 = var13;
                     if (var100) {
                        var5 = f0.k(var14, 25);
                     }
                  }

                  val var214: BackgroundSpan = makeMentionBackgroundSpan(var21, var5);
                  if (var19) {
                     var6 = var11;
                  } else {
                     var6 = var10;
                     if (var100) {
                        var6 = f0.k(var14, 255);
                     }
                  }

                  val var226: ForegroundColorSpan = new ForegroundColorSpan(var6);
                  var6 = var2.length();
                  if (var94) {
                     val var201: RoleDotSpan = new RoleDotSpan(var26, var5, 0, 4, null);
                     var201.setColor(var223.getRoleColor());
                     var22.append("#");
                     var22.setSpan(var201, var2.length() - 1, var2.length(), 33);
                  }

                  var22.append(toSpannable$default(var223.getContent(), var21, null, 2, null));

                  for (int var60 = 0; var60 < 4; var60++) {
                     var26 = (Context)new Object[]{var144, var174, var214, var226}[var60];
                     if (var26 != null) {
                        var22.setSpan(var26, var6, var2.length(), 33);
                     }
                  }
               } else if (var29 is ChannelMentionContentNode) {
                  val var222: ClickableSpan = new ClickableSpan(
                     null,
                     -1,
                     null,
                     new Function1<View, java.lang.Boolean>(var21, var27) {
                        final ContentNode $contentNode;
                        final RenderContext $rc;

                        {
                           super(1);
                           this.$rc = var1;
                           this.$contentNode = var2;
                        }

                        public final java.lang.Boolean invoke(View var1) {
                           r.h(var1, "it");
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
                     new Function1<View, Unit>(var21, var27) {
                        final ContentNode $contentNode;
                        final RenderContext $rc;

                        {
                           super(1);
                           this.$rc = var1;
                           this.$contentNode = var2;
                        }

                        public final void invoke(View var1) {
                           r.h(var1, "it");
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
                  val var173: BackgroundSpan = makeMentionBackgroundSpan(var21, var13);
                  val var231: ForegroundColorSpan = new ForegroundColorSpan(var10);
                  var6 = var2.length();
                  val var212: java.util.List = (var27 as ChannelMentionContentNode).getInContent();
                  if (var212 != null) {
                     appendToExistingBuilder(var212, var21, var22);
                     var5 = getIconSize("_caret", var1.getBaselineHeightPx());
                     appendImage$default(var2, var26, var1, ReactAsset.Caret.getUri(var26), var5, var5, var231.getForegroundColor(), 0.0F, 0.0F, 192, null);
                  }

                  val var198: java.util.List = var29.getContent();
                  if (var198 != null) {
                     appendToExistingBuilder(var198, var21, var22);
                  }

                  for (int var58 = 0; var58 < 4; var58++) {
                     var26 = (Context)new Object[]{var144, var222, var173, var231}[var58];
                     if (var26 != null) {
                        var22.setSpan(var26, var6, var2.length(), 33);
                     }
                  }
               } else if (var29 is AttachmentLinkContentNode) {
                  val var221: ClickableSpan = new ClickableSpan(
                     null,
                     -1,
                     null,
                     new Function1<View, java.lang.Boolean>(var21, var27) {
                        final ContentNode $contentNode;
                        final RenderContext $rc;

                        {
                           super(1);
                           this.$rc = var1;
                           this.$contentNode = var2;
                        }

                        public final java.lang.Boolean invoke(View var1) {
                           r.h(var1, "it");
                           this.$rc
                              .getOnLongPressAttachmentLink()
                              .invoke(
                                 (this.$contentNode as AttachmentLinkContentNode).getAttachmentUrl(),
                                 (this.$contentNode as AttachmentLinkContentNode).getAttachmentName()
                              );
                           return java.lang.Boolean.TRUE;
                        }
                     },
                     new Function1<View, Unit>(var21, var27) {
                        final ContentNode $contentNode;
                        final RenderContext $rc;

                        {
                           super(1);
                           this.$rc = var1;
                           this.$contentNode = var2;
                        }

                        public final void invoke(View var1) {
                           r.h(var1, "it");
                           this.$rc.getOnTapAttachmentLink().invoke((this.$contentNode as AttachmentLinkContentNode).getAttachmentUrl());
                        }
                     },
                     5,
                     null
                  );
                  val var172: BackgroundSpan = makeMentionBackgroundSpan(var21, var13);
                  val var211: ForegroundColorSpan = new ForegroundColorSpan(var10);
                  var6 = var2.length();
                  var5 = getIconSize(null, var1.getBaselineHeightPx());
                  appendImage$default(var2, var26, var1, ReactAsset.Attachment.getUri(var26), var5, var5, var211.getForegroundColor(), 0.0F, 0.0F, 192, null);
                  var22.append(' ');
                  val var194: java.util.List = var29.getContent();
                  if (var194 != null) {
                     appendToExistingBuilder(var194, var21, var22);
                  }

                  for (int var56 = 0; var56 < 4; var56++) {
                     var26 = (Context)new Object[]{var144, var221, var172, var211}[var56];
                     if (var26 != null) {
                        var22.setSpan(var26, var6, var2.length(), 33);
                     }
                  }
               } else if (var29 is StaticChannelMentionContentNode) {
                  val var225: ClickableSpan = new ClickableSpan(
                     null,
                     -1,
                     null,
                     null,
                     new Function1<View, Unit>(var21, var27) {
                        final ContentNode $contentNode;
                        final RenderContext $rc;

                        {
                           super(1);
                           this.$rc = var1;
                           this.$contentNode = var2;
                        }

                        public final void invoke(View var1) {
                           r.h(var1, "it");
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
                  val var30: BackgroundSpan = makeMentionBackgroundSpan(var21, var13);
                  val var220: ForegroundColorSpan = new ForegroundColorSpan(var10);
                  var8 = getIconSize(null, var1.getBaselineHeightPx());
                  val var171: Array<Any> = new Object[]{var144, var225, var30, var220};
                  var5 = var2.length();
                  val var147: StaticChannelMentionContentNode = var27 as StaticChannelMentionContentNode;
                  var6 = TextUtilsKt.WhenMappings.$EnumSwitchMapping$0[(var27 as StaticChannelMentionContentNode).getId().ordinal()];
                  if (var6 == 1 || var6 == 2) {
                     appendImage$default(var2, var26, var1, ReactAsset.Home.getUri(var26), var8, var8, var220.getForegroundColor(), 0.0F, 0.0F, 192, null);
                  } else if (var6 != 3) {
                     if (var6 != 4) {
                        if (var6 != 5) {
                           var22.append("#");
                        } else {
                           appendImage$default(var2, var26, var1, ReactAsset.Link.getUri(var26), var8, var8, var220.getForegroundColor(), 0.0F, 0.0F, 192, null);
                        }
                     } else {
                        appendImage$default(
                           var2, var26, var1, ReactAsset.ChannelBrowse.getUri(var26), var8, var8, var220.getForegroundColor(), 0.0F, 0.0F, 192, null
                        );
                     }
                  } else {
                     appendImage$default(
                        var2, var26, var1, ReactAsset.ChannelBrowse.getUri(var26), var8, var8, var220.getForegroundColor(), 0.0F, 0.0F, 192, null
                     );
                  }

                  var22.append(toSpannable$default(var147.getContent(), var21, null, 2, null));

                  for (int var72 = 0; var72 < 4; var72++) {
                     var23 = (Integer)var171[var72];
                     if (var171[var72] != null) {
                        var22.setSpan(var23, var5, var2.length(), 33);
                     }
                  }
               } else {
                  if (var29 !is CommandMentionContentNode) {
                     throw new p();
                  }

                  val var219: BackgroundSpan = makeMentionBackgroundSpan(var21, var13);
                  val var145: ForegroundColorSpan = new ForegroundColorSpan(var10);
                  val var170: ClickableSpan = new ClickableSpan(null, -1, null, new Function1<View, java.lang.Boolean>(var21, var27) {
                     final ContentNode $contentNode;
                     final RenderContext $rc;

                     {
                        super(1);
                        this.$rc = var1;
                        this.$contentNode = var2;
                     }

                     public final java.lang.Boolean invoke(View var1) {
                        r.h(var1, "it");
                        this.$rc.getOnLongPressCommand().invoke(this.$contentNode);
                        return java.lang.Boolean.TRUE;
                     }
                  }, new Function1<View, Unit>(var21, var27) {
                     final ContentNode $contentNode;
                     final RenderContext $rc;

                     {
                        super(1);
                        this.$rc = var1;
                        this.$contentNode = var2;
                     }

                     public final void invoke(View var1) {
                        r.h(var1, "it");
                        this.$rc.getOnTapCommand().invoke(this.$contentNode);
                     }
                  }, 5, null);
                  val var188: GGSansBoldSpan = new GGSansBoldSpan(var1.getContext());
                  var8 = var2.length();
                  var6 = var2.length();
                  var22.append("/");
                  var22.append(toSpannable$default((var27 as CommandMentionContentNode).getContent(), var21, null, 2, null));

                  for (int var53 = 0; var53 < 3; var53++) {
                     var27 = (ContentNode)new Object[]{var170, var219, var145}[var53];
                     if (var27 != null) {
                        var22.setSpan(var27, var6, var2.length(), 33);
                     }
                  }

                  var23 = (Integer)new Object[]{var188}[0];
                  if (var23 != null) {
                     var22.setSpan(var23, var8, var2.length(), 33);
                  }
               }

               ForceExhaustiveKt.forceExhaustive(var2);
            } else {
               var var136: ClickableSpan = null;
               if (var27 is ParagraphContentNode) {
                  appendToExistingBuilder((var27 as ParagraphContentNode).getContent(), var21, var22);
                  if (var6 == 0) {
                     var22.append("\n\n");
                  }
               } else if (var27 is SpoilerContentNode) {
                  val var168: SpoilerContentNode = var27 as SpoilerContentNode;
                  val var187: java.lang.String = SpoilerIdentifier.Companion.forNode-2sfwrmE(var27 as SpoilerContentNode, var1.getContainerId(), var7);
                  var19 = SpoilerManager.INSTANCE.isRevealed-V2PEE7g(var187);
                  val var133: RenderContext.SpoilerState;
                  if (var19) {
                     var133 = RenderContext.SpoilerState.Revealed;
                  } else {
                     var133 = RenderContext.SpoilerState.Hidden;
                  }

                  if (!var19) {
                     var136 = new ClickableSpan(TouchPriority.HIGH, null, null, null, new Function1<View, Unit>(var187, var21) {
                        final java.lang.String $id;
                        final RenderContext $rc;

                        {
                           super(1);
                           this.$id = var1;
                           this.$rc = var2;
                        }

                        public final void invoke(View var1) {
                           r.h(var1, "it");
                           SpoilerManager.INSTANCE.markRevealed-V2PEE7g(this.$id);
                           this.$rc.getOnTapSpoiler().invoke();
                        }
                     }, 14, null);
                  }

                  val var111: SpoilerSpan = new SpoilerSpan(var19, var1.getTheme().getSpoilerHiddenBackground(), var1.getTheme().getSpoilerRevealedBackground());
                  var5 = var2.length();
                  appendToExistingBuilder(
                     var168.getContent(),
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
                        var133,
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

                  for (int var69 = 0; var69 < 2; var69++) {
                     val var134: Any = new Object[]{var136, var111}[var69];
                     if (var134 != null) {
                        var2.setSpan(var134, var5, var2.length(), 33);
                     }
                  }

                  var21 = var1;
                  var22 = var2;
               } else {
                  label642: {
                     var var107: DraweeSpanStringBuilder = var22;
                     if (var27 is StrikethroughContentNode) {
                        val var112: StrikethroughSpan = new StrikethroughSpan();
                        var5 = var2.length();
                        appendToExistingBuilder((var27 as StrikethroughContentNode).getContent(), var1, var22);
                        val var113: Any = new Object[]{var112}[0];
                        if (var113 != null) {
                           var22.setSpan(var113, var5, var2.length(), 33);
                        }
                     } else if (var27 is SubtextContentNode) {
                        if (var1.getSingleLine()) {
                           appendToExistingBuilder((var27 as SubtextContentNode).getContent(), var1, var22);
                           if (var6 == 0) {
                              simulateInlineNewline(var2);
                           }
                        } else {
                           val var34: Byte;
                           if (FontManager.INSTANCE.getIsClassicChatFontScaleEnabled(var26)) {
                              var34 = 13;
                           } else {
                              var34 = 14;
                           }

                           changeTextSizeSp(
                              var22,
                              var34,
                              var1,
                              new Function2<DraweeSpanStringBuilder, RenderContext, Unit>(
                                 var22, new ForegroundColorSpan(var1.getTheme().getTextMuted()), var27, (boolean)var6
                              ) {
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
                                    r.h(var1, "$this$changeTextSizeSp");
                                    r.h(var2, "updatedRC");
                                    var1 = this.$builder;
                                    val var6: ForegroundColorSpan = this.$fontColorSpan;
                                    val var5: ContentNode = this.$contentNode;
                                    val var4: Boolean = this.$isLastContentNode;
                                    val var3: Int = this.$builder.length();
                                    TextUtilsKt.access$appendToExistingBuilder((var5 as SubtextContentNode).getContent(), var2, var1);
                                    if (!var4) {
                                       SpannableStringBuilderExtensionsKt.ensureNewline$default(var1, null, 1, null);
                                    }

                                    val var8: Any = new Object[]{var6}[0];
                                    if (var8 != null) {
                                       var1.setSpan(var8, var3, var1.length(), 13107233);
                                    }
                                 }
                              }
                           );
                        }
                     } else {
                        var19 = var27 is HeadingContentNode;
                        var var35: Int = 16;
                        if (var19) {
                           val var114: DiscordFontSpan = new DiscordFontSpan(var1.getContext(), DiscordFont.PrimaryExtraBold);
                           if (var1.getSingleLine()) {
                              var35 = var2.length();
                              appendToExistingBuilder((var27 as HeadingContentNode).getContent(), var1, var22);
                              simulateInlineNewline(var2);
                              val var115: Any = new Object[]{var114}[0];
                              if (var115 != null) {
                                 var22.setSpan(var115, var35, var2.length(), 33);
                              }
                           } else {
                              var8 = (var27 as HeadingContentNode).getLevel();
                              if (var8 != 1) {
                                 if (var8 == 2) {
                                    var35 = 20;
                                 }
                              } else {
                                 var35 = 24;
                              }

                              var var86: Boolean;
                              if (var2.length() > 0) {
                                 var86 = 1;
                              } else {
                                 var86 = 0;
                              }

                              if (var86) {
                                 var86 = SizeUtilsKt.getDpToPx(8);
                              } else {
                                 var86 = SizeUtilsKt.getDpToPx(4);
                              }

                              val var137: AbsoluteSizeSpan = new AbsoluteSizeSpan(var86);
                              var86 = var2.length();
                              var22.append("\n");
                              var23 = (Integer)new Object[]{var137}[0];
                              if (var23 != null) {
                                 var22.setSpan(var23, var86, var2.length(), 33);
                              }

                              var86 = var2.length();
                              changeTextSizeSp(var22, var35, var1, new Function2<DraweeSpanStringBuilder, RenderContext, Unit>(var27, var22) {
                                 final DraweeSpanStringBuilder $builder;
                                 final ContentNode $contentNode;

                                 {
                                    super(2);
                                    this.$contentNode = var1;
                                    this.$builder = var2;
                                 }

                                 public final void invoke(DraweeSpanStringBuilder var1, RenderContext var2) {
                                    r.h(var1, "$this$changeTextSizeSp");
                                    r.h(var2, "updatedRc");
                                    TextUtilsKt.access$appendToExistingBuilder((this.$contentNode as HeadingContentNode).getContent(), var2, this.$builder);
                                 }
                              });
                              var var116: Any = new Object[]{var114}[0];
                              if (var116 != null) {
                                 var22.setSpan(var116, var86, var2.length(), 33);
                              }

                              if (var6 == 0) {
                                 var116 = new AbsoluteSizeSpan(SizeUtilsKt.getDpToPx(4));
                                 var35 = var2.length();
                                 var22.append("\n");
                                 var116 = new Object[]{var116}[0];
                                 if (var116 != null) {
                                    var22.setSpan(var116, var35, var2.length(), 33);
                                 }
                              } else {
                                 var116 = new AbsoluteSizeSpan(0);
                                 var35 = var2.length();
                                 var22.append("\n\u200b");
                                 var116 = new Object[]{var116}[0];
                                 if (var116 != null) {
                                    var22.setSpan(var116, var35, var2.length(), 33);
                                 }
                              }
                           }
                        } else {
                           if (var27 !is LHeadingContentNode) {
                              if (var27 !is BulletListContentNode) {
                                 if (var27 is StrongContentNode) {
                                    val var125: GGSansBoldSpan = new GGSansBoldSpan(var1.getContext());
                                    var35 = var2.length();
                                    appendToExistingBuilder((var27 as StrongContentNode).getContent(), var1, var22);
                                    val var126: Any = new Object[]{var125}[0];
                                    if (var126 != null) {
                                       var22.setSpan(var126, var35, var2.length(), 33);
                                    }
                                 } else if (var27 is TextContentNode) {
                                    val var127: java.lang.String = (var27 as TextContentNode).getContent();
                                    if (var127 != null) {
                                       var22.append(var127);
                                    }
                                 } else if (var27 is TimestampContentNode) {
                                    val var128: ClickableSpan = new ClickableSpan(
                                       null,
                                       ColorUtilsKt.getThemeColor(var26, color.primary_600, color.primary_200, var1.getTheme()),
                                       null,
                                       null,
                                       new Function1<View, Unit>(var1, var27) {
                                          final ContentNode $contentNode;
                                          final RenderContext $rc;

                                          {
                                             super(1);
                                             this.$rc = var1;
                                             this.$contentNode = var2;
                                          }

                                          public final void invoke(View var1) {
                                             r.h(var1, "it");
                                             this.$rc.getOnTapTimestamp().invoke((this.$contentNode as TimestampContentNode).getFull());
                                          }
                                       },
                                       13,
                                       null
                                    );
                                    val var142: BackgroundColorSpan = new BackgroundColorSpan(
                                       ColorUtilsKt.getThemeColor(
                                          var26, color.background_modifier_accent_light, color.background_modifier_accent_dark, var1.getTheme()
                                       )
                                    );
                                    var6 = var2.length();
                                    var22.append((var27 as TimestampContentNode).getFormatted());

                                    for (int var48 = 0; var48 < 2; var48++) {
                                       var24 = (DiscordFontSpan)new Object[]{var128, var142}[var48];
                                       if (var24 != null) {
                                          var107.setSpan(var24, var6, var2.length(), 33);
                                       }
                                    }
                                 } else {
                                    if (var27 !is UnderlineContentNode) {
                                       if (var27 is ChannelNameContentNode) {
                                          val var109: ChannelNameContentNode = var27 as ChannelNameContentNode;
                                          if ((var27 as ChannelNameContentNode).getIcon() != null) {
                                             var35 = getIconSize(var109.getIconType(), var1.getBaselineHeightPx());
                                             appendImage$default(
                                                var2,
                                                var26,
                                                var1,
                                                var109.getIcon(),
                                                var35,
                                                var35,
                                                var10,
                                                0.0F,
                                                (float)var35 * getIconPaddingMultiplier(var109.getIconType()),
                                                64,
                                                null
                                             );
                                          }

                                          appendToExistingBuilder(var109.getContent(), var1, var22);
                                          var5 = 0;
                                          var21 = var1;
                                       } else {
                                          val var167: DraweeSpanStringBuilder = var22;
                                          if (var27 is GuildNameContentNode) {
                                             var35 = getIconSize("_guild", var1.getBaselineHeightPx());
                                             val var131: GuildNameContentNode = var27 as GuildNameContentNode;
                                             if ((var27 as GuildNameContentNode).getIcon() != null) {
                                                appendImage$default(
                                                   var2, var26, var1, var131.getIcon(), var35, var35, null, (float)var35 * 0.2F, (float)var35 * 0.1F, 32, null
                                                );
                                             }

                                             var22.append(var131.getContent());
                                             var5 = 0;
                                             var21 = var1;
                                             var22 = var22;
                                          } else if (var27 is SoundmojiContentNode) {
                                             var22.append((var27 as SoundmojiContentNode).getSoundId());
                                             var5 = 0;
                                             var21 = var1;
                                             var22 = var22;
                                          } else {
                                             var5 = 0;
                                             var21 = var1;
                                             var22 = var22;
                                             if (var27 is ErrorContentNode) {
                                                CrashReporting.captureException$default(
                                                   CrashReporting.INSTANCE, (var27 as ErrorContentNode).getThrowable(), false, 2, null
                                                );
                                                var167.append("���");
                                                var22 = var167;
                                                var21 = var1;
                                                var5 = 0;
                                             }
                                          }
                                       }
                                       continue;
                                    }

                                    val var129: UnderlineSpan = new UnderlineSpan();
                                    var35 = var2.length();
                                    appendToExistingBuilder((var27 as UnderlineContentNode).getContent(), var1, var22);
                                    val var130: Any = new Object[]{var129}[0];
                                    if (var130 != null) {
                                       var22.setSpan(var130, var35, var2.length(), 33);
                                    }
                                 }

                                 var5 = 0;
                                 var21 = var1;
                                 var22 = var107;
                                 continue;
                              }

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
                              val var123: BulletListContentNode = var27 as BulletListContentNode;
                              val var20: Boolean = (var27 as BulletListContentNode).getOrdered();
                              val var15: Long;
                              if (var20) {
                                 val var140: java.lang.Long = var123.getStart();
                                 if (var140 != null) {
                                    var15 = var140;
                                 } else {
                                    var15 = 1L;
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
                                    false,
                                    false,
                                    false,
                                    false,
                                    false,
                                    null,
                                    null,
                                    0,
                                    null,
                                    (long)(var123.getItems().size() - 1) + var15,
                                    null,
                                    null,
                                    0.0F,
                                    null,
                                    520093695,
                                    null
                                 );
                              } else {
                                 var15 = 0L;
                              }

                              for (java.util.List var164 : var123.getItems()) {
                                 val var141: ArrayList = new ArrayList();
                                 var8 = var164.size();
                                 val var165: java.util.Iterator = var164.iterator();

                                 for (int var46 = 0; var165.hasNext(); var46++) {
                                    var26 = (Context)var165.next();
                                    if (var46 < 0) {
                                       kotlin.collections.h.s();
                                    }

                                    val var186: ContentNode = var26 as ContentNode;
                                    var19 = var26 as ContentNode is BulletListContentNode;
                                    val var66: Boolean;
                                    if (var46 == var8 - 1) {
                                       var66 = true;
                                    } else {
                                       var66 = false;
                                    }

                                    if (!var19) {
                                       var141.add(var186);
                                    }

                                    if (var19 || var66) {
                                       if (var20) {
                                          var var17: Long;
                                          if (var21.getListOrderedIndex() != null) {
                                             val var207: java.lang.Long = var21.getListOrderedIndex();
                                             if (var207 != null) {
                                                var17 = var207;
                                             } else {
                                                var17 = 0L;
                                             }

                                             var17++;
                                          } else {
                                             var17 = var15;
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

                                       appendBulletPoint(var2, var141, var21, var20);
                                       if (var1.getSingleLine()) {
                                          simulateInlineNewline(var2);
                                       }

                                       var141.clear();
                                    }

                                    if (var19) {
                                       appendToExistingBuilder(
                                          kotlin.collections.h.d(var186),
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

                              var21 = var1;
                              var22 = var2;
                              break label642;
                           }

                           val var121: DiscordFontSpan = new DiscordFontSpan(var1.getContext(), DiscordFont.PrimaryExtraBold);
                           if (!var1.getSingleLine()) {
                              var35 = FontManager.INSTANCE.getScaledSpToPx(16, var1.getContext());
                              val var3: Float = getBaselineHeightForFontSizePx(var1.getPaint(), var35);
                              val var178: AbsoluteSizeSpan = new AbsoluteSizeSpan(var35);
                              val var205: LHeadingContentNode = var27 as LHeadingContentNode;
                              if (kotlin.text.f.I((var27 as LHeadingContentNode).getClassName(), "added", false, 2, null)) {
                                 var35 = ThemeManagerKt.getTheme().getTextPositive();
                              } else if (kotlin.text.f.I(var205.getClassName(), "fixed", false, 2, null)) {
                                 var35 = ThemeManagerKt.getTheme().getTextDanger();
                              } else if (kotlin.text.f.I(var205.getClassName(), "progress", false, 2, null)) {
                                 var35 = ThemeManagerKt.getTheme().getTextWarning();
                              } else if (kotlin.text.f.I(var205.getClassName(), "improved", false, 2, null)) {
                                 var35 = ThemeManagerKt.getTheme().getTextBrand();
                              } else {
                                 var35 = ThemeManagerKt.getTheme().getHeaderPrimary();
                              }

                              val var163: ForegroundColorSpan = new ForegroundColorSpan(var35);
                              var var42: Boolean;
                              if (var2.length() > 0) {
                                 var42 = 1;
                              } else {
                                 var42 = 0;
                              }

                              if (var42) {
                                 var42 = SizeUtilsKt.getDpToPx(8);
                              } else {
                                 var42 = SizeUtilsKt.getDpToPx(4);
                              }

                              val var139: UnderlineSpan = new UnderlineSpan();
                              var8 = var2.length();
                              val var216: AbsoluteSizeSpan = new AbsoluteSizeSpan(var42);
                              var42 = var2.length();
                              var22.append("\n");
                              var28 = (RelativeSizeSpan)new Object[]{var216}[0];
                              if (var28 != null) {
                                 var22.setSpan(var28, var42, var2.length(), 33);
                              }

                              val var9: Int = var2.length();
                              val var218: java.util.List = var205.getContent();
                              var42 = var8;
                              val var206: RenderContext = RenderContext.copy$default(
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
                              var107 = var2;
                              appendToExistingBuilder(var218, var206, var2);
                              var26 = (Context)new Object[]{var178}[0];
                              if (var26 != null) {
                                 var2.setSpan(var26, var9, var2.length(), 33);
                              }

                              if (var6 == 0) {
                                 val var180: AbsoluteSizeSpan = new AbsoluteSizeSpan(SizeUtilsKt.getDpToPx(4));
                                 var6 = var2.length();
                                 var2.append("\n");
                                 var26 = (Context)new Object[]{var180}[0];
                                 if (var26 != null) {
                                    var2.setSpan(var26, var6, var2.length(), 33);
                                 }
                              } else {
                                 val var182: AbsoluteSizeSpan = new AbsoluteSizeSpan(0);
                                 var6 = var2.length();
                                 var2.append("\n\u200b");
                                 var26 = (Context)new Object[]{var182}[0];
                                 if (var26 != null) {
                                    var2.setSpan(var26, var6, var2.length(), 33);
                                 }
                              }

                              for (int var65 = 0; var65 < 3; var65++) {
                                 var26 = (Context)new Object[]{var121, var163, var139}[var65];
                                 if (var26 != null) {
                                    var107.setSpan(var26, var42, var2.length(), 33);
                                 }
                              }
                           } else {
                              var35 = var2.length();
                              appendToExistingBuilder((var27 as LHeadingContentNode).getContent(), var1, var22);
                              simulateInlineNewline(var2);
                              val var122: Any = new Object[]{var121}[0];
                              if (var122 != null) {
                                 var22.setSpan(var122, var35, var2.length(), 33);
                              }
                           }
                        }
                     }

                     var5 = 0;
                     var22 = var107;
                     var21 = var1;
                     continue;
                  }
               }
            }

            var5 = 0;
         }
      }
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
      (Function1<? super LinkContentNode, Unit>)var8,
      (Function1<? super LinkContentNode, Unit>)var9,
      (Function3<? super java.lang.String, ? super java.lang.String, ? super java.lang.String, Unit>)var10,
      (Function4<? super java.lang.String, ? super java.lang.String, ? super java.lang.String, ? super java.lang.String, Unit>)var11,
      (Function1<? super java.lang.String, Unit>)var12,
      (Function2<? super java.lang.String, ? super java.lang.String, Unit>)var13,
      (Function4<? super java.lang.String, ? super java.lang.String, ? super java.lang.String, ? super java.lang.String, Unit>)var14,
      (Function1<? super CommandMentionContentNode, Unit>)var15,
      (Function1<? super CommandMentionContentNode, Unit>)var16,
      (Function1<? super java.lang.String, Unit>)var17,
      (Function1<? super EmojiContentNode, Unit>)var18,
      (Function1<? super LinkContentNode, LinkStyle>)var19,
      (Function0<Unit>)var20,
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

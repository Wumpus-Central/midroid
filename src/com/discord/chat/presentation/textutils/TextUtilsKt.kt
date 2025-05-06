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
import kotlin.jvm.internal.q
import l8.p

private const val CHANNEL_PREFIX: String = "#"
private const val COMMAND_PREFIX: String = "/"

@JvmSynthetic
fun `access$appendToExistingBuilder`(var0: java.util.List, var1: RenderContext, var2: DraweeSpanStringBuilder) {
   appendToExistingBuilder(var0, var1, var2);
}

private fun DraweeSpanStringBuilder.appendBulletPoint(content: List<ContentNode>, rc: RenderContext, isOrderedList: Boolean) {
   val var7: Int = SizeUtilsKt.getDpToPx(8);
   val var8: Int = var2.getListNestedLevel();
   val var14: Standard = new Standard(SizeUtilsKt.getDpToPx(var8 * 16));
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
         appendToExistingBuilder(i.e(new TextContentNode(var23.toString())), var2, var0);
         appendToExistingBuilder(var1, var2, var0);
      } else {
         val var24: OrderedListBulletSpan = new OrderedListBulletSpan(var9, var7, var11, var2.getPaint());
         val var5: Int = var0.length();
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

      appendToExistingBuilder(i.e(new TextContentNode(var25)), var2, var0);
      appendToExistingBuilder(var1, var2, var0);
   } else {
      var var20: Int = SizeUtilsKt.getDpToPx(2);
      val var6: Int = ColorUtilsKt.getThemeColor(var2.getContext(), R.color.primary_360, R.color.primary_400, var2.getTheme());
      val var26: Style;
      if (var8 > 0) {
         var26 = Style.STROKE;
      } else {
         var26 = Style.FILL;
      }

      val var27: BulletSpan = new BulletSpan(var6, var7, false, var20, 0.0F, var26, 20, null);
      var20 = var0.length();
      appendToExistingBuilder(var1, var2, var0);
      SpannableStringBuilderExtensionsKt.ensureNewline(var0, new AbsoluteSizeSpan(var4));

      for (int var19 = 0; var19 < 3; var19++) {
         val var17: Any = new Object[]{var14, var27, var15}[var19];
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
   val var11: com.facebook.drawee.controller.a = (R1.d.g().F(ImageRequestBuilder.x(Uri.parse(ReactAssetUtilsKt.getReactImageUrl(var1, var3))).a()) as PipelineDraweeControllerBuilder)
      .d();
   q.g(var11, "build(...)");
   val var10: GenericDraweeHierarchyBuilder = GenericDraweeHierarchyBuilder.u(var1.getResources()).w(ScalingUtils$ScaleType.e);
   val var13: com.facebook.drawee.generic.a = com.facebook.drawee.generic.a.a(var7);
   var13.r(var8);
   var13.u(com.facebook.drawee.generic.a.a.k);
   var10.K(var13);
   if (var2.spoilerIsHidden()) {
      var10.v(new PorterDuffColorFilter(var2.getTheme().getSpoilerHiddenBackground(), Mode.SRC_IN));
   } else if (var6 != null) {
      var10.v(new PorterDuffColorFilter(var6, Mode.SRC_IN));
   }

   q.g(var10, "apply(...)");
   var0.j(var1, var10.a(), var11, var9, var4, var5, false, 2);
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
   val var2: Boolean;
   if (q.c(var0, "post")) {
      var2 = true;
   } else {
      var2 = q.c(var0, "forum");
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

   return new BackgroundSpan(new BackgroundStyle(var1, var2, 0, 4, null), null, null, 6, null);
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
   q.h(var18, "onTapInlineCode");
   q.h(var19, "onTapEmoji");
   q.h(var20, "linkStyle");
   q.h(var21, "onTapSpoiler");
   q.h(var22, "onTapSoundmoji");
   q.h(var24, "theme");
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
         throw new p();
      }

      var27 = new DraweeSpanStringBuilder((var0 as PrimitiveStructurableText).getContent());
   }

   return var27;
}

private fun List<ContentNode>.toSpannable(rc: RenderContext, builder: DraweeSpanStringBuilder = new DraweeSpanStringBuilder()): DraweeSpanStringBuilder {
   var var21: RenderContext = var1;
   var var22: DraweeSpanStringBuilder = var2;
   var var5: Int = 1;
   val var25: java.util.Iterator = var0.iterator();
   var var6: Int = 0;
   var var7: Int = 0;

   while (var25.hasNext()) {
      var var23: Int = (Integer)var25.next();
      if (var7 < 0) {
         i.u();
      }

      var var27: ContentNode = var23 as ContentNode;
      var var8: Byte;
      if (var7 == i.m(var0)) {
         var8 = var5;
      } else {
         var8 = var6;
      }

      label683: {
         var var26: Context = var1.getContext();
         var var28: BackgroundColorSpan = new BackgroundColorSpan(var1.getTheme().getBackgroundSecondary());
         val var30: RelativeSizeSpan = new RelativeSizeSpan(0.85F);
         val var29: DiscordFontSpan = new DiscordFontSpan(var26, DiscordFont.CodeNormal);
         val var13: Int = ColorUtilsKt.getThemeColor(
            var26, com.discord.chat.R.color.chat_mentions_background_light, com.discord.chat.R.color.chat_mentions_background_dark, var1.getTheme()
         );
         var var10: Int = ColorUtilsKt.getThemeColor(
            var26, com.discord.chat.R.color.chat_mentions_foreground_light, com.discord.chat.R.color.chat_mentions_foreground_dark, var1.getTheme()
         );
         val var14: Int = androidx.core.graphics.c.k(ColorUtilsKt.getThemeColor(var26, R.color.green_330, R.color.green_330, var1.getTheme()), 25);
         val var11: Int = ColorUtilsKt.getThemeColor(var26, R.color.green_330, R.color.green_330, var1.getTheme());
         if (var27 is BlockQuoteContentNode) {
            if (var1.getSingleLine()) {
               var22.append("> ");
               appendToExistingBuilder((var27 as BlockQuoteContentNode).getContent(), var21, var22);
            } else {
               var23 = new QuoteSpan(var1.getTheme().getInteractiveMuted(), SizeUtilsKt.getDpToPx(3), SizeUtilsKt.getDpToPx(8));
               var8 = var2.length();
               appendToExistingBuilder((var27 as BlockQuoteContentNode).getContent(), var21.updateInsets(new Function1((QuoteSpan)var23) {
                  final QuoteSpan $quote;

                  {
                     super(1);
                     this.$quote = var1;
                  }

                  public final RenderContext.Insets invoke(RenderContext.Insets var1) {
                     q.h(var1, "$this$updateInsets");
                     return RenderContext.Insets.copy$default(var1, 0, 0, var1.getStart() + this.$quote.getInsetStart(), 0, 11, null);
                  }
               }), var22);
               var23 = new Object[]{var23}[var6];
               if (var23 != null) {
                  var22.setSpan(var23, var8, var2.length(), 13107233);
               }
            }
         } else if (var27 is CodeBlockContentNode) {
            if (var1.getSingleLine()) {
               val var107: Int = var2.length();
               var22.append(kotlin.text.h.C((var27 as CodeBlockContentNode).getContent(), '\n', ' ', false, 4, null));

               for (int var88 = var6; var88 < 3; var88 += var5) {
                  var23 = new Object[]{var28, var30, var29}[var88];
                  if (var23 != null) {
                     var22.setSpan(var23, var107, var2.length(), 33);
                  }
               }
            } else {
               CodeStyle.INSTANCE.renderCodeBlock(var22, var27 as CodeBlockContentNode, var21, (boolean)var8);
            }
         } else if (var27 is EmojiContentNode) {
            EmojiRendererKt.renderEmoji(var22, var27 as EmojiContentNode, var21);
         } else if (var27 is EmphasisContentNode) {
            var23 = new GGSansItalicSpan(var1.getContext());
            var8 = var2.length();
            appendToExistingBuilder((var27 as EmphasisContentNode).getContent(), var21, var22);
            var23 = new Object[]{var23}[var6];
            if (var23 != null) {
               var22.setSpan(var23, var8, var2.length(), 33);
            }
         } else {
            if (var27 is InlineCodeContentNode) {
               var23 = null;
               if (!var1.getInLink()) {
                  var23 = new ClickableSpan(null, -1, null, null, 0.0F, null, null, new Function1(var21, var27) {
                     final ContentNode $contentNode;
                     final RenderContext $rc;

                     {
                        super(1);
                        this.$rc = var1;
                        this.$contentNode = var2;
                     }

                     public final void invoke(View var1) {
                        q.h(var1, "it");
                        this.$rc.getOnTapInlineCode().invoke(this.$contentNode);
                     }
                  }, 125, null);
               }

               val var224: ForegroundColorSpan = new ForegroundColorSpan(var1.getTheme().getTextNormal());
               var8 = var2.length();
               var22.append((var27 as InlineCodeContentNode).getContent());

               for (int var85 = 0; var85 < 5; var85 += var5) {
                  var26 = (Context)new Object[]{var23, var28, var30, var29, var224}[var85];
                  if (var26 != null) {
                     var22.setSpan(var26, var8, var2.length(), 33);
                  }
               }
            } else {
               if (var27 is LineBreakContentNode) {
                  var6 = (byte)var5;
               } else {
                  var6 = var27 is NewLineContentNode;
               }

               if (var6 == 0) {
                  if (var27 is LinkContentNode) {
                     val var268: LinkStyle = var1.getLinkStyle().invoke(var27) as LinkStyle;
                     val var262: LinkContentNode = var27 as LinkContentNode;
                     var23 = (var27 as LinkContentNode).getLinkColor();
                     if (var23 != null) {
                        var5 = var23;
                     } else {
                        var5 = var268.getLinkColor();
                     }

                     val var218: RoleColors;
                     if (q.c(var262.getShouldShowRoleDot(), java.lang.Boolean.TRUE)) {
                        var218 = null;
                     } else {
                        var218 = RoleColorsKt.toAndroidColors(var262.getRoleColors());
                     }

                     if (var218 != null) {
                        var5 = var218.getPrimaryColor();
                     }

                     if (var218 != null) {
                        var23 = var218.getSecondaryColor();
                     } else {
                        var23 = null;
                     }

                     val var219: Int;
                     if (var218 != null) {
                        var219 = var218.getTertiaryColor();
                     } else {
                        var219 = null;
                     }

                     val var207: ClickableSpan = new ClickableSpan(
                        null, var5, var23, var219, 150.0F, var1.getShowLinkDecorations(), new Function1(var27, var21) {
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
                        }, new Function1(var21, var27) {
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
                        }, 1, null
                     );
                     val var220: LinkBackgroundStyle = var268.getBackgroundStyle();
                     val var125: Boolean;
                     val var165: BackgroundSpan;
                     if (var220 != null) {
                        val var163: Int = var220.getColor();
                        if (var163 != null) {
                           var5 = var163;
                        } else {
                           var5 = 0;
                        }

                        val var164: Int = var220.getBorderRadius();
                        if (var164 != null) {
                           var6 = var164;
                        } else {
                           var6 = 0;
                        }

                        var165 = new BackgroundSpan(new BackgroundStyle(var5, var6, 0, 4, null), null, null, 6, null);
                        val var221: java.lang.Boolean = var220.getSpaceAround();
                        if (var221 != null) {
                           var125 = var221;
                        } else {
                           var125 = false;
                        }
                     } else {
                        var165 = null;
                        var125 = false;
                     }

                     val var223: DiscordFontSpan = new DiscordFontSpan(var1.getContext(), var268.getFont());
                     var5 = var2.length();
                     if (var125) {
                        var22.append(' ');
                     }

                     var6 = getIconSize(null, var1.getBaselineHeightPx());
                     val var253: ReactAsset = var268.getIcon();
                     if (var253 != null) {
                        appendImage$default(var2, var26, var1, var253.getUri(var26), var6, var6, var268.getLinkColor(), 0.0F, 0.0F, 192, null);
                        var22.append(' ');
                     }

                     appendToExistingBuilder(
                        var262.getContent(),
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
                     if (var125) {
                        var2.append(' ');
                     }

                     for (int var84 = 0; var84 < 3; var84++) {
                        val var179: Any = new Object[]{var207, var223, var165}[var84];
                        if (var179 != null) {
                           var2.setSpan(var179, var5, var2.length(), 33);
                        }
                     }
                  } else {
                     label725: {
                        if (var27 is MentionContentNode) {
                           label730: {
                              val var209: DiscordFontSpan = new DiscordFontSpan(var1.getContext(), DiscordFont.PrimarySemibold);
                              val var126: MentionContentNode = var27 as MentionContentNode;
                              if (var27 as MentionContentNode is UserOrRoleMentionContentNode) {
                                 val var257: ClickableSpan = new ClickableSpan(
                                    null,
                                    -1,
                                    null,
                                    null,
                                    0.0F,
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
                                          val var4: Function4 = this.$rc.getOnTapMention();
                                          val var7: UserId = (this.$contentNode as UserOrRoleMentionContentNode).getUserId-wUX8bhU();
                                          var var3: java.lang.String = null;
                                          val var8: java.lang.String;
                                          if (var7 != null) {
                                             var8 = UserId.toString-impl(var7.unbox-impl());
                                          } else {
                                             var8 = null;
                                          }

                                          val var5: java.lang.String = java.lang.String.valueOf(
                                             (this.$contentNode as UserOrRoleMentionContentNode).getChannelId-qMVnFVQ()
                                          );
                                          var var2: java.lang.String = (this.$contentNode as UserOrRoleMentionContentNode).getRoleName();
                                          if (var2 != null) {
                                             var2 = var2.toString();
                                          } else {
                                             var2 = null;
                                          }

                                          val var6: java.lang.String = (this.$contentNode as UserOrRoleMentionContentNode).getParsedUserId();
                                          if (var6 != null) {
                                             var3 = var6.toString();
                                          }

                                          var4.invoke(var8, var5, var2, var3);
                                       }
                                    },
                                    125,
                                    null
                                 );
                                 val var266: UserOrRoleMentionContentNode = var27 as UserOrRoleMentionContentNode;
                                 val var12: Int = (var27 as UserOrRoleMentionContentNode).getRoleColor();
                                 val var191: RoleColors = RoleColorsKt.toAndroidColors((var27 as UserOrRoleMentionContentNode).getRoleColors());
                                 val var93: Byte;
                                 if (var1.getShouldShowRoleDot() && var12 > 0) {
                                    var93 = (byte)var5;
                                 } else {
                                    var93 = 0;
                                 }

                                 val var110: Byte;
                                 if (var1.getShouldShowRoleOnName() && var12 > 0) {
                                    var110 = (byte)var5;
                                 } else {
                                    var110 = 0;
                                 }

                                 val var136: UserId = var266.getUserId-wUX8bhU();
                                 val var15: Long = UserId.constructor-impl(1081004946872352958L);
                                 val var121: Boolean;
                                 if (var136 == null) {
                                    var121 = false;
                                 } else {
                                    var121 = UserId.equals-impl0(var136.unbox-impl(), var15);
                                 }

                                 if (var121) {
                                    var5 = var14;
                                 } else if (var110 != 0) {
                                    if (var191 != null) {
                                       var5 = var191.getPrimaryColor();
                                    } else {
                                       var5 = var12;
                                    }

                                    var5 = androidx.core.graphics.c.k(var5, 25);
                                 } else {
                                    var5 = var13;
                                 }

                                 label699: {
                                    var249 = makeMentionBackgroundSpan(var1, var5);
                                    if (var110 != 0 && !var121) {
                                       val var137: Int;
                                       if (var191 != null) {
                                          var137 = var191.getSecondaryColor();
                                       } else {
                                          var137 = null;
                                       }

                                       if (var137 != null) {
                                          val var139: java.util.List = i.q(new Integer[]{var191.getPrimaryColor(), var191.getSecondaryColor()});
                                          if (var191.getTertiaryColor() != null) {
                                             var139.add(var191.getTertiaryColor());
                                          }

                                          var21 = new EnhancedRoleColorsSpan(i.Q0(var139));
                                          break label699;
                                       }
                                    }

                                    if (var121) {
                                       var6 = var11;
                                    } else {
                                       var6 = var10;
                                       if (var110 != 0) {
                                          var6 = androidx.core.graphics.c.k(var12, 255);
                                       }
                                    }

                                    var21 = new ForegroundColorSpan(var6);
                                 }

                                 var6 = var2.length();
                                 if (var93 != 0) {
                                    val var232: RoleDotSpan = new RoleDotSpan(var26, var5, 0, 4, null);
                                    var var167: RoleColors = var191;
                                    if (var191 == null) {
                                       var167 = new RoleColors(var12, null, null);
                                    }

                                    var232.setColors(var167);
                                    var2.append("#");
                                    var2.setSpan(var232, var2.length() - 1, var2.length(), 33);
                                 }

                                 var2.append(toSpannable$default(var266.getContent(), var1, null, 2, null));

                                 for (int var42 = 0; var42 < 4; var42++) {
                                    val var168: Any = new Object[]{var209, var257, var249, var21}[var42];
                                    if (var168 != null) {
                                       var2.setSpan(var168, var6, var2.length(), 33);
                                    }
                                 }

                                 var130 = var2;
                              } else {
                                 label726: {
                                    if (var126 is ChannelMentionContentNode) {
                                       val var254: ClickableSpan = new ClickableSpan(
                                          null,
                                          -1,
                                          null,
                                          null,
                                          0.0F,
                                          null,
                                          new Function1(var1, var27) {
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
                                                this.$rc
                                                   .getOnTapChannel()
                                                   .invoke(
                                                      (this.$contentNode as ChannelMentionContentNode).getChannelId(),
                                                      (this.$contentNode as ChannelMentionContentNode).getGuildId(),
                                                      (this.$contentNode as ChannelMentionContentNode).getMessageId()
                                                   );
                                             }
                                          },
                                          61,
                                          null
                                       );
                                       val var186: BackgroundSpan = makeMentionBackgroundSpan(var1, var13);
                                       val var263: ForegroundColorSpan = new ForegroundColorSpan(var10);
                                       var6 = var2.length();
                                       val var245: java.util.List = (var27 as ChannelMentionContentNode).getInContent();
                                       if (var245 != null) {
                                          appendToExistingBuilder(var245, var1, var22);
                                          var5 = getIconSize("_caret", var1.getBaselineHeightPx());
                                          appendImage$default(
                                             var2, var26, var1, ReactAsset.Caret.getUri(var26), var5, var5, var263.getForegroundColor(), 0.0F, 0.0F, 192, null
                                          );
                                       }

                                       val var127: java.util.List = var126.getContent();
                                       if (var127 != null) {
                                          appendToExistingBuilder(var127, var1, var2);
                                       }

                                       for (int var36 = 0; var36 < 4; var36++) {
                                          var21 = (RenderContext)new Object[]{var209, var254, var186, var263}[var36];
                                          if (var21 != null) {
                                             var2.setSpan(var21, var6, var2.length(), 33);
                                          }
                                       }

                                       var130 = var2;
                                    } else {
                                       if (var126 !is AttachmentLinkContentNode) {
                                          if (var126 !is StaticChannelMentionContentNode) {
                                             val var65: Byte = (byte)var5;
                                             if (var126 !is CommandMentionContentNode) {
                                                throw new p();
                                             }

                                             val var231: BackgroundSpan = makeMentionBackgroundSpan(var1, var13);
                                             val var210: ForegroundColorSpan = new ForegroundColorSpan(var10);
                                             val var135: ClickableSpan = new ClickableSpan(null, -1, null, null, 0.0F, null, new Function1(var1, var27) {
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
                                             }, new Function1(var1, var27) {
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
                                             }, 61, null);
                                             val var189: GGSansBoldSpan = new GGSansBoldSpan(var1.getContext());
                                             var8 = var2.length();
                                             val var109: Int = var2.length();
                                             var22.append("/");
                                             var22.append(toSpannable$default((var27 as CommandMentionContentNode).getContent(), var1, null, 2, null));

                                             for (int var39 = 0; var39 < 3; var39 += var65) {
                                                var27 = (ContentNode)new Object[]{var135, var231, var210}[var39];
                                                if (var27 != null) {
                                                   var22.setSpan(var27, var109, var2.length(), 33);
                                                }
                                             }

                                             var23 = (Integer)new Object[]{var189}[0];
                                             var5 = var65;
                                             var130 = var22;
                                             if (var23 != null) {
                                                var22.setSpan(var23, var8, var2.length(), 33);
                                                var130 = var22;
                                                var5 = var65;
                                             }
                                             break label730;
                                          }

                                          val var134: ClickableSpan = new ClickableSpan(
                                             null,
                                             -1,
                                             null,
                                             null,
                                             0.0F,
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
                                                   this.$rc
                                                      .getOnTapChannel()
                                                      .invoke(
                                                         (this.$contentNode as StaticChannelMentionContentNode).getId().getId(),
                                                         java.lang.String.valueOf((this.$contentNode as StaticChannelMentionContentNode).getGuildId-qOKuAAo()),
                                                         java.lang.String.valueOf((this.$contentNode as StaticChannelMentionContentNode).getItemId())
                                                      );
                                                }
                                             },
                                             125,
                                             null
                                          );
                                          val var256: BackgroundSpan = makeMentionBackgroundSpan(var1, var13);
                                          val var188: ForegroundColorSpan = new ForegroundColorSpan(var10);
                                          val var108: Int = getIconSize(null, var1.getBaselineHeightPx());
                                          var6 = var2.length();
                                          val var247: StaticChannelMentionContentNode = var27 as StaticChannelMentionContentNode;
                                          var8 = TextUtilsKt.WhenMappings.$EnumSwitchMapping$0[(var27 as StaticChannelMentionContentNode).getId().ordinal()];
                                          if (var8 == var5 || var8 == 2) {
                                             appendImage$default(
                                                var2,
                                                var26,
                                                var1,
                                                ReactAsset.Home.getUri(var26),
                                                var108,
                                                var108,
                                                var188.getForegroundColor(),
                                                0.0F,
                                                0.0F,
                                                192,
                                                null
                                             );
                                          } else if (var8 != 3) {
                                             if (var8 != 4) {
                                                if (var8 != 5) {
                                                   var22.append("#");
                                                } else {
                                                   appendImage$default(
                                                      var2,
                                                      var26,
                                                      var1,
                                                      ReactAsset.Link.getUri(var26),
                                                      var108,
                                                      var108,
                                                      var188.getForegroundColor(),
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
                                                   var108,
                                                   var108,
                                                   var188.getForegroundColor(),
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
                                                var108,
                                                var108,
                                                var188.getForegroundColor(),
                                                0.0F,
                                                0.0F,
                                                192,
                                                null
                                             );
                                          }

                                          var5 = var6;
                                          var22.append(toSpannable$default(var247.getContent(), var1, null, 2, null));

                                          for (int var64 = 0; var64 < 4; var64++) {
                                             var26 = (Context)new Object[]{var209, var134, var256, var188}[var64];
                                             if (var26 != null) {
                                                var22.setSpan(var26, var5, var2.length(), 33);
                                             }
                                          }

                                          var130 = var22;
                                          break label726;
                                       }

                                       val var255: ClickableSpan = new ClickableSpan(
                                          null,
                                          -1,
                                          null,
                                          null,
                                          0.0F,
                                          null,
                                          new Function1(var1, var27) {
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
                                                this.$rc.getOnTapAttachmentLink().invoke((this.$contentNode as AttachmentLinkContentNode).getAttachmentUrl());
                                             }
                                          },
                                          61,
                                          null
                                       );
                                       val var246: BackgroundSpan = makeMentionBackgroundSpan(var1, var13);
                                       val var187: ForegroundColorSpan = new ForegroundColorSpan(var10);
                                       var5 = var2.length();
                                       var8 = getIconSize(null, var1.getBaselineHeightPx());
                                       appendImage$default(
                                          var2,
                                          var26,
                                          var1,
                                          ReactAsset.Attachment.getUri(var26),
                                          var8,
                                          var8,
                                          var187.getForegroundColor(),
                                          0.0F,
                                          0.0F,
                                          192,
                                          null
                                       );
                                       var22.append(' ');
                                       val var131: java.util.List = var126.getContent();
                                       if (var131 != null) {
                                          appendToExistingBuilder(var131, var1, var22);
                                       }

                                       var6 = 0;

                                       while (true) {
                                          var130 = var22;
                                          if (var6 >= 4) {
                                             break;
                                          }

                                          var21 = (RenderContext)new Object[]{var209, var255, var246, var187}[var6];
                                          if (var21 != null) {
                                             var22.setSpan(var21, var5, var2.length(), 33);
                                          }

                                          var6++;
                                       }
                                    }

                                    var5 = 1;
                                    break label730;
                                 }
                              }

                              var5 = 1;
                           }

                           ForceExhaustiveKt.forceExhaustive(var2);
                           var22 = var130;
                        } else {
                           if (var27 !is ParagraphContentNode) {
                              if (var27 !is SpoilerContentNode) {
                                 if (var27 is StrikethroughContentNode) {
                                    val var142: StrikethroughSpan = new StrikethroughSpan();
                                    var6 = var2.length();
                                    appendToExistingBuilder((var27 as StrikethroughContentNode).getContent(), var1, var22);
                                    var21 = (RenderContext)new Object[]{var142}[0];
                                    if (var21 != null) {
                                       var22.setSpan(var21, var6, var2.length(), 33);
                                    }
                                 } else if (var27 is SubtextContentNode) {
                                    if (var1.getSingleLine()) {
                                       appendToExistingBuilder((var27 as SubtextContentNode).getContent(), var1, var22);
                                       if (var8 == 0) {
                                          simulateInlineNewline(var2);
                                       }
                                    } else {
                                       val var71: Byte;
                                       if (FontManager.INSTANCE.getIsClassicChatFontScaleEnabled(var26)) {
                                          var71 = 13;
                                       } else {
                                          var71 = 14;
                                       }

                                       changeTextSizeSp(
                                          var22,
                                          var71,
                                          var1,
                                          new Function2(var22, new ForegroundColorSpan(var1.getTheme().getTextMuted()), var27, (boolean)var8) {
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
                                    var var123: Boolean = var27 is HeadingContentNode;
                                    var var72: Int = 16;
                                    if (var123) {
                                       val var144: DiscordFontSpan = new DiscordFontSpan(var1.getContext(), DiscordFont.PrimaryExtraBold);
                                       if (var1.getSingleLine()) {
                                          var72 = var2.length();
                                          appendToExistingBuilder((var27 as HeadingContentNode).getContent(), var1, var22);
                                          simulateInlineNewline(var2);
                                          var21 = (RenderContext)new Object[]{var144}[0];
                                          if (var21 != null) {
                                             var22.setSpan(var21, var72, var2.length(), 33);
                                          }
                                       } else {
                                          val var111: Int = (var27 as HeadingContentNode).getLevel();
                                          if (var111 != var5) {
                                             if (var111 == 2) {
                                                var72 = 20;
                                             }
                                          } else {
                                             var72 = 24;
                                          }

                                          var var112: Byte;
                                          if (var2.length() > 0) {
                                             var112 = var5;
                                          } else {
                                             var112 = 0;
                                          }

                                          if (var112 != 0) {
                                             var112 = SizeUtilsKt.getDpToPx(8);
                                          } else {
                                             var112 = SizeUtilsKt.getDpToPx(4);
                                          }

                                          val var193: AbsoluteSizeSpan = new AbsoluteSizeSpan(var112);
                                          var112 = var2.length();
                                          var22.append("\n");
                                          var23 = (Integer)new Object[]{var193}[0];
                                          if (var23 != null) {
                                             var22.setSpan(var23, var112, var2.length(), 33);
                                          }

                                          var112 = var2.length();
                                          changeTextSizeSp(
                                             var22,
                                             var72,
                                             var1,
                                             new Function2(var27, var22) {
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
                                                   TextUtilsKt.access$appendToExistingBuilder(
                                                      (this.$contentNode as HeadingContentNode).getContent(), var2, this.$builder
                                                   );
                                                }
                                             }
                                          );
                                          var21 = (RenderContext)new Object[]{var144}[0];
                                          if (var21 != null) {
                                             var22.setSpan(var21, var112, var2.length(), 33);
                                          }

                                          if (var8 == 0) {
                                             val var147: AbsoluteSizeSpan = new AbsoluteSizeSpan(SizeUtilsKt.getDpToPx(4));
                                             var72 = var2.length();
                                             var22.append("\n");
                                             var21 = (RenderContext)new Object[]{var147}[0];
                                             if (var21 != null) {
                                                var22.setSpan(var21, var72, var2.length(), 33);
                                             }
                                          } else {
                                             val var149: AbsoluteSizeSpan = new AbsoluteSizeSpan(0);
                                             var72 = var2.length();
                                             var22.append("\n\u200b");
                                             var21 = (RenderContext)new Object[]{var149}[0];
                                             if (var21 != null) {
                                                var22.setSpan(var21, var72, var2.length(), 33);
                                             }
                                          }
                                       }
                                    } else {
                                       if (var27 !is LHeadingContentNode) {
                                          var6 = (byte)var5;
                                          val var201: DraweeSpanStringBuilder;
                                          if (var27 is BulletListContentNode) {
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
                                             val var172: BulletListContentNode = var27 as BulletListContentNode;
                                             val var20: Boolean = (var27 as BulletListContentNode).getOrdered();
                                             val var119: Long;
                                             if (var20) {
                                                val var203: java.lang.Long = var172.getStart();
                                                if (var203 != null) {
                                                   var119 = var203;
                                                } else {
                                                   var119 = 1L;
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
                                                   (long)(var172.getItems().size() - 1) + var119,
                                                   false,
                                                   null,
                                                   null,
                                                   0.0F,
                                                   null,
                                                   -67108865,
                                                   null
                                                );
                                             } else {
                                                var119 = 0L;
                                             }

                                             for (java.util.List var173 : var172.getItems()) {
                                                val var217: ArrayList = new ArrayList();
                                                val var117: Int = var173.size();
                                                val var242: java.util.Iterator = var173.iterator();

                                                for (int var55 = 0; var242.hasNext(); var55++) {
                                                   var var174: java.lang.Long = (java.lang.Long)var242.next();
                                                   if (var55 < 0) {
                                                      i.u();
                                                   }

                                                   var27 = var174 as ContentNode;
                                                   var123 = var174 as ContentNode is BulletListContentNode;
                                                   val var101: Byte;
                                                   if (var55 == var117 - 1) {
                                                      var101 = var6;
                                                   } else {
                                                      var101 = 0;
                                                   }

                                                   if (!var123) {
                                                      var217.add(var27);
                                                   }

                                                   if (var123 || var101 != 0) {
                                                      var174 = var21;
                                                      if (var20) {
                                                         var var17: Long;
                                                         if (var21.getListOrderedIndex() != null) {
                                                            var174 = var21.getListOrderedIndex();
                                                            if (var174 != null) {
                                                               var17 = var174;
                                                            } else {
                                                               var17 = 0L;
                                                            }

                                                            var17++;
                                                         } else {
                                                            var17 = var119;
                                                         }

                                                         var174 = RenderContext.copy$default(
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

                                                      var21 = (RenderContext)var174;
                                                      appendBulletPoint(var2, var217, (RenderContext)var174, var20);
                                                      if (var1.getSingleLine()) {
                                                         simulateInlineNewline(var2);
                                                      }

                                                      var217.clear();
                                                   }

                                                   if (var123) {
                                                      appendToExistingBuilder(
                                                         i.e(var27),
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
                                             }

                                             var201 = var2;
                                          } else {
                                             label727: {
                                                if (var27 is StrongContentNode) {
                                                   val var153: GGSansBoldSpan = new GGSansBoldSpan(var1.getContext());
                                                   var5 = var2.length();
                                                   appendToExistingBuilder((var27 as StrongContentNode).getContent(), var1, var22);
                                                   var21 = (RenderContext)new Object[]{var153}[0];
                                                   if (var21 != null) {
                                                      var22.setSpan(var21, var5, var2.length(), 33);
                                                   }
                                                } else {
                                                   var21 = var1;
                                                   if (var27 is TextContentNode) {
                                                      val var155: java.lang.String = (var27 as TextContentNode).getContent();
                                                      if (var155 != null) {
                                                         var22.append(var155);
                                                      }
                                                   } else if (var27 is TimestampContentNode) {
                                                      val var156: ClickableSpan = new ClickableSpan(
                                                         null,
                                                         ColorUtilsKt.getThemeColor(var26, R.color.primary_600, R.color.primary_200, var1.getTheme()),
                                                         null,
                                                         null,
                                                         0.0F,
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
                                                         125,
                                                         null
                                                      );
                                                      val var196: BackgroundColorSpan = new BackgroundColorSpan(
                                                         ColorUtilsKt.getThemeColor(
                                                            var26,
                                                            R.color.background_modifier_accent_light,
                                                            R.color.background_modifier_accent_dark,
                                                            var1.getTheme()
                                                         )
                                                      );
                                                      var8 = var2.length();
                                                      var22.append((var27 as TimestampContentNode).getFormatted());

                                                      for (int var48 = 0; var48 < 2; var48++) {
                                                         val var214: Any = new Object[]{var156, var196}[var48];
                                                         if (var214 != null) {
                                                            var22.setSpan(var214, var8, var2.length(), 33);
                                                         }
                                                      }
                                                   } else if (var27 is UnderlineContentNode) {
                                                      val var197: UnderlineSpan = new UnderlineSpan();
                                                      var5 = var2.length();
                                                      appendToExistingBuilder((var27 as UnderlineContentNode).getContent(), var1, var22);
                                                      var21 = (RenderContext)new Object[]{var197}[0];
                                                      if (var21 != null) {
                                                         var22.setSpan(var21, var5, var2.length(), 33);
                                                      }
                                                   } else if (var27 is ChannelNameContentNode) {
                                                      val var198: ChannelNameContentNode = var27 as ChannelNameContentNode;
                                                      if ((var27 as ChannelNameContentNode).getIcon() != null) {
                                                         var5 = getIconSize(var198.getIconType(), var1.getBaselineHeightPx());
                                                         appendImage$default(
                                                            var2,
                                                            var26,
                                                            var1,
                                                            var198.getIcon(),
                                                            var5,
                                                            var5,
                                                            var10,
                                                            0.0F,
                                                            (float)var5 * getIconPaddingMultiplier(var198.getIconType()),
                                                            64,
                                                            null
                                                         );
                                                      }

                                                      appendToExistingBuilder(var198.getContent(), var1, var22);
                                                   } else {
                                                      if (var27 !is GuildNameContentNode) {
                                                         if (var27 is SoundmojiContentNode) {
                                                            val var215: VerticalPaddingSpan = new VerticalPaddingSpan(SizeUtilsKt.getDpToPx(4));
                                                            val var261: DiscordFontSpan = new DiscordFontSpan(var1.getContext(), DiscordFont.PrimarySemibold);
                                                            val var267: ClickableSpan = new ClickableSpan(
                                                               null, null, null, null, 0.0F, null, null, new Function1(var1, var27) {
                                                                  final ContentNode $contentNode;
                                                                  final RenderContext $rc;

                                                                  {
                                                                     super(1);
                                                                     this.$rc = var1;
                                                                     this.$contentNode = var2;
                                                                  }

                                                                  public final void invoke(View var1) {
                                                                     q.h(var1, "it");
                                                                     this.$rc.getOnTapSoundmoji().invoke(this.$contentNode);
                                                                  }
                                                               }, 127, null
                                                            );
                                                            val var200: ForegroundColorSpan = new ForegroundColorSpan(ThemeManagerKt.getTheme().getTextNormal());
                                                            val var270: BackgroundSpan = new BackgroundSpan(
                                                               new BackgroundStyle(ThemeManagerKt.getTheme().getCardPrimaryBg(), 4, 2),
                                                               new BorderStyle(ThemeManagerKt.getTheme().getBorderStrong(), SizeUtilsKt.getDpToPx(var5)),
                                                               new ShadowStyle(Color.argb(63, 0, 0, 0), SizeUtilsKt.getDpToPx(4), new SizeF(0.0F, 4.0F))
                                                            );
                                                            var22.append(" ");
                                                            val var159: Function1 = new Function1(var22, var27, var26, var1) {
                                                               final DraweeSpanStringBuilder $builder;
                                                               final ContentNode $contentNode;
                                                               final Context $context;
                                                               final RenderContext $rc;

                                                               {
                                                                  super(1);
                                                                  this.$builder = var1;
                                                                  this.$contentNode = var2;
                                                                  this.$context = var3;
                                                                  this.$rc = var4;
                                                               }

                                                               public final void invoke(SpannableStringBuilder var1) {
                                                                  q.h(var1, "$this$null");
                                                                  this.$builder.append("  ");
                                                                  val var5: RenderableEmoji = SoundmojiContentNodeKt.toRenderableEmoji(
                                                                     this.$contentNode as SoundmojiContentNode
                                                                  );
                                                                  if (var5 != null) {
                                                                     val var7: DraweeSpanStringBuilder = this.$builder;
                                                                     val var6: Context = this.$context;
                                                                     val var4: RenderContext = this.$rc;
                                                                     val var3: java.lang.Float = this.$rc.getEmojiBaselineHeightOverridePx();
                                                                     val var2: Float;
                                                                     if (var3 != null) {
                                                                        var2 = var3;
                                                                     } else {
                                                                        var2 = var4.getBaselineHeightPx();
                                                                     }

                                                                     RenderableEmojiKt.renderEmojiInto$default(
                                                                        var7,
                                                                        var5,
                                                                        var6,
                                                                        TextUtilsKt.getIconSize("_emoji", var2 * 0.8F),
                                                                        false,
                                                                        0,
                                                                        new Function1(var4) {
                                                                           final RenderContext $rc;

                                                                           {
                                                                              super(1);
                                                                              this.$rc = var1;
                                                                           }

                                                                           public final void invoke(GenericDraweeHierarchyBuilder var1) {
                                                                              q.h(var1, "$this$renderEmojiInto");
                                                                              EmojiRendererKt.handleEmojiSpoiler(var1, this.$rc, true);
                                                                           }
                                                                        },
                                                                        32,
                                                                        null
                                                                     );
                                                                     var7.append(" ");
                                                                  }

                                                                  val var10: DraweeSpanStringBuilder = this.$builder;
                                                                  val var8: java.lang.String = (this.$contentNode as SoundmojiContentNode).getContent();
                                                                  val var9: java.lang.String;
                                                                  if (var8 != null) {
                                                                     var9 = kotlin.text.h.D(var8, " ", " ", false, 4, null);
                                                                  } else {
                                                                     var9 = null;
                                                                  }

                                                                  var10.append(var9);
                                                                  this.$builder.append("  ");
                                                               }
                                                            };
                                                            if (var1.spoilerExists() && !var1.spoilerIsRevealed()) {
                                                               var5 = var2.length();
                                                               var159.invoke(var22);
                                                               var21 = (RenderContext)new Object[]{var215}[0];
                                                               if (var21 != null) {
                                                                  var22.setSpan(var21, var5, var2.length(), 33);
                                                               }
                                                            } else {
                                                               var8 = var2.length();
                                                               var159.invoke(var22);

                                                               for (int var53 = 0; var53 < 5; var53++) {
                                                                  var21 = (RenderContext)new Object[]{var215, var261, var267, var200, var270}[var53];
                                                                  if (var21 != null) {
                                                                     var22.setSpan(var21, var8, var2.length(), 33);
                                                                  }
                                                               }
                                                            }

                                                            var22.append(" ");
                                                            var201 = var22;
                                                         } else {
                                                            var201 = var22;
                                                            if (var27 is ErrorContentNode) {
                                                               val var202: CrashReporting = CrashReporting.INSTANCE;
                                                               val var216: java.lang.Throwable = (var27 as ErrorContentNode).getThrowable();
                                                               var5 = (byte)0;
                                                               CrashReporting.captureException$default(var202, var216, false, 2, null);
                                                               var22.append("���");
                                                               break label683;
                                                            }
                                                         }
                                                         break label727;
                                                      }

                                                      var5 = getIconSize("_guild", var1.getBaselineHeightPx());
                                                      val var199: GuildNameContentNode = var27 as GuildNameContentNode;
                                                      if ((var27 as GuildNameContentNode).getIcon() != null) {
                                                         appendImage$default(
                                                            var2,
                                                            var26,
                                                            var1,
                                                            var199.getIcon(),
                                                            var5,
                                                            var5,
                                                            null,
                                                            (float)var5 * 0.2F,
                                                            (float)var5 * 0.1F,
                                                            32,
                                                            null
                                                         );
                                                      }

                                                      var22.append(var199.getContent());
                                                   }
                                                }

                                                var21 = var1;
                                                var5 = (byte)0;
                                                break label683;
                                             }
                                          }

                                          var21 = var1;
                                          var5 = (byte)0;
                                          var22 = var201;
                                          break label683;
                                       }

                                       val var151: DiscordFontSpan = new DiscordFontSpan(var1.getContext(), DiscordFont.PrimaryExtraBold);
                                       if (!var1.getSingleLine()) {
                                          var72 = FontManager.INSTANCE.getScaledSpToPx(16, var1.getContext());
                                          val var3: Float = getBaselineHeightForFontSizePx(var1.getPaint(), var72);
                                          val var235: AbsoluteSizeSpan = new AbsoluteSizeSpan(var72);
                                          val var250: LHeadingContentNode = var27 as LHeadingContentNode;
                                          if (kotlin.text.h.J((var27 as LHeadingContentNode).getClassName(), "added", false, 2, null)) {
                                             var72 = ThemeManagerKt.getTheme().getTextPositive();
                                          } else if (kotlin.text.h.J(var250.getClassName(), "fixed", false, 2, null)) {
                                             var72 = ThemeManagerKt.getTheme().getTextDanger();
                                          } else if (kotlin.text.h.J(var250.getClassName(), "progress", false, 2, null)) {
                                             var72 = ThemeManagerKt.getTheme().getTextWarning();
                                          } else if (kotlin.text.h.J(var250.getClassName(), "improved", false, 2, null)) {
                                             var72 = ThemeManagerKt.getTheme().getTextBrand();
                                          } else {
                                             var72 = ThemeManagerKt.getTheme().getHeaderPrimary();
                                          }

                                          val var213: ForegroundColorSpan = new ForegroundColorSpan(var72);
                                          var var79: Byte;
                                          if (var2.length() > 0) {
                                             var79 = var5;
                                          } else {
                                             var79 = 0;
                                          }

                                          if (var79 != 0) {
                                             var79 = SizeUtilsKt.getDpToPx(8);
                                          } else {
                                             var79 = SizeUtilsKt.getDpToPx(4);
                                          }

                                          val var195: UnderlineSpan = new UnderlineSpan();
                                          val var116: Int = var2.length();
                                          val var258: AbsoluteSizeSpan = new AbsoluteSizeSpan(var79);
                                          var79 = var2.length();
                                          var22.append("\n");
                                          var28 = (BackgroundColorSpan)new Object[]{var258}[0];
                                          if (var28 != null) {
                                             var22.setSpan(var28, var79, var2.length(), 33);
                                          }

                                          var10 = var2.length();
                                          val var251: java.util.List = var250.getContent();
                                          var6 = (byte)var5;
                                          var5 = var116;
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
                                          var22 = var2;
                                          appendToExistingBuilder(var251, var260, var2);
                                          var26 = (Context)new Object[]{var235}[0];
                                          if (var26 != null) {
                                             var2.setSpan(var26, var10, var2.length(), 33);
                                          }

                                          if (var8 == 0) {
                                             val var237: AbsoluteSizeSpan = new AbsoluteSizeSpan(SizeUtilsKt.getDpToPx(4));
                                             var8 = var2.length();
                                             var2.append("\n");
                                             var26 = (Context)new Object[]{var237}[0];
                                             if (var26 != null) {
                                                var2.setSpan(var26, var8, var2.length(), 33);
                                             }
                                          } else {
                                             val var239: AbsoluteSizeSpan = new AbsoluteSizeSpan(0);
                                             var8 = var2.length();
                                             var2.append("\n\u200b");
                                             var26 = (Context)new Object[]{var239}[0];
                                             if (var26 != null) {
                                                var2.setSpan(var26, var8, var2.length(), 33);
                                             }
                                          }

                                          for (int var98 = 0; var98 < 3; var98++) {
                                             var26 = (Context)new Object[]{var151, var213, var195}[var98];
                                             if (var26 != null) {
                                                var22.setSpan(var26, var5, var2.length(), 33);
                                             }
                                          }

                                          var21 = var1;
                                          var5 = (byte)0;
                                          break label683;
                                       }

                                       var72 = var2.length();
                                       appendToExistingBuilder((var27 as LHeadingContentNode).getContent(), var1, var22);
                                       simulateInlineNewline(var2);
                                       var21 = (RenderContext)new Object[]{var151}[0];
                                       if (var21 != null) {
                                          var22.setSpan(var21, var72, var2.length(), 33);
                                       }
                                    }
                                 }

                                 var21 = var1;
                                 var6 = (byte)var5;
                                 var5 = (byte)0;
                                 break label683;
                              }

                              val var211: SpoilerContentNode = var27 as SpoilerContentNode;
                              val var233: java.lang.String = SpoilerIdentifier.Companion
                                 .forNode-2sfwrmE(var27 as SpoilerContentNode, var1.getContainerId(), var7);
                              val var122: Boolean = SpoilerManager.INSTANCE.isRevealed-V2PEE7g(var233);
                              val var169: RenderContext.SpoilerState;
                              if (var122) {
                                 var169 = RenderContext.SpoilerState.Revealed;
                              } else {
                                 var169 = RenderContext.SpoilerState.Hidden;
                              }

                              var var141: ClickableSpan = null;
                              if (!var122) {
                                 var141 = new ClickableSpan(
                                    NestedClickableSpan.TouchPriority.HIGH, null, null, null, 0.0F, null, null, new Function1(var233, var1) {
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
                                    }, 126, null
                                 );
                              }

                              if (var122) {
                                 var5 = var1.getTheme().getSpoilerRevealedBackground();
                              } else {
                                 var5 = var1.getTheme().getSpoilerHiddenBackground();
                              }

                              val var234: BackgroundSpan = new BackgroundSpan(new BackgroundStyle(var5, 0, 0, 6, null), null, null, 6, null);
                              val var192: SpoilerSpan = new SpoilerSpan(var122);
                              var5 = var2.length();
                              appendToExistingBuilder(
                                 var211.getContent(),
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
                                    var169,
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
                                    break label725;
                                 }

                                 val var171: Any = new Object[]{var141, var234, var192}[var6];
                                 if (var171 != null) {
                                    var2.setSpan(var171, var5, var2.length(), 33);
                                 }

                                 var6++;
                              }
                           }

                           appendToExistingBuilder((var27 as ParagraphContentNode).getContent(), var1, var22);
                           if (var8 == 0) {
                              var22.append("\n\n");
                           }
                        }

                        var6 = (byte)var5;
                        var21 = var1;
                        var5 = (byte)0;
                        break label683;
                     }
                  }

                  var22 = var2;
                  var21 = var1;
                  var5 = (byte)0;
                  var6 = (byte)1;
                  break label683;
               }

               var22.append("\n");
            }

            var6 = 0;
         }

         var5 = (byte)var6;
         var6 = (byte)var5;
      }

      var7++;
      var6 = var5;
      var5 = var6;
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
      var8 = <unrepresentable>.INSTANCE;
   }

   if ((var27 and 256) != 0) {
      var9 = <unrepresentable>.INSTANCE;
   }

   if ((var27 and 512) != 0) {
      var10 = <unrepresentable>.INSTANCE;
   }

   if ((var27 and 1024) != 0) {
      var11 = <unrepresentable>.INSTANCE;
   }

   if ((var27 and 2048) != 0) {
      var12 = <unrepresentable>.INSTANCE;
   }

   if ((var27 and 4096) != 0) {
      var13 = <unrepresentable>.INSTANCE;
   }

   if ((var27 and 8192) != 0) {
      var14 = <unrepresentable>.INSTANCE;
   }

   if ((var27 and 16384) != 0) {
      var15 = <unrepresentable>.INSTANCE;
   }

   if (('耀' and var27) != 0) {
      var16 = <unrepresentable>.INSTANCE;
   }

   if ((65536 and var27) != 0) {
      var17 = <unrepresentable>.INSTANCE;
   }

   if ((131072 and var27) != 0) {
      var18 = <unrepresentable>.INSTANCE;
   }

   if ((262144 and var27) != 0) {
      var19 = <unrepresentable>.INSTANCE;
   }

   if ((524288 and var27) != 0) {
      var20 = <unrepresentable>.INSTANCE;
   }

   if ((1048576 and var27) != 0) {
      var21 = <unrepresentable>.INSTANCE;
   }

   if ((2097152 and var27) != 0) {
      var22 = <unrepresentable>.INSTANCE;
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

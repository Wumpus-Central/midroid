package com.discord.chat.presentation.message.view

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View.OnClickListener
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import com.discord.SetTextSizeSpKt
import com.discord.chat.bridge.contentnode.CommandMentionContentNode
import com.discord.chat.bridge.contentnode.EmojiContentNode
import com.discord.chat.bridge.contentnode.InlineCodeContentNode
import com.discord.chat.bridge.contentnode.LinkContentNode
import com.discord.chat.bridge.contentnode.SoundmojiContentNode
import com.discord.chat.bridge.structurabletext.StructurableText
import com.discord.chat.databinding.EmbeddedActivityInviteViewBinding
import com.discord.chat.presentation.media.MediaContainingViewResizer
import com.discord.chat.presentation.message.MessageAccessoriesView
import com.discord.core.DCDButton
import com.discord.fonts.DiscordFont
import com.discord.fonts.DiscordFontUtilsKt
import com.discord.misc.utilities.size.SizeUtilsKt
import com.discord.misc.utilities.view.ViewBackgroundUtilsKt
import com.discord.overlapping_circles.OverlappingCirclesView
import com.discord.overlapping_circles.OverlappingItem
import com.discord.primitives.MessageId
import com.discord.react_asset_fetcher.ReactAsset
import com.discord.react_asset_fetcher.ReactAssetUtilsKt
import com.discord.theme.ThemeManagerKt
import com.discord.theme.utils.ColorUtilsKt
import com.facebook.drawee.view.SimpleDraweeView
import java.util.ArrayList
import kotlin.jvm.functions.Function2
import kotlin.jvm.internal.SourceDebugExtension

@SourceDebugExtension(["SMAP\nEmbeddedActivityInviteView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EmbeddedActivityInviteView.kt\ncom/discord/chat/presentation/message/view/EmbeddedActivityInviteView\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,203:1\n257#2,2:204\n257#2,2:206\n257#2,2:208\n257#2,2:210\n257#2,2:212\n257#2,2:218\n257#2,2:220\n257#2,2:222\n1557#3:214\n1628#3,3:215\n*S KotlinDebug\n*F\n+ 1 EmbeddedActivityInviteView.kt\ncom/discord/chat/presentation/message/view/EmbeddedActivityInviteView\n*L\n88#1:204,2\n94#1:206,2\n117#1:208,2\n118#1:210,2\n152#1:212,2\n157#1:218,2\n168#1:220,2\n187#1:222,2\n154#1:214\n154#1:215,3\n*E\n"])
public class EmbeddedActivityInviteView  public constructor(context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0) : ConstraintLayout(
      var1, var2, var3
   ) {
   private final val binding: EmbeddedActivityInviteViewBinding

   fun EmbeddedActivityInviteView(var1: Context) {
      this(var1, null, 0, 6, null);
   }

   fun EmbeddedActivityInviteView(var1: Context, var2: AttributeSet) {
      this(var1, var2, 0, 4, null);
   }

   init {
      val var6: EmbeddedActivityInviteViewBinding = EmbeddedActivityInviteViewBinding.inflate(LayoutInflater.from(var1), this);
      this.binding = var6;
      var var4: TextView = var6.itemTitle;
      var6.itemTitle.setTextColor(ThemeManagerKt.getTheme().getHeaderSecondary());
      SetTextSizeSpKt.setTextSizeSp(var4, 12.0F);
      DiscordFontUtilsKt.setDiscordFont(var4, DiscordFont.PrimaryExtraBold);
      var4 = var6.itemHeader;
      var6.itemHeader.setTextColor(ThemeManagerKt.getTheme().getHeaderPrimary());
      SetTextSizeSpKt.setTextSizeSp(var4, 24.0F);
      DiscordFontUtilsKt.setDiscordFont(var4, DiscordFont.PrimarySemibold);
      val var5: MessageContentView = var6.itemSubtitle;
      val var8: DiscordFont = DiscordFont.PrimaryMedium;
      DiscordFontUtilsKt.setDiscordFont(var5, DiscordFont.PrimaryMedium);
      var5.setTextColor(ThemeManagerKt.getTheme().getHeaderSecondary());
      SetTextSizeSpKt.setTextSizeSp(var5, 12.0F);
      val var9: SimpleDraweeView = var6.subtitleIcon;
      ReactAssetUtilsKt.setReactAsset(var9, ReactAsset.Speaker);
      ColorUtilsKt.setTintColor(var9, ThemeManagerKt.getTheme().getInteractiveNormal());
      val var10: TextView = var6.noParticipantsText;
      DiscordFontUtilsKt.setDiscordFont(var10, var8);
      var10.setTextColor(ThemeManagerKt.getTheme().getInteractiveNormal());
      SetTextSizeSpKt.setTextSizeSp(var10, 12.0F);
      var6.launchButton.setTextColor(-1);
      ViewBackgroundUtilsKt.setBackgroundRectangle$default(
         this, ColorUtilsKt.getColorCompat(var1, GetEmbedBackgroundColorKt.getEmbedBackgroundColor()), SizeUtilsKt.getDpToPx(8), null, 0, 12, null
      );
   }

   @JvmStatic
   fun `setSubtitleText_Tu_1QLM$lambda$8$lambda$7`(var0: Function2, var1: java.lang.String, var2: LinkContentNode): Unit {
      var0.invoke(MessageId.box-impl(var1), var2);
      return Unit.a;
   }

   public fun setAvatarUris(avatarUris: List<String>) {
      val var4: Boolean = var1.isEmpty();
      val var5: OverlappingCirclesView = this.binding.participants;
      var var2: Byte;
      if (!var4) {
         var2 = 0;
      } else {
         var2 = 8;
      }

      var5.setVisibility(var2);
      val var6: OverlappingCirclesView = this.binding.participants;
      val var10: ArrayList = new ArrayList(CollectionsKt.v(var1, 10));
      val var7: java.util.Iterator = var1.iterator();

      while (var7.hasNext()) {
         var10.add(new OverlappingItem(var7.next() as java.lang.String));
      }

      var6.setItems(var10);
      val var8: TextView = this.binding.noParticipantsText;
      var2 = 8;
      if (var4) {
         var2 = 0;
      }

      var8.setVisibility(var2);
   }

   public fun setHeaderText(headerText: CharSequence?) {
      var var2: Boolean;
      if (var1 != null && var1.length() != 0) {
         var2 = 0;
      } else {
         var2 = 1;
      }

      val var4: TextView = this.binding.itemHeader;
      if (!var2) {
         var2 = 0;
      } else {
         var2 = 8;
      }

      var4.setVisibility(var2);
      this.binding.itemHeader.setText(var1);
   }

   public fun setLaunchButton(text: String?, backgroundColor: Int?, enabled: Boolean) {
      val var7: DCDButton = this.binding.launchButton;
      var var5: Boolean;
      if (var1 != null && var1.length() != 0) {
         var5 = 0;
      } else {
         var5 = 1;
      }

      if (!var5) {
         var5 = 0;
      } else {
         var5 = 8;
      }

      var7.setVisibility(var5);
      var7.setText(var1);
      var7.setBackgroundColor(var2);
      var7.setEnabled(var3);
      val var4: Float;
      if (var3) {
         var4 = 1.0F;
      } else {
         var4 = 0.5F;
      }

      var7.setAlpha(var4);
   }

   public fun setNoParticipantsText(noParticipantsText: String) {
      this.binding.noParticipantsText.setText(var1);
   }

   public fun setOnLaunchButtonClickListener(onLaunchButtonClickListener: OnClickListener) {
      this.binding.launchButton.setOnClickButtonListener(var1);
   }

   public fun setSplash(splashUrl: String?, constrainedWidth: Int) {
      var var4: SimpleDraweeView = this.binding.itemHero;
      var var3: Boolean;
      if (var1 != null) {
         var3 = 1;
      } else {
         var3 = 0;
      }

      if (var3) {
         var3 = (byte)0;
      } else {
         var3 = (byte)8;
      }

      var4.setVisibility(var3);
      this.binding.itemHero.setImageURI(var1);
      var3 = MessageAccessoriesView.Companion.getWidth(var2, false);
      var2 = var3 * 9 / 16;
      val var5: MediaContainingViewResizer = MediaContainingViewResizer.INSTANCE;
      var4 = this.binding.itemHero;
      var5.resizeLayoutParams(var4, var3, var2, var3, var2, MediaContainingViewResizer.ResizeMode.Fill);
   }

   public fun setSubtitleText(
      subtitleText: StructurableText?,
      messageId: MessageId,
      onTapLink: (MessageId, LinkContentNode) -> Unit,
      onLongTapLink: (LinkContentNode) -> Unit,
      onTapChannel: (String, String?, String?) -> Unit,
      onLongPressChannel: (String, String?, String?, String?) -> Unit,
      onTapAttachmentLink: (String) -> Unit,
      onLongPressAttachmentLink: (String, String) -> Unit,
      onTapMention: (String?, String, String?, String?) -> Unit,
      onTapCommand: (CommandMentionContentNode) -> Unit,
      onLongPressCommand: (CommandMentionContentNode) -> Unit,
      onTapSpoiler: () -> Unit,
      onTapTimestamp: (String) -> Unit,
      onTapInlineCode: (InlineCodeContentNode) -> Unit,
      onTapEmoji: (EmojiContentNode) -> Unit,
      onTapSeeMore: (MessageId) -> Unit,
      onTapSoundmoji: (SoundmojiContentNode) -> Unit
   ) {
      val var19: MessageContentView = this.binding.itemSubtitle;
      var var18: Boolean;
      if (var1 != null) {
         var18 = 1;
      } else {
         var18 = 0;
      }

      if (var18) {
         var18 = 0;
      } else {
         var18 = 8;
      }

      var19.setVisibility(var18);
      val var23: SimpleDraweeView = this.binding.subtitleIcon;
      var var21: Boolean;
      if (var1 != null) {
         var21 = 1;
      } else {
         var21 = 0;
      }

      if (var21) {
         var21 = 0;
      } else {
         var21 = 8;
      }

      var23.setVisibility(var21);
      if (var1 != null) {
         MessageContentView.setMessageContent-AeCz66Y$default(
            this.binding.itemSubtitle,
            var1,
            var2,
            false,
            false,
            false,
            false,
            new F(var3, var2),
            var4,
            var5,
            var6,
            var7,
            var8,
            var9,
            var10,
            var11,
            var12,
            var13,
            var14,
            var15,
            var16,
            var17,
            null,
            0,
            0,
            false,
            null,
            null,
            null,
            null,
            null,
            1042284544,
            null
         );
      }
   }

   public fun setTitleText(titleText: CharSequence?) {
      var var2: Boolean;
      if (var1 != null && var1.length() != 0) {
         var2 = 0;
      } else {
         var2 = 1;
      }

      val var4: TextView = this.binding.itemTitle;
      if (!var2) {
         var2 = 0;
      } else {
         var2 = 8;
      }

      var4.setVisibility(var2);
      this.binding.itemTitle.setText(var1);
   }
}

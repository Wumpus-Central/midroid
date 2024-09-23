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
import com.discord.chat.bridge.contentnode.LinkContentNode
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
import kotlin.jvm.functions.Function1
import kotlin.jvm.functions.Function2

public class EmbeddedActivityInviteView  public constructor(context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0) : ConstraintLayout {
   private final val binding: EmbeddedActivityInviteViewBinding

   fun EmbeddedActivityInviteView(var1: Context) {
      kotlin.jvm.internal.q.h(var1, "context");
      this(var1, null, 0, 6, null);
   }

   fun EmbeddedActivityInviteView(var1: Context, var2: AttributeSet) {
      kotlin.jvm.internal.q.h(var1, "context");
      this(var1, var2, 0, 4, null);
   }

   init {
      kotlin.jvm.internal.q.h(var1, "context");
      super(var1, var2, var3);
      val var6: EmbeddedActivityInviteViewBinding = EmbeddedActivityInviteViewBinding.inflate(LayoutInflater.from(var1), this);
      kotlin.jvm.internal.q.g(var6, "inflate(...)");
      this.binding = var6;
      var var4: TextView = var6.itemTitle;
      var6.itemTitle.setTextColor(ThemeManagerKt.getTheme().getHeaderSecondary());
      kotlin.jvm.internal.q.e(var4);
      SetTextSizeSpKt.setTextSizeSp(var4, 12.0F);
      DiscordFontUtilsKt.setDiscordFont(var4, DiscordFont.PrimaryExtraBold);
      var4 = var6.itemHeader;
      var6.itemHeader.setTextColor(ThemeManagerKt.getTheme().getHeaderPrimary());
      kotlin.jvm.internal.q.e(var4);
      SetTextSizeSpKt.setTextSizeSp(var4, 24.0F);
      DiscordFontUtilsKt.setDiscordFont(var4, DiscordFont.PrimarySemibold);
      val var5: MessageContentView = var6.itemSubtitle;
      kotlin.jvm.internal.q.e(var6.itemSubtitle);
      val var8: DiscordFont = DiscordFont.PrimaryMedium;
      DiscordFontUtilsKt.setDiscordFont(var5, DiscordFont.PrimaryMedium);
      var5.setTextColor(ThemeManagerKt.getTheme().getHeaderSecondary());
      SetTextSizeSpKt.setTextSizeSp(var5, 12.0F);
      val var9: SimpleDraweeView = var6.subtitleIcon;
      kotlin.jvm.internal.q.e(var6.subtitleIcon);
      ReactAssetUtilsKt.setReactAsset(var9, ReactAsset.Speaker);
      ColorUtilsKt.setTintColor(var9, ThemeManagerKt.getTheme().getInteractiveNormal());
      val var10: TextView = var6.noParticipantsText;
      kotlin.jvm.internal.q.e(var6.noParticipantsText);
      DiscordFontUtilsKt.setDiscordFont(var10, var8);
      var10.setTextColor(ThemeManagerKt.getTheme().getInteractiveNormal());
      SetTextSizeSpKt.setTextSizeSp(var10, 12.0F);
      var6.launchButton.setTextColor(-1);
      ViewBackgroundUtilsKt.setBackgroundRectangle$default(
         this, ColorUtilsKt.getColorCompat(var1, GetEmbedBackgroundColorKt.getEmbedBackgroundColor()), SizeUtilsKt.getDpToPx(8), null, 0, 12, null
      );
   }

   public fun setAvatarUris(avatarUris: List<String>) {
      kotlin.jvm.internal.q.h(var1, "avatarUris");
      val var4: Boolean = var1.isEmpty();
      var var5: OverlappingCirclesView = this.binding.participants;
      kotlin.jvm.internal.q.g(this.binding.participants, "participants");
      var var2: Byte;
      if (var4 xor true) {
         var2 = 0;
      } else {
         var2 = 8;
      }

      var5.setVisibility(var2);
      var5 = this.binding.participants;
      val var6: ArrayList = new ArrayList(kotlin.collections.i.v(var1, 10));
      val var7: java.util.Iterator = var1.iterator();

      while (var7.hasNext()) {
         var6.add(new OverlappingItem(var7.next() as java.lang.String));
      }

      var5.setItems(var6);
      val var8: TextView = this.binding.noParticipantsText;
      kotlin.jvm.internal.q.g(this.binding.noParticipantsText, "noParticipantsText");
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
      kotlin.jvm.internal.q.g(this.binding.itemHeader, "itemHeader");
      if (true xor var2) {
         var2 = 0;
      } else {
         var2 = 8;
      }

      var4.setVisibility(var2);
      this.binding.itemHeader.setText(var1);
   }

   public fun setLaunchButton(text: String?, backgroundColor: Int?, enabled: Boolean) {
      val var7: DCDButton = this.binding.launchButton;
      kotlin.jvm.internal.q.e(this.binding.launchButton);
      var var5: Boolean;
      if (var1 != null && var1.length() != 0) {
         var5 = 0;
      } else {
         var5 = 1;
      }

      if (true xor var5) {
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
      kotlin.jvm.internal.q.h(var1, "noParticipantsText");
      this.binding.noParticipantsText.setText(var1);
   }

   public fun setOnLaunchButtonClickListener(onLaunchButtonClickListener: OnClickListener) {
      kotlin.jvm.internal.q.h(var1, "onLaunchButtonClickListener");
      this.binding.launchButton.setOnClickButtonListener(var1);
   }

   public fun setSplash(splashUrl: String?, constrainedWidth: Int) {
      val var4: SimpleDraweeView = this.binding.itemHero;
      kotlin.jvm.internal.q.g(this.binding.itemHero, "itemHero");
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
      var3 = MessageAccessoriesView.Companion.getWidth(var2, false, false);
      var2 = var3 * 9 / 16;
      val var9: MediaContainingViewResizer = MediaContainingViewResizer.INSTANCE;
      val var5: SimpleDraweeView = this.binding.itemHero;
      kotlin.jvm.internal.q.g(this.binding.itemHero, "itemHero");
      var9.resizeLayoutParams(var5, var3, var2, var3, var2, MediaContainingViewResizer.ResizeMode.Fill);
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
      onTapEmoji: (EmojiContentNode) -> Unit,
      onTapSeeMore: (MessageId) -> Unit
   ) {
      kotlin.jvm.internal.q.h(var2, "messageId");
      kotlin.jvm.internal.q.h(var3, "onTapLink");
      kotlin.jvm.internal.q.h(var4, "onLongTapLink");
      kotlin.jvm.internal.q.h(var5, "onTapChannel");
      kotlin.jvm.internal.q.h(var6, "onLongPressChannel");
      kotlin.jvm.internal.q.h(var7, "onTapAttachmentLink");
      kotlin.jvm.internal.q.h(var8, "onLongPressAttachmentLink");
      kotlin.jvm.internal.q.h(var9, "onTapMention");
      kotlin.jvm.internal.q.h(var10, "onTapCommand");
      kotlin.jvm.internal.q.h(var11, "onLongPressCommand");
      kotlin.jvm.internal.q.h(var12, "onTapSpoiler");
      kotlin.jvm.internal.q.h(var13, "onTapTimestamp");
      kotlin.jvm.internal.q.h(var14, "onTapEmoji");
      kotlin.jvm.internal.q.h(var15, "onTapSeeMore");
      var var18: MessageContentView = this.binding.itemSubtitle;
      kotlin.jvm.internal.q.g(this.binding.itemSubtitle, "itemSubtitle");
      var var16: Boolean;
      if (var1 != null) {
         var16 = 1;
      } else {
         var16 = 0;
      }

      if (var16) {
         var16 = 0;
      } else {
         var16 = 8;
      }

      var18.setVisibility(var16);
      val var22: SimpleDraweeView = this.binding.subtitleIcon;
      kotlin.jvm.internal.q.g(this.binding.subtitleIcon, "subtitleIcon");
      var var20: Boolean;
      if (var1 != null) {
         var20 = 1;
      } else {
         var20 = 0;
      }

      if (var20) {
         var20 = 0;
      } else {
         var20 = 8;
      }

      var22.setVisibility(var20);
      if (var1 != null) {
         var18 = this.binding.itemSubtitle;
         kotlin.jvm.internal.q.g(this.binding.itemSubtitle, "itemSubtitle");
         MessageContentView.setMessageContent-2ZcwkLU$default(var18, var1, var2, false, false, false, false, new Function1(var3, var2) {
            final java.lang.String $messageId;
            final Function2 $onTapLink;

            {
               super(1);
               this.$onTapLink = var1;
               this.$messageId = var2;
            }

            public final void invoke(LinkContentNode var1) {
               kotlin.jvm.internal.q.h(var1, "node");
               this.$onTapLink.invoke(MessageId.box-impl(this.$messageId), var1);
            }
         }, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15, null, 0, 0, false, null, null, null, null, null, 260571136, null);
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
      kotlin.jvm.internal.q.g(this.binding.itemTitle, "itemTitle");
      if (true xor var2) {
         var2 = 0;
      } else {
         var2 = 8;
      }

      var4.setVisibility(var2);
      this.binding.itemTitle.setText(var1);
   }
}

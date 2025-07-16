package com.discord.chat.presentation.message.system

import android.annotation.SuppressLint
import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.MotionEvent
import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView.RecycledViewPool
import com.discord.SetTextSizeSpKt
import com.discord.chat.R
import com.discord.chat.bridge.Message
import com.discord.chat.bridge.MessageKt
import com.discord.chat.bridge.MessageType
import com.discord.chat.bridge.automod.AutoModerationContext
import com.discord.chat.bridge.automod.FlaggedMessageEmbed
import com.discord.chat.bridge.structurabletext.StructurableText
import com.discord.chat.bridge.threads.ThreadEmbed
import com.discord.chat.databinding.AutomodSystemMessageViewBinding
import com.discord.chat.presentation.events.ChatEventHandler
import com.discord.chat.presentation.list.ChatListConstraintLayout
import com.discord.chat.presentation.message.MessageAccessoriesView
import com.discord.chat.presentation.message.MessageTagView
import com.discord.chat.presentation.message.ThreadStarterMessageHeaderView
import com.discord.chat.presentation.message.messagepart.AutoModerationNotificationEmbedAccessory
import com.discord.chat.presentation.message.messagepart.FlaggedMessageActionBarAccessory
import com.discord.chat.presentation.message.messagepart.FlaggedMessageEmbedAccessory
import com.discord.chat.presentation.message.messagepart.MessageAccessory
import com.discord.chat.presentation.message.messagepart.ReactionsMessageAccessory
import com.discord.chat.presentation.message.messagepart.ThreadEmbedMessageAccessory
import com.discord.chat.presentation.message.view.botuikit.ComponentProvider
import com.discord.chat.presentation.root.MessageContext
import com.discord.chat.presentation.spine.SpineParentMessage
import com.discord.fonts.DiscordFont
import com.discord.fonts.DiscordFontUtilsKt
import com.discord.misc.utilities.size.SizeUtilsKt
import com.discord.misc.utilities.view.ViewClippingUtilsKt
import com.discord.primitives.ChannelId
import com.discord.primitives.GuildId
import com.discord.primitives.UserId
import com.discord.react_asset_fetcher.ReactAsset
import com.discord.react_asset_fetcher.ReactAssetUtilsKt
import com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchUtilsKt
import com.discord.recycler_view.decorations.VerticalSpacingItemDecoration
import com.discord.ripple.RippleUtilsKt
import com.discord.theme.ThemeManagerKt
import com.discord.theme.utils.ColorUtilsKt
import com.facebook.drawee.view.SimpleDraweeView
import java.util.ArrayList
import kotlin.jvm.internal.r

public class AutomodSystemMessageView  public constructor(context: Context, attrs: AttributeSet? = null)
   : ChatListConstraintLayout,
   VerticalSpacingItemDecoration.SpacingProviderView,
   SpineParentMessage {
   private final val binding: AutomodSystemMessageViewBinding

   public open val spineOriginView: View
      public open get() {
         val var1: SimpleDraweeView = this.binding.authorAvatar;
         r.g(this.binding.authorAvatar, "authorAvatar");
         return var1;
      }


   private final var allowChildGestures: Boolean
   private final var accessories: ArrayList<MessageAccessory>

   fun AutomodSystemMessageView(var1: Context) {
      r.h(var1, "context");
      this(var1, null, 2, null);
   }

   init {
      r.h(var1, "context");
      super(var1, var2);
      val var6: AutomodSystemMessageViewBinding = AutomodSystemMessageViewBinding.inflate(LayoutInflater.from(var1), this);
      r.g(var6, "inflate(...)");
      this.binding = var6;
      this.allowChildGestures = true;
      RippleUtilsKt.addRipple$default(this, false, SizeUtilsKt.getDpToPx(4), 1, null);
      var6.messageHeaderDivider.setBackgroundColor(ColorUtilsKt.getThemeColor(var1, R.color.message_divider_light, R.color.message_divider_dark));
      var var4: TextView = var6.messageHeaderTitle;
      var6.messageHeaderTitle.setTextColor(ThemeManagerKt.getTheme().getTextNormal());
      r.e(var4);
      val var3: DiscordFont = DiscordFont.PrimarySemibold;
      DiscordFontUtilsKt.setDiscordFont(var4, DiscordFont.PrimarySemibold);
      var4 = var6.messageHeaderSubtitle;
      var6.messageHeaderSubtitle.setTextColor(ThemeManagerKt.getTheme().getTextNormal());
      r.e(var4);
      DiscordFontUtilsKt.setDiscordFont(var4, DiscordFont.PrimaryNormal);
      var4 = var6.authorName;
      var6.authorName.setTextColor(ThemeManagerKt.getTheme().getTextBrand());
      r.e(var4);
      DiscordFontUtilsKt.setDiscordFont(var4, var3);
      SetTextSizeSpKt.setTextSizeSp(var4, 16.0F, 20.0F);
      val var9: SimpleDraweeView = var6.authorAvatar;
      r.g(var6.authorAvatar, "authorAvatar");
      ViewClippingUtilsKt.clipToCircle(var9);
      var4 = var6.automodMessageContextHeader;
      r.e(var6.automodMessageContextHeader);
      DiscordFontUtilsKt.setDiscordFont(var4, var3);
      var4.setTextColor(ThemeManagerKt.getTheme().getTextMuted());
      SetTextSizeSpKt.setTextSizeSp(var4, 16.0F, 20.0F);
      var4 = var6.automodMessageChannel;
      var6.automodMessageChannel.setBackgroundColor(ColorUtilsKt.getThemeColor(var1, com.discord.theme.R.color.brand_500, com.discord.theme.R.color.brand_600));
      var4.setTextColor(ColorUtilsKt.getThemeColor(var1, com.discord.theme.R.color.white_100, com.discord.theme.R.color.white_160));
      r.e(var4);
      DiscordFontUtilsKt.setDiscordFont(var4, var3);
      SetTextSizeSpKt.setTextSizeSp(var4, 12.0F, 15.0F);
      ViewClippingUtilsKt.clipToRoundedRectangle(var4, SizeUtilsKt.getDpToPx(4));
      val var5: TextView = var6.timestamp;
      r.e(var6.timestamp);
      DiscordFontUtilsKt.setDiscordFont(var5, DiscordFont.PrimaryMedium);
      var5.setTextColor(ThemeManagerKt.getTheme().getTextMuted());
      SetTextSizeSpKt.setTextSizeSp(var5, 12.0F, 15.0F);
      this.accessories = new ArrayList<>(2);
   }

   @SuppressLint(["SetTextI18n"])
   private fun configureAuthor(message: Message, automodContext: AutoModerationContext, eventHandler: ChatEventHandler) {
      val var5: SimpleDraweeView = this.binding.authorAvatar;
      val var6: Context = this.getContext();
      r.g(var6, "getContext(...)");
      var5.setImageURI(MessageKt.avatarUrl(var1, var6));
      this.binding.authorName.setText(var1.getUsername());
      MessageTagView.configureTagView-Ul7AT2Q$default(
         this.binding.messageTagView,
         var2.getHeaderBadgeText(),
         java.lang.Boolean.FALSE,
         null,
         null,
         null,
         var3,
         var1.getId-3Eiw7ao(),
         var1.getChannelId-o4g7jtM(),
         var1.getTagType(),
         null,
         512,
         null
      );
      this.binding.automodMessageContextHeader.setText(var2.getHeaderText());
      this.binding.timestamp.setText(var1.getTimestamp());
      val var11: TextView = this.binding.automodMessageChannel;
      val var9: java.lang.String = var2.getMessage().getChannelName();
      var var7: java.lang.String = var9;
      if (var9 == null) {
         var7 = "channel";
      }

      val var10: StringBuilder = new StringBuilder();
      var10.append("#");
      var10.append(var7);
      var11.setText(var10.toString());
      r.e(var11);
      var var4: Boolean;
      if (var2.getMessage().getChannelName() != null) {
         var4 = 1;
      } else {
         var4 = 0;
      }

      if (var4) {
         var4 = 0;
      } else {
         var4 = 8;
      }

      var11.setVisibility(var4);
      NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(var11, false, new com.discord.chat.presentation.message.system.a(var3, var2), 1, null);
   }

   @JvmStatic
   fun `configureAuthor$lambda$8$lambda$7`(var0: ChatEventHandler, var1: AutoModerationContext, var2: View) {
      val var5: java.lang.String = ChannelId.toString-impl(var1.getMessage().getChannelId-o4g7jtM());
      val var3: GuildId = var1.getMessage().getGuildId-qOKuAAo();
      val var4: java.lang.String;
      if (var3 != null) {
         var4 = GuildId.toString-impl(var3.unbox-impl());
      } else {
         var4 = null;
      }

      var0.onTapChannel(var5, var4, null);
   }

   private fun configureCommunicationDisabled(isCommunicationDisabled: Boolean) {
      val var4: SimpleDraweeView = this.binding.guildCommunicationDisabledIcon;
      r.e(this.binding.guildCommunicationDisabledIcon);
      val var3: Byte;
      if (var1) {
         var3 = 0;
      } else {
         var3 = 8;
      }

      var4.setVisibility(var3);
      if (var1) {
         ReactAssetUtilsKt.setReactAsset(var4, ReactAsset.ClockTimeout);
      }

      val var2: Float;
      if (var1) {
         var2 = 0.5F;
      } else {
         var2 = 1.0F;
      }

      this.binding.authorAvatar.setAlpha(var2);
   }

   private fun configureDivider(showDivider: Boolean) {
      val var3: View = this.binding.messageHeaderDivider;
      r.g(this.binding.messageHeaderDivider, "messageHeaderDivider");
      val var2: Byte;
      if (var1) {
         var2 = 0;
      } else {
         var2 = 8;
      }

      var3.setVisibility(var2);
   }

   private fun generateMessageAccessories(message: Message, messageContext: MessageContext): List<MessageAccessory> {
      this.accessories.clear();
      val var8: AutoModerationContext = var1.getAutoModerationContext();
      if (var8 == null) {
         return this.accessories;
      } else {
         val var17: FlaggedMessageEmbed = var8.getMessage();
         val var14: MessageType = MessageType.DEFAULT;
         val var15: java.lang.String = var17.getId-3Eiw7ao();
         val var6: Long = var17.getChannelId-o4g7jtM();
         val var16: GuildId = var17.getGuildId-qOKuAAo();
         val var9: UserId = var17.getUserId-wUX8bhU();
         val var13: java.lang.String = var17.getUsername();
         val var12: java.lang.String = var17.getAvatarURL();
         val var10: StructurableText = var17.getContent();
         val var3: Int = var17.getUsernameColor();
         val var11: Int = var17.getRoleColor();
         val var5: Boolean = var17.getShouldShowRoleDot();
         val var21: java.lang.Boolean = var17.getCommunicationDisabled();
         val var4: Boolean;
         if (var21 != null) {
            var4 = var21;
         } else {
            var4 = false;
         }

         val var20: Message = new Message(
            var14,
            var15,
            null,
            var6,
            var16,
            null,
            var9,
            0L,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            var13,
            var3,
            var11,
            null,
            var5,
            false,
            null,
            var12,
            null,
            null,
            null,
            null,
            var10,
            null,
            null,
            null,
            null,
            null,
            var1.getRoleIcon(),
            null,
            null,
            false,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            var4,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
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
            null,
            var8,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
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
            false,
            -139165788,
            -4115,
            -1025,
            7,
            null
         );
         if (var8.getNotification() != null) {
            this.accessories.add(new AutoModerationNotificationEmbedAccessory(var20.getId-3Eiw7ao(), var1, var8, null));
         } else {
            this.accessories.add(new FlaggedMessageEmbedAccessory(var20.getId-3Eiw7ao(), var20, var2, null));
            this.accessories.add(new FlaggedMessageActionBarAccessory(var20.getId-3Eiw7ao(), var1, var8, null));
         }

         val var19: java.util.List = var1.getReactions();
         if (var19 != null && var19.isEmpty() xor true) {
            this.accessories
               .add(
                  new ReactionsMessageAccessory(
                     var1.getId-3Eiw7ao(),
                     var1.getReactions(),
                     var2.getCanAddNewReactions(),
                     var2.getUseAddBurstReaction(),
                     var2.getAddReactionLabel(),
                     var2.getAddNewReactionAccessibilityLabel(),
                     var2.getAddNewBurstReactionAccessibilityLabel(),
                     var2.getReactionsTheme(),
                     null,
                     false,
                     false,
                     false,
                     false,
                     false,
                     null,
                     null,
                     null,
                     null,
                     null,
                     523776,
                     null
                  )
               );
         }

         val var18: ThreadEmbed = var1.getThreadEmbed();
         if (var18 != null) {
            this.accessories.add(new ThreadEmbedMessageAccessory(var1.getId-3Eiw7ao(), var18, null));
         }

         return this.accessories;
      }
   }

   public open fun onInterceptTouchEvent(ev: MotionEvent): Boolean {
      r.h(var1, "ev");
      return this.allowChildGestures xor true;
   }

   public fun setAccessoriesRecycledViewPool(recycledViewPool: RecycledViewPool) {
      r.h(var1, "recycledViewPool");
      this.binding.accessoriesView.setRecycledViewPool(var1);
   }

   public fun setMessage(
      message: Message,
      messageContext: MessageContext,
      eventHandler: ChatEventHandler = ChatEventHandler.Empty.INSTANCE,
      componentProvider: ComponentProvider? = null,
      allowChildGestures: Boolean = true
   ) {
      r.h(var1, "message");
      r.h(var2, "messageContext");
      r.h(var3, "eventHandler");
      this.allowChildGestures = var5;
      val var8: AutoModerationContext = var1.getAutoModerationContext();
      if (var8 != null) {
         this.configureAuthor(var1, var8, var3);
         this.configureCommunicationDisabled(r.c(var1.getCommunicationDisabled(), java.lang.Boolean.TRUE));
         this.configureDivider(var2.getShowDivider());
         val var9: java.lang.String = var1.getThreadStarterMessageHeader();
         val var14: ThreadStarterMessageHeaderView = this.binding.threadStarterHeader;
         if (var1.getReferencedMessage() != null) {
            var5 = true;
         } else {
            var5 = false;
         }

         var14.configure(var9, var5);
         this.binding.replyPreview.clear();
         val var11: java.util.List = this.generateMessageAccessories(var1, var2);
         val var15: MessageAccessoriesView = this.binding.accessoriesView;
         val var10: java.lang.String = var1.getId-3Eiw7ao();
         val var6: Long = var1.getChannelId-o4g7jtM();
         val var16: GuildId = var1.getGuildId-qOKuAAo();
         if (var1.getForwardInfo() != null) {
            var5 = true;
         } else {
            var5 = false;
         }

         var15.setAccessories-mFdI1tY(var10, var6, var16, var11, var3, var4, var2, false, var5);
      }
   }

   public override fun spacingPxOverride(): Int {
      return SizeUtilsKt.getDpToPx(8);
   }
}

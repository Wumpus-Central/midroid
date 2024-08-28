package com.discord.chat.presentation.message.view

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.MotionEvent
import android.view.View
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import com.discord.SetTextSizeSpKt
import com.discord.chat.R
import com.discord.chat.bridge.Message
import com.discord.chat.bridge.MessageKt
import com.discord.chat.bridge.structurabletext.StructurableText
import com.discord.chat.databinding.FlaggedMessageEmbedViewBinding
import com.discord.chat.presentation.events.ChatEventHandler
import com.discord.chat.presentation.message.ConnectionsRoleTagView
import com.discord.chat.presentation.message.RoleIconView
import com.discord.fonts.DiscordFont
import com.discord.fonts.DiscordFontUtilsKt
import com.discord.misc.utilities.size.SizeUtilsKt
import com.discord.misc.utilities.view.ViewClippingUtilsKt
import com.discord.primitives.ChannelId
import com.discord.react.FontManager
import com.discord.react_asset_fetcher.ReactAsset
import com.discord.react_asset_fetcher.ReactAssetUtilsKt
import com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchUtilsKt
import com.discord.recycler_view.decorations.VerticalSpacingItemDecoration.SpacingProviderView
import com.discord.ripple.RippleUtilsKt
import com.discord.theme.ThemeManagerKt
import com.facebook.drawee.view.SimpleDraweeView

public class FlaggedMessageEmbedView  public constructor(context: Context, attrs: AttributeSet? = null) : ConstraintLayout, SpacingProviderView {
   private final var allowChildGestures: Boolean
   private final val binding: FlaggedMessageEmbedViewBinding

   fun FlaggedMessageEmbedView(var1: Context) {
      kotlin.jvm.internal.q.h(var1, "context");
      this(var1, null, 2, null);
   }

   init {
      kotlin.jvm.internal.q.h(var1, "context");
      super(var1, var2);
      val var6: FlaggedMessageEmbedViewBinding = FlaggedMessageEmbedViewBinding.inflate(LayoutInflater.from(var1), this);
      kotlin.jvm.internal.q.g(var6, "inflate(...)");
      this.binding = var6;
      this.allowChildGestures = true;
      RippleUtilsKt.addRipple$default(this, false, SizeUtilsKt.getDpToPx(8), 1, null);
      val var5: View = var6.getRoot();
      var5.setBackgroundColor(ThemeManagerKt.getTheme().getBackgroundSecondary());
      kotlin.jvm.internal.q.e(var5);
      ViewClippingUtilsKt.clipToRoundedRectangle(var5, SizeUtilsKt.getDpToPx(8));
      val var4: Int = SizeUtilsKt.getDpToPx(12);
      var5.setPadding(var4, var4, var4, var4);
      val var8: TextView = var6.authorName;
      kotlin.jvm.internal.q.e(var6.authorName);
      DiscordFontUtilsKt.setDiscordFont(var8, DiscordFont.PrimarySemibold);
      var var3: Float = 16.0F;
      SetTextSizeSpKt.setTextSizeSp(var8, 16.0F, 20.0F);
      var8.setLineSpacing(0.0F, 1.05F);
      val var9: SimpleDraweeView = var6.authorAvatar;
      kotlin.jvm.internal.q.g(var6.authorAvatar, "authorAvatar");
      ViewClippingUtilsKt.clipToCircle(var9);
      val var7: MessageContentView = var6.contentView;
      var6.contentView.setTextColor(ThemeManagerKt.getTheme().getTextNormal());
      kotlin.jvm.internal.q.e(var7);
      DiscordFontUtilsKt.setDiscordFont(var7, DiscordFont.PrimaryMedium);
      if (FontManager.INSTANCE.getIsClassicChatFontScaleEnabled(var1)) {
         var3 = 14.0F;
      }

      SetTextSizeSpKt.setTextSizeSp(var7, var3);
   }

   private fun configureAuthor(message: Message, eventHandler: ChatEventHandler) {
      val var6: SimpleDraweeView = this.binding.authorAvatar;
      val var7: Context = this.binding.authorAvatar.getContext();
      kotlin.jvm.internal.q.g(var7, "getContext(...)");
      var6.setImageURI(MessageKt.avatarUrl(var1, var7));
      kotlin.jvm.internal.q.e(var6);
      NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(var6, false, new a0(var1, var2), 1, null);
      NestedScrollOnTouchUtilsKt.setOnLongClickListenerNested$default(var6, false, new b0(var1, var2), 1, null);
      val var11: TextView = this.binding.authorName;
      this.binding.authorName.setTextColor(MessageKt.usernameColor$default(var1, 0, 1, null));
      var11.setText(var1.getUsername());
      kotlin.jvm.internal.q.e(var11);
      NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(var11, false, new c0(var1, var2), 1, null);
      val var12: RoleIconView = this.binding.roleIcon;
      kotlin.jvm.internal.q.e(this.binding.roleIcon);
      var var3: Boolean;
      if (var1.getRoleIcon() != null) {
         var3 = 1;
      } else {
         var3 = 0;
      }

      if (var3) {
         var3 = 0;
      } else {
         var3 = 8;
      }

      var12.setVisibility(var3);
      if (var1.getRoleIcon() != null) {
         var12.configureRoleIcon(var1.getRoleIcon(), var2);
      }

      val var13: ConnectionsRoleTagView = this.binding.connectionsRoleTag;
      kotlin.jvm.internal.q.e(this.binding.connectionsRoleTag);
      var var9: Boolean;
      if (var1.getConnectionsRoleTag() != null) {
         var9 = 1;
      } else {
         var9 = 0;
      }

      if (var9) {
         var9 = 0;
      } else {
         var9 = 8;
      }

      var13.setVisibility(var9);
      if (var1.getConnectionsRoleTag() != null) {
         var13.configureConnectionsRoleTag-uESh2Cg(
            var1.getAuthorId-wUX8bhU(), var1.getGuildId-qOKuAAo(), ChannelId.box-impl(var1.getChannelId-o4g7jtM()), var1.getConnectionsRoleTag(), var2
         );
      }
   }

   @JvmStatic
   fun `configureAuthor$lambda$7$lambda$5`(var0: Message, var1: ChatEventHandler, var2: View) {
      kotlin.jvm.internal.q.h(var0, "$message");
      kotlin.jvm.internal.q.h(var1, "$eventHandler");
      if (var0.getAuthorId-wUX8bhU() != null) {
         var1.onTapAvatar-x5gers8(var0.getId-3Eiw7ao(), var0.getAuthorId-wUX8bhU().unbox-impl());
      }
   }

   @JvmStatic
   fun `configureAuthor$lambda$7$lambda$6`(var0: Message, var1: ChatEventHandler, var2: View): Boolean {
      kotlin.jvm.internal.q.h(var0, "$message");
      kotlin.jvm.internal.q.h(var1, "$eventHandler");
      if (var0.getAuthorId-wUX8bhU() != null) {
         var1.onLongPressAvatar-x5gers8(var0.getId-3Eiw7ao(), var0.getAuthorId-wUX8bhU().unbox-impl());
      }

      return true;
   }

   @JvmStatic
   fun `configureAuthor$lambda$9$lambda$8`(var0: Message, var1: ChatEventHandler, var2: View) {
      kotlin.jvm.internal.q.h(var0, "$message");
      kotlin.jvm.internal.q.h(var1, "$eventHandler");
      if (var0.getAuthorId-wUX8bhU() != null) {
         var1.onLongPressUsername-x5gers8(var0.getId-3Eiw7ao(), var0.getAuthorId-wUX8bhU().unbox-impl());
      }
   }

   private fun configureCommunicationDisabled(isCommunicationDisabled: Boolean) {
      var var5: SimpleDraweeView = this.binding.guildCommunicationDisabledIcon;
      kotlin.jvm.internal.q.g(this.binding.guildCommunicationDisabledIcon, "guildCommunicationDisabledIcon");
      val var4: Byte;
      if (var1) {
         var4 = 0;
      } else {
         var4 = 8;
      }

      var5.setVisibility(var4);
      var5 = this.binding.guildCommunicationDisabledIcon;
      kotlin.jvm.internal.q.g(this.binding.guildCommunicationDisabledIcon, "guildCommunicationDisabledIcon");
      ReactAssetUtilsKt.setReactAsset(var5, ReactAsset.ClockTimeout);
      var var2: Float;
      if (var1) {
         var2 = 0.5F;
      } else {
         var2 = 1.0F;
      }

      this.binding.authorAvatar.setAlpha(var2);
      if (var1) {
         var2 = 0.5F;
      } else {
         var2 = 1.0F;
      }

      this.binding.roleIcon.setAlpha(var2);
      var2 = 1.0F;
      if (var1) {
         var2 = 0.5F;
      }

      this.binding.connectionsRoleTag.setAlpha(var2);
   }

   private fun configureMessageContent(message: Message) {
      val var8: MessageContentView = this.binding.contentView;
      val var9: Int = var1.getConstrainedWidth();
      val var2: Int;
      if (var9 != null) {
         var2 = var9;
      } else {
         var2 = var8.getResources().getDisplayMetrics().widthPixels;
      }

      kotlin.jvm.internal.q.e(var8);
      val var16: StructurableText = var1.getContent();
      var var3: Boolean;
      if (var16 != null && var16.getHasContent()) {
         var3 = 1;
      } else {
         var3 = 0;
      }

      if (var3) {
         var3 = 0;
      } else {
         var3 = 8;
      }

      var8.setVisibility(var3);
      val var17: StructurableText = var1.getContent();
      if (var17 != null && var17.getHasContent()) {
         MessageContentView.setMessageContent-2ZcwkLU$default(
            var8,
            var1.getContent(),
            var1.getId-3Eiw7ao(),
            MessageKt.shouldAnimateEmoji(var1),
            MessageKt.shouldShowLinkDecorations(var1),
            var1.getShouldShowRoleDot(),
            var1.getShouldShowRoleOnName(),
            <unrepresentable>.INSTANCE,
            <unrepresentable>.INSTANCE,
            <unrepresentable>.INSTANCE,
            <unrepresentable>.INSTANCE,
            <unrepresentable>.INSTANCE,
            <unrepresentable>.INSTANCE,
            <unrepresentable>.INSTANCE,
            <unrepresentable>.INSTANCE,
            <unrepresentable>.INSTANCE,
            <unrepresentable>.INSTANCE,
            <unrepresentable>.INSTANCE,
            <unrepresentable>.INSTANCE,
            <unrepresentable>.INSTANCE,
            <unrepresentable>.INSTANCE,
            var8.getResources().getDimensionPixelSize(R.dimen.message_accessories_vertical_spacing),
            var2,
            false,
            null,
            null,
            null,
            null,
            null,
            260046848,
            null
         );
      }

      val var15: FlaggedMessageEmbedFooterView = this.binding.contentFooterView;
      kotlin.jvm.internal.q.e(this.binding.contentFooterView);
      var var11: Boolean;
      if (var1.getAutoModerationContext() != null) {
         var11 = 1;
      } else {
         var11 = 0;
      }

      if (var11) {
         var11 = 0;
      } else {
         var11 = 8;
      }

      var15.setVisibility(var11);
      if (var1.getAutoModerationContext() != null) {
         var15.setAutomodContext(var1.getAutoModerationContext());
      }
   }

   public open fun onInterceptTouchEvent(ev: MotionEvent): Boolean {
      kotlin.jvm.internal.q.h(var1, "ev");
      return this.allowChildGestures xor true;
   }

   public fun setMessage(message: Message, eventHandler: ChatEventHandler = ChatEventHandler.Empty.INSTANCE, allowChildGestures: Boolean = true) {
      kotlin.jvm.internal.q.h(var1, "message");
      kotlin.jvm.internal.q.h(var2, "eventHandler");
      this.allowChildGestures = var3;
      this.configureAuthor(var1, var2);
      this.configureCommunicationDisabled(kotlin.jvm.internal.q.c(var1.getCommunicationDisabled(), java.lang.Boolean.TRUE));
      this.configureMessageContent(var1);
   }

   public open fun spacingPxOverride(): Int {
      return SizeUtilsKt.getDpToPx(4);
   }
}

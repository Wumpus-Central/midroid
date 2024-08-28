package com.discord.chat.presentation.message

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.widget.FrameLayout
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import com.discord.SetTextSizeSpKt
import com.discord.chat.bridge.connectionsroletag.ConnectionsRoleTag
import com.discord.chat.databinding.ConnectionsRoleTagViewBinding
import com.discord.chat.presentation.events.ChatEventHandler
import com.discord.fonts.DiscordFont
import com.discord.fonts.DiscordFontUtilsKt
import com.discord.primitives.ChannelId
import com.discord.primitives.GuildId
import com.discord.primitives.UserId
import com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchUtilsKt
import com.discord.theme.ThemeManagerKt
import com.discord.theme.utils.ColorUtilsKt

public class ConnectionsRoleTagView(context: Context, attrs: AttributeSet) : FrameLayout {
   private final val binding: ConnectionsRoleTagViewBinding

   init {
      kotlin.jvm.internal.r.h(var1, "context");
      kotlin.jvm.internal.r.h(var2, "attrs");
      super(var1, var2);
      val var5: ConnectionsRoleTagViewBinding = ConnectionsRoleTagViewBinding.inflate(LayoutInflater.from(var1), this);
      kotlin.jvm.internal.r.g(var5, "inflate(LayoutInflater.from(context), this)");
      this.binding = var5;
      var5.connectionsRoleTagContainer.setCardBackgroundColor(ThemeManagerKt.getTheme().getBackgroundSecondaryAlt());
      var5.roleName.setTextColor(ThemeManagerKt.getTheme().getHeaderPrimary());
      val var3: TextView = var5.roleName;
      kotlin.jvm.internal.r.g(var5.roleName, "binding.roleName");
      SetTextSizeSpKt.setTextSizeSp(var3, 12.0F);
      val var4: TextView = var5.roleName;
      kotlin.jvm.internal.r.g(var5.roleName, "binding.roleName");
      DiscordFontUtilsKt.setDiscordFont(var4, DiscordFont.PrimaryBold);
   }

   @JvmStatic
   fun `configureConnectionsRoleTag_uESh2Cg$lambda$0`(
      var0: ChatEventHandler, var1: UserId, var2: GuildId, var3: ChannelId, var4: ConnectionsRoleTag, var5: View
   ) {
      kotlin.jvm.internal.r.h(var0, "$eventHandler");
      kotlin.jvm.internal.r.h(var4, "$connectionsRoleTag");
      var0.onTapConnectionsRoleTag(
         UserId.toString-impl(var1.unbox-impl()), GuildId.toString-impl(var2.unbox-impl()), ChannelId.toString-impl(var3.unbox-impl()), var4.getId()
      );
   }

   public fun configureConnectionsRoleTag(
      userId: UserId?,
      guildId: GuildId?,
      channelId: ChannelId?,
      connectionsRoleTag: ConnectionsRoleTag,
      eventHandler: ChatEventHandler
   ) {
      kotlin.jvm.internal.r.h(var4, "connectionsRoleTag");
      kotlin.jvm.internal.r.h(var5, "eventHandler");
      var var6: ImageView = this.binding.verifiedCheckIconBackground;
      kotlin.jvm.internal.r.g(this.binding.verifiedCheckIconBackground, "binding.verifiedCheckIconBackground");
      ColorUtilsKt.setTintColor(var6, var4.getBackgroundColor());
      var6 = this.binding.verifiedCheckIcon;
      kotlin.jvm.internal.r.g(this.binding.verifiedCheckIcon, "binding.verifiedCheckIcon");
      ColorUtilsKt.setTintColor(var6, var4.getIconColor());
      this.binding.roleName.setText(var4.getName());
      if (var1 != null && var2 != null && var3 != null) {
         val var8: CardView = this.binding.connectionsRoleTagContainer;
         kotlin.jvm.internal.r.g(this.binding.connectionsRoleTagContainer, "binding.connectionsRoleTagContainer");
         NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(var8, false, new b(var5, var1, var2, var3, var4), 1, null);
      }
   }
}

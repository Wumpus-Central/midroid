package com.discord.chat.presentation.message.viewholder

import com.discord.activity_invites.ActivityRichPresenceInviteEmbedView
import com.discord.chat.bridge.activities.ActivityRichPresenceInviteEmbed
import com.discord.chat.presentation.message.messagepart.ActivityRichPresenceInviteEmbedMessageAccessory

public class ActivityRichPresenceInviteEmbedViewHolder(activityRichPresenceInviteEmbedView: ActivityRichPresenceInviteEmbedView) : MessagePartViewHolder {
   private final val activityRichPresenceInviteEmbedView: ActivityRichPresenceInviteEmbedView

   init {
      kotlin.jvm.internal.r.h(var1, "activityRichPresenceInviteEmbedView");
      super(var1, null);
      this.activityRichPresenceInviteEmbedView = var1;
   }

   public fun bind(accessory: ActivityRichPresenceInviteEmbedMessageAccessory) {
      kotlin.jvm.internal.r.h(var1, "accessory");
      val var9: ActivityRichPresenceInviteEmbed = var1.getActivityRichPresenceInviteEmbed();
      val var8: ActivityRichPresenceInviteEmbedView = this.activityRichPresenceInviteEmbedView;
      val var15: java.lang.String = var9.getHeaderText();
      val var5: java.lang.String = var9.getTitle();
      val var6: java.lang.String = var9.getSubtitle();
      val var7: java.lang.String = var9.getIconSrc();
      val var10: java.lang.Boolean = var9.isSpotifyParty();
      val var3: Boolean;
      if (var10 != null) {
         var3 = var10;
      } else {
         var3 = false;
      }

      val var17: java.lang.String = var9.getFooterLabel();
      val var11: Int = var9.getMaxPartySize();
      val var2: Int;
      if (var11 != null) {
         var2 = var11;
      } else {
         var2 = 0;
      }

      val var14: java.lang.String = var9.getPartySizeText();
      val var13: java.util.List = var9.getPartyMemberAvatarURIs();
      val var12: java.util.List = var9.getPlatformIconKeys();
      val var18: java.util.List = var9.getGradientColors();
      val var16: java.lang.Boolean = var9.isActive();
      val var4: Boolean;
      if (var16 != null) {
         var4 = var16;
      } else {
         var4 = false;
      }

      var8.setActivityRichPresenceInviteEmbed(var15, var5, var6, var7, var3, var17, var2, var14, var13, var12, var18, var4);
   }
}

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
      val var10: ActivityRichPresenceInviteEmbed = var1.getActivityRichPresenceInviteEmbed();
      val var7: ActivityRichPresenceInviteEmbedView = this.activityRichPresenceInviteEmbedView;
      val var6: java.lang.String = var10.getHeaderText();
      val var8: java.lang.String = var10.getTitle();
      val var15: java.lang.String = var10.getSubtitle();
      val var5: java.lang.String = var10.getIconSrc();
      val var9: java.lang.Boolean = var10.isSpotifyParty();
      val var3: Boolean;
      if (var9 != null) {
         var3 = var9;
      } else {
         var3 = false;
      }

      val var16: java.lang.String = var10.getFooterLabel();
      val var11: Int = var10.getMaxPartySize();
      val var2: Int;
      if (var11 != null) {
         var2 = var11;
      } else {
         var2 = 0;
      }

      val var13: java.lang.String = var10.getPartySizeText();
      val var14: java.util.List = var10.getPartyMemberAvatarURIs();
      val var12: java.util.List = var10.getPlatformIconKeys();
      val var18: java.util.List = var10.getGradientColors();
      val var17: java.lang.Boolean = var10.isActive();
      val var4: Boolean;
      if (var17 != null) {
         var4 = var17;
      } else {
         var4 = false;
      }

      var7.setActivityRichPresenceInviteEmbed(var6, var8, var15, var5, var3, var16, var2, var13, var14, var12, var18, var4);
   }
}

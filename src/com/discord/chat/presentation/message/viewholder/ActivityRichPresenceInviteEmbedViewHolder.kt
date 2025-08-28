package com.discord.chat.presentation.message.viewholder

import android.view.View
import com.discord.activity_invites.ActivityRichPresenceInviteEmbedView
import com.discord.chat.bridge.activities.ActivityRichPresenceInviteEmbed
import com.discord.chat.presentation.message.messagepart.ActivityRichPresenceInviteEmbedMessageAccessory
import com.discord.primitives.MessageId
import kotlin.jvm.functions.Function1

public class ActivityRichPresenceInviteEmbedViewHolder(activityRichPresenceInviteEmbedView: ActivityRichPresenceInviteEmbedView) : MessagePartViewHolder(var1) {
   private final val activityRichPresenceInviteEmbedView: ActivityRichPresenceInviteEmbedView

   init {
      this.activityRichPresenceInviteEmbedView = var1;
   }

   @JvmStatic
   fun `bind$lambda$0`(var0: Function1, var1: ActivityRichPresenceInviteEmbedMessageAccessory, var2: View) {
      var0.invoke(MessageId.box-impl(var1.getMessageId-3Eiw7ao()));
   }

   public fun bind(accessory: ActivityRichPresenceInviteEmbedMessageAccessory, onTapJoinRichPresence: (MessageId) -> Unit) {
      val var8: ActivityRichPresenceInviteEmbed = var1.getActivityRichPresenceInviteEmbed();
      val var7: ActivityRichPresenceInviteEmbedView = this.activityRichPresenceInviteEmbedView;
      val var9: java.lang.Boolean = var8.getCtaButtonEnabled();
      var var3: Int = 0;
      val var4: Boolean;
      if (var9 != null) {
         var4 = var9;
      } else {
         var4 = false;
      }

      val var10: java.lang.String = var8.getCtaButtonText();
      val var15: java.lang.String = var8.getFooterLabel();
      val var12: java.util.List = var8.getGradientColors();
      val var11: java.lang.String = var8.getHeaderText();
      val var13: java.lang.String = var8.getIconSrc();
      var var14: java.lang.Boolean = var8.isActive();
      val var5: Boolean;
      if (var14 != null) {
         var5 = var14;
      } else {
         var5 = false;
      }

      var14 = var8.isSpotifyParty();
      val var6: Boolean;
      if (var14 != null) {
         var6 = var14;
      } else {
         var6 = false;
      }

      val var17: Int = var8.getMaxPartySize();
      if (var17 != null) {
         var3 = var17;
      }

      var7.setActivityRichPresenceInviteEmbed(
         var4,
         var10,
         var15,
         var12,
         var11,
         var13,
         var5,
         var6,
         var3,
         new b(var2, var1),
         var8.getPartyMemberAvatarURIs(),
         var8.getPartySizeText(),
         var8.getPlatformIconKeys(),
         var8.getSubtitle(),
         var8.getTitle()
      );
   }
}

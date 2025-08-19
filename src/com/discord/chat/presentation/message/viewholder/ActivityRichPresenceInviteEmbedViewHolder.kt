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
      val var7: ActivityRichPresenceInviteEmbed = var1.getActivityRichPresenceInviteEmbed();
      val var8: ActivityRichPresenceInviteEmbedView = this.activityRichPresenceInviteEmbedView;
      val var9: java.lang.Boolean = var7.getCtaButtonEnabled();
      var var3: Int = 0;
      val var4: Boolean;
      if (var9 != null) {
         var4 = var9;
      } else {
         var4 = false;
      }

      val var11: java.lang.String = var7.getCtaButtonText();
      val var13: java.lang.String = var7.getFooterLabel();
      val var12: java.util.List = var7.getGradientColors();
      val var10: java.lang.String = var7.getHeaderText();
      val var15: java.lang.String = var7.getIconSrc();
      var var14: java.lang.Boolean = var7.isActive();
      val var5: Boolean;
      if (var14 != null) {
         var5 = var14;
      } else {
         var5 = false;
      }

      var14 = var7.isSpotifyParty();
      val var6: Boolean;
      if (var14 != null) {
         var6 = var14;
      } else {
         var6 = false;
      }

      val var17: Int = var7.getMaxPartySize();
      if (var17 != null) {
         var3 = var17;
      }

      var8.setActivityRichPresenceInviteEmbed(
         var4,
         var11,
         var13,
         var12,
         var10,
         var15,
         var5,
         var6,
         var3,
         new b(var2, var1),
         var7.getPartyMemberAvatarURIs(),
         var7.getPartySizeText(),
         var7.getPlatformIconKeys(),
         var7.getSubtitle(),
         var7.getTitle()
      );
   }
}

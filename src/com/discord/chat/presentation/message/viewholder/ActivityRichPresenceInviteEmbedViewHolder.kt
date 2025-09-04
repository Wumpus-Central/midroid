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
      val var9: ActivityRichPresenceInviteEmbed = var1.getActivityRichPresenceInviteEmbed();
      val var8: ActivityRichPresenceInviteEmbedView = this.activityRichPresenceInviteEmbedView;
      val var10: java.lang.Boolean = var9.getCtaButtonEnabled();
      var var3: Int = 0;
      val var4: Boolean;
      if (var10 != null) {
         var4 = var10;
      } else {
         var4 = false;
      }

      val var16: java.lang.String = var9.getCtaButtonText();
      val var11: java.lang.Boolean = var9.getCtaButtonIsLoading();
      val var5: Boolean;
      if (var11 != null) {
         var5 = var11;
      } else {
         var5 = false;
      }

      val var14: java.lang.String = var9.getFooterLabel();
      val var12: java.util.List = var9.getGradientColors();
      val var13: java.lang.String = var9.getHeaderText();
      val var17: java.lang.String = var9.getIconSrc();
      var var15: java.lang.Boolean = var9.isActive();
      val var6: Boolean;
      if (var15 != null) {
         var6 = var15;
      } else {
         var6 = false;
      }

      var15 = var9.isSpotifyParty();
      val var7: Boolean;
      if (var15 != null) {
         var7 = var15;
      } else {
         var7 = false;
      }

      val var19: Int = var9.getMaxPartySize();
      if (var19 != null) {
         var3 = var19;
      }

      var8.setActivityRichPresenceInviteEmbed(
         var4,
         var16,
         var5,
         var14,
         var12,
         var13,
         var17,
         var6,
         var7,
         var3,
         new b(var2, var1),
         var9.getPartyMemberAvatarURIs(),
         var9.getPartySizeText(),
         var9.getPlatformIconKeys(),
         var9.getSubtitle(),
         var9.getTitle()
      );
   }
}

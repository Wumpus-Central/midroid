package com.discord.react_asset_fetcher

import android.content.Context
import kotlin.enums.EnumEntries
import kotlin.jvm.internal.q
import nh.a

public enum class ReactAsset {
   Activity,
   AddBurstReaction,
   AddReaction,
   Alert,
   AnnouncementThread,
   AppsIcon,
   ArrowAngleRightUpIcon,
   ArrowBack,
   ArrowForward,
   ArrowRight,
   Attachment,
   BellSnooze,
   CallConnect,
   CallDisconnect,
   CallStatusGreen,
   CallStatusRed,
   CallStatusUnknown,
   CallStatusYellow,
   Cancel,
   Caret,
   ChannelBrowse,
   ChatArrowRightIcon,
   Check,
   Checkmark,
   Clip,
   ClockTimeout,
   Close,
   DefaultAvatar0,
   DefaultAvatar1,
   DefaultAvatar2,
   DefaultAvatar3,
   DefaultAvatar4,
   DefaultGroup0,
   DefaultGroup1,
   DefaultGroup2,
   DefaultGroup3,
   DefaultGroup4,
   DefaultGroup5,
   DefaultGroup6,
   DefaultGroup7,
   Disconnect,
   Download,
   File,
   Gif,
   Help,
   HideMedia,
   Highlight,
   Home,
   ImageIcon,
   Info,
   InvitesDisabled,
   JumpToBottom,
   Launch,
   Link,
   LockClosed,
   LockOpen,
   MediaChannelNSFW,
   MemberListBadge,
   Members,
   Mic,
   MicMutedDark,
   More,
   MoveToSpeaker,
   Pause,
   Pencil,
   PersonShield,
   Pin,
   Play,
   PollsIcon,
   PoopDark,
   PoopLight,
   RaisedHand,
   Reactions,
   Remix,
   Reply,
   RoleSubscriptionBadge,
   RoleSubscriptionLanyard,
   RoleSubscriptionPurchaseCardBg,
   ShowMedia,
   ShowPassword,
   Speaker,
   StageChannel,
   Summary,
   SummaryIndicatorEnd,
   SummaryIndicatorStart,
   TextChannel,
   Thread,
   Ticket,
   Upload,
   Volume,
   VolumeMute,
   Warning,
   WarningTriangle   @JvmStatic
   private EnumEntries $ENTRIES;
   @JvmStatic
   private ReactAsset[] $VALUES;

   @JvmStatic
   fun {
      val var0: Array<ReactAsset> = $values();
      $VALUES = var0;
      $ENTRIES = a.a(var0);
   }

   @JvmStatic
   fun getEntries(): EnumEntries {
      return $ENTRIES;
   }

   public fun getUri(context: Context): String {
      q.h(var1, "context");
      return ReactAssetCache.INSTANCE.get(var1, this);
   }
}

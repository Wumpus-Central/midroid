package com.discord.notifications.actions.intents

import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.os.Parcel
import com.discord.primitives.ChannelId
import com.discord.primitives.GuildId
import com.discord.react.headless_tasks.api.HeadlessTasks
import kotlin.jvm.internal.r

public class MuteAction(tag: String, guildId: GuildId?, channelId: ChannelId) : MuteAction(var1, var2, var3), NotificationAction {
   private final val channelId: ChannelId
   private final val guildId: GuildId?
   public open val tag: String

   fun MuteAction(var1: java.lang.String, var2: GuildId, var3: Long) {
      this.tag = var1;
      this.guildId = var2;
      this.channelId = var3;
   }

   public open fun describeContents(): Int {
      return 0;
   }

   override fun getPendingIntentRequestCode(): Int {
      return NotificationAction.DefaultImpls.getPendingIntentRequestCode(this);
   }

   public override fun onNotificationAction(context: Context, intent: Intent) {
      r.h(var1, "context");
      r.h(var2, "intent");
      val var5: com.discord.react.headless_tasks.api.HeadlessTasks.Companion = HeadlessTasks.Companion;
      val var4: Bundle = new Bundle();
      if (this.guildId != null) {
         var4.putString("guildId", java.lang.String.valueOf(this.guildId.unbox_impl()));
      }

      var4.putString("channelId", java.lang.String.valueOf(this.channelId));
      com.discord.react.headless_tasks.api.HeadlessTasks.Companion.startHeadlessTask$default(var5, var1, "MuteAction", 0L, false, var4, true, 12, null);
   }

   override fun onNotificationActionComplete(var1: Context) {
      NotificationAction.DefaultImpls.onNotificationActionComplete(this, var1);
   }

   override fun toPendingIntent(var1: Context, var2: Int, var3: Boolean): PendingIntent {
      return NotificationAction.DefaultImpls.toPendingIntent(this, var1, var2, var3);
   }

   public open fun writeToParcel(parcel: Parcel, flags: Int) {
      r.h(var1, "out");
      var1.writeString(this.tag);
      var1.writeParcelable(this.guildId, var2);
      var1.writeParcelable(ChannelId.box_impl(this.channelId), var2);
   }

   // $VF: Class flags could not be determined
   internal class Creator : android.os.Parcelable.Creator<MuteAction> {
      fun createFromParcel(var1: Parcel): MuteAction {
         r.h(var1, "parcel");
         return new MuteAction(
            var1.readString(),
            var1.readParcelable(MuteAction.class.getClassLoader()) as GuildId,
            (var1.readParcelable(MuteAction.class.getClassLoader()) as ChannelId).unbox_impl(),
            null
         );
      }

      fun newArray(var1: Int): Array<MuteAction> {
         return new MuteAction[var1];
      }
   }
}

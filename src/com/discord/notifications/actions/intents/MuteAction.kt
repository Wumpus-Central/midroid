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

public class MuteAction(tag: String, guildId: GuildId?, channelId: ChannelId, muteTime: Int?) : MuteAction(var1, var2, var3, var5), NotificationAction {
   public open val tag: String
   private final val guildId: GuildId?
   private final val channelId: ChannelId
   private final val muteTime: Int?

   fun MuteAction(var1: java.lang.String, var2: GuildId, var3: Long, var5: Int) {
      r.h(var1, "tag");
      super();
      this.tag = var1;
      this.guildId = var2;
      this.channelId = var3;
      this.muteTime = var5;
   }

   public fun describeContents(): Int {
      return 0;
   }

   override fun getPendingIntentRequestCode(): Int {
      return NotificationAction.DefaultImpls.getPendingIntentRequestCode(this);
   }

   public override fun onNotificationAction(context: Context, intent: Intent) {
      r.h(var1, "context");
      r.h(var2, "intent");
      val var4: HeadlessTasks.Companion = HeadlessTasks.Companion;
      val var5: Bundle = new Bundle();
      if (this.guildId != null) {
         var5.putString("guildId", java.lang.String.valueOf(this.guildId.unbox-impl()));
      }

      var5.putString("channelId", java.lang.String.valueOf(this.channelId));
      if (this.muteTime != null) {
         var5.putInt("muteTime", this.muteTime);
      }

      HeadlessTasks.Companion.startHeadlessTask$default(var4, var1, "MuteAction", 0L, false, var5, true, 12, null);
   }

   override fun onNotificationActionComplete(var1: Context) {
      NotificationAction.DefaultImpls.onNotificationActionComplete(this, var1);
   }

   override fun toPendingIntent(var1: Context, var2: Int, var3: Boolean): PendingIntent {
      return NotificationAction.DefaultImpls.toPendingIntent(this, var1, var2, var3);
   }

   public fun writeToParcel(dest: Parcel, flags: Int) {
      r.h(var1, "dest");
      var1.writeString(this.tag);
      var1.writeParcelable(this.guildId, var2);
      var1.writeParcelable(ChannelId.box-impl(this.channelId), var2);
      val var3: Int = this.muteTime;
      if (this.muteTime == null) {
         var2 = 0;
      } else {
         var1.writeInt(1);
         var2 = var3;
      }

      var1.writeInt(var2);
   }

   // $VF: Class flags could not be determined
   internal class Creator : android.os.Parcelable.Creator<MuteAction> {
      fun createFromParcel(var1: Parcel): MuteAction {
         r.h(var1, "parcel");
         val var4: java.lang.String = var1.readString();
         val var5: GuildId = var1.readParcelable(MuteAction.class.getClassLoader()) as GuildId;
         val var2: Long = (var1.readParcelable(MuteAction.class.getClassLoader()) as ChannelId).unbox-impl();
         val var6: Int;
         if (var1.readInt() == 0) {
            var6 = null;
         } else {
            var6 = var1.readInt();
         }

         return new MuteAction(var4, var5, var2, var6, null);
      }

      fun newArray(var1: Int): Array<MuteAction> {
         return new MuteAction[var1];
      }
   }
}

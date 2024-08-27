package com.discord.notifications.actions.intents

import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.os.Parcel
import com.discord.primitives.ChannelId
import com.discord.react.headless_tasks.api.HeadlessTasks
import kotlin.jvm.internal.r

public data class DismissCallAction(tag: String, channelId: ChannelId) : DismissCallAction(var1, var2), NotificationAction {
   private final val channelId: ChannelId
   public open val tag: String

   fun DismissCallAction(var1: java.lang.String, var2: Long) {
      this.tag = var1;
      this.channelId = var2;
   }

   private operator fun component2(): ChannelId {
      return this.channelId;
   }

   public operator fun component1(): String {
      return this.getTag();
   }

   public fun copy(tag: String = ..., channelId: ChannelId = ...): DismissCallAction {
      r.h(var1, "tag");
      return new DismissCallAction(var1, var2, null);
   }

   public open fun describeContents(): Int {
      return 0;
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is DismissCallAction) {
         return false;
      } else {
         var1 = var1;
         if (!r.c(this.getTag(), var1.getTag())) {
            return false;
         } else {
            return ChannelId.equals-impl0(this.channelId, var1.channelId);
         }
      }
   }

   override fun getPendingIntentRequestCode(): Int {
      return NotificationAction.DefaultImpls.getPendingIntentRequestCode(this);
   }

   public override fun hashCode(): Int {
      return this.getTag().hashCode() * 31 + ChannelId.hashCode-impl(this.channelId);
   }

   public override fun onNotificationAction(context: Context, intent: Intent) {
      r.h(var1, "context");
      r.h(var2, "intent");
      val var4: com.discord.react.headless_tasks.api.HeadlessTasks.Companion = HeadlessTasks.Companion;
      val var3: Bundle = new Bundle();
      var3.putString("channelId", java.lang.String.valueOf(this.channelId));
      com.discord.react.headless_tasks.api.HeadlessTasks.Companion.startHeadlessTask$default(var4, var1, "DismissCallAction", 0L, false, var3, true, 12, null);
   }

   override fun onNotificationActionComplete(var1: Context) {
      NotificationAction.DefaultImpls.onNotificationActionComplete(this, var1);
   }

   override fun toPendingIntent(var1: Context, var2: Int, var3: Boolean): PendingIntent {
      return NotificationAction.DefaultImpls.toPendingIntent(this, var1, var2, var3);
   }

   public override fun toString(): String {
      val var3: java.lang.String = this.getTag();
      val var1: java.lang.String = ChannelId.toString-impl(this.channelId);
      val var2: StringBuilder = new StringBuilder();
      var2.append("DismissCallAction(tag=");
      var2.append(var3);
      var2.append(", channelId=");
      var2.append(var1);
      var2.append(")");
      return var2.toString();
   }

   public open fun writeToParcel(parcel: Parcel, flags: Int) {
      r.h(var1, "out");
      var1.writeString(this.tag);
      var1.writeParcelable(ChannelId.box-impl(this.channelId), var2);
   }

   // $VF: Class flags could not be determined
   internal class Creator : android.os.Parcelable.Creator<DismissCallAction> {
      fun createFromParcel(var1: Parcel): DismissCallAction {
         r.h(var1, "parcel");
         return new DismissCallAction(var1.readString(), (var1.readParcelable(DismissCallAction.class.getClassLoader()) as ChannelId).unbox-impl(), null);
      }

      fun newArray(var1: Int): Array<DismissCallAction> {
         return new DismissCallAction[var1];
      }
   }
}

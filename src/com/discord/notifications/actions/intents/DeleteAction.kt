package com.discord.notifications.actions.intents

import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.os.Parcel
import kotlin.jvm.internal.q

public class DeleteAction(tag: String) : NotificationAction {
   public open val tag: String

   init {
      q.h(var1, "tag");
      super();
      this.tag = var1;
   }

   public open fun describeContents(): Int {
      return 0;
   }

   override fun getPendingIntentRequestCode(): Int {
      return NotificationAction.DefaultImpls.getPendingIntentRequestCode(this);
   }

   override fun onNotificationAction(var1: Context, var2: Intent) {
      NotificationAction.DefaultImpls.onNotificationAction(this, var1, var2);
   }

   override fun onNotificationActionComplete(var1: Context) {
      NotificationAction.DefaultImpls.onNotificationActionComplete(this, var1);
   }

   override fun toPendingIntent(var1: Context, var2: Int, var3: Boolean): PendingIntent {
      return NotificationAction.DefaultImpls.toPendingIntent(this, var1, var2, var3);
   }

   public open fun writeToParcel(parcel: Parcel, flags: Int) {
      q.h(var1, "out");
      var1.writeString(this.tag);
   }

   // $VF: Class flags could not be determined
   internal class Creator : android.os.Parcelable.Creator<DeleteAction> {
      fun createFromParcel(var1: Parcel): DeleteAction {
         q.h(var1, "parcel");
         return new DeleteAction(var1.readString());
      }

      fun newArray(var1: Int): Array<DeleteAction> {
         return new DeleteAction[var1];
      }
   }
}

package com.discord.notifications.actions.intents

import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.os.Parcel
import com.discord.react.headless_tasks.api.HeadlessTasks
import java.util.LinkedHashMap
import java.util.Map.Entry
import kotlin.jvm.internal.q

public data class GenericAction(tag: String, taskName: String, data: Map<String, String?>) : NotificationAction {
   public final val data: Map<String, String?>
   public open val tag: String
   public final val taskName: String

   init {
      q.h(var1, "tag");
      q.h(var2, "taskName");
      q.h(var3, "data");
      super();
      this.tag = var1;
      this.taskName = var2;
      this.data = var3;
   }

   public operator fun component1(): String {
      return this.tag;
   }

   public operator fun component2(): String {
      return this.taskName;
   }

   public operator fun component3(): Map<String, String?> {
      return this.data;
   }

   public fun copy(tag: String = var0.tag, taskName: String = var0.taskName, data: Map<String, String?> = var0.data): GenericAction {
      q.h(var1, "tag");
      q.h(var2, "taskName");
      q.h(var3, "data");
      return new GenericAction(var1, var2, var3);
   }

   public open fun describeContents(): Int {
      return 0;
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is GenericAction) {
         return false;
      } else {
         var1 = var1;
         if (!q.c(this.tag, var1.tag)) {
            return false;
         } else if (!q.c(this.taskName, var1.taskName)) {
            return false;
         } else {
            return q.c(this.data, var1.data);
         }
      }
   }

   override fun getPendingIntentRequestCode(): Int {
      return NotificationAction.DefaultImpls.getPendingIntentRequestCode(this);
   }

   public override fun hashCode(): Int {
      return (this.tag.hashCode() * 31 + this.taskName.hashCode()) * 31 + this.data.hashCode();
   }

   public override fun onNotificationAction(context: Context, intent: Intent) {
      q.h(var1, "context");
      q.h(var2, "intent");
      this.onNotificationAction(var1, true);
   }

   public fun onNotificationAction(context: Context, taskInvokingFromBroadcastReceiver: Boolean) {
      q.h(var1, "context");
      val var7: HeadlessTasks.Companion = HeadlessTasks.Companion;
      val var6: java.lang.String = this.taskName;
      val var5: Bundle = new Bundle();

      for (Entry var4 : this.data.entrySet()) {
         var5.putString(var4.getKey() as java.lang.String, var4.getValue() as java.lang.String);
      }

      HeadlessTasks.Companion.startHeadlessTask$default(var7, var1, var6, 0L, false, var5, var2, 12, null);
   }

   override fun onNotificationActionComplete(var1: Context) {
      NotificationAction.DefaultImpls.onNotificationActionComplete(this, var1);
   }

   override fun toPendingIntent(var1: Context, var2: Int, var3: Boolean): PendingIntent {
      return NotificationAction.DefaultImpls.toPendingIntent(this, var1, var2, var3);
   }

   public override fun toString(): String {
      val var2: java.lang.String = this.tag;
      val var3: java.lang.String = this.taskName;
      val var1: java.util.Map = this.data;
      val var4: StringBuilder = new StringBuilder();
      var4.append("GenericAction(tag=");
      var4.append(var2);
      var4.append(", taskName=");
      var4.append(var3);
      var4.append(", data=");
      var4.append(var1);
      var4.append(")");
      return var4.toString();
   }

   public open fun writeToParcel(parcel: Parcel, flags: Int) {
      q.h(var1, "out");
      var1.writeString(this.tag);
      var1.writeString(this.taskName);
      val var3: java.util.Map = this.data;
      var1.writeInt(this.data.size());

      for (Entry var4 : var3.entrySet()) {
         var1.writeString(var4.getKey() as java.lang.String);
         var1.writeString(var4.getValue() as java.lang.String);
      }
   }

   // $VF: Class flags could not be determined
   internal class Creator : android.os.Parcelable.Creator<GenericAction> {
      fun createFromParcel(var1: Parcel): GenericAction {
         q.h(var1, "parcel");
         val var5: java.lang.String = var1.readString();
         val var6: java.lang.String = var1.readString();
         val var3: Int = var1.readInt();
         val var4: LinkedHashMap = new LinkedHashMap(var3);

         for (int var2 = 0; var2 != var3; var2++) {
            var4.put(var1.readString(), var1.readString());
         }

         return new GenericAction(var5, var6, var4);
      }

      fun newArray(var1: Int): Array<GenericAction> {
         return new GenericAction[var1];
      }
   }
}

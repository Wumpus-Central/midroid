package com.discord.notifications.actions.intents

import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.os.Parcel
import com.discord.react.headless_tasks.api.HeadlessTasks
import java.util.LinkedHashMap
import java.util.Map.Entry
import kotlin.jvm.internal.SourceDebugExtension

@SourceDebugExtension(["SMAP\nGenericAction.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GenericAction.kt\ncom/discord/notifications/actions/intents/GenericAction\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,34:1\n216#2,2:35\n*S KotlinDebug\n*F\n+ 1 GenericAction.kt\ncom/discord/notifications/actions/intents/GenericAction\n*L\n27#1:35,2\n*E\n"])
public data class GenericAction(tag: String, taskName: String, data: Map<String, String?>) : NotificationAction {
   public open val tag: String
   public final val taskName: String
   public final val data: Map<String, String?>

   init {
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
      return new GenericAction(var1, var2, var3);
   }

   public fun describeContents(): Int {
      return 0;
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is GenericAction) {
         return false;
      } else {
         var1 = var1;
         if (!(this.tag == var1.tag)) {
            return false;
         } else if (!(this.taskName == var1.taskName)) {
            return false;
         } else {
            return this.data == var1.data;
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
      this.onNotificationAction(var1, true);
   }

   public fun onNotificationAction(context: Context, taskInvokingFromBroadcastReceiver: Boolean) {
      val var3: HeadlessTasks.Companion = HeadlessTasks.Companion;
      val var4: java.lang.String = this.taskName;
      val var5: Bundle = new Bundle();

      for (Entry var6 : this.data.entrySet()) {
         var5.putString(var6.getKey() as java.lang.String, var6.getValue() as java.lang.String);
      }

      HeadlessTasks.Companion.startHeadlessTask$default(var3, var1, var4, 0L, false, var5, var2, 12, null);
   }

   override fun onNotificationActionComplete(var1: Context) {
      NotificationAction.DefaultImpls.onNotificationActionComplete(this, var1);
   }

   override fun toPendingIntent(var1: Context, var2: Int, var3: Boolean): PendingIntent {
      return NotificationAction.DefaultImpls.toPendingIntent(this, var1, var2, var3);
   }

   public override fun toString(): String {
      val var2: java.lang.String = this.tag;
      val var4: java.lang.String = this.taskName;
      val var3: java.util.Map = this.data;
      val var1: StringBuilder = new StringBuilder();
      var1.append("GenericAction(tag=");
      var1.append(var2);
      var1.append(", taskName=");
      var1.append(var4);
      var1.append(", data=");
      var1.append(var3);
      var1.append(")");
      return var1.toString();
   }

   public fun writeToParcel(dest: Parcel, flags: Int) {
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

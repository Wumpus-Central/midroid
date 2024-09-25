package com.discord.notifications.actions.intents

import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.os.Parcel
import java.util.LinkedHashMap
import java.util.Map.Entry
import kotlin.jvm.internal.q

public data class ContentAction(tag: String, data: Map<String, String?>) : NotificationAction {
   public final val data: Map<String, String?>

   public final val isLocal: Boolean
      public final get() {
         return q.c(this.data.get("category"), "local");
      }


   public open val tag: String

   init {
      q.h(var1, "tag");
      q.h(var2, "data");
      super();
      this.tag = var1;
      this.data = var2;
   }

   public operator fun component1(): String {
      return this.tag;
   }

   public operator fun component2(): Map<String, String?> {
      return this.data;
   }

   public fun copy(tag: String = var0.tag, data: Map<String, String?> = var0.data): ContentAction {
      q.h(var1, "tag");
      q.h(var2, "data");
      return new ContentAction(var1, var2);
   }

   public open fun describeContents(): Int {
      return 0;
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is ContentAction) {
         return false;
      } else {
         var1 = var1;
         if (!q.c(this.tag, var1.tag)) {
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
      return this.tag.hashCode() * 31 + this.data.hashCode();
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

   public override fun toString(): String {
      val var1: java.lang.String = this.tag;
      val var2: java.util.Map = this.data;
      val var3: StringBuilder = new StringBuilder();
      var3.append("ContentAction(tag=");
      var3.append(var1);
      var3.append(", data=");
      var3.append(var2);
      var3.append(")");
      return var3.toString();
   }

   public open fun writeToParcel(parcel: Parcel, flags: Int) {
      q.h(var1, "out");
      var1.writeString(this.tag);
      val var3: java.util.Map = this.data;
      var1.writeInt(this.data.size());

      for (Entry var4 : var3.entrySet()) {
         var1.writeString(var4.getKey() as java.lang.String);
         var1.writeString(var4.getValue() as java.lang.String);
      }
   }

   // $VF: Class flags could not be determined
   internal class Creator : android.os.Parcelable.Creator<ContentAction> {
      fun createFromParcel(var1: Parcel): ContentAction {
         q.h(var1, "parcel");
         val var4: java.lang.String = var1.readString();
         val var3: Int = var1.readInt();
         val var5: LinkedHashMap = new LinkedHashMap(var3);

         for (int var2 = 0; var2 != var3; var2++) {
            var5.put(var1.readString(), var1.readString());
         }

         return new ContentAction(var4, var5);
      }

      fun newArray(var1: Int): Array<ContentAction> {
         return new ContentAction[var1];
      }
   }
}

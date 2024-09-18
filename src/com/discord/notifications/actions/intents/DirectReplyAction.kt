package com.discord.notifications.actions.intents

import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.os.Parcel
import androidx.core.app.RemoteInput
import com.discord.primitives.ChannelId
import com.discord.react.headless_tasks.api.HeadlessTasks
import kotlin.jvm.internal.q

public data class DirectReplyAction(tag: String, channelId: ChannelId, channelName: String?, channelType: Int?, guildName: String?) : DirectReplyAction(
         var1, var2, var4, var5, var6
      ),
   NotificationAction {
   private final val channelId: ChannelId
   private final val channelName: String?
   private final val channelType: Int?
   private final val guildName: String?
   public open val tag: String

   fun DirectReplyAction(var1: java.lang.String, var2: Long, var4: java.lang.String, var5: Int, var6: java.lang.String) {
      q.h(var1, "tag");
      super();
      this.tag = var1;
      this.channelId = var2;
      this.channelName = var4;
      this.channelType = var5;
      this.guildName = var6;
   }

   private operator fun component2(): ChannelId {
      return this.channelId;
   }

   private operator fun component3(): String? {
      return this.channelName;
   }

   private operator fun component4(): Int? {
      return this.channelType;
   }

   private operator fun component5(): String? {
      return this.guildName;
   }

   public operator fun component1(): String {
      return this.tag;
   }

   public fun copy(tag: String = ..., channelId: ChannelId = ..., channelName: String? = ..., channelType: Int? = ..., guildName: String? = ...): DirectReplyAction {
      q.h(var1, "tag");
      return new DirectReplyAction(var1, var2, var4, var5, var6, null);
   }

   public open fun describeContents(): Int {
      return 0;
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is DirectReplyAction) {
         return false;
      } else {
         var1 = var1;
         if (!q.c(this.tag, var1.tag)) {
            return false;
         } else if (!ChannelId.equals-impl0(this.channelId, var1.channelId)) {
            return false;
         } else if (!q.c(this.channelName, var1.channelName)) {
            return false;
         } else if (!q.c(this.channelType, var1.channelType)) {
            return false;
         } else {
            return q.c(this.guildName, var1.guildName);
         }
      }
   }

   override fun getPendingIntentRequestCode(): Int {
      return NotificationAction.DefaultImpls.getPendingIntentRequestCode(this);
   }

   public override fun hashCode(): Int {
      val var4: Int = this.tag.hashCode();
      val var5: Int = ChannelId.hashCode-impl(this.channelId);
      var var3: Int = 0;
      val var1: Int;
      if (this.channelName == null) {
         var1 = 0;
      } else {
         var1 = this.channelName.hashCode();
      }

      val var2: Int;
      if (this.channelType == null) {
         var2 = 0;
      } else {
         var2 = this.channelType.hashCode();
      }

      if (this.guildName != null) {
         var3 = this.guildName.hashCode();
      }

      return (((var4 * 31 + var5) * 31 + var1) * 31 + var2) * 31 + var3;
   }

   public override fun onNotificationAction(context: Context, intent: Intent) {
      q.h(var1, "context");
      q.h(var2, "intent");
      val var4: java.lang.String = DirectReplyAction.Companion.access$getReplyText(Companion, var2);
      val var5: HeadlessTasks.Companion = HeadlessTasks.Companion;
      val var3: Bundle = new Bundle();
      var3.putString("channelId", java.lang.String.valueOf(this.channelId));
      var3.putString("channelName", this.channelName);
      var3.putString("channelReplyText", var4);
      if (this.channelType != null) {
         var3.putInt("channelType", this.channelType.intValue());
      }

      var3.putString("guildName", this.guildName);
      HeadlessTasks.Companion.startHeadlessTask$default(var5, var1, "DirectReply", 0L, false, var3, true, 12, null);
   }

   public override fun onNotificationActionComplete(context: Context) {
      q.h(var1, "context");
   }

   override fun toPendingIntent(var1: Context, var2: Int, var3: Boolean): PendingIntent {
      return NotificationAction.DefaultImpls.toPendingIntent(this, var1, var2, var3);
   }

   public override fun toString(): String {
      val var2: java.lang.String = this.tag;
      val var5: java.lang.String = ChannelId.toString-impl(this.channelId);
      val var3: java.lang.String = this.channelName;
      val var1: Int = this.channelType;
      val var4: java.lang.String = this.guildName;
      val var6: StringBuilder = new StringBuilder();
      var6.append("DirectReplyAction(tag=");
      var6.append(var2);
      var6.append(", channelId=");
      var6.append(var5);
      var6.append(", channelName=");
      var6.append(var3);
      var6.append(", channelType=");
      var6.append(var1);
      var6.append(", guildName=");
      var6.append(var4);
      var6.append(")");
      return var6.toString();
   }

   public open fun writeToParcel(parcel: Parcel, flags: Int) {
      q.h(var1, "out");
      var1.writeString(this.tag);
      var1.writeParcelable(ChannelId.box-impl(this.channelId), var2);
      var1.writeString(this.channelName);
      val var3: Int = this.channelType;
      if (this.channelType == null) {
         var2 = 0;
      } else {
         var1.writeInt(1);
         var2 = var3;
      }

      var1.writeInt(var2);
      var1.writeString(this.guildName);
   }

   public companion object {
      private const val KEY_REMOTE_INPUT: String

      private fun getReplyText(intent: Intent): String? {
         val var2: Bundle = RemoteInput.k(var1);
         var var4: java.lang.String = null;
         if (var2 != null) {
            var var5: java.lang.CharSequence = var2.getCharSequence("remote_input_key");
            var4 = null;
            if (var5 != null) {
               if (!(h.x(var5) xor true)) {
                  var5 = null;
               }

               var4 = null;
               if (var5 != null) {
                  var4 = var5.toString();
               }
            }
         }

         return var4;
      }

      public fun toRemoteInput(label: String): RemoteInput {
         q.h(var1, "label");
         val var2: RemoteInput = new RemoteInput.d("remote_input_key").g(var1).b();
         q.g(var2, "build(...)");
         return var2;
      }
   }

   // $VF: Class flags could not be determined
   internal class Creator : android.os.Parcelable.Creator<DirectReplyAction> {
      fun createFromParcel(var1: Parcel): DirectReplyAction {
         q.h(var1, "parcel");
         val var5: java.lang.String = var1.readString();
         val var2: Long = (var1.readParcelable(DirectReplyAction.class.getClassLoader()) as ChannelId).unbox-impl();
         val var6: java.lang.String = var1.readString();
         val var4: Int;
         if (var1.readInt() == 0) {
            var4 = null;
         } else {
            var4 = var1.readInt();
         }

         return new DirectReplyAction(var5, var2, var6, var4, var1.readString(), null);
      }

      fun newArray(var1: Int): Array<DirectReplyAction> {
         return new DirectReplyAction[var1];
      }
   }
}

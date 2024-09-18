package com.discord.notifications.actions.intents

import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.os.Parcel
import com.discord.primitives.ChannelId
import com.discord.primitives.MessageId
import com.discord.react.headless_tasks.api.HeadlessTasks
import kotlin.jvm.internal.q

public data class MarkAsReadAction(tag: String, channelId: ChannelId, messageId: MessageId) : MarkAsReadAction(var1, var2, var4), NotificationAction {
   private final val channelId: ChannelId
   private final val messageId: MessageId
   public open val tag: String

   fun MarkAsReadAction(var1: java.lang.String, var2: Long, var4: java.lang.String) {
      q.h(var1, "tag");
      q.h(var4, "messageId");
      super();
      this.tag = var1;
      this.channelId = var2;
      this.messageId = var4;
   }

   private operator fun component2(): ChannelId {
      return this.channelId;
   }

   private operator fun component3(): MessageId {
      return this.messageId;
   }

   public operator fun component1(): String {
      return this.tag;
   }

   public fun copy(tag: String = ..., channelId: ChannelId = ..., messageId: MessageId = ...): MarkAsReadAction {
      q.h(var1, "tag");
      q.h(var4, "messageId");
      return new MarkAsReadAction(var1, var2, var4, null);
   }

   public open fun describeContents(): Int {
      return 0;
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is MarkAsReadAction) {
         return false;
      } else {
         var1 = var1;
         if (!q.c(this.tag, var1.tag)) {
            return false;
         } else if (!ChannelId.equals-impl0(this.channelId, var1.channelId)) {
            return false;
         } else {
            return MessageId.equals-impl0(this.messageId, var1.messageId);
         }
      }
   }

   override fun getPendingIntentRequestCode(): Int {
      return NotificationAction.DefaultImpls.getPendingIntentRequestCode(this);
   }

   public override fun hashCode(): Int {
      return (this.tag.hashCode() * 31 + ChannelId.hashCode-impl(this.channelId)) * 31 + MessageId.hashCode-impl(this.messageId);
   }

   public override fun onNotificationAction(context: Context, intent: Intent) {
      q.h(var1, "context");
      q.h(var2, "intent");
      val var3: HeadlessTasks.Companion = HeadlessTasks.Companion;
      val var4: Bundle = new Bundle();
      var4.putString("channelId", ChannelId.toString-impl(this.channelId));
      var4.putString("messageId", MessageId.toString-impl(this.messageId));
      HeadlessTasks.Companion.startHeadlessTask$default(var3, var1, "MarkAsRead", 0L, false, var4, true, 12, null);
   }

   override fun onNotificationActionComplete(var1: Context) {
      NotificationAction.DefaultImpls.onNotificationActionComplete(this, var1);
   }

   override fun toPendingIntent(var1: Context, var2: Int, var3: Boolean): PendingIntent {
      return NotificationAction.DefaultImpls.toPendingIntent(this, var1, var2, var3);
   }

   public override fun toString(): String {
      val var3: java.lang.String = this.tag;
      val var2: java.lang.String = ChannelId.toString-impl(this.channelId);
      val var1: java.lang.String = MessageId.toString-impl(this.messageId);
      val var4: StringBuilder = new StringBuilder();
      var4.append("MarkAsReadAction(tag=");
      var4.append(var3);
      var4.append(", channelId=");
      var4.append(var2);
      var4.append(", messageId=");
      var4.append(var1);
      var4.append(")");
      return var4.toString();
   }

   public open fun writeToParcel(parcel: Parcel, flags: Int) {
      q.h(var1, "out");
      var1.writeString(this.tag);
      var1.writeParcelable(ChannelId.box-impl(this.channelId), var2);
      var1.writeParcelable(MessageId.box-impl(this.messageId), var2);
   }

   // $VF: Class flags could not be determined
   internal class Creator : android.os.Parcelable.Creator<MarkAsReadAction> {
      fun createFromParcel(var1: Parcel): MarkAsReadAction {
         q.h(var1, "parcel");
         return new MarkAsReadAction(
            var1.readString(),
            (var1.readParcelable(MarkAsReadAction.class.getClassLoader()) as ChannelId).unbox-impl(),
            (var1.readParcelable(MarkAsReadAction.class.getClassLoader()) as MessageId).unbox-impl(),
            null
         );
      }

      fun newArray(var1: Int): Array<MarkAsReadAction> {
         return new MarkAsReadAction[var1];
      }
   }
}

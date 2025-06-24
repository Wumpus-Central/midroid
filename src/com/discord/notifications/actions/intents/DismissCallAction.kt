package com.discord.notifications.actions.intents

import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.os.Parcel
import com.discord.primitives.ChannelId
import com.discord.primitives.GuildId
import com.discord.primitives.UserId
import com.discord.react.headless_tasks.api.HeadlessTasks
import kotlin.jvm.internal.q

public data class DismissCallAction(tag: String, channelId: ChannelId, isFullscreenCallUI: Boolean, guildId: GuildId?, userId: UserId) : DismissCallAction(
         var1, var2, var4, var5, var6
      ),
   NotificationAction {
   public open val tag: String
   private final val channelId: ChannelId
   private final val isFullscreenCallUI: Boolean
   private final val guildId: GuildId?
   private final val userId: UserId

   fun DismissCallAction(var1: java.lang.String, var2: Long, var4: Boolean, var5: GuildId, var6: Long) {
      q.h(var1, "tag");
      super();
      this.tag = var1;
      this.channelId = var2;
      this.isFullscreenCallUI = var4;
      this.guildId = var5;
      this.userId = var6;
   }

   private operator fun component2(): ChannelId {
      return this.channelId;
   }

   private operator fun component3(): Boolean {
      return this.isFullscreenCallUI;
   }

   private operator fun component4(): GuildId? {
      return this.guildId;
   }

   private operator fun component5(): UserId {
      return this.userId;
   }

   public operator fun component1(): String {
      return this.tag;
   }

   public fun copy(tag: String = ..., channelId: ChannelId = ..., isFullscreenCallUI: Boolean = ..., guildId: GuildId? = ..., userId: UserId = ...): DismissCallAction {
      q.h(var1, "tag");
      return new DismissCallAction(var1, var2, var4, var5, var6, null);
   }

   public fun describeContents(): Int {
      return 0;
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is DismissCallAction) {
         return false;
      } else {
         var1 = var1;
         if (!q.c(this.tag, var1.tag)) {
            return false;
         } else if (!ChannelId.equals-impl0(this.channelId, var1.channelId)) {
            return false;
         } else if (this.isFullscreenCallUI != var1.isFullscreenCallUI) {
            return false;
         } else if (!q.c(this.guildId, var1.guildId)) {
            return false;
         } else {
            return UserId.equals-impl0(this.userId, var1.userId);
         }
      }
   }

   override fun getPendingIntentRequestCode(): Int {
      return NotificationAction.DefaultImpls.getPendingIntentRequestCode(this);
   }

   public override fun hashCode(): Int {
      val var4: Int = this.tag.hashCode();
      val var2: Int = ChannelId.hashCode-impl(this.channelId);
      val var3: Int = java.lang.Boolean.hashCode(this.isFullscreenCallUI);
      val var1: Int;
      if (this.guildId == null) {
         var1 = 0;
      } else {
         var1 = GuildId.hashCode-impl(this.guildId.unbox-impl());
      }

      return (((var4 * 31 + var2) * 31 + var3) * 31 + var1) * 31 + UserId.hashCode-impl(this.userId);
   }

   public override fun onNotificationAction(context: Context, intent: Intent) {
      q.h(var1, "context");
      q.h(var2, "intent");
      val var3: HeadlessTasks.Companion = HeadlessTasks.Companion;
      val var4: Bundle = new Bundle();
      var4.putString("channelId", java.lang.String.valueOf(this.channelId));
      var4.putBoolean("isFullscreenCallUI", this.isFullscreenCallUI);
      val var6: java.lang.Long;
      if (this.guildId != null) {
         var6 = this.guildId.unbox-impl();
      } else {
         var6 = null;
      }

      var4.putString("guildId", java.lang.String.valueOf(var6));
      var4.putString("userId", java.lang.String.valueOf(this.userId));
      HeadlessTasks.Companion.startHeadlessTask$default(var3, var1, "DismissCallAction", 0L, false, var4, true, 12, null);
   }

   override fun onNotificationActionComplete(var1: Context) {
      NotificationAction.DefaultImpls.onNotificationActionComplete(this, var1);
   }

   override fun toPendingIntent(var1: Context, var2: Int, var3: Boolean): PendingIntent {
      return NotificationAction.DefaultImpls.toPendingIntent(this, var1, var2, var3);
   }

   public override fun toString(): String {
      val var3: java.lang.String = this.tag;
      val var6: java.lang.String = ChannelId.toString-impl(this.channelId);
      val var1: Boolean = this.isFullscreenCallUI;
      val var5: GuildId = this.guildId;
      val var4: java.lang.String = UserId.toString-impl(this.userId);
      val var2: StringBuilder = new StringBuilder();
      var2.append("DismissCallAction(tag=");
      var2.append(var3);
      var2.append(", channelId=");
      var2.append(var6);
      var2.append(", isFullscreenCallUI=");
      var2.append(var1);
      var2.append(", guildId=");
      var2.append(var5);
      var2.append(", userId=");
      var2.append(var4);
      var2.append(")");
      return var2.toString();
   }

   public fun writeToParcel(dest: Parcel, flags: Int) {
      q.h(var1, "dest");
      var1.writeString(this.tag);
      var1.writeParcelable(ChannelId.box-impl(this.channelId), var2);
      var1.writeInt(this.isFullscreenCallUI);
      var1.writeParcelable(this.guildId, var2);
      var1.writeParcelable(UserId.box-impl(this.userId), var2);
   }

   // $VF: Class flags could not be determined
   internal class Creator : android.os.Parcelable.Creator<DismissCallAction> {
      fun createFromParcel(var1: Parcel): DismissCallAction {
         q.h(var1, "parcel");
         val var5: java.lang.String = var1.readString();
         val var2: Long = (var1.readParcelable(DismissCallAction.class.getClassLoader()) as ChannelId).unbox-impl();
         val var4: Boolean;
         if (var1.readInt() != 0) {
            var4 = true;
         } else {
            var4 = false;
         }

         return new DismissCallAction(
            var5,
            var2,
            var4,
            var1.readParcelable(DismissCallAction.class.getClassLoader()) as GuildId,
            (var1.readParcelable(DismissCallAction.class.getClassLoader()) as UserId).unbox-impl(),
            null
         );
      }

      fun newArray(var1: Int): Array<DismissCallAction> {
         return new DismissCallAction[var1];
      }
   }
}

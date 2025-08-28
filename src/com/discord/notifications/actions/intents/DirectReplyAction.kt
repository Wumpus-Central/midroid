package com.discord.notifications.actions.intents

import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.os.Parcel
import androidx.core.app.RemoteInput
import com.discord.primitives.ChannelId
import com.discord.react.headless_tasks.api.HeadlessTasks
import kotlin.jvm.internal.SourceDebugExtension

@SourceDebugExtension(["SMAP\nDirectReplyAction.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DirectReplyAction.kt\ncom/discord/notifications/actions/intents/DirectReplyAction\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,57:1\n1#2:58\n*E\n"])
public data class DirectReplyAction(tag: String, channelId: ChannelId, channelName: String?, channelType: Int?, guildName: String?) : DirectReplyAction(
         var1, var2, var4, var5, var6
      ),
   NotificationAction {
   public open val tag: String
   private final val channelId: ChannelId
   private final val channelName: String?
   private final val channelType: Int?
   private final val guildName: String?

   fun DirectReplyAction(var1: java.lang.String, var2: Long, var4: java.lang.String, var5: Int, var6: java.lang.String) {
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
      return new DirectReplyAction(var1, var2, var4, var5, var6, null);
   }

   public fun describeContents(): Int {
      return 0;
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is DirectReplyAction) {
         return false;
      } else {
         var1 = var1;
         if (!(this.tag == var1.tag)) {
            return false;
         } else if (!ChannelId.equals-impl0(this.channelId, var1.channelId)) {
            return false;
         } else if (!(this.channelName == var1.channelName)) {
            return false;
         } else if (!(this.channelType == var1.channelType)) {
            return false;
         } else {
            return this.guildName == var1.guildName;
         }
      }
   }

   override fun getPendingIntentRequestCode(): Int {
      return NotificationAction.DefaultImpls.getPendingIntentRequestCode(this);
   }

   public override fun hashCode(): Int {
      val var5: Int = this.tag.hashCode();
      val var4: Int = ChannelId.hashCode-impl(this.channelId);
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

      return (((var5 * 31 + var4) * 31 + var1) * 31 + var2) * 31 + var3;
   }

   public override fun onNotificationAction(context: Context, intent: Intent) {
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
   }

   override fun toPendingIntent(var1: Context, var2: Int, var3: Boolean): PendingIntent {
      return NotificationAction.DefaultImpls.toPendingIntent(this, var1, var2, var3);
   }

   public override fun toString(): String {
      val var6: java.lang.String = this.tag;
      val var4: java.lang.String = ChannelId.toString-impl(this.channelId);
      val var3: java.lang.String = this.channelName;
      val var5: Int = this.channelType;
      val var1: java.lang.String = this.guildName;
      val var2: StringBuilder = new StringBuilder();
      var2.append("DirectReplyAction(tag=");
      var2.append(var6);
      var2.append(", channelId=");
      var2.append(var4);
      var2.append(", channelName=");
      var2.append(var3);
      var2.append(", channelType=");
      var2.append(var5);
      var2.append(", guildName=");
      var2.append(var1);
      var2.append(")");
      return var2.toString();
   }

   public fun writeToParcel(dest: Parcel, flags: Int) {
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

   @SourceDebugExtension(["SMAP\nDirectReplyAction.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DirectReplyAction.kt\ncom/discord/notifications/actions/intents/DirectReplyAction$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,57:1\n1#2:58\n*E\n"])
   public companion object {
      private const val KEY_REMOTE_INPUT: String

      private fun getReplyText(intent: Intent): String? {
         val var2: Bundle = RemoteInput.k(var1);
         var var4: java.lang.String = null;
         if (var2 != null) {
            var var5: java.lang.CharSequence = var2.getCharSequence("remote_input_key");
            var4 = null;
            if (var5 != null) {
               if (StringsKt.c0(var5)) {
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
         val var2: RemoteInput = new RemoteInput.d("remote_input_key").g(var1).b();
         return var2;
      }
   }

   // $VF: Class flags could not be determined
   internal class Creator : android.os.Parcelable.Creator<DirectReplyAction> {
      fun createFromParcel(var1: Parcel): DirectReplyAction {
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

package com.discord.notifications.actions

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.os.Parcelable
import androidx.core.content.b
import com.discord.misc.utilities.intent.IntentUtilsKt
import com.discord.notifications.actions.intents.DeleteAction
import com.discord.notifications.actions.intents.DirectReplyAction
import com.discord.notifications.actions.intents.DismissCallAction
import com.discord.notifications.actions.intents.GenericAction
import com.discord.notifications.actions.intents.MarkAsReadAction
import com.discord.notifications.actions.intents.MuteAction
import com.discord.notifications.actions.intents.NotificationAction
import kotlin.jvm.internal.g0
import kotlin.jvm.internal.q

public class NotificationActions : BroadcastReceiver {
   public open fun onReceive(context: Context, intent: Intent) {
      q.h(var1, "context");
      q.h(var2, "intent");
      val var4: NotificationAction.Companion = NotificationAction.Companion;
      val var6: NotificationAction;
      if (IntentUtilsKt.hasExtra(var2, g0.b(MarkAsReadAction.class))) {
         var6 = (b.b(var2, "action_intent_arg_key", MarkAsReadAction.class) as Parcelable) as NotificationAction;
      } else {
         var6 = null;
      }

      var var7: NotificationAction = var6 as MarkAsReadAction;
      if (var6 as MarkAsReadAction == null) {
         if (IntentUtilsKt.hasExtra(var2, g0.b(MuteAction.class))) {
            var7 = (b.b(var2, "action_intent_arg_key", MuteAction.class) as Parcelable) as NotificationAction;
         } else {
            var7 = null;
         }

         var7 = var7 as MuteAction;
         if (var7 as MuteAction == null) {
            if (IntentUtilsKt.hasExtra(var2, g0.b(DismissCallAction.class))) {
               var7 = (b.b(var2, "action_intent_arg_key", DismissCallAction.class) as Parcelable) as NotificationAction;
            } else {
               var7 = null;
            }

            var7 = var7 as DismissCallAction;
            if (var7 as DismissCallAction == null) {
               if (IntentUtilsKt.hasExtra(var2, g0.b(DirectReplyAction.class))) {
                  var7 = (b.b(var2, "action_intent_arg_key", DirectReplyAction.class) as Parcelable) as NotificationAction;
               } else {
                  var7 = null;
               }

               var7 = var7 as DirectReplyAction;
               if (var7 as DirectReplyAction == null) {
                  if (IntentUtilsKt.hasExtra(var2, g0.b(DeleteAction.class))) {
                     var7 = (b.b(var2, "action_intent_arg_key", DeleteAction.class) as Parcelable) as NotificationAction;
                  } else {
                     var7 = null;
                  }

                  var7 = var7 as DeleteAction;
                  if (var7 as DeleteAction == null) {
                     var7 = null;
                     if (IntentUtilsKt.hasExtra(var2, g0.b(GenericAction.class))) {
                        var7 = (b.b(var2, "action_intent_arg_key", GenericAction.class) as Parcelable) as NotificationAction;
                     }
                  }
               }
            }
         }
      }

      if (var7 != null) {
         var7.onNotificationAction(var1, var2);
         var7.onNotificationActionComplete(var1);
      }
   }

   public companion object {
      public const val ACTION: String
   }
}

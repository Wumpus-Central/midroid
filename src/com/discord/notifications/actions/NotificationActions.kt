package com.discord.notifications.actions

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.os.Parcelable
import androidx.core.content.c
import com.discord.misc.utilities.intent.IntentUtilsKt
import com.discord.notifications.actions.intents.DeleteAction
import com.discord.notifications.actions.intents.DirectReplyAction
import com.discord.notifications.actions.intents.DismissCallAction
import com.discord.notifications.actions.intents.GenericAction
import com.discord.notifications.actions.intents.MarkAsReadAction
import com.discord.notifications.actions.intents.MuteAction
import com.discord.notifications.actions.intents.NotificationAction
import kotlin.jvm.internal.SourceDebugExtension

@SourceDebugExtension(["SMAP\nNotificationActions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NotificationActions.kt\ncom/discord/notifications/actions/NotificationActions\n+ 2 NotificationAction.kt\ncom/discord/notifications/actions/intents/NotificationAction$Companion\n+ 3 IntentUtils.kt\ncom/discord/misc/utilities/intent/IntentUtilsKt\n*L\n1#1,34:1\n86#2,2:35\n89#2,2:38\n86#2,2:40\n89#2,2:43\n86#2,2:45\n89#2,2:48\n86#2,2:50\n89#2,2:53\n86#2,2:55\n89#2,2:58\n86#2,2:60\n89#2,2:63\n14#3:37\n14#3:42\n14#3:47\n14#3:52\n14#3:57\n14#3:62\n*S KotlinDebug\n*F\n+ 1 NotificationActions.kt\ncom/discord/notifications/actions/NotificationActions\n*L\n17#1:35,2\n17#1:38,2\n18#1:40,2\n18#1:43,2\n19#1:45,2\n19#1:48,2\n20#1:50,2\n20#1:53,2\n21#1:55,2\n21#1:58,2\n22#1:60,2\n22#1:63,2\n17#1:37\n18#1:42\n19#1:47\n20#1:52\n21#1:57\n22#1:62\n*E\n"])
public class NotificationActions : BroadcastReceiver {
   public open fun onReceive(context: Context, intent: Intent) {
      val var4: NotificationAction.Companion = NotificationAction.Companion;
      val var6: NotificationAction;
      if (IntentUtilsKt.hasExtra(var2, MarkAsReadAction::class)) {
         var6 = (c.b(var2, "action_intent_arg_key", MarkAsReadAction.class) as Parcelable) as NotificationAction;
      } else {
         var6 = null;
      }

      var var7: NotificationAction = var6 as MarkAsReadAction;
      if (var6 as MarkAsReadAction == null) {
         if (IntentUtilsKt.hasExtra(var2, MuteAction::class)) {
            var7 = (c.b(var2, "action_intent_arg_key", MuteAction.class) as Parcelable) as NotificationAction;
         } else {
            var7 = null;
         }

         var7 = var7 as MuteAction;
         if (var7 as MuteAction == null) {
            if (IntentUtilsKt.hasExtra(var2, DismissCallAction::class)) {
               var7 = (c.b(var2, "action_intent_arg_key", DismissCallAction.class) as Parcelable) as NotificationAction;
            } else {
               var7 = null;
            }

            var7 = var7 as DismissCallAction;
            if (var7 as DismissCallAction == null) {
               if (IntentUtilsKt.hasExtra(var2, DirectReplyAction::class)) {
                  var7 = (c.b(var2, "action_intent_arg_key", DirectReplyAction.class) as Parcelable) as NotificationAction;
               } else {
                  var7 = null;
               }

               var7 = var7 as DirectReplyAction;
               if (var7 as DirectReplyAction == null) {
                  if (IntentUtilsKt.hasExtra(var2, DeleteAction::class)) {
                     var7 = (c.b(var2, "action_intent_arg_key", DeleteAction.class) as Parcelable) as NotificationAction;
                  } else {
                     var7 = null;
                  }

                  var7 = var7 as DeleteAction;
                  if (var7 as DeleteAction == null) {
                     var7 = null;
                     if (IntentUtilsKt.hasExtra(var2, GenericAction::class)) {
                        var7 = (c.b(var2, "action_intent_arg_key", GenericAction.class) as Parcelable) as NotificationAction;
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

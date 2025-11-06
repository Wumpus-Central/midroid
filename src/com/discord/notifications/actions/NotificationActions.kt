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
import kotlin.jvm.internal.SourceDebugExtension

@SourceDebugExtension(["SMAP\nNotificationActions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NotificationActions.kt\ncom/discord/notifications/actions/NotificationActions\n+ 2 NotificationAction.kt\ncom/discord/notifications/actions/intents/NotificationAction$Companion\n+ 3 IntentUtils.kt\ncom/discord/misc/utilities/intent/IntentUtilsKt\n*L\n1#1,45:1\n96#2,2:46\n99#2,2:49\n96#2,2:51\n99#2,2:54\n96#2,2:56\n99#2,2:59\n96#2,2:61\n99#2,2:64\n96#2,2:66\n99#2,2:69\n96#2,2:71\n99#2,2:74\n14#3:48\n14#3:53\n14#3:58\n14#3:63\n14#3:68\n14#3:73\n*S KotlinDebug\n*F\n+ 1 NotificationActions.kt\ncom/discord/notifications/actions/NotificationActions\n*L\n28#1:46,2\n28#1:49,2\n29#1:51,2\n29#1:54,2\n30#1:56,2\n30#1:59,2\n31#1:61,2\n31#1:64,2\n32#1:66,2\n32#1:69,2\n33#1:71,2\n33#1:74,2\n28#1:48\n29#1:53\n30#1:58\n31#1:63\n32#1:68\n33#1:73\n*E\n"])
public class NotificationActions : BroadcastReceiver {
   public open fun onReceive(context: Context, intent: Intent) {
      val var4: NotificationAction.Companion = NotificationAction.Companion;
      val var6: NotificationAction;
      if (IntentUtilsKt.hasExtra(var2, MarkAsReadAction::class)) {
         var6 = (b.b(var2, "action_intent_arg_key", MarkAsReadAction.class) as Parcelable) as NotificationAction;
      } else {
         var6 = null;
      }

      var var7: NotificationAction = var6 as MarkAsReadAction;
      if (var6 as MarkAsReadAction == null) {
         if (IntentUtilsKt.hasExtra(var2, MuteAction::class)) {
            var7 = (b.b(var2, "action_intent_arg_key", MuteAction.class) as Parcelable) as NotificationAction;
         } else {
            var7 = null;
         }

         var7 = var7 as MuteAction;
         if (var7 as MuteAction == null) {
            if (IntentUtilsKt.hasExtra(var2, DismissCallAction::class)) {
               var7 = (b.b(var2, "action_intent_arg_key", DismissCallAction.class) as Parcelable) as NotificationAction;
            } else {
               var7 = null;
            }

            var7 = var7 as DismissCallAction;
            if (var7 as DismissCallAction == null) {
               if (IntentUtilsKt.hasExtra(var2, DirectReplyAction::class)) {
                  var7 = (b.b(var2, "action_intent_arg_key", DirectReplyAction.class) as Parcelable) as NotificationAction;
               } else {
                  var7 = null;
               }

               var7 = var7 as DirectReplyAction;
               if (var7 as DirectReplyAction == null) {
                  if (IntentUtilsKt.hasExtra(var2, DeleteAction::class)) {
                     var7 = (b.b(var2, "action_intent_arg_key", DeleteAction.class) as Parcelable) as NotificationAction;
                  } else {
                     var7 = null;
                  }

                  var7 = var7 as DeleteAction;
                  if (var7 as DeleteAction == null) {
                     var7 = null;
                     if (IntentUtilsKt.hasExtra(var2, GenericAction::class)) {
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

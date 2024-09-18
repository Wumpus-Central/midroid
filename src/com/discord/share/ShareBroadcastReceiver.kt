package com.discord.share

import android.app.PendingIntent
import android.content.BroadcastReceiver
import android.content.ComponentName
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.content.IntentSender
import android.os.Parcelable
import androidx.core.content.a
import androidx.core.content.b
import com.discord.misc.utilities.intent.PendingIntentUtils
import com.discord.reactevents.ReactEvents
import com.discord.share.react.events.ShareBroadcastReceiverAppClicked
import com.facebook.react.bridge.ReactApplicationContext
import gh.w
import kotlin.jvm.internal.g0
import kotlin.jvm.internal.q

internal class ShareBroadcastReceiver(reactContext: ReactApplicationContext) : BroadcastReceiver {
   private final val reactApplicationContext: ReactApplicationContext
   private final val reactEvents: ReactEvents

   init {
      q.h(var1, "reactContext");
      super();
      this.reactApplicationContext = var1;
      this.reactEvents = new ReactEvents(w.a("share-broadcast-receiver-app-clicked", g0.b(ShareBroadcastReceiverAppClicked.class)));
   }

   public open fun onReceive(context: Context?, intent: Intent?) {
      var var3: java.lang.String = null;
      val var5: ComponentName;
      if (var2 != null) {
         var5 = (b.b(var2, "android.intent.extra.CHOSEN_COMPONENT", ComponentName.class) as Parcelable) as ComponentName;
      } else {
         var5 = null;
      }

      if (var2 != null) {
         var3 = var2.getStringExtra("share_sheet_location");
      }

      if (var5 != null) {
         val var4: ReactEvents = this.reactEvents;
         val var7: ReactApplicationContext = this.reactApplicationContext;
         val var6: java.lang.String = var5.getPackageName();
         q.g(var6, "getPackageName(...)");
         var4.emitModuleEvent(var7, new ShareBroadcastReceiverAppClicked(var6, var3));
      }
   }

   public companion object {
      private const val SHARE_SHEET_CLICK: String
      private const val SHARE_SHEET_LOCATION: String

      public fun getPendingIntentSender(context: Context, location: String?): IntentSender {
         q.h(var1, "context");
         val var3: Intent = new Intent("share_sheet_click");
         var3.putExtra("share_sheet_location", var2);
         val var4: IntentSender = PendingIntent.getBroadcast(
               var1, 0, var3, PendingIntentUtils.immutablePendingIntentFlag$default(PendingIntentUtils.INSTANCE, 0, 1, null)
            )
            .getIntentSender();
         q.g(var4, "getIntentSender(...)");
         return var4;
      }

      public fun register(context: Context, receiver: ShareBroadcastReceiver) {
         q.h(var1, "context");
         q.h(var2, "receiver");
         a.k(var1, var2, new IntentFilter("share_sheet_click"), 4);
      }

      public fun unregister(context: Context, receiver: ShareBroadcastReceiver) {
         q.h(var1, "context");
         q.h(var2, "receiver");

         try {
            var1.unregisterReceiver(var2);
         } catch (var3: Exception) {
         }
      }
   }
}

package com.discord.share

import B9.s
import android.app.PendingIntent
import android.content.BroadcastReceiver
import android.content.ComponentName
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.content.IntentSender
import android.os.Parcelable
import androidx.core.content.b
import androidx.core.content.c
import com.discord.misc.utilities.intent.PendingIntentUtils
import com.discord.reactevents.ReactEvents
import com.discord.share.react.events.ShareBroadcastReceiverAppClicked
import com.facebook.react.bridge.ReactApplicationContext
import kotlin.jvm.internal.SourceDebugExtension

@SourceDebugExtension(["SMAP\nShareBroadcastReceiver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShareBroadcastReceiver.kt\ncom/discord/share/ShareBroadcastReceiver\n+ 2 IntentUtils.kt\ncom/discord/misc/utilities/intent/IntentUtilsKt\n*L\n1#1,69:1\n14#2:70\n*S KotlinDebug\n*F\n+ 1 ShareBroadcastReceiver.kt\ncom/discord/share/ShareBroadcastReceiver\n*L\n28#1:70\n*E\n"])
internal class ShareBroadcastReceiver(reactContext: ReactApplicationContext) : BroadcastReceiver {
   private final val reactApplicationContext: ReactApplicationContext
   private final val reactEvents: ReactEvents

   init {
      this.reactApplicationContext = var1;
      this.reactEvents = new ReactEvents(s.a("share-broadcast-receiver-app-clicked", ShareBroadcastReceiverAppClicked::class));
   }

   public open fun onReceive(context: Context?, intent: Intent?) {
      var var3: java.lang.String = null;
      val var5: ComponentName;
      if (var2 != null) {
         var5 = (c.b(var2, "android.intent.extra.CHOSEN_COMPONENT", ComponentName.class) as Parcelable) as ComponentName;
      } else {
         var5 = null;
      }

      if (var2 != null) {
         var3 = var2.getStringExtra("share_sheet_location");
      }

      if (var5 != null) {
         val var7: ReactEvents = this.reactEvents;
         val var4: ReactApplicationContext = this.reactApplicationContext;
         val var6: java.lang.String = var5.getPackageName();
         var7.emitModuleEvent(var4, new ShareBroadcastReceiverAppClicked(var6, var3));
      }
   }

   @SourceDebugExtension(["SMAP\nShareBroadcastReceiver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShareBroadcastReceiver.kt\ncom/discord/share/ShareBroadcastReceiver$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,69:1\n1#2:70\n*E\n"])
   public companion object {
      private const val SHARE_SHEET_LOCATION: String
      private const val SHARE_SHEET_CLICK: String

      public fun getPendingIntentSender(context: Context, location: String?): IntentSender {
         val var3: Intent = new Intent("share_sheet_click");
         var3.putExtra("share_sheet_location", var2);
         val var4: IntentSender = PendingIntent.getBroadcast(
               var1, 0, var3, PendingIntentUtils.immutablePendingIntentFlag$default(PendingIntentUtils.INSTANCE, 0, 1, null)
            )
            .getIntentSender();
         return var4;
      }

      public fun register(context: Context, receiver: ShareBroadcastReceiver) {
         b.k(var1, var2, new IntentFilter("share_sheet_click"), 4);
      }

      public fun unregister(context: Context, receiver: ShareBroadcastReceiver) {
         try {
            var1.unregisterReceiver(var2);
         } catch (var3: Exception) {
         }
      }
   }
}

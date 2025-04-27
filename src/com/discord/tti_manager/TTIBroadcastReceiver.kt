package com.discord.tti_manager

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.os.Bundle
import androidx.core.content.a
import com.discord.react.headless_tasks.api.HeadlessTasks
import kotlin.jvm.internal.q

internal class TTIBroadcastReceiver : BroadcastReceiver {
   public open fun onReceive(context: Context?, intent: Intent?) {
      val var5: java.lang.String;
      if (var2 != null) {
         var5 = var2.getStringExtra("tti_test_action_data");
      } else {
         var5 = null;
      }

      if (var5 != null && var1 != null) {
         val var3: HeadlessTasks.Companion = HeadlessTasks.Companion;
         val var4: Bundle = new Bundle();
         var4.putString("actionData", var5);
         HeadlessTasks.Companion.startHeadlessTask$default(var3, var1, "TTITestAction", 30000L, false, var4, true, 8, null);
      }
   }

   public companion object {
      private const val RUN_TTI_TEST_ACTION: String
      private const val TTI_TEST_ACTION_DATA: String

      public fun register(context: Context, receiver: TTIBroadcastReceiver) {
         q.h(var1, "context");
         q.h(var2, "receiver");
         a.k(var1, var2, new IntentFilter("com.discord.intent.action.RUN_TTI_TEST_ACTION"), 2);
      }

      public fun unregister(context: Context, receiver: TTIBroadcastReceiver) {
         q.h(var1, "context");
         q.h(var2, "receiver");

         try {
            var1.unregisterReceiver(var2);
         } catch (var3: Exception) {
         }
      }
   }
}

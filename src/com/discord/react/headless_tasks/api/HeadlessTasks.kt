package com.discord.react.headless_tasks.api

import android.content.Context
import android.content.Intent
import android.os.Bundle
import com.discord.react.headless_tasks.service.HeadlessTasksService
import com.facebook.react.HeadlessJsTaskService
import com.facebook.react.bridge.Arguments
import com.facebook.react.jstasks.HeadlessJsTaskConfig
import kotlin.jvm.internal.q

public data class HeadlessTasks(taskConfig: HeadlessJsTaskConfig) {
   public final val taskConfig: HeadlessJsTaskConfig

   @JvmStatic
   fun {
      val var0: Int = HeadlessTasksService.j;
   }

   init {
      q.h(var1, "taskConfig");
      super();
      this.taskConfig = var1;
   }

   public operator fun component1(): HeadlessJsTaskConfig {
      return this.taskConfig;
   }

   public fun copy(taskConfig: HeadlessJsTaskConfig = var0.taskConfig): HeadlessTasks {
      q.h(var1, "taskConfig");
      return new HeadlessTasks(var1);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is HeadlessTasks) {
         return false;
      } else {
         return q.c(this.taskConfig, (var1 as HeadlessTasks).taskConfig);
      }
   }

   public override fun hashCode(): Int {
      return this.taskConfig.hashCode();
   }

   public override fun toString(): String {
      val var2: HeadlessJsTaskConfig = this.taskConfig;
      val var1: StringBuilder = new StringBuilder();
      var1.append("HeadlessTasks(taskConfig=");
      var1.append(var2);
      var1.append(")");
      return var1.toString();
   }

   public companion object {
      private final val SERVICE_CLASS: Class<*>
      private const val TASK_ALLOWED_IN_FOREGROUND_KEY: String
      private const val TASK_KEY: String
      private const val TASK_NAME_KEY: String
      private const val TASK_PARAMS_KEY: String
      private const val TASK_TIMEOUT_DEFAULT: Long
      private const val TASK_TIMEOUT_KEY: String

      private fun toIntent(
         context: Context,
         taskName: String,
         taskTimeout: Long = 5000L,
         taskAllowedInForeground: Boolean = true,
         taskParams: Bundle = new Bundle()
      ): Intent {
         val var7: Intent = new Intent(var1, HeadlessTasks.access$getSERVICE_CLASS$cp());
         var7.putExtra("intent.discord.headless_tasks_key", true);
         var7.putExtra("intent.discord.headless_tasks_name", var2);
         var7.putExtra("intent.discord.headless_tasks_timeout", var3);
         var7.putExtra("intent.discord.headless_tasks_aif", var5);
         var7.putExtra("intent.discord.headless_tasks_params", var6);
         return var7;
      }

      public fun fromIntent(intent: Intent?): HeadlessTasks? {
         val var5: HeadlessTasks;
         if (var1 != null && var1.hasExtra("intent.discord.headless_tasks_key")) {
            var5 = new HeadlessTasks(
               new HeadlessJsTaskConfig(
                  var1.getStringExtra("intent.discord.headless_tasks_name"),
                  Arguments.fromBundle(var1.getBundleExtra("intent.discord.headless_tasks_params")),
                  var1.getLongExtra("intent.discord.headless_tasks_timeout", 5000L),
                  var1.getBooleanExtra("intent.discord.headless_tasks_aif", false)
               )
            );
         } else {
            var5 = null;
         }

         return var5;
      }

      public fun startHeadlessTask(
         context: Context,
         taskName: String,
         taskTimeout: Long = 5000L,
         taskAllowedInForeground: Boolean = true,
         taskParams: Bundle = new Bundle(),
         taskInvokingFromBroadcastReceiver: Boolean = false
      ) {
         q.h(var1, "context");
         q.h(var2, "taskName");
         q.h(var6, "taskParams");
         var1.startService(this.toIntent(var1, var2, var3, var5, var6));
         if (var7) {
            HeadlessJsTaskService.acquireWakeLockNow(var1);
         }
      }
   }
}

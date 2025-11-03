package com.discord.react.headless_tasks.service

import android.content.Intent
import com.discord.react.headless_tasks.api.HeadlessTasks
import com.facebook.react.HeadlessJsTaskService
import com.facebook.react.jstasks.HeadlessJsTaskConfig

public class HeadlessTasksService : HeadlessJsTaskService {
   protected override fun getTaskConfig(intent: Intent?): HeadlessJsTaskConfig? {
      val var2: HeadlessTasks = HeadlessTasks.Companion.fromIntent(var1);
      return if (var2 != null) var2.getTaskConfig() else null;
   }
}

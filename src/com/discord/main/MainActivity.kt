package com.discord.main

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.content.res.Configuration
import android.os.Bundle
import androidx.lifecycle.Lifecycle
import com.discord.external_pip.ExternalPipModule
import com.discord.foreground_service.ForegroundServiceManager
import com.discord.notifications.client.NotificationClient
import com.discord.react_activities.ReactActivity
import com.discord.react_activities.ReactActivity.ActivityDelegate
import com.discord.react_startup_flags.StartupFlagsModule
import com.discord.window.WindowFoldingFeatureDetector
import com.facebook.react.bridge.ReactContext
import kotlin.jvm.internal.q

public class MainActivity : ReactActivity {
   @SuppressLint(["VisibleForTests"])
   private fun currentReactContext(): ReactContext? {
      return this.getReactInstanceManager().getCurrentReactContext();
   }

   public override fun getActivityDelegate(): ActivityDelegate {
      return new ReactActivity.ActivityDelegate(this) {
         final MainActivity this$0;

         {
            super(var1, var1);
            this.this$0 = var1;
         }

         private final void parseIntent(Intent var1) {
            val var2: NotificationClient = NotificationClient.Companion.getInstance();
            var var3: Context = this.getContext();
            q.g(var3, "getContext(...)");
            var2.handleIntent(var3, var1);
            val var4: ForegroundServiceManager = ForegroundServiceManager.Companion.getInstance();
            var3 = this.getContext();
            q.g(var3, "getContext(...)");
            var4.handleIntent(var3, var1);
            StartupFlagsModule.Companion.handleIntent(var1);
         }

         protected void onCreate(Bundle var1) {
            super.onCreate(var1);
            val var4: Intent = this.this$0.getIntent();
            q.g(var4, "getIntent(...)");
            this.parseIntent(var4);
            val var5: WindowFoldingFeatureDetector = WindowFoldingFeatureDetector.INSTANCE;
            val var2: MainActivity = this.this$0;
            val var3: Lifecycle = this.this$0.getLifecycle();
            q.g(var3, "getLifecycle(...)");
            var5.configure(var2, var3, this.this$0);
         }

         public boolean onNewIntent(Intent var1) {
            q.h(var1, "intent");
            this.parseIntent(var1);
            return super.onNewIntent(var1);
         }
      };
   }

   public override fun getNameOfComponent(): String {
      return "Discord";
   }

   public open fun onPictureInPictureModeChanged(isInPictureInPictureMode: Boolean) {
      super.onPictureInPictureModeChanged(var1);
      ExternalPipModule.Companion.onPipModeChanged(this.currentReactContext(), var1);
   }

   public open fun onPictureInPictureModeChanged(isInPictureInPictureMode: Boolean, newConfig: Configuration) {
      q.h(var2, "newConfig");
      super.onPictureInPictureModeChanged(var1, var2);
      ExternalPipModule.Companion.onPipModeChanged(this.currentReactContext(), var1);
   }

   protected open fun onUserLeaveHint() {
      super.onUserLeaveHint();
      ExternalPipModule.Companion.onUserLeaveHint(this.currentReactContext());
   }
}

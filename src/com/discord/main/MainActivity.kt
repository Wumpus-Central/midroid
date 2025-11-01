package com.discord.main

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.content.res.Configuration
import android.os.Bundle
import com.discord.bundle_updater.BundleUpdater
import com.discord.external_pip.ExternalPipModule
import com.discord.foreground_service.ForegroundServiceManager
import com.discord.notifications.client.NotificationClient
import com.discord.react_activities.ReactActivity
import com.discord.react_activities.ReactActivity.ActivityDelegate
import com.discord.react_startup_flags.StartupFlagsModule
import com.discord.tti_manager.TTIModule
import com.facebook.react.bridge.ReactContext
import ht.c

public class MainActivity : ReactActivity {
   @SuppressLint(["VisibleForTests"])
   private fun currentReactContext(): ReactContext? {
      return this.getReactActivityDelegate().getCurrentReactContext();
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
            var2.handleIntent(var3, var1);
            val var4: ForegroundServiceManager = ForegroundServiceManager.INSTANCE;
            var3 = this.getContext();
            var4.handleIntent(var3, var1);
            StartupFlagsModule.Companion.handleIntent(var1);
            val var5: BundleUpdater = BundleUpdater.Companion.instance();
            var3 = this.getContext();
            var5.handleIntent(var3, var1);
         }

         @Override
         public void onCreate(Bundle var1) {
            super.onCreate(var1);
            val var2: Intent = this.this$0.getIntent();
            this.parseIntent(var2);
         }

         @Override
         public boolean onNewIntent(Intent var1) {
            this.parseIntent(var1);
            this.this$0.setIntent(var1);
            return super.onNewIntent(var1);
         }
      };
   }

   public override fun getNameOfComponent(): String {
      return "Discord";
   }

   protected override fun onCreate(savedInstanceState: Bundle?) {
      super.onCreate(var1);
      TTIModule.Companion.setStaticMainActivityCreationTime(System.currentTimeMillis());
   }

   @c
   public open fun onPictureInPictureModeChanged(isInPictureInPictureMode: Boolean) {
      super.onPictureInPictureModeChanged(var1);
      ExternalPipModule.Companion.onPipModeChanged(this.currentReactContext(), var1);
   }

   public open fun onPictureInPictureModeChanged(isInPictureInPictureMode: Boolean, newConfig: Configuration) {
      super.onPictureInPictureModeChanged(var1, var2);
      ExternalPipModule.Companion.onPipModeChanged(this.currentReactContext(), var1);
   }

   public override fun onUserLeaveHint() {
      super.onUserLeaveHint();
      ExternalPipModule.Companion.onUserLeaveHint(this.currentReactContext());
   }
}

package com.discord.share

import android.app.Activity
import android.content.Intent
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod
import kotlin.jvm.internal.r

public class ShareManagerModule(reactContext: ReactApplicationContext) : ReactContextBaseJavaModule {
   private final val shareBroadcastReceiver: ShareBroadcastReceiver

   init {
      r.h(var1, "reactContext");
      super(var1);
      this.shareBroadcastReceiver = new ShareBroadcastReceiver(var1);
   }

   public open fun getName(): String {
      return "ShareManager";
   }

   public open fun initialize() {
      super.initialize();
      val var1: ShareBroadcastReceiver.Companion = ShareBroadcastReceiver.Companion;
      val var2: ReactApplicationContext = this.getReactApplicationContext();
      r.g(var2, "reactApplicationContext");
      var1.register(var2, this.shareBroadcastReceiver);
   }

   public open fun invalidate() {
      super.invalidate();

      try {
         val var2: ShareBroadcastReceiver.Companion = ShareBroadcastReceiver.Companion;
         val var1: ReactApplicationContext = this.getReactApplicationContext();
         r.g(var1, "reactApplicationContext");
         var2.unregister(var1, this.shareBroadcastReceiver);
      } catch (var3: Exception) {
      }
   }

   @ReactMethod
   public fun launchApp() {
      val var1: ReactApplicationContext = this.getReactApplicationContext();
      if (var1 != null) {
         val var3: Intent = var1.getPackageManager().getLaunchIntentForPackage(var1.getPackageName());
         var var2: Activity = this.getCurrentActivity();
         if (var2 != null) {
            var2.finish();
         }

         var2 = this.getCurrentActivity();
         if (var2 != null) {
            var2.startActivity(var3);
         }
      }
   }

   @ReactMethod
   public fun setAuthenticationToken(authenticationToken: String?, superProperties: String) {
      r.h(var2, "superProperties");
   }

   @ReactMethod
   public fun setSelectedChannel(channelJSON: String?, guildJSON: String?) {
   }

   @ReactMethod
   public fun share(text: String?, url: String?, chooserText: String?, location: String?) {
      var var5: Boolean;
      if (var1 != null && !f.x(var1)) {
         var5 = false;
      } else {
         var5 = true;
      }

      label41: {
         if (var5) {
            if (var2 != null && !f.x(var2)) {
               var5 = false;
            } else {
               var5 = true;
            }

            if (var5) {
               var5 = false;
               break label41;
            }
         }

         var5 = true;
      }

      if (var5) {
         val var6: Intent = new Intent("android.intent.action.SEND");
         var6.setAction("android.intent.action.SEND");
         var6.setType("text/plain");
         var6.putExtra("android.intent.extra.TEXT", h.k0(h.n(new java.lang.String[]{var1, var2}), "\n", null, null, 0, null, null, 62, null));
         val var9: Activity = this.getReactApplicationContext().getCurrentActivity();
         if (var9 != null) {
            if (var3 == null) {
               var1 = "";
            } else {
               var1 = var3;
            }

            val var11: ShareBroadcastReceiver.Companion = ShareBroadcastReceiver.Companion;
            val var7: ReactApplicationContext = this.getReactApplicationContext();
            r.g(var7, "reactApplicationContext");
            var9.startActivity(Intent.createChooser(var6, var1, var11.getPendingIntentSender(var7, var4)));
         }
      } else {
         val var10: StringBuilder = new StringBuilder();
         var10.append("Text or url must not be null - text: ");
         var10.append(var1);
         var10.append(" url ");
         var10.append(var2);
         throw new IllegalArgumentException(var10.toString().toString());
      }
   }
}

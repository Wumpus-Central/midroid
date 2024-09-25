package com.discord.share

import android.app.Activity
import android.content.Intent
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod
import kotlin.jvm.internal.q

public class ShareManagerModule(reactContext: ReactApplicationContext) : ReactContextBaseJavaModule {
   private final val shareBroadcastReceiver: ShareBroadcastReceiver

   init {
      q.h(var1, "reactContext");
      super(var1);
      this.shareBroadcastReceiver = new ShareBroadcastReceiver(var1);
   }

   public open fun getName(): String {
      return "ShareManager";
   }

   public open fun initialize() {
      super.initialize();
      val var2: ShareBroadcastReceiver.Companion = ShareBroadcastReceiver.Companion;
      val var1: ReactApplicationContext = this.getReactApplicationContext();
      q.g(var1, "getReactApplicationContext(...)");
      var2.register(var1, this.shareBroadcastReceiver);
   }

   public open fun invalidate() {
      super.invalidate();

      try {
         val var2: ShareBroadcastReceiver.Companion = ShareBroadcastReceiver.Companion;
         val var1: ReactApplicationContext = this.getReactApplicationContext();
         q.g(var1, "getReactApplicationContext(...)");
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
      q.h(var2, "superProperties");
   }

   @ReactMethod
   public fun setSelectedChannel(channelJSON: String?, guildJSON: String?) {
   }

   @ReactMethod
   public fun share(text: String?, url: String?, chooserText: String?, location: String?) {
      if (var1 != null && !h.x(var1) || var2 != null && !h.x(var2)) {
         val var5: Intent = new Intent("android.intent.action.SEND");
         var5.setAction("android.intent.action.SEND");
         var5.setType("text/plain");
         var5.putExtra("android.intent.extra.TEXT", i.o0(i.p(new java.lang.String[]{var1, var2}), "\n", null, null, 0, null, null, 62, null));
         val var8: Activity = this.getReactApplicationContext().getCurrentActivity();
         if (var8 != null) {
            var1 = var3;
            if (var3 == null) {
               var1 = "";
            }

            val var10: ShareBroadcastReceiver.Companion = ShareBroadcastReceiver.Companion;
            val var6: ReactApplicationContext = this.getReactApplicationContext();
            q.g(var6, "getReactApplicationContext(...)");
            var8.startActivity(Intent.createChooser(var5, var1, var10.getPendingIntentSender(var6, var4)));
         }
      } else {
         val var9: StringBuilder = new StringBuilder();
         var9.append("Text or url must not be null - text: ");
         var9.append(var1);
         var9.append(" url ");
         var9.append(var2);
         throw new IllegalArgumentException(var9.toString().toString());
      }
   }
}

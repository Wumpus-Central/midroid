package com.discord.minimize_app

import android.content.Intent
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod
import kotlin.jvm.internal.q

public class MinimizeAppModule(reactContext: ReactApplicationContext) : ReactContextBaseJavaModule {
   init {
      q.h(var1, "reactContext");
      super(var1);
   }

   public open fun getName(): String {
      return "MinimizeApp";
   }

   @ReactMethod
   public fun minimizeApp() {
      val var1: Intent = new Intent("android.intent.action.MAIN");
      var1.addCategory("android.intent.category.HOME");
      var1.setFlags(268435456);
      val var2: ReactApplicationContext = this.getReactApplicationContext();
      if (var2 != null) {
         var2.startActivity(var1);
      }
   }
}

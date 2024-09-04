package com.discord.minimize_app

import android.content.Intent
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod
import kotlin.jvm.internal.r

public class MinimizeAppModule(reactContext: ReactApplicationContext) : ReactContextBaseJavaModule {
   init {
      r.h(var1, "reactContext");
      super(var1);
   }

   public open fun getName(): String {
      return "MinimizeApp";
   }

   @ReactMethod
   public fun minimizeApp() {
      val var2: Intent = new Intent("android.intent.action.MAIN");
      var2.addCategory("android.intent.category.HOME");
      var2.setFlags(268435456);
      val var1: ReactApplicationContext = this.getReactApplicationContext();
      if (var1 != null) {
         var1.startActivity(var2);
      }
   }
}

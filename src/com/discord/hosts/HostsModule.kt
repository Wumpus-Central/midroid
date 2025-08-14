package com.discord.hosts

import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod

public class HostsModule(context: ReactApplicationContext) : ReactContextBaseJavaModule(var1) {
   public open fun getName(): String {
      return "Hosts";
   }

   @ReactMethod
   public fun setHosts(api: String, cdn: String) {
      val var3: Hosts = Hosts.INSTANCE;
      val var4: ReactApplicationContext = this.getReactApplicationContext();
      var3.init(var4, var1, var2);
   }
}

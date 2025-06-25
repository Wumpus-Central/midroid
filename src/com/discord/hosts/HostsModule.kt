package com.discord.hosts

import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod
import kotlin.jvm.internal.q

public class HostsModule(context: ReactApplicationContext) : ReactContextBaseJavaModule {
   init {
      q.h(var1, "context");
      super(var1);
   }

   public open fun getName(): String {
      return "Hosts";
   }

   @ReactMethod
   public fun setHosts(api: String, cdn: String) {
      q.h(var1, "api");
      q.h(var2, "cdn");
      val var3: Hosts = Hosts.INSTANCE;
      val var4: ReactApplicationContext = this.getReactApplicationContext();
      q.g(var4, "getReactApplicationContext(...)");
      var3.init(var4, var1, var2);
   }
}

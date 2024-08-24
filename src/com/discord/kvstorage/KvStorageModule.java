package com.discord.kvstorage;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

class KvStorageModule extends ReactContextBaseJavaModule {
   public KvStorageModule(ReactApplicationContext var1) {
      super(var1);
   }

   @ReactMethod(
      isBlockingSynchronousMethod = true
   )
   public boolean activate() {
      try {
         System.loadLibrary("kv_storage");
         KvStorageBridge.instance.activate(this.getReactApplicationContext());
         return true;
      } catch (Exception var2) {
         return false;
      }
   }

   public String getName() {
      return "KvStorage";
   }
}

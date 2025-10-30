package com.discord.kvstorage;

import androidx.annotation.NonNull;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

class KvStorageModule extends ReactContextBaseJavaModule implements LifecycleEventListener {
   public KvStorageModule(ReactApplicationContext var1) {
      super(var1);
      var1.addLifecycleEventListener(this);
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

   @NonNull
   public String getName() {
      return "KvStorage";
   }

   public void invalidate() {
      super.invalidate();
      this.getReactApplicationContext().removeLifecycleEventListener(this);
      KvStorageBridge.instance.deactivate();
   }

   public void onHostDestroy() {
   }

   public void onHostPause() {
   }

   public void onHostResume() {
   }
}

package com.discord.kvstorage;

import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import java.util.Collections;
import java.util.List;

public class KvStoragePackage implements ReactPackage {
   public List<NativeModule> createNativeModules(ReactApplicationContext var1) {
      return Collections.singletonList(new KvStorageModule(var1));
   }

   public List<ViewManager> createViewManagers(ReactApplicationContext var1) {
      return Collections.emptyList();
   }
}

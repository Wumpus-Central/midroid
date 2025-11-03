package com.discord.kvstorage;

import androidx.annotation.NonNull;
import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import java.util.Collections;
import java.util.List;

public class KvStoragePackage implements ReactPackage {
   @NonNull
   @Override
   public List<NativeModule> createNativeModules(@NonNull ReactApplicationContext var1) {
      return Collections.singletonList(new KvStorageModule(var1));
   }

   @NonNull
   @Override
   public List<ViewManager> createViewManagers(@NonNull ReactApplicationContext var1) {
      return Collections.EMPTY_LIST;
   }
}

package com.discord.codegen;

import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import java.util.Collections;
import java.util.List;

public class RTNCodegenPackage implements ReactPackage {
   public List<NativeModule> createNativeModules(ReactApplicationContext var1) {
      return Collections.emptyList();
   }

   public List<ViewManager> createViewManagers(ReactApplicationContext var1) {
      return Collections.emptyList();
   }
}

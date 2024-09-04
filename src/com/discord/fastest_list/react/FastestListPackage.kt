package com.discord.fastest_list.react

import com.facebook.react.ReactPackage
import com.facebook.react.bridge.NativeModule
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.uimanager.LayoutShadowNode
import com.facebook.react.uimanager.ViewManager
import java.util.ArrayList
import kotlin.jvm.internal.r

public class FastestListPackage : ReactPackage {
   public open fun createNativeModules(reactContext: ReactApplicationContext): MutableList<NativeModule> {
      r.h(var1, "reactContext");
      return new ArrayList<>();
   }

   public open fun createViewManagers(reactContext: ReactApplicationContext): MutableList<ViewManager<*, LayoutShadowNode>> {
      r.h(var1, "reactContext");
      return h.o(new FastestListViewManager());
   }
}

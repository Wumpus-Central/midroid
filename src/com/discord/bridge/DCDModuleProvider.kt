package com.discord.bridge

import com.facebook.react.ReactPackage
import com.facebook.react.TurboReactPackage
import com.facebook.react.bridge.NativeModule
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.module.model.ReactModuleInfo
import com.facebook.react.module.model.ReactModuleInfoProvider
import com.facebook.react.uimanager.LayoutShadowNode
import com.facebook.react.uimanager.ViewManager
import eh.w
import fh.s
import java.util.ArrayList
import kotlin.jvm.functions.Function1
import kotlin.jvm.internal.r

public object DCDModuleProvider {
   public fun getLegacyPackageForModule(onNativeModule: (ReactApplicationContext) -> ReactContextBaseJavaModule): ReactPackage {
      r.h(var1, "onNativeModule");
      return getLegacyPackageForModuleWithViewManager$default(this, var1, null, 2, null);
   }

   public fun getLegacyPackageForModuleWithViewManager(
      onNativeModule: ((ReactApplicationContext) -> ReactContextBaseJavaModule)? = null,
      onViewManager: ((ReactApplicationContext) -> ViewManager<*, LayoutShadowNode>)? = null
   ): ReactPackage {
      return new ReactPackage(var1, var2) {
         final Function1<ReactApplicationContext, ReactContextBaseJavaModule> $onNativeModule;
         final Function1<ReactApplicationContext, ViewManager<?, LayoutShadowNode>> $onViewManager;

         {
            this.$onNativeModule = var1;
            this.$onViewManager = var2;
         }

         public java.util.List<ReactContextBaseJavaModule> createNativeModules(ReactApplicationContext var1) {
            r.h(var1, "reactContext");
            val var3: ReactContextBaseJavaModule;
            if (this.$onNativeModule != null) {
               var3 = this.$onNativeModule.invoke(var1) as ReactContextBaseJavaModule;
            } else {
               var3 = null;
            }

            return h.m(var3);
         }

         public java.util.List<ViewManager<?, LayoutShadowNode>> createViewManagers(ReactApplicationContext var1) {
            r.h(var1, "reactContext");
            val var3: ViewManager;
            if (this.$onViewManager != null) {
               var3 = this.$onViewManager.invoke(var1) as ViewManager;
            } else {
               var3 = null;
            }

            return h.m(var3);
         }
      };
   }

   public fun getTurboPackageForModule(moduleName: String, onNativeModule: (ReactApplicationContext) -> NativeModule): TurboReactPackage {
      r.h(var1, "moduleName");
      r.h(var2, "onNativeModule");
      return new TurboReactPackage(var1, var2) {
         final java.lang.String $moduleName;
         final Function1<ReactApplicationContext, NativeModule> $onNativeModule;

         {
            this.$moduleName = var1;
            this.$onNativeModule = var2;
         }

         private static final java.util.Map getReactModuleInfoProvider$lambda$1(java.lang.String var0) {
            r.h(var0, "$moduleName");
            return s.m(new Pair[]{w.a(var0, new ReactModuleInfo(var0, var0, false, false, true, false, true))});
         }

         public NativeModule getModule(java.lang.String var1, ReactApplicationContext var2) {
            var var3: NativeModule = null;
            if (var2 != null) {
               val var6: Function1 = this.$onNativeModule;
               var3 = null;
               if (r.c(var1, this.$moduleName)) {
                  var3 = var6.invoke(var2) as NativeModule;
               }
            }

            return var3;
         }

         public ReactModuleInfoProvider getReactModuleInfoProvider() {
            return new a(this.$moduleName);
         }
      };
   }

   public fun getViewManagers(vararg onViewManager: (ReactApplicationContext) -> ViewManager<*, LayoutShadowNode>): ReactPackage {
      r.h(var1, "onViewManager");
      return new ReactPackage(var1) {
         final Function1<ReactApplicationContext, ViewManager<?, LayoutShadowNode>>[] $onViewManager;

         {
            this.$onViewManager = var1;
         }

         public java.util.List<NativeModule> createNativeModules(ReactApplicationContext var1) {
            r.h(var1, "reactContext");
            return new ArrayList<>();
         }

         public java.util.List<ViewManager<?, LayoutShadowNode>> createViewManagers(ReactApplicationContext var1) {
            r.h(var1, "reactContext");
            val var4: Array<Array<Function1>> = this.$onViewManager;
            val var5: ArrayList = new ArrayList(this.$onViewManager.length);
            val var3: Int = var4.length;

            for (int var2 = 0; var2 < var3; var2++) {
               var5.add(var4[var2].invoke(var1) as ViewManager);
            }

            return var5;
         }
      };
   }
}

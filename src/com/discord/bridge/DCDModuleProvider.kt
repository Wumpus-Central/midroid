package com.discord.bridge

import com.discord.image.fresco.FrescoModuleDiscord
import com.discord.react.utilities.ReactModuleInfoProviderExtensionsKt
import com.facebook.react.BaseReactPackage
import com.facebook.react.ReactPackage
import com.facebook.react.bridge.NativeModule
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.module.model.ReactModuleInfoProvider
import com.facebook.react.turbomodule.core.interfaces.TurboModule
import com.facebook.react.uimanager.LayoutShadowNode
import com.facebook.react.uimanager.ViewManager
import java.util.ArrayList
import kotlin.jvm.functions.Function1

public object DCDModuleProvider {
   public fun ArrayList<ReactPackage>.addTurboPackages(vararg turboPackages: BaseReactPackage): Boolean {
      return CollectionsKt.C(var1, var2);
   }

   @Ja.c
   public fun getLegacyPackageForModule(onNativeModule: (ReactApplicationContext) -> ReactContextBaseJavaModule): ReactPackage {
      return getLegacyPackageForModuleWithViewManager$default(this, var1, null, 2, null);
   }

   @Ja.c
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
            val var3: ReactContextBaseJavaModule;
            if (this.$onNativeModule != null) {
               var3 = this.$onNativeModule.invoke(var1) as ReactContextBaseJavaModule;
            } else {
               var3 = null;
            }

            if (var3 !is FrescoModuleDiscord && var3 is TurboModule) {
               val var4: StringBuilder = new StringBuilder();
               var4.append(
                  "\n                            Do not provide a TurboModule to getLegacyPackage method,\n                            use getTurboPackageForModule instead, class: "
               );
               var4.append(var3);
               var4.append("\n                        ");
               throw new IllegalArgumentException(var4.toString().toString());
            } else {
               return CollectionsKt.o(var3);
            }
         }

         public java.util.List<ViewManager<?, LayoutShadowNode>> createViewManagers(ReactApplicationContext var1) {
            val var3: ViewManager;
            if (this.$onViewManager != null) {
               var3 = this.$onViewManager.invoke(var1) as ViewManager;
            } else {
               var3 = null;
            }

            return CollectionsKt.o(var3);
         }
      };
   }

   public fun getTurboPackageForModule(moduleName: String, onNativeModule: (ReactApplicationContext) -> NativeModule): BaseReactPackage {
      return new BaseReactPackage(var1, var2) {
         final java.lang.String $moduleName;
         final Function1<ReactApplicationContext, NativeModule> $onNativeModule;

         {
            this.$moduleName = var1;
            this.$onNativeModule = var2;
         }

         public NativeModule getModule(java.lang.String var1, ReactApplicationContext var2) {
            val var3: NativeModule;
            if (var1 == this.$moduleName) {
               var3 = this.$onNativeModule.invoke(var2) as NativeModule;
            } else {
               var3 = null;
            }

            return var3;
         }

         public ReactModuleInfoProvider getReactModuleInfoProvider() {
            return ReactModuleInfoProviderExtensionsKt.createReactModuleInfoProvider$default(this.$moduleName, false, 2, null);
         }
      };
   }

   public fun getViewManagers(vararg onViewManager: (ReactApplicationContext) -> ViewManager<*, LayoutShadowNode>): ReactPackage {
      return new ReactPackage(var1) {
         final Function1<ReactApplicationContext, ViewManager<?, LayoutShadowNode>>[] $onViewManager;

         {
            this.$onViewManager = var1;
         }

         public java.util.List<NativeModule> createNativeModules(ReactApplicationContext var1) {
            return new ArrayList<>();
         }

         public java.util.List<ViewManager<?, LayoutShadowNode>> createViewManagers(ReactApplicationContext var1) {
            val var5: Array<Array<Function1>> = this.$onViewManager;
            val var4: ArrayList = new ArrayList(this.$onViewManager.length);
            val var3: Int = var5.length;

            for (int var2 = 0; var2 < var3; var2++) {
               var4.add(var5[var2].invoke(var1) as ViewManager);
            }

            return var4;
         }
      };
   }
}

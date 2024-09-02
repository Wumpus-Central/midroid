package com.discord.bridge

import android.app.Application
import com.discord.bundle_updater.BundleUpdater
import com.facebook.react.ReactPackage
import com.facebook.react.defaults.DefaultReactNativeHost
import java.io.File
import java.util.ArrayList
import kotlin.jvm.internal.q

public class DCDReactNativeHost(application: Application) : DefaultReactNativeHost {
   protected open val isHermesEnabled: Boolean
      protected open get() {
         return java.lang.Boolean.TRUE;
      }


   protected open val isNewArchEnabled: Boolean
      protected open get() {
         return false;
      }


   init {
      q.h(var1, "application");
      super(var1);
   }

   protected open fun getBundleAssetName(): String {
      return "index.android.bundle";
   }

   protected open fun getJSBundleFile(): String? {
      val var1: BundleUpdater.OtaBundle = BundleUpdater.Companion.instance().getBundle();
      if (var1 != null) {
         val var2: File = var1.getLocation();
         if (var2 != null) {
            return var2.getAbsolutePath();
         }
      }

      return null;
   }

   protected open fun getJSMainModuleName(): String {
      return "index.native";
   }

   protected open fun getPackages(): ArrayList<ReactPackage> {
      return new DCDPackageList(this).getPackages();
   }

   public open fun getUseDeveloperSupport(): Boolean {
      return false;
   }
}

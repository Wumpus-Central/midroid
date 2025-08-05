package com.discord.bridge

import android.app.Application
import android.content.Context
import com.discord.bundle_updater.BundleUpdater
import com.facebook.react.ReactPackage
import com.facebook.react.defaults.DefaultReactNativeHost
import com.facebook.react.runtime.ReactSurfaceImpl
import com.facebook.react.runtime.ReactSurfaceView
import java.io.File
import java.util.ArrayList
import kotlin.jvm.internal.r

public class DCDReactNativeHost(application: Application) : DefaultReactNativeHost {
   protected open val isNewArchEnabled: Boolean
      protected open get() {
         return true;
      }


   protected open val isHermesEnabled: Boolean
      protected open get() {
         return java.lang.Boolean.TRUE;
      }


   init {
      r.h(var1, "application");
      super(var1);
   }

   public open fun createReactSurfaceView(context: Context, surfaceImpl: ReactSurfaceImpl): ReactSurfaceView? {
      r.h(var1, "context");
      r.h(var2, "surfaceImpl");
      return new com.discord.react_activities.ReactSurfaceView(var1, var2);
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

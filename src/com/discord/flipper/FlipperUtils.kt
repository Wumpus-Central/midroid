package com.discord.flipper

import android.content.Context
import android.view.View
import com.facebook.react.ReactPackage
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.uimanager.ReactShadowNode
import com.facebook.react.uimanager.ViewManager
import java.lang.reflect.Method
import java.util.ArrayList
import kotlin.jvm.internal.r

public object FlipperUtils {
   private fun getFlipperClass(): Class<*> {
      return Class.forName("com.discord.flipper.ReactNativeFlipper");
   }

   private fun getFlipperInitMethod(methodName: String = "initializeFlipper"): Method {
      return this.getFlipperClass().getMethod(var1, Context.class);
   }

   private fun getFlipperModule(): Class<*> {
      return Class.forName("com.discord.flipper.FlipperModule");
   }

   public fun getFlipperPackage(): ReactPackage {
      return new ReactPackage() {
         public java.util.List<ReactContextBaseJavaModule> createNativeModules(ReactApplicationContext var1) {
            r.h(var1, "reactContext");
            return h.i();
         }

         public java.util.List<ViewManager<View, ReactShadowNode<?>>> createViewManagers(ReactApplicationContext var1) {
            r.h(var1, "reactContext");
            return new ArrayList<>();
         }
      };
   }

   public fun init(context: Context) {
      r.h(var1, "context");
   }
}

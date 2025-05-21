package com.discord.codegen;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.common.build.ReactBuildConfig;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import u3.a;

public abstract class NativeBrowserManagerModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
   public static final String NAME = "NativeBrowserManagerModule";

   public NativeBrowserManagerModuleSpec(ReactApplicationContext var1) {
      super(var1);
   }

   @a
   public final Map<String, Object> getConstants() {
      Map var4 = this.getTypedExportedConstants();
      if (ReactBuildConfig.DEBUG || ReactBuildConfig.IS_INTERNAL_BUILD) {
         HashSet var3 = new HashSet<>(Arrays.asList("isChromeInstalled", "selectedBrowser"));
         HashSet var1 = new HashSet();
         HashSet var2 = new HashSet(var4.keySet());
         var2.removeAll(var3);
         var2.removeAll(var1);
         if (!var2.isEmpty()) {
            throw new IllegalStateException(String.format("Native Module Flow doesn't declare constants: %s", var2));
         }

         var3.removeAll(var4.keySet());
         if (!var3.isEmpty()) {
            throw new IllegalStateException(String.format("Native Module doesn't fill in constants: %s", var3));
         }
      }

      return var4;
   }

   public String getName() {
      return "NativeBrowserManagerModule";
   }

   protected abstract Map<String, Object> getTypedExportedConstants();

   @ReactMethod
   @a
   public abstract void openInAppURL(String var1, Promise var2);

   @ReactMethod
   @a
   public abstract void openInChromeURL(String var1, Promise var2);

   @ReactMethod
   @a
   public abstract void selectBrowser(double var1);
}

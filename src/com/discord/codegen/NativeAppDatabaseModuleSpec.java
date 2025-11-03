package com.discord.codegen;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.common.build.ReactBuildConfig;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import kc.a;

public abstract class NativeAppDatabaseModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
   public static final String NAME = "NativeAppDatabaseModule";

   public NativeAppDatabaseModuleSpec(ReactApplicationContext var1) {
      super(var1);
   }

   @a
   @Override
   public final Map<String, Object> getConstants() {
      Map var3 = this.getTypedExportedConstants();
      if (ReactBuildConfig.DEBUG || ReactBuildConfig.IS_INTERNAL_BUILD) {
         HashSet var1 = new HashSet();
         HashSet var4 = new HashSet<>(Arrays.asList("userId"));
         HashSet var2 = new HashSet(var3.keySet());
         var2.removeAll(var1);
         var2.removeAll(var4);
         if (!var2.isEmpty()) {
            throw new IllegalStateException(String.format("Native Module Flow doesn't declare constants: %s", var2));
         }

         var1.removeAll(var3.keySet());
         if (!var1.isEmpty()) {
            throw new IllegalStateException(String.format("Native Module doesn't fill in constants: %s", var1));
         }
      }

      return var3;
   }

   @Override
   public String getName() {
      return "NativeAppDatabaseModule";
   }

   protected abstract Map<String, Object> getTypedExportedConstants();

   @ReactMethod
   @a
   public abstract void setUserId(String var1);
}

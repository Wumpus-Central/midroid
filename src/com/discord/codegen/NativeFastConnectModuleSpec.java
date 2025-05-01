package com.discord.codegen;

import Q2.a;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.common.build.ReactBuildConfig;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;

public abstract class NativeFastConnectModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
   public static final String NAME = "NativeFastConnectModule";

   public NativeFastConnectModuleSpec(ReactApplicationContext var1) {
      super(var1);
   }

   @a
   public final Map<String, Object> getConstants() {
      Map var1 = this.getTypedExportedConstants();
      if (ReactBuildConfig.DEBUG || ReactBuildConfig.IS_INTERNAL_BUILD) {
         HashSet var4 = new HashSet();
         HashSet var2 = new HashSet<>(Arrays.asList("clientState", "token", "userId"));
         HashSet var3 = new HashSet(var1.keySet());
         var3.removeAll(var4);
         var3.removeAll(var2);
         if (!var3.isEmpty()) {
            throw new IllegalStateException(String.format("Native Module Flow doesn't declare constants: %s", var3));
         }

         var4.removeAll(var1.keySet());
         if (!var4.isEmpty()) {
            throw new IllegalStateException(String.format("Native Module doesn't fill in constants: %s", var4));
         }
      }

      return var1;
   }

   public String getName() {
      return "NativeFastConnectModule";
   }

   protected abstract Map<String, Object> getTypedExportedConstants();

   @ReactMethod
   @a
   public abstract void prepareIdentify(String var1, String var2, double var3, String var5);

   @ReactMethod
   @a
   public abstract void setClientState(String var1, String var2);
}

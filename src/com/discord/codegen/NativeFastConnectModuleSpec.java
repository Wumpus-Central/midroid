package com.discord.codegen;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.common.build.ReactBuildConfig;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import v3.a;

public abstract class NativeFastConnectModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
   public static final String NAME = "NativeFastConnectModule";

   public NativeFastConnectModuleSpec(ReactApplicationContext var1) {
      super(var1);
   }

   @a
   public final Map<String, Object> getConstants() {
      Map var3 = this.getTypedExportedConstants();
      if (ReactBuildConfig.DEBUG || ReactBuildConfig.IS_INTERNAL_BUILD) {
         HashSet var1 = new HashSet();
         HashSet var4 = new HashSet<>(Arrays.asList("clientState", "token", "userId"));
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

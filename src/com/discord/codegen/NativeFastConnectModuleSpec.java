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

public abstract class NativeFastConnectModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
   public static final String NAME = "NativeFastConnectModule";

   public NativeFastConnectModuleSpec(ReactApplicationContext var1) {
      super(var1);
   }

   @a
   @Override
   public final Map<String, Object> getConstants() {
      Map var4 = this.getTypedExportedConstants();
      if (ReactBuildConfig.DEBUG || ReactBuildConfig.IS_INTERNAL_BUILD) {
         HashSet var2 = new HashSet();
         HashSet var3 = new HashSet<>(Arrays.asList("clientState", "token", "userId"));
         HashSet var1 = new HashSet(var4.keySet());
         var1.removeAll(var2);
         var1.removeAll(var3);
         if (!var1.isEmpty()) {
            throw new IllegalStateException(String.format("Native Module Flow doesn't declare constants: %s", var1));
         }

         var2.removeAll(var4.keySet());
         if (!var2.isEmpty()) {
            throw new IllegalStateException(String.format("Native Module doesn't fill in constants: %s", var2));
         }
      }

      return var4;
   }

   @Override
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

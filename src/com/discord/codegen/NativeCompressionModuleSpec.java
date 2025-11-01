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

public abstract class NativeCompressionModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
   public static final String NAME = "NativeCompressionModule";

   public NativeCompressionModuleSpec(ReactApplicationContext var1) {
      super(var1);
   }

   @ReactMethod
   @a
   public abstract void disableZlibStreamSupport(double var1);

   @ReactMethod
   @a
   public abstract void enableZlibStreamSupport(double var1);

   @ReactMethod
   @a
   public abstract void enableZstdStreamSupport(double var1);

   @a
   @Override
   public final Map<String, Object> getConstants() {
      Map var1 = this.getTypedExportedConstants();
      if (ReactBuildConfig.DEBUG || ReactBuildConfig.IS_INTERNAL_BUILD) {
         HashSet var4 = new HashSet<>(Arrays.asList("supportsZstd"));
         HashSet var3 = new HashSet();
         HashSet var2 = new HashSet(var1.keySet());
         var2.removeAll(var4);
         var2.removeAll(var3);
         if (!var2.isEmpty()) {
            throw new IllegalStateException(String.format("Native Module Flow doesn't declare constants: %s", var2));
         }

         var4.removeAll(var1.keySet());
         if (!var4.isEmpty()) {
            throw new IllegalStateException(String.format("Native Module doesn't fill in constants: %s", var4));
         }
      }

      return var1;
   }

   @Override
   public String getName() {
      return "NativeCompressionModule";
   }

   protected abstract Map<String, Object> getTypedExportedConstants();
}

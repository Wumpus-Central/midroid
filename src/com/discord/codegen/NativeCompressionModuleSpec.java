package com.discord.codegen;

import J3.a;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.common.build.ReactBuildConfig;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;

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
   public final Map<String, Object> getConstants() {
      Map var2 = this.getTypedExportedConstants();
      if (ReactBuildConfig.DEBUG || ReactBuildConfig.IS_INTERNAL_BUILD) {
         HashSet var1 = new HashSet<>(Arrays.asList("supportsZstd"));
         HashSet var4 = new HashSet();
         HashSet var3 = new HashSet(var2.keySet());
         var3.removeAll(var1);
         var3.removeAll(var4);
         if (!var3.isEmpty()) {
            throw new IllegalStateException(String.format("Native Module Flow doesn't declare constants: %s", var3));
         }

         var1.removeAll(var2.keySet());
         if (!var1.isEmpty()) {
            throw new IllegalStateException(String.format("Native Module doesn't fill in constants: %s", var1));
         }
      }

      return var2;
   }

   public String getName() {
      return "NativeCompressionModule";
   }

   protected abstract Map<String, Object> getTypedExportedConstants();
}

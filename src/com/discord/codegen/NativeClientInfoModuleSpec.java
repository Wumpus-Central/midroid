package com.discord.codegen;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.common.build.ReactBuildConfig;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import kc.a;

public abstract class NativeClientInfoModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
   public static final String NAME = "NativeClientInfoModule";

   public NativeClientInfoModuleSpec(ReactApplicationContext var1) {
      super(var1);
   }

   @a
   @Override
   public final Map<String, Object> getConstants() {
      Map var2 = this.getTypedExportedConstants();
      if (ReactBuildConfig.DEBUG || ReactBuildConfig.IS_INTERNAL_BUILD) {
         HashSet var4 = new HashSet<>(
            Arrays.asList(
               "Build",
               "DeviceVendorID",
               "Identifier",
               "Manifest",
               "OTABuild",
               "ReleaseChannel",
               "SentryAlphaBetaDsn",
               "SentryDsn",
               "SentryStaffDsn",
               "Version"
            )
         );
         HashSet var3 = new HashSet<>(Arrays.asList("UserSettings"));
         HashSet var1 = new HashSet(var2.keySet());
         var1.removeAll(var4);
         var1.removeAll(var3);
         if (!var1.isEmpty()) {
            throw new IllegalStateException(String.format("Native Module Flow doesn't declare constants: %s", var1));
         }

         var4.removeAll(var2.keySet());
         if (!var4.isEmpty()) {
            throw new IllegalStateException(String.format("Native Module doesn't fill in constants: %s", var4));
         }
      }

      return var2;
   }

   @Override
   public String getName() {
      return "NativeClientInfoModule";
   }

   protected abstract Map<String, Object> getTypedExportedConstants();
}

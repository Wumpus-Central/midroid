package com.discord.codegen;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.common.build.ReactBuildConfig;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import v3.a;

public abstract class NativeClientInfoModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
   public static final String NAME = "NativeClientInfoModule";

   public NativeClientInfoModuleSpec(ReactApplicationContext var1) {
      super(var1);
   }

   @a
   public final Map<String, Object> getConstants() {
      Map var2 = this.getTypedExportedConstants();
      if (ReactBuildConfig.DEBUG || ReactBuildConfig.IS_INTERNAL_BUILD) {
         HashSet var1 = new HashSet<>(
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
         HashSet var4 = new HashSet<>(Arrays.asList("UserSettings"));
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
      return "NativeClientInfoModule";
   }

   protected abstract Map<String, Object> getTypedExportedConstants();
}

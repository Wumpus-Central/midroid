package com.discord.codegen;

import H3.a;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.common.build.ReactBuildConfig;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;

public abstract class NativeClientInfoModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
   public static final String NAME = "NativeClientInfoModule";

   public NativeClientInfoModuleSpec(ReactApplicationContext var1) {
      super(var1);
   }

   @a
   public final Map<String, Object> getConstants() {
      Map var3 = this.getTypedExportedConstants();
      if (ReactBuildConfig.DEBUG || ReactBuildConfig.IS_INTERNAL_BUILD) {
         HashSet var2 = new HashSet<>(
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
         HashSet var1 = new HashSet<>(Arrays.asList("UserSettings"));
         HashSet var4 = new HashSet(var3.keySet());
         var4.removeAll(var2);
         var4.removeAll(var1);
         if (!var4.isEmpty()) {
            throw new IllegalStateException(String.format("Native Module Flow doesn't declare constants: %s", var4));
         }

         var2.removeAll(var3.keySet());
         if (!var2.isEmpty()) {
            throw new IllegalStateException(String.format("Native Module doesn't fill in constants: %s", var2));
         }
      }

      return var3;
   }

   public String getName() {
      return "NativeClientInfoModule";
   }

   protected abstract Map<String, Object> getTypedExportedConstants();
}

package com.discord.codegen;

import I3.a;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.common.build.ReactBuildConfig;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;

public abstract class NativeFileModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
   public static final String NAME = "NativeFileModule";

   public NativeFileModuleSpec(ReactApplicationContext var1) {
      super(var1);
   }

   @ReactMethod
   @a
   public abstract void clearFolder(String var1, String var2, Promise var3);

   @ReactMethod
   @a
   public abstract void fileExists(String var1, Promise var2);

   @a
   public final Map<String, Object> getConstants() {
      Map var4 = this.getTypedExportedConstants();
      if (ReactBuildConfig.DEBUG || ReactBuildConfig.IS_INTERNAL_BUILD) {
         HashSet var1 = new HashSet<>(Arrays.asList("CacheDirPath", "DocumentsDirPath"));
         HashSet var3 = new HashSet();
         HashSet var2 = new HashSet(var4.keySet());
         var2.removeAll(var1);
         var2.removeAll(var3);
         if (!var2.isEmpty()) {
            throw new IllegalStateException(String.format("Native Module Flow doesn't declare constants: %s", var2));
         }

         var1.removeAll(var4.keySet());
         if (!var1.isEmpty()) {
            throw new IllegalStateException(String.format("Native Module doesn't fill in constants: %s", var1));
         }
      }

      return var4;
   }

   @ReactMethod
   @a
   public abstract void getFileHash(String var1, String var2, double var3, Promise var5);

   public String getName() {
      return "NativeFileModule";
   }

   @ReactMethod
   @a
   public abstract void getSize(String var1, Promise var2);

   protected abstract Map<String, Object> getTypedExportedConstants();

   @ReactMethod
   @a
   public abstract void moveFile(String var1, String var2, String var3, Promise var4);

   @ReactMethod
   @a
   public abstract void readAsset(String var1, String var2, Promise var3);

   @ReactMethod
   @a
   public abstract void readFile(String var1, String var2, Promise var3);

   @ReactMethod
   @a
   public abstract void removeFile(String var1, String var2, Promise var3);

   @ReactMethod
   @a
   public abstract void saveFileToGallery(String var1, String var2, String var3, Promise var4);

   @ReactMethod
   @a
   public abstract void writeFile(String var1, String var2, String var3, String var4, Promise var5);
}

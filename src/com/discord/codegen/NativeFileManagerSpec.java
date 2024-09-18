package com.discord.codegen;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import java.util.Map;
import n6.a;

public abstract class NativeFileManagerSpec extends ReactContextBaseJavaModule implements TurboModule {
   public static final String NAME = "RTNFileManager";

   public NativeFileManagerSpec(ReactApplicationContext var1) {
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
      return this.getTypedExportedConstants();
   }

   public String getName() {
      return "RTNFileManager";
   }

   @ReactMethod
   @a
   public abstract void getSize(String var1, Promise var2);

   protected abstract Map<String, Object> getTypedExportedConstants();

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

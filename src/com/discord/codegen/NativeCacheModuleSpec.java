package com.discord.codegen;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import ma.a;

public abstract class NativeCacheModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
   public static final String NAME = "NativeCacheModule";

   public NativeCacheModuleSpec(ReactApplicationContext var1) {
      super(var1);
   }

   @ReactMethod
   @a
   public abstract void clear();

   @ReactMethod
   @a
   public abstract void getItem(String var1, Promise var2);

   public String getName() {
      return "NativeCacheModule";
   }

   @ReactMethod
   @a
   public abstract void refresh(ReadableArray var1, Promise var2);

   @ReactMethod
   @a
   public abstract void removeItem(String var1);

   @ReactMethod
   @a
   public abstract void setItem(String var1, String var2);
}

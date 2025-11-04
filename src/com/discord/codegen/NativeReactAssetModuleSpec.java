package com.discord.codegen;

import H4.a;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

public abstract class NativeReactAssetModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
   public static final String NAME = "NativeReactAssetModule";

   public NativeReactAssetModuleSpec(ReactApplicationContext var1) {
      super(var1);
   }

   public String getName() {
      return "NativeReactAssetModule";
   }

   @ReactMethod
   @a
   public abstract void keysRequest(Callback var1);

   @ReactMethod
   @a
   public abstract void valuesResult(ReadableArray var1);
}

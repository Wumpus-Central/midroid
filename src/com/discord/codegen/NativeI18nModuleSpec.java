package com.discord.codegen;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import kc.a;

public abstract class NativeI18nModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
   public static final String NAME = "NativeI18nModule";

   public NativeI18nModuleSpec(ReactApplicationContext var1) {
      super(var1);
   }

   @Override
   public String getName() {
      return "NativeI18nModule";
   }

   @ReactMethod
   @a
   public abstract void keysRequest(Callback var1);

   @ReactMethod
   @a
   public abstract void valuesResult(ReadableArray var1);
}

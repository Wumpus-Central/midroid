package com.discord.codegen;

import H4.a;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

public abstract class NativeIntentsModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
   public static final String NAME = "NativeIntentsModule";

   public NativeIntentsModuleSpec(ReactApplicationContext var1) {
      super(var1);
   }

   @ReactMethod(
      isBlockingSynchronousMethod = true
   )
   @a
   public abstract boolean canOpenUrlScheme(String var1);

   @ReactMethod(
      isBlockingSynchronousMethod = true
   )
   @a
   public abstract boolean canSendMail();

   @ReactMethod(
      isBlockingSynchronousMethod = true
   )
   @a
   public abstract boolean canSendSMS();

   public String getName() {
      return "NativeIntentsModule";
   }

   @ReactMethod(
      isBlockingSynchronousMethod = true
   )
   @a
   public abstract boolean sendMail(String var1, String var2, ReadableArray var3);

   @ReactMethod(
      isBlockingSynchronousMethod = true
   )
   @a
   public abstract boolean sendSMS(String var1, ReadableArray var2);
}

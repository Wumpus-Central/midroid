package com.discord.codegen;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import kc.a;

public abstract class NativeTTIModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
   public static final String NAME = "NativeTTIModule";

   public NativeTTIModuleSpec(ReactApplicationContext var1) {
      super(var1);
   }

   @ReactMethod(
      isBlockingSynchronousMethod = true
   )
   @a
   public abstract String getLaunchScenario();

   @ReactMethod(
      isBlockingSynchronousMethod = true
   )
   @a
   public abstract Double getMainActivityCreationTime();

   @Override
   public String getName() {
      return "NativeTTIModule";
   }

   @ReactMethod(
      isBlockingSynchronousMethod = true
   )
   @a
   public abstract boolean getWasBroadcastReceiverStartedBefore();

   @ReactMethod(
      isBlockingSynchronousMethod = true
   )
   @a
   public abstract boolean getWasServiceStartedBefore();

   @ReactMethod(
      isBlockingSynchronousMethod = true
   )
   @a
   public abstract boolean wasInitializeCompleteWhenActivityOpened();

   @ReactMethod(
      isBlockingSynchronousMethod = true
   )
   @a
   public abstract boolean wasLaunchedViaShortcut();
}

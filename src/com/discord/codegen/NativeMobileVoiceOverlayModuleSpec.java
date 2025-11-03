package com.discord.codegen;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import kc.a;

public abstract class NativeMobileVoiceOverlayModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
   public static final String NAME = "NativeMobileVoiceOverlayModule";

   public NativeMobileVoiceOverlayModuleSpec(ReactApplicationContext var1) {
      super(var1);
   }

   protected final void emitOnChannelQueryUpdate(String var1) {
      super.mEventEmitterCallback.invoke("onChannelQueryUpdate", var1);
   }

   protected final void emitOnLayoutTrashed() {
      super.mEventEmitterCallback.invoke("onLayoutTrashed");
   }

   @ReactMethod
   @a
   public abstract void enableOverlay(Promise var1);

   @Override
   public String getName() {
      return "NativeMobileVoiceOverlayModule";
   }

   @ReactMethod
   @a
   public abstract void hideOverlay();

   @ReactMethod
   @a
   public abstract void setData(ReadableMap var1);

   @ReactMethod
   @a
   public abstract void showOverlay(ReadableMap var1);
}

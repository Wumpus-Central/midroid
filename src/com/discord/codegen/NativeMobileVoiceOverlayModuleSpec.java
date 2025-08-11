package com.discord.codegen;

import J3.a;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

public abstract class NativeMobileVoiceOverlayModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
   public static final String NAME = "NativeMobileVoiceOverlayModule";

   public NativeMobileVoiceOverlayModuleSpec(ReactApplicationContext var1) {
      super(var1);
   }

   protected final void emitOnChannelQueryUpdate(String var1) {
      super.mEventEmitterCallback.invoke(new Object[]{"onChannelQueryUpdate", var1});
   }

   protected final void emitOnLayoutTrashed() {
      super.mEventEmitterCallback.invoke(new Object[]{"onLayoutTrashed"});
   }

   @ReactMethod
   @a
   public abstract void enableOverlay(Promise var1);

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

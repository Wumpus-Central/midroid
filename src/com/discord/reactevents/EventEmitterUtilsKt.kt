package com.discord.reactevents

import android.content.Context
import com.facebook.react.bridge.ReactContext
import com.facebook.react.bridge.WritableMap
import com.facebook.react.modules.core.DeviceEventManagerModule.RCTDeviceEventEmitter
import kotlin.jvm.internal.r

internal fun Context.emitReactNativeEvent(eventName: String, serializedEvent: WritableMap) {
   r.h(var0, "<this>");
   r.h(var1, "eventName");
   r.h(var2, "serializedEvent");
   getEventEmitter(var0).emit(var1, var2);
}

private fun Context.getEventEmitter(): RCTDeviceEventEmitter {
   r.f(var0, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
   return (var0 as ReactContext).getJSModule(RCTDeviceEventEmitter.class) as RCTDeviceEventEmitter;
}

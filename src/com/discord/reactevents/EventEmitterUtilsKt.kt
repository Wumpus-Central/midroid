package com.discord.reactevents

import android.content.Context
import com.facebook.react.bridge.ReactContext
import com.facebook.react.bridge.WritableMap
import com.facebook.react.modules.core.DeviceEventManagerModule.RCTDeviceEventEmitter

internal fun Context.emitReactNativeEvent(eventName: String, serializedEvent: WritableMap) {
   getEventEmitter(var0).emit(var1, var2);
}

private fun Context.getEventEmitter(): RCTDeviceEventEmitter {
   return (var0 as ReactContext).getJSModule(RCTDeviceEventEmitter.class) as RCTDeviceEventEmitter;
}

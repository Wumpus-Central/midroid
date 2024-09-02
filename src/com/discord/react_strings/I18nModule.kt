package com.discord.react_strings

import com.discord.react_resource_cache.ReactResourceModule
import com.facebook.react.bridge.Callback
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactMethod
import com.facebook.react.bridge.ReadableArray
import kotlin.jvm.internal.q

public class I18nModule(reactContext: ReactApplicationContext) : ReactResourceModule<I18nMessage> {
   private final val reactContext: ReactApplicationContext

   init {
      q.h(var1, "reactContext");
      super(var1);
      this.reactContext = var1;
   }

   public open fun cache(): I18nCache {
      return I18nCache.INSTANCE;
   }

   public override fun getName(): String {
      return "i18nManager";
   }

   public open fun keys(): Array<I18nMessage> {
      return I18nMessage.values();
   }

   @ReactMethod
   public fun keysRequest(callback: Callback) {
      q.h(var1, "callback");
      var1.invoke(this.keysArray());
   }

   @ReactMethod
   public fun valuesResult(values: ReadableArray) {
      q.h(var1, "values");
      this.cache().set(this.reactContext, this.reactResources(var1));
   }
}

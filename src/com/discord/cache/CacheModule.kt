package com.discord.cache

import com.discord.codegen.NativeCacheModuleSpec
import com.facebook.react.bridge.Promise
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReadableArray

public class CacheModule(reactContext: ReactApplicationContext) : NativeCacheModuleSpec(var1) {
   public open fun clear() {
      Cache.Companion.get().clear();
   }

   public open fun getItem(key: String, promise: Promise) {
      try {
         var2.resolve(Cache.Companion.get().getItem(var1));
      } catch (var3: java.lang.Throwable) {
         var2.reject(var3);
         return;
      }
   }

   public open fun refresh(exclude: ReadableArray, promise: Promise) {
      try {
         var2.resolve(Cache.Companion.get().refresh(var1));
      } catch (var3: java.lang.Throwable) {
         var2.reject(var3);
         return;
      }
   }

   public open fun removeItem(key: String) {
      Cache.Companion.get().removeItem(var1);
   }

   public open fun setItem(key: String, value: String) {
      Cache.Companion.get().setItem(var1, var2);
   }
}

package com.discord.cache

import com.discord.codegen.NativeCacheModuleSpec
import com.facebook.react.bridge.Promise
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReadableArray
import kotlin.jvm.internal.r

public class CacheModule(reactContext: ReactApplicationContext) : NativeCacheModuleSpec {
   init {
      r.h(var1, "reactContext");
      super(var1);
   }

   public override fun clear() {
      Cache.Companion.get().clear();
   }

   public override fun getItem(key: String, promise: Promise) {
      r.h(var1, "key");
      r.h(var2, "promise");

      try {
         var2.resolve(Cache.Companion.get().getItem(var1));
      } catch (var3: java.lang.Throwable) {
         var2.reject(var3);
         return;
      }
   }

   public override fun refresh(exclude: ReadableArray, promise: Promise) {
      r.h(var1, "exclude");
      r.h(var2, "promise");

      try {
         var2.resolve(Cache.Companion.get().refresh(var1));
      } catch (var3: java.lang.Throwable) {
         var2.reject(var3);
         return;
      }
   }

   public override fun removeItem(key: String) {
      r.h(var1, "key");
      Cache.Companion.get().removeItem(var1);
   }

   public override fun setItem(key: String, value: String) {
      r.h(var1, "key");
      r.h(var2, "value");
      Cache.Companion.get().setItem(var1, var2);
   }
}

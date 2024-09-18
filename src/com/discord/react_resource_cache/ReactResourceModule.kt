package com.discord.react_resource_cache

import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReadableArray
import com.facebook.react.bridge.WritableNativeArray
import java.util.HashMap
import kotlin.jvm.internal.q

public abstract class ReactResourceModule<T extends java.lang.Enum<?>> : ReactContextBaseJavaModule {
   open fun ReactResourceModule(var1: ReactApplicationContext) {
      q.h(var1, "reactContext");
      super(var1);
   }

   public abstract fun cache(): ReactResourceCache<Any> {
   }

   public abstract fun keys(): Array<Any> {
   }

   public fun keysArray(): WritableNativeArray {
      val var3: WritableNativeArray = new WritableNativeArray();
      val var4: Array<java.lang.Enum> = this.keys();
      val var2: Int = var4.length;

      for (int var1 = 0; var1 < var2; var1++) {
         var3.pushString(var4[var1].name());
      }

      return var3;
   }

   public fun reactResources(values: ReadableArray): HashMap<String, String> {
      q.h(var1, "values");
      val var8: HashMap = new HashMap(var1.size());
      val var6: Array<java.lang.Enum> = this.keys();
      val var4: Int = var6.length;
      var var3: Int = 0;

      for (int var2 = 0; var3 < var4; var2++) {
         val var7: java.lang.String = var6[var3].name();
         val var5: java.lang.String = var1.getString(var2);
         q.g(var5, "getString(...)");
         var8.put(var7, var5);
         var3++;
      }

      return var8;
   }
}

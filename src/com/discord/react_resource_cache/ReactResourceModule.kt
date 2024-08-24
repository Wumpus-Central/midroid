package com.discord.react_resource_cache

import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReadableArray
import com.facebook.react.bridge.WritableNativeArray
import java.util.HashMap
import kotlin.jvm.internal.r

public abstract class ReactResourceModule<T extends java.lang.Enum<?>> : ReactContextBaseJavaModule {
   open fun ReactResourceModule(var1: ReactApplicationContext) {
      r.h(var1, "reactContext");
      super(var1);
   }

   public abstract fun cache(): ReactResourceCache<Any> {
   }

   public abstract fun keys(): Array<Any> {
   }

   public fun keysArray(): WritableNativeArray {
      val var4: WritableNativeArray = new WritableNativeArray();
      val var3: Array<java.lang.Enum> = this.keys();
      val var2: Int = var3.length;

      for (int var1 = 0; var1 < var2; var1++) {
         var4.pushString(var3[var1].name());
      }

      return var4;
   }

   public fun reactResources(values: ReadableArray): HashMap<String, String> {
      r.h(var1, "values");
      val var7: HashMap = new HashMap(var1.size());
      val var5: Array<java.lang.Enum> = this.keys();
      val var4: Int = var5.length;
      var var3: Int = 0;

      for (int var2 = 0; var3 < var4; var2++) {
         val var6: java.lang.String = var5[var3].name();
         val var8: java.lang.String = var1.getString(var2);
         r.g(var8, "values.getString(index)");
         var7.put(var6, var8);
         var3++;
      }

      return var7;
   }
}

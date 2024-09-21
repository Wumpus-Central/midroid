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

   public abstract fun keys(): List<Any> {
   }

   public fun keysArray(): WritableNativeArray {
      val var2: WritableNativeArray = new WritableNativeArray();
      val var1: java.util.Iterator = this.keys().iterator();

      while (var1.hasNext()) {
         var2.pushString((var1.next() as java.lang.Enum).name());
      }

      return var2;
   }

   public fun reactResources(values: ReadableArray): HashMap<String, String> {
      q.h(var1, "values");
      val var4: HashMap = new HashMap(var1.size());
      val var3: java.util.Iterator = this.keys().iterator();

      for (int var2 = 0; var3.hasNext(); var2++) {
         var var5: Any = var3.next();
         if (var2 < 0) {
            i.u();
         }

         val var6: java.lang.String = (var5 as java.lang.Enum).name();
         var5 = var1.getString(var2);
         q.g(var5, "getString(...)");
         var4.put(var6, var5);
      }

      return var4;
   }
}

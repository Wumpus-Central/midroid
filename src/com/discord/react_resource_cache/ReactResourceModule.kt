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
      val var1: WritableNativeArray = new WritableNativeArray();
      val var2: java.util.Iterator = this.keys().iterator();

      while (var2.hasNext()) {
         var1.pushString((var2.next() as java.lang.Enum).name());
      }

      return var1;
   }

   public fun reactResources(values: ReadableArray): HashMap<String, String> {
      q.h(var1, "values");
      val var3: HashMap = new HashMap(var1.size());
      val var4: java.util.Iterator = this.keys().iterator();

      for (int var2 = 0; var4.hasNext(); var2++) {
         var var5: Any = var4.next();
         if (var2 < 0) {
            i.u();
         }

         var5 = (var5 as java.lang.Enum).name();
         val var6: java.lang.String = var1.getString(var2);
         q.g(var6, "getString(...)");
         var3.put(var5, var6);
      }

      return var3;
   }
}

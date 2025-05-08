package com.discord.react_strings

import com.discord.codegen.NativeI18nModuleSpec
import com.discord.react.utilities.NativeArrayExtensionsKt
import com.facebook.react.bridge.Callback
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReadableArray
import java.util.HashMap
import kotlin.jvm.internal.q

public class I18nModule(reactContext: ReactApplicationContext) : NativeI18nModuleSpec {
   private final val reactContext: ReactApplicationContext

   init {
      q.h(var1, "reactContext");
      super(var1);
      this.reactContext = var1;
   }

   public override fun keysRequest(callback: Callback) {
      q.h(var1, "callback");
      var1.invoke(new Object[]{NativeArrayExtensionsKt.toNativeArray(I18nMessage.getEntries(), <unrepresentable>.INSTANCE)});
   }

   public override fun valuesResult(values: ReadableArray) {
      q.h(var1, "values");
      val var5: I18nCache = I18nCache.INSTANCE;
      val var4: ReactApplicationContext = this.reactContext;
      val var3: HashMap = new HashMap();
      val var6: java.util.Iterator = I18nMessage.getEntries().iterator();

      for (int var2 = 0; var6.hasNext(); var2++) {
         var var7: Any = var6.next();
         if (var2 < 0) {
            i.u();
         }

         var7 = (var7 as I18nMessage).name();
         val var8: java.lang.String = var1.getString(var2);
         q.e(var8);
         var3.put(var7, var8);
      }

      var5.set(var4, var3);
   }
}

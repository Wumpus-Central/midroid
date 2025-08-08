package com.discord.react_strings

import a2.a
import com.discord.codegen.NativeI18nModuleSpec
import com.discord.react.utilities.NativeArrayExtensionsKt
import com.facebook.react.bridge.Callback
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReadableArray
import java.util.HashMap
import kotlin.jvm.internal.r

public class I18nModule(reactContext: ReactApplicationContext) : NativeI18nModuleSpec {
   private final val reactContext: ReactApplicationContext

   init {
      r.h(var1, "reactContext");
      super(var1);
      this.reactContext = var1;
   }

   @JvmStatic
   fun `keysRequest$lambda$0`(var0: I18nMessage): Any {
      r.h(var0, "key");
      return var0.name();
   }

   public override fun keysRequest(callback: Callback) {
      r.h(var1, "callback");
      var1.invoke(new Object[]{NativeArrayExtensionsKt.toNativeArray(I18nMessage.getEntries(), new a())});
   }

   public override fun valuesResult(values: ReadableArray) {
      r.h(var1, "values");
      val var4: I18nCache = I18nCache.INSTANCE;
      val var3: ReactApplicationContext = this.reactContext;
      val var5: HashMap = new HashMap();
      val var6: java.util.Iterator = I18nMessage.getEntries().iterator();

      for (int var2 = 0; var6.hasNext(); var2++) {
         var var7: Any = var6.next();
         if (var2 < 0) {
            i.u();
         }

         var7 = (var7 as I18nMessage).name();
         val var8: java.lang.String = var1.getString(var2);
         r.e(var8);
         var5.put(var7, var8);
      }

      var4.set(var3, var5);
   }
}

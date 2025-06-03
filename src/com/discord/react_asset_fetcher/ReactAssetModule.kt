package com.discord.react_asset_fetcher

import com.discord.codegen.NativeReactAssetModuleSpec
import com.discord.react.utilities.NativeArrayExtensionsKt
import com.facebook.react.bridge.Callback
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReadableArray
import java.util.HashMap
import kotlin.jvm.internal.q

public class ReactAssetModule(reactContext: ReactApplicationContext) : NativeReactAssetModuleSpec {
   private final val reactContext: ReactApplicationContext

   init {
      q.h(var1, "reactContext");
      super(var1);
      this.reactContext = var1;
   }

   @JvmStatic
   fun `keysRequest$lambda$0`(var0: ReactAsset): Any {
      q.h(var0, "key");
      return var0.name();
   }

   public override fun keysRequest(callback: Callback) {
      q.h(var1, "callback");
      var1.invoke(new Object[]{NativeArrayExtensionsKt.toNativeArray(ReactAsset.getEntries(), new a())});
   }

   public override fun valuesResult(values: ReadableArray) {
      q.h(var1, "values");
      val var5: ReactAssetCache = ReactAssetCache.INSTANCE;
      val var4: ReactApplicationContext = this.reactContext;
      val var3: HashMap = new HashMap();
      val var6: java.util.Iterator = ReactAsset.getEntries().iterator();

      for (int var2 = 0; var6.hasNext(); var2++) {
         var var7: Any = var6.next();
         if (var2 < 0) {
            i.u();
         }

         var7 = (var7 as ReactAsset).name();
         val var8: java.lang.String = var1.getString(var2);
         q.e(var8);
         var3.put(var7, var8);
      }

      var5.set(var4, var3);
   }
}

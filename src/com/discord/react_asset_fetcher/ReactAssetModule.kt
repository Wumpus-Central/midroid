package com.discord.react_asset_fetcher

import com.discord.codegen.NativeReactAssetModuleSpec
import com.discord.react.utilities.NativeArrayExtensionsKt
import com.facebook.react.bridge.Callback
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReadableArray
import java.util.HashMap
import kotlin.jvm.internal.r

public class ReactAssetModule(reactContext: ReactApplicationContext) : NativeReactAssetModuleSpec {
   private final val reactContext: ReactApplicationContext

   init {
      r.h(var1, "reactContext");
      super(var1);
      this.reactContext = var1;
   }

   @JvmStatic
   fun `keysRequest$lambda$0`(var0: ReactAsset): Any {
      r.h(var0, "key");
      return var0.name();
   }

   public override fun keysRequest(callback: Callback) {
      r.h(var1, "callback");
      var1.invoke(new Object[]{NativeArrayExtensionsKt.toNativeArray(ReactAsset.getEntries(), new a())});
   }

   public override fun valuesResult(values: ReadableArray) {
      r.h(var1, "values");
      val var4: ReactAssetCache = ReactAssetCache.INSTANCE;
      val var5: ReactApplicationContext = this.reactContext;
      val var3: HashMap = new HashMap();
      val var6: java.util.Iterator = ReactAsset.getEntries().iterator();

      for (int var2 = 0; var6.hasNext(); var2++) {
         var var7: Any = var6.next();
         if (var2 < 0) {
            i.u();
         }

         val var8: java.lang.String = (var7 as ReactAsset).name();
         var7 = var1.getString(var2);
         r.e(var7);
         var3.put(var8, var7);
      }

      var4.set(var5, var3);
   }
}

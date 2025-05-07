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

   public override fun keysRequest(callback: Callback) {
      q.h(var1, "callback");
      var1.invoke(new Object[]{NativeArrayExtensionsKt.toNativeArray(ReactAsset.getEntries(), <unrepresentable>.INSTANCE)});
   }

   public override fun valuesResult(values: ReadableArray) {
      q.h(var1, "values");
      val var5: ReactAssetCache = ReactAssetCache.INSTANCE;
      val var3: ReactApplicationContext = this.reactContext;
      val var4: HashMap = new HashMap();
      val var6: java.util.Iterator = ReactAsset.getEntries().iterator();

      for (int var2 = 0; var6.hasNext(); var2++) {
         var var7: Any = var6.next();
         if (var2 < 0) {
            i.u();
         }

         val var8: java.lang.String = (var7 as ReactAsset).name();
         var7 = var1.getString(var2);
         q.e(var7);
         var4.put(var8, var7);
      }

      var5.set(var3, var4);
   }
}

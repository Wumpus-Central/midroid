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
      val var4: ReactAssetCache = ReactAssetCache.INSTANCE;
      val var3: ReactApplicationContext = this.reactContext;
      val var5: HashMap = new HashMap();
      val var6: java.util.Iterator = ReactAsset.getEntries().iterator();

      for (int var2 = 0; var6.hasNext(); var2++) {
         val var7: Any = var6.next();
         if (var2 < 0) {
            i.u();
         }

         var5.put((var7 as ReactAsset).name(), var1.getString(var2));
      }

      var4.set(var3, var5);
   }
}

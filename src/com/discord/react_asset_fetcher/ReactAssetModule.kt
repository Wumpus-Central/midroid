package com.discord.react_asset_fetcher

import com.discord.codegen.NativeReactAssetModuleSpec
import com.discord.react.utilities.NativeArrayExtensionsKt
import com.facebook.react.bridge.Callback
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReadableArray
import java.util.HashMap
import kotlin.jvm.internal.SourceDebugExtension

@SourceDebugExtension(["SMAP\nReactAssetModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReactAssetModule.kt\ncom/discord/react_asset_fetcher/ReactAssetModule\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,36:1\n1872#2,3:37\n*S KotlinDebug\n*F\n+ 1 ReactAssetModule.kt\ncom/discord/react_asset_fetcher/ReactAssetModule\n*L\n29#1:37,3\n*E\n"])
public class ReactAssetModule(reactContext: ReactApplicationContext) : NativeReactAssetModuleSpec(var1) {
   private final val reactContext: ReactApplicationContext

   init {
      this.reactContext = var1;
   }

   @JvmStatic
   fun `keysRequest$lambda$0`(var0: ReactAsset): Any {
      return var0.name();
   }

   public open fun keysRequest(callback: Callback) {
      var1.invoke(NativeArrayExtensionsKt.toNativeArray(ReactAsset.getEntries(), new a()));
   }

   public open fun valuesResult(values: ReadableArray) {
      val var3: ReactAssetCache = ReactAssetCache.INSTANCE;
      val var4: ReactApplicationContext = this.reactContext;
      val var5: HashMap = new HashMap();
      val var6: java.util.Iterator = ReactAsset.getEntries().iterator();

      for (int var2 = 0; var6.hasNext(); var2++) {
         var var7: Any = var6.next();
         if (var2 < 0) {
            CollectionsKt.u();
         }

         val var8: java.lang.String = (var7 as ReactAsset).name();
         var7 = var1.getString(var2);
         var5.put(var8, var7);
      }

      var3.set(var4, var5);
   }
}

package com.discord.react_strings

import Z1.a
import com.discord.codegen.NativeI18nModuleSpec
import com.discord.react.utilities.NativeArrayExtensionsKt
import com.facebook.react.bridge.Callback
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReadableArray
import java.util.HashMap
import kotlin.jvm.internal.SourceDebugExtension

@SourceDebugExtension(["SMAP\nI18nModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 I18nModule.kt\ncom/discord/react_strings/I18nModule\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,38:1\n1872#2,3:39\n*S KotlinDebug\n*F\n+ 1 I18nModule.kt\ncom/discord/react_strings/I18nModule\n*L\n31#1:39,3\n*E\n"])
public class I18nModule(reactContext: ReactApplicationContext) : NativeI18nModuleSpec(var1) {
   private final val reactContext: ReactApplicationContext

   init {
      this.reactContext = var1;
   }

   @JvmStatic
   fun `keysRequest$lambda$0`(var0: I18nMessage): Any {
      return var0.name();
   }

   public override fun keysRequest(callback: Callback) {
      var1.invoke(new Object[]{NativeArrayExtensionsKt.toNativeArray(I18nMessage.getEntries(), new a())});
   }

   public override fun valuesResult(values: ReadableArray) {
      val var5: I18nCache = I18nCache.INSTANCE;
      val var3: ReactApplicationContext = this.reactContext;
      val var4: HashMap = new HashMap();
      val var6: java.util.Iterator = I18nMessage.getEntries().iterator();

      for (int var2 = 0; var6.hasNext(); var2++) {
         var var7: Any = var6.next();
         if (var2 < 0) {
            CollectionsKt.u();
         }

         var7 = (var7 as I18nMessage).name();
         val var8: java.lang.String = var1.getString(var2);
         var4.put(var7, var8);
      }

      var5.set(var3, var4);
   }
}

package com.discord.app_icon

import Da.v
import com.discord.codegen.NativeAppIconModuleSpec
import com.discord.react.utilities.NativeArrayExtensionsKt
import com.discord.react.utilities.NativeMapExtensionsKt
import com.facebook.react.bridge.Promise
import com.facebook.react.bridge.ReactApplicationContext
import java.util.ArrayList
import kotlin.jvm.internal.SourceDebugExtension

@SourceDebugExtension(["SMAP\nAppIconModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppIconModule.kt\ncom/discord/app_icon/AppIconModule\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,38:1\n11165#2:39\n11500#2,3:40\n*S KotlinDebug\n*F\n+ 1 AppIconModule.kt\ncom/discord/app_icon/AppIconModule\n*L\n33#1:39\n33#1:40,3\n*E\n"])
public class AppIconModule(reactContext: ReactApplicationContext) : NativeAppIconModuleSpec(var1) {
   public override fun getAvailableIcons(promise: Promise) {
      val var4: Array<AppIcon> = AppIconUtil.INSTANCE.getAvailableIcons();
      val var5: ArrayList = new ArrayList(var4.length);
      val var3: Int = var4.length;

      for (int var2 = 0; var2 < var3; var2++) {
         var5.add(NativeMapExtensionsKt.nativeMapOf(new Pair[]{v.a("id", var4[var2].getId())}));
      }

      var1.resolve(NativeArrayExtensionsKt.toNativeArray$default(var5, null, 1, null));
   }

   public override fun getCurrentIcon(promise: Promise) {
      val var3: AppIconUtil = AppIconUtil.INSTANCE;
      val var2: ReactApplicationContext = this.getReactApplicationContext();
      var1.resolve(NativeMapExtensionsKt.nativeMapOf(new Pair[]{v.a("id", var3.getCurrentAppIcon(var2).getId())}));
   }

   public override fun setIcon(id: String, promise: Promise) {
      try {
         val var3: AppIconUtil = AppIconUtil.INSTANCE;
         val var4: ReactApplicationContext = this.getReactApplicationContext();
         var3.setAppIcon(var4, var1);
         var2.resolve(java.lang.Boolean.TRUE);
      } catch (var5: Exception) {
         var2.reject(var5);
      }
   }
}

package com.discord.device

import A9.s
import android.os.LocaleList
import com.discord.codegen.NativeDeviceLocaleModuleSpec
import com.facebook.react.bridge.ReactApplicationContext
import java.util.ArrayList

internal class DeviceLocaleModule(reactContext: ReactApplicationContext) : NativeDeviceLocaleModuleSpec(var1) {
   protected override fun getTypedExportedConstants(): MutableMap<String, Any?> {
      val var4: ArrayList = new ArrayList();
      val var7: LocaleList = LocaleList.getAdjustedDefault();
      val var3: Int = var7.size();
      var var2: Int = 10;

      for (int var1 = 0; var1 < var3; var1++) {
         val var5: java.lang.String = var7.get(var1).toLanguageTag();
         if (var1 == 0) {
            var4.add(var5);
         } else {
            val var6: StringBuilder = new StringBuilder();
            var6.append(var5);
            var6.append(";q=0.");
            var6.append(var2);
            var4.add(var6.toString());
         }

         var2 = kotlin.ranges.d.d(1, var2 - 1);
      }

      CollectionsKt.p0(var4, ",", null, null, 0, null, null, 62, null);
      return L.m(new Pair[]{s.a("Language", CollectionsKt.h0(var4)), s.a("Languages", var4)});
   }
}

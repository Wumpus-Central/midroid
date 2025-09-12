package com.discord.device

import B9.s
import android.os.LocaleList
import com.discord.codegen.NativeDeviceLocaleModuleSpec
import com.facebook.react.bridge.ReactApplicationContext
import java.util.ArrayList

internal class DeviceLocaleModule(reactContext: ReactApplicationContext) : NativeDeviceLocaleModuleSpec(var1) {
   protected override fun getTypedExportedConstants(): MutableMap<String, Any?> {
      val var6: ArrayList = new ArrayList();
      val var5: LocaleList = LocaleList.getAdjustedDefault();
      val var3: Int = var5.size();
      var var2: Int = 10;

      for (int var1 = 0; var1 < var3; var1++) {
         val var4: java.lang.String = var5.get(var1).toLanguageTag();
         if (var1 == 0) {
            var6.add(var4);
         } else {
            val var7: StringBuilder = new StringBuilder();
            var7.append(var4);
            var7.append(";q=0.");
            var7.append(var2);
            var6.add(var7.toString());
         }

         var2 = kotlin.ranges.d.d(1, var2 - 1);
      }

      CollectionsKt.p0(var6, ",", null, null, 0, null, null, 62, null);
      return L.m(new Pair[]{s.a("Language", CollectionsKt.h0(var6)), s.a("Languages", var6)});
   }
}

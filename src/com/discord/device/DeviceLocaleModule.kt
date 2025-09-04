package com.discord.device

import B9.s
import android.os.LocaleList
import com.discord.codegen.NativeDeviceLocaleModuleSpec
import com.facebook.react.bridge.ReactApplicationContext
import java.util.ArrayList

internal class DeviceLocaleModule(reactContext: ReactApplicationContext) : NativeDeviceLocaleModuleSpec(var1) {
   protected override fun getTypedExportedConstants(): MutableMap<String, Any?> {
      val var7: ArrayList = new ArrayList();
      val var6: LocaleList = LocaleList.getAdjustedDefault();
      val var3: Int = var6.size();
      var var2: Int = 10;

      for (int var1 = 0; var1 < var3; var1++) {
         val var5: java.lang.String = var6.get(var1).toLanguageTag();
         if (var1 == 0) {
            var7.add(var5);
         } else {
            val var4: StringBuilder = new StringBuilder();
            var4.append(var5);
            var4.append(";q=0.");
            var4.append(var2);
            var7.add(var4.toString());
         }

         var2 = kotlin.ranges.d.d(1, var2 - 1);
      }

      CollectionsKt.p0(var7, ",", null, null, 0, null, null, 62, null);
      return L.m(new Pair[]{s.a("Language", CollectionsKt.h0(var7)), s.a("Languages", var7)});
   }
}

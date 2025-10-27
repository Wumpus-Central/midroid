package com.discord.device

import android.os.LocaleList
import com.discord.codegen.NativeDeviceLocaleModuleSpec
import com.facebook.react.bridge.ReactApplicationContext
import java.util.ArrayList
import xa.v

internal class DeviceLocaleModule(reactContext: ReactApplicationContext) : NativeDeviceLocaleModuleSpec(var1) {
   protected override fun getTypedExportedConstants(): MutableMap<String, Any?> {
      val var7: ArrayList = new ArrayList();
      val var5: LocaleList = LocaleList.getAdjustedDefault();
      val var3: Int = var5.size();
      var var2: Int = 10;

      for (int var1 = 0; var1 < var3; var1++) {
         val var4: java.lang.String = var5.get(var1).toLanguageTag();
         if (var1 == 0) {
            var7.add(var4);
         } else {
            val var6: StringBuilder = new StringBuilder();
            var6.append(var4);
            var6.append(";q=0.");
            var6.append(var2);
            var7.add(var6.toString());
         }

         var2 = kotlin.ranges.e.e(1, var2 - 1);
      }

      CollectionsKt.r0(var7, ",", null, null, 0, null, null, 62, null);
      return O.n(new Pair[]{v.a("Language", CollectionsKt.j0(var7)), v.a("Languages", var7)});
   }
}

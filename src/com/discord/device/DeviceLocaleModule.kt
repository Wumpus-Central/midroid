package com.discord.device

import Ca.v
import android.os.LocaleList
import com.discord.codegen.NativeDeviceLocaleModuleSpec
import com.facebook.react.bridge.ReactApplicationContext
import java.util.ArrayList

internal class DeviceLocaleModule(reactContext: ReactApplicationContext) : NativeDeviceLocaleModuleSpec(var1) {
   protected override fun getTypedExportedConstants(): MutableMap<String, Any?> {
      val var4: ArrayList = new ArrayList();
      val var6: LocaleList = LocaleList.getAdjustedDefault();
      val var3: Int = var6.size();
      var var2: Int = 10;

      for (int var1 = 0; var1 < var3; var1++) {
         val var7: java.lang.String = var6.get(var1).toLanguageTag();
         if (var1 == 0) {
            var4.add(var7);
         } else {
            val var5: StringBuilder = new StringBuilder();
            var5.append(var7);
            var5.append(";q=0.");
            var5.append(var2);
            var4.add(var5.toString());
         }

         var2 = kotlin.ranges.e.e(1, var2 - 1);
      }

      CollectionsKt.r0(var4, ",", null, null, 0, null, null, 62, null);
      return O.n(new Pair[]{v.a("Language", CollectionsKt.j0(var4)), v.a("Languages", var4)});
   }
}

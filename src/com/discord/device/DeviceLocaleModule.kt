package com.discord.device

import android.os.LocaleList
import com.discord.codegen.NativeDeviceLocaleModuleSpec
import com.facebook.react.bridge.ReactApplicationContext
import fm.v
import java.util.ArrayList

internal class DeviceLocaleModule(reactContext: ReactApplicationContext) : NativeDeviceLocaleModuleSpec(var1) {
   protected override fun getTypedExportedConstants(): MutableMap<String, Any?> {
      val var5: ArrayList = new ArrayList();
      val var7: LocaleList = LocaleList.getAdjustedDefault();
      val var3: Int = var7.size();
      var var2: Int = 10;

      for (int var1 = 0; var1 < var3; var1++) {
         val var4: java.lang.String = var7.get(var1).toLanguageTag();
         if (var1 == 0) {
            var5.add(var4);
         } else {
            val var6: StringBuilder = new StringBuilder();
            var6.append(var4);
            var6.append(";q=0.");
            var6.append(var2);
            var5.add(var6.toString());
         }

         var2 = e.e(1, var2 - 1);
      }

      CollectionsKt.r0(var5, ",", null, null, 0, null, null, 62, null);
      return n0.n(new Pair[]{v.a("Language", CollectionsKt.j0(var5)), v.a("Languages", var5)});
   }
}

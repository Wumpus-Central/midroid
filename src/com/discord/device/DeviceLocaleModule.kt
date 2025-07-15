package com.discord.device

import android.os.LocaleList
import com.discord.codegen.NativeDeviceLocaleModuleSpec
import com.facebook.react.bridge.ReactApplicationContext
import java.util.ArrayList
import kotlin.jvm.internal.r
import r9.s
import s9.q

internal class DeviceLocaleModule(reactContext: ReactApplicationContext) : NativeDeviceLocaleModuleSpec {
   init {
      r.h(var1, "reactContext");
      super(var1);
   }

   protected override fun getTypedExportedConstants(): MutableMap<String, Any?> {
      val var6: ArrayList = new ArrayList();
      val var4: LocaleList = LocaleList.getAdjustedDefault();
      r.g(var4, "getAdjustedDefault(...)");
      val var3: Int = var4.size();
      var var2: Int = 10;

      for (int var1 = 0; var1 < var3; var1++) {
         val var7: java.lang.String = var4.get(var1).toLanguageTag();
         if (var1 == 0) {
            r.e(var7);
            var6.add(var7);
         } else {
            val var5: StringBuilder = new StringBuilder();
            var5.append(var7);
            var5.append(";q=0.");
            var5.append(var2);
            var6.add(var5.toString());
         }

         var2 = kotlin.ranges.d.d(1, var2 - 1);
      }

      i.o0(var6, ",", null, null, 0, null, null, 62, null);
      return q.m(new Pair[]{s.a("Language", i.f0(var6)), s.a("Languages", var6)});
   }
}

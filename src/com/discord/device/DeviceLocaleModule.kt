package com.discord.device

import android.os.LocaleList
import com.discord.codegen.NativeDeviceLocaleModuleSpec
import com.facebook.react.bridge.ReactApplicationContext
import java.util.ArrayList
import kotlin.jvm.internal.q
import r9.s

internal class DeviceLocaleModule(reactContext: ReactApplicationContext) : NativeDeviceLocaleModuleSpec {
   init {
      q.h(var1, "reactContext");
      super(var1);
   }

   protected override fun getTypedExportedConstants(): MutableMap<String, Any?> {
      val var5: ArrayList = new ArrayList();
      val var6: LocaleList = LocaleList.getAdjustedDefault();
      q.g(var6, "getAdjustedDefault(...)");
      val var3: Int = var6.size();
      var var2: Int = 10;

      for (int var1 = 0; var1 < var3; var1++) {
         val var7: java.lang.String = var6.get(var1).toLanguageTag();
         if (var1 == 0) {
            q.e(var7);
            var5.add(var7);
         } else {
            val var4: StringBuilder = new StringBuilder();
            var4.append(var7);
            var4.append(";q=0.");
            var4.append(var2);
            var5.add(var4.toString());
         }

         var2 = kotlin.ranges.d.d(1, var2 - 1);
      }

      i.o0(var5, ",", null, null, 0, null, null, 62, null);
      return s9.q.m(new Pair[]{s.a("Language", i.f0(var5)), s.a("Languages", var5)});
   }
}

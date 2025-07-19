package com.discord.device

import A9.q
import android.os.LocaleList
import com.discord.codegen.NativeDeviceLocaleModuleSpec
import com.facebook.react.bridge.ReactApplicationContext
import java.util.ArrayList
import kotlin.jvm.internal.r
import z9.s

internal class DeviceLocaleModule(reactContext: ReactApplicationContext) : NativeDeviceLocaleModuleSpec {
   init {
      r.h(var1, "reactContext");
      super(var1);
   }

   protected override fun getTypedExportedConstants(): MutableMap<String, Any?> {
      val var5: ArrayList = new ArrayList();
      val var7: LocaleList = LocaleList.getAdjustedDefault();
      r.g(var7, "getAdjustedDefault(...)");
      val var3: Int = var7.size();
      var var2: Int = 10;

      for (int var1 = 0; var1 < var3; var1++) {
         val var4: java.lang.String = var7.get(var1).toLanguageTag();
         if (var1 == 0) {
            r.e(var4);
            var5.add(var4);
         } else {
            val var6: StringBuilder = new StringBuilder();
            var6.append(var4);
            var6.append(";q=0.");
            var6.append(var2);
            var5.add(var6.toString());
         }

         var2 = kotlin.ranges.d.d(1, var2 - 1);
      }

      i.q0(var5, ",", null, null, 0, null, null, 62, null);
      return q.m(new Pair[]{s.a("Language", i.h0(var5)), s.a("Languages", var5)});
   }
}

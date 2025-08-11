package com.discord.device

import A9.s
import B9.q
import android.os.LocaleList
import com.discord.codegen.NativeDeviceLocaleModuleSpec
import com.facebook.react.bridge.ReactApplicationContext
import java.util.ArrayList
import kotlin.jvm.internal.r

internal class DeviceLocaleModule(reactContext: ReactApplicationContext) : NativeDeviceLocaleModuleSpec {
   init {
      r.h(var1, "reactContext");
      super(var1);
   }

   protected override fun getTypedExportedConstants(): MutableMap<String, Any?> {
      val var4: ArrayList = new ArrayList();
      val var6: LocaleList = LocaleList.getAdjustedDefault();
      r.g(var6, "getAdjustedDefault(...)");
      val var3: Int = var6.size();
      var var2: Int = 10;

      for (int var1 = 0; var1 < var3; var1++) {
         val var7: java.lang.String = var6.get(var1).toLanguageTag();
         if (var1 == 0) {
            r.e(var7);
            var4.add(var7);
         } else {
            val var5: StringBuilder = new StringBuilder();
            var5.append(var7);
            var5.append(";q=0.");
            var5.append(var2);
            var4.add(var5.toString());
         }

         var2 = kotlin.ranges.d.d(1, var2 - 1);
      }

      i.q0(var4, ",", null, null, 0, null, null, 62, null);
      return q.m(new Pair[]{s.a("Language", i.h0(var4)), s.a("Languages", var4)});
   }
}

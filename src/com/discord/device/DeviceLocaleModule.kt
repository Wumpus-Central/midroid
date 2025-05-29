package com.discord.device

import R8.s
import android.os.LocaleList
import com.discord.codegen.NativeDeviceLocaleModuleSpec
import com.facebook.react.bridge.ReactApplicationContext
import java.util.ArrayList
import kotlin.jvm.internal.q

internal class DeviceLocaleModule(reactContext: ReactApplicationContext) : NativeDeviceLocaleModuleSpec {
   init {
      q.h(var1, "reactContext");
      super(var1);
   }

   protected override fun getTypedExportedConstants(): MutableMap<String, Any?> {
      val var4: ArrayList = new ArrayList();
      val var5: LocaleList = LocaleList.getAdjustedDefault();
      q.g(var5, "getAdjustedDefault(...)");
      val var3: Int = var5.size();
      var var2: Int = 10;

      for (int var1 = 0; var1 < var3; var1++) {
         val var7: java.lang.String = var5.get(var1).toLanguageTag();
         if (var1 == 0) {
            q.e(var7);
            var4.add(var7);
         } else {
            val var6: StringBuilder = new StringBuilder();
            var6.append(var7);
            var6.append(";q=0.");
            var6.append(var2);
            var4.add(var6.toString());
         }

         var2 = kotlin.ranges.d.c(1, var2 - 1);
      }

      i.o0(var4, ",", null, null, 0, null, null, 62, null);
      return S8.q.m(new Pair[]{s.a("Language", i.f0(var4)), s.a("Languages", var4)});
   }
}

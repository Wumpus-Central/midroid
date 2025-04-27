package com.discord.device

import android.os.LocaleList
import com.discord.codegen.NativeDeviceLocaleModuleSpec
import com.facebook.react.bridge.ReactApplicationContext
import f8.w
import java.util.ArrayList
import kotlin.jvm.internal.q

internal class DeviceLocaleModule(reactContext: ReactApplicationContext) : NativeDeviceLocaleModuleSpec {
   init {
      q.h(var1, "reactContext");
      super(var1);
   }

   protected override fun getTypedExportedConstants(): MutableMap<String, Any?> {
      val var5: ArrayList = new ArrayList();
      val var4: LocaleList = LocaleList.getAdjustedDefault();
      q.g(var4, "getAdjustedDefault(...)");
      val var3: Int = var4.size();
      var var2: Int = 10;

      for (int var1 = 0; var1 < var3; var1++) {
         val var7: java.lang.String = var4.get(var1).toLanguageTag();
         if (var1 == 0) {
            q.e(var7);
            var5.add(var7);
         } else {
            val var6: StringBuilder = new StringBuilder();
            var6.append(var7);
            var6.append(";q=0.");
            var6.append(var2);
            var5.add(var6.toString());
         }

         var2 = kotlin.ranges.d.c(1, var2 - 1);
      }

      i.o0(var5, ",", null, null, 0, null, null, 62, null);
      return g8.q.m(new Pair[]{w.a("Language", i.f0(var5)), w.a("Languages", var5)});
   }
}

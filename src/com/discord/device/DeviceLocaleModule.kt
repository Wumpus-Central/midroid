package com.discord.device

import android.os.LocaleList
import com.discord.codegen.NativeDeviceLocaleModuleSpec
import com.facebook.react.bridge.ReactApplicationContext
import h8.w
import java.util.ArrayList
import kotlin.jvm.internal.q

internal class DeviceLocaleModule(reactContext: ReactApplicationContext) : NativeDeviceLocaleModuleSpec {
   init {
      q.h(var1, "reactContext");
      super(var1);
   }

   protected override fun getTypedExportedConstants(): MutableMap<String, Any?> {
      val var4: ArrayList = new ArrayList();
      val var6: LocaleList = LocaleList.getAdjustedDefault();
      q.g(var6, "getAdjustedDefault(...)");
      val var3: Int = var6.size();
      var var2: Int = 10;

      for (int var1 = 0; var1 < var3; var1++) {
         val var7: java.lang.String = var6.get(var1).toLanguageTag();
         if (var1 == 0) {
            q.e(var7);
            var4.add(var7);
         } else {
            val var5: StringBuilder = new StringBuilder();
            var5.append(var7);
            var5.append(";q=0.");
            var5.append(var2);
            var4.add(var5.toString());
         }

         var2 = kotlin.ranges.d.c(1, var2 - 1);
      }

      i.o0(var4, ",", null, null, 0, null, null, 62, null);
      return i8.q.m(new Pair[]{w.a("Language", i.f0(var4)), w.a("Languages", var4)});
   }
}

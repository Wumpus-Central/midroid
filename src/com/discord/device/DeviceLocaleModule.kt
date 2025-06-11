package com.discord.device

import android.os.LocaleList
import com.discord.codegen.NativeDeviceLocaleModuleSpec
import com.facebook.react.bridge.ReactApplicationContext
import e9.s
import java.util.ArrayList
import kotlin.jvm.internal.q

internal class DeviceLocaleModule(reactContext: ReactApplicationContext) : NativeDeviceLocaleModuleSpec {
   init {
      q.h(var1, "reactContext");
      super(var1);
   }

   protected override fun getTypedExportedConstants(): MutableMap<String, Any?> {
      val var7: ArrayList = new ArrayList();
      val var4: LocaleList = LocaleList.getAdjustedDefault();
      q.g(var4, "getAdjustedDefault(...)");
      val var3: Int = var4.size();
      var var2: Int = 10;

      for (int var1 = 0; var1 < var3; var1++) {
         val var6: java.lang.String = var4.get(var1).toLanguageTag();
         if (var1 == 0) {
            q.e(var6);
            var7.add(var6);
         } else {
            val var5: StringBuilder = new StringBuilder();
            var5.append(var6);
            var5.append(";q=0.");
            var5.append(var2);
            var7.add(var5.toString());
         }

         var2 = kotlin.ranges.d.d(1, var2 - 1);
      }

      i.o0(var7, ",", null, null, 0, null, null, 62, null);
      return f9.q.m(new Pair[]{s.a("Language", i.f0(var7)), s.a("Languages", var7)});
   }
}

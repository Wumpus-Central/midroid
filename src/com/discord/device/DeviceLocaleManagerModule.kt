package com.discord.device

import android.os.LocaleList
import com.discord.codegen.NativeDeviceLocaleManagerSpec
import com.facebook.react.bridge.ReactApplicationContext
import gh.w
import hh.r
import java.util.ArrayList
import kotlin.jvm.internal.q

public class DeviceLocaleManagerModule(reactContext: ReactApplicationContext) : NativeDeviceLocaleManagerSpec {
   init {
      q.h(var1, "reactContext");
      super(var1);
   }

   public override fun getName(): String {
      return "RTNDeviceLocaleManager";
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

         var2 = kotlin.ranges.f.c(1, var2 - 1);
      }

      i.n0(var4, ",", null, null, 0, null, null, 62, null);
      return r.m(new Pair[]{w.a("Language", i.d0(var4)), w.a("Languages", var4)});
   }

   public companion object {
      public const val NAME: String
   }
}

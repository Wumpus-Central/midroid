package com.discord.device

import android.os.LocaleList
import com.discord.codegen.NativeDeviceLocaleManagerSpec
import com.facebook.react.bridge.ReactApplicationContext
import fh.w
import gh.r
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
      val var5: ArrayList = new ArrayList();
      val var7: LocaleList = LocaleList.getAdjustedDefault();
      q.g(var7, "getAdjustedDefault(...)");
      val var3: Int = var7.size();
      var var2: Int = 10;

      for (int var1 = 0; var1 < var3; var1++) {
         val var4: java.lang.String = var7.get(var1).toLanguageTag();
         if (var1 == 0) {
            q.e(var4);
            var5.add(var4);
         } else {
            val var6: StringBuilder = new StringBuilder();
            var6.append(var4);
            var6.append(";q=0.");
            var6.append(var2);
            var5.add(var6.toString());
         }

         var2 = kotlin.ranges.f.c(1, var2 - 1);
      }

      i.n0(var5, ",", null, null, 0, null, null, 62, null);
      return r.m(new Pair[]{w.a("Language", i.d0(var5)), w.a("Languages", var5)});
   }

   public companion object {
      public const val NAME: String
   }
}

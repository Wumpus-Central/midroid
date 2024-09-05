package com.discord.device

import android.os.LocaleList
import com.discord.codegen.NativeDeviceLocaleManagerSpec
import com.facebook.react.bridge.ReactApplicationContext
import java.util.ArrayList
import kotlin.jvm.internal.q
import vj.w
import wj.r

public class DeviceLocaleManagerModule(reactContext: ReactApplicationContext) : NativeDeviceLocaleManagerSpec {
   init {
      q.h(var1, "reactContext");
      super(var1);
   }

   public override fun getName(): String {
      return "RTNDeviceLocaleManager";
   }

   protected override fun getTypedExportedConstants(): MutableMap<String, Any?> {
      val var6: ArrayList = new ArrayList();
      val var7: LocaleList = LocaleList.getAdjustedDefault();
      q.g(var7, "getAdjustedDefault(...)");
      val var3: Int = var7.size();
      var var2: Int = 10;

      for (int var1 = 0; var1 < var3; var1++) {
         val var5: java.lang.String = var7.get(var1).toLanguageTag();
         if (var1 == 0) {
            q.e(var5);
            var6.add(var5);
         } else {
            val var4: StringBuilder = new StringBuilder();
            var4.append(var5);
            var4.append(";q=0.");
            var4.append(var2);
            var6.add(var4.toString());
         }

         var2 = kotlin.ranges.f.c(1, var2 - 1);
      }

      i.n0(var6, ",", null, null, 0, null, null, 62, null);
      return r.m(new Pair[]{w.a("Language", i.d0(var6)), w.a("Languages", var6)});
   }

   public companion object {
      public const val NAME: String
   }
}

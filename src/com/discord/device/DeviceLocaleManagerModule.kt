package com.discord.device

import android.os.LocaleList
import com.discord.codegen.NativeDeviceLocaleManagerSpec
import com.facebook.react.bridge.ReactApplicationContext
import java.util.ArrayList
import kh.w
import kotlin.jvm.internal.q
import lh.r

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
      val var4: LocaleList = LocaleList.getAdjustedDefault();
      q.g(var4, "getAdjustedDefault(...)");
      val var3: Int = var4.size();
      var var2: Int = 10;

      for (int var1 = 0; var1 < var3; var1++) {
         val var6: java.lang.String = var4.get(var1).toLanguageTag();
         if (var1 == 0) {
            q.e(var6);
            var5.add(var6);
         } else {
            val var7: StringBuilder = new StringBuilder();
            var7.append(var6);
            var7.append(";q=0.");
            var7.append(var2);
            var5.add(var7.toString());
         }

         var2 = kotlin.ranges.f.c(1, var2 - 1);
      }

      i.o0(var5, ",", null, null, 0, null, null, 62, null);
      return r.m(new Pair[]{w.a("Language", i.e0(var5)), w.a("Languages", var5)});
   }

   public companion object {
      public const val NAME: String
   }
}

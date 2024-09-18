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
      val var7: ArrayList = new ArrayList();
      val var6: LocaleList = LocaleList.getAdjustedDefault();
      q.g(var6, "getAdjustedDefault(...)");
      val var3: Int = var6.size();
      var var2: Int = 10;

      for (int var1 = 0; var1 < var3; var1++) {
         val var4: java.lang.String = var6.get(var1).toLanguageTag();
         if (var1 == 0) {
            q.e(var4);
            var7.add(var4);
         } else {
            val var5: StringBuilder = new StringBuilder();
            var5.append(var4);
            var5.append(";q=0.");
            var5.append(var2);
            var7.add(var5.toString());
         }

         var2 = kotlin.ranges.f.c(1, var2 - 1);
      }

      i.o0(var7, ",", null, null, 0, null, null, 62, null);
      return r.m(new Pair[]{w.a("Language", i.e0(var7)), w.a("Languages", var7)});
   }

   public companion object {
      public const val NAME: String
   }
}

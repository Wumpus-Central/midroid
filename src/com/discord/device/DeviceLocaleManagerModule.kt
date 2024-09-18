package com.discord.device

import android.os.LocaleList
import ch.w
import com.discord.codegen.NativeDeviceLocaleManagerSpec
import com.facebook.react.bridge.ReactApplicationContext
import dh.r
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
      val var7: ArrayList = new ArrayList();
      val var6: LocaleList = LocaleList.getAdjustedDefault();
      q.g(var6, "getAdjustedDefault(...)");
      val var3: Int = var6.size();
      var var2: Int = 10;

      for (int var1 = 0; var1 < var3; var1++) {
         val var5: java.lang.String = var6.get(var1).toLanguageTag();
         if (var1 == 0) {
            q.e(var5);
            var7.add(var5);
         } else {
            val var4: StringBuilder = new StringBuilder();
            var4.append(var5);
            var4.append(";q=0.");
            var4.append(var2);
            var7.add(var4.toString());
         }

         var2 = kotlin.ranges.f.c(1, var2 - 1);
      }

      i.n0(var7, ",", null, null, 0, null, null, 62, null);
      return r.m(new Pair[]{w.a("Language", i.d0(var7)), w.a("Languages", var7)});
   }

   public companion object {
      public const val NAME: String
   }
}

package com.discord.device

import android.os.LocaleList
import com.discord.codegen.NativeDeviceLocaleManagerSpec
import com.facebook.react.bridge.ReactApplicationContext
import eh.w
import fh.s
import java.util.ArrayList
import kotlin.jvm.internal.r
import vh.h

public class DeviceLocaleManagerModule(reactContext: ReactApplicationContext) : NativeDeviceLocaleManagerSpec {
   init {
      r.h(var1, "reactContext");
      super(var1);
   }

   public open fun getName(): String {
      return "RTNDeviceLocaleManager";
   }

   protected open fun getTypedExportedConstants(): MutableMap<String, Any?> {
      val var6: ArrayList = new ArrayList();
      val var7: LocaleList = LocaleList.getAdjustedDefault();
      r.g(var7, "getAdjustedDefault()");
      val var3: Int = var7.size();
      var var2: Int = 10;

      for (int var1 = 0; var1 < var3; var1++) {
         val var4: java.lang.String = var7.get(var1).toLanguageTag();
         if (var1 == 0) {
            r.g(var4, "lang");
            var6.add(var4);
         } else {
            val var5: StringBuilder = new StringBuilder();
            var5.append(var4);
            var5.append(";q=0.");
            var5.append(var2);
            var6.add(var5.toString());
         }

         var2 = h.c(1, var2 - 1);
      }

      kotlin.collections.h.j0(var6, ",", null, null, 0, null, null, 62, null);
      return s.m(new Pair[]{w.a("Language", kotlin.collections.h.Z(var6)), w.a("Languages", var6)});
   }

   public companion object {
      public const val NAME: String
   }
}

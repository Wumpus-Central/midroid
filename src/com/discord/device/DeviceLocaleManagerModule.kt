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

   public override fun getName(): String {
      return "RTNDeviceLocaleManager";
   }

   protected override fun getTypedExportedConstants(): MutableMap<String, Any?> {
      val var5: ArrayList = new ArrayList();
      val var4: LocaleList = LocaleList.getAdjustedDefault();
      r.g(var4, "getAdjustedDefault()");
      val var3: Int = var4.size();
      var var2: Int = 10;

      for (int var1 = 0; var1 < var3; var1++) {
         val var6: java.lang.String = var4.get(var1).toLanguageTag();
         if (var1 == 0) {
            r.g(var6, "lang");
            var5.add(var6);
         } else {
            val var7: StringBuilder = new StringBuilder();
            var7.append(var6);
            var7.append(";q=0.");
            var7.append(var2);
            var5.add(var7.toString());
         }

         var2 = h.c(1, var2 - 1);
      }

      kotlin.collections.h.k0(var5, ",", null, null, 0, null, null, 62, null);
      return s.m(w.a("Language", kotlin.collections.h.a0(var5)), w.a("Languages", var5));
   }

   public companion object {
      public const val NAME: String
   }
}

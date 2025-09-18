package com.discord.tti_manager

import com.discord.codegen.NativeTTIModuleSpec
import com.facebook.react.bridge.ReactApplicationContext

public class TTIModule(reactContext: ReactApplicationContext) : NativeTTIModuleSpec(var1) {
   public override fun getMainActivityCreationTime(): Double? {
      val var2: java.lang.Double;
      if (staticMainActivityCreationTime != null) {
         var2 = (double)staticMainActivityCreationTime.longValue();
      } else {
         var2 = null;
      }

      return var2;
   }

   public companion object {
      public final var staticMainActivityCreationTime: Long?
   }
}

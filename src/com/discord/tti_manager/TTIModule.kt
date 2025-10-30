package com.discord.tti_manager

import com.discord.codegen.NativeTTIModuleSpec
import com.facebook.react.bridge.ReactApplicationContext

public class TTIModule(reactContext: ReactApplicationContext) : NativeTTIModuleSpec(var1) {
   public open fun getMainActivityCreationTime(): Double? {
      return if (staticMainActivityCreationTime != null) (double)staticMainActivityCreationTime.longValue() else null;
   }

   public companion object {
      public final var staticMainActivityCreationTime: Long?
   }
}

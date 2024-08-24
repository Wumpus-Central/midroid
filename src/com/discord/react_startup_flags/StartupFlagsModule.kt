package com.discord.react_startup_flags

import android.content.Intent
import android.content.SharedPreferences
import android.content.SharedPreferences.Editor
import com.discord.codegen.NativeStartupFlagsSpec
import com.facebook.react.bridge.ReactApplicationContext
import kotlin.jvm.internal.r

public class StartupFlagsModule(reactContext: ReactApplicationContext) : NativeStartupFlagsSpec {
   private final val sharedPreferences: SharedPreferences
      private final get() {
         val var1: SharedPreferences = this.getReactApplicationContext().getSharedPreferences("StartupFlagsModule", 0);
         r.g(var1, "reactApplicationContext.…EY, Context.MODE_PRIVATE)");
         return var1;
      }


   init {
      r.h(var1, "reactContext");
      super(var1);
   }

   public open fun getName(): String {
      return "RTNStartupFlags";
   }

   public open fun reactProfilingEnabled(): Boolean {
      if (initialReactProfilingEnabledSetting != null) {
         this.setReactProfilingEnabled(initialReactProfilingEnabledSetting);
         initialReactProfilingEnabledSetting = null;
      }

      return this.getSharedPreferences().getBoolean("reactProfilingEnabled", false);
   }

   public open fun setReactProfilingEnabled(value: Boolean) {
      val var2: Editor = this.getSharedPreferences().edit();
      r.g(var2, "editor");
      var2.putBoolean("reactProfilingEnabled", var1);
      var2.apply();
   }

   public companion object {
      private const val CACHE_KEY: String
      public const val NAME: String
      private const val PROPERTY_NAME: String
      private final var initialReactProfilingEnabledSetting: Boolean?

      public fun handleIntent(intent: Intent) {
         r.h(var1, "intent");
         if (var1.hasExtra("reactProfilingEnabled")) {
            StartupFlagsModule.access$setInitialReactProfilingEnabledSetting$cp(var1.getBooleanExtra("reactProfilingEnabled", false));
         }
      }
   }
}

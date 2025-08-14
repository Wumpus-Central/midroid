package com.discord.react_startup_flags

import android.content.Intent
import android.content.SharedPreferences
import android.content.SharedPreferences.Editor
import com.discord.codegen.NativeStartupFlagsModuleSpec
import com.facebook.react.bridge.ReactApplicationContext
import kotlin.jvm.internal.SourceDebugExtension

@SourceDebugExtension(["SMAP\nStartupFlagsModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StartupFlagsModule.kt\ncom/discord/react_startup_flags/StartupFlagsModule\n+ 2 SharedPreferences.kt\nandroidx/core/content/SharedPreferencesKt\n*L\n1#1,44:1\n41#2,12:45\n*S KotlinDebug\n*F\n+ 1 StartupFlagsModule.kt\ncom/discord/react_startup_flags/StartupFlagsModule\n*L\n26#1:45,12\n*E\n"])
public class StartupFlagsModule(reactContext: ReactApplicationContext) : NativeStartupFlagsModuleSpec(var1) {
   private final val sharedPreferences: SharedPreferences
      private final get() {
         val var1: SharedPreferences = this.getReactApplicationContext().getSharedPreferences("StartupFlagsModule", 0);
         return var1;
      }


   public override fun reactProfilingEnabled(): Boolean {
      if (initialReactProfilingEnabledSetting != null) {
         this.setReactProfilingEnabled(initialReactProfilingEnabledSetting);
         initialReactProfilingEnabledSetting = null;
      }

      return this.getSharedPreferences().getBoolean("reactProfilingEnabled", false);
   }

   public override fun setReactProfilingEnabled(value: Boolean) {
      val var2: Editor = this.getSharedPreferences().edit();
      var2.putBoolean("reactProfilingEnabled", var1);
      var2.apply();
   }

   public companion object {
      private const val CACHE_KEY: String
      private const val PROPERTY_NAME: String
      private final var initialReactProfilingEnabledSetting: Boolean?

      public fun handleIntent(intent: Intent) {
         if (var1.hasExtra("reactProfilingEnabled")) {
            StartupFlagsModule.access$setInitialReactProfilingEnabledSetting$cp(var1.getBooleanExtra("reactProfilingEnabled", false));
         }
      }
   }
}

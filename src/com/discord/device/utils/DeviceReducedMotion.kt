package com.discord.device.utils

import android.content.Context
import android.provider.Settings.Global
import android.provider.Settings.SettingNotFoundException
import eh.p
import kotlin.jvm.internal.r

public object DeviceReducedMotion {
   private final var motionPreference: com.discord.device.utils.DeviceReducedMotion.MotionPreference = DeviceReducedMotion.MotionPreference.AUTO

   private fun createMotionPreference(motionPreference: String): com.discord.device.utils.DeviceReducedMotion.MotionPreference {
      val var2: Int = var1.hashCode();
      if (var2 != -1484543897) {
         if (var2 != -934873754) {
            if (var2 == 3005871 && var1.equals("auto")) {
               return DeviceReducedMotion.MotionPreference.AUTO;
            }
         } else if (var1.equals("reduce")) {
            return DeviceReducedMotion.MotionPreference.REDUCE;
         }
      } else if (var1.equals("no-preference")) {
         return DeviceReducedMotion.MotionPreference.NO_PREFERENCE;
      }

      val var3: StringBuilder = new StringBuilder();
      var3.append("Unknown motion preference: ");
      var3.append(var1);
      throw new IllegalArgumentException(var3.toString());
   }

   private fun Context.isSystemReducedMotionEnabled(): Boolean {
      var var3: Boolean = false;

      var var2: Float;
      try {
         var2 = Global.getFloat(var1.getContentResolver(), "animator_duration_scale");
      } catch (var4: SettingNotFoundException) {
         return false;
      }

      if (var2 == 0.0F) {
         var3 = true;
      }

      return var3;
   }

   public fun Context.isReducedMotionEnabled(): Boolean {
      r.h(var1, "<this>");
      val var2: Int = DeviceReducedMotion.WhenMappings.$EnumSwitchMapping$0[motionPreference.ordinal()];
      var var3: Boolean = true;
      if (var2 != 1) {
         if (var2 != 2) {
            if (var2 != 3) {
               throw new p();
            }

            var3 = this.isSystemReducedMotionEnabled(var1);
         } else {
            var3 = false;
         }
      }

      return var3;
   }

   internal fun setMotionPreference(motionPreference: String) {
      r.h(var1, "motionPreference");
      motionPreference = this.createMotionPreference(var1);
   }

   private enum class MotionPreference {
      AUTO,
      NO_PREFERENCE,
      REDUCE      @JvmStatic
      private DeviceReducedMotion.MotionPreference[] $VALUES = $values();
   }
}

package com.discord.device.utils

import android.content.Context
import android.provider.Settings.Global
import android.provider.Settings.SettingNotFoundException
import fm.p
import kotlin.enums.EnumEntries

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
      var var2: Float;
      try {
         var2 = Global.getFloat(var1.getContentResolver(), "animator_duration_scale");
      } catch (var3: SettingNotFoundException) {
         return false;
      }

      return var2 == 0.0F;
   }

   public fun Context.isReducedMotionEnabled(): Boolean {
      val var2: Int = DeviceReducedMotion.WhenMappings.$EnumSwitchMapping$0[motionPreference.ordinal()];
      if (var2 != 1) {
         if (var2 != 2) {
            if (var2 == 3) {
               return this.isSystemReducedMotionEnabled(var1);
            } else {
               throw new p();
            }
         } else {
            return false;
         }
      } else {
         return true;
      }
   }

   internal fun setMotionPreference(motionPreference: String) {
      motionPreference = this.createMotionPreference(var1);
   }

   private enum class MotionPreference {
      AUTO,
      NO_PREFERENCE,
      REDUCE      @JvmStatic
      private EnumEntries $ENTRIES;
      @JvmStatic
      private DeviceReducedMotion.MotionPreference[] $VALUES;

      @JvmStatic
      fun {
         val var0: Array<DeviceReducedMotion.MotionPreference> = $values();
         $VALUES = var0;
         $ENTRIES = lm.a.a(var0);
      }

      @JvmStatic
      fun getEntries(): EnumEntries {
         return $ENTRIES;
      }
   }
}

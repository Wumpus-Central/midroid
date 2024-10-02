package com.discord.app_icon

import android.content.ComponentName
import android.content.Context
import android.content.pm.PackageManager
import kotlin.jvm.internal.q

public object AppIconUtil {
   private fun getAppIconFromId(id: String): AppIcon? {
      val var5: Array<AppIcon> = AppIcon.values();
      val var3: Int = var5.length;
      var var2: Int = 0;

      while (true) {
         if (var2 >= var3) {
            var6 = null;
            break;
         }

         val var4: AppIcon = var5[var2];
         if (q.c(var5[var2].getId(), var1)) {
            var6 = var4;
            break;
         }

         var2++;
      }

      return var6;
   }

   private fun setComponentState(packageManager: PackageManager, componentName: ComponentName, enabled: Boolean) {
      val var4: Byte;
      if (var3) {
         var4 = 1;
      } else {
         var4 = 2;
      }

      var1.setComponentEnabledSetting(var2, var4, 1);
   }

   public fun getAvailableIcons(): Array<AppIcon> {
      return AppIcon.values();
   }

   public fun getCurrentAppIcon(context: Context): AppIcon {
      q.h(var1, "context");
      val var5: PackageManager = var1.getPackageManager();
      val var6: Array<AppIcon> = AppIcon.values();
      val var3: Int = var6.length;
      var var2: Int = 0;

      while (true) {
         if (var2 >= var3) {
            var7 = null;
            break;
         }

         val var4: AppIcon = var6[var2];
         if (var5.getComponentEnabledSetting(new ComponentName(var1, var6[var2].getAlias())) == 1) {
            var7 = var4;
            break;
         }

         var2++;
      }

      var var8: AppIcon = var7;
      if (var7 == null) {
         var8 = AppIcon.DEFAULT;
      }

      return var8;
   }

   public fun setAppIcon(context: Context, id: String) {
      q.h(var1, "context");
      q.h(var2, "id");
      val var6: AppIcon = this.getAppIconFromId(var2);
      if (var6 != null) {
         val var7: PackageManager = var1.getPackageManager();
         val var9: Array<AppIcon> = AppIcon.values();
         val var4: Int = var9.length;

         for (int var3 = 0; var3 < var4; var3++) {
            val var8: AppIcon = var9[var3];
            val var11: ComponentName = new ComponentName(var1, var9[var3].getAlias());
            val var5: Boolean;
            if (var8 === var6) {
               var5 = true;
            } else {
               var5 = false;
            }

            q.e(var7);
            this.setComponentState(var7, var11, var5);
         }
      } else {
         val var10: StringBuilder = new StringBuilder();
         var10.append("App Icon ");
         var10.append(var2);
         var10.append(" does not exist.");
         throw new IllegalArgumentException(var10.toString());
      }
   }
}

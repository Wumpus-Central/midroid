package com.discord.app_icon

import android.content.ComponentName
import android.content.Context
import android.content.pm.PackageManager
import kotlin.jvm.internal.q

public object AppIconUtil {
   private fun getAppIconFromId(id: String): AppIcon? {
      val var3: java.util.Iterator = AppIcon.getEntries().iterator();

      while (true) {
         if (var3.hasNext()) {
            val var2: Any = var3.next();
            if (!q.c((var2 as AppIcon).getId(), var1)) {
               continue;
            }

            var4 = var2;
            break;
         }

         var4 = null;
         break;
      }

      return var4 as AppIcon;
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
      return AppIcon.getEntries().toArray(new AppIcon[0]);
   }

   public fun getCurrentAppIcon(context: Context): AppIcon {
      q.h(var1, "context");
      val var3: PackageManager = var1.getPackageManager();
      val var4: java.util.Iterator = AppIcon.getEntries().iterator();

      while (true) {
         if (var4.hasNext()) {
            val var2: Any = var4.next();
            if (var3.getComponentEnabledSetting(new ComponentName(var1, (var2 as AppIcon).getAlias())) != 1) {
               continue;
            }

            var5 = var2;
            break;
         }

         var5 = null;
         break;
      }

      val var7: AppIcon = var5 as AppIcon;
      var var6: AppIcon = var5 as AppIcon;
      if (var7 == null) {
         var6 = AppIcon.DEFAULT;
      }

      return var6;
   }

   public fun setAppIcon(context: Context, id: String) {
      q.h(var1, "context");
      q.h(var2, "id");
      val var4: AppIcon = this.getAppIconFromId(var2);
      if (var4 != null) {
         val var6: PackageManager = var1.getPackageManager();

         for (AppIcon var5 : AppIcon.getEntries()) {
            val var7: ComponentName = new ComponentName(var1, var5.getAlias());
            val var3: Boolean;
            if (var5 === var4) {
               var3 = true;
            } else {
               var3 = false;
            }

            q.e(var6);
            this.setComponentState(var6, var7, var3);
         }
      } else {
         val var8: StringBuilder = new StringBuilder();
         var8.append("App Icon ");
         var8.append(var2);
         var8.append(" does not exist.");
         throw new IllegalArgumentException(var8.toString());
      }
   }
}

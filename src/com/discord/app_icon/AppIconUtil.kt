package com.discord.app_icon

import android.content.ComponentName
import android.content.Context
import android.content.pm.PackageManager
import kotlin.jvm.internal.SourceDebugExtension

@SourceDebugExtension(["SMAP\nAppIconUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppIconUtil.kt\ncom/discord/app_icon/AppIconUtil\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,51:1\n37#2,2:52\n295#3,2:54\n295#3,2:56\n*S KotlinDebug\n*F\n+ 1 AppIconUtil.kt\ncom/discord/app_icon/AppIconUtil\n*L\n8#1:52,2\n12#1:54,2\n30#1:56,2\n*E\n"])
public object AppIconUtil {
   private fun getAppIconFromId(id: String): AppIcon? {
      val var3: java.util.Iterator = AppIcon.getEntries().iterator();

      while (true) {
         if (var3.hasNext()) {
            val var2: Any = var3.next();
            if (!((var2 as AppIcon).getId() == var1)) {
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

      return if (var5 as AppIcon == null) AppIcon.DEFAULT else var5 as AppIcon;
   }

   public fun setAppIcon(context: Context, id: String) {
      val var4: AppIcon = this.getAppIconFromId(var2);
      if (var4 != null) {
         val var7: PackageManager = var1.getPackageManager();

         for (AppIcon var5 : AppIcon.getEntries()) {
            val var6: ComponentName = new ComponentName(var1, var5.getAlias());
            val var3: Boolean;
            if (var5 === var4) {
               var3 = true;
            } else {
               var3 = false;
            }

            this.setComponentState(var7, var6, var3);
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

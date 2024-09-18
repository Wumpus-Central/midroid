package com.discord.browser_manager

import android.content.ActivityNotFoundException
import android.content.Context
import android.content.Intent
import android.net.Uri
import com.discord.chrome_custom_tabs.CustomTabs
import com.discord.theme.R
import com.discord.theme.utils.ColorUtilsKt
import kotlin.jvm.functions.Function1
import kotlin.jvm.internal.q
import lk.j

internal object BrowserManager {
   private fun openUrlExternally(context: Context, uri: Uri, onFailure: (Exception) -> Unit, forceExternal: Boolean = true) {
      try {
         var10 = new Intent("android.intent.action.VIEW", var2).addFlags(268435456);
         q.g(var10, "addFlags(...)");
      } catch (var9: ActivityNotFoundException) {
         var3.invoke(var9);
         return;
      }

      if (var4) {
         try {
            val var11: java.util.List = var1.getPackageManager().queryIntentActivities(var10, 0);
            q.g(var11, "queryIntentActivities(...)");
            var10.setPackage(j.s(j.p(j.z(i.S(var11), <unrepresentable>.INSTANCE), new Function1(var1) {
               final Context $context;

               {
                  super(1);
                  this.$context = var1;
               }

               public final java.lang.Boolean invoke(java.lang.String var1) {
                  q.h(var1, "it");
                  return q.c(var1, this.$context.getPackageName()) xor true;
               }
            })) as java.lang.String);
         } catch (var8: ActivityNotFoundException) {
            var3.invoke(var8);
            return;
         }
      }

      try {
         var1.startActivity(var10);
      } catch (var7: ActivityNotFoundException) {
         var3.invoke(var7);
      }
   }

   private fun openUrlWithCustomTabs(context: Context, uri: Uri, onFailure: (Exception) -> Unit) {
      CustomTabs.openUrlWithCustomTabs$default(
         CustomTabs.INSTANCE, var1, var2, false, ColorUtilsKt.getThemeColor(var1, R.color.white, R.color.primary_600), null, null, null, null, var3, 244, null
      );
   }

   public fun tryOpenUrlExternally(context: Context, url: String, onFailure: (Exception) -> Unit) {
      q.h(var1, "context");
      q.h(var2, "url");
      q.h(var3, "onFailure");

      try {
         val var5: Uri = Uri.parse(var2);
         q.e(var5);
         openUrlExternally$default(this, var1, var5, var3, false, 8, null);
      } catch (var4: Exception) {
         var3.invoke(var4);
      }
   }

   public fun tryOpenUrlWithCustomTabs(context: Context, url: String, onFailure: (Exception) -> Unit) {
      q.h(var1, "context");
      q.h(var2, "url");
      q.h(var3, "onFailure");

      try {
         val var5: Uri = Uri.parse(var2);
         q.e(var5);
         this.openUrlWithCustomTabs(var1, var5, new Function1(var1, var2, var3) {
            final Context $context;
            final Function1 $onFailure;
            final java.lang.String $url;

            {
               super(1);
               this.$context = var1;
               this.$url = var2;
               this.$onFailure = var3;
            }

            public final void invoke(Exception var1) {
               q.h(var1, "it");
               BrowserManager.INSTANCE.tryOpenUrlExternally(this.$context, this.$url, this.$onFailure);
            }
         });
      } catch (var6: Exception) {
         this.tryOpenUrlExternally(var1, var2, var3);
      }
   }
}

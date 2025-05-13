package com.discord.intents

import android.content.ActivityNotFoundException
import android.content.Intent
import android.net.Uri
import android.os.Build.VERSION
import com.discord.codegen.NativeLinkingModuleSpec
import com.facebook.react.bridge.ReactApplicationContext
import kotlin.jvm.internal.q

internal class LinkingModule(reactContext: ReactApplicationContext) : NativeLinkingModuleSpec {
   private final val reactContext: ReactApplicationContext

   init {
      q.h(var1, "reactContext");
      super(var1);
      this.reactContext = var1;
   }

   public override fun tryOpenScheme(scheme: String): Boolean {
      q.h(var1, "scheme");

      try {
         var4 = Uri.parse(var1);
      } catch (var3: Exception) {
         var4 = null;
      }

      val var5: Intent = new Intent("android.intent.action.VIEW", var4);
      var5.addFlags(268435456);

      try {
         this.reactContext.startActivity(var5);
         return true;
      } catch (var2: ActivityNotFoundException) {
         return false;
      }
   }

   public override fun tryOpenUrlAsUniversalLink(urlString: String): Boolean {
      q.h(var1, "urlString");
      if (VERSION.SDK_INT < 30) {
         return false;
      } else {
         try {
            var4 = Uri.parse(var1);
         } catch (var3: Exception) {
            var4 = null;
         }

         val var5: Intent = new Intent("android.intent.action.VIEW", var4);
         var5.addFlags(268436992);

         try {
            this.reactContext.startActivity(var5);
            return true;
         } catch (var2: ActivityNotFoundException) {
            return false;
         }
      }
   }
}

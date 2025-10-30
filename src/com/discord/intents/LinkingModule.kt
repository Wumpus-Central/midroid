package com.discord.intents

import android.content.ActivityNotFoundException
import android.content.Intent
import android.net.Uri
import android.os.Build.VERSION
import com.discord.codegen.NativeLinkingModuleSpec
import com.facebook.react.bridge.ReactApplicationContext
import kotlin.jvm.internal.SourceDebugExtension

@SourceDebugExtension(["SMAP\nLinkingModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LinkingModule.kt\ncom/discord/intents/LinkingModule\n+ 2 Uri.kt\nandroidx/core/net/UriKt\n*L\n1#1,58:1\n29#2:59\n29#2:60\n*S KotlinDebug\n*F\n+ 1 LinkingModule.kt\ncom/discord/intents/LinkingModule\n*L\n19#1:59\n42#1:60\n*E\n"])
internal class LinkingModule(reactContext: ReactApplicationContext) : NativeLinkingModuleSpec(var1) {
   private final val reactContext: ReactApplicationContext

   init {
      this.reactContext = var1;
   }

   public override fun tryOpenScheme(scheme: String): Boolean {
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

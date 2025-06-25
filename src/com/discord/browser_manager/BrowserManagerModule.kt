package com.discord.browser_manager

import android.content.Context
import com.discord.cache.Cache
import com.discord.codegen.NativeBrowserManagerModuleSpec
import com.facebook.react.bridge.Promise
import com.facebook.react.bridge.ReactApplicationContext
import kotlin.jvm.internal.q
import t9.s

public class BrowserManagerModule(reactContext: ReactApplicationContext) : NativeBrowserManagerModuleSpec {
   init {
      q.h(var1, "reactContext");
      super(var1);
   }

   @JvmStatic
   fun `openInAppURL$lambda$1`(var0: Promise, var1: Exception): Unit {
      q.h(var1, "e");
      var0.reject(null, var1.getMessage(), var1, null);
      return Unit.a;
   }

   @JvmStatic
   fun `openInChromeURL$lambda$0`(var0: Promise, var1: Exception): Unit {
      q.h(var1, "e");
      var0.reject(null, var1.getMessage(), var1, null);
      return Unit.a;
   }

   protected override fun getTypedExportedConstants(): MutableMap<String, Any> {
      val var2: java.lang.String = Cache.Companion.get().getItem("SELECTED_BROWSER");
      if (var2 != null) {
         val var3: Int = h.m(var2);
         if (var3 != null) {
            return u9.q.m(new Pair[]{s.a("selectedBrowser", var3), s.a("isChromeInstalled", java.lang.Boolean.TRUE)});
         }
      }

      return u9.q.m(new Pair[]{s.a("selectedBrowser", 1), s.a("isChromeInstalled", java.lang.Boolean.TRUE)});
   }

   public override fun openInAppURL(url: String, promise: Promise) {
      q.h(var1, "url");
      q.h(var2, "promise");
      val var4: BrowserManager = BrowserManager.INSTANCE;
      var var3: Any = this.getCurrentActivity();
      if (var3 == null) {
         var3 = this.getReactApplicationContext();
      }

      q.e(var3);
      var4.tryOpenUrlWithCustomTabs((Context)var3, var1, new e(var2));
   }

   public override fun openInChromeURL(url: String, promise: Promise) {
      q.h(var1, "url");
      q.h(var2, "promise");
      val var3: BrowserManager = BrowserManager.INSTANCE;
      val var4: ReactApplicationContext = this.getReactApplicationContext();
      q.g(var4, "getReactApplicationContext(...)");
      var3.tryOpenUrlExternally(var4, var1, new d(var2));
   }

   public override fun selectBrowser(browser: Double) {
      val var3: Int = (int)var1;
      if ((int)var1 != 0) {
         if (var3 != 1 && var3 != 2) {
            val var4: StringBuilder = new StringBuilder();
            var4.append("Unknown browser id provided: ");
            var4.append(var1);
            throw new IllegalArgumentException(var4.toString());
         }

         Cache.Companion.get().setItem("SELECTED_BROWSER", java.lang.String.valueOf(var1));
      } else {
         Cache.Companion.get().setItem("SELECTED_BROWSER", "1");
      }
   }

   private companion object {
      private const val BROWSER_CACHE_KEY: String
      private const val BROWSER_SAFARI: Int
      private const val BROWSER_IN_APP: Int
      private const val BROWSER_CHROME: Int
   }
}

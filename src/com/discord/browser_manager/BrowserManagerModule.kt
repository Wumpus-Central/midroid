package com.discord.browser_manager

import android.content.Context
import com.discord.cache.CacheModule
import com.facebook.react.bridge.Promise
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod
import fh.w
import gh.r
import kotlin.jvm.functions.Function1
import kotlin.jvm.internal.q

public class BrowserManagerModule(reactContext: ReactApplicationContext) : ReactContextBaseJavaModule {
   private final val cacheModule: CacheModule
      private final get() {
         val var1: CacheModule.Companion = CacheModule.Companion;
         val var2: ReactApplicationContext = this.getReactApplicationContext();
         q.g(var2, "getReactApplicationContext(...)");
         return var1.get(var2);
      }


   init {
      q.h(var1, "reactContext");
      super(var1);
   }

   public open fun getConstants(): MutableMap<String, Any?> {
      val var2: java.lang.String = this.getCacheModule().getItem("SELECTED_BROWSER");
      if (var2 != null) {
         val var3: Int = h.m(var2);
         if (var3 != null) {
            return r.m(new Pair[]{w.a("selectedBrowser", var3), w.a("isChromeInstalled", java.lang.Boolean.TRUE)});
         }
      }

      return r.m(new Pair[]{w.a("selectedBrowser", 1), w.a("isChromeInstalled", java.lang.Boolean.TRUE)});
   }

   public open fun getName(): String {
      return "BrowserManager";
   }

   @ReactMethod
   public fun openInAppURL(url: String, unused: String, promise: Promise) {
      q.h(var1, "url");
      q.h(var2, "unused");
      q.h(var3, "promise");
      val var4: BrowserManager = BrowserManager.INSTANCE;
      var var5: Any = this.getCurrentActivity();
      if (var5 == null) {
         var5 = this.getReactApplicationContext();
      }

      q.e(var5);
      var4.tryOpenUrlWithCustomTabs((Context)var5, var1, new Function1(var3) {
         final Promise $promise;

         {
            super(1);
            this.$promise = var1;
         }

         public final void invoke(Exception var1) {
            q.h(var1, "e");
            this.$promise.reject(var1);
         }
      });
   }

   @ReactMethod
   public fun openInChromeURL(url: String, newTab: Boolean, promise: Promise) {
      q.h(var1, "url");
      q.h(var3, "promise");
      val var4: BrowserManager = BrowserManager.INSTANCE;
      val var5: ReactApplicationContext = this.getReactApplicationContext();
      q.g(var5, "getReactApplicationContext(...)");
      var4.tryOpenUrlExternally(var5, var1, new Function1(var3) {
         final Promise $promise;

         {
            super(1);
            this.$promise = var1;
         }

         public final void invoke(Exception var1) {
            q.h(var1, "e");
            this.$promise.reject(var1);
         }
      });
   }

   @ReactMethod
   public fun selectBrowser(browser: Int) {
      if (var1 != 0) {
         if (var1 != 1 && var1 != 2) {
            val var2: StringBuilder = new StringBuilder();
            var2.append("Unknown browser id provided: ");
            var2.append(var1);
            throw new IllegalArgumentException(var2.toString());
         }

         this.getCacheModule().setItem("SELECTED_BROWSER", java.lang.String.valueOf(var1));
      } else {
         this.getCacheModule().setItem("SELECTED_BROWSER", "1");
      }
   }

   private companion object {
      private const val BROWSER_CACHE_KEY: String
      private const val BROWSER_CHROME: Int
      private const val BROWSER_IN_APP: Int
      private const val BROWSER_SAFARI: Int
   }
}

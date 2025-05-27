package com.discord.client_info

import android.content.Context
import g9.j
import java.util.Locale
import kotlin.jvm.internal.q

public object ClientInfo {
   public final lateinit var versionName: String
      internal set

   public final lateinit var versionCode: String
      internal set

   public final lateinit var otaManifestETag: String
      internal set

   public final lateinit var otaVersion: String
      internal set

   public final lateinit var packageName: String
      internal set

   private final lateinit var flavor: String
   private final lateinit var buildType: String

   public final val releaseChannel: String
      public final get() {
         var var1: java.lang.String = null;
         var var2: java.lang.String = flavor;
         if (flavor == null) {
            q.y("flavor");
            var2 = null;
         }

         if (buildType == null) {
            q.y("buildType");
         } else {
            var1 = buildType;
         }

         var var8: java.lang.String = var1;
         if (var1.length() > 0) {
            val var9: StringBuilder = new StringBuilder();
            var var4: java.lang.String = java.lang.String.valueOf(var1.charAt(0));
            q.f(var4, "null cannot be cast to non-null type java.lang.String");
            var4 = var4.toUpperCase(Locale.ROOT);
            q.g(var4, "toUpperCase(...)");
            var9.append((Object)var4);
            var1 = var1.substring(1);
            q.g(var1, "substring(...)");
            var9.append(var1);
            var8 = var9.toString();
         }

         val var6: StringBuilder = new StringBuilder();
         var6.append(var2);
         var6.append(var8);
         return var6.toString();
      }


   public const val SENTRY_DSN: String = "https://70545531dfe34835bf4dd0996821e8b6@o64374.ingest.sentry.io/5992375"
   public const val SENTRY_STAFF_DSN: String = "https://90509cba01573ee4e14a2f5e15aee5ca@o64374.ingest.sentry.io/5992375"
   public const val SENTRY_ALPHA_BETA_DSN: String = "https://9a42ef460144a03b30c8b2d5321cfe11@o64374.ingest.sentry.io/5992375"
   public const val SENTRY_RELEASE: String = "discord_android@281.14.0-0+281014"

   public final val isDebugBuild: Boolean
      public final get() {
         var var1: java.lang.String = buildType;
         if (buildType == null) {
            q.y("buildType");
            var1 = null;
         }

         return q.c(var1, "debug");
      }


   public final val isDeveloperBuild: Boolean
      public final get() {
         var var1: java.lang.String = flavor;
         if (flavor == null) {
            q.y("flavor");
            var1 = null;
         }

         return q.c(var1, "developer");
      }


   public final val isProdBuild: Boolean by j.b(new a())
      public final get() {
         return isProdBuild$delegate.getValue() as java.lang.Boolean;
      }


   public final val isPreProdRelease: Boolean
      public final get() {
         val var1: Boolean;
         if (!q.c(this.getReleaseChannel(), "canaryRelease") && !q.c(this.getReleaseChannel(), "betaRelease")) {
            var1 = false;
         } else {
            var1 = true;
         }

         return var1;
      }


   public const val PROGUARD_UUID: String = "06de61b6-c9f8-4075-aea3-68e5fe60053f"

   @JvmStatic
   fun `isProdBuild_delegate$lambda$1`(): Boolean {
      val var2: Boolean = INSTANCE.isDebugBuild();
      var var0: Boolean = false;
      if (!var2) {
         var var3: java.lang.String = flavor;
         if (flavor == null) {
            q.y("flavor");
            var3 = null;
         }

         var0 = false;
         if (!h.N(var3, "beta", false, 2, null)) {
            var3 = flavor;
            if (flavor == null) {
               q.y("flavor");
               var3 = null;
            }

            var0 = false;
            if (!h.N(var3, "canary", false, 2, null)) {
               var0 = true;
            }
         }
      }

      return var0;
   }

   public fun init(context: Context, versionName: String, versionCode: Int, flavor: String, buildType: String, otaManifest: String, otaVersion: String) {
      q.h(var1, "context");
      q.h(var2, "versionName");
      q.h(var4, "flavor");
      q.h(var5, "buildType");
      q.h(var6, "otaManifest");
      q.h(var7, "otaVersion");
      this.setVersionName(var2);
      this.setVersionCode(java.lang.String.valueOf(var3));
      this.setOtaManifestETag(var6);
      this.setOtaVersion(var7);
      flavor = var4;
      buildType = var5;
      this.setPackageName(var1.getPackageName());
      val var9: ClientUserAgent = ClientUserAgent.INSTANCE;
      val var8: StringBuilder = new StringBuilder();
      var8.append("Discord-Android/");
      var8.append(var3);
      var8.append(";RNA");
      var9.init(var1, var8.toString());
   }
}

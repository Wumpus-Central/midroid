package com.discord.client_info

import android.content.Context
import gh.l
import java.util.Locale
import kotlin.jvm.internal.q

public object ClientInfo {
   public const val PROGUARD_UUID: String = "c273a9ba-e820-48ae-9a6e-dadeabef08a7"
   public const val SENTRY_ALPHA_BETA_DSN: String = "https://9a42ef460144a03b30c8b2d5321cfe11@o64374.ingest.sentry.io/5992375"
   public const val SENTRY_DSN: String = "https://70545531dfe34835bf4dd0996821e8b6@o64374.ingest.sentry.io/5992375"
   public const val SENTRY_RELEASE: String = "discord_android@246.23.0-0+246023"
   public const val SENTRY_STAFF_DSN: String = "https://90509cba01573ee4e14a2f5e15aee5ca@o64374.ingest.sentry.io/5992375"
   private final lateinit var buildType: String
   private final lateinit var flavor: String

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


   public final val isProdBuild: Boolean by l.b(<unrepresentable>.INSTANCE)
      public final get() {
         return isProdBuild$delegate.getValue() as java.lang.Boolean;
      }


   public final lateinit var otaManifestETag: String
      internal set

   public final lateinit var otaVersion: String
      internal set

   public final lateinit var packageName: String
      internal set

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


   public final lateinit var versionCode: String
      internal set

   public final lateinit var versionName: String
      internal set

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
      var2 = var1.getPackageName();
      q.g(var2, "getPackageName(...)");
      this.setPackageName(var2);
      val var10: ClientUserAgent = ClientUserAgent.INSTANCE;
      val var9: StringBuilder = new StringBuilder();
      var9.append("Discord-Android/");
      var9.append(var3);
      var9.append(";RNA");
      var10.init(var1, var9.toString());
   }
}

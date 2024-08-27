package com.discord.client_info

import android.content.Context
import eh.l
import java.util.Locale
import kotlin.jvm.internal.r

public object ClientInfo {
   public const val PROGUARD_UUID: String = "bf67b3a9-ec0d-4591-91e6-48559cdaf529"
   public const val SENTRY_ALPHA_BETA_DSN: String = "https://9a42ef460144a03b30c8b2d5321cfe11@o64374.ingest.sentry.io/5992375"
   public const val SENTRY_DSN: String = "https://70545531dfe34835bf4dd0996821e8b6@o64374.ingest.sentry.io/5992375"
   public const val SENTRY_RELEASE: String = "discord_android@244.13.0-0+244013"
   public const val SENTRY_STAFF_DSN: String = "https://90509cba01573ee4e14a2f5e15aee5ca@o64374.ingest.sentry.io/5992375"
   private final lateinit var buildType: String
   private final lateinit var flavor: String

   public final val isDebugBuild: Boolean
      public final get() {
         var var1: java.lang.String = buildType;
         if (buildType == null) {
            r.y("buildType");
            var1 = null;
         }

         return r.c(var1, "debug");
      }


   public final val isDeveloperBuild: Boolean
      public final get() {
         var var1: java.lang.String = flavor;
         if (flavor == null) {
            r.y("flavor");
            var1 = null;
         }

         return r.c(var1, "developer");
      }


   public final val isPreProdRelease: Boolean
      public final get() {
         val var1: Boolean;
         if (!r.c(this.getReleaseChannel(), "canaryRelease") && !r.c(this.getReleaseChannel(), "betaRelease")) {
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
         var var2: java.lang.String = null;
         var var3: java.lang.String = flavor;
         if (flavor == null) {
            r.y("flavor");
            var3 = null;
         }

         if (buildType == null) {
            r.y("buildType");
         } else {
            var2 = buildType;
         }

         val var1: Boolean;
         if (var2.length() > 0) {
            var1 = true;
         } else {
            var1 = false;
         }

         var var9: java.lang.String = var2;
         if (var1) {
            val var10: StringBuilder = new StringBuilder();
            var var5: java.lang.String = java.lang.String.valueOf(var2.charAt(0));
            r.f(var5, "null cannot be cast to non-null type java.lang.String");
            var5 = var5.toUpperCase(Locale.ROOT);
            r.g(var5, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            var10.append((Object)var5);
            var2 = var2.substring(1);
            r.g(var2, "this as java.lang.String).substring(startIndex)");
            var10.append(var2);
            var9 = var10.toString();
         }

         val var7: StringBuilder = new StringBuilder();
         var7.append(var3);
         var7.append(var9);
         return var7.toString();
      }


   public final lateinit var versionCode: String
      internal set

   public final lateinit var versionName: String
      internal set

   public fun init(context: Context, versionName: String, versionCode: Int, flavor: String, buildType: String, otaManifest: String, otaVersion: String) {
      r.h(var1, "context");
      r.h(var2, "versionName");
      r.h(var4, "flavor");
      r.h(var5, "buildType");
      r.h(var6, "otaManifest");
      r.h(var7, "otaVersion");
      this.setVersionName(var2);
      this.setVersionCode(java.lang.String.valueOf(var3));
      this.setOtaManifestETag(var6);
      this.setOtaVersion(var7);
      flavor = var4;
      buildType = var5;
      var2 = var1.getPackageName();
      r.g(var2, "context.packageName");
      this.setPackageName(var2);
      val var9: ClientUserAgent = ClientUserAgent.INSTANCE;
      val var10: StringBuilder = new StringBuilder();
      var10.append("Discord-Android/");
      var10.append(var3);
      var10.append(";RNA");
      var9.init(var1, var10.toString());
   }
}

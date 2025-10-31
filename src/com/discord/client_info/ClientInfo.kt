package com.discord.client_info

import android.content.Context
import fm.l
import java.util.Locale
import kotlin.jvm.internal.Intrinsics
import kotlin.jvm.internal.SourceDebugExtension

@SourceDebugExtension(["SMAP\nClientInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClientInfo.kt\ncom/discord/client_info/ClientInfo\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,64:1\n1#2:65\n*E\n"])
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
            Intrinsics.throwUninitializedPropertyAccessException("flavor");
            var2 = null;
         }

         if (buildType == null) {
            Intrinsics.throwUninitializedPropertyAccessException("buildType");
         } else {
            var1 = buildType;
         }

         var var8: java.lang.String = var1;
         if (var1.length() > 0) {
            val var9: StringBuilder = new StringBuilder();
            var var4: java.lang.String = java.lang.String.valueOf(var1.charAt(0));
            var4 = var4.toUpperCase(Locale.ROOT);
            var9.append((Object)var4);
            var1 = var1.substring(1);
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
   public const val SENTRY_RELEASE: String = "discord_android@304.2.0-2+304202"

   public final val isDebugBuild: Boolean
      public final get() {
         var var1: java.lang.String = buildType;
         if (buildType == null) {
            Intrinsics.throwUninitializedPropertyAccessException("buildType");
            var1 = null;
         }

         return var1 == "debug";
      }


   public final val isDeveloperBuild: Boolean
      public final get() {
         var var1: java.lang.String = flavor;
         if (flavor == null) {
            Intrinsics.throwUninitializedPropertyAccessException("flavor");
            var1 = null;
         }

         return var1 == "developer";
      }


   public final val isProdBuild: Boolean by l.b(new a())
      public final get() {
         return isProdBuild$delegate.getValue() as java.lang.Boolean;
      }


   public final val isPreProdRelease: Boolean
      public final get() {
         return this.getReleaseChannel() == "canaryRelease" || this.getReleaseChannel() == "betaRelease";
      }


   public const val PROGUARD_UUID: String = "d33dde13-eaa9-44b1-82fa-07318fb86787"

   @JvmStatic
   fun `isProdBuild_delegate$lambda$1`(): Boolean {
      if (!INSTANCE.isDebugBuild()) {
         var var0: java.lang.String = flavor;
         if (flavor == null) {
            Intrinsics.throwUninitializedPropertyAccessException("flavor");
            var0 = null;
         }

         if (!StringsKt.N(var0, "beta", false, 2, null)) {
            var0 = flavor;
            if (flavor == null) {
               Intrinsics.throwUninitializedPropertyAccessException("flavor");
               var0 = null;
            }

            if (!StringsKt.N(var0, "canary", false, 2, null)) {
               return true;
            }
         }
      }

      return false;
   }

   public fun init(context: Context, versionName: String, versionCode: Int, flavor: String, buildType: String, otaManifest: String, otaVersion: String) {
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

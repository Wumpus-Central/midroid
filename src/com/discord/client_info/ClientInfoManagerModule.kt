package com.discord.client_info

import com.discord.codegen.NativeClientInfoManagerSpec
import com.facebook.react.bridge.ReactApplicationContext
import gh.w
import hh.r
import kotlin.jvm.internal.q

public class ClientInfoManagerModule(reactContext: ReactApplicationContext) : NativeClientInfoManagerSpec {
   init {
      q.h(var1, "reactContext");
      super(var1);
   }

   public override fun getName(): String {
      return "RTNClientInfoManager";
   }

   protected override fun getTypedExportedConstants(): MutableMap<String, Any> {
      val var1: ClientInfo = ClientInfo.INSTANCE;
      val var2: Pair = w.a("Identifier", ClientInfo.INSTANCE.getPackageName());
      val var8: Pair = w.a("Version", var1.getVersionName());
      val var7: Pair = w.a("Build", var1.getVersionCode());
      val var3: Pair = w.a("Manifest", var1.getOtaManifestETag());
      val var4: Pair = w.a("OTABuild", var1.getOtaVersion());
      val var5: ClientInfoCache = ClientInfoCache.INSTANCE;
      val var6: ReactApplicationContext = this.getReactApplicationContext();
      q.g(var6, "getReactApplicationContext(...)");
      return r.m(
         new Pair[]{
            var2,
            var8,
            var7,
            var3,
            var4,
            w.a("DeviceVendorID", var5.getDeviceVendorId(var6)),
            w.a("ReleaseChannel", var1.getReleaseChannel()),
            w.a("SentryDsn", "https://70545531dfe34835bf4dd0996821e8b6@o64374.ingest.sentry.io/5992375"),
            w.a("SentryStaffDsn", "https://90509cba01573ee4e14a2f5e15aee5ca@o64374.ingest.sentry.io/5992375"),
            w.a("SentryAlphaBetaDsn", "https://9a42ef460144a03b30c8b2d5321cfe11@o64374.ingest.sentry.io/5992375")
         }
      );
   }

   public companion object {
      public const val NAME: String
   }
}

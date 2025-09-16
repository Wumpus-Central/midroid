package com.discord.client_info

import A9.s
import com.discord.codegen.NativeClientInfoModuleSpec
import com.facebook.react.bridge.ReactApplicationContext

public class ClientInfoModule(reactContext: ReactApplicationContext) : NativeClientInfoModuleSpec(var1) {
   protected override fun getTypedExportedConstants(): MutableMap<String, Any> {
      val var5: ClientInfo = ClientInfo.INSTANCE;
      val var2: Pair = s.a("Identifier", ClientInfo.INSTANCE.getPackageName());
      val var1: Pair = s.a("Version", var5.getVersionName());
      val var3: Pair = s.a("Build", var5.getVersionCode());
      val var8: Pair = s.a("Manifest", var5.getOtaManifestETag());
      val var7: Pair = s.a("OTABuild", var5.getOtaVersion());
      val var4: ClientInfoCache = ClientInfoCache.INSTANCE;
      val var6: ReactApplicationContext = this.getReactApplicationContext();
      return L.m(
         new Pair[]{
            var2,
            var1,
            var3,
            var8,
            var7,
            s.a("DeviceVendorID", var4.getDeviceVendorId(var6)),
            s.a("ReleaseChannel", var5.getReleaseChannel()),
            s.a("SentryDsn", "https://70545531dfe34835bf4dd0996821e8b6@o64374.ingest.sentry.io/5992375"),
            s.a("SentryStaffDsn", "https://90509cba01573ee4e14a2f5e15aee5ca@o64374.ingest.sentry.io/5992375"),
            s.a("SentryAlphaBetaDsn", "https://9a42ef460144a03b30c8b2d5321cfe11@o64374.ingest.sentry.io/5992375")
         }
      );
   }
}

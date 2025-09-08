package com.discord.client_info

import A9.s
import com.discord.codegen.NativeClientInfoModuleSpec
import com.facebook.react.bridge.ReactApplicationContext

public class ClientInfoModule(reactContext: ReactApplicationContext) : NativeClientInfoModuleSpec(var1) {
   protected override fun getTypedExportedConstants(): MutableMap<String, Any> {
      val var2: ClientInfo = ClientInfo.INSTANCE;
      val var3: Pair = s.a("Identifier", ClientInfo.INSTANCE.getPackageName());
      val var4: Pair = s.a("Version", var2.getVersionName());
      val var1: Pair = s.a("Build", var2.getVersionCode());
      val var6: Pair = s.a("Manifest", var2.getOtaManifestETag());
      val var8: Pair = s.a("OTABuild", var2.getOtaVersion());
      val var5: ClientInfoCache = ClientInfoCache.INSTANCE;
      val var7: ReactApplicationContext = this.getReactApplicationContext();
      return L.m(
         new Pair[]{
            var3,
            var4,
            var1,
            var6,
            var8,
            s.a("DeviceVendorID", var5.getDeviceVendorId(var7)),
            s.a("ReleaseChannel", var2.getReleaseChannel()),
            s.a("SentryDsn", "https://70545531dfe34835bf4dd0996821e8b6@o64374.ingest.sentry.io/5992375"),
            s.a("SentryStaffDsn", "https://90509cba01573ee4e14a2f5e15aee5ca@o64374.ingest.sentry.io/5992375"),
            s.a("SentryAlphaBetaDsn", "https://9a42ef460144a03b30c8b2d5321cfe11@o64374.ingest.sentry.io/5992375")
         }
      );
   }
}

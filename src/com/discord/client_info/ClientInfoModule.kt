package com.discord.client_info

import B9.s
import com.discord.codegen.NativeClientInfoModuleSpec
import com.facebook.react.bridge.ReactApplicationContext

public class ClientInfoModule(reactContext: ReactApplicationContext) : NativeClientInfoModuleSpec(var1) {
   protected override fun getTypedExportedConstants(): MutableMap<String, Any> {
      val var1: ClientInfo = ClientInfo.INSTANCE;
      val var2: Pair = s.a("Identifier", ClientInfo.INSTANCE.getPackageName());
      val var6: Pair = s.a("Version", var1.getVersionName());
      val var5: Pair = s.a("Build", var1.getVersionCode());
      val var7: Pair = s.a("Manifest", var1.getOtaManifestETag());
      val var4: Pair = s.a("OTABuild", var1.getOtaVersion());
      val var3: ClientInfoCache = ClientInfoCache.INSTANCE;
      val var8: ReactApplicationContext = this.getReactApplicationContext();
      return L.m(
         new Pair[]{
            var2,
            var6,
            var5,
            var7,
            var4,
            s.a("DeviceVendorID", var3.getDeviceVendorId(var8)),
            s.a("ReleaseChannel", var1.getReleaseChannel()),
            s.a("SentryDsn", "https://70545531dfe34835bf4dd0996821e8b6@o64374.ingest.sentry.io/5992375"),
            s.a("SentryStaffDsn", "https://90509cba01573ee4e14a2f5e15aee5ca@o64374.ingest.sentry.io/5992375"),
            s.a("SentryAlphaBetaDsn", "https://9a42ef460144a03b30c8b2d5321cfe11@o64374.ingest.sentry.io/5992375")
         }
      );
   }
}

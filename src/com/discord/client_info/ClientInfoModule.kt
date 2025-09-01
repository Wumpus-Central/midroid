package com.discord.client_info

import B9.s
import com.discord.codegen.NativeClientInfoModuleSpec
import com.facebook.react.bridge.ReactApplicationContext

public class ClientInfoModule(reactContext: ReactApplicationContext) : NativeClientInfoModuleSpec(var1) {
   protected override fun getTypedExportedConstants(): MutableMap<String, Any> {
      val var4: ClientInfo = ClientInfo.INSTANCE;
      val var6: Pair = s.a("Identifier", ClientInfo.INSTANCE.getPackageName());
      val var1: Pair = s.a("Version", var4.getVersionName());
      val var7: Pair = s.a("Build", var4.getVersionCode());
      val var2: Pair = s.a("Manifest", var4.getOtaManifestETag());
      val var3: Pair = s.a("OTABuild", var4.getOtaVersion());
      val var8: ClientInfoCache = ClientInfoCache.INSTANCE;
      val var5: ReactApplicationContext = this.getReactApplicationContext();
      return L.m(
         new Pair[]{
            var6,
            var1,
            var7,
            var2,
            var3,
            s.a("DeviceVendorID", var8.getDeviceVendorId(var5)),
            s.a("ReleaseChannel", var4.getReleaseChannel()),
            s.a("SentryDsn", "https://70545531dfe34835bf4dd0996821e8b6@o64374.ingest.sentry.io/5992375"),
            s.a("SentryStaffDsn", "https://90509cba01573ee4e14a2f5e15aee5ca@o64374.ingest.sentry.io/5992375"),
            s.a("SentryAlphaBetaDsn", "https://9a42ef460144a03b30c8b2d5321cfe11@o64374.ingest.sentry.io/5992375")
         }
      );
   }
}

package com.discord.client_info

import com.discord.codegen.NativeClientInfoModuleSpec
import com.facebook.react.bridge.ReactApplicationContext
import xa.v

public class ClientInfoModule(reactContext: ReactApplicationContext) : NativeClientInfoModuleSpec(var1) {
   protected override fun getTypedExportedConstants(): MutableMap<String, Any> {
      val var5: ClientInfo = ClientInfo.INSTANCE;
      val var4: Pair = v.a("Identifier", ClientInfo.INSTANCE.getPackageName());
      val var1: Pair = v.a("Version", var5.getVersionName());
      val var8: Pair = v.a("Build", var5.getVersionCode());
      val var7: Pair = v.a("Manifest", var5.getOtaManifestETag());
      val var6: Pair = v.a("OTABuild", var5.getOtaVersion());
      val var2: ClientInfoCache = ClientInfoCache.INSTANCE;
      val var3: ReactApplicationContext = this.getReactApplicationContext();
      return O.n(
         new Pair[]{
            var4,
            var1,
            var8,
            var7,
            var6,
            v.a("DeviceVendorID", var2.getDeviceVendorId(var3)),
            v.a("ReleaseChannel", var5.getReleaseChannel()),
            v.a("SentryDsn", "https://70545531dfe34835bf4dd0996821e8b6@o64374.ingest.sentry.io/5992375"),
            v.a("SentryStaffDsn", "https://90509cba01573ee4e14a2f5e15aee5ca@o64374.ingest.sentry.io/5992375"),
            v.a("SentryAlphaBetaDsn", "https://9a42ef460144a03b30c8b2d5321cfe11@o64374.ingest.sentry.io/5992375")
         }
      );
   }
}

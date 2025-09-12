package com.discord.client_info

import Ca.v
import com.discord.codegen.NativeClientInfoModuleSpec
import com.facebook.react.bridge.ReactApplicationContext

public class ClientInfoModule(reactContext: ReactApplicationContext) : NativeClientInfoModuleSpec(var1) {
   protected override fun getTypedExportedConstants(): MutableMap<String, Any> {
      val var1: ClientInfo = ClientInfo.INSTANCE;
      val var5: Pair = v.a("Identifier", ClientInfo.INSTANCE.getPackageName());
      val var2: Pair = v.a("Version", var1.getVersionName());
      val var4: Pair = v.a("Build", var1.getVersionCode());
      val var3: Pair = v.a("Manifest", var1.getOtaManifestETag());
      val var6: Pair = v.a("OTABuild", var1.getOtaVersion());
      val var7: ClientInfoCache = ClientInfoCache.INSTANCE;
      val var8: ReactApplicationContext = this.getReactApplicationContext();
      return O.n(
         new Pair[]{
            var5,
            var2,
            var4,
            var3,
            var6,
            v.a("DeviceVendorID", var7.getDeviceVendorId(var8)),
            v.a("ReleaseChannel", var1.getReleaseChannel()),
            v.a("SentryDsn", "https://70545531dfe34835bf4dd0996821e8b6@o64374.ingest.sentry.io/5992375"),
            v.a("SentryStaffDsn", "https://90509cba01573ee4e14a2f5e15aee5ca@o64374.ingest.sentry.io/5992375"),
            v.a("SentryAlphaBetaDsn", "https://9a42ef460144a03b30c8b2d5321cfe11@o64374.ingest.sentry.io/5992375")
         }
      );
   }
}

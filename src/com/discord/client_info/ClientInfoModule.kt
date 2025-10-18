package com.discord.client_info

import Da.v
import com.discord.codegen.NativeClientInfoModuleSpec
import com.facebook.react.bridge.ReactApplicationContext

public class ClientInfoModule(reactContext: ReactApplicationContext) : NativeClientInfoModuleSpec(var1) {
   protected override fun getTypedExportedConstants(): MutableMap<String, Any> {
      val var6: ClientInfo = ClientInfo.INSTANCE;
      val var2: Pair = v.a("Identifier", ClientInfo.INSTANCE.getPackageName());
      val var7: Pair = v.a("Version", var6.getVersionName());
      val var8: Pair = v.a("Build", var6.getVersionCode());
      val var3: Pair = v.a("Manifest", var6.getOtaManifestETag());
      val var5: Pair = v.a("OTABuild", var6.getOtaVersion());
      val var4: ClientInfoCache = ClientInfoCache.INSTANCE;
      val var1: ReactApplicationContext = this.getReactApplicationContext();
      return O.n(
         new Pair[]{
            var2,
            var7,
            var8,
            var3,
            var5,
            v.a("DeviceVendorID", var4.getDeviceVendorId(var1)),
            v.a("ReleaseChannel", var6.getReleaseChannel()),
            v.a("SentryDsn", "https://70545531dfe34835bf4dd0996821e8b6@o64374.ingest.sentry.io/5992375"),
            v.a("SentryStaffDsn", "https://90509cba01573ee4e14a2f5e15aee5ca@o64374.ingest.sentry.io/5992375"),
            v.a("SentryAlphaBetaDsn", "https://9a42ef460144a03b30c8b2d5321cfe11@o64374.ingest.sentry.io/5992375")
         }
      );
   }
}

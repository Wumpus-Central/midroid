package com.discord.client_info

import com.discord.codegen.NativeClientInfoModuleSpec
import com.facebook.react.bridge.ReactApplicationContext
import ht.v

public class ClientInfoModule(reactContext: ReactApplicationContext) : NativeClientInfoModuleSpec(var1) {
   protected override fun getTypedExportedConstants(): MutableMap<String, Any> {
      val var3: ClientInfo = ClientInfo.INSTANCE;
      val var5: Pair = v.a("Identifier", ClientInfo.INSTANCE.getPackageName());
      val var1: Pair = v.a("Version", var3.getVersionName());
      val var6: Pair = v.a("Build", var3.getVersionCode());
      val var2: Pair = v.a("Manifest", var3.getOtaManifestETag());
      val var7: Pair = v.a("OTABuild", var3.getOtaVersion());
      val var4: ClientInfoCache = ClientInfoCache.INSTANCE;
      val var8: ReactApplicationContext = this.getReactApplicationContext();
      return s0.n(
         new Pair[]{
            var5,
            var1,
            var6,
            var2,
            var7,
            v.a("DeviceVendorID", var4.getDeviceVendorId(var8)),
            v.a("ReleaseChannel", var3.getReleaseChannel()),
            v.a("SentryDsn", "https://70545531dfe34835bf4dd0996821e8b6@o64374.ingest.sentry.io/5992375"),
            v.a("SentryStaffDsn", "https://90509cba01573ee4e14a2f5e15aee5ca@o64374.ingest.sentry.io/5992375"),
            v.a("SentryAlphaBetaDsn", "https://9a42ef460144a03b30c8b2d5321cfe11@o64374.ingest.sentry.io/5992375")
         }
      );
   }
}

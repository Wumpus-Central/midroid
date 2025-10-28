package com.discord.client_info

import Ja.v
import com.discord.codegen.NativeClientInfoModuleSpec
import com.facebook.react.bridge.ReactApplicationContext

public class ClientInfoModule(reactContext: ReactApplicationContext) : NativeClientInfoModuleSpec(var1) {
   protected override fun getTypedExportedConstants(): MutableMap<String, Any> {
      val var2: ClientInfo = ClientInfo.INSTANCE;
      val var4: Pair = v.a("Identifier", ClientInfo.INSTANCE.getPackageName());
      val var1: Pair = v.a("Version", var2.getVersionName());
      val var6: Pair = v.a("Build", var2.getVersionCode());
      val var5: Pair = v.a("Manifest", var2.getOtaManifestETag());
      val var3: Pair = v.a("OTABuild", var2.getOtaVersion());
      val var8: ClientInfoCache = ClientInfoCache.INSTANCE;
      val var7: ReactApplicationContext = this.getReactApplicationContext();
      return O.n(
         new Pair[]{
            var4,
            var1,
            var6,
            var5,
            var3,
            v.a("DeviceVendorID", var8.getDeviceVendorId(var7)),
            v.a("ReleaseChannel", var2.getReleaseChannel()),
            v.a("SentryDsn", "https://70545531dfe34835bf4dd0996821e8b6@o64374.ingest.sentry.io/5992375"),
            v.a("SentryStaffDsn", "https://90509cba01573ee4e14a2f5e15aee5ca@o64374.ingest.sentry.io/5992375"),
            v.a("SentryAlphaBetaDsn", "https://9a42ef460144a03b30c8b2d5321cfe11@o64374.ingest.sentry.io/5992375")
         }
      );
   }
}

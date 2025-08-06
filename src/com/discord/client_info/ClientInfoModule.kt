package com.discord.client_info

import B9.s
import C9.q
import com.discord.codegen.NativeClientInfoModuleSpec
import com.facebook.react.bridge.ReactApplicationContext
import kotlin.jvm.internal.r

public class ClientInfoModule(reactContext: ReactApplicationContext) : NativeClientInfoModuleSpec {
   init {
      r.h(var1, "reactContext");
      super(var1);
   }

   protected override fun getTypedExportedConstants(): MutableMap<String, Any> {
      val var5: ClientInfo = ClientInfo.INSTANCE;
      val var6: Pair = s.a("Identifier", ClientInfo.INSTANCE.getPackageName());
      val var3: Pair = s.a("Version", var5.getVersionName());
      val var7: Pair = s.a("Build", var5.getVersionCode());
      val var8: Pair = s.a("Manifest", var5.getOtaManifestETag());
      val var4: Pair = s.a("OTABuild", var5.getOtaVersion());
      val var2: ClientInfoCache = ClientInfoCache.INSTANCE;
      val var1: ReactApplicationContext = this.getReactApplicationContext();
      r.g(var1, "getReactApplicationContext(...)");
      return q.m(
         new Pair[]{
            var6,
            var3,
            var7,
            var8,
            var4,
            s.a("DeviceVendorID", var2.getDeviceVendorId(var1)),
            s.a("ReleaseChannel", var5.getReleaseChannel()),
            s.a("SentryDsn", "https://70545531dfe34835bf4dd0996821e8b6@o64374.ingest.sentry.io/5992375"),
            s.a("SentryStaffDsn", "https://90509cba01573ee4e14a2f5e15aee5ca@o64374.ingest.sentry.io/5992375"),
            s.a("SentryAlphaBetaDsn", "https://9a42ef460144a03b30c8b2d5321cfe11@o64374.ingest.sentry.io/5992375")
         }
      );
   }
}

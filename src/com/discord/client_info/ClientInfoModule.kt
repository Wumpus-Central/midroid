package com.discord.client_info

import A9.q
import com.discord.codegen.NativeClientInfoModuleSpec
import com.facebook.react.bridge.ReactApplicationContext
import kotlin.jvm.internal.r
import z9.s

public class ClientInfoModule(reactContext: ReactApplicationContext) : NativeClientInfoModuleSpec {
   init {
      r.h(var1, "reactContext");
      super(var1);
   }

   protected override fun getTypedExportedConstants(): MutableMap<String, Any> {
      val var6: ClientInfo = ClientInfo.INSTANCE;
      val var1: Pair = s.a("Identifier", ClientInfo.INSTANCE.getPackageName());
      val var4: Pair = s.a("Version", var6.getVersionName());
      val var5: Pair = s.a("Build", var6.getVersionCode());
      val var8: Pair = s.a("Manifest", var6.getOtaManifestETag());
      val var2: Pair = s.a("OTABuild", var6.getOtaVersion());
      val var7: ClientInfoCache = ClientInfoCache.INSTANCE;
      val var3: ReactApplicationContext = this.getReactApplicationContext();
      r.g(var3, "getReactApplicationContext(...)");
      return q.m(
         new Pair[]{
            var1,
            var4,
            var5,
            var8,
            var2,
            s.a("DeviceVendorID", var7.getDeviceVendorId(var3)),
            s.a("ReleaseChannel", var6.getReleaseChannel()),
            s.a("SentryDsn", "https://70545531dfe34835bf4dd0996821e8b6@o64374.ingest.sentry.io/5992375"),
            s.a("SentryStaffDsn", "https://90509cba01573ee4e14a2f5e15aee5ca@o64374.ingest.sentry.io/5992375"),
            s.a("SentryAlphaBetaDsn", "https://9a42ef460144a03b30c8b2d5321cfe11@o64374.ingest.sentry.io/5992375")
         }
      );
   }
}

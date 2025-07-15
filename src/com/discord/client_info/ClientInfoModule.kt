package com.discord.client_info

import com.discord.codegen.NativeClientInfoModuleSpec
import com.facebook.react.bridge.ReactApplicationContext
import kotlin.jvm.internal.r
import r9.s
import s9.q

public class ClientInfoModule(reactContext: ReactApplicationContext) : NativeClientInfoModuleSpec {
   init {
      r.h(var1, "reactContext");
      super(var1);
   }

   protected override fun getTypedExportedConstants(): MutableMap<String, Any> {
      val var8: ClientInfo = ClientInfo.INSTANCE;
      val var3: Pair = s.a("Identifier", ClientInfo.INSTANCE.getPackageName());
      val var4: Pair = s.a("Version", var8.getVersionName());
      val var1: Pair = s.a("Build", var8.getVersionCode());
      val var5: Pair = s.a("Manifest", var8.getOtaManifestETag());
      val var2: Pair = s.a("OTABuild", var8.getOtaVersion());
      val var6: ClientInfoCache = ClientInfoCache.INSTANCE;
      val var7: ReactApplicationContext = this.getReactApplicationContext();
      r.g(var7, "getReactApplicationContext(...)");
      return q.m(
         new Pair[]{
            var3,
            var4,
            var1,
            var5,
            var2,
            s.a("DeviceVendorID", var6.getDeviceVendorId(var7)),
            s.a("ReleaseChannel", var8.getReleaseChannel()),
            s.a("SentryDsn", "https://70545531dfe34835bf4dd0996821e8b6@o64374.ingest.sentry.io/5992375"),
            s.a("SentryStaffDsn", "https://90509cba01573ee4e14a2f5e15aee5ca@o64374.ingest.sentry.io/5992375"),
            s.a("SentryAlphaBetaDsn", "https://9a42ef460144a03b30c8b2d5321cfe11@o64374.ingest.sentry.io/5992375")
         }
      );
   }
}

package com.discord.client_info

import A9.s
import B9.q
import com.discord.codegen.NativeClientInfoModuleSpec
import com.facebook.react.bridge.ReactApplicationContext
import kotlin.jvm.internal.r

public class ClientInfoModule(reactContext: ReactApplicationContext) : NativeClientInfoModuleSpec {
   init {
      r.h(var1, "reactContext");
      super(var1);
   }

   protected override fun getTypedExportedConstants(): MutableMap<String, Any> {
      val var3: ClientInfo = ClientInfo.INSTANCE;
      val var1: Pair = s.a("Identifier", ClientInfo.INSTANCE.getPackageName());
      val var7: Pair = s.a("Version", var3.getVersionName());
      val var4: Pair = s.a("Build", var3.getVersionCode());
      val var2: Pair = s.a("Manifest", var3.getOtaManifestETag());
      val var8: Pair = s.a("OTABuild", var3.getOtaVersion());
      val var6: ClientInfoCache = ClientInfoCache.INSTANCE;
      val var5: ReactApplicationContext = this.getReactApplicationContext();
      r.g(var5, "getReactApplicationContext(...)");
      return q.m(
         new Pair[]{
            var1,
            var7,
            var4,
            var2,
            var8,
            s.a("DeviceVendorID", var6.getDeviceVendorId(var5)),
            s.a("ReleaseChannel", var3.getReleaseChannel()),
            s.a("SentryDsn", "https://70545531dfe34835bf4dd0996821e8b6@o64374.ingest.sentry.io/5992375"),
            s.a("SentryStaffDsn", "https://90509cba01573ee4e14a2f5e15aee5ca@o64374.ingest.sentry.io/5992375"),
            s.a("SentryAlphaBetaDsn", "https://9a42ef460144a03b30c8b2d5321cfe11@o64374.ingest.sentry.io/5992375")
         }
      );
   }
}

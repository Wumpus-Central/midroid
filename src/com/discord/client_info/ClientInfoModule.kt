package com.discord.client_info

import com.discord.codegen.NativeClientInfoModuleSpec
import com.facebook.react.bridge.ReactApplicationContext
import kotlin.jvm.internal.q
import r9.s

public class ClientInfoModule(reactContext: ReactApplicationContext) : NativeClientInfoModuleSpec {
   init {
      q.h(var1, "reactContext");
      super(var1);
   }

   protected override fun getTypedExportedConstants(): MutableMap<String, Any> {
      val var2: ClientInfo = ClientInfo.INSTANCE;
      val var4: Pair = s.a("Identifier", ClientInfo.INSTANCE.getPackageName());
      val var5: Pair = s.a("Version", var2.getVersionName());
      val var6: Pair = s.a("Build", var2.getVersionCode());
      val var3: Pair = s.a("Manifest", var2.getOtaManifestETag());
      val var7: Pair = s.a("OTABuild", var2.getOtaVersion());
      val var1: ClientInfoCache = ClientInfoCache.INSTANCE;
      val var8: ReactApplicationContext = this.getReactApplicationContext();
      q.g(var8, "getReactApplicationContext(...)");
      return s9.q.m(
         new Pair[]{
            var4,
            var5,
            var6,
            var3,
            var7,
            s.a("DeviceVendorID", var1.getDeviceVendorId(var8)),
            s.a("ReleaseChannel", var2.getReleaseChannel()),
            s.a("SentryDsn", "https://70545531dfe34835bf4dd0996821e8b6@o64374.ingest.sentry.io/5992375"),
            s.a("SentryStaffDsn", "https://90509cba01573ee4e14a2f5e15aee5ca@o64374.ingest.sentry.io/5992375"),
            s.a("SentryAlphaBetaDsn", "https://9a42ef460144a03b30c8b2d5321cfe11@o64374.ingest.sentry.io/5992375")
         }
      );
   }
}

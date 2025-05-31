package com.discord.client_info

import R8.s
import com.discord.codegen.NativeClientInfoModuleSpec
import com.facebook.react.bridge.ReactApplicationContext
import kotlin.jvm.internal.q

public class ClientInfoModule(reactContext: ReactApplicationContext) : NativeClientInfoModuleSpec {
   init {
      q.h(var1, "reactContext");
      super(var1);
   }

   protected override fun getTypedExportedConstants(): MutableMap<String, Any> {
      val var5: ClientInfo = ClientInfo.INSTANCE;
      val var8: Pair = s.a("Identifier", ClientInfo.INSTANCE.getPackageName());
      val var2: Pair = s.a("Version", var5.getVersionName());
      val var6: Pair = s.a("Build", var5.getVersionCode());
      val var7: Pair = s.a("Manifest", var5.getOtaManifestETag());
      val var4: Pair = s.a("OTABuild", var5.getOtaVersion());
      val var1: ClientInfoCache = ClientInfoCache.INSTANCE;
      val var3: ReactApplicationContext = this.getReactApplicationContext();
      q.g(var3, "getReactApplicationContext(...)");
      return S8.q.m(
         new Pair[]{
            var8,
            var2,
            var6,
            var7,
            var4,
            s.a("DeviceVendorID", var1.getDeviceVendorId(var3)),
            s.a("ReleaseChannel", var5.getReleaseChannel()),
            s.a("SentryDsn", "https://70545531dfe34835bf4dd0996821e8b6@o64374.ingest.sentry.io/5992375"),
            s.a("SentryStaffDsn", "https://90509cba01573ee4e14a2f5e15aee5ca@o64374.ingest.sentry.io/5992375"),
            s.a("SentryAlphaBetaDsn", "https://9a42ef460144a03b30c8b2d5321cfe11@o64374.ingest.sentry.io/5992375")
         }
      );
   }
}

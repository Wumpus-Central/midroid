package com.discord.client_info

import com.discord.codegen.NativeClientInfoModuleSpec
import com.facebook.react.bridge.ReactApplicationContext
import kotlin.jvm.internal.q
import t9.s

public class ClientInfoModule(reactContext: ReactApplicationContext) : NativeClientInfoModuleSpec {
   init {
      q.h(var1, "reactContext");
      super(var1);
   }

   protected override fun getTypedExportedConstants(): MutableMap<String, Any> {
      val var4: ClientInfo = ClientInfo.INSTANCE;
      val var8: Pair = s.a("Identifier", ClientInfo.INSTANCE.getPackageName());
      val var6: Pair = s.a("Version", var4.getVersionName());
      val var1: Pair = s.a("Build", var4.getVersionCode());
      val var2: Pair = s.a("Manifest", var4.getOtaManifestETag());
      val var7: Pair = s.a("OTABuild", var4.getOtaVersion());
      val var5: ClientInfoCache = ClientInfoCache.INSTANCE;
      val var3: ReactApplicationContext = this.getReactApplicationContext();
      q.g(var3, "getReactApplicationContext(...)");
      return u9.q.m(
         new Pair[]{
            var8,
            var6,
            var1,
            var2,
            var7,
            s.a("DeviceVendorID", var5.getDeviceVendorId(var3)),
            s.a("ReleaseChannel", var4.getReleaseChannel()),
            s.a("SentryDsn", "https://70545531dfe34835bf4dd0996821e8b6@o64374.ingest.sentry.io/5992375"),
            s.a("SentryStaffDsn", "https://90509cba01573ee4e14a2f5e15aee5ca@o64374.ingest.sentry.io/5992375"),
            s.a("SentryAlphaBetaDsn", "https://9a42ef460144a03b30c8b2d5321cfe11@o64374.ingest.sentry.io/5992375")
         }
      );
   }
}

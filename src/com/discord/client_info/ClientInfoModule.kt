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
      val var3: ClientInfo = ClientInfo.INSTANCE;
      val var2: Pair = s.a("Identifier", ClientInfo.INSTANCE.getPackageName());
      val var5: Pair = s.a("Version", var3.getVersionName());
      val var1: Pair = s.a("Build", var3.getVersionCode());
      val var8: Pair = s.a("Manifest", var3.getOtaManifestETag());
      val var6: Pair = s.a("OTABuild", var3.getOtaVersion());
      val var4: ClientInfoCache = ClientInfoCache.INSTANCE;
      val var7: ReactApplicationContext = this.getReactApplicationContext();
      q.g(var7, "getReactApplicationContext(...)");
      return u9.q.m(
         new Pair[]{
            var2,
            var5,
            var1,
            var8,
            var6,
            s.a("DeviceVendorID", var4.getDeviceVendorId(var7)),
            s.a("ReleaseChannel", var3.getReleaseChannel()),
            s.a("SentryDsn", "https://70545531dfe34835bf4dd0996821e8b6@o64374.ingest.sentry.io/5992375"),
            s.a("SentryStaffDsn", "https://90509cba01573ee4e14a2f5e15aee5ca@o64374.ingest.sentry.io/5992375"),
            s.a("SentryAlphaBetaDsn", "https://9a42ef460144a03b30c8b2d5321cfe11@o64374.ingest.sentry.io/5992375")
         }
      );
   }
}

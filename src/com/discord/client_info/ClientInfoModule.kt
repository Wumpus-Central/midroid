package com.discord.client_info

import com.discord.codegen.NativeClientInfoModuleSpec
import com.facebook.react.bridge.ReactApplicationContext
import f8.w
import kotlin.jvm.internal.q

public class ClientInfoModule(reactContext: ReactApplicationContext) : NativeClientInfoModuleSpec {
   init {
      q.h(var1, "reactContext");
      super(var1);
   }

   protected override fun getTypedExportedConstants(): MutableMap<String, Any> {
      val var2: ClientInfo = ClientInfo.INSTANCE;
      val var5: Pair = w.a("Identifier", ClientInfo.INSTANCE.getPackageName());
      val var4: Pair = w.a("Version", var2.getVersionName());
      val var1: Pair = w.a("Build", var2.getVersionCode());
      val var8: Pair = w.a("Manifest", var2.getOtaManifestETag());
      val var7: Pair = w.a("OTABuild", var2.getOtaVersion());
      val var3: ClientInfoCache = ClientInfoCache.INSTANCE;
      val var6: ReactApplicationContext = this.getReactApplicationContext();
      q.g(var6, "getReactApplicationContext(...)");
      return g8.q.m(
         new Pair[]{
            var5,
            var4,
            var1,
            var8,
            var7,
            w.a("DeviceVendorID", var3.getDeviceVendorId(var6)),
            w.a("ReleaseChannel", var2.getReleaseChannel()),
            w.a("SentryDsn", "https://70545531dfe34835bf4dd0996821e8b6@o64374.ingest.sentry.io/5992375"),
            w.a("SentryStaffDsn", "https://90509cba01573ee4e14a2f5e15aee5ca@o64374.ingest.sentry.io/5992375"),
            w.a("SentryAlphaBetaDsn", "https://9a42ef460144a03b30c8b2d5321cfe11@o64374.ingest.sentry.io/5992375")
         }
      );
   }
}

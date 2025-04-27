package com.discord.client_info

import com.discord.codegen.NativeClientInfoModuleSpec
import com.facebook.react.bridge.ReactApplicationContext
import j8.w
import kotlin.jvm.internal.q

public class ClientInfoModule(reactContext: ReactApplicationContext) : NativeClientInfoModuleSpec {
   init {
      q.h(var1, "reactContext");
      super(var1);
   }

   protected override fun getTypedExportedConstants(): MutableMap<String, Any> {
      val var7: ClientInfo = ClientInfo.INSTANCE;
      val var4: Pair = w.a("Identifier", ClientInfo.INSTANCE.getPackageName());
      val var3: Pair = w.a("Version", var7.getVersionName());
      val var1: Pair = w.a("Build", var7.getVersionCode());
      val var6: Pair = w.a("Manifest", var7.getOtaManifestETag());
      val var8: Pair = w.a("OTABuild", var7.getOtaVersion());
      val var5: ClientInfoCache = ClientInfoCache.INSTANCE;
      val var2: ReactApplicationContext = this.getReactApplicationContext();
      q.g(var2, "getReactApplicationContext(...)");
      return k8.q.m(
         new Pair[]{
            var4,
            var3,
            var1,
            var6,
            var8,
            w.a("DeviceVendorID", var5.getDeviceVendorId(var2)),
            w.a("ReleaseChannel", var7.getReleaseChannel()),
            w.a("SentryDsn", "https://70545531dfe34835bf4dd0996821e8b6@o64374.ingest.sentry.io/5992375"),
            w.a("SentryStaffDsn", "https://90509cba01573ee4e14a2f5e15aee5ca@o64374.ingest.sentry.io/5992375"),
            w.a("SentryAlphaBetaDsn", "https://9a42ef460144a03b30c8b2d5321cfe11@o64374.ingest.sentry.io/5992375")
         }
      );
   }
}

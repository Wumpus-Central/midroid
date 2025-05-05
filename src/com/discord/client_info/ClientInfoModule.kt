package com.discord.client_info

import com.discord.codegen.NativeClientInfoModuleSpec
import com.facebook.react.bridge.ReactApplicationContext
import h8.w
import kotlin.jvm.internal.q

public class ClientInfoModule(reactContext: ReactApplicationContext) : NativeClientInfoModuleSpec {
   init {
      q.h(var1, "reactContext");
      super(var1);
   }

   protected override fun getTypedExportedConstants(): MutableMap<String, Any> {
      val var2: ClientInfo = ClientInfo.INSTANCE;
      val var1: Pair = w.a("Identifier", ClientInfo.INSTANCE.getPackageName());
      val var5: Pair = w.a("Version", var2.getVersionName());
      val var7: Pair = w.a("Build", var2.getVersionCode());
      val var4: Pair = w.a("Manifest", var2.getOtaManifestETag());
      val var3: Pair = w.a("OTABuild", var2.getOtaVersion());
      val var6: ClientInfoCache = ClientInfoCache.INSTANCE;
      val var8: ReactApplicationContext = this.getReactApplicationContext();
      q.g(var8, "getReactApplicationContext(...)");
      return i8.q.m(
         new Pair[]{
            var1,
            var5,
            var7,
            var4,
            var3,
            w.a("DeviceVendorID", var6.getDeviceVendorId(var8)),
            w.a("ReleaseChannel", var2.getReleaseChannel()),
            w.a("SentryDsn", "https://70545531dfe34835bf4dd0996821e8b6@o64374.ingest.sentry.io/5992375"),
            w.a("SentryStaffDsn", "https://90509cba01573ee4e14a2f5e15aee5ca@o64374.ingest.sentry.io/5992375"),
            w.a("SentryAlphaBetaDsn", "https://9a42ef460144a03b30c8b2d5321cfe11@o64374.ingest.sentry.io/5992375")
         }
      );
   }
}

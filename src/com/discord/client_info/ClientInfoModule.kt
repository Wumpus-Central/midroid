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
      val var8: ClientInfo = ClientInfo.INSTANCE;
      val var2: Pair = w.a("Identifier", ClientInfo.INSTANCE.getPackageName());
      val var6: Pair = w.a("Version", var8.getVersionName());
      val var4: Pair = w.a("Build", var8.getVersionCode());
      val var3: Pair = w.a("Manifest", var8.getOtaManifestETag());
      val var1: Pair = w.a("OTABuild", var8.getOtaVersion());
      val var7: ClientInfoCache = ClientInfoCache.INSTANCE;
      val var5: ReactApplicationContext = this.getReactApplicationContext();
      q.g(var5, "getReactApplicationContext(...)");
      return i8.q.m(
         new Pair[]{
            var2,
            var6,
            var4,
            var3,
            var1,
            w.a("DeviceVendorID", var7.getDeviceVendorId(var5)),
            w.a("ReleaseChannel", var8.getReleaseChannel()),
            w.a("SentryDsn", "https://70545531dfe34835bf4dd0996821e8b6@o64374.ingest.sentry.io/5992375"),
            w.a("SentryStaffDsn", "https://90509cba01573ee4e14a2f5e15aee5ca@o64374.ingest.sentry.io/5992375"),
            w.a("SentryAlphaBetaDsn", "https://9a42ef460144a03b30c8b2d5321cfe11@o64374.ingest.sentry.io/5992375")
         }
      );
   }
}

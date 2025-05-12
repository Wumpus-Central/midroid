package com.discord.client_info

import com.discord.codegen.NativeClientInfoModuleSpec
import com.facebook.react.bridge.ReactApplicationContext
import kotlin.jvm.internal.q
import o8.w

public class ClientInfoModule(reactContext: ReactApplicationContext) : NativeClientInfoModuleSpec {
   init {
      q.h(var1, "reactContext");
      super(var1);
   }

   protected override fun getTypedExportedConstants(): MutableMap<String, Any> {
      val var6: ClientInfo = ClientInfo.INSTANCE;
      val var1: Pair = w.a("Identifier", ClientInfo.INSTANCE.getPackageName());
      val var4: Pair = w.a("Version", var6.getVersionName());
      val var7: Pair = w.a("Build", var6.getVersionCode());
      val var8: Pair = w.a("Manifest", var6.getOtaManifestETag());
      val var3: Pair = w.a("OTABuild", var6.getOtaVersion());
      val var2: ClientInfoCache = ClientInfoCache.INSTANCE;
      val var5: ReactApplicationContext = this.getReactApplicationContext();
      q.g(var5, "getReactApplicationContext(...)");
      return p8.q.m(
         new Pair[]{
            var1,
            var4,
            var7,
            var8,
            var3,
            w.a("DeviceVendorID", var2.getDeviceVendorId(var5)),
            w.a("ReleaseChannel", var6.getReleaseChannel()),
            w.a("SentryDsn", "https://70545531dfe34835bf4dd0996821e8b6@o64374.ingest.sentry.io/5992375"),
            w.a("SentryStaffDsn", "https://90509cba01573ee4e14a2f5e15aee5ca@o64374.ingest.sentry.io/5992375"),
            w.a("SentryAlphaBetaDsn", "https://9a42ef460144a03b30c8b2d5321cfe11@o64374.ingest.sentry.io/5992375")
         }
      );
   }
}

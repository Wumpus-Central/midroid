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
      val var5: ClientInfo = ClientInfo.INSTANCE;
      val var1: Pair = w.a("Identifier", ClientInfo.INSTANCE.getPackageName());
      val var2: Pair = w.a("Version", var5.getVersionName());
      val var6: Pair = w.a("Build", var5.getVersionCode());
      val var3: Pair = w.a("Manifest", var5.getOtaManifestETag());
      val var4: Pair = w.a("OTABuild", var5.getOtaVersion());
      val var8: ClientInfoCache = ClientInfoCache.INSTANCE;
      val var7: ReactApplicationContext = this.getReactApplicationContext();
      q.g(var7, "getReactApplicationContext(...)");
      return p8.q.m(
         new Pair[]{
            var1,
            var2,
            var6,
            var3,
            var4,
            w.a("DeviceVendorID", var8.getDeviceVendorId(var7)),
            w.a("ReleaseChannel", var5.getReleaseChannel()),
            w.a("SentryDsn", "https://70545531dfe34835bf4dd0996821e8b6@o64374.ingest.sentry.io/5992375"),
            w.a("SentryStaffDsn", "https://90509cba01573ee4e14a2f5e15aee5ca@o64374.ingest.sentry.io/5992375"),
            w.a("SentryAlphaBetaDsn", "https://9a42ef460144a03b30c8b2d5321cfe11@o64374.ingest.sentry.io/5992375")
         }
      );
   }
}

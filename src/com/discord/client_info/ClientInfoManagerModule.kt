package com.discord.client_info

import com.discord.codegen.NativeClientInfoManagerSpec
import com.facebook.react.bridge.ReactApplicationContext
import kh.w
import kotlin.jvm.internal.q
import lh.r

public class ClientInfoManagerModule(reactContext: ReactApplicationContext) : NativeClientInfoManagerSpec {
   init {
      q.h(var1, "reactContext");
      super(var1);
   }

   public override fun getName(): String {
      return "RTNClientInfoManager";
   }

   protected override fun getTypedExportedConstants(): MutableMap<String, Any> {
      val var6: ClientInfo = ClientInfo.INSTANCE;
      val var1: Pair = w.a("Identifier", ClientInfo.INSTANCE.getPackageName());
      val var4: Pair = w.a("Version", var6.getVersionName());
      val var3: Pair = w.a("Build", var6.getVersionCode());
      val var7: Pair = w.a("Manifest", var6.getOtaManifestETag());
      val var8: Pair = w.a("OTABuild", var6.getOtaVersion());
      val var5: ClientInfoCache = ClientInfoCache.INSTANCE;
      val var2: ReactApplicationContext = this.getReactApplicationContext();
      q.g(var2, "getReactApplicationContext(...)");
      return r.m(
         new Pair[]{
            var1,
            var4,
            var3,
            var7,
            var8,
            w.a("DeviceVendorID", var5.getDeviceVendorId(var2)),
            w.a("ReleaseChannel", var6.getReleaseChannel()),
            w.a("SentryDsn", "https://70545531dfe34835bf4dd0996821e8b6@o64374.ingest.sentry.io/5992375"),
            w.a("SentryStaffDsn", "https://90509cba01573ee4e14a2f5e15aee5ca@o64374.ingest.sentry.io/5992375"),
            w.a("SentryAlphaBetaDsn", "https://9a42ef460144a03b30c8b2d5321cfe11@o64374.ingest.sentry.io/5992375")
         }
      );
   }

   public companion object {
      public const val NAME: String
   }
}

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
      val var5: ClientInfo = ClientInfo.INSTANCE;
      val var3: Pair = w.a("Identifier", ClientInfo.INSTANCE.getPackageName());
      val var8: Pair = w.a("Version", var5.getVersionName());
      val var2: Pair = w.a("Build", var5.getVersionCode());
      val var6: Pair = w.a("Manifest", var5.getOtaManifestETag());
      val var4: Pair = w.a("OTABuild", var5.getOtaVersion());
      val var7: ClientInfoCache = ClientInfoCache.INSTANCE;
      val var1: ReactApplicationContext = this.getReactApplicationContext();
      q.g(var1, "getReactApplicationContext(...)");
      return r.m(
         new Pair[]{
            var3,
            var8,
            var2,
            var6,
            var4,
            w.a("DeviceVendorID", var7.getDeviceVendorId(var1)),
            w.a("ReleaseChannel", var5.getReleaseChannel()),
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

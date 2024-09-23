package com.discord.client_info

import com.discord.codegen.NativeClientInfoManagerSpec
import com.facebook.react.bridge.ReactApplicationContext
import kotlin.jvm.internal.q
import nh.w
import oh.r

public class ClientInfoManagerModule(reactContext: ReactApplicationContext) : NativeClientInfoManagerSpec {
   init {
      q.h(var1, "reactContext");
      super(var1);
   }

   public override fun getName(): String {
      return "RTNClientInfoManager";
   }

   protected override fun getTypedExportedConstants(): MutableMap<String, Any> {
      val var8: ClientInfo = ClientInfo.INSTANCE;
      val var4: Pair = w.a("Identifier", ClientInfo.INSTANCE.getPackageName());
      val var2: Pair = w.a("Version", var8.getVersionName());
      val var1: Pair = w.a("Build", var8.getVersionCode());
      val var3: Pair = w.a("Manifest", var8.getOtaManifestETag());
      val var7: Pair = w.a("OTABuild", var8.getOtaVersion());
      val var6: ClientInfoCache = ClientInfoCache.INSTANCE;
      val var5: ReactApplicationContext = this.getReactApplicationContext();
      q.g(var5, "getReactApplicationContext(...)");
      return r.m(
         new Pair[]{
            var4,
            var2,
            var1,
            var3,
            var7,
            w.a("DeviceVendorID", var6.getDeviceVendorId(var5)),
            w.a("ReleaseChannel", var8.getReleaseChannel()),
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

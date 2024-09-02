package com.discord.client_info

import com.discord.codegen.NativeClientInfoManagerSpec
import com.facebook.react.bridge.ReactApplicationContext
import kotlin.jvm.internal.q
import lj.w
import mj.r

public class ClientInfoManagerModule(reactContext: ReactApplicationContext) : NativeClientInfoManagerSpec {
   init {
      q.h(var1, "reactContext");
      super(var1);
   }

   public override fun getName(): String {
      return "RTNClientInfoManager";
   }

   protected override fun getTypedExportedConstants(): MutableMap<String, Any> {
      val var3: ClientInfo = ClientInfo.INSTANCE;
      val var1: Pair = w.a("Identifier", ClientInfo.INSTANCE.getPackageName());
      val var4: Pair = w.a("Version", var3.getVersionName());
      val var5: Pair = w.a("Build", var3.getVersionCode());
      val var6: Pair = w.a("Manifest", var3.getOtaManifestETag());
      val var7: Pair = w.a("OTABuild", var3.getOtaVersion());
      val var2: ClientInfoCache = ClientInfoCache.INSTANCE;
      val var8: ReactApplicationContext = this.getReactApplicationContext();
      q.g(var8, "getReactApplicationContext(...)");
      return r.m(
         new Pair[]{
            var1,
            var4,
            var5,
            var6,
            var7,
            w.a("DeviceVendorID", var2.getDeviceVendorId(var8)),
            w.a("ReleaseChannel", var3.getReleaseChannel()),
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

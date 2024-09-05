package com.discord.client_info

import com.discord.codegen.NativeClientInfoManagerSpec
import com.facebook.react.bridge.ReactApplicationContext
import kotlin.jvm.internal.q
import vj.w
import wj.r

public class ClientInfoManagerModule(reactContext: ReactApplicationContext) : NativeClientInfoManagerSpec {
   init {
      q.h(var1, "reactContext");
      super(var1);
   }

   public override fun getName(): String {
      return "RTNClientInfoManager";
   }

   protected override fun getTypedExportedConstants(): MutableMap<String, Any> {
      val var7: ClientInfo = ClientInfo.INSTANCE;
      val var1: Pair = w.a("Identifier", ClientInfo.INSTANCE.getPackageName());
      val var5: Pair = w.a("Version", var7.getVersionName());
      val var2: Pair = w.a("Build", var7.getVersionCode());
      val var3: Pair = w.a("Manifest", var7.getOtaManifestETag());
      val var8: Pair = w.a("OTABuild", var7.getOtaVersion());
      val var6: ClientInfoCache = ClientInfoCache.INSTANCE;
      val var4: ReactApplicationContext = this.getReactApplicationContext();
      q.g(var4, "getReactApplicationContext(...)");
      return r.m(
         new Pair[]{
            var1,
            var5,
            var2,
            var3,
            var8,
            w.a("DeviceVendorID", var6.getDeviceVendorId(var4)),
            w.a("ReleaseChannel", var7.getReleaseChannel()),
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

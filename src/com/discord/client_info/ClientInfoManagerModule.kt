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
      val var4: ClientInfo = ClientInfo.INSTANCE;
      val var7: Pair = w.a("Identifier", ClientInfo.INSTANCE.getPackageName());
      val var8: Pair = w.a("Version", var4.getVersionName());
      val var1: Pair = w.a("Build", var4.getVersionCode());
      val var5: Pair = w.a("Manifest", var4.getOtaManifestETag());
      val var6: Pair = w.a("OTABuild", var4.getOtaVersion());
      val var2: ClientInfoCache = ClientInfoCache.INSTANCE;
      val var3: ReactApplicationContext = this.getReactApplicationContext();
      q.g(var3, "getReactApplicationContext(...)");
      return r.m(
         new Pair[]{
            var7,
            var8,
            var1,
            var5,
            var6,
            w.a("DeviceVendorID", var2.getDeviceVendorId(var3)),
            w.a("ReleaseChannel", var4.getReleaseChannel()),
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

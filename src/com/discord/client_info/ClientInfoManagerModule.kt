package com.discord.client_info

import com.discord.codegen.NativeClientInfoManagerSpec
import com.facebook.react.bridge.ReactApplicationContext
import eh.w
import fh.s
import kotlin.jvm.internal.r

public class ClientInfoManagerModule(reactContext: ReactApplicationContext) : NativeClientInfoManagerSpec {
   init {
      r.h(var1, "reactContext");
      super(var1);
   }

   public open fun getConstants(): MutableMap<String, String> {
      val var3: ClientInfo = ClientInfo.INSTANCE;
      val var1: Pair = w.a("Identifier", ClientInfo.INSTANCE.getPackageName());
      val var4: Pair = w.a("Version", var3.getVersionName());
      val var6: Pair = w.a("Build", var3.getVersionCode());
      val var2: Pair = w.a("Manifest", var3.getOtaManifestETag());
      val var8: Pair = w.a("OTABuild", var3.getOtaVersion());
      val var7: ClientInfoCache = ClientInfoCache.INSTANCE;
      val var5: ReactApplicationContext = this.getReactApplicationContext();
      r.g(var5, "reactApplicationContext");
      return s.m(
         new Pair[]{
            var1,
            var4,
            var6,
            var2,
            var8,
            w.a("DeviceVendorID", var7.getDeviceVendorId(var5)),
            w.a("ReleaseChannel", var3.getReleaseChannel()),
            w.a("SentryDsn", "https://70545531dfe34835bf4dd0996821e8b6@o64374.ingest.sentry.io/5992375"),
            w.a("SentryStaffDsn", "https://90509cba01573ee4e14a2f5e15aee5ca@o64374.ingest.sentry.io/5992375"),
            w.a("SentryAlphaBetaDsn", "https://9a42ef460144a03b30c8b2d5321cfe11@o64374.ingest.sentry.io/5992375")
         }
      );
   }

   public open fun getName(): String {
      return "RTNClientInfoManager";
   }

   public companion object {
      public const val NAME: String
   }
}

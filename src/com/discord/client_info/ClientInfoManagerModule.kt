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
      val var4: ClientInfo = ClientInfo.INSTANCE;
      val var7: Pair = w.a("Identifier", ClientInfo.INSTANCE.getPackageName());
      val var5: Pair = w.a("Version", var4.getVersionName());
      val var8: Pair = w.a("Build", var4.getVersionCode());
      val var2: Pair = w.a("Manifest", var4.getOtaManifestETag());
      val var6: Pair = w.a("OTABuild", var4.getOtaVersion());
      val var3: ClientInfoCache = ClientInfoCache.INSTANCE;
      val var1: ReactApplicationContext = this.getReactApplicationContext();
      r.g(var1, "reactApplicationContext");
      return s.m(
         new Pair[]{
            var7,
            var5,
            var8,
            var2,
            var6,
            w.a("DeviceVendorID", var3.getDeviceVendorId(var1)),
            w.a("ReleaseChannel", var4.getReleaseChannel()),
            w.a("SentryDsn", "https://70545531dfe34835bf4dd0996821e8b6@o64374.ingest.sentry.io/5992375"),
            w.a("SentryStaffDsn", "https://90509cba01573ee4e14a2f5e15aee5ca@o64374.ingest.sentry.io/5992375"),
            w.a("SentryAlphaBetaDsn", "https://9a42ef460144a03b30c8b2d5321cfe11@o64374.ingest.sentry.io/5992375")
         }
      );
   }

   public override fun getName(): String {
      return "RTNClientInfoManager";
   }

   public companion object {
      public const val NAME: String
   }
}

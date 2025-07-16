package com.discord.crash_reporting

import A9.q
import android.content.Context
import android.os.Build
import com.discord.client_info.ClientInfo
import com.discord.crash_reporting.system_logs.SystemLogReport
import com.discord.logging.Log
import io.sentry.Hint
import io.sentry.IScope
import io.sentry.SentryEvent
import io.sentry.e
import io.sentry.e2
import io.sentry.p1
import io.sentry.android.core.SentryAndroidOptions
import io.sentry.android.core.w0
import java.io.File
import java.net.ConnectException
import java.net.SocketException
import java.net.SocketTimeoutException
import java.net.UnknownHostException
import java.security.cert.CertPathValidatorException
import java.util.Map.Entry
import javax.net.ssl.SSLException
import javax.net.ssl.SSLHandshakeException
import kotlin.enums.EnumEntries
import kotlin.jvm.internal.H
import kotlin.jvm.internal.r
import kotlin.reflect.KClass
import z9.n

public object CrashReporting {
   public final var isCrashedLastRun: Boolean?
      private set

   private final val ignoreNetworkExceptionList: List<KClass<out Throwable>> =
      i.n(
         new KClass[]{
            H.b(UnknownHostException.class),
            H.b(SocketTimeoutException.class),
            H.b(SocketException.class),
            H.b(ConnectException.class),
            H.b(SSLException.class),
            H.b(CertPathValidatorException.class),
            H.b(SSLHandshakeException.class)
         }
      )
      private const val TAG_BUILD_NUMBER: String = "buildNumber"
   private const val TAG_APP_VERSION: String = "appVersion"

   @JvmStatic
   fun `captureMessage$lambda$2`(var0: java.lang.String, var1: java.lang.String, var2: CrashReporting.ErrorLevel, var3: IScope) {
      r.h(var3, "sentryScope");
      var3.s(i.e(var0));
      val var4: Int = CrashReporting.WhenMappings.$EnumSwitchMapping$0[var2.ordinal()];
      val var5: e2;
      if (var4 != 1) {
         if (var4 != 2) {
            throw new n();
         }

         var5 = e2.WARNING;
      } else {
         var5 = e2.INFO;
      }

      p1.k(var1, var5);
   }

   private fun handleBeforeSend(context: Context, event: SentryEvent): SentryEvent {
      if (var2.r0() === e2.FATAL) {
         SystemLogReport.INSTANCE.recordSentryCrash(var1, var2);
      }

      return var2;
   }

   @JvmStatic
   fun `init$lambda$1`(var0: java.lang.String, var1: java.lang.String, var2: Context, var3: Double, var5: SentryAndroidOptions) {
      r.h(var5, "options");
      var5.setDsn(var0);
      val var7: ClientInfo = ClientInfo.INSTANCE;
      var5.setEnvironment(ClientInfo.INSTANCE.getReleaseChannel());
      var5.setDist(var7.getVersionCode());
      var5.setRelease(var1);
      val var6: File = var2.getCacheDir();
      val var8: StringBuilder = new StringBuilder();
      var8.append(var6);
      var8.append("/sentry");
      var5.setCacheDirPath(var8.toString());
      var5.setEnableActivityLifecycleTracingAutoFinish(false);
      var5.setEnableAutoActivityLifecycleTracing(false);
      var5.setTracesSampleRate(0.0);
      var5.setSampleRate(var3);
      var5.setProguardUuid("6a44c3cf-0d77-4ef9-9612-892c6f9fc8b3");
      var5.setTag("buildNumber", var7.getVersionCode());
      var5.setTag("appVersion", var7.getVersionName());
      var5.setBeforeSend(new a(var2));
   }

   @JvmStatic
   fun `init$lambda$1$lambda$0`(var0: Context, var1: SentryEvent, var2: Hint): SentryEvent {
      r.h(var1, "event");
      r.h(var2, "<unused var>");
      return INSTANCE.handleBeforeSend(var0, var1);
   }

   public fun addBreadcrumb(breadcrumbMessage: String, breadcrumbData: Map<String, String> = q.h(), breadcrumbCategory: String? = null) {
      r.h(var1, "breadcrumbMessage");
      r.h(var2, "breadcrumbData");
      val var4: e = new e(var1);

      for (Entry var6 : var2.entrySet()) {
         var4.o(var6.getKey() as java.lang.String, var6.getValue() as java.lang.String);
      }

      var4.n(var3);
      Log.i$default(Log.INSTANCE, "SentryBreadcrumb", var1, null, 4, null);
      p1.e(var4);
   }

   public fun captureException(throwable: Throwable, ignoreNetworkExceptions: Boolean = false) {
      r.h(var1, "throwable");
      Log.e$default(Log.INSTANCE, "SentryBreadcrumb", z9.c.b(var1), null, 4, null);
      if (!var2) {
         p1.i(var1);
      } else if (!ignoreNetworkExceptionList.contains(H.b(var1.getClass()))) {
         p1.i(var1);
      }
   }

   public fun captureMessage(tag: String, exception: Exception) {
      r.h(var1, "tag");
      r.h(var2, "exception");
      val var3: java.lang.String = var2.getMessage();
      var var4: java.lang.String = var3;
      if (var3 == null) {
         var4 = "";
      }

      captureMessage$default(this, var1, var4, null, 4, null);
   }

   public fun captureMessage(tag: String, message: String, errorLevel: com.discord.crash_reporting.CrashReporting.ErrorLevel = CrashReporting.ErrorLevel.INFO) {
      r.h(var1, "tag");
      r.h(var2, "message");
      r.h(var3, "errorLevel");
      val var4: Int = CrashReporting.WhenMappings.$EnumSwitchMapping$0[var3.ordinal()];
      if (var4 != 1) {
         if (var4 != 2) {
            throw new n();
         }

         Log.w$default(Log.INSTANCE, var1, var2, null, 4, null);
      } else {
         Log.i$default(Log.INSTANCE, var1, var2, null, 4, null);
      }

      p1.H(new b(var1, var2, var3));
   }

   public fun getSampleRate(context: Context): Double {
      r.h(var1, "context");
      val var2: Double;
      if (!CrashReportingCache.Companion.getInstance(var1).isStaff() && ClientInfo.INSTANCE.isProdBuild()) {
         var2 = 0.05;
      } else {
         var2 = 1.0;
      }

      return var2;
   }

   public fun init(context: Context, releaseName: String) {
      r.h(var1, "context");
      r.h(var2, "releaseName");
      val var4: ClientInfo = ClientInfo.INSTANCE;
      if (ClientInfo.INSTANCE.isProdBuild()) {
         val var3: java.lang.String = Build.DEVICE;
         r.g(Build.DEVICE, "DEVICE");
         if (h.N(var3, "vivo", false, 2, null)) {
            return;
         }
      }

      val var5: java.lang.String;
      if (var4.isDebugBuild() || var4.isDeveloperBuild()) {
         var5 = "";
      } else if (CrashReportingCache.Companion.getInstance(var1).isStaff()) {
         var5 = "https://90509cba01573ee4e14a2f5e15aee5ca@o64374.ingest.sentry.io/5992375";
      } else if (!var4.isProdBuild()) {
         var5 = "https://9a42ef460144a03b30c8b2d5321cfe11@o64374.ingest.sentry.io/5992375";
      } else {
         var5 = "https://70545531dfe34835bf4dd0996821e8b6@o64374.ingest.sentry.io/5992375";
      }

      w0.g(var1, new c(var5, var2, var1, this.getSampleRate(var1)));
      isCrashedLastRun = p1.v();
   }

   public enum class ErrorLevel {
      INFO,
      WARNING      @JvmStatic
      private EnumEntries $ENTRIES;
      @JvmStatic
      private CrashReporting.ErrorLevel[] $VALUES;

      @JvmStatic
      fun {
         val var0: Array<CrashReporting.ErrorLevel> = $values();
         $VALUES = var0;
         $ENTRIES = H9.a.a(var0);
      }

      @JvmStatic
      fun getEntries(): EnumEntries {
         return $ENTRIES;
      }
   }
}

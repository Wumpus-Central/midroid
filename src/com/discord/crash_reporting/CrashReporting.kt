package com.discord.crash_reporting

import android.content.Context
import android.os.Build
import com.discord.client_info.ClientInfo
import com.discord.logging.Log
import fh.p
import gh.r
import io.sentry.IScope
import io.sentry.d5
import io.sentry.e
import io.sentry.n3
import io.sentry.android.core.SentryAndroidOptions
import io.sentry.android.core.r1
import java.io.File
import java.net.ConnectException
import java.net.SocketException
import java.net.SocketTimeoutException
import java.net.UnknownHostException
import java.security.cert.CertPathValidatorException
import java.util.Map.Entry
import javax.net.ssl.SSLException
import kotlin.enums.EnumEntries
import kotlin.jvm.internal.g0
import kotlin.jvm.internal.q
import kotlin.jvm.internal.Ref.ObjectRef
import kotlin.reflect.KClass

public object CrashReporting {
   private const val TAG_APP_VERSION: String = "appVersion"
   private const val TAG_BUILD_NUMBER: String = "buildNumber"
   public final val ignoreNetworkExceptionList: List<KClass<out Throwable>> =
      i.m(
         new KClass[]{
            g0.b(UnknownHostException.class),
            g0.b(SocketTimeoutException.class),
            g0.b(SocketException.class),
            g0.b(ConnectException.class),
            g0.b(SSLException.class),
            g0.b(CertPathValidatorException.class)
         }
      )

   public final var isCrashedLastRun: Boolean?
      private set

   @JvmStatic
   fun `captureMessage$lambda$1`(var0: java.lang.String, var1: java.lang.String, var2: CrashReporting.ErrorLevel, var3: IScope) {
      q.h(var0, "$tag");
      q.h(var1, "$message");
      q.h(var2, "$errorLevel");
      q.h(var3, "SentryScope");
      var3.q(i.e(var0));
      val var4: Int = CrashReporting.WhenMappings.$EnumSwitchMapping$0[var2.ordinal()];
      val var5: d5;
      if (var4 != 1) {
         if (var4 != 2) {
            throw new p();
         }

         var5 = d5.WARNING;
      } else {
         var5 = d5.INFO;
      }

      n3.j(var1, var5);
   }

   @JvmStatic
   fun `init$lambda$0`(var0: ObjectRef, var1: java.lang.String, var2: Context, var3: Double, var5: SentryAndroidOptions) {
      q.h(var0, "$dsn");
      q.h(var1, "$releaseName");
      q.h(var2, "$context");
      q.h(var5, "options");
      var5.setDsn(var0.j as java.lang.String);
      val var6: ClientInfo = ClientInfo.INSTANCE;
      var5.setEnvironment(ClientInfo.INSTANCE.getReleaseChannel());
      var5.setDist(var6.getVersionCode());
      var5.setRelease(var1);
      val var7: File = var2.getCacheDir();
      val var8: StringBuilder = new StringBuilder();
      var8.append(var7);
      var8.append("/sentry");
      var5.setCacheDirPath(var8.toString());
      var5.setEnableActivityLifecycleTracingAutoFinish(false);
      var5.setEnableAutoActivityLifecycleTracing(false);
      var5.setTracesSampleRate(0.0);
      var5.setSampleRate(var3);
      var5.setProguardUuid("6707d493-cf73-42b7-b2ea-867ae894bf8c");
      var5.setTag("buildNumber", var6.getVersionCode());
      var5.setTag("appVersion", var6.getVersionName());
   }

   public fun addBreadcrumb(breadcrumbMessage: String, breadcrumbData: Map<String, String> = r.h(), breadcrumbCategory: String? = null) {
      q.h(var1, "breadcrumbMessage");
      q.h(var2, "breadcrumbData");
      val var4: e = new e(var1);

      for (Entry var5 : var2.entrySet()) {
         var4.n(var5.getKey() as java.lang.String, var5.getValue() as java.lang.String);
      }

      var4.m(var3);
      Log.i$default(Log.INSTANCE, "SentryBreadcrumb", var1, null, 4, null);
      n3.d(var4);
   }

   public fun captureException(throwable: Throwable, ignoreNetworkExceptions: Boolean = false) {
      q.h(var1, "throwable");
      Log.e$default(Log.INSTANCE, "SentryBreadcrumb", fh.e.b(var1), null, 4, null);
      if (!var2) {
         n3.h(var1);
      } else if (!ignoreNetworkExceptionList.contains(g0.b(var1.getClass()))) {
         n3.h(var1);
      }
   }

   public fun captureMessage(tag: String, exception: Exception) {
      q.h(var1, "tag");
      q.h(var2, "exception");
      val var3: java.lang.String = var2.getMessage();
      var var4: java.lang.String = var3;
      if (var3 == null) {
         var4 = "";
      }

      captureMessage$default(this, var1, var4, null, 4, null);
   }

   public fun captureMessage(tag: String, message: String, errorLevel: com.discord.crash_reporting.CrashReporting.ErrorLevel = CrashReporting.ErrorLevel.INFO) {
      q.h(var1, "tag");
      q.h(var2, "message");
      q.h(var3, "errorLevel");
      val var4: Int = CrashReporting.WhenMappings.$EnumSwitchMapping$0[var3.ordinal()];
      if (var4 != 1) {
         if (var4 == 2) {
            Log.w$default(Log.INSTANCE, var1, var2, null, 4, null);
         }
      } else {
         Log.i$default(Log.INSTANCE, var1, var2, null, 4, null);
      }

      n3.F(new b(var1, var2, var3));
   }

   public fun getSampleRate(context: Context): Double {
      q.h(var1, "context");
      val var2: Double;
      if (!CrashReportingCache.Companion.getInstance(var1).isStaff() && ClientInfo.INSTANCE.isProdBuild()) {
         var2 = 0.05;
      } else {
         var2 = 1.0;
      }

      return var2;
   }

   public fun init(context: Context, releaseName: String) {
      q.h(var1, "context");
      q.h(var2, "releaseName");
      val var3: ClientInfo = ClientInfo.INSTANCE;
      if (ClientInfo.INSTANCE.isProdBuild()) {
         val var4: java.lang.String = Build.DEVICE;
         q.g(Build.DEVICE, "DEVICE");
         if (h.M(var4, "vivo", false, 2, null)) {
            return;
         }
      }

      val var6: ObjectRef = new ObjectRef();
      val var5: java.lang.String;
      if (var3.isDebugBuild() || var3.isDeveloperBuild()) {
         var5 = "";
      } else if (CrashReportingCache.Companion.getInstance(var1).isStaff()) {
         var5 = "https://90509cba01573ee4e14a2f5e15aee5ca@o64374.ingest.sentry.io/5992375";
      } else if (!var3.isProdBuild()) {
         var5 = "https://9a42ef460144a03b30c8b2d5321cfe11@o64374.ingest.sentry.io/5992375";
      } else {
         var5 = "https://70545531dfe34835bf4dd0996821e8b6@o64374.ingest.sentry.io/5992375";
      }

      var6.j = var5;
      r1.g(var1, new a(var6, var2, var1, this.getSampleRate(var1)));
      isCrashedLastRun = n3.u();
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
         $ENTRIES = mh.a.a(var0);
      }

      @JvmStatic
      fun getEntries(): EnumEntries {
         return $ENTRIES;
      }
   }
}

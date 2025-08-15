package com.discord.crash_reporting

import B9.n
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
import io.sentry.android.core.v0
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
import kotlin.jvm.internal.SourceDebugExtension
import kotlin.reflect.KClass

@SourceDebugExtension(["SMAP\nCrashReporting.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CrashReporting.kt\ncom/discord/crash_reporting/CrashReporting\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,196:1\n216#2,2:197\n*S KotlinDebug\n*F\n+ 1 CrashReporting.kt\ncom/discord/crash_reporting/CrashReporting\n*L\n178#1:197,2\n*E\n"])
public object CrashReporting {
   public final var isCrashedLastRun: Boolean?
      private set

   private final val ignoreNetworkExceptionList: List<KClass<out Throwable>> =
      CollectionsKt.n(
         new KClass[]{
            UnknownHostException::class,
            SocketTimeoutException::class,
            SocketException::class,
            ConnectException::class,
            SSLException::class,
            CertPathValidatorException::class,
            SSLHandshakeException::class
         }
      )
      private const val TAG_BUILD_NUMBER: String = "buildNumber"
   private const val TAG_APP_VERSION: String = "appVersion"

   @JvmStatic
   fun `captureMessage$lambda$2`(var0: java.lang.String, var1: java.lang.String, var2: CrashReporting.ErrorLevel, var3: IScope) {
      var3.s(CollectionsKt.e(var0));
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
      var5.setDsn(var0);
      val var7: ClientInfo = ClientInfo.INSTANCE;
      var5.setEnvironment(ClientInfo.INSTANCE.getReleaseChannel());
      var5.setDist(var7.getVersionCode());
      var5.setRelease(var1);
      val var8: File = var2.getCacheDir();
      val var6: StringBuilder = new StringBuilder();
      var6.append(var8);
      var6.append("/sentry");
      var5.setCacheDirPath(var6.toString());
      var5.setEnableActivityLifecycleTracingAutoFinish(false);
      var5.setEnableAutoActivityLifecycleTracing(false);
      var5.setTracesSampleRate(0.0);
      var5.setSampleRate(var3);
      var5.setProguardUuid("cb846846-429a-49e6-88a5-81c8d5f407ce");
      var5.setTag("buildNumber", var7.getVersionCode());
      var5.setTag("appVersion", var7.getVersionName());
      var5.setBeforeSend(new a(var2));
   }

   @JvmStatic
   fun `init$lambda$1$lambda$0`(var0: Context, var1: SentryEvent, var2: Hint): SentryEvent {
      return INSTANCE.handleBeforeSend(var0, var1);
   }

   public fun addBreadcrumb(breadcrumbMessage: String, breadcrumbData: Map<String, String> = L.h(), breadcrumbCategory: String? = null) {
      val var4: e = new e(var1);

      for (Entry var6 : var2.entrySet()) {
         var4.o(var6.getKey() as java.lang.String, var6.getValue() as java.lang.String);
      }

      var4.n(var3);
      Log.i$default(Log.INSTANCE, "SentryBreadcrumb", var1, null, 4, null);
      p1.e(var4);
   }

   public fun captureException(throwable: Throwable, ignoreNetworkExceptions: Boolean = false) {
      Log.e$default(Log.INSTANCE, "SentryBreadcrumb", B9.c.b(var1), null, 4, null);
      if (!var2) {
         p1.i(var1);
      } else if (!ignoreNetworkExceptionList.contains(var1.getClass()::class)) {
         p1.i(var1);
      }
   }

   public fun captureMessage(tag: String, exception: Exception) {
      val var3: java.lang.String = var2.getMessage();
      var var4: java.lang.String = var3;
      if (var3 == null) {
         var4 = "";
      }

      captureMessage$default(this, var1, var4, null, 4, null);
   }

   public fun captureMessage(tag: String, message: String, errorLevel: com.discord.crash_reporting.CrashReporting.ErrorLevel = CrashReporting.ErrorLevel.INFO) {
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
      val var2: Double;
      if (!CrashReportingCache.Companion.getInstance(var1).isStaff() && ClientInfo.INSTANCE.isProdBuild()) {
         var2 = 0.05;
      } else {
         var2 = 1.0;
      }

      return var2;
   }

   public fun init(context: Context, releaseName: String) {
      val var3: ClientInfo = ClientInfo.INSTANCE;
      if (ClientInfo.INSTANCE.isProdBuild()) {
         val var4: java.lang.String = Build.DEVICE;
         if (StringsKt.N(var4, "vivo", false, 2, null)) {
            return;
         }
      }

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

      v0.g(var1, new c(var5, var2, var1, this.getSampleRate(var1)));
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

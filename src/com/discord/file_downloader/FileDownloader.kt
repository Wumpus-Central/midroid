package com.discord.file_downloader

import Ca.l
import android.content.Context
import com.discord.resource_usage.DeviceResourceUsageRecorder
import com.discord.resource_usage.DeviceResourceUsageRecorder.Companion
import ic.e
import java.io.File
import java.util.Map.Entry
import kotlin.coroutines.Continuation
import kotlin.jvm.functions.Function2
import kotlin.jvm.internal.SourceDebugExtension
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.Response
import okhttp3.Interceptor.Chain
import okhttp3.OkHttpClient.Builder
import org.jetbrains.annotations.NotNull

@SourceDebugExtension(["SMAP\nFileDownloader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileDownloader.kt\ncom/discord/file_downloader/FileDownloader\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 OkHttpClient.kt\nokhttp3/OkHttpClient$Builder\n*L\n1#1,88:1\n1863#2,2:89\n563#3:91\n*S KotlinDebug\n*F\n+ 1 FileDownloader.kt\ncom/discord/file_downloader/FileDownloader\n*L\n33#1:89,2\n21#1:91\n*E\n"])
public object FileDownloader {
   private final val defaultClient: OkHttpClient by l.b(new a())
      private final get() {
         return defaultClient$delegate.getValue() as OkHttpClient;
      }


   @JvmStatic
   fun `defaultClient_delegate$lambda$0`(): OkHttpClient {
      return new Builder().a(new Interceptor(DeviceResourceUsageRecorder.Companion) {
         final Companion $receiver$inlined;

         {
            this.$receiver$inlined = var1;
         }

         @NotNull
         public final Response intercept(@NotNull Chain var1) {
            return this.$receiver$inlined.downloadInterceptor(var1);
         }
      }).c();
   }

   public fun downloadBlob(fileUrl: String, headers: Map<String, String> = O.i(), client: OkHttpClient = var0.getDefaultClient()): Response {
      val var4: okhttp3.Request.Builder = new okhttp3.Request.Builder();

      for (Entry var5 : var2.entrySet()) {
         var4.a(var5.getKey() as java.lang.String, var5.getValue() as java.lang.String);
      }

      return var3.b(var4.l(var1).b()).execute();
   }

   public fun downloadFile(context: Context, fileUrl: String, fileName: String, downloadDirectory: File = var1.getCacheDir(), logErrors: Boolean = false): Flow<
         DownloadState
      > {
      return e.p(
         new Function2<FlowCollector, Continuation, Object>(var4, var3, var2, var5, null)// $VF: Couldn't be decompiled
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   
      );
   }
}

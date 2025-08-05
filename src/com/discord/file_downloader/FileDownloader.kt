package com.discord.file_downloader

import B9.j
import C9.q
import android.content.Context
import com.discord.resource_usage.DeviceResourceUsageRecorder
import java.io.File
import java.util.Map.Entry
import kotlin.jvm.functions.Function2
import kotlin.jvm.internal.r
import kotlinx.coroutines.flow.Flow
import nb.e
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.Response
import okhttp3.Interceptor.Chain
import okhttp3.OkHttpClient.Builder

public object FileDownloader {
   private final val defaultClient: OkHttpClient by j.b(new a())
      private final get() {
         return defaultClient$delegate.getValue() as OkHttpClient;
      }


   @JvmStatic
   fun `defaultClient_delegate$lambda$0`(): OkHttpClient {
      return new Builder().a(new Interceptor(DeviceResourceUsageRecorder.Companion) {
         final DeviceResourceUsageRecorder.Companion $receiver$inlined;

         {
            this.$receiver$inlined = var1;
         }

         public final Response intercept(Chain var1) {
            r.h(var1, "chain");
            return this.$receiver$inlined.downloadInterceptor(var1);
         }
      }).c();
   }

   public fun downloadBlob(fileUrl: String, headers: Map<String, String> = q.h(), client: OkHttpClient = var0.getDefaultClient()): Response {
      r.h(var1, "fileUrl");
      r.h(var2, "headers");
      r.h(var3, "client");
      val var4: okhttp3.Request.Builder = new okhttp3.Request.Builder();

      for (Entry var6 : var2.entrySet()) {
         var4.a(var6.getKey() as java.lang.String, var6.getValue() as java.lang.String);
      }

      return var3.b(var4.l(var1).b()).execute();
   }

   public fun downloadFile(context: Context, fileUrl: String, fileName: String, downloadDirectory: File = var1.getCacheDir(), logErrors: Boolean = false): Flow<
         DownloadState
      > {
      r.h(var1, "context");
      r.h(var2, "fileUrl");
      r.h(var3, "fileName");
      r.h(var4, "downloadDirectory");
      return e.m(
         new Function2(var4, var3, var2, var5, null)// $VF: Couldn't be decompiled
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   
      );
   }
}

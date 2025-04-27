package com.discord.file_downloader

import V9.e
import android.content.Context
import j8.l
import java.io.File
import java.util.Map.Entry
import k8.q
import kotlin.jvm.functions.Function2
import kotlinx.coroutines.flow.Flow
import okhttp3.OkHttpClient
import okhttp3.Response
import okhttp3.Request.Builder

public object FileDownloader {
   private final val defaultClient: OkHttpClient by l.b(<unrepresentable>.INSTANCE)
      private final get() {
         return defaultClient$delegate.getValue() as OkHttpClient;
      }


   public fun downloadBlob(fileUrl: String, headers: Map<String, String> = q.h(), client: OkHttpClient = var0.getDefaultClient()): Response {
      kotlin.jvm.internal.q.h(var1, "fileUrl");
      kotlin.jvm.internal.q.h(var2, "headers");
      kotlin.jvm.internal.q.h(var3, "client");
      val var4: Builder = new Builder();

      for (Entry var5 : var2.entrySet()) {
         var4.a(var5.getKey() as java.lang.String, var5.getValue() as java.lang.String);
      }

      return var3.b(var4.l(var1).b()).execute();
   }

   public fun downloadFile(context: Context, fileUrl: String, fileName: String, downloadDirectory: File = var1.getCacheDir(), logErrors: Boolean = false): Flow<
         DownloadState
      > {
      kotlin.jvm.internal.q.h(var1, "context");
      kotlin.jvm.internal.q.h(var2, "fileUrl");
      kotlin.jvm.internal.q.h(var3, "fileName");
      kotlin.jvm.internal.q.h(var4, "downloadDirectory");
      return e.m(
         new Function2(var4, var3, var2, var5, null)// $VF: Couldn't be decompiled
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   
      );
   }
}

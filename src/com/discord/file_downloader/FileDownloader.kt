package com.discord.file_downloader

import android.content.Context
import java.io.File
import java.util.Map.Entry
import kotlin.jvm.functions.Function2
import kotlin.jvm.internal.q
import kotlinx.coroutines.flow.Flow
import lj.l
import mj.r
import okhttp3.OkHttpClient
import okhttp3.Response
import okhttp3.Request.Builder
import wm.d

public object FileDownloader {
   private final val defaultClient: OkHttpClient by l.a(<unrepresentable>.INSTANCE)
      private final get() {
         return defaultClient$delegate.getValue() as OkHttpClient;
      }


   public fun downloadBlob(fileUrl: String, headers: Map<String, String> = r.h(), client: OkHttpClient = var0.getDefaultClient()): Response {
      q.h(var1, "fileUrl");
      q.h(var2, "headers");
      q.h(var3, "client");
      val var4: Builder = new Builder();

      for (Entry var5 : var2.entrySet()) {
         var4.a(var5.getKey() as java.lang.String, var5.getValue() as java.lang.String);
      }

      return var3.b(var4.l(var1).b()).execute();
   }

   public fun downloadFile(context: Context, fileUrl: String, fileName: String, downloadDirectory: File = var1.getCacheDir(), logErrors: Boolean = false): Flow<
         DownloadState
      > {
      q.h(var1, "context");
      q.h(var2, "fileUrl");
      q.h(var3, "fileName");
      q.h(var4, "downloadDirectory");
      return d.l(
         new Function2(var4, var3, var2, var5, null)// $VF: Couldn't be decompiled
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   // java.lang.StackOverflowError
   //   at java.base/java.util.Objects.equals(Objects.java:64)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper$VarInMethod.equals(VarDefinitionHelper.java:1403)
   
      );
   }
}

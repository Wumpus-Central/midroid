package com.discord.file_downloader

import android.app.DownloadManager
import android.app.DownloadManager.Request
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Environment
import com.discord.file_downloader.utils.FilenameSanitizedKt
import java.util.LinkedHashMap
import kotlin.jvm.functions.Function0
import kotlin.jvm.functions.Function2
import kotlin.jvm.internal.q
import kotlinx.coroutines.channels.ProducerScope
import kotlinx.coroutines.flow.Flow
import yk.d

public object PublicFileDownloader {
   private final val onDownloadListeners: MutableMap<Long, () -> Unit> = new LinkedHashMap()

   private fun getFileDownloadRequest(url: String, fileName: String, description: String?): Request {
      val var4: Request = new Request(Uri.parse(var1))
         .setTitle(var2)
         .setDescription(var3)
         .setNotificationVisibility(1)
         .setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, FilenameSanitizedKt.filenameSanitized(var2));
      var4.allowScanningByMediaScanner();
      return var4;
   }

   private fun ProducerScope<DownloadState>.onFileDownloaded(downloadManager: DownloadManager, downloadId: Long, downloadFileName: String): Boolean {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
      //   at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:100)
      //   at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:106)
      //   at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:302)
      //   at java.base/java.util.Objects.checkIndex(Objects.java:385)
      //   at java.base/java.util.ArrayList.remove(ArrayList.java:551)
      //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.removeExceptionInstructionsEx(FinallyProcessor.java:1057)
      //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.verifyFinallyEx(FinallyProcessor.java:572)
      //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.iterateGraph(FinallyProcessor.java:90)
      //
      // Bytecode:
      // 00: aload 2
      // 01: new android/app/DownloadManager$Query
      // 04: dup
      // 05: invokespecial android/app/DownloadManager$Query.<init> ()V
      // 08: bipush 1
      // 09: newarray 11
      // 0b: dup
      // 0c: bipush 0
      // 0d: lload 3
      // 0e: lastore
      // 0f: invokevirtual android/app/DownloadManager$Query.setFilterById ([J)Landroid/app/DownloadManager$Query;
      // 12: invokevirtual android/app/DownloadManager.query (Landroid/app/DownloadManager$Query;)Landroid/database/Cursor;
      // 15: astore 2
      // 16: aload 2
      // 17: invokeinterface android/database/Cursor.moveToFirst ()Z 1
      // 1c: ifeq 4e
      // 1f: new java/io/File
      // 22: astore 7
      // 24: aload 7
      // 26: getstatic android/os/Environment.DIRECTORY_DOWNLOADS Ljava/lang/String;
      // 29: invokestatic android/os/Environment.getExternalStoragePublicDirectory (Ljava/lang/String;)Ljava/io/File;
      // 2c: aload 5
      // 2e: invokespecial java/io/File.<init> (Ljava/io/File;Ljava/lang/String;)V
      // 31: new com/discord/file_downloader/DownloadState$Completed
      // 34: astore 5
      // 36: aload 5
      // 38: aload 7
      // 3a: invokespecial com/discord/file_downloader/DownloadState$Completed.<init> (Ljava/io/File;)V
      // 3d: aload 1
      // 3e: aload 5
      // 40: invokeinterface xk/s.k (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 45: pop
      // 46: goto 79
      // 49: astore 5
      // 4b: goto 8a
      // 4e: new com/discord/file_downloader/DownloadState$Failure
      // 51: astore 8
      // 53: new java/lang/IllegalStateException
      // 56: astore 7
      // 58: new java/io/FileNotFoundException
      // 5b: astore 5
      // 5d: aload 5
      // 5f: invokespecial java/io/FileNotFoundException.<init> ()V
      // 62: aload 7
      // 64: aload 5
      // 66: invokespecial java/lang/IllegalStateException.<init> (Ljava/lang/Throwable;)V
      // 69: aload 8
      // 6b: aload 7
      // 6d: invokespecial com/discord/file_downloader/DownloadState$Failure.<init> (Ljava/lang/Exception;)V
      // 70: aload 1
      // 71: aload 8
      // 73: invokeinterface xk/s.k (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 78: pop
      // 79: aload 1
      // 7a: aconst_null
      // 7b: bipush 1
      // 7c: aconst_null
      // 7d: invokestatic xk/s$a.a (Lxk/s;Ljava/lang/Throwable;ILjava/lang/Object;)Z
      // 80: istore 6
      // 82: aload 2
      // 83: aconst_null
      // 84: invokestatic yh/c.a (Ljava/io/Closeable;Ljava/lang/Throwable;)V
      // 87: iload 6
      // 89: ireturn
      // 8a: aload 5
      // 8c: athrow
      // 8d: astore 1
      // 8e: aload 2
      // 8f: aload 5
      // 91: invokestatic yh/c.a (Ljava/io/Closeable;Ljava/lang/Throwable;)V
      // 94: aload 1
      // 95: athrow
   }

   public fun downloadFile(context: Context, url: String, fileName: String, description: String? = null): Flow<DownloadState> {
      q.h(var1, "context");
      q.h(var2, "url");
      q.h(var3, "fileName");
      return d.c(
         new Function2(var1, var2, var3, var4, null)// $VF: Couldn't be decompiled
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   // java.lang.StackOverflowError
   //   at java.base/java.util.Objects.equals(Objects.java:64)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper$VarInMethod.equals(VarDefinitionHelper.java:1403)
   
      );
   }

   public class PublicFileDownloadBroadcastReceiver : BroadcastReceiver {
      public open fun onReceive(context: Context, intent: Intent?) {
         q.h(var1, "context");
         val var5: java.lang.String;
         if (var2 != null) {
            var5 = var2.getAction();
         } else {
            var5 = null;
         }

         if (var5 != null && var5.hashCode() == 1248865515 && var5.equals("android.intent.action.DOWNLOAD_COMPLETE")) {
            val var6: Function0 = PublicFileDownloader.access$getOnDownloadListeners$p().get(var2.getLongExtra("extra_download_id", 0L)) as Function0;
            if (var6 != null) {
               var6.invoke();
            }
         }
      }
   }
}

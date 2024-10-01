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
import vk.e

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
      // 1c: ifeq 4d
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
      // 40: invokeinterface uk/s.h (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 45: pop
      // 46: goto 78
      // 49: astore 1
      // 4a: goto 89
      // 4d: new com/discord/file_downloader/DownloadState$Failure
      // 50: astore 5
      // 52: new java/lang/IllegalStateException
      // 55: astore 7
      // 57: new java/io/FileNotFoundException
      // 5a: astore 8
      // 5c: aload 8
      // 5e: invokespecial java/io/FileNotFoundException.<init> ()V
      // 61: aload 7
      // 63: aload 8
      // 65: invokespecial java/lang/IllegalStateException.<init> (Ljava/lang/Throwable;)V
      // 68: aload 5
      // 6a: aload 7
      // 6c: invokespecial com/discord/file_downloader/DownloadState$Failure.<init> (Ljava/lang/Exception;)V
      // 6f: aload 1
      // 70: aload 5
      // 72: invokeinterface uk/s.h (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 77: pop
      // 78: aload 1
      // 79: aconst_null
      // 7a: bipush 1
      // 7b: aconst_null
      // 7c: invokestatic uk/s$a.a (Luk/s;Ljava/lang/Throwable;ILjava/lang/Object;)Z
      // 7f: istore 6
      // 81: aload 2
      // 82: aconst_null
      // 83: invokestatic vh/c.a (Ljava/io/Closeable;Ljava/lang/Throwable;)V
      // 86: iload 6
      // 88: ireturn
      // 89: aload 1
      // 8a: athrow
      // 8b: astore 5
      // 8d: aload 2
      // 8e: aload 1
      // 8f: invokestatic vh/c.a (Ljava/io/Closeable;Ljava/lang/Throwable;)V
      // 92: aload 5
      // 94: athrow
   }

   public fun downloadFile(context: Context, url: String, fileName: String, description: String? = null): Flow<DownloadState> {
      q.h(var1, "context");
      q.h(var2, "url");
      q.h(var3, "fileName");
      return e.c(
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

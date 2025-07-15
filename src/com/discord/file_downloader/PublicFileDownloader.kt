package com.discord.file_downloader

import android.app.DownloadManager
import android.app.DownloadManager.Request
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Environment
import cb.p
import com.discord.file_downloader.utils.FilenameSanitizedKt
import db.e
import java.util.LinkedHashMap
import kotlin.coroutines.Continuation
import kotlin.jvm.functions.Function0
import kotlin.jvm.functions.Function2
import kotlin.jvm.internal.r
import kotlin.jvm.internal.Ref.LongRef
import kotlinx.coroutines.channels.ProducerScope
import kotlinx.coroutines.flow.Flow

public object PublicFileDownloader {
   private final val onDownloadListeners: MutableMap<Long, () -> Unit> = new LinkedHashMap()

   private fun getFileDownloadRequest(url: String, fileName: String, description: String?): Request {
      val var4: Request = new Request(Uri.parse(var1)).setTitle(var2).setDescription(var3).setNotificationVisibility(1);
      var2 = FilenameSanitizedKt.filenameSanitized(var2);
      var4.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, var2);
      var2 = FilenameSanitizedKt.getMimeTypeFromFilename(var2);
      if (var2 != null) {
         var4.setMimeType(var2);
      }

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
      // 40: invokeinterface cb/t.g (Ljava/lang/Object;)Ljava/lang/Object; 2
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
      // 72: invokeinterface cb/t.g (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 77: pop
      // 78: aload 1
      // 79: aconst_null
      // 7a: bipush 1
      // 7b: aconst_null
      // 7c: invokestatic cb/t$a.a (Lcb/t;Ljava/lang/Throwable;ILjava/lang/Object;)Z
      // 7f: istore 6
      // 81: aload 2
      // 82: aconst_null
      // 83: invokestatic D9/c.a (Ljava/io/Closeable;Ljava/lang/Throwable;)V
      // 86: iload 6
      // 88: ireturn
      // 89: aload 1
      // 8a: athrow
      // 8b: astore 5
      // 8d: aload 2
      // 8e: aload 1
      // 8f: invokestatic D9/c.a (Ljava/io/Closeable;Ljava/lang/Throwable;)V
      // 92: aload 5
      // 94: athrow
   }

   public fun downloadFile(context: Context, url: String, fileName: String, description: String? = null): Flow<DownloadState> {
      r.h(var1, "context");
      r.h(var2, "url");
      r.h(var3, "fileName");
      return e.c(
         new Function2(var1, var2, var3, var4, null) {
            final Context $context;
            final java.lang.String $description;
            final java.lang.String $fileName;
            final java.lang.String $url;
            private Object L$0;
            Object L$1;
            int label;

            {
               super(2, var5);
               this.$context = var1;
               this.$url = var2x;
               this.$fileName = var3x;
               this.$description = var4;
            }

            private static final Unit invokeSuspend$lambda$0(LongRef var0, ProducerScope var1x, DownloadManager var2x, java.lang.String var3x) {
               PublicFileDownloader.access$getOnDownloadListeners$p().remove(var0.j);
               PublicFileDownloader.access$onFileDownloaded(PublicFileDownloader.INSTANCE, var1x, var2x, var0.j, var3x);
               return Unit.a;
            }

            private static final Unit invokeSuspend$lambda$1(LongRef var0) {
               PublicFileDownloader.access$getOnDownloadListeners$p().remove(var0.j);
               return Unit.a;
            }

            public final Continuation create(Object var1, Continuation var2) {
               val var3: Function2 = new <anonymous constructor>(this.$context, this.$url, this.$fileName, this.$description, var2);
               var3.L$0 = var1;
               return var3;
            }

            public final Object invoke(ProducerScope var1, Continuation var2x) {
               return (this.create(var1, var2x) as <unrepresentable>).invokeSuspend(Unit.a);
            }

            // $VF: Duplicated exception handlers to handle obfuscated exceptions
            public final Object invokeSuspend(Object var1) {
               var var9: Any;
               var var23: LongRef;
               label81: {
                  label80: {
                     var var6: ProducerScope;
                     var var7: LongRef;
                     label86: {
                        label87: {
                           var9 = y9.b.e();
                           if (this.label != 0) {
                              if (this.label != 1) {
                                 if (this.label != 2) {
                                    if (this.label != 3) {
                                       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }

                                    kotlin.c.b(var1);
                                    return Unit.a;
                                 }

                                 val var8: LongRef = this.L$1 as LongRef;
                                 var20 = this.L$0 as ProducerScope;
                                 var7 = var8;
                                 var6 = var20;

                                 try {
                                    kotlin.c.b(var1);
                                 } catch (var16: Exception) {
                                    var1 = var16;
                                    break label86;
                                 }

                                 var1 = var8;
                                 break label87;
                              }

                              val var5: ProducerScope = this.L$0 as ProducerScope;
                              kotlin.c.b(var1);
                              var1 = var5;
                           } else {
                              kotlin.c.b(var1);
                              val var21: ProducerScope = this.L$0 as ProducerScope;
                              val var25: DownloadState.InProgress = DownloadState.InProgress.INSTANCE;
                              this.L$0 = var21;
                              this.label = 1;
                              var1 = var21;
                              if (var21.j(var25, this) === var9) {
                                 return var9;
                              }
                           }

                           val var22: Any = this.$context.getSystemService("download");
                           r.f(var22, "null cannot be cast to non-null type android.app.DownloadManager");
                           val var26: DownloadManager = var22 as DownloadManager;
                           var23 = new LongRef();
                           var23.j = -1L;

                           var var3x: Long;
                           try {
                              var3x = var26.enqueue(
                                 PublicFileDownloader.access$getFileDownloadRequest(PublicFileDownloader.INSTANCE, this.$url, this.$fileName, this.$description)
                              );
                              var23.j = var3x;
                           } catch (var15: Exception) {
                              var6 = var1;
                              var1 = var15;
                              var7 = var23;
                              break label86;
                           }

                           if (var3x != 0L && var3x != 1L) {
                              try {
                                 PublicFileDownloader.access$getOnDownloadListeners$p()
                                    .put(kotlin.coroutines.jvm.internal.b.e(var23.j), new b(var23, var1, var26, this.$fileName));
                                 break label81;
                              } catch (var12: Exception) {
                                 var6 = var1;
                                 var1 = var12;
                                 var7 = var23;
                                 break label86;
                              }
                           }

                           try {
                              val var27: DownloadState.Failure = new DownloadState.Failure(
                                 new IllegalStateException("Download Manager returned an invalid download id")
                              );
                              this.L$0 = var1;
                              this.L$1 = var23;
                              this.label = 2;
                              var28 = var1.j(var27, this);
                           } catch (var14: Exception) {
                              var6 = var1;
                              var1 = var14;
                              var7 = var23;
                              break label86;
                           }

                           if (var28 === var9) {
                              return var9;
                           }

                           var20 = var1;
                           var1 = var23;
                        }

                        var7 = var1;
                        var6 = var20;

                        try {
                           kotlin.coroutines.jvm.internal.b.a(cb.t.a.a(var20, null, 1, null));
                           break label80;
                        } catch (var13: Exception) {
                           var1 = var13;
                        }
                     }

                     var6.g(new DownloadState.Failure(var1));
                     kotlin.coroutines.jvm.internal.b.a(cb.t.a.a(var6, null, 1, null));
                     var1 = var7;
                     var20 = var6;
                  }

                  var1 = var20;
                  var23 = var1;
               }

               val var24: c = new c(var23);
               this.L$0 = null;
               this.L$1 = null;
               this.label = 3;
               return if (p.a(var1, var24, this) === var9) var9 else Unit.a;
            }
         }
      );
   }

   public class PublicFileDownloadBroadcastReceiver : BroadcastReceiver {
      public open fun onReceive(context: Context, intent: Intent?) {
         r.h(var1, "context");
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

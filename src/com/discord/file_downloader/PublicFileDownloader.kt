package com.discord.file_downloader

import Z9.p
import Z9.s.a
import aa.e
import android.app.DownloadManager
import android.app.DownloadManager.Request
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Environment
import com.discord.file_downloader.utils.FilenameSanitizedKt
import java.util.LinkedHashMap
import kotlin.coroutines.Continuation
import kotlin.jvm.functions.Function0
import kotlin.jvm.functions.Function2
import kotlin.jvm.internal.q
import kotlin.jvm.internal.Ref.LongRef
import kotlinx.coroutines.channels.ProducerScope
import kotlinx.coroutines.flow.Flow
import o8.s
import v8.b

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
      // 40: invokeinterface Z9/s.e (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 45: pop
      // 46: goto 78
      // 49: astore 1
      // 4a: goto 89
      // 4d: new com/discord/file_downloader/DownloadState$Failure
      // 50: astore 5
      // 52: new java/lang/IllegalStateException
      // 55: astore 8
      // 57: new java/io/FileNotFoundException
      // 5a: astore 7
      // 5c: aload 7
      // 5e: invokespecial java/io/FileNotFoundException.<init> ()V
      // 61: aload 8
      // 63: aload 7
      // 65: invokespecial java/lang/IllegalStateException.<init> (Ljava/lang/Throwable;)V
      // 68: aload 5
      // 6a: aload 8
      // 6c: invokespecial com/discord/file_downloader/DownloadState$Failure.<init> (Ljava/lang/Exception;)V
      // 6f: aload 1
      // 70: aload 5
      // 72: invokeinterface Z9/s.e (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 77: pop
      // 78: aload 1
      // 79: aconst_null
      // 7a: bipush 1
      // 7b: aconst_null
      // 7c: invokestatic Z9/s$a.a (LZ9/s;Ljava/lang/Throwable;ILjava/lang/Object;)Z
      // 7f: istore 6
      // 81: aload 2
      // 82: aconst_null
      // 83: invokestatic A8/c.a (Ljava/io/Closeable;Ljava/lang/Throwable;)V
      // 86: iload 6
      // 88: ireturn
      // 89: aload 1
      // 8a: athrow
      // 8b: astore 5
      // 8d: aload 2
      // 8e: aload 1
      // 8f: invokestatic A8/c.a (Ljava/io/Closeable;Ljava/lang/Throwable;)V
      // 92: aload 5
      // 94: athrow
   }

   public fun downloadFile(context: Context, url: String, fileName: String, description: String? = null): Flow<DownloadState> {
      q.h(var1, "context");
      q.h(var2, "url");
      q.h(var3, "fileName");
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
               var var22: LongRef;
               label81: {
                  label80: {
                     var var6: ProducerScope;
                     var var7: LongRef;
                     label86: {
                        label87: {
                           var9 = b.e();
                           if (this.label != 0) {
                              if (this.label != 1) {
                                 if (this.label != 2) {
                                    if (this.label != 3) {
                                       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }

                                    s.b(var1);
                                    return Unit.a;
                                 }

                                 val var8: LongRef = this.L$1 as LongRef;
                                 var19 = this.L$0 as ProducerScope;
                                 var7 = var8;
                                 var6 = var19;

                                 try {
                                    s.b(var1);
                                 } catch (var14: Exception) {
                                    var1 = var14;
                                    break label86;
                                 }

                                 var1 = var8;
                                 break label87;
                              }

                              val var5: ProducerScope = this.L$0 as ProducerScope;
                              s.b(var1);
                              var1 = var5;
                           } else {
                              s.b(var1);
                              val var20: ProducerScope = this.L$0 as ProducerScope;
                              val var24: DownloadState.InProgress = DownloadState.InProgress.INSTANCE;
                              this.L$0 = var20;
                              this.label = 1;
                              var1 = var20;
                              if (var20.g(var24, this) === var9) {
                                 return var9;
                              }
                           }

                           val var21: Any = this.$context.getSystemService("download");
                           q.f(var21, "null cannot be cast to non-null type android.app.DownloadManager");
                           val var30: DownloadManager = var21 as DownloadManager;
                           var22 = new LongRef();
                           var22.j = -1L;

                           var var3x: Long;
                           try {
                              var3x = var30.enqueue(
                                 PublicFileDownloader.access$getFileDownloadRequest(PublicFileDownloader.INSTANCE, this.$url, this.$fileName, this.$description)
                              );
                              var22.j = var3x;
                           } catch (var15: Exception) {
                              var6 = var1;
                              var1 = var15;
                              var7 = var22;
                              break label86;
                           }

                           if (var3x != 0L && var3x != 1L) {
                              try {
                                 PublicFileDownloader.access$getOnDownloadListeners$p()
                                    .put(
                                       kotlin.coroutines.jvm.internal.b.e(var22.j),
                                       new Function0(var22, var1, var30, this.$fileName) {
                                          final ProducerScope $$this$callbackFlow;
                                          final LongRef $downloadId;
                                          final java.lang.String $fileName;
                                          final DownloadManager $manager;

                                          {
                                             super(0);
                                             this.$downloadId = var1;
                                             this.$$this$callbackFlow = var2x;
                                             this.$manager = var3x;
                                             this.$fileName = var4;
                                          }

                                          public final void invoke() {
                                             PublicFileDownloader.access$getOnDownloadListeners$p().remove(this.$downloadId.j);
                                             PublicFileDownloader.access$onFileDownloaded(
                                                PublicFileDownloader.INSTANCE, this.$$this$callbackFlow, this.$manager, this.$downloadId.j, this.$fileName
                                             );
                                          }
                                       }
                                    );
                                 break label81;
                              } catch (var11: Exception) {
                                 var6 = var1;
                                 var1 = var11;
                                 var7 = var22;
                                 break label86;
                              }
                           }

                           try {
                              val var25: DownloadState.Failure = new DownloadState.Failure(
                                 new IllegalStateException("Download Manager returned an invalid download id")
                              );
                              this.L$0 = var1;
                              this.L$1 = var22;
                              this.label = 2;
                              var26 = var1.g(var25, this);
                           } catch (var13: Exception) {
                              var6 = var1;
                              var1 = var13;
                              var7 = var22;
                              break label86;
                           }

                           if (var26 === var9) {
                              return var9;
                           }

                           var1 = var22;
                           var19 = var1;
                        }

                        var7 = var1;
                        var6 = var19;

                        try {
                           a.a(var19, null, 1, null);
                           break label80;
                        } catch (var12: Exception) {
                           var1 = var12;
                        }
                     }

                     var6.e(new DownloadState.Failure(var1));
                     a.a(var6, null, 1, null);
                     var1 = var7;
                     var19 = var6;
                  }

                  var22 = var1;
                  var1 = var19;
               }

               val var23: Function0 = new Function0(var22) {
                  final LongRef $downloadId;

                  {
                     super(0);
                     this.$downloadId = var1;
                  }

                  public final void invoke() {
                     PublicFileDownloader.access$getOnDownloadListeners$p().remove(this.$downloadId.j);
                  }
               };
               this.L$0 = null;
               this.L$1 = null;
               this.label = 3;
               return if (p.a(var1, var23, this) === var9) var9 else Unit.a;
            }
         }
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

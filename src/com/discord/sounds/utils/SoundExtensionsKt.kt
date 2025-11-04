@file:SourceDebugExtension(["SMAP\nSoundExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SoundExtensions.kt\ncom/discord/sounds/utils/SoundExtensionsKt\n+ 2 Uri.kt\nandroidx/core/net/UriKt\n*L\n1#1,76:1\n29#2:77\n*S KotlinDebug\n*F\n+ 1 SoundExtensions.kt\ncom/discord/sounds/utils/SoundExtensionsKt\n*L\n26#1:77\n*E\n"])

package com.discord.sounds.utils

import android.content.Context
import android.net.Uri
import com.discord.file_downloader.DownloadState
import com.discord.file_downloader.FileDownloader
import com.discord.logging.Log
import com.discord.sounds.SoundManager
import gu.c1
import gu.m0
import java.io.File
import java.util.Comparator
import kotlin.coroutines.Continuation
import kotlin.coroutines.CoroutineContext
import kotlin.jvm.functions.Function1
import kotlin.jvm.functions.Function2
import kotlin.jvm.internal.SourceDebugExtension
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.flow.FlowCollector
import lt.a
import ot.b

internal fun Context.fetchSound(url: String, soundManager: SoundManager, key: Int, usage: Int, soundResIdPrepared: (Int) -> Unit) {
   tryPruneSoundsCache(var0);
   gu.g.d(
      kotlinx.coroutines.i.b(),
      m0.b(),
      null,
      new Function2<CoroutineScope, Continuation<? super Unit>, Object>(
         var0, var1, getRemoteSoundFilename(var1), getSoundsCacheDirectory(var0), var2, var3, var4, var5, null
      ) {
         final Context $context;
         final java.lang.String $fileName;
         final int $key;
         final File $soundDirectory;
         final SoundManager $soundManager;
         final Function1<Integer, Unit> $soundResIdPrepared;
         final java.lang.String $url;
         final int $usage;
         int label;

         {
            super(2, var9);
            this.$context = var1;
            this.$url = var2x;
            this.$fileName = var3;
            this.$soundDirectory = var4;
            this.$soundManager = var5;
            this.$key = var6;
            this.$usage = var7;
            this.$soundResIdPrepared = var8;
         }

         public final Continuation<Unit> create(Object var1, Continuation<?> var2) {
            return new <anonymous constructor>(
               this.$context, this.$url, this.$fileName, this.$soundDirectory, this.$soundManager, this.$key, this.$usage, this.$soundResIdPrepared, var2
            );
         }

         public final Object invoke(CoroutineScope var1, Continuation<? super Unit> var2x) {
            return (this.create(var1, var2x) as <unrepresentable>).invokeSuspend(Unit.a);
         }

         public final Object invokeSuspend(Object var1) {
            val var3: Any = b.f();
            if (this.label != 0) {
               if (this.label != 1) {
                  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
               }

               kotlin.c.b(var1);
            } else {
               kotlin.c.b(var1);
               var1 = FileDownloader.downloadFile$default(
                  FileDownloader.INSTANCE, this.$context, this.$url, this.$fileName, this.$soundDirectory, false, 16, null
               );
               val var4: FlowCollector = new FlowCollector(this.$soundManager, this.$key, this.$usage, this.$soundResIdPrepared) {
                  final int $key;
                  final SoundManager $soundManager;
                  final Function1<Integer, Unit> $soundResIdPrepared;
                  final int $usage;

                  {
                     this.$soundManager = var1;
                     this.$key = var2x;
                     this.$usage = var3x;
                     this.$soundResIdPrepared = var4x;
                  }

                  // $VF: Duplicated exception handlers to handle obfuscated exceptions
                  public final Object emit(DownloadState var1, Continuation<? super Unit> var2x) {
                     label59: {
                        if (var2x is <unrepresentable>) {
                           val var4x: <unrepresentable> = var2x as <unrepresentable>;
                           if (((var2x as <unrepresentable>).label and Integer.MIN_VALUE) != 0) {
                              var4x.label = (var2x as <unrepresentable>).label + Integer.MIN_VALUE;
                              var13 = var4x;
                              break label59;
                           }
                        }

                        var13 = new kotlin.coroutines.jvm.internal.d(this, var2x) {
                           int label;
                           Object result;
                           final <unrepresentable><T> this$0;

                           {
                              super(var2x);
                              this.this$0 = var1;
                           }

                           public final Object invokeSuspend(Object var1) {
                              this.result = var1;
                              this.label |= Integer.MIN_VALUE;
                              return this.this$0.emit(null, this);
                           }
                        };
                     }

                     var var5: Any = ((<unrepresentable>)var13).result;
                     val var15: Any = b.f();
                     if (((<unrepresentable>)var13).label != 0) {
                        if (((<unrepresentable>)var13).label == 1) {
                           try {
                              kotlin.c.b(var5);
                              return Unit.a;
                           } catch (var8: Exception) {
                              val var9: c1 = m0.c();
                              var5 = new Function2<CoroutineScope, Continuation<? super Unit>, Object>(var8, null) {
                                 final Exception $e;
                                 int label;

                                 {
                                    super(2, var2x);
                                    this.$e = var1;
                                 }

                                 public final Continuation<Unit> create(Object var1, Continuation<?> var2x) {
                                    return new <anonymous constructor>(this.$e, var2x);
                                 }

                                 public final Object invoke(CoroutineScope var1, Continuation<? super Unit> var2x) {
                                    return (this.create(var1, var2x) as <unrepresentable>).invokeSuspend(Unit.a);
                                 }

                                 public final Object invokeSuspend(Object var1) {
                                    b.f();
                                    if (this.label == 0) {
                                       kotlin.c.b(var1);
                                       Log.INSTANCE.w(SoundManager.Companion.getLogTag(), "Failed to download sound.", this.$e);
                                       return Unit.a;
                                    } else {
                                       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                 }
                              };
                              ((<unrepresentable>)var13).label = 2;
                              if (gu.g.g(var9, (Function2)var5, (Continuation)var13) != var15) {
                                 return Unit.a;
                              }

                              return var15;
                           }
                        }

                        if (((<unrepresentable>)var13).label == 2) {
                           kotlin.c.b(var5);
                           return Unit.a;
                        }

                        if (((<unrepresentable>)var13).label != 3) {
                           throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }

                        kotlin.c.b(var5);
                     } else {
                        kotlin.c.b(var5);
                        if (var1 is DownloadState.Completed) {
                           try {
                              val var6: c1 = m0.c();
                              var5 = new Function2<CoroutineScope, Continuation<? super Unit>, Object>(
                                 this.$soundManager, this.$key, this.$usage, var1, this.$soundResIdPrepared, null
                              ) {
                                 final DownloadState $downloadState;
                                 final int $key;
                                 final SoundManager $soundManager;
                                 final Function1<Integer, Unit> $soundResIdPrepared;
                                 final int $usage;
                                 int label;

                                 {
                                    super(2, var6x);
                                    this.$soundManager = var1;
                                    this.$key = var2x;
                                    this.$usage = var3x;
                                    this.$downloadState = var4x;
                                    this.$soundResIdPrepared = var5x;
                                 }

                                 public final Continuation<Unit> create(Object var1, Continuation<?> var2) {
                                    return new <anonymous constructor>(
                                       this.$soundManager, this.$key, this.$usage, this.$downloadState, this.$soundResIdPrepared, var2
                                    );
                                 }

                                 public final Object invoke(CoroutineScope var1, Continuation<? super Unit> var2x) {
                                    return (this.create(var1, var2x) as <unrepresentable>).invokeSuspend(Unit.a);
                                 }

                                 public final Object invokeSuspend(Object var1) {
                                    b.f();
                                    if (this.label == 0) {
                                       kotlin.c.b(var1);
                                       this.$soundManager
                                          .prepare(
                                             this.$key,
                                             this.$usage,
                                             null,
                                             (this.$downloadState as DownloadState.Completed).getFile().getAbsolutePath(),
                                             this.$soundResIdPrepared
                                          );
                                       return Unit.a;
                                    } else {
                                       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                 }
                              };
                              ((<unrepresentable>)var13).label = 1;
                              var12 = gu.g.g(var6, (Function2)var5, (Continuation)var13);
                           } catch (var7: Exception) {
                              val var11: c1 = m0.c();
                              var5 = new Function2<CoroutineScope, Continuation<? super Unit>, Object>(var7, null) {
                                 final Exception $e;
                                 int label;

                                 {
                                    super(2, var2x);
                                    this.$e = var1;
                                 }

                                 public final Continuation<Unit> create(Object var1, Continuation<?> var2x) {
                                    return new <anonymous constructor>(this.$e, var2x);
                                 }

                                 public final Object invoke(CoroutineScope var1, Continuation<? super Unit> var2x) {
                                    return (this.create(var1, var2x) as <unrepresentable>).invokeSuspend(Unit.a);
                                 }

                                 public final Object invokeSuspend(Object var1) {
                                    b.f();
                                    if (this.label == 0) {
                                       kotlin.c.b(var1);
                                       Log.INSTANCE.w(SoundManager.Companion.getLogTag(), "Failed to download sound.", this.$e);
                                       return Unit.a;
                                    } else {
                                       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                 }
                              };
                              ((<unrepresentable>)var13).label = 2;
                              if (gu.g.g(var11, (Function2)var5, (Continuation)var13) != var15) {
                                 return Unit.a;
                              }

                              return var15;
                           }

                           if (var12 != var15) {
                              return Unit.a;
                           }

                           return var15;
                        }

                        var5 = m0.c();
                        val var10: Function2 = new Function2<CoroutineScope, Continuation<? super Unit>, Object>(null) {
                           int label;

                           {
                              super(2, var1);
                           }

                           public final Continuation<Unit> create(Object var1, Continuation<?> var2) {
                              return new <anonymous constructor>(var2);
                           }

                           public final Object invoke(CoroutineScope var1, Continuation<? super Unit> var2x) {
                              return (this.create(var1, var2x) as <unrepresentable>).invokeSuspend(Unit.a);
                           }

                           public final Object invokeSuspend(Object var1) {
                              b.f();
                              if (this.label == 0) {
                                 kotlin.c.b(var1);
                                 return Unit.a;
                              } else {
                                 throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                              }
                           }
                        };
                        ((<unrepresentable>)var13).label = 3;
                        if (gu.g.g((CoroutineContext)var5, var10, (Continuation)var13) === var15) {
                           return var15;
                        }
                     }

                     return Unit.a;
                  }
               };
               this.label = 1;
               if (var1.collect(var4, this) === var3) {
                  return var3;
               }
            }

            return Unit.a;
         }
      },
      2,
      null
   );
}

internal fun getRemoteSoundFilename(url: String): String {
   var0 = Uri.parse(var0).getLastPathSegment();
   val var1: StringBuilder = new StringBuilder();
   var1.append(var0);
   var1.append(".mp3");
   return var1.toString();
}

internal fun Context.getSoundsCacheDirectory(): File {
   return new File(var0.getCacheDir(), "sounds");
}

internal fun Context.tryPruneSoundsCache() {
   val var1: Array<File> = getSoundsCacheDirectory(var0).listFiles();
   if (var1 != null && var1.length >= 20) {
      m.H(var1, new Comparator() {
         @Override
         public final int compare(T var1, T var2) {
            return a.d((var2 as File).lastModified(), (var1 as File).lastModified());
         }
      });
      val var2: File = m.z0(var1) as File;
      if (var2 != null) {
         var2.delete();
      }
   }
}

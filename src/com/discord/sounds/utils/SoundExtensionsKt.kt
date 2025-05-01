package com.discord.sounds.utils

import O9.K
import O9.f
import android.content.Context
import android.net.Uri
import com.discord.file_downloader.DownloadState
import com.discord.file_downloader.FileDownloader
import com.discord.logging.Log
import com.discord.sounds.SoundManager
import f8.s
import i8.a
import java.io.File
import java.util.Comparator
import kotlin.coroutines.Continuation
import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.jvm.internal.d
import kotlin.jvm.functions.Function1
import kotlin.jvm.functions.Function2
import kotlin.jvm.internal.q
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.g
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector
import l8.b

internal fun Context.fetchSound(url: String, soundManager: SoundManager, key: Int, usage: Int, soundResIdPrepared: (Int) -> Unit) {
   q.h(var0, "<this>");
   q.h(var1, "url");
   q.h(var2, "soundManager");
   q.h(var5, "soundResIdPrepared");
   tryPruneSoundsCache(var0);
   f.d(
      g.b(),
      K.b(),
      null,
      new Function2(var0, var1, getRemoteSoundFilename(var1), getSoundsCacheDirectory(var0), var2, var3, var4, var5, null) {
         final Context $context;
         final java.lang.String $fileName;
         final int $key;
         final File $soundDirectory;
         final SoundManager $soundManager;
         final Function1 $soundResIdPrepared;
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

         public final Continuation create(Object var1, Continuation var2) {
            return new <anonymous constructor>(
               this.$context, this.$url, this.$fileName, this.$soundDirectory, this.$soundManager, this.$key, this.$usage, this.$soundResIdPrepared, var2
            );
         }

         public final Object invoke(CoroutineScope var1, Continuation var2x) {
            return (this.create(var1, var2x) as <unrepresentable>).invokeSuspend(Unit.a);
         }

         public final Object invokeSuspend(Object var1) {
            val var3: Any = b.e();
            if (this.label != 0) {
               if (this.label != 1) {
                  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
               }

               s.b(var1);
            } else {
               s.b(var1);
               val var4: Flow = FileDownloader.downloadFile$default(
                  FileDownloader.INSTANCE, this.$context, this.$url, this.$fileName, this.$soundDirectory, false, 16, null
               );
               var1 = new FlowCollector(this.$soundManager, this.$key, this.$usage, this.$soundResIdPrepared) {
                  final int $key;
                  final SoundManager $soundManager;
                  final Function1 $soundResIdPrepared;
                  final int $usage;

                  {
                     this.$soundManager = var1;
                     this.$key = var2x;
                     this.$usage = var3x;
                     this.$soundResIdPrepared = var4x;
                  }

                  // $VF: Duplicated exception handlers to handle obfuscated exceptions
                  public final Object emit(DownloadState var1, Continuation var2x) {
                     label57: {
                        if (var2x is <unrepresentable>) {
                           val var4x: <unrepresentable> = var2x as <unrepresentable>;
                           if (((var2x as <unrepresentable>).label and Integer.MIN_VALUE) != 0) {
                              var4x.label = (var2x as <unrepresentable>).label + Integer.MIN_VALUE;
                              var14 = var4x;
                              break label57;
                           }
                        }

                        var14 = new d(this, var2x) {
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

                     var var17: Any = ((<unrepresentable>)var14).result;
                     val var5: Any = b.e();
                     var var9: Any;
                     if (((<unrepresentable>)var14).label != 0) {
                        if (((<unrepresentable>)var14).label == 1) {
                           try {
                              s.b(var17);
                           } catch (var7: Exception) {
                              var9 = K.c();
                              var17 = new Function2(var7, null) {
                                 final Exception $e;
                                 int label;

                                 {
                                    super(2, var2x);
                                    this.$e = var1;
                                 }

                                 public final Continuation create(Object var1, Continuation var2x) {
                                    return new <anonymous constructor>(this.$e, var2x);
                                 }

                                 public final Object invoke(CoroutineScope var1, Continuation var2x) {
                                    return (this.create(var1, var2x) as <unrepresentable>).invokeSuspend(Unit.a);
                                 }

                                 public final Object invokeSuspend(Object var1) {
                                    b.e();
                                    if (this.label == 0) {
                                       s.b(var1);
                                       Log.INSTANCE.w(SoundManager.Companion.getLogTag(), "Failed to download sound.", this.$e);
                                       return Unit.a;
                                    } else {
                                       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                 }
                              };
                              ((<unrepresentable>)var14).label = 2;
                              if (f.g((CoroutineContext)var9, (Function2)var17, (Continuation)var14) === var5) {
                                 return var5;
                              }
                           }

                           return Unit.a;
                        }

                        if (((<unrepresentable>)var14).label == 2) {
                           s.b(var17);
                           return Unit.a;
                        }

                        if (((<unrepresentable>)var14).label != 3) {
                           throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }

                        s.b(var17);
                        var9 = var17;
                     } else {
                        s.b(var17);
                        if (var1 is DownloadState.Completed) {
                           try {
                              var17 = K.c();
                              val var6: Function2 = new Function2(this.$soundManager, this.$key, this.$usage, var1, this.$soundResIdPrepared, null) {
                                 final DownloadState $downloadState;
                                 final int $key;
                                 final SoundManager $soundManager;
                                 final Function1 $soundResIdPrepared;
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

                                 public final Continuation create(Object var1, Continuation var2) {
                                    return new <anonymous constructor>(
                                       this.$soundManager, this.$key, this.$usage, this.$downloadState, this.$soundResIdPrepared, var2
                                    );
                                 }

                                 public final Object invoke(CoroutineScope var1, Continuation var2x) {
                                    return (this.create(var1, var2x) as <unrepresentable>).invokeSuspend(Unit.a);
                                 }

                                 public final Object invokeSuspend(Object var1) {
                                    b.e();
                                    if (this.label == 0) {
                                       s.b(var1);
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
                              ((<unrepresentable>)var14).label = 1;
                              var9 = f.g((CoroutineContext)var17, var6, (Continuation)var14);
                           } catch (var8: Exception) {
                              var9 = K.c();
                              var17 = new Function2(var8, null) {
                                 final Exception $e;
                                 int label;

                                 {
                                    super(2, var2x);
                                    this.$e = var1;
                                 }

                                 public final Continuation create(Object var1, Continuation var2x) {
                                    return new <anonymous constructor>(this.$e, var2x);
                                 }

                                 public final Object invoke(CoroutineScope var1, Continuation var2x) {
                                    return (this.create(var1, var2x) as <unrepresentable>).invokeSuspend(Unit.a);
                                 }

                                 public final Object invokeSuspend(Object var1) {
                                    b.e();
                                    if (this.label == 0) {
                                       s.b(var1);
                                       Log.INSTANCE.w(SoundManager.Companion.getLogTag(), "Failed to download sound.", this.$e);
                                       return Unit.a;
                                    } else {
                                       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                 }
                              };
                              ((<unrepresentable>)var14).label = 2;
                              if (f.g((CoroutineContext)var9, (Function2)var17, (Continuation)var14) === var5) {
                                 return var5;
                              }

                              return Unit.a;
                           }

                           if (var9 === var5) {
                              return var5;
                           }

                           return Unit.a;
                        }

                        var9 = K.c();
                        var17 = new Function2(null) {
                           int label;

                           {
                              super(2, var1);
                           }

                           public final Continuation create(Object var1, Continuation var2) {
                              return new <anonymous constructor>(var2);
                           }

                           public final Object invoke(CoroutineScope var1, Continuation var2x) {
                              return (this.create(var1, var2x) as <unrepresentable>).invokeSuspend(Unit.a);
                           }

                           public final Object invokeSuspend(Object var1) {
                              b.e();
                              if (this.label == 0) {
                                 s.b(var1);
                                 return null;
                              } else {
                                 throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                              }
                           }
                        };
                        ((<unrepresentable>)var14).label = 3;
                        val var15: Any = f.g((CoroutineContext)var9, (Function2)var17, (Continuation)var14);
                        var9 = var15;
                        if (var15 === var5) {
                           return var5;
                        }
                     }

                     return var9;
                  }
               };
               this.label = 1;
               if (var4.collect(var1, this) === var3) {
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
   q.h(var0, "url");
   val var1: java.lang.String = Uri.parse(var0).getLastPathSegment();
   val var2: StringBuilder = new StringBuilder();
   var2.append(var1);
   var2.append(".mp3");
   return var2.toString();
}

internal fun Context.getSoundsCacheDirectory(): File {
   q.h(var0, "<this>");
   return new File(var0.getCacheDir(), "sounds");
}

internal fun Context.tryPruneSoundsCache() {
   q.h(var0, "<this>");
   val var1: Array<File> = getSoundsCacheDirectory(var0).listFiles();
   if (var1 != null && var1.length >= 20) {
      c.t(var1, new Comparator() {
         @Override
         public final int compare(T var1, T var2) {
            return a.d((var2 as File).lastModified(), (var1 as File).lastModified());
         }
      });
      val var2: File = c.g0(var1) as File;
      if (var2 != null) {
         var2.delete();
      }
   }
}

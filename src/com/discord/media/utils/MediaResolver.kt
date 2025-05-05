package com.discord.media.utils

import P7.e
import P7.g
import Q9.K
import Q9.f
import android.annotation.SuppressLint
import android.content.ContentResolver
import android.content.Context
import android.graphics.Bitmap.CompressFormat
import android.net.Uri
import com.discord.crash_reporting.CrashReporting
import h8.s
import h8.w
import id.zelory.compressor.constraint.Compression
import java.io.File
import java.io.InputStream
import kotlin.coroutines.Continuation
import kotlin.coroutines.jvm.internal.d
import kotlin.jvm.functions.Function1
import kotlin.jvm.functions.Function2
import kotlin.jvm.internal.q
import kotlinx.coroutines.CoroutineScope
import s8.c

public class MediaResolver(context: Context, onProgress: (Uri, Int) -> Unit) {
   private final val context: Context
   private final val onProgress: (Uri, Int) -> Unit
   private final val cacheDir: File

   private final val resolver: ContentResolver
      private final get() {
         val var1: ContentResolver = this.context.getContentResolver();
         q.g(var1, "getContentResolver(...)");
         return var1;
      }


   private final val requestId: String
      private final get() {
         val var2: java.lang.String = var1.toString();
         q.g(var2, "toString(...)");
         return var2;
      }


   init {
      q.h(var1, "context");
      q.h(var2, "onProgress");
      super();
      this.context = var1;
      this.onProgress = var2;
      this.cacheDir = var1.getCacheDir();
   }

   @SuppressLint(["UsableSpace"])
   private suspend fun checkFreeSpace() {
      val var2: Any = f.g(
         K.b(),
         new Function2(this, null) {
            int label;
            final MediaResolver this$0;

            {
               super(2, var2x);
               this.this$0 = var1;
            }

            public final Continuation create(Object var1, Continuation var2) {
               return new <anonymous constructor>(this.this$0, var2);
            }

            public final Object invoke(CoroutineScope var1, Continuation var2x) {
               return (this.create(var1, var2x) as <unrepresentable>).invokeSuspend(Unit.a);
            }

            public final Object invokeSuspend(Object var1) {
               n8.b.e();
               if (this.label != 0) {
                  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
               } else {
                  s.b(var1);
                  if ((double)MediaResolver.access$getCacheDir$p(this.this$0).getUsableSpace()
                        / MediaResolver.access$getCacheDir$p(this.this$0).getTotalSpace()
                     < 0.2) {
                     val var6: Long = System.currentTimeMillis() - MediaResolver.access$getCompanion$p().getHALF_DAY_MILLIS();
                     var1 = MediaResolver.access$getCacheDir$p(this.this$0).listFiles();
                     if (var1 != null) {
                        val var4: Int = var1.length;

                        for (int var2x = 0; var2x < var4; var2x++) {
                           val var9: File = var1[var2x];
                           if (var1[var2x].isFile()) {
                              val var8: java.lang.String = var9.getName();
                              q.g(var8, "getName(...)");
                              if (h.J(var8, "temp_", false, 2, null) && var9.lastModified() < var6) {
                                 var9.delete();
                                 continue;
                              }
                           }

                           if (var9.isDirectory() && q.c(var9.getName(), "compressor")) {
                              val var12: Array<File> = var9.listFiles();
                              if (var12 != null) {
                                 q.e(var12);
                                 val var5: Int = var12.length;

                                 for (int var3 = 0; var3 < var5; var3++) {
                                    val var11: File = var12[var3];
                                    if (var12[var3].isFile() && var12[var3].lastModified() < var6) {
                                       var11.delete();
                                    }
                                 }
                              }
                           }
                        }
                     }
                  }

                  return Unit.a;
               }
            }
         },
         var1
      );
      return if (var2 === n8.b.e()) var2 else Unit.a;
   }

   private suspend fun copyToFile(uri: Uri, targetFile: File? = ...): Uri {
      return f.g(
         K.b(),
         new Function2(var2, this, var1, null) {
            final File $targetFile;
            final Uri $uri;
            int label;
            final MediaResolver this$0;

            {
               super(2, var4);
               this.$targetFile = var1;
               this.this$0 = var2x;
               this.$uri = var3;
            }

            public final Continuation create(Object var1, Continuation var2) {
               return new <anonymous constructor>(this.$targetFile, this.this$0, this.$uri, var2);
            }

            public final Object invoke(CoroutineScope var1, Continuation var2x) {
               return (this.create(var1, var2x) as <unrepresentable>).invokeSuspend(Unit.a);
            }

            public final Object invokeSuspend(Object var1) {
               n8.b.e();
               label26:
               if (this.label == 0) {
                  s.b(var1);
                  var1 = this.$targetFile;
                  if (this.$targetFile == null) {
                     var1 = ContentResolverUtils.createTempFile$default(
                        ContentResolverUtils.INSTANCE, MediaResolver.access$getResolver(this.this$0), this.$uri, null, null, 6, null
                     );
                  }

                  val var12: Uri = this.$uri;
                  val var13: InputStream = MediaResolver.access$getResolver(this.this$0).openInputStream(var12);
                  if (var13 != null) {
                     try {
                        q.e(var13);
                        FileUtilsKt.writeTo(var13, var1);
                     } catch (var5: java.lang.Throwable) {
                        val var11: java.lang.Throwable = var5;

                        try {
                           throw var11;
                        } catch (var4: java.lang.Throwable) {
                           c.a(var13, var5);
                        }
                     }

                     c.a(var13, null);
                  }

                  return Uri.fromFile(var1);
               } else {
                  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
               }
            }
         },
         var3
      );
   }

   private fun createMP4FastStartUri(inputUri: Uri, compressedUri: Uri, mediaSourceSize: Long): Uri? {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
      //   at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:100)
      //   at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:106)
      //   at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:302)
      //   at java.base/java.util.Objects.checkIndex(Objects.java:385)
      //   at java.base/java.util.ArrayList.remove(ArrayList.java:551)
      //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.removeExceptionInstructionsEx(FinallyProcessor.java:1057)
      //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.insertSemaphore(FinallyProcessor.java:350)
      //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.iterateGraph(FinallyProcessor.java:99)
      //
      // Bytecode:
      // 00: aload 2
      // 01: invokevirtual android/net/Uri.getPath ()Ljava/lang/String;
      // 04: astore 8
      // 06: aload 8
      // 08: ifnonnull 0d
      // 0b: aconst_null
      // 0c: areturn
      // 0d: new java/io/File
      // 10: dup
      // 11: aload 8
      // 13: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 16: invokevirtual java/io/File.length ()J
      // 19: lload 3
      // 1a: lcmp
      // 1b: ifle 21
      // 1e: goto 23
      // 21: aload 2
      // 22: astore 1
      // 23: aload 0
      // 24: invokespecial com/discord/media/utils/MediaResolver.getResolver ()Landroid/content/ContentResolver;
      // 27: aload 1
      // 28: ldc "r"
      // 2a: invokevirtual android/content/ContentResolver.openFileDescriptor (Landroid/net/Uri;Ljava/lang/String;)Landroid/os/ParcelFileDescriptor;
      // 2d: astore 10
      // 2f: aload 10
      // 31: ifnonnull 36
      // 34: aconst_null
      // 35: areturn
      // 36: getstatic com/discord/media/utils/ContentResolverUtils.INSTANCE Lcom/discord/media/utils/ContentResolverUtils;
      // 39: aload 0
      // 3a: invokespecial com/discord/media/utils/MediaResolver.getResolver ()Landroid/content/ContentResolver;
      // 3d: aload 1
      // 3e: aconst_null
      // 3f: ldc "mp4"
      // 41: bipush 2
      // 42: aconst_null
      // 43: invokestatic com/discord/media/utils/ContentResolverUtils.createTempFile$default (Lcom/discord/media/utils/ContentResolverUtils;Landroid/content/ContentResolver;Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/io/File;
      // 46: astore 9
      // 48: bipush 0
      // 49: istore 5
      // 4b: aload 10
      // 4d: invokevirtual android/os/ParcelFileDescriptor.getFileDescriptor ()Ljava/io/FileDescriptor;
      // 50: aload 9
      // 52: invokestatic ua/b.a (Ljava/io/FileDescriptor;Ljava/io/File;)Z
      // 55: istore 6
      // 57: iload 6
      // 59: ifeq 6f
      // 5c: iload 6
      // 5e: istore 5
      // 60: aload 9
      // 62: invokestatic android/net/Uri.fromFile (Ljava/io/File;)Landroid/net/Uri;
      // 65: astore 7
      // 67: goto 72
      // 6a: astore 7
      // 6c: goto aa
      // 6f: aload 1
      // 70: astore 7
      // 72: aload 10
      // 74: invokevirtual android/os/ParcelFileDescriptor.close ()V
      // 77: iload 6
      // 79: ifeq 8c
      // 7c: new java/io/File
      // 7f: dup
      // 80: aload 8
      // 82: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 85: invokevirtual java/io/File.delete ()Z
      // 88: pop
      // 89: goto a7
      // 8c: aload 9
      // 8e: invokevirtual java/io/File.delete ()Z
      // 91: pop
      // 92: aload 1
      // 93: aload 2
      // 94: invokestatic kotlin/jvm/internal/q.c (Ljava/lang/Object;Ljava/lang/Object;)Z
      // 97: ifne a7
      // 9a: new java/io/File
      // 9d: dup
      // 9e: aload 8
      // a0: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // a3: invokevirtual java/io/File.delete ()Z
      // a6: pop
      // a7: aload 7
      // a9: areturn
      // aa: aload 10
      // ac: invokevirtual android/os/ParcelFileDescriptor.close ()V
      // af: iload 5
      // b1: ifne d2
      // b4: aload 9
      // b6: invokevirtual java/io/File.delete ()Z
      // b9: pop
      // ba: aload 1
      // bb: aload 2
      // bc: invokestatic kotlin/jvm/internal/q.c (Ljava/lang/Object;Ljava/lang/Object;)Z
      // bf: ifne df
      // c2: new java/io/File
      // c5: dup
      // c6: aload 8
      // c8: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // cb: invokevirtual java/io/File.delete ()Z
      // ce: pop
      // cf: goto df
      // d2: new java/io/File
      // d5: dup
      // d6: aload 8
      // d8: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // db: invokevirtual java/io/File.delete ()Z
      // de: pop
      // df: aload 7
      // e1: athrow
   }

   private suspend fun handleImage(inputUri: Uri, compressionQuality: Int, isLowQuality: Boolean, useOriginalIfSmaller: Boolean): Uri {
      var var9: Any;
      var var10: Uri;
      label94: {
         var10 = var1;
         if (var5 is <unrepresentable>) {
            var9 = var5 as <unrepresentable>;
            if (((var5 as <unrepresentable>).label and Integer.MIN_VALUE) != 0) {
               ((<unrepresentable>)var9).label = (var5 as <unrepresentable>).label + Integer.MIN_VALUE;
               break label94;
            }
         }

         var9 = new d(this, var5) {
            Object L$0;
            Object L$1;
            boolean Z$0;
            int label;
            Object result;
            final MediaResolver this$0;

            {
               super(var2);
               this.this$0 = var1;
            }

            public final Object invokeSuspend(Object var1) {
               this.result = var1;
               this.label |= Integer.MIN_VALUE;
               return MediaResolver.access$handleImage(this.this$0, null, 0, false, false, this);
            }
         };
      }

      label111: {
         label98: {
            var19 = ((<unrepresentable>)var9).result;
            val var11: Any = n8.b.e();
            val var14: MediaResolver;
            if (((<unrepresentable>)var9).label != 0) {
               if (((<unrepresentable>)var9).label != 1) {
                  if (((<unrepresentable>)var9).label != 2) {
                     if (((<unrepresentable>)var9).label != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                     }

                     s.b(var19);
                     return var19;
                  }

                  var15 = ((<unrepresentable>)var9).L$0 as File;
                  s.b(var19);
                  break label98;
               }

               var3 = ((<unrepresentable>)var9).Z$0;
               var10 = ((<unrepresentable>)var9).L$1 as Uri;
               var14 = ((<unrepresentable>)var9).L$0 as MediaResolver;
               s.b(var19);
            } else {
               s.b(var19);
               val var12: ContentResolver = this.getResolver();
               val var20: ContentResolverUtils = ContentResolverUtils.INSTANCE;
               val var25: Boolean;
               if (ContentResolverUtils.INSTANCE.isHeif(var12, var1) || var20.isJpeg(var12, var1) || var3 && var20.isPng(var12, var1)) {
                  var25 = true;
               } else {
                  var25 = false;
               }

               var var26: Boolean = false;
               if (var25) {
                  var26 = false;
                  if (var3) {
                     var26 = true;
                  }
               }

               if (!var25) {
                  ((<unrepresentable>)var9).label = 3;
                  val var17: Any = copyToFile$default(this, var1, null, (Continuation)var9, 2, null);
                  if (var17 === var11) {
                     return var11;
                  }

                  return var17;
               }

               val var13: O7.a = O7.a.a;
               val var30: Context = this.context;
               val var21: Function1 = new Function1(var2, var26, this, var1) {
                  final int $compressionQuality;
                  final Uri $inputUri;
                  final boolean $shouldResize;
                  final MediaResolver this$0;

                  {
                     super(1);
                     this.$compressionQuality = var1;
                     this.$shouldResize = var2;
                     this.this$0 = var3;
                     this.$inputUri = var4;
                  }

                  public final void invoke(Compression var1) {
                     q.h(var1, "$this$compress");
                     var1.a(new QualityAndResolutionConstraint(this.$compressionQuality, this.$shouldResize));
                     g.a(var1, CompressFormat.JPEG);
                     e.a(
                        var1,
                        ContentResolverUtils.createTempFile$default(
                           ContentResolverUtils.INSTANCE, MediaResolver.access$getResolver(this.this$0), this.$inputUri, null, "jpeg", 2, null
                        )
                     );
                  }
               };
               ((<unrepresentable>)var9).L$0 = this;
               ((<unrepresentable>)var9).L$1 = var1;
               var3 = var4;
               ((<unrepresentable>)var9).Z$0 = var4;
               ((<unrepresentable>)var9).label = 1;
               var19 = O7.a.b(var13, var30, var1, null, var21, (Continuation)var9, 4, null);
               if (var19 === var11) {
                  return var11;
               }

               var14 = this;
            }

            var22 = var19 as File;
            var14.onProgress.invoke(var10, kotlin.coroutines.jvm.internal.b.d(100));
            if (!var3) {
               break label111;
            }

            val var31: ContentResolverUtils = ContentResolverUtils.INSTANCE;
            if (!ContentResolverUtils.INSTANCE.isJpeg(var14.getResolver(), var10)) {
               break label111;
            }

            val var32: File = ContentResolverUtils.createTempFile$default(var31, var14.getResolver(), var10, null, "jpeg", 2, null);
            ((<unrepresentable>)var9).L$0 = var22;
            ((<unrepresentable>)var9).L$1 = null;
            ((<unrepresentable>)var9).label = 2;
            var9 = var14.copyToFile(var10, var32, (Continuation)var9);
            if (var9 === var11) {
               return var11;
            }

            var15 = var22;
            var19 = var9;
         }

         val var23: Uri = var19 as Uri;
         val var28: java.lang.String = (var19 as Uri).getPath();
         if (var28 == null) {
            return Uri.fromFile(var15);
         }

         val var29: File = new File(var28);
         if (var29.length() <= var15.length()) {
            var15.delete();
            var1 = var23;
         } else {
            var29.delete();
            var1 = Uri.fromFile(var15);
         }

         return var1;
      }

      return Uri.fromFile(var22);
   }

   private suspend fun handleVideo(inputUri: Uri, skipVideoTranscode: Boolean, encodingConfig: EncodingConfig?): Uri {
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
      // 000: aload 1
      // 001: astore 6
      // 003: aload 4
      // 005: instanceof com/discord/media/utils/MediaResolver$handleVideo$1
      // 008: ifeq 030
      // 00b: aload 4
      // 00d: checkcast com/discord/media/utils/MediaResolver$handleVideo$1
      // 010: astore 8
      // 012: aload 8
      // 014: getfield com/discord/media/utils/MediaResolver$handleVideo$1.label I
      // 017: istore 5
      // 019: iload 5
      // 01b: ldc_w -2147483648
      // 01e: iand
      // 01f: ifeq 030
      // 022: aload 8
      // 024: iload 5
      // 026: ldc_w -2147483648
      // 029: iadd
      // 02a: putfield com/discord/media/utils/MediaResolver$handleVideo$1.label I
      // 02d: goto 03f
      // 030: new com/discord/media/utils/MediaResolver$handleVideo$1
      // 033: dup
      // 034: aload 0
      // 035: aload 4
      // 037: invokespecial com/discord/media/utils/MediaResolver$handleVideo$1.<init> (Lcom/discord/media/utils/MediaResolver;Lkotlin/coroutines/Continuation;)V
      // 03a: astore 8
      // 03c: goto 02d
      // 03f: aload 8
      // 041: getfield com/discord/media/utils/MediaResolver$handleVideo$1.result Ljava/lang/Object;
      // 044: astore 4
      // 046: invokestatic n8/b.e ()Ljava/lang/Object;
      // 049: astore 12
      // 04b: aload 8
      // 04d: getfield com/discord/media/utils/MediaResolver$handleVideo$1.label I
      // 050: istore 5
      // 052: iload 5
      // 054: ifeq 0d6
      // 057: iload 5
      // 059: bipush 1
      // 05a: if_icmpeq 084
      // 05d: iload 5
      // 05f: bipush 2
      // 060: if_icmpeq 07c
      // 063: iload 5
      // 065: bipush 3
      // 066: if_icmpne 071
      // 069: aload 4
      // 06b: invokestatic h8/s.b (Ljava/lang/Object;)V
      // 06e: goto 342
      // 071: new java/lang/IllegalStateException
      // 074: dup
      // 075: ldc_w "call to 'resume' before 'invoke' with coroutine"
      // 078: invokespecial java/lang/IllegalStateException.<init> (Ljava/lang/String;)V
      // 07b: athrow
      // 07c: aload 4
      // 07e: invokestatic h8/s.b (Ljava/lang/Object;)V
      // 081: goto 317
      // 084: aload 8
      // 086: getfield com/discord/media/utils/MediaResolver$handleVideo$1.L$4 Ljava/lang/Object;
      // 089: checkcast com/discord/media/utils/MediaResolver
      // 08c: astore 10
      // 08e: aload 8
      // 090: getfield com/discord/media/utils/MediaResolver$handleVideo$1.L$3 Ljava/lang/Object;
      // 093: checkcast com/discord/media/utils/DiscordVideoMediaSource
      // 096: astore 9
      // 098: aload 8
      // 09a: getfield com/discord/media/utils/MediaResolver$handleVideo$1.L$2 Ljava/lang/Object;
      // 09d: checkcast android/net/Uri
      // 0a0: astore 7
      // 0a2: aload 8
      // 0a4: getfield com/discord/media/utils/MediaResolver$handleVideo$1.L$1 Ljava/lang/Object;
      // 0a7: checkcast android/net/Uri
      // 0aa: astore 6
      // 0ac: aload 8
      // 0ae: getfield com/discord/media/utils/MediaResolver$handleVideo$1.L$0 Ljava/lang/Object;
      // 0b1: checkcast com/discord/media/utils/MediaResolver
      // 0b4: astore 1
      // 0b5: aload 4
      // 0b7: invokestatic h8/s.b (Ljava/lang/Object;)V
      // 0ba: aload 7
      // 0bc: astore 3
      // 0bd: aload 9
      // 0bf: astore 7
      // 0c1: aload 4
      // 0c3: astore 9
      // 0c5: aload 10
      // 0c7: astore 4
      // 0c9: goto 220
      // 0cc: astore 3
      // 0cd: aload 1
      // 0ce: astore 4
      // 0d0: aload 7
      // 0d2: astore 1
      // 0d3: goto 288
      // 0d6: aload 4
      // 0d8: invokestatic h8/s.b (Ljava/lang/Object;)V
      // 0db: getstatic com/discord/media/utils/ContentResolverUtils.INSTANCE Lcom/discord/media/utils/ContentResolverUtils;
      // 0de: aload 0
      // 0df: invokespecial com/discord/media/utils/MediaResolver.getResolver ()Landroid/content/ContentResolver;
      // 0e2: aload 1
      // 0e3: aconst_null
      // 0e4: ldc "mp4"
      // 0e6: bipush 2
      // 0e7: aconst_null
      // 0e8: invokestatic com/discord/media/utils/ContentResolverUtils.createTempFile$default (Lcom/discord/media/utils/ContentResolverUtils;Landroid/content/ContentResolver;Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/io/File;
      // 0eb: invokestatic android/net/Uri.fromFile (Ljava/io/File;)Landroid/net/Uri;
      // 0ee: astore 9
      // 0f0: aload 9
      // 0f2: astore 4
      // 0f4: getstatic h8/r.k Lh8/r$a;
      // 0f7: astore 7
      // 0f9: new com/discord/media/utils/DiscordVideoMediaSource
      // 0fc: astore 7
      // 0fe: aload 7
      // 100: aload 0
      // 101: getfield com/discord/media/utils/MediaResolver.context Landroid/content/Context;
      // 104: aload 6
      // 106: invokespecial com/discord/media/utils/DiscordVideoMediaSource.<init> (Landroid/content/Context;Landroid/net/Uri;)V
      // 109: aload 7
      // 10b: invokestatic h8/r.b (Ljava/lang/Object;)Ljava/lang/Object;
      // 10e: astore 7
      // 110: goto 124
      // 113: astore 7
      // 115: getstatic h8/r.k Lh8/r$a;
      // 118: astore 10
      // 11a: aload 7
      // 11c: invokestatic h8/s.a (Ljava/lang/Throwable;)Ljava/lang/Object;
      // 11f: invokestatic h8/r.b (Ljava/lang/Object;)Ljava/lang/Object;
      // 122: astore 7
      // 124: aload 7
      // 126: invokestatic h8/r.e (Ljava/lang/Object;)Ljava/lang/Throwable;
      // 129: astore 10
      // 12b: aload 10
      // 12d: ifnull 172
      // 130: aload 10
      // 132: invokevirtual java/lang/Throwable.getMessage ()Ljava/lang/String;
      // 135: astore 11
      // 137: new java/lang/StringBuilder
      // 13a: dup
      // 13b: invokespecial java/lang/StringBuilder.<init> ()V
      // 13e: astore 13
      // 140: aload 13
      // 142: ldc_w "["
      // 145: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 148: pop
      // 149: aload 13
      // 14b: aload 10
      // 14d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 150: pop
      // 151: aload 13
      // 153: ldc_w "] Error creating source: "
      // 156: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 159: pop
      // 15a: aload 13
      // 15c: aload 11
      // 15e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 161: pop
      // 162: aload 0
      // 163: ldc_w "Media source error"
      // 166: aload 13
      // 168: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 16b: aload 6
      // 16d: aload 4
      // 16f: invokespecial com/discord/media/utils/MediaResolver.logMediaError (Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;Landroid/net/Uri;)V
      // 172: aload 7
      // 174: astore 10
      // 176: aload 7
      // 178: invokestatic h8/r.g (Ljava/lang/Object;)Z
      // 17b: ifeq 181
      // 17e: aconst_null
      // 17f: astore 10
      // 181: aload 10
      // 183: checkcast com/discord/media/utils/DiscordVideoMediaSource
      // 186: astore 7
      // 188: aload 7
      // 18a: ifnull 325
      // 18d: iload 2
      // 18e: ifeq 1a8
      // 191: aload 7
      // 193: astore 9
      // 195: aload 6
      // 197: astore 7
      // 199: aload 0
      // 19a: astore 1
      // 19b: aload 1
      // 19c: astore 3
      // 19d: aload 1
      // 19e: astore 10
      // 1a0: aload 3
      // 1a1: astore 1
      // 1a2: aload 4
      // 1a4: astore 3
      // 1a5: goto 233
      // 1a8: aload 3
      // 1a9: ifnull 27b
      // 1ac: getstatic com/discord/media/utils/Transcoder.INSTANCE Lcom/discord/media/utils/Transcoder;
      // 1af: astore 10
      // 1b1: aload 0
      // 1b2: aload 1
      // 1b3: invokespecial com/discord/media/utils/MediaResolver.getRequestId (Landroid/net/Uri;)Ljava/lang/String;
      // 1b6: astore 14
      // 1b8: aload 0
      // 1b9: getfield com/discord/media/utils/MediaResolver.context Landroid/content/Context;
      // 1bc: astore 11
      // 1be: new com/discord/media/utils/MediaResolver$handleVideo$2$compressedUri$2
      // 1c1: astore 13
      // 1c3: aload 13
      // 1c5: aload 0
      // 1c6: aload 6
      // 1c8: invokespecial com/discord/media/utils/MediaResolver$handleVideo$2$compressedUri$2.<init> (Lcom/discord/media/utils/MediaResolver;Landroid/net/Uri;)V
      // 1cb: aload 8
      // 1cd: aload 0
      // 1ce: putfield com/discord/media/utils/MediaResolver$handleVideo$1.L$0 Ljava/lang/Object;
      // 1d1: aload 8
      // 1d3: aload 6
      // 1d5: putfield com/discord/media/utils/MediaResolver$handleVideo$1.L$1 Ljava/lang/Object;
      // 1d8: aload 8
      // 1da: aload 4
      // 1dc: putfield com/discord/media/utils/MediaResolver$handleVideo$1.L$2 Ljava/lang/Object;
      // 1df: aload 8
      // 1e1: aload 7
      // 1e3: putfield com/discord/media/utils/MediaResolver$handleVideo$1.L$3 Ljava/lang/Object;
      // 1e6: aload 8
      // 1e8: aload 0
      // 1e9: putfield com/discord/media/utils/MediaResolver$handleVideo$1.L$4 Ljava/lang/Object;
      // 1ec: aload 8
      // 1ee: bipush 1
      // 1ef: putfield com/discord/media/utils/MediaResolver$handleVideo$1.label I
      // 1f2: aload 4
      // 1f4: astore 1
      // 1f5: aload 10
      // 1f7: aload 14
      // 1f9: aload 11
      // 1fb: aload 7
      // 1fd: aload 4
      // 1ff: aload 3
      // 200: aload 13
      // 202: aload 8
      // 204: invokevirtual com/discord/media/utils/Transcoder.convertCompress (Ljava/lang/String;Landroid/content/Context;Lcom/discord/media/utils/DiscordVideoMediaSource;Landroid/net/Uri;Lcom/discord/media/utils/EncodingConfig;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
      // 207: astore 3
      // 208: aload 3
      // 209: aload 12
      // 20b: if_acmpne 211
      // 20e: aload 12
      // 210: areturn
      // 211: aload 3
      // 212: astore 9
      // 214: aload 0
      // 215: astore 4
      // 217: aload 4
      // 219: astore 10
      // 21b: aload 1
      // 21c: astore 3
      // 21d: aload 10
      // 21f: astore 1
      // 220: aload 9
      // 222: checkcast android/net/Uri
      // 225: astore 11
      // 227: aload 7
      // 229: astore 9
      // 22b: aload 4
      // 22d: astore 10
      // 22f: aload 11
      // 231: astore 7
      // 233: aload 10
      // 235: aload 6
      // 237: aload 7
      // 239: aload 9
      // 23b: invokevirtual l7/a.getSize ()J
      // 23e: invokespecial com/discord/media/utils/MediaResolver.createMP4FastStartUri (Landroid/net/Uri;Landroid/net/Uri;J)Landroid/net/Uri;
      // 241: astore 4
      // 243: aload 4
      // 245: ifnonnull 24e
      // 248: aload 7
      // 24a: astore 1
      // 24b: goto 251
      // 24e: aload 4
      // 250: astore 1
      // 251: aload 1
      // 252: areturn
      // 253: astore 7
      // 255: aload 1
      // 256: astore 4
      // 258: aload 3
      // 259: astore 1
      // 25a: aload 7
      // 25c: astore 3
      // 25d: goto 288
      // 260: astore 7
      // 262: aload 1
      // 263: astore 4
      // 265: aload 3
      // 266: astore 1
      // 267: aload 7
      // 269: astore 3
      // 26a: goto 25d
      // 26d: astore 3
      // 26e: aload 0
      // 26f: astore 4
      // 271: aload 9
      // 273: astore 1
      // 274: goto 288
      // 277: astore 3
      // 278: goto 26e
      // 27b: new java/lang/IllegalArgumentException
      // 27e: astore 1
      // 27f: aload 1
      // 280: ldc_w "encodingConfig is required"
      // 283: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 286: aload 1
      // 287: athrow
      // 288: getstatic h8/r.k Lh8/r$a;
      // 28b: astore 7
      // 28d: aload 3
      // 28e: invokestatic h8/s.a (Ljava/lang/Throwable;)Ljava/lang/Object;
      // 291: invokestatic h8/r.b (Ljava/lang/Object;)Ljava/lang/Object;
      // 294: astore 3
      // 295: aload 3
      // 296: invokestatic h8/r.e (Ljava/lang/Object;)Ljava/lang/Throwable;
      // 299: astore 7
      // 29b: aload 7
      // 29d: ifnonnull 2a5
      // 2a0: aload 3
      // 2a1: astore 1
      // 2a2: goto 31d
      // 2a5: aload 7
      // 2a7: instanceof java/util/concurrent/CancellationException
      // 2aa: ifne 322
      // 2ad: aload 7
      // 2af: invokevirtual java/lang/Throwable.getMessage ()Ljava/lang/String;
      // 2b2: astore 7
      // 2b4: new java/lang/StringBuilder
      // 2b7: dup
      // 2b8: invokespecial java/lang/StringBuilder.<init> ()V
      // 2bb: astore 3
      // 2bc: aload 3
      // 2bd: ldc_w "Error compressing/converting video: "
      // 2c0: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2c3: pop
      // 2c4: aload 3
      // 2c5: aload 7
      // 2c7: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2ca: pop
      // 2cb: aload 4
      // 2cd: ldc_w "Media conversion error"
      // 2d0: aload 3
      // 2d1: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 2d4: aload 6
      // 2d6: aload 1
      // 2d7: invokespecial com/discord/media/utils/MediaResolver.logMediaError (Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;Landroid/net/Uri;)V
      // 2da: aload 8
      // 2dc: aconst_null
      // 2dd: putfield com/discord/media/utils/MediaResolver$handleVideo$1.L$0 Ljava/lang/Object;
      // 2e0: aload 8
      // 2e2: aconst_null
      // 2e3: putfield com/discord/media/utils/MediaResolver$handleVideo$1.L$1 Ljava/lang/Object;
      // 2e6: aload 8
      // 2e8: aconst_null
      // 2e9: putfield com/discord/media/utils/MediaResolver$handleVideo$1.L$2 Ljava/lang/Object;
      // 2ec: aload 8
      // 2ee: aconst_null
      // 2ef: putfield com/discord/media/utils/MediaResolver$handleVideo$1.L$3 Ljava/lang/Object;
      // 2f2: aload 8
      // 2f4: aconst_null
      // 2f5: putfield com/discord/media/utils/MediaResolver$handleVideo$1.L$4 Ljava/lang/Object;
      // 2f8: aload 8
      // 2fa: bipush 2
      // 2fb: putfield com/discord/media/utils/MediaResolver$handleVideo$1.label I
      // 2fe: aload 4
      // 300: aload 6
      // 302: aconst_null
      // 303: aload 8
      // 305: bipush 2
      // 306: aconst_null
      // 307: invokestatic com/discord/media/utils/MediaResolver.copyToFile$default (Lcom/discord/media/utils/MediaResolver;Landroid/net/Uri;Ljava/io/File;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
      // 30a: astore 1
      // 30b: aload 1
      // 30c: astore 4
      // 30e: aload 1
      // 30f: aload 12
      // 311: if_acmpne 317
      // 314: aload 12
      // 316: areturn
      // 317: aload 4
      // 319: checkcast android/net/Uri
      // 31c: astore 1
      // 31d: aload 1
      // 31e: checkcast android/net/Uri
      // 321: areturn
      // 322: aload 7
      // 324: athrow
      // 325: aload 8
      // 327: bipush 3
      // 328: putfield com/discord/media/utils/MediaResolver$handleVideo$1.label I
      // 32b: aload 0
      // 32c: aload 1
      // 32d: aconst_null
      // 32e: aload 8
      // 330: bipush 2
      // 331: aconst_null
      // 332: invokestatic com/discord/media/utils/MediaResolver.copyToFile$default (Lcom/discord/media/utils/MediaResolver;Landroid/net/Uri;Ljava/io/File;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
      // 335: astore 1
      // 336: aload 1
      // 337: astore 4
      // 339: aload 1
      // 33a: aload 12
      // 33c: if_acmpne 342
      // 33f: aload 12
      // 341: areturn
      // 342: aload 4
      // 344: areturn
   }

   private fun logMediaError(tag: String, message: String, inputUri: Uri, outputUri: Uri) {
      val var5: CrashReporting = CrashReporting.INSTANCE;
      CrashReporting.addBreadcrumb$default(
         CrashReporting.INSTANCE, var2, i8.q.l(new Pair[]{w.a("inputUri", var3.toString()), w.a("outputUri", var4.toString())}), null, 4, null
      );
      var5.captureMessage(var1, var2, CrashReporting.ErrorLevel.WARNING);
   }

   public fun cancel(inputUri: Uri) {
      q.h(var1, "inputUri");
      Transcoder.INSTANCE.cancel(this.getRequestId(var1));
   }

   public fun getMimeType(uri: Uri): String? {
      q.h(var1, "uri");
      return this.getResolver().getType(var1);
   }

   public fun handleVideoMetadata(inputUri: Uri): Map<String, Any> {
      q.h(var1, "inputUri");
      return new DiscordVideoMediaSource(this.context, var1).getMetadata();
   }

   internal suspend fun resolveToUri(
      inputUri: Uri,
      imageCompressionQuality: Int,
      isLowQuality: Boolean,
      skipVideoTranscode: Boolean,
      useOriginalIfSmaller: Boolean,
      encodingConfig: EncodingConfig?
   ): Uri {
      return f.g(
         K.b(),
         new Function2(this, var1, var4, var6, var2, var3, var5, null) {
            final EncodingConfig $encodingConfig;
            final int $imageCompressionQuality;
            final Uri $inputUri;
            final boolean $isLowQuality;
            final boolean $skipVideoTranscode;
            final boolean $useOriginalIfSmaller;
            int label;
            final MediaResolver this$0;

            {
               super(2, var8);
               this.this$0 = var1;
               this.$inputUri = var2x;
               this.$skipVideoTranscode = var3;
               this.$encodingConfig = var4;
               this.$imageCompressionQuality = var5;
               this.$isLowQuality = var6;
               this.$useOriginalIfSmaller = var7;
            }

            public final Continuation create(Object var1, Continuation var2) {
               return new <anonymous constructor>(
                  this.this$0,
                  this.$inputUri,
                  this.$skipVideoTranscode,
                  this.$encodingConfig,
                  this.$imageCompressionQuality,
                  this.$isLowQuality,
                  this.$useOriginalIfSmaller,
                  var2
               );
            }

            public final Object invoke(CoroutineScope var1, Continuation var2x) {
               return (this.create(var1, var2x) as <unrepresentable>).invokeSuspend(Unit.a);
            }

            public final Object invokeSuspend(Object var1) {
               val var6: Any = n8.b.e();
               if (this.label != 0) {
                  if (this.label != 1) {
                     if (this.label == 2) {
                        s.b(var1);
                        return var1 as Uri;
                     }

                     if (this.label == 3) {
                        s.b(var1);
                        return var1 as Uri;
                     }

                     if (this.label != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                     }

                     s.b(var1);
                     return var1 as Uri;
                  }

                  s.b(var1);
               } else {
                  s.b(var1);
                  var1 = this.this$0;
                  this.label = 1;
                  if (MediaResolver.access$checkFreeSpace(var1, this) === var6) {
                     return var6;
                  }
               }

               val var9: ContentResolverUtils = ContentResolverUtils.INSTANCE;
               if (ContentResolverUtils.INSTANCE.isVideo(MediaResolver.access$getResolver(this.this$0), this.$inputUri)) {
                  var var19: MediaResolver = this.this$0;
                  val var13: Uri = this.$inputUri;
                  val var15: Boolean = this.$skipVideoTranscode;
                  val var7: EncodingConfig = this.$encodingConfig;
                  this.label = 2;
                  var19 = (MediaResolver)MediaResolver.access$handleVideo(var19, var13, var15, var7, this);
                  return if (var19 === var6) var6 else var19 as Uri;
               } else if (var9.isImage(MediaResolver.access$getResolver(this.this$0), this.$inputUri)) {
                  var var17: MediaResolver = this.this$0;
                  val var12: Uri = this.$inputUri;
                  val var14: Int = this.$imageCompressionQuality;
                  val var4: Boolean = this.$isLowQuality;
                  val var3: Boolean = this.$useOriginalIfSmaller;
                  this.label = 3;
                  var17 = (MediaResolver)MediaResolver.access$handleImage(var17, var12, var14, var4, var3, this);
                  return if (var17 === var6) var6 else var17 as Uri;
               } else {
                  var var5: MediaResolver = this.this$0;
                  val var10: Uri = this.$inputUri;
                  this.label = 4;
                  var5 = (MediaResolver)MediaResolver.copyToFile$default(var5, var10, null, this, 2, null);
                  return if (var5 === var6) var6 else var5 as Uri;
               }
            }
         },
         var7
      );
   }

   private companion object {
      public const val FREE_SPACE_PERCENT: Double
      public final val HALF_DAY_MILLIS: Long
   }
}

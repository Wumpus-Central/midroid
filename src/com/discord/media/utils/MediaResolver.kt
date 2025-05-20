package com.discord.media.utils

import A8.c
import W7.e
import W7.g
import X9.K
import X9.f
import android.annotation.SuppressLint
import android.content.ContentResolver
import android.content.Context
import android.graphics.Bitmap.CompressFormat
import android.net.Uri
import com.discord.crash_reporting.CrashReporting
import id.zelory.compressor.constraint.Compression
import java.io.File
import java.io.InputStream
import kotlin.coroutines.Continuation
import kotlin.coroutines.jvm.internal.d
import kotlin.jvm.functions.Function1
import kotlin.jvm.functions.Function2
import kotlin.jvm.internal.q
import kotlinx.coroutines.CoroutineScope
import o8.s
import o8.w

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
               v8.b.e();
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
      return if (var2 === v8.b.e()) var2 else Unit.a;
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
               v8.b.e();
               label26:
               if (this.label == 0) {
                  s.b(var1);
                  var1 = this.$targetFile;
                  if (this.$targetFile == null) {
                     var1 = ContentResolverUtils.createTempFile$default(
                        ContentResolverUtils.INSTANCE, MediaResolver.access$getResolver(this.this$0), this.$uri, null, null, 6, null
                     );
                  }

                  val var11: Uri = this.$uri;
                  val var12: InputStream = MediaResolver.access$getResolver(this.this$0).openInputStream(var11);
                  if (var12 != null) {
                     try {
                        q.e(var12);
                        FileUtilsKt.writeTo(var12, var1);
                     } catch (var5: java.lang.Throwable) {
                        val var13: java.lang.Throwable = var5;

                        try {
                           throw var13;
                        } catch (var4: java.lang.Throwable) {
                           c.a(var12, var5);
                        }
                     }

                     c.a(var12, null);
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
      // 2d: astore 9
      // 2f: aload 9
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
      // 46: astore 10
      // 48: bipush 0
      // 49: istore 5
      // 4b: aload 9
      // 4d: invokevirtual android/os/ParcelFileDescriptor.getFileDescriptor ()Ljava/io/FileDescriptor;
      // 50: aload 10
      // 52: invokestatic Ba/b.a (Ljava/io/FileDescriptor;Ljava/io/File;)Z
      // 55: istore 6
      // 57: iload 6
      // 59: ifeq 6f
      // 5c: iload 6
      // 5e: istore 5
      // 60: aload 10
      // 62: invokestatic android/net/Uri.fromFile (Ljava/io/File;)Landroid/net/Uri;
      // 65: astore 7
      // 67: goto 72
      // 6a: astore 7
      // 6c: goto aa
      // 6f: aload 1
      // 70: astore 7
      // 72: aload 9
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
      // 8c: aload 10
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
      // aa: aload 9
      // ac: invokevirtual android/os/ParcelFileDescriptor.close ()V
      // af: iload 5
      // b1: ifne d2
      // b4: aload 10
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
            val var11: Any = v8.b.e();
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
               val var20: ContentResolver = this.getResolver();
               val var12: ContentResolverUtils = ContentResolverUtils.INSTANCE;
               val var25: Boolean;
               if (ContentResolverUtils.INSTANCE.isHeif(var20, var1) || var12.isJpeg(var20, var1) || var3 && var12.isPng(var20, var1)) {
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

               val var30: V7.a = V7.a.a;
               val var21: Context = this.context;
               val var13: Function1 = new Function1(var2, var26, this, var1) {
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
               ((<unrepresentable>)var9).Z$0 = var4;
               ((<unrepresentable>)var9).label = 1;
               var19 = V7.a.b(var30, var21, var1, null, var13, (Continuation)var9, 4, null);
               if (var19 === var11) {
                  return var11;
               }

               var14 = this;
               var3 = var4;
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
      // 046: invokestatic v8/b.e ()Ljava/lang/Object;
      // 049: astore 12
      // 04b: aload 8
      // 04d: getfield com/discord/media/utils/MediaResolver$handleVideo$1.label I
      // 050: istore 5
      // 052: iload 5
      // 054: ifeq 0de
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
      // 06b: invokestatic o8/s.b (Ljava/lang/Object;)V
      // 06e: goto 34a
      // 071: new java/lang/IllegalStateException
      // 074: dup
      // 075: ldc_w "call to 'resume' before 'invoke' with coroutine"
      // 078: invokespecial java/lang/IllegalStateException.<init> (Ljava/lang/String;)V
      // 07b: athrow
      // 07c: aload 4
      // 07e: invokestatic o8/s.b (Ljava/lang/Object;)V
      // 081: goto 31f
      // 084: aload 8
      // 086: getfield com/discord/media/utils/MediaResolver$handleVideo$1.L$4 Ljava/lang/Object;
      // 089: checkcast com/discord/media/utils/MediaResolver
      // 08c: astore 10
      // 08e: aload 8
      // 090: getfield com/discord/media/utils/MediaResolver$handleVideo$1.L$3 Ljava/lang/Object;
      // 093: checkcast com/discord/media/utils/DiscordVideoMediaSource
      // 096: astore 11
      // 098: aload 8
      // 09a: getfield com/discord/media/utils/MediaResolver$handleVideo$1.L$2 Ljava/lang/Object;
      // 09d: checkcast android/net/Uri
      // 0a0: astore 6
      // 0a2: aload 8
      // 0a4: getfield com/discord/media/utils/MediaResolver$handleVideo$1.L$1 Ljava/lang/Object;
      // 0a7: checkcast android/net/Uri
      // 0aa: astore 7
      // 0ac: aload 8
      // 0ae: getfield com/discord/media/utils/MediaResolver$handleVideo$1.L$0 Ljava/lang/Object;
      // 0b1: checkcast com/discord/media/utils/MediaResolver
      // 0b4: astore 1
      // 0b5: aload 4
      // 0b7: invokestatic o8/s.b (Ljava/lang/Object;)V
      // 0ba: aload 6
      // 0bc: astore 3
      // 0bd: aload 7
      // 0bf: astore 6
      // 0c1: aload 4
      // 0c3: astore 9
      // 0c5: aload 10
      // 0c7: astore 4
      // 0c9: aload 11
      // 0cb: astore 7
      // 0cd: goto 228
      // 0d0: astore 3
      // 0d1: aload 1
      // 0d2: astore 4
      // 0d4: aload 6
      // 0d6: astore 1
      // 0d7: aload 7
      // 0d9: astore 6
      // 0db: goto 290
      // 0de: aload 4
      // 0e0: invokestatic o8/s.b (Ljava/lang/Object;)V
      // 0e3: getstatic com/discord/media/utils/ContentResolverUtils.INSTANCE Lcom/discord/media/utils/ContentResolverUtils;
      // 0e6: aload 0
      // 0e7: invokespecial com/discord/media/utils/MediaResolver.getResolver ()Landroid/content/ContentResolver;
      // 0ea: aload 1
      // 0eb: aconst_null
      // 0ec: ldc "mp4"
      // 0ee: bipush 2
      // 0ef: aconst_null
      // 0f0: invokestatic com/discord/media/utils/ContentResolverUtils.createTempFile$default (Lcom/discord/media/utils/ContentResolverUtils;Landroid/content/ContentResolver;Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/io/File;
      // 0f3: invokestatic android/net/Uri.fromFile (Ljava/io/File;)Landroid/net/Uri;
      // 0f6: astore 9
      // 0f8: aload 9
      // 0fa: astore 4
      // 0fc: getstatic o8/r.k Lo8/r$a;
      // 0ff: astore 7
      // 101: new com/discord/media/utils/DiscordVideoMediaSource
      // 104: astore 7
      // 106: aload 7
      // 108: aload 0
      // 109: getfield com/discord/media/utils/MediaResolver.context Landroid/content/Context;
      // 10c: aload 6
      // 10e: invokespecial com/discord/media/utils/DiscordVideoMediaSource.<init> (Landroid/content/Context;Landroid/net/Uri;)V
      // 111: aload 7
      // 113: invokestatic o8/r.b (Ljava/lang/Object;)Ljava/lang/Object;
      // 116: astore 7
      // 118: goto 12c
      // 11b: astore 10
      // 11d: getstatic o8/r.k Lo8/r$a;
      // 120: astore 7
      // 122: aload 10
      // 124: invokestatic o8/s.a (Ljava/lang/Throwable;)Ljava/lang/Object;
      // 127: invokestatic o8/r.b (Ljava/lang/Object;)Ljava/lang/Object;
      // 12a: astore 7
      // 12c: aload 7
      // 12e: invokestatic o8/r.e (Ljava/lang/Object;)Ljava/lang/Throwable;
      // 131: astore 11
      // 133: aload 11
      // 135: ifnull 17a
      // 138: aload 11
      // 13a: invokevirtual java/lang/Throwable.getMessage ()Ljava/lang/String;
      // 13d: astore 10
      // 13f: new java/lang/StringBuilder
      // 142: dup
      // 143: invokespecial java/lang/StringBuilder.<init> ()V
      // 146: astore 13
      // 148: aload 13
      // 14a: ldc_w "["
      // 14d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 150: pop
      // 151: aload 13
      // 153: aload 11
      // 155: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 158: pop
      // 159: aload 13
      // 15b: ldc_w "] Error creating source: "
      // 15e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 161: pop
      // 162: aload 13
      // 164: aload 10
      // 166: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 169: pop
      // 16a: aload 0
      // 16b: ldc_w "Media source error"
      // 16e: aload 13
      // 170: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 173: aload 6
      // 175: aload 4
      // 177: invokespecial com/discord/media/utils/MediaResolver.logMediaError (Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;Landroid/net/Uri;)V
      // 17a: aload 7
      // 17c: astore 10
      // 17e: aload 7
      // 180: invokestatic o8/r.g (Ljava/lang/Object;)Z
      // 183: ifeq 189
      // 186: aconst_null
      // 187: astore 10
      // 189: aload 10
      // 18b: checkcast com/discord/media/utils/DiscordVideoMediaSource
      // 18e: astore 7
      // 190: aload 7
      // 192: ifnull 32d
      // 195: iload 2
      // 196: ifeq 1b0
      // 199: aload 7
      // 19b: astore 10
      // 19d: aload 6
      // 19f: astore 7
      // 1a1: aload 0
      // 1a2: astore 1
      // 1a3: aload 1
      // 1a4: astore 3
      // 1a5: aload 1
      // 1a6: astore 9
      // 1a8: aload 3
      // 1a9: astore 1
      // 1aa: aload 4
      // 1ac: astore 3
      // 1ad: goto 23b
      // 1b0: aload 3
      // 1b1: ifnull 283
      // 1b4: getstatic com/discord/media/utils/Transcoder.INSTANCE Lcom/discord/media/utils/Transcoder;
      // 1b7: astore 10
      // 1b9: aload 0
      // 1ba: aload 1
      // 1bb: invokespecial com/discord/media/utils/MediaResolver.getRequestId (Landroid/net/Uri;)Ljava/lang/String;
      // 1be: astore 14
      // 1c0: aload 0
      // 1c1: getfield com/discord/media/utils/MediaResolver.context Landroid/content/Context;
      // 1c4: astore 11
      // 1c6: new com/discord/media/utils/MediaResolver$handleVideo$2$compressedUri$2
      // 1c9: astore 13
      // 1cb: aload 13
      // 1cd: aload 0
      // 1ce: aload 6
      // 1d0: invokespecial com/discord/media/utils/MediaResolver$handleVideo$2$compressedUri$2.<init> (Lcom/discord/media/utils/MediaResolver;Landroid/net/Uri;)V
      // 1d3: aload 8
      // 1d5: aload 0
      // 1d6: putfield com/discord/media/utils/MediaResolver$handleVideo$1.L$0 Ljava/lang/Object;
      // 1d9: aload 8
      // 1db: aload 6
      // 1dd: putfield com/discord/media/utils/MediaResolver$handleVideo$1.L$1 Ljava/lang/Object;
      // 1e0: aload 8
      // 1e2: aload 4
      // 1e4: putfield com/discord/media/utils/MediaResolver$handleVideo$1.L$2 Ljava/lang/Object;
      // 1e7: aload 8
      // 1e9: aload 7
      // 1eb: putfield com/discord/media/utils/MediaResolver$handleVideo$1.L$3 Ljava/lang/Object;
      // 1ee: aload 8
      // 1f0: aload 0
      // 1f1: putfield com/discord/media/utils/MediaResolver$handleVideo$1.L$4 Ljava/lang/Object;
      // 1f4: aload 8
      // 1f6: bipush 1
      // 1f7: putfield com/discord/media/utils/MediaResolver$handleVideo$1.label I
      // 1fa: aload 4
      // 1fc: astore 1
      // 1fd: aload 10
      // 1ff: aload 14
      // 201: aload 11
      // 203: aload 7
      // 205: aload 4
      // 207: aload 3
      // 208: aload 13
      // 20a: aload 8
      // 20c: invokevirtual com/discord/media/utils/Transcoder.convertCompress (Ljava/lang/String;Landroid/content/Context;Lcom/discord/media/utils/DiscordVideoMediaSource;Landroid/net/Uri;Lcom/discord/media/utils/EncodingConfig;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
      // 20f: astore 3
      // 210: aload 3
      // 211: aload 12
      // 213: if_acmpne 219
      // 216: aload 12
      // 218: areturn
      // 219: aload 3
      // 21a: astore 9
      // 21c: aload 0
      // 21d: astore 4
      // 21f: aload 4
      // 221: astore 10
      // 223: aload 1
      // 224: astore 3
      // 225: aload 10
      // 227: astore 1
      // 228: aload 9
      // 22a: checkcast android/net/Uri
      // 22d: astore 11
      // 22f: aload 7
      // 231: astore 10
      // 233: aload 4
      // 235: astore 9
      // 237: aload 11
      // 239: astore 7
      // 23b: aload 9
      // 23d: aload 6
      // 23f: aload 7
      // 241: aload 10
      // 243: invokevirtual s7/a.getSize ()J
      // 246: invokespecial com/discord/media/utils/MediaResolver.createMP4FastStartUri (Landroid/net/Uri;Landroid/net/Uri;J)Landroid/net/Uri;
      // 249: astore 4
      // 24b: aload 4
      // 24d: ifnonnull 256
      // 250: aload 7
      // 252: astore 1
      // 253: goto 259
      // 256: aload 4
      // 258: astore 1
      // 259: aload 1
      // 25a: areturn
      // 25b: astore 7
      // 25d: aload 1
      // 25e: astore 4
      // 260: aload 3
      // 261: astore 1
      // 262: aload 7
      // 264: astore 3
      // 265: goto 290
      // 268: astore 7
      // 26a: aload 1
      // 26b: astore 4
      // 26d: aload 3
      // 26e: astore 1
      // 26f: aload 7
      // 271: astore 3
      // 272: goto 265
      // 275: astore 3
      // 276: aload 0
      // 277: astore 4
      // 279: aload 9
      // 27b: astore 1
      // 27c: goto 290
      // 27f: astore 3
      // 280: goto 276
      // 283: new java/lang/IllegalArgumentException
      // 286: astore 1
      // 287: aload 1
      // 288: ldc_w "encodingConfig is required"
      // 28b: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 28e: aload 1
      // 28f: athrow
      // 290: getstatic o8/r.k Lo8/r$a;
      // 293: astore 7
      // 295: aload 3
      // 296: invokestatic o8/s.a (Ljava/lang/Throwable;)Ljava/lang/Object;
      // 299: invokestatic o8/r.b (Ljava/lang/Object;)Ljava/lang/Object;
      // 29c: astore 3
      // 29d: aload 3
      // 29e: invokestatic o8/r.e (Ljava/lang/Object;)Ljava/lang/Throwable;
      // 2a1: astore 7
      // 2a3: aload 7
      // 2a5: ifnonnull 2ad
      // 2a8: aload 3
      // 2a9: astore 1
      // 2aa: goto 325
      // 2ad: aload 7
      // 2af: instanceof java/util/concurrent/CancellationException
      // 2b2: ifne 32a
      // 2b5: aload 7
      // 2b7: invokevirtual java/lang/Throwable.getMessage ()Ljava/lang/String;
      // 2ba: astore 7
      // 2bc: new java/lang/StringBuilder
      // 2bf: dup
      // 2c0: invokespecial java/lang/StringBuilder.<init> ()V
      // 2c3: astore 3
      // 2c4: aload 3
      // 2c5: ldc_w "Error compressing/converting video: "
      // 2c8: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2cb: pop
      // 2cc: aload 3
      // 2cd: aload 7
      // 2cf: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2d2: pop
      // 2d3: aload 4
      // 2d5: ldc_w "Media conversion error"
      // 2d8: aload 3
      // 2d9: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 2dc: aload 6
      // 2de: aload 1
      // 2df: invokespecial com/discord/media/utils/MediaResolver.logMediaError (Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;Landroid/net/Uri;)V
      // 2e2: aload 8
      // 2e4: aconst_null
      // 2e5: putfield com/discord/media/utils/MediaResolver$handleVideo$1.L$0 Ljava/lang/Object;
      // 2e8: aload 8
      // 2ea: aconst_null
      // 2eb: putfield com/discord/media/utils/MediaResolver$handleVideo$1.L$1 Ljava/lang/Object;
      // 2ee: aload 8
      // 2f0: aconst_null
      // 2f1: putfield com/discord/media/utils/MediaResolver$handleVideo$1.L$2 Ljava/lang/Object;
      // 2f4: aload 8
      // 2f6: aconst_null
      // 2f7: putfield com/discord/media/utils/MediaResolver$handleVideo$1.L$3 Ljava/lang/Object;
      // 2fa: aload 8
      // 2fc: aconst_null
      // 2fd: putfield com/discord/media/utils/MediaResolver$handleVideo$1.L$4 Ljava/lang/Object;
      // 300: aload 8
      // 302: bipush 2
      // 303: putfield com/discord/media/utils/MediaResolver$handleVideo$1.label I
      // 306: aload 4
      // 308: aload 6
      // 30a: aconst_null
      // 30b: aload 8
      // 30d: bipush 2
      // 30e: aconst_null
      // 30f: invokestatic com/discord/media/utils/MediaResolver.copyToFile$default (Lcom/discord/media/utils/MediaResolver;Landroid/net/Uri;Ljava/io/File;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
      // 312: astore 1
      // 313: aload 1
      // 314: astore 4
      // 316: aload 1
      // 317: aload 12
      // 319: if_acmpne 31f
      // 31c: aload 12
      // 31e: areturn
      // 31f: aload 4
      // 321: checkcast android/net/Uri
      // 324: astore 1
      // 325: aload 1
      // 326: checkcast android/net/Uri
      // 329: areturn
      // 32a: aload 7
      // 32c: athrow
      // 32d: aload 8
      // 32f: bipush 3
      // 330: putfield com/discord/media/utils/MediaResolver$handleVideo$1.label I
      // 333: aload 0
      // 334: aload 1
      // 335: aconst_null
      // 336: aload 8
      // 338: bipush 2
      // 339: aconst_null
      // 33a: invokestatic com/discord/media/utils/MediaResolver.copyToFile$default (Lcom/discord/media/utils/MediaResolver;Landroid/net/Uri;Ljava/io/File;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
      // 33d: astore 1
      // 33e: aload 1
      // 33f: astore 4
      // 341: aload 1
      // 342: aload 12
      // 344: if_acmpne 34a
      // 347: aload 12
      // 349: areturn
      // 34a: aload 4
      // 34c: areturn
   }

   private fun logMediaError(tag: String, message: String, inputUri: Uri, outputUri: Uri) {
      val var5: CrashReporting = CrashReporting.INSTANCE;
      CrashReporting.addBreadcrumb$default(
         CrashReporting.INSTANCE, var2, p8.q.l(new Pair[]{w.a("inputUri", var3.toString()), w.a("outputUri", var4.toString())}), null, 4, null
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
               val var6: Any = v8.b.e();
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
                  var1 = this.this$0;
                  var var19: Uri = this.$inputUri;
                  val var15: Boolean = this.$skipVideoTranscode;
                  val var7: EncodingConfig = this.$encodingConfig;
                  this.label = 2;
                  var19 = (Uri)MediaResolver.access$handleVideo(var1, var19, var15, var7, this);
                  return if (var19 === var6) var6 else var19;
               } else if (var9.isImage(MediaResolver.access$getResolver(this.this$0), this.$inputUri)) {
                  var var17: MediaResolver = this.this$0;
                  val var12: Uri = this.$inputUri;
                  val var14: Int = this.$imageCompressionQuality;
                  val var3: Boolean = this.$isLowQuality;
                  val var4: Boolean = this.$useOriginalIfSmaller;
                  this.label = 3;
                  var17 = (MediaResolver)MediaResolver.access$handleImage(var17, var12, var14, var3, var4, this);
                  return if (var17 === var6) var6 else var17 as Uri;
               } else {
                  var1 = this.this$0;
                  var var5: Uri = this.$inputUri;
                  this.label = 4;
                  var5 = (Uri)MediaResolver.copyToFile$default(var1, var5, null, this, 2, null);
                  return if (var5 === var6) var6 else var5;
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

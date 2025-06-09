package com.discord.media.utils

import Aa.K
import R8.s
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
import kotlin.jvm.functions.Function2
import kotlin.jvm.internal.q
import kotlinx.coroutines.CoroutineScope

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
      val var2: Any = Aa.f.g(
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
               Y8.b.e();
               if (this.label != 0) {
                  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
               } else {
                  kotlin.c.b(var1);
                  if ((double)MediaResolver.access$getCacheDir$p(this.this$0).getUsableSpace()
                        / MediaResolver.access$getCacheDir$p(this.this$0).getTotalSpace()
                     < 0.2) {
                     val var6: Long = System.currentTimeMillis() - MediaResolver.access$getCompanion$p().getHALF_DAY_MILLIS();
                     var1 = MediaResolver.access$getCacheDir$p(this.this$0).listFiles();
                     if (var1 != null) {
                        val var4: Int = var1.length;

                        for (int var2x = 0; var2x < var4; var2x++) {
                           var var8: File = var1[var2x];
                           if (var1[var2x].isFile()) {
                              val var9: java.lang.String = var8.getName();
                              q.g(var9, "getName(...)");
                              if (h.I(var9, "temp_", false, 2, null) && var8.lastModified() < var6) {
                                 var8.delete();
                                 continue;
                              }
                           }

                           if (var8.isDirectory() && q.c(var8.getName(), "compressor")) {
                              val var12: Array<File> = var8.listFiles();
                              if (var12 != null) {
                                 val var5: Int = var12.length;

                                 for (int var3 = 0; var3 < var5; var3++) {
                                    var8 = var12[var3];
                                    if (var12[var3].isFile() && var12[var3].lastModified() < var6) {
                                       var8.delete();
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
      return if (var2 === Y8.b.e()) var2 else Unit.a;
   }

   private suspend fun copyToFile(uri: Uri, targetFile: File? = ...): Uri {
      return Aa.f.g(
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
               Y8.b.e();
               label26:
               if (this.label == 0) {
                  kotlin.c.b(var1);
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
                        FileUtilsKt.writeTo(var12, var1);
                     } catch (var5: java.lang.Throwable) {
                        val var13: java.lang.Throwable = var5;

                        try {
                           throw var13;
                        } catch (var4: java.lang.Throwable) {
                           d9.c.a(var12, var5);
                        }
                     }

                     d9.c.a(var12, null);
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
      // 52: invokestatic eb/b.a (Ljava/io/FileDescriptor;Ljava/io/File;)Z
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

         var9 = new kotlin.coroutines.jvm.internal.d(this, var5) {
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
            var18 = ((<unrepresentable>)var9).result;
            val var11: Any = Y8.b.e();
            val var14: MediaResolver;
            if (((<unrepresentable>)var9).label != 0) {
               if (((<unrepresentable>)var9).label != 1) {
                  if (((<unrepresentable>)var9).label != 2) {
                     if (((<unrepresentable>)var9).label != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                     }

                     kotlin.c.b(var18);
                     return var18;
                  }

                  var15 = ((<unrepresentable>)var9).L$0 as File;
                  kotlin.c.b(var18);
                  break label98;
               }

               var4 = ((<unrepresentable>)var9).Z$0;
               var10 = ((<unrepresentable>)var9).L$1 as Uri;
               var14 = ((<unrepresentable>)var9).L$0 as MediaResolver;
               kotlin.c.b(var18);
            } else {
               kotlin.c.b(var18);
               val var19: ContentResolver = this.getResolver();
               val var12: ContentResolverUtils = ContentResolverUtils.INSTANCE;
               val var24: Boolean;
               if (ContentResolverUtils.INSTANCE.isHeif(var19, var1) || var12.isJpeg(var19, var1) || var3 && var12.isPng(var19, var1)) {
                  var24 = true;
               } else {
                  var24 = false;
               }

               var var25: Boolean = false;
               if (var24) {
                  var25 = false;
                  if (var3) {
                     var25 = true;
                  }
               }

               if (!var24) {
                  ((<unrepresentable>)var9).label = 3;
                  val var17: Any = copyToFile$default(this, var1, null, (Continuation)var9, 2, null);
                  if (var17 === var11) {
                     return var11;
                  }

                  return var17;
               }

               val var29: y8.a = y8.a.a;
               val var13: Context = this.context;
               val var20: e = new e(var2, var25, this, var1);
               ((<unrepresentable>)var9).L$0 = this;
               ((<unrepresentable>)var9).L$1 = var1;
               ((<unrepresentable>)var9).Z$0 = var4;
               ((<unrepresentable>)var9).label = 1;
               var18 = y8.a.b(var29, var13, var1, null, var20, (Continuation)var9, 4, null);
               if (var18 === var11) {
                  return var11;
               }

               var14 = this;
            }

            var21 = var18 as File;
            var14.onProgress.invoke(var10, kotlin.coroutines.jvm.internal.b.d(100));
            if (!var4) {
               break label111;
            }

            val var30: ContentResolverUtils = ContentResolverUtils.INSTANCE;
            if (!ContentResolverUtils.INSTANCE.isJpeg(var14.getResolver(), var10)) {
               break label111;
            }

            val var31: File = ContentResolverUtils.createTempFile$default(var30, var14.getResolver(), var10, null, "jpeg", 2, null);
            ((<unrepresentable>)var9).L$0 = var21;
            ((<unrepresentable>)var9).L$1 = null;
            ((<unrepresentable>)var9).label = 2;
            var9 = var14.copyToFile(var10, var31, (Continuation)var9);
            if (var9 === var11) {
               return var11;
            }

            var15 = var21;
            var18 = var9;
         }

         val var22: Uri = var18 as Uri;
         val var27: java.lang.String = (var18 as Uri).getPath();
         if (var27 == null) {
            return Uri.fromFile(var15);
         }

         val var28: File = new File(var27);
         if (var28.length() <= var15.length()) {
            var15.delete();
            var1 = var22;
         } else {
            var28.delete();
            var1 = Uri.fromFile(var15);
         }

         return var1;
      }

      return Uri.fromFile(var21);
   }

   @JvmStatic
   fun `handleImage$lambda$7`(var0: Int, var1: Boolean, var2: MediaResolver, var3: Uri, var4: Compression): Unit {
      q.h(var4, "$this$compress");
      var4.a(new QualityAndResolutionConstraint(var0, var1));
      z8.g.a(var4, CompressFormat.JPEG);
      z8.e.a(var4, ContentResolverUtils.createTempFile$default(ContentResolverUtils.INSTANCE, var2.getResolver(), var3, null, "jpeg", 2, null));
      return Unit.a;
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
      // 046: invokestatic Y8/b.e ()Ljava/lang/Object;
      // 049: astore 12
      // 04b: aload 8
      // 04d: getfield com/discord/media/utils/MediaResolver$handleVideo$1.label I
      // 050: istore 5
      // 052: iload 5
      // 054: ifeq 0da
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
      // 06b: invokestatic kotlin/c.b (Ljava/lang/Object;)V
      // 06e: goto 345
      // 071: new java/lang/IllegalStateException
      // 074: dup
      // 075: ldc_w "call to 'resume' before 'invoke' with coroutine"
      // 078: invokespecial java/lang/IllegalStateException.<init> (Ljava/lang/String;)V
      // 07b: athrow
      // 07c: aload 4
      // 07e: invokestatic kotlin/c.b (Ljava/lang/Object;)V
      // 081: goto 31a
      // 084: aload 8
      // 086: getfield com/discord/media/utils/MediaResolver$handleVideo$1.L$4 Ljava/lang/Object;
      // 089: checkcast com/discord/media/utils/MediaResolver
      // 08c: astore 9
      // 08e: aload 8
      // 090: getfield com/discord/media/utils/MediaResolver$handleVideo$1.L$3 Ljava/lang/Object;
      // 093: checkcast com/discord/media/utils/DiscordVideoMediaSource
      // 096: astore 10
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
      // 0b7: invokestatic kotlin/c.b (Ljava/lang/Object;)V
      // 0ba: aload 7
      // 0bc: astore 3
      // 0bd: aload 9
      // 0bf: astore 7
      // 0c1: aload 4
      // 0c3: astore 9
      // 0c5: aload 7
      // 0c7: astore 4
      // 0c9: aload 10
      // 0cb: astore 7
      // 0cd: goto 224
      // 0d0: astore 3
      // 0d1: aload 1
      // 0d2: astore 4
      // 0d4: aload 7
      // 0d6: astore 1
      // 0d7: goto 28b
      // 0da: aload 4
      // 0dc: invokestatic kotlin/c.b (Ljava/lang/Object;)V
      // 0df: getstatic com/discord/media/utils/ContentResolverUtils.INSTANCE Lcom/discord/media/utils/ContentResolverUtils;
      // 0e2: aload 0
      // 0e3: invokespecial com/discord/media/utils/MediaResolver.getResolver ()Landroid/content/ContentResolver;
      // 0e6: aload 1
      // 0e7: aconst_null
      // 0e8: ldc "mp4"
      // 0ea: bipush 2
      // 0eb: aconst_null
      // 0ec: invokestatic com/discord/media/utils/ContentResolverUtils.createTempFile$default (Lcom/discord/media/utils/ContentResolverUtils;Landroid/content/ContentResolver;Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/io/File;
      // 0ef: invokestatic android/net/Uri.fromFile (Ljava/io/File;)Landroid/net/Uri;
      // 0f2: astore 9
      // 0f4: aload 9
      // 0f6: astore 4
      // 0f8: getstatic kotlin/Result.k Lkotlin/Result$a;
      // 0fb: astore 7
      // 0fd: new com/discord/media/utils/DiscordVideoMediaSource
      // 100: astore 7
      // 102: aload 7
      // 104: aload 0
      // 105: getfield com/discord/media/utils/MediaResolver.context Landroid/content/Context;
      // 108: aload 6
      // 10a: invokespecial com/discord/media/utils/DiscordVideoMediaSource.<init> (Landroid/content/Context;Landroid/net/Uri;)V
      // 10d: aload 7
      // 10f: invokestatic kotlin/Result.b (Ljava/lang/Object;)Ljava/lang/Object;
      // 112: astore 7
      // 114: goto 128
      // 117: astore 7
      // 119: getstatic kotlin/Result.k Lkotlin/Result$a;
      // 11c: astore 10
      // 11e: aload 7
      // 120: invokestatic kotlin/c.a (Ljava/lang/Throwable;)Ljava/lang/Object;
      // 123: invokestatic kotlin/Result.b (Ljava/lang/Object;)Ljava/lang/Object;
      // 126: astore 7
      // 128: aload 7
      // 12a: invokestatic kotlin/Result.e (Ljava/lang/Object;)Ljava/lang/Throwable;
      // 12d: astore 13
      // 12f: aload 13
      // 131: ifnull 176
      // 134: aload 13
      // 136: invokevirtual java/lang/Throwable.getMessage ()Ljava/lang/String;
      // 139: astore 11
      // 13b: new java/lang/StringBuilder
      // 13e: dup
      // 13f: invokespecial java/lang/StringBuilder.<init> ()V
      // 142: astore 10
      // 144: aload 10
      // 146: ldc_w "["
      // 149: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 14c: pop
      // 14d: aload 10
      // 14f: aload 13
      // 151: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 154: pop
      // 155: aload 10
      // 157: ldc_w "] Error creating source: "
      // 15a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 15d: pop
      // 15e: aload 10
      // 160: aload 11
      // 162: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 165: pop
      // 166: aload 0
      // 167: ldc_w "Media source error"
      // 16a: aload 10
      // 16c: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 16f: aload 6
      // 171: aload 4
      // 173: invokespecial com/discord/media/utils/MediaResolver.logMediaError (Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;Landroid/net/Uri;)V
      // 176: aload 7
      // 178: astore 10
      // 17a: aload 7
      // 17c: invokestatic kotlin/Result.g (Ljava/lang/Object;)Z
      // 17f: ifeq 185
      // 182: aconst_null
      // 183: astore 10
      // 185: aload 10
      // 187: checkcast com/discord/media/utils/DiscordVideoMediaSource
      // 18a: astore 7
      // 18c: aload 7
      // 18e: ifnull 328
      // 191: iload 2
      // 192: ifeq 1ac
      // 195: aload 7
      // 197: astore 10
      // 199: aload 6
      // 19b: astore 7
      // 19d: aload 0
      // 19e: astore 1
      // 19f: aload 1
      // 1a0: astore 3
      // 1a1: aload 1
      // 1a2: astore 9
      // 1a4: aload 3
      // 1a5: astore 1
      // 1a6: aload 4
      // 1a8: astore 3
      // 1a9: goto 237
      // 1ac: aload 3
      // 1ad: ifnull 27e
      // 1b0: getstatic com/discord/media/utils/Transcoder.INSTANCE Lcom/discord/media/utils/Transcoder;
      // 1b3: astore 10
      // 1b5: aload 0
      // 1b6: aload 1
      // 1b7: invokespecial com/discord/media/utils/MediaResolver.getRequestId (Landroid/net/Uri;)Ljava/lang/String;
      // 1ba: astore 11
      // 1bc: aload 0
      // 1bd: getfield com/discord/media/utils/MediaResolver.context Landroid/content/Context;
      // 1c0: astore 13
      // 1c2: new com/discord/media/utils/f
      // 1c5: astore 14
      // 1c7: aload 14
      // 1c9: aload 0
      // 1ca: aload 6
      // 1cc: invokespecial com/discord/media/utils/f.<init> (Lcom/discord/media/utils/MediaResolver;Landroid/net/Uri;)V
      // 1cf: aload 8
      // 1d1: aload 0
      // 1d2: putfield com/discord/media/utils/MediaResolver$handleVideo$1.L$0 Ljava/lang/Object;
      // 1d5: aload 8
      // 1d7: aload 6
      // 1d9: putfield com/discord/media/utils/MediaResolver$handleVideo$1.L$1 Ljava/lang/Object;
      // 1dc: aload 8
      // 1de: aload 4
      // 1e0: putfield com/discord/media/utils/MediaResolver$handleVideo$1.L$2 Ljava/lang/Object;
      // 1e3: aload 8
      // 1e5: aload 7
      // 1e7: putfield com/discord/media/utils/MediaResolver$handleVideo$1.L$3 Ljava/lang/Object;
      // 1ea: aload 8
      // 1ec: aload 0
      // 1ed: putfield com/discord/media/utils/MediaResolver$handleVideo$1.L$4 Ljava/lang/Object;
      // 1f0: aload 8
      // 1f2: bipush 1
      // 1f3: putfield com/discord/media/utils/MediaResolver$handleVideo$1.label I
      // 1f6: aload 4
      // 1f8: astore 1
      // 1f9: aload 10
      // 1fb: aload 11
      // 1fd: aload 13
      // 1ff: aload 7
      // 201: aload 4
      // 203: aload 3
      // 204: aload 14
      // 206: aload 8
      // 208: invokevirtual com/discord/media/utils/Transcoder.convertCompress (Ljava/lang/String;Landroid/content/Context;Lcom/discord/media/utils/DiscordVideoMediaSource;Landroid/net/Uri;Lcom/discord/media/utils/EncodingConfig;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
      // 20b: astore 3
      // 20c: aload 3
      // 20d: aload 12
      // 20f: if_acmpne 215
      // 212: aload 12
      // 214: areturn
      // 215: aload 3
      // 216: astore 9
      // 218: aload 0
      // 219: astore 4
      // 21b: aload 4
      // 21d: astore 10
      // 21f: aload 1
      // 220: astore 3
      // 221: aload 10
      // 223: astore 1
      // 224: aload 9
      // 226: checkcast android/net/Uri
      // 229: astore 11
      // 22b: aload 7
      // 22d: astore 10
      // 22f: aload 4
      // 231: astore 9
      // 233: aload 11
      // 235: astore 7
      // 237: aload 9
      // 239: aload 6
      // 23b: aload 7
      // 23d: aload 10
      // 23f: invokevirtual V7/a.getSize ()J
      // 242: invokespecial com/discord/media/utils/MediaResolver.createMP4FastStartUri (Landroid/net/Uri;Landroid/net/Uri;J)Landroid/net/Uri;
      // 245: astore 4
      // 247: aload 4
      // 249: ifnonnull 24f
      // 24c: goto 253
      // 24f: aload 4
      // 251: astore 7
      // 253: aload 7
      // 255: areturn
      // 256: astore 7
      // 258: aload 1
      // 259: astore 4
      // 25b: aload 3
      // 25c: astore 1
      // 25d: aload 7
      // 25f: astore 3
      // 260: goto 28b
      // 263: astore 7
      // 265: aload 1
      // 266: astore 4
      // 268: aload 3
      // 269: astore 1
      // 26a: aload 7
      // 26c: astore 3
      // 26d: goto 260
      // 270: astore 3
      // 271: aload 0
      // 272: astore 4
      // 274: aload 9
      // 276: astore 1
      // 277: goto 28b
      // 27a: astore 3
      // 27b: goto 271
      // 27e: new java/lang/IllegalArgumentException
      // 281: astore 1
      // 282: aload 1
      // 283: ldc_w "encodingConfig is required"
      // 286: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 289: aload 1
      // 28a: athrow
      // 28b: getstatic kotlin/Result.k Lkotlin/Result$a;
      // 28e: astore 7
      // 290: aload 3
      // 291: invokestatic kotlin/c.a (Ljava/lang/Throwable;)Ljava/lang/Object;
      // 294: invokestatic kotlin/Result.b (Ljava/lang/Object;)Ljava/lang/Object;
      // 297: astore 3
      // 298: aload 3
      // 299: invokestatic kotlin/Result.e (Ljava/lang/Object;)Ljava/lang/Throwable;
      // 29c: astore 7
      // 29e: aload 7
      // 2a0: ifnonnull 2a8
      // 2a3: aload 3
      // 2a4: astore 1
      // 2a5: goto 320
      // 2a8: aload 7
      // 2aa: instanceof java/util/concurrent/CancellationException
      // 2ad: ifne 325
      // 2b0: aload 7
      // 2b2: invokevirtual java/lang/Throwable.getMessage ()Ljava/lang/String;
      // 2b5: astore 7
      // 2b7: new java/lang/StringBuilder
      // 2ba: dup
      // 2bb: invokespecial java/lang/StringBuilder.<init> ()V
      // 2be: astore 3
      // 2bf: aload 3
      // 2c0: ldc_w "Error compressing/converting video: "
      // 2c3: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2c6: pop
      // 2c7: aload 3
      // 2c8: aload 7
      // 2ca: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2cd: pop
      // 2ce: aload 4
      // 2d0: ldc_w "Media conversion error"
      // 2d3: aload 3
      // 2d4: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 2d7: aload 6
      // 2d9: aload 1
      // 2da: invokespecial com/discord/media/utils/MediaResolver.logMediaError (Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;Landroid/net/Uri;)V
      // 2dd: aload 8
      // 2df: aconst_null
      // 2e0: putfield com/discord/media/utils/MediaResolver$handleVideo$1.L$0 Ljava/lang/Object;
      // 2e3: aload 8
      // 2e5: aconst_null
      // 2e6: putfield com/discord/media/utils/MediaResolver$handleVideo$1.L$1 Ljava/lang/Object;
      // 2e9: aload 8
      // 2eb: aconst_null
      // 2ec: putfield com/discord/media/utils/MediaResolver$handleVideo$1.L$2 Ljava/lang/Object;
      // 2ef: aload 8
      // 2f1: aconst_null
      // 2f2: putfield com/discord/media/utils/MediaResolver$handleVideo$1.L$3 Ljava/lang/Object;
      // 2f5: aload 8
      // 2f7: aconst_null
      // 2f8: putfield com/discord/media/utils/MediaResolver$handleVideo$1.L$4 Ljava/lang/Object;
      // 2fb: aload 8
      // 2fd: bipush 2
      // 2fe: putfield com/discord/media/utils/MediaResolver$handleVideo$1.label I
      // 301: aload 4
      // 303: aload 6
      // 305: aconst_null
      // 306: aload 8
      // 308: bipush 2
      // 309: aconst_null
      // 30a: invokestatic com/discord/media/utils/MediaResolver.copyToFile$default (Lcom/discord/media/utils/MediaResolver;Landroid/net/Uri;Ljava/io/File;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
      // 30d: astore 1
      // 30e: aload 1
      // 30f: astore 4
      // 311: aload 1
      // 312: aload 12
      // 314: if_acmpne 31a
      // 317: aload 12
      // 319: areturn
      // 31a: aload 4
      // 31c: checkcast android/net/Uri
      // 31f: astore 1
      // 320: aload 1
      // 321: checkcast android/net/Uri
      // 324: areturn
      // 325: aload 7
      // 327: athrow
      // 328: aload 8
      // 32a: bipush 3
      // 32b: putfield com/discord/media/utils/MediaResolver$handleVideo$1.label I
      // 32e: aload 0
      // 32f: aload 1
      // 330: aconst_null
      // 331: aload 8
      // 333: bipush 2
      // 334: aconst_null
      // 335: invokestatic com/discord/media/utils/MediaResolver.copyToFile$default (Lcom/discord/media/utils/MediaResolver;Landroid/net/Uri;Ljava/io/File;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
      // 338: astore 1
      // 339: aload 1
      // 33a: astore 4
      // 33c: aload 1
      // 33d: aload 12
      // 33f: if_acmpne 345
      // 342: aload 12
      // 344: areturn
      // 345: aload 4
      // 347: areturn
   }

   @JvmStatic
   fun `handleVideo$lambda$4$lambda$3`(var0: MediaResolver, var1: Uri, var2: Float): Unit {
      var0.onProgress.invoke(var1, (int)(var2 * (float)100));
      return Unit.a;
   }

   private fun logMediaError(tag: String, message: String, inputUri: Uri, outputUri: Uri) {
      val var5: CrashReporting = CrashReporting.INSTANCE;
      CrashReporting.addBreadcrumb$default(
         CrashReporting.INSTANCE, var2, S8.q.l(new Pair[]{s.a("inputUri", var3.toString()), s.a("outputUri", var4.toString())}), null, 4, null
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
      return Aa.f.g(
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
               val var6: Any = Y8.b.e();
               if (this.label != 0) {
                  if (this.label != 1) {
                     if (this.label == 2) {
                        kotlin.c.b(var1);
                        return var1 as Uri;
                     }

                     if (this.label == 3) {
                        kotlin.c.b(var1);
                        return var1 as Uri;
                     }

                     if (this.label != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                     }

                     kotlin.c.b(var1);
                     return var1 as Uri;
                  }

                  kotlin.c.b(var1);
               } else {
                  kotlin.c.b(var1);
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

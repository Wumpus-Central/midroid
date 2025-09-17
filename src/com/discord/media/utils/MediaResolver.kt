package com.discord.media.utils

import A9.s
import android.annotation.SuppressLint
import android.content.ContentResolver
import android.content.Context
import android.graphics.Bitmap.CompressFormat
import android.net.Uri
import cb.K
import com.discord.crash_reporting.CrashReporting
import id.zelory.compressor.constraint.Compression
import java.io.File
import java.io.InputStream
import kotlin.coroutines.Continuation
import kotlin.jvm.functions.Function2
import kotlin.jvm.internal.SourceDebugExtension
import kotlinx.coroutines.CoroutineScope
import org.jetbrains.annotations.NotNull

@SourceDebugExtension(["SMAP\nMediaResolver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MediaResolver.kt\ncom/discord/media/utils/MediaResolver\n+ 2 Uri.kt\nandroidx/core/net/UriKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,260:1\n36#2:261\n36#2:262\n36#2:264\n36#2:265\n36#2:266\n1#3:263\n*S KotlinDebug\n*F\n+ 1 MediaResolver.kt\ncom/discord/media/utils/MediaResolver\n*L\n111#1:261\n135#1:262\n207#1:264\n216#1:265\n219#1:266\n*E\n"])
public class MediaResolver(context: Context, onProgress: (Uri, Int) -> Unit) {
   private final val context: Context
   private final val onProgress: (Uri, Int) -> Unit
   private final val cacheDir: File

   private final val resolver: ContentResolver
      private final get() {
         val var1: ContentResolver = this.context.getContentResolver();
         return var1;
      }


   private final val requestId: String
      private final get() {
         val var2: java.lang.String = var1.toString();
         return var2;
      }


   init {
      this.context = var1;
      this.onProgress = var2;
      this.cacheDir = var1.getCacheDir();
   }

   @SuppressLint(["UsableSpace"])
   private suspend fun checkFreeSpace() {
      val var2: Any = cb.f.g(
         K.b(),
         new Function2<CoroutineScope, Continuation, Object>(this, null) {
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
               F9.b.e();
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
                           val var8: File = var1[var2x];
                           if (var1[var2x].isFile()) {
                              val var9: java.lang.String = var8.getName();
                              if (StringsKt.I(var9, "temp_", false, 2, null) && var8.lastModified() < var6) {
                                 var8.delete();
                                 continue;
                              }
                           }

                           if (var8.isDirectory() && var8.getName() == "compressor") {
                              val var11: Array<File> = var8.listFiles();
                              if (var11 != null) {
                                 val var5: Int = var11.length;

                                 for (int var3 = 0; var3 < var5; var3++) {
                                    val var12: File = var11[var3];
                                    if (var11[var3].isFile() && var11[var3].lastModified() < var6) {
                                       var12.delete();
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
      return if (var2 === F9.b.e()) var2 else Unit.a;
   }

   private suspend fun copyToFile(uri: Uri, targetFile: File? = ...): Uri {
      return cb.f.g(
         K.b(),
         new Function2<CoroutineScope, Continuation, Object>(var2, this, var1, null) {
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
               F9.b.e();
               label26:
               if (this.label == 0) {
                  kotlin.c.b(var1);
                  var1 = this.$targetFile;
                  if (this.$targetFile == null) {
                     var1 = ContentResolverUtils.createTempFile$default(
                        ContentResolverUtils.INSTANCE, MediaResolver.access$getResolver(this.this$0), this.$uri, null, null, 6, null
                     );
                  }

                  val var3: Uri = this.$uri;
                  val var13: InputStream = MediaResolver.access$getResolver(this.this$0).openInputStream(var3);
                  if (var13 != null) {
                     try {
                        FileUtilsKt.writeTo(var13, var1);
                     } catch (var5: java.lang.Throwable) {
                        val var11: java.lang.Throwable = var5;

                        try {
                           throw var11;
                        } catch (var4: java.lang.Throwable) {
                           K9.c.a(var13, var5);
                        }
                     }

                     K9.c.a(var13, null);
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
      // 52: invokestatic Gb/b.a (Ljava/io/FileDescriptor;Ljava/io/File;)Z
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
      // 94: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
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
      // bc: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
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

            public final Object invokeSuspend(@NotNull Object var1) {
               this.result = var1;
               this.label |= Integer.MIN_VALUE;
               return MediaResolver.access$handleImage(this.this$0, null, 0, false, false, this);
            }
         };
      }

      label111: {
         label98: {
            var19 = ((<unrepresentable>)var9).result;
            val var11: Any = F9.b.e();
            val var14: MediaResolver;
            if (((<unrepresentable>)var9).label != 0) {
               if (((<unrepresentable>)var9).label != 1) {
                  if (((<unrepresentable>)var9).label != 2) {
                     if (((<unrepresentable>)var9).label != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                     }

                     kotlin.c.b(var19);
                     return var19;
                  }

                  var15 = ((<unrepresentable>)var9).L$0 as File;
                  kotlin.c.b(var19);
                  break label98;
               }

               var3 = ((<unrepresentable>)var9).Z$0;
               var10 = ((<unrepresentable>)var9).L$1 as Uri;
               var14 = ((<unrepresentable>)var9).L$0 as MediaResolver;
               kotlin.c.b(var19);
            } else {
               kotlin.c.b(var19);
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

               val var21: h9.a = h9.a.a;
               val var13: Context = this.context;
               val var30: e = new e(var2, var26, this, var1);
               ((<unrepresentable>)var9).L$0 = this;
               ((<unrepresentable>)var9).L$1 = var1;
               var3 = var4;
               ((<unrepresentable>)var9).Z$0 = var4;
               ((<unrepresentable>)var9).label = 1;
               var19 = h9.a.b(var21, var13, var1, null, var30, (Continuation)var9, 4, null);
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

   @JvmStatic
   fun `handleImage$lambda$7`(var0: Int, var1: Boolean, var2: MediaResolver, var3: Uri, var4: Compression): Unit {
      var4.a(new QualityAndResolutionConstraint(var0, var1));
      i9.g.a(var4, CompressFormat.JPEG);
      i9.e.a(var4, ContentResolverUtils.createTempFile$default(ContentResolverUtils.INSTANCE, var2.getResolver(), var3, null, "jpeg", 2, null));
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
      // 046: invokestatic F9/b.e ()Ljava/lang/Object;
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
      // 06e: goto 346
      // 071: new java/lang/IllegalStateException
      // 074: dup
      // 075: ldc_w "call to 'resume' before 'invoke' with coroutine"
      // 078: invokespecial java/lang/IllegalStateException.<init> (Ljava/lang/String;)V
      // 07b: athrow
      // 07c: aload 4
      // 07e: invokestatic kotlin/c.b (Ljava/lang/Object;)V
      // 081: goto 31b
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
      // 0d7: goto 28c
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
      // 0f8: getstatic kotlin/Result.e Lkotlin/Result$a;
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
      // 117: astore 10
      // 119: getstatic kotlin/Result.e Lkotlin/Result$a;
      // 11c: astore 7
      // 11e: aload 10
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
      // 139: astore 10
      // 13b: new java/lang/StringBuilder
      // 13e: dup
      // 13f: invokespecial java/lang/StringBuilder.<init> ()V
      // 142: astore 11
      // 144: aload 11
      // 146: ldc_w "["
      // 149: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 14c: pop
      // 14d: aload 11
      // 14f: aload 13
      // 151: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 154: pop
      // 155: aload 11
      // 157: ldc_w "] Error creating source: "
      // 15a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 15d: pop
      // 15e: aload 11
      // 160: aload 10
      // 162: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 165: pop
      // 166: aload 0
      // 167: ldc_w "Media source error"
      // 16a: aload 11
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
      // 18e: ifnull 329
      // 191: iload 2
      // 192: ifeq 1ac
      // 195: aload 7
      // 197: astore 9
      // 199: aload 6
      // 19b: astore 7
      // 19d: aload 0
      // 19e: astore 1
      // 19f: aload 1
      // 1a0: astore 3
      // 1a1: aload 1
      // 1a2: astore 10
      // 1a4: aload 3
      // 1a5: astore 1
      // 1a6: aload 4
      // 1a8: astore 3
      // 1a9: goto 237
      // 1ac: aload 3
      // 1ad: ifnull 27f
      // 1b0: getstatic com/discord/media/utils/Transcoder.INSTANCE Lcom/discord/media/utils/Transcoder;
      // 1b3: astore 10
      // 1b5: aload 0
      // 1b6: aload 1
      // 1b7: invokespecial com/discord/media/utils/MediaResolver.getRequestId (Landroid/net/Uri;)Ljava/lang/String;
      // 1ba: astore 13
      // 1bc: aload 0
      // 1bd: getfield com/discord/media/utils/MediaResolver.context Landroid/content/Context;
      // 1c0: astore 11
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
      // 1fb: aload 13
      // 1fd: aload 11
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
      // 22d: astore 9
      // 22f: aload 4
      // 231: astore 10
      // 233: aload 11
      // 235: astore 7
      // 237: aload 10
      // 239: aload 6
      // 23b: aload 7
      // 23d: aload 9
      // 23f: invokevirtual o8/a.getSize ()J
      // 242: invokespecial com/discord/media/utils/MediaResolver.createMP4FastStartUri (Landroid/net/Uri;Landroid/net/Uri;J)Landroid/net/Uri;
      // 245: astore 4
      // 247: aload 4
      // 249: ifnonnull 252
      // 24c: aload 7
      // 24e: astore 1
      // 24f: goto 255
      // 252: aload 4
      // 254: astore 1
      // 255: aload 1
      // 256: areturn
      // 257: astore 7
      // 259: aload 1
      // 25a: astore 4
      // 25c: aload 3
      // 25d: astore 1
      // 25e: aload 7
      // 260: astore 3
      // 261: goto 28c
      // 264: astore 7
      // 266: aload 1
      // 267: astore 4
      // 269: aload 3
      // 26a: astore 1
      // 26b: aload 7
      // 26d: astore 3
      // 26e: goto 261
      // 271: astore 3
      // 272: aload 0
      // 273: astore 4
      // 275: aload 9
      // 277: astore 1
      // 278: goto 28c
      // 27b: astore 3
      // 27c: goto 272
      // 27f: new java/lang/IllegalArgumentException
      // 282: astore 1
      // 283: aload 1
      // 284: ldc_w "encodingConfig is required"
      // 287: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 28a: aload 1
      // 28b: athrow
      // 28c: getstatic kotlin/Result.e Lkotlin/Result$a;
      // 28f: astore 7
      // 291: aload 3
      // 292: invokestatic kotlin/c.a (Ljava/lang/Throwable;)Ljava/lang/Object;
      // 295: invokestatic kotlin/Result.b (Ljava/lang/Object;)Ljava/lang/Object;
      // 298: astore 3
      // 299: aload 3
      // 29a: invokestatic kotlin/Result.e (Ljava/lang/Object;)Ljava/lang/Throwable;
      // 29d: astore 7
      // 29f: aload 7
      // 2a1: ifnonnull 2a9
      // 2a4: aload 3
      // 2a5: astore 1
      // 2a6: goto 321
      // 2a9: aload 7
      // 2ab: instanceof java/util/concurrent/CancellationException
      // 2ae: ifne 326
      // 2b1: aload 7
      // 2b3: invokevirtual java/lang/Throwable.getMessage ()Ljava/lang/String;
      // 2b6: astore 7
      // 2b8: new java/lang/StringBuilder
      // 2bb: dup
      // 2bc: invokespecial java/lang/StringBuilder.<init> ()V
      // 2bf: astore 3
      // 2c0: aload 3
      // 2c1: ldc_w "Error compressing/converting video: "
      // 2c4: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2c7: pop
      // 2c8: aload 3
      // 2c9: aload 7
      // 2cb: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2ce: pop
      // 2cf: aload 4
      // 2d1: ldc_w "Media conversion error"
      // 2d4: aload 3
      // 2d5: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 2d8: aload 6
      // 2da: aload 1
      // 2db: invokespecial com/discord/media/utils/MediaResolver.logMediaError (Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;Landroid/net/Uri;)V
      // 2de: aload 8
      // 2e0: aconst_null
      // 2e1: putfield com/discord/media/utils/MediaResolver$handleVideo$1.L$0 Ljava/lang/Object;
      // 2e4: aload 8
      // 2e6: aconst_null
      // 2e7: putfield com/discord/media/utils/MediaResolver$handleVideo$1.L$1 Ljava/lang/Object;
      // 2ea: aload 8
      // 2ec: aconst_null
      // 2ed: putfield com/discord/media/utils/MediaResolver$handleVideo$1.L$2 Ljava/lang/Object;
      // 2f0: aload 8
      // 2f2: aconst_null
      // 2f3: putfield com/discord/media/utils/MediaResolver$handleVideo$1.L$3 Ljava/lang/Object;
      // 2f6: aload 8
      // 2f8: aconst_null
      // 2f9: putfield com/discord/media/utils/MediaResolver$handleVideo$1.L$4 Ljava/lang/Object;
      // 2fc: aload 8
      // 2fe: bipush 2
      // 2ff: putfield com/discord/media/utils/MediaResolver$handleVideo$1.label I
      // 302: aload 4
      // 304: aload 6
      // 306: aconst_null
      // 307: aload 8
      // 309: bipush 2
      // 30a: aconst_null
      // 30b: invokestatic com/discord/media/utils/MediaResolver.copyToFile$default (Lcom/discord/media/utils/MediaResolver;Landroid/net/Uri;Ljava/io/File;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
      // 30e: astore 1
      // 30f: aload 1
      // 310: astore 4
      // 312: aload 1
      // 313: aload 12
      // 315: if_acmpne 31b
      // 318: aload 12
      // 31a: areturn
      // 31b: aload 4
      // 31d: checkcast android/net/Uri
      // 320: astore 1
      // 321: aload 1
      // 322: checkcast android/net/Uri
      // 325: areturn
      // 326: aload 7
      // 328: athrow
      // 329: aload 8
      // 32b: bipush 3
      // 32c: putfield com/discord/media/utils/MediaResolver$handleVideo$1.label I
      // 32f: aload 0
      // 330: aload 1
      // 331: aconst_null
      // 332: aload 8
      // 334: bipush 2
      // 335: aconst_null
      // 336: invokestatic com/discord/media/utils/MediaResolver.copyToFile$default (Lcom/discord/media/utils/MediaResolver;Landroid/net/Uri;Ljava/io/File;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
      // 339: astore 1
      // 33a: aload 1
      // 33b: astore 4
      // 33d: aload 1
      // 33e: aload 12
      // 340: if_acmpne 346
      // 343: aload 12
      // 345: areturn
      // 346: aload 4
      // 348: areturn
   }

   @JvmStatic
   fun `handleVideo$lambda$4$lambda$3`(var0: MediaResolver, var1: Uri, var2: Float): Unit {
      var0.onProgress.invoke(var1, (int)(var2 * (float)100));
      return Unit.a;
   }

   private fun logMediaError(tag: String, message: String, inputUri: Uri, outputUri: Uri) {
      val var5: CrashReporting = CrashReporting.INSTANCE;
      CrashReporting.addBreadcrumb$default(
         CrashReporting.INSTANCE, var2, L.l(new Pair[]{s.a("inputUri", var3.toString()), s.a("outputUri", var4.toString())}), null, 4, null
      );
      var5.captureMessage(var1, var2, CrashReporting.ErrorLevel.WARNING);
   }

   public fun cancel(inputUri: Uri) {
      Transcoder.INSTANCE.cancel(this.getRequestId(var1));
   }

   public fun getMimeType(uri: Uri): String? {
      return this.getResolver().getType(var1);
   }

   public fun handleVideoMetadata(inputUri: Uri): Map<String, Any> {
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
      return cb.f.g(
         K.b(),
         new Function2<CoroutineScope, Continuation, Object>(this, var1, var4, var6, var2, var3, var5, null) {
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
               val var6: Any = F9.b.e();
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
                  var var19: MediaResolver = this.this$0;
                  val var7: Uri = this.$inputUri;
                  val var15: Boolean = this.$skipVideoTranscode;
                  val var13: EncodingConfig = this.$encodingConfig;
                  this.label = 2;
                  var19 = (MediaResolver)MediaResolver.access$handleVideo(var19, var7, var15, var13, this);
                  return if (var19 === var6) var6 else var19 as Uri;
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

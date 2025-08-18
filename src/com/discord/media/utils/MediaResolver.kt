package com.discord.media.utils

import B9.s
import android.annotation.SuppressLint
import android.content.ContentResolver
import android.content.Context
import android.graphics.Bitmap.CompressFormat
import android.net.Uri
import com.discord.crash_reporting.CrashReporting
import db.K
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
      val var2: Any = db.f.g(
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
               G9.b.e();
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
                           val var9: File = var1[var2x];
                           if (var1[var2x].isFile()) {
                              val var8: java.lang.String = var9.getName();
                              if (StringsKt.I(var8, "temp_", false, 2, null) && var9.lastModified() < var6) {
                                 var9.delete();
                                 continue;
                              }
                           }

                           if (var9.isDirectory() && var9.getName() == "compressor") {
                              val var12: Array<File> = var9.listFiles();
                              if (var12 != null) {
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
      return if (var2 === G9.b.e()) var2 else Unit.a;
   }

   private suspend fun copyToFile(uri: Uri, targetFile: File? = ...): Uri {
      return db.f.g(
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
               G9.b.e();
               label26:
               if (this.label == 0) {
                  kotlin.c.b(var1);
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
                        FileUtilsKt.writeTo(var13, var1);
                     } catch (var5: java.lang.Throwable) {
                        val var11: java.lang.Throwable = var5;

                        try {
                           throw var11;
                        } catch (var4: java.lang.Throwable) {
                           L9.c.a(var13, var5);
                        }
                     }

                     L9.c.a(var13, null);
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
      // 52: invokestatic Hb/b.a (Ljava/io/FileDescriptor;Ljava/io/File;)Z
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
            val var11: Any = G9.b.e();
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

               val var30: i9.a = i9.a.a;
               val var13: Context = this.context;
               val var21: e = new e(var2, var26, this, var1);
               ((<unrepresentable>)var9).L$0 = this;
               ((<unrepresentable>)var9).L$1 = var1;
               var3 = var4;
               ((<unrepresentable>)var9).Z$0 = var4;
               ((<unrepresentable>)var9).label = 1;
               var19 = i9.a.b(var30, var13, var1, null, var21, (Continuation)var9, 4, null);
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
      j9.g.a(var4, CompressFormat.JPEG);
      j9.e.a(var4, ContentResolverUtils.createTempFile$default(ContentResolverUtils.INSTANCE, var2.getResolver(), var3, null, "jpeg", 2, null));
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
      // 046: invokestatic G9/b.e ()Ljava/lang/Object;
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
      // 06b: invokestatic kotlin/c.b (Ljava/lang/Object;)V
      // 06e: goto 349
      // 071: new java/lang/IllegalStateException
      // 074: dup
      // 075: ldc_w "call to 'resume' before 'invoke' with coroutine"
      // 078: invokespecial java/lang/IllegalStateException.<init> (Ljava/lang/String;)V
      // 07b: athrow
      // 07c: aload 4
      // 07e: invokestatic kotlin/c.b (Ljava/lang/Object;)V
      // 081: goto 31e
      // 084: aload 8
      // 086: getfield com/discord/media/utils/MediaResolver$handleVideo$1.L$4 Ljava/lang/Object;
      // 089: checkcast com/discord/media/utils/MediaResolver
      // 08c: astore 11
      // 08e: aload 8
      // 090: getfield com/discord/media/utils/MediaResolver$handleVideo$1.L$3 Ljava/lang/Object;
      // 093: checkcast com/discord/media/utils/DiscordVideoMediaSource
      // 096: astore 10
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
      // 0b7: invokestatic kotlin/c.b (Ljava/lang/Object;)V
      // 0ba: aload 6
      // 0bc: astore 3
      // 0bd: aload 7
      // 0bf: astore 6
      // 0c1: aload 4
      // 0c3: astore 9
      // 0c5: aload 11
      // 0c7: astore 4
      // 0c9: aload 10
      // 0cb: astore 7
      // 0cd: goto 228
      // 0d0: astore 3
      // 0d1: aload 1
      // 0d2: astore 4
      // 0d4: aload 6
      // 0d6: astore 1
      // 0d7: aload 7
      // 0d9: astore 6
      // 0db: goto 28f
      // 0de: aload 4
      // 0e0: invokestatic kotlin/c.b (Ljava/lang/Object;)V
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
      // 0fc: getstatic kotlin/Result.e Lkotlin/Result$a;
      // 0ff: astore 7
      // 101: new com/discord/media/utils/DiscordVideoMediaSource
      // 104: astore 7
      // 106: aload 7
      // 108: aload 0
      // 109: getfield com/discord/media/utils/MediaResolver.context Landroid/content/Context;
      // 10c: aload 6
      // 10e: invokespecial com/discord/media/utils/DiscordVideoMediaSource.<init> (Landroid/content/Context;Landroid/net/Uri;)V
      // 111: aload 7
      // 113: invokestatic kotlin/Result.b (Ljava/lang/Object;)Ljava/lang/Object;
      // 116: astore 7
      // 118: goto 12c
      // 11b: astore 10
      // 11d: getstatic kotlin/Result.e Lkotlin/Result$a;
      // 120: astore 7
      // 122: aload 10
      // 124: invokestatic kotlin/c.a (Ljava/lang/Throwable;)Ljava/lang/Object;
      // 127: invokestatic kotlin/Result.b (Ljava/lang/Object;)Ljava/lang/Object;
      // 12a: astore 7
      // 12c: aload 7
      // 12e: invokestatic kotlin/Result.e (Ljava/lang/Object;)Ljava/lang/Throwable;
      // 131: astore 11
      // 133: aload 11
      // 135: ifnull 17a
      // 138: aload 11
      // 13a: invokevirtual java/lang/Throwable.getMessage ()Ljava/lang/String;
      // 13d: astore 13
      // 13f: new java/lang/StringBuilder
      // 142: dup
      // 143: invokespecial java/lang/StringBuilder.<init> ()V
      // 146: astore 10
      // 148: aload 10
      // 14a: ldc_w "["
      // 14d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 150: pop
      // 151: aload 10
      // 153: aload 11
      // 155: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 158: pop
      // 159: aload 10
      // 15b: ldc_w "] Error creating source: "
      // 15e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 161: pop
      // 162: aload 10
      // 164: aload 13
      // 166: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 169: pop
      // 16a: aload 0
      // 16b: ldc_w "Media source error"
      // 16e: aload 10
      // 170: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 173: aload 6
      // 175: aload 4
      // 177: invokespecial com/discord/media/utils/MediaResolver.logMediaError (Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;Landroid/net/Uri;)V
      // 17a: aload 7
      // 17c: astore 10
      // 17e: aload 7
      // 180: invokestatic kotlin/Result.g (Ljava/lang/Object;)Z
      // 183: ifeq 189
      // 186: aconst_null
      // 187: astore 10
      // 189: aload 10
      // 18b: checkcast com/discord/media/utils/DiscordVideoMediaSource
      // 18e: astore 7
      // 190: aload 7
      // 192: ifnull 32c
      // 195: iload 2
      // 196: ifeq 1b0
      // 199: aload 7
      // 19b: astore 9
      // 19d: aload 6
      // 19f: astore 7
      // 1a1: aload 0
      // 1a2: astore 1
      // 1a3: aload 1
      // 1a4: astore 3
      // 1a5: aload 1
      // 1a6: astore 10
      // 1a8: aload 3
      // 1a9: astore 1
      // 1aa: aload 4
      // 1ac: astore 3
      // 1ad: goto 23b
      // 1b0: aload 3
      // 1b1: ifnull 282
      // 1b4: getstatic com/discord/media/utils/Transcoder.INSTANCE Lcom/discord/media/utils/Transcoder;
      // 1b7: astore 10
      // 1b9: aload 0
      // 1ba: aload 1
      // 1bb: invokespecial com/discord/media/utils/MediaResolver.getRequestId (Landroid/net/Uri;)Ljava/lang/String;
      // 1be: astore 13
      // 1c0: aload 0
      // 1c1: getfield com/discord/media/utils/MediaResolver.context Landroid/content/Context;
      // 1c4: astore 11
      // 1c6: new com/discord/media/utils/f
      // 1c9: astore 14
      // 1cb: aload 14
      // 1cd: aload 0
      // 1ce: aload 6
      // 1d0: invokespecial com/discord/media/utils/f.<init> (Lcom/discord/media/utils/MediaResolver;Landroid/net/Uri;)V
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
      // 1ff: aload 13
      // 201: aload 11
      // 203: aload 7
      // 205: aload 4
      // 207: aload 3
      // 208: aload 14
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
      // 231: astore 9
      // 233: aload 4
      // 235: astore 10
      // 237: aload 11
      // 239: astore 7
      // 23b: aload 10
      // 23d: aload 6
      // 23f: aload 7
      // 241: aload 9
      // 243: invokevirtual p8/a.getSize ()J
      // 246: invokespecial com/discord/media/utils/MediaResolver.createMP4FastStartUri (Landroid/net/Uri;Landroid/net/Uri;J)Landroid/net/Uri;
      // 249: astore 4
      // 24b: aload 4
      // 24d: ifnonnull 253
      // 250: goto 257
      // 253: aload 4
      // 255: astore 7
      // 257: aload 7
      // 259: areturn
      // 25a: astore 7
      // 25c: aload 1
      // 25d: astore 4
      // 25f: aload 3
      // 260: astore 1
      // 261: aload 7
      // 263: astore 3
      // 264: goto 28f
      // 267: astore 7
      // 269: aload 1
      // 26a: astore 4
      // 26c: aload 3
      // 26d: astore 1
      // 26e: aload 7
      // 270: astore 3
      // 271: goto 264
      // 274: astore 3
      // 275: aload 0
      // 276: astore 4
      // 278: aload 9
      // 27a: astore 1
      // 27b: goto 28f
      // 27e: astore 3
      // 27f: goto 275
      // 282: new java/lang/IllegalArgumentException
      // 285: astore 1
      // 286: aload 1
      // 287: ldc_w "encodingConfig is required"
      // 28a: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 28d: aload 1
      // 28e: athrow
      // 28f: getstatic kotlin/Result.e Lkotlin/Result$a;
      // 292: astore 7
      // 294: aload 3
      // 295: invokestatic kotlin/c.a (Ljava/lang/Throwable;)Ljava/lang/Object;
      // 298: invokestatic kotlin/Result.b (Ljava/lang/Object;)Ljava/lang/Object;
      // 29b: astore 3
      // 29c: aload 3
      // 29d: invokestatic kotlin/Result.e (Ljava/lang/Object;)Ljava/lang/Throwable;
      // 2a0: astore 7
      // 2a2: aload 7
      // 2a4: ifnonnull 2ac
      // 2a7: aload 3
      // 2a8: astore 1
      // 2a9: goto 324
      // 2ac: aload 7
      // 2ae: instanceof java/util/concurrent/CancellationException
      // 2b1: ifne 329
      // 2b4: aload 7
      // 2b6: invokevirtual java/lang/Throwable.getMessage ()Ljava/lang/String;
      // 2b9: astore 7
      // 2bb: new java/lang/StringBuilder
      // 2be: dup
      // 2bf: invokespecial java/lang/StringBuilder.<init> ()V
      // 2c2: astore 3
      // 2c3: aload 3
      // 2c4: ldc_w "Error compressing/converting video: "
      // 2c7: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2ca: pop
      // 2cb: aload 3
      // 2cc: aload 7
      // 2ce: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2d1: pop
      // 2d2: aload 4
      // 2d4: ldc_w "Media conversion error"
      // 2d7: aload 3
      // 2d8: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 2db: aload 6
      // 2dd: aload 1
      // 2de: invokespecial com/discord/media/utils/MediaResolver.logMediaError (Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;Landroid/net/Uri;)V
      // 2e1: aload 8
      // 2e3: aconst_null
      // 2e4: putfield com/discord/media/utils/MediaResolver$handleVideo$1.L$0 Ljava/lang/Object;
      // 2e7: aload 8
      // 2e9: aconst_null
      // 2ea: putfield com/discord/media/utils/MediaResolver$handleVideo$1.L$1 Ljava/lang/Object;
      // 2ed: aload 8
      // 2ef: aconst_null
      // 2f0: putfield com/discord/media/utils/MediaResolver$handleVideo$1.L$2 Ljava/lang/Object;
      // 2f3: aload 8
      // 2f5: aconst_null
      // 2f6: putfield com/discord/media/utils/MediaResolver$handleVideo$1.L$3 Ljava/lang/Object;
      // 2f9: aload 8
      // 2fb: aconst_null
      // 2fc: putfield com/discord/media/utils/MediaResolver$handleVideo$1.L$4 Ljava/lang/Object;
      // 2ff: aload 8
      // 301: bipush 2
      // 302: putfield com/discord/media/utils/MediaResolver$handleVideo$1.label I
      // 305: aload 4
      // 307: aload 6
      // 309: aconst_null
      // 30a: aload 8
      // 30c: bipush 2
      // 30d: aconst_null
      // 30e: invokestatic com/discord/media/utils/MediaResolver.copyToFile$default (Lcom/discord/media/utils/MediaResolver;Landroid/net/Uri;Ljava/io/File;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
      // 311: astore 1
      // 312: aload 1
      // 313: astore 4
      // 315: aload 1
      // 316: aload 12
      // 318: if_acmpne 31e
      // 31b: aload 12
      // 31d: areturn
      // 31e: aload 4
      // 320: checkcast android/net/Uri
      // 323: astore 1
      // 324: aload 1
      // 325: checkcast android/net/Uri
      // 328: areturn
      // 329: aload 7
      // 32b: athrow
      // 32c: aload 8
      // 32e: bipush 3
      // 32f: putfield com/discord/media/utils/MediaResolver$handleVideo$1.label I
      // 332: aload 0
      // 333: aload 1
      // 334: aconst_null
      // 335: aload 8
      // 337: bipush 2
      // 338: aconst_null
      // 339: invokestatic com/discord/media/utils/MediaResolver.copyToFile$default (Lcom/discord/media/utils/MediaResolver;Landroid/net/Uri;Ljava/io/File;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
      // 33c: astore 1
      // 33d: aload 1
      // 33e: astore 4
      // 340: aload 1
      // 341: aload 12
      // 343: if_acmpne 349
      // 346: aload 12
      // 348: areturn
      // 349: aload 4
      // 34b: areturn
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
      return db.f.g(
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
               val var6: Any = G9.b.e();
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
                  val var7: MediaResolver = this.this$0;
                  val var13: Uri = this.$inputUri;
                  val var15: Boolean = this.$skipVideoTranscode;
                  var var19: EncodingConfig = this.$encodingConfig;
                  this.label = 2;
                  var19 = (EncodingConfig)MediaResolver.access$handleVideo(var7, var13, var15, var19, this);
                  return if (var19 === var6) var6 else var19 as Uri;
               } else if (var9.isImage(MediaResolver.access$getResolver(this.this$0), this.$inputUri)) {
                  var1 = this.this$0;
                  var var17: Uri = this.$inputUri;
                  val var14: Int = this.$imageCompressionQuality;
                  val var4: Boolean = this.$isLowQuality;
                  val var3: Boolean = this.$useOriginalIfSmaller;
                  this.label = 3;
                  var17 = (Uri)MediaResolver.access$handleImage(var1, var17, var14, var4, var3, this);
                  return if (var17 === var6) var6 else var17;
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

package com.discord.media.utils

import android.annotation.SuppressLint
import android.content.ContentResolver
import android.content.Context
import android.graphics.Bitmap.CompressFormat
import android.net.Uri
import com.discord.crash_reporting.CrashReporting
import gu.g
import gu.m0
import ht.v
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
      val var2: Any = g.g(
         m0.b(),
         new Function2<CoroutineScope, Continuation<? super Unit>, Object>(this, null) {
            int label;
            final MediaResolver this$0;

            {
               super(2, var2x);
               this.this$0 = var1;
            }

            public final Continuation<Unit> create(Object var1, Continuation<?> var2) {
               return new <anonymous constructor>(this.this$0, var2);
            }

            public final Object invoke(CoroutineScope var1, Continuation<? super Unit> var2x) {
               return (this.create(var1, var2x) as <unrepresentable>).invokeSuspend(Unit.a);
            }

            public final Object invokeSuspend(Object var1) {
               ot.b.f();
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
                           var var9: File = var1[var2x];
                           if (var1[var2x].isFile()) {
                              val var8: java.lang.String = var9.getName();
                              if (StringsKt.N(var8, "temp_", false, 2, null) && var9.lastModified() < var6) {
                                 var9.delete();
                                 continue;
                              }
                           }

                           if (var9.isDirectory() && var9.getName() == "compressor") {
                              val var11: Array<File> = var9.listFiles();
                              if (var11 != null) {
                                 val var5: Int = var11.length;

                                 for (int var3 = 0; var3 < var5; var3++) {
                                    var9 = var11[var3];
                                    if (var11[var3].isFile() && var11[var3].lastModified() < var6) {
                                       var9.delete();
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
      return if (var2 === ot.b.f()) var2 else Unit.a;
   }

   private suspend fun copyToFile(uri: Uri, targetFile: File? = ...): Uri {
      return g.g(
         m0.b(),
         new Function2<CoroutineScope, Continuation<? super Uri>, Object>(var2, this, var1, null) {
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

            public final Continuation<Unit> create(Object var1, Continuation<?> var2) {
               return new <anonymous constructor>(this.$targetFile, this.this$0, this.$uri, var2);
            }

            public final Object invoke(CoroutineScope var1, Continuation<? super Uri> var2x) {
               return (this.create(var1, var2x) as <unrepresentable>).invokeSuspend(Unit.a);
            }

            public final Object invokeSuspend(Object var1) {
               ot.b.f();
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
                  val var12: InputStream = MediaResolver.access$getResolver(this.this$0).openInputStream(var3);
                  if (var12 != null) {
                     try {
                        FileUtilsKt.writeTo(var12, var1);
                     } catch (var5: java.lang.Throwable) {
                        val var13: java.lang.Throwable = var5;

                        try {
                           throw var13;
                        } catch (var4: java.lang.Throwable) {
                           tt.c.a(var12, var5);
                        }
                     }

                     tt.c.a(var12, null);
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
      // 52: invokestatic rv/a.a (Ljava/io/FileDescriptor;Ljava/io/File;)Z
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
      // 89: aload 7
      // 8b: areturn
      // 8c: aload 9
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
      // aa: aload 10
      // ac: invokevirtual android/os/ParcelFileDescriptor.close ()V
      // af: iload 5
      // b1: ifne d2
      // b4: aload 9
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
      label88: {
         if (var5 is <unrepresentable>) {
            val var9: <unrepresentable> = var5 as <unrepresentable>;
            if (((var5 as <unrepresentable>).label and Integer.MIN_VALUE) != 0) {
               var9.label = (var5 as <unrepresentable>).label + Integer.MIN_VALUE;
               var16 = var9;
               break label88;
            }
         }

         var16 = new kotlin.coroutines.jvm.internal.d(this, var5) {
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

      var var22: MediaResolver;
      label92: {
         var22 = (MediaResolver)((<unrepresentable>)var16).result;
         val var12: Any = ot.b.f();
         var var10: Any;
         if (((<unrepresentable>)var16).label != 0) {
            if (((<unrepresentable>)var16).label != 1) {
               if (((<unrepresentable>)var16).label != 2) {
                  if (((<unrepresentable>)var16).label == 3) {
                     kotlin.c.b(var22);
                     return var22;
                  }

                  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
               }

               var13 = ((<unrepresentable>)var16).L$0 as File;
               kotlin.c.b(var22);
               break label92;
            }

            var3 = ((<unrepresentable>)var16).Z$0;
            var1 = ((<unrepresentable>)var16).L$1 as Uri;
            val var11: MediaResolver = ((<unrepresentable>)var16).L$0 as MediaResolver;
            kotlin.c.b(var22);
            var10 = var22;
            var22 = var11;
         } else {
            kotlin.c.b(var22);
            val var24: ContentResolver = this.getResolver();
            var10 = ContentResolverUtils.INSTANCE;
            val var20: Boolean;
            if (ContentResolverUtils.INSTANCE.isHeif(var24, var1)
               || ((ContentResolverUtils)var10).isJpeg(var24, var1)
               || var3 && ((ContentResolverUtils)var10).isPng(var24, var1)) {
               var20 = true;
            } else {
               var20 = false;
            }

            var var21: Boolean = false;
            if (var20) {
               var21 = false;
               if (var3) {
                  var21 = true;
               }
            }

            if (!var20) {
               ((<unrepresentable>)var16).label = 3;
               val var14: Any = copyToFile$default(this, var1, null, (Continuation)var16, 2, null);
               if (var14 != var12) {
                  return var14;
               }

               return var12;
            }

            val var31: gs.a = gs.a.a;
            var10 = this.context;
            val var25: d = new d(var2, var21, this, var1);
            ((<unrepresentable>)var16).L$0 = this;
            ((<unrepresentable>)var16).L$1 = var1;
            var3 = var4;
            ((<unrepresentable>)var16).Z$0 = var4;
            ((<unrepresentable>)var16).label = 1;
            var10 = gs.a.b(var31, (Context)var10, var1, null, var25, (Continuation)var16, 4, null);
            if (var10 === var12) {
               return var12;
            }

            var22 = this;
         }

         var10 = var10 as File;
         var22.onProgress.invoke(var1, kotlin.coroutines.jvm.internal.b.e(100));
         if (!var3) {
            return Uri.fromFile((File)var10);
         }

         val var32: ContentResolverUtils = ContentResolverUtils.INSTANCE;
         if (!ContentResolverUtils.INSTANCE.isJpeg(var22.getResolver(), var1)) {
            return Uri.fromFile((File)var10);
         }

         val var33: File = ContentResolverUtils.createTempFile$default(var32, var22.getResolver(), var1, null, "jpeg", 2, null);
         ((<unrepresentable>)var16).L$0 = var10;
         ((<unrepresentable>)var16).L$1 = null;
         ((<unrepresentable>)var16).label = 2;
         val var17: Any = var22.copyToFile(var1, var33, (Continuation<? super Uri>)var16);
         var13 = (File)var10;
         var22 = (MediaResolver)var17;
         if (var17 === var12) {
            return var12;
         }
      }

      val var18: Uri = var22 as Uri;
      val var26: java.lang.String = (var22 as Uri).getPath();
      if (var26 == null) {
         return Uri.fromFile(var13);
      } else {
         val var27: File = new File(var26);
         if (var27.length() <= var13.length()) {
            var13.delete();
            return var18;
         } else {
            var27.delete();
            return Uri.fromFile(var13);
         }
      }
   }

   @JvmStatic
   fun `handleImage$lambda$7`(var0: Int, var1: Boolean, var2: MediaResolver, var3: Uri, var4: Compression): Unit {
      var4.a(new QualityAndResolutionConstraint(var0, var1));
      hs.g.a(var4, CompressFormat.JPEG);
      hs.e.a(var4, ContentResolverUtils.createTempFile$default(ContentResolverUtils.INSTANCE, var2.getResolver(), var3, null, "jpeg", 2, null));
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
      //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.insertSemaphore(FinallyProcessor.java:350)
      //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.iterateGraph(FinallyProcessor.java:99)
      //
      // Bytecode:
      // 000: aload 4
      // 002: instanceof com/discord/media/utils/MediaResolver$handleVideo$1
      // 005: ifeq 02d
      // 008: aload 4
      // 00a: checkcast com/discord/media/utils/MediaResolver$handleVideo$1
      // 00d: astore 11
      // 00f: aload 11
      // 011: getfield com/discord/media/utils/MediaResolver$handleVideo$1.label I
      // 014: istore 5
      // 016: iload 5
      // 018: ldc_w -2147483648
      // 01b: iand
      // 01c: ifeq 02d
      // 01f: aload 11
      // 021: iload 5
      // 023: ldc_w -2147483648
      // 026: iadd
      // 027: putfield com/discord/media/utils/MediaResolver$handleVideo$1.label I
      // 02a: goto 03c
      // 02d: new com/discord/media/utils/MediaResolver$handleVideo$1
      // 030: dup
      // 031: aload 0
      // 032: aload 4
      // 034: invokespecial com/discord/media/utils/MediaResolver$handleVideo$1.<init> (Lcom/discord/media/utils/MediaResolver;Lkotlin/coroutines/Continuation;)V
      // 037: astore 11
      // 039: goto 02a
      // 03c: aload 11
      // 03e: getfield com/discord/media/utils/MediaResolver$handleVideo$1.result Ljava/lang/Object;
      // 041: astore 12
      // 043: invokestatic ot/b.f ()Ljava/lang/Object;
      // 046: astore 13
      // 048: aload 11
      // 04a: getfield com/discord/media/utils/MediaResolver$handleVideo$1.label I
      // 04d: istore 5
      // 04f: iload 5
      // 051: ifeq 0d2
      // 054: iload 5
      // 056: bipush 1
      // 057: if_icmpeq 081
      // 05a: iload 5
      // 05c: bipush 2
      // 05d: if_icmpeq 079
      // 060: iload 5
      // 062: bipush 3
      // 063: if_icmpne 06e
      // 066: aload 12
      // 068: invokestatic kotlin/c.b (Ljava/lang/Object;)V
      // 06b: aload 12
      // 06d: areturn
      // 06e: new java/lang/IllegalStateException
      // 071: dup
      // 072: ldc_w "call to 'resume' before 'invoke' with coroutine"
      // 075: invokespecial java/lang/IllegalStateException.<init> (Ljava/lang/String;)V
      // 078: athrow
      // 079: aload 12
      // 07b: invokestatic kotlin/c.b (Ljava/lang/Object;)V
      // 07e: goto 300
      // 081: aload 11
      // 083: getfield com/discord/media/utils/MediaResolver$handleVideo$1.L$4 Ljava/lang/Object;
      // 086: checkcast com/discord/media/utils/MediaResolver
      // 089: astore 8
      // 08b: aload 11
      // 08d: getfield com/discord/media/utils/MediaResolver$handleVideo$1.L$3 Ljava/lang/Object;
      // 090: checkcast com/discord/media/utils/DiscordVideoMediaSource
      // 093: astore 10
      // 095: aload 11
      // 097: getfield com/discord/media/utils/MediaResolver$handleVideo$1.L$2 Ljava/lang/Object;
      // 09a: checkcast android/net/Uri
      // 09d: astore 3
      // 09e: aload 11
      // 0a0: getfield com/discord/media/utils/MediaResolver$handleVideo$1.L$1 Ljava/lang/Object;
      // 0a3: checkcast android/net/Uri
      // 0a6: astore 1
      // 0a7: aload 11
      // 0a9: getfield com/discord/media/utils/MediaResolver$handleVideo$1.L$0 Ljava/lang/Object;
      // 0ac: checkcast com/discord/media/utils/MediaResolver
      // 0af: astore 4
      // 0b1: aload 12
      // 0b3: invokestatic kotlin/c.b (Ljava/lang/Object;)V
      // 0b6: goto 20b
      // 0b9: astore 6
      // 0bb: aload 3
      // 0bc: astore 7
      // 0be: aload 1
      // 0bf: astore 8
      // 0c1: aload 4
      // 0c3: astore 1
      // 0c4: aload 6
      // 0c6: astore 3
      // 0c7: aload 8
      // 0c9: astore 6
      // 0cb: aload 7
      // 0cd: astore 4
      // 0cf: goto 270
      // 0d2: aload 12
      // 0d4: invokestatic kotlin/c.b (Ljava/lang/Object;)V
      // 0d7: getstatic com/discord/media/utils/ContentResolverUtils.INSTANCE Lcom/discord/media/utils/ContentResolverUtils;
      // 0da: aload 0
      // 0db: invokespecial com/discord/media/utils/MediaResolver.getResolver ()Landroid/content/ContentResolver;
      // 0de: aload 1
      // 0df: aconst_null
      // 0e0: ldc "mp4"
      // 0e2: bipush 2
      // 0e3: aconst_null
      // 0e4: invokestatic com/discord/media/utils/ContentResolverUtils.createTempFile$default (Lcom/discord/media/utils/ContentResolverUtils;Landroid/content/ContentResolver;Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/io/File;
      // 0e7: invokestatic android/net/Uri.fromFile (Ljava/io/File;)Landroid/net/Uri;
      // 0ea: astore 4
      // 0ec: getstatic kotlin/Result.e Lkotlin/Result$a;
      // 0ef: astore 6
      // 0f1: new com/discord/media/utils/DiscordVideoMediaSource
      // 0f4: astore 6
      // 0f6: aload 6
      // 0f8: aload 0
      // 0f9: getfield com/discord/media/utils/MediaResolver.context Landroid/content/Context;
      // 0fc: aload 1
      // 0fd: invokespecial com/discord/media/utils/DiscordVideoMediaSource.<init> (Landroid/content/Context;Landroid/net/Uri;)V
      // 100: aload 6
      // 102: invokestatic kotlin/Result.b (Ljava/lang/Object;)Ljava/lang/Object;
      // 105: astore 6
      // 107: goto 11b
      // 10a: astore 6
      // 10c: getstatic kotlin/Result.e Lkotlin/Result$a;
      // 10f: astore 7
      // 111: aload 6
      // 113: invokestatic kotlin/c.a (Ljava/lang/Throwable;)Ljava/lang/Object;
      // 116: invokestatic kotlin/Result.b (Ljava/lang/Object;)Ljava/lang/Object;
      // 119: astore 6
      // 11b: aload 6
      // 11d: invokestatic kotlin/Result.e (Ljava/lang/Object;)Ljava/lang/Throwable;
      // 120: astore 8
      // 122: aload 8
      // 124: ifnull 168
      // 127: aload 8
      // 129: invokevirtual java/lang/Throwable.getMessage ()Ljava/lang/String;
      // 12c: astore 7
      // 12e: new java/lang/StringBuilder
      // 131: dup
      // 132: invokespecial java/lang/StringBuilder.<init> ()V
      // 135: astore 9
      // 137: aload 9
      // 139: ldc_w "["
      // 13c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 13f: pop
      // 140: aload 9
      // 142: aload 8
      // 144: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 147: pop
      // 148: aload 9
      // 14a: ldc_w "] Error creating source: "
      // 14d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 150: pop
      // 151: aload 9
      // 153: aload 7
      // 155: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 158: pop
      // 159: aload 0
      // 15a: ldc_w "Media source error"
      // 15d: aload 9
      // 15f: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 162: aload 1
      // 163: aload 4
      // 165: invokespecial com/discord/media/utils/MediaResolver.logMediaError (Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;Landroid/net/Uri;)V
      // 168: aload 6
      // 16a: astore 7
      // 16c: aload 6
      // 16e: invokestatic kotlin/Result.g (Ljava/lang/Object;)Z
      // 171: ifeq 177
      // 174: aconst_null
      // 175: astore 7
      // 177: aload 7
      // 179: checkcast com/discord/media/utils/DiscordVideoMediaSource
      // 17c: astore 10
      // 17e: aload 10
      // 180: ifnull 30e
      // 183: iload 2
      // 184: ifeq 19b
      // 187: aload 0
      // 188: astore 6
      // 18a: aload 1
      // 18b: astore 3
      // 18c: aload 4
      // 18e: astore 7
      // 190: aload 6
      // 192: astore 4
      // 194: aload 6
      // 196: astore 8
      // 198: goto 224
      // 19b: aload 3
      // 19c: ifnull 25f
      // 19f: getstatic com/discord/media/utils/Transcoder.INSTANCE Lcom/discord/media/utils/Transcoder;
      // 1a2: astore 9
      // 1a4: aload 0
      // 1a5: aload 1
      // 1a6: invokespecial com/discord/media/utils/MediaResolver.getRequestId (Landroid/net/Uri;)Ljava/lang/String;
      // 1a9: astore 6
      // 1ab: aload 0
      // 1ac: getfield com/discord/media/utils/MediaResolver.context Landroid/content/Context;
      // 1af: astore 8
      // 1b1: new com/discord/media/utils/e
      // 1b4: astore 7
      // 1b6: aload 7
      // 1b8: aload 0
      // 1b9: aload 1
      // 1ba: invokespecial com/discord/media/utils/e.<init> (Lcom/discord/media/utils/MediaResolver;Landroid/net/Uri;)V
      // 1bd: aload 11
      // 1bf: aload 0
      // 1c0: putfield com/discord/media/utils/MediaResolver$handleVideo$1.L$0 Ljava/lang/Object;
      // 1c3: aload 11
      // 1c5: aload 1
      // 1c6: putfield com/discord/media/utils/MediaResolver$handleVideo$1.L$1 Ljava/lang/Object;
      // 1c9: aload 11
      // 1cb: aload 4
      // 1cd: putfield com/discord/media/utils/MediaResolver$handleVideo$1.L$2 Ljava/lang/Object;
      // 1d0: aload 11
      // 1d2: aload 10
      // 1d4: putfield com/discord/media/utils/MediaResolver$handleVideo$1.L$3 Ljava/lang/Object;
      // 1d7: aload 11
      // 1d9: aload 0
      // 1da: putfield com/discord/media/utils/MediaResolver$handleVideo$1.L$4 Ljava/lang/Object;
      // 1dd: aload 11
      // 1df: bipush 1
      // 1e0: putfield com/discord/media/utils/MediaResolver$handleVideo$1.label I
      // 1e3: aload 9
      // 1e5: aload 6
      // 1e7: aload 8
      // 1e9: aload 10
      // 1eb: aload 4
      // 1ed: aload 3
      // 1ee: aload 7
      // 1f0: aload 11
      // 1f2: invokevirtual com/discord/media/utils/Transcoder.convertCompress (Ljava/lang/String;Landroid/content/Context;Lcom/discord/media/utils/DiscordVideoMediaSource;Landroid/net/Uri;Lcom/discord/media/utils/EncodingConfig;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
      // 1f5: astore 12
      // 1f7: aload 12
      // 1f9: aload 13
      // 1fb: if_acmpne 201
      // 1fe: goto 325
      // 201: aload 0
      // 202: astore 8
      // 204: aload 4
      // 206: astore 3
      // 207: aload 8
      // 209: astore 4
      // 20b: aload 1
      // 20c: astore 6
      // 20e: aload 3
      // 20f: astore 7
      // 211: aload 4
      // 213: astore 9
      // 215: aload 12
      // 217: checkcast android/net/Uri
      // 21a: astore 12
      // 21c: aload 3
      // 21d: astore 7
      // 21f: aload 1
      // 220: astore 3
      // 221: aload 12
      // 223: astore 1
      // 224: aload 3
      // 225: astore 6
      // 227: aload 4
      // 229: astore 9
      // 22b: aload 8
      // 22d: aload 3
      // 22e: aload 1
      // 22f: aload 10
      // 231: invokevirtual xm/a.getSize ()J
      // 234: invokespecial com/discord/media/utils/MediaResolver.createMP4FastStartUri (Landroid/net/Uri;Landroid/net/Uri;J)Landroid/net/Uri;
      // 237: astore 3
      // 238: aload 3
      // 239: ifnonnull 23f
      // 23c: goto 241
      // 23f: aload 3
      // 240: astore 1
      // 241: aload 1
      // 242: areturn
      // 243: astore 3
      // 244: aload 9
      // 246: astore 1
      // 247: aload 7
      // 249: astore 4
      // 24b: goto 270
      // 24e: astore 3
      // 24f: aload 0
      // 250: astore 6
      // 252: aload 1
      // 253: astore 7
      // 255: aload 6
      // 257: astore 1
      // 258: aload 7
      // 25a: astore 6
      // 25c: goto 270
      // 25f: new java/lang/IllegalArgumentException
      // 262: astore 3
      // 263: aload 3
      // 264: ldc_w "encodingConfig is required"
      // 267: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 26a: aload 3
      // 26b: athrow
      // 26c: astore 3
      // 26d: goto 24f
      // 270: getstatic kotlin/Result.e Lkotlin/Result$a;
      // 273: astore 7
      // 275: aload 3
      // 276: invokestatic kotlin/c.a (Ljava/lang/Throwable;)Ljava/lang/Object;
      // 279: invokestatic kotlin/Result.b (Ljava/lang/Object;)Ljava/lang/Object;
      // 27c: astore 3
      // 27d: aload 3
      // 27e: invokestatic kotlin/Result.e (Ljava/lang/Object;)Ljava/lang/Throwable;
      // 281: astore 7
      // 283: aload 7
      // 285: ifnonnull 28d
      // 288: aload 3
      // 289: astore 1
      // 28a: goto 306
      // 28d: aload 7
      // 28f: instanceof java/util/concurrent/CancellationException
      // 292: ifne 30b
      // 295: aload 7
      // 297: invokevirtual java/lang/Throwable.getMessage ()Ljava/lang/String;
      // 29a: astore 3
      // 29b: new java/lang/StringBuilder
      // 29e: dup
      // 29f: invokespecial java/lang/StringBuilder.<init> ()V
      // 2a2: astore 7
      // 2a4: aload 7
      // 2a6: ldc_w "Error compressing/converting video: "
      // 2a9: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2ac: pop
      // 2ad: aload 7
      // 2af: aload 3
      // 2b0: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2b3: pop
      // 2b4: aload 1
      // 2b5: ldc_w "Media conversion error"
      // 2b8: aload 7
      // 2ba: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 2bd: aload 6
      // 2bf: aload 4
      // 2c1: invokespecial com/discord/media/utils/MediaResolver.logMediaError (Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;Landroid/net/Uri;)V
      // 2c4: aload 11
      // 2c6: aconst_null
      // 2c7: putfield com/discord/media/utils/MediaResolver$handleVideo$1.L$0 Ljava/lang/Object;
      // 2ca: aload 11
      // 2cc: aconst_null
      // 2cd: putfield com/discord/media/utils/MediaResolver$handleVideo$1.L$1 Ljava/lang/Object;
      // 2d0: aload 11
      // 2d2: aconst_null
      // 2d3: putfield com/discord/media/utils/MediaResolver$handleVideo$1.L$2 Ljava/lang/Object;
      // 2d6: aload 11
      // 2d8: aconst_null
      // 2d9: putfield com/discord/media/utils/MediaResolver$handleVideo$1.L$3 Ljava/lang/Object;
      // 2dc: aload 11
      // 2de: aconst_null
      // 2df: putfield com/discord/media/utils/MediaResolver$handleVideo$1.L$4 Ljava/lang/Object;
      // 2e2: aload 11
      // 2e4: bipush 2
      // 2e5: putfield com/discord/media/utils/MediaResolver$handleVideo$1.label I
      // 2e8: aload 1
      // 2e9: aload 6
      // 2eb: aconst_null
      // 2ec: aload 11
      // 2ee: bipush 2
      // 2ef: aconst_null
      // 2f0: invokestatic com/discord/media/utils/MediaResolver.copyToFile$default (Lcom/discord/media/utils/MediaResolver;Landroid/net/Uri;Ljava/io/File;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
      // 2f3: astore 1
      // 2f4: aload 1
      // 2f5: astore 12
      // 2f7: aload 1
      // 2f8: aload 13
      // 2fa: if_acmpne 300
      // 2fd: goto 325
      // 300: aload 12
      // 302: checkcast android/net/Uri
      // 305: astore 1
      // 306: aload 1
      // 307: checkcast android/net/Uri
      // 30a: areturn
      // 30b: aload 7
      // 30d: athrow
      // 30e: aload 11
      // 310: bipush 3
      // 311: putfield com/discord/media/utils/MediaResolver$handleVideo$1.label I
      // 314: aload 0
      // 315: aload 1
      // 316: aconst_null
      // 317: aload 11
      // 319: bipush 2
      // 31a: aconst_null
      // 31b: invokestatic com/discord/media/utils/MediaResolver.copyToFile$default (Lcom/discord/media/utils/MediaResolver;Landroid/net/Uri;Ljava/io/File;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
      // 31e: astore 1
      // 31f: aload 1
      // 320: aload 13
      // 322: if_acmpne 328
      // 325: aload 13
      // 327: areturn
      // 328: aload 1
      // 329: areturn
   }

   @JvmStatic
   fun `handleVideo$lambda$4$lambda$3`(var0: MediaResolver, var1: Uri, var2: Float): Unit {
      var0.onProgress.invoke(var1, (int)(var2 * (float)100));
      return Unit.a;
   }

   private fun logMediaError(tag: String, message: String, inputUri: Uri, outputUri: Uri) {
      val var5: CrashReporting = CrashReporting.INSTANCE;
      CrashReporting.addBreadcrumb$default(
         CrashReporting.INSTANCE, var2, s0.m(new Pair[]{v.a("inputUri", var3.toString()), v.a("outputUri", var4.toString())}), null, null, 12, null
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
      return g.g(
         m0.b(),
         new Function2<CoroutineScope, Continuation<? super Uri>, Object>(this, var1, var4, var6, var2, var3, var5, null) {
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

            public final Continuation<Unit> create(Object var1, Continuation<?> var2) {
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

            public final Object invoke(CoroutineScope var1, Continuation<? super Uri> var2x) {
               return (this.create(var1, var2x) as <unrepresentable>).invokeSuspend(Unit.a);
            }

            public final Object invokeSuspend(Object var1) {
               val var6: Any = ot.b.f();
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
                  var var18: MediaResolver = this.this$0;
                  val var7: Uri = this.$inputUri;
                  val var14: Boolean = this.$skipVideoTranscode;
                  val var12: EncodingConfig = this.$encodingConfig;
                  this.label = 2;
                  var18 = (MediaResolver)MediaResolver.access$handleVideo(var18, var7, var14, var12, this);
                  return if (var18 != var6) var18 as Uri else var6;
               } else if (var9.isImage(MediaResolver.access$getResolver(this.this$0), this.$inputUri)) {
                  var1 = this.this$0;
                  var var16: Uri = this.$inputUri;
                  val var13: Int = this.$imageCompressionQuality;
                  val var3: Boolean = this.$isLowQuality;
                  val var4: Boolean = this.$useOriginalIfSmaller;
                  this.label = 3;
                  var16 = (Uri)MediaResolver.access$handleImage(var1, var16, var13, var3, var4, this);
                  return if (var16 != var6) var16 else var6;
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

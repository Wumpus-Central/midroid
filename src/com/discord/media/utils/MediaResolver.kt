package com.discord.media.utils

import android.annotation.SuppressLint
import android.content.ContentResolver
import android.content.Context
import android.graphics.Bitmap.CompressFormat
import android.net.Uri
import com.discord.crash_reporting.CrashReporting
import com.discord.crash_reporting.CrashReporting.ErrorLevel
import fm.v
import id.zelory.compressor.constraint.Compression
import java.io.File
import java.io.InputStream
import jp.k0
import kotlin.coroutines.Continuation
import kotlin.jvm.functions.Function2
import kotlin.jvm.internal.SourceDebugExtension
import kotlinx.coroutines.CoroutineScope
import nl.g
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
      val var2: Any = jp.f.g(
         k0.b(),
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
               km.b.e();
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
                              if (StringsKt.I(var8, "temp_", false, 2, null) && var9.lastModified() < var6) {
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
      return if (var2 === km.b.e()) var2 else Unit.a;
   }

   private suspend fun copyToFile(uri: Uri, targetFile: File? = ...): Uri {
      return jp.f.g(
         k0.b(),
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
               km.b.e();
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
                           pm.c.a(var12, var5);
                        }
                     }

                     pm.c.a(var12, null);
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
      // 52: invokestatic nq/a.a (Ljava/io/FileDescriptor;Ljava/io/File;)Z
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

      var var23: Any;
      label92: {
         var23 = (File)((<unrepresentable>)var16).result;
         val var12: Any = km.b.e();
         var var10: Any;
         val var17: MediaResolver;
         if (((<unrepresentable>)var16).label != 0) {
            if (((<unrepresentable>)var16).label != 1) {
               if (((<unrepresentable>)var16).label != 2) {
                  if (((<unrepresentable>)var16).label == 3) {
                     kotlin.c.b(var23);
                     return var23;
                  }

                  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
               }

               var13 = ((<unrepresentable>)var16).L$0 as File;
               kotlin.c.b(var23);
               break label92;
            }

            var3 = ((<unrepresentable>)var16).Z$0;
            var1 = ((<unrepresentable>)var16).L$1 as Uri;
            val var11: MediaResolver = ((<unrepresentable>)var16).L$0 as MediaResolver;
            kotlin.c.b(var23);
            var10 = var23;
            var23 = var16;
            var17 = var11;
         } else {
            kotlin.c.b(var23);
            var23 = this.getResolver();
            var10 = ContentResolverUtils.INSTANCE;
            val var21: Boolean;
            if (ContentResolverUtils.INSTANCE.isHeif((ContentResolver)var23, var1)
               || ((ContentResolverUtils)var10).isJpeg((ContentResolver)var23, var1)
               || var3 && ((ContentResolverUtils)var10).isPng((ContentResolver)var23, var1)) {
               var21 = true;
            } else {
               var21 = false;
            }

            var var22: Boolean = false;
            if (var21) {
               var22 = false;
               if (var3) {
                  var22 = true;
               }
            }

            if (!var21) {
               ((<unrepresentable>)var16).label = 3;
               val var14: Any = copyToFile$default(this, var1, null, (Continuation)var16, 2, null);
               if (var14 != var12) {
                  return var14;
               }

               return var12;
            }

            var23 = ml.a.a;
            var10 = this.context;
            val var32: d = new d(var2, var22, this, var1);
            ((<unrepresentable>)var16).L$0 = this;
            ((<unrepresentable>)var16).L$1 = var1;
            ((<unrepresentable>)var16).Z$0 = var4;
            ((<unrepresentable>)var16).label = 1;
            var10 = ml.a.b((ml.a)var23, (Context)var10, var1, null, var32, (Continuation)var16, 4, null);
            var23 = var16;
            if (var10 === var12) {
               return var12;
            }

            var17 = this;
            var3 = var4;
         }

         var10 = var10 as File;
         var17.onProgress.invoke(var1, kotlin.coroutines.jvm.internal.b.e(100));
         if (!var3) {
            return Uri.fromFile((File)var10);
         }

         val var33: ContentResolverUtils = ContentResolverUtils.INSTANCE;
         if (!ContentResolverUtils.INSTANCE.isJpeg(var17.getResolver(), var1)) {
            return Uri.fromFile((File)var10);
         }

         val var34: File = ContentResolverUtils.createTempFile$default(var33, var17.getResolver(), var1, null, "jpeg", 2, null);
         ((<unrepresentable>)var23).L$0 = var10;
         ((<unrepresentable>)var23).L$1 = null;
         ((<unrepresentable>)var23).label = 2;
         val var18: Any = var17.copyToFile(var1, var34, (Continuation)var23);
         var13 = (File)var10;
         var23 = (File)var18;
         if (var18 === var12) {
            return var12;
         }
      }

      val var19: Uri = var23 as Uri;
      var23 = (var23 as Uri).getPath();
      if (var23 == null) {
         return Uri.fromFile(var13);
      } else {
         var23 = new File((java.lang.String)var23);
         if (var23.length() <= var13.length()) {
            var13.delete();
            return var19;
         } else {
            var23.delete();
            return Uri.fromFile(var13);
         }
      }
   }

   @JvmStatic
   fun `handleImage$lambda$7`(var0: Int, var1: Boolean, var2: MediaResolver, var3: Uri, var4: Compression): Unit {
      var4.a(new QualityAndResolutionConstraint(var0, var1));
      g.a(var4, CompressFormat.JPEG);
      nl.e.a(var4, ContentResolverUtils.createTempFile$default(ContentResolverUtils.INSTANCE, var2.getResolver(), var3, null, "jpeg", 2, null));
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
      // 043: invokestatic km/b.e ()Ljava/lang/Object;
      // 046: astore 13
      // 048: aload 11
      // 04a: getfield com/discord/media/utils/MediaResolver$handleVideo$1.label I
      // 04d: istore 5
      // 04f: iload 5
      // 051: ifeq 0ce
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
      // 07e: goto 2fa
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
      // 0b6: goto 207
      // 0b9: astore 8
      // 0bb: aload 3
      // 0bc: astore 7
      // 0be: aload 1
      // 0bf: astore 6
      // 0c1: aload 4
      // 0c3: astore 1
      // 0c4: aload 8
      // 0c6: astore 3
      // 0c7: aload 7
      // 0c9: astore 4
      // 0cb: goto 26c
      // 0ce: aload 12
      // 0d0: invokestatic kotlin/c.b (Ljava/lang/Object;)V
      // 0d3: getstatic com/discord/media/utils/ContentResolverUtils.INSTANCE Lcom/discord/media/utils/ContentResolverUtils;
      // 0d6: aload 0
      // 0d7: invokespecial com/discord/media/utils/MediaResolver.getResolver ()Landroid/content/ContentResolver;
      // 0da: aload 1
      // 0db: aconst_null
      // 0dc: ldc "mp4"
      // 0de: bipush 2
      // 0df: aconst_null
      // 0e0: invokestatic com/discord/media/utils/ContentResolverUtils.createTempFile$default (Lcom/discord/media/utils/ContentResolverUtils;Landroid/content/ContentResolver;Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/io/File;
      // 0e3: invokestatic android/net/Uri.fromFile (Ljava/io/File;)Landroid/net/Uri;
      // 0e6: astore 4
      // 0e8: getstatic kotlin/Result.e Lkotlin/Result$a;
      // 0eb: astore 6
      // 0ed: new com/discord/media/utils/DiscordVideoMediaSource
      // 0f0: astore 6
      // 0f2: aload 6
      // 0f4: aload 0
      // 0f5: getfield com/discord/media/utils/MediaResolver.context Landroid/content/Context;
      // 0f8: aload 1
      // 0f9: invokespecial com/discord/media/utils/DiscordVideoMediaSource.<init> (Landroid/content/Context;Landroid/net/Uri;)V
      // 0fc: aload 6
      // 0fe: invokestatic kotlin/Result.b (Ljava/lang/Object;)Ljava/lang/Object;
      // 101: astore 6
      // 103: goto 117
      // 106: astore 7
      // 108: getstatic kotlin/Result.e Lkotlin/Result$a;
      // 10b: astore 6
      // 10d: aload 7
      // 10f: invokestatic kotlin/c.a (Ljava/lang/Throwable;)Ljava/lang/Object;
      // 112: invokestatic kotlin/Result.b (Ljava/lang/Object;)Ljava/lang/Object;
      // 115: astore 6
      // 117: aload 6
      // 119: invokestatic kotlin/Result.e (Ljava/lang/Object;)Ljava/lang/Throwable;
      // 11c: astore 8
      // 11e: aload 8
      // 120: ifnull 164
      // 123: aload 8
      // 125: invokevirtual java/lang/Throwable.getMessage ()Ljava/lang/String;
      // 128: astore 9
      // 12a: new java/lang/StringBuilder
      // 12d: dup
      // 12e: invokespecial java/lang/StringBuilder.<init> ()V
      // 131: astore 7
      // 133: aload 7
      // 135: ldc_w "["
      // 138: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 13b: pop
      // 13c: aload 7
      // 13e: aload 8
      // 140: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 143: pop
      // 144: aload 7
      // 146: ldc_w "] Error creating source: "
      // 149: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 14c: pop
      // 14d: aload 7
      // 14f: aload 9
      // 151: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 154: pop
      // 155: aload 0
      // 156: ldc_w "Media source error"
      // 159: aload 7
      // 15b: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 15e: aload 1
      // 15f: aload 4
      // 161: invokespecial com/discord/media/utils/MediaResolver.logMediaError (Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;Landroid/net/Uri;)V
      // 164: aload 6
      // 166: astore 7
      // 168: aload 6
      // 16a: invokestatic kotlin/Result.g (Ljava/lang/Object;)Z
      // 16d: ifeq 173
      // 170: aconst_null
      // 171: astore 7
      // 173: aload 7
      // 175: checkcast com/discord/media/utils/DiscordVideoMediaSource
      // 178: astore 10
      // 17a: aload 10
      // 17c: ifnull 308
      // 17f: iload 2
      // 180: ifeq 197
      // 183: aload 0
      // 184: astore 6
      // 186: aload 1
      // 187: astore 3
      // 188: aload 4
      // 18a: astore 7
      // 18c: aload 6
      // 18e: astore 4
      // 190: aload 6
      // 192: astore 8
      // 194: goto 220
      // 197: aload 3
      // 198: ifnull 25b
      // 19b: getstatic com/discord/media/utils/Transcoder.INSTANCE Lcom/discord/media/utils/Transcoder;
      // 19e: astore 9
      // 1a0: aload 0
      // 1a1: aload 1
      // 1a2: invokespecial com/discord/media/utils/MediaResolver.getRequestId (Landroid/net/Uri;)Ljava/lang/String;
      // 1a5: astore 6
      // 1a7: aload 0
      // 1a8: getfield com/discord/media/utils/MediaResolver.context Landroid/content/Context;
      // 1ab: astore 8
      // 1ad: new com/discord/media/utils/e
      // 1b0: astore 7
      // 1b2: aload 7
      // 1b4: aload 0
      // 1b5: aload 1
      // 1b6: invokespecial com/discord/media/utils/e.<init> (Lcom/discord/media/utils/MediaResolver;Landroid/net/Uri;)V
      // 1b9: aload 11
      // 1bb: aload 0
      // 1bc: putfield com/discord/media/utils/MediaResolver$handleVideo$1.L$0 Ljava/lang/Object;
      // 1bf: aload 11
      // 1c1: aload 1
      // 1c2: putfield com/discord/media/utils/MediaResolver$handleVideo$1.L$1 Ljava/lang/Object;
      // 1c5: aload 11
      // 1c7: aload 4
      // 1c9: putfield com/discord/media/utils/MediaResolver$handleVideo$1.L$2 Ljava/lang/Object;
      // 1cc: aload 11
      // 1ce: aload 10
      // 1d0: putfield com/discord/media/utils/MediaResolver$handleVideo$1.L$3 Ljava/lang/Object;
      // 1d3: aload 11
      // 1d5: aload 0
      // 1d6: putfield com/discord/media/utils/MediaResolver$handleVideo$1.L$4 Ljava/lang/Object;
      // 1d9: aload 11
      // 1db: bipush 1
      // 1dc: putfield com/discord/media/utils/MediaResolver$handleVideo$1.label I
      // 1df: aload 9
      // 1e1: aload 6
      // 1e3: aload 8
      // 1e5: aload 10
      // 1e7: aload 4
      // 1e9: aload 3
      // 1ea: aload 7
      // 1ec: aload 11
      // 1ee: invokevirtual com/discord/media/utils/Transcoder.convertCompress (Ljava/lang/String;Landroid/content/Context;Lcom/discord/media/utils/DiscordVideoMediaSource;Landroid/net/Uri;Lcom/discord/media/utils/EncodingConfig;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
      // 1f1: astore 12
      // 1f3: aload 12
      // 1f5: aload 13
      // 1f7: if_acmpne 1fd
      // 1fa: goto 31f
      // 1fd: aload 0
      // 1fe: astore 8
      // 200: aload 4
      // 202: astore 3
      // 203: aload 8
      // 205: astore 4
      // 207: aload 1
      // 208: astore 6
      // 20a: aload 3
      // 20b: astore 7
      // 20d: aload 4
      // 20f: astore 9
      // 211: aload 12
      // 213: checkcast android/net/Uri
      // 216: astore 12
      // 218: aload 3
      // 219: astore 7
      // 21b: aload 1
      // 21c: astore 3
      // 21d: aload 12
      // 21f: astore 1
      // 220: aload 3
      // 221: astore 6
      // 223: aload 4
      // 225: astore 9
      // 227: aload 8
      // 229: aload 3
      // 22a: aload 1
      // 22b: aload 10
      // 22d: invokevirtual sj/a.getSize ()J
      // 230: invokespecial com/discord/media/utils/MediaResolver.createMP4FastStartUri (Landroid/net/Uri;Landroid/net/Uri;J)Landroid/net/Uri;
      // 233: astore 3
      // 234: aload 3
      // 235: ifnonnull 23b
      // 238: goto 23d
      // 23b: aload 3
      // 23c: astore 1
      // 23d: aload 1
      // 23e: areturn
      // 23f: astore 3
      // 240: aload 9
      // 242: astore 1
      // 243: aload 7
      // 245: astore 4
      // 247: goto 26c
      // 24a: astore 3
      // 24b: aload 0
      // 24c: astore 6
      // 24e: aload 1
      // 24f: astore 7
      // 251: aload 6
      // 253: astore 1
      // 254: aload 7
      // 256: astore 6
      // 258: goto 26c
      // 25b: new java/lang/IllegalArgumentException
      // 25e: astore 3
      // 25f: aload 3
      // 260: ldc_w "encodingConfig is required"
      // 263: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 266: aload 3
      // 267: athrow
      // 268: astore 3
      // 269: goto 24b
      // 26c: getstatic kotlin/Result.e Lkotlin/Result$a;
      // 26f: astore 7
      // 271: aload 3
      // 272: invokestatic kotlin/c.a (Ljava/lang/Throwable;)Ljava/lang/Object;
      // 275: invokestatic kotlin/Result.b (Ljava/lang/Object;)Ljava/lang/Object;
      // 278: astore 3
      // 279: aload 3
      // 27a: invokestatic kotlin/Result.e (Ljava/lang/Object;)Ljava/lang/Throwable;
      // 27d: astore 7
      // 27f: aload 7
      // 281: ifnonnull 289
      // 284: aload 3
      // 285: astore 1
      // 286: goto 300
      // 289: aload 7
      // 28b: instanceof java/util/concurrent/CancellationException
      // 28e: ifne 305
      // 291: aload 7
      // 293: invokevirtual java/lang/Throwable.getMessage ()Ljava/lang/String;
      // 296: astore 7
      // 298: new java/lang/StringBuilder
      // 29b: dup
      // 29c: invokespecial java/lang/StringBuilder.<init> ()V
      // 29f: astore 3
      // 2a0: aload 3
      // 2a1: ldc_w "Error compressing/converting video: "
      // 2a4: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2a7: pop
      // 2a8: aload 3
      // 2a9: aload 7
      // 2ab: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 2ae: pop
      // 2af: aload 1
      // 2b0: ldc_w "Media conversion error"
      // 2b3: aload 3
      // 2b4: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 2b7: aload 6
      // 2b9: aload 4
      // 2bb: invokespecial com/discord/media/utils/MediaResolver.logMediaError (Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;Landroid/net/Uri;)V
      // 2be: aload 11
      // 2c0: aconst_null
      // 2c1: putfield com/discord/media/utils/MediaResolver$handleVideo$1.L$0 Ljava/lang/Object;
      // 2c4: aload 11
      // 2c6: aconst_null
      // 2c7: putfield com/discord/media/utils/MediaResolver$handleVideo$1.L$1 Ljava/lang/Object;
      // 2ca: aload 11
      // 2cc: aconst_null
      // 2cd: putfield com/discord/media/utils/MediaResolver$handleVideo$1.L$2 Ljava/lang/Object;
      // 2d0: aload 11
      // 2d2: aconst_null
      // 2d3: putfield com/discord/media/utils/MediaResolver$handleVideo$1.L$3 Ljava/lang/Object;
      // 2d6: aload 11
      // 2d8: aconst_null
      // 2d9: putfield com/discord/media/utils/MediaResolver$handleVideo$1.L$4 Ljava/lang/Object;
      // 2dc: aload 11
      // 2de: bipush 2
      // 2df: putfield com/discord/media/utils/MediaResolver$handleVideo$1.label I
      // 2e2: aload 1
      // 2e3: aload 6
      // 2e5: aconst_null
      // 2e6: aload 11
      // 2e8: bipush 2
      // 2e9: aconst_null
      // 2ea: invokestatic com/discord/media/utils/MediaResolver.copyToFile$default (Lcom/discord/media/utils/MediaResolver;Landroid/net/Uri;Ljava/io/File;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
      // 2ed: astore 1
      // 2ee: aload 1
      // 2ef: astore 12
      // 2f1: aload 1
      // 2f2: aload 13
      // 2f4: if_acmpne 2fa
      // 2f7: goto 31f
      // 2fa: aload 12
      // 2fc: checkcast android/net/Uri
      // 2ff: astore 1
      // 300: aload 1
      // 301: checkcast android/net/Uri
      // 304: areturn
      // 305: aload 7
      // 307: athrow
      // 308: aload 11
      // 30a: bipush 3
      // 30b: putfield com/discord/media/utils/MediaResolver$handleVideo$1.label I
      // 30e: aload 0
      // 30f: aload 1
      // 310: aconst_null
      // 311: aload 11
      // 313: bipush 2
      // 314: aconst_null
      // 315: invokestatic com/discord/media/utils/MediaResolver.copyToFile$default (Lcom/discord/media/utils/MediaResolver;Landroid/net/Uri;Ljava/io/File;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
      // 318: astore 1
      // 319: aload 1
      // 31a: aload 13
      // 31c: if_acmpne 322
      // 31f: aload 13
      // 321: areturn
      // 322: aload 1
      // 323: areturn
   }

   @JvmStatic
   fun `handleVideo$lambda$4$lambda$3`(var0: MediaResolver, var1: Uri, var2: Float): Unit {
      var0.onProgress.invoke(var1, (int)(var2 * (float)100));
      return Unit.a;
   }

   private fun logMediaError(tag: String, message: String, inputUri: Uri, outputUri: Uri) {
      val var5: CrashReporting = CrashReporting.INSTANCE;
      CrashReporting.addBreadcrumb$default(
         CrashReporting.INSTANCE, var2, n0.m(new Pair[]{v.a("inputUri", var3.toString()), v.a("outputUri", var4.toString())}), null, null, 12, null
      );
      var5.captureMessage(var1, var2, ErrorLevel.WARNING);
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
      return jp.f.g(
         k0.b(),
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
               val var6: Any = km.b.e();
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
                  var var18: Uri = this.$inputUri;
                  val var14: Boolean = this.$skipVideoTranscode;
                  val var7: EncodingConfig = this.$encodingConfig;
                  this.label = 2;
                  var18 = (Uri)MediaResolver.access$handleVideo(var1, var18, var14, var7, this);
                  return if (var18 != var6) var18 else var6;
               } else if (var9.isImage(MediaResolver.access$getResolver(this.this$0), this.$inputUri)) {
                  var var16: MediaResolver = this.this$0;
                  val var11: Uri = this.$inputUri;
                  val var13: Int = this.$imageCompressionQuality;
                  val var3: Boolean = this.$isLowQuality;
                  val var4: Boolean = this.$useOriginalIfSmaller;
                  this.label = 3;
                  var16 = (MediaResolver)MediaResolver.access$handleImage(var16, var11, var13, var3, var4, this);
                  return if (var16 != var6) var16 as Uri else var6;
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

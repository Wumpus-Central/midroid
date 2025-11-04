package com.discord.file_manager

import android.annotation.SuppressLint
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.graphics.Bitmap.CompressFormat
import android.media.MediaScannerConnection
import android.net.Uri
import android.os.Environment
import android.os.ParcelFileDescriptor
import android.util.Base64
import com.discord.codegen.NativeFileModuleSpec
import com.facebook.react.bridge.Promise
import com.facebook.react.bridge.ReactApplicationContext
import gu.m0
import ht.v
import java.io.Closeable
import java.io.File
import java.io.FileInputStream
import java.io.FileOutputStream
import java.io.InputStream
import java.net.URL
import java.util.HashMap
import kotlin.Result.a
import kotlin.coroutines.Continuation
import kotlin.jvm.functions.Function2
import kotlin.jvm.internal.SourceDebugExtension
import kotlinx.coroutines.CoroutineScope
import ot.b

@SourceDebugExtension(["SMAP\nFileModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileModule.kt\ncom/discord/file_manager/FileModule\n+ 2 Uri.kt\nandroidx/core/net/UriKt\n*L\n1#1,320:1\n29#2:321\n*S KotlinDebug\n*F\n+ 1 FileModule.kt\ncom/discord/file_manager/FileModule\n*L\n186#1:321\n*E\n"])
public class FileModule(reactContext: ReactApplicationContext) : NativeFileModuleSpec(var1) {
   private final val ioScope: CoroutineScope = kotlinx.coroutines.i.a(m0.b())
   private final val storageDirs: HashMap<String, String> =
      s0.k(
         new Pair[]{
            v.a("cache", this.getReactApplicationContext().getCacheDir().getAbsolutePath()),
            v.a("documents", this.getReactApplicationContext().getFilesDir().getAbsolutePath())
         }
      )

   public override fun clearFolder(storageDir: String, path: String, promise: Promise) {
      gu.g.d(this.ioScope, null, null, new Function2<CoroutineScope, Continuation<? super Unit>, Object>(this, var1, var3, var2, null) {
         final java.lang.String $path;
         final Promise $promise;
         final java.lang.String $storageDir;
         int label;
         final FileModule this$0;

         {
            super(2, var5);
            this.this$0 = var1;
            this.$storageDir = var2x;
            this.$promise = var3;
            this.$path = var4;
         }

         public final Continuation<Unit> create(Object var1, Continuation<?> var2) {
            return new <anonymous constructor>(this.this$0, this.$storageDir, this.$promise, this.$path, var2);
         }

         public final Object invoke(CoroutineScope var1, Continuation<? super Unit> var2x) {
            return (this.create(var1, var2x) as <unrepresentable>).invokeSuspend(Unit.a);
         }

         // $VF: Duplicated exception handlers to handle obfuscated exceptions
         public final Object invokeSuspend(Object var1) {
            b.f();
            if (this.label != 0) {
               throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
               kotlin.c.b(var1);
               val var6: java.lang.String = FileModule.access$getStorageDirs$p(this.this$0).get(this.$storageDir) as java.lang.String;
               if (var6 != null && !StringsKt.i0(var6)) {
                  try {
                     var1 = new File(var6, this.$path);
                     var19 = var1.listFiles();
                  } catch (var14: Exception) {
                     this.$promise.reject("err", "Cannot clear the folder", var14);
                     return Unit.a;
                  }

                  if (var19 != null) {
                     var var3: Int;
                     try {
                        var3 = var19.length;
                     } catch (var13: Exception) {
                        this.$promise.reject("err", "Cannot clear the folder", var13);
                        return Unit.a;
                     }

                     for (int var2x = 0; var2x < var3; var2x++) {
                        try {
                           var19[var2x].delete();
                        } catch (var12: Exception) {
                           this.$promise.reject("err", "Cannot clear the folder", var12);
                           return Unit.a;
                        }
                     }
                  }

                  try {
                     var20 = this.$promise;
                     var1 = var1.listFiles();
                  } catch (var11: Exception) {
                     this.$promise.reject("err", "Cannot clear the folder", var11);
                     return Unit.a;
                  }

                  var var4: Boolean;
                  var4 = false;
                  label47:
                  if (var1 != null) {
                     var4 = false;

                     try {
                        if (var1.length != 0) {
                           break label47;
                        }
                     } catch (var10: Exception) {
                        this.$promise.reject("err", "Cannot clear the folder", var10);
                        return Unit.a;
                     }

                     var4 = true;
                  }

                  try {
                     var20.resolve(kotlin.coroutines.jvm.internal.b.a(var4));
                  } catch (var9: Exception) {
                     this.$promise.reject("err", "Cannot clear the folder", var9);
                  }

                  return Unit.a;
               } else {
                  val var18: Promise = this.$promise;
                  val var7: java.lang.String = this.$storageDir;
                  val var15: java.util.Set = FileModule.access$getStorageDirs$p(this.this$0).keySet();
                  val var8: StringBuilder = new StringBuilder();
                  var8.append("Unknown storage directory ");
                  var8.append(var7);
                  var8.append(". Supported storage directories: ");
                  var8.append(var15);
                  var18.reject("err", var8.toString());
                  return Unit.a;
               }
            }
         }
      }, 3, null);
   }

   public override fun fileExists(path: String, promise: Promise) {
      gu.g.d(
         this.ioScope,
         null,
         null,
         new Function2<CoroutineScope, Continuation<? super Unit>, Object>(var2, var1, null) {
            final java.lang.String $path;
            final Promise $promise;
            int label;

            {
               super(2, var3);
               this.$promise = var1;
               this.$path = var2x;
            }

            public final Continuation<Unit> create(Object var1, Continuation<?> var2) {
               return new <anonymous constructor>(this.$promise, this.$path, var2);
            }

            public final Object invoke(CoroutineScope var1, Continuation<? super Unit> var2x) {
               return (this.create(var1, var2x) as <unrepresentable>).invokeSuspend(Unit.a);
            }

            // $VF: Could not inline inconsistent finally blocks
            // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
            public final Object invokeSuspend(Object var1) {
               b.f();
               if (this.label == 0) {
                  kotlin.c.b(var1);

                  try {
                     this.$promise.resolve(kotlin.coroutines.jvm.internal.b.a(new File(this.$path).exists()));
                  } catch (var3: java.lang.Throwable) {
                     this.$promise.reject(var3);
                     return Unit.a;
                  }

                  return Unit.a;
               } else {
                  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
               }
            }
         },
         3,
         null
      );
   }

   public override fun getFileHash(uri: String, algorithm: String, chunkSize: Double, promise: Promise) {
      gu.g.d(
         this.ioScope,
         null,
         null,
         new Function2<CoroutineScope, Continuation<? super Unit>, Object>(var2, this, var1, var5, var3, null)// $VF: Couldn't be decompiled
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   // java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.modules.decompiler.stats.Statement.getVarDefinitions()" because "stat" is null
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1468)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1679)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1496)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1545)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.remapClashingNames(VarDefinitionHelper.java:1458)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarProcessor.rerunClashing(VarProcessor.java:99)
   //   at org.jetbrains.java.decompiler.main.ClassWriter.invokeProcessors(ClassWriter.java:118)
   //   at org.jetbrains.java.decompiler.main.ClassWriter.writeClass(ClassWriter.java:352)
   //   at org.jetbrains.java.decompiler.modules.decompiler.exps.NewExprent.toJava(NewExprent.java:407)
   //   at org.jetbrains.java.decompiler.modules.decompiler.ExprProcessor.getCastedExprent(ExprProcessor.java:1014)
   //   at org.jetbrains.java.decompiler.modules.decompiler.exps.InvocationExprent.appendParamList(InvocationExprent.java:1153)
   //   at org.jetbrains.java.decompiler.modules.decompiler.exps.InvocationExprent.toJava(InvocationExprent.java:904)
   //   at org.jetbrains.java.decompiler.modules.decompiler.ExprProcessor.listToJava(ExprProcessor.java:891)
   //   at org.jetbrains.java.decompiler.modules.decompiler.stats.BasicBlockStatement.toJava(BasicBlockStatement.java:91)
   //   at org.jetbrains.java.decompiler.modules.decompiler.stats.RootStatement.toJava(RootStatement.java:36)
   ,
         3,
         null
      );
   }

   public override fun getSize(uri: String, promise: Promise) {
      gu.g.d(
         this.ioScope,
         null,
         null,
         new Function2<CoroutineScope, Continuation<? super Unit>, Object>(this, var1, var2, null) {
            final Promise $promise;
            final java.lang.String $uri;
            private Object L$0;
            int label;
            final FileModule this$0;

            {
               super(2, var4);
               this.this$0 = var1;
               this.$uri = var2x;
               this.$promise = var3x;
            }

            public final Continuation<Unit> create(Object var1, Continuation<?> var2) {
               val var3: Function2 = new <anonymous constructor>(this.this$0, this.$uri, this.$promise, var2);
               var3.L$0 = var1;
               return var3;
            }

            public final Object invoke(CoroutineScope var1, Continuation<? super Unit> var2x) {
               return (this.create(var1, var2x) as <unrepresentable>).invokeSuspend(Unit.a);
            }

            // $VF: Duplicated exception handlers to handle obfuscated exceptions
            // $VF: Could not inline inconsistent finally blocks
            // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
            public final Object invokeSuspend(Object var1) {
               b.f();
               label63:
               if (this.label == 0) {
                  kotlin.c.b(var1);
                  var1 = this.L$0 as CoroutineScope;
                  val var5: FileModule = this.this$0;
                  val var6: java.lang.String = this.$uri;
                  var1 = this.$promise;

                  label66: {
                     var var70: ParcelFileDescriptor;
                     try {
                        val var69: a = Result.e;
                        var70 = FileModule.access$getReactApplicationContext(var5).getContentResolver().openFileDescriptor(Uri.parse(var6), "r");
                     } catch (var13: java.lang.Throwable) {
                        val var4: a = Result.e;
                        var1 = Result.b(kotlin.c.a(var13));
                        break label66;
                     }

                     val var2x: Long;
                     if (var70 != null) {
                        try {
                           var2x = var70.getStatSize();
                        } catch (var12: java.lang.Throwable) {
                           val var66: java.lang.Throwable = var12;

                           try {
                              throw var66;
                           } catch (var9: java.lang.Throwable) {
                              try {
                                 tt.c.a(var70, var66);
                              } catch (var8: java.lang.Throwable) {
                                 val var71: a = Result.e;
                                 var1 = Result.b(kotlin.c.a(var8));
                                 break label66;
                              }
                           }
                        }

                        try {
                           tt.c.a(var70, null);
                        } catch (var11: java.lang.Throwable) {
                           val var72: a = Result.e;
                           var1 = Result.b(kotlin.c.a(var11));
                           break label66;
                        }
                     } else {
                        var2x = 0L;
                     }

                     if (var2x >= 0L) {
                        label41:
                        try {
                           var1.resolve(kotlin.coroutines.jvm.internal.b.c((double)var2x));
                           var1 = Result.b(Unit.a);
                        } catch (var7: java.lang.Throwable) {
                           val var73: a = Result.e;
                           var1 = Result.b(kotlin.c.a(var7));
                           break label41;
                        }
                     } else {
                        label50:
                        try {
                           throw new IllegalArgumentException("Failed requirement.");
                        } catch (var10: java.lang.Throwable) {
                           val var74: a = Result.e;
                           var1 = Result.b(kotlin.c.a(var10));
                           break label50;
                        }
                     }
                  }

                  val var75: Promise = this.$promise;
                  val var67: java.lang.Throwable = Result.e(var1);
                  if (var67 != null) {
                     var75.reject(var67);
                  }

                  return Unit.a;
               } else {
                  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
               }
            }
         },
         3,
         null
      );
   }

   protected override fun getTypedExportedConstants(): MutableMap<String, Any> {
      var var1: Any = this.storageDirs.get("documents");
      var1 = v.a("DocumentsDirPath", var1);
      val var2: Any = this.storageDirs.get("cache");
      return s0.n(new Pair[]{(Pair)var1, v.a("CacheDirPath", var2)});
   }

   public override fun moveFile(storageDir: String, sourcePath: String, destinationPath: String, promise: Promise) {
      gu.g.d(this.ioScope, null, null, new Function2<CoroutineScope, Continuation<? super Unit>, Object>(this, var1, var4, var2, var3, null) {
         final java.lang.String $destinationPath;
         final Promise $promise;
         final java.lang.String $sourcePath;
         final java.lang.String $storageDir;
         int label;
         final FileModule this$0;

         {
            super(2, var6);
            this.this$0 = var1;
            this.$storageDir = var2x;
            this.$promise = var3;
            this.$sourcePath = var4;
            this.$destinationPath = var5;
         }

         public final Continuation<Unit> create(Object var1, Continuation<?> var2) {
            return new <anonymous constructor>(this.this$0, this.$storageDir, this.$promise, this.$sourcePath, this.$destinationPath, var2);
         }

         public final Object invoke(CoroutineScope var1, Continuation<? super Unit> var2x) {
            return (this.create(var1, var2x) as <unrepresentable>).invokeSuspend(Unit.a);
         }

         // $VF: Duplicated exception handlers to handle obfuscated exceptions
         public final Object invokeSuspend(Object var1) {
            b.f();
            if (this.label == 0) {
               kotlin.c.b(var1);

               var var3: java.lang.String;
               try {
                  var3 = FileModule.access$getStorageDirs$p(this.this$0).get(this.$storageDir) as java.lang.String;
               } catch (var11: Exception) {
                  this.$promise.reject("err", "Error moving file", var11);
                  return Unit.a;
               }

               if (var3 == null) {
                  try {
                     var1 = this.$promise;
                     var3 = this.$storageDir;
                     val var2x: java.util.Set = FileModule.access$getStorageDirs$p(this.this$0).keySet();
                     val var4: StringBuilder = new StringBuilder();
                     var4.append("Unknown storage directory '");
                     var4.append(var3);
                     var4.append("'. Supported storage directories: ");
                     var4.append(var2x);
                     var1.reject("err", var4.toString());
                     return Unit.a;
                  } catch (var8: Exception) {
                     this.$promise.reject("err", "Error moving file", var8);
                  }
               } else {
                  var var16: File;
                  try {
                     var1 = new File(var3, this.$sourcePath);
                     var16 = new File(var3, this.$destinationPath);
                     var19 = var16.getParentFile();
                  } catch (var10: Exception) {
                     this.$promise.reject("err", "Error moving file", var10);
                     return Unit.a;
                  }

                  if (var19 != null) {
                     try {
                        var19.mkdirs();
                        if (var1.renameTo(var16)) {
                           this.$promise.resolve(kotlin.coroutines.jvm.internal.b.a(true));
                           return Unit.a;
                        }
                     } catch (var7: Exception) {
                        this.$promise.reject("err", "Error moving file", var7);
                        return Unit.a;
                     }

                     try {
                        if (!var1.exists()) {
                           this.$promise.resolve(kotlin.coroutines.jvm.internal.b.a(false));
                        }
                     } catch (var6: Exception) {
                        this.$promise.reject("err", "Error moving file", var6);
                        return Unit.a;
                     }

                     try {
                        val var20: Promise = this.$promise;
                        val var17: java.lang.String = this.$sourcePath;
                        val var14: java.lang.String = this.$destinationPath;
                        val var21: StringBuilder = new StringBuilder();
                        var21.append("Failed to move file from ");
                        var21.append(var17);
                        var21.append(" to ");
                        var21.append(var14);
                        var20.reject("err", var21.toString());
                     } catch (var5: Exception) {
                        this.$promise.reject("err", "Error moving file", var5);
                     }
                  } else {
                     try {
                        throw new IllegalArgumentException("Parent file should not be null");
                     } catch (var9: Exception) {
                        this.$promise.reject("err", "Error moving file", var9);
                     }
                  }
               }

               return Unit.a;
            } else {
               throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
         }
      }, 3, null);
   }

   @SuppressLint(["DiscouragedApi"])
   public fun openRawResource(assetUri: String): InputStream {
      val var3: InputStream = this.getReactApplicationContext()
         .getResources()
         .openRawResource(this.getReactApplicationContext().getResources().getIdentifier(var1, "raw", this.getReactApplicationContext().getPackageName()));
      return var3;
   }

   public override fun readAsset(assetUri: String, encoding: String, promise: Promise) {
      gu.g.d(
         this.ioScope,
         null,
         null,
         new Function2<CoroutineScope, Continuation<? super Unit>, Object>(var1, this, var2, var3, null) {
            final java.lang.String $assetUri;
            final java.lang.String $encoding;
            final Promise $promise;
            int label;
            final FileModule this$0;

            {
               super(2, var5);
               this.$assetUri = var1;
               this.this$0 = var2x;
               this.$encoding = var3;
               this.$promise = var4;
            }

            public final Continuation<Unit> create(Object var1, Continuation<?> var2) {
               return new <anonymous constructor>(this.$assetUri, this.this$0, this.$encoding, this.$promise, var2);
            }

            public final Object invoke(CoroutineScope var1, Continuation<? super Unit> var2x) {
               return (this.create(var1, var2x) as <unrepresentable>).invokeSuspend(Unit.a);
            }

            // $VF: Duplicated exception handlers to handle obfuscated exceptions
            // $VF: Could not inline inconsistent finally blocks
            // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
            public final Object invokeSuspend(Object var1) {
               b.f();
               label150:
               if (this.label == 0) {
                  kotlin.c.b(var1);

                  var var4: Uri;
                  try {
                     var4 = Uri.parse(this.$assetUri);
                     var1 = var4.getScheme();
                  } catch (var22: java.lang.Throwable) {
                     this.$promise.reject(var22);
                     return Unit.a;
                  }

                  label1437: {
                     if (var1 != null) {
                        var var2x: Int;
                        try {
                           var2x = var1.hashCode();
                        } catch (var18: java.lang.Throwable) {
                           this.$promise.reject(var18);
                           return Unit.a;
                        }

                        if (var2x != 3143036) {
                           if (var2x == 3213448) {
                              try {
                                 if (var1.equals("http")) {
                                    var1 = new URL(this.$assetUri).openStream();
                                    break label1437;
                                 }
                              } catch (var20: java.lang.Throwable) {
                                 this.$promise.reject(var20);
                                 return Unit.a;
                              }
                           }
                        } else {
                           label1436: {
                              try {
                                 if (!var1.equals("file")) {
                                    break label1436;
                                 }
                              } catch (var21: java.lang.Throwable) {
                                 this.$promise.reject(var21);
                                 return Unit.a;
                              }

                              var var3: java.lang.String;
                              var var5: File;
                              try {
                                 var5 = new File;
                                 var3 = var4.getPath();
                              } catch (var17: java.lang.Throwable) {
                                 this.$promise.reject(var17);
                                 return Unit.a;
                              }

                              var1 = var3;
                              if (var3 == null) {
                                 var1 = "";
                              }

                              try {
                                 var5./* $VF: Unable to resugar constructor */<init>(var1);
                                 if (var5.exists()) {
                                    var1 = new FileInputStream(var5);
                                    break label1437;
                                 }
                              } catch (var19: java.lang.Throwable) {
                                 this.$promise.reject(var19);
                                 return Unit.a;
                              }

                              try {
                                 var1 = var4.getLastPathSegment();
                              } catch (var16: java.lang.Throwable) {
                                 this.$promise.reject(var16);
                                 return Unit.a;
                              }

                              if (var1 == null) {
                                 try {
                                    throw new IllegalStateException("Could not find asset");
                                 } catch (var13: java.lang.Throwable) {
                                    this.$promise.reject(var13);
                                    return Unit.a;
                                 }
                              }

                              try {
                                 var1 = this.this$0
                                    .openRawResource(StringsKt.split$default(var1, new java.lang.String[]{"."}, false, 0, 6, null).get(0) as java.lang.String);
                                 break label1437;
                              } catch (var15: java.lang.Throwable) {
                                 this.$promise.reject(var15);
                                 return Unit.a;
                              }
                           }
                        }
                     }

                     try {
                        var1 = this.this$0.openRawResource(this.$assetUri);
                     } catch (var14: java.lang.Throwable) {
                        this.$promise.reject(var14);
                        return Unit.a;
                     }
                  }

                  val var320: ByteArray;
                  if (var1 != null) {
                     try {
                        var320 = tt.b.c((InputStream)var1);
                     } catch (var12: java.lang.Throwable) {
                        val var319: java.lang.Throwable = var12;

                        try {
                           throw var319;
                        } catch (var11: java.lang.Throwable) {
                           try {
                              tt.c.a((Closeable)var1, var319);
                           } catch (var10: java.lang.Throwable) {
                              this.$promise.reject(var10);
                              return Unit.a;
                           }
                        }
                     }
                  } else {
                     var320 = null;
                  }

                  try {
                     tt.c.a((Closeable)var1, null);
                     if (this.$encoding == "base64") {
                        this.$promise.resolve(Base64.encodeToString(var320, 2));
                        return Unit.a;
                     }
                  } catch (var9: java.lang.Throwable) {
                     this.$promise.reject(var9);
                     return Unit.a;
                  }

                  var var322: Promise;
                  try {
                     var322 = this.$promise;
                  } catch (var8: java.lang.Throwable) {
                     this.$promise.reject(var8);
                     return Unit.a;
                  }

                  var1 = null;
                  if (var320 != null) {
                     try {
                        var1 = StringsKt.w(var320);
                     } catch (var7: java.lang.Throwable) {
                        this.$promise.reject(var7);
                        return Unit.a;
                     }
                  }

                  try {
                     var322.resolve(var1);
                  } catch (var6: java.lang.Throwable) {
                     this.$promise.reject(var6);
                     return Unit.a;
                  }

                  return Unit.a;
               } else {
                  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
               }
            }
         },
         3,
         null
      );
   }

   public override fun readFile(path: String, encoding: String, promise: Promise) {
      gu.g.d(
         this.ioScope,
         null,
         null,
         new Function2<CoroutineScope, Continuation<? super Unit>, Object>(var1, var2, var3, null) {
            final java.lang.String $encoding;
            final java.lang.String $path;
            final Promise $promise;
            int label;

            {
               super(2, var4);
               this.$path = var1;
               this.$encoding = var2x;
               this.$promise = var3;
            }

            public final Continuation<Unit> create(Object var1, Continuation<?> var2) {
               return new <anonymous constructor>(this.$path, this.$encoding, this.$promise, var2);
            }

            public final Object invoke(CoroutineScope var1, Continuation<? super Unit> var2x) {
               return (this.create(var1, var2x) as <unrepresentable>).invokeSuspend(Unit.a);
            }

            // $VF: Duplicated exception handlers to handle obfuscated exceptions
            // $VF: Could not inline inconsistent finally blocks
            // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
            public final Object invokeSuspend(Object var1) {
               b.f();
               label50:
               if (this.label == 0) {
                  kotlin.c.b(var1);

                  try {
                     var1 = new FileInputStream(new File(this.$path));
                  } catch (var9: java.lang.Throwable) {
                     this.$promise.reject(var9);
                     return Unit.a;
                  }

                  var var47: ByteArray;
                  try {
                     var47 = tt.b.c(var1);
                  } catch (var8: java.lang.Throwable) {
                     val var3: java.lang.Throwable = var8;

                     try {
                        throw var3;
                     } catch (var7: java.lang.Throwable) {
                        try {
                           tt.c.a(var1, var3);
                        } catch (var6: java.lang.Throwable) {
                           this.$promise.reject(var6);
                           return Unit.a;
                        }
                     }
                  }

                  try {
                     tt.c.a(var1, null);
                     if (this.$encoding == "base64") {
                        this.$promise.resolve(Base64.encodeToString(var47, 2));
                        return Unit.a;
                     }
                  } catch (var5: java.lang.Throwable) {
                     this.$promise.reject(var5);
                     return Unit.a;
                  }

                  try {
                     this.$promise.resolve(StringsKt.w(var47));
                  } catch (var4: java.lang.Throwable) {
                     this.$promise.reject(var4);
                     return Unit.a;
                  }

                  return Unit.a;
               } else {
                  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
               }
            }
         },
         3,
         null
      );
   }

   public override fun removeFile(storageDir: String, path: String, promise: Promise) {
      gu.g.d(this.ioScope, null, null, new Function2<CoroutineScope, Continuation<? super Unit>, Object>(this, var1, var3, var2, null) {
         final java.lang.String $path;
         final Promise $promise;
         final java.lang.String $storageDir;
         int label;
         final FileModule this$0;

         {
            super(2, var5);
            this.this$0 = var1;
            this.$storageDir = var2x;
            this.$promise = var3;
            this.$path = var4;
         }

         public final Continuation<Unit> create(Object var1, Continuation<?> var2) {
            return new <anonymous constructor>(this.this$0, this.$storageDir, this.$promise, this.$path, var2);
         }

         public final Object invoke(CoroutineScope var1, Continuation<? super Unit> var2x) {
            return (this.create(var1, var2x) as <unrepresentable>).invokeSuspend(Unit.a);
         }

         public final Object invokeSuspend(Object var1) {
            b.f();
            if (this.label == 0) {
               kotlin.c.b(var1);
               val var2x: java.lang.String = FileModule.access$getStorageDirs$p(this.this$0).get(this.$storageDir) as java.lang.String;
               if (var2x != null && !StringsKt.i0(var2x)) {
                  try {
                     var1 = new File(var2x, this.$path);
                     if (var1.exists()) {
                        var1.delete();
                        this.$promise.resolve(kotlin.coroutines.jvm.internal.b.a(var1.delete()));
                     } else {
                        this.$promise.resolve(kotlin.coroutines.jvm.internal.b.a(false));
                     }
                  } catch (var5: Exception) {
                     this.$promise.reject("err", "Cannot delete the file", var5);
                  }

                  return Unit.a;
               } else {
                  val var4: Promise = this.$promise;
                  val var6: java.lang.String = this.$storageDir;
                  val var3: java.util.Set = FileModule.access$getStorageDirs$p(this.this$0).keySet();
                  val var8: StringBuilder = new StringBuilder();
                  var8.append("Unknown storage directory ");
                  var8.append(var6);
                  var8.append(". Supported storage directories: ");
                  var8.append(var3);
                  var4.reject("err", var8.toString());
                  return Unit.a;
               }
            } else {
               throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
         }
      }, 3, null);
   }

   public override fun saveFileToGallery(uri: String, fileName: String, fileType: String, promise: Promise) {
      val var5: Bitmap = BitmapFactory.decodeStream(this.getReactApplicationContext().getContentResolver().openInputStream(Uri.parse(var1)));
      if (var5 != null) {
         val var19: File = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS), var2);

         label31: {
            try {
               var20 = new FileOutputStream(var19);
               if (var3 == "PNG") {
                  var5.compress(CompressFormat.PNG, 100, var20);
                  break label31;
               }
            } catch (var8: java.lang.Throwable) {
               var4.reject(var8);
               return;
            }

            try {
               if (var3 == "JPEG") {
                  var5.compress(CompressFormat.JPEG, 100, var20);
               }
            } catch (var7: java.lang.Throwable) {
               var4.reject(var7);
               return;
            }
         }

         try {
            var20.flush();
            var20.close();
            MediaScannerConnection.scanFile(
               this.getReactApplicationContext(), new java.lang.String[]{var19.toString()}, new java.lang.String[]{var19.getName()}, null
            );
            var4.resolve(var19.getAbsolutePath());
         } catch (var6: java.lang.Throwable) {
            var4.reject(var6);
            return;
         }
      }
   }

   public override fun writeFile(storageDir: String, path: String, data: String, encoding: String, promise: Promise) {
      gu.g.d(
         this.ioScope,
         null,
         null,
         new Function2<CoroutineScope, Continuation<? super Unit>, Object>(this, var1, var5, var2, var4, var3, null)// $VF: Couldn't be decompiled
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   // java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.modules.decompiler.stats.Statement.getVarDefinitions()" because "stat" is null
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1468)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingExprent(VarDefinitionHelper.java:1679)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1496)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.iterateClashingNames(VarDefinitionHelper.java:1545)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.remapClashingNames(VarDefinitionHelper.java:1458)
   //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarProcessor.rerunClashing(VarProcessor.java:99)
   //   at org.jetbrains.java.decompiler.main.ClassWriter.invokeProcessors(ClassWriter.java:118)
   //   at org.jetbrains.java.decompiler.main.ClassWriter.writeClass(ClassWriter.java:352)
   //   at org.jetbrains.java.decompiler.modules.decompiler.exps.NewExprent.toJava(NewExprent.java:407)
   //   at org.jetbrains.java.decompiler.modules.decompiler.ExprProcessor.getCastedExprent(ExprProcessor.java:1014)
   //   at org.jetbrains.java.decompiler.modules.decompiler.exps.InvocationExprent.appendParamList(InvocationExprent.java:1153)
   //   at org.jetbrains.java.decompiler.modules.decompiler.exps.InvocationExprent.toJava(InvocationExprent.java:904)
   //   at org.jetbrains.java.decompiler.modules.decompiler.ExprProcessor.listToJava(ExprProcessor.java:891)
   //   at org.jetbrains.java.decompiler.modules.decompiler.stats.BasicBlockStatement.toJava(BasicBlockStatement.java:91)
   //   at org.jetbrains.java.decompiler.modules.decompiler.stats.RootStatement.toJava(RootStatement.java:36)
   ,
         3,
         null
      );
   }
}

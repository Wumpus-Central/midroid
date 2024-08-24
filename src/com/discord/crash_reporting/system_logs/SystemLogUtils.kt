package com.discord.crash_reporting.system_logs

import android.annotation.SuppressLint
import android.content.Context
import android.util.Log
import hk.j
import java.io.BufferedReader
import java.io.File
import java.security.MessageDigest
import java.util.HashSet
import java.util.LinkedList
import java.util.NoSuchElementException
import java.util.concurrent.TimeUnit
import kotlin.jvm.functions.Function0
import kotlin.jvm.functions.Function1
import kotlin.jvm.internal.r

internal object SystemLogUtils {
   private const val DEFAULT_TAG: String = "Discord"
   private const val LIBDISCORD_VERSION_CATEGORY: String = "libdiscord_version"
   internal const val LOGCAT_PATH: String = "/system/bin/logcat"
   private const val MAX_LOG_SIZE: Int = 2500000
   private final val debugPrintables: DebugPrintableCollection = new DebugPrintableCollection()
   internal final val regexExtractTombstone: Regex
   private final val systemLogCapture: SystemLogCapture = new SystemLogCapture()

   @JvmStatic
   fun {
      val var0: java.lang.String = Regex.k.c("libdiscord_version");
      val var1: StringBuilder = new StringBuilder();
      var1.append("(?:^(?:[^\\s]+\\s+){4}F\\s+DEBUG\\s+:\\s(.+))|(^.+(\\[");
      var1.append(var0);
      var1.append("\\].+))");
      regexExtractTombstone = new Regex(var1.toString());
   }

   private fun fetch(filter: Regex?, cb: (LinkedList<String>) -> Unit) {
      val var4: LinkedList = new LinkedList();
      val var3: Boolean;
      if (var1 == null) {
         var3 = true;
      } else {
         var3 = false;
      }

      if (!new File("/system/bin/logcat").exists()) {
         if (var3) {
            var4.add("Unable to locate '/system/bin/logcat'");
         }

         var2.invoke(var4);
      } else {
         ih.a.b(
            false,
            false,
            null,
            null,
            0,
            new Function0<Unit>(var4, var1, var3, var2) {
               final Function1<LinkedList<java.lang.String>, Unit> $cb;
               final Regex $filter;
               final boolean $logErrors;
               final LinkedList<java.lang.String> $output;

               {
                  super(0);
                  this.$output = var1;
                  this.$filter = var2;
                  this.$logErrors = var3;
                  this.$cb = var4;
               }

               public final void invoke() {
                  // $VF: Couldn't be decompiled
                  // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
                  // java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
                  //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
                  //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
                  //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.createStatement(DomHelper.java:27)
                  //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:156)
                  //
                  // Bytecode:
                  // 000: aconst_null
                  // 001: astore 6
                  // 003: aconst_null
                  // 004: astore 5
                  // 006: aload 5
                  // 008: astore 4
                  // 00a: aload 6
                  // 00c: astore 3
                  // 00d: new java/lang/ProcessBuilder
                  // 010: astore 7
                  // 012: aload 5
                  // 014: astore 4
                  // 016: aload 6
                  // 018: astore 3
                  // 019: aload 7
                  // 01b: bipush 2
                  // 01c: anewarray 69
                  // 01f: dup
                  // 020: bipush 0
                  // 021: ldc "/system/bin/logcat"
                  // 023: aastore
                  // 024: dup
                  // 025: bipush 1
                  // 026: ldc "-d"
                  // 028: aastore
                  // 029: invokespecial java/lang/ProcessBuilder.<init> ([Ljava/lang/String;)V
                  // 02c: aload 5
                  // 02e: astore 4
                  // 030: aload 6
                  // 032: astore 3
                  // 033: aload 7
                  // 035: bipush 1
                  // 036: invokevirtual java/lang/ProcessBuilder.redirectErrorStream (Z)Ljava/lang/ProcessBuilder;
                  // 039: invokevirtual java/lang/ProcessBuilder.start ()Ljava/lang/Process;
                  // 03c: astore 5
                  // 03e: aload 5
                  // 040: astore 4
                  // 042: aload 5
                  // 044: astore 3
                  // 045: getstatic com/discord/crash_reporting/system_logs/SystemLogUtils.INSTANCE Lcom/discord/crash_reporting/system_logs/SystemLogUtils;
                  // 048: astore 7
                  // 04a: aload 5
                  // 04c: astore 4
                  // 04e: aload 5
                  // 050: astore 3
                  // 051: aload 7
                  // 053: aload 5
                  // 055: invokestatic com/discord/crash_reporting/system_logs/SystemLogUtils.access$waitFor (Lcom/discord/crash_reporting/system_logs/SystemLogUtils;Ljava/lang/Process;)V
                  // 058: aload 5
                  // 05a: astore 4
                  // 05c: aload 5
                  // 05e: astore 3
                  // 05f: aload 5
                  // 061: invokevirtual java/lang/Process.getInputStream ()Ljava/io/InputStream;
                  // 064: astore 6
                  // 066: aload 5
                  // 068: astore 4
                  // 06a: aload 5
                  // 06c: astore 3
                  // 06d: aload 6
                  // 06f: ldc "logcatProcess.inputStream"
                  // 071: invokestatic kotlin/jvm/internal/r.g (Ljava/lang/Object;Ljava/lang/String;)V
                  // 074: aload 5
                  // 076: astore 4
                  // 078: aload 5
                  // 07a: astore 3
                  // 07b: getstatic ik/a.b Ljava/nio/charset/Charset;
                  // 07e: astore 8
                  // 080: aload 5
                  // 082: astore 4
                  // 084: aload 5
                  // 086: astore 3
                  // 087: new java/io/InputStreamReader
                  // 08a: astore 9
                  // 08c: aload 5
                  // 08e: astore 4
                  // 090: aload 5
                  // 092: astore 3
                  // 093: aload 9
                  // 095: aload 6
                  // 097: aload 8
                  // 099: invokespecial java/io/InputStreamReader.<init> (Ljava/io/InputStream;Ljava/nio/charset/Charset;)V
                  // 09c: aload 5
                  // 09e: astore 4
                  // 0a0: aload 5
                  // 0a2: astore 3
                  // 0a3: aload 9
                  // 0a5: instanceof java/io/BufferedReader
                  // 0a8: ifeq 0bc
                  // 0ab: aload 5
                  // 0ad: astore 4
                  // 0af: aload 5
                  // 0b1: astore 3
                  // 0b2: aload 9
                  // 0b4: checkcast java/io/BufferedReader
                  // 0b7: astore 6
                  // 0b9: goto 0d1
                  // 0bc: aload 5
                  // 0be: astore 4
                  // 0c0: aload 5
                  // 0c2: astore 3
                  // 0c3: new java/io/BufferedReader
                  // 0c6: dup
                  // 0c7: aload 9
                  // 0c9: sipush 8192
                  // 0cc: invokespecial java/io/BufferedReader.<init> (Ljava/io/Reader;I)V
                  // 0cf: astore 6
                  // 0d1: aload 5
                  // 0d3: astore 4
                  // 0d5: aload 5
                  // 0d7: astore 3
                  // 0d8: aload 7
                  // 0da: aload 6
                  // 0dc: aload 0
                  // 0dd: getfield com/discord/crash_reporting/system_logs/SystemLogUtils$fetch$1.$output Ljava/util/LinkedList;
                  // 0e0: aload 0
                  // 0e1: getfield com/discord/crash_reporting/system_logs/SystemLogUtils$fetch$1.$filter Lkotlin/text/Regex;
                  // 0e4: invokestatic com/discord/crash_reporting/system_logs/SystemLogUtils.access$processLogs (Lcom/discord/crash_reporting/system_logs/SystemLogUtils;Ljava/io/BufferedReader;Ljava/util/LinkedList;Lkotlin/text/Regex;)V
                  // 0e7: aload 5
                  // 0e9: astore 4
                  // 0eb: aload 5
                  // 0ed: astore 3
                  // 0ee: aload 6
                  // 0f0: invokevirtual java/io/BufferedReader.close ()V
                  // 0f3: aload 5
                  // 0f5: astore 3
                  // 0f6: aload 3
                  // 0f7: invokevirtual java/lang/Process.destroy ()V
                  // 0fa: goto 1cf
                  // 0fd: astore 3
                  // 0fe: goto 1de
                  // 101: astore 6
                  // 103: aload 3
                  // 104: astore 4
                  // 106: aload 6
                  // 108: invokevirtual java/lang/Throwable.printStackTrace ()V
                  // 10b: aload 3
                  // 10c: astore 4
                  // 10e: aload 0
                  // 10f: getfield com/discord/crash_reporting/system_logs/SystemLogUtils$fetch$1.$logErrors Z
                  // 112: ifeq 1c8
                  // 115: aload 3
                  // 116: astore 4
                  // 118: aload 0
                  // 119: getfield com/discord/crash_reporting/system_logs/SystemLogUtils$fetch$1.$output Ljava/util/LinkedList;
                  // 11c: astore 7
                  // 11e: aload 3
                  // 11f: astore 4
                  // 121: new java/lang/StringBuilder
                  // 124: astore 5
                  // 126: aload 3
                  // 127: astore 4
                  // 129: aload 5
                  // 12b: invokespecial java/lang/StringBuilder.<init> ()V
                  // 12e: aload 3
                  // 12f: astore 4
                  // 131: aload 5
                  // 133: ldc "Exception getting system logs '"
                  // 135: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
                  // 138: pop
                  // 139: aload 3
                  // 13a: astore 4
                  // 13c: aload 5
                  // 13e: aload 6
                  // 140: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
                  // 143: pop
                  // 144: aload 3
                  // 145: astore 4
                  // 147: aload 5
                  // 149: ldc "'"
                  // 14b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
                  // 14e: pop
                  // 14f: aload 3
                  // 150: astore 4
                  // 152: aload 7
                  // 154: aload 5
                  // 156: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
                  // 159: invokevirtual java/util/LinkedList.add (Ljava/lang/Object;)Z
                  // 15c: pop
                  // 15d: aload 3
                  // 15e: astore 4
                  // 160: aload 6
                  // 162: invokevirtual java/lang/Throwable.getStackTrace ()[Ljava/lang/StackTraceElement;
                  // 165: astore 5
                  // 167: aload 3
                  // 168: astore 4
                  // 16a: aload 5
                  // 16c: ldc "e.stackTrace"
                  // 16e: invokestatic kotlin/jvm/internal/r.g (Ljava/lang/Object;Ljava/lang/String;)V
                  // 171: aload 3
                  // 172: astore 4
                  // 174: aload 0
                  // 175: getfield com/discord/crash_reporting/system_logs/SystemLogUtils$fetch$1.$output Ljava/util/LinkedList;
                  // 178: astore 7
                  // 17a: aload 3
                  // 17b: astore 4
                  // 17d: aload 5
                  // 17f: arraylength
                  // 180: istore 2
                  // 181: bipush 0
                  // 182: istore 1
                  // 183: iload 1
                  // 184: iload 2
                  // 185: if_icmpge 1c8
                  // 188: aload 5
                  // 18a: iload 1
                  // 18b: aaload
                  // 18c: astore 8
                  // 18e: aload 3
                  // 18f: astore 4
                  // 191: new java/lang/StringBuilder
                  // 194: astore 6
                  // 196: aload 3
                  // 197: astore 4
                  // 199: aload 6
                  // 19b: invokespecial java/lang/StringBuilder.<init> ()V
                  // 19e: aload 3
                  // 19f: astore 4
                  // 1a1: aload 6
                  // 1a3: ldc "    "
                  // 1a5: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
                  // 1a8: pop
                  // 1a9: aload 3
                  // 1aa: astore 4
                  // 1ac: aload 6
                  // 1ae: aload 8
                  // 1b0: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
                  // 1b3: pop
                  // 1b4: aload 3
                  // 1b5: astore 4
                  // 1b7: aload 7
                  // 1b9: aload 6
                  // 1bb: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
                  // 1be: invokevirtual java/util/LinkedList.add (Ljava/lang/Object;)Z
                  // 1c1: pop
                  // 1c2: iinc 1 1
                  // 1c5: goto 183
                  // 1c8: aload 3
                  // 1c9: ifnull 1cf
                  // 1cc: goto 0f6
                  // 1cf: aload 0
                  // 1d0: getfield com/discord/crash_reporting/system_logs/SystemLogUtils$fetch$1.$cb Lkotlin/jvm/functions/Function1;
                  // 1d3: aload 0
                  // 1d4: getfield com/discord/crash_reporting/system_logs/SystemLogUtils$fetch$1.$output Ljava/util/LinkedList;
                  // 1d7: invokeinterface kotlin/jvm/functions/Function1.invoke (Ljava/lang/Object;)Ljava/lang/Object; 2
                  // 1dc: pop
                  // 1dd: return
                  // 1de: aload 4
                  // 1e0: ifnull 1e8
                  // 1e3: aload 4
                  // 1e5: invokevirtual java/lang/Process.destroy ()V
                  // 1e8: aload 3
                  // 1e9: athrow
               }
            },
            31,
            null
         );
      }
   }

   private fun fetchLastTombstone(crashes: Collection<String>): com.discord.crash_reporting.system_logs.SystemLogUtils.Tombstone? {
      if (var1.isEmpty()) {
         return null;
      } else {
         val var6: StringBuilder = new StringBuilder();
         val var7: java.util.Iterator = var1.iterator();
         var var3: java.lang.String = null;
         var var10: java.lang.String = null;

         while (var7.hasNext()) {
            val var5: java.lang.String = var7.next() as java.lang.String;
            if (f.N(var5, "libdiscord_version", false, 2, null)) {
               var3 = var5;
            } else {
               if (f.N(var5, "*** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ***", false, 2, null)) {
                  f.i(var6);
                  var10 = var3;
               }

               var6.append(var5);
               r.g(var6, "append(value)");
               var6.append('\n');
               r.g(var6, "append('\\n')");
            }
         }

         if (f.x(var6) xor true) {
            var6.append('\n');
            r.g(var6, "append('\\n')");
            var6.append("Tombstone's libdiscord_version: ");
            var3 = var10;
            if (var10 == null) {
               var3 = "Unknown libdiscord_version";
            }

            var6.append(var3);
            r.g(var6, "append(value)");
            var6.append('\n');
            r.g(var6, "append('\\n')");
         }

         val var19: java.lang.String = var6.toString();
         r.g(var19, "StringBuilder().also { s…   }\n        }.toString()");
         if (f.x(var19)) {
            return null;
         } else {
            val var11: ik.f = ik.f.m;
            val var17: Regex = new Regex("^Cause: (.+)$", ik.f.m);
            val var21: Sequence = j.y(
               Regex.e(new Regex("^\\s+#\\d+ pc .+/(.+? .+?)\\+?[+)]", var11), var19, 0, 2, null),
               new Function1<MatchResult, java.lang.String>(new Regex("classes\\d+.dex")) {
                  final Regex $removeDexNameExp;

                  {
                     super(1);
                     this.$removeDexNameExp = var1;
                  }

                  public final java.lang.String invoke(MatchResult var1) {
                     r.h(var1, "it");
                     return this.$removeDexNameExp.h(var1.b().get(1) as java.lang.CharSequence, "classesN.dex");
                  }
               }
            );
            val var23: HashSet = u.e(
               new java.lang.String[]{"libc.so (abort", "libart.so (art::Runtime::Abort(char const*", "libbase.so (android::base::LogMessage::~LogMessage("}
            );

            try {
               val var8: java.util.Iterator = var21.iterator();

               do {
                  if (!var8.hasNext()) {
                     throw new NoSuchElementException("Sequence contains no element matching the predicate.");
                  }

                  var14 = var8.next();
               } while (!(var23.contains((java.lang.String)var14) ^ true));

               var13 = var14 as java.lang.String;
            } catch (var9: NoSuchElementException) {
               var13 = "Unknown";
            }

            val var22: java.lang.String = j.w(var21, "\n", null, null, 0, null, null, 62, null);
            val var24: MatchResult = Regex.c(var17, var19, 0, 2, null);
            var3 = null;
            if (var24 != null) {
               val var25: java.util.List = var24.b();
               var3 = null;
               if (var25 != null) {
                  var3 = var25.get(1) as java.lang.String;
               }
            }

            return new SystemLogUtils.Tombstone(var19, var3, var22, var13, this.hashString(var22), this.hashString(var19));
         }
      }
   }

   private fun hashString(input: String): String {
      val var2: MessageDigest = MessageDigest.getInstance("SHA-1");
      val var3: ByteArray = var1.getBytes(ik.a.b);
      r.g(var3, "this as java.lang.String).getBytes(charset)");
      val var4: ByteArray = var2.digest(var3);
      r.g(var4, "bytes");
      return b.Z(var4, "", null, null, 0, null, <unrepresentable>.INSTANCE, 30, null);
   }

   private fun processLogs(reader: BufferedReader, output: LinkedList<String>, filter: Regex?) {
      var var4: Int = 0;

      while (true) {
         var var5: Int = var4;

         var var6: Int;
         label191: {
            label184: {
               label192: {
                  var var8: java.lang.String;
                  try {
                     var8 = var1.readLine();
                  } catch (var24: Exception) {
                     var25 = var24;
                     var4 = var4;
                     if (var3 != null) {
                        break label184;
                     }
                     break label192;
                  }

                  if (var8 == null) {
                     break label184;
                  }

                  label197: {
                     var var7: java.lang.String = var8;
                     if (var3 != null) {
                        var5 = var4;

                        try {
                           var30 = Regex.c(var3, var8, 0, 2, null);
                        } catch (var21: Exception) {
                           var25 = var21;
                           var4 = var4;
                           if (var3 != null) {
                              break label184;
                           }
                           break label192;
                        }

                        if (var30 == null) {
                           continue;
                        }

                        var5 = var4;

                        try {
                           var31 = var30.b();
                        } catch (var20: Exception) {
                           var25 = var20;
                           var4 = var4;
                           if (var3 != null) {
                              break label184;
                           }
                           break label192;
                        }

                        var5 = var4;

                        try {
                           var33 = var31.listIterator(var31.size());
                        } catch (var19: Exception) {
                           var25 = var19;
                           var4 = var4;
                           if (var3 != null) {
                              break label184;
                           }
                           break label192;
                        }

                        do {
                           var5 = var4;

                           try {
                              if (!var33.hasPrevious()) {
                                 break label197;
                              }
                           } catch (var22: Exception) {
                              var25 = var22;
                              var4 = var4;
                              if (var3 != null) {
                                 break label184;
                              }
                              break label192;
                           }

                           var5 = var4;

                           try {
                              var32 = var33.previous();
                           } catch (var18: Exception) {
                              var25 = var18;
                              var4 = var4;
                              if (var3 != null) {
                                 break label184;
                              }
                              break label192;
                           }

                           var5 = var4;

                           label172: {
                              try {
                                 if ((var32 as java.lang.String).length() > 0) {
                                    break label172;
                                 }
                              } catch (var23: Exception) {
                                 var25 = var23;
                                 var4 = var4;
                                 if (var3 != null) {
                                    break label184;
                                 }
                                 break label192;
                              }

                              var29 = false;
                              continue;
                           }

                           var29 = true;
                        } while (!var29);

                        var5 = var4;

                        try {
                           var7 = var32 as java.lang.String;
                        } catch (var17: Exception) {
                           var25 = var17;
                           var4 = var4;
                           if (var3 != null) {
                              break label184;
                           }
                           break label192;
                        }
                     }

                     var5 = var4;

                     try {
                        if (f.x(var7)) {
                           continue;
                        }
                     } catch (var16: Exception) {
                        var25 = var16;
                        var4 = var4;
                        if (var3 != null) {
                           break label184;
                        }
                        break label192;
                     }

                     var5 = var4;

                     try {
                        if (f.N(var7, "Accessing hidden method", false, 2, null)) {
                           continue;
                        }
                     } catch (var15: Exception) {
                        var25 = var15;
                        var4 = var4;
                        if (var3 != null) {
                           break label184;
                        }
                        break label192;
                     }

                     var5 = var4;

                     try {
                        var6 = var4 + var7.length() + 1;
                     } catch (var14: Exception) {
                        var25 = var14;
                        var4 = var4;
                        if (var3 != null) {
                           break label184;
                        }
                        break label192;
                     }

                     var5 = var6;

                     try {
                        var2.add(var7);
                     } catch (var13: Exception) {
                        var25 = var13;
                        var4 = var6;
                        if (var3 != null) {
                           break label184;
                        }
                        break label192;
                     }

                     var4 = var6;
                     if (var6 <= 2500000) {
                        continue;
                     }

                     var5 = var6;

                     try {
                        var4 = (var2.pop() as java.lang.String).length();
                        break label191;
                     } catch (var12: Exception) {
                        var25 = var12;
                        var4 = var6;
                        if (var3 != null) {
                           break label184;
                        }
                        break label192;
                     }
                  }

                  var5 = var4;

                  try {
                     var26 = new NoSuchElementException;
                  } catch (var11: Exception) {
                     var25 = var11;
                     var4 = var4;
                     if (var3 != null) {
                        break label184;
                     }
                     break label192;
                  }

                  var5 = var4;

                  try {
                     var26./* $VF: Unable to resugar constructor */<init>("List contains no element matching the predicate.");
                  } catch (var10: Exception) {
                     var25 = var10;
                     var4 = var4;
                     if (var3 != null) {
                        break label184;
                     }
                     break label192;
                  }

                  var5 = var4;

                  try {
                     throw var26;
                  } catch (var9: Exception) {
                     var25 = var9;
                     var4 = var4;
                     if (var3 != null) {
                        break label184;
                     }
                  }
               }

               val var27: StringBuilder = new StringBuilder();
               var27.append("IOException: ");
               var27.append(var25);
               var2.add(var27.toString());
               var4 = var5;
            }

            if (var4 > 2500000) {
               (var2.pop() as java.lang.String).length();
            }

            return;
         }

         var4 = var6 - (var4 - 1);
      }
   }

   private fun waitFor(process: Process) {
      val var2: Long = System.nanoTime();
      val var4: Long = TimeUnit.SECONDS.toNanos(15L);

      while (true) {
         try {
            var1.exitValue();
            return;
         } catch (var7: IllegalThreadStateException) {
            Thread.sleep(100L);
            if (System.nanoTime() >= var2 + var4) {
               return;
            }
         }
      }
   }

   public fun fetch(context: Context): String {
      r.h(var1, "context");
      val var2: StringBuilder = new StringBuilder();
      debugPrintables.debugPrint(var1, var2);
      systemLogCapture.appendOutput(var2);
      val var3: java.lang.String = var2.toString();
      r.g(var3, "sb.toString()");
      return var3;
   }

   public fun fetchLastTombstone(cb: (com.discord.crash_reporting.system_logs.SystemLogUtils.Tombstone?) -> Unit) {
      r.h(var1, "cb");
      this.fetch(regexExtractTombstone, new Function1<LinkedList<java.lang.String>, Unit>(var1) {
         final Function1<SystemLogUtils.Tombstone, Unit> $cb;

         {
            super(1);
            this.$cb = var1;
         }

         public final void invoke(LinkedList<java.lang.String> var1) {
            r.h(var1, "crashes");
            this.$cb.invoke(SystemLogUtils.access$fetchLastTombstone(SystemLogUtils.INSTANCE, var1));
         }
      });
   }

   @SuppressLint(["LogNotTimber"])
   public fun initSystemLogCapture(context: Context) {
      r.h(var1, "context");
      val var2: java.lang.String = DebugPrintableCollection.Companion.libdiscordVersion(var1);
      val var3: StringBuilder = new StringBuilder();
      var3.append("[");
      var3.append("libdiscord_version");
      var3.append("]: ");
      var3.append(var2);
      Log.v("Discord", var3.toString());
      systemLogCapture.startThread();
   }

   public data class Tombstone(text: String, cause: String?, groupBy: String, origin: String, groupHash: String, textHash: String) {
      public final val cause: String?
      public final val groupBy: String
      public final val groupHash: String
      public final val origin: String
      public final val text: String
      public final val textHash: String

      init {
         r.h(var1, "text");
         r.h(var3, "groupBy");
         r.h(var4, "origin");
         r.h(var5, "groupHash");
         r.h(var6, "textHash");
         super();
         this.text = var1;
         this.cause = var2;
         this.groupBy = var3;
         this.origin = var4;
         this.groupHash = var5;
         this.textHash = var6;
      }

      public operator fun component1(): String {
         return this.text;
      }

      public operator fun component2(): String? {
         return this.cause;
      }

      public operator fun component3(): String {
         return this.groupBy;
      }

      public operator fun component4(): String {
         return this.origin;
      }

      public operator fun component5(): String {
         return this.groupHash;
      }

      public operator fun component6(): String {
         return this.textHash;
      }

      public fun copy(
         text: String = var0.text,
         cause: String? = var0.cause,
         groupBy: String = var0.groupBy,
         origin: String = var0.origin,
         groupHash: String = var0.groupHash,
         textHash: String = var0.textHash
      ): com.discord.crash_reporting.system_logs.SystemLogUtils.Tombstone {
         r.h(var1, "text");
         r.h(var3, "groupBy");
         r.h(var4, "origin");
         r.h(var5, "groupHash");
         r.h(var6, "textHash");
         return new SystemLogUtils.Tombstone(var1, var2, var3, var4, var5, var6);
      }

      public override operator fun equals(other: Any?): Boolean {
         if (this === var1) {
            return true;
         } else if (var1 !is SystemLogUtils.Tombstone) {
            return false;
         } else {
            var1 = var1;
            if (!r.c(this.text, var1.text)) {
               return false;
            } else if (!r.c(this.cause, var1.cause)) {
               return false;
            } else if (!r.c(this.groupBy, var1.groupBy)) {
               return false;
            } else if (!r.c(this.origin, var1.origin)) {
               return false;
            } else if (!r.c(this.groupHash, var1.groupHash)) {
               return false;
            } else {
               return r.c(this.textHash, var1.textHash);
            }
         }
      }

      public override fun hashCode(): Int {
         val var2: Int = this.text.hashCode();
         val var1: Int;
         if (this.cause == null) {
            var1 = 0;
         } else {
            var1 = this.cause.hashCode();
         }

         return ((((var2 * 31 + var1) * 31 + this.groupBy.hashCode()) * 31 + this.origin.hashCode()) * 31 + this.groupHash.hashCode()) * 31
            + this.textHash.hashCode();
      }

      public override fun toString(): String {
         val var1: java.lang.String = this.text;
         val var3: java.lang.String = this.cause;
         val var6: java.lang.String = this.groupBy;
         val var2: java.lang.String = this.origin;
         val var7: java.lang.String = this.groupHash;
         val var4: java.lang.String = this.textHash;
         val var5: StringBuilder = new StringBuilder();
         var5.append("Tombstone(text=");
         var5.append(var1);
         var5.append(", cause=");
         var5.append(var3);
         var5.append(", groupBy=");
         var5.append(var6);
         var5.append(", origin=");
         var5.append(var2);
         var5.append(", groupHash=");
         var5.append(var7);
         var5.append(", textHash=");
         var5.append(var4);
         var5.append(")");
         return var5.toString();
      }
   }
}

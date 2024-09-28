package com.discord.crash_reporting.system_logs

import android.annotation.SuppressLint
import android.content.Context
import android.util.Log
import java.io.BufferedReader
import java.io.File
import java.security.MessageDigest
import java.util.HashSet
import java.util.LinkedList
import java.util.NoSuchElementException
import java.util.concurrent.TimeUnit
import kotlin.jvm.functions.Function0
import kotlin.jvm.functions.Function1
import kotlin.jvm.internal.q
import pk.j
import qk.d

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
      val var1: java.lang.String = Regex.k.c("libdiscord_version");
      val var0: StringBuilder = new StringBuilder();
      var0.append("(?:^(?:[^\\s]+\\s+){4}F\\s+DEBUG\\s+:\\s(.+))|(^.+(\\[");
      var0.append(var1);
      var0.append("\\].+))");
      regexExtractTombstone = new Regex(var0.toString());
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
         oh.a.b(
            false,
            false,
            null,
            null,
            0,
            new Function0(var4, var1, var3, var2) {
               final Function1 $cb;
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
                  //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:157)
                  //
                  // Bytecode:
                  // 000: bipush 0
                  // 001: istore 1
                  // 002: aconst_null
                  // 003: astore 6
                  // 005: aconst_null
                  // 006: astore 5
                  // 008: aload 5
                  // 00a: astore 4
                  // 00c: aload 6
                  // 00e: astore 3
                  // 00f: new java/lang/ProcessBuilder
                  // 012: astore 7
                  // 014: aload 5
                  // 016: astore 4
                  // 018: aload 6
                  // 01a: astore 3
                  // 01b: aload 7
                  // 01d: bipush 2
                  // 01e: anewarray 68
                  // 021: dup
                  // 022: bipush 0
                  // 023: ldc "/system/bin/logcat"
                  // 025: aastore
                  // 026: dup
                  // 027: bipush 1
                  // 028: ldc "-d"
                  // 02a: aastore
                  // 02b: invokespecial java/lang/ProcessBuilder.<init> ([Ljava/lang/String;)V
                  // 02e: aload 5
                  // 030: astore 4
                  // 032: aload 6
                  // 034: astore 3
                  // 035: aload 7
                  // 037: bipush 1
                  // 038: invokevirtual java/lang/ProcessBuilder.redirectErrorStream (Z)Ljava/lang/ProcessBuilder;
                  // 03b: invokevirtual java/lang/ProcessBuilder.start ()Ljava/lang/Process;
                  // 03e: astore 5
                  // 040: aload 5
                  // 042: astore 4
                  // 044: aload 5
                  // 046: astore 3
                  // 047: getstatic com/discord/crash_reporting/system_logs/SystemLogUtils.INSTANCE Lcom/discord/crash_reporting/system_logs/SystemLogUtils;
                  // 04a: astore 7
                  // 04c: aload 5
                  // 04e: astore 4
                  // 050: aload 5
                  // 052: astore 3
                  // 053: aload 7
                  // 055: aload 5
                  // 057: invokestatic com/discord/crash_reporting/system_logs/SystemLogUtils.access$waitFor (Lcom/discord/crash_reporting/system_logs/SystemLogUtils;Ljava/lang/Process;)V
                  // 05a: aload 5
                  // 05c: astore 4
                  // 05e: aload 5
                  // 060: astore 3
                  // 061: aload 5
                  // 063: invokevirtual java/lang/Process.getInputStream ()Ljava/io/InputStream;
                  // 066: astore 9
                  // 068: aload 5
                  // 06a: astore 4
                  // 06c: aload 5
                  // 06e: astore 3
                  // 06f: aload 9
                  // 071: ldc "getInputStream(...)"
                  // 073: invokestatic kotlin/jvm/internal/q.g (Ljava/lang/Object;Ljava/lang/String;)V
                  // 076: aload 5
                  // 078: astore 4
                  // 07a: aload 5
                  // 07c: astore 3
                  // 07d: getstatic qk/a.b Ljava/nio/charset/Charset;
                  // 080: astore 8
                  // 082: aload 5
                  // 084: astore 4
                  // 086: aload 5
                  // 088: astore 3
                  // 089: new java/io/InputStreamReader
                  // 08c: astore 6
                  // 08e: aload 5
                  // 090: astore 4
                  // 092: aload 5
                  // 094: astore 3
                  // 095: aload 6
                  // 097: aload 9
                  // 099: aload 8
                  // 09b: invokespecial java/io/InputStreamReader.<init> (Ljava/io/InputStream;Ljava/nio/charset/Charset;)V
                  // 09e: aload 5
                  // 0a0: astore 4
                  // 0a2: aload 5
                  // 0a4: astore 3
                  // 0a5: aload 6
                  // 0a7: instanceof java/io/BufferedReader
                  // 0aa: ifeq 0c7
                  // 0ad: aload 5
                  // 0af: astore 4
                  // 0b1: aload 5
                  // 0b3: astore 3
                  // 0b4: aload 6
                  // 0b6: checkcast java/io/BufferedReader
                  // 0b9: astore 6
                  // 0bb: goto 0dc
                  // 0be: astore 3
                  // 0bf: goto 1e1
                  // 0c2: astore 7
                  // 0c4: goto 108
                  // 0c7: aload 5
                  // 0c9: astore 4
                  // 0cb: aload 5
                  // 0cd: astore 3
                  // 0ce: new java/io/BufferedReader
                  // 0d1: dup
                  // 0d2: aload 6
                  // 0d4: sipush 8192
                  // 0d7: invokespecial java/io/BufferedReader.<init> (Ljava/io/Reader;I)V
                  // 0da: astore 6
                  // 0dc: aload 5
                  // 0de: astore 4
                  // 0e0: aload 5
                  // 0e2: astore 3
                  // 0e3: aload 7
                  // 0e5: aload 6
                  // 0e7: aload 0
                  // 0e8: getfield com/discord/crash_reporting/system_logs/SystemLogUtils$fetch$1.$output Ljava/util/LinkedList;
                  // 0eb: aload 0
                  // 0ec: getfield com/discord/crash_reporting/system_logs/SystemLogUtils$fetch$1.$filter Lkotlin/text/Regex;
                  // 0ef: invokestatic com/discord/crash_reporting/system_logs/SystemLogUtils.access$processLogs (Lcom/discord/crash_reporting/system_logs/SystemLogUtils;Ljava/io/BufferedReader;Ljava/util/LinkedList;Lkotlin/text/Regex;)V
                  // 0f2: aload 5
                  // 0f4: astore 4
                  // 0f6: aload 5
                  // 0f8: astore 3
                  // 0f9: aload 6
                  // 0fb: invokevirtual java/io/BufferedReader.close ()V
                  // 0fe: aload 5
                  // 100: astore 3
                  // 101: aload 3
                  // 102: invokevirtual java/lang/Process.destroy ()V
                  // 105: goto 1d2
                  // 108: aload 3
                  // 109: astore 4
                  // 10b: aload 7
                  // 10d: invokevirtual java/lang/Throwable.printStackTrace ()V
                  // 110: aload 3
                  // 111: astore 4
                  // 113: aload 0
                  // 114: getfield com/discord/crash_reporting/system_logs/SystemLogUtils$fetch$1.$logErrors Z
                  // 117: ifeq 1cb
                  // 11a: aload 3
                  // 11b: astore 4
                  // 11d: aload 0
                  // 11e: getfield com/discord/crash_reporting/system_logs/SystemLogUtils$fetch$1.$output Ljava/util/LinkedList;
                  // 121: astore 5
                  // 123: aload 3
                  // 124: astore 4
                  // 126: new java/lang/StringBuilder
                  // 129: astore 6
                  // 12b: aload 3
                  // 12c: astore 4
                  // 12e: aload 6
                  // 130: invokespecial java/lang/StringBuilder.<init> ()V
                  // 133: aload 3
                  // 134: astore 4
                  // 136: aload 6
                  // 138: ldc "Exception getting system logs '"
                  // 13a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
                  // 13d: pop
                  // 13e: aload 3
                  // 13f: astore 4
                  // 141: aload 6
                  // 143: aload 7
                  // 145: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
                  // 148: pop
                  // 149: aload 3
                  // 14a: astore 4
                  // 14c: aload 6
                  // 14e: ldc "'"
                  // 150: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
                  // 153: pop
                  // 154: aload 3
                  // 155: astore 4
                  // 157: aload 5
                  // 159: aload 6
                  // 15b: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
                  // 15e: invokevirtual java/util/LinkedList.add (Ljava/lang/Object;)Z
                  // 161: pop
                  // 162: aload 3
                  // 163: astore 4
                  // 165: aload 7
                  // 167: invokevirtual java/lang/Throwable.getStackTrace ()[Ljava/lang/StackTraceElement;
                  // 16a: astore 6
                  // 16c: aload 3
                  // 16d: astore 4
                  // 16f: aload 6
                  // 171: ldc "getStackTrace(...)"
                  // 173: invokestatic kotlin/jvm/internal/q.g (Ljava/lang/Object;Ljava/lang/String;)V
                  // 176: aload 3
                  // 177: astore 4
                  // 179: aload 0
                  // 17a: getfield com/discord/crash_reporting/system_logs/SystemLogUtils$fetch$1.$output Ljava/util/LinkedList;
                  // 17d: astore 7
                  // 17f: aload 3
                  // 180: astore 4
                  // 182: aload 6
                  // 184: arraylength
                  // 185: istore 2
                  // 186: iload 1
                  // 187: iload 2
                  // 188: if_icmpge 1cb
                  // 18b: aload 6
                  // 18d: iload 1
                  // 18e: aaload
                  // 18f: astore 8
                  // 191: aload 3
                  // 192: astore 4
                  // 194: new java/lang/StringBuilder
                  // 197: astore 5
                  // 199: aload 3
                  // 19a: astore 4
                  // 19c: aload 5
                  // 19e: invokespecial java/lang/StringBuilder.<init> ()V
                  // 1a1: aload 3
                  // 1a2: astore 4
                  // 1a4: aload 5
                  // 1a6: ldc "    "
                  // 1a8: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
                  // 1ab: pop
                  // 1ac: aload 3
                  // 1ad: astore 4
                  // 1af: aload 5
                  // 1b1: aload 8
                  // 1b3: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
                  // 1b6: pop
                  // 1b7: aload 3
                  // 1b8: astore 4
                  // 1ba: aload 7
                  // 1bc: aload 5
                  // 1be: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
                  // 1c1: invokevirtual java/util/LinkedList.add (Ljava/lang/Object;)Z
                  // 1c4: pop
                  // 1c5: iinc 1 1
                  // 1c8: goto 186
                  // 1cb: aload 3
                  // 1cc: ifnull 1d2
                  // 1cf: goto 101
                  // 1d2: aload 0
                  // 1d3: getfield com/discord/crash_reporting/system_logs/SystemLogUtils$fetch$1.$cb Lkotlin/jvm/functions/Function1;
                  // 1d6: aload 0
                  // 1d7: getfield com/discord/crash_reporting/system_logs/SystemLogUtils$fetch$1.$output Ljava/util/LinkedList;
                  // 1da: invokeinterface kotlin/jvm/functions/Function1.invoke (Ljava/lang/Object;)Ljava/lang/Object; 2
                  // 1df: pop
                  // 1e0: return
                  // 1e1: aload 4
                  // 1e3: ifnull 1eb
                  // 1e6: aload 4
                  // 1e8: invokevirtual java/lang/Process.destroy ()V
                  // 1eb: aload 3
                  // 1ec: athrow
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
            if (h.M(var5, "libdiscord_version", false, 2, null)) {
               var3 = var5;
            } else {
               if (h.M(var5, "*** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ***", false, 2, null)) {
                  h.i(var6);
                  var10 = var3;
               }

               var6.append(var5);
               q.g(var6, "append(...)");
               var6.append('\n');
               q.g(var6, "append(...)");
            }
         }

         if (h.x(var6) xor true) {
            var6.append('\n');
            q.g(var6, "append(...)");
            var6.append("Tombstone's libdiscord_version: ");
            var3 = var10;
            if (var10 == null) {
               var3 = "Unknown libdiscord_version";
            }

            var6.append(var3);
            q.g(var6, "append(...)");
            var6.append('\n');
            q.g(var6, "append(...)");
         }

         val var19: java.lang.String = var6.toString();
         q.g(var19, "toString(...)");
         if (h.x(var19)) {
            return null;
         } else {
            val var11: d = d.m;
            val var17: Regex = new Regex("^Cause: (.+)$", d.m);
            val var21: Sequence = j.y(
               Regex.e(new Regex("^\\s+#\\d+ pc .+/(.+? .+?)\\+?[+)]", var11), var19, 0, 2, null), new Function1(new Regex("classes\\d+.dex")) {
                  final Regex $removeDexNameExp;

                  {
                     super(1);
                     this.$removeDexNameExp = var1;
                  }

                  public final java.lang.String invoke(MatchResult var1) {
                     q.h(var1, "it");
                     return this.$removeDexNameExp.h(var1.b().get(1) as java.lang.CharSequence, "classesN.dex");
                  }
               }
            );
            val var8: HashSet = w.e(
               new java.lang.String[]{"libc.so (abort", "libart.so (art::Runtime::Abort(char const*", "libbase.so (android::base::LogMessage::~LogMessage("}
            );

            try {
               val var14: java.util.Iterator = var21.iterator();

               do {
                  if (!var14.hasNext()) {
                     throw new NoSuchElementException("Sequence contains no element matching the predicate.");
                  }

                  var23 = var14.next();
               } while (!(var8.contains((java.lang.String)var23) ^ true));

               var13 = var23 as java.lang.String;
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
      val var3: ByteArray = var1.getBytes(qk.a.b);
      q.g(var3, "getBytes(...)");
      val var4: ByteArray = var2.digest(var3);
      q.e(var4);
      return kotlin.collections.c.c0(var4, "", null, null, 0, null, <unrepresentable>.INSTANCE, 30, null);
   }

   private fun processLogs(reader: BufferedReader, output: LinkedList<String>, filter: Regex?) {
      var var4: Int = 0;

      while (true) {
         var var5: Int = var4;

         var var6: Int;
         label184: {
            label177: {
               label185: {
                  var var8: java.lang.String;
                  try {
                     var8 = var1.readLine();
                  } catch (var24: Exception) {
                     var25 = var24;
                     var4 = var4;
                     if (var3 != null) {
                        break label177;
                     }
                     break label185;
                  }

                  if (var8 == null) {
                     break label177;
                  }

                  label190: {
                     var var7: java.lang.String = var8;
                     if (var3 != null) {
                        var5 = var4;

                        try {
                           var29 = Regex.c(var3, var8, 0, 2, null);
                        } catch (var21: Exception) {
                           var25 = var21;
                           var4 = var4;
                           if (var3 != null) {
                              break label177;
                           }
                           break label185;
                        }

                        if (var29 == null) {
                           continue;
                        }

                        var5 = var4;

                        try {
                           var30 = var29.b();
                        } catch (var20: Exception) {
                           var25 = var20;
                           var4 = var4;
                           if (var3 != null) {
                              break label177;
                           }
                           break label185;
                        }

                        var5 = var4;

                        try {
                           var32 = var30.listIterator(var30.size());
                        } catch (var19: Exception) {
                           var25 = var19;
                           var4 = var4;
                           if (var3 != null) {
                              break label177;
                           }
                           break label185;
                        }

                        while (true) {
                           var5 = var4;

                           try {
                              if (!var32.hasPrevious()) {
                                 break label190;
                              }
                           } catch (var22: Exception) {
                              var25 = var22;
                              var4 = var4;
                              if (var3 != null) {
                                 break label177;
                              }
                              break label185;
                           }

                           var5 = var4;

                           try {
                              var31 = var32.previous();
                           } catch (var18: Exception) {
                              var25 = var18;
                              var4 = var4;
                              if (var3 != null) {
                                 break label177;
                              }
                              break label185;
                           }

                           var5 = var4;

                           try {
                              if ((var31 as java.lang.String).length() <= 0) {
                                 continue;
                              }
                           } catch (var23: Exception) {
                              var25 = var23;
                              var4 = var4;
                              if (var3 != null) {
                                 break label177;
                              }
                              break label185;
                           }

                           var5 = var4;

                           try {
                              var7 = var31 as java.lang.String;
                              break;
                           } catch (var17: Exception) {
                              var25 = var17;
                              var4 = var4;
                              if (var3 != null) {
                                 break label177;
                              }
                              break label185;
                           }
                        }
                     }

                     var5 = var4;

                     try {
                        if (h.x(var7)) {
                           continue;
                        }
                     } catch (var16: Exception) {
                        var25 = var16;
                        var4 = var4;
                        if (var3 != null) {
                           break label177;
                        }
                        break label185;
                     }

                     var5 = var4;

                     try {
                        if (h.M(var7, "Accessing hidden method", false, 2, null)) {
                           continue;
                        }
                     } catch (var15: Exception) {
                        var25 = var15;
                        var4 = var4;
                        if (var3 != null) {
                           break label177;
                        }
                        break label185;
                     }

                     var5 = var4;

                     try {
                        var6 = var4 + var7.length() + 1;
                     } catch (var14: Exception) {
                        var25 = var14;
                        var4 = var4;
                        if (var3 != null) {
                           break label177;
                        }
                        break label185;
                     }

                     var5 = var6;

                     try {
                        var2.add(var7);
                     } catch (var13: Exception) {
                        var25 = var13;
                        var4 = var6;
                        if (var3 != null) {
                           break label177;
                        }
                        break label185;
                     }

                     var4 = var6;
                     if (var6 <= 2500000) {
                        continue;
                     }

                     var5 = var6;

                     try {
                        var4 = (var2.pop() as java.lang.String).length();
                        break label184;
                     } catch (var12: Exception) {
                        var25 = var12;
                        var4 = var6;
                        if (var3 != null) {
                           break label177;
                        }
                        break label185;
                     }
                  }

                  var5 = var4;

                  try {
                     var26 = new NoSuchElementException;
                  } catch (var11: Exception) {
                     var25 = var11;
                     var4 = var4;
                     if (var3 != null) {
                        break label177;
                     }
                     break label185;
                  }

                  var5 = var4;

                  try {
                     var26./* $VF: Unable to resugar constructor */<init>("List contains no element matching the predicate.");
                  } catch (var10: Exception) {
                     var25 = var10;
                     var4 = var4;
                     if (var3 != null) {
                        break label177;
                     }
                     break label185;
                  }

                  var5 = var4;

                  try {
                     throw var26;
                  } catch (var9: Exception) {
                     var25 = var9;
                     var4 = var4;
                     if (var3 != null) {
                        break label177;
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
      q.h(var1, "context");
      val var2: StringBuilder = new StringBuilder();
      debugPrintables.debugPrint(var1, var2);
      systemLogCapture.appendOutput(var2);
      val var3: java.lang.String = var2.toString();
      q.g(var3, "toString(...)");
      return var3;
   }

   public fun fetchLastTombstone(cb: (com.discord.crash_reporting.system_logs.SystemLogUtils.Tombstone?) -> Unit) {
      q.h(var1, "cb");
      this.fetch(regexExtractTombstone, new Function1(var1) {
         final Function1 $cb;

         {
            super(1);
            this.$cb = var1;
         }

         public final void invoke(LinkedList<java.lang.String> var1) {
            q.h(var1, "crashes");
            this.$cb.invoke(SystemLogUtils.access$fetchLastTombstone(SystemLogUtils.INSTANCE, var1));
         }
      });
   }

   @SuppressLint(["LogNotTimber"])
   public fun initSystemLogCapture(context: Context) {
      q.h(var1, "context");
      val var3: java.lang.String = DebugPrintableCollection.Companion.libdiscordVersion(var1);
      val var2: StringBuilder = new StringBuilder();
      var2.append("[");
      var2.append("libdiscord_version");
      var2.append("]: ");
      var2.append(var3);
      Log.v("Discord", var2.toString());
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
         q.h(var1, "text");
         q.h(var3, "groupBy");
         q.h(var4, "origin");
         q.h(var5, "groupHash");
         q.h(var6, "textHash");
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
         q.h(var1, "text");
         q.h(var3, "groupBy");
         q.h(var4, "origin");
         q.h(var5, "groupHash");
         q.h(var6, "textHash");
         return new SystemLogUtils.Tombstone(var1, var2, var3, var4, var5, var6);
      }

      public override operator fun equals(other: Any?): Boolean {
         if (this === var1) {
            return true;
         } else if (var1 !is SystemLogUtils.Tombstone) {
            return false;
         } else {
            var1 = var1;
            if (!q.c(this.text, var1.text)) {
               return false;
            } else if (!q.c(this.cause, var1.cause)) {
               return false;
            } else if (!q.c(this.groupBy, var1.groupBy)) {
               return false;
            } else if (!q.c(this.origin, var1.origin)) {
               return false;
            } else if (!q.c(this.groupHash, var1.groupHash)) {
               return false;
            } else {
               return q.c(this.textHash, var1.textHash);
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
         val var3: java.lang.String = this.text;
         val var1: java.lang.String = this.cause;
         val var4: java.lang.String = this.groupBy;
         val var7: java.lang.String = this.origin;
         val var2: java.lang.String = this.groupHash;
         val var5: java.lang.String = this.textHash;
         val var6: StringBuilder = new StringBuilder();
         var6.append("Tombstone(text=");
         var6.append(var3);
         var6.append(", cause=");
         var6.append(var1);
         var6.append(", groupBy=");
         var6.append(var4);
         var6.append(", origin=");
         var6.append(var7);
         var6.append(", groupHash=");
         var6.append(var2);
         var6.append(", textHash=");
         var6.append(var5);
         var6.append(")");
         return var6.toString();
      }
   }
}

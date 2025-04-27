package com.discord.crash_reporting.system_logs

import L9.j
import M9.d
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
         j8.a.b(
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
                  // 01c: anewarray 68
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
                  // 064: astore 8
                  // 066: aload 5
                  // 068: astore 4
                  // 06a: aload 5
                  // 06c: astore 3
                  // 06d: aload 8
                  // 06f: ldc "getInputStream(...)"
                  // 071: invokestatic kotlin/jvm/internal/q.g (Ljava/lang/Object;Ljava/lang/String;)V
                  // 074: aload 5
                  // 076: astore 4
                  // 078: aload 5
                  // 07a: astore 3
                  // 07b: getstatic M9/a.b Ljava/nio/charset/Charset;
                  // 07e: astore 9
                  // 080: aload 5
                  // 082: astore 4
                  // 084: aload 5
                  // 086: astore 3
                  // 087: new java/io/InputStreamReader
                  // 08a: astore 6
                  // 08c: aload 5
                  // 08e: astore 4
                  // 090: aload 5
                  // 092: astore 3
                  // 093: aload 6
                  // 095: aload 8
                  // 097: aload 9
                  // 099: invokespecial java/io/InputStreamReader.<init> (Ljava/io/InputStream;Ljava/nio/charset/Charset;)V
                  // 09c: aload 5
                  // 09e: astore 4
                  // 0a0: aload 5
                  // 0a2: astore 3
                  // 0a3: new java/io/BufferedReader
                  // 0a6: astore 8
                  // 0a8: aload 5
                  // 0aa: astore 4
                  // 0ac: aload 5
                  // 0ae: astore 3
                  // 0af: aload 8
                  // 0b1: aload 6
                  // 0b3: sipush 8192
                  // 0b6: invokespecial java/io/BufferedReader.<init> (Ljava/io/Reader;I)V
                  // 0b9: aload 5
                  // 0bb: astore 4
                  // 0bd: aload 5
                  // 0bf: astore 3
                  // 0c0: aload 7
                  // 0c2: aload 8
                  // 0c4: aload 0
                  // 0c5: getfield com/discord/crash_reporting/system_logs/SystemLogUtils$fetch$1.$output Ljava/util/LinkedList;
                  // 0c8: aload 0
                  // 0c9: getfield com/discord/crash_reporting/system_logs/SystemLogUtils$fetch$1.$filter Lkotlin/text/Regex;
                  // 0cc: invokestatic com/discord/crash_reporting/system_logs/SystemLogUtils.access$processLogs (Lcom/discord/crash_reporting/system_logs/SystemLogUtils;Ljava/io/BufferedReader;Ljava/util/LinkedList;Lkotlin/text/Regex;)V
                  // 0cf: aload 5
                  // 0d1: astore 4
                  // 0d3: aload 5
                  // 0d5: astore 3
                  // 0d6: aload 8
                  // 0d8: invokevirtual java/io/BufferedReader.close ()V
                  // 0db: aload 5
                  // 0dd: astore 3
                  // 0de: aload 3
                  // 0df: invokevirtual java/lang/Process.destroy ()V
                  // 0e2: goto 1b7
                  // 0e5: astore 3
                  // 0e6: goto 1c6
                  // 0e9: astore 6
                  // 0eb: aload 3
                  // 0ec: astore 4
                  // 0ee: aload 6
                  // 0f0: invokevirtual java/lang/Throwable.printStackTrace ()V
                  // 0f3: aload 3
                  // 0f4: astore 4
                  // 0f6: aload 0
                  // 0f7: getfield com/discord/crash_reporting/system_logs/SystemLogUtils$fetch$1.$logErrors Z
                  // 0fa: ifeq 1b0
                  // 0fd: aload 3
                  // 0fe: astore 4
                  // 100: aload 0
                  // 101: getfield com/discord/crash_reporting/system_logs/SystemLogUtils$fetch$1.$output Ljava/util/LinkedList;
                  // 104: astore 7
                  // 106: aload 3
                  // 107: astore 4
                  // 109: new java/lang/StringBuilder
                  // 10c: astore 5
                  // 10e: aload 3
                  // 10f: astore 4
                  // 111: aload 5
                  // 113: invokespecial java/lang/StringBuilder.<init> ()V
                  // 116: aload 3
                  // 117: astore 4
                  // 119: aload 5
                  // 11b: ldc "Exception getting system logs '"
                  // 11d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
                  // 120: pop
                  // 121: aload 3
                  // 122: astore 4
                  // 124: aload 5
                  // 126: aload 6
                  // 128: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
                  // 12b: pop
                  // 12c: aload 3
                  // 12d: astore 4
                  // 12f: aload 5
                  // 131: ldc "'"
                  // 133: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
                  // 136: pop
                  // 137: aload 3
                  // 138: astore 4
                  // 13a: aload 7
                  // 13c: aload 5
                  // 13e: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
                  // 141: invokevirtual java/util/LinkedList.add (Ljava/lang/Object;)Z
                  // 144: pop
                  // 145: aload 3
                  // 146: astore 4
                  // 148: aload 6
                  // 14a: invokevirtual java/lang/Throwable.getStackTrace ()[Ljava/lang/StackTraceElement;
                  // 14d: astore 8
                  // 14f: aload 3
                  // 150: astore 4
                  // 152: aload 8
                  // 154: ldc "getStackTrace(...)"
                  // 156: invokestatic kotlin/jvm/internal/q.g (Ljava/lang/Object;Ljava/lang/String;)V
                  // 159: aload 3
                  // 15a: astore 4
                  // 15c: aload 0
                  // 15d: getfield com/discord/crash_reporting/system_logs/SystemLogUtils$fetch$1.$output Ljava/util/LinkedList;
                  // 160: astore 6
                  // 162: aload 3
                  // 163: astore 4
                  // 165: aload 8
                  // 167: arraylength
                  // 168: istore 2
                  // 169: bipush 0
                  // 16a: istore 1
                  // 16b: iload 1
                  // 16c: iload 2
                  // 16d: if_icmpge 1b0
                  // 170: aload 8
                  // 172: iload 1
                  // 173: aaload
                  // 174: astore 7
                  // 176: aload 3
                  // 177: astore 4
                  // 179: new java/lang/StringBuilder
                  // 17c: astore 5
                  // 17e: aload 3
                  // 17f: astore 4
                  // 181: aload 5
                  // 183: invokespecial java/lang/StringBuilder.<init> ()V
                  // 186: aload 3
                  // 187: astore 4
                  // 189: aload 5
                  // 18b: ldc "    "
                  // 18d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
                  // 190: pop
                  // 191: aload 3
                  // 192: astore 4
                  // 194: aload 5
                  // 196: aload 7
                  // 198: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
                  // 19b: pop
                  // 19c: aload 3
                  // 19d: astore 4
                  // 19f: aload 6
                  // 1a1: aload 5
                  // 1a3: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
                  // 1a6: invokevirtual java/util/LinkedList.add (Ljava/lang/Object;)Z
                  // 1a9: pop
                  // 1aa: iinc 1 1
                  // 1ad: goto 16b
                  // 1b0: aload 3
                  // 1b1: ifnull 1b7
                  // 1b4: goto 0de
                  // 1b7: aload 0
                  // 1b8: getfield com/discord/crash_reporting/system_logs/SystemLogUtils$fetch$1.$cb Lkotlin/jvm/functions/Function1;
                  // 1bb: aload 0
                  // 1bc: getfield com/discord/crash_reporting/system_logs/SystemLogUtils$fetch$1.$output Ljava/util/LinkedList;
                  // 1bf: invokeinterface kotlin/jvm/functions/Function1.invoke (Ljava/lang/Object;)Ljava/lang/Object; 2
                  // 1c4: pop
                  // 1c5: return
                  // 1c6: aload 4
                  // 1c8: ifnull 1d0
                  // 1cb: aload 4
                  // 1cd: invokevirtual java/lang/Process.destroy ()V
                  // 1d0: aload 3
                  // 1d1: athrow
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
         var var7: java.util.Iterator = var1.iterator();
         var var3: java.lang.String = null;
         var var10: java.lang.String = null;

         while (var7.hasNext()) {
            val var5: java.lang.String = var7.next() as java.lang.String;
            if (h.O(var5, "libdiscord_version", false, 2, null)) {
               var3 = var5;
            } else {
               if (h.O(var5, "*** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ***", false, 2, null)) {
                  h.i(var6);
                  var10 = var3;
               }

               var6.append(var5);
               q.g(var6, "append(...)");
               var6.append('\n');
               q.g(var6, "append(...)");
            }
         }

         if (!h.d0(var6)) {
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
         if (h.d0(var19)) {
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
               var7 = var21.iterator();

               do {
                  if (!var7.hasNext()) {
                     throw new NoSuchElementException("Sequence contains no element matching the predicate.");
                  }

                  var14 = var7.next();
               } while (var8.contains((java.lang.String)var14));

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
      val var3: ByteArray = var1.getBytes(M9.a.b);
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
                        if (h.d0(var7)) {
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
                        if (h.O(var7, "Accessing hidden method", false, 2, null)) {
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
         val var2: java.lang.String = this.text;
         val var5: java.lang.String = this.cause;
         val var6: java.lang.String = this.groupBy;
         val var7: java.lang.String = this.origin;
         val var3: java.lang.String = this.groupHash;
         val var4: java.lang.String = this.textHash;
         val var1: StringBuilder = new StringBuilder();
         var1.append("Tombstone(text=");
         var1.append(var2);
         var1.append(", cause=");
         var1.append(var5);
         var1.append(", groupBy=");
         var1.append(var6);
         var1.append(", origin=");
         var1.append(var7);
         var1.append(", groupHash=");
         var1.append(var3);
         var1.append(", textHash=");
         var1.append(var4);
         var1.append(")");
         return var1.toString();
      }
   }
}

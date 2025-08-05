package com.discord.crash_reporting.system_logs

import android.annotation.SuppressLint
import android.content.Context
import android.util.Log
import java.io.BufferedReader
import java.io.File
import java.security.MessageDigest
import java.util.Arrays
import java.util.HashSet
import java.util.LinkedList
import java.util.NoSuchElementException
import java.util.concurrent.TimeUnit
import kotlin.jvm.functions.Function1
import kotlin.jvm.internal.r

internal object SystemLogUtils {
   internal const val LOGCAT_PATH: String = "/system/bin/logcat"
   private final val debugPrintables: DebugPrintableCollection = new DebugPrintableCollection()
   private const val MAX_LOG_SIZE: Int = 2500000
   private const val LIBDISCORD_VERSION_CATEGORY: String = "libdiscord_version"
   private const val DEFAULT_TAG: String = "Discord"
   private final val systemLogCapture: SystemLogCapture = new SystemLogCapture()
   internal final val regexExtractTombstone: Regex

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
         G9.a.b(false, false, null, null, 0, new h(var4, var1, var3, var2), 31, null);
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
            if (kotlin.text.h.N(var5, "libdiscord_version", false, 2, null)) {
               var3 = var5;
            } else {
               if (kotlin.text.h.N(var5, "*** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ***", false, 2, null)) {
                  kotlin.text.h.i(var6);
                  var10 = var3;
               }

               var6.append(var5);
               r.g(var6, "append(...)");
               var6.append('\n');
               r.g(var6, "append(...)");
            }
         }

         if (!kotlin.text.h.c0(var6)) {
            var6.append('\n');
            r.g(var6, "append(...)");
            var6.append("Tombstone's libdiscord_version: ");
            var3 = var10;
            if (var10 == null) {
               var3 = "Unknown libdiscord_version";
            }

            var6.append(var3);
            r.g(var6, "append(...)");
            var6.append('\n');
            r.g(var6, "append(...)");
         }

         val var19: java.lang.String = var6.toString();
         r.g(var19, "toString(...)");
         if (kotlin.text.h.c0(var19)) {
            return null;
         } else {
            val var11: ib.d = ib.d.m;
            val var17: Regex = new Regex("^Cause: (.+)$", ib.d.m);
            val var21: Sequence = hb.k.z(
               Regex.e(new Regex("^\\s+#\\d+ pc .+/(.+? .+?)\\+?[+)]", var11), var19, 0, 2, null), new i(new Regex("classes\\d+.dex"))
            );
            val var13: HashSet = w.e(
               new java.lang.String[]{"libc.so (abort", "libart.so (art::Runtime::Abort(char const*", "libbase.so (android::base::LogMessage::~LogMessage("}
            );

            try {
               var7 = var21.iterator();

               val var8: Any;
               do {
                  if (!var7.hasNext()) {
                     throw new NoSuchElementException("Sequence contains no element matching the predicate.");
                  }

                  var8 = var7.next();
               } while (var13.contains((java.lang.String)var8));

               var14 = var8 as java.lang.String;
            } catch (var9: NoSuchElementException) {
               var14 = "Unknown";
            }

            val var22: java.lang.String = hb.k.x(var21, "\n", null, null, 0, null, null, 62, null);
            val var24: MatchResult = Regex.c(var17, var19, 0, 2, null);
            var3 = null;
            if (var24 != null) {
               val var25: java.util.List = var24.b();
               var3 = null;
               if (var25 != null) {
                  var3 = var25.get(1) as java.lang.String;
               }
            }

            return new SystemLogUtils.Tombstone(var19, var3, var22, var14, this.hashString(var22), this.hashString(var19));
         }
      }
   }

   @JvmStatic
   fun `fetchLastTombstone$lambda$0`(var0: Function1, var1: LinkedList): Unit {
      r.h(var1, "crashes");
      var0.invoke(INSTANCE.fetchLastTombstone(var1));
      return Unit.a;
   }

   @JvmStatic
   fun `fetchLastTombstone$lambda$2`(var0: Regex, var1: MatchResult): java.lang.String {
      r.h(var1, "it");
      return var0.h(var1.b().get(1) as java.lang.CharSequence, "classesN.dex");
   }

   private fun hashString(input: String): String {
      val var2: MessageDigest = MessageDigest.getInstance("SHA-1");
      val var3: ByteArray = var1.getBytes(ib.a.b);
      r.g(var3, "getBytes(...)");
      val var4: ByteArray = var2.digest(var3);
      r.e(var4);
      return kotlin.collections.c.h0(var4, "", null, null, 0, null, new j(), 30, null);
   }

   @JvmStatic
   fun `hashString$lambda$7`(var0: Byte): java.lang.CharSequence {
      val var1: java.lang.String = java.lang.String.format("%02X", Arrays.copyOf(new Object[]{var0}, 1));
      r.g(var1, "format(...)");
      return var1;
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
                           var31 = var30.listIterator(var30.size());
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
                              if (!var31.hasPrevious()) {
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
                              var8 = (java.lang.String)var31.previous();
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
                              if (var8.length() <= 0) {
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
                              var7 = var8;
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
                        if (kotlin.text.h.c0(var7)) {
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
                        if (kotlin.text.h.N(var7, "Accessing hidden method", false, 2, null)) {
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
      val var4: Long = System.nanoTime();
      val var2: Long = TimeUnit.SECONDS.toNanos(15L);

      while (true) {
         try {
            var1.exitValue();
            return;
         } catch (var7: IllegalThreadStateException) {
            Thread.sleep(100L);
            if (System.nanoTime() >= var4 + var2) {
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
      r.g(var3, "toString(...)");
      return var3;
   }

   public fun fetchLastTombstone(cb: (com.discord.crash_reporting.system_logs.SystemLogUtils.Tombstone?) -> Unit) {
      r.h(var1, "cb");
      this.fetch(regexExtractTombstone, new k(var1));
   }

   @SuppressLint(["LogNotTimber"])
   public fun initSystemLogCapture(context: Context) {
      r.h(var1, "context");
      val var3: java.lang.String = DebugPrintableCollection.Companion.libdiscordVersion(var1);
      val var2: StringBuilder = new StringBuilder();
      var2.append("[");
      var2.append("libdiscord_version");
      var2.append("]: ");
      var2.append(var3);
      Log.v("Discord", var2.toString());
      systemLogCapture.startThread(var1);
   }

   public data class Tombstone(text: String, cause: String?, groupBy: String, origin: String, groupHash: String, textHash: String) {
      public final val text: String
      public final val cause: String?
      public final val groupBy: String
      public final val origin: String
      public final val groupHash: String
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
         val var5: java.lang.String = this.text;
         val var6: java.lang.String = this.cause;
         val var4: java.lang.String = this.groupBy;
         val var1: java.lang.String = this.origin;
         val var7: java.lang.String = this.groupHash;
         val var2: java.lang.String = this.textHash;
         val var3: StringBuilder = new StringBuilder();
         var3.append("Tombstone(text=");
         var3.append(var5);
         var3.append(", cause=");
         var3.append(var6);
         var3.append(", groupBy=");
         var3.append(var4);
         var3.append(", origin=");
         var3.append(var1);
         var3.append(", groupHash=");
         var3.append(var7);
         var3.append(", textHash=");
         var3.append(var2);
         var3.append(")");
         return var3.toString();
      }
   }
}

package com.discord.resource_usage

import android.system.Os
import android.system.OsConstants
import vj.r
import vj.s

internal class DeviceResourceUsageManager(timeSpanMillis: Long = 1000L) {
   private final var activeThreadId: Long?
   public final val cpuCoreCount: Int

   public final var cpuUsagePercent: Double
      internal set

   public final var memoryRssKB: Int
      internal set

   private final var thread: Thread?
   private final val threadSync: Any
   private final val timeSpanMillis: Long

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @JvmStatic
   fun {
      var var0: Any;
      label42:
      try {
         var0 = r.k;
         var0 = r.b(Os.sysconf(OsConstants._SC_CLK_TCK));
      } catch (var4: java.lang.Throwable) {
         val var1: vj.r.a = r.k;
         var0 = r.b(s.a(var4));
         break label42;
      }

      var var19: Any = var0;
      if (r.g(var0)) {
         var19 = 100L;
      }

      SC_CLK_TCK = (var19 as java.lang.Number).longValue();

      label36:
      try {
         var0 = r.b(Os.sysconf(OsConstants._SC_PAGE_SIZE));
      } catch (var3: java.lang.Throwable) {
         var0 = r.k;
         var0 = r.b(s.a(var3));
         break label36;
      }

      var19 = var0;
      if (r.g(var0)) {
         var19 = 4096L;
      }

      SC_PAGE_SIZE = (var19 as java.lang.Number).longValue();

      label30:
      try {
         var0 = r.b(Runtime.getRuntime().availableProcessors());
      } catch (var2: java.lang.Throwable) {
         var0 = r.k;
         var0 = r.b(s.a(var2));
         break label30;
      }

      var19 = var0;
      if (r.g(var0)) {
         var19 = 1;
      }

      SC_CPU_CORE_COUNT = (var19 as java.lang.Number).intValue();
   }

   fun DeviceResourceUsageManager() {
      this(0L, 1, null);
   }

   init {
      this.timeSpanMillis = var1;
      this.threadSync = new Object();
      var var3: Int = SC_CPU_CORE_COUNT;
      if (SC_CPU_CORE_COUNT == 0) {
         var3 = 1;
      }

      this.cpuCoreCount = var3;
   }

   private fun monitor() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.IndexOutOfBoundsException: Index -1 out of bounds for length 0
      //   at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:100)
      //   at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:106)
      //   at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:302)
      //   at java.base/java.util.Objects.checkIndex(Objects.java:385)
      //   at java.base/java.util.ArrayList.remove(ArrayList.java:551)
      //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.removeExceptionInstructionsEx(FinallyProcessor.java:1054)
      //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.verifyFinallyEx(FinallyProcessor.java:555)
      //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.iterateGraph(FinallyProcessor.java:91)
      //
      // Bytecode:
      // 00: aconst_null
      // 01: astore 7
      // 03: aconst_null
      // 04: astore 8
      // 06: aload 0
      // 07: getfield com/discord/resource_usage/DeviceResourceUsageManager.threadSync Ljava/lang/Object;
      // 0a: astore 9
      // 0c: aload 9
      // 0e: monitorenter
      // 0f: aload 0
      // 10: getfield com/discord/resource_usage/DeviceResourceUsageManager.activeThreadId Ljava/lang/Long;
      // 13: astore 10
      // 15: invokestatic java/lang/Thread.currentThread ()Ljava/lang/Thread;
      // 18: invokevirtual java/lang/Thread.getId ()J
      // 1b: lstore 3
      // 1c: aload 10
      // 1e: ifnonnull 24
      // 21: goto 32
      // 24: aload 10
      // 26: invokevirtual java/lang/Long.longValue ()J
      // 29: lstore 5
      // 2b: lload 5
      // 2d: lload 3
      // 2e: lcmp
      // 2f: ifeq 36
      // 32: aload 9
      // 34: monitorexit
      // 35: return
      // 36: getstatic kotlin/Unit.a Lkotlin/Unit;
      // 39: astore 10
      // 3b: aload 9
      // 3d: monitorexit
      // 3e: invokestatic java/lang/Thread.interrupted ()Z
      // 41: ifeq 45
      // 44: return
      // 45: getstatic com/discord/resource_usage/utils/ProcfsStats.Companion Lcom/discord/resource_usage/utils/ProcfsStats$Companion;
      // 48: invokevirtual com/discord/resource_usage/utils/ProcfsStats$Companion.readStatFile ()Lcom/discord/resource_usage/utils/ProcfsStats;
      // 4b: astore 9
      // 4d: invokestatic java/lang/System.currentTimeMillis ()J
      // 50: lstore 3
      // 51: aload 7
      // 53: ifnull a5
      // 56: aload 8
      // 58: ifnull a5
      // 5b: aload 9
      // 5d: ifnull a5
      // 60: lload 3
      // 61: aload 8
      // 63: invokevirtual java/lang/Long.longValue ()J
      // 66: lsub
      // 67: l2d
      // 68: ldc2_w 1000.0
      // 6b: ddiv
      // 6c: dstore 1
      // 6d: aload 0
      // 6e: aload 9
      // 70: invokevirtual com/discord/resource_usage/utils/ProcfsStats.getTotalTime ()J
      // 73: aload 7
      // 75: invokevirtual com/discord/resource_usage/utils/ProcfsStats.getTotalTime ()J
      // 78: lsub
      // 79: bipush 100
      // 7b: i2l
      // 7c: lmul
      // 7d: l2d
      // 7e: getstatic com/discord/resource_usage/DeviceResourceUsageManager.SC_CLK_TCK J
      // 81: l2d
      // 82: dload 1
      // 83: dmul
      // 84: ddiv
      // 85: aload 0
      // 86: getfield com/discord/resource_usage/DeviceResourceUsageManager.cpuCoreCount I
      // 89: bipush 1
      // 8a: invokestatic java/lang/Math.max (II)I
      // 8d: i2d
      // 8e: ddiv
      // 8f: putfield com/discord/resource_usage/DeviceResourceUsageManager.cpuUsagePercent D
      // 92: aload 0
      // 93: aload 9
      // 95: invokevirtual com/discord/resource_usage/utils/ProcfsStats.getRssPages ()J
      // 98: getstatic com/discord/resource_usage/DeviceResourceUsageManager.SC_PAGE_SIZE J
      // 9b: lmul
      // 9c: sipush 1024
      // 9f: i2l
      // a0: ldiv
      // a1: l2i
      // a2: putfield com/discord/resource_usage/DeviceResourceUsageManager.memoryRssKB I
      // a5: lload 3
      // a6: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // a9: astore 8
      // ab: aload 0
      // ac: getfield com/discord/resource_usage/DeviceResourceUsageManager.timeSpanMillis J
      // af: invokestatic java/lang/Thread.sleep (J)V
      // b2: aload 9
      // b4: astore 7
      // b6: goto 06
      // b9: astore 7
      // bb: aload 9
      // bd: monitorexit
      // be: aload 7
      // c0: athrow
   }

   public fun start() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.ClassCastException: class org.jetbrains.java.decompiler.modules.decompiler.exps.MonitorExprent cannot be cast to class org.jetbrains.java.decompiler.modules.decompiler.exps.IfExprent (org.jetbrains.java.decompiler.modules.decompiler.exps.MonitorExprent and org.jetbrains.java.decompiler.modules.decompiler.exps.IfExprent are in unnamed module of loader 'app')
      //   at org.jetbrains.java.decompiler.modules.decompiler.stats.IfStatement.initExprents(IfStatement.java:276)
      //   at org.jetbrains.java.decompiler.modules.decompiler.ExprProcessor.initStatementExprents(ExprProcessor.java:189)
      //   at org.jetbrains.java.decompiler.modules.decompiler.ExprProcessor.initStatementExprents(ExprProcessor.java:192)
      //   at org.jetbrains.java.decompiler.modules.decompiler.ExprProcessor.initStatementExprents(ExprProcessor.java:192)
      //   at org.jetbrains.java.decompiler.modules.decompiler.ExprProcessor.processStatement(ExprProcessor.java:148)
      //
      // Bytecode:
      // 00: aload 0
      // 01: getfield com/discord/resource_usage/DeviceResourceUsageManager.threadSync Ljava/lang/Object;
      // 04: astore 1
      // 05: aload 1
      // 06: monitorenter
      // 07: aload 0
      // 08: getfield com/discord/resource_usage/DeviceResourceUsageManager.thread Ljava/lang/Thread;
      // 0b: astore 2
      // 0c: new com/discord/resource_usage/DeviceResourceUsageManager$start$oldThread$1$thread$1
      // 0f: astore 3
      // 10: aload 3
      // 11: aload 0
      // 12: invokespecial com/discord/resource_usage/DeviceResourceUsageManager$start$oldThread$1$thread$1.<init> (Lcom/discord/resource_usage/DeviceResourceUsageManager;)V
      // 15: bipush 1
      // 16: bipush 1
      // 17: aconst_null
      // 18: ldc "DeviceResourceUsageMonitor"
      // 1a: bipush 2
      // 1b: aload 3
      // 1c: bipush 4
      // 1d: aconst_null
      // 1e: invokestatic zj/a.b (ZZLjava/lang/ClassLoader;Ljava/lang/String;ILkotlin/jvm/functions/Function0;ILjava/lang/Object;)Ljava/lang/Thread;
      // 21: astore 3
      // 22: aload 0
      // 23: aload 3
      // 24: invokevirtual java/lang/Thread.getId ()J
      // 27: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2a: putfield com/discord/resource_usage/DeviceResourceUsageManager.activeThreadId Ljava/lang/Long;
      // 2d: aload 0
      // 2e: aload 3
      // 2f: putfield com/discord/resource_usage/DeviceResourceUsageManager.thread Ljava/lang/Thread;
      // 32: aload 1
      // 33: monitorexit
      // 34: aload 2
      // 35: ifnull 3c
      // 38: aload 2
      // 39: invokevirtual java/lang/Thread.interrupt ()V
      // 3c: return
      // 3d: astore 2
      // 3e: aload 1
      // 3f: monitorexit
      // 40: aload 2
      // 41: athrow
   }

   public fun stop() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.ClassCastException: class org.jetbrains.java.decompiler.modules.decompiler.exps.MonitorExprent cannot be cast to class org.jetbrains.java.decompiler.modules.decompiler.exps.IfExprent (org.jetbrains.java.decompiler.modules.decompiler.exps.MonitorExprent and org.jetbrains.java.decompiler.modules.decompiler.exps.IfExprent are in unnamed module of loader 'app')
      //   at org.jetbrains.java.decompiler.modules.decompiler.stats.IfStatement.initExprents(IfStatement.java:276)
      //   at org.jetbrains.java.decompiler.modules.decompiler.ExprProcessor.initStatementExprents(ExprProcessor.java:189)
      //   at org.jetbrains.java.decompiler.modules.decompiler.ExprProcessor.initStatementExprents(ExprProcessor.java:192)
      //   at org.jetbrains.java.decompiler.modules.decompiler.ExprProcessor.initStatementExprents(ExprProcessor.java:192)
      //   at org.jetbrains.java.decompiler.modules.decompiler.ExprProcessor.processStatement(ExprProcessor.java:148)
      //
      // Bytecode:
      // 00: aload 0
      // 01: getfield com/discord/resource_usage/DeviceResourceUsageManager.threadSync Ljava/lang/Object;
      // 04: astore 1
      // 05: aload 1
      // 06: monitorenter
      // 07: aload 0
      // 08: getfield com/discord/resource_usage/DeviceResourceUsageManager.thread Ljava/lang/Thread;
      // 0b: astore 2
      // 0c: aload 0
      // 0d: aconst_null
      // 0e: putfield com/discord/resource_usage/DeviceResourceUsageManager.thread Ljava/lang/Thread;
      // 11: aload 0
      // 12: aconst_null
      // 13: putfield com/discord/resource_usage/DeviceResourceUsageManager.activeThreadId Ljava/lang/Long;
      // 16: aload 1
      // 17: monitorexit
      // 18: aload 2
      // 19: ifnull 20
      // 1c: aload 2
      // 1d: invokevirtual java/lang/Thread.interrupt ()V
      // 20: return
      // 21: astore 2
      // 22: aload 1
      // 23: monitorexit
      // 24: aload 2
      // 25: athrow
   }

   public companion object {
      private final val SC_CLK_TCK: Long
      private final val SC_CPU_CORE_COUNT: Int
      private final val SC_PAGE_SIZE: Long
   }
}

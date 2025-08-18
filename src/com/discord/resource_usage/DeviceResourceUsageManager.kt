package com.discord.resource_usage

import android.app.ActivityManager
import android.app.ActivityManager.MemoryInfo
import android.content.Context
import android.system.Os
import android.system.OsConstants
import kotlin.jvm.internal.SourceDebugExtension

@SourceDebugExtension(["SMAP\nDeviceResourceUsageManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceResourceUsageManager.kt\ncom/discord/resource_usage/DeviceResourceUsageManager\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,135:1\n1#2:136\n*E\n"])
internal class DeviceResourceUsageManager(context: Context) {
   private final val activityManager: ActivityManager
   private final var thread: Thread?
   private final var activeThreadId: Long?
   private final val threadSync: Any

   public final var cpuUsagePercent: Double
      internal set

   public final var memoryRssKB: Int
      internal set

   public final var memoryInfo: MemoryInfo
      internal set

   public final val cpuCoreCount: Int

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @JvmStatic
   fun {
      var var14: Any;
      label42:
      try {
         var14 = Result.e;
         var14 = Result.b(Os.sysconf(OsConstants._SC_CLK_TCK));
      } catch (var4: java.lang.Throwable) {
         var14 = Result.e;
         var14 = Result.b(c.a(var4));
         break label42;
      }

      var var1: Any = var14;
      if (Result.g(var14)) {
         var1 = 100L;
      }

      SC_CLK_TCK = (var1 as java.lang.Number).longValue();

      label36:
      try {
         var14 = Result.b(Os.sysconf(OsConstants._SC_PAGE_SIZE));
      } catch (var3: java.lang.Throwable) {
         var1 = Result.e;
         var14 = Result.b(c.a(var3));
         break label36;
      }

      var1 = var14;
      if (Result.g(var14)) {
         var1 = 4096L;
      }

      SC_PAGE_SIZE = (var1 as java.lang.Number).longValue();

      label30:
      try {
         var14 = Result.b(Runtime.getRuntime().availableProcessors());
      } catch (var2: java.lang.Throwable) {
         var1 = Result.e;
         var14 = Result.b(c.a(var2));
         break label30;
      }

      var1 = var14;
      if (Result.g(var14)) {
         var1 = 1;
      }

      SC_CPU_CORE_COUNT = (var1 as java.lang.Number).intValue();
   }

   init {
      this.activityManager = var1.getSystemService(ActivityManager.class) as ActivityManager;
      this.threadSync = new Object();
      this.memoryInfo = new MemoryInfo();
      var var2: Int = SC_CPU_CORE_COUNT;
      if (SC_CPU_CORE_COUNT == 0) {
         var2 = 1;
      }

      this.cpuCoreCount = var2;
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
      //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.removeExceptionInstructionsEx(FinallyProcessor.java:1064)
      //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.verifyFinallyEx(FinallyProcessor.java:565)
      //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.iterateGraph(FinallyProcessor.java:90)
      //
      // Bytecode:
      // 00: aconst_null
      // 01: astore 8
      // 03: aconst_null
      // 04: astore 7
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
      // 45: aload 0
      // 46: getfield com/discord/resource_usage/DeviceResourceUsageManager.memoryInfo Landroid/app/ActivityManager$MemoryInfo;
      // 49: astore 9
      // 4b: aload 0
      // 4c: getfield com/discord/resource_usage/DeviceResourceUsageManager.activityManager Landroid/app/ActivityManager;
      // 4f: aload 9
      // 51: invokevirtual android/app/ActivityManager.getMemoryInfo (Landroid/app/ActivityManager$MemoryInfo;)V
      // 54: aload 9
      // 56: getfield android/app/ActivityManager$MemoryInfo.lowMemory Z
      // 59: ifeq 65
      // 5c: ldc2_w 1000
      // 5f: invokestatic java/lang/Thread.sleep (J)V
      // 62: goto 06
      // 65: getstatic com/discord/resource_usage/utils/ProcfsStats.Companion Lcom/discord/resource_usage/utils/ProcfsStats$Companion;
      // 68: invokevirtual com/discord/resource_usage/utils/ProcfsStats$Companion.readStatFile ()Lcom/discord/resource_usage/utils/ProcfsStats;
      // 6b: astore 9
      // 6d: invokestatic java/lang/System.currentTimeMillis ()J
      // 70: lstore 3
      // 71: aload 8
      // 73: ifnull c5
      // 76: aload 7
      // 78: ifnull c5
      // 7b: aload 9
      // 7d: ifnull c5
      // 80: lload 3
      // 81: aload 7
      // 83: invokevirtual java/lang/Long.longValue ()J
      // 86: lsub
      // 87: l2d
      // 88: ldc2_w 1000.0
      // 8b: ddiv
      // 8c: dstore 1
      // 8d: aload 0
      // 8e: aload 9
      // 90: invokevirtual com/discord/resource_usage/utils/ProcfsStats.getTotalTime ()J
      // 93: aload 8
      // 95: invokevirtual com/discord/resource_usage/utils/ProcfsStats.getTotalTime ()J
      // 98: lsub
      // 99: bipush 100
      // 9b: i2l
      // 9c: lmul
      // 9d: l2d
      // 9e: getstatic com/discord/resource_usage/DeviceResourceUsageManager.SC_CLK_TCK J
      // a1: l2d
      // a2: dload 1
      // a3: dmul
      // a4: ddiv
      // a5: aload 0
      // a6: getfield com/discord/resource_usage/DeviceResourceUsageManager.cpuCoreCount I
      // a9: bipush 1
      // aa: invokestatic java/lang/Math.max (II)I
      // ad: i2d
      // ae: ddiv
      // af: putfield com/discord/resource_usage/DeviceResourceUsageManager.cpuUsagePercent D
      // b2: aload 0
      // b3: aload 9
      // b5: invokevirtual com/discord/resource_usage/utils/ProcfsStats.getRssPages ()J
      // b8: getstatic com/discord/resource_usage/DeviceResourceUsageManager.SC_PAGE_SIZE J
      // bb: lmul
      // bc: sipush 1024
      // bf: i2l
      // c0: ldiv
      // c1: l2i
      // c2: putfield com/discord/resource_usage/DeviceResourceUsageManager.memoryRssKB I
      // c5: lload 3
      // c6: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // c9: astore 7
      // cb: ldc2_w 1000
      // ce: invokestatic java/lang/Thread.sleep (J)V
      // d1: aload 9
      // d3: astore 8
      // d5: goto 06
      // d8: astore 7
      // da: aload 9
      // dc: monitorexit
      // dd: aload 7
      // df: athrow
   }

   @JvmStatic
   fun `start$lambda$1$lambda$0`(var0: DeviceResourceUsageManager): Unit {
      try {
         var0.monitor();
      } catch (var1: InterruptedException) {
      }

      return Unit.a;
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
      // 0c: new c2/a
      // 0f: astore 3
      // 10: aload 3
      // 11: aload 0
      // 12: invokespecial c2/a.<init> (Lcom/discord/resource_usage/DeviceResourceUsageManager;)V
      // 15: bipush 1
      // 16: bipush 1
      // 17: aconst_null
      // 18: ldc_w "DeviceResourceUsageMonitor"
      // 1b: bipush 2
      // 1c: aload 3
      // 1d: bipush 4
      // 1e: aconst_null
      // 1f: invokestatic F9/a.b (ZZLjava/lang/ClassLoader;Ljava/lang/String;ILkotlin/jvm/functions/Function0;ILjava/lang/Object;)Ljava/lang/Thread;
      // 22: astore 3
      // 23: aload 0
      // 24: aload 3
      // 25: invokevirtual java/lang/Thread.getId ()J
      // 28: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 2b: putfield com/discord/resource_usage/DeviceResourceUsageManager.activeThreadId Ljava/lang/Long;
      // 2e: aload 0
      // 2f: aload 3
      // 30: putfield com/discord/resource_usage/DeviceResourceUsageManager.thread Ljava/lang/Thread;
      // 33: aload 1
      // 34: monitorexit
      // 35: aload 2
      // 36: ifnull 3d
      // 39: aload 2
      // 3a: invokevirtual java/lang/Thread.interrupt ()V
      // 3d: return
      // 3e: astore 2
      // 3f: aload 1
      // 40: monitorexit
      // 41: aload 2
      // 42: athrow
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
      private final val SC_PAGE_SIZE: Long
      private final val SC_CPU_CORE_COUNT: Int
      private const val THREAD_SLEEP_MS: Long
   }
}

package com.discord.resource_usage

import android.app.ActivityManager
import android.app.ActivityManager.MemoryInfo
import android.content.Context
import android.system.Os
import android.system.OsConstants
import kotlin.jvm.internal.SourceDebugExtension

@SourceDebugExtension(["SMAP\nDeviceResourceUsageManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceResourceUsageManager.kt\ncom/discord/resource_usage/DeviceResourceUsageManager\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,132:1\n1#2:133\n*E\n"])
internal class DeviceResourceUsageManager(context: Context) {
   private final val activityManager: ActivityManager
   private final var thread: Thread?
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
         var14 = Result.e;
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
         var14 = Result.e;
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
      // 01: astore 6
      // 03: aconst_null
      // 04: astore 5
      // 06: aload 0
      // 07: getfield com/discord/resource_usage/DeviceResourceUsageManager.threadSync Ljava/lang/Object;
      // 0a: astore 7
      // 0c: aload 7
      // 0e: monitorenter
      // 0f: aload 0
      // 10: getfield com/discord/resource_usage/DeviceResourceUsageManager.thread Ljava/lang/Thread;
      // 13: astore 9
      // 15: invokestatic java/lang/Thread.currentThread ()Ljava/lang/Thread;
      // 18: astore 8
      // 1a: aload 9
      // 1c: aload 8
      // 1e: if_acmpeq 25
      // 21: aload 7
      // 23: monitorexit
      // 24: return
      // 25: getstatic kotlin/Unit.a Lkotlin/Unit;
      // 28: astore 8
      // 2a: aload 7
      // 2c: monitorexit
      // 2d: invokestatic java/lang/Thread.interrupted ()Z
      // 30: ifeq 34
      // 33: return
      // 34: aload 0
      // 35: getfield com/discord/resource_usage/DeviceResourceUsageManager.memoryInfo Landroid/app/ActivityManager$MemoryInfo;
      // 38: astore 7
      // 3a: aload 0
      // 3b: getfield com/discord/resource_usage/DeviceResourceUsageManager.activityManager Landroid/app/ActivityManager;
      // 3e: aload 7
      // 40: invokevirtual android/app/ActivityManager.getMemoryInfo (Landroid/app/ActivityManager$MemoryInfo;)V
      // 43: aload 7
      // 45: getfield android/app/ActivityManager$MemoryInfo.lowMemory Z
      // 48: ifeq 54
      // 4b: ldc2_w 1000
      // 4e: invokestatic java/lang/Thread.sleep (J)V
      // 51: goto 06
      // 54: getstatic com/discord/resource_usage/utils/ProcfsStats.Companion Lcom/discord/resource_usage/utils/ProcfsStats$Companion;
      // 57: invokevirtual com/discord/resource_usage/utils/ProcfsStats$Companion.readStatFile ()Lcom/discord/resource_usage/utils/ProcfsStats;
      // 5a: astore 7
      // 5c: invokestatic java/lang/System.currentTimeMillis ()J
      // 5f: lstore 3
      // 60: aload 6
      // 62: ifnull b4
      // 65: aload 5
      // 67: ifnull b4
      // 6a: aload 7
      // 6c: ifnull b4
      // 6f: lload 3
      // 70: aload 5
      // 72: invokevirtual java/lang/Long.longValue ()J
      // 75: lsub
      // 76: l2d
      // 77: ldc2_w 1000.0
      // 7a: ddiv
      // 7b: dstore 1
      // 7c: aload 0
      // 7d: aload 7
      // 7f: invokevirtual com/discord/resource_usage/utils/ProcfsStats.getTotalTime ()J
      // 82: aload 6
      // 84: invokevirtual com/discord/resource_usage/utils/ProcfsStats.getTotalTime ()J
      // 87: lsub
      // 88: bipush 100
      // 8a: i2l
      // 8b: lmul
      // 8c: l2d
      // 8d: getstatic com/discord/resource_usage/DeviceResourceUsageManager.SC_CLK_TCK J
      // 90: l2d
      // 91: dload 1
      // 92: dmul
      // 93: ddiv
      // 94: aload 0
      // 95: getfield com/discord/resource_usage/DeviceResourceUsageManager.cpuCoreCount I
      // 98: bipush 1
      // 99: invokestatic java/lang/Math.max (II)I
      // 9c: i2d
      // 9d: ddiv
      // 9e: putfield com/discord/resource_usage/DeviceResourceUsageManager.cpuUsagePercent D
      // a1: aload 0
      // a2: aload 7
      // a4: invokevirtual com/discord/resource_usage/utils/ProcfsStats.getRssPages ()J
      // a7: getstatic com/discord/resource_usage/DeviceResourceUsageManager.SC_PAGE_SIZE J
      // aa: lmul
      // ab: sipush 1024
      // ae: i2l
      // af: ldiv
      // b0: l2i
      // b1: putfield com/discord/resource_usage/DeviceResourceUsageManager.memoryRssKB I
      // b4: lload 3
      // b5: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // b8: astore 5
      // ba: ldc2_w 1000
      // bd: invokestatic java/lang/Thread.sleep (J)V
      // c0: aload 7
      // c2: astore 6
      // c4: goto 06
      // c7: astore 5
      // c9: aload 7
      // cb: monitorexit
      // cc: aload 5
      // ce: athrow
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
      // 0c: new g7/a
      // 0f: astore 3
      // 10: aload 3
      // 11: aload 0
      // 12: invokespecial g7/a.<init> (Lcom/discord/resource_usage/DeviceResourceUsageManager;)V
      // 15: aload 0
      // 16: bipush 1
      // 17: bipush 1
      // 18: aconst_null
      // 19: ldc_w "DeviceResourceUsageMonitor"
      // 1c: bipush 2
      // 1d: aload 3
      // 1e: bipush 4
      // 1f: aconst_null
      // 20: invokestatic jm/a.b (ZZLjava/lang/ClassLoader;Ljava/lang/String;ILkotlin/jvm/functions/Function0;ILjava/lang/Object;)Ljava/lang/Thread;
      // 23: putfield com/discord/resource_usage/DeviceResourceUsageManager.thread Ljava/lang/Thread;
      // 26: aload 1
      // 27: monitorexit
      // 28: aload 2
      // 29: ifnull 30
      // 2c: aload 2
      // 2d: invokevirtual java/lang/Thread.interrupt ()V
      // 30: return
      // 31: astore 2
      // 32: aload 1
      // 33: monitorexit
      // 34: aload 2
      // 35: athrow
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
      // 11: aload 1
      // 12: monitorexit
      // 13: aload 2
      // 14: ifnull 1b
      // 17: aload 2
      // 18: invokevirtual java/lang/Thread.interrupt ()V
      // 1b: return
      // 1c: astore 2
      // 1d: aload 1
      // 1e: monitorexit
      // 1f: aload 2
      // 20: athrow
   }

   public companion object {
      private final val SC_CLK_TCK: Long
      private final val SC_PAGE_SIZE: Long
      private final val SC_CPU_CORE_COUNT: Int
      private const val THREAD_SLEEP_MS: Long
   }
}

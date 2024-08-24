package com.discord.crash_reporting

import com.facebook.react.bridge.ReactMarker
import com.facebook.react.bridge.ReactMarkerConstants
import com.facebook.react.bridge.ReactMarker.MarkerListener
import io.sentry.ISpan
import io.sentry.o3
import io.sentry.y0
import java.util.LinkedHashMap
import kotlin.jvm.internal.r

public class PerformanceTracing : MarkerListener {
   private final val ongoingTransactions: MutableMap<TraceTransaction, y0> = new LinkedHashMap()
   private final val ongoingSpans: MutableMap<String, ISpan>
   private final val spanStarts: MutableMap<String, Long>
   private final var lastNativeModuleSetupStart: ISpan?
   private final var lastProcessPackage: ISpan?
   private final var stopped: Boolean
   private final var currentProcessPackage: PackageProcessTimings?
   private final val processPackageTimings: MutableList<PackageProcessTimings>
   private final var startupInitSection: StartupInitSection
   private final val startupRootEventsTree: Map<String, String>
   private final val wildcardEventNames: Set<String>

   private fun checkAndSetInitSection(marker: String) {
      label31: {
         switch (var1.hashCode()) {
            case -1149178597:
               if (var1.equals("NATIVE_MODULE_INITIALIZE")) {
                  var2 = StartupInitSection.NativeModuleInitialization;
                  break label31;
               }
               break;
            case -464136890:
               if (var1.equals("REACT_BRIDGE_LOADING")) {
                  var2 = StartupInitSection.ReactBridgeLoading;
                  break label31;
               }
               break;
            case 291013106:
               if (var1.equals("NATIVE_MODULE_SETUP")) {
                  var2 = StartupInitSection.NativeModuleSetup;
                  break label31;
               }
               break;
            case 1036876780:
               if (var1.equals("GET_REACT_INSTANCE_MANAGER")) {
                  var2 = StartupInitSection.ReactInstanceManager;
                  break label31;
               }
            default:
         }

         var2 = null;
      }

      if (var2 != null) {
         this.startupInitSection = var2;
      }
   }

   private fun getMarker(name: String, tag: String?): com.discord.crash_reporting.PerformanceTracing.TransactionMarker? {
      var var3: PerformanceTracing.TransactionMarker = null;
      if (f.t(var1, "_START", false, 2, null)) {
         var3 = new PerformanceTracing.TransactionMarker(f.r0(var1, "_START"), var2, PerformanceTracing.MarkerEnd.START);
      } else if (f.t(var1, "_END", false, 2, null)) {
         var3 = new PerformanceTracing.TransactionMarker(f.r0(var1, "_END"), var2, PerformanceTracing.MarkerEnd.END);
      }

      return var3;
   }

   private fun getMarkerName(transactionMarker: com.discord.crash_reporting.PerformanceTracing.TransactionMarker): String {
      val var4: java.lang.String;
      if (var1.getTag() != null && !r.c(var1.getName(), "CREATE_REACT_CONTEXT")) {
         val var2: java.lang.String = var1.getName();
         val var3: java.lang.String = var1.getTag();
         val var5: StringBuilder = new StringBuilder();
         var5.append(var2);
         var5.append(" ");
         var5.append(var3);
         var4 = var5.toString();
      } else {
         var4 = var1.getName();
      }

      return var4;
   }

   private fun getParentSpanName(marker: com.discord.crash_reporting.PerformanceTracing.TransactionMarker): String? {
      var var2: java.lang.String = this.startupRootEventsTree.get(this.getMarkerName(var1));
      if (var2 != null) {
         return var2;
      } else if (this.wildcardEventNames.contains(var1.getName())) {
         val var3: java.lang.String = this.startupRootEventsTree.get(var1.getName());
         var2 = var3;
         if (h.Q(this.wildcardEventNames, var3)) {
            val var4: PerformanceTracing.MarkerEnd = var1.getMarkerEnd();
            val var6: StringBuilder = new StringBuilder();
            var6.append(var3);
            var6.append(" ");
            var6.append(var4);
            var2 = var6.toString();
         }

         return var2;
      } else {
         return null;
      }
   }

   private fun startNativeModuleInit() {
      this.startTransaction(TraceTransaction.NativeModuleInit);
   }

   private fun startTransaction(transaction: TraceTransaction) {
      if (!this.ongoingTransactions.containsKey(var1)) {
         val var2: y0 = o3.E(var1.getTransactionName(), var1.getOperation());
         r.g(var2, "startTransaction(transac…e, transaction.operation)");
         this.ongoingTransactions.put(var1, var2);
         this.ongoingSpans.put("root", var2);
         this.spanStarts.put("root", System.currentTimeMillis());
      }
   }

   private fun stopTransaction(transaction: TraceTransaction) {
      val var2: y0 = this.ongoingTransactions.get(var1);
      if (var2 != null) {
         var2.d();
      }

      this.ongoingTransactions.remove(var1);
   }

   public open fun logMarker(marker: ReactMarkerConstants?, tag: String?, instanceKey: Int) {
      val var4: java.lang.String;
      if (var1 != null) {
         var4 = var1.name();
      } else {
         var4 = null;
      }

      if (var4 != null) {
         this.logSpanForTransaction(var4, var2);
      }

      if (f.v(var4, "CONTENT_APPEARED", false, 2, null)) {
         this.stop();
      }
   }

   public fun logSpanForTransaction(marker: com.discord.crash_reporting.PerformanceTracing.TransactionMarker) {
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
      // 000: aload 0
      // 001: monitorenter
      // 002: aload 1
      // 003: ldc_w "marker"
      // 006: invokestatic kotlin/jvm/internal/r.h (Ljava/lang/Object;Ljava/lang/String;)V
      // 009: aload 0
      // 00a: aload 1
      // 00b: invokevirtual com/discord/crash_reporting/PerformanceTracing$TransactionMarker.getName ()Ljava/lang/String;
      // 00e: invokespecial com/discord/crash_reporting/PerformanceTracing.checkAndSetInitSection (Ljava/lang/String;)V
      // 011: aload 0
      // 012: aload 1
      // 013: invokespecial com/discord/crash_reporting/PerformanceTracing.getMarkerName (Lcom/discord/crash_reporting/PerformanceTracing$TransactionMarker;)Ljava/lang/String;
      // 016: astore 6
      // 018: aload 0
      // 019: aload 1
      // 01a: invokespecial com/discord/crash_reporting/PerformanceTracing.getParentSpanName (Lcom/discord/crash_reporting/PerformanceTracing$TransactionMarker;)Ljava/lang/String;
      // 01d: astore 7
      // 01f: aload 1
      // 020: invokevirtual com/discord/crash_reporting/PerformanceTracing$TransactionMarker.getMarkerEnd ()Lcom/discord/crash_reporting/PerformanceTracing$MarkerEnd;
      // 023: getstatic com/discord/crash_reporting/PerformanceTracing$MarkerEnd.START Lcom/discord/crash_reporting/PerformanceTracing$MarkerEnd;
      // 026: if_acmpne 1dd
      // 029: aload 0
      // 02a: getfield com/discord/crash_reporting/PerformanceTracing.startupInitSection Lcom/discord/crash_reporting/StartupInitSection;
      // 02d: getstatic com/discord/crash_reporting/StartupInitSection.NativeModuleSetup Lcom/discord/crash_reporting/StartupInitSection;
      // 030: if_acmpne 05b
      // 033: aload 1
      // 034: invokevirtual com/discord/crash_reporting/PerformanceTracing$TransactionMarker.getName ()Ljava/lang/String;
      // 037: ldc "NATIVE_MODULE_SETUP"
      // 039: invokestatic kotlin/jvm/internal/r.c (Ljava/lang/Object;Ljava/lang/Object;)Z
      // 03c: ifeq 05b
      // 03f: aload 0
      // 040: getfield com/discord/crash_reporting/PerformanceTracing.lastNativeModuleSetupStart Lio/sentry/ISpan;
      // 043: astore 4
      // 045: aload 4
      // 047: ifnull 05b
      // 04a: aload 4
      // 04c: ifnull 056
      // 04f: aload 4
      // 051: invokeinterface io/sentry/ISpan.d ()V 1
      // 056: aload 0
      // 057: aconst_null
      // 058: putfield com/discord/crash_reporting/PerformanceTracing.lastNativeModuleSetupStart Lio/sentry/ISpan;
      // 05b: aload 1
      // 05c: invokevirtual com/discord/crash_reporting/PerformanceTracing$TransactionMarker.getName ()Ljava/lang/String;
      // 05f: ldc "RUN_JS_BUNDLE"
      // 061: invokestatic kotlin/jvm/internal/r.c (Ljava/lang/Object;Ljava/lang/Object;)Z
      // 064: ifeq 083
      // 067: aload 0
      // 068: getfield com/discord/crash_reporting/PerformanceTracing.ongoingSpans Ljava/util/Map;
      // 06b: ldc "PRE_RUN_JS_BUNDLE"
      // 06d: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 072: checkcast io/sentry/ISpan
      // 075: astore 4
      // 077: aload 4
      // 079: ifnull 083
      // 07c: aload 4
      // 07e: invokeinterface io/sentry/ISpan.d ()V 1
      // 083: aload 1
      // 084: invokevirtual com/discord/crash_reporting/PerformanceTracing$TransactionMarker.getName ()Ljava/lang/String;
      // 087: ldc "PROCESS_PACKAGE_MODULE"
      // 089: invokestatic kotlin/jvm/internal/r.c (Ljava/lang/Object;Ljava/lang/Object;)Z
      // 08c: ifeq 098
      // 08f: aload 0
      // 090: getfield com/discord/crash_reporting/PerformanceTracing.lastProcessPackage Lio/sentry/ISpan;
      // 093: astore 4
      // 095: goto 0a8
      // 098: aload 0
      // 099: getfield com/discord/crash_reporting/PerformanceTracing.ongoingSpans Ljava/util/Map;
      // 09c: aload 7
      // 09e: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 0a3: checkcast io/sentry/ISpan
      // 0a6: astore 4
      // 0a8: aload 4
      // 0aa: astore 5
      // 0ac: aload 4
      // 0ae: ifnonnull 133
      // 0b1: bipush 0
      // 0b2: istore 3
      // 0b3: iload 3
      // 0b4: istore 2
      // 0b5: aload 7
      // 0b7: ifnull 0cd
      // 0ba: iload 3
      // 0bb: istore 2
      // 0bc: aload 7
      // 0be: ldc_w "~"
      // 0c1: bipush 0
      // 0c2: bipush 2
      // 0c3: aconst_null
      // 0c4: invokestatic kotlin/text/f.t (Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z
      // 0c7: bipush 1
      // 0c8: if_icmpne 0cd
      // 0cb: bipush 1
      // 0cc: istore 2
      // 0cd: aload 4
      // 0cf: astore 5
      // 0d1: iload 2
      // 0d2: ifeq 133
      // 0d5: aload 0
      // 0d6: getfield com/discord/crash_reporting/PerformanceTracing.startupRootEventsTree Ljava/util/Map;
      // 0d9: aload 7
      // 0db: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 0e0: checkcast java/lang/String
      // 0e3: astore 4
      // 0e5: aload 0
      // 0e6: getfield com/discord/crash_reporting/PerformanceTracing.ongoingSpans Ljava/util/Map;
      // 0e9: aload 4
      // 0eb: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 0f0: checkcast io/sentry/ISpan
      // 0f3: astore 4
      // 0f5: aload 4
      // 0f7: ifnull 130
      // 0fa: aload 4
      // 0fc: aload 6
      // 0fe: invokeinterface io/sentry/ISpan.g (Ljava/lang/String;)Lio/sentry/ISpan; 2
      // 103: astore 5
      // 105: aload 5
      // 107: ifnonnull 10d
      // 10a: goto 130
      // 10d: aload 0
      // 10e: getfield com/discord/crash_reporting/PerformanceTracing.ongoingSpans Ljava/util/Map;
      // 111: aload 7
      // 113: aload 5
      // 115: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 11a: pop
      // 11b: aload 0
      // 11c: getfield com/discord/crash_reporting/PerformanceTracing.spanStarts Ljava/util/Map;
      // 11f: aload 7
      // 121: invokestatic java/lang/System.currentTimeMillis ()J
      // 124: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 127: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 12c: pop
      // 12d: goto 133
      // 130: aload 0
      // 131: monitorexit
      // 132: return
      // 133: aload 5
      // 135: ifnonnull 13b
      // 138: aload 0
      // 139: monitorexit
      // 13a: return
      // 13b: aload 5
      // 13d: aload 6
      // 13f: invokeinterface io/sentry/ISpan.g (Ljava/lang/String;)Lio/sentry/ISpan; 2
      // 144: astore 4
      // 146: aload 4
      // 148: ldc_w "parentSpan.startChild(markerName)"
      // 14b: invokestatic kotlin/jvm/internal/r.g (Ljava/lang/Object;Ljava/lang/String;)V
      // 14e: aload 0
      // 14f: getfield com/discord/crash_reporting/PerformanceTracing.ongoingSpans Ljava/util/Map;
      // 152: aload 6
      // 154: aload 4
      // 156: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 15b: pop
      // 15c: aload 0
      // 15d: getfield com/discord/crash_reporting/PerformanceTracing.spanStarts Ljava/util/Map;
      // 160: aload 6
      // 162: invokestatic java/lang/System.currentTimeMillis ()J
      // 165: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 168: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 16d: pop
      // 16e: aload 1
      // 16f: invokevirtual com/discord/crash_reporting/PerformanceTracing$TransactionMarker.getName ()Ljava/lang/String;
      // 172: ldc "PROCESS_PACKAGE"
      // 174: invokestatic kotlin/jvm/internal/r.c (Ljava/lang/Object;Ljava/lang/Object;)Z
      // 177: ifeq 19c
      // 17a: aload 0
      // 17b: aload 4
      // 17d: putfield com/discord/crash_reporting/PerformanceTracing.lastProcessPackage Lio/sentry/ISpan;
      // 180: new com/discord/crash_reporting/PackageProcessTimings
      // 183: astore 4
      // 185: aload 4
      // 187: invokespecial com/discord/crash_reporting/PackageProcessTimings.<init> ()V
      // 18a: aload 0
      // 18b: aload 4
      // 18d: putfield com/discord/crash_reporting/PerformanceTracing.currentProcessPackage Lcom/discord/crash_reporting/PackageProcessTimings;
      // 190: aload 0
      // 191: getfield com/discord/crash_reporting/PerformanceTracing.processPackageTimings Ljava/util/List;
      // 194: aload 4
      // 196: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 19b: pop
      // 19c: aload 1
      // 19d: invokevirtual com/discord/crash_reporting/PerformanceTracing$TransactionMarker.getName ()Ljava/lang/String;
      // 1a0: ldc "PROCESS_PACKAGE_MODULE"
      // 1a2: invokestatic kotlin/jvm/internal/r.c (Ljava/lang/Object;Ljava/lang/Object;)Z
      // 1a5: ifeq 229
      // 1a8: aload 0
      // 1a9: getfield com/discord/crash_reporting/PerformanceTracing.currentProcessPackage Lcom/discord/crash_reporting/PackageProcessTimings;
      // 1ac: astore 4
      // 1ae: aload 4
      // 1b0: ifnull 229
      // 1b3: aload 4
      // 1b5: invokevirtual com/discord/crash_reporting/PackageProcessTimings.getModules ()Ljava/util/List;
      // 1b8: astore 5
      // 1ba: aload 5
      // 1bc: ifnull 229
      // 1bf: aload 1
      // 1c0: invokevirtual com/discord/crash_reporting/PerformanceTracing$TransactionMarker.getTag ()Ljava/lang/String;
      // 1c3: astore 4
      // 1c5: aload 4
      // 1c7: astore 1
      // 1c8: aload 4
      // 1ca: ifnonnull 1d1
      // 1cd: ldc_w ""
      // 1d0: astore 1
      // 1d1: aload 5
      // 1d3: aload 1
      // 1d4: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 1d9: pop
      // 1da: goto 229
      // 1dd: aload 0
      // 1de: getfield com/discord/crash_reporting/PerformanceTracing.ongoingSpans Ljava/util/Map;
      // 1e1: aload 6
      // 1e3: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 1e8: checkcast io/sentry/ISpan
      // 1eb: astore 4
      // 1ed: aload 4
      // 1ef: ifnull 229
      // 1f2: aload 4
      // 1f4: invokeinterface io/sentry/ISpan.d ()V 1
      // 1f9: aload 0
      // 1fa: getfield com/discord/crash_reporting/PerformanceTracing.ongoingSpans Ljava/util/Map;
      // 1fd: aload 6
      // 1ff: invokeinterface java/util/Map.remove (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 204: pop
      // 205: aload 1
      // 206: invokevirtual com/discord/crash_reporting/PerformanceTracing$TransactionMarker.getName ()Ljava/lang/String;
      // 209: ldc "PROCESS_PACKAGE"
      // 20b: invokestatic kotlin/jvm/internal/r.c (Ljava/lang/Object;Ljava/lang/Object;)Z
      // 20e: ifeq 229
      // 211: aload 0
      // 212: getfield com/discord/crash_reporting/PerformanceTracing.currentProcessPackage Lcom/discord/crash_reporting/PackageProcessTimings;
      // 215: astore 1
      // 216: aload 1
      // 217: ifnonnull 21d
      // 21a: goto 224
      // 21d: aload 1
      // 21e: invokestatic java/lang/System.currentTimeMillis ()J
      // 221: invokevirtual com/discord/crash_reporting/PackageProcessTimings.setEndTime (J)V
      // 224: aload 0
      // 225: aconst_null
      // 226: putfield com/discord/crash_reporting/PerformanceTracing.currentProcessPackage Lcom/discord/crash_reporting/PackageProcessTimings;
      // 229: aload 0
      // 22a: monitorexit
      // 22b: return
      // 22c: astore 1
      // 22d: aload 0
      // 22e: monitorexit
      // 22f: aload 1
      // 230: athrow
   }

   public fun logSpanForTransaction(marker: String, tag: String?) {
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
      // 00: aload 0
      // 01: monitorenter
      // 02: aload 1
      // 03: ldc_w "marker"
      // 06: invokestatic kotlin/jvm/internal/r.h (Ljava/lang/Object;Ljava/lang/String;)V
      // 09: aload 0
      // 0a: aload 1
      // 0b: aload 2
      // 0c: invokespecial com/discord/crash_reporting/PerformanceTracing.getMarker (Ljava/lang/String;Ljava/lang/String;)Lcom/discord/crash_reporting/PerformanceTracing$TransactionMarker;
      // 0f: astore 1
      // 10: aload 1
      // 11: ifnonnull 17
      // 14: aload 0
      // 15: monitorexit
      // 16: return
      // 17: aload 0
      // 18: aload 1
      // 19: invokevirtual com/discord/crash_reporting/PerformanceTracing.logSpanForTransaction (Lcom/discord/crash_reporting/PerformanceTracing$TransactionMarker;)V
      // 1c: aload 0
      // 1d: monitorexit
      // 1e: return
      // 1f: astore 1
      // 20: aload 0
      // 21: monitorexit
      // 22: aload 1
      // 23: athrow
   }

   public fun start() {
      if (this.stopped) {
         ReactMarker.addListener(this);
         this.startNativeModuleInit();
         this.stopped = false;
      }
   }

   public fun stop() {
      if (!this.stopped) {
         this.stopTransaction(TraceTransaction.NativeModuleInit);
         ReactMarker.removeListener(this);
         this.stopped = true;
      }
   }

   public companion object {
      private final var performanceTracingInstance: PerformanceTracing?

      public fun get(): PerformanceTracing {
         if (PerformanceTracing.access$getPerformanceTracingInstance$cp() == null) {
            PerformanceTracing.access$setPerformanceTracingInstance$cp(new PerformanceTracing());
         }

         val var1: PerformanceTracing = PerformanceTracing.access$getPerformanceTracingInstance$cp();
         r.e(var1);
         return var1;
      }
   }

   public enum class MarkerEnd {
      END,
      START      @JvmStatic
      private PerformanceTracing.MarkerEnd[] $VALUES = $values();
   }

   public data class TransactionMarker(name: String, tag: String?, markerEnd: com.discord.crash_reporting.PerformanceTracing.MarkerEnd) {
      public final val markerEnd: com.discord.crash_reporting.PerformanceTracing.MarkerEnd
      public final val name: String
      public final val tag: String?

      init {
         r.h(var1, "name");
         r.h(var3, "markerEnd");
         super();
         this.name = var1;
         this.tag = var2;
         this.markerEnd = var3;
      }

      public operator fun component1(): String {
         return this.name;
      }

      public operator fun component2(): String? {
         return this.tag;
      }

      public operator fun component3(): com.discord.crash_reporting.PerformanceTracing.MarkerEnd {
         return this.markerEnd;
      }

      public fun copy(name: String = var0.name, tag: String? = var0.tag, markerEnd: com.discord.crash_reporting.PerformanceTracing.MarkerEnd = var0.markerEnd): com.discord.crash_reporting.PerformanceTracing.TransactionMarker {
         r.h(var1, "name");
         r.h(var3, "markerEnd");
         return new PerformanceTracing.TransactionMarker(var1, var2, var3);
      }

      public override operator fun equals(other: Any?): Boolean {
         if (this === var1) {
            return true;
         } else if (var1 !is PerformanceTracing.TransactionMarker) {
            return false;
         } else {
            var1 = var1;
            if (!r.c(this.name, var1.name)) {
               return false;
            } else if (!r.c(this.tag, var1.tag)) {
               return false;
            } else {
               return this.markerEnd === var1.markerEnd;
            }
         }
      }

      public override fun hashCode(): Int {
         val var2: Int = this.name.hashCode();
         val var1: Int;
         if (this.tag == null) {
            var1 = 0;
         } else {
            var1 = this.tag.hashCode();
         }

         return (var2 * 31 + var1) * 31 + this.markerEnd.hashCode();
      }

      public override fun toString(): String {
         val var1: java.lang.String = this.name;
         val var4: java.lang.String = this.tag;
         val var3: PerformanceTracing.MarkerEnd = this.markerEnd;
         val var2: StringBuilder = new StringBuilder();
         var2.append("TransactionMarker(name=");
         var2.append(var1);
         var2.append(", tag=");
         var2.append(var4);
         var2.append(", markerEnd=");
         var2.append(var3);
         var2.append(")");
         return var2.toString();
      }
   }
}

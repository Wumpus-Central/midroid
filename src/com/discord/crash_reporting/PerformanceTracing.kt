package com.discord.crash_reporting

import com.facebook.react.bridge.ReactMarker
import com.facebook.react.bridge.ReactMarkerConstants
import com.facebook.react.bridge.ReactMarker.MarkerListener
import io.sentry.ISpan
import io.sentry.n3
import io.sentry.x0
import java.util.LinkedHashMap
import kotlin.enums.EnumEntries
import kotlin.jvm.internal.q

public class PerformanceTracing : MarkerListener {
   private final val ongoingTransactions: MutableMap<TraceTransaction, x0> = new LinkedHashMap()
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
      label30: {
         switch (var1.hashCode()) {
            case -1149178597:
               if (var1.equals("NATIVE_MODULE_INITIALIZE")) {
                  var2 = StartupInitSection.NativeModuleInitialization;
                  break label30;
               }
               break;
            case -464136890:
               if (var1.equals("REACT_BRIDGE_LOADING")) {
                  var2 = StartupInitSection.ReactBridgeLoading;
                  break label30;
               }
               break;
            case 291013106:
               if (var1.equals("NATIVE_MODULE_SETUP")) {
                  var2 = StartupInitSection.NativeModuleSetup;
                  break label30;
               }
               break;
            case 1036876780:
               if (var1.equals("GET_REACT_INSTANCE_MANAGER")) {
                  var2 = StartupInitSection.ReactInstanceManager;
                  break label30;
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
      if (h.t(var1, "_START", false, 2, null)) {
         var3 = new PerformanceTracing.TransactionMarker(h.q0(var1, "_START"), var2, PerformanceTracing.MarkerEnd.START);
      } else if (h.t(var1, "_END", false, 2, null)) {
         var3 = new PerformanceTracing.TransactionMarker(h.q0(var1, "_END"), var2, PerformanceTracing.MarkerEnd.END);
      }

      return var3;
   }

   private fun getMarkerName(transactionMarker: com.discord.crash_reporting.PerformanceTracing.TransactionMarker): String {
      val var4: java.lang.String;
      if (var1.getTag() != null && !q.c(var1.getName(), "CREATE_REACT_CONTEXT")) {
         val var2: java.lang.String = var1.getName();
         val var5: java.lang.String = var1.getTag();
         val var3: StringBuilder = new StringBuilder();
         var3.append(var2);
         var3.append(" ");
         var3.append(var5);
         var4 = var3.toString();
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
         if (i.U(this.wildcardEventNames, var3)) {
            val var6: PerformanceTracing.MarkerEnd = var1.getMarkerEnd();
            val var4: StringBuilder = new StringBuilder();
            var4.append(var3);
            var4.append(" ");
            var4.append(var6);
            var2 = var4.toString();
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
         val var2: x0 = n3.E(var1.getTransactionName(), var1.getOperation());
         q.g(var2, "startTransaction(...)");
         this.ongoingTransactions.put(var1, var2);
         this.ongoingSpans.put("root", var2);
         this.spanStarts.put("root", System.currentTimeMillis());
      }
   }

   private fun stopTransaction(transaction: TraceTransaction) {
      val var2: x0 = this.ongoingTransactions.get(var1);
      if (var2 != null) {
         var2.j();
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

      if (h.v(var4, "CONTENT_APPEARED", false, 2, null)) {
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
      //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.removeExceptionInstructionsEx(FinallyProcessor.java:1064)
      //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.verifyFinallyEx(FinallyProcessor.java:565)
      //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.iterateGraph(FinallyProcessor.java:90)
      //
      // Bytecode:
      // 000: aload 0
      // 001: monitorenter
      // 002: aload 1
      // 003: ldc_w "marker"
      // 006: invokestatic kotlin/jvm/internal/q.h (Ljava/lang/Object;Ljava/lang/String;)V
      // 009: aload 0
      // 00a: aload 1
      // 00b: invokevirtual com/discord/crash_reporting/PerformanceTracing$TransactionMarker.getName ()Ljava/lang/String;
      // 00e: invokespecial com/discord/crash_reporting/PerformanceTracing.checkAndSetInitSection (Ljava/lang/String;)V
      // 011: aload 0
      // 012: aload 1
      // 013: invokespecial com/discord/crash_reporting/PerformanceTracing.getMarkerName (Lcom/discord/crash_reporting/PerformanceTracing$TransactionMarker;)Ljava/lang/String;
      // 016: astore 4
      // 018: aload 0
      // 019: aload 1
      // 01a: invokespecial com/discord/crash_reporting/PerformanceTracing.getParentSpanName (Lcom/discord/crash_reporting/PerformanceTracing$TransactionMarker;)Ljava/lang/String;
      // 01d: astore 5
      // 01f: aload 1
      // 020: invokevirtual com/discord/crash_reporting/PerformanceTracing$TransactionMarker.getMarkerEnd ()Lcom/discord/crash_reporting/PerformanceTracing$MarkerEnd;
      // 023: getstatic com/discord/crash_reporting/PerformanceTracing$MarkerEnd.START Lcom/discord/crash_reporting/PerformanceTracing$MarkerEnd;
      // 026: if_acmpne 1b1
      // 029: aload 0
      // 02a: getfield com/discord/crash_reporting/PerformanceTracing.startupInitSection Lcom/discord/crash_reporting/StartupInitSection;
      // 02d: getstatic com/discord/crash_reporting/StartupInitSection.NativeModuleSetup Lcom/discord/crash_reporting/StartupInitSection;
      // 030: if_acmpne 05e
      // 033: aload 1
      // 034: invokevirtual com/discord/crash_reporting/PerformanceTracing$TransactionMarker.getName ()Ljava/lang/String;
      // 037: ldc "NATIVE_MODULE_SETUP"
      // 039: invokestatic kotlin/jvm/internal/q.c (Ljava/lang/Object;Ljava/lang/Object;)Z
      // 03c: ifeq 05e
      // 03f: aload 0
      // 040: getfield com/discord/crash_reporting/PerformanceTracing.lastNativeModuleSetupStart Lio/sentry/ISpan;
      // 043: astore 2
      // 044: aload 2
      // 045: ifnull 05e
      // 048: aload 2
      // 049: ifnull 059
      // 04c: aload 2
      // 04d: invokeinterface io/sentry/ISpan.j ()V 1
      // 052: goto 059
      // 055: astore 1
      // 056: goto 1fd
      // 059: aload 0
      // 05a: aconst_null
      // 05b: putfield com/discord/crash_reporting/PerformanceTracing.lastNativeModuleSetupStart Lio/sentry/ISpan;
      // 05e: aload 1
      // 05f: invokevirtual com/discord/crash_reporting/PerformanceTracing$TransactionMarker.getName ()Ljava/lang/String;
      // 062: ldc "RUN_JS_BUNDLE"
      // 064: invokestatic kotlin/jvm/internal/q.c (Ljava/lang/Object;Ljava/lang/Object;)Z
      // 067: ifeq 083
      // 06a: aload 0
      // 06b: getfield com/discord/crash_reporting/PerformanceTracing.ongoingSpans Ljava/util/Map;
      // 06e: ldc "PRE_RUN_JS_BUNDLE"
      // 070: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 075: checkcast io/sentry/ISpan
      // 078: astore 2
      // 079: aload 2
      // 07a: ifnull 083
      // 07d: aload 2
      // 07e: invokeinterface io/sentry/ISpan.j ()V 1
      // 083: aload 1
      // 084: invokevirtual com/discord/crash_reporting/PerformanceTracing$TransactionMarker.getName ()Ljava/lang/String;
      // 087: ldc "PROCESS_PACKAGE_MODULE"
      // 089: invokestatic kotlin/jvm/internal/q.c (Ljava/lang/Object;Ljava/lang/Object;)Z
      // 08c: ifeq 097
      // 08f: aload 0
      // 090: getfield com/discord/crash_reporting/PerformanceTracing.lastProcessPackage Lio/sentry/ISpan;
      // 093: astore 2
      // 094: goto 0a6
      // 097: aload 0
      // 098: getfield com/discord/crash_reporting/PerformanceTracing.ongoingSpans Ljava/util/Map;
      // 09b: aload 5
      // 09d: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 0a2: checkcast io/sentry/ISpan
      // 0a5: astore 2
      // 0a6: aload 2
      // 0a7: astore 3
      // 0a8: aload 2
      // 0a9: ifnonnull 11a
      // 0ac: aload 2
      // 0ad: astore 3
      // 0ae: aload 5
      // 0b0: ifnull 11a
      // 0b3: aload 2
      // 0b4: astore 3
      // 0b5: aload 5
      // 0b7: ldc_w "~"
      // 0ba: bipush 0
      // 0bb: bipush 2
      // 0bc: aconst_null
      // 0bd: invokestatic kotlin/text/h.t (Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z
      // 0c0: bipush 1
      // 0c1: if_icmpne 11a
      // 0c4: aload 0
      // 0c5: getfield com/discord/crash_reporting/PerformanceTracing.startupRootEventsTree Ljava/util/Map;
      // 0c8: aload 5
      // 0ca: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 0cf: checkcast java/lang/String
      // 0d2: astore 2
      // 0d3: aload 0
      // 0d4: getfield com/discord/crash_reporting/PerformanceTracing.ongoingSpans Ljava/util/Map;
      // 0d7: aload 2
      // 0d8: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 0dd: checkcast io/sentry/ISpan
      // 0e0: astore 2
      // 0e1: aload 2
      // 0e2: ifnull 117
      // 0e5: aload 2
      // 0e6: aload 4
      // 0e8: invokeinterface io/sentry/ISpan.n (Ljava/lang/String;)Lio/sentry/ISpan; 2
      // 0ed: astore 3
      // 0ee: aload 3
      // 0ef: ifnonnull 0f5
      // 0f2: goto 117
      // 0f5: aload 0
      // 0f6: getfield com/discord/crash_reporting/PerformanceTracing.ongoingSpans Ljava/util/Map;
      // 0f9: aload 5
      // 0fb: aload 3
      // 0fc: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 101: pop
      // 102: aload 0
      // 103: getfield com/discord/crash_reporting/PerformanceTracing.spanStarts Ljava/util/Map;
      // 106: aload 5
      // 108: invokestatic java/lang/System.currentTimeMillis ()J
      // 10b: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 10e: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 113: pop
      // 114: goto 11a
      // 117: aload 0
      // 118: monitorexit
      // 119: return
      // 11a: aload 3
      // 11b: ifnonnull 121
      // 11e: aload 0
      // 11f: monitorexit
      // 120: return
      // 121: aload 3
      // 122: aload 4
      // 124: invokeinterface io/sentry/ISpan.n (Ljava/lang/String;)Lio/sentry/ISpan; 2
      // 129: astore 2
      // 12a: aload 2
      // 12b: ldc_w "startChild(...)"
      // 12e: invokestatic kotlin/jvm/internal/q.g (Ljava/lang/Object;Ljava/lang/String;)V
      // 131: aload 0
      // 132: getfield com/discord/crash_reporting/PerformanceTracing.ongoingSpans Ljava/util/Map;
      // 135: aload 4
      // 137: aload 2
      // 138: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 13d: pop
      // 13e: aload 0
      // 13f: getfield com/discord/crash_reporting/PerformanceTracing.spanStarts Ljava/util/Map;
      // 142: aload 4
      // 144: invokestatic java/lang/System.currentTimeMillis ()J
      // 147: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 14a: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 14f: pop
      // 150: aload 1
      // 151: invokevirtual com/discord/crash_reporting/PerformanceTracing$TransactionMarker.getName ()Ljava/lang/String;
      // 154: ldc "PROCESS_PACKAGE"
      // 156: invokestatic kotlin/jvm/internal/q.c (Ljava/lang/Object;Ljava/lang/Object;)Z
      // 159: ifeq 179
      // 15c: aload 0
      // 15d: aload 2
      // 15e: putfield com/discord/crash_reporting/PerformanceTracing.lastProcessPackage Lio/sentry/ISpan;
      // 161: new com/discord/crash_reporting/PackageProcessTimings
      // 164: astore 2
      // 165: aload 2
      // 166: invokespecial com/discord/crash_reporting/PackageProcessTimings.<init> ()V
      // 169: aload 0
      // 16a: aload 2
      // 16b: putfield com/discord/crash_reporting/PerformanceTracing.currentProcessPackage Lcom/discord/crash_reporting/PackageProcessTimings;
      // 16e: aload 0
      // 16f: getfield com/discord/crash_reporting/PerformanceTracing.processPackageTimings Ljava/util/List;
      // 172: aload 2
      // 173: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 178: pop
      // 179: aload 1
      // 17a: invokevirtual com/discord/crash_reporting/PerformanceTracing$TransactionMarker.getName ()Ljava/lang/String;
      // 17d: ldc "PROCESS_PACKAGE_MODULE"
      // 17f: invokestatic kotlin/jvm/internal/q.c (Ljava/lang/Object;Ljava/lang/Object;)Z
      // 182: ifeq 1fa
      // 185: aload 0
      // 186: getfield com/discord/crash_reporting/PerformanceTracing.currentProcessPackage Lcom/discord/crash_reporting/PackageProcessTimings;
      // 189: astore 2
      // 18a: aload 2
      // 18b: ifnull 1fa
      // 18e: aload 2
      // 18f: invokevirtual com/discord/crash_reporting/PackageProcessTimings.getModules ()Ljava/util/List;
      // 192: astore 3
      // 193: aload 3
      // 194: ifnull 1fa
      // 197: aload 1
      // 198: invokevirtual com/discord/crash_reporting/PerformanceTracing$TransactionMarker.getTag ()Ljava/lang/String;
      // 19b: astore 2
      // 19c: aload 2
      // 19d: astore 1
      // 19e: aload 2
      // 19f: ifnonnull 1a6
      // 1a2: ldc_w ""
      // 1a5: astore 1
      // 1a6: aload 3
      // 1a7: aload 1
      // 1a8: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 1ad: pop
      // 1ae: goto 1fa
      // 1b1: aload 0
      // 1b2: getfield com/discord/crash_reporting/PerformanceTracing.ongoingSpans Ljava/util/Map;
      // 1b5: aload 4
      // 1b7: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 1bc: checkcast io/sentry/ISpan
      // 1bf: astore 2
      // 1c0: aload 2
      // 1c1: ifnull 1fa
      // 1c4: aload 2
      // 1c5: invokeinterface io/sentry/ISpan.j ()V 1
      // 1ca: aload 0
      // 1cb: getfield com/discord/crash_reporting/PerformanceTracing.ongoingSpans Ljava/util/Map;
      // 1ce: aload 4
      // 1d0: invokeinterface java/util/Map.remove (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 1d5: pop
      // 1d6: aload 1
      // 1d7: invokevirtual com/discord/crash_reporting/PerformanceTracing$TransactionMarker.getName ()Ljava/lang/String;
      // 1da: ldc "PROCESS_PACKAGE"
      // 1dc: invokestatic kotlin/jvm/internal/q.c (Ljava/lang/Object;Ljava/lang/Object;)Z
      // 1df: ifeq 1fa
      // 1e2: aload 0
      // 1e3: getfield com/discord/crash_reporting/PerformanceTracing.currentProcessPackage Lcom/discord/crash_reporting/PackageProcessTimings;
      // 1e6: astore 1
      // 1e7: aload 1
      // 1e8: ifnonnull 1ee
      // 1eb: goto 1f5
      // 1ee: aload 1
      // 1ef: invokestatic java/lang/System.currentTimeMillis ()J
      // 1f2: invokevirtual com/discord/crash_reporting/PackageProcessTimings.setEndTime (J)V
      // 1f5: aload 0
      // 1f6: aconst_null
      // 1f7: putfield com/discord/crash_reporting/PerformanceTracing.currentProcessPackage Lcom/discord/crash_reporting/PackageProcessTimings;
      // 1fa: aload 0
      // 1fb: monitorexit
      // 1fc: return
      // 1fd: aload 0
      // 1fe: monitorexit
      // 1ff: aload 1
      // 200: athrow
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
      //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.removeExceptionInstructionsEx(FinallyProcessor.java:1064)
      //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.verifyFinallyEx(FinallyProcessor.java:565)
      //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.iterateGraph(FinallyProcessor.java:90)
      //
      // Bytecode:
      // 00: aload 0
      // 01: monitorenter
      // 02: aload 1
      // 03: ldc_w "marker"
      // 06: invokestatic kotlin/jvm/internal/q.h (Ljava/lang/Object;Ljava/lang/String;)V
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
         q.e(var1);
         return var1;
      }
   }

   public enum class MarkerEnd {
      END,
      START      @JvmStatic
      private EnumEntries $ENTRIES;
      @JvmStatic
      private PerformanceTracing.MarkerEnd[] $VALUES;

      @JvmStatic
      fun {
         val var0: Array<PerformanceTracing.MarkerEnd> = $values();
         $VALUES = var0;
         $ENTRIES = uh.a.a(var0);
      }

      @JvmStatic
      fun getEntries(): EnumEntries {
         return $ENTRIES;
      }
   }

   public data class TransactionMarker(name: String, tag: String?, markerEnd: com.discord.crash_reporting.PerformanceTracing.MarkerEnd) {
      public final val markerEnd: com.discord.crash_reporting.PerformanceTracing.MarkerEnd
      public final val name: String
      public final val tag: String?

      init {
         q.h(var1, "name");
         q.h(var3, "markerEnd");
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
         q.h(var1, "name");
         q.h(var3, "markerEnd");
         return new PerformanceTracing.TransactionMarker(var1, var2, var3);
      }

      public override operator fun equals(other: Any?): Boolean {
         if (this === var1) {
            return true;
         } else if (var1 !is PerformanceTracing.TransactionMarker) {
            return false;
         } else {
            var1 = var1;
            if (!q.c(this.name, var1.name)) {
               return false;
            } else if (!q.c(this.tag, var1.tag)) {
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
         val var4: java.lang.String = this.name;
         val var3: java.lang.String = this.tag;
         val var1: PerformanceTracing.MarkerEnd = this.markerEnd;
         val var2: StringBuilder = new StringBuilder();
         var2.append("TransactionMarker(name=");
         var2.append(var4);
         var2.append(", tag=");
         var2.append(var3);
         var2.append(", markerEnd=");
         var2.append(var1);
         var2.append(")");
         return var2.toString();
      }
   }
}

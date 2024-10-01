package com.discord.crash_reporting.system_logs

import android.content.Context
import android.content.pm.ApplicationInfo
import android.os.Build.VERSION
import java.lang.ref.WeakReference
import java.util.ArrayList
import java.util.Map.Entry
import kotlin.jvm.internal.q

public class DebugPrintableCollection {
   private final val collection: MutableMap<Long, com.discord.crash_reporting.system_logs.DebugPrintableCollection.DebugPrintableRef>
   private final var idCounter: Long = 1L
   private final val sync: Any

   private fun add(ref: DebugPrintable, tag: String? = null): Long {
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
      // 01: getfield com/discord/crash_reporting/system_logs/DebugPrintableCollection.sync Ljava/lang/Object;
      // 04: astore 11
      // 06: aload 11
      // 08: monitorenter
      // 09: aload 0
      // 0a: getfield com/discord/crash_reporting/system_logs/DebugPrintableCollection.idCounter J
      // 0d: lstore 3
      // 0e: aload 0
      // 0f: lload 3
      // 10: lconst_1
      // 11: ladd
      // 12: putfield com/discord/crash_reporting/system_logs/DebugPrintableCollection.idCounter J
      // 15: lconst_0
      // 16: lstore 5
      // 18: lload 3
      // 19: lstore 7
      // 1b: aload 0
      // 1c: getfield com/discord/crash_reporting/system_logs/DebugPrintableCollection.collection Ljava/util/Map;
      // 1f: lload 3
      // 20: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 23: invokeinterface java/util/Map.containsKey (Ljava/lang/Object;)Z 2
      // 28: ifeq 54
      // 2b: aload 0
      // 2c: getfield com/discord/crash_reporting/system_logs/DebugPrintableCollection.idCounter J
      // 2f: lstore 7
      // 31: aload 0
      // 32: lload 7
      // 34: lconst_1
      // 35: ladd
      // 36: putfield com/discord/crash_reporting/system_logs/DebugPrintableCollection.idCounter J
      // 39: lload 5
      // 3b: lconst_1
      // 3c: ladd
      // 3d: lstore 9
      // 3f: lload 7
      // 41: lstore 3
      // 42: lload 9
      // 44: lstore 5
      // 46: lload 9
      // 48: lconst_0
      // 49: lcmp
      // 4a: ifge 18
      // 4d: goto 54
      // 50: astore 1
      // 51: goto 8b
      // 54: aload 0
      // 55: getfield com/discord/crash_reporting/system_logs/DebugPrintableCollection.collection Ljava/util/Map;
      // 58: astore 14
      // 5a: new com/discord/crash_reporting/system_logs/DebugPrintableCollection$DebugPrintableRef
      // 5d: astore 12
      // 5f: new java/lang/ref/WeakReference
      // 62: astore 13
      // 64: aload 13
      // 66: aload 1
      // 67: invokespecial java/lang/ref/WeakReference.<init> (Ljava/lang/Object;)V
      // 6a: aload 12
      // 6c: aload 2
      // 6d: aload 13
      // 6f: invokespecial com/discord/crash_reporting/system_logs/DebugPrintableCollection$DebugPrintableRef.<init> (Ljava/lang/String;Ljava/lang/ref/WeakReference;)V
      // 72: aload 14
      // 74: lload 7
      // 76: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 79: aload 12
      // 7b: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 80: pop
      // 81: aload 0
      // 82: invokespecial com/discord/crash_reporting/system_logs/DebugPrintableCollection.removeDeadReferencesLocked ()V
      // 85: aload 11
      // 87: monitorexit
      // 88: lload 7
      // 8a: lreturn
      // 8b: aload 11
      // 8d: monitorexit
      // 8e: aload 1
      // 8f: athrow
   }

   private fun addSystemEntry(context: Context, dp: DebugPrintBuilder) {
      var2.appendLine("System:");
      var2.appendKeyValue("libdiscordVersion", Companion.libdiscordVersion(var1));
      var2.appendKeyValue("SDK_INT", VERSION.SDK_INT);
      val var3: HistoricalProcessExitReason.Reason = HistoricalProcessExitReason.INSTANCE.lastReason(var1);
      if (var3 != null) {
         var2.appendKeyValue("exit_reason", var3.getReason());
         val var4: java.lang.String = var3.getDescription();
         if (var4 != null) {
            var2.appendKeyValue("exit_description", var4);
         }
      }

      DebugPrintBuilder.appendLine$default(var2, null, 1, null);
   }

   private fun removeDeadReferencesLocked() {
      val var3: ArrayList = new ArrayList();

      for (Entry var5 : this.collection.entrySet()) {
         val var1: Long = (var5.getKey() as java.lang.Number).longValue();
         if ((var5.getValue() as DebugPrintableCollection.DebugPrintableRef).getReference().get() == null) {
            var3.add(var1);
         }
      }

      val var7: java.util.Iterator = var3.iterator();

      while (var7.hasNext()) {
         this.collection.remove((var7.next() as java.lang.Number).longValue());
      }
   }

   public fun debugPrint(context: Context, sb: StringBuilder) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.createStatement(DomHelper.java:27)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:157)
      //
      // Bytecode:
      // 000: aload 1
      // 001: ldc "context"
      // 003: invokestatic kotlin/jvm/internal/q.h (Ljava/lang/Object;Ljava/lang/String;)V
      // 006: aload 2
      // 007: ldc "sb"
      // 009: invokestatic kotlin/jvm/internal/q.h (Ljava/lang/Object;Ljava/lang/String;)V
      // 00c: new com/discord/crash_reporting/system_logs/DebugPrintBuilder
      // 00f: dup
      // 010: aload 2
      // 011: invokespecial com/discord/crash_reporting/system_logs/DebugPrintBuilder.<init> (Ljava/lang/StringBuilder;)V
      // 014: astore 6
      // 016: aload 0
      // 017: getfield com/discord/crash_reporting/system_logs/DebugPrintableCollection.sync Ljava/lang/Object;
      // 01a: astore 5
      // 01c: aload 5
      // 01e: monitorenter
      // 01f: aload 0
      // 020: aload 1
      // 021: aload 6
      // 023: invokespecial com/discord/crash_reporting/system_logs/DebugPrintableCollection.addSystemEntry (Landroid/content/Context;Lcom/discord/crash_reporting/system_logs/DebugPrintBuilder;)V
      // 026: aload 0
      // 027: getfield com/discord/crash_reporting/system_logs/DebugPrintableCollection.collection Ljava/util/Map;
      // 02a: invokeinterface java/util/Map.entrySet ()Ljava/util/Set; 1
      // 02f: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 034: astore 1
      // 035: aload 1
      // 036: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 03b: ifeq 11b
      // 03e: aload 1
      // 03f: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 044: checkcast java/util/Map$Entry
      // 047: astore 7
      // 049: aload 7
      // 04b: invokeinterface java/util/Map$Entry.getKey ()Ljava/lang/Object; 1
      // 050: checkcast java/lang/Number
      // 053: invokevirtual java/lang/Number.longValue ()J
      // 056: lstore 3
      // 057: aload 7
      // 059: invokeinterface java/util/Map$Entry.getValue ()Ljava/lang/Object; 1
      // 05e: checkcast com/discord/crash_reporting/system_logs/DebugPrintableCollection$DebugPrintableRef
      // 061: astore 7
      // 063: aload 7
      // 065: invokevirtual com/discord/crash_reporting/system_logs/DebugPrintableCollection$DebugPrintableRef.getReference ()Ljava/lang/ref/WeakReference;
      // 068: invokevirtual java/lang/ref/Reference.get ()Ljava/lang/Object;
      // 06b: checkcast com/discord/crash_reporting/system_logs/DebugPrintable
      // 06e: astore 8
      // 070: aload 8
      // 072: ifnonnull 078
      // 075: goto 035
      // 078: aload 8
      // 07a: invokestatic kotlin/jvm/internal/q.e (Ljava/lang/Object;)V
      // 07d: aload 2
      // 07e: lload 3
      // 07f: invokevirtual java/lang/StringBuilder.append (J)Ljava/lang/StringBuilder;
      // 082: pop
      // 083: aload 7
      // 085: invokevirtual com/discord/crash_reporting/system_logs/DebugPrintableCollection$DebugPrintableRef.getTag ()Ljava/lang/String;
      // 088: ifnull 0a3
      // 08b: aload 2
      // 08c: bipush 32
      // 08e: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 091: pop
      // 092: aload 2
      // 093: aload 7
      // 095: invokevirtual com/discord/crash_reporting/system_logs/DebugPrintableCollection$DebugPrintableRef.getTag ()Ljava/lang/String;
      // 098: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 09b: pop
      // 09c: goto 0a3
      // 09f: astore 1
      // 0a0: goto 123
      // 0a3: aload 2
      // 0a4: ldc ":"
      // 0a6: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0a9: pop
      // 0aa: aload 2
      // 0ab: ldc "append(...)"
      // 0ad: invokestatic kotlin/jvm/internal/q.g (Ljava/lang/Object;Ljava/lang/String;)V
      // 0b0: aload 2
      // 0b1: bipush 10
      // 0b3: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 0b6: pop
      // 0b7: aload 2
      // 0b8: ldc "append(...)"
      // 0ba: invokestatic kotlin/jvm/internal/q.g (Ljava/lang/Object;Ljava/lang/String;)V
      // 0bd: aload 8
      // 0bf: aload 6
      // 0c1: invokeinterface com/discord/crash_reporting/system_logs/DebugPrintable.debugPrint (Lcom/discord/crash_reporting/system_logs/DebugPrintBuilder;)V 2
      // 0c6: goto 0f0
      // 0c9: astore 7
      // 0cb: new java/lang/StringBuilder
      // 0ce: astore 8
      // 0d0: aload 8
      // 0d2: invokespecial java/lang/StringBuilder.<init> ()V
      // 0d5: aload 8
      // 0d7: ldc_w "Exception: "
      // 0da: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0dd: pop
      // 0de: aload 8
      // 0e0: aload 7
      // 0e2: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 0e5: pop
      // 0e6: aload 2
      // 0e7: aload 8
      // 0e9: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0ec: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0ef: pop
      // 0f0: aload 2
      // 0f1: bipush 10
      // 0f3: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 0f6: pop
      // 0f7: aload 2
      // 0f8: ldc "append(...)"
      // 0fa: invokestatic kotlin/jvm/internal/q.g (Ljava/lang/Object;Ljava/lang/String;)V
      // 0fd: aload 2
      // 0fe: invokevirtual java/lang/StringBuilder.length ()I
      // 101: ldc 524288
      // 103: if_icmple 035
      // 106: aload 2
      // 107: ldc 524288
      // 109: aload 2
      // 10a: invokevirtual java/lang/StringBuilder.length ()I
      // 10d: bipush 1
      // 10e: isub
      // 10f: invokevirtual java/lang/StringBuilder.delete (II)Ljava/lang/StringBuilder;
      // 112: pop
      // 113: aload 2
      // 114: ldc_w " {truncated}"
      // 117: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 11a: pop
      // 11b: getstatic kotlin/Unit.a Lkotlin/Unit;
      // 11e: astore 1
      // 11f: aload 5
      // 121: monitorexit
      // 122: return
      // 123: aload 5
      // 125: monitorexit
      // 126: aload 1
      // 127: athrow
   }

   public companion object {
      private const val MAX_DEBUG_PRINTABLE_STRING_LENGTH: Int

      public fun libdiscordVersion(context: Context): String {
         q.h(var1, "context");
         val var3: ApplicationInfo;
         if (VERSION.SDK_INT >= 33) {
            var3 = b.a(var1.getPackageManager(), var1.getPackageName(), a.a(128L));
         } else {
            var3 = var1.getPackageManager().getApplicationInfo(var1.getPackageName(), 128);
         }

         if (var3.metaData != null) {
            val var2: java.lang.String = var3.metaData.getString("libdiscord_version");
            if (var2 != null) {
               return var2;
            }
         }

         return "Unknown libdiscord version";
      }
   }

   private data class DebugPrintableRef(tag: String?, reference: WeakReference<DebugPrintable>) {
      public final val reference: WeakReference<DebugPrintable>
      public final val tag: String?

      init {
         q.h(var2, "reference");
         super();
         this.tag = var1;
         this.reference = var2;
      }

      public operator fun component1(): String? {
         return this.tag;
      }

      public operator fun component2(): WeakReference<DebugPrintable> {
         return this.reference;
      }

      public fun copy(tag: String? = var0.tag, reference: WeakReference<DebugPrintable> = var0.reference): com.discord.crash_reporting.system_logs.DebugPrintableCollection.DebugPrintableRef {
         q.h(var2, "reference");
         return new DebugPrintableCollection.DebugPrintableRef(var1, var2);
      }

      public override operator fun equals(other: Any?): Boolean {
         if (this === var1) {
            return true;
         } else if (var1 !is DebugPrintableCollection.DebugPrintableRef) {
            return false;
         } else {
            var1 = var1;
            if (!q.c(this.tag, var1.tag)) {
               return false;
            } else {
               return q.c(this.reference, var1.reference);
            }
         }
      }

      public override fun hashCode(): Int {
         val var1: Int;
         if (this.tag == null) {
            var1 = 0;
         } else {
            var1 = this.tag.hashCode();
         }

         return var1 * 31 + this.reference.hashCode();
      }

      public override fun toString(): String {
         val var1: java.lang.String = this.tag;
         val var2: WeakReference = this.reference;
         val var3: StringBuilder = new StringBuilder();
         var3.append("DebugPrintableRef(tag=");
         var3.append(var1);
         var3.append(", reference=");
         var3.append(var2);
         var3.append(")");
         return var3.toString();
      }
   }
}

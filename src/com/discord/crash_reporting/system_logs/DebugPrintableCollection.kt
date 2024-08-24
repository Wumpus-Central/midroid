package com.discord.crash_reporting.system_logs

import android.content.Context
import android.content.pm.ApplicationInfo
import android.content.pm.PackageManager.ApplicationInfoFlags
import android.os.Build.VERSION
import java.lang.ref.WeakReference
import java.util.ArrayList
import java.util.Map.Entry
import kotlin.jvm.internal.r

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
      //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.removeExceptionInstructionsEx(FinallyProcessor.java:1054)
      //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.verifyFinallyEx(FinallyProcessor.java:555)
      //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.iterateGraph(FinallyProcessor.java:91)
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
      // 28: ifeq 4d
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
      // 4d: aload 0
      // 4e: getfield com/discord/crash_reporting/system_logs/DebugPrintableCollection.collection Ljava/util/Map;
      // 51: astore 13
      // 53: new com/discord/crash_reporting/system_logs/DebugPrintableCollection$DebugPrintableRef
      // 56: astore 14
      // 58: new java/lang/ref/WeakReference
      // 5b: astore 12
      // 5d: aload 12
      // 5f: aload 1
      // 60: invokespecial java/lang/ref/WeakReference.<init> (Ljava/lang/Object;)V
      // 63: aload 14
      // 65: aload 2
      // 66: aload 12
      // 68: invokespecial com/discord/crash_reporting/system_logs/DebugPrintableCollection$DebugPrintableRef.<init> (Ljava/lang/String;Ljava/lang/ref/WeakReference;)V
      // 6b: aload 13
      // 6d: lload 7
      // 6f: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 72: aload 14
      // 74: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 79: pop
      // 7a: aload 0
      // 7b: invokespecial com/discord/crash_reporting/system_logs/DebugPrintableCollection.removeDeadReferencesLocked ()V
      // 7e: aload 11
      // 80: monitorexit
      // 81: lload 7
      // 83: lreturn
      // 84: astore 1
      // 85: aload 11
      // 87: monitorexit
      // 88: aload 1
      // 89: athrow
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
      val var5: ArrayList = new ArrayList();

      for (Entry var4 : this.collection.entrySet()) {
         val var1: Long = (var4.getKey() as java.lang.Number).longValue();
         if ((var4.getValue() as DebugPrintableCollection.DebugPrintableRef).getReference().get() == null) {
            var5.add(var1);
         }
      }

      val var7: java.util.Iterator = var5.iterator();

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
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:156)
      //
      // Bytecode:
      // 000: aload 1
      // 001: ldc "context"
      // 003: invokestatic kotlin/jvm/internal/r.h (Ljava/lang/Object;Ljava/lang/String;)V
      // 006: aload 2
      // 007: ldc "sb"
      // 009: invokestatic kotlin/jvm/internal/r.h (Ljava/lang/Object;Ljava/lang/String;)V
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
      // 03b: ifeq 118
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
      // 061: astore 8
      // 063: aload 8
      // 065: invokevirtual com/discord/crash_reporting/system_logs/DebugPrintableCollection$DebugPrintableRef.getReference ()Ljava/lang/ref/WeakReference;
      // 068: invokevirtual java/lang/ref/Reference.get ()Ljava/lang/Object;
      // 06b: checkcast com/discord/crash_reporting/system_logs/DebugPrintable
      // 06e: astore 7
      // 070: aload 7
      // 072: ifnonnull 078
      // 075: goto 035
      // 078: aload 7
      // 07a: ldc "printableRef.reference.get() ?: continue"
      // 07c: invokestatic kotlin/jvm/internal/r.g (Ljava/lang/Object;Ljava/lang/String;)V
      // 07f: aload 2
      // 080: lload 3
      // 081: invokevirtual java/lang/StringBuilder.append (J)Ljava/lang/StringBuilder;
      // 084: pop
      // 085: aload 8
      // 087: invokevirtual com/discord/crash_reporting/system_logs/DebugPrintableCollection$DebugPrintableRef.getTag ()Ljava/lang/String;
      // 08a: ifnull 09e
      // 08d: aload 2
      // 08e: bipush 32
      // 090: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 093: pop
      // 094: aload 2
      // 095: aload 8
      // 097: invokevirtual com/discord/crash_reporting/system_logs/DebugPrintableCollection$DebugPrintableRef.getTag ()Ljava/lang/String;
      // 09a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 09d: pop
      // 09e: aload 2
      // 09f: ldc ":"
      // 0a1: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0a4: pop
      // 0a5: aload 2
      // 0a6: ldc "append(value)"
      // 0a8: invokestatic kotlin/jvm/internal/r.g (Ljava/lang/Object;Ljava/lang/String;)V
      // 0ab: aload 2
      // 0ac: bipush 10
      // 0ae: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 0b1: pop
      // 0b2: aload 2
      // 0b3: ldc_w "append('\\n')"
      // 0b6: invokestatic kotlin/jvm/internal/r.g (Ljava/lang/Object;Ljava/lang/String;)V
      // 0b9: aload 7
      // 0bb: aload 6
      // 0bd: invokeinterface com/discord/crash_reporting/system_logs/DebugPrintable.debugPrint (Lcom/discord/crash_reporting/system_logs/DebugPrintBuilder;)V 2
      // 0c2: goto 0ec
      // 0c5: astore 8
      // 0c7: new java/lang/StringBuilder
      // 0ca: astore 7
      // 0cc: aload 7
      // 0ce: invokespecial java/lang/StringBuilder.<init> ()V
      // 0d1: aload 7
      // 0d3: ldc_w "Exception: "
      // 0d6: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0d9: pop
      // 0da: aload 7
      // 0dc: aload 8
      // 0de: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 0e1: pop
      // 0e2: aload 2
      // 0e3: aload 7
      // 0e5: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0e8: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0eb: pop
      // 0ec: aload 2
      // 0ed: bipush 10
      // 0ef: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 0f2: pop
      // 0f3: aload 2
      // 0f4: ldc_w "append('\\n')"
      // 0f7: invokestatic kotlin/jvm/internal/r.g (Ljava/lang/Object;Ljava/lang/String;)V
      // 0fa: aload 2
      // 0fb: invokevirtual java/lang/StringBuilder.length ()I
      // 0fe: ldc 524288
      // 100: if_icmple 035
      // 103: aload 2
      // 104: ldc 524288
      // 106: aload 2
      // 107: invokevirtual java/lang/StringBuilder.length ()I
      // 10a: bipush 1
      // 10b: isub
      // 10c: invokevirtual java/lang/StringBuilder.delete (II)Ljava/lang/StringBuilder;
      // 10f: pop
      // 110: aload 2
      // 111: ldc_w " {truncated}"
      // 114: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 117: pop
      // 118: getstatic kotlin/Unit.a Lkotlin/Unit;
      // 11b: astore 1
      // 11c: aload 5
      // 11e: monitorexit
      // 11f: return
      // 120: astore 1
      // 121: aload 5
      // 123: monitorexit
      // 124: aload 1
      // 125: athrow
   }

   public companion object {
      private const val MAX_DEBUG_PRINTABLE_STRING_LENGTH: Int

      public fun libdiscordVersion(context: Context): String {
         r.h(var1, "context");
         val var3: ApplicationInfo;
         if (VERSION.SDK_INT >= 33) {
            var3 = var1.getPackageManager().getApplicationInfo(var1.getPackageName(), ApplicationInfoFlags.of(128L));
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
         r.h(var2, "reference");
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
         r.h(var2, "reference");
         return new DebugPrintableCollection.DebugPrintableRef(var1, var2);
      }

      public override operator fun equals(other: Any?): Boolean {
         if (this === var1) {
            return true;
         } else if (var1 !is DebugPrintableCollection.DebugPrintableRef) {
            return false;
         } else {
            var1 = var1;
            if (!r.c(this.tag, var1.tag)) {
               return false;
            } else {
               return r.c(this.reference, var1.reference);
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
         val var3: java.lang.String = this.tag;
         val var2: WeakReference = this.reference;
         val var1: StringBuilder = new StringBuilder();
         var1.append("DebugPrintableRef(tag=");
         var1.append(var3);
         var1.append(", reference=");
         var1.append(var2);
         var1.append(")");
         return var1.toString();
      }
   }
}

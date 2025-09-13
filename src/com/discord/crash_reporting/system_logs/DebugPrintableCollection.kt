package com.discord.crash_reporting.system_logs

import android.content.Context
import android.content.pm.ApplicationInfo
import android.os.Build.VERSION
import java.lang.ref.WeakReference
import java.util.ArrayList
import java.util.Map.Entry

public class DebugPrintableCollection {
   private final var idCounter: Long = 1L
   private final val collection: MutableMap<Long, com.discord.crash_reporting.system_logs.DebugPrintableCollection.DebugPrintableRef>
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
      val var5: ArrayList = new ArrayList();

      for (Entry var3 : this.collection.entrySet()) {
         val var1: Long = (var3.getKey() as java.lang.Number).longValue();
         if ((var3.getValue() as DebugPrintableCollection.DebugPrintableRef).getReference().get() == null) {
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
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:157)
      //
      // Bytecode:
      // 000: aload 1
      // 001: ldc "context"
      // 003: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
      // 006: aload 2
      // 007: ldc "sb"
      // 009: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
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
      // 03b: ifeq 116
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
      // 078: aload 2
      // 079: lload 3
      // 07a: invokevirtual java/lang/StringBuilder.append (J)Ljava/lang/StringBuilder;
      // 07d: pop
      // 07e: aload 7
      // 080: invokevirtual com/discord/crash_reporting/system_logs/DebugPrintableCollection$DebugPrintableRef.getTag ()Ljava/lang/String;
      // 083: ifnull 09e
      // 086: aload 2
      // 087: bipush 32
      // 089: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 08c: pop
      // 08d: aload 2
      // 08e: aload 7
      // 090: invokevirtual com/discord/crash_reporting/system_logs/DebugPrintableCollection$DebugPrintableRef.getTag ()Ljava/lang/String;
      // 093: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 096: pop
      // 097: goto 09e
      // 09a: astore 1
      // 09b: goto 11e
      // 09e: aload 2
      // 09f: ldc ":"
      // 0a1: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0a4: pop
      // 0a5: aload 2
      // 0a6: ldc "append(...)"
      // 0a8: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 0ab: aload 2
      // 0ac: bipush 10
      // 0ae: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 0b1: pop
      // 0b2: aload 2
      // 0b3: ldc "append(...)"
      // 0b5: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 0b8: aload 8
      // 0ba: aload 6
      // 0bc: invokeinterface com/discord/crash_reporting/system_logs/DebugPrintable.debugPrint (Lcom/discord/crash_reporting/system_logs/DebugPrintBuilder;)V 2
      // 0c1: goto 0eb
      // 0c4: astore 8
      // 0c6: new java/lang/StringBuilder
      // 0c9: astore 7
      // 0cb: aload 7
      // 0cd: invokespecial java/lang/StringBuilder.<init> ()V
      // 0d0: aload 7
      // 0d2: ldc_w "Exception: "
      // 0d5: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0d8: pop
      // 0d9: aload 7
      // 0db: aload 8
      // 0dd: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 0e0: pop
      // 0e1: aload 2
      // 0e2: aload 7
      // 0e4: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0e7: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0ea: pop
      // 0eb: aload 2
      // 0ec: bipush 10
      // 0ee: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 0f1: pop
      // 0f2: aload 2
      // 0f3: ldc "append(...)"
      // 0f5: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 0f8: aload 2
      // 0f9: invokevirtual java/lang/StringBuilder.length ()I
      // 0fc: ldc 524288
      // 0fe: if_icmple 035
      // 101: aload 2
      // 102: ldc 524288
      // 104: aload 2
      // 105: invokevirtual java/lang/StringBuilder.length ()I
      // 108: bipush 1
      // 109: isub
      // 10a: invokevirtual java/lang/StringBuilder.delete (II)Ljava/lang/StringBuilder;
      // 10d: pop
      // 10e: aload 2
      // 10f: ldc_w " {truncated}"
      // 112: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 115: pop
      // 116: getstatic kotlin/Unit.a Lkotlin/Unit;
      // 119: astore 1
      // 11a: aload 5
      // 11c: monitorexit
      // 11d: return
      // 11e: aload 5
      // 120: monitorexit
      // 121: aload 1
      // 122: athrow
   }

   public companion object {
      private const val MAX_DEBUG_PRINTABLE_STRING_LENGTH: Int

      public fun libdiscordVersion(context: Context): String {
         val var2: ApplicationInfo;
         if (VERSION.SDK_INT >= 33) {
            var2 = b.a(var1.getPackageManager(), var1.getPackageName(), a.a(128L));
         } else {
            var2 = var1.getPackageManager().getApplicationInfo(var1.getPackageName(), 128);
         }

         if (var2.metaData != null) {
            val var4: java.lang.String = var2.metaData.getString("libdiscord_version");
            if (var4 != null) {
               return var4;
            }
         }

         return "Unknown libdiscord version";
      }
   }

   private data class DebugPrintableRef(tag: String?, reference: WeakReference<DebugPrintable>) {
      public final val tag: String?
      public final val reference: WeakReference<DebugPrintable>

      init {
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
         return new DebugPrintableCollection.DebugPrintableRef(var1, var2);
      }

      public override operator fun equals(other: Any?): Boolean {
         if (this === var1) {
            return true;
         } else if (var1 !is DebugPrintableCollection.DebugPrintableRef) {
            return false;
         } else {
            var1 = var1;
            if (!(this.tag == var1.tag)) {
               return false;
            } else {
               return this.reference == var1.reference;
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
         val var3: WeakReference = this.reference;
         val var2: StringBuilder = new StringBuilder();
         var2.append("DebugPrintableRef(tag=");
         var2.append(var1);
         var2.append(", reference=");
         var2.append(var3);
         var2.append(")");
         return var2.toString();
      }
   }
}

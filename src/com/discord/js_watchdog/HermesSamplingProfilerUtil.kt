package com.discord.js_watchdog

import java.io.File
import java.io.FileInputStream
import oh.b
import oh.c

public object HermesSamplingProfilerUtil {
   private fun readFile(file: File): String {
      label18: {
         val var10: FileInputStream = new FileInputStream(var1);

         var var2: ByteArray;
         try {
            var2 = b.c(var10);
         } catch (var5: java.lang.Throwable) {
            val var3: java.lang.Throwable = var5;

            try {
               throw var3;
            } catch (var4: java.lang.Throwable) {
               c.a(var10, var5);
            }
         }

         c.a(var10, null);
         return h.r(var2);
      }
   }

   public fun findSampleTrace(cacheDir: File): String? {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.createStatement(DomHelper.java:27)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:157)
      //
      // Bytecode:
      // 000: aload 1
      // 001: ldc "cacheDir"
      // 003: invokestatic kotlin/jvm/internal/q.h (Ljava/lang/Object;Ljava/lang/String;)V
      // 006: aconst_null
      // 007: astore 3
      // 008: ldc "sampling-profiler-trace"
      // 00a: ldc ".cpuprofile"
      // 00c: aload 1
      // 00d: invokestatic java/io/File.createTempFile (Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Ljava/io/File;
      // 010: astore 4
      // 012: aload 4
      // 014: astore 1
      // 015: invokestatic com/facebook/hermes/instrumentation/HermesSamplingProfiler.enable ()V
      // 018: aload 4
      // 01a: astore 1
      // 01b: invokestatic com/facebook/hermes/instrumentation/HermesSamplingProfiler.disable ()V
      // 01e: aload 4
      // 020: astore 1
      // 021: aload 4
      // 023: invokevirtual java/io/File.getPath ()Ljava/lang/String;
      // 026: invokestatic com/facebook/hermes/instrumentation/HermesSamplingProfiler.dumpSampledTraceToFile (Ljava/lang/String;)V
      // 029: aload 4
      // 02b: astore 1
      // 02c: aload 0
      // 02d: aload 4
      // 02f: invokespecial com/discord/js_watchdog/HermesSamplingProfilerUtil.readFile (Ljava/io/File;)Ljava/lang/String;
      // 032: astore 3
      // 033: aload 4
      // 035: astore 1
      // 036: getstatic kotlinx/serialization/json/Json.d Lkotlinx/serialization/json/Json$a;
      // 039: aload 3
      // 03a: invokevirtual kotlinx/serialization/json/Json.g (Ljava/lang/String;)Lkotlinx/serialization/json/JsonElement;
      // 03d: astore 6
      // 03f: aload 4
      // 041: astore 1
      // 042: aload 6
      // 044: invokestatic zk/g.o (Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonObject;
      // 047: ldc "samples"
      // 049: invokevirtual kotlinx/serialization/json/JsonObject.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 04c: checkcast kotlinx/serialization/json/JsonElement
      // 04f: astore 3
      // 050: aload 3
      // 051: ifnull 071
      // 054: aload 4
      // 056: astore 1
      // 057: aload 3
      // 058: invokestatic zk/g.n (Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonArray;
      // 05b: astore 3
      // 05c: goto 073
      // 05f: astore 4
      // 061: aload 1
      // 062: astore 3
      // 063: aload 4
      // 065: astore 1
      // 066: goto 2e9
      // 069: astore 5
      // 06b: aload 4
      // 06d: astore 3
      // 06e: goto 2c9
      // 071: aconst_null
      // 072: astore 3
      // 073: aload 3
      // 074: ifnull 2b0
      // 077: aload 4
      // 079: astore 1
      // 07a: aload 3
      // 07b: invokeinterface java/util/Collection.isEmpty ()Z 1
      // 080: istore 2
      // 081: iload 2
      // 082: ifeq 088
      // 085: goto 2b0
      // 088: getstatic dh/r.k Ldh/r$a;
      // 08b: astore 1
      // 08c: aload 3
      // 08d: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 092: astore 5
      // 094: aload 5
      // 096: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 09b: ifeq 0e7
      // 09e: aload 5
      // 0a0: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0a5: checkcast kotlinx/serialization/json/JsonElement
      // 0a8: astore 1
      // 0a9: aload 1
      // 0aa: invokestatic zk/g.o (Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonObject;
      // 0ad: ldc "sf"
      // 0af: invokevirtual kotlinx/serialization/json/JsonObject.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 0b2: checkcast kotlinx/serialization/json/JsonElement
      // 0b5: astore 3
      // 0b6: aload 3
      // 0b7: ifnull 0dc
      // 0ba: aload 3
      // 0bb: invokestatic zk/g.p (Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonPrimitive;
      // 0be: astore 3
      // 0bf: aload 3
      // 0c0: ifnull 0dc
      // 0c3: aload 3
      // 0c4: invokestatic zk/g.m (Lkotlinx/serialization/json/JsonPrimitive;)Ljava/lang/Integer;
      // 0c7: astore 3
      // 0c8: aload 3
      // 0c9: ifnull 0dc
      // 0cc: aload 3
      // 0cd: invokevirtual java/lang/Integer.intValue ()I
      // 0d0: bipush 1
      // 0d1: if_icmple 0dc
      // 0d4: goto 0de
      // 0d7: astore 5
      // 0d9: goto 101
      // 0dc: aconst_null
      // 0dd: astore 1
      // 0de: aload 1
      // 0df: astore 3
      // 0e0: aload 1
      // 0e1: ifnonnull 0e9
      // 0e4: goto 094
      // 0e7: aconst_null
      // 0e8: astore 3
      // 0e9: aload 3
      // 0ea: ifnull 0f5
      // 0ed: aload 3
      // 0ee: invokestatic dh/r.b (Ljava/lang/Object;)Ljava/lang/Object;
      // 0f1: astore 3
      // 0f2: goto 114
      // 0f5: new java/util/NoSuchElementException
      // 0f8: astore 1
      // 0f9: aload 1
      // 0fa: ldc "No element of the collection was transformed to a non-null value."
      // 0fc: invokespecial java/util/NoSuchElementException.<init> (Ljava/lang/String;)V
      // 0ff: aload 1
      // 100: athrow
      // 101: aload 4
      // 103: astore 1
      // 104: getstatic dh/r.k Ldh/r$a;
      // 107: astore 3
      // 108: aload 4
      // 10a: astore 1
      // 10b: aload 5
      // 10d: invokestatic dh/s.a (Ljava/lang/Throwable;)Ljava/lang/Object;
      // 110: invokestatic dh/r.b (Ljava/lang/Object;)Ljava/lang/Object;
      // 113: astore 3
      // 114: aload 4
      // 116: astore 1
      // 117: aload 3
      // 118: astore 5
      // 11a: aload 3
      // 11b: invokestatic dh/r.g (Ljava/lang/Object;)Z
      // 11e: ifeq 124
      // 121: aconst_null
      // 122: astore 5
      // 124: aload 4
      // 126: astore 1
      // 127: aload 5
      // 129: checkcast kotlinx/serialization/json/JsonElement
      // 12c: astore 5
      // 12e: aload 5
      // 130: ifnonnull 144
      // 133: aload 4
      // 135: invokevirtual java/io/File.exists ()Z
      // 138: bipush 1
      // 139: if_icmpne 142
      // 13c: aload 4
      // 13e: invokevirtual java/io/File.delete ()Z
      // 141: pop
      // 142: aconst_null
      // 143: areturn
      // 144: aload 4
      // 146: astore 1
      // 147: aload 6
      // 149: invokestatic zk/g.o (Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonObject;
      // 14c: invokestatic eh/r.x (Ljava/util/Map;)Ljava/util/Map;
      // 14f: astore 3
      // 150: aload 4
      // 152: astore 1
      // 153: new kotlinx/serialization/json/JsonArray
      // 156: astore 7
      // 158: aload 4
      // 15a: astore 1
      // 15b: aload 7
      // 15d: aload 5
      // 15f: invokestatic kotlin/collections/i.e (Ljava/lang/Object;)Ljava/util/List;
      // 162: invokespecial kotlinx/serialization/json/JsonArray.<init> (Ljava/util/List;)V
      // 165: aload 4
      // 167: astore 1
      // 168: aload 3
      // 169: ldc "samples"
      // 16b: aload 7
      // 16d: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 172: pop
      // 173: aload 4
      // 175: astore 1
      // 176: aload 6
      // 178: invokestatic zk/g.o (Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonObject;
      // 17b: ldc "stackFrames"
      // 17d: invokevirtual kotlinx/serialization/json/JsonObject.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 180: checkcast kotlinx/serialization/json/JsonElement
      // 183: astore 6
      // 185: aload 6
      // 187: ifnull 26e
      // 18a: aload 4
      // 18c: astore 1
      // 18d: aload 6
      // 18f: invokestatic zk/g.o (Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonObject;
      // 192: astore 7
      // 194: aload 7
      // 196: ifnull 26e
      // 199: aload 4
      // 19b: astore 1
      // 19c: aload 5
      // 19e: invokestatic zk/g.o (Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonObject;
      // 1a1: ldc "sf"
      // 1a3: invokevirtual kotlinx/serialization/json/JsonObject.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 1a6: astore 5
      // 1a8: aload 4
      // 1aa: astore 1
      // 1ab: aload 5
      // 1ad: invokestatic kotlin/jvm/internal/q.e (Ljava/lang/Object;)V
      // 1b0: aload 4
      // 1b2: astore 1
      // 1b3: aload 5
      // 1b5: checkcast kotlinx/serialization/json/JsonElement
      // 1b8: invokestatic zk/g.p (Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonPrimitive;
      // 1bb: invokestatic zk/g.m (Lkotlinx/serialization/json/JsonPrimitive;)Ljava/lang/Integer;
      // 1be: astore 6
      // 1c0: aload 6
      // 1c2: ifnull 26e
      // 1c5: aload 4
      // 1c7: astore 1
      // 1c8: aload 6
      // 1ca: invokevirtual java/lang/Number.intValue ()I
      // 1cd: pop
      // 1ce: aload 4
      // 1d0: astore 1
      // 1d1: new java/util/LinkedHashMap
      // 1d4: astore 5
      // 1d6: aload 4
      // 1d8: astore 1
      // 1d9: aload 5
      // 1db: invokespecial java/util/LinkedHashMap.<init> ()V
      // 1de: aload 4
      // 1e0: astore 1
      // 1e1: aload 7
      // 1e3: invokeinterface java/util/Map.entrySet ()Ljava/util/Set; 1
      // 1e8: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 1ed: astore 9
      // 1ef: aload 4
      // 1f1: astore 1
      // 1f2: aload 9
      // 1f4: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 1f9: ifeq 24e
      // 1fc: aload 4
      // 1fe: astore 1
      // 1ff: aload 9
      // 201: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 206: checkcast java/util/Map$Entry
      // 209: astore 8
      // 20b: aload 4
      // 20d: astore 1
      // 20e: aload 8
      // 210: invokeinterface java/util/Map$Entry.getKey ()Ljava/lang/Object; 1
      // 215: checkcast java/lang/String
      // 218: invokestatic kotlin/text/h.m (Ljava/lang/String;)Ljava/lang/Integer;
      // 21b: astore 7
      // 21d: aload 7
      // 21f: ifnull 1ef
      // 222: aload 4
      // 224: astore 1
      // 225: aload 7
      // 227: invokevirtual java/lang/Number.intValue ()I
      // 22a: aload 6
      // 22c: invokevirtual java/lang/Integer.intValue ()I
      // 22f: if_icmpgt 1ef
      // 232: aload 4
      // 234: astore 1
      // 235: aload 5
      // 237: aload 8
      // 239: invokeinterface java/util/Map$Entry.getKey ()Ljava/lang/Object; 1
      // 23e: aload 8
      // 240: invokeinterface java/util/Map$Entry.getValue ()Ljava/lang/Object; 1
      // 245: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 24a: pop
      // 24b: goto 1ef
      // 24e: aload 4
      // 250: astore 1
      // 251: new kotlinx/serialization/json/JsonObject
      // 254: astore 6
      // 256: aload 4
      // 258: astore 1
      // 259: aload 6
      // 25b: aload 5
      // 25d: invokespecial kotlinx/serialization/json/JsonObject.<init> (Ljava/util/Map;)V
      // 260: aload 4
      // 262: astore 1
      // 263: aload 3
      // 264: ldc "stackFrames"
      // 266: aload 6
      // 268: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 26d: pop
      // 26e: aload 4
      // 270: astore 1
      // 271: getstatic kotlinx/serialization/json/Json.d Lkotlinx/serialization/json/Json$a;
      // 274: astore 7
      // 276: aload 4
      // 278: astore 1
      // 279: getstatic kotlinx/serialization/json/JsonObject.Companion Lkotlinx/serialization/json/JsonObject$Companion;
      // 27c: invokevirtual kotlinx/serialization/json/JsonObject$Companion.serializer ()Lkotlinx/serialization/KSerializer;
      // 27f: astore 5
      // 281: aload 4
      // 283: astore 1
      // 284: new kotlinx/serialization/json/JsonObject
      // 287: astore 6
      // 289: aload 4
      // 28b: astore 1
      // 28c: aload 6
      // 28e: aload 3
      // 28f: invokespecial kotlinx/serialization/json/JsonObject.<init> (Ljava/util/Map;)V
      // 292: aload 4
      // 294: astore 1
      // 295: aload 7
      // 297: aload 5
      // 299: aload 6
      // 29b: invokevirtual kotlinx/serialization/json/Json.c (Lvk/h;Ljava/lang/Object;)Ljava/lang/String;
      // 29e: astore 3
      // 29f: aload 4
      // 2a1: invokevirtual java/io/File.exists ()Z
      // 2a4: bipush 1
      // 2a5: if_icmpne 2ae
      // 2a8: aload 4
      // 2aa: invokevirtual java/io/File.delete ()Z
      // 2ad: pop
      // 2ae: aload 3
      // 2af: areturn
      // 2b0: aload 4
      // 2b2: invokevirtual java/io/File.exists ()Z
      // 2b5: bipush 1
      // 2b6: if_icmpne 2bf
      // 2b9: aload 4
      // 2bb: invokevirtual java/io/File.delete ()Z
      // 2be: pop
      // 2bf: aconst_null
      // 2c0: areturn
      // 2c1: astore 1
      // 2c2: goto 2e9
      // 2c5: astore 5
      // 2c7: aconst_null
      // 2c8: astore 3
      // 2c9: aload 3
      // 2ca: astore 1
      // 2cb: getstatic com/discord/crash_reporting/CrashReporting.INSTANCE Lcom/discord/crash_reporting/CrashReporting;
      // 2ce: aload 5
      // 2d0: bipush 0
      // 2d1: bipush 2
      // 2d2: aconst_null
      // 2d3: invokestatic com/discord/crash_reporting/CrashReporting.captureException$default (Lcom/discord/crash_reporting/CrashReporting;Ljava/lang/Throwable;ZILjava/lang/Object;)V
      // 2d6: aload 3
      // 2d7: ifnull 2e7
      // 2da: aload 3
      // 2db: invokevirtual java/io/File.exists ()Z
      // 2de: bipush 1
      // 2df: if_icmpne 2e7
      // 2e2: aload 3
      // 2e3: invokevirtual java/io/File.delete ()Z
      // 2e6: pop
      // 2e7: aconst_null
      // 2e8: areturn
      // 2e9: aload 3
      // 2ea: ifnull 2fa
      // 2ed: aload 3
      // 2ee: invokevirtual java/io/File.exists ()Z
      // 2f1: bipush 1
      // 2f2: if_icmpne 2fa
      // 2f5: aload 3
      // 2f6: invokevirtual java/io/File.delete ()Z
      // 2f9: pop
      // 2fa: aload 1
      // 2fb: athrow
   }
}

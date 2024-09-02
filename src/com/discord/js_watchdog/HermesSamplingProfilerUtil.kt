package com.discord.js_watchdog

import java.io.File
import java.io.FileInputStream
import wj.b
import wj.c

public object HermesSamplingProfilerUtil {
   private fun readFile(file: File): String {
      label18: {
         val var10: FileInputStream = new FileInputStream(var1);

         var var11: ByteArray;
         try {
            var11 = b.c(var10);
         } catch (var5: java.lang.Throwable) {
            val var2: java.lang.Throwable = var5;

            try {
               throw var2;
            } catch (var4: java.lang.Throwable) {
               c.a(var10, var5);
            }
         }

         c.a(var10, null);
         return h.r(var11);
      }
   }

   public fun findSampleTrace(cacheDir: File): String? {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.createStatement(DomHelper.java:27)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:156)
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
      // 044: invokestatic hn/g.o (Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonObject;
      // 047: ldc "samples"
      // 049: invokevirtual kotlinx/serialization/json/JsonObject.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 04c: checkcast kotlinx/serialization/json/JsonElement
      // 04f: astore 3
      // 050: aload 3
      // 051: ifnull 070
      // 054: aload 4
      // 056: astore 1
      // 057: aload 3
      // 058: invokestatic hn/g.n (Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonArray;
      // 05b: astore 3
      // 05c: goto 072
      // 05f: astore 3
      // 060: aload 1
      // 061: astore 4
      // 063: aload 3
      // 064: astore 1
      // 065: goto 2ea
      // 068: astore 5
      // 06a: aload 4
      // 06c: astore 3
      // 06d: goto 2ca
      // 070: aconst_null
      // 071: astore 3
      // 072: aload 3
      // 073: ifnull 2ae
      // 076: aload 4
      // 078: astore 1
      // 079: aload 3
      // 07a: invokeinterface java/util/Collection.isEmpty ()Z 1
      // 07f: istore 2
      // 080: iload 2
      // 081: ifeq 087
      // 084: goto 2ae
      // 087: getstatic lj/r.k Llj/r$a;
      // 08a: astore 1
      // 08b: aload 3
      // 08c: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 091: astore 5
      // 093: aload 5
      // 095: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 09a: ifeq 0e5
      // 09d: aload 5
      // 09f: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0a4: checkcast kotlinx/serialization/json/JsonElement
      // 0a7: astore 1
      // 0a8: aload 1
      // 0a9: invokestatic hn/g.o (Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonObject;
      // 0ac: ldc "sf"
      // 0ae: invokevirtual kotlinx/serialization/json/JsonObject.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 0b1: checkcast kotlinx/serialization/json/JsonElement
      // 0b4: astore 3
      // 0b5: aload 3
      // 0b6: ifnull 0da
      // 0b9: aload 3
      // 0ba: invokestatic hn/g.p (Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonPrimitive;
      // 0bd: astore 3
      // 0be: aload 3
      // 0bf: ifnull 0da
      // 0c2: aload 3
      // 0c3: invokestatic hn/g.m (Lkotlinx/serialization/json/JsonPrimitive;)Ljava/lang/Integer;
      // 0c6: astore 3
      // 0c7: aload 3
      // 0c8: ifnull 0da
      // 0cb: aload 3
      // 0cc: invokevirtual java/lang/Integer.intValue ()I
      // 0cf: bipush 1
      // 0d0: if_icmple 0da
      // 0d3: goto 0dc
      // 0d6: astore 3
      // 0d7: goto 0ff
      // 0da: aconst_null
      // 0db: astore 1
      // 0dc: aload 1
      // 0dd: astore 3
      // 0de: aload 1
      // 0df: ifnonnull 0e7
      // 0e2: goto 093
      // 0e5: aconst_null
      // 0e6: astore 3
      // 0e7: aload 3
      // 0e8: ifnull 0f3
      // 0eb: aload 3
      // 0ec: invokestatic lj/r.b (Ljava/lang/Object;)Ljava/lang/Object;
      // 0ef: astore 3
      // 0f0: goto 112
      // 0f3: new java/util/NoSuchElementException
      // 0f6: astore 1
      // 0f7: aload 1
      // 0f8: ldc "No element of the collection was transformed to a non-null value."
      // 0fa: invokespecial java/util/NoSuchElementException.<init> (Ljava/lang/String;)V
      // 0fd: aload 1
      // 0fe: athrow
      // 0ff: aload 4
      // 101: astore 1
      // 102: getstatic lj/r.k Llj/r$a;
      // 105: astore 5
      // 107: aload 4
      // 109: astore 1
      // 10a: aload 3
      // 10b: invokestatic lj/s.a (Ljava/lang/Throwable;)Ljava/lang/Object;
      // 10e: invokestatic lj/r.b (Ljava/lang/Object;)Ljava/lang/Object;
      // 111: astore 3
      // 112: aload 4
      // 114: astore 1
      // 115: aload 3
      // 116: astore 5
      // 118: aload 3
      // 119: invokestatic lj/r.g (Ljava/lang/Object;)Z
      // 11c: ifeq 122
      // 11f: aconst_null
      // 120: astore 5
      // 122: aload 4
      // 124: astore 1
      // 125: aload 5
      // 127: checkcast kotlinx/serialization/json/JsonElement
      // 12a: astore 5
      // 12c: aload 5
      // 12e: ifnonnull 142
      // 131: aload 4
      // 133: invokevirtual java/io/File.exists ()Z
      // 136: bipush 1
      // 137: if_icmpne 140
      // 13a: aload 4
      // 13c: invokevirtual java/io/File.delete ()Z
      // 13f: pop
      // 140: aconst_null
      // 141: areturn
      // 142: aload 4
      // 144: astore 1
      // 145: aload 6
      // 147: invokestatic hn/g.o (Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonObject;
      // 14a: invokestatic mj/r.x (Ljava/util/Map;)Ljava/util/Map;
      // 14d: astore 3
      // 14e: aload 4
      // 150: astore 1
      // 151: new kotlinx/serialization/json/JsonArray
      // 154: astore 7
      // 156: aload 4
      // 158: astore 1
      // 159: aload 7
      // 15b: aload 5
      // 15d: invokestatic kotlin/collections/i.e (Ljava/lang/Object;)Ljava/util/List;
      // 160: invokespecial kotlinx/serialization/json/JsonArray.<init> (Ljava/util/List;)V
      // 163: aload 4
      // 165: astore 1
      // 166: aload 3
      // 167: ldc "samples"
      // 169: aload 7
      // 16b: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 170: pop
      // 171: aload 4
      // 173: astore 1
      // 174: aload 6
      // 176: invokestatic hn/g.o (Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonObject;
      // 179: ldc "stackFrames"
      // 17b: invokevirtual kotlinx/serialization/json/JsonObject.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 17e: checkcast kotlinx/serialization/json/JsonElement
      // 181: astore 6
      // 183: aload 6
      // 185: ifnull 26c
      // 188: aload 4
      // 18a: astore 1
      // 18b: aload 6
      // 18d: invokestatic hn/g.o (Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonObject;
      // 190: astore 7
      // 192: aload 7
      // 194: ifnull 26c
      // 197: aload 4
      // 199: astore 1
      // 19a: aload 5
      // 19c: invokestatic hn/g.o (Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonObject;
      // 19f: ldc "sf"
      // 1a1: invokevirtual kotlinx/serialization/json/JsonObject.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 1a4: astore 5
      // 1a6: aload 4
      // 1a8: astore 1
      // 1a9: aload 5
      // 1ab: invokestatic kotlin/jvm/internal/q.e (Ljava/lang/Object;)V
      // 1ae: aload 4
      // 1b0: astore 1
      // 1b1: aload 5
      // 1b3: checkcast kotlinx/serialization/json/JsonElement
      // 1b6: invokestatic hn/g.p (Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonPrimitive;
      // 1b9: invokestatic hn/g.m (Lkotlinx/serialization/json/JsonPrimitive;)Ljava/lang/Integer;
      // 1bc: astore 6
      // 1be: aload 6
      // 1c0: ifnull 26c
      // 1c3: aload 4
      // 1c5: astore 1
      // 1c6: aload 6
      // 1c8: invokevirtual java/lang/Number.intValue ()I
      // 1cb: pop
      // 1cc: aload 4
      // 1ce: astore 1
      // 1cf: new java/util/LinkedHashMap
      // 1d2: astore 5
      // 1d4: aload 4
      // 1d6: astore 1
      // 1d7: aload 5
      // 1d9: invokespecial java/util/LinkedHashMap.<init> ()V
      // 1dc: aload 4
      // 1de: astore 1
      // 1df: aload 7
      // 1e1: invokeinterface java/util/Map.entrySet ()Ljava/util/Set; 1
      // 1e6: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 1eb: astore 7
      // 1ed: aload 4
      // 1ef: astore 1
      // 1f0: aload 7
      // 1f2: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 1f7: ifeq 24c
      // 1fa: aload 4
      // 1fc: astore 1
      // 1fd: aload 7
      // 1ff: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 204: checkcast java/util/Map$Entry
      // 207: astore 9
      // 209: aload 4
      // 20b: astore 1
      // 20c: aload 9
      // 20e: invokeinterface java/util/Map$Entry.getKey ()Ljava/lang/Object; 1
      // 213: checkcast java/lang/String
      // 216: invokestatic kotlin/text/h.m (Ljava/lang/String;)Ljava/lang/Integer;
      // 219: astore 8
      // 21b: aload 8
      // 21d: ifnull 1ed
      // 220: aload 4
      // 222: astore 1
      // 223: aload 8
      // 225: invokevirtual java/lang/Number.intValue ()I
      // 228: aload 6
      // 22a: invokevirtual java/lang/Integer.intValue ()I
      // 22d: if_icmpgt 1ed
      // 230: aload 4
      // 232: astore 1
      // 233: aload 5
      // 235: aload 9
      // 237: invokeinterface java/util/Map$Entry.getKey ()Ljava/lang/Object; 1
      // 23c: aload 9
      // 23e: invokeinterface java/util/Map$Entry.getValue ()Ljava/lang/Object; 1
      // 243: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 248: pop
      // 249: goto 1ed
      // 24c: aload 4
      // 24e: astore 1
      // 24f: new kotlinx/serialization/json/JsonObject
      // 252: astore 6
      // 254: aload 4
      // 256: astore 1
      // 257: aload 6
      // 259: aload 5
      // 25b: invokespecial kotlinx/serialization/json/JsonObject.<init> (Ljava/util/Map;)V
      // 25e: aload 4
      // 260: astore 1
      // 261: aload 3
      // 262: ldc "stackFrames"
      // 264: aload 6
      // 266: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 26b: pop
      // 26c: aload 4
      // 26e: astore 1
      // 26f: getstatic kotlinx/serialization/json/Json.d Lkotlinx/serialization/json/Json$a;
      // 272: astore 5
      // 274: aload 4
      // 276: astore 1
      // 277: getstatic kotlinx/serialization/json/JsonObject.Companion Lkotlinx/serialization/json/JsonObject$Companion;
      // 27a: invokevirtual kotlinx/serialization/json/JsonObject$Companion.serializer ()Lkotlinx/serialization/KSerializer;
      // 27d: astore 7
      // 27f: aload 4
      // 281: astore 1
      // 282: new kotlinx/serialization/json/JsonObject
      // 285: astore 6
      // 287: aload 4
      // 289: astore 1
      // 28a: aload 6
      // 28c: aload 3
      // 28d: invokespecial kotlinx/serialization/json/JsonObject.<init> (Ljava/util/Map;)V
      // 290: aload 4
      // 292: astore 1
      // 293: aload 5
      // 295: aload 7
      // 297: aload 6
      // 299: invokevirtual kotlinx/serialization/json/Json.c (Ldn/h;Ljava/lang/Object;)Ljava/lang/String;
      // 29c: astore 3
      // 29d: aload 4
      // 29f: invokevirtual java/io/File.exists ()Z
      // 2a2: bipush 1
      // 2a3: if_icmpne 2ac
      // 2a6: aload 4
      // 2a8: invokevirtual java/io/File.delete ()Z
      // 2ab: pop
      // 2ac: aload 3
      // 2ad: areturn
      // 2ae: aload 4
      // 2b0: invokevirtual java/io/File.exists ()Z
      // 2b3: bipush 1
      // 2b4: if_icmpne 2bd
      // 2b7: aload 4
      // 2b9: invokevirtual java/io/File.delete ()Z
      // 2bc: pop
      // 2bd: aconst_null
      // 2be: areturn
      // 2bf: astore 1
      // 2c0: aload 3
      // 2c1: astore 4
      // 2c3: goto 2ea
      // 2c6: astore 5
      // 2c8: aconst_null
      // 2c9: astore 3
      // 2ca: aload 3
      // 2cb: astore 1
      // 2cc: getstatic com/discord/crash_reporting/CrashReporting.INSTANCE Lcom/discord/crash_reporting/CrashReporting;
      // 2cf: aload 5
      // 2d1: bipush 0
      // 2d2: bipush 2
      // 2d3: aconst_null
      // 2d4: invokestatic com/discord/crash_reporting/CrashReporting.captureException$default (Lcom/discord/crash_reporting/CrashReporting;Ljava/lang/Throwable;ZILjava/lang/Object;)V
      // 2d7: aload 3
      // 2d8: ifnull 2e8
      // 2db: aload 3
      // 2dc: invokevirtual java/io/File.exists ()Z
      // 2df: bipush 1
      // 2e0: if_icmpne 2e8
      // 2e3: aload 3
      // 2e4: invokevirtual java/io/File.delete ()Z
      // 2e7: pop
      // 2e8: aconst_null
      // 2e9: areturn
      // 2ea: aload 4
      // 2ec: ifnull 2fe
      // 2ef: aload 4
      // 2f1: invokevirtual java/io/File.exists ()Z
      // 2f4: bipush 1
      // 2f5: if_icmpne 2fe
      // 2f8: aload 4
      // 2fa: invokevirtual java/io/File.delete ()Z
      // 2fd: pop
      // 2fe: aload 1
      // 2ff: athrow
   }
}

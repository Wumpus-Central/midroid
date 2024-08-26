package com.discord.js_watchdog

import java.io.File
import java.io.FileInputStream
import oh.b
import oh.c

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
         return f.r(var11);
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
      // 003: invokestatic kotlin/jvm/internal/r.h (Ljava/lang/Object;Ljava/lang/String;)V
      // 006: bipush 0
      // 007: istore 6
      // 009: bipush 0
      // 00a: istore 5
      // 00c: bipush 0
      // 00d: istore 4
      // 00f: bipush 0
      // 010: istore 3
      // 011: bipush 0
      // 012: istore 7
      // 014: aconst_null
      // 015: astore 11
      // 017: ldc "sampling-profiler-trace"
      // 019: ldc ".cpuprofile"
      // 01b: aload 1
      // 01c: invokestatic java/io/File.createTempFile (Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Ljava/io/File;
      // 01f: astore 10
      // 021: aload 10
      // 023: astore 1
      // 024: invokestatic com/facebook/hermes/instrumentation/HermesSamplingProfiler.enable ()V
      // 027: aload 10
      // 029: astore 1
      // 02a: invokestatic com/facebook/hermes/instrumentation/HermesSamplingProfiler.disable ()V
      // 02d: aload 10
      // 02f: astore 1
      // 030: aload 10
      // 032: invokevirtual java/io/File.getPath ()Ljava/lang/String;
      // 035: invokestatic com/facebook/hermes/instrumentation/HermesSamplingProfiler.dumpSampledTraceToFile (Ljava/lang/String;)V
      // 038: aload 10
      // 03a: astore 1
      // 03b: aload 0
      // 03c: aload 10
      // 03e: invokespecial com/discord/js_watchdog/HermesSamplingProfilerUtil.readFile (Ljava/io/File;)Ljava/lang/String;
      // 041: astore 9
      // 043: aload 10
      // 045: astore 1
      // 046: getstatic kotlinx/serialization/json/Json.d Lkotlinx/serialization/json/Json$a;
      // 049: aload 9
      // 04b: invokevirtual kotlinx/serialization/json/Json.g (Ljava/lang/String;)Lkotlinx/serialization/json/JsonElement;
      // 04e: astore 12
      // 050: aload 10
      // 052: astore 1
      // 053: aload 12
      // 055: invokestatic kotlinx/serialization/json/g.o (Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonObject;
      // 058: ldc "samples"
      // 05a: invokevirtual kotlinx/serialization/json/JsonObject.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 05d: checkcast kotlinx/serialization/json/JsonElement
      // 060: astore 9
      // 062: aload 9
      // 064: ifnull 074
      // 067: aload 10
      // 069: astore 1
      // 06a: aload 9
      // 06c: invokestatic kotlinx/serialization/json/g.n (Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonArray;
      // 06f: astore 9
      // 071: goto 077
      // 074: aconst_null
      // 075: astore 9
      // 077: aload 9
      // 079: ifnull 095
      // 07c: aload 10
      // 07e: astore 1
      // 07f: aload 9
      // 081: invokeinterface java/util/Collection.isEmpty ()Z 1
      // 086: istore 8
      // 088: iload 8
      // 08a: ifeq 090
      // 08d: goto 095
      // 090: bipush 0
      // 091: istore 2
      // 092: goto 097
      // 095: bipush 1
      // 096: istore 2
      // 097: iload 2
      // 098: ifeq 0b5
      // 09b: iload 7
      // 09d: istore 2
      // 09e: aload 10
      // 0a0: invokevirtual java/io/File.exists ()Z
      // 0a3: bipush 1
      // 0a4: if_icmpne 0a9
      // 0a7: bipush 1
      // 0a8: istore 2
      // 0a9: iload 2
      // 0aa: ifeq 0b3
      // 0ad: aload 10
      // 0af: invokevirtual java/io/File.delete ()Z
      // 0b2: pop
      // 0b3: aconst_null
      // 0b4: areturn
      // 0b5: getstatic eh/r.k Leh/r$a;
      // 0b8: astore 1
      // 0b9: aload 9
      // 0bb: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 0c0: astore 11
      // 0c2: aload 11
      // 0c4: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 0c9: ifeq 12c
      // 0cc: aload 11
      // 0ce: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0d3: checkcast kotlinx/serialization/json/JsonElement
      // 0d6: astore 1
      // 0d7: aload 1
      // 0d8: invokestatic kotlinx/serialization/json/g.o (Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonObject;
      // 0db: ldc "sf"
      // 0dd: invokevirtual kotlinx/serialization/json/JsonObject.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 0e0: checkcast kotlinx/serialization/json/JsonElement
      // 0e3: astore 9
      // 0e5: aload 9
      // 0e7: ifnull 10b
      // 0ea: aload 9
      // 0ec: invokestatic kotlinx/serialization/json/g.p (Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonPrimitive;
      // 0ef: astore 9
      // 0f1: aload 9
      // 0f3: ifnull 10b
      // 0f6: aload 9
      // 0f8: invokestatic kotlinx/serialization/json/g.m (Lkotlinx/serialization/json/JsonPrimitive;)Ljava/lang/Integer;
      // 0fb: astore 9
      // 0fd: aload 9
      // 0ff: ifnull 10b
      // 102: aload 9
      // 104: invokevirtual java/lang/Integer.intValue ()I
      // 107: istore 2
      // 108: goto 10d
      // 10b: bipush -1
      // 10c: istore 2
      // 10d: iload 2
      // 10e: bipush 1
      // 10f: if_icmple 117
      // 112: bipush 1
      // 113: istore 2
      // 114: goto 119
      // 117: bipush 0
      // 118: istore 2
      // 119: iload 2
      // 11a: ifeq 120
      // 11d: goto 122
      // 120: aconst_null
      // 121: astore 1
      // 122: aload 1
      // 123: astore 9
      // 125: aload 1
      // 126: ifnonnull 12f
      // 129: goto 0c2
      // 12c: aconst_null
      // 12d: astore 9
      // 12f: aload 9
      // 131: ifnull 13e
      // 134: aload 9
      // 136: invokestatic eh/r.b (Ljava/lang/Object;)Ljava/lang/Object;
      // 139: astore 9
      // 13b: goto 161
      // 13e: new java/util/NoSuchElementException
      // 141: astore 1
      // 142: aload 1
      // 143: ldc "No element of the collection was transformed to a non-null value."
      // 145: invokespecial java/util/NoSuchElementException.<init> (Ljava/lang/String;)V
      // 148: aload 1
      // 149: athrow
      // 14a: astore 9
      // 14c: aload 10
      // 14e: astore 1
      // 14f: getstatic eh/r.k Leh/r$a;
      // 152: astore 11
      // 154: aload 10
      // 156: astore 1
      // 157: aload 9
      // 159: invokestatic eh/s.a (Ljava/lang/Throwable;)Ljava/lang/Object;
      // 15c: invokestatic eh/r.b (Ljava/lang/Object;)Ljava/lang/Object;
      // 15f: astore 9
      // 161: aload 9
      // 163: astore 11
      // 165: aload 10
      // 167: astore 1
      // 168: aload 9
      // 16a: invokestatic eh/r.g (Ljava/lang/Object;)Z
      // 16d: ifeq 173
      // 170: aconst_null
      // 171: astore 11
      // 173: aload 10
      // 175: astore 1
      // 176: aload 11
      // 178: checkcast kotlinx/serialization/json/JsonElement
      // 17b: astore 11
      // 17d: aload 11
      // 17f: ifnonnull 19c
      // 182: iload 6
      // 184: istore 2
      // 185: aload 10
      // 187: invokevirtual java/io/File.exists ()Z
      // 18a: bipush 1
      // 18b: if_icmpne 190
      // 18e: bipush 1
      // 18f: istore 2
      // 190: iload 2
      // 191: ifeq 19a
      // 194: aload 10
      // 196: invokevirtual java/io/File.delete ()Z
      // 199: pop
      // 19a: aconst_null
      // 19b: areturn
      // 19c: aload 10
      // 19e: astore 1
      // 19f: aload 12
      // 1a1: invokestatic kotlinx/serialization/json/g.o (Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonObject;
      // 1a4: invokestatic fh/s.x (Ljava/util/Map;)Ljava/util/Map;
      // 1a7: astore 9
      // 1a9: aload 10
      // 1ab: astore 1
      // 1ac: new kotlinx/serialization/json/JsonArray
      // 1af: astore 13
      // 1b1: aload 10
      // 1b3: astore 1
      // 1b4: aload 13
      // 1b6: aload 11
      // 1b8: invokestatic kotlin/collections/h.d (Ljava/lang/Object;)Ljava/util/List;
      // 1bb: invokespecial kotlinx/serialization/json/JsonArray.<init> (Ljava/util/List;)V
      // 1be: aload 10
      // 1c0: astore 1
      // 1c1: aload 9
      // 1c3: ldc "samples"
      // 1c5: aload 13
      // 1c7: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 1cc: pop
      // 1cd: aload 10
      // 1cf: astore 1
      // 1d0: aload 12
      // 1d2: invokestatic kotlinx/serialization/json/g.o (Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonObject;
      // 1d5: ldc "stackFrames"
      // 1d7: invokevirtual kotlinx/serialization/json/JsonObject.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 1da: checkcast kotlinx/serialization/json/JsonElement
      // 1dd: astore 12
      // 1df: aload 12
      // 1e1: ifnull 2e0
      // 1e4: aload 10
      // 1e6: astore 1
      // 1e7: aload 12
      // 1e9: invokestatic kotlinx/serialization/json/g.o (Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonObject;
      // 1ec: astore 13
      // 1ee: aload 13
      // 1f0: ifnull 2e0
      // 1f3: aload 10
      // 1f5: astore 1
      // 1f6: aload 11
      // 1f8: invokestatic kotlinx/serialization/json/g.o (Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonObject;
      // 1fb: ldc "sf"
      // 1fd: invokevirtual kotlinx/serialization/json/JsonObject.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 200: astore 11
      // 202: aload 10
      // 204: astore 1
      // 205: aload 11
      // 207: invokestatic kotlin/jvm/internal/r.e (Ljava/lang/Object;)V
      // 20a: aload 10
      // 20c: astore 1
      // 20d: aload 11
      // 20f: checkcast kotlinx/serialization/json/JsonElement
      // 212: invokestatic kotlinx/serialization/json/g.p (Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonPrimitive;
      // 215: invokestatic kotlinx/serialization/json/g.m (Lkotlinx/serialization/json/JsonPrimitive;)Ljava/lang/Integer;
      // 218: astore 12
      // 21a: aload 12
      // 21c: ifnull 2e0
      // 21f: aload 10
      // 221: astore 1
      // 222: aload 12
      // 224: invokevirtual java/lang/Number.intValue ()I
      // 227: pop
      // 228: aload 10
      // 22a: astore 1
      // 22b: new java/util/LinkedHashMap
      // 22e: astore 11
      // 230: aload 10
      // 232: astore 1
      // 233: aload 11
      // 235: invokespecial java/util/LinkedHashMap.<init> ()V
      // 238: aload 10
      // 23a: astore 1
      // 23b: aload 13
      // 23d: invokeinterface java/util/Map.entrySet ()Ljava/util/Set; 1
      // 242: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 247: astore 14
      // 249: aload 10
      // 24b: astore 1
      // 24c: aload 14
      // 24e: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 253: ifeq 2bf
      // 256: aload 10
      // 258: astore 1
      // 259: aload 14
      // 25b: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 260: checkcast java/util/Map$Entry
      // 263: astore 13
      // 265: aload 10
      // 267: astore 1
      // 268: aload 13
      // 26a: invokeinterface java/util/Map$Entry.getKey ()Ljava/lang/Object; 1
      // 26f: checkcast java/lang/String
      // 272: invokestatic kotlin/text/f.m (Ljava/lang/String;)Ljava/lang/Integer;
      // 275: astore 15
      // 277: aload 15
      // 279: ifnull 29d
      // 27c: aload 10
      // 27e: astore 1
      // 27f: aload 15
      // 281: invokevirtual java/lang/Number.intValue ()I
      // 284: aload 12
      // 286: invokevirtual java/lang/Integer.intValue ()I
      // 289: if_icmpgt 291
      // 28c: bipush 1
      // 28d: istore 2
      // 28e: goto 293
      // 291: bipush 0
      // 292: istore 2
      // 293: iload 2
      // 294: bipush 1
      // 295: if_icmpne 29d
      // 298: bipush 1
      // 299: istore 2
      // 29a: goto 29f
      // 29d: bipush 0
      // 29e: istore 2
      // 29f: iload 2
      // 2a0: ifeq 249
      // 2a3: aload 10
      // 2a5: astore 1
      // 2a6: aload 11
      // 2a8: aload 13
      // 2aa: invokeinterface java/util/Map$Entry.getKey ()Ljava/lang/Object; 1
      // 2af: aload 13
      // 2b1: invokeinterface java/util/Map$Entry.getValue ()Ljava/lang/Object; 1
      // 2b6: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 2bb: pop
      // 2bc: goto 249
      // 2bf: aload 10
      // 2c1: astore 1
      // 2c2: new kotlinx/serialization/json/JsonObject
      // 2c5: astore 12
      // 2c7: aload 10
      // 2c9: astore 1
      // 2ca: aload 12
      // 2cc: aload 11
      // 2ce: invokespecial kotlinx/serialization/json/JsonObject.<init> (Ljava/util/Map;)V
      // 2d1: aload 10
      // 2d3: astore 1
      // 2d4: aload 9
      // 2d6: ldc "stackFrames"
      // 2d8: aload 12
      // 2da: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 2df: pop
      // 2e0: aload 10
      // 2e2: astore 1
      // 2e3: getstatic kotlinx/serialization/json/Json.d Lkotlinx/serialization/json/Json$a;
      // 2e6: astore 13
      // 2e8: aload 10
      // 2ea: astore 1
      // 2eb: getstatic kotlinx/serialization/json/JsonObject.Companion Lkotlinx/serialization/json/JsonObject$Companion;
      // 2ee: invokevirtual kotlinx/serialization/json/JsonObject$Companion.serializer ()Lkotlinx/serialization/KSerializer;
      // 2f1: astore 12
      // 2f3: aload 10
      // 2f5: astore 1
      // 2f6: new kotlinx/serialization/json/JsonObject
      // 2f9: astore 11
      // 2fb: aload 10
      // 2fd: astore 1
      // 2fe: aload 11
      // 300: aload 9
      // 302: invokespecial kotlinx/serialization/json/JsonObject.<init> (Ljava/util/Map;)V
      // 305: aload 10
      // 307: astore 1
      // 308: aload 13
      // 30a: aload 12
      // 30c: aload 11
      // 30e: invokevirtual kotlinx/serialization/json/Json.c (Luk/h;Ljava/lang/Object;)Ljava/lang/String;
      // 311: astore 9
      // 313: iload 5
      // 315: istore 2
      // 316: aload 10
      // 318: invokevirtual java/io/File.exists ()Z
      // 31b: bipush 1
      // 31c: if_icmpne 321
      // 31f: bipush 1
      // 320: istore 2
      // 321: iload 2
      // 322: ifeq 32b
      // 325: aload 10
      // 327: invokevirtual java/io/File.delete ()Z
      // 32a: pop
      // 32b: aload 9
      // 32d: areturn
      // 32e: astore 11
      // 330: aload 10
      // 332: astore 9
      // 334: goto 344
      // 337: astore 9
      // 339: aload 11
      // 33b: astore 1
      // 33c: goto 376
      // 33f: astore 11
      // 341: aconst_null
      // 342: astore 9
      // 344: aload 9
      // 346: astore 1
      // 347: getstatic com/discord/crash_reporting/CrashReporting.INSTANCE Lcom/discord/crash_reporting/CrashReporting;
      // 34a: aload 11
      // 34c: bipush 0
      // 34d: bipush 2
      // 34e: aconst_null
      // 34f: invokestatic com/discord/crash_reporting/CrashReporting.captureException$default (Lcom/discord/crash_reporting/CrashReporting;Ljava/lang/Throwable;ZILjava/lang/Object;)V
      // 352: iload 4
      // 354: istore 2
      // 355: aload 9
      // 357: ifnull 368
      // 35a: iload 4
      // 35c: istore 2
      // 35d: aload 9
      // 35f: invokevirtual java/io/File.exists ()Z
      // 362: bipush 1
      // 363: if_icmpne 368
      // 366: bipush 1
      // 367: istore 2
      // 368: iload 2
      // 369: ifeq 372
      // 36c: aload 9
      // 36e: invokevirtual java/io/File.delete ()Z
      // 371: pop
      // 372: aconst_null
      // 373: areturn
      // 374: astore 9
      // 376: iload 3
      // 377: istore 2
      // 378: aload 1
      // 379: ifnull 388
      // 37c: iload 3
      // 37d: istore 2
      // 37e: aload 1
      // 37f: invokevirtual java/io/File.exists ()Z
      // 382: bipush 1
      // 383: if_icmpne 388
      // 386: bipush 1
      // 387: istore 2
      // 388: iload 2
      // 389: ifeq 391
      // 38c: aload 1
      // 38d: invokevirtual java/io/File.delete ()Z
      // 390: pop
      // 391: aload 9
      // 393: athrow
   }
}

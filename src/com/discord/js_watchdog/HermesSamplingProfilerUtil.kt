package com.discord.js_watchdog

import java.io.File
import java.io.FileInputStream
import x8.b
import x8.c

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
         return h.s(var11);
      }
   }

   public fun findSampleTrace(cacheDir: File): String? {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      //
      // Bytecode:
      // 000: aload 1
      // 001: ldc "cacheDir"
      // 003: invokestatic kotlin/jvm/internal/q.h (Ljava/lang/Object;Ljava/lang/String;)V
      // 006: bipush 0
      // 007: istore 5
      // 009: bipush 0
      // 00a: istore 3
      // 00b: bipush 0
      // 00c: istore 4
      // 00e: bipush 0
      // 00f: istore 6
      // 011: aconst_null
      // 012: astore 8
      // 014: ldc "sampling-profiler-trace"
      // 016: ldc ".cpuprofile"
      // 018: aload 1
      // 019: invokestatic java/io/File.createTempFile (Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Ljava/io/File;
      // 01c: astore 9
      // 01e: aload 9
      // 020: astore 1
      // 021: invokestatic com/facebook/hermes/instrumentation/HermesSamplingProfiler.enable ()V
      // 024: aload 9
      // 026: astore 1
      // 027: invokestatic com/facebook/hermes/instrumentation/HermesSamplingProfiler.disable ()V
      // 02a: aload 9
      // 02c: astore 1
      // 02d: aload 9
      // 02f: invokevirtual java/io/File.getPath ()Ljava/lang/String;
      // 032: astore 8
      // 034: aload 9
      // 036: astore 1
      // 037: aload 8
      // 039: ldc "getPath(...)"
      // 03b: invokestatic kotlin/jvm/internal/q.g (Ljava/lang/Object;Ljava/lang/String;)V
      // 03e: aload 9
      // 040: astore 1
      // 041: aload 8
      // 043: invokestatic com/facebook/hermes/instrumentation/HermesSamplingProfiler.dumpSampledTraceToFile (Ljava/lang/String;)V
      // 046: aload 9
      // 048: astore 1
      // 049: aload 0
      // 04a: aload 9
      // 04c: invokespecial com/discord/js_watchdog/HermesSamplingProfilerUtil.readFile (Ljava/io/File;)Ljava/lang/String;
      // 04f: astore 8
      // 051: aload 9
      // 053: astore 1
      // 054: getstatic kotlinx/serialization/json/Json.d Lkotlinx/serialization/json/Json$a;
      // 057: aload 8
      // 059: invokevirtual kotlinx/serialization/json/Json.g (Ljava/lang/String;)Lkotlinx/serialization/json/JsonElement;
      // 05c: astore 11
      // 05e: aload 9
      // 060: astore 1
      // 061: aload 11
      // 063: invokestatic ia/g.o (Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonObject;
      // 066: ldc "samples"
      // 068: invokevirtual kotlinx/serialization/json/JsonObject.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 06b: checkcast kotlinx/serialization/json/JsonElement
      // 06e: astore 8
      // 070: aload 8
      // 072: ifnull 096
      // 075: aload 9
      // 077: astore 1
      // 078: aload 8
      // 07a: invokestatic ia/g.n (Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonArray;
      // 07d: astore 8
      // 07f: goto 099
      // 082: astore 9
      // 084: aload 1
      // 085: astore 8
      // 087: aload 9
      // 089: astore 1
      // 08a: goto 36d
      // 08d: astore 10
      // 08f: aload 9
      // 091: astore 8
      // 093: goto 33f
      // 096: aconst_null
      // 097: astore 8
      // 099: aload 8
      // 09b: ifnull 325
      // 09e: aload 9
      // 0a0: astore 1
      // 0a1: aload 8
      // 0a3: invokeinterface java/util/Collection.isEmpty ()Z 1
      // 0a8: istore 7
      // 0aa: iload 7
      // 0ac: ifeq 0b2
      // 0af: goto 325
      // 0b2: getstatic l8/r.k Ll8/r$a;
      // 0b5: astore 1
      // 0b6: aload 8
      // 0b8: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 0bd: astore 10
      // 0bf: aload 10
      // 0c1: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 0c6: ifeq 12e
      // 0c9: aload 10
      // 0cb: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0d0: checkcast kotlinx/serialization/json/JsonElement
      // 0d3: astore 1
      // 0d4: aload 1
      // 0d5: invokestatic ia/g.o (Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonObject;
      // 0d8: ldc "sf"
      // 0da: invokevirtual kotlinx/serialization/json/JsonObject.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 0dd: checkcast kotlinx/serialization/json/JsonElement
      // 0e0: astore 8
      // 0e2: aload 8
      // 0e4: ifnull 10d
      // 0e7: aload 8
      // 0e9: invokestatic ia/g.p (Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonPrimitive;
      // 0ec: astore 8
      // 0ee: aload 8
      // 0f0: ifnull 10d
      // 0f3: aload 8
      // 0f5: invokestatic ia/g.m (Lkotlinx/serialization/json/JsonPrimitive;)Ljava/lang/Integer;
      // 0f8: astore 8
      // 0fa: aload 8
      // 0fc: ifnull 10d
      // 0ff: aload 8
      // 101: invokevirtual java/lang/Integer.intValue ()I
      // 104: istore 2
      // 105: goto 10f
      // 108: astore 8
      // 10a: goto 14c
      // 10d: bipush -1
      // 10e: istore 2
      // 10f: iload 2
      // 110: bipush 1
      // 111: if_icmple 119
      // 114: bipush 1
      // 115: istore 2
      // 116: goto 11b
      // 119: bipush 0
      // 11a: istore 2
      // 11b: iload 2
      // 11c: ifeq 122
      // 11f: goto 124
      // 122: aconst_null
      // 123: astore 1
      // 124: aload 1
      // 125: astore 8
      // 127: aload 1
      // 128: ifnonnull 131
      // 12b: goto 0bf
      // 12e: aconst_null
      // 12f: astore 8
      // 131: aload 8
      // 133: ifnull 140
      // 136: aload 8
      // 138: invokestatic l8/r.b (Ljava/lang/Object;)Ljava/lang/Object;
      // 13b: astore 8
      // 13d: goto 161
      // 140: new java/util/NoSuchElementException
      // 143: astore 1
      // 144: aload 1
      // 145: ldc "No element of the collection was transformed to a non-null value."
      // 147: invokespecial java/util/NoSuchElementException.<init> (Ljava/lang/String;)V
      // 14a: aload 1
      // 14b: athrow
      // 14c: aload 9
      // 14e: astore 1
      // 14f: getstatic l8/r.k Ll8/r$a;
      // 152: astore 10
      // 154: aload 9
      // 156: astore 1
      // 157: aload 8
      // 159: invokestatic l8/s.a (Ljava/lang/Throwable;)Ljava/lang/Object;
      // 15c: invokestatic l8/r.b (Ljava/lang/Object;)Ljava/lang/Object;
      // 15f: astore 8
      // 161: aload 9
      // 163: astore 1
      // 164: aload 8
      // 166: astore 10
      // 168: aload 8
      // 16a: invokestatic l8/r.g (Ljava/lang/Object;)Z
      // 16d: ifeq 173
      // 170: aconst_null
      // 171: astore 10
      // 173: aload 9
      // 175: astore 1
      // 176: aload 10
      // 178: checkcast kotlinx/serialization/json/JsonElement
      // 17b: astore 10
      // 17d: aload 10
      // 17f: ifnonnull 19c
      // 182: iload 6
      // 184: istore 2
      // 185: aload 9
      // 187: invokevirtual java/io/File.exists ()Z
      // 18a: bipush 1
      // 18b: if_icmpne 190
      // 18e: bipush 1
      // 18f: istore 2
      // 190: iload 2
      // 191: ifeq 19a
      // 194: aload 9
      // 196: invokevirtual java/io/File.delete ()Z
      // 199: pop
      // 19a: aconst_null
      // 19b: areturn
      // 19c: aload 9
      // 19e: astore 1
      // 19f: aload 11
      // 1a1: invokestatic ia/g.o (Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonObject;
      // 1a4: invokestatic m8/q.x (Ljava/util/Map;)Ljava/util/Map;
      // 1a7: astore 8
      // 1a9: aload 9
      // 1ab: astore 1
      // 1ac: new kotlinx/serialization/json/JsonArray
      // 1af: astore 12
      // 1b1: aload 9
      // 1b3: astore 1
      // 1b4: aload 12
      // 1b6: aload 10
      // 1b8: invokestatic kotlin/collections/i.e (Ljava/lang/Object;)Ljava/util/List;
      // 1bb: invokespecial kotlinx/serialization/json/JsonArray.<init> (Ljava/util/List;)V
      // 1be: aload 9
      // 1c0: astore 1
      // 1c1: aload 8
      // 1c3: ldc "samples"
      // 1c5: aload 12
      // 1c7: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 1cc: pop
      // 1cd: aload 9
      // 1cf: astore 1
      // 1d0: aload 11
      // 1d2: invokestatic ia/g.o (Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonObject;
      // 1d5: ldc "stackFrames"
      // 1d7: invokevirtual kotlinx/serialization/json/JsonObject.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 1da: checkcast kotlinx/serialization/json/JsonElement
      // 1dd: astore 11
      // 1df: aload 11
      // 1e1: ifnull 2d7
      // 1e4: aload 9
      // 1e6: astore 1
      // 1e7: aload 11
      // 1e9: invokestatic ia/g.o (Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonObject;
      // 1ec: astore 12
      // 1ee: aload 12
      // 1f0: ifnull 2d7
      // 1f3: aload 9
      // 1f5: astore 1
      // 1f6: aload 10
      // 1f8: invokestatic ia/g.o (Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonObject;
      // 1fb: ldc "sf"
      // 1fd: invokevirtual kotlinx/serialization/json/JsonObject.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 200: astore 10
      // 202: aload 9
      // 204: astore 1
      // 205: aload 10
      // 207: invokestatic kotlin/jvm/internal/q.e (Ljava/lang/Object;)V
      // 20a: aload 9
      // 20c: astore 1
      // 20d: aload 10
      // 20f: checkcast kotlinx/serialization/json/JsonElement
      // 212: invokestatic ia/g.p (Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonPrimitive;
      // 215: invokestatic ia/g.m (Lkotlinx/serialization/json/JsonPrimitive;)Ljava/lang/Integer;
      // 218: astore 11
      // 21a: aload 11
      // 21c: ifnull 2d7
      // 21f: aload 9
      // 221: astore 1
      // 222: new java/util/LinkedHashMap
      // 225: astore 10
      // 227: aload 9
      // 229: astore 1
      // 22a: aload 10
      // 22c: invokespecial java/util/LinkedHashMap.<init> ()V
      // 22f: aload 9
      // 231: astore 1
      // 232: aload 12
      // 234: invokeinterface java/util/Map.entrySet ()Ljava/util/Set; 1
      // 239: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 23e: astore 12
      // 240: aload 9
      // 242: astore 1
      // 243: aload 12
      // 245: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 24a: ifeq 2b6
      // 24d: aload 9
      // 24f: astore 1
      // 250: aload 12
      // 252: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 257: checkcast java/util/Map$Entry
      // 25a: astore 14
      // 25c: aload 9
      // 25e: astore 1
      // 25f: aload 14
      // 261: invokeinterface java/util/Map$Entry.getKey ()Ljava/lang/Object; 1
      // 266: checkcast java/lang/String
      // 269: invokestatic kotlin/text/h.m (Ljava/lang/String;)Ljava/lang/Integer;
      // 26c: astore 13
      // 26e: aload 13
      // 270: ifnull 294
      // 273: aload 9
      // 275: astore 1
      // 276: aload 13
      // 278: invokevirtual java/lang/Number.intValue ()I
      // 27b: aload 11
      // 27d: invokevirtual java/lang/Integer.intValue ()I
      // 280: if_icmpgt 288
      // 283: bipush 1
      // 284: istore 2
      // 285: goto 28a
      // 288: bipush 0
      // 289: istore 2
      // 28a: iload 2
      // 28b: bipush 1
      // 28c: if_icmpne 294
      // 28f: bipush 1
      // 290: istore 2
      // 291: goto 296
      // 294: bipush 0
      // 295: istore 2
      // 296: iload 2
      // 297: ifeq 240
      // 29a: aload 9
      // 29c: astore 1
      // 29d: aload 10
      // 29f: aload 14
      // 2a1: invokeinterface java/util/Map$Entry.getKey ()Ljava/lang/Object; 1
      // 2a6: aload 14
      // 2a8: invokeinterface java/util/Map$Entry.getValue ()Ljava/lang/Object; 1
      // 2ad: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 2b2: pop
      // 2b3: goto 240
      // 2b6: aload 9
      // 2b8: astore 1
      // 2b9: new kotlinx/serialization/json/JsonObject
      // 2bc: astore 11
      // 2be: aload 9
      // 2c0: astore 1
      // 2c1: aload 11
      // 2c3: aload 10
      // 2c5: invokespecial kotlinx/serialization/json/JsonObject.<init> (Ljava/util/Map;)V
      // 2c8: aload 9
      // 2ca: astore 1
      // 2cb: aload 8
      // 2cd: ldc "stackFrames"
      // 2cf: aload 11
      // 2d1: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 2d6: pop
      // 2d7: aload 9
      // 2d9: astore 1
      // 2da: getstatic kotlinx/serialization/json/Json.d Lkotlinx/serialization/json/Json$a;
      // 2dd: astore 12
      // 2df: aload 9
      // 2e1: astore 1
      // 2e2: getstatic kotlinx/serialization/json/JsonObject.Companion Lkotlinx/serialization/json/JsonObject$Companion;
      // 2e5: invokevirtual kotlinx/serialization/json/JsonObject$Companion.serializer ()Lkotlinx/serialization/KSerializer;
      // 2e8: astore 11
      // 2ea: aload 9
      // 2ec: astore 1
      // 2ed: new kotlinx/serialization/json/JsonObject
      // 2f0: astore 10
      // 2f2: aload 9
      // 2f4: astore 1
      // 2f5: aload 10
      // 2f7: aload 8
      // 2f9: invokespecial kotlinx/serialization/json/JsonObject.<init> (Ljava/util/Map;)V
      // 2fc: aload 9
      // 2fe: astore 1
      // 2ff: aload 12
      // 301: aload 11
      // 303: aload 10
      // 305: invokevirtual kotlinx/serialization/json/Json.c (Lea/h;Ljava/lang/Object;)Ljava/lang/String;
      // 308: astore 8
      // 30a: iload 5
      // 30c: istore 2
      // 30d: aload 9
      // 30f: invokevirtual java/io/File.exists ()Z
      // 312: bipush 1
      // 313: if_icmpne 318
      // 316: bipush 1
      // 317: istore 2
      // 318: iload 2
      // 319: ifeq 322
      // 31c: aload 9
      // 31e: invokevirtual java/io/File.delete ()Z
      // 321: pop
      // 322: aload 8
      // 324: areturn
      // 325: aload 9
      // 327: invokevirtual java/io/File.exists ()Z
      // 32a: bipush 1
      // 32b: if_icmpne 334
      // 32e: aload 9
      // 330: invokevirtual java/io/File.delete ()Z
      // 333: pop
      // 334: aconst_null
      // 335: areturn
      // 336: astore 1
      // 337: goto 36d
      // 33a: astore 10
      // 33c: aconst_null
      // 33d: astore 8
      // 33f: aload 8
      // 341: astore 1
      // 342: getstatic com/discord/crash_reporting/CrashReporting.INSTANCE Lcom/discord/crash_reporting/CrashReporting;
      // 345: aload 10
      // 347: bipush 0
      // 348: bipush 2
      // 349: aconst_null
      // 34a: invokestatic com/discord/crash_reporting/CrashReporting.captureException$default (Lcom/discord/crash_reporting/CrashReporting;Ljava/lang/Throwable;ZILjava/lang/Object;)V
      // 34d: iload 3
      // 34e: istore 2
      // 34f: aload 8
      // 351: ifnull 361
      // 354: iload 3
      // 355: istore 2
      // 356: aload 8
      // 358: invokevirtual java/io/File.exists ()Z
      // 35b: bipush 1
      // 35c: if_icmpne 361
      // 35f: bipush 1
      // 360: istore 2
      // 361: iload 2
      // 362: ifeq 36b
      // 365: aload 8
      // 367: invokevirtual java/io/File.delete ()Z
      // 36a: pop
      // 36b: aconst_null
      // 36c: areturn
      // 36d: iload 4
      // 36f: istore 2
      // 370: aload 8
      // 372: ifnull 383
      // 375: iload 4
      // 377: istore 2
      // 378: aload 8
      // 37a: invokevirtual java/io/File.exists ()Z
      // 37d: bipush 1
      // 37e: if_icmpne 383
      // 381: bipush 1
      // 382: istore 2
      // 383: iload 2
      // 384: ifeq 38d
      // 387: aload 8
      // 389: invokevirtual java/io/File.delete ()Z
      // 38c: pop
      // 38d: aload 1
      // 38e: athrow
   }
}

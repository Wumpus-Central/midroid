package com.discord.js_watchdog

import N9.b
import N9.c
import java.io.File
import java.io.FileInputStream

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
      //
      // Bytecode:
      // 000: aload 1
      // 001: ldc "cacheDir"
      // 003: invokestatic kotlin/jvm/internal/r.h (Ljava/lang/Object;Ljava/lang/String;)V
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
      // 03b: invokestatic kotlin/jvm/internal/r.g (Ljava/lang/Object;Ljava/lang/String;)V
      // 03e: aload 9
      // 040: astore 1
      // 041: aload 8
      // 043: invokestatic com/facebook/hermes/instrumentation/HermesSamplingProfiler.dumpSampledTraceToFile (Ljava/lang/String;)V
      // 046: aload 9
      // 048: astore 1
      // 049: aload 9
      // 04b: invokestatic kotlin/jvm/internal/r.e (Ljava/lang/Object;)V
      // 04e: aload 9
      // 050: astore 1
      // 051: aload 0
      // 052: aload 9
      // 054: invokespecial com/discord/js_watchdog/HermesSamplingProfilerUtil.readFile (Ljava/io/File;)Ljava/lang/String;
      // 057: astore 8
      // 059: aload 9
      // 05b: astore 1
      // 05c: getstatic kotlinx/serialization/json/Json.d Lkotlinx/serialization/json/Json$a;
      // 05f: aload 8
      // 061: invokevirtual kotlinx/serialization/json/Json.g (Ljava/lang/String;)Lkotlinx/serialization/json/JsonElement;
      // 064: astore 11
      // 066: aload 9
      // 068: astore 1
      // 069: aload 11
      // 06b: invokestatic yb/g.o (Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonObject;
      // 06e: ldc "samples"
      // 070: invokevirtual kotlinx/serialization/json/JsonObject.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 073: checkcast kotlinx/serialization/json/JsonElement
      // 076: astore 8
      // 078: aload 8
      // 07a: ifnull 09e
      // 07d: aload 9
      // 07f: astore 1
      // 080: aload 8
      // 082: invokestatic yb/g.n (Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonArray;
      // 085: astore 8
      // 087: goto 0a1
      // 08a: astore 8
      // 08c: aload 1
      // 08d: astore 9
      // 08f: aload 8
      // 091: astore 1
      // 092: goto 379
      // 095: astore 10
      // 097: aload 9
      // 099: astore 8
      // 09b: goto 34b
      // 09e: aconst_null
      // 09f: astore 8
      // 0a1: aload 8
      // 0a3: ifnull 32d
      // 0a6: aload 9
      // 0a8: astore 1
      // 0a9: aload 8
      // 0ab: invokeinterface java/util/Collection.isEmpty ()Z 1
      // 0b0: istore 7
      // 0b2: iload 7
      // 0b4: ifeq 0ba
      // 0b7: goto 32d
      // 0ba: getstatic kotlin/Result.k Lkotlin/Result$a;
      // 0bd: astore 1
      // 0be: aload 8
      // 0c0: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 0c5: astore 10
      // 0c7: aload 10
      // 0c9: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 0ce: ifeq 136
      // 0d1: aload 10
      // 0d3: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0d8: checkcast kotlinx/serialization/json/JsonElement
      // 0db: astore 1
      // 0dc: aload 1
      // 0dd: invokestatic yb/g.o (Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonObject;
      // 0e0: ldc "sf"
      // 0e2: invokevirtual kotlinx/serialization/json/JsonObject.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 0e5: checkcast kotlinx/serialization/json/JsonElement
      // 0e8: astore 8
      // 0ea: aload 8
      // 0ec: ifnull 115
      // 0ef: aload 8
      // 0f1: invokestatic yb/g.p (Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonPrimitive;
      // 0f4: astore 8
      // 0f6: aload 8
      // 0f8: ifnull 115
      // 0fb: aload 8
      // 0fd: invokestatic yb/g.m (Lkotlinx/serialization/json/JsonPrimitive;)Ljava/lang/Integer;
      // 100: astore 8
      // 102: aload 8
      // 104: ifnull 115
      // 107: aload 8
      // 109: invokevirtual java/lang/Integer.intValue ()I
      // 10c: istore 2
      // 10d: goto 117
      // 110: astore 8
      // 112: goto 154
      // 115: bipush -1
      // 116: istore 2
      // 117: iload 2
      // 118: bipush 1
      // 119: if_icmple 121
      // 11c: bipush 1
      // 11d: istore 2
      // 11e: goto 123
      // 121: bipush 0
      // 122: istore 2
      // 123: iload 2
      // 124: ifeq 12a
      // 127: goto 12c
      // 12a: aconst_null
      // 12b: astore 1
      // 12c: aload 1
      // 12d: astore 8
      // 12f: aload 1
      // 130: ifnonnull 139
      // 133: goto 0c7
      // 136: aconst_null
      // 137: astore 8
      // 139: aload 8
      // 13b: ifnull 148
      // 13e: aload 8
      // 140: invokestatic kotlin/Result.b (Ljava/lang/Object;)Ljava/lang/Object;
      // 143: astore 8
      // 145: goto 169
      // 148: new java/util/NoSuchElementException
      // 14b: astore 1
      // 14c: aload 1
      // 14d: ldc "No element of the collection was transformed to a non-null value."
      // 14f: invokespecial java/util/NoSuchElementException.<init> (Ljava/lang/String;)V
      // 152: aload 1
      // 153: athrow
      // 154: aload 9
      // 156: astore 1
      // 157: getstatic kotlin/Result.k Lkotlin/Result$a;
      // 15a: astore 10
      // 15c: aload 9
      // 15e: astore 1
      // 15f: aload 8
      // 161: invokestatic kotlin/c.a (Ljava/lang/Throwable;)Ljava/lang/Object;
      // 164: invokestatic kotlin/Result.b (Ljava/lang/Object;)Ljava/lang/Object;
      // 167: astore 8
      // 169: aload 9
      // 16b: astore 1
      // 16c: aload 8
      // 16e: astore 10
      // 170: aload 8
      // 172: invokestatic kotlin/Result.g (Ljava/lang/Object;)Z
      // 175: ifeq 17b
      // 178: aconst_null
      // 179: astore 10
      // 17b: aload 9
      // 17d: astore 1
      // 17e: aload 10
      // 180: checkcast kotlinx/serialization/json/JsonElement
      // 183: astore 10
      // 185: aload 10
      // 187: ifnonnull 1a4
      // 18a: iload 6
      // 18c: istore 2
      // 18d: aload 9
      // 18f: invokevirtual java/io/File.exists ()Z
      // 192: bipush 1
      // 193: if_icmpne 198
      // 196: bipush 1
      // 197: istore 2
      // 198: iload 2
      // 199: ifeq 1a2
      // 19c: aload 9
      // 19e: invokevirtual java/io/File.delete ()Z
      // 1a1: pop
      // 1a2: aconst_null
      // 1a3: areturn
      // 1a4: aload 9
      // 1a6: astore 1
      // 1a7: aload 11
      // 1a9: invokestatic yb/g.o (Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonObject;
      // 1ac: invokestatic C9/q.x (Ljava/util/Map;)Ljava/util/Map;
      // 1af: astore 8
      // 1b1: aload 9
      // 1b3: astore 1
      // 1b4: new kotlinx/serialization/json/JsonArray
      // 1b7: astore 12
      // 1b9: aload 9
      // 1bb: astore 1
      // 1bc: aload 12
      // 1be: aload 10
      // 1c0: invokestatic kotlin/collections/i.e (Ljava/lang/Object;)Ljava/util/List;
      // 1c3: invokespecial kotlinx/serialization/json/JsonArray.<init> (Ljava/util/List;)V
      // 1c6: aload 9
      // 1c8: astore 1
      // 1c9: aload 8
      // 1cb: ldc "samples"
      // 1cd: aload 12
      // 1cf: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 1d4: pop
      // 1d5: aload 9
      // 1d7: astore 1
      // 1d8: aload 11
      // 1da: invokestatic yb/g.o (Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonObject;
      // 1dd: ldc "stackFrames"
      // 1df: invokevirtual kotlinx/serialization/json/JsonObject.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 1e2: checkcast kotlinx/serialization/json/JsonElement
      // 1e5: astore 11
      // 1e7: aload 11
      // 1e9: ifnull 2df
      // 1ec: aload 9
      // 1ee: astore 1
      // 1ef: aload 11
      // 1f1: invokestatic yb/g.o (Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonObject;
      // 1f4: astore 12
      // 1f6: aload 12
      // 1f8: ifnull 2df
      // 1fb: aload 9
      // 1fd: astore 1
      // 1fe: aload 10
      // 200: invokestatic yb/g.o (Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonObject;
      // 203: ldc "sf"
      // 205: invokevirtual kotlinx/serialization/json/JsonObject.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 208: astore 10
      // 20a: aload 9
      // 20c: astore 1
      // 20d: aload 10
      // 20f: invokestatic kotlin/jvm/internal/r.e (Ljava/lang/Object;)V
      // 212: aload 9
      // 214: astore 1
      // 215: aload 10
      // 217: checkcast kotlinx/serialization/json/JsonElement
      // 21a: invokestatic yb/g.p (Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonPrimitive;
      // 21d: invokestatic yb/g.m (Lkotlinx/serialization/json/JsonPrimitive;)Ljava/lang/Integer;
      // 220: astore 11
      // 222: aload 11
      // 224: ifnull 2df
      // 227: aload 9
      // 229: astore 1
      // 22a: new java/util/LinkedHashMap
      // 22d: astore 10
      // 22f: aload 9
      // 231: astore 1
      // 232: aload 10
      // 234: invokespecial java/util/LinkedHashMap.<init> ()V
      // 237: aload 9
      // 239: astore 1
      // 23a: aload 12
      // 23c: invokeinterface java/util/Map.entrySet ()Ljava/util/Set; 1
      // 241: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 246: astore 14
      // 248: aload 9
      // 24a: astore 1
      // 24b: aload 14
      // 24d: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 252: ifeq 2be
      // 255: aload 9
      // 257: astore 1
      // 258: aload 14
      // 25a: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 25f: checkcast java/util/Map$Entry
      // 262: astore 12
      // 264: aload 9
      // 266: astore 1
      // 267: aload 12
      // 269: invokeinterface java/util/Map$Entry.getKey ()Ljava/lang/Object; 1
      // 26e: checkcast java/lang/String
      // 271: invokestatic kotlin/text/h.m (Ljava/lang/String;)Ljava/lang/Integer;
      // 274: astore 13
      // 276: aload 13
      // 278: ifnull 29c
      // 27b: aload 9
      // 27d: astore 1
      // 27e: aload 13
      // 280: invokevirtual java/lang/Number.intValue ()I
      // 283: aload 11
      // 285: invokevirtual java/lang/Integer.intValue ()I
      // 288: if_icmpgt 290
      // 28b: bipush 1
      // 28c: istore 2
      // 28d: goto 292
      // 290: bipush 0
      // 291: istore 2
      // 292: iload 2
      // 293: bipush 1
      // 294: if_icmpne 29c
      // 297: bipush 1
      // 298: istore 2
      // 299: goto 29e
      // 29c: bipush 0
      // 29d: istore 2
      // 29e: iload 2
      // 29f: ifeq 248
      // 2a2: aload 9
      // 2a4: astore 1
      // 2a5: aload 10
      // 2a7: aload 12
      // 2a9: invokeinterface java/util/Map$Entry.getKey ()Ljava/lang/Object; 1
      // 2ae: aload 12
      // 2b0: invokeinterface java/util/Map$Entry.getValue ()Ljava/lang/Object; 1
      // 2b5: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 2ba: pop
      // 2bb: goto 248
      // 2be: aload 9
      // 2c0: astore 1
      // 2c1: new kotlinx/serialization/json/JsonObject
      // 2c4: astore 11
      // 2c6: aload 9
      // 2c8: astore 1
      // 2c9: aload 11
      // 2cb: aload 10
      // 2cd: invokespecial kotlinx/serialization/json/JsonObject.<init> (Ljava/util/Map;)V
      // 2d0: aload 9
      // 2d2: astore 1
      // 2d3: aload 8
      // 2d5: ldc "stackFrames"
      // 2d7: aload 11
      // 2d9: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 2de: pop
      // 2df: aload 9
      // 2e1: astore 1
      // 2e2: getstatic kotlinx/serialization/json/Json.d Lkotlinx/serialization/json/Json$a;
      // 2e5: astore 11
      // 2e7: aload 9
      // 2e9: astore 1
      // 2ea: getstatic kotlinx/serialization/json/JsonObject.Companion Lkotlinx/serialization/json/JsonObject$Companion;
      // 2ed: invokevirtual kotlinx/serialization/json/JsonObject$Companion.serializer ()Lkotlinx/serialization/KSerializer;
      // 2f0: astore 12
      // 2f2: aload 9
      // 2f4: astore 1
      // 2f5: new kotlinx/serialization/json/JsonObject
      // 2f8: astore 10
      // 2fa: aload 9
      // 2fc: astore 1
      // 2fd: aload 10
      // 2ff: aload 8
      // 301: invokespecial kotlinx/serialization/json/JsonObject.<init> (Ljava/util/Map;)V
      // 304: aload 9
      // 306: astore 1
      // 307: aload 11
      // 309: aload 12
      // 30b: aload 10
      // 30d: invokevirtual kotlinx/serialization/json/Json.c (Lub/i;Ljava/lang/Object;)Ljava/lang/String;
      // 310: astore 8
      // 312: iload 5
      // 314: istore 2
      // 315: aload 9
      // 317: invokevirtual java/io/File.exists ()Z
      // 31a: bipush 1
      // 31b: if_icmpne 320
      // 31e: bipush 1
      // 31f: istore 2
      // 320: iload 2
      // 321: ifeq 32a
      // 324: aload 9
      // 326: invokevirtual java/io/File.delete ()Z
      // 329: pop
      // 32a: aload 8
      // 32c: areturn
      // 32d: aload 9
      // 32f: invokevirtual java/io/File.exists ()Z
      // 332: bipush 1
      // 333: if_icmpne 33c
      // 336: aload 9
      // 338: invokevirtual java/io/File.delete ()Z
      // 33b: pop
      // 33c: aconst_null
      // 33d: areturn
      // 33e: astore 1
      // 33f: aload 8
      // 341: astore 9
      // 343: goto 379
      // 346: astore 10
      // 348: aconst_null
      // 349: astore 8
      // 34b: aload 8
      // 34d: astore 1
      // 34e: getstatic com/discord/crash_reporting/CrashReporting.INSTANCE Lcom/discord/crash_reporting/CrashReporting;
      // 351: aload 10
      // 353: bipush 0
      // 354: bipush 2
      // 355: aconst_null
      // 356: invokestatic com/discord/crash_reporting/CrashReporting.captureException$default (Lcom/discord/crash_reporting/CrashReporting;Ljava/lang/Throwable;ZILjava/lang/Object;)V
      // 359: iload 3
      // 35a: istore 2
      // 35b: aload 8
      // 35d: ifnull 36d
      // 360: iload 3
      // 361: istore 2
      // 362: aload 8
      // 364: invokevirtual java/io/File.exists ()Z
      // 367: bipush 1
      // 368: if_icmpne 36d
      // 36b: bipush 1
      // 36c: istore 2
      // 36d: iload 2
      // 36e: ifeq 377
      // 371: aload 8
      // 373: invokevirtual java/io/File.delete ()Z
      // 376: pop
      // 377: aconst_null
      // 378: areturn
      // 379: iload 4
      // 37b: istore 2
      // 37c: aload 9
      // 37e: ifnull 38f
      // 381: iload 4
      // 383: istore 2
      // 384: aload 9
      // 386: invokevirtual java/io/File.exists ()Z
      // 389: bipush 1
      // 38a: if_icmpne 38f
      // 38d: bipush 1
      // 38e: istore 2
      // 38f: iload 2
      // 390: ifeq 399
      // 393: aload 9
      // 395: invokevirtual java/io/File.delete ()Z
      // 398: pop
      // 399: aload 1
      // 39a: athrow
   }
}

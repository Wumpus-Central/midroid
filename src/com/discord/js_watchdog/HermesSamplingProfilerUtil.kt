package com.discord.js_watchdog

import java.io.File
import java.io.FileInputStream
import s8.b
import s8.c

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
      // 00a: istore 4
      // 00c: bipush 0
      // 00d: istore 3
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
      // 032: invokestatic com/facebook/hermes/instrumentation/HermesSamplingProfiler.dumpSampledTraceToFile (Ljava/lang/String;)V
      // 035: aload 9
      // 037: astore 1
      // 038: aload 0
      // 039: aload 9
      // 03b: invokespecial com/discord/js_watchdog/HermesSamplingProfilerUtil.readFile (Ljava/io/File;)Ljava/lang/String;
      // 03e: astore 8
      // 040: aload 9
      // 042: astore 1
      // 043: getstatic kotlinx/serialization/json/Json.d Lkotlinx/serialization/json/Json$a;
      // 046: aload 8
      // 048: invokevirtual kotlinx/serialization/json/Json.g (Ljava/lang/String;)Lkotlinx/serialization/json/JsonElement;
      // 04b: astore 11
      // 04d: aload 9
      // 04f: astore 1
      // 050: aload 11
      // 052: invokestatic ea/g.o (Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonObject;
      // 055: ldc "samples"
      // 057: invokevirtual kotlinx/serialization/json/JsonObject.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 05a: checkcast kotlinx/serialization/json/JsonElement
      // 05d: astore 8
      // 05f: aload 8
      // 061: ifnull 085
      // 064: aload 9
      // 066: astore 1
      // 067: aload 8
      // 069: invokestatic ea/g.n (Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonArray;
      // 06c: astore 8
      // 06e: goto 088
      // 071: astore 9
      // 073: aload 1
      // 074: astore 8
      // 076: aload 9
      // 078: astore 1
      // 079: goto 35e
      // 07c: astore 10
      // 07e: aload 9
      // 080: astore 8
      // 082: goto 32e
      // 085: aconst_null
      // 086: astore 8
      // 088: aload 8
      // 08a: ifnull 314
      // 08d: aload 9
      // 08f: astore 1
      // 090: aload 8
      // 092: invokeinterface java/util/Collection.isEmpty ()Z 1
      // 097: istore 7
      // 099: iload 7
      // 09b: ifeq 0a1
      // 09e: goto 314
      // 0a1: getstatic h8/r.k Lh8/r$a;
      // 0a4: astore 1
      // 0a5: aload 8
      // 0a7: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 0ac: astore 10
      // 0ae: aload 10
      // 0b0: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 0b5: ifeq 11d
      // 0b8: aload 10
      // 0ba: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0bf: checkcast kotlinx/serialization/json/JsonElement
      // 0c2: astore 1
      // 0c3: aload 1
      // 0c4: invokestatic ea/g.o (Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonObject;
      // 0c7: ldc "sf"
      // 0c9: invokevirtual kotlinx/serialization/json/JsonObject.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 0cc: checkcast kotlinx/serialization/json/JsonElement
      // 0cf: astore 8
      // 0d1: aload 8
      // 0d3: ifnull 0fc
      // 0d6: aload 8
      // 0d8: invokestatic ea/g.p (Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonPrimitive;
      // 0db: astore 8
      // 0dd: aload 8
      // 0df: ifnull 0fc
      // 0e2: aload 8
      // 0e4: invokestatic ea/g.m (Lkotlinx/serialization/json/JsonPrimitive;)Ljava/lang/Integer;
      // 0e7: astore 8
      // 0e9: aload 8
      // 0eb: ifnull 0fc
      // 0ee: aload 8
      // 0f0: invokevirtual java/lang/Integer.intValue ()I
      // 0f3: istore 2
      // 0f4: goto 0fe
      // 0f7: astore 8
      // 0f9: goto 13b
      // 0fc: bipush -1
      // 0fd: istore 2
      // 0fe: iload 2
      // 0ff: bipush 1
      // 100: if_icmple 108
      // 103: bipush 1
      // 104: istore 2
      // 105: goto 10a
      // 108: bipush 0
      // 109: istore 2
      // 10a: iload 2
      // 10b: ifeq 111
      // 10e: goto 113
      // 111: aconst_null
      // 112: astore 1
      // 113: aload 1
      // 114: astore 8
      // 116: aload 1
      // 117: ifnonnull 120
      // 11a: goto 0ae
      // 11d: aconst_null
      // 11e: astore 8
      // 120: aload 8
      // 122: ifnull 12f
      // 125: aload 8
      // 127: invokestatic h8/r.b (Ljava/lang/Object;)Ljava/lang/Object;
      // 12a: astore 8
      // 12c: goto 150
      // 12f: new java/util/NoSuchElementException
      // 132: astore 1
      // 133: aload 1
      // 134: ldc "No element of the collection was transformed to a non-null value."
      // 136: invokespecial java/util/NoSuchElementException.<init> (Ljava/lang/String;)V
      // 139: aload 1
      // 13a: athrow
      // 13b: aload 9
      // 13d: astore 1
      // 13e: getstatic h8/r.k Lh8/r$a;
      // 141: astore 10
      // 143: aload 9
      // 145: astore 1
      // 146: aload 8
      // 148: invokestatic h8/s.a (Ljava/lang/Throwable;)Ljava/lang/Object;
      // 14b: invokestatic h8/r.b (Ljava/lang/Object;)Ljava/lang/Object;
      // 14e: astore 8
      // 150: aload 9
      // 152: astore 1
      // 153: aload 8
      // 155: astore 10
      // 157: aload 8
      // 159: invokestatic h8/r.g (Ljava/lang/Object;)Z
      // 15c: ifeq 162
      // 15f: aconst_null
      // 160: astore 10
      // 162: aload 9
      // 164: astore 1
      // 165: aload 10
      // 167: checkcast kotlinx/serialization/json/JsonElement
      // 16a: astore 10
      // 16c: aload 10
      // 16e: ifnonnull 18b
      // 171: iload 6
      // 173: istore 2
      // 174: aload 9
      // 176: invokevirtual java/io/File.exists ()Z
      // 179: bipush 1
      // 17a: if_icmpne 17f
      // 17d: bipush 1
      // 17e: istore 2
      // 17f: iload 2
      // 180: ifeq 189
      // 183: aload 9
      // 185: invokevirtual java/io/File.delete ()Z
      // 188: pop
      // 189: aconst_null
      // 18a: areturn
      // 18b: aload 9
      // 18d: astore 1
      // 18e: aload 11
      // 190: invokestatic ea/g.o (Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonObject;
      // 193: invokestatic i8/q.x (Ljava/util/Map;)Ljava/util/Map;
      // 196: astore 8
      // 198: aload 9
      // 19a: astore 1
      // 19b: new kotlinx/serialization/json/JsonArray
      // 19e: astore 12
      // 1a0: aload 9
      // 1a2: astore 1
      // 1a3: aload 12
      // 1a5: aload 10
      // 1a7: invokestatic kotlin/collections/i.e (Ljava/lang/Object;)Ljava/util/List;
      // 1aa: invokespecial kotlinx/serialization/json/JsonArray.<init> (Ljava/util/List;)V
      // 1ad: aload 9
      // 1af: astore 1
      // 1b0: aload 8
      // 1b2: ldc "samples"
      // 1b4: aload 12
      // 1b6: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 1bb: pop
      // 1bc: aload 9
      // 1be: astore 1
      // 1bf: aload 11
      // 1c1: invokestatic ea/g.o (Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonObject;
      // 1c4: ldc "stackFrames"
      // 1c6: invokevirtual kotlinx/serialization/json/JsonObject.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 1c9: checkcast kotlinx/serialization/json/JsonElement
      // 1cc: astore 11
      // 1ce: aload 11
      // 1d0: ifnull 2c6
      // 1d3: aload 9
      // 1d5: astore 1
      // 1d6: aload 11
      // 1d8: invokestatic ea/g.o (Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonObject;
      // 1db: astore 12
      // 1dd: aload 12
      // 1df: ifnull 2c6
      // 1e2: aload 9
      // 1e4: astore 1
      // 1e5: aload 10
      // 1e7: invokestatic ea/g.o (Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonObject;
      // 1ea: ldc "sf"
      // 1ec: invokevirtual kotlinx/serialization/json/JsonObject.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 1ef: astore 10
      // 1f1: aload 9
      // 1f3: astore 1
      // 1f4: aload 10
      // 1f6: invokestatic kotlin/jvm/internal/q.e (Ljava/lang/Object;)V
      // 1f9: aload 9
      // 1fb: astore 1
      // 1fc: aload 10
      // 1fe: checkcast kotlinx/serialization/json/JsonElement
      // 201: invokestatic ea/g.p (Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonPrimitive;
      // 204: invokestatic ea/g.m (Lkotlinx/serialization/json/JsonPrimitive;)Ljava/lang/Integer;
      // 207: astore 11
      // 209: aload 11
      // 20b: ifnull 2c6
      // 20e: aload 9
      // 210: astore 1
      // 211: new java/util/LinkedHashMap
      // 214: astore 10
      // 216: aload 9
      // 218: astore 1
      // 219: aload 10
      // 21b: invokespecial java/util/LinkedHashMap.<init> ()V
      // 21e: aload 9
      // 220: astore 1
      // 221: aload 12
      // 223: invokeinterface java/util/Map.entrySet ()Ljava/util/Set; 1
      // 228: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 22d: astore 14
      // 22f: aload 9
      // 231: astore 1
      // 232: aload 14
      // 234: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 239: ifeq 2a5
      // 23c: aload 9
      // 23e: astore 1
      // 23f: aload 14
      // 241: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 246: checkcast java/util/Map$Entry
      // 249: astore 12
      // 24b: aload 9
      // 24d: astore 1
      // 24e: aload 12
      // 250: invokeinterface java/util/Map$Entry.getKey ()Ljava/lang/Object; 1
      // 255: checkcast java/lang/String
      // 258: invokestatic kotlin/text/h.m (Ljava/lang/String;)Ljava/lang/Integer;
      // 25b: astore 13
      // 25d: aload 13
      // 25f: ifnull 283
      // 262: aload 9
      // 264: astore 1
      // 265: aload 13
      // 267: invokevirtual java/lang/Number.intValue ()I
      // 26a: aload 11
      // 26c: invokevirtual java/lang/Integer.intValue ()I
      // 26f: if_icmpgt 277
      // 272: bipush 1
      // 273: istore 2
      // 274: goto 279
      // 277: bipush 0
      // 278: istore 2
      // 279: iload 2
      // 27a: bipush 1
      // 27b: if_icmpne 283
      // 27e: bipush 1
      // 27f: istore 2
      // 280: goto 285
      // 283: bipush 0
      // 284: istore 2
      // 285: iload 2
      // 286: ifeq 22f
      // 289: aload 9
      // 28b: astore 1
      // 28c: aload 10
      // 28e: aload 12
      // 290: invokeinterface java/util/Map$Entry.getKey ()Ljava/lang/Object; 1
      // 295: aload 12
      // 297: invokeinterface java/util/Map$Entry.getValue ()Ljava/lang/Object; 1
      // 29c: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 2a1: pop
      // 2a2: goto 22f
      // 2a5: aload 9
      // 2a7: astore 1
      // 2a8: new kotlinx/serialization/json/JsonObject
      // 2ab: astore 11
      // 2ad: aload 9
      // 2af: astore 1
      // 2b0: aload 11
      // 2b2: aload 10
      // 2b4: invokespecial kotlinx/serialization/json/JsonObject.<init> (Ljava/util/Map;)V
      // 2b7: aload 9
      // 2b9: astore 1
      // 2ba: aload 8
      // 2bc: ldc "stackFrames"
      // 2be: aload 11
      // 2c0: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 2c5: pop
      // 2c6: aload 9
      // 2c8: astore 1
      // 2c9: getstatic kotlinx/serialization/json/Json.d Lkotlinx/serialization/json/Json$a;
      // 2cc: astore 12
      // 2ce: aload 9
      // 2d0: astore 1
      // 2d1: getstatic kotlinx/serialization/json/JsonObject.Companion Lkotlinx/serialization/json/JsonObject$Companion;
      // 2d4: invokevirtual kotlinx/serialization/json/JsonObject$Companion.serializer ()Lkotlinx/serialization/KSerializer;
      // 2d7: astore 11
      // 2d9: aload 9
      // 2db: astore 1
      // 2dc: new kotlinx/serialization/json/JsonObject
      // 2df: astore 10
      // 2e1: aload 9
      // 2e3: astore 1
      // 2e4: aload 10
      // 2e6: aload 8
      // 2e8: invokespecial kotlinx/serialization/json/JsonObject.<init> (Ljava/util/Map;)V
      // 2eb: aload 9
      // 2ed: astore 1
      // 2ee: aload 12
      // 2f0: aload 11
      // 2f2: aload 10
      // 2f4: invokevirtual kotlinx/serialization/json/Json.c (Laa/h;Ljava/lang/Object;)Ljava/lang/String;
      // 2f7: astore 8
      // 2f9: iload 5
      // 2fb: istore 2
      // 2fc: aload 9
      // 2fe: invokevirtual java/io/File.exists ()Z
      // 301: bipush 1
      // 302: if_icmpne 307
      // 305: bipush 1
      // 306: istore 2
      // 307: iload 2
      // 308: ifeq 311
      // 30b: aload 9
      // 30d: invokevirtual java/io/File.delete ()Z
      // 310: pop
      // 311: aload 8
      // 313: areturn
      // 314: aload 9
      // 316: invokevirtual java/io/File.exists ()Z
      // 319: bipush 1
      // 31a: if_icmpne 323
      // 31d: aload 9
      // 31f: invokevirtual java/io/File.delete ()Z
      // 322: pop
      // 323: aconst_null
      // 324: areturn
      // 325: astore 1
      // 326: goto 35e
      // 329: astore 10
      // 32b: aconst_null
      // 32c: astore 8
      // 32e: aload 8
      // 330: astore 1
      // 331: getstatic com/discord/crash_reporting/CrashReporting.INSTANCE Lcom/discord/crash_reporting/CrashReporting;
      // 334: aload 10
      // 336: bipush 0
      // 337: bipush 2
      // 338: aconst_null
      // 339: invokestatic com/discord/crash_reporting/CrashReporting.captureException$default (Lcom/discord/crash_reporting/CrashReporting;Ljava/lang/Throwable;ZILjava/lang/Object;)V
      // 33c: iload 4
      // 33e: istore 2
      // 33f: aload 8
      // 341: ifnull 352
      // 344: iload 4
      // 346: istore 2
      // 347: aload 8
      // 349: invokevirtual java/io/File.exists ()Z
      // 34c: bipush 1
      // 34d: if_icmpne 352
      // 350: bipush 1
      // 351: istore 2
      // 352: iload 2
      // 353: ifeq 35c
      // 356: aload 8
      // 358: invokevirtual java/io/File.delete ()Z
      // 35b: pop
      // 35c: aconst_null
      // 35d: areturn
      // 35e: iload 3
      // 35f: istore 2
      // 360: aload 8
      // 362: ifnull 372
      // 365: iload 3
      // 366: istore 2
      // 367: aload 8
      // 369: invokevirtual java/io/File.exists ()Z
      // 36c: bipush 1
      // 36d: if_icmpne 372
      // 370: bipush 1
      // 371: istore 2
      // 372: iload 2
      // 373: ifeq 37c
      // 376: aload 8
      // 378: invokevirtual java/io/File.delete ()Z
      // 37b: pop
      // 37c: aload 1
      // 37d: athrow
   }
}

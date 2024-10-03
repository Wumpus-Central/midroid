package com.discord.js_watchdog

import java.io.File
import java.io.FileInputStream
import vh.b
import vh.c

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
      // 044: invokestatic gl/g.o (Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonObject;
      // 047: ldc "samples"
      // 049: invokevirtual kotlinx/serialization/json/JsonObject.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 04c: checkcast kotlinx/serialization/json/JsonElement
      // 04f: astore 3
      // 050: aload 3
      // 051: ifnull 070
      // 054: aload 4
      // 056: astore 1
      // 057: aload 3
      // 058: invokestatic gl/g.n (Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonArray;
      // 05b: astore 3
      // 05c: goto 072
      // 05f: astore 3
      // 060: aload 1
      // 061: astore 4
      // 063: aload 3
      // 064: astore 1
      // 065: goto 2eb
      // 068: astore 5
      // 06a: aload 4
      // 06c: astore 3
      // 06d: goto 2cb
      // 070: aconst_null
      // 071: astore 3
      // 072: aload 3
      // 073: ifnull 2af
      // 076: aload 4
      // 078: astore 1
      // 079: aload 3
      // 07a: invokeinterface java/util/Collection.isEmpty ()Z 1
      // 07f: istore 2
      // 080: iload 2
      // 081: ifeq 087
      // 084: goto 2af
      // 087: getstatic kh/r.k Lkh/r$a;
      // 08a: astore 1
      // 08b: aload 3
      // 08c: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 091: astore 5
      // 093: aload 5
      // 095: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 09a: ifeq 0e6
      // 09d: aload 5
      // 09f: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0a4: checkcast kotlinx/serialization/json/JsonElement
      // 0a7: astore 1
      // 0a8: aload 1
      // 0a9: invokestatic gl/g.o (Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonObject;
      // 0ac: ldc "sf"
      // 0ae: invokevirtual kotlinx/serialization/json/JsonObject.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 0b1: checkcast kotlinx/serialization/json/JsonElement
      // 0b4: astore 3
      // 0b5: aload 3
      // 0b6: ifnull 0db
      // 0b9: aload 3
      // 0ba: invokestatic gl/g.p (Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonPrimitive;
      // 0bd: astore 3
      // 0be: aload 3
      // 0bf: ifnull 0db
      // 0c2: aload 3
      // 0c3: invokestatic gl/g.m (Lkotlinx/serialization/json/JsonPrimitive;)Ljava/lang/Integer;
      // 0c6: astore 3
      // 0c7: aload 3
      // 0c8: ifnull 0db
      // 0cb: aload 3
      // 0cc: invokevirtual java/lang/Integer.intValue ()I
      // 0cf: bipush 1
      // 0d0: if_icmple 0db
      // 0d3: goto 0dd
      // 0d6: astore 5
      // 0d8: goto 100
      // 0db: aconst_null
      // 0dc: astore 1
      // 0dd: aload 1
      // 0de: astore 3
      // 0df: aload 1
      // 0e0: ifnonnull 0e8
      // 0e3: goto 093
      // 0e6: aconst_null
      // 0e7: astore 3
      // 0e8: aload 3
      // 0e9: ifnull 0f4
      // 0ec: aload 3
      // 0ed: invokestatic kh/r.b (Ljava/lang/Object;)Ljava/lang/Object;
      // 0f0: astore 3
      // 0f1: goto 113
      // 0f4: new java/util/NoSuchElementException
      // 0f7: astore 1
      // 0f8: aload 1
      // 0f9: ldc "No element of the collection was transformed to a non-null value."
      // 0fb: invokespecial java/util/NoSuchElementException.<init> (Ljava/lang/String;)V
      // 0fe: aload 1
      // 0ff: athrow
      // 100: aload 4
      // 102: astore 1
      // 103: getstatic kh/r.k Lkh/r$a;
      // 106: astore 3
      // 107: aload 4
      // 109: astore 1
      // 10a: aload 5
      // 10c: invokestatic kh/s.a (Ljava/lang/Throwable;)Ljava/lang/Object;
      // 10f: invokestatic kh/r.b (Ljava/lang/Object;)Ljava/lang/Object;
      // 112: astore 3
      // 113: aload 4
      // 115: astore 1
      // 116: aload 3
      // 117: astore 5
      // 119: aload 3
      // 11a: invokestatic kh/r.g (Ljava/lang/Object;)Z
      // 11d: ifeq 123
      // 120: aconst_null
      // 121: astore 5
      // 123: aload 4
      // 125: astore 1
      // 126: aload 5
      // 128: checkcast kotlinx/serialization/json/JsonElement
      // 12b: astore 5
      // 12d: aload 5
      // 12f: ifnonnull 143
      // 132: aload 4
      // 134: invokevirtual java/io/File.exists ()Z
      // 137: bipush 1
      // 138: if_icmpne 141
      // 13b: aload 4
      // 13d: invokevirtual java/io/File.delete ()Z
      // 140: pop
      // 141: aconst_null
      // 142: areturn
      // 143: aload 4
      // 145: astore 1
      // 146: aload 6
      // 148: invokestatic gl/g.o (Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonObject;
      // 14b: invokestatic lh/r.x (Ljava/util/Map;)Ljava/util/Map;
      // 14e: astore 3
      // 14f: aload 4
      // 151: astore 1
      // 152: new kotlinx/serialization/json/JsonArray
      // 155: astore 7
      // 157: aload 4
      // 159: astore 1
      // 15a: aload 7
      // 15c: aload 5
      // 15e: invokestatic kotlin/collections/i.e (Ljava/lang/Object;)Ljava/util/List;
      // 161: invokespecial kotlinx/serialization/json/JsonArray.<init> (Ljava/util/List;)V
      // 164: aload 4
      // 166: astore 1
      // 167: aload 3
      // 168: ldc "samples"
      // 16a: aload 7
      // 16c: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 171: pop
      // 172: aload 4
      // 174: astore 1
      // 175: aload 6
      // 177: invokestatic gl/g.o (Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonObject;
      // 17a: ldc "stackFrames"
      // 17c: invokevirtual kotlinx/serialization/json/JsonObject.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 17f: checkcast kotlinx/serialization/json/JsonElement
      // 182: astore 6
      // 184: aload 6
      // 186: ifnull 26d
      // 189: aload 4
      // 18b: astore 1
      // 18c: aload 6
      // 18e: invokestatic gl/g.o (Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonObject;
      // 191: astore 7
      // 193: aload 7
      // 195: ifnull 26d
      // 198: aload 4
      // 19a: astore 1
      // 19b: aload 5
      // 19d: invokestatic gl/g.o (Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonObject;
      // 1a0: ldc "sf"
      // 1a2: invokevirtual kotlinx/serialization/json/JsonObject.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 1a5: astore 5
      // 1a7: aload 4
      // 1a9: astore 1
      // 1aa: aload 5
      // 1ac: invokestatic kotlin/jvm/internal/q.e (Ljava/lang/Object;)V
      // 1af: aload 4
      // 1b1: astore 1
      // 1b2: aload 5
      // 1b4: checkcast kotlinx/serialization/json/JsonElement
      // 1b7: invokestatic gl/g.p (Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonPrimitive;
      // 1ba: invokestatic gl/g.m (Lkotlinx/serialization/json/JsonPrimitive;)Ljava/lang/Integer;
      // 1bd: astore 6
      // 1bf: aload 6
      // 1c1: ifnull 26d
      // 1c4: aload 4
      // 1c6: astore 1
      // 1c7: aload 6
      // 1c9: invokevirtual java/lang/Number.intValue ()I
      // 1cc: pop
      // 1cd: aload 4
      // 1cf: astore 1
      // 1d0: new java/util/LinkedHashMap
      // 1d3: astore 5
      // 1d5: aload 4
      // 1d7: astore 1
      // 1d8: aload 5
      // 1da: invokespecial java/util/LinkedHashMap.<init> ()V
      // 1dd: aload 4
      // 1df: astore 1
      // 1e0: aload 7
      // 1e2: invokeinterface java/util/Map.entrySet ()Ljava/util/Set; 1
      // 1e7: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 1ec: astore 7
      // 1ee: aload 4
      // 1f0: astore 1
      // 1f1: aload 7
      // 1f3: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 1f8: ifeq 24d
      // 1fb: aload 4
      // 1fd: astore 1
      // 1fe: aload 7
      // 200: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 205: checkcast java/util/Map$Entry
      // 208: astore 9
      // 20a: aload 4
      // 20c: astore 1
      // 20d: aload 9
      // 20f: invokeinterface java/util/Map$Entry.getKey ()Ljava/lang/Object; 1
      // 214: checkcast java/lang/String
      // 217: invokestatic kotlin/text/h.m (Ljava/lang/String;)Ljava/lang/Integer;
      // 21a: astore 8
      // 21c: aload 8
      // 21e: ifnull 1ee
      // 221: aload 4
      // 223: astore 1
      // 224: aload 8
      // 226: invokevirtual java/lang/Number.intValue ()I
      // 229: aload 6
      // 22b: invokevirtual java/lang/Integer.intValue ()I
      // 22e: if_icmpgt 1ee
      // 231: aload 4
      // 233: astore 1
      // 234: aload 5
      // 236: aload 9
      // 238: invokeinterface java/util/Map$Entry.getKey ()Ljava/lang/Object; 1
      // 23d: aload 9
      // 23f: invokeinterface java/util/Map$Entry.getValue ()Ljava/lang/Object; 1
      // 244: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 249: pop
      // 24a: goto 1ee
      // 24d: aload 4
      // 24f: astore 1
      // 250: new kotlinx/serialization/json/JsonObject
      // 253: astore 6
      // 255: aload 4
      // 257: astore 1
      // 258: aload 6
      // 25a: aload 5
      // 25c: invokespecial kotlinx/serialization/json/JsonObject.<init> (Ljava/util/Map;)V
      // 25f: aload 4
      // 261: astore 1
      // 262: aload 3
      // 263: ldc "stackFrames"
      // 265: aload 6
      // 267: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 26c: pop
      // 26d: aload 4
      // 26f: astore 1
      // 270: getstatic kotlinx/serialization/json/Json.d Lkotlinx/serialization/json/Json$a;
      // 273: astore 7
      // 275: aload 4
      // 277: astore 1
      // 278: getstatic kotlinx/serialization/json/JsonObject.Companion Lkotlinx/serialization/json/JsonObject$Companion;
      // 27b: invokevirtual kotlinx/serialization/json/JsonObject$Companion.serializer ()Lkotlinx/serialization/KSerializer;
      // 27e: astore 5
      // 280: aload 4
      // 282: astore 1
      // 283: new kotlinx/serialization/json/JsonObject
      // 286: astore 6
      // 288: aload 4
      // 28a: astore 1
      // 28b: aload 6
      // 28d: aload 3
      // 28e: invokespecial kotlinx/serialization/json/JsonObject.<init> (Ljava/util/Map;)V
      // 291: aload 4
      // 293: astore 1
      // 294: aload 7
      // 296: aload 5
      // 298: aload 6
      // 29a: invokevirtual kotlinx/serialization/json/Json.c (Lcl/h;Ljava/lang/Object;)Ljava/lang/String;
      // 29d: astore 3
      // 29e: aload 4
      // 2a0: invokevirtual java/io/File.exists ()Z
      // 2a3: bipush 1
      // 2a4: if_icmpne 2ad
      // 2a7: aload 4
      // 2a9: invokevirtual java/io/File.delete ()Z
      // 2ac: pop
      // 2ad: aload 3
      // 2ae: areturn
      // 2af: aload 4
      // 2b1: invokevirtual java/io/File.exists ()Z
      // 2b4: bipush 1
      // 2b5: if_icmpne 2be
      // 2b8: aload 4
      // 2ba: invokevirtual java/io/File.delete ()Z
      // 2bd: pop
      // 2be: aconst_null
      // 2bf: areturn
      // 2c0: astore 1
      // 2c1: aload 3
      // 2c2: astore 4
      // 2c4: goto 2eb
      // 2c7: astore 5
      // 2c9: aconst_null
      // 2ca: astore 3
      // 2cb: aload 3
      // 2cc: astore 1
      // 2cd: getstatic com/discord/crash_reporting/CrashReporting.INSTANCE Lcom/discord/crash_reporting/CrashReporting;
      // 2d0: aload 5
      // 2d2: bipush 0
      // 2d3: bipush 2
      // 2d4: aconst_null
      // 2d5: invokestatic com/discord/crash_reporting/CrashReporting.captureException$default (Lcom/discord/crash_reporting/CrashReporting;Ljava/lang/Throwable;ZILjava/lang/Object;)V
      // 2d8: aload 3
      // 2d9: ifnull 2e9
      // 2dc: aload 3
      // 2dd: invokevirtual java/io/File.exists ()Z
      // 2e0: bipush 1
      // 2e1: if_icmpne 2e9
      // 2e4: aload 3
      // 2e5: invokevirtual java/io/File.delete ()Z
      // 2e8: pop
      // 2e9: aconst_null
      // 2ea: areturn
      // 2eb: aload 4
      // 2ed: ifnull 2ff
      // 2f0: aload 4
      // 2f2: invokevirtual java/io/File.exists ()Z
      // 2f5: bipush 1
      // 2f6: if_icmpne 2ff
      // 2f9: aload 4
      // 2fb: invokevirtual java/io/File.delete ()Z
      // 2fe: pop
      // 2ff: aload 1
      // 300: athrow
   }
}

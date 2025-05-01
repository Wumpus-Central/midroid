package com.discord.react_resource_cache

import android.content.Context
import android.content.SharedPreferences
import java.util.LinkedHashMap
import kotlin.jvm.internal.q

public abstract class ReactResourceCache<T extends java.lang.Enum<?>> {
   public abstract val cacheKey: String
   private final val lock: Any = new Object()
   private final var reactResources: MutableMap<String, String> = new LinkedHashMap()

   private final val cache: SharedPreferences
      private final get() {
         val var2: SharedPreferences = var1.getSharedPreferences(this.getCacheKey(), 0);
         q.g(var2, "getSharedPreferences(...)");
         return var2;
      }


   public fun get(context: Context, reactResource: Any): String {
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
      // 00: aload 1
      // 01: ldc "context"
      // 03: invokestatic kotlin/jvm/internal/q.h (Ljava/lang/Object;Ljava/lang/String;)V
      // 06: aload 2
      // 07: ldc "reactResource"
      // 09: invokestatic kotlin/jvm/internal/q.h (Ljava/lang/Object;Ljava/lang/String;)V
      // 0c: aload 0
      // 0d: getfield com/discord/react_resource_cache/ReactResourceCache.lock Ljava/lang/Object;
      // 10: astore 5
      // 12: aload 5
      // 14: monitorenter
      // 15: aload 0
      // 16: getfield com/discord/react_resource_cache/ReactResourceCache.reactResources Ljava/util/Map;
      // 19: aload 2
      // 1a: invokevirtual java/lang/Enum.name ()Ljava/lang/String;
      // 1d: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 22: checkcast java/lang/String
      // 25: astore 4
      // 27: aload 4
      // 29: astore 3
      // 2a: aload 4
      // 2c: ifnonnull 9d
      // 2f: aload 0
      // 30: aload 1
      // 31: invokespecial com/discord/react_resource_cache/ReactResourceCache.getCache (Landroid/content/Context;)Landroid/content/SharedPreferences;
      // 34: aload 2
      // 35: invokevirtual java/lang/Enum.name ()Ljava/lang/String;
      // 38: aconst_null
      // 39: invokeinterface android/content/SharedPreferences.getString (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; 3
      // 3e: astore 1
      // 3f: aload 1
      // 40: ifnull 63
      // 43: aload 0
      // 44: getfield com/discord/react_resource_cache/ReactResourceCache.reactResources Ljava/util/Map;
      // 47: astore 3
      // 48: aload 2
      // 49: invokevirtual java/lang/Enum.name ()Ljava/lang/String;
      // 4c: astore 4
      // 4e: aload 1
      // 4f: invokestatic kotlin/jvm/internal/q.e (Ljava/lang/Object;)V
      // 52: aload 3
      // 53: aload 4
      // 55: aload 1
      // 56: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 5b: pop
      // 5c: goto 65
      // 5f: astore 1
      // 60: goto a2
      // 63: aconst_null
      // 64: astore 1
      // 65: aload 1
      // 66: ifnull 6e
      // 69: aload 1
      // 6a: astore 3
      // 6b: goto 9d
      // 6e: new java/lang/IllegalAccessException
      // 71: astore 1
      // 72: aload 2
      // 73: invokevirtual java/lang/Enum.name ()Ljava/lang/String;
      // 76: astore 2
      // 77: new java/lang/StringBuilder
      // 7a: astore 3
      // 7b: aload 3
      // 7c: invokespecial java/lang/StringBuilder.<init> ()V
      // 7f: aload 3
      // 80: ldc "Unable to access "
      // 82: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 85: pop
      // 86: aload 3
      // 87: aload 2
      // 88: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 8b: pop
      // 8c: aload 3
      // 8d: ldc " as it has not yet been provided."
      // 8f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 92: pop
      // 93: aload 1
      // 94: aload 3
      // 95: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 98: invokespecial java/lang/IllegalAccessException.<init> (Ljava/lang/String;)V
      // 9b: aload 1
      // 9c: athrow
      // 9d: aload 5
      // 9f: monitorexit
      // a0: aload 3
      // a1: areturn
      // a2: aload 5
      // a4: monitorexit
      // a5: aload 1
      // a6: athrow
   }

   public fun set(context: Context, newReactResources: Map<String, String>) {
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
      // 00: aload 1
      // 01: ldc "context"
      // 03: invokestatic kotlin/jvm/internal/q.h (Ljava/lang/Object;Ljava/lang/String;)V
      // 06: aload 2
      // 07: ldc "newReactResources"
      // 09: invokestatic kotlin/jvm/internal/q.h (Ljava/lang/Object;Ljava/lang/String;)V
      // 0c: aload 0
      // 0d: getfield com/discord/react_resource_cache/ReactResourceCache.lock Ljava/lang/Object;
      // 10: astore 3
      // 11: aload 3
      // 12: monitorenter
      // 13: aload 0
      // 14: aload 1
      // 15: invokespecial com/discord/react_resource_cache/ReactResourceCache.getCache (Landroid/content/Context;)Landroid/content/SharedPreferences;
      // 18: invokeinterface android/content/SharedPreferences.edit ()Landroid/content/SharedPreferences$Editor; 1
      // 1d: astore 5
      // 1f: aload 5
      // 21: invokeinterface android/content/SharedPreferences$Editor.clear ()Landroid/content/SharedPreferences$Editor; 1
      // 26: pop
      // 27: aload 2
      // 28: invokeinterface java/util/Map.entrySet ()Ljava/util/Set; 1
      // 2d: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 32: astore 1
      // 33: aload 1
      // 34: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 39: ifeq 6a
      // 3c: aload 1
      // 3d: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 42: checkcast java/util/Map$Entry
      // 45: astore 4
      // 47: aload 5
      // 49: aload 4
      // 4b: invokeinterface java/util/Map$Entry.getKey ()Ljava/lang/Object; 1
      // 50: checkcast java/lang/String
      // 53: aload 4
      // 55: invokeinterface java/util/Map$Entry.getValue ()Ljava/lang/Object; 1
      // 5a: checkcast java/lang/String
      // 5d: invokeinterface android/content/SharedPreferences$Editor.putString (Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor; 3
      // 62: pop
      // 63: goto 33
      // 66: astore 1
      // 67: goto 86
      // 6a: aload 5
      // 6c: invokeinterface android/content/SharedPreferences$Editor.apply ()V 1
      // 71: new java/util/HashMap
      // 74: astore 1
      // 75: aload 1
      // 76: aload 2
      // 77: invokespecial java/util/HashMap.<init> (Ljava/util/Map;)V
      // 7a: aload 0
      // 7b: aload 1
      // 7c: putfield com/discord/react_resource_cache/ReactResourceCache.reactResources Ljava/util/Map;
      // 7f: getstatic kotlin/Unit.a Lkotlin/Unit;
      // 82: astore 1
      // 83: aload 3
      // 84: monitorexit
      // 85: return
      // 86: aload 3
      // 87: monitorexit
      // 88: aload 1
      // 89: athrow
   }

   public fun wasSet(context: Context, reactResource: Any): Boolean {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
      //   at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:100)
      //   at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:106)
      //   at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:302)
      //   at java.base/java.util.Objects.checkIndex(Objects.java:385)
      //   at java.base/java.util.ArrayList.remove(ArrayList.java:551)
      //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.removeExceptionInstructionsEx(FinallyProcessor.java:1057)
      //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.insertSemaphore(FinallyProcessor.java:350)
      //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.iterateGraph(FinallyProcessor.java:99)
      //
      // Bytecode:
      // 00: aload 1
      // 01: ldc "context"
      // 03: invokestatic kotlin/jvm/internal/q.h (Ljava/lang/Object;Ljava/lang/String;)V
      // 06: aload 2
      // 07: ldc "reactResource"
      // 09: invokestatic kotlin/jvm/internal/q.h (Ljava/lang/Object;Ljava/lang/String;)V
      // 0c: aload 0
      // 0d: getfield com/discord/react_resource_cache/ReactResourceCache.lock Ljava/lang/Object;
      // 10: astore 6
      // 12: aload 6
      // 14: monitorenter
      // 15: aload 0
      // 16: getfield com/discord/react_resource_cache/ReactResourceCache.reactResources Ljava/util/Map;
      // 19: aload 2
      // 1a: invokevirtual java/lang/Enum.name ()Ljava/lang/String;
      // 1d: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 22: checkcast java/lang/String
      // 25: astore 5
      // 27: aload 5
      // 29: astore 4
      // 2b: aload 5
      // 2d: ifnonnull 69
      // 30: aload 0
      // 31: aload 1
      // 32: invokespecial com/discord/react_resource_cache/ReactResourceCache.getCache (Landroid/content/Context;)Landroid/content/SharedPreferences;
      // 35: aload 2
      // 36: invokevirtual java/lang/Enum.name ()Ljava/lang/String;
      // 39: aconst_null
      // 3a: invokeinterface android/content/SharedPreferences.getString (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; 3
      // 3f: astore 4
      // 41: aload 4
      // 43: ifnull 66
      // 46: aload 0
      // 47: getfield com/discord/react_resource_cache/ReactResourceCache.reactResources Ljava/util/Map;
      // 4a: astore 1
      // 4b: aload 2
      // 4c: invokevirtual java/lang/Enum.name ()Ljava/lang/String;
      // 4f: astore 2
      // 50: aload 4
      // 52: invokestatic kotlin/jvm/internal/q.e (Ljava/lang/Object;)V
      // 55: aload 1
      // 56: aload 2
      // 57: aload 4
      // 59: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 5e: pop
      // 5f: goto 69
      // 62: astore 1
      // 63: goto 7a
      // 66: aconst_null
      // 67: astore 4
      // 69: aload 4
      // 6b: ifnull 73
      // 6e: bipush 1
      // 6f: istore 3
      // 70: goto 75
      // 73: bipush 0
      // 74: istore 3
      // 75: aload 6
      // 77: monitorexit
      // 78: iload 3
      // 79: ireturn
      // 7a: aload 6
      // 7c: monitorexit
      // 7d: aload 1
      // 7e: athrow
   }
}

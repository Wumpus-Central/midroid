package com.discord.emoji

import B9.s
import android.content.Context
import db.K
import db.f
import kotlin.coroutines.Continuation
import kotlin.jvm.functions.Function2
import kotlin.jvm.internal.SourceDebugExtension
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.sync.Mutex
import kotlinx.serialization.KSerializer
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonBuilder
import nb.g

@SourceDebugExtension(["SMAP\nUnicodeEmojis.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UnicodeEmojis.kt\ncom/discord/emoji/UnicodeEmojis\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,68:1\n120#2,10:69\n*S KotlinDebug\n*F\n+ 1 UnicodeEmojis.kt\ncom/discord/emoji/UnicodeEmojis\n*L\n22#1:69,10\n*E\n"])
public object UnicodeEmojis {
   private final val emojiJsonParser: Json = kotlinx.serialization.json.b.b(null, new d(), 1, null)
   private final val emojiLoadingMutex: Mutex = mb.b.b(false, 1, null)
   private final lateinit var emojis: Map<String, List<com.discord.emoji.UnicodeEmojis.Emoji>>

   @JvmStatic
   fun `emojiJsonParser$lambda$0`(var0: JsonBuilder): Unit {
      var0.c(true);
      return Unit.a;
   }

   private suspend fun loadData(context: Context): com.discord.emoji.UnicodeEmojis.EmojiCategories {
      return f.g(
         K.b(),
         new Function2<CoroutineScope, Continuation, Object>(var1, null)// $VF: Couldn't be decompiled
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   ,
         var2
      );
   }

   public suspend fun load(context: Context): Map<String, List<com.discord.emoji.UnicodeEmojis.Emoji>> {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
      //   at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:100)
      //   at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:106)
      //   at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:302)
      //   at java.base/java.util.Objects.checkIndex(Objects.java:385)
      //   at java.base/java.util.ArrayList.remove(ArrayList.java:551)
      //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.removeExceptionInstructionsEx(FinallyProcessor.java:1057)
      //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.verifyFinallyEx(FinallyProcessor.java:572)
      //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.iterateGraph(FinallyProcessor.java:90)
      //
      // Bytecode:
      // 000: aload 2
      // 001: instanceof com/discord/emoji/UnicodeEmojis$load$1
      // 004: ifeq 029
      // 007: aload 2
      // 008: checkcast com/discord/emoji/UnicodeEmojis$load$1
      // 00b: astore 4
      // 00d: aload 4
      // 00f: getfield com/discord/emoji/UnicodeEmojis$load$1.label I
      // 012: istore 3
      // 013: iload 3
      // 014: ldc -2147483648
      // 016: iand
      // 017: ifeq 029
      // 01a: aload 4
      // 01c: iload 3
      // 01d: ldc -2147483648
      // 01f: iadd
      // 020: putfield com/discord/emoji/UnicodeEmojis$load$1.label I
      // 023: aload 4
      // 025: astore 2
      // 026: goto 033
      // 029: new com/discord/emoji/UnicodeEmojis$load$1
      // 02c: dup
      // 02d: aload 0
      // 02e: aload 2
      // 02f: invokespecial com/discord/emoji/UnicodeEmojis$load$1.<init> (Lcom/discord/emoji/UnicodeEmojis;Lkotlin/coroutines/Continuation;)V
      // 032: astore 2
      // 033: aload 2
      // 034: getfield com/discord/emoji/UnicodeEmojis$load$1.result Ljava/lang/Object;
      // 037: astore 4
      // 039: invokestatic G9/b.e ()Ljava/lang/Object;
      // 03c: astore 6
      // 03e: aload 2
      // 03f: getfield com/discord/emoji/UnicodeEmojis$load$1.label I
      // 042: istore 3
      // 043: iload 3
      // 044: ifeq 08e
      // 047: iload 3
      // 048: bipush 1
      // 049: if_icmpeq 071
      // 04c: iload 3
      // 04d: bipush 2
      // 04e: if_icmpne 067
      // 051: aload 2
      // 052: getfield com/discord/emoji/UnicodeEmojis$load$1.L$0 Ljava/lang/Object;
      // 055: checkcast kotlinx/coroutines/sync/Mutex
      // 058: astore 2
      // 059: aload 2
      // 05a: astore 1
      // 05b: aload 4
      // 05d: invokestatic kotlin/c.b (Ljava/lang/Object;)V
      // 060: goto 0ef
      // 063: astore 2
      // 064: goto 126
      // 067: new java/lang/IllegalStateException
      // 06a: dup
      // 06b: ldc "call to 'resume' before 'invoke' with coroutine"
      // 06d: invokespecial java/lang/IllegalStateException.<init> (Ljava/lang/String;)V
      // 070: athrow
      // 071: aload 2
      // 072: getfield com/discord/emoji/UnicodeEmojis$load$1.L$1 Ljava/lang/Object;
      // 075: checkcast kotlinx/coroutines/sync/Mutex
      // 078: astore 1
      // 079: aload 2
      // 07a: getfield com/discord/emoji/UnicodeEmojis$load$1.L$0 Ljava/lang/Object;
      // 07d: checkcast android/content/Context
      // 080: astore 5
      // 082: aload 4
      // 084: invokestatic kotlin/c.b (Ljava/lang/Object;)V
      // 087: aload 5
      // 089: astore 4
      // 08b: goto 0bf
      // 08e: aload 4
      // 090: invokestatic kotlin/c.b (Ljava/lang/Object;)V
      // 093: getstatic com/discord/emoji/UnicodeEmojis.emojiLoadingMutex Lkotlinx/coroutines/sync/Mutex;
      // 096: astore 5
      // 098: aload 2
      // 099: aload 1
      // 09a: putfield com/discord/emoji/UnicodeEmojis$load$1.L$0 Ljava/lang/Object;
      // 09d: aload 2
      // 09e: aload 5
      // 0a0: putfield com/discord/emoji/UnicodeEmojis$load$1.L$1 Ljava/lang/Object;
      // 0a3: aload 2
      // 0a4: bipush 1
      // 0a5: putfield com/discord/emoji/UnicodeEmojis$load$1.label I
      // 0a8: aload 1
      // 0a9: astore 4
      // 0ab: aload 5
      // 0ad: astore 1
      // 0ae: aload 5
      // 0b0: aconst_null
      // 0b1: aload 2
      // 0b2: invokeinterface kotlinx/coroutines/sync/Mutex.a (Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; 3
      // 0b7: aload 6
      // 0b9: if_acmpne 0bf
      // 0bc: aload 6
      // 0be: areturn
      // 0bf: getstatic com/discord/emoji/UnicodeEmojis.emojis Ljava/util/Map;
      // 0c2: ifnonnull 103
      // 0c5: getstatic com/discord/emoji/UnicodeEmojis.INSTANCE Lcom/discord/emoji/UnicodeEmojis;
      // 0c8: astore 5
      // 0ca: aload 2
      // 0cb: aload 1
      // 0cc: putfield com/discord/emoji/UnicodeEmojis$load$1.L$0 Ljava/lang/Object;
      // 0cf: aload 2
      // 0d0: aconst_null
      // 0d1: putfield com/discord/emoji/UnicodeEmojis$load$1.L$1 Ljava/lang/Object;
      // 0d4: aload 2
      // 0d5: bipush 2
      // 0d6: putfield com/discord/emoji/UnicodeEmojis$load$1.label I
      // 0d9: aload 5
      // 0db: aload 4
      // 0dd: aload 2
      // 0de: invokespecial com/discord/emoji/UnicodeEmojis.loadData (Landroid/content/Context;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
      // 0e1: astore 4
      // 0e3: aload 4
      // 0e5: aload 6
      // 0e7: if_acmpne 0ed
      // 0ea: aload 6
      // 0ec: areturn
      // 0ed: aload 1
      // 0ee: astore 2
      // 0ef: aload 2
      // 0f0: astore 1
      // 0f1: aload 4
      // 0f3: checkcast com/discord/emoji/UnicodeEmojis$EmojiCategories
      // 0f6: invokevirtual com/discord/emoji/UnicodeEmojis$EmojiCategories.toMap ()Ljava/util/Map;
      // 0f9: putstatic com/discord/emoji/UnicodeEmojis.emojis Ljava/util/Map;
      // 0fc: goto 105
      // 0ff: astore 2
      // 100: goto 126
      // 103: aload 1
      // 104: astore 2
      // 105: aload 2
      // 106: astore 1
      // 107: getstatic com/discord/emoji/UnicodeEmojis.emojis Ljava/util/Map;
      // 10a: astore 4
      // 10c: aload 4
      // 10e: astore 1
      // 10f: aload 4
      // 111: ifnonnull 11d
      // 114: aload 2
      // 115: astore 1
      // 116: ldc "emojis"
      // 118: invokestatic kotlin/jvm/internal/Intrinsics.throwUninitializedPropertyAccessException (Ljava/lang/String;)V
      // 11b: aconst_null
      // 11c: astore 1
      // 11d: aload 2
      // 11e: aconst_null
      // 11f: invokeinterface kotlinx/coroutines/sync/Mutex.b (Ljava/lang/Object;)V 2
      // 124: aload 1
      // 125: areturn
      // 126: aload 1
      // 127: aconst_null
      // 128: invokeinterface kotlinx/coroutines/sync/Mutex.b (Ljava/lang/Object;)V 2
      // 12d: aload 2
      // 12e: athrow
   }

   @g
   public data class Emoji(names: List<String>, surrogates: String) {
      public final val names: List<String>
      public final val surrogates: String

      init {
         super();
         this.names = var1;
         this.surrogates = var2;
      }

      public operator fun component1(): List<String> {
         return this.names;
      }

      public operator fun component2(): String {
         return this.surrogates;
      }

      public fun copy(names: List<String> = var0.names, surrogates: String = var0.surrogates): com.discord.emoji.UnicodeEmojis.Emoji {
         return new UnicodeEmojis.Emoji(var1, var2);
      }

      public override operator fun equals(other: Any?): Boolean {
         if (this === var1) {
            return true;
         } else if (var1 !is UnicodeEmojis.Emoji) {
            return false;
         } else {
            var1 = var1;
            if (!(this.names == var1.names)) {
               return false;
            } else {
               return this.surrogates == var1.surrogates;
            }
         }
      }

      public override fun hashCode(): Int {
         return this.names.hashCode() * 31 + this.surrogates.hashCode();
      }

      public override fun toString(): String {
         val var2: java.util.List = this.names;
         val var1: java.lang.String = this.surrogates;
         val var3: StringBuilder = new StringBuilder();
         var3.append("Emoji(names=");
         var3.append(var2);
         var3.append(", surrogates=");
         var3.append(var1);
         var3.append(")");
         return var3.toString();
      }

      public companion object {
         public fun serializer(): KSerializer<com.discord.emoji.UnicodeEmojis.Emoji> {
            return UnicodeEmojis.Emoji.$serializer.INSTANCE;
         }
      }
   }

   @g
   public data class EmojiCategories(people: List<com.discord.emoji.UnicodeEmojis.Emoji>,
      nature: List<com.discord.emoji.UnicodeEmojis.Emoji>,
      food: List<com.discord.emoji.UnicodeEmojis.Emoji>,
      activity: List<com.discord.emoji.UnicodeEmojis.Emoji>,
      travel: List<com.discord.emoji.UnicodeEmojis.Emoji>,
      objects: List<com.discord.emoji.UnicodeEmojis.Emoji>,
      symbols: List<com.discord.emoji.UnicodeEmojis.Emoji>,
      flags: List<com.discord.emoji.UnicodeEmojis.Emoji>
   ) {
      public final val people: List<com.discord.emoji.UnicodeEmojis.Emoji>
      public final val nature: List<com.discord.emoji.UnicodeEmojis.Emoji>
      public final val food: List<com.discord.emoji.UnicodeEmojis.Emoji>
      public final val activity: List<com.discord.emoji.UnicodeEmojis.Emoji>
      public final val travel: List<com.discord.emoji.UnicodeEmojis.Emoji>
      public final val objects: List<com.discord.emoji.UnicodeEmojis.Emoji>
      public final val symbols: List<com.discord.emoji.UnicodeEmojis.Emoji>
      public final val flags: List<com.discord.emoji.UnicodeEmojis.Emoji>

      @JvmStatic
      fun {
         val var0: UnicodeEmojis.Emoji.$serializer = UnicodeEmojis.Emoji.$serializer.INSTANCE;
         $childSerializers = new KSerializer[]{
            new qb.f(UnicodeEmojis.Emoji.$serializer.INSTANCE),
            new qb.f(var0),
            new qb.f(var0),
            new qb.f(var0),
            new qb.f(var0),
            new qb.f(var0),
            new qb.f(var0),
            new qb.f(var0)
         };
      }

      init {
         super();
         this.people = var1;
         this.nature = var2;
         this.food = var3;
         this.activity = var4;
         this.travel = var5;
         this.objects = var6;
         this.symbols = var7;
         this.flags = var8;
      }

      public operator fun component1(): List<com.discord.emoji.UnicodeEmojis.Emoji> {
         return this.people;
      }

      public operator fun component2(): List<com.discord.emoji.UnicodeEmojis.Emoji> {
         return this.nature;
      }

      public operator fun component3(): List<com.discord.emoji.UnicodeEmojis.Emoji> {
         return this.food;
      }

      public operator fun component4(): List<com.discord.emoji.UnicodeEmojis.Emoji> {
         return this.activity;
      }

      public operator fun component5(): List<com.discord.emoji.UnicodeEmojis.Emoji> {
         return this.travel;
      }

      public operator fun component6(): List<com.discord.emoji.UnicodeEmojis.Emoji> {
         return this.objects;
      }

      public operator fun component7(): List<com.discord.emoji.UnicodeEmojis.Emoji> {
         return this.symbols;
      }

      public operator fun component8(): List<com.discord.emoji.UnicodeEmojis.Emoji> {
         return this.flags;
      }

      public fun copy(
         people: List<com.discord.emoji.UnicodeEmojis.Emoji> = var0.people,
         nature: List<com.discord.emoji.UnicodeEmojis.Emoji> = var0.nature,
         food: List<com.discord.emoji.UnicodeEmojis.Emoji> = var0.food,
         activity: List<com.discord.emoji.UnicodeEmojis.Emoji> = var0.activity,
         travel: List<com.discord.emoji.UnicodeEmojis.Emoji> = var0.travel,
         objects: List<com.discord.emoji.UnicodeEmojis.Emoji> = var0.objects,
         symbols: List<com.discord.emoji.UnicodeEmojis.Emoji> = var0.symbols,
         flags: List<com.discord.emoji.UnicodeEmojis.Emoji> = var0.flags
      ): com.discord.emoji.UnicodeEmojis.EmojiCategories {
         return new UnicodeEmojis.EmojiCategories(var1, var2, var3, var4, var5, var6, var7, var8);
      }

      public override operator fun equals(other: Any?): Boolean {
         if (this === var1) {
            return true;
         } else if (var1 !is UnicodeEmojis.EmojiCategories) {
            return false;
         } else {
            var1 = var1;
            if (!(this.people == var1.people)) {
               return false;
            } else if (!(this.nature == var1.nature)) {
               return false;
            } else if (!(this.food == var1.food)) {
               return false;
            } else if (!(this.activity == var1.activity)) {
               return false;
            } else if (!(this.travel == var1.travel)) {
               return false;
            } else if (!(this.objects == var1.objects)) {
               return false;
            } else if (!(this.symbols == var1.symbols)) {
               return false;
            } else {
               return this.flags == var1.flags;
            }
         }
      }

      public override fun hashCode(): Int {
         return (
                  (
                           (
                                    (((this.people.hashCode() * 31 + this.nature.hashCode()) * 31 + this.food.hashCode()) * 31 + this.activity.hashCode()) * 31
                                       + this.travel.hashCode()
                                 )
                                 * 31
                              + this.objects.hashCode()
                        )
                        * 31
                     + this.symbols.hashCode()
               )
               * 31
            + this.flags.hashCode();
      }

      public fun toMap(): Map<String, List<com.discord.emoji.UnicodeEmojis.Emoji>> {
         return L.l(
            new Pair[]{
               s.a("people", this.people),
               s.a("nature", this.nature),
               s.a("food", this.food),
               s.a("activity", this.activity),
               s.a("travel", this.travel),
               s.a("objects", this.objects),
               s.a("symbols", this.symbols),
               s.a("flags", this.flags)
            }
         );
      }

      public override fun toString(): String {
         val var4: java.util.List = this.people;
         val var5: java.util.List = this.nature;
         val var7: java.util.List = this.food;
         val var9: java.util.List = this.activity;
         val var8: java.util.List = this.travel;
         val var3: java.util.List = this.objects;
         val var6: java.util.List = this.symbols;
         val var2: java.util.List = this.flags;
         val var1: StringBuilder = new StringBuilder();
         var1.append("EmojiCategories(people=");
         var1.append(var4);
         var1.append(", nature=");
         var1.append(var5);
         var1.append(", food=");
         var1.append(var7);
         var1.append(", activity=");
         var1.append(var9);
         var1.append(", travel=");
         var1.append(var8);
         var1.append(", objects=");
         var1.append(var3);
         var1.append(", symbols=");
         var1.append(var6);
         var1.append(", flags=");
         var1.append(var2);
         var1.append(")");
         return var1.toString();
      }

      public companion object {
         public fun serializer(): KSerializer<com.discord.emoji.UnicodeEmojis.EmojiCategories> {
            return UnicodeEmojis.EmojiCategories.$serializer.INSTANCE;
         }
      }
   }
}

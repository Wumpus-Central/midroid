package com.discord.misc.utilities.logThrottle

import java.util.concurrent.ConcurrentHashMap
import java.util.concurrent.atomic.AtomicLong
import kotlin.jvm.internal.SourceDebugExtension

@SourceDebugExtension(["SMAP\nLogThrottleSingleton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LogThrottleSingleton.kt\ncom/discord/misc/utilities/logThrottle/LogThrottleSingleton\n+ 2 MapsJVM.kt\nkotlin/collections/MapsKt__MapsJVMKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,37:1\n72#2,2:38\n1#3:40\n*S KotlinDebug\n*F\n+ 1 LogThrottleSingleton.kt\ncom/discord/misc/utilities/logThrottle/LogThrottleSingleton\n*L\n19#1:38,2\n19#1:40\n*E\n"])
public object LogThrottleSingleton {
   private final val messageTimestamps: ConcurrentHashMap<String, AtomicLong> = new ConcurrentHashMap()
   public const val RATE_LIMIT_ONE_SECOND: Long = 1000L
   public const val RATE_LIMIT_ONE_MINUTE: Long = 60000L
   public const val RATE_LIMIT_FIVE_MINUTES: Long = 300000L
   public const val RATE_LIMIT_ONE_HOUR: Long = 3600000L

   public fun clearAll() {
      messageTimestamps.clear();
   }

   public fun clearThrottle(messageKey: String) {
      messageTimestamps.remove(var1);
   }

   public fun shouldThrottle(messageKey: String, rateLimitMs: Long): Boolean {
      val var6: Long = System.currentTimeMillis();
      val var10: ConcurrentHashMap = messageTimestamps;
      val var9: Any = messageTimestamps.get(var1);
      var var8: Any = var9;
      if (var9 == null) {
         var8 = new AtomicLong(0L);
         val var11: Any = var10.putIfAbsent(var1, var8);
         if (var11 != null) {
            var8 = var11;
         }
      }

      val var4: Long = (var8 as AtomicLong).get();
      return var2 + var4 > var6 || (var8 as AtomicLong).compareAndSet(var4, var6) xor true;
   }
}

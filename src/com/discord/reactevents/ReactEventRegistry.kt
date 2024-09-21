package com.discord.reactevents

import java.util.LinkedHashMap
import java.util.Locale
import kotlin.jvm.internal.g0
import kotlin.jvm.internal.q
import kotlin.reflect.KClass
import nh.w
import oh.r

internal class ReactEventRegistry {
   public final var didExportEvents: Boolean
      private set

   private final val events: MutableMap<KClass<out ReactEvent>, String> = new LinkedHashMap()

   private fun prefixWithTop(input: String): String {
      var var3: java.lang.String = var1;
      if (var1.length() > 0) {
         val var7: StringBuilder = new StringBuilder();
         val var2: Char = var1.charAt(0);
         val var4: Locale = Locale.getDefault();
         q.g(var4, "getDefault(...)");
         var7.append(a.d(var2, var4));
         var1 = var1.substring(1);
         q.g(var1, "substring(...)");
         var7.append(var1);
         var3 = var7.toString();
      }

      val var6: StringBuilder = new StringBuilder();
      var6.append("top");
      var6.append(var3);
      return var6.toString();
   }

   public fun exportEventConstants(): MutableMap<String, Any> {
      this.didExportEvents = true;
      val var3: LinkedHashMap = new LinkedHashMap();

      for (java.lang.String var1 : this.events.values()) {
         var3.put(var1, r.m(new Pair[]{w.a("registrationName", var1)}));
      }

      return var3;
   }

   public fun getEventName(event: ReactEvent): String {
      q.h(var1, "event");
      val var2: java.lang.String = this.events.get(g0.b(var1.getClass()));
      if (var2 != null) {
         return var2;
      } else {
         val var4: KClass = g0.b(var1.getClass());
         val var3: StringBuilder = new StringBuilder();
         var3.append("No event name registered for event: ");
         var3.append(var4);
         throw new IllegalStateException(var3.toString().toString());
      }
   }

   public fun registerEvent(eventName: String, eventClass: KClass<out ReactEvent>) {
      q.h(var1, "eventName");
      q.h(var2, "eventClass");
      if (!this.events.containsKey(var2)) {
         this.events.put(var2, var1);
      } else {
         val var4: Any = this.events.get(var2);
         val var3: StringBuilder = new StringBuilder();
         var3.append("event ");
         var3.append(var4);
         var3.append(" already registered for");
         var3.append(var2);
         var3.append(". using the same class for multiple events is not supported.");
         throw new IllegalStateException(var3.toString());
      }
   }
}

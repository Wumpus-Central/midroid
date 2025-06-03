package com.discord.reactevents

import R8.s
import S8.q
import java.util.LinkedHashMap
import kotlin.jvm.internal.G
import kotlin.reflect.KClass

internal class ReactEventRegistry {
   private final val events: MutableMap<KClass<out ReactEvent>, String> = new LinkedHashMap()

   public final var didExportEvents: Boolean
      private set

   private fun prefixWithTop(input: String): String {
      return h.E(var1, "on", "top", false, 4, null);
   }

   public fun exportEventConstants(): MutableMap<String, Any> {
      this.didExportEvents = true;
      val var2: LinkedHashMap = new LinkedHashMap();

      for (java.lang.String var3 : this.events.values()) {
         var2.put(var3, q.m(new Pair[]{s.a("registrationName", var3)}));
      }

      return var2;
   }

   public fun getEventName(event: ReactEvent): String {
      kotlin.jvm.internal.q.h(var1, "event");
      val var2: java.lang.String = this.events.get(G.b(var1.getClass()));
      if (var2 != null) {
         return var2;
      } else {
         val var3: KClass = G.b(var1.getClass());
         val var4: StringBuilder = new StringBuilder();
         var4.append("No event name registered for event: ");
         var4.append(var3);
         throw new IllegalStateException(var4.toString().toString());
      }
   }

   public fun registerEvent(eventName: String, eventClass: KClass<out ReactEvent>) {
      kotlin.jvm.internal.q.h(var1, "eventName");
      kotlin.jvm.internal.q.h(var2, "eventClass");
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

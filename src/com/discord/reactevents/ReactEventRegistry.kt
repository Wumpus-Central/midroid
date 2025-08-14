package com.discord.reactevents

import A9.s
import B9.q
import java.util.LinkedHashMap
import kotlin.jvm.internal.H
import kotlin.jvm.internal.r
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
      val var1: LinkedHashMap = new LinkedHashMap();

      for (java.lang.String var2 : this.events.values()) {
         var1.put(var2, q.m(new Pair[]{s.a("registrationName", var2)}));
      }

      return var1;
   }

   public fun getEventName(event: ReactEvent): String {
      r.h(var1, "event");
      val var2: java.lang.String = this.events.get(H.b(var1.getClass()));
      if (var2 != null) {
         return var2;
      } else {
         val var4: KClass = H.b(var1.getClass());
         val var3: StringBuilder = new StringBuilder();
         var3.append("No event name registered for event: ");
         var3.append(var4);
         throw new IllegalStateException(var3.toString().toString());
      }
   }

   public fun registerEvent(eventName: String, eventClass: KClass<out ReactEvent>) {
      r.h(var1, "eventName");
      r.h(var2, "eventClass");
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

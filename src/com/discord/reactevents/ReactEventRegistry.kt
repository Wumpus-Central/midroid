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
      val var2: LinkedHashMap = new LinkedHashMap();

      for (java.lang.String var3 : this.events.values()) {
         var2.put(this.prefixWithTop(var3), q.m(new Pair[]{s.a("registrationName", var3)}));
      }

      return var2;
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
         val var3: Any = this.events.get(var2);
         val var4: StringBuilder = new StringBuilder();
         var4.append("event ");
         var4.append(var3);
         var4.append(" already registered for");
         var4.append(var2);
         var4.append(". using the same class for multiple events is not supported.");
         throw new IllegalStateException(var4.toString());
      }
   }
}

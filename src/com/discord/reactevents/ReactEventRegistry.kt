package com.discord.reactevents

import eh.w
import fh.s
import java.util.LinkedHashMap
import java.util.Locale
import kotlin.jvm.internal.h0
import kotlin.jvm.internal.r
import kotlin.reflect.KClass

internal class ReactEventRegistry {
   public final var didExportEvents: Boolean
      private set

   private final val events: MutableMap<KClass<out ReactEvent>, String> = new LinkedHashMap()

   private fun prefixWithTop(input: String): String {
      val var3: Boolean;
      if (var1.length() > 0) {
         var3 = true;
      } else {
         var3 = false;
      }

      var var4: java.lang.String = var1;
      if (var3) {
         val var8: StringBuilder = new StringBuilder();
         val var2: Char = var1.charAt(0);
         val var5: Locale = Locale.getDefault();
         r.g(var5, "getDefault()");
         var8.append(a.d(var2, var5));
         var1 = var1.substring(1);
         r.g(var1, "this as java.lang.String).substring(startIndex)");
         var8.append(var1);
         var4 = var8.toString();
      }

      val var7: StringBuilder = new StringBuilder();
      var7.append("top");
      var7.append(var4);
      return var7.toString();
   }

   public fun exportEventConstants(): MutableMap<String, Any> {
      this.didExportEvents = true;
      val var3: LinkedHashMap = new LinkedHashMap();

      for (java.lang.String var1 : this.events.values()) {
         var3.put(var1, s.m(new Pair[]{w.a("registrationName", var1)}));
      }

      return var3;
   }

   public fun getEventName(event: ReactEvent): String {
      r.h(var1, "event");
      val var2: java.lang.String = this.events.get(h0.b(var1.getClass()));
      if (var2 != null) {
         return var2;
      } else {
         val var3: KClass = h0.b(var1.getClass());
         val var4: StringBuilder = new StringBuilder();
         var4.append("No event name registered for event: ");
         var4.append(var3);
         throw new IllegalStateException(var4.toString().toString());
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

package com.discord.reactevents

import ht.v
import java.util.LinkedHashMap
import kotlin.jvm.internal.SourceDebugExtension
import kotlin.reflect.KClass

@SourceDebugExtension(["SMAP\nReactEventRegistry.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReactEventRegistry.kt\ncom/discord/reactevents/ReactEventRegistry\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,39:1\n1246#2,4:40\n*S KotlinDebug\n*F\n+ 1 ReactEventRegistry.kt\ncom/discord/reactevents/ReactEventRegistry\n*L\n27#1:40,4\n*E\n"])
internal class ReactEventRegistry {
   private final val events: MutableMap<KClass<out ReactEvent>, String> = new LinkedHashMap()

   public final var didExportEvents: Boolean
      private set

   private fun prefixWithTop(input: String): String {
      return StringsKt.J(var1, "on", "top", false, 4, null);
   }

   public fun exportEventConstants(): MutableMap<String, Any> {
      this.didExportEvents = true;
      val var1: LinkedHashMap = new LinkedHashMap();

      for (java.lang.String var2 : this.events.values()) {
         var1.put(this.prefixWithTop(var2), s0.n(new Pair[]{v.a("registrationName", var2)}));
      }

      return var1;
   }

   public fun getEventName(event: ReactEvent): String {
      val var2: java.lang.String = this.events.get(var1.getClass()::class);
      if (var2 != null) {
         return var2;
      } else {
         val var3: KClass = var1.getClass()::class;
         val var4: StringBuilder = new StringBuilder();
         var4.append("No event name registered for event: ");
         var4.append(var3);
         throw new IllegalStateException(var4.toString().toString());
      }
   }

   public fun registerEvent(eventName: String, eventClass: KClass<out ReactEvent>) {
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

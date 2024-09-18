package com.discord.reactevents

import android.content.Context
import android.content.ContextWrapper
import android.view.View
import com.facebook.react.bridge.ReactContext
import com.facebook.react.uimanager.UIManagerHelper
import com.facebook.react.uimanager.events.EventDispatcher
import kotlin.jvm.internal.g0
import kotlin.jvm.internal.q
import kotlin.reflect.KClass

public class ReactEvents(vararg events: Pair<String, KClass<out ReactEvent>>) {
   private final val eventRegistry: ReactEventRegistry

   init {
      q.h(var1, "events");
      super();
      this.eventRegistry = new ReactEventRegistry();
      val var3: Int = var1.length;

      for (int var2 = 0; var2 < var3; var2++) {
         this.eventRegistry.registerEvent(var1[var2].a() as java.lang.String, var1[var2].b() as KClass);
      }
   }

   private fun ReactEvent.requireEventExporting() {
      if (!this.eventRegistry.getDidExportEvents()) {
         val var2: KClass = g0.b(var1.getClass());
         val var3: StringBuilder = new StringBuilder();
         var3.append("attempting to emit event: ");
         var3.append(var2);
         var3.append(" before exporting event constants. see usages of exportEventConstants");
         throw new IllegalStateException(var3.toString());
      }
   }

   public fun emitEvent(view: View, event: ReactEvent) {
      q.h(var1, "view");
      q.h(var2, "event");
      var var3: Context = var1.getContext();
      val var5: ReactContext;
      if (var3 is ReactContext) {
         q.e(var3);
         var5 = var3 as ReactContext;
      } else {
         if (var3 !is ContextWrapper) {
            val var4: StringBuilder = new StringBuilder();
            var4.append(var3);
            var4.append(" not a ");
            var4.append(ReactContext::class.java);
            throw new IllegalStateException(var4.toString().toString());
         }

         var3 = (var3 as ContextWrapper).getBaseContext();
         q.f(var3, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
         var5 = var3 as ReactContext;
      }

      this.emitEvent(var5, var1, var2);
   }

   public fun emitEvent(context: ReactContext, reactTag: Int, event: ReactEvent) {
      q.h(var1, "context");
      q.h(var3, "event");
      val var4: EventDispatcher = UIManagerHelper.getEventDispatcherForReactTag(var1, var2);
      if (var4 != null) {
         this.requireEventExporting(var3);
         var4.dispatchEvent(new DispatchedEvent(UIManagerHelper.getSurfaceId(var1), var2, this.eventRegistry.getEventName(var3), var3));
      }
   }

   public fun emitEvent(context: ReactContext, view: View, event: ReactEvent) {
      q.h(var1, "context");
      q.h(var2, "view");
      q.h(var3, "event");
      this.emitEvent(var1, var2.getId(), var3);
   }

   public fun emitModuleEvent(context: Context, event: ReactEvent) {
      q.h(var1, "context");
      q.h(var2, "event");
      EventEmitterUtilsKt.emitReactNativeEvent(var1, this.eventRegistry.getEventName(var2), var2.serialize());
   }

   public fun exportEventConstants(): MutableMap<String, Any> {
      return this.eventRegistry.exportEventConstants();
   }
}

package com.discord.reactevents

import android.content.Context
import android.content.ContextWrapper
import android.view.View
import com.facebook.react.bridge.ReactContext
import com.facebook.react.uimanager.UIManagerHelper
import com.facebook.react.uimanager.events.EventDispatcher
import kotlin.jvm.internal.SourceDebugExtension
import kotlin.reflect.KClass

@SourceDebugExtension(["SMAP\nReactEvents.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReactEvents.kt\ncom/discord/reactevents/ReactEvents\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,64:1\n13409#2,2:65\n*S KotlinDebug\n*F\n+ 1 ReactEvents.kt\ncom/discord/reactevents/ReactEvents\n*L\n16#1:65,2\n*E\n"])
public class ReactEvents(vararg events: Pair<String, KClass<out ReactEvent>>) {
   private final val eventRegistry: ReactEventRegistry = new ReactEventRegistry()

   init {
      val var3: Int = var1.length;

      for (int var2 = 0; var2 < var3; var2++) {
         this.eventRegistry.registerEvent(var1[var2].a() as java.lang.String, var1[var2].b() as KClass);
      }
   }

   public fun emitEvent(view: View, event: ReactEvent) {
      var var3: Context = var1.getContext();
      val var5: ReactContext;
      if (var3 is ReactContext) {
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
         var5 = var3 as ReactContext;
      }

      this.emitEvent(var5, var1, var2);
   }

   public fun emitEvent(context: ReactContext, reactTag: Int, event: ReactEvent) {
      val var4: EventDispatcher = UIManagerHelper.getEventDispatcherForReactTag(var1, var2);
      if (var4 != null) {
         var4.dispatchEvent(new DispatchedEvent(UIManagerHelper.getSurfaceId(var1), var2, this.eventRegistry.getEventName(var3), var3));
      }
   }

   public fun emitEvent(context: ReactContext, view: View, event: ReactEvent) {
      this.emitEvent(var1, var2.getId(), var3);
   }

   public fun emitModuleEvent(context: Context, event: ReactEvent) {
      EventEmitterUtilsKt.emitReactNativeEvent(var1, this.eventRegistry.getEventName(var2), var2.serialize());
   }

   public fun exportEventConstants(): MutableMap<String, Any> {
      return this.eventRegistry.exportEventConstants();
   }
}

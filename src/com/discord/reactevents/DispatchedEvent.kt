package com.discord.reactevents

import com.facebook.react.bridge.WritableMap
import com.facebook.react.uimanager.events.Event

internal class DispatchedEvent(surfaceId: Int, viewId: Int, name: String, payload: ReactEvent) : Event(var1, var2) {
   private final val name: String
   private final val payload: ReactEvent

   init {
      this.name = var3;
      this.payload = var4;
   }

   protected open fun getEventData(): WritableMap {
      return this.payload.serialize();
   }

   public open fun getEventName(): String {
      return this.name;
   }
}

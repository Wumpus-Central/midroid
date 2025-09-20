package com.discord.avatar.react.events

import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import kotlinx.serialization.KSerializer
import mb.g

@g
internal data class OnImageLoadedEvent(url: String) : ReactEvent {
   public final val url: String

   init {
      super();
      this.url = var1;
   }

   public operator fun component1(): String {
      return this.url;
   }

   public fun copy(url: String = var0.url): OnImageLoadedEvent {
      return new OnImageLoadedEvent(var1);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is OnImageLoadedEvent) {
         return false;
      } else {
         return this.url == (var1 as OnImageLoadedEvent).url;
      }
   }

   public override fun hashCode(): Int {
      return this.url.hashCode();
   }

   override fun serialize(): WritableMap {
      return ReactEvent.DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var1: java.lang.String = this.url;
      val var2: StringBuilder = new StringBuilder();
      var2.append("OnImageLoadedEvent(url=");
      var2.append(var1);
      var2.append(")");
      return var2.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<OnImageLoadedEvent> {
         return OnImageLoadedEvent.$serializer.INSTANCE;
      }
   }
}

package com.discord.avatar.react.events

import com.discord.reactevents.ReactEvent
import com.discord.reactevents.ReactEvent.DefaultImpls
import com.facebook.react.bridge.WritableMap
import kotlinx.serialization.KSerializer
import tp.m

@m
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

   fun serialize(): WritableMap {
      return DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var2: java.lang.String = this.url;
      val var1: StringBuilder = new StringBuilder();
      var1.append("OnImageLoadedEvent(url=");
      var1.append(var2);
      var1.append(")");
      return var1.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<OnImageLoadedEvent> {
         return OnImageLoadedEvent.$serializer.INSTANCE;
      }
   }
}

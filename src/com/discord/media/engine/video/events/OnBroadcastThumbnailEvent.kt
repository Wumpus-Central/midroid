package com.discord.media.engine.video.events

import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import kb.f
import kotlin.jvm.internal.r
import kotlinx.serialization.KSerializer

@f
internal data class OnBroadcastThumbnailEvent(imgdata: String) : ReactEvent {
   public final var imgdata: String
      internal set

   init {
      r.h(var1, "imgdata");
      super();
      this.imgdata = var1;
   }

   public operator fun component1(): String {
      return this.imgdata;
   }

   public fun copy(imgdata: String = var0.imgdata): OnBroadcastThumbnailEvent {
      r.h(var1, "imgdata");
      return new OnBroadcastThumbnailEvent(var1);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is OnBroadcastThumbnailEvent) {
         return false;
      } else {
         return r.c(this.imgdata, (var1 as OnBroadcastThumbnailEvent).imgdata);
      }
   }

   public override fun hashCode(): Int {
      return this.imgdata.hashCode();
   }

   override fun serialize(): WritableMap {
      return ReactEvent.DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var2: java.lang.String = this.imgdata;
      val var1: StringBuilder = new StringBuilder();
      var1.append("OnBroadcastThumbnailEvent(imgdata=");
      var1.append(var2);
      var1.append(")");
      return var1.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<OnBroadcastThumbnailEvent> {
         return OnBroadcastThumbnailEvent.$serializer.INSTANCE;
      }
   }
}

package com.discord.zoom_layout.reactevents

import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import kotlinx.serialization.KSerializer
import lb.f

@f
internal data class OnZoomChangedEvent(zoomScale: Float) : ReactEvent {
   public final val zoomScale: Float

   init {
      this.zoomScale = var1;
   }

   public operator fun component1(): Float {
      return this.zoomScale;
   }

   public fun copy(zoomScale: Float = var0.zoomScale): OnZoomChangedEvent {
      return new OnZoomChangedEvent(var1);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is OnZoomChangedEvent) {
         return false;
      } else {
         return java.lang.Float.compare(this.zoomScale, (var1 as OnZoomChangedEvent).zoomScale) == 0;
      }
   }

   public override fun hashCode(): Int {
      return java.lang.Float.hashCode(this.zoomScale);
   }

   override fun serialize(): WritableMap {
      return ReactEvent.DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var1: Float = this.zoomScale;
      val var2: StringBuilder = new StringBuilder();
      var2.append("OnZoomChangedEvent(zoomScale=");
      var2.append(var1);
      var2.append(")");
      return var2.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<OnZoomChangedEvent> {
         return OnZoomChangedEvent.$serializer.INSTANCE;
      }
   }
}

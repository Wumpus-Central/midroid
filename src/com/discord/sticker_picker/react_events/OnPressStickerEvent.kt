package com.discord.sticker_picker.react_events

import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import kb.f
import kotlin.jvm.internal.r
import kotlinx.serialization.KSerializer

@f
internal data class OnPressStickerEvent(stickerId: String) : ReactEvent {
   public final val stickerId: String

   init {
      r.h(var1, "stickerId");
      super();
      this.stickerId = var1;
   }

   public operator fun component1(): String {
      return this.stickerId;
   }

   public fun copy(stickerId: String = var0.stickerId): OnPressStickerEvent {
      r.h(var1, "stickerId");
      return new OnPressStickerEvent(var1);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is OnPressStickerEvent) {
         return false;
      } else {
         return r.c(this.stickerId, (var1 as OnPressStickerEvent).stickerId);
      }
   }

   public override fun hashCode(): Int {
      return this.stickerId.hashCode();
   }

   override fun serialize(): WritableMap {
      return ReactEvent.DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var1: java.lang.String = this.stickerId;
      val var2: StringBuilder = new StringBuilder();
      var2.append("OnPressStickerEvent(stickerId=");
      var2.append(var1);
      var2.append(")");
      return var2.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<OnPressStickerEvent> {
         return OnPressStickerEvent.$serializer.INSTANCE;
      }
   }
}

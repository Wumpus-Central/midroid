package com.discord.chat.input.events

import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import kotlinx.serialization.KSerializer
import sb.g

@g
internal data class OnContentSizeChangeEvent(width: Int, height: Int) : ReactEvent {
   public final val width: Int
   public final val height: Int

   init {
      this.width = var1;
      this.height = var2;
   }

   public operator fun component1(): Int {
      return this.width;
   }

   public operator fun component2(): Int {
      return this.height;
   }

   public fun copy(width: Int = var0.width, height: Int = var0.height): OnContentSizeChangeEvent {
      return new OnContentSizeChangeEvent(var1, var2);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is OnContentSizeChangeEvent) {
         return false;
      } else {
         var1 = var1;
         if (this.width != var1.width) {
            return false;
         } else {
            return this.height == var1.height;
         }
      }
   }

   public override fun hashCode(): Int {
      return Integer.hashCode(this.width) * 31 + Integer.hashCode(this.height);
   }

   override fun serialize(): WritableMap {
      return ReactEvent.DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var2: Int = this.width;
      val var1: Int = this.height;
      val var3: StringBuilder = new StringBuilder();
      var3.append("OnContentSizeChangeEvent(width=");
      var3.append(var2);
      var3.append(", height=");
      var3.append(var1);
      var3.append(")");
      return var3.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<OnContentSizeChangeEvent> {
         return OnContentSizeChangeEvent.$serializer.INSTANCE;
      }
   }
}

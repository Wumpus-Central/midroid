package com.discord.chat.input.events

import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import kotlinx.serialization.KSerializer
import mb.f

@f
internal data class OnFocusEvent(start: Int, end: Int, target: Int = 0) : ReactEvent {
   public final val start: Int
   public final val end: Int
   public final val target: Int

   init {
      this.start = var1;
      this.end = var2;
      this.target = var3;
   }

   public operator fun component1(): Int {
      return this.start;
   }

   public operator fun component2(): Int {
      return this.end;
   }

   public operator fun component3(): Int {
      return this.target;
   }

   public fun copy(start: Int = var0.start, end: Int = var0.end, target: Int = var0.target): OnFocusEvent {
      return new OnFocusEvent(var1, var2, var3);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is OnFocusEvent) {
         return false;
      } else {
         var1 = var1;
         if (this.start != var1.start) {
            return false;
         } else if (this.end != var1.end) {
            return false;
         } else {
            return this.target == var1.target;
         }
      }
   }

   public override fun hashCode(): Int {
      return (Integer.hashCode(this.start) * 31 + Integer.hashCode(this.end)) * 31 + Integer.hashCode(this.target);
   }

   override fun serialize(): WritableMap {
      return ReactEvent.DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var2: Int = this.start;
      val var3: Int = this.end;
      val var1: Int = this.target;
      val var4: StringBuilder = new StringBuilder();
      var4.append("OnFocusEvent(start=");
      var4.append(var2);
      var4.append(", end=");
      var4.append(var3);
      var4.append(", target=");
      var4.append(var1);
      var4.append(")");
      return var4.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<OnFocusEvent> {
         return OnFocusEvent.$serializer.INSTANCE;
      }
   }
}

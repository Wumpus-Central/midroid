package com.discord.segmented.control.events

import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import lb.f

@f
internal data class ValueChangeEvent(value: String, selectedSegmentIndex: Int) : ReactEvent {
   public final val value: String
   public final val selectedSegmentIndex: Int

   init {
      q.h(var1, "value");
      super();
      this.value = var1;
      this.selectedSegmentIndex = var2;
   }

   public operator fun component1(): String {
      return this.value;
   }

   public operator fun component2(): Int {
      return this.selectedSegmentIndex;
   }

   public fun copy(value: String = var0.value, selectedSegmentIndex: Int = var0.selectedSegmentIndex): ValueChangeEvent {
      q.h(var1, "value");
      return new ValueChangeEvent(var1, var2);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is ValueChangeEvent) {
         return false;
      } else {
         var1 = var1;
         if (!q.c(this.value, var1.value)) {
            return false;
         } else {
            return this.selectedSegmentIndex == var1.selectedSegmentIndex;
         }
      }
   }

   public override fun hashCode(): Int {
      return this.value.hashCode() * 31 + Integer.hashCode(this.selectedSegmentIndex);
   }

   override fun serialize(): WritableMap {
      return ReactEvent.DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var2: java.lang.String = this.value;
      val var1: Int = this.selectedSegmentIndex;
      val var3: StringBuilder = new StringBuilder();
      var3.append("ValueChangeEvent(value=");
      var3.append(var2);
      var3.append(", selectedSegmentIndex=");
      var3.append(var1);
      var3.append(")");
      return var3.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<ValueChangeEvent> {
         return ValueChangeEvent.$serializer.INSTANCE;
      }
   }
}

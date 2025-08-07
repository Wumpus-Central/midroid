package com.discord.chat.input.events

import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import kotlin.jvm.internal.r
import kotlinx.serialization.KSerializer
import tb.g

@g
internal data class OnSelectionOrTextChangeEvent(start: Int, end: Int, text: String, editId: String) : ReactEvent {
   public final val start: Int
   public final val end: Int
   public final val text: String
   public final val editId: String

   init {
      r.h(var3, "text");
      r.h(var4, "editId");
      super();
      this.start = var1;
      this.end = var2;
      this.text = var3;
      this.editId = var4;
   }

   public operator fun component1(): Int {
      return this.start;
   }

   public operator fun component2(): Int {
      return this.end;
   }

   public operator fun component3(): String {
      return this.text;
   }

   public operator fun component4(): String {
      return this.editId;
   }

   public fun copy(start: Int = var0.start, end: Int = var0.end, text: String = var0.text, editId: String = var0.editId): OnSelectionOrTextChangeEvent {
      r.h(var3, "text");
      r.h(var4, "editId");
      return new OnSelectionOrTextChangeEvent(var1, var2, var3, var4);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is OnSelectionOrTextChangeEvent) {
         return false;
      } else {
         var1 = var1;
         if (this.start != var1.start) {
            return false;
         } else if (this.end != var1.end) {
            return false;
         } else if (!r.c(this.text, var1.text)) {
            return false;
         } else {
            return r.c(this.editId, var1.editId);
         }
      }
   }

   public override fun hashCode(): Int {
      return ((Integer.hashCode(this.start) * 31 + Integer.hashCode(this.end)) * 31 + this.text.hashCode()) * 31 + this.editId.hashCode();
   }

   override fun serialize(): WritableMap {
      return ReactEvent.DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var1: Int = this.start;
      val var2: Int = this.end;
      val var3: java.lang.String = this.text;
      val var4: java.lang.String = this.editId;
      val var5: StringBuilder = new StringBuilder();
      var5.append("OnSelectionOrTextChangeEvent(start=");
      var5.append(var1);
      var5.append(", end=");
      var5.append(var2);
      var5.append(", text=");
      var5.append(var3);
      var5.append(", editId=");
      var5.append(var4);
      var5.append(")");
      return var5.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<OnSelectionOrTextChangeEvent> {
         return OnSelectionOrTextChangeEvent.$serializer.INSTANCE;
      }
   }
}

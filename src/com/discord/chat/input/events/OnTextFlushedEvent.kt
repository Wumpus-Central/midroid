package com.discord.chat.input.events

import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import kotlinx.serialization.KSerializer
import mb.g

@g
internal data class OnTextFlushedEvent(text: String, requestId: String) : ReactEvent {
   public final val text: String
   public final val requestId: String

   init {
      super();
      this.text = var1;
      this.requestId = var2;
   }

   public operator fun component1(): String {
      return this.text;
   }

   public operator fun component2(): String {
      return this.requestId;
   }

   public fun copy(text: String = var0.text, requestId: String = var0.requestId): OnTextFlushedEvent {
      return new OnTextFlushedEvent(var1, var2);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is OnTextFlushedEvent) {
         return false;
      } else {
         var1 = var1;
         if (!(this.text == var1.text)) {
            return false;
         } else {
            return this.requestId == var1.requestId;
         }
      }
   }

   public override fun hashCode(): Int {
      return this.text.hashCode() * 31 + this.requestId.hashCode();
   }

   override fun serialize(): WritableMap {
      return ReactEvent.DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var3: java.lang.String = this.text;
      val var2: java.lang.String = this.requestId;
      val var1: StringBuilder = new StringBuilder();
      var1.append("OnTextFlushedEvent(text=");
      var1.append(var3);
      var1.append(", requestId=");
      var1.append(var2);
      var1.append(")");
      return var1.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<OnTextFlushedEvent> {
         return OnTextFlushedEvent.$serializer.INSTANCE;
      }
   }
}

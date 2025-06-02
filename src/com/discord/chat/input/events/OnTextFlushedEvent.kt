package com.discord.chat.input.events

import Ka.f
import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer

@f
internal data class OnTextFlushedEvent(text: String, requestId: String) : ReactEvent {
   public final val text: String
   public final val requestId: String

   init {
      q.h(var1, "text");
      q.h(var2, "requestId");
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
      q.h(var1, "text");
      q.h(var2, "requestId");
      return new OnTextFlushedEvent(var1, var2);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is OnTextFlushedEvent) {
         return false;
      } else {
         var1 = var1;
         if (!q.c(this.text, var1.text)) {
            return false;
         } else {
            return q.c(this.requestId, var1.requestId);
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
      val var1: java.lang.String = this.requestId;
      val var2: StringBuilder = new StringBuilder();
      var2.append("OnTextFlushedEvent(text=");
      var2.append(var3);
      var2.append(", requestId=");
      var2.append(var1);
      var2.append(")");
      return var2.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<OnTextFlushedEvent> {
         return OnTextFlushedEvent.$serializer.INSTANCE;
      }
   }
}

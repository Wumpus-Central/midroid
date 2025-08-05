package com.discord.chat.input.events

import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import kotlin.jvm.internal.r
import kotlinx.serialization.KSerializer
import tb.g

@g
public data class OnPasteImageEvent(url: String, type: String?) : ReactEvent {
   public final val url: String
   public final val type: String?

   init {
      r.h(var1, "url");
      super();
      this.url = var1;
      this.type = var2;
   }

   public operator fun component1(): String {
      return this.url;
   }

   public operator fun component2(): String? {
      return this.type;
   }

   public fun copy(url: String = var0.url, type: String? = var0.type): OnPasteImageEvent {
      r.h(var1, "url");
      return new OnPasteImageEvent(var1, var2);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is OnPasteImageEvent) {
         return false;
      } else {
         var1 = var1;
         if (!r.c(this.url, var1.url)) {
            return false;
         } else {
            return r.c(this.type, var1.type);
         }
      }
   }

   public override fun hashCode(): Int {
      val var2: Int = this.url.hashCode();
      val var1: Int;
      if (this.type == null) {
         var1 = 0;
      } else {
         var1 = this.type.hashCode();
      }

      return var2 * 31 + var1;
   }

   override fun serialize(): WritableMap {
      return ReactEvent.DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var1: java.lang.String = this.url;
      val var2: java.lang.String = this.type;
      val var3: StringBuilder = new StringBuilder();
      var3.append("OnPasteImageEvent(url=");
      var3.append(var1);
      var3.append(", type=");
      var3.append(var2);
      var3.append(")");
      return var3.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<OnPasteImageEvent> {
         return OnPasteImageEvent.$serializer.INSTANCE;
      }
   }
}

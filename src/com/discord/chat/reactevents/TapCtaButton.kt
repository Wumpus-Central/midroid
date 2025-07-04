package com.discord.chat.reactevents

import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import kotlin.jvm.internal.r
import kotlinx.serialization.KSerializer
import sb.f

@f
public data class TapCtaButton(channelId: String, messageId: String, callback: String) : ReactEvent {
   public final val channelId: String
   public final val messageId: String
   public final val callback: String

   init {
      r.h(var1, "channelId");
      r.h(var2, "messageId");
      r.h(var3, "callback");
      super();
      this.channelId = var1;
      this.messageId = var2;
      this.callback = var3;
   }

   public operator fun component1(): String {
      return this.channelId;
   }

   public operator fun component2(): String {
      return this.messageId;
   }

   public operator fun component3(): String {
      return this.callback;
   }

   public fun copy(channelId: String = var0.channelId, messageId: String = var0.messageId, callback: String = var0.callback): TapCtaButton {
      r.h(var1, "channelId");
      r.h(var2, "messageId");
      r.h(var3, "callback");
      return new TapCtaButton(var1, var2, var3);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is TapCtaButton) {
         return false;
      } else {
         var1 = var1;
         if (!r.c(this.channelId, var1.channelId)) {
            return false;
         } else if (!r.c(this.messageId, var1.messageId)) {
            return false;
         } else {
            return r.c(this.callback, var1.callback);
         }
      }
   }

   public override fun hashCode(): Int {
      return (this.channelId.hashCode() * 31 + this.messageId.hashCode()) * 31 + this.callback.hashCode();
   }

   override fun serialize(): WritableMap {
      return ReactEvent.DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var4: java.lang.String = this.channelId;
      val var2: java.lang.String = this.messageId;
      val var3: java.lang.String = this.callback;
      val var1: StringBuilder = new StringBuilder();
      var1.append("TapCtaButton(channelId=");
      var1.append(var4);
      var1.append(", messageId=");
      var1.append(var2);
      var1.append(", callback=");
      var1.append(var3);
      var1.append(")");
      return var1.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<TapCtaButton> {
         return TapCtaButton.$serializer.INSTANCE;
      }
   }
}

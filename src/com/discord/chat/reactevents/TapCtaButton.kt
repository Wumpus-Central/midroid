package com.discord.chat.reactevents

import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import kb.f
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer

@f
public data class TapCtaButton(channelId: String, messageId: String, callback: String) : ReactEvent {
   public final val channelId: String
   public final val messageId: String
   public final val callback: String

   init {
      q.h(var1, "channelId");
      q.h(var2, "messageId");
      q.h(var3, "callback");
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
      q.h(var1, "channelId");
      q.h(var2, "messageId");
      q.h(var3, "callback");
      return new TapCtaButton(var1, var2, var3);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is TapCtaButton) {
         return false;
      } else {
         var1 = var1;
         if (!q.c(this.channelId, var1.channelId)) {
            return false;
         } else if (!q.c(this.messageId, var1.messageId)) {
            return false;
         } else {
            return q.c(this.callback, var1.callback);
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
      val var3: java.lang.String = this.messageId;
      val var1: java.lang.String = this.callback;
      val var2: StringBuilder = new StringBuilder();
      var2.append("TapCtaButton(channelId=");
      var2.append(var4);
      var2.append(", messageId=");
      var2.append(var3);
      var2.append(", callback=");
      var2.append(var1);
      var2.append(")");
      return var2.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<TapCtaButton> {
         return TapCtaButton.$serializer.INSTANCE;
      }
   }
}

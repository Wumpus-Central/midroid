package com.discord.chat.reactevents

import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import kotlin.jvm.internal.r
import kotlinx.serialization.KSerializer
import tb.g

@g
internal data class TapAppMessageEmbedData(messageId: String, actionId: String, appId: String, embedUrl: String) : ReactEvent {
   public final val messageId: String
   public final val actionId: String
   public final val appId: String
   public final val embedUrl: String

   init {
      r.h(var1, "messageId");
      r.h(var2, "actionId");
      r.h(var3, "appId");
      r.h(var4, "embedUrl");
      super();
      this.messageId = var1;
      this.actionId = var2;
      this.appId = var3;
      this.embedUrl = var4;
   }

   public operator fun component1(): String {
      return this.messageId;
   }

   public operator fun component2(): String {
      return this.actionId;
   }

   public operator fun component3(): String {
      return this.appId;
   }

   public operator fun component4(): String {
      return this.embedUrl;
   }

   public fun copy(messageId: String = var0.messageId, actionId: String = var0.actionId, appId: String = var0.appId, embedUrl: String = var0.embedUrl): TapAppMessageEmbedData {
      r.h(var1, "messageId");
      r.h(var2, "actionId");
      r.h(var3, "appId");
      r.h(var4, "embedUrl");
      return new TapAppMessageEmbedData(var1, var2, var3, var4);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is TapAppMessageEmbedData) {
         return false;
      } else {
         var1 = var1;
         if (!r.c(this.messageId, var1.messageId)) {
            return false;
         } else if (!r.c(this.actionId, var1.actionId)) {
            return false;
         } else if (!r.c(this.appId, var1.appId)) {
            return false;
         } else {
            return r.c(this.embedUrl, var1.embedUrl);
         }
      }
   }

   public override fun hashCode(): Int {
      return ((this.messageId.hashCode() * 31 + this.actionId.hashCode()) * 31 + this.appId.hashCode()) * 31 + this.embedUrl.hashCode();
   }

   override fun serialize(): WritableMap {
      return ReactEvent.DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var5: java.lang.String = this.messageId;
      val var3: java.lang.String = this.actionId;
      val var4: java.lang.String = this.appId;
      val var2: java.lang.String = this.embedUrl;
      val var1: StringBuilder = new StringBuilder();
      var1.append("TapAppMessageEmbedData(messageId=");
      var1.append(var5);
      var1.append(", actionId=");
      var1.append(var3);
      var1.append(", appId=");
      var1.append(var4);
      var1.append(", embedUrl=");
      var1.append(var2);
      var1.append(")");
      return var1.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<TapAppMessageEmbedData> {
         return TapAppMessageEmbedData.$serializer.INSTANCE;
      }
   }
}

package com.discord.chat.reactevents

import com.discord.reactevents.ReactEvent
import com.discord.reactevents.ReactEvent.DefaultImpls
import com.facebook.react.bridge.WritableMap
import kotlinx.serialization.KSerializer
import wc.m

@m
internal data class TapAppMessageEmbedData(messageId: String, actionId: String, appId: String, embedUrl: String) : ReactEvent {
   public final val messageId: String
   public final val actionId: String
   public final val appId: String
   public final val embedUrl: String

   init {
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
      return new TapAppMessageEmbedData(var1, var2, var3, var4);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is TapAppMessageEmbedData) {
         return false;
      } else {
         var1 = var1;
         if (!(this.messageId == var1.messageId)) {
            return false;
         } else if (!(this.actionId == var1.actionId)) {
            return false;
         } else if (!(this.appId == var1.appId)) {
            return false;
         } else {
            return this.embedUrl == var1.embedUrl;
         }
      }
   }

   public override fun hashCode(): Int {
      return ((this.messageId.hashCode() * 31 + this.actionId.hashCode()) * 31 + this.appId.hashCode()) * 31 + this.embedUrl.hashCode();
   }

   fun serialize(): WritableMap {
      return DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var3: java.lang.String = this.messageId;
      val var2: java.lang.String = this.actionId;
      val var5: java.lang.String = this.appId;
      val var1: java.lang.String = this.embedUrl;
      val var4: StringBuilder = new StringBuilder();
      var4.append("TapAppMessageEmbedData(messageId=");
      var4.append(var3);
      var4.append(", actionId=");
      var4.append(var2);
      var4.append(", appId=");
      var4.append(var5);
      var4.append(", embedUrl=");
      var4.append(var1);
      var4.append(")");
      return var4.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<TapAppMessageEmbedData> {
         return TapAppMessageEmbedData.$serializer.INSTANCE;
      }
   }
}

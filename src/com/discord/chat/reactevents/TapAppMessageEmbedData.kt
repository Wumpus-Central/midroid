package com.discord.chat.reactevents

import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import kotlinx.serialization.KSerializer
import nb.g

@g
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

   override fun serialize(): WritableMap {
      return ReactEvent.DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var1: java.lang.String = this.messageId;
      val var4: java.lang.String = this.actionId;
      val var5: java.lang.String = this.appId;
      val var3: java.lang.String = this.embedUrl;
      val var2: StringBuilder = new StringBuilder();
      var2.append("TapAppMessageEmbedData(messageId=");
      var2.append(var1);
      var2.append(", actionId=");
      var2.append(var4);
      var2.append(", appId=");
      var2.append(var5);
      var2.append(", embedUrl=");
      var2.append(var3);
      var2.append(")");
      return var2.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<TapAppMessageEmbedData> {
         return TapAppMessageEmbedData.$serializer.INSTANCE;
      }
   }
}

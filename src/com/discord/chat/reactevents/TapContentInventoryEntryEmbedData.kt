package com.discord.chat.reactevents

import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import kotlin.jvm.internal.r
import kotlinx.serialization.KSerializer
import sb.g

@g
public data class TapContentInventoryEntryEmbedData(messageId: String, authorId: String, contentId: String, tappedElement: String) : ReactEvent {
   public final val messageId: String
   public final val authorId: String
   public final val contentId: String
   public final val tappedElement: String

   init {
      r.h(var1, "messageId");
      r.h(var2, "authorId");
      r.h(var3, "contentId");
      r.h(var4, "tappedElement");
      super();
      this.messageId = var1;
      this.authorId = var2;
      this.contentId = var3;
      this.tappedElement = var4;
   }

   public operator fun component1(): String {
      return this.messageId;
   }

   public operator fun component2(): String {
      return this.authorId;
   }

   public operator fun component3(): String {
      return this.contentId;
   }

   public operator fun component4(): String {
      return this.tappedElement;
   }

   public fun copy(
      messageId: String = var0.messageId,
      authorId: String = var0.authorId,
      contentId: String = var0.contentId,
      tappedElement: String = var0.tappedElement
   ): TapContentInventoryEntryEmbedData {
      r.h(var1, "messageId");
      r.h(var2, "authorId");
      r.h(var3, "contentId");
      r.h(var4, "tappedElement");
      return new TapContentInventoryEntryEmbedData(var1, var2, var3, var4);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is TapContentInventoryEntryEmbedData) {
         return false;
      } else {
         var1 = var1;
         if (!r.c(this.messageId, var1.messageId)) {
            return false;
         } else if (!r.c(this.authorId, var1.authorId)) {
            return false;
         } else if (!r.c(this.contentId, var1.contentId)) {
            return false;
         } else {
            return r.c(this.tappedElement, var1.tappedElement);
         }
      }
   }

   public override fun hashCode(): Int {
      return ((this.messageId.hashCode() * 31 + this.authorId.hashCode()) * 31 + this.contentId.hashCode()) * 31 + this.tappedElement.hashCode();
   }

   override fun serialize(): WritableMap {
      return ReactEvent.DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var3: java.lang.String = this.messageId;
      val var1: java.lang.String = this.authorId;
      val var2: java.lang.String = this.contentId;
      val var5: java.lang.String = this.tappedElement;
      val var4: StringBuilder = new StringBuilder();
      var4.append("TapContentInventoryEntryEmbedData(messageId=");
      var4.append(var3);
      var4.append(", authorId=");
      var4.append(var1);
      var4.append(", contentId=");
      var4.append(var2);
      var4.append(", tappedElement=");
      var4.append(var5);
      var4.append(")");
      return var4.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<TapContentInventoryEntryEmbedData> {
         return TapContentInventoryEntryEmbedData.$serializer.INSTANCE;
      }
   }
}

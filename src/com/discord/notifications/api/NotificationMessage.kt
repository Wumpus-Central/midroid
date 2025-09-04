package com.discord.notifications.api

import kotlinx.serialization.KSerializer
import kotlinx.serialization.json.JsonObject
import nb.g

@g
public data class NotificationMessage(stickerItems: List<Sticker> = CollectionsKt.k(),
   author: JsonObject? = null,
   mentions: List<JsonObject> = CollectionsKt.k(),
   poll: Poll? = null,
   embeds: List<Embed> = CollectionsKt.k()
) {
   public final val stickerItems: List<Sticker>
   public final val author: JsonObject?
   public final val mentions: List<JsonObject>
   public final val poll: Poll?
   public final val embeds: List<Embed>

   public final val sticker: Sticker?
      public final get() {
         return CollectionsKt.firstOrNull(this.stickerItems) as Sticker;
      }


   public final val embed: Embed?
      public final get() {
         return CollectionsKt.firstOrNull(this.embeds) as Embed;
      }


   fun NotificationMessage() {
      this(null, null, null, null, null, 31, null);
   }

   init {
      this.stickerItems = var1;
      this.author = var2;
      this.mentions = var3;
      this.poll = var4;
      this.embeds = var5;
   }

   public operator fun component1(): List<Sticker> {
      return this.stickerItems;
   }

   public operator fun component2(): JsonObject? {
      return this.author;
   }

   public operator fun component3(): List<JsonObject> {
      return this.mentions;
   }

   public operator fun component4(): Poll? {
      return this.poll;
   }

   public operator fun component5(): List<Embed> {
      return this.embeds;
   }

   public fun copy(
      stickerItems: List<Sticker> = var0.stickerItems,
      author: JsonObject? = var0.author,
      mentions: List<JsonObject> = var0.mentions,
      poll: Poll? = var0.poll,
      embeds: List<Embed> = var0.embeds
   ): NotificationMessage {
      return new NotificationMessage(var1, var2, var3, var4, var5);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is NotificationMessage) {
         return false;
      } else {
         var1 = var1;
         if (!(this.stickerItems == var1.stickerItems)) {
            return false;
         } else if (!(this.author == var1.author)) {
            return false;
         } else if (!(this.mentions == var1.mentions)) {
            return false;
         } else if (!(this.poll == var1.poll)) {
            return false;
         } else {
            return this.embeds == var1.embeds;
         }
      }
   }

   public override fun hashCode(): Int {
      val var3: Int = this.stickerItems.hashCode();
      var var2: Int = 0;
      val var1: Int;
      if (this.author == null) {
         var1 = 0;
      } else {
         var1 = this.author.hashCode();
      }

      val var4: Int = this.mentions.hashCode();
      if (this.poll != null) {
         var2 = this.poll.hashCode();
      }

      return (((var3 * 31 + var1) * 31 + var4) * 31 + var2) * 31 + this.embeds.hashCode();
   }

   public override fun toString(): String {
      val var2: java.util.List = this.stickerItems;
      val var3: JsonObject = this.author;
      val var5: java.util.List = this.mentions;
      val var6: Poll = this.poll;
      val var1: java.util.List = this.embeds;
      val var4: StringBuilder = new StringBuilder();
      var4.append("NotificationMessage(stickerItems=");
      var4.append(var2);
      var4.append(", author=");
      var4.append(var3);
      var4.append(", mentions=");
      var4.append(var5);
      var4.append(", poll=");
      var4.append(var6);
      var4.append(", embeds=");
      var4.append(var1);
      var4.append(")");
      return var4.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<NotificationMessage> {
         return NotificationMessage.$serializer.INSTANCE;
      }
   }
}

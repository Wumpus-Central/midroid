package com.discord.notifications.api

import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
import kotlinx.serialization.json.JsonObject
import nn.f
import nn.n
import on.a
import qn.g0

@f
public data class NotificationMessage(stickerItems: List<Sticker> = i.j(),
   author: JsonObject? = null,
   mentions: List<JsonObject> = i.j(),
   poll: Poll? = null,
   embeds: List<Embed> = i.j()
) {
   public final val author: JsonObject?

   public final val embed: Embed?
      public final get() {
         return i.f0(this.embeds) as Embed;
      }


   public final val embeds: List<Embed>
   public final val mentions: List<JsonObject>
   public final val poll: Poll?

   public final val sticker: Sticker?
      public final get() {
         return i.f0(this.stickerItems) as Sticker;
      }


   public final val stickerItems: List<Sticker>

   fun NotificationMessage() {
      this(null, null, null, null, null, 31, null);
   }

   init {
      q.h(var1, "stickerItems");
      q.h(var3, "mentions");
      q.h(var5, "embeds");
      super();
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
      q.h(var1, "stickerItems");
      q.h(var3, "mentions");
      q.h(var5, "embeds");
      return new NotificationMessage(var1, var2, var3, var4, var5);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is NotificationMessage) {
         return false;
      } else {
         var1 = var1;
         if (!q.c(this.stickerItems, var1.stickerItems)) {
            return false;
         } else if (!q.c(this.author, var1.author)) {
            return false;
         } else if (!q.c(this.mentions, var1.mentions)) {
            return false;
         } else if (!q.c(this.poll, var1.poll)) {
            return false;
         } else {
            return q.c(this.embeds, var1.embeds);
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
      val var1: java.util.List = this.stickerItems;
      val var2: JsonObject = this.author;
      val var4: java.util.List = this.mentions;
      val var3: Poll = this.poll;
      val var5: java.util.List = this.embeds;
      val var6: StringBuilder = new StringBuilder();
      var6.append("NotificationMessage(stickerItems=");
      var6.append(var1);
      var6.append(", author=");
      var6.append(var2);
      var6.append(", mentions=");
      var6.append(var4);
      var6.append(", poll=");
      var6.append(var3);
      var6.append(", embeds=");
      var6.append(var5);
      var6.append(")");
      return var6.toString();
   }

   public object `$serializer` : g0 {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: NotificationMessage.$serializer = new NotificationMessage.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.notifications.api.NotificationMessage", var0, 5);
         var1.c("sticker_items", true);
         var1.c("author", true);
         var1.c("mentions", true);
         var1.c("poll", true);
         var1.c("embeds", true);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         val var1: Array<KSerializer> = NotificationMessage.access$get$childSerializers$cp();
         return new KSerializer[]{var1[0], a.u(rn.q.a), var1[2], a.u(Poll.$serializer.INSTANCE), var1[4]};
      }

      public open fun deserialize(decoder: Decoder): NotificationMessage {
         q.h(var1, "decoder");
         val var11: SerialDescriptor = this.getDescriptor();
         val var12: c = var1.b(var11);
         val var10: Array<KSerializer> = NotificationMessage.access$get$childSerializers$cp();
         val var5: Boolean = var12.p();
         var var9: java.util.List = null;
         var var2: Int;
         var var6: Any;
         var var7: java.util.List;
         var var8: JsonObject;
         var var14: java.util.List;
         if (var5) {
            var9 = var12.y(var11, 0, var10[0], null) as java.util.List;
            var8 = var12.n(var11, 1, rn.q.a, null) as JsonObject;
            var7 = var12.y(var11, 2, var10[2], null) as java.util.List;
            val var13: Poll = var12.n(var11, 3, Poll.$serializer.INSTANCE, null) as Poll;
            val var15: java.util.List = var12.y(var11, 4, var10[4], null) as java.util.List;
            var2 = 31;
            var6 = var13;
            var14 = var15;
         } else {
            var var3: Boolean = true;
            var2 = 0;
            var8 = null;
            var7 = null;
            var6 = null;
            var14 = null;

            while (var3) {
               val var4: Int = var12.o(var11);
               if (var4 != -1) {
                  if (var4 != 0) {
                     if (var4 != 1) {
                        if (var4 != 2) {
                           if (var4 != 3) {
                              if (var4 != 4) {
                                 throw new n(var4);
                              }

                              var14 = var12.y(var11, 4, var10[4], var14) as java.util.List;
                              var2 |= 16;
                           } else {
                              var6 = var12.n(var11, 3, Poll.$serializer.INSTANCE, var6) as Poll;
                              var2 |= 8;
                           }
                        } else {
                           var7 = var12.y(var11, 2, var10[2], var7) as java.util.List;
                           var2 |= 4;
                        }
                     } else {
                        var8 = var12.n(var11, 1, rn.q.a, var8) as JsonObject;
                        var2 |= 2;
                     }
                  } else {
                     var9 = var12.y(var11, 0, var10[0], var9) as java.util.List;
                     var2 |= 1;
                  }
               } else {
                  var3 = false;
               }
            }
         }

         var12.c(var11);
         return new NotificationMessage(var2, var9, var8, var7, (Poll)var6, var14, null);
      }

      public open fun serialize(encoder: Encoder, value: NotificationMessage) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         NotificationMessage.write$Self$notification_api_release(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return qn.g0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<NotificationMessage> {
         return NotificationMessage.$serializer.INSTANCE;
      }
   }
}

package com.discord.notifications.api

import al.g0
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
import kotlinx.serialization.json.JsonObject
import xk.f
import xk.n
import yk.a

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
      val var5: JsonObject = this.author;
      val var3: java.util.List = this.mentions;
      val var2: Poll = this.poll;
      val var6: java.util.List = this.embeds;
      val var4: StringBuilder = new StringBuilder();
      var4.append("NotificationMessage(stickerItems=");
      var4.append(var1);
      var4.append(", author=");
      var4.append(var5);
      var4.append(", mentions=");
      var4.append(var3);
      var4.append(", poll=");
      var4.append(var2);
      var4.append(", embeds=");
      var4.append(var6);
      var4.append(")");
      return var4.toString();
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
         var1.l("sticker_items", true);
         var1.l("author", true);
         var1.l("mentions", true);
         var1.l("poll", true);
         var1.l("embeds", true);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         val var1: Array<KSerializer> = NotificationMessage.access$get$childSerializers$cp();
         return new KSerializer[]{var1[0], a.u(bl.q.a), var1[2], a.u(Poll.$serializer.INSTANCE), var1[4]};
      }

      public open fun deserialize(decoder: Decoder): NotificationMessage {
         q.h(var1, "decoder");
         val var11: SerialDescriptor = this.getDescriptor();
         val var12: c = var1.c(var11);
         val var10: Array<KSerializer> = NotificationMessage.access$get$childSerializers$cp();
         val var5: Boolean = var12.y();
         var var9: java.util.List = null;
         var var2: Int;
         var var6: java.util.List;
         var var8: JsonObject;
         var var13: Any;
         val var16: java.util.List;
         if (var5) {
            var9 = var12.m(var11, 0, var10[0], null) as java.util.List;
            var8 = var12.v(var11, 1, bl.q.a, null) as JsonObject;
            var6 = var12.m(var11, 2, var10[2], null) as java.util.List;
            var13 = var12.v(var11, 3, Poll.$serializer.INSTANCE, null) as Poll;
            var16 = var12.m(var11, 4, var10[4], null) as java.util.List;
            var2 = 31;
         } else {
            var var3: Boolean = true;
            var2 = 0;
            var8 = null;
            var var7: java.util.List = null;
            var6 = null;
            var13 = null;

            while (var3) {
               val var4: Int = var12.x(var11);
               if (var4 != -1) {
                  if (var4 != 0) {
                     if (var4 != 1) {
                        if (var4 != 2) {
                           if (var4 != 3) {
                              if (var4 != 4) {
                                 throw new n(var4);
                              }

                              var13 = var12.m(var11, 4, var10[4], var13) as java.util.List;
                              var2 |= 16;
                           } else {
                              var6 = var12.v(var11, 3, Poll.$serializer.INSTANCE, var6) as Poll;
                              var2 |= 8;
                           }
                        } else {
                           var7 = var12.m(var11, 2, var10[2], var7) as java.util.List;
                           var2 |= 4;
                        }
                     } else {
                        var8 = var12.v(var11, 1, bl.q.a, var8) as JsonObject;
                        var2 |= 2;
                     }
                  } else {
                     var9 = var12.m(var11, 0, var10[0], var9) as java.util.List;
                     var2 |= 1;
                  }
               } else {
                  var3 = false;
               }
            }

            var16 = (java.util.List)var13;
            var13 = var6;
            var6 = var7;
         }

         var12.b(var11);
         return new NotificationMessage(var2, var9, var8, var6, (Poll)var13, var16, null);
      }

      public open fun serialize(encoder: Encoder, value: NotificationMessage) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.c(var3);
         NotificationMessage.write$Self$notification_api_release(var2, var4, var3);
         var4.b(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return al.g0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<NotificationMessage> {
         return NotificationMessage.$serializer.INSTANCE;
      }
   }
}

package com.discord.notifications.api

import kotlin.jvm.internal.r
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.s
import uk.f
import uk.n
import xk.f0

@f
public data class NotificationMessage(stickerItems: List<Sticker> = h.i(),
   author: JsonObject? = null,
   mentions: List<JsonObject> = h.i(),
   poll: Poll? = null,
   embeds: List<Embed> = h.i()
) {
   public final val author: JsonObject?

   public final val embed: Embed?
      public final get() {
         return h.c0(this.embeds) as Embed;
      }


   public final val embeds: List<Embed>
   public final val mentions: List<JsonObject>
   public final val poll: Poll?

   public final val sticker: Sticker?
      public final get() {
         return h.c0(this.stickerItems) as Sticker;
      }


   public final val stickerItems: List<Sticker>

   fun NotificationMessage() {
      this(null, null, null, null, null, 31, null);
   }

   init {
      r.h(var1, "stickerItems");
      r.h(var3, "mentions");
      r.h(var5, "embeds");
      super();
      this.stickerItems = var1;
      this.author = var2;
      this.mentions = var3;
      this.poll = var4;
      this.embeds = var5;
   }

   @JvmStatic
   public fun `write$Self`(self: NotificationMessage, output: CompositeEncoder, serialDesc: SerialDescriptor) {
      r.h(var0, "self");
      r.h(var1, "output");
      r.h(var2, "serialDesc");
      var var3: Boolean;
      if (!var1.A(var2, 0) && r.c(var0.stickerItems, h.i())) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.y(var2, 0, new xk.f<>(Sticker.$serializer.INSTANCE), var0.stickerItems);
      }

      if (!var1.A(var2, 1) && var0.author == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 1, s.a, var0.author);
      }

      if (!var1.A(var2, 2) && r.c(var0.mentions, h.i())) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.y(var2, 2, new xk.f<>(s.a), var0.mentions);
      }

      if (!var1.A(var2, 3) && var0.poll == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 3, Poll.$serializer.INSTANCE, var0.poll);
      }

      label48: {
         if (!var1.A(var2, 4)) {
            var3 = false;
            if (r.c(var0.embeds, h.i())) {
               break label48;
            }
         }

         var3 = true;
      }

      if (var3) {
         var1.y(var2, 4, new xk.f<>(Embed.$serializer.INSTANCE), var0.embeds);
      }
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
      r.h(var1, "stickerItems");
      r.h(var3, "mentions");
      r.h(var5, "embeds");
      return new NotificationMessage(var1, var2, var3, var4, var5);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is NotificationMessage) {
         return false;
      } else {
         var1 = var1;
         if (!r.c(this.stickerItems, var1.stickerItems)) {
            return false;
         } else if (!r.c(this.author, var1.author)) {
            return false;
         } else if (!r.c(this.mentions, var1.mentions)) {
            return false;
         } else if (!r.c(this.poll, var1.poll)) {
            return false;
         } else {
            return r.c(this.embeds, var1.embeds);
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
      val var6: java.util.List = this.stickerItems;
      val var3: JsonObject = this.author;
      val var1: java.util.List = this.mentions;
      val var4: Poll = this.poll;
      val var2: java.util.List = this.embeds;
      val var5: StringBuilder = new StringBuilder();
      var5.append("NotificationMessage(stickerItems=");
      var5.append(var6);
      var5.append(", author=");
      var5.append(var3);
      var5.append(", mentions=");
      var5.append(var1);
      var5.append(", poll=");
      var5.append(var4);
      var5.append(", embeds=");
      var5.append(var2);
      var5.append(")");
      return var5.toString();
   }

   public object `$serializer` : f0<NotificationMessage> {
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

      public override fun childSerializers(): Array<KSerializer<*>> {
         val var1: xk.f = new xk.f<>(Sticker.$serializer.INSTANCE);
         val var2: s = s.a;
         return new KSerializer[]{var1, vk.a.u(s.a), new xk.f<>(var2), vk.a.u(Poll.$serializer.INSTANCE), new xk.f<>(Embed.$serializer.INSTANCE)};
      }

      public open fun deserialize(decoder: Decoder): NotificationMessage {
         r.h(var1, "decoder");
         val var12: SerialDescriptor = this.getDescriptor();
         val var13: c = var1.b(var12);
         val var5: Boolean = var13.p();
         var var7: Any = null;
         var var2: Int;
         var var6: Any;
         var var8: Any;
         var var9: Any;
         var var15: Any;
         if (var5) {
            var6 = var13.y(var12, 0, new xk.f<>(Sticker.$serializer.INSTANCE), null);
            var15 = s.a;
            var9 = var13.n(var12, 1, s.a, null);
            var15 = var13.y(var12, 2, new xk.f((KSerializer)var15), null);
            var8 = var13.n(var12, 3, Poll.$serializer.INSTANCE, null);
            var7 = var13.y(var12, 4, new xk.f<>(Embed.$serializer.INSTANCE), null);
            var2 = 31;
         } else {
            var var3: Boolean = true;
            var2 = 0;
            var9 = null;
            var8 = null;
            var6 = null;
            var15 = null;

            while (var3) {
               val var4: Int = var13.o(var12);
               if (var4 != -1) {
                  if (var4 != 0) {
                     if (var4 != 1) {
                        if (var4 != 2) {
                           if (var4 != 3) {
                              if (var4 != 4) {
                                 throw new n(var4);
                              }

                              var15 = var13.y(var12, 4, new xk.f<>(Embed.$serializer.INSTANCE), (java.util.List<? extends Embed>)var15);
                              var2 |= 16;
                           } else {
                              var6 = var13.n(var12, 3, Poll.$serializer.INSTANCE, (Poll)var6);
                              var2 |= 8;
                           }
                        } else {
                           var8 = var13.y(var12, 2, new xk.f<>(s.a), (java.util.List<? extends JsonObject>)var8);
                           var2 |= 4;
                        }
                     } else {
                        var9 = var13.n(var12, 1, s.a, (JsonObject)var9);
                        var2 |= 2;
                     }
                  } else {
                     var7 = var13.y(var12, 0, new xk.f<>(Sticker.$serializer.INSTANCE), (java.util.List<? extends Sticker>)var7);
                     var2 |= 1;
                  }
               } else {
                  var3 = false;
               }
            }

            var15 = var8;
            var7 = var15;
            var8 = var6;
            var6 = var7;
         }

         var13.c(var12);
         return new NotificationMessage(var2, var6 as java.util.List, var9 as JsonObject, var15 as java.util.List, var8 as Poll, var7 as java.util.List, null);
      }

      public open fun serialize(encoder: Encoder, value: NotificationMessage) {
         r.h(var1, "encoder");
         r.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         NotificationMessage.write$Self(var2, var4, var3);
         var4.c(var3);
      }

      override fun typeParametersSerializers(): Array<KSerializer<?>> {
         return f0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<NotificationMessage> {
         return NotificationMessage.$serializer.INSTANCE;
      }
   }
}

package com.discord.chat.bridge.polls

import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
import nn.f
import nn.n
import on.a
import qn.b2
import qn.g0
import qn.x0

@f
public data class PollMedia(text: String? = null, attachmentIds: Set<String> = w.d(), emoji: PollMediaEmoji? = null, stickerId: Long? = null) {
   public final val attachmentIds: Set<String>
   public final val emoji: PollMediaEmoji?
   public final val stickerId: Long?
   public final val text: String?

   fun PollMedia() {
      this(null, null, null, null, 15, null);
   }

   init {
      q.h(var2, "attachmentIds");
      super();
      this.text = var1;
      this.attachmentIds = var2;
      this.emoji = var3;
      this.stickerId = var4;
   }

   public operator fun component1(): String? {
      return this.text;
   }

   public operator fun component2(): Set<String> {
      return this.attachmentIds;
   }

   public operator fun component3(): PollMediaEmoji? {
      return this.emoji;
   }

   public operator fun component4(): Long? {
      return this.stickerId;
   }

   public fun copy(
      text: String? = var0.text,
      attachmentIds: Set<String> = var0.attachmentIds,
      emoji: PollMediaEmoji? = var0.emoji,
      stickerId: Long? = var0.stickerId
   ): PollMedia {
      q.h(var2, "attachmentIds");
      return new PollMedia(var1, var2, var3, var4);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is PollMedia) {
         return false;
      } else {
         var1 = var1;
         if (!q.c(this.text, var1.text)) {
            return false;
         } else if (!q.c(this.attachmentIds, var1.attachmentIds)) {
            return false;
         } else if (!q.c(this.emoji, var1.emoji)) {
            return false;
         } else {
            return q.c(this.stickerId, var1.stickerId);
         }
      }
   }

   public override fun hashCode(): Int {
      var var3: Int = 0;
      val var1: Int;
      if (this.text == null) {
         var1 = 0;
      } else {
         var1 = this.text.hashCode();
      }

      val var4: Int = this.attachmentIds.hashCode();
      val var2: Int;
      if (this.emoji == null) {
         var2 = 0;
      } else {
         var2 = this.emoji.hashCode();
      }

      if (this.stickerId != null) {
         var3 = this.stickerId.hashCode();
      }

      return ((var1 * 31 + var4) * 31 + var2) * 31 + var3;
   }

   public override fun toString(): String {
      val var1: java.lang.String = this.text;
      val var2: java.util.Set = this.attachmentIds;
      val var4: PollMediaEmoji = this.emoji;
      val var5: java.lang.Long = this.stickerId;
      val var3: StringBuilder = new StringBuilder();
      var3.append("PollMedia(text=");
      var3.append(var1);
      var3.append(", attachmentIds=");
      var3.append(var2);
      var3.append(", emoji=");
      var3.append(var4);
      var3.append(", stickerId=");
      var3.append(var5);
      var3.append(")");
      return var3.toString();
   }

   public object `$serializer` : g0 {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: PollMedia.$serializer = new PollMedia.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.bridge.polls.PollMedia", var0, 4);
         var1.c("text", true);
         var1.c("attachmentIds", true);
         var1.c("emoji", true);
         var1.c("stickerId", true);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{a.u(b2.a), PollMedia.access$get$childSerializers$cp()[1], a.u(PollMediaEmoji.$serializer.INSTANCE), a.u(x0.a)};
      }

      public open fun deserialize(decoder: Decoder): PollMedia {
         q.h(var1, "decoder");
         val var10: SerialDescriptor = this.getDescriptor();
         val var11: c = var1.b(var10);
         val var9: Array<KSerializer> = PollMedia.access$get$childSerializers$cp();
         val var5: Boolean = var11.p();
         var var8: java.lang.String = null;
         var var2: Int;
         var var6: Any;
         var var7: java.util.Set;
         val var13: PollMediaEmoji;
         if (var5) {
            var8 = var11.n(var10, 0, b2.a, null) as java.lang.String;
            val var12: java.util.Set = var11.y(var10, 1, var9[1], null) as java.util.Set;
            val var16: PollMediaEmoji = var11.n(var10, 2, PollMediaEmoji.$serializer.INSTANCE, null) as PollMediaEmoji;
            var6 = var11.n(var10, 3, x0.a, null) as java.lang.Long;
            var2 = 15;
            var7 = var12;
            var13 = var16;
         } else {
            var var3: Boolean = true;
            var2 = 0;
            var7 = null;
            var6 = null;
            var var14: Any = null;

            while (var3) {
               val var4: Int = var11.o(var10);
               if (var4 != -1) {
                  if (var4 != 0) {
                     if (var4 != 1) {
                        if (var4 != 2) {
                           if (var4 != 3) {
                              throw new n(var4);
                           }

                           var14 = var11.n(var10, 3, x0.a, var14) as java.lang.Long;
                           var2 |= 8;
                        } else {
                           var6 = var11.n(var10, 2, PollMediaEmoji.$serializer.INSTANCE, var6) as PollMediaEmoji;
                           var2 |= 4;
                        }
                     } else {
                        var7 = var11.y(var10, 1, var9[1], var7) as java.util.Set;
                        var2 |= 2;
                     }
                  } else {
                     var8 = var11.n(var10, 0, b2.a, var8) as java.lang.String;
                     var2 |= 1;
                  }
               } else {
                  var3 = false;
               }
            }

            var6 = var14;
            var13 = (PollMediaEmoji)var6;
         }

         var11.c(var10);
         return new PollMedia(var2, var8, var7, var13, (java.lang.Long)var6, null);
      }

      public open fun serialize(encoder: Encoder, value: PollMedia) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         PollMedia.write$Self$chat_release(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return qn.g0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<PollMedia> {
         return PollMedia.$serializer.INSTANCE;
      }
   }
}

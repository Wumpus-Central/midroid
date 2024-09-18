package com.discord.chat.bridge.polls

import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
import vk.f
import vk.n
import wk.a
import yk.b2
import yk.g0
import yk.x0

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
      val var3: java.util.Set = this.attachmentIds;
      val var5: PollMediaEmoji = this.emoji;
      val var2: java.lang.Long = this.stickerId;
      val var4: StringBuilder = new StringBuilder();
      var4.append("PollMedia(text=");
      var4.append(var1);
      var4.append(", attachmentIds=");
      var4.append(var3);
      var4.append(", emoji=");
      var4.append(var5);
      var4.append(", stickerId=");
      var4.append(var2);
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
         val var0: PollMedia.$serializer = new PollMedia.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.bridge.polls.PollMedia", var0, 4);
         var1.l("text", true);
         var1.l("attachmentIds", true);
         var1.l("emoji", true);
         var1.l("stickerId", true);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{a.u(b2.a), PollMedia.access$get$childSerializers$cp()[1], a.u(PollMediaEmoji.$serializer.INSTANCE), a.u(x0.a)};
      }

      public open fun deserialize(decoder: Decoder): PollMedia {
         q.h(var1, "decoder");
         val var10: SerialDescriptor = this.getDescriptor();
         val var11: c = var1.c(var10);
         val var9: Array<KSerializer> = PollMedia.access$get$childSerializers$cp();
         val var5: Boolean = var11.y();
         var var8: java.lang.String = null;
         var var2: Int;
         var var6: Any;
         val var12: java.util.Set;
         val var15: PollMediaEmoji;
         if (var5) {
            var8 = var11.v(var10, 0, b2.a, null) as java.lang.String;
            var12 = var11.m(var10, 1, var9[1], null) as java.util.Set;
            var15 = var11.v(var10, 2, PollMediaEmoji.$serializer.INSTANCE, null) as PollMediaEmoji;
            var6 = var11.v(var10, 3, x0.a, null) as java.lang.Long;
            var2 = 15;
         } else {
            var var3: Boolean = true;
            var2 = 0;
            var var7: java.util.Set = null;
            var6 = null;
            var var13: Any = null;

            while (var3) {
               val var4: Int = var11.x(var10);
               if (var4 != -1) {
                  if (var4 != 0) {
                     if (var4 != 1) {
                        if (var4 != 2) {
                           if (var4 != 3) {
                              throw new n(var4);
                           }

                           var13 = var11.v(var10, 3, x0.a, var13) as java.lang.Long;
                           var2 |= 8;
                        } else {
                           var6 = var11.v(var10, 2, PollMediaEmoji.$serializer.INSTANCE, var6) as PollMediaEmoji;
                           var2 |= 4;
                        }
                     } else {
                        var7 = var11.m(var10, 1, var9[1], var7) as java.util.Set;
                        var2 |= 2;
                     }
                  } else {
                     var8 = var11.v(var10, 0, b2.a, var8) as java.lang.String;
                     var2 |= 1;
                  }
               } else {
                  var3 = false;
               }
            }

            var15 = (PollMediaEmoji)var6;
            var6 = var13;
            var12 = var7;
         }

         var11.b(var10);
         return new PollMedia(var2, var8, var12, var15, (java.lang.Long)var6, null);
      }

      public open fun serialize(encoder: Encoder, value: PollMedia) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.c(var3);
         PollMedia.write$Self$chat_release(var2, var4, var3);
         var4.b(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return yk.g0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<PollMedia> {
         return PollMedia.$serializer.INSTANCE;
      }
   }
}

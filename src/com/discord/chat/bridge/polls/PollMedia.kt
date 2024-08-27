package com.discord.chat.bridge.polls

import kotlin.jvm.internal.r
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
import uk.f
import uk.n
import vk.a
import xk.a2
import xk.f0
import xk.t0
import xk.w0

@f
public data class PollMedia(text: String? = null, attachmentIds: Set<String> = u.d(), emoji: PollMediaEmoji? = null, stickerId: Long? = null) {
   public final val attachmentIds: Set<String>
   public final val emoji: PollMediaEmoji?
   public final val stickerId: Long?
   public final val text: String?

   fun PollMedia() {
      this(null, null, null, null, 15, null);
   }

   init {
      r.h(var2, "attachmentIds");
      super();
      this.text = var1;
      this.attachmentIds = var2;
      this.emoji = var3;
      this.stickerId = var4;
   }

   @JvmStatic
   public fun `write$Self`(self: PollMedia, output: CompositeEncoder, serialDesc: SerialDescriptor) {
      r.h(var0, "self");
      r.h(var1, "output");
      r.h(var2, "serialDesc");
      var var3: Boolean;
      if (!var1.A(var2, 0) && var0.text == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 0, a2.a, var0.text);
      }

      if (!var1.A(var2, 1) && r.c(var0.attachmentIds, u.d())) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.y(var2, 1, new t0(a2.a), var0.attachmentIds);
      }

      if (!var1.A(var2, 2) && var0.emoji == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 2, PollMediaEmoji.$serializer.INSTANCE, var0.emoji);
      }

      label40: {
         if (!var1.A(var2, 3)) {
            var3 = false;
            if (var0.stickerId == null) {
               break label40;
            }
         }

         var3 = true;
      }

      if (var3) {
         var1.m(var2, 3, w0.a, var0.stickerId);
      }
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
      r.h(var2, "attachmentIds");
      return new PollMedia(var1, var2, var3, var4);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is PollMedia) {
         return false;
      } else {
         var1 = var1;
         if (!r.c(this.text, var1.text)) {
            return false;
         } else if (!r.c(this.attachmentIds, var1.attachmentIds)) {
            return false;
         } else if (!r.c(this.emoji, var1.emoji)) {
            return false;
         } else {
            return r.c(this.stickerId, var1.stickerId);
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

   public object `$serializer` : f0<PollMedia> {
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
         val var1: a2 = a2.a;
         return new KSerializer[]{a.u(a2.a), new t0(var1), a.u(PollMediaEmoji.$serializer.INSTANCE), a.u(w0.a)};
      }

      public open fun deserialize(decoder: Decoder): PollMedia {
         r.h(var1, "decoder");
         val var9: SerialDescriptor = this.getDescriptor();
         val var10: c = var1.b(var9);
         val var5: Boolean = var10.p();
         var var7: Any = null;
         var var2: Int;
         var var6: Any;
         var var8: Any;
         var var12: Any;
         if (var5) {
            var12 = a2.a;
            var7 = var10.n(var9, 0, a2.a, null);
            var8 = var10.y(var9, 1, new t0((KSerializer)var12), null);
            var6 = var10.n(var9, 2, PollMediaEmoji.$serializer.INSTANCE, null);
            var12 = var10.n(var9, 3, w0.a, null);
            var2 = 15;
         } else {
            var var3: Boolean = true;
            var2 = 0;
            var8 = null;
            var6 = null;
            var12 = null;

            while (var3) {
               val var4: Int = var10.o(var9);
               if (var4 != -1) {
                  if (var4 != 0) {
                     if (var4 != 1) {
                        if (var4 != 2) {
                           if (var4 != 3) {
                              throw new n(var4);
                           }

                           var12 = var10.n(var9, 3, w0.a, var12);
                           var2 |= 8;
                        } else {
                           var6 = var10.n(var9, 2, PollMediaEmoji.$serializer.INSTANCE, var6);
                           var2 |= 4;
                        }
                     } else {
                        var8 = var10.y(var9, 1, new t0(a2.a), var8);
                        var2 |= 2;
                     }
                  } else {
                     var7 = var10.n(var9, 0, a2.a, var7);
                     var2 |= 1;
                  }
               } else {
                  var3 = false;
               }
            }
         }

         var10.c(var9);
         return new PollMedia(var2, var7 as java.lang.String, var8 as java.util.Set, var6 as PollMediaEmoji, var12 as java.lang.Long, null);
      }

      public open fun serialize(encoder: Encoder, value: PollMedia) {
         r.h(var1, "encoder");
         r.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         PollMedia.write$Self(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer<?>> {
         return xk.f0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<PollMedia> {
         return PollMedia.$serializer.INSTANCE;
      }
   }
}

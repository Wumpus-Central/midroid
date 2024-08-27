package com.discord.chat.reactevents

import com.discord.react.utilities.NativeMapExtensionsKt
import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import eh.w
import kotlin.jvm.internal.r
import kotlinx.serialization.DeserializationStrategy
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

@f
internal data class LongPressChannelData(guildId: String? = null, channelId: String? = null, messageId: String? = null, originalLink: String? = null) :
   ReactEvent {
   public final val channelId: String?
   public final val guildId: String?
   public final val messageId: String?
   public final val originalLink: String?

   fun LongPressChannelData() {
      this(null, null, null, null, 15, null);
   }

   init {
      super();
      this.guildId = var1;
      this.channelId = var2;
      this.messageId = var3;
      this.originalLink = var4;
   }

   @JvmStatic
   public fun `write$Self`(self: LongPressChannelData, output: CompositeEncoder, serialDesc: SerialDescriptor) {
      r.h(var0, "self");
      r.h(var1, "output");
      r.h(var2, "serialDesc");
      var var3: Boolean;
      if (!var1.A(var2, 0) && var0.guildId == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 0, a2.a, var0.guildId);
      }

      if (!var1.A(var2, 1) && var0.channelId == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 1, a2.a, var0.channelId);
      }

      if (!var1.A(var2, 2) && var0.messageId == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 2, a2.a, var0.messageId);
      }

      label40: {
         if (!var1.A(var2, 3)) {
            var3 = false;
            if (var0.originalLink == null) {
               break label40;
            }
         }

         var3 = true;
      }

      if (var3) {
         var1.m(var2, 3, a2.a, var0.originalLink);
      }
   }

   public operator fun component1(): String? {
      return this.guildId;
   }

   public operator fun component2(): String? {
      return this.channelId;
   }

   public operator fun component3(): String? {
      return this.messageId;
   }

   public operator fun component4(): String? {
      return this.originalLink;
   }

   public fun copy(
      guildId: String? = var0.guildId,
      channelId: String? = var0.channelId,
      messageId: String? = var0.messageId,
      originalLink: String? = var0.originalLink
   ): LongPressChannelData {
      return new LongPressChannelData(var1, var2, var3, var4);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is LongPressChannelData) {
         return false;
      } else {
         var1 = var1;
         if (!r.c(this.guildId, var1.guildId)) {
            return false;
         } else if (!r.c(this.channelId, var1.channelId)) {
            return false;
         } else if (!r.c(this.messageId, var1.messageId)) {
            return false;
         } else {
            return r.c(this.originalLink, var1.originalLink);
         }
      }
   }

   public override fun hashCode(): Int {
      var var4: Int = 0;
      val var1: Int;
      if (this.guildId == null) {
         var1 = 0;
      } else {
         var1 = this.guildId.hashCode();
      }

      val var2: Int;
      if (this.channelId == null) {
         var2 = 0;
      } else {
         var2 = this.channelId.hashCode();
      }

      val var3: Int;
      if (this.messageId == null) {
         var3 = 0;
      } else {
         var3 = this.messageId.hashCode();
      }

      if (this.originalLink != null) {
         var4 = this.originalLink.hashCode();
      }

      return ((var1 * 31 + var2) * 31 + var3) * 31 + var4;
   }

   public open fun serialize(): WritableMap {
      return NativeMapExtensionsKt.nativeMapOf(
         new Pair[]{
            w.a(
               "data",
               NativeMapExtensionsKt.nativeMapOf(
                  new Pair[]{
                     w.a("guildId", this.guildId), w.a("channelId", this.channelId), w.a("messageId", this.messageId), w.a("originalLink", this.originalLink)
                  }
               )
            )
         }
      );
   }

   public override fun toString(): String {
      val var3: java.lang.String = this.guildId;
      val var4: java.lang.String = this.channelId;
      val var1: java.lang.String = this.messageId;
      val var5: java.lang.String = this.originalLink;
      val var2: StringBuilder = new StringBuilder();
      var2.append("LongPressChannelData(guildId=");
      var2.append(var3);
      var2.append(", channelId=");
      var2.append(var4);
      var2.append(", messageId=");
      var2.append(var1);
      var2.append(", originalLink=");
      var2.append(var5);
      var2.append(")");
      return var2.toString();
   }

   public object `$serializer` : f0<LongPressChannelData> {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: LongPressChannelData.$serializer = new LongPressChannelData.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.reactevents.LongPressChannelData", var0, 4);
         var1.l("guildId", true);
         var1.l("channelId", true);
         var1.l("messageId", true);
         var1.l("originalLink", true);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         val var1: a2 = a2.a;
         return new KSerializer[]{a.u(a2.a), a.u(var1), a.u(var1), a.u(var1)};
      }

      public open fun deserialize(decoder: Decoder): LongPressChannelData {
         r.h(var1, "decoder");
         val var10: SerialDescriptor = this.getDescriptor();
         val var11: c = var1.b(var10);
         val var5: Boolean = var11.p();
         var var8: Any = null;
         var var2: Int;
         var var6: Any;
         var var12: Any;
         var var14: Any;
         if (var5) {
            var14 = a2.a;
            var8 = var11.n(var10, 0, a2.a, null);
            var12 = var11.n(var10, 1, (DeserializationStrategy)var14, null);
            var6 = var11.n(var10, 2, (DeserializationStrategy)var14, null);
            var14 = var11.n(var10, 3, (DeserializationStrategy)var14, null);
            var2 = 15;
         } else {
            var var3: Boolean = true;
            var2 = 0;
            var14 = null;
            var6 = null;
            var12 = null;

            while (var3) {
               val var4: Int = var11.o(var10);
               if (var4 != -1) {
                  if (var4 != 0) {
                     if (var4 != 1) {
                        if (var4 != 2) {
                           if (var4 != 3) {
                              throw new n(var4);
                           }

                           var12 = var11.n(var10, 3, a2.a, var12);
                           var2 |= 8;
                        } else {
                           var6 = var11.n(var10, 2, a2.a, var6);
                           var2 |= 4;
                        }
                     } else {
                        var14 = var11.n(var10, 1, a2.a, var14);
                        var2 |= 2;
                     }
                  } else {
                     var8 = var11.n(var10, 0, a2.a, var8);
                     var2 |= 1;
                  }
               } else {
                  var3 = false;
               }
            }

            var14 = var12;
            var12 = var14;
         }

         var11.c(var10);
         return new LongPressChannelData(var2, var8 as java.lang.String, var12 as java.lang.String, var6 as java.lang.String, var14 as java.lang.String, null);
      }

      public open fun serialize(encoder: Encoder, value: LongPressChannelData) {
         r.h(var1, "encoder");
         r.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         LongPressChannelData.write$Self(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer<?>> {
         return xk.f0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<LongPressChannelData> {
         return LongPressChannelData.$serializer.INSTANCE;
      }
   }
}

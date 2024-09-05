package com.discord.chat.reactevents

import com.discord.react.utilities.NativeMapExtensionsKt
import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
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
import vj.w

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
      this.guildId = var1;
      this.channelId = var2;
      this.messageId = var3;
      this.originalLink = var4;
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
         if (!q.c(this.guildId, var1.guildId)) {
            return false;
         } else if (!q.c(this.channelId, var1.channelId)) {
            return false;
         } else if (!q.c(this.messageId, var1.messageId)) {
            return false;
         } else {
            return q.c(this.originalLink, var1.originalLink);
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
      val var5: java.lang.String = this.guildId;
      val var3: java.lang.String = this.channelId;
      val var2: java.lang.String = this.messageId;
      val var4: java.lang.String = this.originalLink;
      val var1: StringBuilder = new StringBuilder();
      var1.append("LongPressChannelData(guildId=");
      var1.append(var5);
      var1.append(", channelId=");
      var1.append(var3);
      var1.append(", messageId=");
      var1.append(var2);
      var1.append(", originalLink=");
      var1.append(var4);
      var1.append(")");
      return var1.toString();
   }

   public object `$serializer` : g0 {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: LongPressChannelData.$serializer = new LongPressChannelData.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.reactevents.LongPressChannelData", var0, 4);
         var1.c("guildId", true);
         var1.c("channelId", true);
         var1.c("messageId", true);
         var1.c("originalLink", true);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         val var1: b2 = b2.a;
         return new KSerializer[]{a.u(b2.a), a.u(var1), a.u(var1), a.u(var1)};
      }

      public open fun deserialize(decoder: Decoder): LongPressChannelData {
         q.h(var1, "decoder");
         val var10: SerialDescriptor = this.getDescriptor();
         val var11: c = var1.b(var10);
         val var5: Boolean = var11.p();
         var var8: java.lang.String = null;
         var var2: Int;
         var var7: java.lang.String;
         var var13: java.lang.String;
         var var14: java.lang.String;
         if (var5) {
            val var6: b2 = b2.a;
            var8 = var11.n(var10, 0, b2.a, null) as java.lang.String;
            var7 = var11.n(var10, 1, var6, null) as java.lang.String;
            val var12: java.lang.String = var11.n(var10, 2, var6, null) as java.lang.String;
            val var9: java.lang.String = var11.n(var10, 3, var6, null) as java.lang.String;
            var2 = 15;
            var14 = var12;
            var13 = var9;
         } else {
            var var3: Boolean = true;
            var2 = 0;
            var7 = null;
            var14 = null;
            var13 = null;

            while (var3) {
               val var4: Int = var11.o(var10);
               if (var4 != -1) {
                  if (var4 != 0) {
                     if (var4 != 1) {
                        if (var4 != 2) {
                           if (var4 != 3) {
                              throw new n(var4);
                           }

                           var13 = var11.n(var10, 3, b2.a, var13) as java.lang.String;
                           var2 |= 8;
                        } else {
                           var14 = var11.n(var10, 2, b2.a, var14) as java.lang.String;
                           var2 |= 4;
                        }
                     } else {
                        var7 = var11.n(var10, 1, b2.a, var7) as java.lang.String;
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
         }

         var11.c(var10);
         return new LongPressChannelData(var2, var8, var7, var14, var13, null);
      }

      public open fun serialize(encoder: Encoder, value: LongPressChannelData) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         LongPressChannelData.write$Self$chat_release(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return qn.g0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<LongPressChannelData> {
         return LongPressChannelData.$serializer.INSTANCE;
      }
   }
}

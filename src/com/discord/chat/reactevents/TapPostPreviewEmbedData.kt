package com.discord.chat.reactevents

import com.discord.primitives.MessageId
import com.discord.reactevents.ReactEvent
import com.discord.reactevents.ReactEvent.DefaultImpls
import com.facebook.react.bridge.WritableMap
import dn.f
import dn.n
import gn.b2
import gn.g0
import gn.o1
import gn.g0.a
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
import kotlinx.serialization.internal.SerializationConstructorMarker

@f
public data class TapPostPreviewEmbedData(guildId: String, parentChannelId: String, threadId: String, messageId: MessageId) : TapPostPreviewEmbedData(
         var1, var2, var3, var4
      ),
   ReactEvent {
   public final val guildId: String
   public final val messageId: MessageId
   public final val parentChannelId: String
   public final val threadId: String

   fun TapPostPreviewEmbedData(
      var1: Int, var2: java.lang.String, var3: java.lang.String, var4: java.lang.String, var5: java.lang.String, var6: SerializationConstructorMarker
   ) {
      if (15 != (var1 and 15)) {
         o1.b(var1, 15, TapPostPreviewEmbedData.$serializer.INSTANCE.getDescriptor());
      }

      super();
      this.guildId = var2;
      this.parentChannelId = var3;
      this.threadId = var4;
      this.messageId = var5;
   }

   fun TapPostPreviewEmbedData(var1: java.lang.String, var2: java.lang.String, var3: java.lang.String, var4: java.lang.String) {
      q.h(var1, "guildId");
      q.h(var2, "parentChannelId");
      q.h(var3, "threadId");
      q.h(var4, "messageId");
      super();
      this.guildId = var1;
      this.parentChannelId = var2;
      this.threadId = var3;
      this.messageId = var4;
   }

   public operator fun component1(): String {
      return this.guildId;
   }

   public operator fun component2(): String {
      return this.parentChannelId;
   }

   public operator fun component3(): String {
      return this.threadId;
   }

   public operator fun component4(): MessageId {
      return this.messageId;
   }

   public fun copy(guildId: String = ..., parentChannelId: String = ..., threadId: String = ..., messageId: MessageId = ...): TapPostPreviewEmbedData {
      q.h(var1, "guildId");
      q.h(var2, "parentChannelId");
      q.h(var3, "threadId");
      q.h(var4, "messageId");
      return new TapPostPreviewEmbedData(var1, var2, var3, var4, null);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is TapPostPreviewEmbedData) {
         return false;
      } else {
         var1 = var1;
         if (!q.c(this.guildId, var1.guildId)) {
            return false;
         } else if (!q.c(this.parentChannelId, var1.parentChannelId)) {
            return false;
         } else if (!q.c(this.threadId, var1.threadId)) {
            return false;
         } else {
            return MessageId.equals-impl0(this.messageId, var1.messageId);
         }
      }
   }

   public override fun hashCode(): Int {
      return ((this.guildId.hashCode() * 31 + this.parentChannelId.hashCode()) * 31 + this.threadId.hashCode()) * 31 + MessageId.hashCode-impl(this.messageId);
   }

   fun serialize(): WritableMap {
      return DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var5: java.lang.String = this.guildId;
      val var4: java.lang.String = this.parentChannelId;
      val var3: java.lang.String = this.threadId;
      val var1: java.lang.String = MessageId.toString-impl(this.messageId);
      val var2: StringBuilder = new StringBuilder();
      var2.append("TapPostPreviewEmbedData(guildId=");
      var2.append(var5);
      var2.append(", parentChannelId=");
      var2.append(var4);
      var2.append(", threadId=");
      var2.append(var3);
      var2.append(", messageId=");
      var2.append(var1);
      var2.append(")");
      return var2.toString();
   }

   public object `$serializer` : g0 {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: TapPostPreviewEmbedData.$serializer = new TapPostPreviewEmbedData.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.reactevents.TapPostPreviewEmbedData", var0, 4);
         var1.l("guildId", false);
         var1.l("parentChannelId", false);
         var1.l("threadId", false);
         var1.l("messageId", false);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{b2.a, b2.a, b2.a, MessageId.$serializer.INSTANCE};
      }

      public open fun deserialize(decoder: Decoder): TapPostPreviewEmbedData {
         q.h(var1, "decoder");
         val var10: SerialDescriptor = this.getDescriptor();
         val var11: c = var1.b(var10);
         val var5: Boolean = var11.p();
         var var12: java.lang.String = null;
         var var2: Int;
         var var7: java.lang.String;
         var var13: java.lang.String;
         var var14: java.lang.String;
         var var16: java.lang.String;
         if (var5) {
            var7 = var11.m(var10, 0);
            var16 = var11.m(var10, 1);
            var14 = var11.m(var10, 2);
            val var9: MessageId = var11.y(var10, 3, MessageId.$serializer.INSTANCE, null) as MessageId;
            if (var9 != null) {
               var12 = var9.unbox-impl();
            }

            var2 = 15;
            var13 = var16;
            var16 = var14;
            var14 = var12;
         } else {
            var var3: Boolean = true;
            var2 = 0;
            var7 = null;
            var14 = null;
            var13 = null;
            var16 = null;

            while (var3) {
               val var4: Int = var11.o(var10);
               if (var4 != -1) {
                  if (var4 != 0) {
                     if (var4 != 1) {
                        if (var4 != 2) {
                           if (var4 != 3) {
                              throw new n(var4);
                           }

                           val var18: MessageId;
                           if (var16 != null) {
                              var18 = MessageId.box-impl(var16);
                           } else {
                              var18 = null;
                           }

                           val var19: MessageId = var11.y(var10, 3, MessageId.$serializer.INSTANCE, var18) as MessageId;
                           if (var19 != null) {
                              var16 = var19.unbox-impl();
                           } else {
                              var16 = null;
                           }

                           var2 |= 8;
                        } else {
                           var14 = var11.m(var10, 2);
                           var2 |= 4;
                        }
                     } else {
                        var13 = var11.m(var10, 1);
                        var2 |= 2;
                     }
                  } else {
                     var7 = var11.m(var10, 0);
                     var2 |= 1;
                  }
               } else {
                  var3 = false;
               }
            }

            var14 = var16;
            var16 = var14;
         }

         var11.c(var10);
         return new TapPostPreviewEmbedData(var2, var7, var13, var16, var14, null, null);
      }

      public open fun serialize(encoder: Encoder, value: TapPostPreviewEmbedData) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         TapPostPreviewEmbedData.write$Self$chat_release(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<TapPostPreviewEmbedData> {
         return TapPostPreviewEmbedData.$serializer.INSTANCE;
      }
   }
}

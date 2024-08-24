package com.discord.chat.reactevents

import com.discord.primitives.MessageId
import com.discord.reactevents.ReactEvent
import com.discord.reactevents.ReactEvent.DefaultImpls
import com.facebook.react.bridge.WritableMap
import kotlin.jvm.internal.r
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
import kotlinx.serialization.internal.SerializationConstructorMarker
import uk.f
import uk.n
import xk.a2
import xk.f0
import xk.n1
import xk.f0.a

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
         n1.b(var1, 15, TapPostPreviewEmbedData.$serializer.INSTANCE.getDescriptor());
      }

      super();
      this.guildId = var2;
      this.parentChannelId = var3;
      this.threadId = var4;
      this.messageId = var5;
   }

   fun TapPostPreviewEmbedData(var1: java.lang.String, var2: java.lang.String, var3: java.lang.String, var4: java.lang.String) {
      super();
      this.guildId = var1;
      this.parentChannelId = var2;
      this.threadId = var3;
      this.messageId = var4;
   }

   @JvmStatic
   public fun `write$Self`(self: TapPostPreviewEmbedData, output: CompositeEncoder, serialDesc: SerialDescriptor) {
      r.h(var0, "self");
      r.h(var1, "output");
      r.h(var2, "serialDesc");
      var1.z(var2, 0, var0.guildId);
      var1.z(var2, 1, var0.parentChannelId);
      var1.z(var2, 2, var0.threadId);
      var1.y(var2, 3, com.discord.primitives.MessageId..serializer.INSTANCE, MessageId.box-impl(var0.messageId));
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
      r.h(var1, "guildId");
      r.h(var2, "parentChannelId");
      r.h(var3, "threadId");
      r.h(var4, "messageId");
      return new TapPostPreviewEmbedData(var1, var2, var3, var4, null);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is TapPostPreviewEmbedData) {
         return false;
      } else {
         var1 = var1;
         if (!r.c(this.guildId, var1.guildId)) {
            return false;
         } else if (!r.c(this.parentChannelId, var1.parentChannelId)) {
            return false;
         } else if (!r.c(this.threadId, var1.threadId)) {
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
      val var4: java.lang.String = this.guildId;
      val var5: java.lang.String = this.parentChannelId;
      val var3: java.lang.String = this.threadId;
      val var2: java.lang.String = MessageId.toString-impl(this.messageId);
      val var1: StringBuilder = new StringBuilder();
      var1.append("TapPostPreviewEmbedData(guildId=");
      var1.append(var4);
      var1.append(", parentChannelId=");
      var1.append(var5);
      var1.append(", threadId=");
      var1.append(var3);
      var1.append(", messageId=");
      var1.append(var2);
      var1.append(")");
      return var1.toString();
   }

   public object `$serializer` : f0<TapPostPreviewEmbedData> {
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
         return new KSerializer[]{a2.a, a2.a, a2.a, com.discord.primitives.MessageId..serializer.INSTANCE};
      }

      public open fun deserialize(decoder: Decoder): TapPostPreviewEmbedData {
         r.h(var1, "decoder");
         val var11: SerialDescriptor = this.getDescriptor();
         val var12: c = var1.b(var11);
         var var2: Int;
         var var6: java.lang.String;
         var var7: Any;
         var var8: Any;
         var var13: Any;
         if (var12.p()) {
            var6 = var12.m(var11, 0);
            var7 = var12.m(var11, 1);
            var13 = var12.m(var11, 2);
            var8 = var12.y(var11, 3, com.discord.primitives.MessageId..serializer.INSTANCE, null);
            var2 = 15;
         } else {
            var var3: Boolean = true;
            var2 = 0;
            var8 = null;
            var7 = null;
            var6 = null;
            var13 = null;

            while (var3) {
               val var4: Int = var12.o(var11);
               if (var4 != -1) {
                  if (var4 != 0) {
                     if (var4 != 1) {
                        if (var4 != 2) {
                           if (var4 != 3) {
                              throw new n(var4);
                           }

                           var7 = var12.y(var11, 3, com.discord.primitives.MessageId..serializer.INSTANCE, var7);
                           var2 |= 8;
                        } else {
                           var6 = var12.m(var11, 2);
                           var2 |= 4;
                        }
                     } else {
                        var13 = var12.m(var11, 1);
                        var2 |= 2;
                     }
                  } else {
                     var8 = var12.m(var11, 0);
                     var2 |= 1;
                  }
               } else {
                  var3 = false;
               }
            }

            var8 = var7;
            var7 = var13;
            var13 = var6;
            var6 = (java.lang.String)var8;
         }

         var12.c(var11);
         val var19: MessageId = var8 as MessageId;
         var8 = null;
         if (var19 != null) {
            var8 = var19.unbox-impl();
         }

         return new TapPostPreviewEmbedData(var2, var6, (java.lang.String)var7, (java.lang.String)var13, (java.lang.String)var8, null, null);
      }

      public open fun serialize(encoder: Encoder, value: TapPostPreviewEmbedData) {
         r.h(var1, "encoder");
         r.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         TapPostPreviewEmbedData.write$Self(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer<?>> {
         return a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<TapPostPreviewEmbedData> {
         return TapPostPreviewEmbedData.$serializer.INSTANCE;
      }
   }
}

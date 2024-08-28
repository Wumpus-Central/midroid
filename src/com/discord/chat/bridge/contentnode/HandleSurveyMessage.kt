package com.discord.chat.bridge.contentnode

import com.discord.primitives.ChannelId
import com.discord.primitives.MessageId
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
import vk.a
import xk.a2
import xk.f0
import xk.n1

@f
public data class HandleSurveyMessage(id: MessageId, channelId: ChannelId, loggingName: String? = ...) : HandleSurveyMessage(var1, var2, var4) {
   public final val channelId: ChannelId
   public final val id: MessageId
   public final val loggingName: String?

   fun HandleSurveyMessage(var1: Int, var2: java.lang.String, var3: ChannelId, var4: java.lang.String, var5: SerializationConstructorMarker) {
      if (3 != (var1 and 3)) {
         n1.b(var1, 3, HandleSurveyMessage.$serializer.INSTANCE.getDescriptor());
      }

      super();
      this.id = var2;
      this.channelId = var3.unbox-impl();
      if ((var1 and 4) == 0) {
         this.loggingName = null;
      } else {
         this.loggingName = var4;
      }
   }

   fun HandleSurveyMessage(var1: java.lang.String, var2: Long, var4: java.lang.String) {
      super();
      this.id = var1;
      this.channelId = var2;
      this.loggingName = var4;
   }

   @JvmStatic
   public fun `write$Self`(self: HandleSurveyMessage, output: CompositeEncoder, serialDesc: SerialDescriptor) {
      r.h(var0, "self");
      r.h(var1, "output");
      r.h(var2, "serialDesc");
      val var5: com.discord.primitives.MessageId..serializer = com.discord.primitives.MessageId..serializer.INSTANCE;
      val var4: MessageId = MessageId.box-impl(var0.id);
      var var3: Boolean = false;
      var1.y(var2, 0, var5, var4);
      var1.y(var2, 1, com.discord.primitives.ChannelId..serializer.INSTANCE, ChannelId.box-impl(var0.channelId));
      if (var1.A(var2, 2) || var0.loggingName != null) {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 2, a2.a, var0.loggingName);
      }
   }

   public operator fun component1(): MessageId {
      return this.id;
   }

   public operator fun component2(): ChannelId {
      return this.channelId;
   }

   public operator fun component3(): String? {
      return this.loggingName;
   }

   public fun copy(id: MessageId = ..., channelId: ChannelId = ..., loggingName: String? = ...): HandleSurveyMessage {
      r.h(var1, "id");
      return new HandleSurveyMessage(var1, var2, var4, null);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is HandleSurveyMessage) {
         return false;
      } else {
         var1 = var1;
         if (!MessageId.equals-impl0(this.id, var1.id)) {
            return false;
         } else if (!ChannelId.equals-impl0(this.channelId, var1.channelId)) {
            return false;
         } else {
            return r.c(this.loggingName, var1.loggingName);
         }
      }
   }

   public override fun hashCode(): Int {
      val var2: Int = MessageId.hashCode-impl(this.id);
      val var3: Int = ChannelId.hashCode-impl(this.channelId);
      val var1: Int;
      if (this.loggingName == null) {
         var1 = 0;
      } else {
         var1 = this.loggingName.hashCode();
      }

      return (var2 * 31 + var3) * 31 + var1;
   }

   public override fun toString(): String {
      val var1: java.lang.String = MessageId.toString-impl(this.id);
      val var2: java.lang.String = ChannelId.toString-impl(this.channelId);
      val var4: java.lang.String = this.loggingName;
      val var3: StringBuilder = new StringBuilder();
      var3.append("HandleSurveyMessage(id=");
      var3.append(var1);
      var3.append(", channelId=");
      var3.append(var2);
      var3.append(", loggingName=");
      var3.append(var4);
      var3.append(")");
      return var3.toString();
   }

   public object `$serializer` : f0<HandleSurveyMessage> {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: HandleSurveyMessage.$serializer = new HandleSurveyMessage.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.bridge.contentnode.HandleSurveyMessage", var0, 3);
         var1.l("id", false);
         var1.l("channel_id", false);
         var1.l("loggingName", true);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{com.discord.primitives.MessageId..serializer.INSTANCE, com.discord.primitives.ChannelId..serializer.INSTANCE, a.u(a2.a)};
      }

      public open fun deserialize(decoder: Decoder): HandleSurveyMessage {
         r.h(var1, "decoder");
         val var10: SerialDescriptor = this.getDescriptor();
         val var11: c = var1.b(var10);
         var var2: Int;
         var var6: Any;
         var var7: Any;
         var var12: Any;
         if (var11.p()) {
            var12 = var11.y(var10, 0, com.discord.primitives.MessageId..serializer.INSTANCE, null);
            var7 = var11.y(var10, 1, com.discord.primitives.ChannelId..serializer.INSTANCE, null);
            var6 = var11.n(var10, 2, a2.a, null);
            var2 = 7;
         } else {
            var var3: Boolean = true;
            var2 = 0;
            var12 = null;
            var7 = null;
            var6 = null;

            while (var3) {
               val var4: Int = var11.o(var10);
               if (var4 != -1) {
                  if (var4 != 0) {
                     if (var4 != 1) {
                        if (var4 != 2) {
                           throw new n(var4);
                        }

                        var7 = var11.n(var10, 2, a2.a, var7);
                        var2 |= 4;
                     } else {
                        var6 = var11.y(var10, 1, com.discord.primitives.ChannelId..serializer.INSTANCE, var6);
                        var2 |= 2;
                     }
                  } else {
                     var12 = var11.y(var10, 0, com.discord.primitives.MessageId..serializer.INSTANCE, var12);
                     var2 |= 1;
                  }
               } else {
                  var3 = false;
               }
            }

            var7 = var6;
            var6 = var7;
         }

         var11.c(var10);
         val var16: MessageId = var12 as MessageId;
         var12 = null;
         if (var16 != null) {
            var12 = var16.unbox-impl();
         }

         return new HandleSurveyMessage(var2, (java.lang.String)var12, var7 as ChannelId, var6 as java.lang.String, null, null);
      }

      public open fun serialize(encoder: Encoder, value: HandleSurveyMessage) {
         r.h(var1, "encoder");
         r.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         HandleSurveyMessage.write$Self(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer<?>> {
         return xk.f0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<HandleSurveyMessage> {
         return HandleSurveyMessage.$serializer.INSTANCE;
      }
   }
}

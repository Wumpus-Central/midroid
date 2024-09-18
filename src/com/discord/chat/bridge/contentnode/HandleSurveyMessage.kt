package com.discord.chat.bridge.contentnode

import com.discord.primitives.ChannelId
import com.discord.primitives.MessageId
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
import kotlinx.serialization.internal.SerializationConstructorMarker
import vk.f
import vk.n
import wk.a
import yk.b2
import yk.g0
import yk.o1

@f
public data class HandleSurveyMessage(id: MessageId, channelId: ChannelId, loggingName: String? = ...) : HandleSurveyMessage(var1, var2, var4) {
   public final val channelId: ChannelId
   public final val id: MessageId
   public final val loggingName: String?

   fun HandleSurveyMessage(var1: Int, var2: java.lang.String, var3: ChannelId, var4: java.lang.String, var5: SerializationConstructorMarker) {
      if (3 != (var1 and 3)) {
         o1.b(var1, 3, HandleSurveyMessage.$serializer.INSTANCE.getDescriptor());
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
      q.h(var1, "id");
      super();
      this.id = var1;
      this.channelId = var2;
      this.loggingName = var4;
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
      q.h(var1, "id");
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
            return q.c(this.loggingName, var1.loggingName);
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
      val var3: java.lang.String = MessageId.toString-impl(this.id);
      val var1: java.lang.String = ChannelId.toString-impl(this.channelId);
      val var2: java.lang.String = this.loggingName;
      val var4: StringBuilder = new StringBuilder();
      var4.append("HandleSurveyMessage(id=");
      var4.append(var3);
      var4.append(", channelId=");
      var4.append(var1);
      var4.append(", loggingName=");
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
         val var0: HandleSurveyMessage.$serializer = new HandleSurveyMessage.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.bridge.contentnode.HandleSurveyMessage", var0, 3);
         var1.l("id", false);
         var1.l("channel_id", false);
         var1.l("loggingName", true);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{MessageId.$serializer.INSTANCE, ChannelId.$serializer.INSTANCE, a.u(b2.a)};
      }

      public open fun deserialize(decoder: Decoder): HandleSurveyMessage {
         q.h(var1, "decoder");
         val var8: SerialDescriptor = this.getDescriptor();
         val var9: c = var1.c(var8);
         var var2: Int;
         var var5: java.lang.String;
         val var7: Any;
         val var12: java.lang.String;
         if (var9.y()) {
            val var10: MessageId = var9.m(var8, 0, MessageId.$serializer.INSTANCE, null) as MessageId;
            val var11: java.lang.String;
            if (var10 != null) {
               var11 = var10.unbox-impl();
            } else {
               var11 = null;
            }

            var7 = var9.m(var8, 1, ChannelId.$serializer.INSTANCE, null) as ChannelId;
            val var6: java.lang.String = var9.v(var8, 2, b2.a, null) as java.lang.String;
            var5 = var11;
            var12 = var6;
            var2 = 7;
         } else {
            var var3: Boolean = true;
            var2 = 0;
            var var15: java.lang.String = null;
            var5 = null;
            var var13: Any = null;

            while (var3) {
               val var4: Int = var9.x(var8);
               if (var4 != -1) {
                  if (var4 != 0) {
                     if (var4 != 1) {
                        if (var4 != 2) {
                           throw new n(var4);
                        }

                        var5 = var9.v(var8, 2, b2.a, var5) as java.lang.String;
                        var2 |= 4;
                     } else {
                        var13 = var9.m(var8, 1, ChannelId.$serializer.INSTANCE, var13) as ChannelId;
                        var2 |= 2;
                     }
                  } else {
                     val var16: MessageId;
                     if (var15 != null) {
                        var16 = MessageId.box-impl(var15);
                     } else {
                        var16 = null;
                     }

                     val var17: MessageId = var9.m(var8, 0, MessageId.$serializer.INSTANCE, var16) as MessageId;
                     if (var17 != null) {
                        var15 = var17.unbox-impl();
                     } else {
                        var15 = null;
                     }

                     var2 |= 1;
                  }
               } else {
                  var3 = false;
               }
            }

            var7 = var13;
            var12 = var5;
            var5 = var15;
         }

         var9.b(var8);
         return new HandleSurveyMessage(var2, var5, (ChannelId)var7, var12, null, null);
      }

      public open fun serialize(encoder: Encoder, value: HandleSurveyMessage) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.c(var3);
         HandleSurveyMessage.write$Self$chat_release(var2, var4, var3);
         var4.b(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return yk.g0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<HandleSurveyMessage> {
         return HandleSurveyMessage.$serializer.INSTANCE;
      }
   }
}

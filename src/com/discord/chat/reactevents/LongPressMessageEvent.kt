package com.discord.chat.reactevents

import com.discord.reactevents.ReactEvent
import com.discord.reactevents.ReactEvent.DefaultImpls
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
import qn.n0

@f
internal data class LongPressMessageEvent(messageId: String,
      channelId: String,
      mediaIndex: Int,
      mediaType: String,
      componentId: String?,
      componentMediaIndex: Int?
   ) :
   ReactEvent {
   public final val channelId: String
   public final val componentId: String?
   public final val componentMediaIndex: Int?
   public final val mediaIndex: Int
   public final val mediaType: String
   public final val messageId: String

   init {
      q.h(var1, "messageId");
      q.h(var2, "channelId");
      q.h(var4, "mediaType");
      super();
      this.messageId = var1;
      this.channelId = var2;
      this.mediaIndex = var3;
      this.mediaType = var4;
      this.componentId = var5;
      this.componentMediaIndex = var6;
   }

   public operator fun component1(): String {
      return this.messageId;
   }

   public operator fun component2(): String {
      return this.channelId;
   }

   public operator fun component3(): Int {
      return this.mediaIndex;
   }

   public operator fun component4(): String {
      return this.mediaType;
   }

   public operator fun component5(): String? {
      return this.componentId;
   }

   public operator fun component6(): Int? {
      return this.componentMediaIndex;
   }

   public fun copy(
      messageId: String = var0.messageId,
      channelId: String = var0.channelId,
      mediaIndex: Int = var0.mediaIndex,
      mediaType: String = var0.mediaType,
      componentId: String? = var0.componentId,
      componentMediaIndex: Int? = var0.componentMediaIndex
   ): LongPressMessageEvent {
      q.h(var1, "messageId");
      q.h(var2, "channelId");
      q.h(var4, "mediaType");
      return new LongPressMessageEvent(var1, var2, var3, var4, var5, var6);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is LongPressMessageEvent) {
         return false;
      } else {
         var1 = var1;
         if (!q.c(this.messageId, var1.messageId)) {
            return false;
         } else if (!q.c(this.channelId, var1.channelId)) {
            return false;
         } else if (this.mediaIndex != var1.mediaIndex) {
            return false;
         } else if (!q.c(this.mediaType, var1.mediaType)) {
            return false;
         } else if (!q.c(this.componentId, var1.componentId)) {
            return false;
         } else {
            return q.c(this.componentMediaIndex, var1.componentMediaIndex);
         }
      }
   }

   public override fun hashCode(): Int {
      val var3: Int = this.messageId.hashCode();
      val var6: Int = this.channelId.hashCode();
      val var4: Int = Integer.hashCode(this.mediaIndex);
      val var5: Int = this.mediaType.hashCode();
      var var2: Int = 0;
      val var1: Int;
      if (this.componentId == null) {
         var1 = 0;
      } else {
         var1 = this.componentId.hashCode();
      }

      if (this.componentMediaIndex != null) {
         var2 = this.componentMediaIndex.hashCode();
      }

      return ((((var3 * 31 + var6) * 31 + var4) * 31 + var5) * 31 + var1) * 31 + var2;
   }

   fun serialize(): WritableMap {
      return DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var5: java.lang.String = this.messageId;
      val var3: java.lang.String = this.channelId;
      val var1: Int = this.mediaIndex;
      val var6: java.lang.String = this.mediaType;
      val var2: java.lang.String = this.componentId;
      val var7: Int = this.componentMediaIndex;
      val var4: StringBuilder = new StringBuilder();
      var4.append("LongPressMessageEvent(messageId=");
      var4.append(var5);
      var4.append(", channelId=");
      var4.append(var3);
      var4.append(", mediaIndex=");
      var4.append(var1);
      var4.append(", mediaType=");
      var4.append(var6);
      var4.append(", componentId=");
      var4.append(var2);
      var4.append(", componentMediaIndex=");
      var4.append(var7);
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
         val var0: LongPressMessageEvent.$serializer = new LongPressMessageEvent.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.reactevents.LongPressMessageEvent", var0, 6);
         var1.c("messageId", false);
         var1.c("channelId", false);
         var1.c("mediaIndex", false);
         var1.c("mediaType", false);
         var1.c("componentId", false);
         var1.c("componentMediaIndex", false);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         val var1: n0 = n0.a;
         return new KSerializer[]{b2.a, b2.a, n0.a, b2.a, a.u(b2.a), a.u(var1)};
      }

      public open fun deserialize(decoder: Decoder): LongPressMessageEvent {
         q.h(var1, "decoder");
         val var11: SerialDescriptor = this.getDescriptor();
         val var12: c = var1.b(var11);
         var var3: Int;
         val var4: Int;
         var var7: java.lang.String;
         var var9: java.lang.String;
         var var13: Any;
         var var16: java.lang.String;
         var var19: java.lang.String;
         if (var12.p()) {
            var16 = var12.m(var11, 0);
            var19 = var12.m(var11, 1);
            val var2: Int = var12.i(var11, 2);
            var7 = var12.m(var11, 3);
            val var8: java.lang.String = var12.n(var11, 4, b2.a, null) as java.lang.String;
            var13 = var12.n(var11, 5, n0.a, null) as Int;
            var4 = 63;
            var9 = var16;
            var16 = var19;
            var3 = var2;
            var19 = var8;
         } else {
            var var15: Boolean = true;
            var3 = 0;
            var9 = null;
            var var18: java.lang.String = null;
            var7 = null;
            var16 = null;
            var13 = null;
            var var14: Int = 0;

            while (var15) {
               val var5: Int = var12.o(var11);
               switch (var5) {
                  case -1:
                     var15 = false;
                     break;
                  case 0:
                     var9 = var12.m(var11, 0);
                     var14 |= 1;
                     break;
                  case 1:
                     var18 = var12.m(var11, 1);
                     var14 |= 2;
                     break;
                  case 2:
                     var3 = var12.i(var11, 2);
                     var14 |= 4;
                     break;
                  case 3:
                     var7 = var12.m(var11, 3);
                     var14 |= 8;
                     break;
                  case 4:
                     var16 = var12.n(var11, 4, b2.a, var16) as java.lang.String;
                     var14 |= 16;
                     break;
                  case 5:
                     var13 = var12.n(var11, 5, n0.a, var13) as Int;
                     var14 |= 32;
                     break;
                  default:
                     throw new n(var5);
               }
            }

            var19 = var16;
            var16 = var18;
            var4 = var14;
         }

         var12.c(var11);
         return new LongPressMessageEvent(var4, var9, var16, var3, var7, var19, (Integer)var13, null);
      }

      public open fun serialize(encoder: Encoder, value: LongPressMessageEvent) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         LongPressMessageEvent.write$Self$chat_release(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return qn.g0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<LongPressMessageEvent> {
         return LongPressMessageEvent.$serializer.INSTANCE;
      }
   }
}

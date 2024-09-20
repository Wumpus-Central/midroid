package com.discord.chat.reactevents

import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import fl.f
import fl.n
import gl.a
import il.b2
import il.g0
import il.n0
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor

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
      val var4: Int = this.channelId.hashCode();
      val var6: Int = Integer.hashCode(this.mediaIndex);
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

      return ((((var3 * 31 + var4) * 31 + var6) * 31 + var5) * 31 + var1) * 31 + var2;
   }

   override fun serialize(): WritableMap {
      return ReactEvent.DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var4: java.lang.String = this.messageId;
      val var5: java.lang.String = this.channelId;
      val var1: Int = this.mediaIndex;
      val var2: java.lang.String = this.mediaType;
      val var7: java.lang.String = this.componentId;
      val var3: Int = this.componentMediaIndex;
      val var6: StringBuilder = new StringBuilder();
      var6.append("LongPressMessageEvent(messageId=");
      var6.append(var4);
      var6.append(", channelId=");
      var6.append(var5);
      var6.append(", mediaIndex=");
      var6.append(var1);
      var6.append(", mediaType=");
      var6.append(var2);
      var6.append(", componentId=");
      var6.append(var7);
      var6.append(", componentMediaIndex=");
      var6.append(var3);
      var6.append(")");
      return var6.toString();
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
         var1.l("messageId", false);
         var1.l("channelId", false);
         var1.l("mediaIndex", false);
         var1.l("mediaType", false);
         var1.l("componentId", false);
         var1.l("componentMediaIndex", false);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         val var1: n0 = n0.a;
         return new KSerializer[]{b2.a, b2.a, n0.a, b2.a, a.u(b2.a), a.u(var1)};
      }

      public open fun deserialize(decoder: Decoder): LongPressMessageEvent {
         q.h(var1, "decoder");
         val var11: SerialDescriptor = this.getDescriptor();
         val var12: c = var1.c(var11);
         var var3: Int;
         val var4: Int;
         var var6: java.lang.String;
         var var7: java.lang.String;
         var var8: java.lang.String;
         var var9: java.lang.String;
         var var13: Any;
         if (var12.y()) {
            var9 = var12.t(var11, 0);
            var8 = var12.t(var11, 1);
            val var2: Int = var12.k(var11, 2);
            var6 = var12.t(var11, 3);
            var7 = var12.v(var11, 4, b2.a, null) as java.lang.String;
            var13 = var12.v(var11, 5, n0.a, null) as Int;
            var3 = 63;
            var4 = var2;
         } else {
            var var16: Boolean = true;
            var3 = 0;
            var9 = null;
            var8 = null;
            var7 = null;
            var6 = null;
            var13 = null;
            var var14: Int = 0;

            while (var16) {
               val var5: Int = var12.x(var11);
               switch (var5) {
                  case -1:
                     var16 = false;
                     break;
                  case 0:
                     var9 = var12.t(var11, 0);
                     var14 |= 1;
                     break;
                  case 1:
                     var8 = var12.t(var11, 1);
                     var14 |= 2;
                     break;
                  case 2:
                     var3 = var12.k(var11, 2);
                     var14 |= 4;
                     break;
                  case 3:
                     var7 = var12.t(var11, 3);
                     var14 |= 8;
                     break;
                  case 4:
                     var6 = var12.v(var11, 4, b2.a, var6) as java.lang.String;
                     var14 |= 16;
                     break;
                  case 5:
                     var13 = var12.v(var11, 5, n0.a, var13) as Int;
                     var14 |= 32;
                     break;
                  default:
                     throw new n(var5);
               }
            }

            var7 = var6;
            var6 = var7;
            var4 = var3;
            var3 = var14;
         }

         var12.b(var11);
         return new LongPressMessageEvent(var3, var9, var8, var4, var6, var7, (Integer)var13, null);
      }

      public open fun serialize(encoder: Encoder, value: LongPressMessageEvent) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.c(var3);
         LongPressMessageEvent.write$Self$chat_release(var2, var4, var3);
         var4.b(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return il.g0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<LongPressMessageEvent> {
         return LongPressMessageEvent.$serializer.INSTANCE;
      }
   }
}

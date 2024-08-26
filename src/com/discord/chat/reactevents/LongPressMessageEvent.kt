package com.discord.chat.reactevents

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
import uk.f
import uk.n
import vk.a
import xk.a2
import xk.f0
import xk.m0

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
      r.h(var1, "messageId");
      r.h(var2, "channelId");
      r.h(var4, "mediaType");
      super();
      this.messageId = var1;
      this.channelId = var2;
      this.mediaIndex = var3;
      this.mediaType = var4;
      this.componentId = var5;
      this.componentMediaIndex = var6;
   }

   @JvmStatic
   public fun `write$Self`(self: LongPressMessageEvent, output: CompositeEncoder, serialDesc: SerialDescriptor) {
      r.h(var0, "self");
      r.h(var1, "output");
      r.h(var2, "serialDesc");
      var1.z(var2, 0, var0.messageId);
      var1.z(var2, 1, var0.channelId);
      var1.w(var2, 2, var0.mediaIndex);
      var1.z(var2, 3, var0.mediaType);
      var1.m(var2, 4, a2.a, var0.componentId);
      var1.m(var2, 5, m0.a, var0.componentMediaIndex);
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
      r.h(var1, "messageId");
      r.h(var2, "channelId");
      r.h(var4, "mediaType");
      return new LongPressMessageEvent(var1, var2, var3, var4, var5, var6);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is LongPressMessageEvent) {
         return false;
      } else {
         var1 = var1;
         if (!r.c(this.messageId, var1.messageId)) {
            return false;
         } else if (!r.c(this.channelId, var1.channelId)) {
            return false;
         } else if (this.mediaIndex != var1.mediaIndex) {
            return false;
         } else if (!r.c(this.mediaType, var1.mediaType)) {
            return false;
         } else if (!r.c(this.componentId, var1.componentId)) {
            return false;
         } else {
            return r.c(this.componentMediaIndex, var1.componentMediaIndex);
         }
      }
   }

   public override fun hashCode(): Int {
      val var5: Int = this.messageId.hashCode();
      val var6: Int = this.channelId.hashCode();
      val var4: Int = Integer.hashCode(this.mediaIndex);
      val var3: Int = this.mediaType.hashCode();
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

      return ((((var5 * 31 + var6) * 31 + var4) * 31 + var3) * 31 + var1) * 31 + var2;
   }

   fun serialize(): WritableMap {
      return DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var3: java.lang.String = this.messageId;
      val var6: java.lang.String = this.channelId;
      val var1: Int = this.mediaIndex;
      val var4: java.lang.String = this.mediaType;
      val var2: java.lang.String = this.componentId;
      val var5: Int = this.componentMediaIndex;
      val var7: StringBuilder = new StringBuilder();
      var7.append("LongPressMessageEvent(messageId=");
      var7.append(var3);
      var7.append(", channelId=");
      var7.append(var6);
      var7.append(", mediaIndex=");
      var7.append(var1);
      var7.append(", mediaType=");
      var7.append(var4);
      var7.append(", componentId=");
      var7.append(var2);
      var7.append(", componentMediaIndex=");
      var7.append(var5);
      var7.append(")");
      return var7.toString();
   }

   public object `$serializer` : f0<LongPressMessageEvent> {
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
         val var1: m0 = m0.a;
         return new KSerializer[]{a2.a, a2.a, m0.a, a2.a, a.u(a2.a), a.u(var1)};
      }

      public open fun deserialize(decoder: Decoder): LongPressMessageEvent {
         r.h(var1, "decoder");
         val var11: SerialDescriptor = this.getDescriptor();
         val var12: c = var1.b(var11);
         var var2: Int;
         var var3: Int;
         var var7: java.lang.String;
         var var8: java.lang.String;
         var var9: Any;
         val var10: Any;
         val var13: java.lang.String;
         if (var12.p()) {
            val var6: java.lang.String = var12.m(var11, 0);
            var7 = var12.m(var11, 1);
            var2 = var12.i(var11, 2);
            var13 = var12.m(var11, 3);
            var9 = var12.n(var11, 4, a2.a, null);
            var10 = var12.n(var11, 5, m0.a, null);
            var3 = 63;
            var8 = var6;
         } else {
            var var4: Boolean = true;
            var3 = 0;
            var var14: java.lang.String = null;
            var7 = null;
            var8 = null;
            var9 = null;
            var var18: Any = null;
            var2 = 0;

            while (var4) {
               val var5: Int = var12.o(var11);
               switch (var5) {
                  case -1:
                     var4 = false;
                     break;
                  case 0:
                     var14 = var12.m(var11, 0);
                     var2 |= 1;
                     break;
                  case 1:
                     var7 = var12.m(var11, 1);
                     var2 |= 2;
                     break;
                  case 2:
                     var3 = var12.i(var11, 2);
                     var2 |= 4;
                     break;
                  case 3:
                     var8 = var12.m(var11, 3);
                     var2 |= 8;
                     break;
                  case 4:
                     var9 = var12.n(var11, 4, a2.a, var9);
                     var2 |= 16;
                     break;
                  case 5:
                     var18 = var12.n(var11, 5, m0.a, var18);
                     var2 |= 32;
                     break;
                  default:
                     throw new n(var5);
               }
            }

            var3 = var2;
            var13 = var8;
            var2 = var3;
            var8 = var14;
            var10 = var18;
         }

         var12.c(var11);
         return new LongPressMessageEvent(var3, var8, var7, var2, var13, var9 as java.lang.String, var10 as Integer, null);
      }

      public open fun serialize(encoder: Encoder, value: LongPressMessageEvent) {
         r.h(var1, "encoder");
         r.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         LongPressMessageEvent.write$Self(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer<?>> {
         return xk.f0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<LongPressMessageEvent> {
         return LongPressMessageEvent.$serializer.INSTANCE;
      }
   }
}

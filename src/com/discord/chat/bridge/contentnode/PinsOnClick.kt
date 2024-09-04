package com.discord.chat.bridge.contentnode

import com.discord.primitives.ChannelId
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
public data class PinsOnClick(action: String, messageChannelId: ChannelId) : PinsOnClick(var1, var2) {
   public final val action: String
   public final val messageChannelId: ChannelId

   fun PinsOnClick(var1: Int, var2: java.lang.String, var3: ChannelId, var4: SerializationConstructorMarker) {
      if (3 != (var1 and 3)) {
         n1.b(var1, 3, PinsOnClick.$serializer.INSTANCE.getDescriptor());
      }

      super();
      this.action = var2;
      this.messageChannelId = var3.unbox-impl();
   }

   fun PinsOnClick(var1: java.lang.String, var2: Long) {
      super();
      this.action = var1;
      this.messageChannelId = var2;
   }

   @JvmStatic
   public fun `write$Self`(self: PinsOnClick, output: CompositeEncoder, serialDesc: SerialDescriptor) {
      r.h(var0, "self");
      r.h(var1, "output");
      r.h(var2, "serialDesc");
      var1.z(var2, 0, var0.action);
      var1.y(var2, 1, com.discord.primitives.ChannelId..serializer.INSTANCE, ChannelId.box-impl(var0.messageChannelId));
   }

   public operator fun component1(): String {
      return this.action;
   }

   public operator fun component2(): ChannelId {
      return this.messageChannelId;
   }

   public fun copy(action: String = ..., messageChannelId: ChannelId = ...): PinsOnClick {
      r.h(var1, "action");
      return new PinsOnClick(var1, var2, null);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is PinsOnClick) {
         return false;
      } else {
         var1 = var1;
         if (!r.c(this.action, var1.action)) {
            return false;
         } else {
            return ChannelId.equals-impl0(this.messageChannelId, var1.messageChannelId);
         }
      }
   }

   public override fun hashCode(): Int {
      return this.action.hashCode() * 31 + ChannelId.hashCode-impl(this.messageChannelId);
   }

   public override fun toString(): String {
      val var2: java.lang.String = this.action;
      val var1: java.lang.String = ChannelId.toString-impl(this.messageChannelId);
      val var3: StringBuilder = new StringBuilder();
      var3.append("PinsOnClick(action=");
      var3.append(var2);
      var3.append(", messageChannelId=");
      var3.append(var1);
      var3.append(")");
      return var3.toString();
   }

   public object `$serializer` : f0<PinsOnClick> {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: PinsOnClick.$serializer = new PinsOnClick.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.bridge.contentnode.PinsOnClick", var0, 2);
         var1.l("action", false);
         var1.l("messageChannelId", false);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{a2.a, com.discord.primitives.ChannelId..serializer.INSTANCE};
      }

      public open fun deserialize(decoder: Decoder): PinsOnClick {
         r.h(var1, "decoder");
         val var7: SerialDescriptor = this.getDescriptor();
         val var8: c = var1.b(var7);
         val var5: Boolean = var8.p();
         var var6: java.lang.String = null;
         var var2: Int;
         var var9: Any;
         if (var5) {
            var6 = var8.m(var7, 0);
            var9 = var8.y(var7, 1, com.discord.primitives.ChannelId..serializer.INSTANCE, null);
            var2 = 3;
         } else {
            var var3: Boolean = true;
            var2 = 0;
            var9 = null;

            while (var3) {
               val var4: Int = var8.o(var7);
               if (var4 != -1) {
                  if (var4 != 0) {
                     if (var4 != 1) {
                        throw new n(var4);
                     }

                     var9 = var8.y(var7, 1, com.discord.primitives.ChannelId..serializer.INSTANCE, var9);
                     var2 |= 2;
                  } else {
                     var6 = var8.m(var7, 0);
                     var2 |= 1;
                  }
               } else {
                  var3 = false;
               }
            }
         }

         var8.c(var7);
         return new PinsOnClick(var2, var6, var9 as ChannelId, null, null);
      }

      public open fun serialize(encoder: Encoder, value: PinsOnClick) {
         r.h(var1, "encoder");
         r.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         PinsOnClick.write$Self(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer<?>> {
         return a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<PinsOnClick> {
         return PinsOnClick.$serializer.INSTANCE;
      }
   }
}

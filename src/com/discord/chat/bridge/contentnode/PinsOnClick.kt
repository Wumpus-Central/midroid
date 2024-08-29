package com.discord.chat.bridge.contentnode

import com.discord.primitives.ChannelId
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
public data class PinsOnClick(action: String, messageChannelId: ChannelId) : PinsOnClick(var1, var2) {
   public final val action: String
   public final val messageChannelId: ChannelId

   fun PinsOnClick(var1: Int, var2: java.lang.String, var3: ChannelId, var4: SerializationConstructorMarker) {
      if (3 != (var1 and 3)) {
         o1.b(var1, 3, PinsOnClick.$serializer.INSTANCE.getDescriptor());
      }

      super();
      this.action = var2;
      this.messageChannelId = var3.unbox-impl();
   }

   fun PinsOnClick(var1: java.lang.String, var2: Long) {
      q.h(var1, "action");
      super();
      this.action = var1;
      this.messageChannelId = var2;
   }

   public operator fun component1(): String {
      return this.action;
   }

   public operator fun component2(): ChannelId {
      return this.messageChannelId;
   }

   public fun copy(action: String = ..., messageChannelId: ChannelId = ...): PinsOnClick {
      q.h(var1, "action");
      return new PinsOnClick(var1, var2, null);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is PinsOnClick) {
         return false;
      } else {
         var1 = var1;
         if (!q.c(this.action, var1.action)) {
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
      val var3: java.lang.String = this.action;
      val var1: java.lang.String = ChannelId.toString-impl(this.messageChannelId);
      val var2: StringBuilder = new StringBuilder();
      var2.append("PinsOnClick(action=");
      var2.append(var3);
      var2.append(", messageChannelId=");
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
         val var0: PinsOnClick.$serializer = new PinsOnClick.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.bridge.contentnode.PinsOnClick", var0, 2);
         var1.l("action", false);
         var1.l("messageChannelId", false);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{b2.a, ChannelId.$serializer.INSTANCE};
      }

      public open fun deserialize(decoder: Decoder): PinsOnClick {
         q.h(var1, "decoder");
         val var8: SerialDescriptor = this.getDescriptor();
         val var9: c = var1.b(var8);
         val var5: Boolean = var9.p();
         var var6: java.lang.String = null;
         var var2: Int;
         val var7: ChannelId;
         val var10: java.lang.String;
         if (var5) {
            var10 = var9.m(var8, 0);
            var7 = var9.y(var8, 1, ChannelId.$serializer.INSTANCE, null) as ChannelId;
            var2 = 3;
         } else {
            var var3: Boolean = true;
            var2 = 0;
            var var11: ChannelId = null;

            while (var3) {
               val var4: Int = var9.o(var8);
               if (var4 != -1) {
                  if (var4 != 0) {
                     if (var4 != 1) {
                        throw new n(var4);
                     }

                     var11 = var9.y(var8, 1, ChannelId.$serializer.INSTANCE, var11) as ChannelId;
                     var2 |= 2;
                  } else {
                     var6 = var9.m(var8, 0);
                     var2 |= 1;
                  }
               } else {
                  var3 = false;
               }
            }

            var7 = var11;
            var10 = var6;
         }

         var9.c(var8);
         return new PinsOnClick(var2, var10, var7, null, null);
      }

      public open fun serialize(encoder: Encoder, value: PinsOnClick) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         PinsOnClick.write$Self$chat_release(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<PinsOnClick> {
         return PinsOnClick.$serializer.INSTANCE;
      }
   }
}

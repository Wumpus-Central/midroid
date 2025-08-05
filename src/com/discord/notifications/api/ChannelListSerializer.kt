package com.discord.notifications.api

import com.discord.primitives.ChannelId
import java.util.ArrayList
import kotlin.jvm.internal.r
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import ub.a

public object ChannelListSerializer : KSerializer {
   public open val descriptor: SerialDescriptor
      public open get() {
         return a.h(ChannelId.Companion.serializer()).getDescriptor();
      }


   private fun deserializeForCalls(channelIds: String): String {
      var var2: java.lang.String = var1;
      if (h.I(var1, "[", false, 2, null)) {
         var2 = var1;
         if (h.t(var1, "]", false, 2, null)) {
            var2 = h.s0(h.r0(var1, "["), "]");
         }
      }

      return var2;
   }

   public open fun deserialize(decoder: Decoder): List<ChannelId> {
      r.h(var1, "decoder");
      val var6: java.util.List = h.B0(this.deserializeForCalls(var1.n()), new java.lang.String[]{","}, false, 0, 6, null);
      val var4: ArrayList = new ArrayList();

      for (java.lang.String var3 : var6) {
         var var7: java.lang.String = var3;
         if (h.I(var3, "\"", false, 2, null)) {
            var7 = var3;
            if (h.t(var3, "\"", false, 2, null)) {
               var7 = h.r0(h.s0(var3, "\""), "\"");
            }
         }

         val var9: java.lang.Long = h.o(var7);
         var var8: ChannelId = null;
         if (var9 != null) {
            var8 = ChannelId.box-impl(ChannelId.constructor-impl(var9.longValue()));
         }

         if (var8 != null) {
            var4.add(var8);
         }
      }

      return var4;
   }

   public open fun serialize(encoder: Encoder, value: List<ChannelId>) {
      r.h(var1, "encoder");
      r.h(var2, "value");
      throw new UnsupportedOperationException();
   }
}

package com.discord.notifications.api

import com.discord.primitives.ChannelId
import java.util.ArrayList
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import zk.a

public object ChannelListSerializer : KSerializer {
   public open val descriptor: SerialDescriptor
      public open get() {
         return a.h(ChannelId.Companion.serializer()).getDescriptor();
      }


   public open fun deserialize(decoder: Decoder): List<ChannelId> {
      q.h(var1, "decoder");
      val var4: java.util.List = h.z0(var1.n(), new java.lang.String[]{","}, false, 0, 6, null);
      val var2: ArrayList = new ArrayList();
      val var3: java.util.Iterator = var4.iterator();

      while (var3.hasNext()) {
         val var5: java.lang.Long = h.o(var3.next() as java.lang.String);
         val var6: ChannelId;
         if (var5 != null) {
            var6 = ChannelId.box-impl(ChannelId.constructor-impl(var5.longValue()));
         } else {
            var6 = null;
         }

         if (var6 != null) {
            var2.add(var6);
         }
      }

      return var2;
   }

   public open fun serialize(encoder: Encoder, value: List<ChannelId>) {
      q.h(var1, "encoder");
      q.h(var2, "value");
      throw new UnsupportedOperationException();
   }
}

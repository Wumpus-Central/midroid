package com.discord.notifications.api

import com.discord.primitives.ChannelId
import java.util.ArrayList
import kotlin.jvm.internal.r
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import vk.a

public object ChannelListSerializer : KSerializer<java.util.List<? extends ChannelId>> {
   public open val descriptor: SerialDescriptor
      public open get() {
         return a.h(ChannelId.Companion.serializer()).getDescriptor();
      }


   public open fun deserialize(decoder: Decoder): List<ChannelId> {
      r.h(var1, "decoder");
      val var4: java.util.List = f.A0(var1.z(), new java.lang.String[]{","}, false, 0, 6, null);
      val var2: ArrayList = new ArrayList();
      val var3: java.util.Iterator = var4.iterator();

      while (var3.hasNext()) {
         val var5: java.lang.Long = f.o(var3.next() as java.lang.String);
         val var6: ChannelId;
         if (var5 != null) {
            var6 = ChannelId.box_impl(ChannelId.constructor_impl(var5.longValue()));
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
      r.h(var1, "encoder");
      r.h(var2, "value");
      throw new UnsupportedOperationException();
   }
}

package com.discord.chat.bridge.botuikit

import ha.g
import ha.e.i
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

public abstract class ComponentUnionSerializer<T> : KSerializer {
   public open val descriptor: SerialDescriptor
      public open get() {
         return g.a(this.getUnionName(), i.a);
      }


   public abstract val unionName: String

   public open fun deserialize(decoder: Decoder): Any {
      q.h(var1, "decoder");
      return this.toValue(Component.Companion.serializer().deserialize(var1) as Component);
   }

   public abstract fun fromValue(value: Any): Component? {
   }

   public open fun serialize(encoder: Encoder, value: Any) {
      q.h(var1, "encoder");
      var2 = this.fromValue((T)var2);
      if (var2 != null) {
         Component.Companion.serializer().serialize(var1, var2);
      }
   }

   public abstract fun toValue(component: Component): Any {
   }
}

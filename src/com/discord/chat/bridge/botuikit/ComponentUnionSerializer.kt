package com.discord.chat.bridge.botuikit

import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

public abstract class ComponentUnionSerializer<T> : KSerializer {
   public abstract val unionName: String

   public open val descriptor: SerialDescriptor
      public open get() {
         return zu.j.b(this.getUnionName(), zu.e.i.a);
      }


   public open fun deserialize(decoder: Decoder): Any {
      return this.toValue(Component.Companion.serializer().deserialize(var1) as Component);
   }

   public abstract fun fromValue(value: Any): Component? {
   }

   public open fun serialize(encoder: Encoder, value: Any) {
      var2 = this.fromValue((T)var2);
      if (var2 != null) {
         Component.Companion.serializer().serialize(var1, var2);
      }
   }

   public abstract fun toValue(component: Component): Any {
   }
}

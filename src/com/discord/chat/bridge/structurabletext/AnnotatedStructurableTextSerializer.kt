package com.discord.chat.bridge.structurabletext

import com.discord.chat.bridge.contentnode.ContentNode
import fn.g
import fn.e.i
import gn.f
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

internal object AnnotatedStructurableTextSerializer : KSerializer {
   public open val descriptor: SerialDescriptor = g.a("AnnotatedStructurableText", i.a)

   public open fun deserialize(decoder: Decoder): AnnotatedStructurableText {
      q.h(var1, "decoder");
      return new AnnotatedStructurableText(var1.G(new f(ContentNode.Companion.serializer())) as MutableList<ContentNode>);
   }

   public open fun serialize(encoder: Encoder, value: AnnotatedStructurableText) {
      q.h(var1, "encoder");
      q.h(var2, "value");
      throw new UnsupportedOperationException();
   }
}

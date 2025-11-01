package com.discord.chat.bridge.structurabletext

import com.discord.chat.bridge.contentnode.ContentNode
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

internal object AnnotatedStructurableTextSerializer : KSerializer {
   public open val descriptor: SerialDescriptor = zu.j.b("AnnotatedStructurableText", zu.e.i.a)

   public open fun deserialize(decoder: Decoder): AnnotatedStructurableText {
      return new AnnotatedStructurableText(var1.G(new av.f(ContentNode.Companion.serializer())) as MutableList<ContentNode>);
   }

   public open fun serialize(encoder: Encoder, value: AnnotatedStructurableText) {
      throw new UnsupportedOperationException();
   }
}

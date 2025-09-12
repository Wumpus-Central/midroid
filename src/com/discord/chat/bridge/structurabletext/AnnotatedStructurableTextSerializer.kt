package com.discord.chat.bridge.structurabletext

import com.discord.chat.bridge.contentnode.ContentNode
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import rc.j
import rc.e.i
import sc.f

internal object AnnotatedStructurableTextSerializer : KSerializer {
   public open val descriptor: SerialDescriptor = j.b("AnnotatedStructurableText", i.a)

   public open fun deserialize(decoder: Decoder): AnnotatedStructurableText {
      return new AnnotatedStructurableText(var1.G(new f(ContentNode.Companion.serializer())) as MutableList<ContentNode>);
   }

   public open fun serialize(encoder: Encoder, value: AnnotatedStructurableText) {
      throw new UnsupportedOperationException();
   }
}

package com.discord.chat.bridge.structurabletext

import com.discord.chat.bridge.contentnode.ContentNode
import kotlin.jvm.internal.r
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import mb.g
import mb.e.i
import nb.f

internal object AnnotatedStructurableTextSerializer : KSerializer {
   public open val descriptor: SerialDescriptor = g.a("AnnotatedStructurableText", i.a)

   public open fun deserialize(decoder: Decoder): AnnotatedStructurableText {
      r.h(var1, "decoder");
      return new AnnotatedStructurableText(var1.C(new f(ContentNode.Companion.serializer())) as MutableList<ContentNode>);
   }

   public open fun serialize(encoder: Encoder, value: AnnotatedStructurableText) {
      r.h(var1, "encoder");
      r.h(var2, "value");
      throw new UnsupportedOperationException();
   }
}

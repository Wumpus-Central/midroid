package com.discord.chat.bridge.structurabletext

import cl.f
import com.discord.chat.bridge.contentnode.ContentNode
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer

@f(with = AnnotatedStructurableTextSerializer::class)
public data class AnnotatedStructurableText(content: List<ContentNode>) : StructurableText {
   public final val content: List<ContentNode>
   public open val hasContent: Boolean

   init {
      q.h(var1, "content");
      super(null);
      this.content = var1;
      this.hasContent = var1.isEmpty() xor true;
   }

   public operator fun component1(): List<ContentNode> {
      return this.content;
   }

   public fun copy(content: List<ContentNode> = var0.content): AnnotatedStructurableText {
      q.h(var1, "content");
      return new AnnotatedStructurableText(var1);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is AnnotatedStructurableText) {
         return false;
      } else {
         return q.c(this.content, (var1 as AnnotatedStructurableText).content);
      }
   }

   public override fun hashCode(): Int {
      return this.content.hashCode();
   }

   public override fun toString(): String {
      val var1: java.util.List = this.content;
      val var2: StringBuilder = new StringBuilder();
      var2.append("AnnotatedStructurableText(content=");
      var2.append(var1);
      var2.append(")");
      return var2.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<AnnotatedStructurableText> {
         return AnnotatedStructurableTextSerializer.INSTANCE;
      }
   }
}

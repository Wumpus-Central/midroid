package com.discord.chat.bridge.structurabletext

import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import yk.f

@f(with = PrimitiveStructurableTextSerializer::class)
public data class PrimitiveStructurableText(content: String) : StructurableText {
   public final val content: String
   public open val hasContent: Boolean

   init {
      q.h(var1, "content");
      super(null);
      this.content = var1;
      val var2: Boolean;
      if (var1.length() > 0) {
         var2 = true;
      } else {
         var2 = false;
      }

      this.hasContent = var2;
   }

   public operator fun component1(): String {
      return this.content;
   }

   public fun copy(content: String = var0.content): PrimitiveStructurableText {
      q.h(var1, "content");
      return new PrimitiveStructurableText(var1);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is PrimitiveStructurableText) {
         return false;
      } else {
         return q.c(this.content, (var1 as PrimitiveStructurableText).content);
      }
   }

   public override fun hashCode(): Int {
      return this.content.hashCode();
   }

   public override fun toString(): String {
      val var1: java.lang.String = this.content;
      val var2: StringBuilder = new StringBuilder();
      var2.append("PrimitiveStructurableText(content=");
      var2.append(var1);
      var2.append(")");
      return var2.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<PrimitiveStructurableText> {
         return PrimitiveStructurableTextSerializer.INSTANCE;
      }
   }
}

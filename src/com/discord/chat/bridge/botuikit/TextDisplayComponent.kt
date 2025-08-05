package com.discord.chat.bridge.botuikit

import com.discord.chat.bridge.structurabletext.StructurableText
import kotlin.jvm.internal.r
import kotlinx.serialization.KSerializer
import ub.g

@g
public data class TextDisplayComponent(type: Int, id: String, content: StructurableText) : Component {
   public open val type: Int
   public open val id: String
   public final val content: StructurableText

   init {
      r.h(var2, "id");
      r.h(var3, "content");
      super(null);
      this.type = var1;
      this.id = var2;
      this.content = var3;
   }

   public operator fun component1(): Int {
      return this.type;
   }

   public operator fun component2(): String {
      return this.id;
   }

   public operator fun component3(): StructurableText {
      return this.content;
   }

   public fun copy(type: Int = var0.type, id: String = var0.id, content: StructurableText = var0.content): TextDisplayComponent {
      r.h(var2, "id");
      r.h(var3, "content");
      return new TextDisplayComponent(var1, var2, var3);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is TextDisplayComponent) {
         return false;
      } else {
         var1 = var1;
         if (this.type != var1.type) {
            return false;
         } else if (!r.c(this.id, var1.id)) {
            return false;
         } else {
            return r.c(this.content, var1.content);
         }
      }
   }

   public override fun hashCode(): Int {
      return (Integer.hashCode(this.type) * 31 + this.id.hashCode()) * 31 + this.content.hashCode();
   }

   public override fun toString(): String {
      val var1: Int = this.type;
      val var4: java.lang.String = this.id;
      val var2: StructurableText = this.content;
      val var3: StringBuilder = new StringBuilder();
      var3.append("TextDisplayComponent(type=");
      var3.append(var1);
      var3.append(", id=");
      var3.append(var4);
      var3.append(", content=");
      var3.append(var2);
      var3.append(")");
      return var3.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<TextDisplayComponent> {
         return TextDisplayComponent.$serializer.INSTANCE;
      }
   }
}

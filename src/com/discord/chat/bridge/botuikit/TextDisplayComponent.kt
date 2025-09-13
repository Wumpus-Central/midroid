package com.discord.chat.bridge.botuikit

import com.discord.chat.bridge.structurabletext.StructurableText
import kotlinx.serialization.KSerializer
import pc.m

@m
public data class TextDisplayComponent(type: Int, id: String, content: StructurableText) : Component() {
   public open val type: Int
   public open val id: String
   public final val content: StructurableText

   init {
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
         } else if (!(this.id == var1.id)) {
            return false;
         } else {
            return this.content == var1.content;
         }
      }
   }

   public override fun hashCode(): Int {
      return (Integer.hashCode(this.type) * 31 + this.id.hashCode()) * 31 + this.content.hashCode();
   }

   public override fun toString(): String {
      val var1: Int = this.type;
      val var4: java.lang.String = this.id;
      val var3: StructurableText = this.content;
      val var2: StringBuilder = new StringBuilder();
      var2.append("TextDisplayComponent(type=");
      var2.append(var1);
      var2.append(", id=");
      var2.append(var4);
      var2.append(", content=");
      var2.append(var3);
      var2.append(")");
      return var2.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<TextDisplayComponent> {
         return TextDisplayComponent.$serializer.INSTANCE;
      }
   }
}

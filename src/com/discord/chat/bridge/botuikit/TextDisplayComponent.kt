package com.discord.chat.bridge.botuikit

import com.discord.chat.bridge.structurabletext.StructurableText
import com.discord.chat.bridge.structurabletext.StructurableTextSerializer
import dn.f
import dn.n
import gn.b2
import gn.g0
import gn.n0
import gn.g0.a
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor

@f
public data class TextDisplayComponent(type: Int, id: String, content: StructurableText) : Component {
   public final val content: StructurableText
   public open val id: String
   public open val type: Int

   init {
      q.h(var2, "id");
      q.h(var3, "content");
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
      q.h(var2, "id");
      q.h(var3, "content");
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
         } else if (!q.c(this.id, var1.id)) {
            return false;
         } else {
            return q.c(this.content, var1.content);
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

   public object `$serializer` : g0 {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: TextDisplayComponent.$serializer = new TextDisplayComponent.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("10", var0, 3);
         var1.l("type", false);
         var1.l("id", false);
         var1.l("content", false);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{n0.a, b2.a, StructurableTextSerializer.INSTANCE};
      }

      public open fun deserialize(decoder: Decoder): TextDisplayComponent {
         q.h(var1, "decoder");
         val var7: SerialDescriptor = this.getDescriptor();
         val var8: c = var1.b(var7);
         var var3: Int;
         val var4: Int;
         var var6: java.lang.String;
         var var9: StructurableText;
         if (var8.p()) {
            val var2: Int = var8.i(var7, 0);
            var6 = var8.m(var7, 1);
            var9 = var8.y(var7, 2, StructurableTextSerializer.INSTANCE, null) as StructurableText;
            var3 = 7;
            var4 = var2;
         } else {
            var var12: Boolean = true;
            var3 = 0;
            var6 = null;
            var9 = null;
            var var10: Int = 0;

            while (var12) {
               val var5: Int = var8.o(var7);
               if (var5 != -1) {
                  if (var5 != 0) {
                     if (var5 != 1) {
                        if (var5 != 2) {
                           throw new n(var5);
                        }

                        var9 = var8.y(var7, 2, StructurableTextSerializer.INSTANCE, var9) as StructurableText;
                        var10 |= 4;
                     } else {
                        var6 = var8.m(var7, 1);
                        var10 |= 2;
                     }
                  } else {
                     var3 = var8.i(var7, 0);
                     var10 |= 1;
                  }
               } else {
                  var12 = false;
               }
            }

            var4 = var3;
            var3 = var10;
         }

         var8.c(var7);
         return new TextDisplayComponent(var3, var4, var6, var9, null);
      }

      public open fun serialize(encoder: Encoder, value: TextDisplayComponent) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         TextDisplayComponent.write$Self$chat_release(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<TextDisplayComponent> {
         return TextDisplayComponent.$serializer.INSTANCE;
      }
   }
}

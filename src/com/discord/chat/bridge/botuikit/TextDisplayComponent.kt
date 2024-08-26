package com.discord.chat.bridge.botuikit

import com.discord.chat.bridge.structurabletext.StructurableText
import com.discord.chat.bridge.structurabletext.StructurableTextSerializer
import kotlin.jvm.internal.r
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
import uk.f
import uk.n
import xk.a2
import xk.f0
import xk.m0
import xk.f0.a

@f
public data class TextDisplayComponent(type: Int, id: String, content: StructurableText) : Component {
   public final val content: StructurableText
   public open val id: String
   public open val type: Int

   init {
      r.h(var2, "id");
      r.h(var3, "content");
      super(null);
      this.type = var1;
      this.id = var2;
      this.content = var3;
   }

   @JvmStatic
   public fun `write$Self`(self: TextDisplayComponent, output: CompositeEncoder, serialDesc: SerialDescriptor) {
      r.h(var0, "self");
      r.h(var1, "output");
      r.h(var2, "serialDesc");
      var1.w(var2, 0, var0.getType());
      var1.z(var2, 1, var0.getId());
      var1.y(var2, 2, StructurableTextSerializer.INSTANCE, var0.content);
   }

   public operator fun component1(): Int {
      return this.getType();
   }

   public operator fun component2(): String {
      return this.getId();
   }

   public operator fun component3(): StructurableText {
      return this.content;
   }

   public fun copy(type: Int = var0.getType(), id: String = var0.getId(), content: StructurableText = var0.content): TextDisplayComponent {
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
         if (this.getType() != var1.getType()) {
            return false;
         } else if (!r.c(this.getId(), var1.getId())) {
            return false;
         } else {
            return r.c(this.content, var1.content);
         }
      }
   }

   public override fun hashCode(): Int {
      return (Integer.hashCode(this.getType()) * 31 + this.getId().hashCode()) * 31 + this.content.hashCode();
   }

   public override fun toString(): String {
      val var1: Int = this.getType();
      val var4: java.lang.String = this.getId();
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

   public object `$serializer` : f0<TextDisplayComponent> {
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
         return new KSerializer[]{m0.a, a2.a, StructurableTextSerializer.INSTANCE};
      }

      public open fun deserialize(decoder: Decoder): TextDisplayComponent {
         r.h(var1, "decoder");
         val var7: SerialDescriptor = this.getDescriptor();
         val var8: c = var1.b(var7);
         var var2: Int;
         var var3: Int;
         var var6: java.lang.String;
         var var9: Any;
         if (var8.p()) {
            var3 = var8.i(var7, 0);
            var6 = var8.m(var7, 1);
            var9 = var8.y(var7, 2, StructurableTextSerializer.INSTANCE, null);
            var2 = 7;
         } else {
            var var4: Boolean = true;
            var3 = 0;
            var6 = null;
            var9 = null;
            var2 = 0;

            while (var4) {
               val var5: Int = var8.o(var7);
               if (var5 != -1) {
                  if (var5 != 0) {
                     if (var5 != 1) {
                        if (var5 != 2) {
                           throw new n(var5);
                        }

                        var9 = var8.y(var7, 2, StructurableTextSerializer.INSTANCE, var9);
                        var2 |= 4;
                     } else {
                        var6 = var8.m(var7, 1);
                        var2 |= 2;
                     }
                  } else {
                     var3 = var8.i(var7, 0);
                     var2 |= 1;
                  }
               } else {
                  var4 = false;
               }
            }
         }

         var8.c(var7);
         return new TextDisplayComponent(var2, var3, var6, var9 as StructurableText, null);
      }

      public open fun serialize(encoder: Encoder, value: TextDisplayComponent) {
         r.h(var1, "encoder");
         r.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         TextDisplayComponent.write$Self(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer<?>> {
         return a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<TextDisplayComponent> {
         return TextDisplayComponent.$serializer.INSTANCE;
      }
   }
}

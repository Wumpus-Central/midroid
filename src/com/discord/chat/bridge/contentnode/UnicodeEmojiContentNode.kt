package com.discord.chat.bridge.contentnode

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
import xk.h
import xk.f0.a

@f
public data class UnicodeEmojiContentNode(content: String, surrogate: String, jumboable: Boolean = false) : EmojiContentNode {
   public final val content: String
   public open val jumboable: Boolean
   public final val surrogate: String

   init {
      r.h(var1, "content");
      r.h(var2, "surrogate");
      super(null);
      this.content = var1;
      this.surrogate = var2;
      this.jumboable = var3;
   }

   @JvmStatic
   public fun `write$Self`(self: UnicodeEmojiContentNode, output: CompositeEncoder, serialDesc: SerialDescriptor) {
      r.h(var0, "self");
      r.h(var1, "output");
      r.h(var2, "serialDesc");
      EmojiContentNode.write$Self(var0, var1, var2);
      var var3: Boolean = false;
      var1.z(var2, 0, var0.content);
      var1.z(var2, 1, var0.surrogate);
      if (var1.A(var2, 2) || var0.getJumboable()) {
         var3 = true;
      }

      if (var3) {
         var1.x(var2, 2, var0.getJumboable());
      }
   }

   public operator fun component1(): String {
      return this.content;
   }

   public operator fun component2(): String {
      return this.surrogate;
   }

   public operator fun component3(): Boolean {
      return this.getJumboable();
   }

   public fun copy(content: String = var0.content, surrogate: String = var0.surrogate, jumboable: Boolean = var0.getJumboable()): UnicodeEmojiContentNode {
      r.h(var1, "content");
      r.h(var2, "surrogate");
      return new UnicodeEmojiContentNode(var1, var2, var3);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is UnicodeEmojiContentNode) {
         return false;
      } else {
         var1 = var1;
         if (!r.c(this.content, var1.content)) {
            return false;
         } else if (!r.c(this.surrogate, var1.surrogate)) {
            return false;
         } else {
            return this.getJumboable() == var1.getJumboable();
         }
      }
   }

   public override fun hashCode(): Int {
      val var3: Int = this.content.hashCode();
      val var4: Int = this.surrogate.hashCode();
      val var2: Byte = this.getJumboable();
      var var1: Byte = var2;
      if (var2 != 0) {
         var1 = 1;
      }

      return (var3 * 31 + var4) * 31 + var1;
   }

   public override fun toString(): String {
      val var4: java.lang.String = this.content;
      val var3: java.lang.String = this.surrogate;
      val var1: Boolean = this.getJumboable();
      val var2: StringBuilder = new StringBuilder();
      var2.append("UnicodeEmojiContentNode(content=");
      var2.append(var4);
      var2.append(", surrogate=");
      var2.append(var3);
      var2.append(", jumboable=");
      var2.append(var1);
      var2.append(")");
      return var2.toString();
   }

   public object `$serializer` : f0<UnicodeEmojiContentNode> {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: UnicodeEmojiContentNode.$serializer = new UnicodeEmojiContentNode.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("emoji", var0, 3);
         var1.l("content", false);
         var1.l("surrogate", false);
         var1.l("jumboable", true);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{a2.a, a2.a, h.a};
      }

      public open fun deserialize(decoder: Decoder): UnicodeEmojiContentNode {
         r.h(var1, "decoder");
         val var7: SerialDescriptor = this.getDescriptor();
         val var8: c = var1.b(var7);
         var var2: Int;
         var var5: Boolean;
         var var6: java.lang.String;
         var var9: java.lang.String;
         if (var8.p()) {
            var6 = var8.m(var7, 0);
            var9 = var8.m(var7, 1);
            var5 = var8.C(var7, 2);
            var2 = 7;
         } else {
            var6 = null;
            var9 = null;
            var var3: Boolean = true;
            var5 = false;
            var2 = 0;

            while (var3) {
               val var4: Int = var8.o(var7);
               if (var4 != -1) {
                  if (var4 != 0) {
                     if (var4 != 1) {
                        if (var4 != 2) {
                           throw new n(var4);
                        }

                        var5 = var8.C(var7, 2);
                        var2 |= 4;
                     } else {
                        var9 = var8.m(var7, 1);
                        var2 |= 2;
                     }
                  } else {
                     var6 = var8.m(var7, 0);
                     var2 |= 1;
                  }
               } else {
                  var3 = false;
               }
            }
         }

         var8.c(var7);
         return new UnicodeEmojiContentNode(var2, var6, var9, var5, null);
      }

      public open fun serialize(encoder: Encoder, value: UnicodeEmojiContentNode) {
         r.h(var1, "encoder");
         r.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         UnicodeEmojiContentNode.write$Self(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer<?>> {
         return a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<UnicodeEmojiContentNode> {
         return UnicodeEmojiContentNode.$serializer.INSTANCE;
      }
   }
}

package com.discord.chat.bridge.contentnode

import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
import nn.f
import nn.n
import qn.b2
import qn.g0
import qn.h
import qn.g0.a

@f
public data class UnicodeEmojiContentNode(content: String, surrogate: String, jumboable: Boolean = false) : EmojiContentNode {
   public final val content: String
   public open val jumboable: Boolean
   public final val surrogate: String

   init {
      q.h(var1, "content");
      q.h(var2, "surrogate");
      super(null);
      this.content = var1;
      this.surrogate = var2;
      this.jumboable = var3;
   }

   public operator fun component1(): String {
      return this.content;
   }

   public operator fun component2(): String {
      return this.surrogate;
   }

   public operator fun component3(): Boolean {
      return this.jumboable;
   }

   public fun copy(content: String = var0.content, surrogate: String = var0.surrogate, jumboable: Boolean = var0.jumboable): UnicodeEmojiContentNode {
      q.h(var1, "content");
      q.h(var2, "surrogate");
      return new UnicodeEmojiContentNode(var1, var2, var3);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is UnicodeEmojiContentNode) {
         return false;
      } else {
         var1 = var1;
         if (!q.c(this.content, var1.content)) {
            return false;
         } else if (!q.c(this.surrogate, var1.surrogate)) {
            return false;
         } else {
            return this.jumboable == var1.jumboable;
         }
      }
   }

   public override fun hashCode(): Int {
      return (this.content.hashCode() * 31 + this.surrogate.hashCode()) * 31 + java.lang.Boolean.hashCode(this.jumboable);
   }

   public override fun toString(): String {
      val var2: java.lang.String = this.content;
      val var3: java.lang.String = this.surrogate;
      val var1: Boolean = this.jumboable;
      val var4: StringBuilder = new StringBuilder();
      var4.append("UnicodeEmojiContentNode(content=");
      var4.append(var2);
      var4.append(", surrogate=");
      var4.append(var3);
      var4.append(", jumboable=");
      var4.append(var1);
      var4.append(")");
      return var4.toString();
   }

   public object `$serializer` : g0 {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: UnicodeEmojiContentNode.$serializer = new UnicodeEmojiContentNode.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("emoji", var0, 3);
         var1.c("content", false);
         var1.c("surrogate", false);
         var1.c("jumboable", true);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{b2.a, b2.a, h.a};
      }

      public open fun deserialize(decoder: Decoder): UnicodeEmojiContentNode {
         q.h(var1, "decoder");
         val var8: SerialDescriptor = this.getDescriptor();
         val var9: c = var1.b(var8);
         var var2: Int;
         var var5: Boolean;
         val var7: java.lang.String;
         val var10: java.lang.String;
         if (var9.p()) {
            var10 = var9.m(var8, 0);
            var7 = var9.m(var8, 1);
            var5 = var9.C(var8, 2);
            var2 = 7;
         } else {
            var var6: java.lang.String = null;
            var var11: java.lang.String = null;
            var var3: Boolean = true;
            var5 = false;
            var2 = 0;

            while (var3) {
               val var4: Int = var9.o(var8);
               if (var4 != -1) {
                  if (var4 != 0) {
                     if (var4 != 1) {
                        if (var4 != 2) {
                           throw new n(var4);
                        }

                        var5 = var9.C(var8, 2);
                        var2 |= 4;
                     } else {
                        var11 = var9.m(var8, 1);
                        var2 |= 2;
                     }
                  } else {
                     var6 = var9.m(var8, 0);
                     var2 |= 1;
                  }
               } else {
                  var3 = false;
               }
            }

            var7 = var11;
            var10 = var6;
         }

         var9.c(var8);
         return new UnicodeEmojiContentNode(var2, var10, var7, var5, null);
      }

      public open fun serialize(encoder: Encoder, value: UnicodeEmojiContentNode) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         UnicodeEmojiContentNode.write$Self$chat_release(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<UnicodeEmojiContentNode> {
         return UnicodeEmojiContentNode.$serializer.INSTANCE;
      }
   }
}

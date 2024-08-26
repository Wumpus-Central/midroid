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
public data class CodeBlockContentNode(lang: String, content: String, inQuote: Boolean) : ContentNode {
   public final val content: String
   public final val inQuote: Boolean
   public final val lang: String

   init {
      r.h(var1, "lang");
      r.h(var2, "content");
      super(null);
      this.lang = var1;
      this.content = var2;
      this.inQuote = var3;
   }

   @JvmStatic
   public fun `write$Self`(self: CodeBlockContentNode, output: CompositeEncoder, serialDesc: SerialDescriptor) {
      r.h(var0, "self");
      r.h(var1, "output");
      r.h(var2, "serialDesc");
      var1.z(var2, 0, var0.lang);
      var1.z(var2, 1, var0.content);
      var1.x(var2, 2, var0.inQuote);
   }

   public operator fun component1(): String {
      return this.lang;
   }

   public operator fun component2(): String {
      return this.content;
   }

   public operator fun component3(): Boolean {
      return this.inQuote;
   }

   public fun copy(lang: String = var0.lang, content: String = var0.content, inQuote: Boolean = var0.inQuote): CodeBlockContentNode {
      r.h(var1, "lang");
      r.h(var2, "content");
      return new CodeBlockContentNode(var1, var2, var3);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is CodeBlockContentNode) {
         return false;
      } else {
         var1 = var1;
         if (!r.c(this.lang, var1.lang)) {
            return false;
         } else if (!r.c(this.content, var1.content)) {
            return false;
         } else {
            return this.inQuote == var1.inQuote;
         }
      }
   }

   public override fun hashCode(): Int {
      val var3: Int = this.lang.hashCode();
      val var4: Int = this.content.hashCode();
      var var1: Byte = this.inQuote;
      if (this.inQuote != 0) {
         var1 = 1;
      }

      return (var3 * 31 + var4) * 31 + var1;
   }

   public override fun toString(): String {
      val var2: java.lang.String = this.lang;
      val var3: java.lang.String = this.content;
      val var1: Boolean = this.inQuote;
      val var4: StringBuilder = new StringBuilder();
      var4.append("CodeBlockContentNode(lang=");
      var4.append(var2);
      var4.append(", content=");
      var4.append(var3);
      var4.append(", inQuote=");
      var4.append(var1);
      var4.append(")");
      return var4.toString();
   }

   public object `$serializer` : f0<CodeBlockContentNode> {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: CodeBlockContentNode.$serializer = new CodeBlockContentNode.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("codeBlock", var0, 3);
         var1.l("lang", false);
         var1.l("content", false);
         var1.l("inQuote", false);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{a2.a, a2.a, h.a};
      }

      public open fun deserialize(decoder: Decoder): CodeBlockContentNode {
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
         return new CodeBlockContentNode(var2, var6, var9, var5, null);
      }

      public open fun serialize(encoder: Encoder, value: CodeBlockContentNode) {
         r.h(var1, "encoder");
         r.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         CodeBlockContentNode.write$Self(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer<?>> {
         return a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<CodeBlockContentNode> {
         return CodeBlockContentNode.$serializer.INSTANCE;
      }
   }
}

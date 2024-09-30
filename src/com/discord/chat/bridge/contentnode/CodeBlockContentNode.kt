package com.discord.chat.bridge.contentnode

import cl.f
import cl.n
import fl.b2
import fl.g0
import fl.h
import fl.g0.a
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor

@f
public data class CodeBlockContentNode(lang: String, content: String, inQuote: Boolean) : ContentNode {
   public final val content: String
   public final val inQuote: Boolean
   public final val lang: String

   init {
      q.h(var1, "lang");
      q.h(var2, "content");
      super(null);
      this.lang = var1;
      this.content = var2;
      this.inQuote = var3;
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
      q.h(var1, "lang");
      q.h(var2, "content");
      return new CodeBlockContentNode(var1, var2, var3);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is CodeBlockContentNode) {
         return false;
      } else {
         var1 = var1;
         if (!q.c(this.lang, var1.lang)) {
            return false;
         } else if (!q.c(this.content, var1.content)) {
            return false;
         } else {
            return this.inQuote == var1.inQuote;
         }
      }
   }

   public override fun hashCode(): Int {
      return (this.lang.hashCode() * 31 + this.content.hashCode()) * 31 + java.lang.Boolean.hashCode(this.inQuote);
   }

   public override fun toString(): String {
      val var3: java.lang.String = this.lang;
      val var2: java.lang.String = this.content;
      val var1: Boolean = this.inQuote;
      val var4: StringBuilder = new StringBuilder();
      var4.append("CodeBlockContentNode(lang=");
      var4.append(var3);
      var4.append(", content=");
      var4.append(var2);
      var4.append(", inQuote=");
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
         val var0: CodeBlockContentNode.$serializer = new CodeBlockContentNode.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("codeBlock", var0, 3);
         var1.l("lang", false);
         var1.l("content", false);
         var1.l("inQuote", false);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{b2.a, b2.a, h.a};
      }

      public open fun deserialize(decoder: Decoder): CodeBlockContentNode {
         q.h(var1, "decoder");
         val var7: SerialDescriptor = this.getDescriptor();
         val var8: c = var1.c(var7);
         var var2: Int;
         var var5: Boolean;
         var var6: java.lang.String;
         var var9: java.lang.String;
         if (var8.y()) {
            var6 = var8.t(var7, 0);
            var9 = var8.t(var7, 1);
            var5 = var8.s(var7, 2);
            var2 = 7;
         } else {
            var6 = null;
            var9 = null;
            var var3: Boolean = true;
            var5 = false;
            var2 = 0;

            while (var3) {
               val var4: Int = var8.x(var7);
               if (var4 != -1) {
                  if (var4 != 0) {
                     if (var4 != 1) {
                        if (var4 != 2) {
                           throw new n(var4);
                        }

                        var5 = var8.s(var7, 2);
                        var2 |= 4;
                     } else {
                        var9 = var8.t(var7, 1);
                        var2 |= 2;
                     }
                  } else {
                     var6 = var8.t(var7, 0);
                     var2 |= 1;
                  }
               } else {
                  var3 = false;
               }
            }
         }

         var8.b(var7);
         return new CodeBlockContentNode(var2, var6, var9, var5, null);
      }

      public open fun serialize(encoder: Encoder, value: CodeBlockContentNode) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.c(var3);
         CodeBlockContentNode.write$Self$chat_release(var2, var4, var3);
         var4.b(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<CodeBlockContentNode> {
         return CodeBlockContentNode.$serializer.INSTANCE;
      }
   }
}

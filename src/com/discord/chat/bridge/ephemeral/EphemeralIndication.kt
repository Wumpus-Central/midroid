package com.discord.chat.bridge.ephemeral

import cl.f
import cl.n
import com.discord.chat.bridge.structurabletext.StructurableText
import com.discord.chat.bridge.structurabletext.StructurableTextSerializer
import fl.b2
import fl.g0
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
public data class EphemeralIndication(content: StructurableText, helpArticleLink: String, helpButtonAccessibilityLabel: String) {
   public final val content: StructurableText
   public final val helpArticleLink: String
   public final val helpButtonAccessibilityLabel: String

   init {
      q.h(var1, "content");
      q.h(var2, "helpArticleLink");
      q.h(var3, "helpButtonAccessibilityLabel");
      super();
      this.content = var1;
      this.helpArticleLink = var2;
      this.helpButtonAccessibilityLabel = var3;
   }

   public operator fun component1(): StructurableText {
      return this.content;
   }

   public operator fun component2(): String {
      return this.helpArticleLink;
   }

   public operator fun component3(): String {
      return this.helpButtonAccessibilityLabel;
   }

   public fun copy(
      content: StructurableText = var0.content,
      helpArticleLink: String = var0.helpArticleLink,
      helpButtonAccessibilityLabel: String = var0.helpButtonAccessibilityLabel
   ): EphemeralIndication {
      q.h(var1, "content");
      q.h(var2, "helpArticleLink");
      q.h(var3, "helpButtonAccessibilityLabel");
      return new EphemeralIndication(var1, var2, var3);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is EphemeralIndication) {
         return false;
      } else {
         var1 = var1;
         if (!q.c(this.content, var1.content)) {
            return false;
         } else if (!q.c(this.helpArticleLink, var1.helpArticleLink)) {
            return false;
         } else {
            return q.c(this.helpButtonAccessibilityLabel, var1.helpButtonAccessibilityLabel);
         }
      }
   }

   public override fun hashCode(): Int {
      return (this.content.hashCode() * 31 + this.helpArticleLink.hashCode()) * 31 + this.helpButtonAccessibilityLabel.hashCode();
   }

   public override fun toString(): String {
      val var2: StructurableText = this.content;
      val var4: java.lang.String = this.helpArticleLink;
      val var1: java.lang.String = this.helpButtonAccessibilityLabel;
      val var3: StringBuilder = new StringBuilder();
      var3.append("EphemeralIndication(content=");
      var3.append(var2);
      var3.append(", helpArticleLink=");
      var3.append(var4);
      var3.append(", helpButtonAccessibilityLabel=");
      var3.append(var1);
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
         val var0: EphemeralIndication.$serializer = new EphemeralIndication.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.bridge.ephemeral.EphemeralIndication", var0, 3);
         var1.l("content", false);
         var1.l("helpArticleLink", false);
         var1.l("helpButtonAccessibilityLabel", false);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{StructurableTextSerializer.INSTANCE, b2.a, b2.a};
      }

      public open fun deserialize(decoder: Decoder): EphemeralIndication {
         q.h(var1, "decoder");
         val var8: SerialDescriptor = this.getDescriptor();
         val var9: c = var1.c(var8);
         val var5: Boolean = var9.y();
         var var7: StructurableText = null;
         var var2: Int;
         var var6: java.lang.String;
         var var10: java.lang.String;
         if (var5) {
            var7 = var9.m(var8, 0, StructurableTextSerializer.INSTANCE, null) as StructurableText;
            var6 = var9.t(var8, 1);
            var10 = var9.t(var8, 2);
            var2 = 7;
         } else {
            var var3: Boolean = true;
            var2 = 0;
            var6 = null;
            var10 = null;

            while (var3) {
               val var4: Int = var9.x(var8);
               if (var4 != -1) {
                  if (var4 != 0) {
                     if (var4 != 1) {
                        if (var4 != 2) {
                           throw new n(var4);
                        }

                        var10 = var9.t(var8, 2);
                        var2 |= 4;
                     } else {
                        var6 = var9.t(var8, 1);
                        var2 |= 2;
                     }
                  } else {
                     var7 = var9.m(var8, 0, StructurableTextSerializer.INSTANCE, var7) as StructurableText;
                     var2 |= 1;
                  }
               } else {
                  var3 = false;
               }
            }
         }

         var9.b(var8);
         return new EphemeralIndication(var2, var7, var6, var10, null);
      }

      public open fun serialize(encoder: Encoder, value: EphemeralIndication) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.c(var3);
         EphemeralIndication.write$Self$chat_release(var2, var4, var3);
         var4.b(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<EphemeralIndication> {
         return EphemeralIndication.$serializer.INSTANCE;
      }
   }
}

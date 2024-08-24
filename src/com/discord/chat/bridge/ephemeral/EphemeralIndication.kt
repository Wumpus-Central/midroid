package com.discord.chat.bridge.ephemeral

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
import xk.f0.a

@f
public data class EphemeralIndication(content: StructurableText, helpArticleLink: String, helpButtonAccessibilityLabel: String) {
   public final val content: StructurableText
   public final val helpArticleLink: String
   public final val helpButtonAccessibilityLabel: String

   init {
      r.h(var1, "content");
      r.h(var2, "helpArticleLink");
      r.h(var3, "helpButtonAccessibilityLabel");
      super();
      this.content = var1;
      this.helpArticleLink = var2;
      this.helpButtonAccessibilityLabel = var3;
   }

   @JvmStatic
   public fun `write$Self`(self: EphemeralIndication, output: CompositeEncoder, serialDesc: SerialDescriptor) {
      r.h(var0, "self");
      r.h(var1, "output");
      r.h(var2, "serialDesc");
      var1.y(var2, 0, StructurableTextSerializer.INSTANCE, var0.content);
      var1.z(var2, 1, var0.helpArticleLink);
      var1.z(var2, 2, var0.helpButtonAccessibilityLabel);
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
      r.h(var1, "content");
      r.h(var2, "helpArticleLink");
      r.h(var3, "helpButtonAccessibilityLabel");
      return new EphemeralIndication(var1, var2, var3);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is EphemeralIndication) {
         return false;
      } else {
         var1 = var1;
         if (!r.c(this.content, var1.content)) {
            return false;
         } else if (!r.c(this.helpArticleLink, var1.helpArticleLink)) {
            return false;
         } else {
            return r.c(this.helpButtonAccessibilityLabel, var1.helpButtonAccessibilityLabel);
         }
      }
   }

   public override fun hashCode(): Int {
      return (this.content.hashCode() * 31 + this.helpArticleLink.hashCode()) * 31 + this.helpButtonAccessibilityLabel.hashCode();
   }

   public override fun toString(): String {
      val var4: StructurableText = this.content;
      val var2: java.lang.String = this.helpArticleLink;
      val var1: java.lang.String = this.helpButtonAccessibilityLabel;
      val var3: StringBuilder = new StringBuilder();
      var3.append("EphemeralIndication(content=");
      var3.append(var4);
      var3.append(", helpArticleLink=");
      var3.append(var2);
      var3.append(", helpButtonAccessibilityLabel=");
      var3.append(var1);
      var3.append(")");
      return var3.toString();
   }

   public object `$serializer` : f0<EphemeralIndication> {
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
         return new KSerializer[]{StructurableTextSerializer.INSTANCE, a2.a, a2.a};
      }

      public open fun deserialize(decoder: Decoder): EphemeralIndication {
         r.h(var1, "decoder");
         val var8: SerialDescriptor = this.getDescriptor();
         val var9: c = var1.b(var8);
         val var5: Boolean = var9.p();
         var var7: Any = null;
         var var2: Int;
         var var6: java.lang.String;
         var var10: java.lang.String;
         if (var5) {
            var7 = var9.y(var8, 0, StructurableTextSerializer.INSTANCE, null);
            var6 = var9.m(var8, 1);
            var10 = var9.m(var8, 2);
            var2 = 7;
         } else {
            var var3: Boolean = true;
            var2 = 0;
            var6 = null;
            var10 = null;

            while (var3) {
               val var4: Int = var9.o(var8);
               if (var4 != -1) {
                  if (var4 != 0) {
                     if (var4 != 1) {
                        if (var4 != 2) {
                           throw new n(var4);
                        }

                        var10 = var9.m(var8, 2);
                        var2 |= 4;
                     } else {
                        var6 = var9.m(var8, 1);
                        var2 |= 2;
                     }
                  } else {
                     var7 = var9.y(var8, 0, StructurableTextSerializer.INSTANCE, var7);
                     var2 |= 1;
                  }
               } else {
                  var3 = false;
               }
            }
         }

         var9.c(var8);
         return new EphemeralIndication(var2, var7 as StructurableText, var6, var10, null);
      }

      public open fun serialize(encoder: Encoder, value: EphemeralIndication) {
         r.h(var1, "encoder");
         r.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         EphemeralIndication.write$Self(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer<?>> {
         return a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<EphemeralIndication> {
         return EphemeralIndication.$serializer.INSTANCE;
      }
   }
}

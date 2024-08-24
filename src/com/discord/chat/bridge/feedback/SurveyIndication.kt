package com.discord.chat.bridge.feedback

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
public data class SurveyIndication(content: StructurableText, feedbackIconUrl: String) {
   public final val content: StructurableText
   public final val feedbackIconUrl: String

   init {
      r.h(var1, "content");
      r.h(var2, "feedbackIconUrl");
      super();
      this.content = var1;
      this.feedbackIconUrl = var2;
   }

   @JvmStatic
   public fun `write$Self`(self: SurveyIndication, output: CompositeEncoder, serialDesc: SerialDescriptor) {
      r.h(var0, "self");
      r.h(var1, "output");
      r.h(var2, "serialDesc");
      var1.y(var2, 0, StructurableTextSerializer.INSTANCE, var0.content);
      var1.z(var2, 1, var0.feedbackIconUrl);
   }

   public operator fun component1(): StructurableText {
      return this.content;
   }

   public operator fun component2(): String {
      return this.feedbackIconUrl;
   }

   public fun copy(content: StructurableText = var0.content, feedbackIconUrl: String = var0.feedbackIconUrl): SurveyIndication {
      r.h(var1, "content");
      r.h(var2, "feedbackIconUrl");
      return new SurveyIndication(var1, var2);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is SurveyIndication) {
         return false;
      } else {
         var1 = var1;
         if (!r.c(this.content, var1.content)) {
            return false;
         } else {
            return r.c(this.feedbackIconUrl, var1.feedbackIconUrl);
         }
      }
   }

   public override fun hashCode(): Int {
      return this.content.hashCode() * 31 + this.feedbackIconUrl.hashCode();
   }

   public override fun toString(): String {
      val var2: StructurableText = this.content;
      val var3: java.lang.String = this.feedbackIconUrl;
      val var1: StringBuilder = new StringBuilder();
      var1.append("SurveyIndication(content=");
      var1.append(var2);
      var1.append(", feedbackIconUrl=");
      var1.append(var3);
      var1.append(")");
      return var1.toString();
   }

   public object `$serializer` : f0<SurveyIndication> {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: SurveyIndication.$serializer = new SurveyIndication.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.bridge.feedback.SurveyIndication", var0, 2);
         var1.l("content", false);
         var1.l("feedbackIconUrl", false);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{StructurableTextSerializer.INSTANCE, a2.a};
      }

      public open fun deserialize(decoder: Decoder): SurveyIndication {
         r.h(var1, "decoder");
         val var6: SerialDescriptor = this.getDescriptor();
         val var7: c = var1.b(var6);
         var var2: Int;
         var var5: java.lang.String;
         var var8: Any;
         if (var7.p()) {
            var8 = var7.y(var6, 0, StructurableTextSerializer.INSTANCE, null);
            var5 = var7.m(var6, 1);
            var2 = 3;
         } else {
            var var3: Boolean = true;
            var2 = 0;
            var8 = null;
            var5 = null;

            while (var3) {
               val var4: Int = var7.o(var6);
               if (var4 != -1) {
                  if (var4 != 0) {
                     if (var4 != 1) {
                        throw new n(var4);
                     }

                     var5 = var7.m(var6, 1);
                     var2 |= 2;
                  } else {
                     var8 = var7.y(var6, 0, StructurableTextSerializer.INSTANCE, var8);
                     var2 |= 1;
                  }
               } else {
                  var3 = false;
               }
            }
         }

         var7.c(var6);
         return new SurveyIndication(var2, var8 as StructurableText, var5, null);
      }

      public open fun serialize(encoder: Encoder, value: SurveyIndication) {
         r.h(var1, "encoder");
         r.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         SurveyIndication.write$Self(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer<?>> {
         return a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<SurveyIndication> {
         return SurveyIndication.$serializer.INSTANCE;
      }
   }
}

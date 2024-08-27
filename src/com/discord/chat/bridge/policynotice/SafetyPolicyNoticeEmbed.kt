package com.discord.chat.bridge.policynotice

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
public data class SafetyPolicyNoticeEmbed(classificationId: String,
   titleText: String,
   titleIcon: String,
   subtitleText: String,
   descriptionText: String,
   ctaText: String
) {
   public final val classificationId: String
   public final val ctaText: String
   public final val descriptionText: String
   public final val subtitleText: String
   public final val titleIcon: String
   public final val titleText: String

   init {
      r.h(var1, "classificationId");
      r.h(var2, "titleText");
      r.h(var3, "titleIcon");
      r.h(var4, "subtitleText");
      r.h(var5, "descriptionText");
      r.h(var6, "ctaText");
      super();
      this.classificationId = var1;
      this.titleText = var2;
      this.titleIcon = var3;
      this.subtitleText = var4;
      this.descriptionText = var5;
      this.ctaText = var6;
   }

   @JvmStatic
   public fun `write$Self`(self: SafetyPolicyNoticeEmbed, output: CompositeEncoder, serialDesc: SerialDescriptor) {
      r.h(var0, "self");
      r.h(var1, "output");
      r.h(var2, "serialDesc");
      var1.z(var2, 0, var0.classificationId);
      var1.z(var2, 1, var0.titleText);
      var1.z(var2, 2, var0.titleIcon);
      var1.z(var2, 3, var0.subtitleText);
      var1.z(var2, 4, var0.descriptionText);
      var1.z(var2, 5, var0.ctaText);
   }

   public operator fun component1(): String {
      return this.classificationId;
   }

   public operator fun component2(): String {
      return this.titleText;
   }

   public operator fun component3(): String {
      return this.titleIcon;
   }

   public operator fun component4(): String {
      return this.subtitleText;
   }

   public operator fun component5(): String {
      return this.descriptionText;
   }

   public operator fun component6(): String {
      return this.ctaText;
   }

   public fun copy(
      classificationId: String = var0.classificationId,
      titleText: String = var0.titleText,
      titleIcon: String = var0.titleIcon,
      subtitleText: String = var0.subtitleText,
      descriptionText: String = var0.descriptionText,
      ctaText: String = var0.ctaText
   ): SafetyPolicyNoticeEmbed {
      r.h(var1, "classificationId");
      r.h(var2, "titleText");
      r.h(var3, "titleIcon");
      r.h(var4, "subtitleText");
      r.h(var5, "descriptionText");
      r.h(var6, "ctaText");
      return new SafetyPolicyNoticeEmbed(var1, var2, var3, var4, var5, var6);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is SafetyPolicyNoticeEmbed) {
         return false;
      } else {
         var1 = var1;
         if (!r.c(this.classificationId, var1.classificationId)) {
            return false;
         } else if (!r.c(this.titleText, var1.titleText)) {
            return false;
         } else if (!r.c(this.titleIcon, var1.titleIcon)) {
            return false;
         } else if (!r.c(this.subtitleText, var1.subtitleText)) {
            return false;
         } else if (!r.c(this.descriptionText, var1.descriptionText)) {
            return false;
         } else {
            return r.c(this.ctaText, var1.ctaText);
         }
      }
   }

   public override fun hashCode(): Int {
      return (
               (((this.classificationId.hashCode() * 31 + this.titleText.hashCode()) * 31 + this.titleIcon.hashCode()) * 31 + this.subtitleText.hashCode())
                     * 31
                  + this.descriptionText.hashCode()
            )
            * 31
         + this.ctaText.hashCode();
   }

   public override fun toString(): String {
      val var3: java.lang.String = this.classificationId;
      val var4: java.lang.String = this.titleText;
      val var6: java.lang.String = this.titleIcon;
      val var5: java.lang.String = this.subtitleText;
      val var7: java.lang.String = this.descriptionText;
      val var1: java.lang.String = this.ctaText;
      val var2: StringBuilder = new StringBuilder();
      var2.append("SafetyPolicyNoticeEmbed(classificationId=");
      var2.append(var3);
      var2.append(", titleText=");
      var2.append(var4);
      var2.append(", titleIcon=");
      var2.append(var6);
      var2.append(", subtitleText=");
      var2.append(var5);
      var2.append(", descriptionText=");
      var2.append(var7);
      var2.append(", ctaText=");
      var2.append(var1);
      var2.append(")");
      return var2.toString();
   }

   public object `$serializer` : f0<SafetyPolicyNoticeEmbed> {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: SafetyPolicyNoticeEmbed.$serializer = new SafetyPolicyNoticeEmbed.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor(
            "com.discord.chat.bridge.policynotice.SafetyPolicyNoticeEmbed", var0, 6
         );
         var1.l("classificationId", false);
         var1.l("titleText", false);
         var1.l("titleIcon", false);
         var1.l("subtitleText", false);
         var1.l("descriptionText", false);
         var1.l("ctaText", false);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{a2.a, a2.a, a2.a, a2.a, a2.a, a2.a};
      }

      public open fun deserialize(decoder: Decoder): SafetyPolicyNoticeEmbed {
         r.h(var1, "decoder");
         val var12: SerialDescriptor = this.getDescriptor();
         val var13: c = var1.b(var12);
         var var2: Int;
         var var5: java.lang.String;
         var var6: java.lang.String;
         var var7: java.lang.String;
         var var8: java.lang.String;
         var var9: java.lang.String;
         val var14: java.lang.String;
         if (var13.p()) {
            var8 = var13.m(var12, 0);
            var9 = var13.m(var12, 1);
            var7 = var13.m(var12, 2);
            var6 = var13.m(var12, 3);
            var5 = var13.m(var12, 4);
            var14 = var13.m(var12, 5);
            var2 = 63;
         } else {
            var8 = null;
            var9 = null;
            var6 = null;
            var7 = null;
            var5 = null;
            var var15: java.lang.String = null;
            var var3: Boolean = true;
            var2 = 0;

            while (var3) {
               val var4: Int = var13.o(var12);
               switch (var4) {
                  case -1:
                     var3 = false;
                     break;
                  case 0:
                     var8 = var13.m(var12, 0);
                     var2 |= 1;
                     break;
                  case 1:
                     var15 = var13.m(var12, 1);
                     var2 |= 2;
                     break;
                  case 2:
                     var5 = var13.m(var12, 2);
                     var2 |= 4;
                     break;
                  case 3:
                     var6 = var13.m(var12, 3);
                     var2 |= 8;
                     break;
                  case 4:
                     var7 = var13.m(var12, 4);
                     var2 |= 16;
                     break;
                  case 5:
                     var9 = var13.m(var12, 5);
                     var2 |= 32;
                     break;
                  default:
                     throw new n(var4);
               }
            }

            var14 = var9;
            var5 = var7;
            var7 = var5;
            var9 = var15;
         }

         var13.c(var12);
         return new SafetyPolicyNoticeEmbed(var2, var8, var9, var7, var6, var5, var14, null);
      }

      public open fun serialize(encoder: Encoder, value: SafetyPolicyNoticeEmbed) {
         r.h(var1, "encoder");
         r.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         SafetyPolicyNoticeEmbed.write$Self(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer<?>> {
         return a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<SafetyPolicyNoticeEmbed> {
         return SafetyPolicyNoticeEmbed.$serializer.INSTANCE;
      }
   }
}

package com.discord.chat.bridge.policynotice

import dn.f
import dn.n
import gn.b2
import gn.g0
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
      q.h(var1, "classificationId");
      q.h(var2, "titleText");
      q.h(var3, "titleIcon");
      q.h(var4, "subtitleText");
      q.h(var5, "descriptionText");
      q.h(var6, "ctaText");
      super();
      this.classificationId = var1;
      this.titleText = var2;
      this.titleIcon = var3;
      this.subtitleText = var4;
      this.descriptionText = var5;
      this.ctaText = var6;
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
      q.h(var1, "classificationId");
      q.h(var2, "titleText");
      q.h(var3, "titleIcon");
      q.h(var4, "subtitleText");
      q.h(var5, "descriptionText");
      q.h(var6, "ctaText");
      return new SafetyPolicyNoticeEmbed(var1, var2, var3, var4, var5, var6);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is SafetyPolicyNoticeEmbed) {
         return false;
      } else {
         var1 = var1;
         if (!q.c(this.classificationId, var1.classificationId)) {
            return false;
         } else if (!q.c(this.titleText, var1.titleText)) {
            return false;
         } else if (!q.c(this.titleIcon, var1.titleIcon)) {
            return false;
         } else if (!q.c(this.subtitleText, var1.subtitleText)) {
            return false;
         } else if (!q.c(this.descriptionText, var1.descriptionText)) {
            return false;
         } else {
            return q.c(this.ctaText, var1.ctaText);
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
      val var5: java.lang.String = this.classificationId;
      val var2: java.lang.String = this.titleText;
      val var6: java.lang.String = this.titleIcon;
      val var1: java.lang.String = this.subtitleText;
      val var7: java.lang.String = this.descriptionText;
      val var3: java.lang.String = this.ctaText;
      val var4: StringBuilder = new StringBuilder();
      var4.append("SafetyPolicyNoticeEmbed(classificationId=");
      var4.append(var5);
      var4.append(", titleText=");
      var4.append(var2);
      var4.append(", titleIcon=");
      var4.append(var6);
      var4.append(", subtitleText=");
      var4.append(var1);
      var4.append(", descriptionText=");
      var4.append(var7);
      var4.append(", ctaText=");
      var4.append(var3);
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
         return new KSerializer[]{b2.a, b2.a, b2.a, b2.a, b2.a, b2.a};
      }

      public open fun deserialize(decoder: Decoder): SafetyPolicyNoticeEmbed {
         q.h(var1, "decoder");
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
            var9 = var13.m(var12, 0);
            var8 = var13.m(var12, 1);
            var7 = var13.m(var12, 2);
            var5 = var13.m(var12, 3);
            var6 = var13.m(var12, 4);
            var14 = var13.m(var12, 5);
            var2 = 63;
         } else {
            var9 = null;
            var8 = null;
            var7 = null;
            var6 = null;
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
                     var9 = var13.m(var12, 0);
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
                     var7 = var13.m(var12, 3);
                     var2 |= 8;
                     break;
                  case 4:
                     var6 = var13.m(var12, 4);
                     var2 |= 16;
                     break;
                  case 5:
                     var8 = var13.m(var12, 5);
                     var2 |= 32;
                     break;
                  default:
                     throw new n(var4);
               }
            }

            var14 = var8;
            var5 = var7;
            var7 = var5;
            var8 = var15;
         }

         var13.c(var12);
         return new SafetyPolicyNoticeEmbed(var2, var9, var8, var7, var5, var6, var14, null);
      }

      public open fun serialize(encoder: Encoder, value: SafetyPolicyNoticeEmbed) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         SafetyPolicyNoticeEmbed.write$Self$chat_release(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<SafetyPolicyNoticeEmbed> {
         return SafetyPolicyNoticeEmbed.$serializer.INSTANCE;
      }
   }
}

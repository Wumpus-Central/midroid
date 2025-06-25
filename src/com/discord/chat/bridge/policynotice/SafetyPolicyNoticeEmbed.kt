package com.discord.chat.bridge.policynotice

import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import sb.f

@f
public data class SafetyPolicyNoticeEmbed(classificationId: String,
   titleText: String,
   titleIcon: String,
   subtitleText: String,
   descriptionText: String,
   ctaText: String
) {
   public final val classificationId: String
   public final val titleText: String
   public final val titleIcon: String
   public final val subtitleText: String
   public final val descriptionText: String
   public final val ctaText: String

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
      val var6: java.lang.String = this.titleText;
      val var3: java.lang.String = this.titleIcon;
      val var4: java.lang.String = this.subtitleText;
      val var7: java.lang.String = this.descriptionText;
      val var1: java.lang.String = this.ctaText;
      val var2: StringBuilder = new StringBuilder();
      var2.append("SafetyPolicyNoticeEmbed(classificationId=");
      var2.append(var5);
      var2.append(", titleText=");
      var2.append(var6);
      var2.append(", titleIcon=");
      var2.append(var3);
      var2.append(", subtitleText=");
      var2.append(var4);
      var2.append(", descriptionText=");
      var2.append(var7);
      var2.append(", ctaText=");
      var2.append(var1);
      var2.append(")");
      return var2.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<SafetyPolicyNoticeEmbed> {
         return SafetyPolicyNoticeEmbed.$serializer.INSTANCE;
      }
   }
}

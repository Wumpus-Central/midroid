package com.discord.chat.bridge.safetysystemnotification

import kotlinx.serialization.KSerializer
import nb.g

@g
public data class SafetySystemNotificationEmbed(titleText: String,
   titleIcon: String,
   subtitleText: String,
   descriptionText: String,
   primaryCtaText: String? = null,
   primaryCtaType: String? = null,
   primaryCtaKey: String? = null,
   secondaryCtaText: String? = null,
   secondaryCtaType: String? = null,
   secondaryCtaKey: String? = null,
   footerTheme: FooterTheme
) {
   public final val titleText: String
   public final val titleIcon: String
   public final val subtitleText: String
   public final val descriptionText: String
   public final val primaryCtaText: String?
   public final val primaryCtaType: String?
   public final val primaryCtaKey: String?
   public final val secondaryCtaText: String?
   public final val secondaryCtaType: String?
   public final val secondaryCtaKey: String?
   public final val footerTheme: FooterTheme

   init {
      super();
      this.titleText = var1;
      this.titleIcon = var2;
      this.subtitleText = var3;
      this.descriptionText = var4;
      this.primaryCtaText = var5;
      this.primaryCtaType = var6;
      this.primaryCtaKey = var7;
      this.secondaryCtaText = var8;
      this.secondaryCtaType = var9;
      this.secondaryCtaKey = var10;
      this.footerTheme = var11;
   }

   public operator fun component1(): String {
      return this.titleText;
   }

   public operator fun component10(): String? {
      return this.secondaryCtaKey;
   }

   public operator fun component11(): FooterTheme {
      return this.footerTheme;
   }

   public operator fun component2(): String {
      return this.titleIcon;
   }

   public operator fun component3(): String {
      return this.subtitleText;
   }

   public operator fun component4(): String {
      return this.descriptionText;
   }

   public operator fun component5(): String? {
      return this.primaryCtaText;
   }

   public operator fun component6(): String? {
      return this.primaryCtaType;
   }

   public operator fun component7(): String? {
      return this.primaryCtaKey;
   }

   public operator fun component8(): String? {
      return this.secondaryCtaText;
   }

   public operator fun component9(): String? {
      return this.secondaryCtaType;
   }

   public fun copy(
      titleText: String = var0.titleText,
      titleIcon: String = var0.titleIcon,
      subtitleText: String = var0.subtitleText,
      descriptionText: String = var0.descriptionText,
      primaryCtaText: String? = var0.primaryCtaText,
      primaryCtaType: String? = var0.primaryCtaType,
      primaryCtaKey: String? = var0.primaryCtaKey,
      secondaryCtaText: String? = var0.secondaryCtaText,
      secondaryCtaType: String? = var0.secondaryCtaType,
      secondaryCtaKey: String? = var0.secondaryCtaKey,
      footerTheme: FooterTheme = var0.footerTheme
   ): SafetySystemNotificationEmbed {
      return new SafetySystemNotificationEmbed(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is SafetySystemNotificationEmbed) {
         return false;
      } else {
         var1 = var1;
         if (!(this.titleText == var1.titleText)) {
            return false;
         } else if (!(this.titleIcon == var1.titleIcon)) {
            return false;
         } else if (!(this.subtitleText == var1.subtitleText)) {
            return false;
         } else if (!(this.descriptionText == var1.descriptionText)) {
            return false;
         } else if (!(this.primaryCtaText == var1.primaryCtaText)) {
            return false;
         } else if (!(this.primaryCtaType == var1.primaryCtaType)) {
            return false;
         } else if (!(this.primaryCtaKey == var1.primaryCtaKey)) {
            return false;
         } else if (!(this.secondaryCtaText == var1.secondaryCtaText)) {
            return false;
         } else if (!(this.secondaryCtaType == var1.secondaryCtaType)) {
            return false;
         } else if (!(this.secondaryCtaKey == var1.secondaryCtaKey)) {
            return false;
         } else {
            return this.footerTheme === var1.footerTheme;
         }
      }
   }

   public override fun hashCode(): Int {
      val var8: Int = this.titleText.hashCode();
      val var7: Int = this.titleIcon.hashCode();
      val var10: Int = this.subtitleText.hashCode();
      val var9: Int = this.descriptionText.hashCode();
      var var6: Int = 0;
      val var1: Int;
      if (this.primaryCtaText == null) {
         var1 = 0;
      } else {
         var1 = this.primaryCtaText.hashCode();
      }

      val var2: Int;
      if (this.primaryCtaType == null) {
         var2 = 0;
      } else {
         var2 = this.primaryCtaType.hashCode();
      }

      val var3: Int;
      if (this.primaryCtaKey == null) {
         var3 = 0;
      } else {
         var3 = this.primaryCtaKey.hashCode();
      }

      val var4: Int;
      if (this.secondaryCtaText == null) {
         var4 = 0;
      } else {
         var4 = this.secondaryCtaText.hashCode();
      }

      val var5: Int;
      if (this.secondaryCtaType == null) {
         var5 = 0;
      } else {
         var5 = this.secondaryCtaType.hashCode();
      }

      if (this.secondaryCtaKey != null) {
         var6 = this.secondaryCtaKey.hashCode();
      }

      return (((((((((var8 * 31 + var7) * 31 + var10) * 31 + var9) * 31 + var1) * 31 + var2) * 31 + var3) * 31 + var4) * 31 + var5) * 31 + var6) * 31
         + this.footerTheme.hashCode();
   }

   public override fun toString(): String {
      val var3: java.lang.String = this.titleText;
      val var6: java.lang.String = this.titleIcon;
      val var9: java.lang.String = this.subtitleText;
      val var1: java.lang.String = this.descriptionText;
      val var10: java.lang.String = this.primaryCtaText;
      val var5: java.lang.String = this.primaryCtaType;
      val var4: java.lang.String = this.primaryCtaKey;
      val var7: java.lang.String = this.secondaryCtaText;
      val var11: java.lang.String = this.secondaryCtaType;
      val var12: java.lang.String = this.secondaryCtaKey;
      val var2: FooterTheme = this.footerTheme;
      val var8: StringBuilder = new StringBuilder();
      var8.append("SafetySystemNotificationEmbed(titleText=");
      var8.append(var3);
      var8.append(", titleIcon=");
      var8.append(var6);
      var8.append(", subtitleText=");
      var8.append(var9);
      var8.append(", descriptionText=");
      var8.append(var1);
      var8.append(", primaryCtaText=");
      var8.append(var10);
      var8.append(", primaryCtaType=");
      var8.append(var5);
      var8.append(", primaryCtaKey=");
      var8.append(var4);
      var8.append(", secondaryCtaText=");
      var8.append(var7);
      var8.append(", secondaryCtaType=");
      var8.append(var11);
      var8.append(", secondaryCtaKey=");
      var8.append(var12);
      var8.append(", footerTheme=");
      var8.append(var2);
      var8.append(")");
      return var8.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<SafetySystemNotificationEmbed> {
         return SafetySystemNotificationEmbed.$serializer.INSTANCE;
      }
   }
}

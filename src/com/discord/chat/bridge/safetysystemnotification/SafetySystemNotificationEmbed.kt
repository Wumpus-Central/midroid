package com.discord.chat.bridge.safetysystemnotification

import cl.f
import cl.n
import dl.a
import fl.b2
import fl.g0
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor

@f
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
   public final val descriptionText: String
   public final val footerTheme: FooterTheme
   public final val primaryCtaKey: String?
   public final val primaryCtaText: String?
   public final val primaryCtaType: String?
   public final val secondaryCtaKey: String?
   public final val secondaryCtaText: String?
   public final val secondaryCtaType: String?
   public final val subtitleText: String
   public final val titleIcon: String
   public final val titleText: String

   init {
      q.h(var1, "titleText");
      q.h(var2, "titleIcon");
      q.h(var3, "subtitleText");
      q.h(var4, "descriptionText");
      q.h(var11, "footerTheme");
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
      q.h(var1, "titleText");
      q.h(var2, "titleIcon");
      q.h(var3, "subtitleText");
      q.h(var4, "descriptionText");
      q.h(var11, "footerTheme");
      return new SafetySystemNotificationEmbed(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is SafetySystemNotificationEmbed) {
         return false;
      } else {
         var1 = var1;
         if (!q.c(this.titleText, var1.titleText)) {
            return false;
         } else if (!q.c(this.titleIcon, var1.titleIcon)) {
            return false;
         } else if (!q.c(this.subtitleText, var1.subtitleText)) {
            return false;
         } else if (!q.c(this.descriptionText, var1.descriptionText)) {
            return false;
         } else if (!q.c(this.primaryCtaText, var1.primaryCtaText)) {
            return false;
         } else if (!q.c(this.primaryCtaType, var1.primaryCtaType)) {
            return false;
         } else if (!q.c(this.primaryCtaKey, var1.primaryCtaKey)) {
            return false;
         } else if (!q.c(this.secondaryCtaText, var1.secondaryCtaText)) {
            return false;
         } else if (!q.c(this.secondaryCtaType, var1.secondaryCtaType)) {
            return false;
         } else if (!q.c(this.secondaryCtaKey, var1.secondaryCtaKey)) {
            return false;
         } else {
            return this.footerTheme === var1.footerTheme;
         }
      }
   }

   public override fun hashCode(): Int {
      val var10: Int = this.titleText.hashCode();
      val var9: Int = this.titleIcon.hashCode();
      val var7: Int = this.subtitleText.hashCode();
      val var8: Int = this.descriptionText.hashCode();
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

      return (((((((((var10 * 31 + var9) * 31 + var7) * 31 + var8) * 31 + var1) * 31 + var2) * 31 + var3) * 31 + var4) * 31 + var5) * 31 + var6) * 31
         + this.footerTheme.hashCode();
   }

   public override fun toString(): String {
      val var10: java.lang.String = this.titleText;
      val var12: java.lang.String = this.titleIcon;
      val var2: java.lang.String = this.subtitleText;
      val var8: java.lang.String = this.descriptionText;
      val var7: java.lang.String = this.primaryCtaText;
      val var4: java.lang.String = this.primaryCtaType;
      val var6: java.lang.String = this.primaryCtaKey;
      val var11: java.lang.String = this.secondaryCtaText;
      val var1: java.lang.String = this.secondaryCtaType;
      val var9: java.lang.String = this.secondaryCtaKey;
      val var3: FooterTheme = this.footerTheme;
      val var5: StringBuilder = new StringBuilder();
      var5.append("SafetySystemNotificationEmbed(titleText=");
      var5.append(var10);
      var5.append(", titleIcon=");
      var5.append(var12);
      var5.append(", subtitleText=");
      var5.append(var2);
      var5.append(", descriptionText=");
      var5.append(var8);
      var5.append(", primaryCtaText=");
      var5.append(var7);
      var5.append(", primaryCtaType=");
      var5.append(var4);
      var5.append(", primaryCtaKey=");
      var5.append(var6);
      var5.append(", secondaryCtaText=");
      var5.append(var11);
      var5.append(", secondaryCtaType=");
      var5.append(var1);
      var5.append(", secondaryCtaKey=");
      var5.append(var9);
      var5.append(", footerTheme=");
      var5.append(var3);
      var5.append(")");
      return var5.toString();
   }

   public object `$serializer` : g0 {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: SafetySystemNotificationEmbed.$serializer = new SafetySystemNotificationEmbed.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor(
            "com.discord.chat.bridge.safetysystemnotification.SafetySystemNotificationEmbed", var0, 11
         );
         var1.l("titleText", false);
         var1.l("titleIcon", false);
         var1.l("subtitleText", false);
         var1.l("descriptionText", false);
         var1.l("primaryCtaText", true);
         var1.l("primaryCtaType", true);
         var1.l("primaryCtaKey", true);
         var1.l("secondaryCtaText", true);
         var1.l("secondaryCtaType", true);
         var1.l("secondaryCtaKey", true);
         var1.l("footerTheme", false);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         val var1: Array<KSerializer> = SafetySystemNotificationEmbed.access$get$childSerializers$cp();
         val var2: b2 = b2.a;
         return new KSerializer[]{b2.a, b2.a, b2.a, b2.a, a.u(b2.a), a.u(var2), a.u(var2), a.u(var2), a.u(var2), a.u(var2), var1[10]};
      }

      public open fun deserialize(decoder: Decoder): SafetySystemNotificationEmbed {
         q.h(var1, "decoder");
         val var21: SerialDescriptor = this.getDescriptor();
         val var22: c = var1.c(var21);
         val var20: Array<KSerializer> = SafetySystemNotificationEmbed.access$get$childSerializers$cp();
         val var6: Boolean = var22.y();
         var var4: Byte = 9;
         var var9: java.lang.String = null;
         var var2: Int;
         var var7: java.lang.String;
         var var11: java.lang.String;
         var var12: java.lang.String;
         var var13: java.lang.String;
         var var14: java.lang.String;
         var var15: java.lang.String;
         var var16: FooterTheme;
         val var17: java.lang.String;
         val var18: java.lang.String;
         val var19: java.lang.String;
         val var24: java.lang.String;
         if (var6) {
            var12 = var22.t(var21, 0);
            var14 = var22.t(var21, 1);
            var18 = var22.t(var21, 2);
            var17 = var22.t(var21, 3);
            val var23: b2 = b2.a;
            var19 = var22.v(var21, 4, b2.a, null) as java.lang.String;
            val var10: java.lang.String = var22.v(var21, 5, var23, null) as java.lang.String;
            val var8: java.lang.String = var22.v(var21, 6, var23, null) as java.lang.String;
            var7 = var22.v(var21, 7, var23, null) as java.lang.String;
            var9 = var22.v(var21, 8, var23, null) as java.lang.String;
            var24 = var22.v(var21, 9, var23, null) as java.lang.String;
            var16 = var22.m(var21, 10, var20[10], null) as FooterTheme;
            var2 = 2047;
            var15 = var10;
            var13 = var8;
            var11 = var9;
         } else {
            var var3: Boolean = true;
            var2 = 0;
            var16 = null;
            var15 = null;
            var14 = null;
            var13 = null;
            var12 = null;
            var11 = null;
            var var29: java.lang.String = null;
            var var27: java.lang.String = null;
            var7 = null;
            var var25: java.lang.String = null;

            while (var3) {
               val var5: Int = var22.x(var21);
               switch (var5) {
                  case -1:
                     var3 = false;
                     break;
                  case 0:
                     var9 = var22.t(var21, 0);
                     var2 |= 1;
                     break;
                  case 1:
                     var27 = var22.t(var21, 1);
                     var2 |= 2;
                     break;
                  case 2:
                     var7 = var22.t(var21, 2);
                     var2 |= 4;
                     break;
                  case 3:
                     var25 = var22.t(var21, 3);
                     var2 |= 8;
                     break;
                  case 4:
                     var29 = var22.v(var21, 4, b2.a, var29) as java.lang.String;
                     var2 |= 16;
                     break;
                  case 5:
                     var11 = var22.v(var21, 5, b2.a, var11) as java.lang.String;
                     var2 |= 32;
                     break;
                  case 6:
                     var12 = var22.v(var21, 6, b2.a, var12) as java.lang.String;
                     var2 |= 64;
                     break;
                  case 7:
                     var14 = var22.v(var21, 7, b2.a, var14) as java.lang.String;
                     var2 |= 128;
                     var4 = 9;
                     continue;
                  case 8:
                     var13 = var22.v(var21, 8, b2.a, var13) as java.lang.String;
                     var2 |= 256;
                     continue;
                  case 9:
                     var15 = var22.v(var21, var4, b2.a, var15) as java.lang.String;
                     var2 |= 512;
                     continue;
                  case 10:
                     var16 = var22.m(var21, 10, var20[10], var16) as FooterTheme;
                     var2 |= 1024;
                     continue;
                  default:
                     throw new n(var5);
               }

               var4 = 9;
            }

            var18 = var7;
            var24 = var15;
            var11 = var13;
            var7 = var14;
            var13 = var12;
            var15 = var11;
            var19 = var29;
            var17 = var25;
            var14 = var27;
            var12 = var9;
         }

         var22.b(var21);
         return new SafetySystemNotificationEmbed(var2, var12, var14, var18, var17, var19, var15, var13, var7, var11, var24, var16, null);
      }

      public open fun serialize(encoder: Encoder, value: SafetySystemNotificationEmbed) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.c(var3);
         SafetySystemNotificationEmbed.write$Self$chat_release(var2, var4, var3);
         var4.b(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return fl.g0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<SafetySystemNotificationEmbed> {
         return SafetySystemNotificationEmbed.$serializer.INSTANCE;
      }
   }
}

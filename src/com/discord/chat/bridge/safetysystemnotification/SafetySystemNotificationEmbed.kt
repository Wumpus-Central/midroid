package com.discord.chat.bridge.safetysystemnotification

import kotlin.jvm.internal.r
import kotlinx.serialization.DeserializationStrategy
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
import uk.f
import uk.n
import vk.a
import xk.a2
import xk.f0

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
      r.h(var1, "titleText");
      r.h(var2, "titleIcon");
      r.h(var3, "subtitleText");
      r.h(var4, "descriptionText");
      r.h(var11, "footerTheme");
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

   @JvmStatic
   public fun `write$Self`(self: SafetySystemNotificationEmbed, output: CompositeEncoder, serialDesc: SerialDescriptor) {
      r.h(var0, "self");
      r.h(var1, "output");
      r.h(var2, "serialDesc");
      var1.z(var2, 0, var0.titleText);
      var1.z(var2, 1, var0.titleIcon);
      var1.z(var2, 2, var0.subtitleText);
      var1.z(var2, 3, var0.descriptionText);
      var var3: Boolean;
      if (!var1.A(var2, 4) && var0.primaryCtaText == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 4, a2.a, var0.primaryCtaText);
      }

      if (!var1.A(var2, 5) && var0.primaryCtaType == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 5, a2.a, var0.primaryCtaType);
      }

      if (!var1.A(var2, 6) && var0.primaryCtaKey == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 6, a2.a, var0.primaryCtaKey);
      }

      if (!var1.A(var2, 7) && var0.secondaryCtaText == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 7, a2.a, var0.secondaryCtaText);
      }

      if (!var1.A(var2, 8) && var0.secondaryCtaType == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 8, a2.a, var0.secondaryCtaType);
      }

      label56: {
         if (!var1.A(var2, 9)) {
            var3 = false;
            if (var0.secondaryCtaKey == null) {
               break label56;
            }
         }

         var3 = true;
      }

      if (var3) {
         var1.m(var2, 9, a2.a, var0.secondaryCtaKey);
      }

      var1.y(var2, 10, FooterTheme.Companion.serializer(), var0.footerTheme);
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
      r.h(var1, "titleText");
      r.h(var2, "titleIcon");
      r.h(var3, "subtitleText");
      r.h(var4, "descriptionText");
      r.h(var11, "footerTheme");
      return new SafetySystemNotificationEmbed(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is SafetySystemNotificationEmbed) {
         return false;
      } else {
         var1 = var1;
         if (!r.c(this.titleText, var1.titleText)) {
            return false;
         } else if (!r.c(this.titleIcon, var1.titleIcon)) {
            return false;
         } else if (!r.c(this.subtitleText, var1.subtitleText)) {
            return false;
         } else if (!r.c(this.descriptionText, var1.descriptionText)) {
            return false;
         } else if (!r.c(this.primaryCtaText, var1.primaryCtaText)) {
            return false;
         } else if (!r.c(this.primaryCtaType, var1.primaryCtaType)) {
            return false;
         } else if (!r.c(this.primaryCtaKey, var1.primaryCtaKey)) {
            return false;
         } else if (!r.c(this.secondaryCtaText, var1.secondaryCtaText)) {
            return false;
         } else if (!r.c(this.secondaryCtaType, var1.secondaryCtaType)) {
            return false;
         } else if (!r.c(this.secondaryCtaKey, var1.secondaryCtaKey)) {
            return false;
         } else {
            return this.footerTheme === var1.footerTheme;
         }
      }
   }

   public override fun hashCode(): Int {
      val var9: Int = this.titleText.hashCode();
      val var7: Int = this.titleIcon.hashCode();
      val var10: Int = this.subtitleText.hashCode();
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

      return (((((((((var9 * 31 + var7) * 31 + var10) * 31 + var8) * 31 + var1) * 31 + var2) * 31 + var3) * 31 + var4) * 31 + var5) * 31 + var6) * 31
         + this.footerTheme.hashCode();
   }

   public override fun toString(): String {
      val var10: java.lang.String = this.titleText;
      val var5: java.lang.String = this.titleIcon;
      val var4: java.lang.String = this.subtitleText;
      val var11: java.lang.String = this.descriptionText;
      val var8: java.lang.String = this.primaryCtaText;
      val var1: java.lang.String = this.primaryCtaType;
      val var6: java.lang.String = this.primaryCtaKey;
      val var3: java.lang.String = this.secondaryCtaText;
      val var12: java.lang.String = this.secondaryCtaType;
      val var2: java.lang.String = this.secondaryCtaKey;
      val var9: FooterTheme = this.footerTheme;
      val var7: StringBuilder = new StringBuilder();
      var7.append("SafetySystemNotificationEmbed(titleText=");
      var7.append(var10);
      var7.append(", titleIcon=");
      var7.append(var5);
      var7.append(", subtitleText=");
      var7.append(var4);
      var7.append(", descriptionText=");
      var7.append(var11);
      var7.append(", primaryCtaText=");
      var7.append(var8);
      var7.append(", primaryCtaType=");
      var7.append(var1);
      var7.append(", primaryCtaKey=");
      var7.append(var6);
      var7.append(", secondaryCtaText=");
      var7.append(var3);
      var7.append(", secondaryCtaType=");
      var7.append(var12);
      var7.append(", secondaryCtaKey=");
      var7.append(var2);
      var7.append(", footerTheme=");
      var7.append(var9);
      var7.append(")");
      return var7.toString();
   }

   public object `$serializer` : f0<SafetySystemNotificationEmbed> {
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
         val var1: a2 = a2.a;
         return new KSerializer[]{a2.a, a2.a, a2.a, a2.a, a.u(a2.a), a.u(var1), a.u(var1), a.u(var1), a.u(var1), a.u(var1), FooterTheme.Companion.serializer()};
      }

      public open fun deserialize(decoder: Decoder): SafetySystemNotificationEmbed {
         r.h(var1, "decoder");
         val var18: SerialDescriptor = this.getDescriptor();
         val var19: c = var1.b(var18);
         val var6: Boolean = var19.p();
         var var4: Byte = 10;
         var var11: java.lang.String = null;
         var var2: Int;
         var var7: Any;
         var var8: Any;
         var var9: Any;
         var var10: Any;
         var var12: Any;
         var var13: Any;
         var var14: Any;
         var var16: Any;
         var var20: Any;
         var var23: Any;
         if (var6) {
            var11 = var19.m(var18, 0);
            var12 = var19.m(var18, 1);
            var20 = var19.m(var18, 2);
            var7 = var19.m(var18, 3);
            var23 = a2.a;
            var8 = var19.n(var18, 4, a2.a, null);
            var9 = var19.n(var18, 5, (DeserializationStrategy)var23, null);
            var10 = var19.n(var18, 6, (DeserializationStrategy)var23, null);
            var14 = var19.n(var18, 7, (DeserializationStrategy)var23, null);
            var13 = var19.n(var18, 8, (DeserializationStrategy)var23, null);
            var23 = var19.n(var18, 9, (DeserializationStrategy)var23, null);
            var16 = var19.y(var18, 10, FooterTheme.Companion.serializer(), null);
            var2 = 2047;
         } else {
            var var3: Boolean = true;
            var2 = 0;
            var16 = null;
            var23 = null;
            var14 = null;
            var13 = null;
            var12 = null;
            var9 = null;
            var8 = null;
            var10 = null;
            var20 = null;
            var7 = null;

            while (var3) {
               val var5: Int = var19.o(var18);
               switch (var5) {
                  case -1:
                     var3 = false;
                     break;
                  case 0:
                     var11 = var19.m(var18, 0);
                     var2 |= 1;
                     break;
                  case 1:
                     var10 = var19.m(var18, 1);
                     var2 |= 2;
                     break;
                  case 2:
                     var20 = var19.m(var18, 2);
                     var2 |= 4;
                     break;
                  case 3:
                     var7 = var19.m(var18, 3);
                     var2 |= 8;
                     break;
                  case 4:
                     var8 = var19.n(var18, 4, a2.a, var8);
                     var2 |= 16;
                     break;
                  case 5:
                     var9 = var19.n(var18, 5, a2.a, var9);
                     var2 |= 32;
                     break;
                  case 6:
                     var12 = var19.n(var18, 6, a2.a, var12);
                     var2 |= 64;
                     break;
                  case 7:
                     var14 = var19.n(var18, 7, a2.a, var14);
                     var2 |= 128;
                     var4 = 10;
                     continue;
                  case 8:
                     var13 = var19.n(var18, 8, a2.a, var13);
                     var2 |= 256;
                     continue;
                  case 9:
                     var23 = var19.n(var18, 9, a2.a, var23);
                     var2 |= 512;
                     continue;
                  case 10:
                     var16 = var19.y(var18, var4, FooterTheme.Companion.serializer(), var16);
                     var2 |= 1024;
                     continue;
                  default:
                     throw new n(var5);
               }

               var4 = 10;
            }

            var12 = var10;
            var10 = var12;
         }

         var19.c(var18);
         return new SafetySystemNotificationEmbed(
            var2,
            var11,
            (java.lang.String)var12,
            (java.lang.String)var20,
            (java.lang.String)var7,
            var8 as java.lang.String,
            var9 as java.lang.String,
            var10 as java.lang.String,
            var14 as java.lang.String,
            var13 as java.lang.String,
            var23 as java.lang.String,
            var16 as FooterTheme,
            null
         );
      }

      public open fun serialize(encoder: Encoder, value: SafetySystemNotificationEmbed) {
         r.h(var1, "encoder");
         r.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         SafetySystemNotificationEmbed.write$Self(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer<?>> {
         return xk.f0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<SafetySystemNotificationEmbed> {
         return SafetySystemNotificationEmbed.$serializer.INSTANCE;
      }
   }
}

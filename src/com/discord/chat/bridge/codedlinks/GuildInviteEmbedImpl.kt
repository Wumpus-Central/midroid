package com.discord.chat.bridge.codedlinks

import cl.f
import cl.n
import dl.a
import fl.b2
import fl.g0
import fl.h
import fl.n0
import kotlin.jvm.internal.q
import kotlinx.serialization.DeserializationStrategy
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor

@f
public data class GuildInviteEmbedImpl(backgroundColor: Int,
      borderColor: Int,
      headerColor: Int,
      headerText: String?,
      type: InviteType,
      acceptLabelBackgroundColor: Int? = null,
      acceptLabelBorderColor: Int? = null,
      acceptLabelColor: Int? = null,
      acceptLabelText: String? = null,
      bodyText: String? = null,
      bodyTextColor: Int? = null,
      canBeAccepted: Boolean? = null,
      channelIcon: String? = null,
      channelName: String? = null,
      embedCanBeTapped: Boolean? = null,
      memberText: String? = ...,
      onlineText: String? = ...,
      resolvingGradientEnd: Int? = ...,
      resolvingGradientStart: Int? = ...,
      splashHasRadialGradient: Boolean? = ...,
      splashOpacity: Int? = ...,
      splashUrl: String? = ...,
      inviteSplash: String? = ...,
      subtitle: String? = ...,
      subtitleColor: Int? = ...,
      thumbnailBackgroundColor: Int? = ...,
      thumbnailCornerRadius: Int? = ...,
      thumbnailText: String? = ...,
      thumbnailUrl: String? = ...,
      titleColor: Int? = ...,
      titleText: String? = null
   )
   : CodedLinkEmbed,
   GuildInviteEmbed {
   public open val acceptLabelBackgroundColor: Int?
   public open val acceptLabelBorderColor: Int?
   public open val acceptLabelColor: Int?
   public open val acceptLabelText: String?
   public open val backgroundColor: Int
   public open val bodyText: String?
   public open val bodyTextColor: Int?
   public open val borderColor: Int
   public open val canBeAccepted: Boolean?
   public open val channelIcon: String?
   public open val channelName: String?
   public open val embedCanBeTapped: Boolean?
   public open val headerColor: Int
   public open val headerText: String?
   public open val inviteSplash: String?
   public open val memberText: String?
   public open val onlineText: String?
   public open val resolvingGradientEnd: Int?
   public open val resolvingGradientStart: Int?
   public open val splashHasRadialGradient: Boolean?
   public open val splashOpacity: Int?
   public open val splashUrl: String?
   public open val subtitle: String?
   public open val subtitleColor: Int?
   public open val thumbnailBackgroundColor: Int?
   public open val thumbnailCornerRadius: Int?
   public open val thumbnailText: String?
   public open val thumbnailUrl: String?
   public open val titleColor: Int?
   public open val titleText: String?
   public open val type: InviteType

   init {
      q.h(var5, "type");
      super(null);
      this.backgroundColor = var1;
      this.borderColor = var2;
      this.headerColor = var3;
      this.headerText = var4;
      this.type = var5;
      this.acceptLabelBackgroundColor = var6;
      this.acceptLabelBorderColor = var7;
      this.acceptLabelColor = var8;
      this.acceptLabelText = var9;
      this.bodyText = var10;
      this.bodyTextColor = var11;
      this.canBeAccepted = var12;
      this.channelIcon = var13;
      this.channelName = var14;
      this.embedCanBeTapped = var15;
      this.memberText = var16;
      this.onlineText = var17;
      this.resolvingGradientEnd = var18;
      this.resolvingGradientStart = var19;
      this.splashHasRadialGradient = var20;
      this.splashOpacity = var21;
      this.splashUrl = var22;
      this.inviteSplash = var23;
      this.subtitle = var24;
      this.subtitleColor = var25;
      this.thumbnailBackgroundColor = var26;
      this.thumbnailCornerRadius = var27;
      this.thumbnailText = var28;
      this.thumbnailUrl = var29;
      this.titleColor = var30;
      this.titleText = var31;
   }

   public operator fun component1(): Int {
      return this.backgroundColor;
   }

   public operator fun component10(): String? {
      return this.bodyText;
   }

   public operator fun component11(): Int? {
      return this.bodyTextColor;
   }

   public operator fun component12(): Boolean? {
      return this.canBeAccepted;
   }

   public operator fun component13(): String? {
      return this.channelIcon;
   }

   public operator fun component14(): String? {
      return this.channelName;
   }

   public operator fun component15(): Boolean? {
      return this.embedCanBeTapped;
   }

   public operator fun component16(): String? {
      return this.memberText;
   }

   public operator fun component17(): String? {
      return this.onlineText;
   }

   public operator fun component18(): Int? {
      return this.resolvingGradientEnd;
   }

   public operator fun component19(): Int? {
      return this.resolvingGradientStart;
   }

   public operator fun component2(): Int {
      return this.borderColor;
   }

   public operator fun component20(): Boolean? {
      return this.splashHasRadialGradient;
   }

   public operator fun component21(): Int? {
      return this.splashOpacity;
   }

   public operator fun component22(): String? {
      return this.splashUrl;
   }

   public operator fun component23(): String? {
      return this.inviteSplash;
   }

   public operator fun component24(): String? {
      return this.subtitle;
   }

   public operator fun component25(): Int? {
      return this.subtitleColor;
   }

   public operator fun component26(): Int? {
      return this.thumbnailBackgroundColor;
   }

   public operator fun component27(): Int? {
      return this.thumbnailCornerRadius;
   }

   public operator fun component28(): String? {
      return this.thumbnailText;
   }

   public operator fun component29(): String? {
      return this.thumbnailUrl;
   }

   public operator fun component3(): Int {
      return this.headerColor;
   }

   public operator fun component30(): Int? {
      return this.titleColor;
   }

   public operator fun component31(): String? {
      return this.titleText;
   }

   public operator fun component4(): String? {
      return this.headerText;
   }

   public operator fun component5(): InviteType {
      return this.type;
   }

   public operator fun component6(): Int? {
      return this.acceptLabelBackgroundColor;
   }

   public operator fun component7(): Int? {
      return this.acceptLabelBorderColor;
   }

   public operator fun component8(): Int? {
      return this.acceptLabelColor;
   }

   public operator fun component9(): String? {
      return this.acceptLabelText;
   }

   public fun copy(
      backgroundColor: Int = var0.backgroundColor,
      borderColor: Int = var0.borderColor,
      headerColor: Int = var0.headerColor,
      headerText: String? = var0.headerText,
      type: InviteType = var0.type,
      acceptLabelBackgroundColor: Int? = var0.acceptLabelBackgroundColor,
      acceptLabelBorderColor: Int? = var0.acceptLabelBorderColor,
      acceptLabelColor: Int? = var0.acceptLabelColor,
      acceptLabelText: String? = var0.acceptLabelText,
      bodyText: String? = var0.bodyText,
      bodyTextColor: Int? = var0.bodyTextColor,
      canBeAccepted: Boolean? = var0.canBeAccepted,
      channelIcon: String? = var0.channelIcon,
      channelName: String? = var0.channelName,
      embedCanBeTapped: Boolean? = var0.embedCanBeTapped,
      memberText: String? = var0.memberText,
      onlineText: String? = var0.onlineText,
      resolvingGradientEnd: Int? = var0.resolvingGradientEnd,
      resolvingGradientStart: Int? = var0.resolvingGradientStart,
      splashHasRadialGradient: Boolean? = var0.splashHasRadialGradient,
      splashOpacity: Int? = var0.splashOpacity,
      splashUrl: String? = var0.splashUrl,
      inviteSplash: String? = var0.inviteSplash,
      subtitle: String? = var0.subtitle,
      subtitleColor: Int? = var0.subtitleColor,
      thumbnailBackgroundColor: Int? = var0.thumbnailBackgroundColor,
      thumbnailCornerRadius: Int? = var0.thumbnailCornerRadius,
      thumbnailText: String? = var0.thumbnailText,
      thumbnailUrl: String? = var0.thumbnailUrl,
      titleColor: Int? = var0.titleColor,
      titleText: String? = var0.titleText
   ): GuildInviteEmbedImpl {
      q.h(var5, "type");
      return new GuildInviteEmbedImpl(
         var1,
         var2,
         var3,
         var4,
         var5,
         var6,
         var7,
         var8,
         var9,
         var10,
         var11,
         var12,
         var13,
         var14,
         var15,
         var16,
         var17,
         var18,
         var19,
         var20,
         var21,
         var22,
         var23,
         var24,
         var25,
         var26,
         var27,
         var28,
         var29,
         var30,
         var31
      );
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is GuildInviteEmbedImpl) {
         return false;
      } else {
         var1 = var1;
         if (this.backgroundColor != var1.backgroundColor) {
            return false;
         } else if (this.borderColor != var1.borderColor) {
            return false;
         } else if (this.headerColor != var1.headerColor) {
            return false;
         } else if (!q.c(this.headerText, var1.headerText)) {
            return false;
         } else if (this.type != var1.type) {
            return false;
         } else if (!q.c(this.acceptLabelBackgroundColor, var1.acceptLabelBackgroundColor)) {
            return false;
         } else if (!q.c(this.acceptLabelBorderColor, var1.acceptLabelBorderColor)) {
            return false;
         } else if (!q.c(this.acceptLabelColor, var1.acceptLabelColor)) {
            return false;
         } else if (!q.c(this.acceptLabelText, var1.acceptLabelText)) {
            return false;
         } else if (!q.c(this.bodyText, var1.bodyText)) {
            return false;
         } else if (!q.c(this.bodyTextColor, var1.bodyTextColor)) {
            return false;
         } else if (!q.c(this.canBeAccepted, var1.canBeAccepted)) {
            return false;
         } else if (!q.c(this.channelIcon, var1.channelIcon)) {
            return false;
         } else if (!q.c(this.channelName, var1.channelName)) {
            return false;
         } else if (!q.c(this.embedCanBeTapped, var1.embedCanBeTapped)) {
            return false;
         } else if (!q.c(this.memberText, var1.memberText)) {
            return false;
         } else if (!q.c(this.onlineText, var1.onlineText)) {
            return false;
         } else if (!q.c(this.resolvingGradientEnd, var1.resolvingGradientEnd)) {
            return false;
         } else if (!q.c(this.resolvingGradientStart, var1.resolvingGradientStart)) {
            return false;
         } else if (!q.c(this.splashHasRadialGradient, var1.splashHasRadialGradient)) {
            return false;
         } else if (!q.c(this.splashOpacity, var1.splashOpacity)) {
            return false;
         } else if (!q.c(this.splashUrl, var1.splashUrl)) {
            return false;
         } else if (!q.c(this.inviteSplash, var1.inviteSplash)) {
            return false;
         } else if (!q.c(this.subtitle, var1.subtitle)) {
            return false;
         } else if (!q.c(this.subtitleColor, var1.subtitleColor)) {
            return false;
         } else if (!q.c(this.thumbnailBackgroundColor, var1.thumbnailBackgroundColor)) {
            return false;
         } else if (!q.c(this.thumbnailCornerRadius, var1.thumbnailCornerRadius)) {
            return false;
         } else if (!q.c(this.thumbnailText, var1.thumbnailText)) {
            return false;
         } else if (!q.c(this.thumbnailUrl, var1.thumbnailUrl)) {
            return false;
         } else if (!q.c(this.titleColor, var1.titleColor)) {
            return false;
         } else {
            return q.c(this.titleText, var1.titleText);
         }
      }
   }

   public override fun hashCode(): Int {
      val var30: Int = Integer.hashCode(this.backgroundColor);
      val var28: Int = Integer.hashCode(this.borderColor);
      val var29: Int = Integer.hashCode(this.headerColor);
      var var27: Int = 0;
      val var1: Int;
      if (this.headerText == null) {
         var1 = 0;
      } else {
         var1 = this.headerText.hashCode();
      }

      val var31: Int = this.type.hashCode();
      val var2: Int;
      if (this.acceptLabelBackgroundColor == null) {
         var2 = 0;
      } else {
         var2 = this.acceptLabelBackgroundColor.hashCode();
      }

      val var3: Int;
      if (this.acceptLabelBorderColor == null) {
         var3 = 0;
      } else {
         var3 = this.acceptLabelBorderColor.hashCode();
      }

      val var4: Int;
      if (this.acceptLabelColor == null) {
         var4 = 0;
      } else {
         var4 = this.acceptLabelColor.hashCode();
      }

      val var5: Int;
      if (this.acceptLabelText == null) {
         var5 = 0;
      } else {
         var5 = this.acceptLabelText.hashCode();
      }

      val var6: Int;
      if (this.bodyText == null) {
         var6 = 0;
      } else {
         var6 = this.bodyText.hashCode();
      }

      val var7: Int;
      if (this.bodyTextColor == null) {
         var7 = 0;
      } else {
         var7 = this.bodyTextColor.hashCode();
      }

      val var8: Int;
      if (this.canBeAccepted == null) {
         var8 = 0;
      } else {
         var8 = this.canBeAccepted.hashCode();
      }

      val var9: Int;
      if (this.channelIcon == null) {
         var9 = 0;
      } else {
         var9 = this.channelIcon.hashCode();
      }

      val var10: Int;
      if (this.channelName == null) {
         var10 = 0;
      } else {
         var10 = this.channelName.hashCode();
      }

      val var11: Int;
      if (this.embedCanBeTapped == null) {
         var11 = 0;
      } else {
         var11 = this.embedCanBeTapped.hashCode();
      }

      val var12: Int;
      if (this.memberText == null) {
         var12 = 0;
      } else {
         var12 = this.memberText.hashCode();
      }

      val var13: Int;
      if (this.onlineText == null) {
         var13 = 0;
      } else {
         var13 = this.onlineText.hashCode();
      }

      val var14: Int;
      if (this.resolvingGradientEnd == null) {
         var14 = 0;
      } else {
         var14 = this.resolvingGradientEnd.hashCode();
      }

      val var15: Int;
      if (this.resolvingGradientStart == null) {
         var15 = 0;
      } else {
         var15 = this.resolvingGradientStart.hashCode();
      }

      val var16: Int;
      if (this.splashHasRadialGradient == null) {
         var16 = 0;
      } else {
         var16 = this.splashHasRadialGradient.hashCode();
      }

      val var17: Int;
      if (this.splashOpacity == null) {
         var17 = 0;
      } else {
         var17 = this.splashOpacity.hashCode();
      }

      val var18: Int;
      if (this.splashUrl == null) {
         var18 = 0;
      } else {
         var18 = this.splashUrl.hashCode();
      }

      val var19: Int;
      if (this.inviteSplash == null) {
         var19 = 0;
      } else {
         var19 = this.inviteSplash.hashCode();
      }

      val var20: Int;
      if (this.subtitle == null) {
         var20 = 0;
      } else {
         var20 = this.subtitle.hashCode();
      }

      val var21: Int;
      if (this.subtitleColor == null) {
         var21 = 0;
      } else {
         var21 = this.subtitleColor.hashCode();
      }

      val var22: Int;
      if (this.thumbnailBackgroundColor == null) {
         var22 = 0;
      } else {
         var22 = this.thumbnailBackgroundColor.hashCode();
      }

      val var23: Int;
      if (this.thumbnailCornerRadius == null) {
         var23 = 0;
      } else {
         var23 = this.thumbnailCornerRadius.hashCode();
      }

      val var24: Int;
      if (this.thumbnailText == null) {
         var24 = 0;
      } else {
         var24 = this.thumbnailText.hashCode();
      }

      val var25: Int;
      if (this.thumbnailUrl == null) {
         var25 = 0;
      } else {
         var25 = this.thumbnailUrl.hashCode();
      }

      val var26: Int;
      if (this.titleColor == null) {
         var26 = 0;
      } else {
         var26 = this.titleColor.hashCode();
      }

      if (this.titleText != null) {
         var27 = this.titleText.hashCode();
      }

      return (
               (
                        (
                                 (
                                          (
                                                   (
                                                            (
                                                                     (
                                                                              (
                                                                                       (
                                                                                                (
                                                                                                         (
                                                                                                                  (
                                                                                                                           (
                                                                                                                                    (
                                                                                                                                             (
                                                                                                                                                      (
                                                                                                                                                               (
                                                                                                                                                                        (
                                                                                                                                                                                 (
                                                                                                                                                                                          (
                                                                                                                                                                                                   (
                                                                                                                                                                                                            (
                                                                                                                                                                                                                     (
                                                                                                                                                                                                                              (
                                                                                                                                                                                                                                       (
                                                                                                                                                                                                                                                (
                                                                                                                                                                                                                                                         (
                                                                                                                                                                                                                                                                  (
                                                                                                                                                                                                                                                                           var30
                                                                                                                                                                                                                                                                                 * 31
                                                                                                                                                                                                                                                                              + var28
                                                                                                                                                                                                                                                                        )
                                                                                                                                                                                                                                                                        * 31
                                                                                                                                                                                                                                                                     + var29
                                                                                                                                                                                                                                                               )
                                                                                                                                                                                                                                                               * 31
                                                                                                                                                                                                                                                            + var1
                                                                                                                                                                                                                                                      )
                                                                                                                                                                                                                                                      * 31
                                                                                                                                                                                                                                                   + var31
                                                                                                                                                                                                                                             )
                                                                                                                                                                                                                                             * 31
                                                                                                                                                                                                                                          + var2
                                                                                                                                                                                                                                    )
                                                                                                                                                                                                                                    * 31
                                                                                                                                                                                                                                 + var3
                                                                                                                                                                                                                           )
                                                                                                                                                                                                                           * 31
                                                                                                                                                                                                                        + var4
                                                                                                                                                                                                                  )
                                                                                                                                                                                                                  * 31
                                                                                                                                                                                                               + var5
                                                                                                                                                                                                         )
                                                                                                                                                                                                         * 31
                                                                                                                                                                                                      + var6
                                                                                                                                                                                                )
                                                                                                                                                                                                * 31
                                                                                                                                                                                             + var7
                                                                                                                                                                                       )
                                                                                                                                                                                       * 31
                                                                                                                                                                                    + var8
                                                                                                                                                                              )
                                                                                                                                                                              * 31
                                                                                                                                                                           + var9
                                                                                                                                                                     )
                                                                                                                                                                     * 31
                                                                                                                                                                  + var10
                                                                                                                                                            )
                                                                                                                                                            * 31
                                                                                                                                                         + var11
                                                                                                                                                   )
                                                                                                                                                   * 31
                                                                                                                                                + var12
                                                                                                                                          )
                                                                                                                                          * 31
                                                                                                                                       + var13
                                                                                                                                 )
                                                                                                                                 * 31
                                                                                                                              + var14
                                                                                                                        )
                                                                                                                        * 31
                                                                                                                     + var15
                                                                                                               )
                                                                                                               * 31
                                                                                                            + var16
                                                                                                      )
                                                                                                      * 31
                                                                                                   + var17
                                                                                             )
                                                                                             * 31
                                                                                          + var18
                                                                                    )
                                                                                    * 31
                                                                                 + var19
                                                                           )
                                                                           * 31
                                                                        + var20
                                                                  )
                                                                  * 31
                                                               + var21
                                                         )
                                                         * 31
                                                      + var22
                                                )
                                                * 31
                                             + var23
                                       )
                                       * 31
                                    + var24
                              )
                              * 31
                           + var25
                     )
                     * 31
                  + var26
            )
            * 31
         + var27;
   }

   public override fun toString(): String {
      val var3: Int = this.backgroundColor;
      val var2: Int = this.borderColor;
      val var1: Int = this.headerColor;
      val var30: java.lang.String = this.headerText;
      val var14: InviteType = this.type;
      val var13: Int = this.acceptLabelBackgroundColor;
      val var26: Int = this.acceptLabelBorderColor;
      val var16: Int = this.acceptLabelColor;
      val var17: java.lang.String = this.acceptLabelText;
      val var18: java.lang.String = this.bodyText;
      val var31: Int = this.bodyTextColor;
      val var7: java.lang.Boolean = this.canBeAccepted;
      val var4: java.lang.String = this.channelIcon;
      val var20: java.lang.String = this.channelName;
      val var8: java.lang.Boolean = this.embedCanBeTapped;
      val var24: java.lang.String = this.memberText;
      val var22: java.lang.String = this.onlineText;
      val var32: Int = this.resolvingGradientEnd;
      val var12: Int = this.resolvingGradientStart;
      val var15: java.lang.Boolean = this.splashHasRadialGradient;
      val var27: Int = this.splashOpacity;
      val var10: java.lang.String = this.splashUrl;
      val var19: java.lang.String = this.inviteSplash;
      val var29: java.lang.String = this.subtitle;
      val var5: Int = this.subtitleColor;
      val var23: Int = this.thumbnailBackgroundColor;
      val var9: Int = this.thumbnailCornerRadius;
      val var25: java.lang.String = this.thumbnailText;
      val var6: java.lang.String = this.thumbnailUrl;
      val var28: Int = this.titleColor;
      val var11: java.lang.String = this.titleText;
      val var21: StringBuilder = new StringBuilder();
      var21.append("GuildInviteEmbedImpl(backgroundColor=");
      var21.append(var3);
      var21.append(", borderColor=");
      var21.append(var2);
      var21.append(", headerColor=");
      var21.append(var1);
      var21.append(", headerText=");
      var21.append(var30);
      var21.append(", type=");
      var21.append(var14);
      var21.append(", acceptLabelBackgroundColor=");
      var21.append(var13);
      var21.append(", acceptLabelBorderColor=");
      var21.append(var26);
      var21.append(", acceptLabelColor=");
      var21.append(var16);
      var21.append(", acceptLabelText=");
      var21.append(var17);
      var21.append(", bodyText=");
      var21.append(var18);
      var21.append(", bodyTextColor=");
      var21.append(var31);
      var21.append(", canBeAccepted=");
      var21.append(var7);
      var21.append(", channelIcon=");
      var21.append(var4);
      var21.append(", channelName=");
      var21.append(var20);
      var21.append(", embedCanBeTapped=");
      var21.append(var8);
      var21.append(", memberText=");
      var21.append(var24);
      var21.append(", onlineText=");
      var21.append(var22);
      var21.append(", resolvingGradientEnd=");
      var21.append(var32);
      var21.append(", resolvingGradientStart=");
      var21.append(var12);
      var21.append(", splashHasRadialGradient=");
      var21.append(var15);
      var21.append(", splashOpacity=");
      var21.append(var27);
      var21.append(", splashUrl=");
      var21.append(var10);
      var21.append(", inviteSplash=");
      var21.append(var19);
      var21.append(", subtitle=");
      var21.append(var29);
      var21.append(", subtitleColor=");
      var21.append(var5);
      var21.append(", thumbnailBackgroundColor=");
      var21.append(var23);
      var21.append(", thumbnailCornerRadius=");
      var21.append(var9);
      var21.append(", thumbnailText=");
      var21.append(var25);
      var21.append(", thumbnailUrl=");
      var21.append(var6);
      var21.append(", titleColor=");
      var21.append(var28);
      var21.append(", titleText=");
      var21.append(var11);
      var21.append(")");
      return var21.toString();
   }

   public object `$serializer` : g0 {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: GuildInviteEmbedImpl.$serializer = new GuildInviteEmbedImpl.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.bridge.codedlinks.GuildInviteEmbedImpl", var0, 31);
         var1.l("backgroundColor", false);
         var1.l("borderColor", false);
         var1.l("headerColor", false);
         var1.l("headerText", false);
         var1.l("type", false);
         var1.l("acceptLabelBackgroundColor", true);
         var1.l("acceptLabelBorderColor", true);
         var1.l("acceptLabelColor", true);
         var1.l("acceptLabelText", true);
         var1.l("bodyText", true);
         var1.l("bodyTextColor", true);
         var1.l("canBeAccepted", true);
         var1.l("channelIcon", true);
         var1.l("channelName", true);
         var1.l("embedCanBeTapped", true);
         var1.l("memberText", true);
         var1.l("onlineText", true);
         var1.l("resolvingGradientEnd", true);
         var1.l("resolvingGradientStart", true);
         var1.l("splashHasRadialGradient", true);
         var1.l("splashOpacity", true);
         var1.l("splashUrl", true);
         var1.l("inviteSplash", true);
         var1.l("subtitle", true);
         var1.l("subtitleColor", true);
         var1.l("thumbnailBackgroundColor", true);
         var1.l("thumbnailCornerRadius", true);
         var1.l("thumbnailText", true);
         var1.l("thumbnailUrl", true);
         var1.l("titleColor", true);
         var1.l("titleText", true);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         val var9: n0 = n0.a;
         val var8: b2 = b2.a;
         val var7: KSerializer = a.u(b2.a);
         val var4: InviteType.Serializer = InviteType.Serializer.INSTANCE;
         val var10: KSerializer = a.u(var9);
         val var11: KSerializer = a.u(var9);
         val var1: KSerializer = a.u(var9);
         val var5: KSerializer = a.u(var8);
         val var3: KSerializer = a.u(var8);
         val var6: KSerializer = a.u(var9);
         val var2: h = h.a;
         return new KSerializer[]{
            var9,
            var9,
            var9,
            var7,
            var4,
            var10,
            var11,
            var1,
            var5,
            var3,
            var6,
            a.u(h.a),
            a.u(var8),
            a.u(var8),
            a.u(var2),
            a.u(var8),
            a.u(var8),
            a.u(var9),
            a.u(var9),
            a.u(var2),
            a.u(var9),
            a.u(var8),
            a.u(var8),
            a.u(var8),
            a.u(var9),
            a.u(var9),
            a.u(var9),
            a.u(var8),
            a.u(var8),
            a.u(var9),
            a.u(var8)
         };
      }

      public open fun deserialize(decoder: Decoder): GuildInviteEmbedImpl {
         q.h(var1, "decoder");
         val var44: SerialDescriptor = this.getDescriptor();
         val var45: c = var1.c(var44);
         val var8: Boolean = var45.y();
         var var2: Int = 0;
         var var32: java.lang.String = null;
         var var3: Int;
         var var4: Int;
         var var5: Int;
         val var6: Int;
         var var16: Int;
         var var17: Int;
         var var19: Any;
         var var21: Any;
         var var22: Any;
         var var23: Int;
         var var24: Any;
         var var25: Any;
         var var26: Int;
         var var27: Any;
         var var28: Any;
         var var29: Any;
         var var30: Int;
         var var31: Any;
         var var33: Int;
         var var34: Any;
         var var35: Any;
         val var36: Any;
         val var37: java.lang.String;
         val var38: Int;
         var var48: Any;
         var var65: Int;
         var var69: Int;
         var var73: Any;
         var var77: Int;
         var var93: Any;
         var var105: Int;
         if (var8) {
            var5 = var45.k(var44, 0);
            var3 = var45.k(var44, 1);
            var2 = var45.k(var44, 2);
            val var9: b2 = b2.a;
            var25 = var45.v(var44, 3, b2.a, null) as java.lang.String;
            var24 = var45.m(var44, 4, InviteType.Serializer.INSTANCE, null) as InviteType;
            var48 = n0.a;
            var38 = var45.v(var44, 5, n0.a, null) as Int;
            var17 = var45.v(var44, 6, (DeserializationStrategy)var48, null) as Int;
            var16 = var45.v(var44, 7, (DeserializationStrategy)var48, null) as Int;
            val var15: java.lang.String = var45.v(var44, 8, var9, null) as java.lang.String;
            var19 = var45.v(var44, 9, var9, null) as java.lang.String;
            var93 = var45.v(var44, 10, (DeserializationStrategy)var48, null) as Int;
            val var10: h = h.a;
            var35 = var45.v(var44, 11, h.a, null) as java.lang.Boolean;
            var29 = var45.v(var44, 12, var9, null) as java.lang.String;
            var31 = var45.v(var44, 13, var9, null) as java.lang.String;
            var28 = var45.v(var44, 14, var10, null) as java.lang.Boolean;
            var21 = var45.v(var44, 15, var9, null) as java.lang.String;
            var36 = var45.v(var44, 16, var9, null) as java.lang.String;
            var73 = var45.v(var44, 17, (DeserializationStrategy)var48, null) as Int;
            var69 = var45.v(var44, 18, (DeserializationStrategy)var48, null) as Int;
            val var59: java.lang.Boolean = var45.v(var44, 19, var10, null) as java.lang.Boolean;
            val var11: Int = var45.v(var44, 20, (DeserializationStrategy)var48, null) as Int;
            val var12: java.lang.String = var45.v(var44, 21, var9, null) as java.lang.String;
            var22 = var45.v(var44, 22, var9, null) as java.lang.String;
            var34 = var45.v(var44, 23, var9, null) as java.lang.String;
            var105 = var45.v(var44, 24, (DeserializationStrategy)var48, null) as Int;
            val var156: Int = var45.v(var44, 25, (DeserializationStrategy)var48, null) as Int;
            var33 = var45.v(var44, 26, (DeserializationStrategy)var48, null) as Int;
            var37 = var45.v(var44, 27, var9, null) as java.lang.String;
            val var39: java.lang.String = var45.v(var44, 28, var9, null) as java.lang.String;
            var48 = var45.v(var44, 29, (DeserializationStrategy)var48, null) as Int;
            val var54: java.lang.String = var45.v(var44, 30, var9, null) as java.lang.String;
            var4 = Integer.MAX_VALUE;
            var6 = var2;
            var27 = var15;
            var77 = (Integer)var93;
            var23 = (Integer)var73;
            var30 = var69;
            var93 = var59;
            var26 = var11;
            var73 = var12;
            var65 = var105;
            var69 = var156;
            var32 = var39;
            var105 = (Integer)var48;
            var48 = var54;
         } else {
            var var52: Boolean = true;
            var5 = 0;
            var4 = 0;
            var3 = 0;
            var48 = null;
            var26 = null;
            var23 = null;
            var24 = null;
            var34 = null;
            var35 = null;
            var33 = null;
            var31 = null;
            var30 = null;
            var29 = null;
            var28 = null;
            var27 = null;
            var25 = null;
            var var63: Any = null;
            var var55: Int = null;
            var var60: Int = null;
            var65 = null;
            var69 = null;
            var73 = null;
            var77 = null;
            var16 = null;
            var17 = null;
            var93 = null;
            var19 = null;
            var105 = null;
            var21 = null;
            var22 = null;

            while (var52) {
               label137: {
                  label89: {
                     label88: {
                        var var7: Int = var45.x(var44);
                        switch (var7) {
                           case -1:
                              var52 = false;
                              break label88;
                           case 0:
                              var5 = var45.k(var44, 0);
                              var2 |= 1;
                              break label88;
                           case 1:
                              var3 = var45.k(var44, 1);
                              var2 |= 2;
                              break label88;
                           case 2:
                              var4 = var45.k(var44, 2);
                              var2 |= 4;
                              break label88;
                           case 3:
                              var25 = var45.v(var44, 3, b2.a, var25) as java.lang.String;
                              var2 |= 8;
                              break label88;
                           case 4:
                              var24 = var16;
                              var16 = var17;
                              var77 = (Integer)var93;
                              var73 = var19;
                              var69 = var105;
                              var65 = (Integer)var21;
                              var60 = var23;
                              var93 = var55;
                              var17 = var45.m(var44, 4, InviteType.Serializer.INSTANCE, var63) as InviteType;
                              var2 |= 16;
                              var55 = (Integer)var24;
                              var63 = var22;
                              var19 = var60;
                              var105 = var65;
                              var21 = var69;
                              var22 = var73;
                              var23 = var77;
                              break label137;
                           case 5:
                              var16 = var17;
                              var77 = (Integer)var93;
                              var73 = var19;
                              var69 = var105;
                              var65 = (Integer)var21;
                              var19 = var60;
                              var93 = var45.v(var44, 5, n0.a, var55) as Int;
                              var2 |= 32;
                              var17 = (Integer)var63;
                              var55 = (Integer)var24;
                              var60 = var23;
                              var63 = var22;
                              var105 = var65;
                              var21 = var69;
                              var22 = var73;
                              var23 = var77;
                              var24 = var16;
                              break label137;
                           case 6:
                              var24 = var16;
                              var16 = var17;
                              var77 = (Integer)var93;
                              var73 = var19;
                              var69 = var105;
                              var105 = var65;
                              var19 = var45.v(var44, 6, n0.a, var60) as Int;
                              var2 |= 64;
                              var17 = (Integer)var63;
                              var93 = var55;
                              var55 = (Integer)var24;
                              var60 = var23;
                              var63 = var22;
                              var65 = (Integer)var21;
                              var21 = var69;
                              var22 = var73;
                              var23 = var77;
                              break label137;
                           case 7:
                              var16 = var17;
                              var77 = (Integer)var93;
                              var73 = var19;
                              var21 = var69;
                              val var119: Int = var45.v(var44, 7, n0.a, var65) as Int;
                              var2 |= 128;
                              var19 = var60;
                              var55 = (Integer)var24;
                              var60 = var23;
                              var63 = var22;
                              var65 = (Integer)var21;
                              var69 = var105;
                              var17 = (Integer)var63;
                              var93 = var55;
                              var105 = var119;
                              var22 = var73;
                              var23 = var77;
                              var24 = var16;
                              break label137;
                           case 8:
                              var24 = var16;
                              var16 = var17;
                              var77 = (Integer)var93;
                              var22 = var73;
                              var21 = var45.v(var44, 8, b2.a, var69) as java.lang.String;
                              var2 |= 256;
                              var55 = (Integer)var24;
                              var60 = var23;
                              var63 = var22;
                              var65 = (Integer)var21;
                              var69 = var105;
                              var73 = var19;
                              var17 = (Integer)var63;
                              var93 = var55;
                              var19 = var60;
                              var105 = var65;
                              var23 = var77;
                              break label137;
                           case 9:
                              var24 = var16;
                              var16 = var17;
                              var23 = var77;
                              var22 = var45.v(var44, 9, b2.a, var73) as java.lang.String;
                              var2 |= 512;
                              var55 = (Integer)var24;
                              var60 = var23;
                              var63 = var22;
                              var65 = (Integer)var21;
                              var69 = var105;
                              var73 = var19;
                              var77 = (Integer)var93;
                              var17 = (Integer)var63;
                              var93 = var55;
                              var19 = var60;
                              var105 = var65;
                              var21 = var69;
                              break label137;
                           case 10:
                              var24 = var16;
                              var23 = var45.v(var44, 10, n0.a, var77) as Int;
                              var2 |= 1024;
                              var55 = (Integer)var24;
                              var60 = var23;
                              var63 = var22;
                              var65 = (Integer)var21;
                              var69 = var105;
                              var73 = var19;
                              var77 = (Integer)var93;
                              var16 = var17;
                              var17 = (Integer)var63;
                              var93 = var55;
                              var19 = var60;
                              var105 = var65;
                              var21 = var69;
                              var22 = var73;
                              break label137;
                           case 11:
                              var24 = var45.v(var44, 11, h.a, var16) as java.lang.Boolean;
                              var2 |= 2048;
                              var55 = (Integer)var24;
                              var60 = var23;
                              var63 = var22;
                              var65 = (Integer)var21;
                              var69 = var105;
                              var73 = var19;
                              var77 = (Integer)var93;
                              var16 = var17;
                              var17 = (Integer)var63;
                              var93 = var55;
                              var19 = var60;
                              var105 = var65;
                              var21 = var69;
                              var22 = var73;
                              var23 = var77;
                              break label137;
                           case 12:
                              val var85: java.lang.String = var45.v(var44, 12, b2.a, var17) as java.lang.String;
                              var2 |= 4096;
                              var55 = (Integer)var24;
                              var60 = var23;
                              var63 = var22;
                              var65 = (Integer)var21;
                              var69 = var105;
                              var73 = var19;
                              var77 = (Integer)var93;
                              var16 = var85;
                              var17 = (Integer)var63;
                              var93 = var55;
                              var19 = var60;
                              var105 = var65;
                              var21 = var69;
                              var22 = var73;
                              var23 = var77;
                              var24 = var16;
                              break label137;
                           case 13:
                              val var262: java.lang.String = var45.v(var44, 13, b2.a, var93) as java.lang.String;
                              var2 |= 8192;
                              var16 = var17;
                              var55 = (Integer)var24;
                              var60 = var23;
                              var63 = var22;
                              var65 = (Integer)var21;
                              var69 = var105;
                              var73 = var19;
                              var77 = var262;
                              var17 = (Integer)var63;
                              var93 = var55;
                              var19 = var60;
                              var105 = var65;
                              var21 = var69;
                              var22 = var73;
                              var23 = var77;
                              var24 = var16;
                              break label137;
                           case 14:
                              val var309: java.lang.Boolean = var45.v(var44, 14, h.a, var19) as java.lang.Boolean;
                              var2 |= 16384;
                              var16 = var17;
                              var77 = (Integer)var93;
                              var55 = (Integer)var24;
                              var60 = var23;
                              var63 = var22;
                              var65 = (Integer)var21;
                              var69 = var105;
                              var73 = var309;
                              var17 = (Integer)var63;
                              var93 = var55;
                              var19 = var60;
                              var105 = var65;
                              var21 = var69;
                              var22 = var73;
                              var23 = var77;
                              var24 = var16;
                              break label137;
                           case 15:
                              val var308: java.lang.String = var45.v(var44, 15, b2.a, var105) as java.lang.String;
                              var2 |= 32768;
                              var16 = var17;
                              var77 = (Integer)var93;
                              var73 = var19;
                              var55 = (Integer)var24;
                              var60 = var23;
                              var63 = var22;
                              var65 = (Integer)var21;
                              var69 = var308;
                              var17 = (Integer)var63;
                              var93 = var55;
                              var19 = var60;
                              var105 = var65;
                              var21 = var69;
                              var22 = var73;
                              var23 = var77;
                              var24 = var16;
                              break label137;
                           case 16:
                              val var307: java.lang.String = var45.v(var44, 16, b2.a, var21) as java.lang.String;
                              var2 |= 65536;
                              var21 = var69;
                              var16 = var17;
                              var77 = (Integer)var93;
                              var73 = var19;
                              var69 = var105;
                              var55 = (Integer)var24;
                              var60 = var23;
                              var63 = var22;
                              var65 = var307;
                              var17 = (Integer)var63;
                              var93 = var55;
                              var19 = var60;
                              var105 = var65;
                              var22 = var73;
                              var23 = var77;
                              var24 = var16;
                              break label137;
                           case 17:
                              val var306: Int = var45.v(var44, 17, n0.a, var22) as Int;
                              var2 |= 131072;
                              var16 = var17;
                              var77 = (Integer)var93;
                              var73 = var19;
                              var69 = var105;
                              var65 = (Integer)var21;
                              var55 = (Integer)var24;
                              var60 = var23;
                              var63 = var306;
                              var17 = (Integer)var63;
                              var93 = var55;
                              var19 = var60;
                              var105 = var65;
                              var21 = var69;
                              var22 = var73;
                              var23 = var77;
                              var24 = var16;
                              break label137;
                           case 18:
                              val var305: Int = var45.v(var44, 18, n0.a, var23) as Int;
                              var2 |= 262144;
                              var16 = var17;
                              var77 = (Integer)var93;
                              var73 = var19;
                              var69 = var105;
                              var65 = (Integer)var21;
                              var63 = var22;
                              var55 = (Integer)var24;
                              var60 = var305;
                              var17 = (Integer)var63;
                              var93 = var55;
                              var19 = var60;
                              var105 = var65;
                              var21 = var69;
                              var22 = var73;
                              var23 = var77;
                              var24 = var16;
                              break label137;
                           case 19:
                              val var304: java.lang.Boolean = var45.v(var44, 19, h.a, var24) as java.lang.Boolean;
                              var2 |= 524288;
                              var16 = var17;
                              var77 = (Integer)var93;
                              var73 = var19;
                              var69 = var105;
                              var65 = (Integer)var21;
                              var63 = var22;
                              var60 = var23;
                              var55 = var304;
                              var17 = (Integer)var63;
                              var93 = var55;
                              var19 = var60;
                              var105 = var65;
                              var21 = var69;
                              var22 = var73;
                              var23 = var77;
                              var24 = var16;
                              break label137;
                           case 20:
                              var26 = var45.v(var44, 20, n0.a, var26) as Int;
                              var7 = 1048576;
                              break;
                           case 21:
                              var27 = var45.v(var44, 21, b2.a, var27) as java.lang.String;
                              var2 |= 2097152;
                              break label89;
                           case 22:
                              var28 = var45.v(var44, 22, b2.a, var28) as java.lang.String;
                              var2 |= 4194304;
                              break label89;
                           case 23:
                              var34 = var45.v(var44, 23, b2.a, var34) as java.lang.String;
                              var2 |= 8388608;
                              break label89;
                           case 24:
                              var29 = var45.v(var44, 24, n0.a, var29) as Int;
                              var2 |= 16777216;
                              break label89;
                           case 25:
                              var30 = var45.v(var44, 25, n0.a, var30) as Int;
                              var2 |= 33554432;
                              break label89;
                           case 26:
                              var48 = var45.v(var44, 26, n0.a, var48) as Int;
                              var7 = 67108864;
                              break;
                           case 27:
                              var32 = var45.v(var44, 27, b2.a, var32) as java.lang.String;
                              var2 |= 134217728;
                              break label89;
                           case 28:
                              var31 = var45.v(var44, 28, b2.a, var31) as java.lang.String;
                              var2 |= 268435456;
                              break label89;
                           case 29:
                              var33 = var45.v(var44, 29, n0.a, var33) as Int;
                              var2 |= 536870912;
                              break label89;
                           case 30:
                              var35 = var45.v(var44, 30, b2.a, var35) as java.lang.String;
                              var2 |= 1073741824;
                              break label89;
                           default:
                              throw new n(var7);
                        }

                        var2 |= var7;
                        break label89;
                     }

                     var16 = var17;
                     var77 = (Integer)var93;
                     var73 = var19;
                     var69 = var105;
                     var65 = (Integer)var21;
                     var63 = var22;
                     var60 = var23;
                     var55 = (Integer)var24;
                     var17 = (Integer)var63;
                     var93 = var55;
                     var19 = var60;
                     var105 = var65;
                     var21 = var69;
                     var22 = var73;
                     var23 = var77;
                     var24 = var16;
                     break label137;
                  }

                  var16 = var17;
                  var77 = (Integer)var93;
                  var73 = var19;
                  var69 = var105;
                  var24 = var16;
                  var23 = var77;
                  var22 = var73;
                  var21 = var69;
                  var105 = var65;
                  var19 = var60;
                  var93 = var55;
                  var17 = (Integer)var63;
                  var65 = (Integer)var21;
                  var63 = var22;
                  var60 = var23;
                  var55 = (Integer)var24;
               }

               var63 = var17;
               var55 = (Integer)var93;
               var60 = (Integer)var19;
               var65 = var105;
               var69 = (Integer)var21;
               var73 = var22;
               var77 = var23;
               var16 = (Integer)var24;
               var23 = var60;
               var24 = var55;
               var17 = var16;
               var93 = var77;
               var19 = var73;
               var105 = var69;
               var21 = var65;
               var22 = var63;
            }

            var37 = var32;
            var32 = (java.lang.String)var31;
            var31 = var93;
            var29 = var17;
            var48 = var35;
            var105 = var33;
            var33 = (Integer)var48;
            var69 = var30;
            var65 = (Integer)var29;
            var22 = var28;
            var73 = var27;
            var93 = var24;
            var30 = var23;
            var23 = (Integer)var22;
            var36 = var21;
            var21 = var105;
            var28 = var19;
            var35 = var16;
            var19 = var73;
            var27 = var69;
            var16 = var65;
            var17 = var60;
            var38 = var55;
            var24 = var63;
            var6 = var4;
            var4 = var2;
         }

         var45.b(var44);
         return new GuildInviteEmbedImpl(
            var4,
            var5,
            var3,
            var6,
            (java.lang.String)var25,
            (InviteType)var24,
            var38,
            var17,
            var16,
            (java.lang.String)var27,
            (java.lang.String)var19,
            var77,
            (java.lang.Boolean)var35,
            (java.lang.String)var29,
            (java.lang.String)var31,
            (java.lang.Boolean)var28,
            (java.lang.String)var21,
            (java.lang.String)var36,
            var23,
            var30,
            (java.lang.Boolean)var93,
            var26,
            (java.lang.String)var73,
            (java.lang.String)var22,
            (java.lang.String)var34,
            var65,
            var69,
            var33,
            var37,
            var32,
            var105,
            (java.lang.String)var48,
            null
         );
      }

      public open fun serialize(encoder: Encoder, value: GuildInviteEmbedImpl) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.c(var3);
         GuildInviteEmbedImpl.write$Self$chat_release(var2, var4, var3);
         var4.b(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return fl.g0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<GuildInviteEmbedImpl> {
         return GuildInviteEmbedImpl.$serializer.INSTANCE;
      }
   }
}

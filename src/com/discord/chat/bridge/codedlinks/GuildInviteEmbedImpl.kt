package com.discord.chat.bridge.codedlinks

import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
import nn.f
import nn.n
import on.a
import qn.b2
import qn.g0
import qn.h
import qn.n0

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
      val var29: Int = Integer.hashCode(this.borderColor);
      val var28: Int = Integer.hashCode(this.headerColor);
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
                                                                                                                                                                                                                                                                              + var29
                                                                                                                                                                                                                                                                        )
                                                                                                                                                                                                                                                                        * 31
                                                                                                                                                                                                                                                                     + var28
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
      val var1: Int = this.backgroundColor;
      val var2: Int = this.borderColor;
      val var3: Int = this.headerColor;
      val var22: java.lang.String = this.headerText;
      val var24: InviteType = this.type;
      val var26: Int = this.acceptLabelBackgroundColor;
      val var20: Int = this.acceptLabelBorderColor;
      val var21: Int = this.acceptLabelColor;
      val var25: java.lang.String = this.acceptLabelText;
      val var31: java.lang.String = this.bodyText;
      val var23: Int = this.bodyTextColor;
      val var5: java.lang.Boolean = this.canBeAccepted;
      val var11: java.lang.String = this.channelIcon;
      val var27: java.lang.String = this.channelName;
      val var8: java.lang.Boolean = this.embedCanBeTapped;
      val var12: java.lang.String = this.memberText;
      val var10: java.lang.String = this.onlineText;
      val var32: Int = this.resolvingGradientEnd;
      val var29: Int = this.resolvingGradientStart;
      val var7: java.lang.Boolean = this.splashHasRadialGradient;
      val var18: Int = this.splashOpacity;
      val var9: java.lang.String = this.splashUrl;
      val var28: java.lang.String = this.inviteSplash;
      val var13: java.lang.String = this.subtitle;
      val var19: Int = this.subtitleColor;
      val var15: Int = this.thumbnailBackgroundColor;
      val var4: Int = this.thumbnailCornerRadius;
      val var17: java.lang.String = this.thumbnailText;
      val var14: java.lang.String = this.thumbnailUrl;
      val var30: Int = this.titleColor;
      val var16: java.lang.String = this.titleText;
      val var6: StringBuilder = new StringBuilder();
      var6.append("GuildInviteEmbedImpl(backgroundColor=");
      var6.append(var1);
      var6.append(", borderColor=");
      var6.append(var2);
      var6.append(", headerColor=");
      var6.append(var3);
      var6.append(", headerText=");
      var6.append(var22);
      var6.append(", type=");
      var6.append(var24);
      var6.append(", acceptLabelBackgroundColor=");
      var6.append(var26);
      var6.append(", acceptLabelBorderColor=");
      var6.append(var20);
      var6.append(", acceptLabelColor=");
      var6.append(var21);
      var6.append(", acceptLabelText=");
      var6.append(var25);
      var6.append(", bodyText=");
      var6.append(var31);
      var6.append(", bodyTextColor=");
      var6.append(var23);
      var6.append(", canBeAccepted=");
      var6.append(var5);
      var6.append(", channelIcon=");
      var6.append(var11);
      var6.append(", channelName=");
      var6.append(var27);
      var6.append(", embedCanBeTapped=");
      var6.append(var8);
      var6.append(", memberText=");
      var6.append(var12);
      var6.append(", onlineText=");
      var6.append(var10);
      var6.append(", resolvingGradientEnd=");
      var6.append(var32);
      var6.append(", resolvingGradientStart=");
      var6.append(var29);
      var6.append(", splashHasRadialGradient=");
      var6.append(var7);
      var6.append(", splashOpacity=");
      var6.append(var18);
      var6.append(", splashUrl=");
      var6.append(var9);
      var6.append(", inviteSplash=");
      var6.append(var28);
      var6.append(", subtitle=");
      var6.append(var13);
      var6.append(", subtitleColor=");
      var6.append(var19);
      var6.append(", thumbnailBackgroundColor=");
      var6.append(var15);
      var6.append(", thumbnailCornerRadius=");
      var6.append(var4);
      var6.append(", thumbnailText=");
      var6.append(var17);
      var6.append(", thumbnailUrl=");
      var6.append(var14);
      var6.append(", titleColor=");
      var6.append(var30);
      var6.append(", titleText=");
      var6.append(var16);
      var6.append(")");
      return var6.toString();
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
         var1.c("backgroundColor", false);
         var1.c("borderColor", false);
         var1.c("headerColor", false);
         var1.c("headerText", false);
         var1.c("type", false);
         var1.c("acceptLabelBackgroundColor", true);
         var1.c("acceptLabelBorderColor", true);
         var1.c("acceptLabelColor", true);
         var1.c("acceptLabelText", true);
         var1.c("bodyText", true);
         var1.c("bodyTextColor", true);
         var1.c("canBeAccepted", true);
         var1.c("channelIcon", true);
         var1.c("channelName", true);
         var1.c("embedCanBeTapped", true);
         var1.c("memberText", true);
         var1.c("onlineText", true);
         var1.c("resolvingGradientEnd", true);
         var1.c("resolvingGradientStart", true);
         var1.c("splashHasRadialGradient", true);
         var1.c("splashOpacity", true);
         var1.c("splashUrl", true);
         var1.c("inviteSplash", true);
         var1.c("subtitle", true);
         var1.c("subtitleColor", true);
         var1.c("thumbnailBackgroundColor", true);
         var1.c("thumbnailCornerRadius", true);
         var1.c("thumbnailText", true);
         var1.c("thumbnailUrl", true);
         var1.c("titleColor", true);
         var1.c("titleText", true);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         val var3: n0 = n0.a;
         val var7: b2 = b2.a;
         val var4: KSerializer = a.u(b2.a);
         val var5: InviteType.Serializer = InviteType.Serializer.INSTANCE;
         val var10: KSerializer = a.u(var3);
         val var9: KSerializer = a.u(var3);
         val var2: KSerializer = a.u(var3);
         val var1: KSerializer = a.u(var7);
         val var11: KSerializer = a.u(var7);
         val var8: KSerializer = a.u(var3);
         val var6: h = h.a;
         return new KSerializer[]{
            var3,
            var3,
            var3,
            var4,
            var5,
            var10,
            var9,
            var2,
            var1,
            var11,
            var8,
            a.u(h.a),
            a.u(var7),
            a.u(var7),
            a.u(var6),
            a.u(var7),
            a.u(var7),
            a.u(var3),
            a.u(var3),
            a.u(var6),
            a.u(var3),
            a.u(var7),
            a.u(var7),
            a.u(var7),
            a.u(var3),
            a.u(var3),
            a.u(var3),
            a.u(var7),
            a.u(var7),
            a.u(var3),
            a.u(var7)
         };
      }

      public open fun deserialize(decoder: Decoder): GuildInviteEmbedImpl {
         q.h(var1, "decoder");
         val var44: SerialDescriptor = this.getDescriptor();
         val var45: c = var1.b(var44);
         val var8: Boolean = var45.p();
         var var2: Int = 0;
         var var32: java.lang.String = null;
         var var4: Int;
         var var5: Int;
         val var6: Int;
         var var14: Int;
         var var15: Int;
         var var16: Int;
         var var17: Int;
         var var18: java.lang.String;
         var var19: Any;
         var var20: Any;
         var var21: Int;
         var var22: Any;
         var var23: Int;
         var var24: Any;
         var var25: Any;
         var var26: Int;
         var var27: Any;
         var var28: Int;
         var var29: Any;
         var var30: Any;
         var var31: Any;
         var var34: Any;
         var var35: Any;
         val var36: Int;
         val var37: Any;
         val var38: Int;
         val var39: Any;
         var var51: Int;
         var var67: Any;
         var var71: Int;
         var var151: Any;
         if (var8) {
            var5 = var45.i(var44, 0);
            var51 = var45.i(var44, 1);
            var2 = var45.i(var44, 2);
            val var9: b2 = b2.a;
            var25 = var45.n(var44, 3, b2.a, null) as java.lang.String;
            var39 = var45.y(var44, 4, InviteType.Serializer.INSTANCE, null) as InviteType;
            val var46: n0 = n0.a;
            var15 = var45.n(var44, 5, n0.a, null) as Int;
            var17 = var45.n(var44, 6, var46, null) as Int;
            var38 = var45.n(var44, 7, var46, null) as Int;
            var30 = var45.n(var44, 8, var9, null) as java.lang.String;
            var27 = var45.n(var44, 9, var9, null) as java.lang.String;
            var16 = var45.n(var44, 10, var46, null) as Int;
            val var10: h = h.a;
            var29 = var45.n(var44, 11, h.a, null) as java.lang.Boolean;
            var20 = var45.n(var44, 12, var9, null) as java.lang.String;
            var24 = var45.n(var44, 13, var9, null) as java.lang.String;
            var32 = var45.n(var44, 14, var10, null) as java.lang.Boolean;
            var35 = var45.n(var44, 15, var9, null) as java.lang.String;
            var22 = var45.n(var44, 16, var9, null) as java.lang.String;
            var14 = var45.n(var44, 17, var46, null) as Int;
            var71 = var45.n(var44, 18, var46, null) as Int;
            val var61: java.lang.Boolean = var45.n(var44, 19, var10, null) as java.lang.Boolean;
            val var11: Int = var45.n(var44, 20, var46, null) as Int;
            var67 = var45.n(var44, 21, var9, null) as java.lang.String;
            var37 = var45.n(var44, 22, var9, null) as java.lang.String;
            var34 = var45.n(var44, 23, var9, null) as java.lang.String;
            var28 = var45.n(var44, 24, var46, null) as Int;
            var23 = var45.n(var44, 25, var46, null) as Int;
            var36 = var45.n(var44, 26, var46, null) as Int;
            var18 = var45.n(var44, 27, var9, null) as java.lang.String;
            var151 = var45.n(var44, 28, var9, null) as java.lang.String;
            val var47: Int = var45.n(var44, 29, var46, null) as Int;
            val var56: java.lang.String = var45.n(var44, 30, var9, null) as java.lang.String;
            var4 = Integer.MAX_VALUE;
            var6 = var51;
            var51 = var2;
            var21 = var71;
            var31 = var61;
            var26 = var11;
            var19 = var67;
            var67 = var151;
            var71 = var47;
            var151 = var56;
         } else {
            var var54: Boolean = true;
            var5 = 0;
            var4 = 0;
            var51 = 0;
            var var48: Int = null;
            var26 = null;
            var23 = null;
            var24 = null;
            var34 = null;
            var35 = null;
            var151 = null;
            var31 = null;
            var30 = null;
            var29 = null;
            var28 = null;
            var27 = null;
            var25 = null;
            var var65: Any = null;
            var var57: Int = null;
            var var62: Int = null;
            var67 = null;
            var71 = null;
            var14 = null;
            var15 = null;
            var16 = null;
            var17 = null;
            var18 = null;
            var19 = null;
            var20 = null;
            var21 = null;
            var22 = null;

            while (var54) {
               label137: {
                  label89: {
                     label88: {
                        var var7: Int = var45.o(var44);
                        switch (var7) {
                           case -1:
                              var54 = false;
                              break label88;
                           case 0:
                              var5 = var45.i(var44, 0);
                              var2 |= 1;
                              break label88;
                           case 1:
                              var51 = var45.i(var44, 1);
                              var2 |= 2;
                              break label88;
                           case 2:
                              var4 = var45.i(var44, 2);
                              var2 |= 4;
                              break label88;
                           case 3:
                              var25 = var45.n(var44, 3, b2.a, var25) as java.lang.String;
                              var2 |= 8;
                              break label88;
                           case 4:
                              var16 = var17;
                              var15 = var18;
                              var14 = (Integer)var19;
                              var71 = (Integer)var20;
                              var67 = var21;
                              var62 = var23;
                              var94 = var57;
                              var17 = var45.y(var44, 4, InviteType.Serializer.INSTANCE, var65) as InviteType;
                              var2 |= 16;
                              var57 = (Integer)var24;
                              var65 = var22;
                              var19 = var62;
                              var20 = var67;
                              var21 = var71;
                              var22 = var14;
                              var23 = var15;
                              var24 = var16;
                              break label137;
                           case 5:
                              var24 = var16;
                              var16 = var17;
                              var15 = var18;
                              var14 = (Integer)var19;
                              var71 = (Integer)var20;
                              var67 = var21;
                              var19 = var62;
                              var94 = var45.n(var44, 5, n0.a, var57) as Int;
                              var2 |= 32;
                              var17 = (Integer)var65;
                              var57 = (Integer)var24;
                              var62 = var23;
                              var65 = var22;
                              var20 = var67;
                              var21 = var71;
                              var22 = var14;
                              var23 = var15;
                              break label137;
                           case 6:
                              var24 = var16;
                              var16 = var17;
                              var15 = var18;
                              var14 = (Integer)var19;
                              var71 = (Integer)var20;
                              var20 = var67;
                              var19 = var45.n(var44, 6, n0.a, var62) as Int;
                              var2 |= 64;
                              var17 = (Integer)var65;
                              var94 = var57;
                              var57 = (Integer)var24;
                              var62 = var23;
                              var65 = var22;
                              var67 = var21;
                              var21 = var71;
                              var22 = var14;
                              var23 = var15;
                              break label137;
                           case 7:
                              var24 = var16;
                              var16 = var17;
                              var15 = var18;
                              var14 = (Integer)var19;
                              var21 = var71;
                              val var119: Int = var45.n(var44, 7, n0.a, var67) as Int;
                              var2 |= 128;
                              var57 = (Integer)var24;
                              var62 = var23;
                              var65 = var22;
                              var67 = var21;
                              var71 = (Integer)var20;
                              var17 = (Integer)var65;
                              var94 = var57;
                              var19 = var62;
                              var20 = var119;
                              var22 = var14;
                              var23 = var15;
                              break label137;
                           case 8:
                              var16 = var17;
                              var15 = var18;
                              var22 = var14;
                              var21 = var45.n(var44, 8, b2.a, var71) as java.lang.String;
                              var2 |= 256;
                              var57 = (Integer)var24;
                              var62 = var23;
                              var65 = var22;
                              var67 = var21;
                              var71 = (Integer)var20;
                              var14 = (Integer)var19;
                              var17 = (Integer)var65;
                              var94 = var57;
                              var19 = var62;
                              var20 = var67;
                              var23 = var15;
                              var24 = var16;
                              break label137;
                           case 9:
                              var24 = var16;
                              var16 = var17;
                              var23 = var15;
                              var22 = var45.n(var44, 9, b2.a, var14) as java.lang.String;
                              var2 |= 512;
                              var57 = (Integer)var24;
                              var62 = var23;
                              var65 = var22;
                              var67 = var21;
                              var71 = (Integer)var20;
                              var14 = (Integer)var19;
                              var15 = var18;
                              var17 = (Integer)var65;
                              var94 = var57;
                              var19 = var62;
                              var20 = var67;
                              var21 = var71;
                              break label137;
                           case 10:
                              var24 = var16;
                              var23 = var45.n(var44, 10, n0.a, var15) as Int;
                              var2 |= 1024;
                              var57 = (Integer)var24;
                              var62 = var23;
                              var65 = var22;
                              var67 = var21;
                              var71 = (Integer)var20;
                              var14 = (Integer)var19;
                              var15 = var18;
                              var16 = var17;
                              var17 = (Integer)var65;
                              var94 = var57;
                              var19 = var62;
                              var20 = var67;
                              var21 = var71;
                              var22 = var14;
                              break label137;
                           case 11:
                              var24 = var45.n(var44, 11, h.a, var16) as java.lang.Boolean;
                              var2 |= 2048;
                              var23 = var15;
                              var57 = (Integer)var24;
                              var62 = var23;
                              var65 = var22;
                              var67 = var21;
                              var71 = (Integer)var20;
                              var14 = (Integer)var19;
                              var15 = var18;
                              var16 = var17;
                              var17 = (Integer)var65;
                              var94 = var57;
                              var19 = var62;
                              var20 = var67;
                              var21 = var71;
                              var22 = var14;
                              break label137;
                           case 12:
                              val var86: java.lang.String = var45.n(var44, 12, b2.a, var17) as java.lang.String;
                              var2 |= 4096;
                              var57 = (Integer)var24;
                              var62 = var23;
                              var65 = var22;
                              var67 = var21;
                              var71 = (Integer)var20;
                              var14 = (Integer)var19;
                              var15 = var18;
                              var16 = var86;
                              var17 = (Integer)var65;
                              var94 = var57;
                              var19 = var62;
                              var20 = var67;
                              var21 = var71;
                              var22 = var14;
                              var23 = var15;
                              var24 = var16;
                              break label137;
                           case 13:
                              val var307: java.lang.String = var45.n(var44, 13, b2.a, var18) as java.lang.String;
                              var2 |= 8192;
                              var94 = var57;
                              var16 = var17;
                              var57 = (Integer)var24;
                              var62 = var23;
                              var65 = var22;
                              var67 = var21;
                              var71 = (Integer)var20;
                              var14 = (Integer)var19;
                              var15 = var307;
                              var17 = (Integer)var65;
                              var19 = var62;
                              var20 = var67;
                              var21 = var71;
                              var22 = var14;
                              var23 = var15;
                              var24 = var16;
                              break label137;
                           case 14:
                              val var306: java.lang.Boolean = var45.n(var44, 14, h.a, var19) as java.lang.Boolean;
                              var2 |= 16384;
                              var16 = var17;
                              var15 = var18;
                              var57 = (Integer)var24;
                              var62 = var23;
                              var65 = var22;
                              var67 = var21;
                              var71 = (Integer)var20;
                              var14 = var306;
                              var17 = (Integer)var65;
                              var94 = var57;
                              var19 = var62;
                              var20 = var67;
                              var21 = var71;
                              var22 = var14;
                              var23 = var15;
                              var24 = var16;
                              break label137;
                           case 15:
                              val var305: java.lang.String = var45.n(var44, 15, b2.a, var20) as java.lang.String;
                              var2 |= 32768;
                              var16 = var17;
                              var15 = var18;
                              var14 = (Integer)var19;
                              var57 = (Integer)var24;
                              var62 = var23;
                              var65 = var22;
                              var67 = var21;
                              var71 = var305;
                              var17 = (Integer)var65;
                              var94 = var57;
                              var19 = var62;
                              var20 = var67;
                              var21 = var71;
                              var22 = var14;
                              var23 = var15;
                              var24 = var16;
                              break label137;
                           case 16:
                              val var304: java.lang.String = var45.n(var44, 16, b2.a, var21) as java.lang.String;
                              var2 |= 65536;
                              var23 = var15;
                              var24 = var16;
                              var16 = var17;
                              var15 = var18;
                              var14 = (Integer)var19;
                              var71 = (Integer)var20;
                              var57 = (Integer)var24;
                              var62 = var23;
                              var65 = var22;
                              var67 = var304;
                              var17 = (Integer)var65;
                              var94 = var57;
                              var19 = var62;
                              var20 = var67;
                              var21 = var71;
                              var22 = var14;
                              break label137;
                           case 17:
                              val var303: Int = var45.n(var44, 17, n0.a, var22) as Int;
                              var2 |= 131072;
                              var23 = var15;
                              var16 = var17;
                              var15 = var18;
                              var14 = (Integer)var19;
                              var71 = (Integer)var20;
                              var67 = var21;
                              var57 = (Integer)var24;
                              var62 = var23;
                              var65 = var303;
                              var17 = (Integer)var65;
                              var94 = var57;
                              var19 = var62;
                              var20 = var67;
                              var21 = var71;
                              var22 = var14;
                              var24 = var16;
                              break label137;
                           case 18:
                              val var302: Int = var45.n(var44, 18, n0.a, var23) as Int;
                              var2 |= 262144;
                              var16 = var17;
                              var15 = var18;
                              var14 = (Integer)var19;
                              var71 = (Integer)var20;
                              var67 = var21;
                              var65 = var22;
                              var57 = (Integer)var24;
                              var62 = var302;
                              var17 = (Integer)var65;
                              var94 = var57;
                              var19 = var62;
                              var20 = var67;
                              var21 = var71;
                              var22 = var14;
                              var23 = var15;
                              var24 = var16;
                              break label137;
                           case 19:
                              val var301: java.lang.Boolean = var45.n(var44, 19, h.a, var24) as java.lang.Boolean;
                              var2 |= 524288;
                              var24 = var16;
                              var16 = var17;
                              var15 = var18;
                              var14 = (Integer)var19;
                              var71 = (Integer)var20;
                              var67 = var21;
                              var65 = var22;
                              var62 = var23;
                              var57 = var301;
                              var17 = (Integer)var65;
                              var94 = var57;
                              var19 = var62;
                              var20 = var67;
                              var21 = var71;
                              var22 = var14;
                              var23 = var15;
                              break label137;
                           case 20:
                              var26 = var45.n(var44, 20, n0.a, var26) as Int;
                              var7 = 1048576;
                              break;
                           case 21:
                              var27 = var45.n(var44, 21, b2.a, var27) as java.lang.String;
                              var2 |= 2097152;
                              break label89;
                           case 22:
                              var28 = var45.n(var44, 22, b2.a, var28) as java.lang.String;
                              var2 |= 4194304;
                              break label89;
                           case 23:
                              var34 = var45.n(var44, 23, b2.a, var34) as java.lang.String;
                              var2 |= 8388608;
                              break label89;
                           case 24:
                              var29 = var45.n(var44, 24, n0.a, var29) as Int;
                              var2 |= 16777216;
                              break label89;
                           case 25:
                              var30 = var45.n(var44, 25, n0.a, var30) as Int;
                              var2 |= 33554432;
                              break label89;
                           case 26:
                              var48 = var45.n(var44, 26, n0.a, var48) as Int;
                              var7 = 67108864;
                              break;
                           case 27:
                              var32 = var45.n(var44, 27, b2.a, var32) as java.lang.String;
                              var2 |= 134217728;
                              break label89;
                           case 28:
                              var31 = var45.n(var44, 28, b2.a, var31) as java.lang.String;
                              var2 |= 268435456;
                              break label89;
                           case 29:
                              var151 = var45.n(var44, 29, n0.a, var151) as Int;
                              var2 |= 536870912;
                              break label89;
                           case 30:
                              var35 = var45.n(var44, 30, b2.a, var35) as java.lang.String;
                              var2 |= 1073741824;
                              break label89;
                           default:
                              throw new n(var7);
                        }

                        var2 |= var7;
                        break label89;
                     }

                     var16 = var17;
                     var15 = var18;
                     var14 = (Integer)var19;
                     var71 = (Integer)var20;
                     var67 = var21;
                     var65 = var22;
                     var62 = var23;
                     var57 = (Integer)var24;
                     var17 = (Integer)var65;
                     var94 = var57;
                     var19 = var62;
                     var20 = var67;
                     var21 = var71;
                     var22 = var14;
                     var23 = var15;
                     var24 = var16;
                     break label137;
                  }

                  var16 = var17;
                  var15 = var18;
                  var14 = (Integer)var19;
                  var71 = (Integer)var20;
                  var24 = var16;
                  var23 = var15;
                  var22 = var14;
                  var21 = var71;
                  var20 = var67;
                  var19 = var62;
                  var94 = var57;
                  var17 = (Integer)var65;
                  var67 = var21;
                  var65 = var22;
                  var62 = var23;
                  var57 = (Integer)var24;
               }

               var65 = var17;
               var57 = var94;
               var62 = (Integer)var19;
               var67 = var20;
               var71 = var21;
               var14 = (Integer)var22;
               var15 = var23;
               var16 = (Integer)var24;
               var23 = var62;
               var24 = var57;
               var17 = var16;
               var18 = var15;
               var19 = var14;
               var20 = var71;
               var21 = (Integer)var67;
               var22 = var65;
            }

            var37 = var28;
            var31 = var24;
            var32 = (java.lang.String)var19;
            var24 = var18;
            var6 = var51;
            var151 = var35;
            var71 = (Integer)var151;
            var67 = var31;
            var18 = var32;
            var36 = var48;
            var23 = (Integer)var30;
            var28 = (Integer)var29;
            var19 = var27;
            var21 = var23;
            var14 = (Integer)var22;
            var22 = var21;
            var35 = var20;
            var20 = var17;
            var29 = var16;
            var16 = var15;
            var27 = var14;
            var30 = var71;
            var38 = (Integer)var67;
            var17 = var62;
            var15 = var57;
            var39 = var65;
            var51 = var4;
            var4 = var2;
         }

         var45.c(var44);
         return new GuildInviteEmbedImpl(
            var4,
            var5,
            var6,
            var51,
            (java.lang.String)var25,
            (InviteType)var39,
            var15,
            var17,
            var38,
            (java.lang.String)var30,
            (java.lang.String)var27,
            var16,
            (java.lang.Boolean)var29,
            (java.lang.String)var20,
            (java.lang.String)var24,
            var32,
            (java.lang.String)var35,
            (java.lang.String)var22,
            var14,
            var21,
            (java.lang.Boolean)var31,
            var26,
            (java.lang.String)var19,
            (java.lang.String)var37,
            (java.lang.String)var34,
            var28,
            var23,
            var36,
            var18,
            (java.lang.String)var67,
            var71,
            (java.lang.String)var151,
            null
         );
      }

      public open fun serialize(encoder: Encoder, value: GuildInviteEmbedImpl) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         GuildInviteEmbedImpl.write$Self$chat_release(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return qn.g0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<GuildInviteEmbedImpl> {
         return GuildInviteEmbedImpl.$serializer.INSTANCE;
      }
   }
}

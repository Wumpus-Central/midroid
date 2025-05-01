package com.discord.chat.bridge.codedlinks

import aa.f
import aa.n
import ba.a
import da.C0
import da.G
import da.N
import da.h
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
      acceptLabelBackgroundColor: Int? = ...,
      acceptLabelBorderColor: Int? = ...,
      acceptLabelColor: Int? = ...,
      acceptLabelText: String? = ...,
      bodyText: String? = ...,
      bodyTextColor: Int? = ...,
      canBeAccepted: Boolean? = ...,
      channelIcon: String? = ...,
      channelName: String? = ...,
      embedCanBeTapped: Boolean? = ...,
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
      titleText: String? = ...,
      badgeIconUrl: String? = ...
   )
   : CodedLinkEmbed,
   GuildInviteEmbed {
   public open val acceptLabelBackgroundColor: Int?
   public open val acceptLabelBorderColor: Int?
   public open val acceptLabelColor: Int?
   public open val acceptLabelText: String?
   public open val backgroundColor: Int
   public open val badgeIconUrl: String?
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
      this.badgeIconUrl = var32;
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

   public operator fun component32(): String? {
      return this.badgeIconUrl;
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
      backgroundColor: Int = ...,
      borderColor: Int = ...,
      headerColor: Int = ...,
      headerText: String? = ...,
      type: InviteType = ...,
      acceptLabelBackgroundColor: Int? = ...,
      acceptLabelBorderColor: Int? = ...,
      acceptLabelColor: Int? = ...,
      acceptLabelText: String? = ...,
      bodyText: String? = ...,
      bodyTextColor: Int? = ...,
      canBeAccepted: Boolean? = ...,
      channelIcon: String? = ...,
      channelName: String? = ...,
      embedCanBeTapped: Boolean? = ...,
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
      titleText: String? = ...,
      badgeIconUrl: String? = ...
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
         var31,
         var32
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
         } else if (!q.c(this.titleText, var1.titleText)) {
            return false;
         } else {
            return q.c(this.badgeIconUrl, var1.badgeIconUrl);
         }
      }
   }

   public override fun hashCode(): Int {
      val var31: Int = Integer.hashCode(this.backgroundColor);
      val var29: Int = Integer.hashCode(this.borderColor);
      val var30: Int = Integer.hashCode(this.headerColor);
      var var28: Int = 0;
      val var1: Int;
      if (this.headerText == null) {
         var1 = 0;
      } else {
         var1 = this.headerText.hashCode();
      }

      val var32: Int = this.type.hashCode();
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

      val var27: Int;
      if (this.titleText == null) {
         var27 = 0;
      } else {
         var27 = this.titleText.hashCode();
      }

      if (this.badgeIconUrl != null) {
         var28 = this.badgeIconUrl.hashCode();
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
                                                                                                                                                                                                                                                                           (
                                                                                                                                                                                                                                                                                    var31
                                                                                                                                                                                                                                                                                          * 31
                                                                                                                                                                                                                                                                                       + var29
                                                                                                                                                                                                                                                                                 )
                                                                                                                                                                                                                                                                                 * 31
                                                                                                                                                                                                                                                                              + var30
                                                                                                                                                                                                                                                                        )
                                                                                                                                                                                                                                                                        * 31
                                                                                                                                                                                                                                                                     + var1
                                                                                                                                                                                                                                                               )
                                                                                                                                                                                                                                                               * 31
                                                                                                                                                                                                                                                            + var32
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
                  + var27
            )
            * 31
         + var28;
   }

   public override fun toString(): String {
      val var3: Int = this.backgroundColor;
      val var1: Int = this.borderColor;
      val var2: Int = this.headerColor;
      val var16: java.lang.String = this.headerText;
      val var10: InviteType = this.type;
      val var29: Int = this.acceptLabelBackgroundColor;
      val var27: Int = this.acceptLabelBorderColor;
      val var11: Int = this.acceptLabelColor;
      val var18: java.lang.String = this.acceptLabelText;
      val var17: java.lang.String = this.bodyText;
      val var12: Int = this.bodyTextColor;
      val var24: java.lang.Boolean = this.canBeAccepted;
      val var28: java.lang.String = this.channelIcon;
      val var7: java.lang.String = this.channelName;
      val var6: java.lang.Boolean = this.embedCanBeTapped;
      val var5: java.lang.String = this.memberText;
      val var30: java.lang.String = this.onlineText;
      val var25: Int = this.resolvingGradientEnd;
      val var19: Int = this.resolvingGradientStart;
      val var4: java.lang.Boolean = this.splashHasRadialGradient;
      val var13: Int = this.splashOpacity;
      val var20: java.lang.String = this.splashUrl;
      val var21: java.lang.String = this.inviteSplash;
      val var33: java.lang.String = this.subtitle;
      val var31: Int = this.subtitleColor;
      val var22: Int = this.thumbnailBackgroundColor;
      val var9: Int = this.thumbnailCornerRadius;
      val var23: java.lang.String = this.thumbnailText;
      val var14: java.lang.String = this.thumbnailUrl;
      val var26: Int = this.titleColor;
      val var32: java.lang.String = this.titleText;
      val var15: java.lang.String = this.badgeIconUrl;
      val var8: StringBuilder = new StringBuilder();
      var8.append("GuildInviteEmbedImpl(backgroundColor=");
      var8.append(var3);
      var8.append(", borderColor=");
      var8.append(var1);
      var8.append(", headerColor=");
      var8.append(var2);
      var8.append(", headerText=");
      var8.append(var16);
      var8.append(", type=");
      var8.append(var10);
      var8.append(", acceptLabelBackgroundColor=");
      var8.append(var29);
      var8.append(", acceptLabelBorderColor=");
      var8.append(var27);
      var8.append(", acceptLabelColor=");
      var8.append(var11);
      var8.append(", acceptLabelText=");
      var8.append(var18);
      var8.append(", bodyText=");
      var8.append(var17);
      var8.append(", bodyTextColor=");
      var8.append(var12);
      var8.append(", canBeAccepted=");
      var8.append(var24);
      var8.append(", channelIcon=");
      var8.append(var28);
      var8.append(", channelName=");
      var8.append(var7);
      var8.append(", embedCanBeTapped=");
      var8.append(var6);
      var8.append(", memberText=");
      var8.append(var5);
      var8.append(", onlineText=");
      var8.append(var30);
      var8.append(", resolvingGradientEnd=");
      var8.append(var25);
      var8.append(", resolvingGradientStart=");
      var8.append(var19);
      var8.append(", splashHasRadialGradient=");
      var8.append(var4);
      var8.append(", splashOpacity=");
      var8.append(var13);
      var8.append(", splashUrl=");
      var8.append(var20);
      var8.append(", inviteSplash=");
      var8.append(var21);
      var8.append(", subtitle=");
      var8.append(var33);
      var8.append(", subtitleColor=");
      var8.append(var31);
      var8.append(", thumbnailBackgroundColor=");
      var8.append(var22);
      var8.append(", thumbnailCornerRadius=");
      var8.append(var9);
      var8.append(", thumbnailText=");
      var8.append(var23);
      var8.append(", thumbnailUrl=");
      var8.append(var14);
      var8.append(", titleColor=");
      var8.append(var26);
      var8.append(", titleText=");
      var8.append(var32);
      var8.append(", badgeIconUrl=");
      var8.append(var15);
      var8.append(")");
      return var8.toString();
   }

   public object `$serializer` : G {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: GuildInviteEmbedImpl.$serializer = new GuildInviteEmbedImpl.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.bridge.codedlinks.GuildInviteEmbedImpl", var0, 32);
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
         var1.l("badgeIconUrl", true);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         val var7: N = N.a;
         val var29: C0 = C0.a;
         val var11: KSerializer = a.u(C0.a);
         val var4: KSerializer = a.u(var7);
         val var2: KSerializer = a.u(var7);
         val var10: KSerializer = a.u(var7);
         val var14: KSerializer = a.u(var29);
         val var5: KSerializer = a.u(var29);
         val var8: KSerializer = a.u(var7);
         val var17: h = h.a;
         return new KSerializer[]{
            var7,
            var7,
            var7,
            var11,
            InviteType.Serializer.INSTANCE,
            var4,
            var2,
            var10,
            var14,
            var5,
            var8,
            a.u(h.a),
            a.u(var29),
            a.u(var29),
            a.u(var17),
            a.u(var29),
            a.u(var29),
            a.u(var7),
            a.u(var7),
            a.u(var17),
            a.u(var7),
            a.u(var29),
            a.u(var29),
            a.u(var29),
            a.u(var7),
            a.u(var7),
            a.u(var7),
            a.u(var29),
            a.u(var29),
            a.u(var7),
            a.u(var29),
            a.u(var29)
         };
      }

      public open fun deserialize(decoder: Decoder): GuildInviteEmbedImpl {
         q.h(var1, "decoder");
         val var47: SerialDescriptor = this.getDescriptor();
         val var48: c = var1.c(var47);
         val var8: Boolean = var48.y();
         var var2: Int = 0;
         var var34: Int = null;
         var var3: Int;
         var var4: Int;
         val var5: Int;
         var var6: Int;
         var var16: Any;
         var var22: java.lang.String;
         var var23: java.lang.String;
         var var24: Any;
         var var25: Any;
         var var26: Any;
         var var27: java.lang.String;
         var var28: Any;
         var var29: java.lang.String;
         var var30: Any;
         var var32: Any;
         var var33: Any;
         var var35: java.lang.String;
         var var36: java.lang.String;
         var var37: Any;
         var var38: java.lang.String;
         var var39: java.lang.String;
         var var40: java.lang.String;
         var var41: java.lang.String;
         val var42: Int;
         var var43: Any;
         var var44: java.lang.String;
         var var61: Any;
         var var68: java.lang.String;
         var var99: java.lang.String;
         val var103: java.lang.Boolean;
         var var108: Any;
         var var139: Any;
         val var148: java.lang.String;
         if (var8) {
            var3 = var48.k(var47, 0);
            var5 = var48.k(var47, 1);
            var2 = var48.k(var47, 2);
            val var49: C0 = C0.a;
            var22 = var48.v(var47, 3, C0.a, null) as java.lang.String;
            var24 = var48.m(var47, 4, InviteType.Serializer.INSTANCE, null) as InviteType;
            val var9: N = N.a;
            var43 = var48.v(var47, 5, N.a, null) as Int;
            var25 = var48.v(var47, 6, var9, null) as Int;
            var26 = var48.v(var47, 7, var9, null) as Int;
            var23 = var48.v(var47, 8, var49, null) as java.lang.String;
            var108 = var48.v(var47, 9, var49, null) as java.lang.String;
            val var19: Int = var48.v(var47, 10, var9, null) as Int;
            var61 = h.a;
            var30 = var48.v(var47, 11, h.a, null) as java.lang.Boolean;
            var35 = var48.v(var47, 12, var49, null) as java.lang.String;
            var27 = var48.v(var47, 13, var49, null) as java.lang.String;
            var32 = var48.v(var47, 14, (DeserializationStrategy)var61, null) as java.lang.Boolean;
            var41 = var48.v(var47, 15, var49, null) as java.lang.String;
            var148 = var48.v(var47, 16, var49, null) as java.lang.String;
            var139 = var48.v(var47, 17, var9, null) as Int;
            var37 = var48.v(var47, 18, var9, null) as Int;
            var61 = var48.v(var47, 19, (DeserializationStrategy)var61, null) as java.lang.Boolean;
            val var12: Int = var48.v(var47, 20, var9, null) as Int;
            var29 = var48.v(var47, 21, var49, null) as java.lang.String;
            val var20: java.lang.String = var48.v(var47, 22, var49, null) as java.lang.String;
            var99 = var48.v(var47, 23, var49, null) as java.lang.String;
            val var17: Int = var48.v(var47, 24, var9, null) as Int;
            var16 = var48.v(var47, 25, var9, null) as Int;
            val var15: Int = var48.v(var47, 26, var9, null) as Int;
            val var14: java.lang.String = var48.v(var47, 27, var49, null) as java.lang.String;
            val var13: java.lang.String = var48.v(var47, 28, var49, null) as java.lang.String;
            val var11: Int = var48.v(var47, 29, var9, null) as Int;
            val var58: java.lang.String = var48.v(var47, 30, var49, null) as java.lang.String;
            val var50: java.lang.String = var48.v(var47, 31, var49, null) as java.lang.String;
            var4 = -1;
            var6 = var2;
            var40 = (java.lang.String)var108;
            var28 = var19;
            var108 = var139;
            var103 = (java.lang.Boolean)var61;
            var33 = var12;
            var38 = var20;
            var44 = var99;
            var139 = var17;
            var42 = var15;
            var99 = var14;
            var68 = var13;
            var61 = var11;
            var36 = var58;
            var39 = var50;
         } else {
            var var55: Boolean = true;
            var4 = 0;
            var3 = 0;
            var6 = 0;
            var108 = null;
            var var104: java.lang.String = null;
            var36 = null;
            var35 = null;
            var33 = null;
            var32 = null;
            var139 = null;
            var30 = null;
            var29 = null;
            var28 = null;
            var23 = null;
            var27 = null;
            var22 = null;
            var24 = null;
            var var65: Any = null;
            var25 = null;
            var26 = null;
            var var51: java.lang.String = null;
            var61 = null;
            var16 = null;
            var99 = null;
            var var72: java.lang.String = null;
            var var81: java.lang.String = null;
            var var90: Any = null;
            var var77: java.lang.String = null;
            var var59: java.lang.String = null;
            var68 = null;
            var var105: Any = null;

            while (var55) {
               var var45: java.lang.String;
               label82: {
                  label81: {
                     label80: {
                        label79: {
                           label78: {
                              label99: {
                                 label75: {
                                    label74: {
                                       label95: {
                                          val var7: Int = var48.x(var47);
                                          switch (var7) {
                                             case -1:
                                                var55 = false;
                                                break label78;
                                             case 0:
                                                var6 = var48.k(var47, 0);
                                                var2 |= 1;
                                                break label78;
                                             case 1:
                                                var3 = var48.k(var47, 1);
                                                var2 |= 2;
                                                break label78;
                                             case 2:
                                                var4 = var48.k(var47, 2);
                                                var2 |= 4;
                                                break label78;
                                             case 3:
                                                var37 = var48.v(var47, 3, C0.a, var22) as java.lang.String;
                                                var2 |= 8;
                                                var22 = (java.lang.String)var61;
                                                var61 = var37;
                                                break label80;
                                             case 4:
                                                var37 = var48.m(var47, 4, InviteType.Serializer.INSTANCE, var24) as InviteType;
                                                var2 |= 16;
                                                var22 = (java.lang.String)var61;
                                                var61 = var22;
                                                var24 = var37;
                                                break label80;
                                             case 5:
                                                var37 = var48.v(var47, 5, N.a, var65) as Int;
                                                var2 |= 32;
                                                var22 = (java.lang.String)var61;
                                                var61 = var22;
                                                var65 = var37;
                                                break label80;
                                             case 6:
                                                var38 = var48.v(var47, 6, N.a, var25) as Int;
                                                var2 |= 64;
                                                var37 = var26;
                                                break;
                                             case 7:
                                                var37 = var48.v(var47, 7, N.a, var26) as Int;
                                                var2 |= 128;
                                                var38 = (java.lang.String)var25;
                                                break;
                                             case 8:
                                                var51 = var48.v(var47, 8, C0.a, var51) as java.lang.String;
                                                var2 |= 256;
                                                var37 = var61;
                                                break label95;
                                             case 9:
                                                var37 = var48.v(var47, 9, C0.a, var61) as java.lang.String;
                                                var2 |= 512;
                                                break label95;
                                             case 10:
                                                var72 = (java.lang.String)var90;
                                                var90 = var48.v(var47, 10, N.a, var16) as Int;
                                                var2 |= 1024;
                                                var16 = var77;
                                                var77 = var81;
                                                var81 = var72;
                                                break label74;
                                             case 11:
                                                var99 = var48.v(var47, 11, h.a, var99) as java.lang.Boolean;
                                                var2 |= 2048;
                                                var72 = (java.lang.String)var90;
                                                var77 = var81;
                                                var81 = var72;
                                                var16 = var77;
                                                var90 = var16;
                                                break label74;
                                             case 12:
                                                var39 = var48.v(var47, 12, C0.a, var72) as java.lang.String;
                                                var2 |= 4096;
                                                var72 = (java.lang.String)var90;
                                                var77 = var81;
                                                var81 = var39;
                                                var16 = var77;
                                                var90 = var16;
                                                break label74;
                                             case 13:
                                                var81 = var48.v(var47, 13, C0.a, var81) as java.lang.String;
                                                var2 |= 8192;
                                                var72 = (java.lang.String)var90;
                                                var77 = var81;
                                                var81 = var72;
                                                var16 = var77;
                                                var90 = var16;
                                                break label74;
                                             case 14:
                                                val var194: java.lang.Boolean = var48.v(var47, 14, h.a, var90) as java.lang.Boolean;
                                                var2 |= 16384;
                                                var90 = var16;
                                                var77 = var81;
                                                var72 = var194;
                                                var81 = var72;
                                                var16 = var77;
                                                break label74;
                                             case 15:
                                                var77 = var48.v(var47, 15, C0.a, var77) as java.lang.String;
                                                var2 |= 32768;
                                                var72 = (java.lang.String)var90;
                                                var90 = var16;
                                                var16 = var77;
                                                var81 = var72;
                                                var77 = var81;
                                                break label74;
                                             case 16:
                                                var59 = var48.v(var47, 16, C0.a, var59) as java.lang.String;
                                                var2 |= 65536;
                                                var22 = (java.lang.String)var61;
                                                var61 = var22;
                                                break label80;
                                             case 17:
                                                val var191: Int = var48.v(var47, 17, N.a, var68) as Int;
                                                var2 |= 131072;
                                                var68 = var23;
                                                var105 = var108;
                                                var108 = var191;
                                                var23 = (java.lang.String)var105;
                                                break label75;
                                             case 18:
                                                var37 = var48.v(var47, 18, N.a, var105) as Int;
                                                var2 |= 262144;
                                                var68 = var23;
                                                var105 = var108;
                                                var108 = var68;
                                                var23 = (java.lang.String)var37;
                                                break label75;
                                             case 19:
                                                var37 = var48.v(var47, 19, h.a, var108) as java.lang.Boolean;
                                                var2 |= 524288;
                                                var108 = var68;
                                                var68 = var23;
                                                var105 = var37;
                                                var23 = (java.lang.String)var105;
                                                break label75;
                                             case 20:
                                                var37 = var48.v(var47, 20, N.a, var23) as Int;
                                                var2 |= 1048576;
                                                var23 = (java.lang.String)var105;
                                                var105 = var108;
                                                var108 = var68;
                                                var68 = (java.lang.String)var37;
                                                break label75;
                                             case 21:
                                                var41 = var48.v(var47, 21, C0.a, var29) as java.lang.String;
                                                var2 |= 2097152;
                                                var37 = var33;
                                                var38 = (java.lang.String)var32;
                                                var39 = (java.lang.String)var139;
                                                var40 = (java.lang.String)var30;
                                                var213 = (java.lang.String)var28;
                                                var43 = var27;
                                                break label99;
                                             case 22:
                                                var40 = var48.v(var47, 22, C0.a, var30) as java.lang.String;
                                                var2 |= 4194304;
                                                var37 = var33;
                                                var38 = (java.lang.String)var32;
                                                var39 = (java.lang.String)var139;
                                                var41 = var29;
                                                var213 = (java.lang.String)var28;
                                                var43 = var27;
                                                break label99;
                                             case 23:
                                                var104 = var48.v(var47, 23, C0.a, var104) as java.lang.String;
                                                var2 |= 8388608;
                                                var37 = var33;
                                                var38 = (java.lang.String)var32;
                                                var39 = (java.lang.String)var139;
                                                var40 = (java.lang.String)var30;
                                                var41 = var29;
                                                var213 = (java.lang.String)var28;
                                                var43 = var27;
                                                break label99;
                                             case 24:
                                                var39 = var48.v(var47, 24, N.a, var139) as Int;
                                                var2 |= 16777216;
                                                var37 = var33;
                                                var38 = (java.lang.String)var32;
                                                var40 = (java.lang.String)var30;
                                                var41 = var29;
                                                var213 = (java.lang.String)var28;
                                                var43 = var27;
                                                break label99;
                                             case 25:
                                                var38 = var48.v(var47, 25, N.a, var32) as Int;
                                                var2 |= 33554432;
                                                var37 = var33;
                                                var39 = (java.lang.String)var139;
                                                var40 = (java.lang.String)var30;
                                                var41 = var29;
                                                var213 = (java.lang.String)var28;
                                                var43 = var27;
                                                break label99;
                                             case 26:
                                                var34 = var48.v(var47, 26, N.a, var34) as Int;
                                                var2 |= 67108864;
                                                var37 = var33;
                                                var38 = (java.lang.String)var32;
                                                var39 = (java.lang.String)var139;
                                                var40 = (java.lang.String)var30;
                                                var41 = var29;
                                                var213 = (java.lang.String)var28;
                                                var43 = var27;
                                                break label99;
                                             case 27:
                                                var37 = var48.v(var47, 27, C0.a, var33) as java.lang.String;
                                                var2 |= 134217728;
                                                var38 = (java.lang.String)var32;
                                                var39 = (java.lang.String)var139;
                                                var40 = (java.lang.String)var30;
                                                var41 = var29;
                                                var213 = (java.lang.String)var28;
                                                var43 = var27;
                                                break label99;
                                             case 28:
                                                var213 = var48.v(var47, 28, C0.a, var28) as java.lang.String;
                                                var2 |= 268435456;
                                                var37 = var33;
                                                var38 = (java.lang.String)var32;
                                                var39 = (java.lang.String)var139;
                                                var40 = (java.lang.String)var30;
                                                var41 = var29;
                                                var43 = var27;
                                                break label99;
                                             case 29:
                                                var35 = var48.v(var47, 29, N.a, var35) as Int;
                                                var2 |= 536870912;
                                                var37 = var33;
                                                var38 = (java.lang.String)var32;
                                                var39 = (java.lang.String)var139;
                                                var40 = (java.lang.String)var30;
                                                var41 = var29;
                                                var213 = (java.lang.String)var28;
                                                var43 = var27;
                                                break label99;
                                             case 30:
                                                var36 = var48.v(var47, 30, C0.a, var36) as java.lang.String;
                                                var2 |= 1073741824;
                                                var37 = var33;
                                                var38 = (java.lang.String)var32;
                                                var39 = (java.lang.String)var139;
                                                var40 = (java.lang.String)var30;
                                                var41 = var29;
                                                var213 = (java.lang.String)var28;
                                                var43 = var27;
                                                break label99;
                                             case 31:
                                                var43 = var48.v(var47, 31, C0.a, var27) as java.lang.String;
                                                var2 |= Integer.MIN_VALUE;
                                                var213 = (java.lang.String)var28;
                                                var41 = var29;
                                                var40 = (java.lang.String)var30;
                                                var39 = (java.lang.String)var139;
                                                var38 = (java.lang.String)var32;
                                                var37 = var33;
                                                break label99;
                                             default:
                                                throw new n(var7);
                                          }

                                          var25 = var16;
                                          var77 = (java.lang.String)var90;
                                          var16 = var72;
                                          var90 = var77;
                                          var26 = var99;
                                          break label79;
                                       }

                                       var61 = var22;
                                       var22 = (java.lang.String)var37;
                                       break label80;
                                    }

                                    var37 = var26;
                                    var38 = (java.lang.String)var25;
                                    var26 = var99;
                                    var25 = var90;
                                    var90 = var16;
                                    var16 = var81;
                                    var81 = var77;
                                    var77 = var72;
                                    break label79;
                                 }

                                 var37 = var33;
                                 var33 = var32;
                                 var32 = var139;
                                 var139 = var30;
                                 var30 = var29;
                                 var29 = (java.lang.String)var28;
                                 var28 = var27;
                                 var128 = (java.lang.Boolean)var105;
                                 var105 = var23;
                                 break label81;
                              }

                              var128 = (java.lang.Boolean)var108;
                              var108 = var68;
                              var68 = var23;
                              var28 = var43;
                              var29 = var213;
                              var30 = var41;
                              var139 = var40;
                              var32 = var39;
                              var33 = var38;
                              break label81;
                           }

                           var99 = var68;
                           var16 = var72;
                           var77 = (java.lang.String)var90;
                           var73 = (java.lang.Boolean)var108;
                           var68 = var23;
                           var61 = var22;
                           var39 = (java.lang.String)var33;
                           var40 = (java.lang.String)var32;
                           var41 = (java.lang.String)var139;
                           var214 = (java.lang.String)var30;
                           var43 = var29;
                           var45 = (java.lang.String)var28;
                           var44 = var27;
                           var22 = (java.lang.String)var61;
                           var90 = var77;
                           var108 = var25;
                           var23 = (java.lang.String)var26;
                           var25 = var16;
                           var26 = var99;
                           break label82;
                        }

                        var99 = var68;
                        var61 = var22;
                        var73 = (java.lang.Boolean)var108;
                        var68 = var23;
                        var39 = (java.lang.String)var33;
                        var40 = (java.lang.String)var32;
                        var41 = (java.lang.String)var139;
                        var214 = (java.lang.String)var30;
                        var43 = var29;
                        var45 = (java.lang.String)var28;
                        var44 = var27;
                        var22 = (java.lang.String)var61;
                        var108 = var38;
                        var23 = (java.lang.String)var37;
                        break label82;
                     }

                     var99 = var68;
                     var16 = var72;
                     var77 = (java.lang.String)var90;
                     var73 = (java.lang.Boolean)var108;
                     var68 = var23;
                     var39 = (java.lang.String)var33;
                     var40 = (java.lang.String)var32;
                     var41 = (java.lang.String)var139;
                     var214 = (java.lang.String)var30;
                     var43 = var29;
                     var45 = (java.lang.String)var28;
                     var44 = var27;
                     var90 = var77;
                     var108 = var25;
                     var23 = (java.lang.String)var26;
                     var25 = var16;
                     var26 = var99;
                     break label82;
                  }

                  var23 = (java.lang.String)var26;
                  var16 = var72;
                  var77 = (java.lang.String)var90;
                  var61 = var22;
                  var39 = (java.lang.String)var37;
                  var40 = (java.lang.String)var33;
                  var41 = (java.lang.String)var32;
                  var214 = (java.lang.String)var139;
                  var43 = var30;
                  var45 = var29;
                  var44 = (java.lang.String)var28;
                  var73 = var128;
                  var22 = (java.lang.String)var61;
                  var90 = var77;
                  var99 = (java.lang.String)var108;
                  var108 = var25;
                  var25 = var16;
                  var26 = var99;
               }

               var61 = var22;
               var72 = (java.lang.String)var16;
               var68 = var99;
               var16 = var25;
               var99 = (java.lang.String)var26;
               var108 = var73;
               var33 = var39;
               var32 = var40;
               var139 = var41;
               var30 = var214;
               var29 = (java.lang.String)var43;
               var28 = var45;
               var23 = var68;
               var27 = var44;
               var22 = (java.lang.String)var61;
               var25 = var108;
               var26 = var23;
               var90 = var77;
               var77 = (java.lang.String)var90;
            }

            var28 = var16;
            var39 = var27;
            var61 = var35;
            var68 = (java.lang.String)var28;
            var99 = (java.lang.String)var33;
            var42 = var34;
            var16 = var32;
            var44 = var104;
            var38 = (java.lang.String)var30;
            var33 = var23;
            var103 = (java.lang.Boolean)var108;
            var37 = var105;
            var108 = var68;
            var148 = var59;
            var41 = var77;
            var32 = var90;
            var27 = var81;
            var35 = var72;
            var30 = var99;
            var40 = (java.lang.String)var61;
            var23 = var51;
            var43 = var65;
            var6 = var4;
            var5 = var3;
            var3 = var6;
            var4 = var2;
         }

         var48.b(var47);
         return new GuildInviteEmbedImpl(
            var4,
            0,
            var3,
            var5,
            var6,
            var22,
            (InviteType)var24,
            (Integer)var43,
            (Integer)var25,
            (Integer)var26,
            var23,
            var40,
            (Integer)var28,
            (java.lang.Boolean)var30,
            var35,
            var27,
            (java.lang.Boolean)var32,
            var41,
            var148,
            (Integer)var108,
            (Integer)var37,
            var103,
            (Integer)var33,
            var29,
            var38,
            var44,
            (Integer)var139,
            (Integer)var16,
            var42,
            var99,
            var68,
            (Integer)var61,
            var36,
            var39,
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
         return da.G.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<GuildInviteEmbedImpl> {
         return GuildInviteEmbedImpl.$serializer.INSTANCE;
      }
   }
}

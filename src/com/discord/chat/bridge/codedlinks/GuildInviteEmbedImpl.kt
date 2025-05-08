package com.discord.chat.bridge.codedlinks

import ha.f
import ha.n
import ia.a
import ka.C0
import ka.G
import ka.N
import ka.h
import kotlin.jvm.internal.q
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
      val var30: Int = Integer.hashCode(this.backgroundColor);
      val var29: Int = Integer.hashCode(this.borderColor);
      val var31: Int = Integer.hashCode(this.headerColor);
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
                                                                                                                                                                                                                                                                                    var30
                                                                                                                                                                                                                                                                                          * 31
                                                                                                                                                                                                                                                                                       + var29
                                                                                                                                                                                                                                                                                 )
                                                                                                                                                                                                                                                                                 * 31
                                                                                                                                                                                                                                                                              + var31
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
      val var1: Int = this.backgroundColor;
      val var2: Int = this.borderColor;
      val var3: Int = this.headerColor;
      val var23: java.lang.String = this.headerText;
      val var22: InviteType = this.type;
      val var4: Int = this.acceptLabelBackgroundColor;
      val var30: Int = this.acceptLabelBorderColor;
      val var10: Int = this.acceptLabelColor;
      val var11: java.lang.String = this.acceptLabelText;
      val var28: java.lang.String = this.bodyText;
      val var15: Int = this.bodyTextColor;
      val var32: java.lang.Boolean = this.canBeAccepted;
      val var19: java.lang.String = this.channelIcon;
      val var17: java.lang.String = this.channelName;
      val var21: java.lang.Boolean = this.embedCanBeTapped;
      val var9: java.lang.String = this.memberText;
      val var20: java.lang.String = this.onlineText;
      val var16: Int = this.resolvingGradientEnd;
      val var27: Int = this.resolvingGradientStart;
      val var5: java.lang.Boolean = this.splashHasRadialGradient;
      val var33: Int = this.splashOpacity;
      val var6: java.lang.String = this.splashUrl;
      val var12: java.lang.String = this.inviteSplash;
      val var14: java.lang.String = this.subtitle;
      val var7: Int = this.subtitleColor;
      val var24: Int = this.thumbnailBackgroundColor;
      val var31: Int = this.thumbnailCornerRadius;
      val var13: java.lang.String = this.thumbnailText;
      val var18: java.lang.String = this.thumbnailUrl;
      val var26: Int = this.titleColor;
      val var25: java.lang.String = this.titleText;
      val var8: java.lang.String = this.badgeIconUrl;
      val var29: StringBuilder = new StringBuilder();
      var29.append("GuildInviteEmbedImpl(backgroundColor=");
      var29.append(var1);
      var29.append(", borderColor=");
      var29.append(var2);
      var29.append(", headerColor=");
      var29.append(var3);
      var29.append(", headerText=");
      var29.append(var23);
      var29.append(", type=");
      var29.append(var22);
      var29.append(", acceptLabelBackgroundColor=");
      var29.append(var4);
      var29.append(", acceptLabelBorderColor=");
      var29.append(var30);
      var29.append(", acceptLabelColor=");
      var29.append(var10);
      var29.append(", acceptLabelText=");
      var29.append(var11);
      var29.append(", bodyText=");
      var29.append(var28);
      var29.append(", bodyTextColor=");
      var29.append(var15);
      var29.append(", canBeAccepted=");
      var29.append(var32);
      var29.append(", channelIcon=");
      var29.append(var19);
      var29.append(", channelName=");
      var29.append(var17);
      var29.append(", embedCanBeTapped=");
      var29.append(var21);
      var29.append(", memberText=");
      var29.append(var9);
      var29.append(", onlineText=");
      var29.append(var20);
      var29.append(", resolvingGradientEnd=");
      var29.append(var16);
      var29.append(", resolvingGradientStart=");
      var29.append(var27);
      var29.append(", splashHasRadialGradient=");
      var29.append(var5);
      var29.append(", splashOpacity=");
      var29.append(var33);
      var29.append(", splashUrl=");
      var29.append(var6);
      var29.append(", inviteSplash=");
      var29.append(var12);
      var29.append(", subtitle=");
      var29.append(var14);
      var29.append(", subtitleColor=");
      var29.append(var7);
      var29.append(", thumbnailBackgroundColor=");
      var29.append(var24);
      var29.append(", thumbnailCornerRadius=");
      var29.append(var31);
      var29.append(", thumbnailText=");
      var29.append(var13);
      var29.append(", thumbnailUrl=");
      var29.append(var18);
      var29.append(", titleColor=");
      var29.append(var26);
      var29.append(", titleText=");
      var29.append(var25);
      var29.append(", badgeIconUrl=");
      var29.append(var8);
      var29.append(")");
      return var29.toString();
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
         val var16: N = N.a;
         val var17: C0 = C0.a;
         val var15: KSerializer = a.u(C0.a);
         val var3: KSerializer = a.u(var16);
         val var10: KSerializer = a.u(var16);
         val var1: KSerializer = a.u(var16);
         val var5: KSerializer = a.u(var17);
         val var12: KSerializer = a.u(var17);
         val var11: KSerializer = a.u(var16);
         val var18: h = h.a;
         return new KSerializer[]{
            var16,
            var16,
            var16,
            var15,
            InviteType.Serializer.INSTANCE,
            var3,
            var10,
            var1,
            var5,
            var12,
            var11,
            a.u(h.a),
            a.u(var17),
            a.u(var17),
            a.u(var18),
            a.u(var17),
            a.u(var17),
            a.u(var16),
            a.u(var16),
            a.u(var18),
            a.u(var16),
            a.u(var17),
            a.u(var17),
            a.u(var17),
            a.u(var16),
            a.u(var16),
            a.u(var16),
            a.u(var17),
            a.u(var17),
            a.u(var16),
            a.u(var17),
            a.u(var17)
         };
      }

      public open fun deserialize(decoder: Decoder): GuildInviteEmbedImpl {
         q.h(var1, "decoder");
         val var48: SerialDescriptor = this.getDescriptor();
         val var49: c = var1.c(var48);
         val var8: Boolean = var49.y();
         var var2: Int = 0;
         var var34: Int = null;
         var var3: Int;
         var var4: Int;
         val var5: Int;
         var var6: Int;
         var var15: Int;
         var var19: Any;
         var var22: java.lang.String;
         var var23: Any;
         var var24: Any;
         var var25: Any;
         var var26: Any;
         var var27: Any;
         var var28: java.lang.String;
         var var29: java.lang.String;
         var var31: Any;
         var var32: Any;
         var var33: java.lang.String;
         var var35: java.lang.String;
         var var36: java.lang.String;
         var var37: java.lang.String;
         var var38: java.lang.String;
         var var39: Any;
         var var40: java.lang.String;
         var var41: java.lang.String;
         var var42: java.lang.String;
         var var43: Any;
         var var44: java.lang.String;
         var var59: java.lang.String;
         var var66: java.lang.String;
         var var98: Any;
         var var106: Any;
         var var136: Any;
         val var148: java.lang.Boolean;
         if (var8) {
            var5 = var49.k(var48, 0);
            var3 = var49.k(var48, 1);
            var2 = var49.k(var48, 2);
            val var50: C0 = C0.a;
            var22 = var49.v(var48, 3, C0.a, null) as java.lang.String;
            var24 = var49.m(var48, 4, InviteType.Serializer.INSTANCE, null) as InviteType;
            val var9: N = N.a;
            var31 = var49.v(var48, 5, N.a, null) as Int;
            var25 = var49.v(var48, 6, var9, null) as Int;
            var26 = var49.v(var48, 7, var9, null) as Int;
            var28 = var49.v(var48, 8, var50, null) as java.lang.String;
            var106 = var49.v(var48, 9, var50, null) as java.lang.String;
            var19 = var49.v(var48, 10, var9, null) as Int;
            val var10: h = h.a;
            var27 = var49.v(var48, 11, h.a, null) as java.lang.Boolean;
            var44 = var49.v(var48, 12, var50, null) as java.lang.String;
            var36 = var49.v(var48, 13, var50, null) as java.lang.String;
            var39 = var49.v(var48, 14, var10, null) as java.lang.Boolean;
            var41 = var49.v(var48, 15, var50, null) as java.lang.String;
            var42 = var49.v(var48, 16, var50, null) as java.lang.String;
            var23 = var49.v(var48, 17, var9, null) as Int;
            var136 = var49.v(var48, 18, var9, null) as Int;
            val var58: java.lang.Boolean = var49.v(var48, 19, var10, null) as java.lang.Boolean;
            val var12: Int = var49.v(var48, 20, var9, null) as Int;
            var29 = var49.v(var48, 21, var50, null) as java.lang.String;
            val var20: java.lang.String = var49.v(var48, 22, var50, null) as java.lang.String;
            var98 = var49.v(var48, 23, var50, null) as java.lang.String;
            val var17: Int = var49.v(var48, 24, var9, null) as Int;
            val var16: Int = var49.v(var48, 25, var9, null) as Int;
            var15 = var49.v(var48, 26, var9, null) as Int;
            val var14: java.lang.String = var49.v(var48, 27, var50, null) as java.lang.String;
            val var13: java.lang.String = var49.v(var48, 28, var50, null) as java.lang.String;
            val var11: Int = var49.v(var48, 29, var9, null) as Int;
            val var56: java.lang.String = var49.v(var48, 30, var50, null) as java.lang.String;
            val var51: java.lang.String = var49.v(var48, 31, var50, null) as java.lang.String;
            var6 = -1;
            var4 = var2;
            var38 = (java.lang.String)var106;
            var106 = var136;
            var148 = var58;
            var136 = var12;
            var40 = var20;
            var33 = (java.lang.String)var98;
            var43 = var17;
            var32 = var16;
            var35 = var14;
            var66 = var13;
            var98 = var11;
            var59 = var56;
            var37 = var51;
         } else {
            var var54: Boolean = true;
            var4 = 0;
            var3 = 0;
            var6 = 0;
            var106 = null;
            var19 = null;
            var36 = null;
            var35 = null;
            var33 = null;
            var32 = null;
            var31 = null;
            var136 = null;
            var29 = null;
            var28 = null;
            var23 = null;
            var27 = null;
            var22 = null;
            var24 = null;
            var var63: Any = null;
            var25 = null;
            var26 = null;
            var var52: java.lang.String = null;
            var59 = null;
            var15 = null;
            var98 = null;
            var var70: java.lang.String = null;
            var var84: java.lang.String = null;
            var var91: Any = null;
            var var76: java.lang.String = null;
            var var57: java.lang.String = null;
            var66 = null;
            var var103: Any = null;

            while (var54) {
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
                                          val var7: Int = var49.x(var48);
                                          switch (var7) {
                                             case -1:
                                                var54 = false;
                                                break label78;
                                             case 0:
                                                var6 = var49.k(var48, 0);
                                                var2 |= 1;
                                                break label78;
                                             case 1:
                                                var3 = var49.k(var48, 1);
                                                var2 |= 2;
                                                break label78;
                                             case 2:
                                                var4 = var49.k(var48, 2);
                                                var2 |= 4;
                                                break label78;
                                             case 3:
                                                var37 = var49.v(var48, 3, C0.a, var22) as java.lang.String;
                                                var2 |= 8;
                                                var22 = var59;
                                                var59 = var37;
                                                break label80;
                                             case 4:
                                                val var178: InviteType = var49.m(var48, 4, InviteType.Serializer.INSTANCE, var24) as InviteType;
                                                var2 |= 16;
                                                var22 = var59;
                                                var59 = var22;
                                                var24 = var178;
                                                break label80;
                                             case 5:
                                                val var177: Int = var49.v(var48, 5, N.a, var63) as Int;
                                                var2 |= 32;
                                                var22 = var59;
                                                var59 = var22;
                                                var63 = var177;
                                                break label80;
                                             case 6:
                                                var38 = var49.v(var48, 6, N.a, var25) as Int;
                                                var2 |= 64;
                                                var37 = (java.lang.String)var26;
                                                break;
                                             case 7:
                                                var37 = var49.v(var48, 7, N.a, var26) as Int;
                                                var2 |= 128;
                                                var38 = (java.lang.String)var25;
                                                break;
                                             case 8:
                                                var52 = var49.v(var48, 8, C0.a, var52) as java.lang.String;
                                                var2 |= 256;
                                                var37 = var59;
                                                break label95;
                                             case 9:
                                                var37 = var49.v(var48, 9, C0.a, var59) as java.lang.String;
                                                var2 |= 512;
                                                break label95;
                                             case 10:
                                                var70 = (java.lang.String)var91;
                                                var91 = var49.v(var48, 10, N.a, var15) as Int;
                                                var2 |= 1024;
                                                var76 = var84;
                                                var82 = var70;
                                                var84 = var76;
                                                break label74;
                                             case 11:
                                                var98 = var49.v(var48, 11, h.a, var98) as java.lang.Boolean;
                                                var2 |= 2048;
                                                var70 = (java.lang.String)var91;
                                                var76 = var84;
                                                var82 = var70;
                                                var84 = var76;
                                                var91 = var15;
                                                break label74;
                                             case 12:
                                                var37 = var49.v(var48, 12, C0.a, var70) as java.lang.String;
                                                var2 |= 4096;
                                                var70 = (java.lang.String)var91;
                                                var76 = var84;
                                                var82 = var37;
                                                var84 = var76;
                                                var91 = var15;
                                                break label74;
                                             case 13:
                                                var38 = var49.v(var48, 13, C0.a, var84) as java.lang.String;
                                                var2 |= 8192;
                                                var84 = var76;
                                                var82 = var70;
                                                var70 = (java.lang.String)var91;
                                                var76 = var38;
                                                var91 = var15;
                                                break label74;
                                             case 14:
                                                val var193: java.lang.Boolean = var49.v(var48, 14, h.a, var91) as java.lang.Boolean;
                                                var2 |= 16384;
                                                var91 = var15;
                                                var82 = var70;
                                                var76 = var84;
                                                var70 = var193;
                                                var84 = var76;
                                                break label74;
                                             case 15:
                                                var76 = var49.v(var48, 15, C0.a, var76) as java.lang.String;
                                                var2 |= 32768;
                                                var91 = var15;
                                                var84 = var76;
                                                var82 = var70;
                                                var76 = var84;
                                                var70 = (java.lang.String)var91;
                                                break label74;
                                             case 16:
                                                var57 = var49.v(var48, 16, C0.a, var57) as java.lang.String;
                                                var2 |= 65536;
                                                var22 = var59;
                                                var59 = var22;
                                                break label80;
                                             case 17:
                                                val var161: Int = var49.v(var48, 17, N.a, var66) as Int;
                                                var2 |= 131072;
                                                var66 = (java.lang.String)var23;
                                                var103 = var106;
                                                var106 = var161;
                                                var23 = var103;
                                                break label75;
                                             case 18:
                                                val var160: Int = var49.v(var48, 18, N.a, var103) as Int;
                                                var2 |= 262144;
                                                var66 = (java.lang.String)var23;
                                                var103 = var106;
                                                var106 = var66;
                                                var23 = var160;
                                                break label75;
                                             case 19:
                                                val var158: java.lang.Boolean = var49.v(var48, 19, h.a, var106) as java.lang.Boolean;
                                                var2 |= 524288;
                                                var106 = var66;
                                                var66 = (java.lang.String)var23;
                                                var103 = var158;
                                                var23 = var103;
                                                break label75;
                                             case 20:
                                                val var156: Int = var49.v(var48, 20, N.a, var23) as Int;
                                                var2 |= 1048576;
                                                var23 = var103;
                                                var103 = var106;
                                                var106 = var66;
                                                var66 = var156;
                                                break label75;
                                             case 21:
                                                var41 = var49.v(var48, 21, C0.a, var29) as java.lang.String;
                                                var2 |= 2097152;
                                                var37 = var33;
                                                var38 = (java.lang.String)var32;
                                                var39 = var31;
                                                var40 = (java.lang.String)var136;
                                                var42 = var28;
                                                var43 = var27;
                                                break label99;
                                             case 22:
                                                var40 = var49.v(var48, 22, C0.a, var136) as java.lang.String;
                                                var2 |= 4194304;
                                                var37 = var33;
                                                var38 = (java.lang.String)var32;
                                                var39 = var31;
                                                var41 = var29;
                                                var42 = var28;
                                                var43 = var27;
                                                break label99;
                                             case 23:
                                                var19 = var49.v(var48, 23, C0.a, var19) as java.lang.String;
                                                var2 |= 8388608;
                                                var37 = var33;
                                                var38 = (java.lang.String)var32;
                                                var39 = var31;
                                                var40 = (java.lang.String)var136;
                                                var41 = var29;
                                                var42 = var28;
                                                var43 = var27;
                                                break label99;
                                             case 24:
                                                var39 = var49.v(var48, 24, N.a, var31) as Int;
                                                var2 |= 16777216;
                                                var37 = var33;
                                                var38 = (java.lang.String)var32;
                                                var40 = (java.lang.String)var136;
                                                var41 = var29;
                                                var42 = var28;
                                                var43 = var27;
                                                break label99;
                                             case 25:
                                                var38 = var49.v(var48, 25, N.a, var32) as Int;
                                                var2 |= 33554432;
                                                var37 = var33;
                                                var39 = var31;
                                                var40 = (java.lang.String)var136;
                                                var41 = var29;
                                                var42 = var28;
                                                var43 = var27;
                                                break label99;
                                             case 26:
                                                var34 = var49.v(var48, 26, N.a, var34) as Int;
                                                var2 |= 67108864;
                                                var37 = var33;
                                                var38 = (java.lang.String)var32;
                                                var39 = var31;
                                                var40 = (java.lang.String)var136;
                                                var41 = var29;
                                                var42 = var28;
                                                var43 = var27;
                                                break label99;
                                             case 27:
                                                var37 = var49.v(var48, 27, C0.a, var33) as java.lang.String;
                                                var2 |= 134217728;
                                                var38 = (java.lang.String)var32;
                                                var39 = var31;
                                                var40 = (java.lang.String)var136;
                                                var41 = var29;
                                                var42 = var28;
                                                var43 = var27;
                                                break label99;
                                             case 28:
                                                var42 = var49.v(var48, 28, C0.a, var28) as java.lang.String;
                                                var2 |= 268435456;
                                                var37 = var33;
                                                var38 = (java.lang.String)var32;
                                                var39 = var31;
                                                var40 = (java.lang.String)var136;
                                                var41 = var29;
                                                var43 = var27;
                                                break label99;
                                             case 29:
                                                var35 = var49.v(var48, 29, N.a, var35) as Int;
                                                var2 |= 536870912;
                                                var37 = var33;
                                                var38 = (java.lang.String)var32;
                                                var39 = var31;
                                                var40 = (java.lang.String)var136;
                                                var41 = var29;
                                                var42 = var28;
                                                var43 = var27;
                                                break label99;
                                             case 30:
                                                var36 = var49.v(var48, 30, C0.a, var36) as java.lang.String;
                                                var2 |= 1073741824;
                                                var37 = var33;
                                                var38 = (java.lang.String)var32;
                                                var39 = var31;
                                                var40 = (java.lang.String)var136;
                                                var41 = var29;
                                                var42 = var28;
                                                var43 = var27;
                                                break label99;
                                             case 31:
                                                var43 = var49.v(var48, 31, C0.a, var27) as java.lang.String;
                                                var2 |= Integer.MIN_VALUE;
                                                var42 = var28;
                                                var41 = var29;
                                                var40 = (java.lang.String)var136;
                                                var39 = var31;
                                                var38 = (java.lang.String)var32;
                                                var37 = var33;
                                                break label99;
                                             default:
                                                throw new n(var7);
                                          }

                                          var25 = var15;
                                          var81 = var84;
                                          var76 = (java.lang.String)var91;
                                          var84 = var70;
                                          var91 = var76;
                                          var26 = var98;
                                          break label79;
                                       }

                                       var59 = var22;
                                       var22 = var37;
                                       break label80;
                                    }

                                    var37 = (java.lang.String)var26;
                                    var38 = (java.lang.String)var25;
                                    var26 = var98;
                                    var25 = var91;
                                    var91 = var84;
                                    var84 = var82;
                                    var81 = var76;
                                    var76 = var70;
                                    break label79;
                                 }

                                 var37 = var33;
                                 var33 = (java.lang.String)var32;
                                 var32 = var31;
                                 var31 = var136;
                                 var136 = var29;
                                 var29 = var28;
                                 var28 = (java.lang.String)var27;
                                 var27 = var103;
                                 var103 = var23;
                                 break label81;
                              }

                              var27 = var106;
                              var106 = var66;
                              var66 = (java.lang.String)var23;
                              var28 = (java.lang.String)var43;
                              var29 = var42;
                              var136 = var41;
                              var31 = var40;
                              var32 = var39;
                              var33 = var38;
                              break label81;
                           }

                           var98 = var66;
                           var81 = var84;
                           var76 = (java.lang.String)var91;
                           var71 = (java.lang.Boolean)var106;
                           var66 = (java.lang.String)var23;
                           var59 = var22;
                           var39 = var33;
                           var40 = (java.lang.String)var32;
                           var41 = (java.lang.String)var31;
                           var42 = (java.lang.String)var136;
                           var43 = var29;
                           var45 = var28;
                           var44 = (java.lang.String)var27;
                           var22 = var59;
                           var84 = var70;
                           var91 = var76;
                           var106 = var25;
                           var23 = var26;
                           var25 = var15;
                           var26 = var98;
                           break label82;
                        }

                        var98 = var66;
                        var59 = var22;
                        var71 = (java.lang.Boolean)var106;
                        var66 = (java.lang.String)var23;
                        var39 = var33;
                        var40 = (java.lang.String)var32;
                        var41 = (java.lang.String)var31;
                        var42 = (java.lang.String)var136;
                        var43 = var29;
                        var45 = var28;
                        var44 = (java.lang.String)var27;
                        var22 = var59;
                        var106 = var38;
                        var23 = var37;
                        break label82;
                     }

                     var98 = var66;
                     var81 = var84;
                     var76 = (java.lang.String)var91;
                     var71 = (java.lang.Boolean)var106;
                     var66 = (java.lang.String)var23;
                     var39 = var33;
                     var40 = (java.lang.String)var32;
                     var41 = (java.lang.String)var31;
                     var42 = (java.lang.String)var136;
                     var43 = var29;
                     var45 = var28;
                     var44 = (java.lang.String)var27;
                     var84 = var70;
                     var91 = var76;
                     var106 = var25;
                     var23 = var26;
                     var25 = var15;
                     var26 = var98;
                     break label82;
                  }

                  var23 = var26;
                  var81 = var84;
                  var76 = (java.lang.String)var91;
                  var59 = var22;
                  var39 = var37;
                  var40 = var33;
                  var41 = (java.lang.String)var32;
                  var42 = (java.lang.String)var31;
                  var43 = var136;
                  var45 = var29;
                  var44 = var28;
                  var71 = (java.lang.Boolean)var27;
                  var22 = var59;
                  var84 = var70;
                  var91 = var76;
                  var98 = var106;
                  var106 = var25;
                  var25 = var15;
                  var26 = var98;
               }

               var59 = var22;
               var70 = var84;
               var66 = (java.lang.String)var98;
               var15 = (Integer)var25;
               var98 = var26;
               var106 = var71;
               var33 = (java.lang.String)var39;
               var32 = var40;
               var31 = var41;
               var136 = var42;
               var29 = (java.lang.String)var43;
               var28 = var45;
               var23 = var66;
               var27 = var44;
               var22 = var59;
               var25 = var106;
               var26 = var23;
               var84 = var81;
               var91 = var76;
               var76 = (java.lang.String)var91;
            }

            var37 = (java.lang.String)var27;
            var27 = var98;
            var5 = var6;
            var38 = var59;
            var59 = var36;
            var98 = var35;
            var66 = var28;
            var35 = var33;
            var15 = var34;
            var43 = var31;
            var33 = (java.lang.String)var19;
            var40 = (java.lang.String)var136;
            var136 = var23;
            var148 = (java.lang.Boolean)var106;
            var106 = var103;
            var23 = var66;
            var42 = var57;
            var41 = var76;
            var39 = var91;
            var36 = var84;
            var44 = var70;
            var19 = var15;
            var28 = var52;
            var31 = var63;
            var6 = var2;
         }

         var49.b(var48);
         return new GuildInviteEmbedImpl(
            var6,
            0,
            var5,
            var3,
            var4,
            var22,
            (InviteType)var24,
            (Integer)var31,
            (Integer)var25,
            (Integer)var26,
            var28,
            var38,
            (Integer)var19,
            (java.lang.Boolean)var27,
            var44,
            var36,
            (java.lang.Boolean)var39,
            var41,
            var42,
            (Integer)var23,
            (Integer)var106,
            var148,
            (Integer)var136,
            var29,
            var40,
            var33,
            (Integer)var43,
            (Integer)var32,
            var15,
            var35,
            var66,
            (Integer)var98,
            var59,
            var37,
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
         return ka.G.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<GuildInviteEmbedImpl> {
         return GuildInviteEmbedImpl.$serializer.INSTANCE;
      }
   }
}

package com.discord.chat.bridge.codedlinks

import fa.f
import fa.n
import ga.a
import ia.C0
import ia.G
import ia.N
import ia.h
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
      val var29: Int = Integer.hashCode(this.backgroundColor);
      val var30: Int = Integer.hashCode(this.borderColor);
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
                                                                                                                                                                                                                                                                                    var29
                                                                                                                                                                                                                                                                                          * 31
                                                                                                                                                                                                                                                                                       + var30
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
      val var29: java.lang.String = this.headerText;
      val var10: InviteType = this.type;
      val var12: Int = this.acceptLabelBackgroundColor;
      val var4: Int = this.acceptLabelBorderColor;
      val var14: Int = this.acceptLabelColor;
      val var33: java.lang.String = this.acceptLabelText;
      val var19: java.lang.String = this.bodyText;
      val var22: Int = this.bodyTextColor;
      val var21: java.lang.Boolean = this.canBeAccepted;
      val var11: java.lang.String = this.channelIcon;
      val var15: java.lang.String = this.channelName;
      val var5: java.lang.Boolean = this.embedCanBeTapped;
      val var30: java.lang.String = this.memberText;
      val var9: java.lang.String = this.onlineText;
      val var8: Int = this.resolvingGradientEnd;
      val var26: Int = this.resolvingGradientStart;
      val var27: java.lang.Boolean = this.splashHasRadialGradient;
      val var31: Int = this.splashOpacity;
      val var32: java.lang.String = this.splashUrl;
      val var24: java.lang.String = this.inviteSplash;
      val var17: java.lang.String = this.subtitle;
      val var28: Int = this.subtitleColor;
      val var6: Int = this.thumbnailBackgroundColor;
      val var25: Int = this.thumbnailCornerRadius;
      val var13: java.lang.String = this.thumbnailText;
      val var23: java.lang.String = this.thumbnailUrl;
      val var18: Int = this.titleColor;
      val var7: java.lang.String = this.titleText;
      val var20: java.lang.String = this.badgeIconUrl;
      val var16: StringBuilder = new StringBuilder();
      var16.append("GuildInviteEmbedImpl(backgroundColor=");
      var16.append(var1);
      var16.append(", borderColor=");
      var16.append(var2);
      var16.append(", headerColor=");
      var16.append(var3);
      var16.append(", headerText=");
      var16.append(var29);
      var16.append(", type=");
      var16.append(var10);
      var16.append(", acceptLabelBackgroundColor=");
      var16.append(var12);
      var16.append(", acceptLabelBorderColor=");
      var16.append(var4);
      var16.append(", acceptLabelColor=");
      var16.append(var14);
      var16.append(", acceptLabelText=");
      var16.append(var33);
      var16.append(", bodyText=");
      var16.append(var19);
      var16.append(", bodyTextColor=");
      var16.append(var22);
      var16.append(", canBeAccepted=");
      var16.append(var21);
      var16.append(", channelIcon=");
      var16.append(var11);
      var16.append(", channelName=");
      var16.append(var15);
      var16.append(", embedCanBeTapped=");
      var16.append(var5);
      var16.append(", memberText=");
      var16.append(var30);
      var16.append(", onlineText=");
      var16.append(var9);
      var16.append(", resolvingGradientEnd=");
      var16.append(var8);
      var16.append(", resolvingGradientStart=");
      var16.append(var26);
      var16.append(", splashHasRadialGradient=");
      var16.append(var27);
      var16.append(", splashOpacity=");
      var16.append(var31);
      var16.append(", splashUrl=");
      var16.append(var32);
      var16.append(", inviteSplash=");
      var16.append(var24);
      var16.append(", subtitle=");
      var16.append(var17);
      var16.append(", subtitleColor=");
      var16.append(var28);
      var16.append(", thumbnailBackgroundColor=");
      var16.append(var6);
      var16.append(", thumbnailCornerRadius=");
      var16.append(var25);
      var16.append(", thumbnailText=");
      var16.append(var13);
      var16.append(", thumbnailUrl=");
      var16.append(var23);
      var16.append(", titleColor=");
      var16.append(var18);
      var16.append(", titleText=");
      var16.append(var7);
      var16.append(", badgeIconUrl=");
      var16.append(var20);
      var16.append(")");
      return var16.toString();
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
         val var19: C0 = C0.a;
         val var5: KSerializer = a.u(C0.a);
         val var8: KSerializer = a.u(var7);
         val var6: KSerializer = a.u(var7);
         val var15: KSerializer = a.u(var7);
         val var3: KSerializer = a.u(var19);
         val var10: KSerializer = a.u(var19);
         val var14: KSerializer = a.u(var7);
         val var17: h = h.a;
         return new KSerializer[]{
            var7,
            var7,
            var7,
            var5,
            InviteType.Serializer.INSTANCE,
            var8,
            var6,
            var15,
            var3,
            var10,
            var14,
            a.u(h.a),
            a.u(var19),
            a.u(var19),
            a.u(var17),
            a.u(var19),
            a.u(var19),
            a.u(var7),
            a.u(var7),
            a.u(var17),
            a.u(var7),
            a.u(var19),
            a.u(var19),
            a.u(var19),
            a.u(var7),
            a.u(var7),
            a.u(var7),
            a.u(var19),
            a.u(var19),
            a.u(var7),
            a.u(var19),
            a.u(var19)
         };
      }

      public open fun deserialize(decoder: Decoder): GuildInviteEmbedImpl {
         q.h(var1, "decoder");
         val var48: SerialDescriptor = this.getDescriptor();
         val var49: c = var1.c(var48);
         val var8: Boolean = var49.y();
         var var2: Int = 0;
         var var34: Int = null;
         var var4: Int;
         val var5: Int;
         var var6: Int;
         var var19: Any;
         var var20: java.lang.String;
         var var22: java.lang.String;
         var var23: java.lang.String;
         var var24: Any;
         var var25: Any;
         var var26: Any;
         var var27: Any;
         var var28: java.lang.String;
         var var29: java.lang.String;
         var var30: java.lang.String;
         var var31: java.lang.String;
         var var33: java.lang.Boolean;
         var var35: Any;
         var var36: java.lang.String;
         var var37: Any;
         var var38: java.lang.String;
         var var39: Any;
         var var40: java.lang.String;
         var var41: Any;
         var var42: Any;
         var var43: java.lang.String;
         var var54: Int;
         var var64: java.lang.String;
         var var71: java.lang.String;
         var var84: java.lang.String;
         var var96: Any;
         var var111: Any;
         var var145: Any;
         if (var8) {
            var4 = var49.k(var48, 0);
            var54 = var49.k(var48, 1);
            var2 = var49.k(var48, 2);
            val var50: C0 = C0.a;
            var22 = var49.v(var48, 3, C0.a, null) as java.lang.String;
            var24 = var49.m(var48, 4, InviteType.Serializer.INSTANCE, null) as InviteType;
            val var9: N = N.a;
            var42 = var49.v(var48, 5, N.a, null) as Int;
            var25 = var49.v(var48, 6, var9, null) as Int;
            var26 = var49.v(var48, 7, var9, null) as Int;
            var43 = var49.v(var48, 8, var50, null) as java.lang.String;
            var111 = var49.v(var48, 9, var50, null) as java.lang.String;
            var19 = var49.v(var48, 10, var9, null) as Int;
            val var10: h = h.a;
            var37 = var49.v(var48, 11, h.a, null) as java.lang.Boolean;
            var23 = var49.v(var48, 12, var50, null) as java.lang.String;
            var31 = var49.v(var48, 13, var50, null) as java.lang.String;
            var39 = var49.v(var48, 14, var10, null) as java.lang.Boolean;
            var30 = var49.v(var48, 15, var50, null) as java.lang.String;
            var28 = var49.v(var48, 16, var50, null) as java.lang.String;
            var145 = var49.v(var48, 17, var9, null) as Int;
            var27 = var49.v(var48, 18, var9, null) as Int;
            val var11: java.lang.Boolean = var49.v(var48, 19, var10, null) as java.lang.Boolean;
            val var12: Int = var49.v(var48, 20, var9, null) as Int;
            var29 = var49.v(var48, 21, var50, null) as java.lang.String;
            var20 = var49.v(var48, 22, var50, null) as java.lang.String;
            val var18: java.lang.String = var49.v(var48, 23, var50, null) as java.lang.String;
            var96 = var49.v(var48, 24, var9, null) as Int;
            val var16: Int = var49.v(var48, 25, var9, null) as Int;
            val var15: Int = var49.v(var48, 26, var9, null) as Int;
            val var14: java.lang.String = var49.v(var48, 27, var50, null) as java.lang.String;
            val var13: java.lang.String = var49.v(var48, 28, var50, null) as java.lang.String;
            val var63: Int = var49.v(var48, 29, var9, null) as Int;
            val var61: java.lang.String = var49.v(var48, 30, var50, null) as java.lang.String;
            val var51: java.lang.String = var49.v(var48, 31, var50, null) as java.lang.String;
            var5 = -1;
            var6 = var54;
            var54 = var2;
            var40 = (java.lang.String)var111;
            var111 = var145;
            var33 = var11;
            var145 = var12;
            var38 = var18;
            var41 = var96;
            var96 = var16;
            var34 = var15;
            var71 = var14;
            var84 = var13;
            var35 = var63;
            var36 = var61;
            var64 = var51;
         } else {
            var var57: Boolean = true;
            var4 = 0;
            var54 = 0;
            var6 = 0;
            var111 = null;
            var19 = null;
            var36 = null;
            var35 = null;
            var var149: java.lang.String = null;
            var145 = null;
            var31 = null;
            var30 = null;
            var29 = null;
            var28 = null;
            var23 = null;
            var27 = null;
            var22 = null;
            var24 = null;
            var var68: Any = null;
            var25 = null;
            var26 = null;
            var var52: java.lang.String = null;
            var64 = null;
            var84 = null;
            var96 = null;
            var var75: java.lang.String = null;
            var var89: java.lang.String = null;
            var var100: Any = null;
            var var80: java.lang.String = null;
            var var62: java.lang.String = null;
            var71 = null;
            var20 = null;

            while (var57) {
               var var44: java.lang.String;
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
                                                var57 = false;
                                                break label78;
                                             case 0:
                                                var6 = var49.k(var48, 0);
                                                var2 |= 1;
                                                break label78;
                                             case 1:
                                                var54 = var49.k(var48, 1);
                                                var2 |= 2;
                                                break label78;
                                             case 2:
                                                var4 = var49.k(var48, 2);
                                                var2 |= 4;
                                                break label78;
                                             case 3:
                                                var37 = var49.v(var48, 3, C0.a, var22) as java.lang.String;
                                                var2 |= 8;
                                                var22 = var64;
                                                var64 = (java.lang.String)var37;
                                                break label80;
                                             case 4:
                                                var37 = var49.m(var48, 4, InviteType.Serializer.INSTANCE, var24) as InviteType;
                                                var2 |= 16;
                                                var22 = var64;
                                                var64 = var22;
                                                var24 = var37;
                                                break label80;
                                             case 5:
                                                var37 = var49.v(var48, 5, N.a, var68) as Int;
                                                var2 |= 32;
                                                var22 = var64;
                                                var64 = var22;
                                                var68 = var37;
                                                break label80;
                                             case 6:
                                                var38 = var49.v(var48, 6, N.a, var25) as Int;
                                                var2 |= 64;
                                                var37 = var26;
                                                break;
                                             case 7:
                                                var37 = var49.v(var48, 7, N.a, var26) as Int;
                                                var2 |= 128;
                                                var38 = (java.lang.String)var25;
                                                break;
                                             case 8:
                                                var52 = var49.v(var48, 8, C0.a, var52) as java.lang.String;
                                                var2 |= 256;
                                                var37 = var64;
                                                break label95;
                                             case 9:
                                                var37 = var49.v(var48, 9, C0.a, var64) as java.lang.String;
                                                var2 |= 512;
                                                break label95;
                                             case 10:
                                                var75 = (java.lang.String)var100;
                                                var100 = var96;
                                                var96 = var49.v(var48, 10, N.a, var84) as Int;
                                                var2 |= 1024;
                                                var80 = var89;
                                                var84 = var75;
                                                var89 = var80;
                                                break label74;
                                             case 11:
                                                var37 = var49.v(var48, 11, h.a, var96) as java.lang.Boolean;
                                                var2 |= 2048;
                                                var96 = var84;
                                                var75 = (java.lang.String)var100;
                                                var80 = var89;
                                                var84 = var75;
                                                var89 = var80;
                                                var100 = var37;
                                                break label74;
                                             case 12:
                                                var39 = var49.v(var48, 12, C0.a, var75) as java.lang.String;
                                                var2 |= 4096;
                                                var75 = (java.lang.String)var100;
                                                var80 = var89;
                                                var84 = (java.lang.String)var39;
                                                var89 = var80;
                                                var96 = var84;
                                                var100 = var96;
                                                break label74;
                                             case 13:
                                                var39 = var49.v(var48, 13, C0.a, var89) as java.lang.String;
                                                var2 |= 8192;
                                                var89 = var80;
                                                var84 = var75;
                                                var75 = (java.lang.String)var100;
                                                var80 = (java.lang.String)var39;
                                                var96 = var84;
                                                var100 = var96;
                                                break label74;
                                             case 14:
                                                var39 = var49.v(var48, 14, h.a, var100) as java.lang.Boolean;
                                                var2 |= 16384;
                                                var84 = var75;
                                                var80 = var89;
                                                var75 = (java.lang.String)var39;
                                                var89 = var80;
                                                var96 = var84;
                                                var100 = var96;
                                                break label74;
                                             case 15:
                                                var80 = var49.v(var48, 15, C0.a, var80) as java.lang.String;
                                                var2 |= 32768;
                                                var100 = var96;
                                                var96 = var84;
                                                var89 = var80;
                                                var84 = var75;
                                                var80 = var89;
                                                var75 = (java.lang.String)var100;
                                                break label74;
                                             case 16:
                                                var62 = var49.v(var48, 16, C0.a, var62) as java.lang.String;
                                                var2 |= 65536;
                                                var22 = var64;
                                                var64 = var22;
                                                break label80;
                                             case 17:
                                                val var193: Int = var49.v(var48, 17, N.a, var71) as Int;
                                                var2 |= 131072;
                                                var71 = var23;
                                                var109 = (java.lang.Boolean)var111;
                                                var111 = var193;
                                                var23 = var20;
                                                break label75;
                                             case 18:
                                                var37 = var49.v(var48, 18, N.a, var20) as Int;
                                                var2 |= 262144;
                                                var71 = var23;
                                                var109 = (java.lang.Boolean)var111;
                                                var111 = var71;
                                                var23 = (java.lang.String)var37;
                                                break label75;
                                             case 19:
                                                var111 = var49.v(var48, 19, h.a, var111) as java.lang.Boolean;
                                                var2 |= 524288;
                                                var71 = var23;
                                                var109 = (java.lang.Boolean)var111;
                                                var111 = var71;
                                                var23 = var20;
                                                break label75;
                                             case 20:
                                                var37 = var49.v(var48, 20, N.a, var23) as Int;
                                                var2 |= 1048576;
                                                var23 = var20;
                                                var109 = (java.lang.Boolean)var111;
                                                var111 = var71;
                                                var71 = (java.lang.String)var37;
                                                break label75;
                                             case 21:
                                                var41 = var49.v(var48, 21, C0.a, var29) as java.lang.String;
                                                var2 |= 2097152;
                                                var37 = var149;
                                                var38 = (java.lang.String)var145;
                                                var39 = var31;
                                                var40 = var30;
                                                var42 = var28;
                                                var43 = (java.lang.String)var27;
                                                break label99;
                                             case 22:
                                                var40 = var49.v(var48, 22, C0.a, var30) as java.lang.String;
                                                var2 |= 4194304;
                                                var37 = var149;
                                                var38 = (java.lang.String)var145;
                                                var39 = var31;
                                                var41 = var29;
                                                var42 = var28;
                                                var43 = (java.lang.String)var27;
                                                break label99;
                                             case 23:
                                                var19 = var49.v(var48, 23, C0.a, var19) as java.lang.String;
                                                var2 |= 8388608;
                                                var37 = var149;
                                                var38 = (java.lang.String)var145;
                                                var39 = var31;
                                                var40 = var30;
                                                var41 = var29;
                                                var42 = var28;
                                                var43 = (java.lang.String)var27;
                                                break label99;
                                             case 24:
                                                var39 = var49.v(var48, 24, N.a, var31) as Int;
                                                var2 |= 16777216;
                                                var37 = var149;
                                                var38 = (java.lang.String)var145;
                                                var40 = var30;
                                                var41 = var29;
                                                var42 = var28;
                                                var43 = (java.lang.String)var27;
                                                break label99;
                                             case 25:
                                                var38 = var49.v(var48, 25, N.a, var145) as Int;
                                                var2 |= 33554432;
                                                var37 = var149;
                                                var39 = var31;
                                                var40 = var30;
                                                var41 = var29;
                                                var42 = var28;
                                                var43 = (java.lang.String)var27;
                                                break label99;
                                             case 26:
                                                var34 = var49.v(var48, 26, N.a, var34) as Int;
                                                var2 |= 67108864;
                                                var37 = var149;
                                                var38 = (java.lang.String)var145;
                                                var39 = var31;
                                                var40 = var30;
                                                var41 = var29;
                                                var42 = var28;
                                                var43 = (java.lang.String)var27;
                                                break label99;
                                             case 27:
                                                var37 = var49.v(var48, 27, C0.a, var149) as java.lang.String;
                                                var2 |= 134217728;
                                                var38 = (java.lang.String)var145;
                                                var39 = var31;
                                                var40 = var30;
                                                var41 = var29;
                                                var42 = var28;
                                                var43 = (java.lang.String)var27;
                                                break label99;
                                             case 28:
                                                var42 = var49.v(var48, 28, C0.a, var28) as java.lang.String;
                                                var2 |= 268435456;
                                                var37 = var149;
                                                var38 = (java.lang.String)var145;
                                                var39 = var31;
                                                var40 = var30;
                                                var41 = var29;
                                                var43 = (java.lang.String)var27;
                                                break label99;
                                             case 29:
                                                var35 = var49.v(var48, 29, N.a, var35) as Int;
                                                var2 |= 536870912;
                                                var37 = var149;
                                                var38 = (java.lang.String)var145;
                                                var39 = var31;
                                                var40 = var30;
                                                var41 = var29;
                                                var42 = var28;
                                                var43 = (java.lang.String)var27;
                                                break label99;
                                             case 30:
                                                var36 = var49.v(var48, 30, C0.a, var36) as java.lang.String;
                                                var2 |= 1073741824;
                                                var37 = var149;
                                                var38 = (java.lang.String)var145;
                                                var39 = var31;
                                                var40 = var30;
                                                var41 = var29;
                                                var42 = var28;
                                                var43 = (java.lang.String)var27;
                                                break label99;
                                             case 31:
                                                var43 = var49.v(var48, 31, C0.a, var27) as java.lang.String;
                                                var2 |= Integer.MIN_VALUE;
                                                var42 = var28;
                                                var41 = var29;
                                                var40 = var30;
                                                var39 = var31;
                                                var38 = (java.lang.String)var145;
                                                var37 = var149;
                                                break label99;
                                             default:
                                                throw new n(var7);
                                          }

                                          var26 = var96;
                                          var25 = var84;
                                          var96 = var80;
                                          var84 = var89;
                                          var80 = (java.lang.String)var100;
                                          var89 = var75;
                                          break label79;
                                       }

                                       var64 = var22;
                                       var22 = (java.lang.String)var37;
                                       break label80;
                                    }

                                    var37 = var26;
                                    var38 = (java.lang.String)var25;
                                    var26 = var100;
                                    var25 = var96;
                                    var96 = var89;
                                    var89 = var84;
                                    var84 = var80;
                                    var80 = var75;
                                    break label79;
                                 }

                                 var37 = var149;
                                 var33 = (java.lang.Boolean)var145;
                                 var145 = var31;
                                 var31 = var30;
                                 var30 = var29;
                                 var29 = var28;
                                 var28 = (java.lang.String)var27;
                                 var27 = var109;
                                 var20 = var23;
                                 break label81;
                              }

                              var27 = var111;
                              var111 = var71;
                              var71 = var23;
                              var28 = var43;
                              var29 = (java.lang.String)var42;
                              var30 = (java.lang.String)var41;
                              var31 = var40;
                              var145 = var39;
                              var33 = var38;
                              break label81;
                           }

                           var96 = var80;
                           var84 = var89;
                           var80 = (java.lang.String)var100;
                           var76 = (java.lang.Boolean)var111;
                           var71 = var23;
                           var64 = var22;
                           var39 = var149;
                           var40 = (java.lang.String)var145;
                           var41 = var31;
                           var42 = var30;
                           var43 = var29;
                           var44 = var28;
                           var45 = (java.lang.String)var27;
                           var22 = var64;
                           var89 = var75;
                           var100 = var71;
                           var111 = var25;
                           var23 = (java.lang.String)var26;
                           var25 = var84;
                           var26 = var96;
                           break label82;
                        }

                        var100 = var71;
                        var64 = var22;
                        var76 = (java.lang.Boolean)var111;
                        var71 = var23;
                        var39 = var149;
                        var40 = (java.lang.String)var145;
                        var41 = var31;
                        var42 = var30;
                        var43 = var29;
                        var44 = var28;
                        var45 = (java.lang.String)var27;
                        var22 = var64;
                        var111 = var38;
                        var23 = (java.lang.String)var37;
                        break label82;
                     }

                     var96 = var80;
                     var84 = var89;
                     var80 = (java.lang.String)var100;
                     var76 = (java.lang.Boolean)var111;
                     var71 = var23;
                     var39 = var149;
                     var40 = (java.lang.String)var145;
                     var41 = var31;
                     var42 = var30;
                     var43 = var29;
                     var44 = var28;
                     var45 = (java.lang.String)var27;
                     var89 = var75;
                     var100 = var71;
                     var111 = var25;
                     var23 = (java.lang.String)var26;
                     var25 = var84;
                     var26 = var96;
                     break label82;
                  }

                  var23 = (java.lang.String)var26;
                  var96 = var80;
                  var84 = var89;
                  var80 = (java.lang.String)var100;
                  var64 = var22;
                  var39 = var37;
                  var40 = var33;
                  var41 = var145;
                  var42 = var31;
                  var43 = var30;
                  var44 = var29;
                  var45 = var28;
                  var76 = (java.lang.Boolean)var27;
                  var22 = var64;
                  var89 = var75;
                  var100 = var111;
                  var111 = var25;
                  var25 = var84;
                  var26 = var96;
               }

               var64 = var22;
               var75 = var89;
               var71 = (java.lang.String)var100;
               var84 = (java.lang.String)var25;
               var96 = var26;
               var111 = var76;
               var149 = (java.lang.String)var39;
               var145 = var40;
               var31 = (java.lang.String)var41;
               var30 = (java.lang.String)var42;
               var29 = var43;
               var28 = var44;
               var23 = var71;
               var27 = var45;
               var22 = var64;
               var25 = var111;
               var26 = var23;
               var89 = var84;
               var100 = var80;
               var80 = (java.lang.String)var96;
            }

            var27 = var20;
            var37 = var96;
            var4 = var6;
            var64 = (java.lang.String)var27;
            var84 = var28;
            var71 = var149;
            var96 = var145;
            var41 = var31;
            var38 = (java.lang.String)var19;
            var20 = var30;
            var145 = var23;
            var33 = (java.lang.Boolean)var111;
            var111 = var71;
            var28 = var62;
            var30 = var80;
            var39 = var100;
            var31 = var89;
            var23 = var75;
            var19 = var84;
            var40 = var64;
            var43 = var52;
            var42 = var68;
            var54 = var4;
            var6 = var54;
            var5 = var2;
         }

         var49.b(var48);
         return new GuildInviteEmbedImpl(
            var5,
            0,
            var4,
            var6,
            var54,
            var22,
            (InviteType)var24,
            (Integer)var42,
            (Integer)var25,
            (Integer)var26,
            var43,
            var40,
            (Integer)var19,
            (java.lang.Boolean)var37,
            var23,
            var31,
            (java.lang.Boolean)var39,
            var30,
            var28,
            (Integer)var111,
            (Integer)var27,
            var33,
            (Integer)var145,
            var29,
            var20,
            var38,
            (Integer)var41,
            (Integer)var96,
            var34,
            var71,
            var84,
            (Integer)var35,
            var36,
            var64,
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
         return ia.G.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<GuildInviteEmbedImpl> {
         return GuildInviteEmbedImpl.$serializer.INSTANCE;
      }
   }
}

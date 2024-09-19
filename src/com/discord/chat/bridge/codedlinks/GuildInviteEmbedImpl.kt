package com.discord.chat.bridge.codedlinks

import fl.f
import fl.n
import gl.a
import il.b2
import il.g0
import il.h
import il.n0
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
      val var28: Int = Integer.hashCode(this.backgroundColor);
      val var30: Int = Integer.hashCode(this.borderColor);
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
                                                                                                                                                                                                                                                                           var28
                                                                                                                                                                                                                                                                                 * 31
                                                                                                                                                                                                                                                                              + var30
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
      val var1: Int = this.borderColor;
      val var2: Int = this.headerColor;
      val var8: java.lang.String = this.headerText;
      val var20: InviteType = this.type;
      val var29: Int = this.acceptLabelBackgroundColor;
      val var25: Int = this.acceptLabelBorderColor;
      val var28: Int = this.acceptLabelColor;
      val var17: java.lang.String = this.acceptLabelText;
      val var30: java.lang.String = this.bodyText;
      val var22: Int = this.bodyTextColor;
      val var15: java.lang.Boolean = this.canBeAccepted;
      val var23: java.lang.String = this.channelIcon;
      val var19: java.lang.String = this.channelName;
      val var14: java.lang.Boolean = this.embedCanBeTapped;
      val var21: java.lang.String = this.memberText;
      val var4: java.lang.String = this.onlineText;
      val var11: Int = this.resolvingGradientEnd;
      val var32: Int = this.resolvingGradientStart;
      val var18: java.lang.Boolean = this.splashHasRadialGradient;
      val var9: Int = this.splashOpacity;
      val var31: java.lang.String = this.splashUrl;
      val var16: java.lang.String = this.inviteSplash;
      val var5: java.lang.String = this.subtitle;
      val var24: Int = this.subtitleColor;
      val var6: Int = this.thumbnailBackgroundColor;
      val var26: Int = this.thumbnailCornerRadius;
      val var10: java.lang.String = this.thumbnailText;
      val var27: java.lang.String = this.thumbnailUrl;
      val var7: Int = this.titleColor;
      val var12: java.lang.String = this.titleText;
      val var13: StringBuilder = new StringBuilder();
      var13.append("GuildInviteEmbedImpl(backgroundColor=");
      var13.append(var3);
      var13.append(", borderColor=");
      var13.append(var1);
      var13.append(", headerColor=");
      var13.append(var2);
      var13.append(", headerText=");
      var13.append(var8);
      var13.append(", type=");
      var13.append(var20);
      var13.append(", acceptLabelBackgroundColor=");
      var13.append(var29);
      var13.append(", acceptLabelBorderColor=");
      var13.append(var25);
      var13.append(", acceptLabelColor=");
      var13.append(var28);
      var13.append(", acceptLabelText=");
      var13.append(var17);
      var13.append(", bodyText=");
      var13.append(var30);
      var13.append(", bodyTextColor=");
      var13.append(var22);
      var13.append(", canBeAccepted=");
      var13.append(var15);
      var13.append(", channelIcon=");
      var13.append(var23);
      var13.append(", channelName=");
      var13.append(var19);
      var13.append(", embedCanBeTapped=");
      var13.append(var14);
      var13.append(", memberText=");
      var13.append(var21);
      var13.append(", onlineText=");
      var13.append(var4);
      var13.append(", resolvingGradientEnd=");
      var13.append(var11);
      var13.append(", resolvingGradientStart=");
      var13.append(var32);
      var13.append(", splashHasRadialGradient=");
      var13.append(var18);
      var13.append(", splashOpacity=");
      var13.append(var9);
      var13.append(", splashUrl=");
      var13.append(var31);
      var13.append(", inviteSplash=");
      var13.append(var16);
      var13.append(", subtitle=");
      var13.append(var5);
      var13.append(", subtitleColor=");
      var13.append(var24);
      var13.append(", thumbnailBackgroundColor=");
      var13.append(var6);
      var13.append(", thumbnailCornerRadius=");
      var13.append(var26);
      var13.append(", thumbnailText=");
      var13.append(var10);
      var13.append(", thumbnailUrl=");
      var13.append(var27);
      var13.append(", titleColor=");
      var13.append(var7);
      var13.append(", titleText=");
      var13.append(var12);
      var13.append(")");
      return var13.toString();
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
         val var10: n0 = n0.a;
         val var6: b2 = b2.a;
         val var8: KSerializer = a.u(b2.a);
         val var11: InviteType.Serializer = InviteType.Serializer.INSTANCE;
         val var9: KSerializer = a.u(var10);
         val var1: KSerializer = a.u(var10);
         val var4: KSerializer = a.u(var10);
         val var2: KSerializer = a.u(var6);
         val var7: KSerializer = a.u(var6);
         val var5: KSerializer = a.u(var10);
         val var3: h = h.a;
         return new KSerializer[]{
            var10,
            var10,
            var10,
            var8,
            var11,
            var9,
            var1,
            var4,
            var2,
            var7,
            var5,
            a.u(h.a),
            a.u(var6),
            a.u(var6),
            a.u(var3),
            a.u(var6),
            a.u(var6),
            a.u(var10),
            a.u(var10),
            a.u(var3),
            a.u(var10),
            a.u(var6),
            a.u(var6),
            a.u(var6),
            a.u(var10),
            a.u(var10),
            a.u(var10),
            a.u(var6),
            a.u(var6),
            a.u(var10),
            a.u(var6)
         };
      }

      public open fun deserialize(decoder: Decoder): GuildInviteEmbedImpl {
         q.h(var1, "decoder");
         val var45: SerialDescriptor = this.getDescriptor();
         val var46: c = var1.c(var45);
         val var8: Boolean = var46.y();
         var var2: Int = 0;
         var var32: java.lang.String = null;
         var var3: Int;
         var var4: Int;
         var var5: Int;
         val var6: Int;
         var var15: Int;
         var var16: Any;
         var var18: Any;
         var var19: Int;
         var var20: Int;
         var var21: Int;
         var var22: Any;
         var var23: Any;
         var var24: Any;
         var var25: Any;
         var var26: Int;
         var var27: Int;
         var var28: java.lang.String;
         var var29: Any;
         var var30: Int;
         var var31: Any;
         var var33: Any;
         var var34: Any;
         var var35: Int;
         val var36: Any;
         val var37: Any;
         var var49: Any;
         var var65: Int;
         var var69: Any;
         var var73: Any;
         var var83: Int;
         var var215: Int;
         if (var8) {
            var5 = var46.k(var45, 0);
            var3 = var46.k(var45, 1);
            var2 = var46.k(var45, 2);
            val var9: b2 = b2.a;
            var25 = var46.v(var45, 3, b2.a, null) as java.lang.String;
            var24 = var46.m(var45, 4, InviteType.Serializer.INSTANCE, null) as InviteType;
            var49 = n0.a;
            var27 = var46.v(var45, 5, n0.a, null) as Int;
            var15 = var46.v(var45, 6, (DeserializationStrategy)var49, null) as Int;
            var21 = var46.v(var45, 7, (DeserializationStrategy)var49, null) as Int;
            var29 = var46.v(var45, 8, var9, null) as java.lang.String;
            var16 = var46.v(var45, 9, var9, null) as java.lang.String;
            var19 = var46.v(var45, 10, (DeserializationStrategy)var49, null) as Int;
            val var10: h = h.a;
            var37 = var46.v(var45, 11, h.a, null) as java.lang.Boolean;
            var36 = var46.v(var45, 12, var9, null) as java.lang.String;
            var23 = var46.v(var45, 13, var9, null) as java.lang.String;
            var18 = var46.v(var45, 14, var10, null) as java.lang.Boolean;
            var33 = var46.v(var45, 15, var9, null) as java.lang.String;
            var32 = var46.v(var45, 16, var9, null) as java.lang.String;
            var73 = var46.v(var45, 17, (DeserializationStrategy)var49, null) as Int;
            var69 = var46.v(var45, 18, (DeserializationStrategy)var49, null) as Int;
            val var59: java.lang.Boolean = var46.v(var45, 19, var10, null) as java.lang.Boolean;
            val var11: Int = var46.v(var45, 20, (DeserializationStrategy)var49, null) as Int;
            val var12: java.lang.String = var46.v(var45, 21, var9, null) as java.lang.String;
            val var17: java.lang.String = var46.v(var45, 22, var9, null) as java.lang.String;
            var34 = var46.v(var45, 23, var9, null) as java.lang.String;
            var215 = var46.v(var45, 24, (DeserializationStrategy)var49, null) as Int;
            val var39: Int = var46.v(var45, 25, (DeserializationStrategy)var49, null) as Int;
            var30 = var46.v(var45, 26, (DeserializationStrategy)var49, null) as Int;
            var28 = var46.v(var45, 27, var9, null) as java.lang.String;
            var31 = var46.v(var45, 28, var9, null) as java.lang.String;
            var49 = var46.v(var45, 29, (DeserializationStrategy)var49, null) as Int;
            val var54: java.lang.String = var46.v(var45, 30, var9, null) as java.lang.String;
            var6 = Integer.MAX_VALUE;
            var4 = var2;
            var20 = (Integer)var73;
            var35 = (Integer)var69;
            var69 = var59;
            var26 = var11;
            var22 = var12;
            var73 = var17;
            var65 = var215;
            var215 = var39;
            var83 = (Integer)var49;
            var49 = var54;
         } else {
            var var52: Boolean = true;
            var5 = 0;
            var4 = 0;
            var3 = 0;
            var49 = null;
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
            var15 = null;
            var16 = null;
            var83 = null;
            var18 = null;
            var19 = null;
            var20 = null;
            var21 = null;
            var22 = null;

            while (var52) {
               label137: {
                  label89: {
                     label88: {
                        var var7: Int = var46.x(var45);
                        switch (var7) {
                           case -1:
                              var52 = false;
                              break label88;
                           case 0:
                              var5 = var46.k(var45, 0);
                              var2 |= 1;
                              break label88;
                           case 1:
                              var3 = var46.k(var45, 1);
                              var2 |= 2;
                              break label88;
                           case 2:
                              var4 = var46.k(var45, 2);
                              var2 |= 4;
                              break label88;
                           case 3:
                              var25 = var46.v(var45, 3, b2.a, var25) as java.lang.String;
                              var2 |= 8;
                              break label88;
                           case 4:
                              var16 = var83;
                              var15 = (Integer)var18;
                              var73 = var19;
                              var69 = var20;
                              var65 = var21;
                              var60 = (Integer)var23;
                              var18 = var55;
                              var83 = var46.m(var45, 4, InviteType.Serializer.INSTANCE, var63) as InviteType;
                              var2 |= 16;
                              var55 = (Integer)var24;
                              var63 = var22;
                              var19 = var60;
                              var20 = var65;
                              var21 = (Integer)var69;
                              var22 = var73;
                              var23 = var15;
                              var24 = var16;
                              break label137;
                           case 5:
                              var16 = var83;
                              var15 = (Integer)var18;
                              var73 = var19;
                              var69 = var20;
                              var65 = var21;
                              var19 = var60;
                              var18 = var46.v(var45, 5, n0.a, var55) as Int;
                              var2 |= 32;
                              var83 = (Integer)var63;
                              var55 = (Integer)var24;
                              var60 = (Integer)var23;
                              var63 = var22;
                              var20 = var65;
                              var21 = (Integer)var69;
                              var22 = var73;
                              var23 = var15;
                              var24 = var16;
                              break label137;
                           case 6:
                              var16 = var83;
                              var15 = (Integer)var18;
                              var73 = var19;
                              var69 = var20;
                              var20 = var65;
                              var19 = var46.v(var45, 6, n0.a, var60) as Int;
                              var2 |= 64;
                              var83 = (Integer)var63;
                              var18 = var55;
                              var55 = (Integer)var24;
                              var60 = (Integer)var23;
                              var63 = var22;
                              var65 = var21;
                              var21 = (Integer)var69;
                              var22 = var73;
                              var23 = var15;
                              var24 = var16;
                              break label137;
                           case 7:
                              var16 = var83;
                              var15 = (Integer)var18;
                              var73 = var19;
                              var21 = (Integer)var69;
                              val var119: Int = var46.v(var45, 7, n0.a, var65) as Int;
                              var2 |= 128;
                              var55 = (Integer)var24;
                              var60 = (Integer)var23;
                              var63 = var22;
                              var65 = var21;
                              var69 = var20;
                              var83 = (Integer)var63;
                              var18 = var55;
                              var19 = var60;
                              var20 = var119;
                              var22 = var73;
                              var23 = var15;
                              var24 = var16;
                              break label137;
                           case 8:
                              var24 = var16;
                              var16 = var83;
                              var15 = (Integer)var18;
                              var22 = var73;
                              var21 = var46.v(var45, 8, b2.a, var69) as java.lang.String;
                              var2 |= 256;
                              var55 = (Integer)var24;
                              var60 = (Integer)var23;
                              var63 = var22;
                              var65 = var21;
                              var69 = var20;
                              var73 = var19;
                              var83 = (Integer)var63;
                              var18 = var55;
                              var19 = var60;
                              var20 = var65;
                              var23 = var15;
                              break label137;
                           case 9:
                              var24 = var16;
                              var16 = var83;
                              var23 = var15;
                              var22 = var46.v(var45, 9, b2.a, var73) as java.lang.String;
                              var2 |= 512;
                              var55 = (Integer)var24;
                              var60 = (Integer)var23;
                              var63 = var22;
                              var65 = var21;
                              var69 = var20;
                              var73 = var19;
                              var15 = (Integer)var18;
                              var83 = (Integer)var63;
                              var18 = var55;
                              var19 = var60;
                              var20 = var65;
                              var21 = (Integer)var69;
                              break label137;
                           case 10:
                              var24 = var16;
                              var23 = var46.v(var45, 10, n0.a, var15) as Int;
                              var2 |= 1024;
                              var55 = (Integer)var24;
                              var60 = (Integer)var23;
                              var63 = var22;
                              var65 = var21;
                              var69 = var20;
                              var73 = var19;
                              var15 = (Integer)var18;
                              var16 = var83;
                              var83 = (Integer)var63;
                              var18 = var55;
                              var19 = var60;
                              var20 = var65;
                              var21 = (Integer)var69;
                              var22 = var73;
                              break label137;
                           case 11:
                              var24 = var46.v(var45, 11, h.a, var16) as java.lang.Boolean;
                              var2 |= 2048;
                              var55 = (Integer)var24;
                              var60 = (Integer)var23;
                              var63 = var22;
                              var65 = var21;
                              var69 = var20;
                              var73 = var19;
                              var15 = (Integer)var18;
                              var16 = var83;
                              var83 = (Integer)var63;
                              var18 = var55;
                              var19 = var60;
                              var20 = var65;
                              var21 = (Integer)var69;
                              var22 = var73;
                              var23 = var15;
                              break label137;
                           case 12:
                              val var86: java.lang.String = var46.v(var45, 12, b2.a, var83) as java.lang.String;
                              var2 |= 4096;
                              var55 = (Integer)var24;
                              var60 = (Integer)var23;
                              var63 = var22;
                              var65 = var21;
                              var69 = var20;
                              var73 = var19;
                              var15 = (Integer)var18;
                              var16 = var86;
                              var83 = (Integer)var63;
                              var18 = var55;
                              var19 = var60;
                              var20 = var65;
                              var21 = (Integer)var69;
                              var22 = var73;
                              var23 = var15;
                              var24 = var16;
                              break label137;
                           case 13:
                              val var309: java.lang.String = var46.v(var45, 13, b2.a, var18) as java.lang.String;
                              var2 |= 8192;
                              var16 = var83;
                              var55 = (Integer)var24;
                              var60 = (Integer)var23;
                              var63 = var22;
                              var65 = var21;
                              var69 = var20;
                              var73 = var19;
                              var15 = var309;
                              var83 = (Integer)var63;
                              var18 = var55;
                              var19 = var60;
                              var20 = var65;
                              var21 = (Integer)var69;
                              var22 = var73;
                              var23 = var15;
                              var24 = var16;
                              break label137;
                           case 14:
                              val var308: java.lang.Boolean = var46.v(var45, 14, h.a, var19) as java.lang.Boolean;
                              var2 |= 16384;
                              var23 = var15;
                              var16 = var83;
                              var15 = (Integer)var18;
                              var55 = (Integer)var24;
                              var60 = (Integer)var23;
                              var63 = var22;
                              var65 = var21;
                              var69 = var20;
                              var73 = var308;
                              var83 = (Integer)var63;
                              var18 = var55;
                              var19 = var60;
                              var20 = var65;
                              var21 = (Integer)var69;
                              var22 = var73;
                              var24 = var16;
                              break label137;
                           case 15:
                              val var307: java.lang.String = var46.v(var45, 15, b2.a, var20) as java.lang.String;
                              var2 |= 32768;
                              var23 = var15;
                              var16 = var83;
                              var15 = (Integer)var18;
                              var73 = var19;
                              var55 = (Integer)var24;
                              var60 = (Integer)var23;
                              var63 = var22;
                              var65 = var21;
                              var69 = var307;
                              var83 = (Integer)var63;
                              var18 = var55;
                              var19 = var60;
                              var20 = var65;
                              var21 = (Integer)var69;
                              var22 = var73;
                              var24 = var16;
                              break label137;
                           case 16:
                              val var306: java.lang.String = var46.v(var45, 16, b2.a, var21) as java.lang.String;
                              var2 |= 65536;
                              var16 = var83;
                              var15 = (Integer)var18;
                              var73 = var19;
                              var69 = var20;
                              var55 = (Integer)var24;
                              var60 = (Integer)var23;
                              var63 = var22;
                              var65 = var306;
                              var83 = (Integer)var63;
                              var18 = var55;
                              var19 = var60;
                              var20 = var65;
                              var21 = (Integer)var69;
                              var22 = var73;
                              var23 = var15;
                              var24 = var16;
                              break label137;
                           case 17:
                              val var305: Int = var46.v(var45, 17, n0.a, var22) as Int;
                              var2 |= 131072;
                              var16 = var83;
                              var15 = (Integer)var18;
                              var73 = var19;
                              var69 = var20;
                              var65 = var21;
                              var55 = (Integer)var24;
                              var60 = (Integer)var23;
                              var63 = var305;
                              var83 = (Integer)var63;
                              var18 = var55;
                              var19 = var60;
                              var20 = var65;
                              var21 = (Integer)var69;
                              var22 = var73;
                              var23 = var15;
                              var24 = var16;
                              break label137;
                           case 18:
                              val var304: Int = var46.v(var45, 18, n0.a, var23) as Int;
                              var2 |= 262144;
                              var24 = var16;
                              var16 = var83;
                              var15 = (Integer)var18;
                              var73 = var19;
                              var69 = var20;
                              var65 = var21;
                              var63 = var22;
                              var55 = (Integer)var24;
                              var60 = var304;
                              var83 = (Integer)var63;
                              var18 = var55;
                              var19 = var60;
                              var20 = var65;
                              var21 = (Integer)var69;
                              var22 = var73;
                              var23 = var15;
                              break label137;
                           case 19:
                              val var303: java.lang.Boolean = var46.v(var45, 19, h.a, var24) as java.lang.Boolean;
                              var2 |= 524288;
                              var16 = var83;
                              var15 = (Integer)var18;
                              var73 = var19;
                              var69 = var20;
                              var65 = var21;
                              var63 = var22;
                              var60 = (Integer)var23;
                              var55 = var303;
                              var83 = (Integer)var63;
                              var18 = var55;
                              var19 = var60;
                              var20 = var65;
                              var21 = (Integer)var69;
                              var22 = var73;
                              var23 = var15;
                              var24 = var16;
                              break label137;
                           case 20:
                              var26 = var46.v(var45, 20, n0.a, var26) as Int;
                              var7 = 1048576;
                              break;
                           case 21:
                              var27 = var46.v(var45, 21, b2.a, var27) as java.lang.String;
                              var2 |= 2097152;
                              break label89;
                           case 22:
                              var28 = var46.v(var45, 22, b2.a, var28) as java.lang.String;
                              var2 |= 4194304;
                              break label89;
                           case 23:
                              var34 = var46.v(var45, 23, b2.a, var34) as java.lang.String;
                              var2 |= 8388608;
                              break label89;
                           case 24:
                              var29 = var46.v(var45, 24, n0.a, var29) as Int;
                              var2 |= 16777216;
                              break label89;
                           case 25:
                              var30 = var46.v(var45, 25, n0.a, var30) as Int;
                              var2 |= 33554432;
                              break label89;
                           case 26:
                              var49 = var46.v(var45, 26, n0.a, var49) as Int;
                              var7 = 67108864;
                              break;
                           case 27:
                              var32 = var46.v(var45, 27, b2.a, var32) as java.lang.String;
                              var2 |= 134217728;
                              break label89;
                           case 28:
                              var31 = var46.v(var45, 28, b2.a, var31) as java.lang.String;
                              var2 |= 268435456;
                              break label89;
                           case 29:
                              var33 = var46.v(var45, 29, n0.a, var33) as Int;
                              var2 |= 536870912;
                              break label89;
                           case 30:
                              var35 = var46.v(var45, 30, b2.a, var35) as java.lang.String;
                              var2 |= 1073741824;
                              break label89;
                           default:
                              throw new n(var7);
                        }

                        var2 |= var7;
                        break label89;
                     }

                     var16 = var83;
                     var15 = (Integer)var18;
                     var73 = var19;
                     var69 = var20;
                     var65 = var21;
                     var63 = var22;
                     var60 = (Integer)var23;
                     var55 = (Integer)var24;
                     var83 = (Integer)var63;
                     var18 = var55;
                     var19 = var60;
                     var20 = var65;
                     var21 = (Integer)var69;
                     var22 = var73;
                     var23 = var15;
                     var24 = var16;
                     break label137;
                  }

                  var16 = var83;
                  var15 = (Integer)var18;
                  var73 = var19;
                  var69 = var20;
                  var24 = var16;
                  var23 = var15;
                  var22 = var73;
                  var21 = (Integer)var69;
                  var20 = var65;
                  var19 = var60;
                  var18 = var55;
                  var83 = (Integer)var63;
                  var65 = var21;
                  var63 = var22;
                  var60 = (Integer)var23;
                  var55 = (Integer)var24;
               }

               var63 = var83;
               var55 = (Integer)var18;
               var60 = var19;
               var65 = var20;
               var69 = var21;
               var73 = var22;
               var15 = (Integer)var23;
               var16 = var24;
               var23 = var60;
               var24 = var55;
               var83 = (Integer)var16;
               var18 = var15;
               var19 = (Integer)var73;
               var20 = (Integer)var69;
               var21 = var65;
               var22 = var63;
            }

            var215 = var30;
            var30 = (Integer)var49;
            var33 = var20;
            var36 = var83;
            var21 = var65;
            var49 = var35;
            var83 = (Integer)var33;
            var28 = var32;
            var65 = (Integer)var29;
            var73 = var28;
            var22 = var27;
            var69 = var24;
            var35 = (Integer)var23;
            var20 = (Integer)var22;
            var32 = var21;
            var18 = var19;
            var23 = var18;
            var37 = var16;
            var19 = var15;
            var16 = var73;
            var29 = var69;
            var15 = var60;
            var27 = var55;
            var24 = var63;
            var6 = var2;
         }

         var46.b(var45);
         return new GuildInviteEmbedImpl(
            var6,
            var5,
            var3,
            var4,
            (java.lang.String)var25,
            (InviteType)var24,
            var27,
            var15,
            var21,
            (java.lang.String)var29,
            (java.lang.String)var16,
            var19,
            (java.lang.Boolean)var37,
            (java.lang.String)var36,
            (java.lang.String)var23,
            (java.lang.Boolean)var18,
            (java.lang.String)var33,
            var32,
            var20,
            var35,
            (java.lang.Boolean)var69,
            var26,
            (java.lang.String)var22,
            (java.lang.String)var73,
            (java.lang.String)var34,
            var65,
            var215,
            var30,
            var28,
            (java.lang.String)var31,
            var83,
            (java.lang.String)var49,
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
         return il.g0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<GuildInviteEmbedImpl> {
         return GuildInviteEmbedImpl.$serializer.INSTANCE;
      }
   }
}

package com.discord.chat.bridge.codedlinks

import cl.f
import cl.n
import com.discord.chat.bridge.structurabletext.AnnotatedStructurableText
import com.discord.chat.bridge.structurabletext.AnnotatedStructurableTextSerializer
import dl.a
import fl.b2
import fl.g0
import fl.h
import fl.n0
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor

@f
public data class EmbeddedActivityInviteEmbedImpl(backgroundColor: Int,
      borderColor: Int,
      headerColor: Int,
      headerText: String?,
      type: InviteType? = ...,
      acceptLabelBackgroundColor: Int? = ...,
      acceptLabelBorderColor: Int? = ...,
      acceptLabelColor: Int? = ...,
      acceptLabelText: String? = ...,
      bodyText: String? = ...,
      bodyTextColor: Int? = ...,
      canBeAccepted: Boolean? = ...,
      embedCanBeTapped: Boolean? = ...,
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
      participantAvatarUris: List<String>,
      extendedType: CodedLinkExtendedType = ...,
      structurableSubtitleText: AnnotatedStructurableText? = ...,
      noParticipantsText: String,
      ctaEnabled: Boolean
   )
   : CodedLinkEmbed,
   EmbeddedActivityInviteEmbed {
   public open val acceptLabelBackgroundColor: Int?
   public open val acceptLabelBorderColor: Int?
   public open val acceptLabelColor: Int?
   public open val acceptLabelText: String?
   public open val backgroundColor: Int
   public open val bodyText: String?
   public open val bodyTextColor: Int?
   public open val borderColor: Int
   public open val canBeAccepted: Boolean?
   public open val ctaEnabled: Boolean
   public open val embedCanBeTapped: Boolean?
   public open val extendedType: CodedLinkExtendedType
   public open val headerColor: Int
   public open val headerText: String?
   public open val inviteSplash: String?
   public open val noParticipantsText: String
   public open val participantAvatarUris: List<String>
   public open val resolvingGradientEnd: Int?
   public open val resolvingGradientStart: Int?
   public open val splashHasRadialGradient: Boolean?
   public open val splashOpacity: Int?
   public open val splashUrl: String?
   public open val structurableSubtitleText: AnnotatedStructurableText?
   public open val subtitle: String?
   public open val subtitleColor: Int?
   public open val thumbnailBackgroundColor: Int?
   public open val thumbnailCornerRadius: Int?
   public open val thumbnailText: String?
   public open val thumbnailUrl: String?
   public open val titleColor: Int?
   public open val titleText: String?
   public open val type: InviteType?

   init {
      q.h(var28, "participantAvatarUris");
      q.h(var29, "extendedType");
      q.h(var31, "noParticipantsText");
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
      this.embedCanBeTapped = var13;
      this.resolvingGradientEnd = var14;
      this.resolvingGradientStart = var15;
      this.splashHasRadialGradient = var16;
      this.splashOpacity = var17;
      this.splashUrl = var18;
      this.inviteSplash = var19;
      this.subtitle = var20;
      this.subtitleColor = var21;
      this.thumbnailBackgroundColor = var22;
      this.thumbnailCornerRadius = var23;
      this.thumbnailText = var24;
      this.thumbnailUrl = var25;
      this.titleColor = var26;
      this.titleText = var27;
      this.participantAvatarUris = var28;
      this.extendedType = var29;
      this.structurableSubtitleText = var30;
      this.noParticipantsText = var31;
      this.ctaEnabled = var32;
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

   public operator fun component13(): Boolean? {
      return this.embedCanBeTapped;
   }

   public operator fun component14(): Int? {
      return this.resolvingGradientEnd;
   }

   public operator fun component15(): Int? {
      return this.resolvingGradientStart;
   }

   public operator fun component16(): Boolean? {
      return this.splashHasRadialGradient;
   }

   public operator fun component17(): Int? {
      return this.splashOpacity;
   }

   public operator fun component18(): String? {
      return this.splashUrl;
   }

   public operator fun component19(): String? {
      return this.inviteSplash;
   }

   public operator fun component2(): Int {
      return this.borderColor;
   }

   public operator fun component20(): String? {
      return this.subtitle;
   }

   public operator fun component21(): Int? {
      return this.subtitleColor;
   }

   public operator fun component22(): Int? {
      return this.thumbnailBackgroundColor;
   }

   public operator fun component23(): Int? {
      return this.thumbnailCornerRadius;
   }

   public operator fun component24(): String? {
      return this.thumbnailText;
   }

   public operator fun component25(): String? {
      return this.thumbnailUrl;
   }

   public operator fun component26(): Int? {
      return this.titleColor;
   }

   public operator fun component27(): String? {
      return this.titleText;
   }

   public operator fun component28(): List<String> {
      return this.participantAvatarUris;
   }

   public operator fun component29(): CodedLinkExtendedType {
      return this.extendedType;
   }

   public operator fun component3(): Int {
      return this.headerColor;
   }

   public operator fun component30(): AnnotatedStructurableText? {
      return this.structurableSubtitleText;
   }

   public operator fun component31(): String {
      return this.noParticipantsText;
   }

   public operator fun component32(): Boolean {
      return this.ctaEnabled;
   }

   public operator fun component4(): String? {
      return this.headerText;
   }

   public operator fun component5(): InviteType? {
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
      type: InviteType? = ...,
      acceptLabelBackgroundColor: Int? = ...,
      acceptLabelBorderColor: Int? = ...,
      acceptLabelColor: Int? = ...,
      acceptLabelText: String? = ...,
      bodyText: String? = ...,
      bodyTextColor: Int? = ...,
      canBeAccepted: Boolean? = ...,
      embedCanBeTapped: Boolean? = ...,
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
      participantAvatarUris: List<String> = ...,
      extendedType: CodedLinkExtendedType = ...,
      structurableSubtitleText: AnnotatedStructurableText? = ...,
      noParticipantsText: String = ...,
      ctaEnabled: Boolean = ...
   ): EmbeddedActivityInviteEmbedImpl {
      q.h(var28, "participantAvatarUris");
      q.h(var29, "extendedType");
      q.h(var31, "noParticipantsText");
      return new EmbeddedActivityInviteEmbedImpl(
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
      } else if (var1 !is EmbeddedActivityInviteEmbedImpl) {
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
         } else if (!q.c(this.embedCanBeTapped, var1.embedCanBeTapped)) {
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
         } else if (!q.c(this.participantAvatarUris, var1.participantAvatarUris)) {
            return false;
         } else if (this.extendedType != var1.extendedType) {
            return false;
         } else if (!q.c(this.structurableSubtitleText, var1.structurableSubtitleText)) {
            return false;
         } else if (!q.c(this.noParticipantsText, var1.noParticipantsText)) {
            return false;
         } else {
            return this.ctaEnabled == var1.ctaEnabled;
         }
      }
   }

   public override fun hashCode(): Int {
      val var26: Int = Integer.hashCode(this.backgroundColor);
      val var28: Int = Integer.hashCode(this.borderColor);
      val var27: Int = Integer.hashCode(this.headerColor);
      var var25: Int = 0;
      val var1: Int;
      if (this.headerText == null) {
         var1 = 0;
      } else {
         var1 = this.headerText.hashCode();
      }

      val var2: Int;
      if (this.type == null) {
         var2 = 0;
      } else {
         var2 = this.type.hashCode();
      }

      val var3: Int;
      if (this.acceptLabelBackgroundColor == null) {
         var3 = 0;
      } else {
         var3 = this.acceptLabelBackgroundColor.hashCode();
      }

      val var4: Int;
      if (this.acceptLabelBorderColor == null) {
         var4 = 0;
      } else {
         var4 = this.acceptLabelBorderColor.hashCode();
      }

      val var5: Int;
      if (this.acceptLabelColor == null) {
         var5 = 0;
      } else {
         var5 = this.acceptLabelColor.hashCode();
      }

      val var6: Int;
      if (this.acceptLabelText == null) {
         var6 = 0;
      } else {
         var6 = this.acceptLabelText.hashCode();
      }

      val var7: Int;
      if (this.bodyText == null) {
         var7 = 0;
      } else {
         var7 = this.bodyText.hashCode();
      }

      val var8: Int;
      if (this.bodyTextColor == null) {
         var8 = 0;
      } else {
         var8 = this.bodyTextColor.hashCode();
      }

      val var9: Int;
      if (this.canBeAccepted == null) {
         var9 = 0;
      } else {
         var9 = this.canBeAccepted.hashCode();
      }

      val var10: Int;
      if (this.embedCanBeTapped == null) {
         var10 = 0;
      } else {
         var10 = this.embedCanBeTapped.hashCode();
      }

      val var11: Int;
      if (this.resolvingGradientEnd == null) {
         var11 = 0;
      } else {
         var11 = this.resolvingGradientEnd.hashCode();
      }

      val var12: Int;
      if (this.resolvingGradientStart == null) {
         var12 = 0;
      } else {
         var12 = this.resolvingGradientStart.hashCode();
      }

      val var13: Int;
      if (this.splashHasRadialGradient == null) {
         var13 = 0;
      } else {
         var13 = this.splashHasRadialGradient.hashCode();
      }

      val var14: Int;
      if (this.splashOpacity == null) {
         var14 = 0;
      } else {
         var14 = this.splashOpacity.hashCode();
      }

      val var15: Int;
      if (this.splashUrl == null) {
         var15 = 0;
      } else {
         var15 = this.splashUrl.hashCode();
      }

      val var16: Int;
      if (this.inviteSplash == null) {
         var16 = 0;
      } else {
         var16 = this.inviteSplash.hashCode();
      }

      val var17: Int;
      if (this.subtitle == null) {
         var17 = 0;
      } else {
         var17 = this.subtitle.hashCode();
      }

      val var18: Int;
      if (this.subtitleColor == null) {
         var18 = 0;
      } else {
         var18 = this.subtitleColor.hashCode();
      }

      val var19: Int;
      if (this.thumbnailBackgroundColor == null) {
         var19 = 0;
      } else {
         var19 = this.thumbnailBackgroundColor.hashCode();
      }

      val var20: Int;
      if (this.thumbnailCornerRadius == null) {
         var20 = 0;
      } else {
         var20 = this.thumbnailCornerRadius.hashCode();
      }

      val var21: Int;
      if (this.thumbnailText == null) {
         var21 = 0;
      } else {
         var21 = this.thumbnailText.hashCode();
      }

      val var22: Int;
      if (this.thumbnailUrl == null) {
         var22 = 0;
      } else {
         var22 = this.thumbnailUrl.hashCode();
      }

      val var23: Int;
      if (this.titleColor == null) {
         var23 = 0;
      } else {
         var23 = this.titleColor.hashCode();
      }

      val var24: Int;
      if (this.titleText == null) {
         var24 = 0;
      } else {
         var24 = this.titleText.hashCode();
      }

      val var29: Int = this.participantAvatarUris.hashCode();
      val var30: Int = this.extendedType.hashCode();
      if (this.structurableSubtitleText != null) {
         var25 = this.structurableSubtitleText.hashCode();
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
                                                                                                                                                                                                                                                                                    var26
                                                                                                                                                                                                                                                                                          * 31
                                                                                                                                                                                                                                                                                       + var28
                                                                                                                                                                                                                                                                                 )
                                                                                                                                                                                                                                                                                 * 31
                                                                                                                                                                                                                                                                              + var27
                                                                                                                                                                                                                                                                        )
                                                                                                                                                                                                                                                                        * 31
                                                                                                                                                                                                                                                                     + var1
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
                                             + var29
                                       )
                                       * 31
                                    + var30
                              )
                              * 31
                           + var25
                     )
                     * 31
                  + this.noParticipantsText.hashCode()
            )
            * 31
         + java.lang.Boolean.hashCode(this.ctaEnabled);
   }

   public override fun toString(): String {
      val var1: Int = this.backgroundColor;
      val var2: Int = this.borderColor;
      val var3: Int = this.headerColor;
      val var14: java.lang.String = this.headerText;
      val var9: InviteType = this.type;
      val var21: Int = this.acceptLabelBackgroundColor;
      val var8: Int = this.acceptLabelBorderColor;
      val var33: Int = this.acceptLabelColor;
      val var7: java.lang.String = this.acceptLabelText;
      val var10: java.lang.String = this.bodyText;
      val var15: Int = this.bodyTextColor;
      val var27: java.lang.Boolean = this.canBeAccepted;
      val var5: java.lang.Boolean = this.embedCanBeTapped;
      val var22: Int = this.resolvingGradientEnd;
      val var24: Int = this.resolvingGradientStart;
      val var11: java.lang.Boolean = this.splashHasRadialGradient;
      val var23: Int = this.splashOpacity;
      val var29: java.lang.String = this.splashUrl;
      val var18: java.lang.String = this.inviteSplash;
      val var28: java.lang.String = this.subtitle;
      val var13: Int = this.subtitleColor;
      val var30: Int = this.thumbnailBackgroundColor;
      val var19: Int = this.thumbnailCornerRadius;
      val var12: java.lang.String = this.thumbnailText;
      val var31: java.lang.String = this.thumbnailUrl;
      val var26: Int = this.titleColor;
      val var6: java.lang.String = this.titleText;
      val var16: java.util.List = this.participantAvatarUris;
      val var25: CodedLinkExtendedType = this.extendedType;
      val var32: AnnotatedStructurableText = this.structurableSubtitleText;
      val var17: java.lang.String = this.noParticipantsText;
      val var4: Boolean = this.ctaEnabled;
      val var20: StringBuilder = new StringBuilder();
      var20.append("EmbeddedActivityInviteEmbedImpl(backgroundColor=");
      var20.append(var1);
      var20.append(", borderColor=");
      var20.append(var2);
      var20.append(", headerColor=");
      var20.append(var3);
      var20.append(", headerText=");
      var20.append(var14);
      var20.append(", type=");
      var20.append(var9);
      var20.append(", acceptLabelBackgroundColor=");
      var20.append(var21);
      var20.append(", acceptLabelBorderColor=");
      var20.append(var8);
      var20.append(", acceptLabelColor=");
      var20.append(var33);
      var20.append(", acceptLabelText=");
      var20.append(var7);
      var20.append(", bodyText=");
      var20.append(var10);
      var20.append(", bodyTextColor=");
      var20.append(var15);
      var20.append(", canBeAccepted=");
      var20.append(var27);
      var20.append(", embedCanBeTapped=");
      var20.append(var5);
      var20.append(", resolvingGradientEnd=");
      var20.append(var22);
      var20.append(", resolvingGradientStart=");
      var20.append(var24);
      var20.append(", splashHasRadialGradient=");
      var20.append(var11);
      var20.append(", splashOpacity=");
      var20.append(var23);
      var20.append(", splashUrl=");
      var20.append(var29);
      var20.append(", inviteSplash=");
      var20.append(var18);
      var20.append(", subtitle=");
      var20.append(var28);
      var20.append(", subtitleColor=");
      var20.append(var13);
      var20.append(", thumbnailBackgroundColor=");
      var20.append(var30);
      var20.append(", thumbnailCornerRadius=");
      var20.append(var19);
      var20.append(", thumbnailText=");
      var20.append(var12);
      var20.append(", thumbnailUrl=");
      var20.append(var31);
      var20.append(", titleColor=");
      var20.append(var26);
      var20.append(", titleText=");
      var20.append(var6);
      var20.append(", participantAvatarUris=");
      var20.append(var16);
      var20.append(", extendedType=");
      var20.append(var25);
      var20.append(", structurableSubtitleText=");
      var20.append(var32);
      var20.append(", noParticipantsText=");
      var20.append(var17);
      var20.append(", ctaEnabled=");
      var20.append(var4);
      var20.append(")");
      return var20.toString();
   }

   public object `$serializer` : g0 {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: EmbeddedActivityInviteEmbedImpl.$serializer = new EmbeddedActivityInviteEmbedImpl.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor(
            "com.discord.chat.bridge.codedlinks.EmbeddedActivityInviteEmbedImpl", var0, 32
         );
         var1.l("backgroundColor", false);
         var1.l("borderColor", false);
         var1.l("headerColor", false);
         var1.l("headerText", false);
         var1.l("type", true);
         var1.l("acceptLabelBackgroundColor", true);
         var1.l("acceptLabelBorderColor", true);
         var1.l("acceptLabelColor", true);
         var1.l("acceptLabelText", true);
         var1.l("bodyText", true);
         var1.l("bodyTextColor", true);
         var1.l("canBeAccepted", true);
         var1.l("embedCanBeTapped", true);
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
         var1.l("participantAvatarUris", false);
         var1.l("extendedType", true);
         var1.l("structurableSubtitleText", true);
         var1.l("noParticipantsText", false);
         var1.l("ctaEnabled", false);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         val var1: Array<KSerializer> = EmbeddedActivityInviteEmbedImpl.access$get$childSerializers$cp();
         val var7: n0 = n0.a;
         val var4: b2 = b2.a;
         val var11: KSerializer = a.u(b2.a);
         val var8: KSerializer = a.u(InviteType.Serializer.INSTANCE);
         val var9: KSerializer = a.u(var7);
         val var12: KSerializer = a.u(var7);
         val var6: KSerializer = a.u(var7);
         val var10: KSerializer = a.u(var4);
         val var5: KSerializer = a.u(var4);
         val var2: KSerializer = a.u(var7);
         val var3: h = h.a;
         return new KSerializer[]{
            var7,
            var7,
            var7,
            var11,
            var8,
            var9,
            var12,
            var6,
            var10,
            var5,
            var2,
            a.u(h.a),
            a.u(var3),
            a.u(var7),
            a.u(var7),
            a.u(var3),
            a.u(var7),
            a.u(var4),
            a.u(var4),
            a.u(var4),
            a.u(var7),
            a.u(var7),
            a.u(var7),
            a.u(var4),
            a.u(var4),
            a.u(var7),
            a.u(var4),
            var1[27],
            CodedLinkExtendedType.Serializer.INSTANCE,
            a.u(AnnotatedStructurableTextSerializer.INSTANCE),
            var4,
            var3
         };
      }

      public open fun deserialize(decoder: Decoder): EmbeddedActivityInviteEmbedImpl {
         q.h(var1, "decoder");
         val var45: SerialDescriptor = this.getDescriptor();
         val var46: c = var1.c(var45);
         var var37: Array<KSerializer> = EmbeddedActivityInviteEmbedImpl.access$get$childSerializers$cp();
         val var9: Boolean = var46.y();
         var var34: AnnotatedStructurableText = null;
         var var2: Int;
         var var3: Int;
         var var5: Int;
         var var6: Int;
         var var7: Int;
         var var14: Int;
         var var17: Any;
         var var18: Any;
         var var19: Any;
         var var20: Any;
         var var21: Any;
         var var22: Any;
         var var23: java.lang.String;
         var var24: java.lang.String;
         var var25: Any;
         var var26: Any;
         val var27: java.lang.String;
         var var28: Any;
         var var29: Any;
         var var30: java.lang.String;
         var var32: Any;
         var var33: java.lang.String;
         var var35: Any;
         var var36: java.lang.String;
         var var38: java.lang.String;
         val var39: java.lang.String;
         val var40: Any;
         val var48: java.lang.String;
         var var67: Any;
         var var74: java.lang.String;
         var var154: AnnotatedStructurableText;
         if (var9) {
            var6 = var46.k(var45, 0);
            var5 = var46.k(var45, 1);
            var3 = var46.k(var45, 2);
            val var47: b2 = b2.a;
            var36 = var46.v(var45, 3, b2.a, null) as java.lang.String;
            var22 = var46.v(var45, 4, InviteType.Serializer.INSTANCE, null) as InviteType;
            val var10: n0 = n0.a;
            var21 = var46.v(var45, 5, n0.a, null) as Int;
            var26 = var46.v(var45, 6, var10, null) as Int;
            var19 = var46.v(var45, 7, var10, null) as Int;
            var27 = var46.v(var45, 8, var47, null) as java.lang.String;
            var23 = var46.v(var45, 9, var47, null) as java.lang.String;
            val var16: Int = var46.v(var45, 10, var10, null) as Int;
            val var11: h = h.a;
            var17 = var46.v(var45, 11, h.a, null) as java.lang.Boolean;
            var34 = var46.v(var45, 12, var11, null) as java.lang.Boolean;
            var25 = var46.v(var45, 13, var10, null) as Int;
            var40 = var46.v(var45, 14, var10, null) as Int;
            var29 = var46.v(var45, 15, var11, null) as java.lang.Boolean;
            var20 = var46.v(var45, 16, var10, null) as Int;
            var24 = var46.v(var45, 17, var47, null) as java.lang.String;
            var38 = var46.v(var45, 18, var47, null) as java.lang.String;
            var30 = var46.v(var45, 19, var47, null) as java.lang.String;
            val var59: Int = var46.v(var45, 20, var10, null) as Int;
            var32 = var46.v(var45, 21, var10, null) as Int;
            val var15: Int = var46.v(var45, 22, var10, null) as Int;
            var39 = var46.v(var45, 23, var47, null) as java.lang.String;
            var33 = var46.v(var45, 24, var47, null) as java.lang.String;
            var14 = var46.v(var45, 25, var10, null) as Int;
            val var31: java.lang.String = var46.v(var45, 26, var47, null) as java.lang.String;
            var67 = var46.m(var45, 27, var37[27], null) as java.util.List;
            val var12: CodedLinkExtendedType = var46.m(var45, 28, CodedLinkExtendedType.Serializer.INSTANCE, null) as CodedLinkExtendedType;
            val var54: AnnotatedStructurableText = var46.v(var45, 29, AnnotatedStructurableTextSerializer.INSTANCE, null) as AnnotatedStructurableText;
            var48 = var46.t(var45, 30);
            var2 = var46.s(var45, 31);
            var7 = -1;
            var18 = var16;
            var28 = var59;
            var35 = var15;
            var74 = var31;
            var37 = (KSerializer[])var67;
            var67 = var12;
            var154 = var54;
         } else {
            var var8: Boolean = true;
            var7 = 0;
            var6 = 0;
            var5 = 0;
            var var4: Int = 0;
            var3 = 0;
            var var149: Int = null;
            var26 = null;
            var30 = null;
            var154 = null;
            var29 = null;
            var28 = null;
            var25 = null;
            var var49: java.lang.String = null;
            var24 = null;
            var35 = null;
            var33 = null;
            var36 = null;
            var22 = null;
            var var55: Any = null;
            var var65: Any = null;
            var var60: Any = null;
            var21 = null;
            var var85: java.lang.String = null;
            var67 = null;
            var18 = null;
            var19 = null;
            var23 = null;
            var14 = null;
            var74 = null;
            var17 = null;
            var32 = null;
            var20 = null;

            while (var8) {
               label108: {
                  label138: {
                     label91: {
                        label90: {
                           var2 = var46.x(var45);
                           switch (var2) {
                              case -1:
                                 var85 = (java.lang.String)var19;
                                 var67 = var74;
                                 var8 = false;
                                 var24 = (java.lang.String)var67;
                                 var23 = var85;
                                 var22 = var21;
                                 var21 = var60;
                                 var20 = var65;
                                 var19 = var55;
                                 var18 = var22;
                                 var17 = var18;
                                 var74 = var23;
                                 var65 = var17;
                                 var60 = var20;
                                 var55 = var24;
                                 var2 = var7;
                                 break label108;
                              case 0:
                                 var85 = (java.lang.String)var19;
                                 var67 = var74;
                                 var65 = var17;
                                 var60 = var20;
                                 var55 = var24;
                                 var6 = var46.k(var45, 0);
                                 var2 = var7 or 1;
                                 var74 = var23;
                                 var17 = var18;
                                 var18 = var22;
                                 var19 = var55;
                                 var20 = var65;
                                 var21 = var60;
                                 var22 = var21;
                                 var23 = var85;
                                 var24 = (java.lang.String)var67;
                                 break label108;
                              case 1:
                                 var5 = var46.k(var45, 1);
                                 var2 = var7 or 2;
                                 break label90;
                              case 2:
                                 var4 = var46.k(var45, 2);
                                 var2 = var7 or 4;
                                 break label90;
                              case 3:
                                 var36 = var46.v(var45, 3, b2.a, var36) as java.lang.String;
                                 var2 = var7 or 8;
                                 break label90;
                              case 4:
                                 var85 = (java.lang.String)var19;
                                 var67 = var74;
                                 var65 = var17;
                                 var60 = var20;
                                 var19 = var55;
                                 var20 = var46.v(var45, 4, InviteType.Serializer.INSTANCE, var22) as InviteType;
                                 var2 = var7 or 16;
                                 var55 = var24;
                                 var74 = var23;
                                 var17 = var18;
                                 var18 = var20;
                                 var20 = var65;
                                 var21 = var60;
                                 var22 = var21;
                                 var23 = var85;
                                 var24 = (java.lang.String)var67;
                                 break label108;
                              case 5:
                                 var85 = (java.lang.String)var19;
                                 var67 = var74;
                                 var60 = var20;
                                 var20 = var65;
                                 var19 = var46.v(var45, 5, n0.a, var55) as Int;
                                 var2 = var7 or 32;
                                 var55 = var24;
                                 var65 = var17;
                                 var74 = var23;
                                 var17 = var18;
                                 var18 = var22;
                                 var21 = var60;
                                 var22 = var21;
                                 var23 = var85;
                                 var24 = (java.lang.String)var67;
                                 break label108;
                              case 6:
                                 var85 = (java.lang.String)var19;
                                 var67 = var74;
                                 var21 = var60;
                                 var20 = var46.v(var45, 6, n0.a, var65) as Int;
                                 var2 = var7 or 64;
                                 var19 = var55;
                                 var55 = var24;
                                 var60 = var20;
                                 var65 = var17;
                                 var74 = var23;
                                 var17 = var18;
                                 var18 = var22;
                                 var22 = var21;
                                 var23 = var85;
                                 var24 = (java.lang.String)var67;
                                 break label108;
                              case 7:
                                 var85 = (java.lang.String)var19;
                                 var67 = var74;
                                 var21 = var46.v(var45, 7, n0.a, var60) as Int;
                                 var2 = var7 or 128;
                                 var55 = var24;
                                 var60 = var20;
                                 var65 = var17;
                                 var74 = var23;
                                 var17 = var18;
                                 var18 = var22;
                                 var19 = var55;
                                 var20 = var65;
                                 var22 = var21;
                                 var23 = var85;
                                 var24 = (java.lang.String)var67;
                                 break label108;
                              case 8:
                                 var67 = var74;
                                 var23 = var85;
                                 val var144: java.lang.String = var46.v(var45, 8, b2.a, var21) as java.lang.String;
                                 var2 = var7 or 256;
                                 var21 = var60;
                                 var55 = var24;
                                 var60 = var20;
                                 var65 = var17;
                                 var74 = var23;
                                 var85 = (java.lang.String)var19;
                                 var17 = var18;
                                 var18 = var22;
                                 var19 = var55;
                                 var20 = var65;
                                 var22 = var144;
                                 var24 = (java.lang.String)var67;
                                 break label108;
                              case 9:
                                 var24 = (java.lang.String)var67;
                                 var38 = var46.v(var45, 9, b2.a, var85) as java.lang.String;
                                 var2 = var7 or 512;
                                 var55 = var24;
                                 var60 = var20;
                                 var65 = var17;
                                 var67 = var74;
                                 var74 = var23;
                                 var85 = (java.lang.String)var19;
                                 var17 = var18;
                                 var18 = var22;
                                 var19 = var55;
                                 var20 = var65;
                                 var21 = var60;
                                 var22 = var21;
                                 var23 = var38;
                                 break label108;
                              case 10:
                                 var17 = var18;
                                 var24 = var46.v(var45, 10, n0.a, var67) as Int;
                                 var2 = var7 or 1024;
                                 var18 = var22;
                                 var20 = var65;
                                 var55 = var24;
                                 var60 = var20;
                                 var65 = var17;
                                 var67 = var74;
                                 var74 = var23;
                                 var85 = (java.lang.String)var19;
                                 var19 = var55;
                                 var21 = var60;
                                 var22 = var21;
                                 var23 = var85;
                                 break label108;
                              case 11:
                                 val var269: java.lang.Boolean = var46.v(var45, 11, h.a, var18) as java.lang.Boolean;
                                 var2 = var7 or 2048;
                                 var18 = var22;
                                 var55 = var24;
                                 var60 = var20;
                                 var65 = var17;
                                 var67 = var74;
                                 var74 = var23;
                                 var85 = (java.lang.String)var19;
                                 var17 = var269;
                                 var19 = var55;
                                 var20 = var65;
                                 var21 = var60;
                                 var22 = var21;
                                 var23 = var85;
                                 var24 = (java.lang.String)var67;
                                 break label108;
                              case 12:
                                 val var268: java.lang.Boolean = var46.v(var45, 12, h.a, var19) as java.lang.Boolean;
                                 var2 = var7 or 4096;
                                 var19 = var55;
                                 var55 = var24;
                                 var60 = var20;
                                 var65 = var17;
                                 var67 = var74;
                                 var74 = var23;
                                 var85 = var268;
                                 var17 = var18;
                                 var18 = var22;
                                 var20 = var65;
                                 var21 = var60;
                                 var22 = var21;
                                 var23 = var85;
                                 var24 = (java.lang.String)var67;
                                 break label108;
                              case 13:
                                 val var267: Int = var46.v(var45, 13, n0.a, var23) as Int;
                                 var2 = var7 or 8192;
                                 var20 = var65;
                                 var85 = (java.lang.String)var19;
                                 var55 = var24;
                                 var60 = var20;
                                 var65 = var17;
                                 var67 = var74;
                                 var74 = var267;
                                 var17 = var18;
                                 var18 = var22;
                                 var19 = var55;
                                 var21 = var60;
                                 var22 = var21;
                                 var23 = var85;
                                 var24 = (java.lang.String)var67;
                                 break label108;
                              case 14:
                                 var14 = var46.v(var45, 14, n0.a, var14) as Int;
                                 var2 = var7 or 16384;
                                 var85 = (java.lang.String)var19;
                                 var55 = var24;
                                 var60 = var20;
                                 var65 = var17;
                                 var67 = var74;
                                 var74 = var23;
                                 var17 = var18;
                                 var18 = var22;
                                 var19 = var55;
                                 var20 = var65;
                                 var21 = var60;
                                 var22 = var21;
                                 var23 = var85;
                                 var24 = (java.lang.String)var67;
                                 break label108;
                              case 15:
                                 val var77: java.lang.Boolean = var46.v(var45, 15, h.a, var74) as java.lang.Boolean;
                                 var2 = var7 or '耀';
                                 var20 = var65;
                                 var85 = (java.lang.String)var19;
                                 var55 = var24;
                                 var60 = var20;
                                 var65 = var17;
                                 var67 = var77;
                                 var74 = var23;
                                 var17 = var18;
                                 var18 = var22;
                                 var19 = var55;
                                 var21 = var60;
                                 var22 = var21;
                                 var23 = var85;
                                 var24 = (java.lang.String)var67;
                                 break label108;
                              case 16:
                                 var17 = var46.v(var45, 16, n0.a, var17) as Int;
                                 var2 = var7 or 65536;
                                 var24 = (java.lang.String)var67;
                                 var85 = (java.lang.String)var19;
                                 var67 = var74;
                                 var55 = var24;
                                 var60 = var20;
                                 var65 = var17;
                                 var74 = var23;
                                 var17 = var18;
                                 var18 = var22;
                                 var19 = var55;
                                 var20 = var65;
                                 var21 = var60;
                                 var22 = var21;
                                 var23 = var85;
                                 break label108;
                              case 17:
                                 val var279: java.lang.String = var46.v(var45, 17, b2.a, var20) as java.lang.String;
                                 var2 = var7 or 131072;
                                 var24 = (java.lang.String)var67;
                                 var85 = (java.lang.String)var19;
                                 var67 = var74;
                                 var65 = var17;
                                 var55 = var24;
                                 var60 = var279;
                                 var74 = var23;
                                 var17 = var18;
                                 var18 = var22;
                                 var19 = var55;
                                 var20 = var65;
                                 var21 = var60;
                                 var22 = var21;
                                 var23 = var85;
                                 break label108;
                              case 18:
                                 val var278: java.lang.String = var46.v(var45, 18, b2.a, var24) as java.lang.String;
                                 var2 = var7 or 262144;
                                 var22 = var21;
                                 var24 = (java.lang.String)var67;
                                 var85 = (java.lang.String)var19;
                                 var67 = var74;
                                 var65 = var17;
                                 var60 = var20;
                                 var55 = var278;
                                 var74 = var23;
                                 var17 = var18;
                                 var18 = var22;
                                 var19 = var55;
                                 var20 = var65;
                                 var21 = var60;
                                 var23 = var85;
                                 break label108;
                              case 19:
                                 var49 = var46.v(var45, 19, b2.a, var49) as java.lang.String;
                                 var2 = var7 or 524288;
                                 break label138;
                              case 20:
                                 var25 = var46.v(var45, 20, n0.a, var25) as Int;
                                 var2 = 1048576;
                                 break;
                              case 21:
                                 var28 = var46.v(var45, 21, n0.a, var28) as Int;
                                 var2 = 2097152;
                                 break;
                              case 22:
                                 var30 = var46.v(var45, 22, n0.a, var30) as Int;
                                 var2 = 4194304;
                                 break;
                              case 23:
                                 var29 = var46.v(var45, 23, b2.a, var29) as java.lang.String;
                                 var2 = 8388608;
                                 break;
                              case 24:
                                 var26 = var46.v(var45, 24, b2.a, var26) as java.lang.String;
                                 var2 = 16777216;
                                 break;
                              case 25:
                                 var149 = var46.v(var45, 25, n0.a, var149) as Int;
                                 var2 = 33554432;
                                 break;
                              case 26:
                                 var33 = var46.v(var45, 26, b2.a, var33) as java.lang.String;
                                 var2 = var7 or 67108864;
                                 break label91;
                              case 27:
                                 var154 = var46.m(var45, 27, var37[27], var154) as java.util.List;
                                 var2 = var7 or 134217728;
                                 break label91;
                              case 28:
                                 var35 = var46.m(var45, 28, CodedLinkExtendedType.Serializer.INSTANCE, var35) as CodedLinkExtendedType;
                                 var2 = var7 or 268435456;
                                 break label91;
                              case 29:
                                 var34 = var46.v(var45, 29, AnnotatedStructurableTextSerializer.INSTANCE, var34) as AnnotatedStructurableText;
                                 var2 = var7 or 536870912;
                                 break label91;
                              case 30:
                                 var32 = var46.t(var45, 30);
                                 var2 = var7 or 1073741824;
                                 break label138;
                              case 31:
                                 var3 = var46.s(var45, 31);
                                 var2 = var7 or Integer.MIN_VALUE;
                                 break label138;
                              default:
                                 throw new n(var2);
                           }

                           var2 = var7 or var2;
                           break label91;
                        }

                        var21 = var60;
                        var85 = (java.lang.String)var19;
                        var67 = var74;
                        var65 = var17;
                        var60 = var20;
                        var55 = var24;
                        var74 = var23;
                        var17 = var18;
                        var18 = var22;
                        var19 = var55;
                        var20 = var65;
                        var22 = var21;
                        var23 = var85;
                        var24 = (java.lang.String)var67;
                        break label108;
                     }

                     var22 = var21;
                     var85 = (java.lang.String)var19;
                     var67 = var74;
                     var65 = var17;
                     var60 = var20;
                     var55 = var24;
                     var74 = var23;
                     var17 = var18;
                     var18 = var22;
                     var19 = var55;
                     var20 = var65;
                     var21 = var60;
                     var23 = var85;
                     var24 = (java.lang.String)var67;
                     break label108;
                  }

                  var85 = (java.lang.String)var19;
                  var60 = var20;
                  var24 = (java.lang.String)var67;
                  var23 = var85;
                  var22 = var21;
                  var21 = var60;
                  var20 = var65;
                  var19 = var55;
                  var18 = var22;
                  var17 = var18;
                  var74 = var23;
                  var67 = var74;
                  var65 = var17;
                  var55 = var24;
               }

               var65 = var20;
               var60 = var21;
               var21 = var22;
               var85 = var23;
               var67 = var24;
               var7 = var2;
               var24 = (java.lang.String)var55;
               var22 = var18;
               var55 = var19;
               var18 = var17;
               var19 = var85;
               var23 = var74;
               var74 = (java.lang.String)var67;
               var17 = var65;
               var20 = var60;
            }

            var18 = var67;
            var2 = var3;
            var40 = var14;
            var48 = (java.lang.String)var32;
            var154 = var34;
            var67 = var35;
            var37 = var154;
            var33 = (java.lang.String)var26;
            var74 = var33;
            var14 = var149;
            var32 = var28;
            var39 = (java.lang.String)var29;
            var35 = var30;
            var28 = var25;
            var17 = var18;
            var30 = var49;
            var38 = var24;
            var24 = (java.lang.String)var20;
            var20 = var17;
            var29 = var74;
            var25 = var23;
            var34 = (AnnotatedStructurableText)var19;
            var23 = var85;
            var27 = (java.lang.String)var21;
            var19 = var60;
            var26 = var65;
            var21 = var55;
            var3 = var4;
         }

         var46.b(var45);
         return new EmbeddedActivityInviteEmbedImpl(
            var7,
            0,
            var6,
            var5,
            var3,
            var36,
            (InviteType)var22,
            (Integer)var21,
            (Integer)var26,
            (Integer)var19,
            var27,
            var23,
            (Integer)var18,
            (java.lang.Boolean)var17,
            var34,
            (Integer)var25,
            (Integer)var40,
            (java.lang.Boolean)var29,
            (Integer)var20,
            var24,
            var38,
            var30,
            (Integer)var28,
            (Integer)var32,
            (Integer)var35,
            var39,
            var33,
            var14,
            var74,
            var37,
            (CodedLinkExtendedType)var67,
            var154,
            var48,
            (boolean)var2,
            null
         );
      }

      public open fun serialize(encoder: Encoder, value: EmbeddedActivityInviteEmbedImpl) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.c(var3);
         EmbeddedActivityInviteEmbedImpl.write$Self$chat_release(var2, var4, var3);
         var4.b(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return fl.g0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<EmbeddedActivityInviteEmbedImpl> {
         return EmbeddedActivityInviteEmbedImpl.$serializer.INSTANCE;
      }
   }
}

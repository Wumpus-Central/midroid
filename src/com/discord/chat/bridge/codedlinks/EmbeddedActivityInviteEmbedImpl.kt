package com.discord.chat.bridge.codedlinks

import Y9.f
import Y9.n
import Z9.a
import ba.C0
import ba.G
import ba.N
import ba.h
import com.discord.chat.bridge.structurabletext.AnnotatedStructurableText
import com.discord.chat.bridge.structurabletext.AnnotatedStructurableTextSerializer
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
      val var27: Int = Integer.hashCode(this.backgroundColor);
      val var26: Int = Integer.hashCode(this.borderColor);
      val var28: Int = Integer.hashCode(this.headerColor);
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

      val var30: Int = this.participantAvatarUris.hashCode();
      val var29: Int = this.extendedType.hashCode();
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
                                                                                                                                                                                                                                                                                    var27
                                                                                                                                                                                                                                                                                          * 31
                                                                                                                                                                                                                                                                                       + var26
                                                                                                                                                                                                                                                                                 )
                                                                                                                                                                                                                                                                                 * 31
                                                                                                                                                                                                                                                                              + var28
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
                                             + var30
                                       )
                                       * 31
                                    + var29
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
      val var2: Int = this.backgroundColor;
      val var1: Int = this.borderColor;
      val var3: Int = this.headerColor;
      val var19: java.lang.String = this.headerText;
      val var32: InviteType = this.type;
      val var14: Int = this.acceptLabelBackgroundColor;
      val var16: Int = this.acceptLabelBorderColor;
      val var7: Int = this.acceptLabelColor;
      val var18: java.lang.String = this.acceptLabelText;
      val var22: java.lang.String = this.bodyText;
      val var26: Int = this.bodyTextColor;
      val var5: java.lang.Boolean = this.canBeAccepted;
      val var28: java.lang.Boolean = this.embedCanBeTapped;
      val var9: Int = this.resolvingGradientEnd;
      val var29: Int = this.resolvingGradientStart;
      val var21: java.lang.Boolean = this.splashHasRadialGradient;
      val var11: Int = this.splashOpacity;
      val var23: java.lang.String = this.splashUrl;
      val var6: java.lang.String = this.inviteSplash;
      val var30: java.lang.String = this.subtitle;
      val var24: Int = this.subtitleColor;
      val var25: Int = this.thumbnailBackgroundColor;
      val var17: Int = this.thumbnailCornerRadius;
      val var31: java.lang.String = this.thumbnailText;
      val var12: java.lang.String = this.thumbnailUrl;
      val var20: Int = this.titleColor;
      val var15: java.lang.String = this.titleText;
      val var33: java.util.List = this.participantAvatarUris;
      val var8: CodedLinkExtendedType = this.extendedType;
      val var13: AnnotatedStructurableText = this.structurableSubtitleText;
      val var10: java.lang.String = this.noParticipantsText;
      val var4: Boolean = this.ctaEnabled;
      val var27: StringBuilder = new StringBuilder();
      var27.append("EmbeddedActivityInviteEmbedImpl(backgroundColor=");
      var27.append(var2);
      var27.append(", borderColor=");
      var27.append(var1);
      var27.append(", headerColor=");
      var27.append(var3);
      var27.append(", headerText=");
      var27.append(var19);
      var27.append(", type=");
      var27.append(var32);
      var27.append(", acceptLabelBackgroundColor=");
      var27.append(var14);
      var27.append(", acceptLabelBorderColor=");
      var27.append(var16);
      var27.append(", acceptLabelColor=");
      var27.append(var7);
      var27.append(", acceptLabelText=");
      var27.append(var18);
      var27.append(", bodyText=");
      var27.append(var22);
      var27.append(", bodyTextColor=");
      var27.append(var26);
      var27.append(", canBeAccepted=");
      var27.append(var5);
      var27.append(", embedCanBeTapped=");
      var27.append(var28);
      var27.append(", resolvingGradientEnd=");
      var27.append(var9);
      var27.append(", resolvingGradientStart=");
      var27.append(var29);
      var27.append(", splashHasRadialGradient=");
      var27.append(var21);
      var27.append(", splashOpacity=");
      var27.append(var11);
      var27.append(", splashUrl=");
      var27.append(var23);
      var27.append(", inviteSplash=");
      var27.append(var6);
      var27.append(", subtitle=");
      var27.append(var30);
      var27.append(", subtitleColor=");
      var27.append(var24);
      var27.append(", thumbnailBackgroundColor=");
      var27.append(var25);
      var27.append(", thumbnailCornerRadius=");
      var27.append(var17);
      var27.append(", thumbnailText=");
      var27.append(var31);
      var27.append(", thumbnailUrl=");
      var27.append(var12);
      var27.append(", titleColor=");
      var27.append(var20);
      var27.append(", titleText=");
      var27.append(var15);
      var27.append(", participantAvatarUris=");
      var27.append(var33);
      var27.append(", extendedType=");
      var27.append(var8);
      var27.append(", structurableSubtitleText=");
      var27.append(var13);
      var27.append(", noParticipantsText=");
      var27.append(var10);
      var27.append(", ctaEnabled=");
      var27.append(var4);
      var27.append(")");
      return var27.toString();
   }

   public object `$serializer` : G {
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
         val var28: Array<KSerializer> = EmbeddedActivityInviteEmbedImpl.access$get$childSerializers$cp();
         val var20: N = N.a;
         val var19: C0 = C0.a;
         val var15: KSerializer = a.u(C0.a);
         val var11: KSerializer = a.u(InviteType.Serializer.INSTANCE);
         val var26: KSerializer = a.u(var20);
         val var16: KSerializer = a.u(var20);
         val var6: KSerializer = a.u(var20);
         val var1: KSerializer = a.u(var19);
         val var12: KSerializer = a.u(var19);
         val var9: KSerializer = a.u(var20);
         val var10: h = h.a;
         return new KSerializer[]{
            var20,
            var20,
            var20,
            var15,
            var11,
            var26,
            var16,
            var6,
            var1,
            var12,
            var9,
            a.u(h.a),
            a.u(var10),
            a.u(var20),
            a.u(var20),
            a.u(var10),
            a.u(var20),
            a.u(var19),
            a.u(var19),
            a.u(var19),
            a.u(var20),
            a.u(var20),
            a.u(var20),
            a.u(var19),
            a.u(var19),
            a.u(var20),
            a.u(var19),
            var28[27],
            CodedLinkExtendedType.Serializer.INSTANCE,
            a.u(AnnotatedStructurableTextSerializer.INSTANCE),
            var19,
            var10
         };
      }

      public open fun deserialize(decoder: Decoder): EmbeddedActivityInviteEmbedImpl {
         q.h(var1, "decoder");
         val var44: SerialDescriptor = this.getDescriptor();
         val var45: c = var1.c(var44);
         val var43: Array<KSerializer> = EmbeddedActivityInviteEmbedImpl.access$get$childSerializers$cp();
         var var3: Int;
         var var5: Int;
         val var6: Int;
         var var7: Int;
         var var12: Any;
         var var14: Any;
         var var15: Any;
         var var17: Any;
         var var18: Any;
         var var20: Any;
         var var22: Any;
         var var23: Any;
         var var25: Int;
         var var26: Any;
         var var27: Any;
         var var28: Any;
         var var29: Any;
         var var30: java.lang.Boolean;
         var var31: Any;
         var var32: Any;
         var var33: Any;
         var var34: java.lang.Boolean;
         var var35: Any;
         var var36: java.lang.Boolean;
         var var37: Any;
         var var49: Int;
         var var55: Any;
         var var59: Any;
         var var63: Any;
         var var69: Any;
         var var82: Any;
         var var109: Any;
         var var117: Any;
         if (var45.y()) {
            var7 = var45.k(var44, 0);
            var3 = var45.k(var44, 1);
            var49 = var45.k(var44, 2);
            val var46: C0 = C0.a;
            var20 = var45.v(var44, 3, C0.a, null) as java.lang.String;
            var27 = var45.v(var44, 4, InviteType.Serializer.INSTANCE, null) as InviteType;
            var55 = N.a;
            var28 = var45.v(var44, 5, N.a, null) as Int;
            var25 = var45.v(var44, 6, (DeserializationStrategy)var55, null) as Int;
            var29 = var45.v(var44, 7, (DeserializationStrategy)var55, null) as Int;
            var26 = var45.v(var44, 8, var46, null) as java.lang.String;
            var109 = var45.v(var44, 9, var46, null) as java.lang.String;
            var33 = var45.v(var44, 10, (DeserializationStrategy)var55, null) as Int;
            var59 = h.a;
            var30 = var45.v(var44, 11, h.a, null) as java.lang.Boolean;
            var34 = var45.v(var44, 12, (DeserializationStrategy)var59, null) as java.lang.Boolean;
            var35 = var45.v(var44, 13, (DeserializationStrategy)var55, null) as Int;
            var31 = var45.v(var44, 14, (DeserializationStrategy)var55, null) as Int;
            var36 = var45.v(var44, 15, (DeserializationStrategy)var59, null) as java.lang.Boolean;
            var14 = var45.v(var44, 16, (DeserializationStrategy)var55, null) as Int;
            var22 = var45.v(var44, 17, var46, null) as java.lang.String;
            var117 = var45.v(var44, 18, var46, null) as java.lang.String;
            var63 = var45.v(var44, 19, var46, null) as java.lang.String;
            var23 = var45.v(var44, 20, (DeserializationStrategy)var55, null) as Int;
            val var19: Int = var45.v(var44, 21, (DeserializationStrategy)var55, null) as Int;
            var18 = var45.v(var44, 22, (DeserializationStrategy)var55, null) as Int;
            var17 = var45.v(var44, 23, var46, null) as java.lang.String;
            var82 = var45.v(var44, 24, var46, null) as java.lang.String;
            var15 = var45.v(var44, 25, (DeserializationStrategy)var55, null) as Int;
            var59 = var45.v(var44, 26, var46, null) as java.lang.String;
            var12 = var45.m(var44, 27, var43[27], null) as java.util.List;
            var69 = var45.m(var44, 28, CodedLinkExtendedType.Serializer.INSTANCE, null) as CodedLinkExtendedType;
            val var47: AnnotatedStructurableText = var45.v(var44, 29, AnnotatedStructurableTextSerializer.INSTANCE, null) as AnnotatedStructurableText;
            var55 = var45.t(var44, 30);
            val var4: Byte = var45.s(var44, 31);
            var5 = -1;
            var6 = var49;
            var32 = var109;
            var109 = var117;
            var117 = var63;
            var63 = var19;
            var37 = var82;
            var82 = var69;
            var69 = var47;
            var49 = var4;
         } else {
            var var53: Boolean = true;
            var3 = 0;
            var5 = 0;
            var7 = 0;
            var var51: Int = 0;
            var25 = null;
            var30 = null;
            var29 = null;
            var28 = null;
            var27 = null;
            var34 = null;
            var33 = null;
            var32 = null;
            var26 = null;
            var var48: Any = null;
            var17 = null;
            var18 = null;
            var117 = null;
            var20 = null;
            var22 = null;
            var23 = null;
            var109 = null;
            var69 = null;
            var63 = null;
            var12 = null;
            var14 = null;
            var15 = null;
            var82 = null;
            var59 = null;
            var31 = null;
            var55 = null;
            var35 = null;
            var var103: Any = null;
            var49 = 0;

            while (var53) {
               label155: {
                  label154: {
                     label153: {
                        label152: {
                           label151: {
                              label193: {
                                 label194: {
                                    label136: {
                                       label135: {
                                          label195: {
                                             label122: {
                                                label121: {
                                                   val var8: Int = var45.x(var44);
                                                   switch (var8) {
                                                      case -1:
                                                         var53 = false;
                                                         break label194;
                                                      case 0:
                                                         var5 = var45.k(var44, 0);
                                                         var51 |= 1;
                                                         break label194;
                                                      case 1:
                                                         var3 = var45.k(var44, 1);
                                                         var51 |= 2;
                                                         break label194;
                                                      case 2:
                                                         var49 = var45.k(var44, 2);
                                                         var51 |= 4;
                                                         break label194;
                                                      case 3:
                                                         var103 = var45.v(var44, 3, C0.a, var103) as java.lang.String;
                                                         var51 |= 8;
                                                         break label194;
                                                      case 4:
                                                         var27 = var45.v(var44, 4, InviteType.Serializer.INSTANCE, var27) as InviteType;
                                                         var51 |= 16;
                                                         break;
                                                      case 5:
                                                         var28 = var45.v(var44, 5, N.a, var28) as Int;
                                                         var51 |= 32;
                                                         break label121;
                                                      case 6:
                                                         var25 = var45.v(var44, 6, N.a, var25) as Int;
                                                         var51 |= 64;
                                                         break label121;
                                                      case 7:
                                                         var29 = var45.v(var44, 7, N.a, var29) as Int;
                                                         var51 |= 128;
                                                         break label121;
                                                      case 8:
                                                         var26 = var45.v(var44, 8, C0.a, var26) as java.lang.String;
                                                         var51 |= 256;
                                                         break;
                                                      case 9:
                                                         var32 = var45.v(var44, 9, C0.a, var32) as java.lang.String;
                                                         var51 |= 512;
                                                         break label122;
                                                      case 10:
                                                         var33 = var45.v(var44, 10, N.a, var33) as Int;
                                                         var51 |= 1024;
                                                         break label122;
                                                      case 11:
                                                         var30 = var45.v(var44, 11, h.a, var30) as java.lang.Boolean;
                                                         var51 |= 2048;
                                                         break label121;
                                                      case 12:
                                                         var34 = var45.v(var44, 12, h.a, var34) as java.lang.Boolean;
                                                         var51 |= 4096;
                                                         break label122;
                                                      case 13:
                                                         var18 = var17;
                                                         var48 = var45.v(var44, 13, N.a, var48) as Int;
                                                         var51 |= 8192;
                                                         var36 = (java.lang.Boolean)var27;
                                                         var37 = var26;
                                                         var17 = var18;
                                                         break label195;
                                                      case 14:
                                                         val var180: Int = var45.v(var44, 14, N.a, var17) as Int;
                                                         var51 |= 16384;
                                                         var36 = (java.lang.Boolean)var27;
                                                         var37 = var26;
                                                         var17 = var18;
                                                         var18 = var180;
                                                         break label195;
                                                      case 15:
                                                         var36 = var45.v(var44, 15, h.a, var18) as java.lang.Boolean;
                                                         var51 |= 32768;
                                                         var18 = var17;
                                                         var17 = var36;
                                                         var37 = var26;
                                                         var36 = (java.lang.Boolean)var27;
                                                         break label195;
                                                      case 16:
                                                         var117 = var45.v(var44, 16, N.a, var117) as Int;
                                                         var51 |= 65536;
                                                         break label135;
                                                      case 17:
                                                         var20 = var45.v(var44, 17, C0.a, var20) as java.lang.String;
                                                         var51 |= 131072;
                                                         break label135;
                                                      case 18:
                                                         val var138: java.lang.String = var45.v(var44, 18, C0.a, var22) as java.lang.String;
                                                         var51 |= 262144;
                                                         var22 = var20;
                                                         var20 = var138;
                                                         break label151;
                                                      case 19:
                                                         var23 = var45.v(var44, 19, C0.a, var23) as java.lang.String;
                                                         var51 |= 524288;
                                                         break label152;
                                                      case 20:
                                                         var109 = var45.v(var44, 20, N.a, var109) as Int;
                                                         var51 |= 1048576;
                                                         break label152;
                                                      case 21:
                                                         var37 = var45.v(var44, 21, N.a, var69) as Int;
                                                         var51 |= 2097152;
                                                         var82 = var55;
                                                         var55 = var82;
                                                         var59 = var15;
                                                         var63 = var14;
                                                         var69 = var63;
                                                         var14 = var37;
                                                         var15 = var59;
                                                         break label153;
                                                      case 22:
                                                         val var175: Int = var45.v(var44, 22, N.a, var63) as Int;
                                                         var51 |= 4194304;
                                                         var82 = var55;
                                                         var55 = var82;
                                                         var59 = var15;
                                                         var63 = var14;
                                                         var69 = var175;
                                                         var14 = var69;
                                                         var15 = var59;
                                                         break label153;
                                                      case 23:
                                                         var12 = var45.v(var44, 23, C0.a, var12) as java.lang.String;
                                                         var51 |= 8388608;
                                                         var82 = var55;
                                                         var69 = var63;
                                                         var55 = var82;
                                                         var59 = var15;
                                                         var63 = var14;
                                                         var14 = var69;
                                                         var15 = var59;
                                                         break label153;
                                                      case 24:
                                                         val var173: java.lang.String = var45.v(var44, 24, C0.a, var14) as java.lang.String;
                                                         var51 |= 16777216;
                                                         var82 = var55;
                                                         var14 = var69;
                                                         var69 = var63;
                                                         var55 = var82;
                                                         var59 = var15;
                                                         var63 = var173;
                                                         var15 = var59;
                                                         break label153;
                                                      case 25:
                                                         val var172: Int = var45.v(var44, 25, N.a, var15) as Int;
                                                         var51 |= 33554432;
                                                         var82 = var55;
                                                         var15 = var59;
                                                         var69 = var63;
                                                         var63 = var14;
                                                         var55 = var82;
                                                         var59 = var172;
                                                         var14 = var69;
                                                         break label153;
                                                      case 26:
                                                         val var171: java.lang.String = var45.v(var44, 26, C0.a, var82) as java.lang.String;
                                                         var51 |= 67108864;
                                                         var82 = var55;
                                                         var69 = var63;
                                                         var63 = var14;
                                                         var59 = var15;
                                                         var55 = var171;
                                                         var14 = var69;
                                                         var15 = var59;
                                                         break label153;
                                                      case 27:
                                                         var37 = var45.m(var44, 27, var43[27], var59) as java.util.List;
                                                         var51 |= 134217728;
                                                         var69 = var63;
                                                         var63 = var14;
                                                         var59 = var15;
                                                         var55 = var82;
                                                         var14 = var69;
                                                         var15 = var37;
                                                         var82 = var55;
                                                         break label153;
                                                      case 28:
                                                         var31 = var45.m(var44, 28, CodedLinkExtendedType.Serializer.INSTANCE, var31) as CodedLinkExtendedType;
                                                         var51 |= 268435456;
                                                         break label136;
                                                      case 29:
                                                         var55 = var45.v(var44, 29, AnnotatedStructurableTextSerializer.INSTANCE, var55) as AnnotatedStructurableText;
                                                         var51 |= 536870912;
                                                         break label136;
                                                      case 30:
                                                         var35 = var45.t(var44, 30);
                                                         var51 |= 1073741824;
                                                         break label154;
                                                      case 31:
                                                         var7 = var45.s(var44, 31);
                                                         var51 |= Integer.MIN_VALUE;
                                                         break label154;
                                                      default:
                                                         throw new n(var8);
                                                   }

                                                   var17 = var18;
                                                   var36 = (java.lang.Boolean)var27;
                                                   var37 = var26;
                                                   var18 = var17;
                                                   break label195;
                                                }

                                                var17 = var18;
                                                var36 = (java.lang.Boolean)var27;
                                                var37 = var26;
                                                var18 = var17;
                                                break label195;
                                             }

                                             var18 = var27;
                                             var17 = var26;
                                             var27 = var18;
                                             var26 = var17;
                                             break label193;
                                          }

                                          var26 = var18;
                                          var27 = var17;
                                          var17 = var37;
                                          var18 = var36;
                                          break label193;
                                       }

                                       var22 = var20;
                                       var20 = var22;
                                       break label151;
                                    }

                                    var63 = var14;
                                    var82 = var55;
                                    var15 = var59;
                                    var14 = var69;
                                    var69 = var63;
                                    var59 = var15;
                                    var55 = var82;
                                    break label153;
                                 }

                                 var69 = var63;
                                 var63 = var14;
                                 var17 = var103;
                                 var82 = var55;
                                 var18 = var20;
                                 var103 = var109;
                                 var36 = (java.lang.Boolean)var27;
                                 var37 = var26;
                                 var55 = var82;
                                 var59 = var15;
                                 var14 = var69;
                                 var15 = var59;
                                 var20 = var22;
                                 var109 = var18;
                                 var22 = var17;
                                 break label155;
                              }

                              var69 = var63;
                              var63 = var14;
                              var82 = var55;
                              var36 = (java.lang.Boolean)var18;
                              var37 = var17;
                              var17 = var103;
                              var18 = var20;
                              var103 = var109;
                              var55 = var82;
                              var59 = var15;
                              var14 = var69;
                              var15 = var59;
                              var20 = var22;
                              var109 = var27;
                              var22 = var26;
                              break label155;
                           }

                           var69 = var63;
                           var63 = var14;
                           var55 = var82;
                           var17 = var103;
                           var15 = var59;
                           var103 = var109;
                           var36 = (java.lang.Boolean)var27;
                           var37 = var26;
                           var18 = var22;
                           var59 = var15;
                           var14 = var69;
                           var82 = var55;
                           var109 = var18;
                           var22 = var17;
                           break label155;
                        }

                        var69 = var63;
                        var63 = var14;
                        var59 = var15;
                        var55 = var82;
                        var18 = var20;
                        var17 = var103;
                        var36 = (java.lang.Boolean)var27;
                        var37 = var26;
                        var103 = var109;
                        var14 = var69;
                        var15 = var59;
                        var20 = var22;
                        var82 = var55;
                        var109 = var18;
                        var22 = var17;
                        break label155;
                     }

                     var18 = var20;
                     var17 = var103;
                     var36 = (java.lang.Boolean)var27;
                     var37 = var26;
                     var103 = var109;
                     var20 = var22;
                     var109 = var18;
                     var22 = var17;
                     break label155;
                  }

                  var69 = var63;
                  var63 = var14;
                  var59 = var15;
                  var55 = var82;
                  var18 = var20;
                  var17 = var103;
                  var36 = (java.lang.Boolean)var27;
                  var37 = var26;
                  var103 = var109;
                  var14 = var69;
                  var15 = var59;
                  var20 = var22;
                  var82 = var55;
                  var109 = var18;
                  var22 = var17;
               }

               var63 = var69;
               var69 = var14;
               var18 = var109;
               var27 = var36;
               var103 = var17;
               var26 = var37;
               var17 = var22;
               var20 = var18;
               var22 = var20;
               var109 = var103;
               var14 = var63;
               var15 = var59;
               var82 = var55;
               var59 = var15;
               var55 = var82;
            }

            var59 = var82;
            var37 = var14;
            var63 = var69;
            var14 = var117;
            var36 = (java.lang.Boolean)var18;
            var82 = var31;
            var55 = var35;
            var6 = var49;
            var49 = var7;
            var69 = var55;
            var12 = var59;
            var17 = var12;
            var18 = var63;
            var23 = var109;
            var117 = var23;
            var109 = var22;
            var22 = var20;
            var31 = var17;
            var35 = var48;
            var20 = var103;
            var7 = var5;
            var5 = var51;
         }

         var45.b(var44);
         return new EmbeddedActivityInviteEmbedImpl(
            var5,
            0,
            var7,
            var3,
            var6,
            (java.lang.String)var20,
            (InviteType)var27,
            (Integer)var28,
            var25,
            (Integer)var29,
            (java.lang.String)var26,
            (java.lang.String)var32,
            (Integer)var33,
            var30,
            var34,
            (Integer)var35,
            (Integer)var31,
            var36,
            (Integer)var14,
            (java.lang.String)var22,
            (java.lang.String)var109,
            (java.lang.String)var117,
            (Integer)var23,
            (Integer)var63,
            (Integer)var18,
            (java.lang.String)var17,
            (java.lang.String)var37,
            (Integer)var15,
            (java.lang.String)var59,
            (java.util.List)var12,
            (CodedLinkExtendedType)var82,
            (AnnotatedStructurableText)var69,
            (java.lang.String)var55,
            (boolean)var49,
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
         return ba.G.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<EmbeddedActivityInviteEmbedImpl> {
         return EmbeddedActivityInviteEmbedImpl.$serializer.INSTANCE;
      }
   }
}

package com.discord.chat.bridge.codedlinks

import com.discord.chat.bridge.structurabletext.AnnotatedStructurableText
import com.discord.chat.bridge.structurabletext.AnnotatedStructurableTextSerializer
import ea.f
import ea.n
import fa.a
import ha.C0
import ha.G
import ha.N
import ha.h
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
      val var28: Int = Integer.hashCode(this.borderColor);
      val var26: Int = Integer.hashCode(this.headerColor);
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
                                                                                                                                                                                                                                                                                    var27
                                                                                                                                                                                                                                                                                          * 31
                                                                                                                                                                                                                                                                                       + var28
                                                                                                                                                                                                                                                                                 )
                                                                                                                                                                                                                                                                                 * 31
                                                                                                                                                                                                                                                                              + var26
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
      val var2: Int = this.backgroundColor;
      val var3: Int = this.borderColor;
      val var1: Int = this.headerColor;
      val var20: java.lang.String = this.headerText;
      val var8: InviteType = this.type;
      val var31: Int = this.acceptLabelBackgroundColor;
      val var27: Int = this.acceptLabelBorderColor;
      val var32: Int = this.acceptLabelColor;
      val var33: java.lang.String = this.acceptLabelText;
      val var30: java.lang.String = this.bodyText;
      val var5: Int = this.bodyTextColor;
      val var22: java.lang.Boolean = this.canBeAccepted;
      val var21: java.lang.Boolean = this.embedCanBeTapped;
      val var18: Int = this.resolvingGradientEnd;
      val var6: Int = this.resolvingGradientStart;
      val var10: java.lang.Boolean = this.splashHasRadialGradient;
      val var24: Int = this.splashOpacity;
      val var17: java.lang.String = this.splashUrl;
      val var9: java.lang.String = this.inviteSplash;
      val var29: java.lang.String = this.subtitle;
      val var23: Int = this.subtitleColor;
      val var11: Int = this.thumbnailBackgroundColor;
      val var7: Int = this.thumbnailCornerRadius;
      val var14: java.lang.String = this.thumbnailText;
      val var15: java.lang.String = this.thumbnailUrl;
      val var28: Int = this.titleColor;
      val var12: java.lang.String = this.titleText;
      val var13: java.util.List = this.participantAvatarUris;
      val var19: CodedLinkExtendedType = this.extendedType;
      val var16: AnnotatedStructurableText = this.structurableSubtitleText;
      val var26: java.lang.String = this.noParticipantsText;
      val var4: Boolean = this.ctaEnabled;
      val var25: StringBuilder = new StringBuilder();
      var25.append("EmbeddedActivityInviteEmbedImpl(backgroundColor=");
      var25.append(var2);
      var25.append(", borderColor=");
      var25.append(var3);
      var25.append(", headerColor=");
      var25.append(var1);
      var25.append(", headerText=");
      var25.append(var20);
      var25.append(", type=");
      var25.append(var8);
      var25.append(", acceptLabelBackgroundColor=");
      var25.append(var31);
      var25.append(", acceptLabelBorderColor=");
      var25.append(var27);
      var25.append(", acceptLabelColor=");
      var25.append(var32);
      var25.append(", acceptLabelText=");
      var25.append(var33);
      var25.append(", bodyText=");
      var25.append(var30);
      var25.append(", bodyTextColor=");
      var25.append(var5);
      var25.append(", canBeAccepted=");
      var25.append(var22);
      var25.append(", embedCanBeTapped=");
      var25.append(var21);
      var25.append(", resolvingGradientEnd=");
      var25.append(var18);
      var25.append(", resolvingGradientStart=");
      var25.append(var6);
      var25.append(", splashHasRadialGradient=");
      var25.append(var10);
      var25.append(", splashOpacity=");
      var25.append(var24);
      var25.append(", splashUrl=");
      var25.append(var17);
      var25.append(", inviteSplash=");
      var25.append(var9);
      var25.append(", subtitle=");
      var25.append(var29);
      var25.append(", subtitleColor=");
      var25.append(var23);
      var25.append(", thumbnailBackgroundColor=");
      var25.append(var11);
      var25.append(", thumbnailCornerRadius=");
      var25.append(var7);
      var25.append(", thumbnailText=");
      var25.append(var14);
      var25.append(", thumbnailUrl=");
      var25.append(var15);
      var25.append(", titleColor=");
      var25.append(var28);
      var25.append(", titleText=");
      var25.append(var12);
      var25.append(", participantAvatarUris=");
      var25.append(var13);
      var25.append(", extendedType=");
      var25.append(var19);
      var25.append(", structurableSubtitleText=");
      var25.append(var16);
      var25.append(", noParticipantsText=");
      var25.append(var26);
      var25.append(", ctaEnabled=");
      var25.append(var4);
      var25.append(")");
      return var25.toString();
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
         val var25: N = N.a;
         val var21: C0 = C0.a;
         val var22: KSerializer = a.u(C0.a);
         val var23: KSerializer = a.u(InviteType.Serializer.INSTANCE);
         val var5: KSerializer = a.u(var25);
         val var11: KSerializer = a.u(var25);
         val var6: KSerializer = a.u(var25);
         val var3: KSerializer = a.u(var21);
         val var26: KSerializer = a.u(var21);
         val var12: KSerializer = a.u(var25);
         val var13: h = h.a;
         return new KSerializer[]{
            var25,
            var25,
            var25,
            var22,
            var23,
            var5,
            var11,
            var6,
            var3,
            var26,
            var12,
            a.u(h.a),
            a.u(var13),
            a.u(var25),
            a.u(var25),
            a.u(var13),
            a.u(var25),
            a.u(var21),
            a.u(var21),
            a.u(var21),
            a.u(var25),
            a.u(var25),
            a.u(var25),
            a.u(var21),
            a.u(var21),
            a.u(var25),
            a.u(var21),
            var28[27],
            CodedLinkExtendedType.Serializer.INSTANCE,
            a.u(AnnotatedStructurableTextSerializer.INSTANCE),
            var21,
            var13
         };
      }

      public open fun deserialize(decoder: Decoder): EmbeddedActivityInviteEmbedImpl {
         q.h(var1, "decoder");
         val var43: SerialDescriptor = this.getDescriptor();
         val var44: c = var1.c(var43);
         val var45: Array<KSerializer> = EmbeddedActivityInviteEmbedImpl.access$get$childSerializers$cp();
         var var2: Int;
         var var3: Int;
         var var4: Int;
         var var5: Int;
         val var6: Int;
         var var12: Any;
         var var13: Any;
         var var15: Any;
         var var17: Any;
         var var18: Any;
         var var20: Any;
         var var22: Any;
         var var24: java.lang.Boolean;
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
         var var36: Any;
         var var37: Any;
         var var51: Any;
         var var56: Any;
         var var60: Any;
         var var68: Any;
         var var80: Any;
         var var101: Any;
         var var109: Any;
         var var115: Any;
         if (var44.y()) {
            var5 = var44.k(var43, 0);
            var3 = var44.k(var43, 1);
            var2 = var44.k(var43, 2);
            val var46: C0 = C0.a;
            var20 = var44.v(var43, 3, C0.a, null) as java.lang.String;
            var27 = var44.v(var43, 4, InviteType.Serializer.INSTANCE, null) as InviteType;
            var51 = N.a;
            var28 = var44.v(var43, 5, N.a, null) as Int;
            var25 = var44.v(var43, 6, (DeserializationStrategy)var51, null) as Int;
            var29 = var44.v(var43, 7, (DeserializationStrategy)var51, null) as Int;
            var26 = var44.v(var43, 8, var46, null) as java.lang.String;
            var101 = var44.v(var43, 9, var46, null) as java.lang.String;
            var33 = var44.v(var43, 10, (DeserializationStrategy)var51, null) as Int;
            var56 = h.a;
            var30 = var44.v(var43, 11, h.a, null) as java.lang.Boolean;
            var34 = var44.v(var43, 12, (DeserializationStrategy)var56, null) as java.lang.Boolean;
            var22 = var44.v(var43, 13, (DeserializationStrategy)var51, null) as Int;
            var31 = var44.v(var43, 14, (DeserializationStrategy)var51, null) as Int;
            var24 = var44.v(var43, 15, (DeserializationStrategy)var56, null) as java.lang.Boolean;
            var68 = var44.v(var43, 16, (DeserializationStrategy)var51, null) as Int;
            var115 = var44.v(var43, 17, var46, null) as java.lang.String;
            var36 = var44.v(var43, 18, var46, null) as java.lang.String;
            var60 = var44.v(var43, 19, var46, null) as java.lang.String;
            var109 = var44.v(var43, 20, (DeserializationStrategy)var51, null) as Int;
            val var19: Int = var44.v(var43, 21, (DeserializationStrategy)var51, null) as Int;
            var18 = var44.v(var43, 22, (DeserializationStrategy)var51, null) as Int;
            var17 = var44.v(var43, 23, var46, null) as java.lang.String;
            var80 = var44.v(var43, 24, var46, null) as java.lang.String;
            var15 = var44.v(var43, 25, (DeserializationStrategy)var51, null) as Int;
            var56 = var44.v(var43, 26, var46, null) as java.lang.String;
            var12 = var44.m(var43, 27, var45[27], null) as java.util.List;
            var13 = var44.m(var43, 28, CodedLinkExtendedType.Serializer.INSTANCE, null) as CodedLinkExtendedType;
            val var47: AnnotatedStructurableText = var44.v(var43, 29, AnnotatedStructurableTextSerializer.INSTANCE, null) as AnnotatedStructurableText;
            var51 = var44.t(var43, 30);
            var6 = var44.s(var43, 31);
            var4 = -1;
            var32 = var101;
            var37 = var68;
            var101 = var115;
            var115 = var60;
            var68 = var109;
            var60 = var19;
            var109 = var80;
            var80 = var56;
            var56 = var47;
         } else {
            var var49: Boolean = true;
            var3 = 0;
            var5 = 0;
            var var7: Int = 0;
            var4 = 0;
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
            var18 = null;
            var17 = null;
            var24 = null;
            var20 = null;
            var22 = null;
            var109 = null;
            var101 = null;
            var13 = null;
            var60 = null;
            var12 = null;
            var68 = null;
            var15 = null;
            var80 = null;
            var56 = null;
            var31 = null;
            var51 = null;
            var115 = null;
            var var95: Any = null;
            var2 = 0;

            while (var49) {
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
                                                   var var8: Int = var44.x(var43);
                                                   switch (var8) {
                                                      case -1:
                                                         var49 = false;
                                                         break label194;
                                                      case 0:
                                                         var5 = var44.k(var43, 0);
                                                         var4 |= 1;
                                                         break label194;
                                                      case 1:
                                                         var3 = var44.k(var43, 1);
                                                         var4 |= 2;
                                                         break label194;
                                                      case 2:
                                                         var2 = var44.k(var43, 2);
                                                         var4 |= 4;
                                                         break label194;
                                                      case 3:
                                                         var95 = var44.v(var43, 3, C0.a, var95) as java.lang.String;
                                                         var4 |= 8;
                                                         break label194;
                                                      case 4:
                                                         var27 = var44.v(var43, 4, InviteType.Serializer.INSTANCE, var27) as InviteType;
                                                         var4 |= 16;
                                                         break;
                                                      case 5:
                                                         var28 = var44.v(var43, 5, N.a, var28) as Int;
                                                         var4 |= 32;
                                                         break label121;
                                                      case 6:
                                                         var25 = var44.v(var43, 6, N.a, var25) as Int;
                                                         var4 |= 64;
                                                         break label121;
                                                      case 7:
                                                         var29 = var44.v(var43, 7, N.a, var29) as Int;
                                                         var4 |= 128;
                                                         break label121;
                                                      case 8:
                                                         var26 = var44.v(var43, 8, C0.a, var26) as java.lang.String;
                                                         var4 |= 256;
                                                         break;
                                                      case 9:
                                                         var32 = var44.v(var43, 9, C0.a, var32) as java.lang.String;
                                                         var4 |= 512;
                                                         break label122;
                                                      case 10:
                                                         var33 = var44.v(var43, 10, N.a, var33) as Int;
                                                         var4 |= 1024;
                                                         break label122;
                                                      case 11:
                                                         var30 = var44.v(var43, 11, h.a, var30) as java.lang.Boolean;
                                                         var4 |= 2048;
                                                         break label121;
                                                      case 12:
                                                         var34 = var44.v(var43, 12, h.a, var34) as java.lang.Boolean;
                                                         var4 |= 4096;
                                                         break label122;
                                                      case 13:
                                                         var48 = var44.v(var43, 13, N.a, var48) as Int;
                                                         var4 |= 8192;
                                                         var36 = var27;
                                                         var37 = var26;
                                                         break label195;
                                                      case 14:
                                                         var18 = var44.v(var43, 14, N.a, var18) as Int;
                                                         var4 |= 16384;
                                                         var36 = var27;
                                                         var37 = var26;
                                                         break label195;
                                                      case 15:
                                                         var17 = var44.v(var43, 15, h.a, var17) as java.lang.Boolean;
                                                         var4 |= 32768;
                                                         var37 = var26;
                                                         var36 = var27;
                                                         break label195;
                                                      case 16:
                                                         var24 = var44.v(var43, 16, N.a, var24) as Int;
                                                         var4 |= 65536;
                                                         break label135;
                                                      case 17:
                                                         var20 = var44.v(var43, 17, C0.a, var20) as java.lang.String;
                                                         var4 |= 131072;
                                                         break label135;
                                                      case 18:
                                                         var36 = var44.v(var43, 18, C0.a, var22) as java.lang.String;
                                                         var8 = 262144 or var4;
                                                         var22 = var20;
                                                         var4 = var8;
                                                         var20 = var36;
                                                         break label151;
                                                      case 19:
                                                         var109 = var44.v(var43, 19, C0.a, var109) as java.lang.String;
                                                         var4 |= 524288;
                                                         break label152;
                                                      case 20:
                                                         var101 = var44.v(var43, 20, N.a, var101) as Int;
                                                         var4 |= 1048576;
                                                         break label152;
                                                      case 21:
                                                         val var174: Int = var44.v(var43, 21, N.a, var13) as Int;
                                                         var4 |= 2097152;
                                                         var80 = var51;
                                                         var51 = var80;
                                                         var56 = var15;
                                                         var60 = var68;
                                                         var13 = var60;
                                                         var68 = var174;
                                                         var15 = var56;
                                                         break label153;
                                                      case 22:
                                                         val var173: Int = var44.v(var43, 22, N.a, var60) as Int;
                                                         var4 |= 4194304;
                                                         var80 = var51;
                                                         var51 = var80;
                                                         var56 = var15;
                                                         var60 = var68;
                                                         var13 = var173;
                                                         var68 = var13;
                                                         var15 = var56;
                                                         break label153;
                                                      case 23:
                                                         var12 = var44.v(var43, 23, C0.a, var12) as java.lang.String;
                                                         var4 |= 8388608;
                                                         var80 = var51;
                                                         var13 = var60;
                                                         var51 = var80;
                                                         var56 = var15;
                                                         var60 = var68;
                                                         var68 = var13;
                                                         var15 = var56;
                                                         break label153;
                                                      case 24:
                                                         var68 = var44.v(var43, 24, C0.a, var68) as java.lang.String;
                                                         var4 |= 16777216;
                                                         var80 = var51;
                                                         var13 = var60;
                                                         var51 = var80;
                                                         var56 = var15;
                                                         var60 = var68;
                                                         var68 = var13;
                                                         var15 = var56;
                                                         break label153;
                                                      case 25:
                                                         val var170: Int = var44.v(var43, 25, N.a, var15) as Int;
                                                         var4 |= 33554432;
                                                         var80 = var51;
                                                         var15 = var56;
                                                         var13 = var60;
                                                         var60 = var68;
                                                         var51 = var80;
                                                         var56 = var170;
                                                         var68 = var13;
                                                         break label153;
                                                      case 26:
                                                         val var169: java.lang.String = var44.v(var43, 26, C0.a, var80) as java.lang.String;
                                                         var4 |= 67108864;
                                                         var80 = var51;
                                                         var13 = var60;
                                                         var60 = var68;
                                                         var56 = var15;
                                                         var51 = var169;
                                                         var68 = var13;
                                                         var15 = var56;
                                                         break label153;
                                                      case 27:
                                                         var37 = var44.m(var43, 27, var45[27], var56) as java.util.List;
                                                         var4 |= 134217728;
                                                         var13 = var60;
                                                         var60 = var68;
                                                         var56 = var15;
                                                         var51 = var80;
                                                         var68 = var13;
                                                         var15 = var37;
                                                         var80 = var51;
                                                         break label153;
                                                      case 28:
                                                         var31 = var44.m(var43, 28, CodedLinkExtendedType.Serializer.INSTANCE, var31) as CodedLinkExtendedType;
                                                         var4 |= 268435456;
                                                         break label136;
                                                      case 29:
                                                         var51 = var44.v(var43, 29, AnnotatedStructurableTextSerializer.INSTANCE, var51) as AnnotatedStructurableText;
                                                         var4 |= 536870912;
                                                         break label136;
                                                      case 30:
                                                         var115 = var44.t(var43, 30);
                                                         var4 |= 1073741824;
                                                         break label154;
                                                      case 31:
                                                         var7 = var44.s(var43, 31);
                                                         var4 |= Integer.MIN_VALUE;
                                                         break label154;
                                                      default:
                                                         throw new n(var8);
                                                   }

                                                   var36 = var27;
                                                   var37 = var26;
                                                   break label195;
                                                }

                                                var36 = var27;
                                                var37 = var26;
                                                break label195;
                                             }

                                             var18 = var27;
                                             var17 = var26;
                                             var27 = var17;
                                             var26 = var18;
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

                                    var80 = var51;
                                    var15 = var56;
                                    var68 = var13;
                                    var13 = var60;
                                    var60 = var68;
                                    var56 = var15;
                                    var51 = var80;
                                    break label153;
                                 }

                                 var13 = var60;
                                 var60 = var68;
                                 var17 = var95;
                                 var80 = var51;
                                 var18 = var20;
                                 var95 = var101;
                                 var36 = var27;
                                 var37 = var26;
                                 var51 = var80;
                                 var56 = var15;
                                 var68 = var13;
                                 var15 = var56;
                                 var20 = var22;
                                 var101 = var17;
                                 var22 = var18;
                                 break label155;
                              }

                              var13 = var60;
                              var60 = var68;
                              var80 = var51;
                              var36 = var18;
                              var37 = var17;
                              var17 = var95;
                              var18 = var20;
                              var95 = var101;
                              var51 = var80;
                              var56 = var15;
                              var68 = var13;
                              var15 = var56;
                              var20 = var22;
                              var101 = var27;
                              var22 = var26;
                              break label155;
                           }

                           var13 = var60;
                           var60 = var68;
                           var51 = var80;
                           var17 = var95;
                           var15 = var56;
                           var95 = var101;
                           var36 = var27;
                           var37 = var26;
                           var18 = var22;
                           var56 = var15;
                           var68 = var13;
                           var80 = var51;
                           var101 = var17;
                           var22 = var18;
                           break label155;
                        }

                        var13 = var60;
                        var60 = var68;
                        var56 = var15;
                        var51 = var80;
                        var18 = var20;
                        var17 = var95;
                        var36 = var27;
                        var37 = var26;
                        var95 = var101;
                        var68 = var13;
                        var15 = var56;
                        var20 = var22;
                        var80 = var51;
                        var101 = var17;
                        var22 = var18;
                        break label155;
                     }

                     var18 = var20;
                     var17 = var95;
                     var36 = var27;
                     var37 = var26;
                     var95 = var101;
                     var20 = var22;
                     var101 = var17;
                     var22 = var18;
                     break label155;
                  }

                  var13 = var60;
                  var60 = var68;
                  var56 = var15;
                  var51 = var80;
                  var18 = var20;
                  var17 = var95;
                  var36 = var27;
                  var37 = var26;
                  var95 = var101;
                  var68 = var13;
                  var15 = var56;
                  var20 = var22;
                  var80 = var51;
                  var101 = var17;
                  var22 = var18;
               }

               var60 = var13;
               var13 = var68;
               var18 = var22;
               var27 = var36;
               var95 = var17;
               var26 = var37;
               var17 = var101;
               var20 = var18;
               var22 = var20;
               var101 = var95;
               var68 = var60;
               var15 = var56;
               var80 = var51;
               var56 = var15;
               var51 = var80;
            }

            var37 = var24;
            var24 = (java.lang.Boolean)var17;
            var13 = var31;
            var51 = var115;
            var6 = var7;
            var56 = var51;
            var12 = var56;
            var109 = var68;
            var17 = var12;
            var18 = var60;
            var60 = var13;
            var68 = var101;
            var115 = var109;
            var36 = var22;
            var101 = var20;
            var31 = var18;
            var22 = var48;
            var20 = var95;
         }

         var44.b(var43);
         return new EmbeddedActivityInviteEmbedImpl(
            var4,
            0,
            var5,
            var3,
            var2,
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
            (Integer)var22,
            (Integer)var31,
            var24,
            (Integer)var37,
            (java.lang.String)var101,
            (java.lang.String)var36,
            (java.lang.String)var115,
            (Integer)var68,
            (Integer)var60,
            (Integer)var18,
            (java.lang.String)var17,
            (java.lang.String)var109,
            (Integer)var15,
            (java.lang.String)var80,
            (java.util.List)var12,
            (CodedLinkExtendedType)var13,
            (AnnotatedStructurableText)var56,
            (java.lang.String)var51,
            (boolean)var6,
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
         return ha.G.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<EmbeddedActivityInviteEmbedImpl> {
         return EmbeddedActivityInviteEmbedImpl.$serializer.INSTANCE;
      }
   }
}

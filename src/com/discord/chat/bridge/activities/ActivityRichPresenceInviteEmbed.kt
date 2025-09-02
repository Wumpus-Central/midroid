package com.discord.chat.bridge.activities

import com.discord.activity_invites.RGBAColorModel
import kotlinx.serialization.KSerializer
import nb.a
import nb.g
import qb.E0
import qb.f

@g
public data class ActivityRichPresenceInviteEmbed(ctaButtonEnabled: Boolean? = java.lang.Boolean.FALSE,
   ctaButtonText: String? = null,
   ctaButtonIsLoading: Boolean? = java.lang.Boolean.FALSE,
   footerLabel: String? = null,
   gradientColors: List<RGBAColorModel>? = null,
   headerText: String? = null,
   iconSrc: String? = null,
   isActive: Boolean? = null,
   isPlatformSupported: Boolean? = java.lang.Boolean.FALSE,
   isSpotifyParty: Boolean? = java.lang.Boolean.FALSE,
   maxPartySize: Int? = null,
   partyMemberAvatarURIs: List<String>? = null,
   partySizeText: String? = null,
   platformIconKeys: List<String>? = null,
   subtitle: String? = null,
   title: String? = null
) {
   public final val ctaButtonEnabled: Boolean?
   public final val ctaButtonText: String?
   public final val ctaButtonIsLoading: Boolean?
   public final val footerLabel: String?
   public final val gradientColors: List<RGBAColorModel>?
   public final val headerText: String?
   public final val iconSrc: String?
   public final val isActive: Boolean?
   public final val isPlatformSupported: Boolean?
   public final val isSpotifyParty: Boolean?
   public final val maxPartySize: Int?
   public final val partyMemberAvatarURIs: List<String>?
   public final val partySizeText: String?
   public final val platformIconKeys: List<String>?
   public final val subtitle: String?
   public final val title: String?

   @JvmStatic
   fun {
      val var1: f = new f(new a(RGBAColorModel::class, RGBAColorModel.$serializer.INSTANCE, new KSerializer[0]));
      val var0: E0 = E0.a;
      $childSerializers = new KSerializer[]{null, null, null, null, var1, null, null, null, null, null, null, new f(E0.a), null, new f(var0), null, null};
   }

   fun ActivityRichPresenceInviteEmbed() {
      this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 65535, null);
   }

   init {
      this.ctaButtonEnabled = var1;
      this.ctaButtonText = var2;
      this.ctaButtonIsLoading = var3;
      this.footerLabel = var4;
      this.gradientColors = var5;
      this.headerText = var6;
      this.iconSrc = var7;
      this.isActive = var8;
      this.isPlatformSupported = var9;
      this.isSpotifyParty = var10;
      this.maxPartySize = var11;
      this.partyMemberAvatarURIs = var12;
      this.partySizeText = var13;
      this.platformIconKeys = var14;
      this.subtitle = var15;
      this.title = var16;
   }

   public operator fun component1(): Boolean? {
      return this.ctaButtonEnabled;
   }

   public operator fun component10(): Boolean? {
      return this.isSpotifyParty;
   }

   public operator fun component11(): Int? {
      return this.maxPartySize;
   }

   public operator fun component12(): List<String>? {
      return this.partyMemberAvatarURIs;
   }

   public operator fun component13(): String? {
      return this.partySizeText;
   }

   public operator fun component14(): List<String>? {
      return this.platformIconKeys;
   }

   public operator fun component15(): String? {
      return this.subtitle;
   }

   public operator fun component16(): String? {
      return this.title;
   }

   public operator fun component2(): String? {
      return this.ctaButtonText;
   }

   public operator fun component3(): Boolean? {
      return this.ctaButtonIsLoading;
   }

   public operator fun component4(): String? {
      return this.footerLabel;
   }

   public operator fun component5(): List<RGBAColorModel>? {
      return this.gradientColors;
   }

   public operator fun component6(): String? {
      return this.headerText;
   }

   public operator fun component7(): String? {
      return this.iconSrc;
   }

   public operator fun component8(): Boolean? {
      return this.isActive;
   }

   public operator fun component9(): Boolean? {
      return this.isPlatformSupported;
   }

   public fun copy(
      ctaButtonEnabled: Boolean? = var0.ctaButtonEnabled,
      ctaButtonText: String? = var0.ctaButtonText,
      ctaButtonIsLoading: Boolean? = var0.ctaButtonIsLoading,
      footerLabel: String? = var0.footerLabel,
      gradientColors: List<RGBAColorModel>? = var0.gradientColors,
      headerText: String? = var0.headerText,
      iconSrc: String? = var0.iconSrc,
      isActive: Boolean? = var0.isActive,
      isPlatformSupported: Boolean? = var0.isPlatformSupported,
      isSpotifyParty: Boolean? = var0.isSpotifyParty,
      maxPartySize: Int? = var0.maxPartySize,
      partyMemberAvatarURIs: List<String>? = var0.partyMemberAvatarURIs,
      partySizeText: String? = var0.partySizeText,
      platformIconKeys: List<String>? = var0.platformIconKeys,
      subtitle: String? = var0.subtitle,
      title: String? = var0.title
   ): ActivityRichPresenceInviteEmbed {
      return new ActivityRichPresenceInviteEmbed(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is ActivityRichPresenceInviteEmbed) {
         return false;
      } else {
         var1 = var1;
         if (!(this.ctaButtonEnabled == var1.ctaButtonEnabled)) {
            return false;
         } else if (!(this.ctaButtonText == var1.ctaButtonText)) {
            return false;
         } else if (!(this.ctaButtonIsLoading == var1.ctaButtonIsLoading)) {
            return false;
         } else if (!(this.footerLabel == var1.footerLabel)) {
            return false;
         } else if (!(this.gradientColors == var1.gradientColors)) {
            return false;
         } else if (!(this.headerText == var1.headerText)) {
            return false;
         } else if (!(this.iconSrc == var1.iconSrc)) {
            return false;
         } else if (!(this.isActive == var1.isActive)) {
            return false;
         } else if (!(this.isPlatformSupported == var1.isPlatformSupported)) {
            return false;
         } else if (!(this.isSpotifyParty == var1.isSpotifyParty)) {
            return false;
         } else if (!(this.maxPartySize == var1.maxPartySize)) {
            return false;
         } else if (!(this.partyMemberAvatarURIs == var1.partyMemberAvatarURIs)) {
            return false;
         } else if (!(this.partySizeText == var1.partySizeText)) {
            return false;
         } else if (!(this.platformIconKeys == var1.platformIconKeys)) {
            return false;
         } else if (!(this.subtitle == var1.subtitle)) {
            return false;
         } else {
            return this.title == var1.title;
         }
      }
   }

   public override fun hashCode(): Int {
      var var16: Int = 0;
      val var1: Int;
      if (this.ctaButtonEnabled == null) {
         var1 = 0;
      } else {
         var1 = this.ctaButtonEnabled.hashCode();
      }

      val var2: Int;
      if (this.ctaButtonText == null) {
         var2 = 0;
      } else {
         var2 = this.ctaButtonText.hashCode();
      }

      val var3: Int;
      if (this.ctaButtonIsLoading == null) {
         var3 = 0;
      } else {
         var3 = this.ctaButtonIsLoading.hashCode();
      }

      val var4: Int;
      if (this.footerLabel == null) {
         var4 = 0;
      } else {
         var4 = this.footerLabel.hashCode();
      }

      val var5: Int;
      if (this.gradientColors == null) {
         var5 = 0;
      } else {
         var5 = this.gradientColors.hashCode();
      }

      val var6: Int;
      if (this.headerText == null) {
         var6 = 0;
      } else {
         var6 = this.headerText.hashCode();
      }

      val var7: Int;
      if (this.iconSrc == null) {
         var7 = 0;
      } else {
         var7 = this.iconSrc.hashCode();
      }

      val var8: Int;
      if (this.isActive == null) {
         var8 = 0;
      } else {
         var8 = this.isActive.hashCode();
      }

      val var9: Int;
      if (this.isPlatformSupported == null) {
         var9 = 0;
      } else {
         var9 = this.isPlatformSupported.hashCode();
      }

      val var10: Int;
      if (this.isSpotifyParty == null) {
         var10 = 0;
      } else {
         var10 = this.isSpotifyParty.hashCode();
      }

      val var11: Int;
      if (this.maxPartySize == null) {
         var11 = 0;
      } else {
         var11 = this.maxPartySize.hashCode();
      }

      val var12: Int;
      if (this.partyMemberAvatarURIs == null) {
         var12 = 0;
      } else {
         var12 = this.partyMemberAvatarURIs.hashCode();
      }

      val var13: Int;
      if (this.partySizeText == null) {
         var13 = 0;
      } else {
         var13 = this.partySizeText.hashCode();
      }

      val var14: Int;
      if (this.platformIconKeys == null) {
         var14 = 0;
      } else {
         var14 = this.platformIconKeys.hashCode();
      }

      val var15: Int;
      if (this.subtitle == null) {
         var15 = 0;
      } else {
         var15 = this.subtitle.hashCode();
      }

      if (this.title != null) {
         var16 = this.title.hashCode();
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
                                                                                                ((((var1 * 31 + var2) * 31 + var3) * 31 + var4) * 31 + var5)
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
         + var16;
   }

   public override fun toString(): String {
      val var7: java.lang.Boolean = this.ctaButtonEnabled;
      val var1: java.lang.String = this.ctaButtonText;
      val var3: java.lang.Boolean = this.ctaButtonIsLoading;
      val var4: java.lang.String = this.footerLabel;
      val var6: java.util.List = this.gradientColors;
      val var16: java.lang.String = this.headerText;
      val var8: java.lang.String = this.iconSrc;
      val var2: java.lang.Boolean = this.isActive;
      val var9: java.lang.Boolean = this.isPlatformSupported;
      val var13: java.lang.Boolean = this.isSpotifyParty;
      val var15: Int = this.maxPartySize;
      val var11: java.util.List = this.partyMemberAvatarURIs;
      val var12: java.lang.String = this.partySizeText;
      val var10: java.util.List = this.platformIconKeys;
      val var5: java.lang.String = this.subtitle;
      val var17: java.lang.String = this.title;
      val var14: StringBuilder = new StringBuilder();
      var14.append("ActivityRichPresenceInviteEmbed(ctaButtonEnabled=");
      var14.append(var7);
      var14.append(", ctaButtonText=");
      var14.append(var1);
      var14.append(", ctaButtonIsLoading=");
      var14.append(var3);
      var14.append(", footerLabel=");
      var14.append(var4);
      var14.append(", gradientColors=");
      var14.append(var6);
      var14.append(", headerText=");
      var14.append(var16);
      var14.append(", iconSrc=");
      var14.append(var8);
      var14.append(", isActive=");
      var14.append(var2);
      var14.append(", isPlatformSupported=");
      var14.append(var9);
      var14.append(", isSpotifyParty=");
      var14.append(var13);
      var14.append(", maxPartySize=");
      var14.append(var15);
      var14.append(", partyMemberAvatarURIs=");
      var14.append(var11);
      var14.append(", partySizeText=");
      var14.append(var12);
      var14.append(", platformIconKeys=");
      var14.append(var10);
      var14.append(", subtitle=");
      var14.append(var5);
      var14.append(", title=");
      var14.append(var17);
      var14.append(")");
      return var14.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<ActivityRichPresenceInviteEmbed> {
         return ActivityRichPresenceInviteEmbed.$serializer.INSTANCE;
      }
   }
}

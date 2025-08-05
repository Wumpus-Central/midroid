package com.discord.chat.bridge.activities

import com.discord.activity_invites.RGBAColorModel
import kotlin.jvm.internal.H
import kotlin.jvm.internal.r
import kotlinx.serialization.KSerializer
import sb.a
import sb.g
import vb.E0
import vb.f

@g
public data class ActivityRichPresenceInviteEmbed(footerLabel: String? = null,
   gradientColors: List<RGBAColorModel>? = null,
   headerText: String? = null,
   iconSrc: String? = null,
   isActive: Boolean? = null,
   isSpotifyParty: Boolean? = null,
   maxPartySize: Int? = null,
   partyMemberAvatarURIs: List<String>? = null,
   partySizeText: String? = null,
   platformIconKeys: List<String>? = null,
   subtitle: String? = null,
   title: String? = null
) {
   public final val footerLabel: String?
   public final val gradientColors: List<RGBAColorModel>?
   public final val headerText: String?
   public final val iconSrc: String?
   public final val isActive: Boolean?
   public final val isSpotifyParty: Boolean?
   public final val maxPartySize: Int?
   public final val partyMemberAvatarURIs: List<String>?
   public final val partySizeText: String?
   public final val platformIconKeys: List<String>?
   public final val subtitle: String?
   public final val title: String?

   @JvmStatic
   fun {
      val var1: f = new f(new a(H.b(RGBAColorModel.class), RGBAColorModel.$serializer.INSTANCE, new KSerializer[0]));
      val var0: E0 = E0.a;
      $childSerializers = new KSerializer[]{null, var1, null, null, null, null, null, new f(E0.a), null, new f(var0), null, null};
   }

   fun ActivityRichPresenceInviteEmbed() {
      this(null, null, null, null, null, null, null, null, null, null, null, null, 4095, null);
   }

   init {
      this.footerLabel = var1;
      this.gradientColors = var2;
      this.headerText = var3;
      this.iconSrc = var4;
      this.isActive = var5;
      this.isSpotifyParty = var6;
      this.maxPartySize = var7;
      this.partyMemberAvatarURIs = var8;
      this.partySizeText = var9;
      this.platformIconKeys = var10;
      this.subtitle = var11;
      this.title = var12;
   }

   public operator fun component1(): String? {
      return this.footerLabel;
   }

   public operator fun component10(): List<String>? {
      return this.platformIconKeys;
   }

   public operator fun component11(): String? {
      return this.subtitle;
   }

   public operator fun component12(): String? {
      return this.title;
   }

   public operator fun component2(): List<RGBAColorModel>? {
      return this.gradientColors;
   }

   public operator fun component3(): String? {
      return this.headerText;
   }

   public operator fun component4(): String? {
      return this.iconSrc;
   }

   public operator fun component5(): Boolean? {
      return this.isActive;
   }

   public operator fun component6(): Boolean? {
      return this.isSpotifyParty;
   }

   public operator fun component7(): Int? {
      return this.maxPartySize;
   }

   public operator fun component8(): List<String>? {
      return this.partyMemberAvatarURIs;
   }

   public operator fun component9(): String? {
      return this.partySizeText;
   }

   public fun copy(
      footerLabel: String? = var0.footerLabel,
      gradientColors: List<RGBAColorModel>? = var0.gradientColors,
      headerText: String? = var0.headerText,
      iconSrc: String? = var0.iconSrc,
      isActive: Boolean? = var0.isActive,
      isSpotifyParty: Boolean? = var0.isSpotifyParty,
      maxPartySize: Int? = var0.maxPartySize,
      partyMemberAvatarURIs: List<String>? = var0.partyMemberAvatarURIs,
      partySizeText: String? = var0.partySizeText,
      platformIconKeys: List<String>? = var0.platformIconKeys,
      subtitle: String? = var0.subtitle,
      title: String? = var0.title
   ): ActivityRichPresenceInviteEmbed {
      return new ActivityRichPresenceInviteEmbed(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is ActivityRichPresenceInviteEmbed) {
         return false;
      } else {
         var1 = var1;
         if (!r.c(this.footerLabel, var1.footerLabel)) {
            return false;
         } else if (!r.c(this.gradientColors, var1.gradientColors)) {
            return false;
         } else if (!r.c(this.headerText, var1.headerText)) {
            return false;
         } else if (!r.c(this.iconSrc, var1.iconSrc)) {
            return false;
         } else if (!r.c(this.isActive, var1.isActive)) {
            return false;
         } else if (!r.c(this.isSpotifyParty, var1.isSpotifyParty)) {
            return false;
         } else if (!r.c(this.maxPartySize, var1.maxPartySize)) {
            return false;
         } else if (!r.c(this.partyMemberAvatarURIs, var1.partyMemberAvatarURIs)) {
            return false;
         } else if (!r.c(this.partySizeText, var1.partySizeText)) {
            return false;
         } else if (!r.c(this.platformIconKeys, var1.platformIconKeys)) {
            return false;
         } else if (!r.c(this.subtitle, var1.subtitle)) {
            return false;
         } else {
            return r.c(this.title, var1.title);
         }
      }
   }

   public override fun hashCode(): Int {
      var var12: Int = 0;
      val var1: Int;
      if (this.footerLabel == null) {
         var1 = 0;
      } else {
         var1 = this.footerLabel.hashCode();
      }

      val var2: Int;
      if (this.gradientColors == null) {
         var2 = 0;
      } else {
         var2 = this.gradientColors.hashCode();
      }

      val var3: Int;
      if (this.headerText == null) {
         var3 = 0;
      } else {
         var3 = this.headerText.hashCode();
      }

      val var4: Int;
      if (this.iconSrc == null) {
         var4 = 0;
      } else {
         var4 = this.iconSrc.hashCode();
      }

      val var5: Int;
      if (this.isActive == null) {
         var5 = 0;
      } else {
         var5 = this.isActive.hashCode();
      }

      val var6: Int;
      if (this.isSpotifyParty == null) {
         var6 = 0;
      } else {
         var6 = this.isSpotifyParty.hashCode();
      }

      val var7: Int;
      if (this.maxPartySize == null) {
         var7 = 0;
      } else {
         var7 = this.maxPartySize.hashCode();
      }

      val var8: Int;
      if (this.partyMemberAvatarURIs == null) {
         var8 = 0;
      } else {
         var8 = this.partyMemberAvatarURIs.hashCode();
      }

      val var9: Int;
      if (this.partySizeText == null) {
         var9 = 0;
      } else {
         var9 = this.partySizeText.hashCode();
      }

      val var10: Int;
      if (this.platformIconKeys == null) {
         var10 = 0;
      } else {
         var10 = this.platformIconKeys.hashCode();
      }

      val var11: Int;
      if (this.subtitle == null) {
         var11 = 0;
      } else {
         var11 = this.subtitle.hashCode();
      }

      if (this.title != null) {
         var12 = this.title.hashCode();
      }

      return ((((((((((var1 * 31 + var2) * 31 + var3) * 31 + var4) * 31 + var5) * 31 + var6) * 31 + var7) * 31 + var8) * 31 + var9) * 31 + var10) * 31 + var11)
            * 31
         + var12;
   }

   public override fun toString(): String {
      val var8: java.lang.String = this.footerLabel;
      val var13: java.util.List = this.gradientColors;
      val var9: java.lang.String = this.headerText;
      val var2: java.lang.String = this.iconSrc;
      val var10: java.lang.Boolean = this.isActive;
      val var12: java.lang.Boolean = this.isSpotifyParty;
      val var6: Int = this.maxPartySize;
      val var11: java.util.List = this.partyMemberAvatarURIs;
      val var7: java.lang.String = this.partySizeText;
      val var4: java.util.List = this.platformIconKeys;
      val var1: java.lang.String = this.subtitle;
      val var3: java.lang.String = this.title;
      val var5: StringBuilder = new StringBuilder();
      var5.append("ActivityRichPresenceInviteEmbed(footerLabel=");
      var5.append(var8);
      var5.append(", gradientColors=");
      var5.append(var13);
      var5.append(", headerText=");
      var5.append(var9);
      var5.append(", iconSrc=");
      var5.append(var2);
      var5.append(", isActive=");
      var5.append(var10);
      var5.append(", isSpotifyParty=");
      var5.append(var12);
      var5.append(", maxPartySize=");
      var5.append(var6);
      var5.append(", partyMemberAvatarURIs=");
      var5.append(var11);
      var5.append(", partySizeText=");
      var5.append(var7);
      var5.append(", platformIconKeys=");
      var5.append(var4);
      var5.append(", subtitle=");
      var5.append(var1);
      var5.append(", title=");
      var5.append(var3);
      var5.append(")");
      return var5.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<ActivityRichPresenceInviteEmbed> {
         return ActivityRichPresenceInviteEmbed.$serializer.INSTANCE;
      }
   }
}

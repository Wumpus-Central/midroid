package com.discord.chat.bridge.activities

import kotlin.jvm.internal.r
import kotlinx.serialization.KSerializer
import sb.g

@g
public data class ActivityInviteEmbed(coverImage: String? = null,
   isListening: Boolean,
   headerText: String,
   partyStatus: String,
   avatarsToRender: List<String?>? = null,
   maxPartySize: Int,
   name: String? = null,
   subtext: String? = null,
   joinable: Boolean,
   ctaText: String
) {
   public final val coverImage: String?
   public final val isListening: Boolean
   public final val headerText: String
   public final val partyStatus: String
   public final val avatarsToRender: List<String?>?
   public final val maxPartySize: Int
   public final val name: String?
   public final val subtext: String?
   public final val joinable: Boolean
   public final val ctaText: String

   init {
      r.h(var3, "headerText");
      r.h(var4, "partyStatus");
      r.h(var10, "ctaText");
      super();
      this.coverImage = var1;
      this.isListening = var2;
      this.headerText = var3;
      this.partyStatus = var4;
      this.avatarsToRender = var5;
      this.maxPartySize = var6;
      this.name = var7;
      this.subtext = var8;
      this.joinable = var9;
      this.ctaText = var10;
   }

   public operator fun component1(): String? {
      return this.coverImage;
   }

   public operator fun component10(): String {
      return this.ctaText;
   }

   public operator fun component2(): Boolean {
      return this.isListening;
   }

   public operator fun component3(): String {
      return this.headerText;
   }

   public operator fun component4(): String {
      return this.partyStatus;
   }

   public operator fun component5(): List<String?>? {
      return this.avatarsToRender;
   }

   public operator fun component6(): Int {
      return this.maxPartySize;
   }

   public operator fun component7(): String? {
      return this.name;
   }

   public operator fun component8(): String? {
      return this.subtext;
   }

   public operator fun component9(): Boolean {
      return this.joinable;
   }

   public fun copy(
      coverImage: String? = var0.coverImage,
      isListening: Boolean = var0.isListening,
      headerText: String = var0.headerText,
      partyStatus: String = var0.partyStatus,
      avatarsToRender: List<String?>? = var0.avatarsToRender,
      maxPartySize: Int = var0.maxPartySize,
      name: String? = var0.name,
      subtext: String? = var0.subtext,
      joinable: Boolean = var0.joinable,
      ctaText: String = var0.ctaText
   ): ActivityInviteEmbed {
      r.h(var3, "headerText");
      r.h(var4, "partyStatus");
      r.h(var10, "ctaText");
      return new ActivityInviteEmbed(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is ActivityInviteEmbed) {
         return false;
      } else {
         var1 = var1;
         if (!r.c(this.coverImage, var1.coverImage)) {
            return false;
         } else if (this.isListening != var1.isListening) {
            return false;
         } else if (!r.c(this.headerText, var1.headerText)) {
            return false;
         } else if (!r.c(this.partyStatus, var1.partyStatus)) {
            return false;
         } else if (!r.c(this.avatarsToRender, var1.avatarsToRender)) {
            return false;
         } else if (this.maxPartySize != var1.maxPartySize) {
            return false;
         } else if (!r.c(this.name, var1.name)) {
            return false;
         } else if (!r.c(this.subtext, var1.subtext)) {
            return false;
         } else if (this.joinable != var1.joinable) {
            return false;
         } else {
            return r.c(this.ctaText, var1.ctaText);
         }
      }
   }

   public override fun hashCode(): Int {
      var var4: Int = 0;
      val var1: Int;
      if (this.coverImage == null) {
         var1 = 0;
      } else {
         var1 = this.coverImage.hashCode();
      }

      val var5: Int = java.lang.Boolean.hashCode(this.isListening);
      val var6: Int = this.headerText.hashCode();
      val var7: Int = this.partyStatus.hashCode();
      val var2: Int;
      if (this.avatarsToRender == null) {
         var2 = 0;
      } else {
         var2 = this.avatarsToRender.hashCode();
      }

      val var8: Int = Integer.hashCode(this.maxPartySize);
      val var3: Int;
      if (this.name == null) {
         var3 = 0;
      } else {
         var3 = this.name.hashCode();
      }

      if (this.subtext != null) {
         var4 = this.subtext.hashCode();
      }

      return (
               (((((((var1 * 31 + var5) * 31 + var6) * 31 + var7) * 31 + var2) * 31 + var8) * 31 + var3) * 31 + var4) * 31
                  + java.lang.Boolean.hashCode(this.joinable)
            )
            * 31
         + this.ctaText.hashCode();
   }

   public override fun toString(): String {
      val var11: java.lang.String = this.coverImage;
      val var2: Boolean = this.isListening;
      val var7: java.lang.String = this.headerText;
      val var8: java.lang.String = this.partyStatus;
      val var6: java.util.List = this.avatarsToRender;
      val var1: Int = this.maxPartySize;
      val var4: java.lang.String = this.name;
      val var9: java.lang.String = this.subtext;
      val var3: Boolean = this.joinable;
      val var5: java.lang.String = this.ctaText;
      val var10: StringBuilder = new StringBuilder();
      var10.append("ActivityInviteEmbed(coverImage=");
      var10.append(var11);
      var10.append(", isListening=");
      var10.append(var2);
      var10.append(", headerText=");
      var10.append(var7);
      var10.append(", partyStatus=");
      var10.append(var8);
      var10.append(", avatarsToRender=");
      var10.append(var6);
      var10.append(", maxPartySize=");
      var10.append(var1);
      var10.append(", name=");
      var10.append(var4);
      var10.append(", subtext=");
      var10.append(var9);
      var10.append(", joinable=");
      var10.append(var3);
      var10.append(", ctaText=");
      var10.append(var5);
      var10.append(")");
      return var10.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<ActivityInviteEmbed> {
         return ActivityInviteEmbed.$serializer.INSTANCE;
      }
   }
}

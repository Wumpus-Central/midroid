package com.discord.chat.bridge.botuikit

import com.discord.chat.bridge.media.UnfurledMediaItem
import com.discord.chat.bridge.spoiler.SpoilerableData
import kotlin.jvm.internal.SourceDebugExtension
import kotlinx.serialization.KSerializer
import pc.m

@m
@SourceDebugExtension(["SMAP\nThumbnailDisplayComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThumbnailDisplayComponent.kt\ncom/discord/chat/bridge/botuikit/ThumbnailDisplayComponent\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,30:1\n1#2:31\n*E\n"])
public data class ThumbnailDisplayComponent(type: Int,
      id: String,
      media: UnfurledMediaItem,
      description: String? = null,
      isSpoiler: Boolean,
      spoilerDescription: String?,
      isObscure: Boolean,
      isObscureAwaitingScan: Boolean,
      obscureHideControls: Boolean,
      obscureIsOpaque: Boolean,
      obscureDescription: String?,
      verifyAge: Boolean?,
      descriptionHint: String,
      accessibilityRole: String
   ) : Component(),
   SpoilerableData {
   public open val type: Int
   public open val id: String
   public final val media: UnfurledMediaItem
   public final val description: String?
   public final val isSpoiler: Boolean
   public final val spoilerDescription: String?
   public final val isObscure: Boolean
   public final val isObscureAwaitingScan: Boolean
   public final val obscureHideControls: Boolean
   public final val obscureIsOpaque: Boolean
   public final val obscureDescription: String?
   public final val verifyAge: Boolean?
   public final val descriptionHint: String
   public final val accessibilityRole: String
   public open val spoilerOrNull: String?
   public open val obscureOrNull: String?

   init {
      this.type = var1;
      this.id = var2;
      this.media = var3;
      this.description = var4;
      this.isSpoiler = var5;
      this.spoilerDescription = var6;
      this.isObscure = var7;
      this.isObscureAwaitingScan = var8;
      this.obscureHideControls = var9;
      this.obscureIsOpaque = var10;
      this.obscureDescription = var11;
      this.verifyAge = var12;
      this.descriptionHint = var13;
      this.accessibilityRole = var14;
      var var16: Boolean;
      if (var6 != null && !StringsKt.c0(var6)) {
         var16 = false;
      } else {
         var16 = true;
      }

      if (var16) {
         var6 = null;
      }

      this.spoilerOrNull = var6;
      var16 = true;
      if (var11 != null) {
         if (StringsKt.c0(var11)) {
            var16 = true;
         } else {
            var16 = false;
         }
      }

      if (var16) {
         var11 = null;
      }

      this.obscureOrNull = var11;
   }

   public operator fun component1(): Int {
      return this.type;
   }

   public operator fun component10(): Boolean {
      return this.obscureIsOpaque;
   }

   public operator fun component11(): String? {
      return this.obscureDescription;
   }

   public operator fun component12(): Boolean? {
      return this.verifyAge;
   }

   public operator fun component13(): String {
      return this.descriptionHint;
   }

   public operator fun component14(): String {
      return this.accessibilityRole;
   }

   public operator fun component2(): String {
      return this.id;
   }

   public operator fun component3(): UnfurledMediaItem {
      return this.media;
   }

   public operator fun component4(): String? {
      return this.description;
   }

   public operator fun component5(): Boolean {
      return this.isSpoiler;
   }

   public operator fun component6(): String? {
      return this.spoilerDescription;
   }

   public operator fun component7(): Boolean {
      return this.isObscure;
   }

   public operator fun component8(): Boolean {
      return this.isObscureAwaitingScan;
   }

   public operator fun component9(): Boolean {
      return this.obscureHideControls;
   }

   public fun copy(
      type: Int = var0.type,
      id: String = var0.id,
      media: UnfurledMediaItem = var0.media,
      description: String? = var0.description,
      isSpoiler: Boolean = var0.isSpoiler,
      spoilerDescription: String? = var0.spoilerDescription,
      isObscure: Boolean = var0.isObscure,
      isObscureAwaitingScan: Boolean = var0.isObscureAwaitingScan,
      obscureHideControls: Boolean = var0.obscureHideControls,
      obscureIsOpaque: Boolean = var0.obscureIsOpaque,
      obscureDescription: String? = var0.obscureDescription,
      verifyAge: Boolean? = var0.verifyAge,
      descriptionHint: String = var0.descriptionHint,
      accessibilityRole: String = var0.accessibilityRole
   ): ThumbnailDisplayComponent {
      return new ThumbnailDisplayComponent(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is ThumbnailDisplayComponent) {
         return false;
      } else {
         var1 = var1;
         if (this.type != var1.type) {
            return false;
         } else if (!(this.id == var1.id)) {
            return false;
         } else if (!(this.media == var1.media)) {
            return false;
         } else if (!(this.description == var1.description)) {
            return false;
         } else if (this.isSpoiler != var1.isSpoiler) {
            return false;
         } else if (!(this.spoilerDescription == var1.spoilerDescription)) {
            return false;
         } else if (this.isObscure != var1.isObscure) {
            return false;
         } else if (this.isObscureAwaitingScan != var1.isObscureAwaitingScan) {
            return false;
         } else if (this.obscureHideControls != var1.obscureHideControls) {
            return false;
         } else if (this.obscureIsOpaque != var1.obscureIsOpaque) {
            return false;
         } else if (!(this.obscureDescription == var1.obscureDescription)) {
            return false;
         } else if (!(this.verifyAge == var1.verifyAge)) {
            return false;
         } else if (!(this.descriptionHint == var1.descriptionHint)) {
            return false;
         } else {
            return this.accessibilityRole == var1.accessibilityRole;
         }
      }
   }

   public override fun hashCode(): Int {
      val var7: Int = Integer.hashCode(this.type);
      val var5: Int = this.id.hashCode();
      val var6: Int = this.media.hashCode();
      var var4: Int = 0;
      val var1: Int;
      if (this.description == null) {
         var1 = 0;
      } else {
         var1 = this.description.hashCode();
      }

      val var8: Int = java.lang.Boolean.hashCode(this.isSpoiler);
      val var2: Int;
      if (this.spoilerDescription == null) {
         var2 = 0;
      } else {
         var2 = this.spoilerDescription.hashCode();
      }

      val var10: Int = java.lang.Boolean.hashCode(this.isObscure);
      val var9: Int = java.lang.Boolean.hashCode(this.isObscureAwaitingScan);
      val var12: Int = java.lang.Boolean.hashCode(this.obscureHideControls);
      val var11: Int = java.lang.Boolean.hashCode(this.obscureIsOpaque);
      val var3: Int;
      if (this.obscureDescription == null) {
         var3 = 0;
      } else {
         var3 = this.obscureDescription.hashCode();
      }

      if (this.verifyAge != null) {
         var4 = this.verifyAge.hashCode();
      }

      return (
               (
                        (
                                 (
                                          ((((((((var7 * 31 + var5) * 31 + var6) * 31 + var1) * 31 + var8) * 31 + var2) * 31 + var10) * 31 + var9) * 31 + var12)
                                                * 31
                                             + var11
                                       )
                                       * 31
                                    + var3
                              )
                              * 31
                           + var4
                     )
                     * 31
                  + this.descriptionHint.hashCode()
            )
            * 31
         + this.accessibilityRole.hashCode();
   }

   public override fun toString(): String {
      val var1: Int = this.type;
      val var15: java.lang.String = this.id;
      val var8: UnfurledMediaItem = this.media;
      val var9: java.lang.String = this.description;
      val var6: Boolean = this.isSpoiler;
      val var10: java.lang.String = this.spoilerDescription;
      val var5: Boolean = this.isObscure;
      val var3: Boolean = this.isObscureAwaitingScan;
      val var4: Boolean = this.obscureHideControls;
      val var2: Boolean = this.obscureIsOpaque;
      val var11: java.lang.String = this.obscureDescription;
      val var12: java.lang.Boolean = this.verifyAge;
      val var7: java.lang.String = this.descriptionHint;
      val var14: java.lang.String = this.accessibilityRole;
      val var13: StringBuilder = new StringBuilder();
      var13.append("ThumbnailDisplayComponent(type=");
      var13.append(var1);
      var13.append(", id=");
      var13.append(var15);
      var13.append(", media=");
      var13.append(var8);
      var13.append(", description=");
      var13.append(var9);
      var13.append(", isSpoiler=");
      var13.append(var6);
      var13.append(", spoilerDescription=");
      var13.append(var10);
      var13.append(", isObscure=");
      var13.append(var5);
      var13.append(", isObscureAwaitingScan=");
      var13.append(var3);
      var13.append(", obscureHideControls=");
      var13.append(var4);
      var13.append(", obscureIsOpaque=");
      var13.append(var2);
      var13.append(", obscureDescription=");
      var13.append(var11);
      var13.append(", verifyAge=");
      var13.append(var12);
      var13.append(", descriptionHint=");
      var13.append(var7);
      var13.append(", accessibilityRole=");
      var13.append(var14);
      var13.append(")");
      return var13.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<ThumbnailDisplayComponent> {
         return ThumbnailDisplayComponent.$serializer.INSTANCE;
      }
   }
}

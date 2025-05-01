package com.discord.chat.bridge.botuikit

import Y9.f
import Y9.n
import Z9.a
import ba.C0
import ba.G
import ba.N
import com.discord.chat.bridge.media.UnfurledMediaItem
import com.discord.chat.bridge.spoiler.SpoilerableData
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor

@f
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
      accessibilityRole: String,
      srcIsAnimated: Boolean = false
   )
   : Component,
   SpoilerableData {
   public final val accessibilityRole: String
   public final val description: String?
   public final val descriptionHint: String
   public open val id: String
   public final val isObscure: Boolean
   public final val isObscureAwaitingScan: Boolean
   public final val isSpoiler: Boolean
   public final val media: UnfurledMediaItem
   public final val obscureDescription: String?
   public final val obscureHideControls: Boolean
   public final val obscureIsOpaque: Boolean
   public open val obscureOrNull: String?
   public final val spoilerDescription: String?
   public open val spoilerOrNull: String?
   public final val srcIsAnimated: Boolean
   public open val type: Int
   public final val verifyAge: Boolean?

   init {
      var var18: java.lang.String = var6;
      var var17: java.lang.String = var11;
      q.h(var2, "id");
      q.h(var3, "media");
      q.h(var13, "descriptionHint");
      q.h(var14, "accessibilityRole");
      super(null);
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
      this.srcIsAnimated = var15;
      var var19: Boolean;
      if (var6 != null && !h.d0(var6)) {
         var19 = false;
      } else {
         var19 = true;
      }

      if (var19) {
         var18 = null;
      }

      this.spoilerOrNull = var18;
      var19 = true;
      if (var11 != null) {
         if (h.d0(var11)) {
            var19 = true;
         } else {
            var19 = false;
         }
      }

      if (var19) {
         var17 = null;
      }

      this.obscureOrNull = var17;
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

   public operator fun component15(): Boolean {
      return this.srcIsAnimated;
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
      accessibilityRole: String = var0.accessibilityRole,
      srcIsAnimated: Boolean = var0.srcIsAnimated
   ): ThumbnailDisplayComponent {
      q.h(var2, "id");
      q.h(var3, "media");
      q.h(var13, "descriptionHint");
      q.h(var14, "accessibilityRole");
      return new ThumbnailDisplayComponent(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15);
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
         } else if (!q.c(this.id, var1.id)) {
            return false;
         } else if (!q.c(this.media, var1.media)) {
            return false;
         } else if (!q.c(this.description, var1.description)) {
            return false;
         } else if (this.isSpoiler != var1.isSpoiler) {
            return false;
         } else if (!q.c(this.spoilerDescription, var1.spoilerDescription)) {
            return false;
         } else if (this.isObscure != var1.isObscure) {
            return false;
         } else if (this.isObscureAwaitingScan != var1.isObscureAwaitingScan) {
            return false;
         } else if (this.obscureHideControls != var1.obscureHideControls) {
            return false;
         } else if (this.obscureIsOpaque != var1.obscureIsOpaque) {
            return false;
         } else if (!q.c(this.obscureDescription, var1.obscureDescription)) {
            return false;
         } else if (!q.c(this.verifyAge, var1.verifyAge)) {
            return false;
         } else if (!q.c(this.descriptionHint, var1.descriptionHint)) {
            return false;
         } else if (!q.c(this.accessibilityRole, var1.accessibilityRole)) {
            return false;
         } else {
            return this.srcIsAnimated == var1.srcIsAnimated;
         }
      }
   }

   public override fun hashCode(): Int {
      val var5: Int = Integer.hashCode(this.type);
      val var6: Int = this.id.hashCode();
      val var7: Int = this.media.hashCode();
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

      val var12: Int = java.lang.Boolean.hashCode(this.isObscure);
      val var9: Int = java.lang.Boolean.hashCode(this.isObscureAwaitingScan);
      val var11: Int = java.lang.Boolean.hashCode(this.obscureHideControls);
      val var10: Int = java.lang.Boolean.hashCode(this.obscureIsOpaque);
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
                                          (
                                                   (
                                                            (
                                                                     ((((((var5 * 31 + var6) * 31 + var7) * 31 + var1) * 31 + var8) * 31 + var2) * 31 + var12)
                                                                           * 31
                                                                        + var9
                                                                  )
                                                                  * 31
                                                               + var11
                                                         )
                                                         * 31
                                                      + var10
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
                  + this.accessibilityRole.hashCode()
            )
            * 31
         + java.lang.Boolean.hashCode(this.srcIsAnimated);
   }

   public override fun toString(): String {
      val var1: Int = this.type;
      val var11: java.lang.String = this.id;
      val var8: UnfurledMediaItem = this.media;
      val var13: java.lang.String = this.description;
      val var2: Boolean = this.isSpoiler;
      val var10: java.lang.String = this.spoilerDescription;
      val var5: Boolean = this.isObscure;
      val var7: Boolean = this.isObscureAwaitingScan;
      val var3: Boolean = this.obscureHideControls;
      val var6: Boolean = this.obscureIsOpaque;
      val var15: java.lang.String = this.obscureDescription;
      val var14: java.lang.Boolean = this.verifyAge;
      val var16: java.lang.String = this.descriptionHint;
      val var12: java.lang.String = this.accessibilityRole;
      val var4: Boolean = this.srcIsAnimated;
      val var9: StringBuilder = new StringBuilder();
      var9.append("ThumbnailDisplayComponent(type=");
      var9.append(var1);
      var9.append(", id=");
      var9.append(var11);
      var9.append(", media=");
      var9.append(var8);
      var9.append(", description=");
      var9.append(var13);
      var9.append(", isSpoiler=");
      var9.append(var2);
      var9.append(", spoilerDescription=");
      var9.append(var10);
      var9.append(", isObscure=");
      var9.append(var5);
      var9.append(", isObscureAwaitingScan=");
      var9.append(var7);
      var9.append(", obscureHideControls=");
      var9.append(var3);
      var9.append(", obscureIsOpaque=");
      var9.append(var6);
      var9.append(", obscureDescription=");
      var9.append(var15);
      var9.append(", verifyAge=");
      var9.append(var14);
      var9.append(", descriptionHint=");
      var9.append(var16);
      var9.append(", accessibilityRole=");
      var9.append(var12);
      var9.append(", srcIsAnimated=");
      var9.append(var4);
      var9.append(")");
      return var9.toString();
   }

   public object `$serializer` : G {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: ThumbnailDisplayComponent.$serializer = new ThumbnailDisplayComponent.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("11", var0, 17);
         var1.l("type", false);
         var1.l("id", false);
         var1.l("media", false);
         var1.l("description", true);
         var1.l("isSpoiler", false);
         var1.l("spoilerDescription", false);
         var1.l("isObscure", false);
         var1.l("isObscureAwaitingScan", false);
         var1.l("obscureHideControls", false);
         var1.l("obscureIsOpaque", false);
         var1.l("obscureDescription", false);
         var1.l("verifyAge", false);
         var1.l("descriptionHint", false);
         var1.l("accessibilityRole", false);
         var1.l("srcIsAnimated", true);
         var1.l("spoilerOrNull", true);
         var1.l("obscureOrNull", true);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         val var8: C0 = C0.a;
         val var2: KSerializer = a.u(C0.a);
         val var6: ba.h = ba.h.a;
         return new KSerializer[]{
            N.a,
            var8,
            UnfurledMediaItem.$serializer.INSTANCE,
            var2,
            ba.h.a,
            a.u(var8),
            var6,
            var6,
            var6,
            var6,
            a.u(var8),
            a.u(var6),
            var8,
            var8,
            var6,
            a.u(var8),
            a.u(var8)
         };
      }

      public open fun deserialize(decoder: Decoder): ThumbnailDisplayComponent {
         q.h(var1, "decoder");
         val var28: SerialDescriptor = this.getDescriptor();
         val var29: c = var1.c(var28);
         var var9: Boolean = var29.y();
         var var4: Byte = 11;
         var var7: Byte = 10;
         var var6: Int = 9;
         var var2: Int = 0;
         var var3: Int;
         var var11: Boolean;
         var var12: Boolean;
         var var13: Boolean;
         var var14: Boolean;
         val var15: Boolean;
         val var16: Boolean;
         var var17: java.lang.String;
         var var20: java.lang.String;
         var var22: java.lang.String;
         var var24: java.lang.String;
         var var25: UnfurledMediaItem;
         val var26: java.lang.String;
         var var31: java.lang.String;
         var var44: Any;
         var var46: java.lang.String;
         var var48: java.lang.String;
         if (var9) {
            var2 = var29.k(var28, 0);
            var20 = var29.t(var28, 1);
            var25 = var29.m(var28, 2, UnfurledMediaItem.$serializer.INSTANCE, null) as UnfurledMediaItem;
            val var19: C0 = C0.a;
            var24 = var29.v(var28, 3, C0.a, null) as java.lang.String;
            var16 = var29.s(var28, 4);
            var22 = var29.v(var28, 5, var19, null) as java.lang.String;
            var13 = var29.s(var28, 6);
            val var10: Boolean = var29.s(var28, 7);
            var15 = var29.s(var28, 8);
            var9 = var29.s(var28, 9);
            var44 = var29.v(var28, 10, var19, null) as java.lang.String;
            val var21: java.lang.Boolean = var29.v(var28, 11, ba.h.a, null) as java.lang.Boolean;
            var17 = var29.t(var28, 12);
            val var30: java.lang.String = var29.t(var28, 13);
            var14 = var29.s(var28, 14);
            val var23: java.lang.String = var29.v(var28, 15, var19, null) as java.lang.String;
            var26 = var29.v(var28, 16, var19, null) as java.lang.String;
            var3 = 131071;
            var11 = var10;
            var12 = var9;
            var46 = (java.lang.String)var44;
            var44 = var21;
            var48 = var30;
            var31 = var23;
         } else {
            var var5: Boolean = true;
            var25 = null;
            var24 = null;
            var17 = null;
            var31 = null;
            var var50: Any = null;
            var22 = null;
            var48 = null;
            var20 = null;
            var46 = null;
            var44 = null;
            var3 = 0;
            var12 = false;
            var14 = false;
            var11 = false;
            var var38: Boolean = false;
            var9 = false;
            var13 = false;

            while (var5) {
               label48: {
                  label47: {
                     label46: {
                        val var8: Int = var29.x(var28);
                        switch (var8) {
                           case -1:
                              var5 = false;
                              continue;
                           case 0:
                              var3 = var29.k(var28, 0);
                              var2 |= 1;
                              break label46;
                           case 1:
                              var20 = var29.t(var28, 1);
                              var2 |= 2;
                              break label46;
                           case 2:
                              var25 = var29.m(var28, 2, UnfurledMediaItem.$serializer.INSTANCE, var25) as UnfurledMediaItem;
                              var2 |= 4;
                              break label46;
                           case 3:
                              var24 = var29.v(var28, 3, C0.a, var24) as java.lang.String;
                              var2 |= 8;
                              break label46;
                           case 4:
                              var9 = var29.s(var28, 4);
                              var2 |= 16;
                              break label46;
                           case 5:
                              var22 = var29.v(var28, 5, C0.a, var22) as java.lang.String;
                              var2 |= 32;
                              break label46;
                           case 6:
                              var38 = var29.s(var28, 6);
                              var2 |= 64;
                              break label47;
                           case 7:
                              var11 = var29.s(var28, 7);
                              var2 |= 128;
                              break label47;
                           case 8:
                              var13 = var29.s(var28, 8);
                              var2 |= 256;
                              var4 = 11;
                              continue;
                           case 9:
                              var14 = var29.s(var28, var6);
                              var2 |= 512;
                              continue;
                           case 10:
                              var48 = var29.v(var28, var7, C0.a, var48) as java.lang.String;
                              var2 |= 1024;
                              break label48;
                           case 11:
                              var50 = var29.v(var28, var4, ba.h.a, var50) as java.lang.Boolean;
                              var2 |= 2048;
                              break label48;
                           case 12:
                              var46 = var29.t(var28, 12);
                              var2 |= 4096;
                              break label48;
                           case 13:
                              var44 = var29.t(var28, 13);
                              var2 |= 8192;
                              break label48;
                           case 14:
                              var12 = var29.s(var28, 14);
                              var2 |= 16384;
                              break label48;
                           case 15:
                              var31 = var29.v(var28, 15, C0.a, var31) as java.lang.String;
                              var6 = 32768;
                              break;
                           case 16:
                              var17 = var29.v(var28, 16, C0.a, var17) as java.lang.String;
                              var6 = 65536;
                              break;
                           default:
                              throw new n(var8);
                        }

                        var2 |= var6;
                        break label48;
                     }

                     var4 = 11;
                     var7 = 10;
                     continue;
                  }

                  var4 = 11;
                  continue;
               }

               var6 = 9;
            }

            var3 = var2;
            var26 = var17;
            var14 = var12;
            var48 = (java.lang.String)var44;
            var17 = var46;
            var44 = var50;
            var46 = var48;
            var12 = var14;
            var15 = var13;
            var13 = var38;
            var16 = var9;
            var2 = var3;
         }

         var29.b(var28);
         return new ThumbnailDisplayComponent(
            var3, var2, var20, var25, var24, var16, var22, var13, var11, var15, var12, var46, (java.lang.Boolean)var44, var17, var48, var14, var31, var26, null
         );
      }

      public open fun serialize(encoder: Encoder, value: ThumbnailDisplayComponent) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.c(var3);
         ThumbnailDisplayComponent.write$Self$chat_release(var2, var4, var3);
         var4.b(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return ba.G.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<ThumbnailDisplayComponent> {
         return ThumbnailDisplayComponent.$serializer.INSTANCE;
      }
   }
}

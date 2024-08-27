package com.discord.chat.bridge

import kotlin.jvm.internal.r
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
import uk.f
import uk.n
import xk.a2
import xk.e0
import xk.f0
import xk.m0
import xk.f0.a

@f
public data class UploadProgress(headerText: String,
   headerColor: Int,
   backgroundColor: Int,
   progress: Float,
   fileId: String,
   fileType: String,
   progressTrackColor: Int,
   progressStartColor: Int,
   progressEndColor: Int,
   iconTintColor: Int,
   closeTintColor: Int
) {
   public final val backgroundColor: Int
   public final val closeTintColor: Int
   public final val fileId: String
   public final val fileType: String
   public final val headerColor: Int
   public final val headerText: String
   public final val iconTintColor: Int
   public final val progress: Float
   public final val progressEndColor: Int
   public final val progressStartColor: Int
   public final val progressTrackColor: Int

   init {
      r.h(var1, "headerText");
      r.h(var5, "fileId");
      r.h(var6, "fileType");
      super();
      this.headerText = var1;
      this.headerColor = var2;
      this.backgroundColor = var3;
      this.progress = var4;
      this.fileId = var5;
      this.fileType = var6;
      this.progressTrackColor = var7;
      this.progressStartColor = var8;
      this.progressEndColor = var9;
      this.iconTintColor = var10;
      this.closeTintColor = var11;
   }

   @JvmStatic
   public fun `write$Self`(self: UploadProgress, output: CompositeEncoder, serialDesc: SerialDescriptor) {
      r.h(var0, "self");
      r.h(var1, "output");
      r.h(var2, "serialDesc");
      var1.z(var2, 0, var0.headerText);
      var1.w(var2, 1, var0.headerColor);
      var1.w(var2, 2, var0.backgroundColor);
      var1.r(var2, 3, var0.progress);
      var1.z(var2, 4, var0.fileId);
      var1.z(var2, 5, var0.fileType);
      var1.w(var2, 6, var0.progressTrackColor);
      var1.w(var2, 7, var0.progressStartColor);
      var1.w(var2, 8, var0.progressEndColor);
      var1.w(var2, 9, var0.iconTintColor);
      var1.w(var2, 10, var0.closeTintColor);
   }

   public operator fun component1(): String {
      return this.headerText;
   }

   public operator fun component10(): Int {
      return this.iconTintColor;
   }

   public operator fun component11(): Int {
      return this.closeTintColor;
   }

   public operator fun component2(): Int {
      return this.headerColor;
   }

   public operator fun component3(): Int {
      return this.backgroundColor;
   }

   public operator fun component4(): Float {
      return this.progress;
   }

   public operator fun component5(): String {
      return this.fileId;
   }

   public operator fun component6(): String {
      return this.fileType;
   }

   public operator fun component7(): Int {
      return this.progressTrackColor;
   }

   public operator fun component8(): Int {
      return this.progressStartColor;
   }

   public operator fun component9(): Int {
      return this.progressEndColor;
   }

   public fun copy(
      headerText: String = var0.headerText,
      headerColor: Int = var0.headerColor,
      backgroundColor: Int = var0.backgroundColor,
      progress: Float = var0.progress,
      fileId: String = var0.fileId,
      fileType: String = var0.fileType,
      progressTrackColor: Int = var0.progressTrackColor,
      progressStartColor: Int = var0.progressStartColor,
      progressEndColor: Int = var0.progressEndColor,
      iconTintColor: Int = var0.iconTintColor,
      closeTintColor: Int = var0.closeTintColor
   ): UploadProgress {
      r.h(var1, "headerText");
      r.h(var5, "fileId");
      r.h(var6, "fileType");
      return new UploadProgress(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is UploadProgress) {
         return false;
      } else {
         var1 = var1;
         if (!r.c(this.headerText, var1.headerText)) {
            return false;
         } else if (this.headerColor != var1.headerColor) {
            return false;
         } else if (this.backgroundColor != var1.backgroundColor) {
            return false;
         } else if (java.lang.Float.compare(this.progress, var1.progress) != 0) {
            return false;
         } else if (!r.c(this.fileId, var1.fileId)) {
            return false;
         } else if (!r.c(this.fileType, var1.fileType)) {
            return false;
         } else if (this.progressTrackColor != var1.progressTrackColor) {
            return false;
         } else if (this.progressStartColor != var1.progressStartColor) {
            return false;
         } else if (this.progressEndColor != var1.progressEndColor) {
            return false;
         } else if (this.iconTintColor != var1.iconTintColor) {
            return false;
         } else {
            return this.closeTintColor == var1.closeTintColor;
         }
      }
   }

   public override fun hashCode(): Int {
      return (
               (
                        (
                                 (
                                          (
                                                   (
                                                            (
                                                                     (
                                                                              (this.headerText.hashCode() * 31 + Integer.hashCode(this.headerColor)) * 31
                                                                                 + Integer.hashCode(this.backgroundColor)
                                                                           )
                                                                           * 31
                                                                        + java.lang.Float.hashCode(this.progress)
                                                                  )
                                                                  * 31
                                                               + this.fileId.hashCode()
                                                         )
                                                         * 31
                                                      + this.fileType.hashCode()
                                                )
                                                * 31
                                             + Integer.hashCode(this.progressTrackColor)
                                       )
                                       * 31
                                    + Integer.hashCode(this.progressStartColor)
                              )
                              * 31
                           + Integer.hashCode(this.progressEndColor)
                     )
                     * 31
                  + Integer.hashCode(this.iconTintColor)
            )
            * 31
         + Integer.hashCode(this.closeTintColor);
   }

   public override fun toString(): String {
      val var12: java.lang.String = this.headerText;
      val var7: Int = this.headerColor;
      val var5: Int = this.backgroundColor;
      val var1: Float = this.progress;
      val var10: java.lang.String = this.fileId;
      val var9: java.lang.String = this.fileType;
      val var6: Int = this.progressTrackColor;
      val var2: Int = this.progressStartColor;
      val var4: Int = this.progressEndColor;
      val var3: Int = this.iconTintColor;
      val var8: Int = this.closeTintColor;
      val var11: StringBuilder = new StringBuilder();
      var11.append("UploadProgress(headerText=");
      var11.append(var12);
      var11.append(", headerColor=");
      var11.append(var7);
      var11.append(", backgroundColor=");
      var11.append(var5);
      var11.append(", progress=");
      var11.append(var1);
      var11.append(", fileId=");
      var11.append(var10);
      var11.append(", fileType=");
      var11.append(var9);
      var11.append(", progressTrackColor=");
      var11.append(var6);
      var11.append(", progressStartColor=");
      var11.append(var2);
      var11.append(", progressEndColor=");
      var11.append(var4);
      var11.append(", iconTintColor=");
      var11.append(var3);
      var11.append(", closeTintColor=");
      var11.append(var8);
      var11.append(")");
      return var11.toString();
   }

   public object `$serializer` : f0<UploadProgress> {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: UploadProgress.$serializer = new UploadProgress.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.bridge.UploadProgress", var0, 11);
         var1.l("headerText", false);
         var1.l("headerColor", false);
         var1.l("backgroundColor", false);
         var1.l("progress", false);
         var1.l("fileId", false);
         var1.l("fileType", false);
         var1.l("progressTrackColor", false);
         var1.l("progressStartColor", false);
         var1.l("progressEndColor", false);
         var1.l("iconTintColor", false);
         var1.l("closeTintColor", false);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{a2.a, m0.a, m0.a, e0.a, a2.a, a2.a, m0.a, m0.a, m0.a, m0.a, m0.a};
      }

      public open fun deserialize(decoder: Decoder): UploadProgress {
         r.h(var1, "decoder");
         val var18: SerialDescriptor = this.getDescriptor();
         val var19: c = var1.b(var18);
         val var14: Boolean = var19.p();
         var var3: Int = 0;
         var var2: Float;
         var var4: Int;
         var var6: Int;
         var var8: Int;
         var var9: Int;
         var var10: Int;
         val var11: Int;
         var var12: Int;
         var var15: java.lang.String;
         var var16: java.lang.String;
         val var20: java.lang.String;
         var var26: Int;
         if (var14) {
            var16 = var19.m(var18, 0);
            var10 = var19.i(var18, 1);
            var12 = var19.i(var18, 2);
            var2 = var19.u(var18, 3);
            var15 = var19.m(var18, 4);
            var20 = var19.m(var18, 5);
            var9 = var19.i(var18, 6);
            val var5: Int = var19.i(var18, 7);
            var26 = var19.i(var18, 8);
            var4 = var19.i(var18, 9);
            var3 = var19.i(var18, 10);
            var8 = 2047;
            var6 = var5;
            var11 = var26;
            var26 = var3;
         } else {
            var16 = null;
            var15 = null;
            var var21: java.lang.String = null;
            var var31: Boolean = true;
            var9 = 0;
            var8 = 0;
            var6 = 0;
            var26 = 0;
            var4 = 0;
            var var24: Int = 0;
            var2 = 0.0F;
            var10 = 0;

            while (var31) {
               var12 = var19.o(var18);
               switch (var12) {
                  case -1:
                     var31 = false;
                     break;
                  case 0:
                     var16 = var19.m(var18, 0);
                     var3 |= 1;
                     break;
                  case 1:
                     var24 = var19.i(var18, 1);
                     var3 |= 2;
                     break;
                  case 2:
                     var4 = var19.i(var18, 2);
                     var3 |= 4;
                     break;
                  case 3:
                     var2 = var19.u(var18, 3);
                     var3 |= 8;
                     break;
                  case 4:
                     var21 = var19.m(var18, 4);
                     var3 |= 16;
                     break;
                  case 5:
                     var15 = var19.m(var18, 5);
                     var3 |= 32;
                     break;
                  case 6:
                     var6 = var19.i(var18, 6);
                     var3 |= 64;
                     break;
                  case 7:
                     var8 = var19.i(var18, 7);
                     var3 |= 128;
                     break;
                  case 8:
                     var26 = var19.i(var18, 8);
                     var3 |= 256;
                     break;
                  case 9:
                     var9 = var19.i(var18, 9);
                     var3 |= 512;
                     break;
                  case 10:
                     var10 = var19.i(var18, 10);
                     var3 |= 1024;
                     break;
                  default:
                     throw new n(var12);
               }
            }

            var11 = var26;
            var15 = var21;
            var26 = var10;
            var4 = var9;
            var6 = var8;
            var9 = var6;
            var20 = var15;
            var12 = var4;
            var10 = var24;
            var8 = var3;
         }

         var19.c(var18);
         return new UploadProgress(var8, var16, var10, var12, var2, var15, var20, var9, var6, var11, var4, var26, null);
      }

      public open fun serialize(encoder: Encoder, value: UploadProgress) {
         r.h(var1, "encoder");
         r.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         UploadProgress.write$Self(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer<?>> {
         return a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<UploadProgress> {
         return UploadProgress.$serializer.INSTANCE;
      }
   }
}

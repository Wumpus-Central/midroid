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
      val var9: java.lang.String = this.headerText;
      val var7: Int = this.headerColor;
      val var4: Int = this.backgroundColor;
      val var1: Float = this.progress;
      val var12: java.lang.String = this.fileId;
      val var11: java.lang.String = this.fileType;
      val var8: Int = this.progressTrackColor;
      val var5: Int = this.progressStartColor;
      val var6: Int = this.progressEndColor;
      val var3: Int = this.iconTintColor;
      val var2: Int = this.closeTintColor;
      val var10: StringBuilder = new StringBuilder();
      var10.append("UploadProgress(headerText=");
      var10.append(var9);
      var10.append(", headerColor=");
      var10.append(var7);
      var10.append(", backgroundColor=");
      var10.append(var4);
      var10.append(", progress=");
      var10.append(var1);
      var10.append(", fileId=");
      var10.append(var12);
      var10.append(", fileType=");
      var10.append(var11);
      var10.append(", progressTrackColor=");
      var10.append(var8);
      var10.append(", progressStartColor=");
      var10.append(var5);
      var10.append(", progressEndColor=");
      var10.append(var6);
      var10.append(", iconTintColor=");
      var10.append(var3);
      var10.append(", closeTintColor=");
      var10.append(var2);
      var10.append(")");
      return var10.toString();
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
         val var17: SerialDescriptor = this.getDescriptor();
         val var18: c = var1.b(var17);
         val var13: Boolean = var18.p();
         var var3: Int = 0;
         var var2: Float;
         var var4: Int;
         var var6: Int;
         var var7: Int;
         var var8: Int;
         var var9: Int;
         var var10: Int;
         val var11: Int;
         var var12: Int;
         var var14: java.lang.String;
         var var15: java.lang.String;
         val var19: java.lang.String;
         if (var13) {
            var15 = var18.m(var17, 0);
            var7 = var18.i(var17, 1);
            var8 = var18.i(var17, 2);
            var2 = var18.u(var17, 3);
            var14 = var18.m(var17, 4);
            var19 = var18.m(var17, 5);
            var11 = var18.i(var17, 6);
            val var5: Int = var18.i(var17, 7);
            var6 = var18.i(var17, 8);
            var4 = var18.i(var17, 9);
            var3 = var18.i(var17, 10);
            var12 = 2047;
            var9 = var5;
            var10 = var3;
         } else {
            var15 = null;
            var14 = null;
            var var20: java.lang.String = null;
            var var28: Boolean = true;
            var9 = 0;
            var8 = 0;
            var7 = 0;
            var6 = 0;
            var4 = 0;
            var var23: Int = 0;
            var2 = 0.0F;
            var10 = 0;

            while (var28) {
               var12 = var18.o(var17);
               switch (var12) {
                  case -1:
                     var28 = false;
                     break;
                  case 0:
                     var15 = var18.m(var17, 0);
                     var3 |= 1;
                     break;
                  case 1:
                     var23 = var18.i(var17, 1);
                     var3 |= 2;
                     break;
                  case 2:
                     var4 = var18.i(var17, 2);
                     var3 |= 4;
                     break;
                  case 3:
                     var2 = var18.u(var17, 3);
                     var3 |= 8;
                     break;
                  case 4:
                     var20 = var18.m(var17, 4);
                     var3 |= 16;
                     break;
                  case 5:
                     var14 = var18.m(var17, 5);
                     var3 |= 32;
                     break;
                  case 6:
                     var7 = var18.i(var17, 6);
                     var3 |= 64;
                     break;
                  case 7:
                     var8 = var18.i(var17, 7);
                     var3 |= 128;
                     break;
                  case 8:
                     var6 = var18.i(var17, 8);
                     var3 |= 256;
                     break;
                  case 9:
                     var9 = var18.i(var17, 9);
                     var3 |= 512;
                     break;
                  case 10:
                     var10 = var18.i(var17, 10);
                     var3 |= 1024;
                     break;
                  default:
                     throw new n(var12);
               }
            }

            var14 = var20;
            var11 = var7;
            var4 = var9;
            var9 = var8;
            var19 = var14;
            var8 = var4;
            var7 = var23;
            var12 = var3;
         }

         var18.c(var17);
         return new UploadProgress(var12, var15, var7, var8, var2, var14, var19, var11, var9, var6, var4, var10, null);
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

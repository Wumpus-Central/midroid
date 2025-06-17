package com.discord.chat.bridge

import Xa.f
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer

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
   public final val headerText: String
   public final val headerColor: Int
   public final val backgroundColor: Int
   public final val progress: Float
   public final val fileId: String
   public final val fileType: String
   public final val progressTrackColor: Int
   public final val progressStartColor: Int
   public final val progressEndColor: Int
   public final val iconTintColor: Int
   public final val closeTintColor: Int

   init {
      q.h(var1, "headerText");
      q.h(var5, "fileId");
      q.h(var6, "fileType");
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
      q.h(var1, "headerText");
      q.h(var5, "fileId");
      q.h(var6, "fileType");
      return new UploadProgress(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is UploadProgress) {
         return false;
      } else {
         var1 = var1;
         if (!q.c(this.headerText, var1.headerText)) {
            return false;
         } else if (this.headerColor != var1.headerColor) {
            return false;
         } else if (this.backgroundColor != var1.backgroundColor) {
            return false;
         } else if (java.lang.Float.compare(this.progress, var1.progress) != 0) {
            return false;
         } else if (!q.c(this.fileId, var1.fileId)) {
            return false;
         } else if (!q.c(this.fileType, var1.fileType)) {
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
      val var11: java.lang.String = this.headerText;
      val var5: Int = this.headerColor;
      val var8: Int = this.backgroundColor;
      val var1: Float = this.progress;
      val var10: java.lang.String = this.fileId;
      val var12: java.lang.String = this.fileType;
      val var7: Int = this.progressTrackColor;
      val var2: Int = this.progressStartColor;
      val var3: Int = this.progressEndColor;
      val var6: Int = this.iconTintColor;
      val var4: Int = this.closeTintColor;
      val var9: StringBuilder = new StringBuilder();
      var9.append("UploadProgress(headerText=");
      var9.append(var11);
      var9.append(", headerColor=");
      var9.append(var5);
      var9.append(", backgroundColor=");
      var9.append(var8);
      var9.append(", progress=");
      var9.append(var1);
      var9.append(", fileId=");
      var9.append(var10);
      var9.append(", fileType=");
      var9.append(var12);
      var9.append(", progressTrackColor=");
      var9.append(var7);
      var9.append(", progressStartColor=");
      var9.append(var2);
      var9.append(", progressEndColor=");
      var9.append(var3);
      var9.append(", iconTintColor=");
      var9.append(var6);
      var9.append(", closeTintColor=");
      var9.append(var4);
      var9.append(")");
      return var9.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<UploadProgress> {
         return UploadProgress.$serializer.INSTANCE;
      }
   }
}

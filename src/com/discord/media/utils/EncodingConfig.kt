package com.discord.media.utils

internal data class EncodingConfig(targetWidth: Int,
   targetHeight: Int,
   frameRate: Number,
   keyFrameIntervalSeconds: Number,
   targetBitrate: Number,
   useHEVC: Boolean,
   createHDR: Boolean,
   rotationDegrees: Number,
   progressUpdateGranularity: Int
) {
   public final val targetWidth: Int
   public final val targetHeight: Int
   public final val frameRate: Number
   public final val keyFrameIntervalSeconds: Number
   public final val targetBitrate: Number
   public final val useHEVC: Boolean
   public final val createHDR: Boolean
   public final val rotationDegrees: Number
   public final val progressUpdateGranularity: Int

   init {
      this.targetWidth = var1;
      this.targetHeight = var2;
      this.frameRate = var3;
      this.keyFrameIntervalSeconds = var4;
      this.targetBitrate = var5;
      this.useHEVC = var6;
      this.createHDR = var7;
      this.rotationDegrees = var8;
      this.progressUpdateGranularity = var9;
   }

   public operator fun component1(): Int {
      return this.targetWidth;
   }

   public operator fun component2(): Int {
      return this.targetHeight;
   }

   public operator fun component3(): Number {
      return this.frameRate;
   }

   public operator fun component4(): Number {
      return this.keyFrameIntervalSeconds;
   }

   public operator fun component5(): Number {
      return this.targetBitrate;
   }

   public operator fun component6(): Boolean {
      return this.useHEVC;
   }

   public operator fun component7(): Boolean {
      return this.createHDR;
   }

   public operator fun component8(): Number {
      return this.rotationDegrees;
   }

   public operator fun component9(): Int {
      return this.progressUpdateGranularity;
   }

   public fun copy(
      targetWidth: Int = var0.targetWidth,
      targetHeight: Int = var0.targetHeight,
      frameRate: Number = var0.frameRate,
      keyFrameIntervalSeconds: Number = var0.keyFrameIntervalSeconds,
      targetBitrate: Number = var0.targetBitrate,
      useHEVC: Boolean = var0.useHEVC,
      createHDR: Boolean = var0.createHDR,
      rotationDegrees: Number = var0.rotationDegrees,
      progressUpdateGranularity: Int = var0.progressUpdateGranularity
   ): EncodingConfig {
      return new EncodingConfig(var1, var2, var3, var4, var5, var6, var7, var8, var9);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is EncodingConfig) {
         return false;
      } else {
         var1 = var1;
         if (this.targetWidth != var1.targetWidth) {
            return false;
         } else if (this.targetHeight != var1.targetHeight) {
            return false;
         } else if (!(this.frameRate == var1.frameRate)) {
            return false;
         } else if (!(this.keyFrameIntervalSeconds == var1.keyFrameIntervalSeconds)) {
            return false;
         } else if (!(this.targetBitrate == var1.targetBitrate)) {
            return false;
         } else if (this.useHEVC != var1.useHEVC) {
            return false;
         } else if (this.createHDR != var1.createHDR) {
            return false;
         } else if (!(this.rotationDegrees == var1.rotationDegrees)) {
            return false;
         } else {
            return this.progressUpdateGranularity == var1.progressUpdateGranularity;
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
                                                            (Integer.hashCode(this.targetWidth) * 31 + Integer.hashCode(this.targetHeight)) * 31
                                                               + this.frameRate.hashCode()
                                                         )
                                                         * 31
                                                      + this.keyFrameIntervalSeconds.hashCode()
                                                )
                                                * 31
                                             + this.targetBitrate.hashCode()
                                       )
                                       * 31
                                    + java.lang.Boolean.hashCode(this.useHEVC)
                              )
                              * 31
                           + java.lang.Boolean.hashCode(this.createHDR)
                     )
                     * 31
                  + this.rotationDegrees.hashCode()
            )
            * 31
         + Integer.hashCode(this.progressUpdateGranularity);
   }

   public override fun toString(): String {
      val var1: Int = this.targetWidth;
      val var3: Int = this.targetHeight;
      val var6: java.lang.Number = this.frameRate;
      val var10: java.lang.Number = this.keyFrameIntervalSeconds;
      val var9: java.lang.Number = this.targetBitrate;
      val var5: Boolean = this.useHEVC;
      val var4: Boolean = this.createHDR;
      val var7: java.lang.Number = this.rotationDegrees;
      val var2: Int = this.progressUpdateGranularity;
      val var8: StringBuilder = new StringBuilder();
      var8.append("EncodingConfig(targetWidth=");
      var8.append(var1);
      var8.append(", targetHeight=");
      var8.append(var3);
      var8.append(", frameRate=");
      var8.append(var6);
      var8.append(", keyFrameIntervalSeconds=");
      var8.append(var10);
      var8.append(", targetBitrate=");
      var8.append(var9);
      var8.append(", useHEVC=");
      var8.append(var5);
      var8.append(", createHDR=");
      var8.append(var4);
      var8.append(", rotationDegrees=");
      var8.append(var7);
      var8.append(", progressUpdateGranularity=");
      var8.append(var2);
      var8.append(")");
      return var8.toString();
   }
}

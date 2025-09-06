package com.discord.chat.bridge.customthemes

import kotlinx.serialization.KSerializer
import nb.g

@g
public data class SharedCustomThemeData(colors: List<String>,
   gradientAngle: Float,
   createdBy: String,
   createdByAvatarUrl: String,
   nitroWheelIconUrl: String,
   previewLabel: String,
   previewHeading: String,
   createdByLabel: String
) {
   public final val colors: List<String>
   public final val gradientAngle: Float
   public final val createdBy: String
   public final val createdByAvatarUrl: String
   public final val nitroWheelIconUrl: String
   public final val previewLabel: String
   public final val previewHeading: String
   public final val createdByLabel: String

   init {
      super();
      this.colors = var1;
      this.gradientAngle = var2;
      this.createdBy = var3;
      this.createdByAvatarUrl = var4;
      this.nitroWheelIconUrl = var5;
      this.previewLabel = var6;
      this.previewHeading = var7;
      this.createdByLabel = var8;
   }

   public operator fun component1(): List<String> {
      return this.colors;
   }

   public operator fun component2(): Float {
      return this.gradientAngle;
   }

   public operator fun component3(): String {
      return this.createdBy;
   }

   public operator fun component4(): String {
      return this.createdByAvatarUrl;
   }

   public operator fun component5(): String {
      return this.nitroWheelIconUrl;
   }

   public operator fun component6(): String {
      return this.previewLabel;
   }

   public operator fun component7(): String {
      return this.previewHeading;
   }

   public operator fun component8(): String {
      return this.createdByLabel;
   }

   public fun copy(
      colors: List<String> = var0.colors,
      gradientAngle: Float = var0.gradientAngle,
      createdBy: String = var0.createdBy,
      createdByAvatarUrl: String = var0.createdByAvatarUrl,
      nitroWheelIconUrl: String = var0.nitroWheelIconUrl,
      previewLabel: String = var0.previewLabel,
      previewHeading: String = var0.previewHeading,
      createdByLabel: String = var0.createdByLabel
   ): SharedCustomThemeData {
      return new SharedCustomThemeData(var1, var2, var3, var4, var5, var6, var7, var8);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is SharedCustomThemeData) {
         return false;
      } else {
         var1 = var1;
         if (!(this.colors == var1.colors)) {
            return false;
         } else if (java.lang.Float.compare(this.gradientAngle, var1.gradientAngle) != 0) {
            return false;
         } else if (!(this.createdBy == var1.createdBy)) {
            return false;
         } else if (!(this.createdByAvatarUrl == var1.createdByAvatarUrl)) {
            return false;
         } else if (!(this.nitroWheelIconUrl == var1.nitroWheelIconUrl)) {
            return false;
         } else if (!(this.previewLabel == var1.previewLabel)) {
            return false;
         } else if (!(this.previewHeading == var1.previewHeading)) {
            return false;
         } else {
            return this.createdByLabel == var1.createdByLabel;
         }
      }
   }

   public override fun hashCode(): Int {
      return (
               (
                        (
                                 (
                                          ((this.colors.hashCode() * 31 + java.lang.Float.hashCode(this.gradientAngle)) * 31 + this.createdBy.hashCode()) * 31
                                             + this.createdByAvatarUrl.hashCode()
                                       )
                                       * 31
                                    + this.nitroWheelIconUrl.hashCode()
                              )
                              * 31
                           + this.previewLabel.hashCode()
                     )
                     * 31
                  + this.previewHeading.hashCode()
            )
            * 31
         + this.createdByLabel.hashCode();
   }

   public override fun toString(): String {
      val var6: java.util.List = this.colors;
      val var1: Float = this.gradientAngle;
      val var2: java.lang.String = this.createdBy;
      val var3: java.lang.String = this.createdByAvatarUrl;
      val var7: java.lang.String = this.nitroWheelIconUrl;
      val var4: java.lang.String = this.previewLabel;
      val var5: java.lang.String = this.previewHeading;
      val var8: java.lang.String = this.createdByLabel;
      val var9: StringBuilder = new StringBuilder();
      var9.append("SharedCustomThemeData(colors=");
      var9.append(var6);
      var9.append(", gradientAngle=");
      var9.append(var1);
      var9.append(", createdBy=");
      var9.append(var2);
      var9.append(", createdByAvatarUrl=");
      var9.append(var3);
      var9.append(", nitroWheelIconUrl=");
      var9.append(var7);
      var9.append(", previewLabel=");
      var9.append(var4);
      var9.append(", previewHeading=");
      var9.append(var5);
      var9.append(", createdByLabel=");
      var9.append(var8);
      var9.append(")");
      return var9.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<SharedCustomThemeData> {
         return SharedCustomThemeData.$serializer.INSTANCE;
      }
   }
}

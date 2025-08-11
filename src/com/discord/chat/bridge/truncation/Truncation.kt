package com.discord.chat.bridge.truncation

import kotlin.jvm.internal.r
import kotlinx.serialization.KSerializer
import tb.g

@g
public data class Truncation(numberOfLines: Int, expandable: Boolean, seeMoreLabel: String? = null, seeMoreLabelColor: Int? = null, forceShow: Boolean? = null) {
   public final val numberOfLines: Int
   public final val expandable: Boolean
   public final val seeMoreLabel: String?
   public final val seeMoreLabelColor: Int?
   public final val forceShow: Boolean?

   init {
      super();
      this.numberOfLines = var1;
      this.expandable = var2;
      this.seeMoreLabel = var3;
      this.seeMoreLabelColor = var4;
      this.forceShow = var5;
   }

   public operator fun component1(): Int {
      return this.numberOfLines;
   }

   public operator fun component2(): Boolean {
      return this.expandable;
   }

   public operator fun component3(): String? {
      return this.seeMoreLabel;
   }

   public operator fun component4(): Int? {
      return this.seeMoreLabelColor;
   }

   public operator fun component5(): Boolean? {
      return this.forceShow;
   }

   public fun copy(
      numberOfLines: Int = var0.numberOfLines,
      expandable: Boolean = var0.expandable,
      seeMoreLabel: String? = var0.seeMoreLabel,
      seeMoreLabelColor: Int? = var0.seeMoreLabelColor,
      forceShow: Boolean? = var0.forceShow
   ): Truncation {
      return new Truncation(var1, var2, var3, var4, var5);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is Truncation) {
         return false;
      } else {
         var1 = var1;
         if (this.numberOfLines != var1.numberOfLines) {
            return false;
         } else if (this.expandable != var1.expandable) {
            return false;
         } else if (!r.c(this.seeMoreLabel, var1.seeMoreLabel)) {
            return false;
         } else if (!r.c(this.seeMoreLabelColor, var1.seeMoreLabelColor)) {
            return false;
         } else {
            return r.c(this.forceShow, var1.forceShow);
         }
      }
   }

   public override fun hashCode(): Int {
      val var5: Int = Integer.hashCode(this.numberOfLines);
      val var4: Int = java.lang.Boolean.hashCode(this.expandable);
      var var3: Int = 0;
      val var1: Int;
      if (this.seeMoreLabel == null) {
         var1 = 0;
      } else {
         var1 = this.seeMoreLabel.hashCode();
      }

      val var2: Int;
      if (this.seeMoreLabelColor == null) {
         var2 = 0;
      } else {
         var2 = this.seeMoreLabelColor.hashCode();
      }

      if (this.forceShow != null) {
         var3 = this.forceShow.hashCode();
      }

      return (((var5 * 31 + var4) * 31 + var1) * 31 + var2) * 31 + var3;
   }

   public override fun toString(): String {
      val var1: Int = this.numberOfLines;
      val var2: Boolean = this.expandable;
      val var4: java.lang.String = this.seeMoreLabel;
      val var3: Int = this.seeMoreLabelColor;
      val var5: java.lang.Boolean = this.forceShow;
      val var6: StringBuilder = new StringBuilder();
      var6.append("Truncation(numberOfLines=");
      var6.append(var1);
      var6.append(", expandable=");
      var6.append(var2);
      var6.append(", seeMoreLabel=");
      var6.append(var4);
      var6.append(", seeMoreLabelColor=");
      var6.append(var3);
      var6.append(", forceShow=");
      var6.append(var5);
      var6.append(")");
      return var6.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<Truncation> {
         return Truncation.$serializer.INSTANCE;
      }
   }
}

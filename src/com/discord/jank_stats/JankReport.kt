package com.discord.jank_stats

public data class JankReport(numFrames: Int, numJankFrames: Int) {
   public final val numFrames: Int
   public final val numJankFrames: Int

   init {
      this.numFrames = var1;
      this.numJankFrames = var2;
   }

   public operator fun component1(): Int {
      return this.numFrames;
   }

   public operator fun component2(): Int {
      return this.numJankFrames;
   }

   public fun copy(numFrames: Int = var0.numFrames, numJankFrames: Int = var0.numJankFrames): JankReport {
      return new JankReport(var1, var2);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is JankReport) {
         return false;
      } else {
         var1 = var1;
         if (this.numFrames != var1.numFrames) {
            return false;
         } else {
            return this.numJankFrames == var1.numJankFrames;
         }
      }
   }

   public override fun hashCode(): Int {
      return Integer.hashCode(this.numFrames) * 31 + Integer.hashCode(this.numJankFrames);
   }

   public override fun toString(): String {
      val var1: Int = this.numFrames;
      val var2: Int = this.numJankFrames;
      val var3: StringBuilder = new StringBuilder();
      var3.append("JankReport(numFrames=");
      var3.append(var1);
      var3.append(", numJankFrames=");
      var3.append(var2);
      var3.append(")");
      return var3.toString();
   }
}

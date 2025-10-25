package com.discord.media.utils

import java.io.File

public class QualityAndResolutionConstraint(quality: Int, shouldResize: Boolean) : fa.a {
   private final val quality: Int
   private final val shouldResize: Boolean
   private final var isResolved: Boolean

   init {
      this.quality = var1;
      this.shouldResize = var2;
   }

   public open fun isSatisfied(imageFile: File): Boolean {
      return this.isResolved;
   }

   public open fun satisfy(imageFile: File): File {
      if (this.shouldResize) {
         var1 = ea.c.k(var1, ea.c.f(var1, ea.c.e(var1, 612, 816)), null, this.quality, 4, null);
      } else {
         var1 = ea.c.k(var1, ea.c.i(var1), null, this.quality, 4, null);
      }

      this.isResolved = true;
      return var1;
   }
}

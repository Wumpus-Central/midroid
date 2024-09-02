package com.discord.media.utils

import java.io.File
import kotlin.jvm.internal.q
import si.c

public class QualityAndResolutionConstraint(quality: Int, shouldResize: Boolean) : ti.a {
   private final val quality: Int
   private final val shouldResize: Boolean
   private final var isResolved: Boolean

   init {
      this.quality = var1;
      this.shouldResize = var2;
   }

   public open fun isSatisfied(imageFile: File): Boolean {
      q.h(var1, "imageFile");
      return this.isResolved;
   }

   public open fun satisfy(imageFile: File): File {
      q.h(var1, "imageFile");
      if (this.shouldResize) {
         var1 = c.k(var1, c.f(var1, c.e(var1, 612, 816)), null, this.quality, 4, null);
      } else {
         var1 = c.k(var1, c.i(var1), null, this.quality, 4, null);
      }

      this.isResolved = true;
      return var1;
   }
}

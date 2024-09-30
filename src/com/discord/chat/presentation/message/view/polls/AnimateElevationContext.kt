package com.discord.chat.presentation.message.view.polls

import android.animation.ObjectAnimator
import kotlin.jvm.internal.q

private data class AnimateElevationContext(tagValue: Any, elevation: Float, animator: ObjectAnimator? = null) {
   public final var animator: ObjectAnimator?
      internal set

   public final var elevation: Float
      internal set

   public final val tagValue: Any

   init {
      q.h(var1, "tagValue");
      super();
      this.tagValue = var1;
      this.elevation = var2;
      this.animator = var3;
   }

   public operator fun component1(): Any {
      return this.tagValue;
   }

   public operator fun component2(): Float {
      return this.elevation;
   }

   public operator fun component3(): ObjectAnimator? {
      return this.animator;
   }

   public fun copy(tagValue: Any = var0.tagValue, elevation: Float = var0.elevation, animator: ObjectAnimator? = var0.animator): AnimateElevationContext {
      q.h(var1, "tagValue");
      return new AnimateElevationContext(var1, var2, var3);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is AnimateElevationContext) {
         return false;
      } else {
         var1 = var1;
         if (!q.c(this.tagValue, var1.tagValue)) {
            return false;
         } else if (java.lang.Float.compare(this.elevation, var1.elevation) != 0) {
            return false;
         } else {
            return q.c(this.animator, var1.animator);
         }
      }
   }

   public override fun hashCode(): Int {
      val var3: Int = this.tagValue.hashCode();
      val var2: Int = java.lang.Float.hashCode(this.elevation);
      val var1: Int;
      if (this.animator == null) {
         var1 = 0;
      } else {
         var1 = this.animator.hashCode();
      }

      return (var3 * 31 + var2) * 31 + var1;
   }

   public override fun toString(): String {
      val var3: Any = this.tagValue;
      val var1: Float = this.elevation;
      val var2: ObjectAnimator = this.animator;
      val var4: StringBuilder = new StringBuilder();
      var4.append("AnimateElevationContext(tagValue=");
      var4.append(var3);
      var4.append(", elevation=");
      var4.append(var1);
      var4.append(", animator=");
      var4.append(var2);
      var4.append(")");
      return var4.toString();
   }
}

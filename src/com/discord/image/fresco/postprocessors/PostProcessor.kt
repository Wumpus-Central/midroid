package com.discord.image.fresco.postprocessors

import com.discord.image.fresco.postprocessors.processors.CompositePostprocessor
import com.discord.image.fresco.postprocessors.processors.GradientPostprocessor
import com.discord.image.fresco.postprocessors.processors.GrayscalePostprocessor
import com.discord.image.fresco.postprocessors.processors.SafeRoundAsCirclePostprocessor
import com.facebook.imagepipeline.request.BasePostprocessor
import eh.p
import java.util.ArrayList
import kotlin.jvm.internal.r

public sealed interface PostProcessor {
   public open fun create(): BasePostprocessor {
   }

   public object Circle : PostProcessor {
      override fun create(): BasePostprocessor {
         return PostProcessor.DefaultImpls.create(this);
      }
   }

   public companion object {
      public fun create(processor: PostProcessor): BasePostprocessor {
         r.h(var1, "processor");
         val var5: Any;
         if (var1 is PostProcessor.Composite) {
            val var2: java.util.List = (var1 as PostProcessor.Composite).getPostprocessors();
            val var4: ArrayList = new ArrayList(h.t(var2, 10));

            for (PostProcessor var6 : var2) {
               var4.add($$INSTANCE.create(var6));
            }

            var5 = new CompositePostprocessor(var4);
         } else if (var1 is PostProcessor.Circle) {
            var5 = new SafeRoundAsCirclePostprocessor();
         } else if (var1 is PostProcessor.Grayscale) {
            var5 = GrayscalePostprocessor.INSTANCE;
         } else {
            if (var1 !is PostProcessor.Gradient) {
               throw new p();
            }

            var5 = new GradientPostprocessor(var1 as PostProcessor.Gradient);
         }

         return (BasePostprocessor)var5;
      }
   }

   public data class Composite(postprocessors: List<PostProcessor>) : PostProcessor {
      public final val postprocessors: List<PostProcessor>

      init {
         r.h(var1, "postprocessors");
         super();
         this.postprocessors = var1;
      }

      public constructor(vararg postprocessors: PostProcessor) : r.h(var1, "postprocessors") {
         this(b.u0(var1));
      }

      public operator fun component1(): List<PostProcessor> {
         return this.postprocessors;
      }

      public fun copy(postprocessors: List<PostProcessor> = var0.postprocessors): com.discord.image.fresco.postprocessors.PostProcessor.Composite {
         r.h(var1, "postprocessors");
         return new PostProcessor.Composite(var1);
      }

      override fun create(): BasePostprocessor {
         return PostProcessor.DefaultImpls.create(this);
      }

      public override operator fun equals(other: Any?): Boolean {
         if (this === var1) {
            return true;
         } else if (var1 !is PostProcessor.Composite) {
            return false;
         } else {
            return r.c(this.postprocessors, (var1 as PostProcessor.Composite).postprocessors);
         }
      }

      public override fun hashCode(): Int {
         return this.postprocessors.hashCode();
      }

      public override fun toString(): String {
         val var1: java.util.List = this.postprocessors;
         val var2: StringBuilder = new StringBuilder();
         var2.append("Composite(postprocessors=");
         var2.append(var1);
         var2.append(")");
         return var2.toString();
      }
   }

   // $VF: Class flags could not be determined
   internal class DefaultImpls {
      @JvmStatic
      fun create(var0: PostProcessor): BasePostprocessor {
         return PostProcessor.Companion.create(var0);
      }
   }

   public data class Gradient(direction: com.discord.image.fresco.postprocessors.PostProcessor.Gradient.Direction,
         startColor: Int,
         endColor: Int,
         startPosition: Float = 0.0F,
         endPosition: Float = 1.0F
      ) :
      PostProcessor {
      public final val direction: com.discord.image.fresco.postprocessors.PostProcessor.Gradient.Direction
      public final val endColor: Int
      public final val endPosition: Float
      public final val startColor: Int
      public final val startPosition: Float

      init {
         r.h(var1, "direction");
         super();
         this.direction = var1;
         this.startColor = var2;
         this.endColor = var3;
         this.startPosition = var4;
         this.endPosition = var5;
      }

      public operator fun component1(): com.discord.image.fresco.postprocessors.PostProcessor.Gradient.Direction {
         return this.direction;
      }

      public operator fun component2(): Int {
         return this.startColor;
      }

      public operator fun component3(): Int {
         return this.endColor;
      }

      public operator fun component4(): Float {
         return this.startPosition;
      }

      public operator fun component5(): Float {
         return this.endPosition;
      }

      public fun copy(
         direction: com.discord.image.fresco.postprocessors.PostProcessor.Gradient.Direction = var0.direction,
         startColor: Int = var0.startColor,
         endColor: Int = var0.endColor,
         startPosition: Float = var0.startPosition,
         endPosition: Float = var0.endPosition
      ): com.discord.image.fresco.postprocessors.PostProcessor.Gradient {
         r.h(var1, "direction");
         return new PostProcessor.Gradient(var1, var2, var3, var4, var5);
      }

      override fun create(): BasePostprocessor {
         return PostProcessor.DefaultImpls.create(this);
      }

      public override operator fun equals(other: Any?): Boolean {
         if (this === var1) {
            return true;
         } else if (var1 !is PostProcessor.Gradient) {
            return false;
         } else {
            var1 = var1;
            if (this.direction != var1.direction) {
               return false;
            } else if (this.startColor != var1.startColor) {
               return false;
            } else if (this.endColor != var1.endColor) {
               return false;
            } else if (java.lang.Float.compare(this.startPosition, var1.startPosition) != 0) {
               return false;
            } else {
               return java.lang.Float.compare(this.endPosition, var1.endPosition) == 0;
            }
         }
      }

      public override fun hashCode(): Int {
         return (
                  ((this.direction.hashCode() * 31 + Integer.hashCode(this.startColor)) * 31 + Integer.hashCode(this.endColor)) * 31
                     + java.lang.Float.hashCode(this.startPosition)
               )
               * 31
            + java.lang.Float.hashCode(this.endPosition);
      }

      public override fun toString(): String {
         val var5: PostProcessor.Gradient.Direction = this.direction;
         val var3: Int = this.startColor;
         val var4: Int = this.endColor;
         val var1: Float = this.startPosition;
         val var2: Float = this.endPosition;
         val var6: StringBuilder = new StringBuilder();
         var6.append("Gradient(direction=");
         var6.append(var5);
         var6.append(", startColor=");
         var6.append(var3);
         var6.append(", endColor=");
         var6.append(var4);
         var6.append(", startPosition=");
         var6.append(var1);
         var6.append(", endPosition=");
         var6.append(var2);
         var6.append(")");
         return var6.toString();
      }

      public enum class Direction {
         BottomToTop,
         LeftToRight,
         RightToLeft,
         TopToBottom         @JvmStatic
         private PostProcessor.Gradient.Direction[] $VALUES = $values();
      }
   }

   public object Grayscale : PostProcessor {
      override fun create(): BasePostprocessor {
         return PostProcessor.DefaultImpls.create(this);
      }
   }
}

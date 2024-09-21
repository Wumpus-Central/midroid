package com.discord.image.fresco.postprocessors.processors

import android.graphics.Bitmap
import android.graphics.Canvas
import android.graphics.LinearGradient
import android.graphics.Paint
import android.graphics.Shader.TileMode
import com.discord.image.fresco.postprocessors.PostProcessor.Gradient
import com.facebook.imagepipeline.request.BasePostprocessor
import kotlin.jvm.internal.q
import nh.p
import nh.w

internal class GradientPostprocessor(gradient: Gradient) : BasePostprocessor {
   private final val gradient: Gradient

   init {
      q.h(var1, "gradient");
      super();
      this.gradient = var1;
   }

   public open fun process(bitmap: Bitmap) {
      q.h(var1, "bitmap");
      val var10: Int = GradientPostprocessor.WhenMappings.$EnumSwitchMapping$0[this.gradient.getDirection().ordinal()];
      val var17: Pair;
      if (var10 != 1) {
         if (var10 != 2) {
            if (var10 != 3) {
               if (var10 != 4) {
                  throw new p();
               }

               var17 = w.a(
                  new GradientPostprocessor.Companion.Point((float)var1.getWidth() / 2.0F, (float)var1.getHeight()),
                  new GradientPostprocessor.Companion.Point((float)var1.getWidth() / 2.0F, 0.0F)
               );
            } else {
               var17 = w.a(
                  new GradientPostprocessor.Companion.Point((float)var1.getWidth() / 2.0F, 0.0F),
                  new GradientPostprocessor.Companion.Point((float)var1.getWidth() / 2.0F, (float)var1.getHeight())
               );
            }
         } else {
            var17 = w.a(
               new GradientPostprocessor.Companion.Point((float)var1.getWidth(), (float)var1.getHeight() / 2.0F),
               new GradientPostprocessor.Companion.Point(0.0F, (float)var1.getHeight() / 2.0F)
            );
         }
      } else {
         var17 = w.a(
            new GradientPostprocessor.Companion.Point(0.0F, (float)var1.getHeight() / 2.0F),
            new GradientPostprocessor.Companion.Point((float)var1.getWidth(), (float)var1.getHeight() / 2.0F)
         );
      }

      val var13: GradientPostprocessor.Companion.Point = var17.a() as GradientPostprocessor.Companion.Point;
      val var14: GradientPostprocessor.Companion.Point = var17.b() as GradientPostprocessor.Companion.Point;
      val var18: Canvas = new Canvas(var1);
      val var3: Float = var1.getWidth();
      val var2: Float = var1.getHeight();
      val var15: Paint = new Paint();
      var15.setShader(
         new LinearGradient(
            var13.getX(),
            var13.getY(),
            var14.getX(),
            var14.getY(),
            new int[]{this.gradient.getStartColor(), this.gradient.getEndColor()},
            new float[]{this.gradient.getStartPosition(), this.gradient.getEndPosition()},
            TileMode.CLAMP
         )
      );
      var18.drawRect(0.0F, 0.0F, var3, var2, var15);
   }

   public companion object {
      private data class Point(x: Float, y: Float) {
         public final val x: Float
         public final val y: Float

         init {
            this.x = var1;
            this.y = var2;
         }

         public operator fun component1(): Float {
            return this.x;
         }

         public operator fun component2(): Float {
            return this.y;
         }

         public fun copy(x: Float = var0.x, y: Float = var0.y): com.discord.image.fresco.postprocessors.processors.GradientPostprocessor.Companion.Point {
            return new GradientPostprocessor.Companion.Point(var1, var2);
         }

         public override operator fun equals(other: Any?): Boolean {
            if (this === var1) {
               return true;
            } else if (var1 !is GradientPostprocessor.Companion.Point) {
               return false;
            } else {
               var1 = var1;
               if (java.lang.Float.compare(this.x, var1.x) != 0) {
                  return false;
               } else {
                  return java.lang.Float.compare(this.y, var1.y) == 0;
               }
            }
         }

         public override fun hashCode(): Int {
            return java.lang.Float.hashCode(this.x) * 31 + java.lang.Float.hashCode(this.y);
         }

         public override fun toString(): String {
            val var1: Float = this.x;
            val var2: Float = this.y;
            val var3: StringBuilder = new StringBuilder();
            var3.append("Point(x=");
            var3.append(var1);
            var3.append(", y=");
            var3.append(var2);
            var3.append(")");
            return var3.toString();
         }
      }
   }
}

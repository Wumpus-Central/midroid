package com.discord.animatable_underlay

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Path
import android.graphics.RectF
import android.graphics.Path.Direction
import android.view.MotionEvent
import com.discord.misc.utilities.size.SizeUtilsKt
import com.discord.react_rootview.RootViewUtils
import com.facebook.react.uimanager.PointerEvents
import com.facebook.react.views.view.ReactViewGroup
import com.facebook.react.views.view.ReactViewGroupExtensionsKt
import ht.p
import kotlin.enums.EnumEntries
import kotlin.jvm.internal.SourceDebugExtension

@SourceDebugExtension(["SMAP\nAnimatableUnderlay.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimatableUnderlay.kt\ncom/discord/animatable_underlay/AnimatableUnderlay\n+ 2 Color.kt\nandroidx/core/graphics/ColorKt\n*L\n1#1,182:1\n404#2:183\n*S KotlinDebug\n*F\n+ 1 AnimatableUnderlay.kt\ncom/discord/animatable_underlay/AnimatableUnderlay\n*L\n48#1:183\n*E\n"])
public class AnimatableUnderlay(context: Context) : ReactViewGroup(var1) {
   private final var height: Float
   private final var width: Float

   public final var shapeWidth: Float
      internal set

   public final var shapeHeight: Float
      internal set

   public final var clipDirectionX: com.discord.animatable_underlay.AnimatableUnderlay.ClipDirectionX = AnimatableUnderlay.ClipDirectionX.CENTERED
      internal set

   public final var clipDirectionY: com.discord.animatable_underlay.AnimatableUnderlay.ClipDirectionY = AnimatableUnderlay.ClipDirectionY.CENTERED
      internal set

   internal final var shapeBorderConfig: AnimatableUnderlayBorders = new AnimatableUnderlayBorders()
   public final var shapeBackgroundColor: Int
   private final var shadowColor: String
   private final var shadowElevation: Float
   private final val paint: Paint
   private final val shadowPaint: Paint
   private final val path: Path
   private final val pathRect: RectF

   init {
      this.shadowColor = "#14000000";
      this.shadowElevation = SizeUtilsKt.getDpToPx(3);
      val var3: Paint = new Paint();
      var3.setAntiAlias(true);
      this.paint = var3;
      val var4: Paint = new Paint();
      var4.setAntiAlias(true);
      var4.setColor(0);
      var4.setShadowLayer(this.shadowElevation, 0.0F, this.shadowElevation / (float)2, Color.parseColor(this.shadowColor));
      this.shadowPaint = var4;
      this.path = new Path();
      this.pathRect = new RectF();
   }

   private fun drawCustomShape(canvas: Canvas) {
      this.path.reset();
      var var5: Int = AnimatableUnderlay.WhenMappings.$EnumSwitchMapping$0[this.clipDirectionY.ordinal()];
      if (var5 != 1) {
         if (var5 != 2) {
            if (var5 != 3) {
               throw new p();
            }

            val var15: RectF = this.pathRect;
            val var2: Float = this.height;
            val var3: Float = this.shapeHeight;
            this.pathRect.top = (this.height - this.shapeHeight) / 2;
            var15.bottom = var2 - (var2 - var3) / 2;
         } else {
            val var16: RectF = this.pathRect;
            this.pathRect.top = 0.0F;
            var16.bottom = this.height - (this.height - this.shapeHeight);
         }
      } else {
         val var17: RectF = this.pathRect;
         val var8: Float = this.height;
         this.pathRect.top = this.height - this.shapeHeight;
         var17.bottom = var8;
      }

      var5 = AnimatableUnderlay.WhenMappings.$EnumSwitchMapping$1[this.clipDirectionX.ordinal()];
      if (var5 != 1) {
         if (var5 != 2) {
            if (var5 != 3) {
               throw new p();
            }

            val var19: RectF = this.pathRect;
            val var12: Float = this.width;
            val var13: Float = this.shapeWidth;
            this.pathRect.left = (this.width - this.shapeWidth) / 2;
            var19.right = var12 - (var12 - var13) / 2;
         } else {
            val var20: RectF = this.pathRect;
            this.pathRect.left = 0.0F;
            var20.right = this.width - (this.width - this.shapeWidth);
         }
      } else {
         val var21: RectF = this.pathRect;
         val var11: Float = this.width;
         this.pathRect.left = this.width - this.shapeWidth;
         var21.right = var11;
      }

      this.path.addRoundRect(this.pathRect, this.shapeBorderConfig.getBorderRadiusRadii(), Direction.CW);
      var1.drawPath(this.path, this.shadowPaint);
      this.paint.setColor(this.shapeBackgroundColor);
      var1.drawPath(this.path, this.paint);
      this.shapeBorderConfig.drawBorderStroke$animatable_underlay_release(var1, this.paint, this.pathRect);
   }

   @JvmStatic
   fun `onAttachedToWindow$lambda$2`(var0: AnimatableUnderlay, var1: MotionEvent): Unit {
      val var2: Int = var1.getAction();
      if (var2 != 0) {
         if (var2 == 1 || var2 == 3) {
            ReactViewGroupExtensionsKt.setPointerEventsInternal(var0, PointerEvents.AUTO);
         }
      } else {
         var var4: Boolean;
         if (var1.getX() >= var0.getX() && var1.getX() <= var0.getX() + var0.width) {
            var4 = true;
         } else {
            var4 = false;
         }

         if (var1.getY() >= var0.getY() && var1.getY() <= var0.getY() + var0.height && var4) {
            if (var1.getX() >= var0.getX() && var1.getX() <= var0.getX() + (var0.width - var0.shapeWidth)) {
               var4 = true;
            } else {
               var4 = false;
            }

            if (var1.getY() >= var0.getY() && var1.getY() <= var0.getY() + (var0.height - var0.shapeHeight) || var4) {
               ReactViewGroupExtensionsKt.setPointerEventsInternal(var0, PointerEvents.NONE);
            }
         }
      }

      return Unit.a;
   }

   protected open fun dispatchDraw(canvas: Canvas) {
      this.drawCustomShape(var1);
      var1.clipPath(this.path);
      super.dispatchDraw(var1);
   }

   protected open fun onAttachedToWindow() {
      super.onAttachedToWindow();
      RootViewUtils.INSTANCE.setOnInterceptTouchEvent(this, new com.discord.animatable_underlay.a(this));
   }

   protected open fun onDetachedFromWindow() {
      super.onDetachedFromWindow();
      RootViewUtils.INSTANCE.setOnInterceptTouchEvent(this, null);
   }

   protected open fun onSizeChanged(w: Int, h: Int, oldw: Int, oldh: Int) {
      super.onSizeChanged(var1, var2, var3, var4);
      this.width = var1;
      this.height = var2;
   }

   public enum class ClipDirectionX {
      CENTERED,
      FROM_LEFT,
      FROM_RIGHT      @JvmStatic
      private EnumEntries $ENTRIES;
      @JvmStatic
      private AnimatableUnderlay.ClipDirectionX[] $VALUES;
      @JvmStatic
      public AnimatableUnderlay.ClipDirectionX.Companion Companion = new AnimatableUnderlay.ClipDirectionX.Companion(null);

      @JvmStatic
      fun {
         val var0: Array<AnimatableUnderlay.ClipDirectionX> = $values();
         $VALUES = var0;
         $ENTRIES = pt.a.a(var0);
      }

      @JvmStatic
      fun getEntries(): EnumEntries {
         return $ENTRIES;
      }

      public companion object {
         public fun parse(clipDirectionX: String?): com.discord.animatable_underlay.AnimatableUnderlay.ClipDirectionX {
            if (var1 != null) {
               val var2: Int = var1.hashCode();
               if (var2 != -1244903727) {
                  if (var2 != -852420684) {
                     if (var2 == 68351122 && var1.equals("fromRight")) {
                        return AnimatableUnderlay.ClipDirectionX.FROM_RIGHT;
                     }
                  } else if (var1.equals("centered")) {
                     return AnimatableUnderlay.ClipDirectionX.CENTERED;
                  }
               } else if (var1.equals("fromLeft")) {
                  return AnimatableUnderlay.ClipDirectionX.FROM_LEFT;
               }
            }

            val var3: StringBuilder = new StringBuilder();
            var3.append("Invalid clipDirectionX: ");
            var3.append(var1);
            throw new IllegalArgumentException(var3.toString());
         }
      }
   }

   public enum class ClipDirectionY {
      CENTERED,
      FROM_BOTTOM,
      FROM_TOP      @JvmStatic
      private EnumEntries $ENTRIES;
      @JvmStatic
      private AnimatableUnderlay.ClipDirectionY[] $VALUES;
      @JvmStatic
      public AnimatableUnderlay.ClipDirectionY.Companion Companion = new AnimatableUnderlay.ClipDirectionY.Companion(null);

      @JvmStatic
      fun {
         val var0: Array<AnimatableUnderlay.ClipDirectionY> = $values();
         $VALUES = var0;
         $ENTRIES = pt.a.a(var0);
      }

      @JvmStatic
      fun getEntries(): EnumEntries {
         return $ENTRIES;
      }

      public companion object {
         public fun parse(clipDirectionY: String?): com.discord.animatable_underlay.AnimatableUnderlay.ClipDirectionY {
            if (var1 != null) {
               val var2: Int = var1.hashCode();
               if (var2 != -852420684) {
                  if (var2 != -594339509) {
                     if (var2 == 1666758261 && var1.equals("fromBottom")) {
                        return AnimatableUnderlay.ClipDirectionY.FROM_BOTTOM;
                     }
                  } else if (var1.equals("fromTop")) {
                     return AnimatableUnderlay.ClipDirectionY.FROM_TOP;
                  }
               } else if (var1.equals("centered")) {
                  return AnimatableUnderlay.ClipDirectionY.CENTERED;
               }
            }

            val var3: StringBuilder = new StringBuilder();
            var3.append("Invalid clipDirectionX: ");
            var3.append(var1);
            throw new IllegalArgumentException(var3.toString());
         }
      }
   }
}

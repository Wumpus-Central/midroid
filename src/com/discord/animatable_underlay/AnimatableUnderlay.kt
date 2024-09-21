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
import com.discord.react_activities.ReactRootView
import com.facebook.react.uimanager.PointerEvents
import com.facebook.react.views.view.ReactViewGroup
import com.facebook.react.views.view.ReactViewGroupExtensionsKt
import kotlin.enums.EnumEntries
import kotlin.jvm.functions.Function1
import kotlin.jvm.internal.q
import uh.a

public class AnimatableUnderlay(context: Context) : ReactViewGroup {
   public final var clipDirectionX: com.discord.animatable_underlay.AnimatableUnderlay.ClipDirectionX
      internal set

   public final var clipDirectionY: com.discord.animatable_underlay.AnimatableUnderlay.ClipDirectionY
      internal set

   private final var height: Float
   private final val paint: Paint
   private final val path: Path
   private final val pathRect: RectF
   private final var shadowColor: String
   private final var shadowElevation: Float
   private final val shadowPaint: Paint
   public final var shapeBackgroundColor: Int
   internal final var shapeBorderConfig: AnimatableUnderlayBorders

   public final var shapeHeight: Float
      internal set

   public final var shapeWidth: Float
      internal set

   private final var width: Float

   init {
      q.h(var1, "context");
      super(var1);
      this.clipDirectionX = AnimatableUnderlay.ClipDirectionX.CENTERED;
      this.clipDirectionY = AnimatableUnderlay.ClipDirectionY.CENTERED;
      this.shapeBorderConfig = new AnimatableUnderlayBorders();
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
            if (var5 == 3) {
               val var15: RectF = this.pathRect;
               val var3: Float = this.height;
               val var2: Float = this.shapeHeight;
               this.pathRect.top = (this.height - this.shapeHeight) / 2;
               var15.bottom = var3 - (var3 - var2) / 2;
            }
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
            if (var5 == 3) {
               val var19: RectF = this.pathRect;
               val var13: Float = this.width;
               val var9: Float = this.shapeWidth;
               this.pathRect.left = (this.width - this.shapeWidth) / 2;
               var19.right = var13 - (var13 - var9) / 2;
            }
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

   protected open fun dispatchDraw(canvas: Canvas) {
      q.h(var1, "canvas");
      this.drawCustomShape(var1);
      var1.clipPath(this.path);
      super.dispatchDraw(var1);
   }

   protected open fun onAttachedToWindow() {
      super.onAttachedToWindow();
      ReactRootView.Companion
         .setOnInterceptTouchEvent(
            this,
            new Function1(this) {
               final AnimatableUnderlay this$0;

               {
                  super(1);
                  this.this$0 = var1;
               }

               public final void invoke(MotionEvent var1) {
                  q.h(var1, "e");
                  val var2: Int = var1.getAction();
                  if (var2 != 0) {
                     if (var2 == 1 || var2 == 3) {
                        ReactViewGroupExtensionsKt.setPointerEventsInternal(this.this$0, PointerEvents.AUTO);
                     }
                  } else {
                     var var4: Boolean;
                     if (var1.getX() >= this.this$0.getX() && var1.getX() <= this.this$0.getX() + AnimatableUnderlay.access$getWidth$p(this.this$0)) {
                        var4 = true;
                     } else {
                        var4 = false;
                     }

                     if (var1.getY() >= this.this$0.getY() && var1.getY() <= this.this$0.getY() + AnimatableUnderlay.access$getHeight$p(this.this$0) && var4) {
                        if (var1.getX() >= this.this$0.getX()
                           && var1.getX() <= this.this$0.getX() + (AnimatableUnderlay.access$getWidth$p(this.this$0) - this.this$0.getShapeWidth())) {
                           var4 = true;
                        } else {
                           var4 = false;
                        }

                        if (var1.getY() >= this.this$0.getY()
                              && var1.getY() <= this.this$0.getY() + (AnimatableUnderlay.access$getHeight$p(this.this$0) - this.this$0.getShapeHeight())
                           || var4) {
                           ReactViewGroupExtensionsKt.setPointerEventsInternal(this.this$0, PointerEvents.NONE);
                        }
                     }
                  }
               }
            }
         );
   }

   protected open fun onDetachedFromWindow() {
      super.onDetachedFromWindow();
      ReactRootView.Companion.setOnInterceptTouchEvent(this, null);
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
         $ENTRIES = a.a(var0);
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
         $ENTRIES = a.a(var0);
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

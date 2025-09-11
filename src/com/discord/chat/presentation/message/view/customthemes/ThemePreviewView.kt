package com.discord.chat.presentation.message.view.customthemes

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.LinearGradient
import android.graphics.Paint
import android.graphics.RectF
import android.graphics.Shader
import android.graphics.Shader.TileMode
import android.util.AttributeSet
import android.view.View
import com.facebook.react.uimanager.PixelUtil
import java.util.ArrayList
import kotlin.jvm.internal.SourceDebugExtension

@SourceDebugExtension(["SMAP\nThemePreviewView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThemePreviewView.kt\ncom/discord/chat/presentation/message/view/customthemes/ThemePreviewView\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,110:1\n1557#2:111\n1628#2,3:112\n*S KotlinDebug\n*F\n+ 1 ThemePreviewView.kt\ncom/discord/chat/presentation/message/view/customthemes/ThemePreviewView\n*L\n22#1:111\n22#1:112,3\n*E\n"])
public class ThemePreviewView  public constructor(context: Context, attrs: AttributeSet? = null) : View(var1, var2) {
   private final var colors: IntArray = new int[]{Color.parseColor("#ff6A00"), Color.parseColor("#ffD500")}
   private final var angleDegrees: Float
   private final var cornerRadiusPx: Float = PixelUtil.INSTANCE.dpToPx(8.0F)
   private final val paint: Paint = new Paint(1)
   private final var shader: Shader?
   private final val rect: RectF = new RectF()

   fun ThemePreviewView(var1: Context) {
      this(var1, null, 2, null);
   }

   private fun rebuildShader() {
      if (this.getWidth() != 0 && this.getHeight() != 0 && this.colors.length != 0) {
         var var9: Int = this.colors.length;
         var var8: Int = 0;
         if (var9 == 1) {
            this.paint.setShader(null);
            this.paint.setColor(this.colors[0]);
            return;
         }

         val var1: Double = Math.toRadians((double)this.angleDegrees - (double)90);
         var var6: Float = (float)Math.cos(var1);
         val var7: Float = (float)Math.sin(var1);
         val var3: Float = this.getWidth() / 2.0F;
         val var4: Float = this.getHeight() / 2.0F;
         var var5: Float = (float)Math.hypot((double)((float)this.getWidth()), (double)((float)this.getHeight())) * 0.5F;
         var6 = var6 * var5;
         var5 = var7 * var5;
         var9 = this.colors.length;

         val var14: FloatArray;
         for (var14 = new float[this.colors.length]; var8 < var9; var8++) {
            var14[var8] = (float)var8 / (this.colors.length - 1);
         }

         val var15: LinearGradient = new LinearGradient(var3 - var6, var4 - var5, var3 + var6, var4 + var5, this.colors, var14, TileMode.CLAMP);
         this.shader = var15;
         this.paint.setShader(var15);
      }
   }

   protected open fun onDraw(canvas: Canvas) {
      var1.drawRoundRect(this.rect, this.cornerRadiusPx, this.cornerRadiusPx, this.paint);
   }

   protected open fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
      val var3: Int = (int)PixelUtil.INSTANCE.dpToPx(54.0F);
      var1 = Math.min(View.resolveSize(var3, var1), View.resolveSize(var3, var2));
      this.setMeasuredDimension(var1, var1);
   }

   protected open fun onSizeChanged(w: Int, h: Int, oldw: Int, oldh: Int) {
      this.rect.set(0.0F, 0.0F, (float)var1, (float)var2);
      this.rebuildShader();
   }

   public fun setCornerRadiusDp(radiusDp: Float) {
      this.cornerRadiusPx = PixelUtil.INSTANCE.dpToPx(var1);
      this.invalidate();
   }

   public fun setGradientAngle(angleDeg: Float) {
      this.angleDegrees = var1;
      this.rebuildShader();
      this.invalidate();
   }

   public fun setHexColors(hexColors: List<String>) {
      val var2: ArrayList = new ArrayList(CollectionsKt.v(var1, 10));
      val var3: java.util.Iterator = var1.iterator();

      while (var3.hasNext()) {
         var2.add(Color.parseColor(var3.next() as java.lang.String));
      }

      this.colors = CollectionsKt.S0(var2);
      this.rebuildShader();
      this.invalidate();
   }
}

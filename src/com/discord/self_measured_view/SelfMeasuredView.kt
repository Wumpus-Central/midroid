package com.discord.self_measured_view

import B9.s
import android.content.Context
import android.util.AttributeSet
import android.widget.FrameLayout
import com.discord.misc.utilities.measure.ViewMeasureExtensionsKt
import com.discord.react.utilities.NativeMapExtensionsKt
import com.facebook.react.bridge.ReactContext
import com.facebook.react.uimanager.PixelUtil
import com.facebook.react.uimanager.StateWrapper
import com.facebook.react.uimanager.UIManagerModule

public class SelfMeasuredView  public constructor(context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0) : FrameLayout(var1, var2, var3) {
   private final val reactContext: ReactContext
   private final val fabricEnabled: Boolean

   public final var stateWrapper: StateWrapper?
      internal set

   private final val runnable: Runnable

   fun SelfMeasuredView(var1: Context) {
      this(var1, null, 0, 6, null);
   }

   fun SelfMeasuredView(var1: Context, var2: AttributeSet) {
      this(var1, var2, 0, 4, null);
   }

   init {
      this.reactContext = var1 as ReactContext;
      this.fabricEnabled = true;
      this.runnable = new a(this);
   }

   private fun maybePostMeasuredEvent(previousMeasuredWidth: Int, newMeasuredWidth: Int, previousMeasuredHeight: Int, newMeasuredHeight: Int) {
      if (Math.abs(var4 - var3) >= 2 || Math.abs(var2 - var1) >= 2) {
         if (this.fabricEnabled) {
            if (this.stateWrapper != null) {
               this.stateWrapper
                  .updateState(
                     NativeMapExtensionsKt.nativeMapOf(
                        s.a("measuredViewWidth", PixelUtil.toDIPFromPixel((float)var2)), s.a("measuredViewHeight", PixelUtil.toDIPFromPixel((float)var4))
                     )
                  );
            }
         } else {
            val var8: UIManagerModule = this.reactContext.getNativeModule(UIManagerModule.class) as UIManagerModule;
            if (var8 != null) {
               this.reactContext.runOnNativeModulesQueueThread(new b(var8, this));
            }
         }
      }
   }

   @JvmStatic
   fun `maybePostMeasuredEvent$lambda$3$lambda$2`(var0: UIManagerModule, var1: SelfMeasuredView) {
      var0.updateNodeSize(var1.getId(), var1.getMeasuredWidth(), var1.getMeasuredHeight());
   }

   @JvmStatic
   fun `runnable$lambda$0`(var0: SelfMeasuredView) {
      ViewMeasureExtensionsKt.measureAndLayout(var0);
   }

   protected open fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
      var2 = this.getMeasuredWidth();
      val var3: Int = this.getMeasuredHeight();
      val var4: Pair = ViewMeasureExtensionsKt.getMaximumSizeOfChildren(this, var1);
      this.setMeasuredDimension((var4.a() as java.lang.Number).intValue(), (var4.b() as java.lang.Number).intValue());
      this.maybePostMeasuredEvent(var2, this.getMeasuredWidth(), var3, this.getMeasuredHeight());
   }

   public open fun requestLayout() {
      super.requestLayout();
      this.post(this.runnable);
   }

   public companion object {
      private const val LAYOUT_SIZE_CHANGE_THRESHOLD: Int
   }
}

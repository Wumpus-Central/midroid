package com.discord.self_measured_view

import android.content.Context
import android.util.AttributeSet
import android.widget.FrameLayout
import com.discord.misc.utilities.measure.ViewMeasureExtensionsKt
import com.discord.react.utilities.NativeMapExtensionsKt
import com.facebook.react.bridge.ReactContext
import com.facebook.react.bridge.WritableMap
import com.facebook.react.uimanager.FabricViewStateManager
import com.facebook.react.uimanager.PixelUtil
import com.facebook.react.uimanager.UIManagerModule
import com.facebook.react.uimanager.FabricViewStateManager.HasFabricViewStateManager
import dh.w
import kotlin.jvm.internal.q

public class SelfMeasuredView  public constructor(context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0) : FrameLayout, HasFabricViewStateManager {
   private final val fabricEnabled: Boolean
   private final val fabricViewStateManager: FabricViewStateManager
   private final val reactContext: ReactContext
   private final val runnable: Runnable

   fun SelfMeasuredView(var1: Context) {
      q.h(var1, "context");
      this(var1, null, 0, 6, null);
   }

   fun SelfMeasuredView(var1: Context, var2: AttributeSet) {
      q.h(var1, "context");
      this(var1, var2, 0, 4, null);
   }

   init {
      q.h(var1, "context");
      super(var1, var2, var3);
      this.reactContext = var1 as ReactContext;
      this.fabricViewStateManager = new FabricViewStateManager();
      this.runnable = new c(this);
   }

   private fun maybePostMeasuredEvent(previousMeasuredWidth: Int, newMeasuredWidth: Int, previousMeasuredHeight: Int, newMeasuredHeight: Int) {
      if (Math.abs(var4 - var3) >= 2 || Math.abs(var2 - var1) >= 2) {
         if (this.fabricEnabled) {
            this.fabricViewStateManager.setState(new a(PixelUtil.toDIPFromPixel((float)var2), PixelUtil.toDIPFromPixel((float)var4)));
         } else {
            val var7: UIManagerModule = this.reactContext.getNativeModule(UIManagerModule.class) as UIManagerModule;
            if (var7 != null) {
               this.reactContext.runOnNativeModulesQueueThread(new b(var7, this));
            }
         }
      }
   }

   @JvmStatic
   fun `maybePostMeasuredEvent$lambda$1`(var0: Float, var1: Float): WritableMap {
      return NativeMapExtensionsKt.nativeMapOf(w.a("measuredViewWidth", var0), w.a("measuredViewHeight", var1));
   }

   @JvmStatic
   fun `maybePostMeasuredEvent$lambda$3$lambda$2`(var0: UIManagerModule, var1: SelfMeasuredView) {
      q.h(var0, "$uiManagerModule");
      q.h(var1, "this$0");
      var0.updateNodeSize(var1.getId(), var1.getMeasuredWidth(), var1.getMeasuredHeight());
   }

   @JvmStatic
   fun `runnable$lambda$0`(var0: SelfMeasuredView) {
      q.h(var0, "this$0");
      ViewMeasureExtensionsKt.measureAndLayout(var0);
   }

   public open fun getFabricViewStateManager(): FabricViewStateManager {
      return this.fabricViewStateManager;
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

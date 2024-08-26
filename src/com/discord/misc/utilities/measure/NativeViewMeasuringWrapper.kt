package com.discord.misc.utilities.measure

import android.annotation.SuppressLint
import android.view.View
import android.widget.FrameLayout
import kotlin.jvm.internal.r

@SuppressLint(["ViewConstructor"])
public class NativeViewMeasuringWrapper<T extends View>(view: Any, onMeasured: (View, Int, Int) -> Unit) : FrameLayout {
   public final val view: Any
   private final val onMeasured: (View, Int, Int) -> Unit
   private final val runnable: Runnable

   init {
      r.h(var1, "view");
      r.h(var2, "onMeasured");
      super(var1.getContext());
      this.view = (T)var1;
      this.onMeasured = var2;
      this.addView(var1);
      this.runnable = new a(this);
   }

   @JvmStatic
   fun `runnable$lambda$0`(var0: NativeViewMeasuringWrapper) {
      r.h(var0, "this$0");
      ViewMeasureExtensionsKt.measureAndLayout(var0);
   }

   protected open fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
      val var3: Pair = ViewMeasureExtensionsKt.getMaximumSizeOfChildren(this, var1);
      var2 = (var3.a() as java.lang.Number).intValue();
      var1 = (var3.b() as java.lang.Number).intValue();
      this.setMeasuredDimension(var2, var1);
      this.onMeasured.invoke(this, var2, var1);
   }

   public open fun requestLayout() {
      super.requestLayout();
      this.post(this.runnable);
   }
}

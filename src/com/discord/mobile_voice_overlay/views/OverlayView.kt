package com.discord.mobile_voice_overlay.views

import android.content.Context
import android.util.AttributeSet
import android.view.WindowManager
import android.view.WindowManager.LayoutParams
import android.widget.FrameLayout
import com.discord.mobile_voice_overlay.MobileVoiceOverlayAssets
import com.discord.mobile_voice_overlay.MobileVoiceOverlayData

public abstract class OverlayView : FrameLayout {
   protected final var overlayAssets: MobileVoiceOverlayAssets?
      internal set

   private final var managedByWindow: Boolean

   open fun OverlayView(var1: Context) {
      kotlin.jvm.internal.r.h(var1, "context");
      super(var1);
   }

   open fun OverlayView(var1: Context, var2: AttributeSet) {
      kotlin.jvm.internal.r.h(var1, "context");
      super(var1, var2);
   }

   open fun OverlayView(var1: Context, var2: AttributeSet, var3: Int) {
      kotlin.jvm.internal.r.h(var1, "context");
      super(var1, var2, var3);
   }

   public abstract fun getInitialLayoutParams(): LayoutParams {
   }

   public fun initializeWithWindowManager() {
      val var1: Any = this.getContext().getSystemService("window");
      kotlin.jvm.internal.r.f(var1, "null cannot be cast to non-null type android.view.WindowManager");
      (var1 as WindowManager).addView(this, this.getInitialLayoutParams());
      this.managedByWindow = true;
   }

   protected fun isManagedByWindow(): Boolean {
      return this.managedByWindow;
   }

   public fun removeFromWindowManager() {
      val var1: Any = this.getContext().getSystemService("window");
      kotlin.jvm.internal.r.f(var1, "null cannot be cast to non-null type android.view.WindowManager");
      (var1 as WindowManager).removeView(this);
      this.managedByWindow = false;
   }

   public open fun setAssets(assets: MobileVoiceOverlayAssets) {
      kotlin.jvm.internal.r.h(var1, "assets");
      this.overlayAssets = var1;
   }

   public abstract fun setData(data: MobileVoiceOverlayData) {
   }
}

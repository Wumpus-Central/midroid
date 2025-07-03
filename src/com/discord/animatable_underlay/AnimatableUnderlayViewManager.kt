package com.discord.animatable_underlay

import com.discord.misc.utilities.size.SizeUtilsKt
import com.discord.theme.utils.ColorUtilsKt
import com.facebook.react.module.annotations.ReactModule
import com.facebook.react.uimanager.ThemedReactContext
import com.facebook.react.uimanager.annotations.ReactProp
import com.facebook.react.viewmanagers.AnimatableUnderlayViewManagerDelegate
import com.facebook.react.viewmanagers.AnimatableUnderlayViewManagerInterface
import com.facebook.react.views.view.ReactClippingViewManager
import kotlin.jvm.internal.r

@ReactModule(name = "AnimatableUnderlayView")
public class AnimatableUnderlayViewManager : ReactClippingViewManager<AnimatableUnderlay>, AnimatableUnderlayViewManagerInterface<AnimatableUnderlay> {
   private final val delegate: AnimatableUnderlayViewManagerDelegate<AnimatableUnderlay, AnimatableUnderlayViewManager> =
      new AnimatableUnderlayViewManagerDelegate(this)

   protected open fun createViewInstance(reactContext: ThemedReactContext): AnimatableUnderlay {
      r.h(var1, "reactContext");
      return new AnimatableUnderlay(var1);
   }

   protected open fun getDelegate(): AnimatableUnderlayViewManagerDelegate<AnimatableUnderlay, AnimatableUnderlayViewManager> {
      return this.delegate;
   }

   public open fun getName(): String {
      return "AnimatableUnderlayView";
   }

   @ReactProp(name = "animatedBackgroundColorRgba")
   public open fun setAnimatedBackgroundColorRgba(view: AnimatableUnderlay, backgroundColor: String?) {
      r.h(var1, "view");
      if (var2 != null) {
         var1.setShapeBackgroundColor(ColorUtilsKt.rgbaToArgb(var2));
         var1.invalidate();
      }
   }

   @ReactProp(name = "animatedBorderColorRgba")
   public open fun setAnimatedBorderColorRgba(view: AnimatableUnderlay, borderColor: String?) {
      r.h(var1, "view");
      if (var2 != null) {
         var1.getShapeBorderConfig$animatable_underlay_release().setBorderColor(ColorUtilsKt.rgbaToArgb(var2));
         var1.invalidate();
      }
   }

   @ReactProp(name = "animatedBorderWidth")
   public open fun setAnimatedBorderWidth(view: AnimatableUnderlay, borderWidth: Float) {
      r.h(var1, "view");
      var1.getShapeBorderConfig$animatable_underlay_release().setBorderWidth((float)SizeUtilsKt.getDpToPx(var2));
      var1.invalidate();
   }

   @ReactProp(name = "animatedBottomLeftRadius")
   public open fun setAnimatedBottomLeftRadius(view: AnimatableUnderlay, bottomLeftRadius: Float) {
      r.h(var1, "view");
      var1.getShapeBorderConfig$animatable_underlay_release().setBorderBottomLeftRadius((float)SizeUtilsKt.getDpToPx(var2));
      var1.invalidate();
   }

   @ReactProp(name = "animatedBottomRightRadius")
   public open fun setAnimatedBottomRightRadius(view: AnimatableUnderlay, bottomRightRadius: Float) {
      r.h(var1, "view");
      var1.getShapeBorderConfig$animatable_underlay_release().setBorderBottomRightRadius((float)SizeUtilsKt.getDpToPx(var2));
      var1.invalidate();
   }

   @ReactProp(name = "animatedHeight")
   public open fun setAnimatedHeight(view: AnimatableUnderlay, height: Float) {
      r.h(var1, "view");
      var1.setShapeHeight((float)SizeUtilsKt.getDpToPx(var2));
      var1.invalidate();
   }

   @ReactProp(name = "animatedTopLeftRadius")
   public open fun setAnimatedTopLeftRadius(view: AnimatableUnderlay, topLeftRadius: Float) {
      r.h(var1, "view");
      var1.getShapeBorderConfig$animatable_underlay_release().setBorderTopLeftRadius((float)SizeUtilsKt.getDpToPx(var2));
      var1.invalidate();
   }

   @ReactProp(name = "animatedTopRightRadius")
   public open fun setAnimatedTopRightRadius(view: AnimatableUnderlay, topRightRadius: Float) {
      r.h(var1, "view");
      var1.getShapeBorderConfig$animatable_underlay_release().setBorderTopRightRadius((float)SizeUtilsKt.getDpToPx(var2));
      var1.invalidate();
   }

   @ReactProp(name = "animatedWidth")
   public open fun setAnimatedWidth(view: AnimatableUnderlay, width: Float) {
      r.h(var1, "view");
      var1.setShapeWidth((float)SizeUtilsKt.getDpToPx(var2));
      var1.invalidate();
   }

   @ReactProp(name = "clipDirectionX")
   public open fun setClipDirectionX(view: AnimatableUnderlay, value: String?) {
      r.h(var1, "view");
      var1.setClipDirectionX(AnimatableUnderlay.ClipDirectionX.Companion.parse(var2));
      var1.invalidate();
   }

   @ReactProp(name = "clipDirectionY")
   public open fun setClipDirectionY(view: AnimatableUnderlay, value: String?) {
      r.h(var1, "view");
      var1.setClipDirectionY(AnimatableUnderlay.ClipDirectionY.Companion.parse(var2));
      var1.invalidate();
   }

   public companion object {
      public const val NAME: String
   }
}

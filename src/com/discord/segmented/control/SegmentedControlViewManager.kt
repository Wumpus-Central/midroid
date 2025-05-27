package com.discord.segmented.control

import android.annotation.SuppressLint
import android.graphics.Color
import com.discord.misc.utilities.size.SizeUtilsKt
import com.discord.react.utilities.NativeArrayExtensionsKt
import com.discord.reactevents.ReactEvents
import com.discord.segmented.control.events.ValueChangeEvent
import com.facebook.react.bridge.ReadableArray
import com.facebook.react.bridge.ReadableMap
import com.facebook.react.module.annotations.ReactModule
import com.facebook.react.uimanager.SimpleViewManager
import com.facebook.react.uimanager.ThemedReactContext
import com.facebook.react.uimanager.annotations.ReactProp
import com.facebook.react.viewmanagers.DCDSegmentedControlManagerDelegate
import com.facebook.react.viewmanagers.DCDSegmentedControlManagerInterface
import g9.s
import h9.n
import java.util.ArrayList
import kotlin.jvm.internal.G
import kotlin.jvm.internal.q

@ReactModule(name = "DCDSegmentedControl")
public class SegmentedControlViewManager : SimpleViewManager<SegmentedControlView>, DCDSegmentedControlManagerInterface<SegmentedControlView> {
   private final val reactEvents: ReactEvents = new ReactEvents(s.a("onValueChange", G.b(ValueChangeEvent.class)))
   private final val delegate: DCDSegmentedControlManagerDelegate<SegmentedControlView, SegmentedControlViewManager>

   @JvmStatic
   fun `createViewInstance$lambda$1$lambda$0`(
      var0: SegmentedControlViewManager, var1: ThemedReactContext, var2: SegmentedControlView, var3: Int, var4: java.lang.String
   ): Unit {
      q.h(var4, "label");
      var0.reactEvents.emitEvent(var1, var2, new ValueChangeEvent(var4, var3));
      return Unit.a;
   }

   @SuppressLint(["InflateParams"])
   protected open fun createViewInstance(reactContext: ThemedReactContext): SegmentedControlView {
      q.h(var1, "reactContext");
      val var2: SegmentedControlView = new SegmentedControlView(var1, null, 0, 6, null);
      var2.setOnSegmentSelected(new b(this, var1, var2));
      return var2;
   }

   protected open fun getDelegate(): DCDSegmentedControlManagerDelegate<SegmentedControlView, SegmentedControlViewManager> {
      return this.delegate;
   }

   public open fun getExportedCustomDirectEventTypeConstants(): MutableMap<String, Any> {
      return this.reactEvents.exportEventConstants();
   }

   public open fun getName(): String {
      return "DCDSegmentedControl";
   }

   @ReactProp(name = "accessibilityRoleDescriptions")
   public open fun setAccessibilityRoleDescriptions(view: SegmentedControlView, value: ReadableArray?) {
      q.h(var1, "view");
      if (var2 != null) {
         val var4: IntRange = NativeArrayExtensionsKt.sizeRange(var2);
         val var3: ArrayList = new ArrayList();
         val var5: java.util.Iterator = var4.iterator();

         while (var5.hasNext()) {
            val var6: java.lang.String = var2.getString((var5 as n).a());
            if (var6 != null) {
               var3.add(var6);
            }
         }

         var1.setAccessibilityRoleDescriptions(var3);
      }
   }

   @ReactProp(name = "backgroundColor")
   public open fun setBackgroundColor(view: SegmentedControlView, value: String?) {
      q.h(var1, "view");
      if (var2 != null) {
         var1.setContainerBgColor(Color.parseColor(var2));
      }
   }

   @ReactProp(name = "cornerRadius")
   public open fun setCornerRadius(view: SegmentedControlView, value: Int) {
      q.h(var1, "view");
      var1.setCornerRadiusPx((float)SizeUtilsKt.getDpToPx(var2));
   }

   @ReactProp(name = "customSelectedTintColor")
   public open fun setCustomSelectedTintColor(view: SegmentedControlView, value: String?) {
      q.h(var1, "view");
      if (var2 != null) {
         var1.setSelectedSegmentBgColor(Color.parseColor(var2));
      }
   }

   @ReactProp(name = "selectedSegmentIndex")
   public open fun setSelectedSegmentIndex(view: SegmentedControlView, value: Int) {
      q.h(var1, "view");
      var1.setSelectedIndex(var2);
   }

   @ReactProp(name = "selectedTitleAttributes")
   public open fun setSelectedTitleAttributes(view: SegmentedControlView, value: ReadableMap?) {
      q.h(var1, "view");
      if (var2 != null) {
         var1.setSelectedSegmentTextColor(var2.getInt("textColor"));
         var1.setSelectedSegmentFontSizeSp((float)var2.getInt("fontSize"));
      }
   }

   @ReactProp(name = "titleAttributes")
   public open fun setTitleAttributes(view: SegmentedControlView, value: ReadableMap?) {
      q.h(var1, "view");
      if (var2 != null) {
         var1.setSegmentTextColor(var2.getInt("textColor"));
         var1.setSegmentFontSizeSp((float)var2.getInt("fontSize"));
      }
   }

   @ReactProp(name = "values")
   public open fun setValues(view: SegmentedControlView, value: ReadableArray?) {
      q.h(var1, "view");
      if (var2 != null) {
         val var4: IntRange = NativeArrayExtensionsKt.sizeRange(var2);
         val var3: ArrayList = new ArrayList();
         val var6: java.util.Iterator = var4.iterator();

         while (var6.hasNext()) {
            val var5: java.lang.String = var2.getString((var6 as n).a());
            if (var5 != null) {
               var3.add(var5);
            }
         }

         var1.setLabels(var3);
      }
   }

   public companion object {
      public const val NAME: String
   }
}

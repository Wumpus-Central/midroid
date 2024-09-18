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
import java.util.ArrayList
import kh.w
import kotlin.jvm.functions.Function2
import kotlin.jvm.internal.g0
import kotlin.jvm.internal.q
import lh.o

@ReactModule(name = "DCDSegmentedControl")
public class SegmentedControlViewManager : SimpleViewManager<SegmentedControlView>, DCDSegmentedControlManagerInterface<SegmentedControlView> {
   private final val delegate: DCDSegmentedControlManagerDelegate<SegmentedControlView, SegmentedControlViewManager>
   private final val reactEvents: ReactEvents = new ReactEvents(w.a("onValueChange", g0.b(ValueChangeEvent.class)))

   @SuppressLint(["InflateParams"])
   protected open fun createViewInstance(reactContext: ThemedReactContext): SegmentedControlView {
      q.h(var1, "reactContext");
      val var2: SegmentedControlView = new SegmentedControlView(var1, null, 0, 6, null);
      var2.setOnSegmentSelected(new Function2(this, var1, var2) {
         final ThemedReactContext $reactContext;
         final SegmentedControlView $this_apply;
         final SegmentedControlViewManager this$0;

         {
            super(2);
            this.this$0 = var1;
            this.$reactContext = var2;
            this.$this_apply = var3;
         }

         public final void invoke(int var1, java.lang.String var2) {
            q.h(var2, "label");
            SegmentedControlViewManager.access$getReactEvents$p(this.this$0).emitEvent(this.$reactContext, this.$this_apply, new ValueChangeEvent(var2, var1));
         }
      });
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
            val var6: java.lang.String = var2.getString((var5 as o).c());
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
         val var5: java.util.Iterator = var4.iterator();

         while (var5.hasNext()) {
            val var6: java.lang.String = var2.getString((var5 as o).c());
            if (var6 != null) {
               var3.add(var6);
            }
         }

         var1.setLabels(var3);
      }
   }

   public companion object {
      public const val NAME: String
   }
}

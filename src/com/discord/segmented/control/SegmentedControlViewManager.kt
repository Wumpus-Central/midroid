package com.discord.segmented.control

import Ja.v
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
import kotlin.jvm.internal.SourceDebugExtension

@ReactModule(name = "DCDSegmentedControl")
@SourceDebugExtension(["SMAP\nSegmentedControlViewManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SegmentedControlViewManager.kt\ncom/discord/segmented/control/SegmentedControlViewManager\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Color.kt\nandroidx/core/graphics/ColorKt\n*L\n1#1,108:1\n1611#2,9:109\n1863#2:118\n1864#2:120\n1620#2:121\n1611#2,9:122\n1863#2:131\n1864#2:133\n1620#2:134\n1#3:119\n1#3:132\n404#4:135\n404#4:136\n*S KotlinDebug\n*F\n+ 1 SegmentedControlViewManager.kt\ncom/discord/segmented/control/SegmentedControlViewManager\n*L\n50#1:109,9\n50#1:118\n50#1:120\n50#1:121\n57#1:122,9\n57#1:131\n57#1:133\n57#1:134\n50#1:119\n57#1:132\n69#1:135\n76#1:136\n*E\n"])
public class SegmentedControlViewManager : SimpleViewManager<SegmentedControlView>, DCDSegmentedControlManagerInterface<SegmentedControlView> {
   private final val reactEvents: ReactEvents = new ReactEvents(v.a("onValueChange", ValueChangeEvent::class))
   private final val delegate: DCDSegmentedControlManagerDelegate<SegmentedControlView, SegmentedControlViewManager>

   @JvmStatic
   fun `createViewInstance$lambda$1$lambda$0`(
      var0: SegmentedControlViewManager, var1: ThemedReactContext, var2: SegmentedControlView, var3: Int, var4: java.lang.String
   ): Unit {
      var0.reactEvents.emitEvent(var1, var2, new ValueChangeEvent(var4, var3));
      return Unit.a;
   }

   @SuppressLint(["InflateParams"])
   protected open fun createViewInstance(reactContext: ThemedReactContext): SegmentedControlView {
      val var2: SegmentedControlView = new SegmentedControlView(var1, null, 0, 6, null);
      var2.setOnSegmentSelected(new b(this, var1, var2));
      return var2;
   }

   protected open fun getDelegate(): DCDSegmentedControlManagerDelegate<SegmentedControlView, SegmentedControlViewManager> {
      return this.delegate;
   }

   public override fun getExportedCustomDirectEventTypeConstants(): MutableMap<String, Any> {
      return this.reactEvents.exportEventConstants();
   }

   public override fun getName(): String {
      return "DCDSegmentedControl";
   }

   @ReactProp(name = "accessibilityRoleDescriptions")
   public open fun setAccessibilityRoleDescriptions(view: SegmentedControlView, value: ReadableArray?) {
      if (var2 != null) {
         val var4: IntRange = NativeArrayExtensionsKt.sizeRange(var2);
         val var3: ArrayList = new ArrayList();
         val var6: java.util.Iterator = var4.iterator();

         while (var6.hasNext()) {
            val var5: java.lang.String = var2.getString((var6 as L).nextInt());
            if (var5 != null) {
               var3.add(var5);
            }
         }

         var1.setAccessibilityRoleDescriptions(var3);
      }
   }

   @ReactProp(name = "backgroundColor")
   public open fun setBackgroundColor(view: SegmentedControlView, value: String?) {
      if (var2 != null) {
         var1.setContainerBgColor(Color.parseColor(var2));
      }
   }

   @ReactProp(name = "cornerRadius")
   public open fun setCornerRadius(view: SegmentedControlView, value: Int) {
      var1.setCornerRadiusPx((float)SizeUtilsKt.getDpToPx(var2));
   }

   @ReactProp(name = "customSelectedTintColor")
   public open fun setCustomSelectedTintColor(view: SegmentedControlView, value: String?) {
      if (var2 != null) {
         var1.setSelectedSegmentBgColor(Color.parseColor(var2));
      }
   }

   @ReactProp(name = "selectedSegmentIndex")
   public open fun setSelectedSegmentIndex(view: SegmentedControlView, value: Int) {
      var1.setSelectedIndex(var2);
   }

   @ReactProp(name = "selectedTitleAttributes")
   public open fun setSelectedTitleAttributes(view: SegmentedControlView, value: ReadableMap?) {
      if (var2 != null) {
         var1.setSelectedSegmentTextColor(var2.getInt("textColor"));
         var1.setSelectedSegmentFontSizeSp((float)var2.getInt("fontSize"));
      }
   }

   @ReactProp(name = "titleAttributes")
   public open fun setTitleAttributes(view: SegmentedControlView, value: ReadableMap?) {
      if (var2 != null) {
         var1.setSegmentTextColor(var2.getInt("textColor"));
         var1.setSegmentFontSizeSp((float)var2.getInt("fontSize"));
      }
   }

   @ReactProp(name = "values")
   public open fun setValues(view: SegmentedControlView, value: ReadableArray?) {
      if (var2 != null) {
         val var4: IntRange = NativeArrayExtensionsKt.sizeRange(var2);
         val var3: ArrayList = new ArrayList();
         val var6: java.util.Iterator = var4.iterator();

         while (var6.hasNext()) {
            val var5: java.lang.String = var2.getString((var6 as L).nextInt());
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

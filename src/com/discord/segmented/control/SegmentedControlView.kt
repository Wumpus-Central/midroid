package com.discord.segmented.control

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.view.ViewPropertyAnimator
import android.view.animation.DecelerateInterpolator
import android.widget.FrameLayout
import android.widget.TextView
import android.widget.LinearLayout.LayoutParams
import androidx.cardview.widget.CardView
import androidx.core.view.r0
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat
import com.discord.fonts.DiscordFont
import com.discord.fonts.DiscordFontUtilsKt
import com.discord.misc.utilities.measure.ViewMeasureExtensionsKt
import com.discord.misc.utilities.size.SizeUtilsKt
import com.discord.segmented.control.databinding.SegmentedControlBinding
import kotlin.jvm.internal.q
import kotlin.properties.ReadWriteProperty
import kotlin.properties.c
import kotlin.reflect.KProperty

public class SegmentedControlView  public constructor(context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0) : FrameLayout {
   private final val binding: SegmentedControlBinding
   public final var onSegmentSelected: ((Int, String) -> Unit)?

   public final var containerBgColor: Int
      public final get() {
         return (this.containerBgColor$delegate.getValue(this, $$delegatedProperties[0]) as java.lang.Number).intValue();
      }

      public final set(<set-?>) {
         this.containerBgColor$delegate.setValue(this, $$delegatedProperties[0], var1);
      }


   public final var selectedSegmentBgColor: Int
      public final get() {
         return (this.selectedSegmentBgColor$delegate.getValue(this, $$delegatedProperties[1]) as java.lang.Number).intValue();
      }

      public final set(<set-?>) {
         this.selectedSegmentBgColor$delegate.setValue(this, $$delegatedProperties[1], var1);
      }


   public final var cornerRadiusPx: Float
      public final get() {
         return (this.cornerRadiusPx$delegate.getValue(this, $$delegatedProperties[2]) as java.lang.Number).floatValue();
      }

      public final set(<set-?>) {
         this.cornerRadiusPx$delegate.setValue(this, $$delegatedProperties[2], var1);
      }


   public final var selectedIndex: Int
      public final get() {
         return (this.selectedIndex$delegate.getValue(this, $$delegatedProperties[3]) as java.lang.Number).intValue();
      }

      public final set(<set-?>) {
         this.selectedIndex$delegate.setValue(this, $$delegatedProperties[3], var1);
      }


   public final var segmentTextColor: Int
      public final get() {
         return (this.segmentTextColor$delegate.getValue(this, $$delegatedProperties[4]) as java.lang.Number).intValue();
      }

      public final set(<set-?>) {
         this.segmentTextColor$delegate.setValue(this, $$delegatedProperties[4], var1);
      }


   public final var segmentFontSizeSp: Float
      public final get() {
         return (this.segmentFontSizeSp$delegate.getValue(this, $$delegatedProperties[5]) as java.lang.Number).floatValue();
      }

      public final set(<set-?>) {
         this.segmentFontSizeSp$delegate.setValue(this, $$delegatedProperties[5], var1);
      }


   public final var selectedSegmentTextColor: Int
      public final get() {
         return (this.selectedSegmentTextColor$delegate.getValue(this, $$delegatedProperties[6]) as java.lang.Number).intValue();
      }

      public final set(<set-?>) {
         this.selectedSegmentTextColor$delegate.setValue(this, $$delegatedProperties[6], var1);
      }


   public final var selectedSegmentFontSizeSp: Float
      public final get() {
         return (this.selectedSegmentFontSizeSp$delegate.getValue(this, $$delegatedProperties[7]) as java.lang.Number).floatValue();
      }

      public final set(<set-?>) {
         this.selectedSegmentFontSizeSp$delegate.setValue(this, $$delegatedProperties[7], var1);
      }


   public final var labels: List<String>
      public final get() {
         return this.labels$delegate.getValue(this, $$delegatedProperties[8]) as MutableList<java.lang.String>;
      }

      public final set(<set-?>) {
         q.h(var1, "<set-?>");
         this.labels$delegate.setValue(this, $$delegatedProperties[8], var1);
      }


   public final var accessibilityRoleDescriptions: List<String>
      public final get() {
         return this.accessibilityRoleDescriptions$delegate.getValue(this, $$delegatedProperties[9]) as MutableList<java.lang.String>;
      }

      public final set(<set-?>) {
         q.h(var1, "<set-?>");
         this.accessibilityRoleDescriptions$delegate.setValue(this, $$delegatedProperties[9], var1);
      }


   private final var segmentWidth: Int

   fun SegmentedControlView(var1: Context) {
      q.h(var1, "context");
      this(var1, null, 0, 6, null);
   }

   fun SegmentedControlView(var1: Context, var2: AttributeSet) {
      q.h(var1, "context");
      this(var1, var2, 0, 4, null);
   }

   init {
      q.h(var1, "context");
      super(var1, var2, var3);
      val var6: SegmentedControlBinding = SegmentedControlBinding.inflate(LayoutInflater.from(var1), this, true);
      q.g(var6, "inflate(...)");
      this.binding = var6;
      val var4: Float = var1.getResources().getDisplayMetrics().density * 2.0F;
      var6.selectedSegmentBg.setElevation(var4);
      var6.segmentContainer.setElevation(var4);
      var6.segmentContainer.setOutlineProvider(null);
      val var5: Int = 0;
      this.containerBgColor$delegate = updateViewOnChange$default(this, var5, false, 2, null);
      this.selectedSegmentBgColor$delegate = updateViewOnChange$default(this, var5, false, 2, null);
      this.cornerRadiusPx$delegate = updateViewOnChange$default(this, (float)SizeUtilsKt.getDpToPx(4), false, 2, null);
      this.selectedIndex$delegate = updateViewOnChange$default(this, var5, false, 2, null);
      this.segmentTextColor$delegate = updateViewOnChange$default(this, var5, false, 2, null);
      val var7: java.lang.Float = 0.0F;
      this.segmentFontSizeSp$delegate = updateViewOnChange$default(this, var7, false, 2, null);
      this.selectedSegmentTextColor$delegate = updateViewOnChange$default(this, var5, false, 2, null);
      this.selectedSegmentFontSizeSp$delegate = updateViewOnChange$default(this, var7, false, 2, null);
      this.labels$delegate = this.updateViewOnChange(i.j(), true);
      this.accessibilityRoleDescriptions$delegate = this.updateViewOnChange(i.j(), true);
   }

   private fun animateSelection(animate: Boolean) {
      val var4: ViewPropertyAnimator = this.binding.selectedSegmentBg.animate();
      val var2: Long;
      if (var1) {
         var2 = 150L;
      } else {
         var2 = 0L;
      }

      var4.setDuration(var2)
         .setInterpolator(new DecelerateInterpolator())
         .translationX((float)this.getSelectedIndex() * (float)this.binding.selectedSegmentBg.getWidth());
   }

   private fun getLabelView(index: Int): TextView {
      val var2: View = this.binding.segmentContainer.getChildAt(var1);
      val var4: TextView;
      if (var2 is TextView) {
         var4 = var2 as TextView;
      } else {
         var4 = null;
      }

      var var3: TextView = var4;
      if (var4 == null) {
         var3 = new TextView(this.getContext());
         r0.q0(var3, new androidx.core.view.a(var1, this) {
            final int $index;
            final SegmentedControlView this$0;

            {
               this.$index = var1;
               this.this$0 = var2;
            }

            @Override
            public void onInitializeAccessibilityNodeInfo(View var1, AccessibilityNodeInfoCompat var2) {
               q.h(var1, "host");
               q.h(var2, "info");
               super.onInitializeAccessibilityNodeInfo(var1, var2);
               var var3: Boolean = true;
               var2.B0(true);
               if (this.$index != this.this$0.getSelectedIndex()) {
                  var3 = false;
               }

               var2.O0(var3);
               var2.L0(this.this$0.getAccessibilityRoleDescriptions().get(this.$index));
            }
         });
         this.binding.segmentContainer.addView(var3, new LayoutParams(0, -1, 1.0F));
      }

      return var3;
   }

   private fun maybeUpdateSegmentWidth() {
      val var2: View = this.binding.segmentContainer.getChildAt(0);
      val var1: Int;
      if (var2 != null) {
         var1 = var2.getWidth();
      } else {
         var1 = 0;
      }

      if (this.segmentWidth != var1) {
         this.segmentWidth = var1;
         val var3: CardView = this.binding.selectedSegmentBg;
         q.g(this.binding.selectedSegmentBg, "selectedSegmentBg");
         val var4: android.view.ViewGroup.LayoutParams = var3.getLayoutParams();
         if (var4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
         }

         var4.width = var1;
         var3.setLayoutParams(var4);
         ViewMeasureExtensionsKt.measureAndLayout(this);
         updateView$default(this, false, 1, null);
      }
   }

   private fun updateView(labelsChanged: Boolean = false) {
      if (var1) {
         this.binding.segmentContainer.removeAllViews();
      }

      this.binding.rootCardView.setRadius(this.getCornerRadiusPx());
      this.binding.rootCardView.setCardBackgroundColor(this.getContainerBgColor());
      this.binding.selectedSegmentBg.setCardBackgroundColor(this.getSelectedSegmentBgColor());
      val var3: java.util.Iterator = this.getLabels().iterator();

      for (int var2 = 0; var3.hasNext(); var2++) {
         var var4: TextView = (TextView)var3.next();
         if (var2 < 0) {
            i.t();
         }

         val var5: java.lang.String = var4 as java.lang.String;
         var4 = this.getLabelView(var2);
         var4.setText(var5);
         var4.setGravity(17);
         DiscordFontUtilsKt.setDiscordFont(var4, DiscordFont.PrimarySemibold);
         var4.setTextSize(this.getSegmentFontSizeSp());
         var4.setTextColor(this.getSegmentTextColor());
         var4.setOnClickListener(new a(this, var2, var5));
         if (var2 == this.getSelectedIndex()) {
            var4.setTextSize(this.getSelectedSegmentFontSizeSp());
            var4.setTextColor(this.getSelectedSegmentTextColor());
         }
      }

      ViewMeasureExtensionsKt.measureAndLayout(this);
      this.animateSelection(var1 xor true);
   }

   @JvmStatic
   fun `updateView$lambda$3$lambda$2$lambda$1`(var0: SegmentedControlView, var1: Int, var2: java.lang.String, var3: View) {
      q.h(var0, "this$0");
      q.h(var2, "$label");
      if (var0.onSegmentSelected != null) {
         var0.onSegmentSelected.invoke(var1, var2);
      }
   }

   private fun <T> updateViewOnChange(initialValue: Any, labelsChanged: Boolean = false): ReadWriteProperty<Any?, Any> {
      val var3: kotlin.properties.a = kotlin.properties.a.a;
      return new c(var1, this, var2) {
         final boolean $labelsChanged$inlined;
         final SegmentedControlView this$0;

         {
            super(var1);
            this.this$0 = var2;
            this.$labelsChanged$inlined = var3;
         }

         protected void afterChange(KProperty var1, T var2, T var3) {
            q.h(var1, "property");
            if (!q.c(var3, var2)) {
               SegmentedControlView.access$updateView(this.this$0, this.$labelsChanged$inlined);
            }
         }
      };
   }

   protected open fun onLayout(changed: Boolean, left: Int, top: Int, right: Int, bottom: Int) {
      super.onLayout(var1, var2, var3, var4, var5);
      this.maybeUpdateSegmentWidth();
   }
}

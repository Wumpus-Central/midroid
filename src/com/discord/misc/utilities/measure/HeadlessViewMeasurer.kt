package com.discord.misc.utilities.measure

import android.content.Context
import android.util.Size
import android.view.View
import android.view.View.MeasureSpec
import kotlin.jvm.internal.r

public class HeadlessViewMeasurer<T extends View>(clazz: Class<Any>) {
   private final val clazz: Class<Any>
   private final lateinit var shadowView: Any

   init {
      r.h(var1, "clazz");
      super();
      this.clazz = var1;
   }

   private fun getMeasureSpecMode(size: Int): Int {
      if (var1 == 0) {
         var1 = 0;
      } else {
         var1 = 1073741824;
      }

      return var1;
   }

   private fun <T : View> measure(view: T, measureBounds: com.discord.misc.utilities.measure.HeadlessViewMeasurer.MeasureBounds): Size {
      val var6: Int = var2.getWidthPx();
      var var3: Int;
      if (var6 != null) {
         var3 = var6;
      } else {
         var3 = 0;
      }

      val var5: Int = MeasureSpec.makeMeasureSpec(var3, this.getMeasureSpecMode(var3));
      val var7: Int = var2.getHeightPx();
      var3 = 0;
      if (var7 != null) {
         var3 = var7;
      }

      var1.measure(var5, MeasureSpec.makeMeasureSpec(var3, this.getMeasureSpecMode(var3)));
      return new Size(var1.getMeasuredWidth(), var1.getMeasuredHeight());
   }

   internal fun measure(context: Context, configureView: (Any) -> Unit, measureBounds: com.discord.misc.utilities.measure.HeadlessViewMeasurer.MeasureBounds): Size {
      label23: {
         r.h(var1, "context");
         r.h(var2, "configureView");
         r.h(var3, "measureBounds");
         if (this.shadowView != null) {
            var var4: View = this.shadowView;
            if (this.shadowView == null) {
               r.y("shadowView");
               var4 = null;
            }

            if (var4.getContext() === var1) {
               break label23;
            }
         }

         val var7: Any = this.clazz.getDeclaredConstructor(Context.class).newInstance(var1);
         r.f(var7, "null cannot be cast to non-null type T of com.discord.misc.utilities.measure.HeadlessViewMeasurer");
         this.shadowView = (T)var7;
      }

      var var8: View = this.shadowView;
      if (this.shadowView == null) {
         r.y("shadowView");
         var8 = null;
      }

      var2.invoke(var8);
      var var9: View = this.shadowView;
      if (this.shadowView == null) {
         r.y("shadowView");
         var9 = null;
      }

      return this.measure(var9, var3);
   }

   public data class MeasureBounds(widthPx: Int? = null, heightPx: Int? = null) {
      public final val heightPx: Int?
      public final val widthPx: Int?

      fun MeasureBounds() {
         this(null, null, 3, null);
      }

      init {
         this.widthPx = var1;
         this.heightPx = var2;
      }

      public operator fun component1(): Int? {
         return this.widthPx;
      }

      public operator fun component2(): Int? {
         return this.heightPx;
      }

      public fun copy(widthPx: Int? = var0.widthPx, heightPx: Int? = var0.heightPx): com.discord.misc.utilities.measure.HeadlessViewMeasurer.MeasureBounds {
         return new HeadlessViewMeasurer.MeasureBounds(var1, var2);
      }

      public override operator fun equals(other: Any?): Boolean {
         if (this === var1) {
            return true;
         } else if (var1 !is HeadlessViewMeasurer.MeasureBounds) {
            return false;
         } else {
            var1 = var1;
            if (!r.c(this.widthPx, var1.widthPx)) {
               return false;
            } else {
               return r.c(this.heightPx, var1.heightPx);
            }
         }
      }

      public override fun hashCode(): Int {
         var var2: Int = 0;
         val var1: Int;
         if (this.widthPx == null) {
            var1 = 0;
         } else {
            var1 = this.widthPx.hashCode();
         }

         if (this.heightPx != null) {
            var2 = this.heightPx.hashCode();
         }

         return var1 * 31 + var2;
      }

      public override fun toString(): String {
         val var1: Int = this.widthPx;
         val var3: Int = this.heightPx;
         val var2: StringBuilder = new StringBuilder();
         var2.append("MeasureBounds(widthPx=");
         var2.append(var1);
         var2.append(", heightPx=");
         var2.append(var3);
         var2.append(")");
         return var2.toString();
      }
   }
}

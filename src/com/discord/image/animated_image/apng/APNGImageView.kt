package com.discord.image.animated_image.apng

import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.widget.FrameLayout
import androidx.core.view.a3
import kotlin.jvm.internal.r

public abstract class APNGImageView : FrameLayout {
   protected final lateinit var apngView: APNGView
      internal set

   open fun APNGImageView(var1: Context) {
      r.h(var1, "context");
      this(var1, null, 0, 6, null);
   }

   open fun APNGImageView(var1: Context, var2: AttributeSet) {
      r.h(var1, "context");
      this(var1, var2, 0, 4, null);
   }

   open fun APNGImageView(var1: Context, var2: AttributeSet, var3: Int) {
      r.h(var1, "context");
      super(var1, var2, var3);
   }

   public fun inflateApngView(showLoading: Boolean = true) {
      if (this.apngView == null) {
         val var2: Context = this.getContext();
         r.g(var2, "context");
         this.setApngView(new APNGView(var2));
         this.getApngView().recycle(false, var1);
         this.getApngView().setId(View.generateViewId());
         this.addView(this.getApngView());
      }
   }

   public fun recycle() {
      resetViews$default(this, null, false, 3, null);
   }

   public open fun recycleChild(child: View) {
      r.h(var1, "child");
      val var2: APNGView;
      if (var1 is APNGView) {
         var2 = var1 as APNGView;
      } else {
         var2 = null;
      }

      if (var2 != null) {
         APNGView.recycle$default(var2, true, false, 2, null);
      }
   }

   public open fun recycleChild(child: View, showLoading: Boolean = true) {
      r.h(var1, "child");
      val var3: APNGView;
      if (var1 is APNGView) {
         var3 = var1 as APNGView;
      } else {
         var3 = null;
      }

      if (var3 != null) {
         var3.recycle(true, var2);
      }
   }

   protected open fun resetViews(visibleView: View? = null, showLoading: Boolean = true) {
      for (View var5 : a3.a(this)) {
         val var4: Boolean = r.c(var5, var1);
         if (!var4) {
            this.recycleChild(var5, var2);
         }

         val var3: Byte;
         if (var4) {
            var3 = 0;
         } else {
            var3 = 8;
         }

         var5.setVisibility(var3);
      }
   }
}

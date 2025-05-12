package com.discord.image.animated_image.apng

import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.widget.FrameLayout
import androidx.core.view.g0
import kotlin.jvm.functions.Function1
import kotlin.jvm.internal.q

public abstract class APNGImageView : FrameLayout {
   protected final lateinit var apngView: APNGView
      internal set

   public final var eventHandler: com.discord.image.animated_image.apng.APNGImageView.APNGImageViewEventHandler?
      internal set

   open fun APNGImageView(var1: Context) {
      q.h(var1, "context");
      this(var1, null, 0, 6, null);
   }

   open fun APNGImageView(var1: Context, var2: AttributeSet) {
      q.h(var1, "context");
      this(var1, var2, 0, 4, null);
   }

   open fun APNGImageView(var1: Context, var2: AttributeSet, var3: Int) {
      q.h(var1, "context");
      super(var1, var2, var3);
   }

   public fun inflateApngView(showLoading: Boolean = true) {
      if (this.apngView == null) {
         val var2: Context = this.getContext();
         q.g(var2, "getContext(...)");
         this.setApngView(new APNGView(var2));
         this.getApngView().recycle(false, var1);
         this.getApngView().setId(View.generateViewId());
         this.getApngView().setOnImageLoaded(new Function1(this) {
            final APNGImageView this$0;

            {
               super(1);
               this.this$0 = var1;
            }

            public final void invoke(java.lang.String var1) {
               q.h(var1, "url");
               val var2: APNGImageView.APNGImageViewEventHandler = this.this$0.getEventHandler();
               if (var2 != null) {
                  var2.onImageLoaded(var1);
               }
            }
         });
         this.addView(this.getApngView());
      }
   }

   public fun recycle() {
      resetViews$default(this, null, false, 3, null);
   }

   public open fun recycleChild(child: View) {
      q.h(var1, "child");
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
      q.h(var1, "child");
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
      for (View var6 : g0.a(this)) {
         val var4: Boolean = q.c(var6, var1);
         if (!var4) {
            this.recycleChild(var6, var2);
         }

         val var3: Byte;
         if (var4) {
            var3 = 0;
         } else {
            var3 = 8;
         }

         var6.setVisibility(var3);
      }
   }

   public interface APNGImageViewEventHandler {
      public abstract fun onImageLoaded(url: String) {
      }
   }
}

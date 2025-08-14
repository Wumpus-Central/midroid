package com.discord.image.animated_image.apng

import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.widget.FrameLayout
import androidx.core.view.f0
import kotlin.jvm.internal.SourceDebugExtension

@SourceDebugExtension(["SMAP\nAPNGImageView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 APNGImageView.kt\ncom/discord/image/animated_image/apng/APNGImageView\n+ 2 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,61:1\n1317#2:62\n1318#2:65\n257#3,2:63\n*S KotlinDebug\n*F\n+ 1 APNGImageView.kt\ncom/discord/image/animated_image/apng/APNGImageView\n*L\n42#1:62\n42#1:65\n47#1:63,2\n*E\n"])
public abstract class APNGImageView : FrameLayout {
   protected final lateinit var apngView: APNGView
      internal set

   public final var eventHandler: com.discord.image.animated_image.apng.APNGImageView.APNGImageViewEventHandler?
      internal set

   open fun APNGImageView(var1: Context) {
      this(var1, null, 0, 6, null);
   }

   open fun APNGImageView(var1: Context, var2: AttributeSet) {
      this(var1, var2, 0, 4, null);
   }

   open fun APNGImageView(var1: Context, var2: AttributeSet, var3: Int) {
      super(var1, var2, var3);
   }

   @JvmStatic
   fun `inflateApngView$lambda$0`(var0: APNGImageView, var1: java.lang.String): Unit {
      if (var0.eventHandler != null) {
         var0.eventHandler.onImageLoaded(var1);
      }

      return Unit.a;
   }

   public fun inflateApngView(showLoading: Boolean = true) {
      if (this.apngView == null) {
         val var2: Context = this.getContext();
         this.setApngView(new APNGView(var2));
         this.getApngView().recycle(false, var1);
         this.getApngView().setId(View.generateViewId());
         this.getApngView().setOnImageLoaded(new a(this));
         this.addView(this.getApngView());
      }
   }

   public fun recycle() {
      resetViews$default(this, null, false, 3, null);
   }

   public open fun recycleChild(child: View) {
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
      for (View var6 : f0.a(this)) {
         val var4: Boolean = var6 == var1;
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

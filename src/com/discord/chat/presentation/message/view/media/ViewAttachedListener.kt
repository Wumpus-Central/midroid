package com.discord.chat.presentation.message.view.media

import B9.j
import C1.a
import C1.b
import C1.c
import android.view.View
import android.view.ViewTreeObserver
import android.view.View.OnAttachStateChangeListener
import t6.f

public class ViewAttachedListener(view: View, viewAttached: (Boolean) -> Unit, viewScrolling: (Boolean) -> Unit = new c()) : OnAttachStateChangeListener {
   private final val view: View
   private final val viewAttached: (Boolean) -> Unit
   private final val viewScrolling: (Boolean) -> Unit
   private final val isAttachedDelay: Long
   private final var isAttachedRunnable: Runnable

   private final val scrollStateListener: ViewScrollStateListener
      private final get() {
         return this.scrollStateListener$delegate.getValue() as ViewScrollStateListener;
      }


   init {
      this.view = var1;
      this.viewAttached = var2;
      this.viewScrolling = var3;
      this.isAttachedDelay = var1.getResources().getInteger(f.c);
      this.isAttachedRunnable = new a(this);
      this.scrollStateListener$delegate = j.b(new b(this));
   }

   @JvmStatic
   fun `_init_$lambda$0`(var0: Boolean): Unit {
      return Unit.a;
   }

   @JvmStatic
   fun `isAttachedRunnable$lambda$1`(var0: ViewAttachedListener) {
      var0.viewAttached.invoke(java.lang.Boolean.TRUE);
   }

   @JvmStatic
   fun `scrollStateListener_delegate$lambda$2`(var0: ViewAttachedListener): ViewScrollStateListener {
      return new ViewScrollStateListener(var0.view, var0.viewScrolling);
   }

   public open fun onViewAttachedToWindow(view: View) {
      var1.postDelayed(this.isAttachedRunnable, this.isAttachedDelay);
      val var2: ViewTreeObserver = var1.getViewTreeObserver();
      if (var2 != null) {
         var2.addOnScrollChangedListener(this.getScrollStateListener());
      }
   }

   public open fun onViewDetachedFromWindow(view: View) {
      var1.removeCallbacks(this.isAttachedRunnable);
      val var2: ViewTreeObserver = var1.getViewTreeObserver();
      if (var2 != null) {
         val var3: ViewScrollStateListener = this.getScrollStateListener();
         var3.reset();
         var2.removeOnScrollChangedListener(var3);
      }

      this.viewAttached.invoke(java.lang.Boolean.FALSE);
   }
}

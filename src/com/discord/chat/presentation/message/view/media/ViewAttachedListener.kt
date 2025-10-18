package com.discord.chat.presentation.message.view.media

import C2.a
import C2.b
import C2.c
import Da.l
import android.view.View
import android.view.ViewTreeObserver
import android.view.View.OnAttachStateChangeListener
import v7.f

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
      this.scrollStateListener$delegate = l.b(new b(this));
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
      val var3: ViewTreeObserver = var1.getViewTreeObserver();
      if (var3 != null) {
         val var2: ViewScrollStateListener = this.getScrollStateListener();
         var2.reset();
         var3.removeOnScrollChangedListener(var2);
      }

      this.viewAttached.invoke(java.lang.Boolean.FALSE);
   }
}

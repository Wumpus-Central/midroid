package com.discord.chat.presentation.message.view.media

import android.view.View
import android.view.ViewTreeObserver
import android.view.View.OnAttachStateChangeListener
import kotlin.jvm.functions.Function0
import kotlin.jvm.internal.q
import nh.l
import yb.f

public class ViewAttachedListener(view: View, viewAttached: (Boolean) -> Unit, viewScrolling: (Boolean) -> Unit = <unrepresentable>.INSTANCE) :
   OnAttachStateChangeListener {
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
      q.h(var1, "view");
      q.h(var2, "viewAttached");
      q.h(var3, "viewScrolling");
      super();
      this.view = var1;
      this.viewAttached = var2;
      this.viewScrolling = var3;
      this.isAttachedDelay = var1.getResources().getInteger(f.c);
      this.isAttachedRunnable = new a(this);
      this.scrollStateListener$delegate = l.a(new Function0(this) {
         final ViewAttachedListener this$0;

         {
            super(0);
            this.this$0 = var1;
         }

         public final ViewScrollStateListener invoke() {
            return new ViewScrollStateListener(ViewAttachedListener.access$getView$p(this.this$0), ViewAttachedListener.access$getViewScrolling$p(this.this$0));
         }
      });
   }

   @JvmStatic
   fun `isAttachedRunnable$lambda$0`(var0: ViewAttachedListener) {
      q.h(var0, "this$0");
      var0.viewAttached.invoke(java.lang.Boolean.TRUE);
   }

   public open fun onViewAttachedToWindow(view: View) {
      q.h(var1, "view");
      var1.postDelayed(this.isAttachedRunnable, this.isAttachedDelay);
      val var2: ViewTreeObserver = var1.getViewTreeObserver();
      if (var2 != null) {
         var2.addOnScrollChangedListener(this.getScrollStateListener());
      }
   }

   public open fun onViewDetachedFromWindow(view: View) {
      q.h(var1, "view");
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

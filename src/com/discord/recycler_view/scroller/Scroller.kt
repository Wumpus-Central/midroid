package com.discord.recycler_view.scroller

import android.view.View
import android.view.View.OnAttachStateChangeListener
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.LayoutManager
import com.discord.recycler_view.utils.LayoutManagerUtilsKt
import com.discord.recycler_view.utils.RecyclerViewExtensionsKt
import kotlin.jvm.functions.Function0
import kotlin.jvm.internal.q

public class Scroller(recyclerView: RecyclerView) {
   private final var currentSearch: Runnable?

   private final val layoutManager: LinearLayoutManager
      private final get() {
         val var1: LayoutManager = this.recyclerView.getLayoutManager();
         q.f(var1, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
         return var1 as LinearLayoutManager;
      }


   private final val recyclerView: RecyclerView

   init {
      q.h(var1, "recyclerView");
      super();
      this.recyclerView = var1;
      var1.addOnAttachStateChangeListener(new OnAttachStateChangeListener(this) {
         final Scroller this$0;

         {
            this.this$0 = var1;
         }

         public void onViewAttachedToWindow(View var1) {
            q.h(var1, "v");
         }

         public void onViewDetachedFromWindow(View var1) {
            q.h(var1, "v");
            this.this$0.cancel();
         }
      });
   }

   private fun doScrollToPosition(position: Int, targetAlignment: com.discord.recycler_view.scroller.Scroller.TargetAlignment) {
      if (var2 is Scroller.TargetAlignment.Anywhere) {
         this.recyclerView.scrollToPosition(var1);
      } else if (var2 is Scroller.TargetAlignment.Center) {
         RecyclerViewExtensionsKt.scrollToCenter(this.recyclerView, var1);
      } else if (var2 is Scroller.TargetAlignment.Top) {
         RecyclerViewExtensionsKt.scrollToTop(this.recyclerView, var1, (var2 as Scroller.TargetAlignment.Top).getOffsetPx());
      }
   }

   private fun search(
      position: Int,
      targetAlignment: com.discord.recycler_view.scroller.Scroller.TargetAlignment,
      onStart: () -> Unit,
      onComplete: () -> Unit,
      onScrollProgress: () -> Unit
   ) {
      val var6: java.lang.Boolean = LayoutManagerUtilsKt.isPositionVisible(this.getLayoutManager(), var1);
      if (var6 != null && !var6) {
         this.doScrollToPosition(var1, var2);
         var5.invoke();
         val var7: a = new a(this, var1, var2, var3, var4, var5);
         this.currentSearch = var7;
         this.recyclerView.post(var7);
      } else if (var2 is Scroller.TargetAlignment.Top) {
         this.doScrollToPosition(var1, var2);
         var5.invoke();
         var4.invoke();
      } else {
         var4.invoke();
      }
   }

   @JvmStatic
   fun `search$lambda$0`(var0: Scroller, var1: Int, var2: Scroller.TargetAlignment, var3: Function0, var4: Function0, var5: Function0) {
      q.h(var0, "this$0");
      q.h(var2, "$targetAlignment");
      q.h(var3, "$onStart");
      q.h(var4, "$onComplete");
      q.h(var5, "$onScrollProgress");
      var0.search(var1, var2, var3, var4, var5);
   }

   public fun cancel() {
      if (this.currentSearch != null) {
         this.recyclerView.removeCallbacks(this.currentSearch);
         this.currentSearch = null;
      }
   }

   public fun scrollToPosition(
      position: Int,
      targetAlignment: com.discord.recycler_view.scroller.Scroller.TargetAlignment,
      animate: Boolean,
      onStart: () -> Unit = <unrepresentable>.INSTANCE,
      onComplete: () -> Unit = <unrepresentable>.INSTANCE,
      onScrollProgress: () -> Unit = <unrepresentable>.INSTANCE
   ) {
      q.h(var2, "targetAlignment");
      q.h(var4, "onStart");
      q.h(var5, "onComplete");
      q.h(var6, "onScrollProgress");
      this.cancel();
      var4.invoke();
      if (var3) {
         RecyclerViewExtensionsKt.scrollToPositionAnimated(this.recyclerView, var1, var2, new Function0(var6, var5) {
            final Function0 $onComplete;
            final Function0 $onScrollProgress;

            {
               super(0);
               this.$onScrollProgress = var1;
               this.$onComplete = var2;
            }

            public final void invoke() {
               this.$onScrollProgress.invoke();
               this.$onComplete.invoke();
            }
         });
      } else {
         this.search(var1, var2, var4, var5, var6);
      }
   }

   public sealed class TargetAlignment protected constructor() {
      public object Anywhere : Scroller.TargetAlignment()

      public object Center : Scroller.TargetAlignment()

      public data class Top(offsetPx: Int) : Scroller.TargetAlignment() {
         public final val offsetPx: Int

         init {
            this.offsetPx = var1;
         }

         public operator fun component1(): Int {
            return this.offsetPx;
         }

         public fun copy(offsetPx: Int = var0.offsetPx): com.discord.recycler_view.scroller.Scroller.TargetAlignment.Top {
            return new Scroller.TargetAlignment.Top(var1);
         }

         public override operator fun equals(other: Any?): Boolean {
            if (this === var1) {
               return true;
            } else if (var1 !is Scroller.TargetAlignment.Top) {
               return false;
            } else {
               return this.offsetPx == (var1 as Scroller.TargetAlignment.Top).offsetPx;
            }
         }

         public override fun hashCode(): Int {
            return Integer.hashCode(this.offsetPx);
         }

         public override fun toString(): String {
            val var1: Int = this.offsetPx;
            val var2: StringBuilder = new StringBuilder();
            var2.append("Top(offsetPx=");
            var2.append(var1);
            var2.append(")");
            return var2.toString();
         }
      }
   }
}

package com.discord.recycler_view.scroller

import Da.p
import android.view.View
import android.view.View.OnAttachStateChangeListener
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.LayoutManager
import com.discord.recycler_view.utils.LayoutManagerUtilsKt
import com.discord.recycler_view.utils.RecyclerViewExtensionsKt
import kotlin.jvm.functions.Function0

public class Scroller(recyclerView: RecyclerView) {
   private final val recyclerView: RecyclerView

   private final val layoutManager: LinearLayoutManager
      private final get() {
         val var1: LayoutManager = this.recyclerView.getLayoutManager();
         return var1 as LinearLayoutManager;
      }


   private final var currentSearch: Runnable?

   init {
      this.recyclerView = var1;
      var1.addOnAttachStateChangeListener(new OnAttachStateChangeListener(this) {
         final Scroller this$0;

         {
            this.this$0 = var1;
         }

         public void onViewAttachedToWindow(View var1) {
         }

         public void onViewDetachedFromWindow(View var1) {
            this.this$0.cancel();
         }
      });
   }

   private fun doScrollToPosition(position: Int, targetAlignment: com.discord.recycler_view.scroller.Scroller.TargetAlignment) {
      if (var2 is Scroller.TargetAlignment.Anywhere) {
         this.recyclerView.scrollToPosition(var1);
      } else if (var2 is Scroller.TargetAlignment.Center) {
         RecyclerViewExtensionsKt.scrollToCenter(this.recyclerView, var1);
      } else {
         if (var2 !is Scroller.TargetAlignment.Top) {
            throw new p();
         }

         RecyclerViewExtensionsKt.scrollToTop(this.recyclerView, var1, (var2 as Scroller.TargetAlignment.Top).getOffsetPx());
      }
   }

   @JvmStatic
   fun `scrollToPosition$lambda$0`(): Unit {
      return Unit.a;
   }

   @JvmStatic
   fun `scrollToPosition$lambda$1`(): Unit {
      return Unit.a;
   }

   @JvmStatic
   fun `scrollToPosition$lambda$2`(): Unit {
      return Unit.a;
   }

   @JvmStatic
   fun `scrollToPosition$lambda$3`(var0: Function0, var1: Function0): Unit {
      var0.invoke();
      var1.invoke();
      return Unit.a;
   }

   private fun search(
      position: Int,
      targetAlignment: com.discord.recycler_view.scroller.Scroller.TargetAlignment,
      onStart: () -> Unit,
      onComplete: () -> Unit,
      onScrollProgress: () -> Unit,
      iteration: Int
   ) {
      val var8: LinearLayoutManager = this.getLayoutManager();
      val var7: Boolean;
      if (var6 < 30) {
         var7 = true;
      } else {
         var7 = false;
      }

      val var10: java.lang.Boolean = LayoutManagerUtilsKt.isPositionVisible(var8, var1, var7);
      if (var10 != null && !var10) {
         this.doScrollToPosition(var1, var2);
         var5.invoke();
         val var9: a = new a(this, var1, var2, var3, var4, var5, var6);
         this.currentSearch = var9;
         this.recyclerView.post(var9);
      } else if (var2 !is Scroller.TargetAlignment.Center && var2 !is Scroller.TargetAlignment.Top) {
         var4.invoke();
      } else {
         this.doScrollToPosition(var1, var2);
         var5.invoke();
         var4.invoke();
      }
   }

   @JvmStatic
   fun `search$lambda$4`(var0: Scroller, var1: Int, var2: Scroller.TargetAlignment, var3: Function0, var4: Function0, var5: Function0, var6: Int) {
      var0.search(var1, var2, var3, var4, var5, var6 + 1);
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
      onStart: () -> Unit = new c(),
      onComplete: () -> Unit = new d(),
      onScrollProgress: () -> Unit = new e()
   ) {
      this.cancel();
      var4.invoke();
      if (var3) {
         RecyclerViewExtensionsKt.scrollToPositionAnimated(this.recyclerView, var1, var2, new b(var6, var5));
      } else {
         this.search(var1, var2, var4, var5, var6, 0);
      }
   }

   public sealed class TargetAlignment protected constructor() {
      public data object Anywhere : Scroller.TargetAlignment() {
         public override operator fun equals(other: Any?): Boolean {
            if (this === var1) {
               return true;
            } else {
               return var1 is Scroller.TargetAlignment.Anywhere;
            }
         }

         public override fun hashCode(): Int {
            return 425096303;
         }

         public override fun toString(): String {
            return "Anywhere";
         }
      }

      public data object Center : Scroller.TargetAlignment() {
         public override operator fun equals(other: Any?): Boolean {
            if (this === var1) {
               return true;
            } else {
               return var1 is Scroller.TargetAlignment.Center;
            }
         }

         public override fun hashCode(): Int {
            return 232298313;
         }

         public override fun toString(): String {
            return "Center";
         }
      }

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

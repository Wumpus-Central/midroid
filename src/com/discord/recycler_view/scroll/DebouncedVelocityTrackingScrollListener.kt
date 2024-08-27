package com.discord.recycler_view.scroll

import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.OnScrollListener
import kotlin.jvm.functions.Function1
import kotlin.jvm.functions.Function2
import kotlin.jvm.internal.r

public class DebouncedVelocityTrackingScrollListener(recyclerView: RecyclerView,
      recyclerViewIncludesFlings: Boolean = true,
      scrollVelocitySampleSize: Int = 10,
      scrollVelocityChanged: (RecyclerView, Float) -> Unit,
      timeoutMillis: Long
   )
   : OnScrollListener {
   private final val scrollVelocityChanged: (RecyclerView, Float) -> Unit
   private final lateinit var lastVelocityEvent: com.discord.recycler_view.scroll.DebouncedVelocityTrackingScrollListener.VelocityEvent
   private final val velocityEvents: DebouncedFlow<com.discord.recycler_view.scroll.DebouncedVelocityTrackingScrollListener.VelocityEvent>
   private final val velocityTracker: VelocityTrackingScrollListener

   init {
      r.h(var1, "recyclerView");
      r.h(var4, "scrollVelocityChanged");
      super();
      this.scrollVelocityChanged = var4;
      this.velocityEvents = new DebouncedFlow<>(var5, new Function1<DebouncedVelocityTrackingScrollListener.VelocityEvent, Unit>(this) {
         final DebouncedVelocityTrackingScrollListener this$0;

         {
            super(1);
            this.this$0 = var1;
         }

         public final void invoke(DebouncedVelocityTrackingScrollListener.VelocityEvent var1) {
            r.h(var1, "<name for destructuring parameter 0>");
            DebouncedVelocityTrackingScrollListener.access$getScrollVelocityChanged$p(this.this$0).invoke(var1.component1(), var1.component2());
         }
      }, false, 4, null);
      this.velocityTracker = new VelocityTrackingScrollListener(
         var1,
         var2,
         var3,
         new Function2<RecyclerView, java.lang.Float, Unit>(this) {
            {
               super(
                  2,
                  var1,
                  DebouncedVelocityTrackingScrollListener::class.java,
                  "onScrollVelocityChanged",
                  "onScrollVelocityChanged(Landroidx/recyclerview/widget/RecyclerView;F)V",
                  0
               );
            }

            public final void invoke(RecyclerView var1, float var2) {
               r.h(var1, "p0");
               DebouncedVelocityTrackingScrollListener.access$onScrollVelocityChanged(super.receiver as DebouncedVelocityTrackingScrollListener, var1, var2);
            }
         }
      );
   }

   private fun onScrollVelocityChanged(recyclerView: RecyclerView, velocity: Float) {
      if (this.lastVelocityEvent == null) {
         this.lastVelocityEvent = new DebouncedVelocityTrackingScrollListener.VelocityEvent(var1, var2);
      } else {
         var var3: DebouncedVelocityTrackingScrollListener.VelocityEvent = this.lastVelocityEvent;
         if (this.lastVelocityEvent == null) {
            r.y("lastVelocityEvent");
            var3 = null;
         }

         var3.setRecyclerView(var1);
         var var6: DebouncedVelocityTrackingScrollListener.VelocityEvent = this.lastVelocityEvent;
         if (this.lastVelocityEvent == null) {
            r.y("lastVelocityEvent");
            var6 = null;
         }

         var6.setVelocity(var2);
      }

      var var7: DebouncedVelocityTrackingScrollListener.VelocityEvent = this.lastVelocityEvent;
      if (this.lastVelocityEvent == null) {
         r.y("lastVelocityEvent");
         var7 = null;
      }

      this.velocityEvents.tryEmit(var7);
   }

   public fun cancel() {
      this.velocityEvents.cancel();
   }

   public open fun onScrollStateChanged(recyclerView: RecyclerView, newState: Int) {
      r.h(var1, "recyclerView");
      super.onScrollStateChanged(var1, var2);
      this.velocityTracker.onScrollStateChanged(var1, var2);
   }

   public open fun onScrolled(recyclerView: RecyclerView, dx: Int, dy: Int) {
      r.h(var1, "recyclerView");
      super.onScrolled(var1, var2, var3);
      this.velocityTracker.onScrolled(var1, var2, var3);
   }

   private data class VelocityEvent(recyclerView: RecyclerView, velocity: Float) {
      public final var recyclerView: RecyclerView
         internal set

      public final var velocity: Float
         internal set

      init {
         r.h(var1, "recyclerView");
         super();
         this.recyclerView = var1;
         this.velocity = var2;
      }

      public operator fun component1(): RecyclerView {
         return this.recyclerView;
      }

      public operator fun component2(): Float {
         return this.velocity;
      }

      public fun copy(recyclerView: RecyclerView = var0.recyclerView, velocity: Float = var0.velocity): com.discord.recycler_view.scroll.DebouncedVelocityTrackingScrollListener.VelocityEvent {
         r.h(var1, "recyclerView");
         return new DebouncedVelocityTrackingScrollListener.VelocityEvent(var1, var2);
      }

      public override operator fun equals(other: Any?): Boolean {
         if (this === var1) {
            return true;
         } else if (var1 !is DebouncedVelocityTrackingScrollListener.VelocityEvent) {
            return false;
         } else {
            var1 = var1;
            if (!r.c(this.recyclerView, var1.recyclerView)) {
               return false;
            } else {
               return java.lang.Float.compare(this.velocity, var1.velocity) == 0;
            }
         }
      }

      public override fun hashCode(): Int {
         return this.recyclerView.hashCode() * 31 + java.lang.Float.hashCode(this.velocity);
      }

      public override fun toString(): String {
         val var3: RecyclerView = this.recyclerView;
         val var1: Float = this.velocity;
         val var2: StringBuilder = new StringBuilder();
         var2.append("VelocityEvent(recyclerView=");
         var2.append(var3);
         var2.append(", velocity=");
         var2.append(var1);
         var2.append(")");
         return var2.toString();
      }
   }
}

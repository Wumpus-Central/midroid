package com.discord.recycler_view.scroll

import androidx.recyclerview.widget.RecyclerView
import kotlin.jvm.internal.r

public open class DebouncedScrollListener(timeoutMillis: Long,
      onScrolled: ((RecyclerView, Int, Int) -> Unit)?,
      onScrollStateChanged: ((RecyclerView, Int) -> Unit)? = null,
      onDragStateChanged: ((Boolean) -> Unit)? = null
   )
   : RecyclerView.OnScrollListener {
   private final var timeoutMillis: Long
   private final val onScrolled: ((RecyclerView, Int, Int) -> Unit)?
   private final val onScrollStateChanged: ((RecyclerView, Int) -> Unit)?
   private final val onDragStateChanged: ((Boolean) -> Unit)?
   private final lateinit var lastScrollEvent: com.discord.recycler_view.scroll.DebouncedScrollListener.ScrollEvent
   private final var isDragging: Boolean
   private final var scrollEvents: DebouncedFlow<com.discord.recycler_view.scroll.DebouncedScrollListener.ScrollEvent>

   init {
      this.timeoutMillis = var1;
      this.onScrolled = var3;
      this.onScrollStateChanged = var4;
      this.onDragStateChanged = var5;
      this.scrollEvents = new DebouncedFlow<>(var1, new a(this), false, 4, null);
   }

   private fun checkDragState(newState: Int) {
      if (var1 != 1) {
         if (var1 == 2 && this.isDragging) {
            this.isDragging = false;
            if (this.onDragStateChanged != null) {
               this.onDragStateChanged.invoke(java.lang.Boolean.FALSE);
            }
         }
      } else if (!this.isDragging) {
         this.isDragging = true;
         if (this.onDragStateChanged != null) {
            this.onDragStateChanged.invoke(java.lang.Boolean.TRUE);
         }
      }
   }

   @JvmStatic
   fun `scrollEvents$lambda$0`(var0: DebouncedScrollListener, var1: DebouncedScrollListener.ScrollEvent): Unit {
      r.h(var1, "<destruct>");
      val var4: RecyclerView = var1.component1();
      val var3: Int = var1.component2();
      val var2: Int = var1.component3();
      if (var0.onScrolled != null) {
         var0.onScrolled.invoke(var4, var3, var2);
      }

      return Unit.a;
   }

   @JvmStatic
   fun `setTimeoutMillis$lambda$1`(var0: DebouncedScrollListener, var1: DebouncedScrollListener.ScrollEvent): Unit {
      r.h(var1, "<destruct>");
      val var4: RecyclerView = var1.component1();
      val var2: Int = var1.component2();
      val var3: Int = var1.component3();
      if (var0.onScrolled != null) {
         var0.onScrolled.invoke(var4, var2, var3);
      }

      return Unit.a;
   }

   public fun cancel() {
      this.scrollEvents.cancel();
   }

   public fun getTimeoutMillis(): Long {
      return this.timeoutMillis;
   }

   public override fun onScrollStateChanged(recyclerView: RecyclerView, newState: Int) {
      r.h(var1, "recyclerView");
      super.onScrollStateChanged(var1, var2);
      if (this.onScrollStateChanged != null) {
         this.onScrollStateChanged.invoke(var1, var2);
      }

      this.checkDragState(var2);
   }

   public override fun onScrolled(recyclerView: RecyclerView, dx: Int, dy: Int) {
      r.h(var1, "recyclerView");
      super.onScrolled(var1, var2, var3);
      if (this.lastScrollEvent == null) {
         this.lastScrollEvent = new DebouncedScrollListener.ScrollEvent(var1, var2, var3);
      } else {
         var var4: DebouncedScrollListener.ScrollEvent = this.lastScrollEvent;
         if (this.lastScrollEvent == null) {
            r.y("lastScrollEvent");
            var4 = null;
         }

         var4.setRecyclerView(var1);
         var var7: DebouncedScrollListener.ScrollEvent = this.lastScrollEvent;
         if (this.lastScrollEvent == null) {
            r.y("lastScrollEvent");
            var7 = null;
         }

         var7.setDx(var2);
         var var8: DebouncedScrollListener.ScrollEvent = this.lastScrollEvent;
         if (this.lastScrollEvent == null) {
            r.y("lastScrollEvent");
            var8 = null;
         }

         var8.setDy(var3);
      }

      var var9: DebouncedScrollListener.ScrollEvent = this.lastScrollEvent;
      if (this.lastScrollEvent == null) {
         r.y("lastScrollEvent");
         var9 = null;
      }

      this.scrollEvents.tryEmit(var9);
   }

   public fun setTimeoutMillis(timeoutMillis: Long) {
      this.timeoutMillis = var1;
      this.scrollEvents.cancel();
      this.scrollEvents = new DebouncedFlow<>(var1, new b(this), false, 4, null);
   }

   private data class ScrollEvent(recyclerView: RecyclerView, dx: Int, dy: Int) {
      public final var recyclerView: RecyclerView
         internal set

      public final var dx: Int
         internal set

      public final var dy: Int
         internal set

      init {
         r.h(var1, "recyclerView");
         super();
         this.recyclerView = var1;
         this.dx = var2;
         this.dy = var3;
      }

      public operator fun component1(): RecyclerView {
         return this.recyclerView;
      }

      public operator fun component2(): Int {
         return this.dx;
      }

      public operator fun component3(): Int {
         return this.dy;
      }

      public fun copy(recyclerView: RecyclerView = var0.recyclerView, dx: Int = var0.dx, dy: Int = var0.dy): com.discord.recycler_view.scroll.DebouncedScrollListener.ScrollEvent {
         r.h(var1, "recyclerView");
         return new DebouncedScrollListener.ScrollEvent(var1, var2, var3);
      }

      public override operator fun equals(other: Any?): Boolean {
         if (this === var1) {
            return true;
         } else if (var1 !is DebouncedScrollListener.ScrollEvent) {
            return false;
         } else {
            var1 = var1;
            if (!r.c(this.recyclerView, var1.recyclerView)) {
               return false;
            } else if (this.dx != var1.dx) {
               return false;
            } else {
               return this.dy == var1.dy;
            }
         }
      }

      public override fun hashCode(): Int {
         return (this.recyclerView.hashCode() * 31 + Integer.hashCode(this.dx)) * 31 + Integer.hashCode(this.dy);
      }

      public override fun toString(): String {
         val var3: RecyclerView = this.recyclerView;
         val var2: Int = this.dx;
         val var1: Int = this.dy;
         val var4: StringBuilder = new StringBuilder();
         var4.append("ScrollEvent(recyclerView=");
         var4.append(var3);
         var4.append(", dx=");
         var4.append(var2);
         var4.append(", dy=");
         var4.append(var1);
         var4.append(")");
         return var4.toString();
      }
   }
}

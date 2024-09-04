package com.discord.recycler_view.scroll

import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.OnScrollListener
import kotlin.jvm.functions.Function1
import kotlin.jvm.functions.Function3
import kotlin.jvm.internal.r

public open class DebouncedScrollListener(timeoutMillis: Long,
      onScrolled: ((RecyclerView, Int, Int) -> Unit)?,
      onScrollStateChanged: ((RecyclerView, Int) -> Unit)? = null,
      onDragStateChanged: ((Boolean) -> Unit)? = null
   )
   : OnScrollListener {
   private final val onScrolled: ((RecyclerView, Int, Int) -> Unit)?
   private final val onScrollStateChanged: ((RecyclerView, Int) -> Unit)?
   private final val onDragStateChanged: ((Boolean) -> Unit)?
   private final lateinit var lastScrollEvent: com.discord.recycler_view.scroll.DebouncedScrollListener.ScrollEvent
   private final var isDragging: Boolean
   private final val scrollEvents: DebouncedFlow<com.discord.recycler_view.scroll.DebouncedScrollListener.ScrollEvent>

   init {
      this.onScrolled = var3;
      this.onScrollStateChanged = var4;
      this.onDragStateChanged = var5;
      this.scrollEvents = new DebouncedFlow<>(var1, new Function1<DebouncedScrollListener.ScrollEvent, Unit>(this) {
         final DebouncedScrollListener this$0;

         {
            super(1);
            this.this$0 = var1;
         }

         public final void invoke(DebouncedScrollListener.ScrollEvent var1) {
            r.h(var1, "<name for destructuring parameter 0>");
            val var4: RecyclerView = var1.component1();
            val var2: Int = var1.component2();
            val var3: Int = var1.component3();
            val var5: Function3 = DebouncedScrollListener.access$getOnScrolled$p(this.this$0);
            if (var5 != null) {
               var5.invoke(var4, var2, var3);
            }
         }
      }, false, 4, null);
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

   public fun cancel() {
      this.scrollEvents.cancel();
   }

   public open fun onScrollStateChanged(recyclerView: RecyclerView, newState: Int) {
      r.h(var1, "recyclerView");
      super.onScrollStateChanged(var1, var2);
      if (this.onScrollStateChanged != null) {
         this.onScrollStateChanged.invoke(var1, var2);
      }

      this.checkDragState(var2);
   }

   public open fun onScrolled(recyclerView: RecyclerView, dx: Int, dy: Int) {
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

   private data class ScrollEvent(recyclerView: RecyclerView, dx: Int, dy: Int) {
      public final var dx: Int
         internal set

      public final var dy: Int
         internal set

      public final var recyclerView: RecyclerView
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

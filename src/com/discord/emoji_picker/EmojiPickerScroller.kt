package com.discord.emoji_picker

import android.view.View
import android.view.View.OnLayoutChangeListener
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.discord.misc.utilities.measure.ViewMeasureExtensionsKt
import com.discord.recycler_view.scroll.DebouncedScrollListener
import com.discord.recycler_view.scroll.DebouncedVelocityTrackingScrollListener
import com.discord.recycler_view.scroller.Scroller
import kotlin.jvm.functions.Function0
import kotlin.jvm.functions.Function1
import kotlin.jvm.functions.Function2
import kotlin.jvm.functions.Function3
import kotlin.jvm.internal.q

internal class EmojiPickerScroller(recyclerView: RecyclerView,
   emojiPickerViewAdapter: EmojiPickerViewAdapter,
   emojiPickerLayoutManager: GridLayoutManager,
   scrollFastVelocity: Int,
   onScrolled: (com.discord.emoji_picker.EmojiPickerScroller.ScrollEvent) -> Unit,
   onScrollStateChanged: () -> Unit,
   onDragStateChanged: (com.discord.emoji_picker.EmojiPickerScroller.ScrollEvent, Boolean) -> Unit,
   onStickyHeaderRender: (View, Int) -> Unit
) {
   private final val recyclerView: RecyclerView
   private final val emojiPickerViewAdapter: EmojiPickerViewAdapter
   private final val emojiPickerLayoutManager: GridLayoutManager
   private final var scrollFastVelocity: Int
   private final val scrollEvent: com.discord.emoji_picker.EmojiPickerScroller.ScrollEvent
   private final val scroller: Scroller
   private final val scrollListenerVelocityTracker: DebouncedVelocityTrackingScrollListener
   private final val scrollListenerDebounced: <unrepresentable>
   private final var scrollVelocityTrackingPaused: Boolean
   private final var scrollJumpingToPosition: Boolean
   private final val scrollViewLayoutChanged: OnLayoutChangeListener
   private final var firstHeaderPosition: Int

   init {
      q.h(var1, "recyclerView");
      q.h(var2, "emojiPickerViewAdapter");
      q.h(var3, "emojiPickerLayoutManager");
      q.h(var5, "onScrolled");
      q.h(var6, "onScrollStateChanged");
      q.h(var7, "onDragStateChanged");
      q.h(var8, "onStickyHeaderRender");
      super();
      this.recyclerView = var1;
      this.emojiPickerViewAdapter = var2;
      this.emojiPickerLayoutManager = var3;
      this.scrollFastVelocity = var4;
      this.scrollEvent = new EmojiPickerScroller.ScrollEvent(0, 0, 0, 0, 0, 0, 63, null);
      this.scroller = new Scroller(var1);
      this.scrollListenerVelocityTracker = new DebouncedVelocityTrackingScrollListener(var1, false, 0, new Function2(this, var6) {
         final Function0 $onScrollStateChanged;
         final EmojiPickerScroller this$0;

         {
            super(2);
            this.this$0 = var1;
            this.$onScrollStateChanged = var2;
         }

         public final void invoke(RecyclerView var1, float var2) {
            q.h(var1, "<anonymous parameter 0>");
            EmojiPickerScroller.access$onScrollVelocityChanged(this.this$0, var2);
            this.$onScrollStateChanged.invoke();
         }
      }, 600L, 6, null);
      this.scrollListenerDebounced = new DebouncedScrollListener(
         new Function3(var5, this, var8) {
            final Function1 $onScrolled;
            final Function2 $onStickyHeaderRender;
            final EmojiPickerScroller this$0;

            {
               super(3);
               this.$onScrolled = var1;
               this.this$0 = var2;
               this.$onStickyHeaderRender = var3;
            }

            public final void invoke(RecyclerView var1, int var2, int var3) {
               q.h(var1, "<anonymous parameter 0>");
               this.$onScrolled.invoke(EmojiPickerScroller.access$computeScrollEvent(this.this$0, EmojiPickerScroller.access$getRecyclerView$p(this.this$0)));
               EmojiPickerScroller.access$findFirstHeaderIndex(this.this$0, new Function1(this.$onStickyHeaderRender, this.this$0) {
                  final Function2 $onStickyHeaderRender;
                  final EmojiPickerScroller this$0;

                  {
                     super(1);
                     this.$onStickyHeaderRender = var1;
                     this.this$0 = var2x;
                  }

                  public final void invoke(int var1) {
                     this.$onStickyHeaderRender.invoke(EmojiPickerScroller.access$getRecyclerView$p(this.this$0), var1);
                  }
               });
            }
         },
         new Function1(var7, this) {
            final Function2 $onDragStateChanged;
            final EmojiPickerScroller this$0;

            {
               super(1);
               this.$onDragStateChanged = var1;
               this.this$0 = var2;
            }

            public final void invoke(boolean var1) {
               this.$onDragStateChanged
                  .invoke(EmojiPickerScroller.access$computeScrollEvent(this.this$0, EmojiPickerScroller.access$getRecyclerView$p(this.this$0)), var1);
            }
         }
      ) {
         {
            super(300L, var1, null, var2, 4, null);
         }

         @Override
         public void onScrolled(RecyclerView var1, int var2, int var3) {
            q.h(var1, "recyclerView");
            if (var2 != 0 || var3 != 0) {
               super.onScrolled(var1, var2, var3);
            }
         }
      };
      this.scrollViewLayoutChanged = new c(this, var8);
      this.firstHeaderPosition = -1;
   }

   private fun RecyclerView.computeScrollEvent(): com.discord.emoji_picker.EmojiPickerScroller.ScrollEvent {
      val var2: EmojiPickerScroller.ScrollEvent = this.scrollEvent;
      this.scrollEvent.setX(0);
      var2.setY(var1.computeVerticalScrollOffset());
      var2.setWidth(var1.getWidth());
      var2.setHeight(var1.getHeight());
      var2.setContentWidth(var1.getWidth());
      var2.setContentHeight(var1.computeVerticalScrollRange());
      return var2;
   }

   private fun findFirstHeaderIndex(onUpdate: (Int) -> Unit) {
      val var4: Int = this.emojiPickerViewAdapter
         .findFirstItemPositionAboveOrBelowPosition(this.emojiPickerLayoutManager.findFirstVisibleItemPosition(), EmojiPickerItem.ItemType.CATEGORY.ordinal());
      if (this.firstHeaderPosition != var4 && var4 != -1) {
         this.firstHeaderPosition = var4;
         val var3: Int = this.emojiPickerViewAdapter.getItemIndex(var4);
         if (var3 != null) {
            var1.invoke(var3);
         }
      }
   }

   private fun onScrollVelocityChanged(velocity: Float) {
      val var6: Float;
      val var3: Boolean = (boolean)(if ((var6 = var1 - 0.0F) == 0.0F) 0 else (if (var6 < 0.0F) -1 else 1));
      var var2: Boolean;
      if (var1 == 0.0F) {
         var2 = true;
      } else {
         var2 = false;
      }

      val var4: Boolean = var2 xor true;
      if (Math.abs(var1) > this.scrollFastVelocity) {
         var2 = true;
      } else {
         var2 = false;
      }

      if (this.emojiPickerViewAdapter.getScrolling() != var4) {
         this.emojiPickerViewAdapter.setScrolling(var4);
      }

      if (!this.scrollVelocityTrackingPaused) {
         if (var2) {
            this.emojiPickerViewAdapter.setScrollingFast(true);
         }

         if (!var2 && !this.scrollJumpingToPosition) {
            this.emojiPickerViewAdapter.setScrollingFast(false);
         }

         if (!var3) {
            this.emojiPickerViewAdapter.setScrollingFast(false);
            this.scrollJumpingToPosition = false;
         }
      }
   }

   @JvmStatic
   fun `scrollViewLayoutChanged$lambda$0`(
      var0: EmojiPickerScroller, var1: Function2, var2: View, var3: Int, var4: Int, var5: Int, var6: Int, var7: Int, var8: Int, var9: Int, var10: Int
   ) {
      q.h(var0, "this$0");
      q.h(var1, "$onStickyHeaderRender");
      var0.findFirstHeaderIndex(new Function1(var1, var0) {
         final Function2 $onStickyHeaderRender;
         final EmojiPickerScroller this$0;

         {
            super(1);
            this.$onStickyHeaderRender = var1;
            this.this$0 = var2;
         }

         public final void invoke(int var1) {
            this.$onStickyHeaderRender.invoke(EmojiPickerScroller.access$getRecyclerView$p(this.this$0), var1);
         }
      });
   }

   public fun bind() {
      this.recyclerView.addOnLayoutChangeListener(this.scrollViewLayoutChanged);
      this.recyclerView.addOnScrollListener(this.scrollListenerDebounced);
      this.recyclerView.addOnScrollListener(this.scrollListenerVelocityTracker);
   }

   public fun scrollToItemAtIndex(index: Int, animated: Boolean, itemType: Int) {
      val var5: Int = this.emojiPickerLayoutManager.findFirstVisibleItemPosition();
      var3 = this.emojiPickerViewAdapter.getItemPositionAtIndex(var1, var3);
      if (var3 != -1 && this.firstHeaderPosition != -1) {
         if (var3 == var5) {
            return;
         }

         val var4: Int = Math.abs(this.emojiPickerViewAdapter.getEstimatedDistance(var5, var3));
         if (var3 < var5) {
            var1 = -this.recyclerView.getHeight();
         } else {
            var1 = this.recyclerView.getHeight();
         }

         if (var4 >= Math.abs(var1)) {
            this.scrollVelocityTrackingPaused = true;
            this.emojiPickerViewAdapter.setScrollingFast(true);
            this.emojiPickerLayoutManager.scrollToPositionWithOffset(var3, var1);
            ViewMeasureExtensionsKt.measureAndLayout(this.recyclerView);
         }

         this.scrollJumpingToPosition = true;
         Scroller.scrollToPosition$default(this.scroller, var3, new Scroller.TargetAlignment.Top(0), var2, new Function0(this) {
            final EmojiPickerScroller this$0;

            {
               super(0);
               this.this$0 = var1;
            }

            public final void invoke() {
               EmojiPickerScroller.access$setScrollVelocityTrackingPaused$p(this.this$0, false);
            }
         }, null, null, 48, null);
      }
   }

   public fun setScrollFastVelocity(scrollFastVelocity: Int) {
      if (this.scrollFastVelocity != var1) {
         this.scrollFastVelocity = var1;
      }
   }

   public fun unbind() {
      this.recyclerView.removeOnLayoutChangeListener(this.scrollViewLayoutChanged);
      val var2: RecyclerView = this.recyclerView;
      val var1: <unrepresentable> = this.scrollListenerDebounced;
      this.scrollListenerDebounced.cancel();
      var2.removeOnScrollListener(var1);
      this.recyclerView.removeOnScrollListener(this.scrollListenerVelocityTracker);
      this.recyclerView.setOnFlingListener(null);
   }

   public companion object {
      private const val SCROLL_DEBOUNCE_TIME: Long
      private const val SCROLL_VELOCITY_DEBOUNCE_TIME: Long
   }

   public data class ScrollEvent(x: Int = 0, y: Int = 0, width: Int = 0, height: Int = 0, contentWidth: Int = 0, contentHeight: Int = 0) {
      public final var contentHeight: Int
         internal set

      public final var contentWidth: Int
         internal set

      public final var height: Int
         internal set

      public final var width: Int
         internal set

      public final var x: Int
         internal set

      public final var y: Int
         internal set

      fun ScrollEvent() {
         this(0, 0, 0, 0, 0, 0, 63, null);
      }

      init {
         this.x = var1;
         this.y = var2;
         this.width = var3;
         this.height = var4;
         this.contentWidth = var5;
         this.contentHeight = var6;
      }

      public operator fun component1(): Int {
         return this.x;
      }

      public operator fun component2(): Int {
         return this.y;
      }

      public operator fun component3(): Int {
         return this.width;
      }

      public operator fun component4(): Int {
         return this.height;
      }

      public operator fun component5(): Int {
         return this.contentWidth;
      }

      public operator fun component6(): Int {
         return this.contentHeight;
      }

      public fun copy(
         x: Int = var0.x,
         y: Int = var0.y,
         width: Int = var0.width,
         height: Int = var0.height,
         contentWidth: Int = var0.contentWidth,
         contentHeight: Int = var0.contentHeight
      ): com.discord.emoji_picker.EmojiPickerScroller.ScrollEvent {
         return new EmojiPickerScroller.ScrollEvent(var1, var2, var3, var4, var5, var6);
      }

      public override operator fun equals(other: Any?): Boolean {
         if (this === var1) {
            return true;
         } else if (var1 !is EmojiPickerScroller.ScrollEvent) {
            return false;
         } else {
            var1 = var1;
            if (this.x != var1.x) {
               return false;
            } else if (this.y != var1.y) {
               return false;
            } else if (this.width != var1.width) {
               return false;
            } else if (this.height != var1.height) {
               return false;
            } else if (this.contentWidth != var1.contentWidth) {
               return false;
            } else {
               return this.contentHeight == var1.contentHeight;
            }
         }
      }

      public override fun hashCode(): Int {
         return (
                  (((Integer.hashCode(this.x) * 31 + Integer.hashCode(this.y)) * 31 + Integer.hashCode(this.width)) * 31 + Integer.hashCode(this.height)) * 31
                     + Integer.hashCode(this.contentWidth)
               )
               * 31
            + Integer.hashCode(this.contentHeight);
      }

      public override fun toString(): String {
         val var5: Int = this.x;
         val var2: Int = this.y;
         val var1: Int = this.width;
         val var3: Int = this.height;
         val var4: Int = this.contentWidth;
         val var6: Int = this.contentHeight;
         val var7: StringBuilder = new StringBuilder();
         var7.append("ScrollEvent(x=");
         var7.append(var5);
         var7.append(", y=");
         var7.append(var2);
         var7.append(", width=");
         var7.append(var1);
         var7.append(", height=");
         var7.append(var3);
         var7.append(", contentWidth=");
         var7.append(var4);
         var7.append(", contentHeight=");
         var7.append(var6);
         var7.append(")");
         return var7.toString();
      }
   }
}

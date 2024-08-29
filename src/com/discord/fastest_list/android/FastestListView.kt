package com.discord.fastest_list.android

import android.annotation.SuppressLint
import android.content.Context
import android.view.View
import android.view.View.OnLayoutChangeListener
import androidx.appcompat.view.ContextThemeWrapper
import androidx.recyclerview.widget.RecyclerView
import com.discord.fastest_list.R
import com.discord.fastest_list.android.FastestListSections.Entry
import com.discord.fastest_list.android.FastestListSections.Versioned
import com.discord.fastest_list.android.FastestListViewAdapter.DataChanged
import com.discord.fastest_list.android.FastestListVisibleItemsTracker.RenderAhead
import com.discord.fastest_list.android.placeholder.FastestListPlaceholderConfig
import com.discord.fastest_list.android.scroll.FastestListScrollListener
import com.discord.fastest_list.android.scroll.FastestListScrollOffset
import com.discord.fastest_list.android.scroll.FastestListScrollOffset.Data
import com.discord.misc.utilities.measure.ViewMeasureExtensionsKt
import com.discord.recycler_view.scroll.RecyclerViewScrollLimiter
import com.discord.recycler_view.scroller.Scroller
import com.discord.recycler_view.scroller.Scroller.TargetAlignment.Top
import com.discord.recycler_view.utils.RecyclerViewExtensionsKt
import kotlin.jvm.functions.Function1
import kotlin.jvm.functions.Function2
import kotlin.jvm.functions.Function3
import kotlin.jvm.functions.Function5
import kotlin.jvm.functions.Function6
import kotlin.jvm.internal.q

@SuppressLint(["ViewConstructor"])
internal class FastestListView(context: Context,
      horizontal: Boolean,
      insetEnd: Int,
      insetStart: Int,
      keyboardDismissOnDrag: Boolean,
      onLayout: (FastestListView, Int, Int, Int, Int) -> Unit,
      onScrollEventThrottle: Long,
      onScroll: (FastestListView, Data) -> Unit,
      onScrollBeginDrag: (FastestListView, Data) -> Unit,
      onScrollEndDrag: (FastestListView, Data) -> Unit,
      onUnexpectedItemSize: (FastestListView, Entry, Int) -> Unit,
      onVisibleItemsChanged: (FastestListView, String, Int, Int, Int, Int) -> Unit,
      placeholderConfig: FastestListPlaceholderConfig,
      renderAhead: RenderAhead,
      sectionsVersioned: Versioned,
      showsHorizontalScrollIndicator: Boolean,
      showsVerticalScrollIndicator: Boolean
   )
   : RecyclerView {
   private final val insetDecorator: FastestListInsetDecorator
   private final val sections: FastestListSections
   private final val typedLayoutManager: FastestListLayoutManager
   private final val typedVisibleItemsTracker: FastestListVisibleItemsTracker
   private final val typedAdapter: FastestListViewAdapter
   private final val scroller: Scroller
   private final val scrollOffset: FastestListScrollOffset
   private final val onScrollListener: FastestListScrollListener
   private final val onLayoutChangeListener: OnLayoutChangeListener

   init {
      q.h(var1, "context");
      q.h(var6, "onLayout");
      q.h(var9, "onScroll");
      q.h(var10, "onScrollBeginDrag");
      q.h(var11, "onScrollEndDrag");
      q.h(var12, "onUnexpectedItemSize");
      q.h(var13, "onVisibleItemsChanged");
      q.h(var14, "placeholderConfig");
      q.h(var15, "renderAhead");
      q.h(var16, "sectionsVersioned");
      super(FastestListView.Companion.access$withThemeWrapper(Companion, var1, var2));
      val var19: FastestListInsetDecorator = new FastestListInsetDecorator(var2, var3, var4);
      this.insetDecorator = var19;
      val var25: FastestListSections = new FastestListSections(var16);
      this.sections = var25;
      val var20: FastestListLayoutManager = new FastestListLayoutManager(var15, var1, var2, false, 8, null);
      this.typedLayoutManager = var20;
      val var24: FastestListVisibleItemsTracker = new FastestListVisibleItemsTracker(var20, var25, new Function5(var13, this) {
         final Function6 $onVisibleItemsChanged;
         final FastestListView this$0;

         {
            super(5);
            this.$onVisibleItemsChanged = var1;
            this.this$0 = var2;
         }

         public final void invoke(java.lang.String var1, int var2, int var3, int var4, int var5) {
            q.h(var1, "sectionsId");
            this.$onVisibleItemsChanged.invoke(this.this$0, var1, var2, var3, var4, var5);
         }
      });
      this.typedVisibleItemsTracker = var24;
      val var23: FastestListViewAdapter = new FastestListViewAdapter(var20, var14, var25, new Function2(var12, this) {
         final Function3 $onUnexpectedItemSize;
         final FastestListView this$0;

         {
            super(2);
            this.$onUnexpectedItemSize = var1;
            this.this$0 = var2;
         }

         public final void invoke(FastestListSections.Entry var1, int var2) {
            q.h(var1, "entry");
            this.$onUnexpectedItemSize.invoke(this.this$0, var1, var2);
         }
      });
      this.typedAdapter = var23;
      this.scroller = new Scroller(this);
      this.scrollOffset = new FastestListScrollOffset(var20, var25);
      val var22: FastestListScrollListener = new FastestListScrollListener(var5, var7, new Function3(this, var9) {
         final Function2 $onScroll;
         final FastestListView this$0;

         {
            super(3);
            this.this$0 = var1;
            this.$onScroll = var2;
         }

         public final void invoke(RecyclerView var1, int var2, int var3) {
            q.h(var1, "<anonymous parameter 0>");
            val var4: FastestListScrollOffset.Data = FastestListView.access$getScrollOffset$p(this.this$0).compute();
            if (var4 != null) {
               this.$onScroll.invoke(this.this$0, var4);
            }
         }
      }, new Function1(this, var10, var11) {
         final Function2 $onScrollBeginDrag;
         final Function2 $onScrollEndDrag;
         final FastestListView this$0;

         {
            super(1);
            this.this$0 = var1;
            this.$onScrollBeginDrag = var2;
            this.$onScrollEndDrag = var3;
         }

         public final void invoke(boolean var1) {
            val var2: FastestListScrollOffset.Data = FastestListView.access$getScrollOffset$p(this.this$0).compute();
            if (var2 != null) {
               if (var1) {
                  this.$onScrollBeginDrag.invoke(this.this$0, var2);
               } else {
                  this.$onScrollEndDrag.invoke(this.this$0, var2);
               }
            }
         }
      }, var20, var24);
      this.onScrollListener = var22;
      val var21: com.discord.fastest_list.android.a = new com.discord.fastest_list.android.a(this, var6);
      this.onLayoutChangeListener = var21;
      this.setHasFixedSize(true);
      RecyclerViewExtensionsKt.setReactNativeClipToPadding(this);
      this.setItemAnimator(null);
      this.setLayoutManager(var20);
      this.setAdapter(var23);
      this.setHorizontalScrollBarEnabled(var17);
      this.setVerticalScrollBarEnabled(var18);
      this.getRecycledViewPool().setMaxRecycledViews(0, 50);
      this.addItemDecoration(var19);
      this.addOnScrollListener(var22);
      this.addOnLayoutChangeListener(var21);
   }

   @SuppressLint(["NotifyDataSetChanged"])
   private fun onItemDataChanged(positions: List<DataChanged> = i.j()) {
      if (var1.isEmpty() xor true) {
         for (FastestListViewAdapter.DataChanged var4 : var1) {
            val var3: Int = var4.component1();
            val var2: Int = var4.component2();
            if (var2 == 1) {
               this.typedAdapter.notifyItemChanged(var3);
            } else {
               this.typedAdapter.notifyItemRangeChanged(var3, var2);
            }
         }
      } else {
         this.typedAdapter.notifyDataSetChanged();
      }

      ViewMeasureExtensionsKt.measureAndLayout(this);
   }

   @JvmStatic
   fun `onLayoutChangeListener$lambda$0`(
      var0: FastestListView, var1: Function5, var2: View, var3: Int, var4: Int, var5: Int, var6: Int, var7: Int, var8: Int, var9: Int, var10: Int
   ) {
      q.h(var0, "this$0");
      q.h(var1, "$onLayout");
      var5 = var5 - var3;
      var6 = var6 - var4;
      if ((!var0.typedLayoutManager.getHorizontal() || var5 != 0) && (var0.typedLayoutManager.getHorizontal() || var6 - var4 != 0)) {
         var1.invoke(var0, var3, var4, var5, var6);
         var0.typedVisibleItemsTracker.updateVisibleItemPositions();
      }
   }

   private fun scrollTo(position: Int, animated: Boolean) {
      Scroller.scrollToPosition$default(this.scroller, var1, new Top(0), var2, null, null, null, 56, null);
      ViewMeasureExtensionsKt.measureAndLayout(this);
   }

   public override fun fling(velocityX: Int, velocityY: Int): Boolean {
      val var3: RecyclerViewScrollLimiter = RecyclerViewScrollLimiter.INSTANCE;
      return super.fling(RecyclerViewScrollLimiter.INSTANCE.getClampedVelocity(var1), var3.getClampedVelocity(var2));
   }

   public fun onDrop() {
      this.removeItemDecoration(this.insetDecorator);
      this.removeOnScrollListener(this.onScrollListener);
      this.removeOnLayoutChangeListener(this.onLayoutChangeListener);
   }

   public override fun scrollTo(x: Int, y: Int) {
      val var3: FastestListSections = this.sections;
      if (!this.typedLayoutManager.getHorizontal()) {
         var1 = var2;
      }

      this.scrollToPosition(var3.getItemPosition(var1));
      ViewMeasureExtensionsKt.measureAndLayout(this);
   }

   public fun scrollTo(section: Int, item: Int, animated: Boolean) {
      val var4: Int = this.sections
         .getItemPosition-jEcWkE0(FastestListSections.Section.constructor-impl(var1), FastestListSections.Item.constructor-impl(var2));
      if (var4 != null) {
         this.scrollTo(var4, var3);
      }
   }

   public fun scrollToTop(animated: Boolean) {
      this.scrollTo(0, var1);
   }

   public fun setHorizontal(horizontal: Boolean) {
      if (this.typedLayoutManager.getHorizontal() != var1) {
         this.typedLayoutManager.setHorizontal(var1);
         this.insetDecorator.setHorizontal(var1);
         onItemDataChanged$default(this, null, 1, null);
      }
   }

   public fun setInsetEnd(insetEnd: Int) {
      if (this.insetDecorator.getInsetEnd() != var1) {
         this.insetDecorator.setInsetEnd(var1);
         onItemDataChanged$default(this, null, 1, null);
      }
   }

   public fun setInsetStart(insetStart: Int) {
      if (this.insetDecorator.getInsetStart() != var1) {
         this.insetDecorator.setInsetStart(var1);
         onItemDataChanged$default(this, null, 1, null);
      }
   }

   public fun setKeyboardDismissOnDrag(keyboardDismissOnDrag: Boolean) {
      this.onScrollListener.setKeyboardDismissOnDrag(var1);
   }

   public open fun setPadding(left: Int, top: Int, right: Int, bottom: Int) {
      var var5: Int = var2;
      if (var5.intValue() == 0) {
         var5 = null;
      }

      if (var5 != null) {
         var2 = var5;
      } else {
         var2 = -1;
      }

      super.setPadding(var1, var2, var3, var4);
   }

   public fun setPlaceholderConfig(placeholderConfig: FastestListPlaceholderConfig) {
      q.h(var1, "placeholderConfig");
      if (this.typedAdapter.setPlaceholderConfig(var1)) {
         onItemDataChanged$default(this, null, 1, null);
      }
   }

   public fun setRenderAhead(renderAhead: RenderAhead) {
      q.h(var1, "renderAhead");
      if (this.typedLayoutManager.getRenderAhead() != var1) {
         this.typedLayoutManager.setRenderAhead(var1);
         onItemDataChanged$default(this, null, 1, null);
      }
   }

   public fun setSectionsVersioned(sectionsVersioned: Versioned) {
      q.h(var1, "sectionsVersioned");
      if (this.sections.setSectionsVersioned(var1)) {
         onItemDataChanged$default(this, null, 1, null);
      }
   }

   public fun setShowsHorizontalScrollIndicator(showsHorizontalScrollIndicator: Boolean) {
      if (this.isHorizontalScrollBarEnabled() != var1) {
         this.setHorizontalScrollBarEnabled(var1);
      }
   }

   public fun setShowsVerticalScrollIndicator(showsVerticalScrollIndicator: Boolean) {
      if (this.isVerticalScrollBarEnabled() != var1) {
         this.setVerticalScrollBarEnabled(var1);
      }
   }

   public companion object {
      private fun Context.withThemeWrapper(horizontal: Boolean): ContextThemeWrapper {
         val var3: Int;
         if (var2) {
            var3 = R.style.fastest_list_horizontal;
         } else {
            var3 = R.style.fastest_list;
         }

         return new ContextThemeWrapper(var1, var3);
      }
   }
}

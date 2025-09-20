package com.discord.emoji_picker

import android.annotation.SuppressLint
import android.content.Context
import android.view.View
import androidx.core.view.f0
import androidx.recyclerview.widget.RecyclerView
import com.discord.crash_reporting.CrashReporting
import com.discord.emoji_picker.EmojiPickerItem.ItemType
import com.discord.emoji_picker.EmojiPickerItemData.CoreData
import com.discord.emoji_picker.EmojiPickerScroller.ScrollEvent
import com.discord.misc.utilities.measure.ViewMeasureExtensionsKt
import com.discord.misc.utilities.size.SizeUtilsKt
import com.discord.recycler_view.scroll.RecyclerViewScrollLimiter
import com.discord.recycler_view.utils.RecyclerViewExtensionsKt
import kotlin.jvm.functions.Function2
import kotlin.jvm.functions.Function3

@SuppressLint(["ViewConstructor"])
internal class EmojiPickerView(context: Context,
      emojiSizeDp: Int,
      emojiMarginDp: Int,
      coreData: CoreData,
      onPressEmoji: (View, Long?, String) -> Unit,
      onScroll: (EmojiPickerView, ScrollEvent) -> Unit,
      onScrollBeginDrag: (EmojiPickerView, ScrollEvent) -> Unit,
      onScrollEndDrag: (EmojiPickerView, ScrollEvent) -> Unit,
      onLongPressEmoji: (View, Long?, String) -> Unit,
      onStickyHeaderRender: (View, Int) -> Unit,
      onShowNitroUpsell: (View, Boolean) -> Unit,
      useTier0UpsellContent: Boolean,
      config: com.discord.emoji_picker.EmojiPickerView.Config
   ) : RecyclerView(var1),
   EmojiPickerCache.Listener {
   private final val visibilityTracker: EmojiPickerVisibilityTracker
      private final get() {
         return this.visibilityTracker$delegate.getValue() as EmojiPickerVisibilityTracker;
      }


   private final val scroller: EmojiPickerScroller
      private final get() {
         return this.scroller$delegate.getValue() as EmojiPickerScroller;
      }


   private final val premiumUpsellGradientDecoration: EmojiPickerPremiumUpsellGradientBackground
   private final var isInViewTransition: Boolean

   private final val typedAdapter: EmojiPickerViewAdapter
      private final get() {
         val var1: RecyclerView.Adapter = this.getAdapter();
         return var1 as EmojiPickerViewAdapter;
      }


   private final val typedLayoutManager: EmojiPickerLayoutManager
      private final get() {
         val var1: RecyclerView.LayoutManager = this.getLayoutManager();
         return var1 as EmojiPickerLayoutManager;
      }


   init {
      this.visibilityTracker$delegate = A9.j.b(new o(var11, this));
      this.scroller$delegate = A9.j.b(new p(this, var13, var10, var6, var7, var8));
      this.premiumUpsellGradientDecoration = new EmojiPickerPremiumUpsellGradientBackground(var1, var12);
      this.setHasFixedSize(true);
      RecyclerViewExtensionsKt.setReactNativeClipToPadding(this);
      this.setItemAnimator(null);
      this.setLayoutManager(new EmojiPickerLayoutManager(var1, var4.getRowSize(), new q(this)));
      this.setAdapter(
         new EmojiPickerViewAdapter(
            var4, SizeUtilsKt.getDpToPx(var2), SizeUtilsKt.getDpToPx(var3), new r(this), new s(var5, this), new t(var9, this), var12, var13
         )
      );
      this.getScroller().bind();
      this.configurePremiumUpsellGradientDecorator(var4.getHasPremiumInlineRoadblock());
      this.configureRecycledViewPool();
      this.getVisibilityTracker().setTrackingEnabled(var4.getHasPremiumInlineRoadblock());
   }

   @JvmStatic
   fun `_init_$lambda$6`(var0: EmojiPickerView, var1: Int): Int {
      return var0.getSpanSize(var0.getTypedAdapter().getItem(var1));
   }

   @JvmStatic
   fun `_init_$lambda$7`(var0: EmojiPickerView, var1: Int, var2: Int): Unit {
      var0.onItemsChanged(var1, var2);
      return Unit.a;
   }

   @JvmStatic
   fun `_init_$lambda$8`(var0: Function3, var1: EmojiPickerView, var2: java.lang.Long, var3: java.lang.String): Unit {
      var0.invoke(var1, var2, var3);
      return Unit.a;
   }

   @JvmStatic
   fun `_init_$lambda$9`(var0: Function3, var1: EmojiPickerView, var2: java.lang.Long, var3: java.lang.String): Unit {
      var0.invoke(var1, var2, var3);
      return Unit.a;
   }

   private fun configureMountedChild(view: View) {
      val var2: RecyclerView.ViewHolder = this.getChildViewHolder(var1);
      if (var2 is EmojiPickerViewHolder.Emoji) {
         (var2 as EmojiPickerViewHolder.Emoji).updateImage(this.getTypedAdapter().getScrolling(), this.getTypedAdapter().getScrollingFast());
      }
   }

   private fun configureMountedChildren() {
      val var1: java.util.Iterator = f0.a(this).iterator();

      while (var1.hasNext()) {
         this.configureMountedChild(var1.next() as View);
      }
   }

   private fun configurePremiumUpsellGradientDecorator(hasPremiumInlineRoadblock: Boolean) {
      this.premiumUpsellGradientDecoration.setEnabled(var1, this);
   }

   private fun configureRecycledViewPool() {
      val var1: Int = this.getTypedLayoutManager().getSpanCount() * 20;
      val var2: Int = this.getTypedLayoutManager().getSpanCount();
      this.setItemViewCacheSize(var1 / 4);
      this.getRecycledViewPool().setMaxRecycledViews(EmojiPickerItem.ItemType.EMOJI.ordinal(), var1);
      this.getRecycledViewPool().setMaxRecycledViews(EmojiPickerItem.ItemType.CATEGORY.ordinal(), var2);
      this.getRecycledViewPool().setMaxRecycledViews(EmojiPickerItem.ItemType.FOOTER_UPSELL.ordinal(), 1);
   }

   private fun EmojiPickerItem.getSpanSize(): Int {
      val var2: Int;
      if (var1 !is EmojiPickerItem.EmojiPlaceholder && var1 !is EmojiPickerItem.Emoji) {
         if (var1 !is EmojiPickerItem.Category
            && var1 !is EmojiPickerItem.Spacer
            && var1 !is EmojiPickerItem.FooterUpsell
            && var1 !is EmojiPickerItem.PremiumInlineRoadblockHeader
            && var1 !is EmojiPickerItem.PremiumInlineRoadblockFooter) {
            throw new A9.n();
         }

         var2 = this.getTypedLayoutManager().getSpanCount();
      } else {
         var2 = 1;
      }

      return var2;
   }

   @SuppressLint(["NotifyDataSetChanged"])
   private fun onItemsChanged(position: Int?, count: Int?) {
      val var3: Boolean = this.isComputingLayout();
      val var5: java.lang.String;
      if (var1 != null) {
         if (var2 != null) {
            this.getTypedAdapter().notifyItemRangeChanged(var1, var2);
            var5 = "rangeChanged";
         } else {
            this.getTypedAdapter().notifyItemChanged(var1);
            var5 = "itemChanged";
         }
      } else {
         this.getTypedAdapter().notifyDataSetChanged();
         var5 = "setChanged";
      }

      try {
         ViewMeasureExtensionsKt.measureAndLayout(this);
      } catch (var15: Exception) {
         var var8: Pair;
         var var9: Pair;
         var var10: Pair;
         var var11: Pair;
         var var12: Pair;
         var var13: CrashReporting;
         var var14: Pair;
         label31: {
            var13 = CrashReporting.INSTANCE;
            var11 = A9.s.a("isInViewTransition", java.lang.String.valueOf(this.isInViewTransition));
            var8 = A9.s.a("isAttached", java.lang.String.valueOf(this.isAttachedToWindow()));
            var12 = A9.s.a("wasComputingLayoutBeforeAdapter", java.lang.String.valueOf(var3));
            var10 = A9.s.a("isComputingLayoutAfterAdapter", java.lang.String.valueOf(this.isComputingLayout()));
            var9 = A9.s.a("isComputingLayoutNow", java.lang.String.valueOf(this.isComputingLayout()));
            var14 = A9.s.a("adapterTypeChange", var5);
            if (var1 != null) {
               val var6: java.lang.String = var1.toString();
               var16 = var6;
               if (var6 != null) {
                  break label31;
               }
            }

            var16 = "null";
         }

         val var19: Pair = A9.s.a("position", var16);
         var var17: java.lang.String = "null";
         if (var2 != null) {
            var17 = var2.toString();
            if (var17 == null) {
               var17 = "null";
            }
         }

         CrashReporting.addBreadcrumb$default(
            var13,
            "About to crash from EmojiPickerView.",
            L.l(new Pair[]{var11, var8, var12, var10, var9, var14, var19, A9.s.a("count", var17)}),
            null,
            null,
            12,
            null
         );
         throw var15;
      }
   }

   @JvmStatic
   fun `scroller_delegate$lambda$5`(var0: EmojiPickerView, var1: EmojiPickerView.Config, var2: Function2, var3: Function2, var4: Function2, var5: Function2): EmojiPickerScroller {
      return new EmojiPickerScroller(
         var0,
         var0.getTypedAdapter(),
         var0.getTypedLayoutManager(),
         var1.getScrollFastVelocity(),
         new u(var3, var0),
         new v(var0),
         new w(var4, var0, var5),
         var2
      );
   }

   @JvmStatic
   fun `scroller_delegate$lambda$5$lambda$2`(var0: Function2, var1: EmojiPickerView, var2: EmojiPickerScroller.ScrollEvent): Unit {
      var0.invoke(var1, var2);
      return Unit.a;
   }

   @JvmStatic
   fun `scroller_delegate$lambda$5$lambda$3`(var0: EmojiPickerView): Unit {
      var0.configureMountedChildren();
      return Unit.a;
   }

   @JvmStatic
   fun `scroller_delegate$lambda$5$lambda$4`(var0: Function2, var1: EmojiPickerView, var2: Function2, var3: EmojiPickerScroller.ScrollEvent, var4: Boolean): Unit {
      if (var4) {
         var0.invoke(var1, var3);
      } else {
         var2.invoke(var1, var3);
      }

      return Unit.a;
   }

   @JvmStatic
   fun `visibilityTracker_delegate$lambda$1`(var0: Function2, var1: EmojiPickerView): EmojiPickerVisibilityTracker {
      return new EmojiPickerVisibilityTracker(new n(var0, var1));
   }

   @JvmStatic
   fun `visibilityTracker_delegate$lambda$1$lambda$0`(var0: Function2, var1: EmojiPickerView, var2: Boolean): Unit {
      var0.invoke(var1, var2);
      return Unit.a;
   }

   public open fun endViewTransition(view: View?) {
      super.endViewTransition(var1);
      this.getTypedLayoutManager().disableRecycling(false);
      this.isInViewTransition = false;
   }

   public override fun fling(velocityX: Int, velocityY: Int): Boolean {
      val var3: RecyclerViewScrollLimiter = RecyclerViewScrollLimiter.INSTANCE;
      return super.fling(RecyclerViewScrollLimiter.INSTANCE.getClampedVelocity(var1), var3.getClampedVelocity(var2));
   }

   public override fun onChildAttachedToWindow(child: View) {
      super.onChildAttachedToWindow(var1);
      this.getVisibilityTracker().trackViewVisibilityChanged(this, var1, true);
      this.configureMountedChild(var1);
   }

   public override fun onChildDetachedFromWindow(child: View) {
      super.onChildDetachedFromWindow(var1);
      this.getVisibilityTracker().trackViewVisibilityChanged(this, var1, false);
   }

   public override fun onContext(): Context {
      val var1: Context = this.getContext();
      return var1;
   }

   public fun onDestroy() {
      this.getScroller().unbind();
   }

   public override fun onEmojisUpdated(emojis: List<EmojiPickerItem>, emojisUnicode: List<EmojiPickerItem>) {
      this.getTypedAdapter().setEmojis(var1, var2);
   }

   public fun scrollToItemAtIndex(index: Int, animated: Boolean, itemType: ItemType) {
      this.getScroller().scrollToItemAtIndex(var1, var2, var3.ordinal());
   }

   public fun scrollingEnabled(enabled: Boolean) {
      this.getTypedLayoutManager().setScrollingEnabled(var1);
   }

   public fun setConfig(config: com.discord.emoji_picker.EmojiPickerView.Config) {
      this.getTypedAdapter().setConfig(var1);
      this.getScroller().setScrollFastVelocity(var1.getScrollFastVelocity());
   }

   public fun setContentPaddingBottom(contentPaddingBottomDp: Float) {
      this.getTypedAdapter().setSpacerBottomHeight(SizeUtilsKt.getDpToPx(var1));
   }

   public fun setContentPaddingTop(contentPaddingTopDp: Float) {
      this.getTypedAdapter().setSpacerTopHeight(SizeUtilsKt.getDpToPx(var1));
   }

   public fun setCoreData(coreData: CoreData) {
      this.getTypedAdapter().setCoreData(var1);
      this.getTypedLayoutManager().setSpanCount(var1.getRowSize());
      this.getVisibilityTracker().setTrackingEnabled(var1.getHasPremiumInlineRoadblock());
      this.configurePremiumUpsellGradientDecorator(var1.getHasPremiumInlineRoadblock());
      this.configureRecycledViewPool();
   }

   public fun setEmojiMargin(emojiMarginDp: Int) {
      this.getTypedAdapter().setEmojiMargin(SizeUtilsKt.getDpToPx(var1));
   }

   public fun setEmojiSize(emojiSizeDp: Int) {
      this.getTypedAdapter().setEmojiSize(SizeUtilsKt.getDpToPx(var1));
   }

   public fun setUseTier0UpsellContent(useTier0UpsellContent: Boolean) {
      this.getTypedAdapter().setUseTier0UpsellContent(var1);
      val var3: EmojiPickerPremiumUpsellGradientBackground = this.premiumUpsellGradientDecoration;
      val var2: Context = this.getContext();
      var3.setUseTier0UpsellContent(var2, var1);
   }

   public open fun startViewTransition(view: View?) {
      this.isInViewTransition = true;
      this.getTypedLayoutManager().disableRecycling(true);
      super.startViewTransition(var1);
   }

   public data class Config(animateEmoji: Boolean, scrollFastOptimizationEnabled: Boolean, scrollFastVelocity: Int, disableAnimationsOnScroll: Boolean) {
      public final val animateEmoji: Boolean
      public final val scrollFastOptimizationEnabled: Boolean
      public final val scrollFastVelocity: Int
      public final val disableAnimationsOnScroll: Boolean

      init {
         this.animateEmoji = var1;
         this.scrollFastOptimizationEnabled = var2;
         this.scrollFastVelocity = var3;
         this.disableAnimationsOnScroll = var4;
      }

      public operator fun component1(): Boolean {
         return this.animateEmoji;
      }

      public operator fun component2(): Boolean {
         return this.scrollFastOptimizationEnabled;
      }

      public operator fun component3(): Int {
         return this.scrollFastVelocity;
      }

      public operator fun component4(): Boolean {
         return this.disableAnimationsOnScroll;
      }

      public fun copy(
         animateEmoji: Boolean = var0.animateEmoji,
         scrollFastOptimizationEnabled: Boolean = var0.scrollFastOptimizationEnabled,
         scrollFastVelocity: Int = var0.scrollFastVelocity,
         disableAnimationsOnScroll: Boolean = var0.disableAnimationsOnScroll
      ): com.discord.emoji_picker.EmojiPickerView.Config {
         return new EmojiPickerView.Config(var1, var2, var3, var4);
      }

      public override operator fun equals(other: Any?): Boolean {
         if (this === var1) {
            return true;
         } else if (var1 !is EmojiPickerView.Config) {
            return false;
         } else {
            var1 = var1;
            if (this.animateEmoji != var1.animateEmoji) {
               return false;
            } else if (this.scrollFastOptimizationEnabled != var1.scrollFastOptimizationEnabled) {
               return false;
            } else if (this.scrollFastVelocity != var1.scrollFastVelocity) {
               return false;
            } else {
               return this.disableAnimationsOnScroll == var1.disableAnimationsOnScroll;
            }
         }
      }

      public override fun hashCode(): Int {
         return (
                  (java.lang.Boolean.hashCode(this.animateEmoji) * 31 + java.lang.Boolean.hashCode(this.scrollFastOptimizationEnabled)) * 31
                     + Integer.hashCode(this.scrollFastVelocity)
               )
               * 31
            + java.lang.Boolean.hashCode(this.disableAnimationsOnScroll);
      }

      public override fun toString(): String {
         val var2: Boolean = this.animateEmoji;
         val var4: Boolean = this.scrollFastOptimizationEnabled;
         val var1: Int = this.scrollFastVelocity;
         val var3: Boolean = this.disableAnimationsOnScroll;
         val var5: StringBuilder = new StringBuilder();
         var5.append("Config(animateEmoji=");
         var5.append(var2);
         var5.append(", scrollFastOptimizationEnabled=");
         var5.append(var4);
         var5.append(", scrollFastVelocity=");
         var5.append(var1);
         var5.append(", disableAnimationsOnScroll=");
         var5.append(var3);
         var5.append(")");
         return var5.toString();
      }

      public companion object
   }
}

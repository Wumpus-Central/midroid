package com.discord.emoji_picker

import android.annotation.SuppressLint
import android.content.Context
import android.view.View
import androidx.core.view.f0
import androidx.recyclerview.widget.RecyclerView
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
   )
   : RecyclerView,
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

   private final val typedAdapter: EmojiPickerViewAdapter
      private final get() {
         val var1: RecyclerView.Adapter = this.getAdapter();
         kotlin.jvm.internal.r.f(var1, "null cannot be cast to non-null type com.discord.emoji_picker.EmojiPickerViewAdapter");
         return var1 as EmojiPickerViewAdapter;
      }


   private final val typedLayoutManager: EmojiPickerLayoutManager
      private final get() {
         val var1: RecyclerView.LayoutManager = this.getLayoutManager();
         kotlin.jvm.internal.r.f(var1, "null cannot be cast to non-null type com.discord.emoji_picker.EmojiPickerLayoutManager");
         return var1 as EmojiPickerLayoutManager;
      }


   init {
      kotlin.jvm.internal.r.h(var1, "context");
      kotlin.jvm.internal.r.h(var4, "coreData");
      kotlin.jvm.internal.r.h(var5, "onPressEmoji");
      kotlin.jvm.internal.r.h(var6, "onScroll");
      kotlin.jvm.internal.r.h(var7, "onScrollBeginDrag");
      kotlin.jvm.internal.r.h(var8, "onScrollEndDrag");
      kotlin.jvm.internal.r.h(var9, "onLongPressEmoji");
      kotlin.jvm.internal.r.h(var10, "onStickyHeaderRender");
      kotlin.jvm.internal.r.h(var11, "onShowNitroUpsell");
      kotlin.jvm.internal.r.h(var13, "config");
      super(var1);
      this.visibilityTracker$delegate = z9.j.a(new o(var11, this));
      this.scroller$delegate = z9.j.a(new p(this, var13, var10, var6, var7, var8));
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
      kotlin.jvm.internal.r.h(var3, "emojiName");
      var0.invoke(var1, var2, var3);
      return Unit.a;
   }

   @JvmStatic
   fun `_init_$lambda$9`(var0: Function3, var1: EmojiPickerView, var2: java.lang.Long, var3: java.lang.String): Unit {
      kotlin.jvm.internal.r.h(var3, "emojiName");
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
            throw new z9.n();
         }

         var2 = this.getTypedLayoutManager().getSpanCount();
      } else {
         var2 = 1;
      }

      return var2;
   }

   @SuppressLint(["NotifyDataSetChanged"])
   private fun onItemsChanged(position: Int?, count: Int?) {
      if (var1 != null) {
         if (var2 != null) {
            this.getTypedAdapter().notifyItemRangeChanged(var1, var2);
         } else {
            this.getTypedAdapter().notifyItemChanged(var1);
         }
      } else {
         this.getTypedAdapter().notifyDataSetChanged();
      }

      ViewMeasureExtensionsKt.measureAndLayout(this);
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
      kotlin.jvm.internal.r.h(var2, "scrollEvent");
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
      kotlin.jvm.internal.r.h(var3, "scrollEvent");
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

   public override fun fling(velocityX: Int, velocityY: Int): Boolean {
      val var3: RecyclerViewScrollLimiter = RecyclerViewScrollLimiter.INSTANCE;
      return super.fling(RecyclerViewScrollLimiter.INSTANCE.getClampedVelocity(var1), var3.getClampedVelocity(var2));
   }

   public override fun onChildAttachedToWindow(child: View) {
      kotlin.jvm.internal.r.h(var1, "child");
      super.onChildAttachedToWindow(var1);
      this.getVisibilityTracker().trackViewVisibilityChanged(this, var1, true);
      this.configureMountedChild(var1);
   }

   public override fun onChildDetachedFromWindow(child: View) {
      kotlin.jvm.internal.r.h(var1, "child");
      super.onChildDetachedFromWindow(var1);
      this.getVisibilityTracker().trackViewVisibilityChanged(this, var1, false);
   }

   public override fun onContext(): Context {
      val var1: Context = this.getContext();
      kotlin.jvm.internal.r.g(var1, "getContext(...)");
      return var1;
   }

   public fun onDestroy() {
      this.getScroller().unbind();
   }

   public override fun onEmojisUpdated(emojis: List<EmojiPickerItem>, emojisUnicode: List<EmojiPickerItem>) {
      kotlin.jvm.internal.r.h(var1, "emojis");
      kotlin.jvm.internal.r.h(var2, "emojisUnicode");
      this.getTypedAdapter().setEmojis(var1, var2);
   }

   public fun scrollToItemAtIndex(index: Int, animated: Boolean, itemType: ItemType) {
      kotlin.jvm.internal.r.h(var3, "itemType");
      this.getScroller().scrollToItemAtIndex(var1, var2, var3.ordinal());
   }

   public fun scrollingEnabled(enabled: Boolean) {
      this.getTypedLayoutManager().setScrollingEnabled(var1);
   }

   public fun setConfig(config: com.discord.emoji_picker.EmojiPickerView.Config) {
      kotlin.jvm.internal.r.h(var1, "config");
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
      kotlin.jvm.internal.r.h(var1, "coreData");
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
      kotlin.jvm.internal.r.g(var2, "getContext(...)");
      var3.setUseTier0UpsellContent(var2, var1);
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
         val var3: Boolean = this.animateEmoji;
         val var2: Boolean = this.scrollFastOptimizationEnabled;
         val var1: Int = this.scrollFastVelocity;
         val var4: Boolean = this.disableAnimationsOnScroll;
         val var5: StringBuilder = new StringBuilder();
         var5.append("Config(animateEmoji=");
         var5.append(var3);
         var5.append(", scrollFastOptimizationEnabled=");
         var5.append(var2);
         var5.append(", scrollFastVelocity=");
         var5.append(var1);
         var5.append(", disableAnimationsOnScroll=");
         var5.append(var4);
         var5.append(")");
         return var5.toString();
      }

      public companion object
   }
}

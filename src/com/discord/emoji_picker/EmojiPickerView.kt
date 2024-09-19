package com.discord.emoji_picker

import android.annotation.SuppressLint
import android.content.Context
import android.view.View
import androidx.core.view.v0
import androidx.recyclerview.widget.RecyclerView
import com.discord.emoji_picker.EmojiPickerItem.ItemType
import com.discord.emoji_picker.EmojiPickerItemData.CoreData
import com.discord.emoji_picker.EmojiPickerScroller.ScrollEvent
import com.discord.misc.utilities.measure.ViewMeasureExtensionsKt
import com.discord.misc.utilities.size.SizeUtilsKt
import com.discord.recycler_view.scroll.RecyclerViewScrollLimiter
import com.discord.recycler_view.utils.RecyclerViewExtensionsKt
import fh.l
import fh.p
import kotlin.jvm.functions.Function0
import kotlin.jvm.functions.Function1
import kotlin.jvm.functions.Function2
import kotlin.jvm.functions.Function3
import kotlin.jvm.internal.q

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
         q.f(var1, "null cannot be cast to non-null type com.discord.emoji_picker.EmojiPickerViewAdapter");
         return var1 as EmojiPickerViewAdapter;
      }


   private final val typedLayoutManager: EmojiPickerLayoutManager
      private final get() {
         val var1: RecyclerView.LayoutManager = this.getLayoutManager();
         q.f(var1, "null cannot be cast to non-null type com.discord.emoji_picker.EmojiPickerLayoutManager");
         return var1 as EmojiPickerLayoutManager;
      }


   init {
      q.h(var1, "context");
      q.h(var4, "coreData");
      q.h(var5, "onPressEmoji");
      q.h(var6, "onScroll");
      q.h(var7, "onScrollBeginDrag");
      q.h(var8, "onScrollEndDrag");
      q.h(var9, "onLongPressEmoji");
      q.h(var10, "onStickyHeaderRender");
      q.h(var11, "onShowNitroUpsell");
      q.h(var13, "config");
      super(var1);
      this.visibilityTracker$delegate = l.b(new Function0(var11, this) {
         final Function2 $onShowNitroUpsell;
         final EmojiPickerView this$0;

         {
            super(0);
            this.$onShowNitroUpsell = var1;
            this.this$0 = var2;
         }

         public final EmojiPickerVisibilityTracker invoke() {
            return new EmojiPickerVisibilityTracker(new Function1(this.$onShowNitroUpsell, this.this$0) {
               final Function2 $onShowNitroUpsell;
               final EmojiPickerView this$0;

               {
                  super(1);
                  this.$onShowNitroUpsell = var1;
                  this.this$0 = var2;
               }

               public final void invoke(boolean var1) {
                  this.$onShowNitroUpsell.invoke(this.this$0, var1);
               }
            });
         }
      });
      this.scroller$delegate = l.b(
         new Function0(this, var13, var10, var6, var7, var8) {
            final EmojiPickerView.Config $config;
            final Function2 $onScroll;
            final Function2 $onScrollBeginDrag;
            final Function2 $onScrollEndDrag;
            final Function2 $onStickyHeaderRender;
            final EmojiPickerView this$0;

            {
               super(0);
               this.this$0 = var1;
               this.$config = var2;
               this.$onStickyHeaderRender = var3;
               this.$onScroll = var4;
               this.$onScrollBeginDrag = var5;
               this.$onScrollEndDrag = var6;
            }

            public final EmojiPickerScroller invoke() {
               return new EmojiPickerScroller(
                  this.this$0,
                  EmojiPickerView.access$getTypedAdapter(this.this$0),
                  EmojiPickerView.access$getTypedLayoutManager(this.this$0),
                  this.$config.getScrollFastVelocity(),
                  new Function1(this.$onScroll, this.this$0) {
                     final Function2 $onScroll;
                     final EmojiPickerView this$0;

                     {
                        super(1);
                        this.$onScroll = var1;
                        this.this$0 = var2;
                     }

                     public final void invoke(EmojiPickerScroller.ScrollEvent var1) {
                        q.h(var1, "scrollEvent");
                        this.$onScroll.invoke(this.this$0, var1);
                     }
                  },
                  new Function0(this.this$0) {
                     final EmojiPickerView this$0;

                     {
                        super(0);
                        this.this$0 = var1;
                     }

                     public final void invoke() {
                        EmojiPickerView.access$configureMountedChildren(this.this$0);
                     }
                  },
                  new Function2(this.$onScrollBeginDrag, this.this$0, this.$onScrollEndDrag) {
                     final Function2 $onScrollBeginDrag;
                     final Function2 $onScrollEndDrag;
                     final EmojiPickerView this$0;

                     {
                        super(2);
                        this.$onScrollBeginDrag = var1;
                        this.this$0 = var2;
                        this.$onScrollEndDrag = var3;
                     }

                     public final void invoke(EmojiPickerScroller.ScrollEvent var1, boolean var2) {
                        q.h(var1, "scrollEvent");
                        if (var2) {
                           this.$onScrollBeginDrag.invoke(this.this$0, var1);
                        } else {
                           this.$onScrollEndDrag.invoke(this.this$0, var1);
                        }
                     }
                  },
                  this.$onStickyHeaderRender
               );
            }
         }
      );
      this.premiumUpsellGradientDecoration = new EmojiPickerPremiumUpsellGradientBackground(var1, var12);
      this.setHasFixedSize(true);
      RecyclerViewExtensionsKt.setReactNativeClipToPadding(this);
      this.setItemAnimator(null);
      this.setLayoutManager(new EmojiPickerLayoutManager(var1, var4.getRowSize(), new Function1(this) {
         final EmojiPickerView this$0;

         {
            super(1);
            this.this$0 = var1;
         }

         public final Integer invoke(int var1) {
            return EmojiPickerView.access$getSpanSize(this.this$0, EmojiPickerView.access$getTypedAdapter(this.this$0).getItem(var1));
         }
      }));
      this.setAdapter(new EmojiPickerViewAdapter(var4, SizeUtilsKt.getDpToPx(var2), SizeUtilsKt.getDpToPx(var3), new Function2(this) {
         final EmojiPickerView this$0;

         {
            super(2);
            this.this$0 = var1;
         }

         public final void invoke(Integer var1, Integer var2) {
            EmojiPickerView.access$onItemsChanged(this.this$0, var1, var2);
         }
      }, new Function2(var5, this) {
         final Function3 $onPressEmoji;
         final EmojiPickerView this$0;

         {
            super(2);
            this.$onPressEmoji = var1;
            this.this$0 = var2;
         }

         public final void invoke(java.lang.Long var1, java.lang.String var2) {
            q.h(var2, "emojiName");
            this.$onPressEmoji.invoke(this.this$0, var1, var2);
         }
      }, new Function2(var9, this) {
         final Function3 $onLongPressEmoji;
         final EmojiPickerView this$0;

         {
            super(2);
            this.$onLongPressEmoji = var1;
            this.this$0 = var2;
         }

         public final void invoke(java.lang.Long var1, java.lang.String var2) {
            q.h(var2, "emojiName");
            this.$onLongPressEmoji.invoke(this.this$0, var1, var2);
         }
      }, var12, var13));
      this.getScroller().bind();
      this.configurePremiumUpsellGradientDecorator(var4.getHasPremiumInlineRoadblock());
      this.configureRecycledViewPool();
      this.getVisibilityTracker().setTrackingEnabled(var4.getHasPremiumInlineRoadblock());
   }

   private fun configureMountedChild(view: View) {
      val var2: RecyclerView.ViewHolder = this.getChildViewHolder(var1);
      if (var2 is EmojiPickerViewHolder.Emoji) {
         (var2 as EmojiPickerViewHolder.Emoji).updateImage(this.getTypedAdapter().getScrolling(), this.getTypedAdapter().getScrollingFast());
      }
   }

   private fun configureMountedChildren() {
      val var1: java.util.Iterator = v0.a(this).iterator();

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
            throw new p();
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

   public override fun fling(velocityX: Int, velocityY: Int): Boolean {
      val var3: RecyclerViewScrollLimiter = RecyclerViewScrollLimiter.INSTANCE;
      return super.fling(RecyclerViewScrollLimiter.INSTANCE.getClampedVelocity(var1), var3.getClampedVelocity(var2));
   }

   public override fun onChildAttachedToWindow(child: View) {
      q.h(var1, "child");
      super.onChildAttachedToWindow(var1);
      this.getVisibilityTracker().trackViewVisibilityChanged(this, var1, true);
      this.configureMountedChild(var1);
   }

   public override fun onChildDetachedFromWindow(child: View) {
      q.h(var1, "child");
      super.onChildDetachedFromWindow(var1);
      this.getVisibilityTracker().trackViewVisibilityChanged(this, var1, false);
   }

   public override fun onContext(): Context {
      val var1: Context = this.getContext();
      q.g(var1, "getContext(...)");
      return var1;
   }

   public fun onDestroy() {
      this.getScroller().unbind();
   }

   public override fun onEmojisUpdated(emojis: List<EmojiPickerItem>, emojisUnicode: List<EmojiPickerItem>) {
      q.h(var1, "emojis");
      q.h(var2, "emojisUnicode");
      this.getTypedAdapter().setEmojis(var1, var2);
   }

   public fun scrollToItemAtIndex(index: Int, animated: Boolean, itemType: ItemType) {
      q.h(var3, "itemType");
      this.getScroller().scrollToItemAtIndex(var1, var2, var3.ordinal());
   }

   public fun scrollingEnabled(enabled: Boolean) {
      this.getTypedLayoutManager().setScrollingEnabled(var1);
   }

   public fun setConfig(config: com.discord.emoji_picker.EmojiPickerView.Config) {
      q.h(var1, "config");
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
      q.h(var1, "coreData");
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
      val var2: EmojiPickerPremiumUpsellGradientBackground = this.premiumUpsellGradientDecoration;
      val var3: Context = this.getContext();
      q.g(var3, "getContext(...)");
      var2.setUseTier0UpsellContent(var3, var1);
   }

   public data class Config(animateEmoji: Boolean, scrollFastOptimizationEnabled: Boolean, scrollFastVelocity: Int, disableAnimationsOnScroll: Boolean) {
      public final val animateEmoji: Boolean
      public final val disableAnimationsOnScroll: Boolean
      public final val scrollFastOptimizationEnabled: Boolean
      public final val scrollFastVelocity: Int

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
         val var3: Boolean = this.scrollFastOptimizationEnabled;
         val var1: Int = this.scrollFastVelocity;
         val var4: Boolean = this.disableAnimationsOnScroll;
         val var5: StringBuilder = new StringBuilder();
         var5.append("Config(animateEmoji=");
         var5.append(var2);
         var5.append(", scrollFastOptimizationEnabled=");
         var5.append(var3);
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

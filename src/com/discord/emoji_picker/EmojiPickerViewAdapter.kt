package com.discord.emoji_picker

import android.annotation.SuppressLint
import android.content.Context
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.discord.emoji_picker.EmojiPickerItemData.CoreData
import com.discord.emoji_picker.EmojiPickerView.Config
import fh.p
import kotlin.jvm.functions.Function0
import kotlin.jvm.functions.Function1
import kotlin.jvm.internal.r
import vh.h

internal class EmojiPickerViewAdapter(coreData: CoreData,
      emojiSize: Int,
      emojiMargin: Int,
      onItemsChanged: (Int?, Int?) -> Unit,
      onPressEmoji: (Long?, String) -> Unit,
      onLongPressEmoji: (Long?, String) -> Unit,
      useTier0UpsellContent: Boolean,
      config: Config
   )
   : Adapter<EmojiPickerViewHolder> {
   private final var emojiSize: Int
   private final var emojiMargin: Int
   private final val onItemsChanged: (Int?, Int?) -> Unit
   private final val onPressEmoji: (Long?, String) -> Unit
   private final val onLongPressEmoji: (Long?, String) -> Unit
   private final var useTier0UpsellContent: Boolean
   private final var config: Config
   private final val itemData: EmojiPickerItemData
   private final var scrolling: Boolean
   private final var scrollingFast: Boolean

   init {
      r.h(var1, "coreData");
      r.h(var4, "onItemsChanged");
      r.h(var5, "onPressEmoji");
      r.h(var6, "onLongPressEmoji");
      r.h(var8, "config");
      super();
      this.emojiSize = var2;
      this.emojiMargin = var3;
      this.onItemsChanged = var4;
      this.onPressEmoji = var5;
      this.onLongPressEmoji = var6;
      this.useTier0UpsellContent = var7;
      this.config = var8;
      this.itemData = new EmojiPickerItemData(var1);
      this.setHasStableIds(true);
   }

   public fun findFirstItemPositionAboveOrBelowPosition(position: Int, itemType: Int): Int {
      val var5: Int = this.getItemCount();
      var var4: Int = var1;

      while (true) {
         var var3: Int = var1;
         if (var4 < 0) {
            while (var3 < var5) {
               if (this.getItemViewType(var3) == var2) {
                  return var3;
               }

               var3++;
            }

            return -1;
         }

         if (this.getItemViewType(var4) == var2) {
            return var4;
         }

         var4--;
      }
   }

   public fun getEstimatedDistance(positionFrom: Int, positionTo: Int): Int {
      val var3: Boolean;
      if (var1 <= var2) {
         var3 = true;
      } else {
         var3 = false;
      }

      val var5: Any;
      if (var3) {
         var5 = new IntRange(var1, var2);
      } else {
         var5 = h.m(var1, var2);
      }

      val var6: java.util.Iterator = var5.iterator();
      var2 = 0;
      var1 = 0;

      while (var6.hasNext()) {
         val var9: EmojiPickerItem = this.getItem((var6 as p).nextInt());
         val var4: Boolean;
         if (var9 is EmojiPickerItem.Emoji) {
            var4 = true;
         } else {
            var4 = var9 is EmojiPickerItem.EmojiPlaceholder;
         }

         if (var4) {
            if (var1 == 0) {
               var1++;
               var2 = var2 + this.emojiSize + this.emojiMargin;
               continue;
            }

            if (var1 < this.itemData.getRowSize() - 1) {
               var1++;
               continue;
            }
         } else if (var9 !is EmojiPickerItem.Category) {
            continue;
         }

         var1 = 0;
      }

      if (!var3) {
         var2 = -var2;
      }

      return var2;
   }

   public fun getItem(position: Int): EmojiPickerItem {
      return this.itemData.getItem(var1);
   }

   public open fun getItemCount(): Int {
      return this.itemData.getItemCount();
   }

   public open fun getItemId(position: Int): Long {
      return this.getItem(var1).itemId();
   }

   public fun getItemIndex(position: Int): Int? {
      return this.itemData.getItemIndex(var1);
   }

   public fun getItemPositionAtIndex(index: Int, itemType: Int): Int {
      var var4: Int = this.itemData.getItemCount();
      var var3: Int = 0;
      val var5: java.util.Iterator = new IntRange(0, var4).iterator();

      while (var5.hasNext()) {
         var4 = (var5 as p).nextInt();
         if (this.getItem(var4).itemType() == var2) {
            if (var3 == var1) {
               return var4;
            }

            var3++;
         }
      }

      return -1;
   }

   public open fun getItemViewType(position: Int): Int {
      return this.getItem(var1).itemType();
   }

   public fun getScrolling(): Boolean {
      return this.scrolling;
   }

   public fun getScrollingFast(): Boolean {
      return this.scrollingFast;
   }

   public open fun onBindViewHolder(holder: EmojiPickerViewHolder, position: Int) {
      r.h(var1, "holder");
      if (var1 is EmojiPickerViewHolder.Category) {
         val var4: EmojiPickerViewHolder.Category = var1 as EmojiPickerViewHolder.Category;
         val var3: EmojiPickerItem = this.getItem(var2);
         r.f(var3, "null cannot be cast to non-null type com.discord.emoji_picker.EmojiPickerItem.Category");
         var4.onBindViewHolder(var3 as EmojiPickerItem.Category);
      } else if (var1 is EmojiPickerViewHolder.EmojiPlaceholder) {
         (var1 as EmojiPickerViewHolder.EmojiPlaceholder).onBindViewHolder(this.emojiSize, this.emojiMargin);
      } else if (var1 is EmojiPickerViewHolder.Emoji) {
         val var8: EmojiPickerViewHolder.Emoji = var1 as EmojiPickerViewHolder.Emoji;
         val var5: EmojiPickerItem = this.getItem(var2);
         r.f(var5, "null cannot be cast to non-null type com.discord.emoji_picker.EmojiPickerItem.Emoji");
         var8.onBindViewHolder(
            var5 as EmojiPickerItem.Emoji, this.config.getAnimateEmoji(), this.emojiSize, this.emojiMargin, this.scrolling, this.scrollingFast
         );
      } else if (var1 is EmojiPickerViewHolder.Spacer) {
         val var9: EmojiPickerViewHolder.Spacer = var1 as EmojiPickerViewHolder.Spacer;
         val var6: EmojiPickerItem = this.getItem(var2);
         r.f(var6, "null cannot be cast to non-null type com.discord.emoji_picker.EmojiPickerItem.Spacer");
         var9.onBindViewHolder(var6 as EmojiPickerItem.Spacer);
      } else if (var1 is EmojiPickerViewHolder.FooterUpsell) {
         val var7: EmojiPickerViewHolder.FooterUpsell = var1 as EmojiPickerViewHolder.FooterUpsell;
         val var10: EmojiPickerItem = this.getItem(var2);
         r.f(var10, "null cannot be cast to non-null type com.discord.emoji_picker.EmojiPickerItem.FooterUpsell");
         var7.onBindViewHolder(var10 as EmojiPickerItem.FooterUpsell);
      } else if (var1 is EmojiPickerViewHolder.PremiumInlineRoadblockFooter) {
         (var1 as EmojiPickerViewHolder.PremiumInlineRoadblockFooter).onBindViewHolder(this.useTier0UpsellContent);
      } else if (var1 is EmojiPickerViewHolder.PremiumInlineRoadblockHeader) {
         (var1 as EmojiPickerViewHolder.PremiumInlineRoadblockHeader).onBindViewHolder(this.useTier0UpsellContent);
      }
   }

   public open fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EmojiPickerViewHolder {
      r.h(var1, "parent");
      var var5: Any;
      switch (EmojiPickerViewAdapter.WhenMappings.$EnumSwitchMapping$0[EmojiPickerItem.ItemType.Companion.create(var2).ordinal()]) {
         case 1:
            val var11: Context = var1.getContext();
            r.g(var11, "parent.context");
            var5 = new EmojiPickerViewHolder.Emoji(var11, this.onPressEmoji, this.onLongPressEmoji);
            break;
         case 2:
            val var10: Context = var1.getContext();
            r.g(var10, "parent.context");
            var5 = new EmojiPickerViewHolder.EmojiPlaceholder(var10);
            break;
         case 3:
            val var9: Context = var1.getContext();
            r.g(var9, "parent.context");
            var5 = new EmojiPickerViewHolder.Category(var9);
            break;
         case 4:
            val var8: Context = var1.getContext();
            r.g(var8, "parent.context");
            var5 = new EmojiPickerViewHolder.Spacer(var8);
            break;
         case 5:
            val var7: Context = var1.getContext();
            r.g(var7, "parent.context");
            var5 = new EmojiPickerViewHolder.FooterUpsell(var7);
            break;
         case 6:
            val var6: Context = var1.getContext();
            r.g(var6, "parent.context");
            var5 = new EmojiPickerViewHolder.PremiumInlineRoadblockHeader(var6, null, 2, null);
            break;
         case 7:
            val var4: Context = var1.getContext();
            r.g(var4, "parent.context");
            var5 = new EmojiPickerViewHolder.PremiumInlineRoadblockFooter(var4, null, 2, null);
            break;
         default:
            throw new eh.p();
      }

      return (EmojiPickerViewHolder)var5;
   }

   public fun setConfig(config: Config) {
      r.h(var1, "config");
      if (!r.c(this.config, var1)) {
         this.config = var1;
         this.onItemsChanged.invoke(null, null);
      }
   }

   @SuppressLint(["NotifyDataSetChanged"])
   public fun setCoreData(coreData: CoreData) {
      r.h(var1, "coreData");
      this.itemData.setCoreData(var1, new Function0<Unit>(this) {
         final EmojiPickerViewAdapter this$0;

         {
            super(0);
            this.this$0 = var1;
         }

         public final void invoke() {
            EmojiPickerViewAdapter.access$getOnItemsChanged$p(this.this$0).invoke(null, null);
         }
      });
   }

   @SuppressLint(["NotifyDataSetChanged"])
   public fun setEmojiMargin(emojiMargin: Int) {
      if (this.emojiMargin != var1) {
         this.emojiMargin = var1;
         this.onItemsChanged.invoke(null, null);
      }
   }

   @SuppressLint(["NotifyDataSetChanged"])
   public fun setEmojiSize(emojiSize: Int) {
      if (this.emojiSize != var1) {
         this.emojiSize = var1;
         this.onItemsChanged.invoke(null, null);
      }
   }

   @SuppressLint(["NotifyDataSetChanged"])
   public fun setEmojis(emojis: List<EmojiPickerItem>, emojisUnicode: List<EmojiPickerItem>) {
      r.h(var1, "emojis");
      r.h(var2, "emojisUnicode");
      this.itemData.setEmojis(var1, var2, new Function0<Unit>(this) {
         final EmojiPickerViewAdapter this$0;

         {
            super(0);
            this.this$0 = var1;
         }

         public final void invoke() {
            EmojiPickerViewAdapter.access$getOnItemsChanged$p(this.this$0).invoke(null, null);
         }
      });
   }

   public fun setScrolling(scrolling: Boolean) {
      if (var1 && this.config.getDisableAnimationsOnScroll()) {
         var1 = true;
      } else {
         var1 = false;
      }

      this.scrolling = var1;
   }

   public fun setScrollingFast(scrollingFast: Boolean) {
      if (var1 && this.config.getScrollFastOptimizationEnabled()) {
         var1 = true;
      } else {
         var1 = false;
      }

      this.scrollingFast = var1;
   }

   public fun setSpacerBottomHeight(spacerBottomHeight: Int) {
      this.itemData.setSpacerBottomHeight(var1, new Function1<Integer, Unit>(this) {
         final EmojiPickerViewAdapter this$0;

         {
            super(1);
            this.this$0 = var1;
         }

         public final void invoke(int var1) {
            EmojiPickerViewAdapter.access$getOnItemsChanged$p(this.this$0).invoke(var1, null);
         }
      });
   }

   public fun setSpacerTopHeight(spacerTopHeight: Int) {
      this.itemData.setSpacerTopHeight(var1, new Function1<Integer, Unit>(this) {
         final EmojiPickerViewAdapter this$0;

         {
            super(1);
            this.this$0 = var1;
         }

         public final void invoke(int var1) {
            EmojiPickerViewAdapter.access$getOnItemsChanged$p(this.this$0).invoke(var1, null);
         }
      });
   }

   public fun setUseTier0UpsellContent(useTier0UpsellContent: Boolean) {
      if (this.useTier0UpsellContent != var1) {
         this.useTier0UpsellContent = var1;
         this.onItemsChanged.invoke(null, null);
      }
   }
}

package com.discord.emoji_picker

import android.annotation.SuppressLint
import android.content.Context
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.discord.emoji_picker.EmojiPickerItemData.CoreData
import com.discord.emoji_picker.EmojiPickerView.Config
import kotlin.jvm.internal.SourceDebugExtension

@SourceDebugExtension(["SMAP\nEmojiPickerViewAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EmojiPickerViewAdapter.kt\ncom/discord/emoji_picker/EmojiPickerViewAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,262:1\n1797#2,3:263\n1863#2,2:266\n*S KotlinDebug\n*F\n+ 1 EmojiPickerViewAdapter.kt\ncom/discord/emoji_picker/EmojiPickerViewAdapter\n*L\n111#1:263,3\n152#1:266,2\n*E\n"])
internal class EmojiPickerViewAdapter(coreData: CoreData,
      emojiSize: Int,
      emojiMargin: Int,
      onItemsChanged: (Int?, Int?) -> Unit,
      onPressEmoji: (Long?, String) -> Unit,
      onLongPressEmoji: (Long?, String) -> Unit,
      useTier0UpsellContent: Boolean,
      config: Config
   )
   : RecyclerView.Adapter {
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

   @JvmStatic
   fun `setCoreData$lambda$0`(var0: EmojiPickerViewAdapter): Unit {
      var0.onItemsChanged.invoke(null, null);
      return Unit.a;
   }

   @JvmStatic
   fun `setEmojis$lambda$1`(var0: EmojiPickerViewAdapter): Unit {
      var0.onItemsChanged.invoke(null, null);
      return Unit.a;
   }

   @JvmStatic
   fun `setSpacerBottomHeight$lambda$3`(var0: EmojiPickerViewAdapter, var1: Int): Unit {
      var0.onItemsChanged.invoke(var1, null);
      return Unit.a;
   }

   @JvmStatic
   fun `setSpacerTopHeight$lambda$2`(var0: EmojiPickerViewAdapter, var1: Int): Unit {
      var0.onItemsChanged.invoke(var1, null);
      return Unit.a;
   }

   public fun findFirstItemPositionAboveOrBelowPosition(position: Int, itemType: Int): Int {
      val var5: Int = this.getItemCount();
      var var3: Int = var1;

      while (true) {
         var var4: Int = var1;
         if (var3 < 0) {
            while (var4 < var5) {
               if (this.getItemViewType(var4) == var2) {
                  return var4;
               }

               var4++;
            }

            return -1;
         }

         if (this.getItemViewType(var3) == var2) {
            return var3;
         }

         var3--;
      }
   }

   public fun getEstimatedDistance(positionFrom: Int, positionTo: Int): Int {
      val var3: Boolean;
      if (var1 <= var2) {
         var3 = true;
      } else {
         var3 = false;
      }

      val var4: Any;
      if (var3) {
         var4 = new IntRange(var1, var2);
      } else {
         var4 = kotlin.ranges.d.n(var1, var2);
      }

      val var8: java.util.Iterator = var4.iterator();
      var2 = 0;
      var1 = 0;

      while (var8.hasNext()) {
         val var5: EmojiPickerItem = this.getItem((var8 as I).nextInt());
         if (var5 !is EmojiPickerItem.Emoji && var5 !is EmojiPickerItem.EmojiPlaceholder) {
            if (var5 !is EmojiPickerItem.Category) {
               continue;
            }
         } else {
            if (var1 == 0) {
               var1++;
               var2 = var2 + this.emojiSize + this.emojiMargin;
               continue;
            }

            if (var1 < this.itemData.getRowSize() - 1) {
               var1++;
               continue;
            }
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

   public override fun getItemCount(): Int {
      return this.itemData.getItemCount();
   }

   public override fun getItemId(position: Int): Long {
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
         var4 = (var5 as I).nextInt();
         if (this.getItem(var4).itemType() == var2) {
            if (var3 == var1) {
               return var4;
            }

            var3++;
         }
      }

      return -1;
   }

   public override fun getItemViewType(position: Int): Int {
      return this.getItem(var1).itemType();
   }

   public fun getScrolling(): Boolean {
      return this.scrolling;
   }

   public fun getScrollingFast(): Boolean {
      return this.scrollingFast;
   }

   public open fun onBindViewHolder(holder: EmojiPickerViewHolder, position: Int) {
      if (var1 is EmojiPickerViewHolder.Category) {
         val var3: EmojiPickerViewHolder.Category = var1 as EmojiPickerViewHolder.Category;
         val var4: EmojiPickerItem = this.getItem(var2);
         var3.onBindViewHolder(var4 as EmojiPickerItem.Category);
      } else if (var1 is EmojiPickerViewHolder.EmojiPlaceholder) {
         (var1 as EmojiPickerViewHolder.EmojiPlaceholder).onBindViewHolder(this.emojiSize, this.emojiMargin);
      } else if (var1 is EmojiPickerViewHolder.Emoji) {
         val var5: EmojiPickerViewHolder.Emoji = var1 as EmojiPickerViewHolder.Emoji;
         val var8: EmojiPickerItem = this.getItem(var2);
         var5.onBindViewHolder(
            var8 as EmojiPickerItem.Emoji, this.config.getAnimateEmoji(), this.emojiSize, this.emojiMargin, this.scrolling, this.scrollingFast
         );
      } else if (var1 is EmojiPickerViewHolder.Spacer) {
         val var9: EmojiPickerViewHolder.Spacer = var1 as EmojiPickerViewHolder.Spacer;
         val var6: EmojiPickerItem = this.getItem(var2);
         var9.onBindViewHolder(var6 as EmojiPickerItem.Spacer);
      } else if (var1 is EmojiPickerViewHolder.FooterUpsell) {
         val var10: EmojiPickerViewHolder.FooterUpsell = var1 as EmojiPickerViewHolder.FooterUpsell;
         val var7: EmojiPickerItem = this.getItem(var2);
         var10.onBindViewHolder(var7 as EmojiPickerItem.FooterUpsell);
      } else if (var1 is EmojiPickerViewHolder.PremiumInlineRoadblockFooter) {
         (var1 as EmojiPickerViewHolder.PremiumInlineRoadblockFooter).onBindViewHolder(this.useTier0UpsellContent);
      } else {
         if (var1 !is EmojiPickerViewHolder.PremiumInlineRoadblockHeader) {
            throw new B9.n();
         }

         (var1 as EmojiPickerViewHolder.PremiumInlineRoadblockHeader).onBindViewHolder(this.useTier0UpsellContent);
      }
   }

   public open fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EmojiPickerViewHolder {
      var var5: Any;
      switch (EmojiPickerViewAdapter.WhenMappings.$EnumSwitchMapping$0[EmojiPickerItem.ItemType.Companion.create(var2).ordinal()]) {
         case 1:
            val var11: Context = var1.getContext();
            var5 = new EmojiPickerViewHolder.Emoji(var11, this.onPressEmoji, this.onLongPressEmoji);
            break;
         case 2:
            val var10: Context = var1.getContext();
            var5 = new EmojiPickerViewHolder.EmojiPlaceholder(var10);
            break;
         case 3:
            val var9: Context = var1.getContext();
            var5 = new EmojiPickerViewHolder.Category(var9);
            break;
         case 4:
            val var8: Context = var1.getContext();
            var5 = new EmojiPickerViewHolder.Spacer(var8);
            break;
         case 5:
            val var7: Context = var1.getContext();
            var5 = new EmojiPickerViewHolder.FooterUpsell(var7);
            break;
         case 6:
            val var6: Context = var1.getContext();
            var5 = new EmojiPickerViewHolder.PremiumInlineRoadblockHeader(var6, null, 2, null);
            break;
         case 7:
            val var4: Context = var1.getContext();
            var5 = new EmojiPickerViewHolder.PremiumInlineRoadblockFooter(var4, null, 2, null);
            break;
         default:
            throw new B9.n();
      }

      return (EmojiPickerViewHolder)var5;
   }

   public fun setConfig(config: Config) {
      if (!(this.config == var1)) {
         this.config = var1;
         this.onItemsChanged.invoke(null, null);
      }
   }

   @SuppressLint(["NotifyDataSetChanged"])
   public fun setCoreData(coreData: CoreData) {
      this.itemData.setCoreData(var1, new z(this));
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
      this.itemData.setEmojis(var1, var2, new x(this));
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
      this.itemData.setSpacerBottomHeight(var1, new A(this));
   }

   public fun setSpacerTopHeight(spacerTopHeight: Int) {
      this.itemData.setSpacerTopHeight(var1, new y(this));
   }

   public fun setUseTier0UpsellContent(useTier0UpsellContent: Boolean) {
      if (this.useTier0UpsellContent != var1) {
         this.useTier0UpsellContent = var1;
         this.onItemsChanged.invoke(null, null);
      }
   }
}

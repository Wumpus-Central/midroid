package com.discord.fastest_list.android.placeholder

import android.view.ViewGroup
import androidx.collection.LruCache
import com.discord.fastest_list.android.FastestListSections.Entry
import ht.p

internal sealed class FastestListPlaceholder protected constructor() {
   public abstract fun onPlaceholderShouldBind(view: ViewGroup, item: Entry) {
   }

   public abstract fun onPlaceholderShouldUnbind(view: ViewGroup) {
   }

   public companion object {
      private const val PLACEHOLDER_POOL_SIZE: Int
      private final val placeholderPool: LruCache<FastestListPlaceholderType, FastestListPlaceholder>

      private fun FastestListPlaceholderType.create(): FastestListPlaceholder {
         if (var1 is FastestListPlaceholderType.FeedItem) {
            return new FastestListPlaceholderTypeFeedItem(var1 as FastestListPlaceholderType.FeedItem);
         } else if (var1 is FastestListPlaceholderType.Shape) {
            return new FastestListPlaceholderTypeShape(var1 as FastestListPlaceholderType.Shape);
         } else if (var1 is FastestListPlaceholderType.None) {
            return FastestListPlaceholderTypeNone.INSTANCE;
         } else {
            throw new p();
         }
      }

      public fun get(placeholderType: FastestListPlaceholderType): FastestListPlaceholder {
         var var2: FastestListPlaceholder = FastestListPlaceholder.access$getPlaceholderPool$cp().d(var1) as FastestListPlaceholder;
         if (var2 != null) {
            return var2;
         } else {
            var2 = this.create(var1);
            FastestListPlaceholder.access$getPlaceholderPool$cp().f(var1, var2);
            return var2;
         }
      }
   }
}

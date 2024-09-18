package com.discord.fastest_list.android.placeholder

import android.view.ViewGroup
import androidx.collection.LruCache
import ch.p
import com.discord.fastest_list.android.FastestListSections.Entry
import kotlin.jvm.internal.q

internal sealed class FastestListPlaceholder protected constructor() {
   public abstract fun onPlaceholderShouldBind(view: ViewGroup, item: Entry) {
   }

   public abstract fun onPlaceholderShouldUnbind(view: ViewGroup) {
   }

   public companion object {
      private const val PLACEHOLDER_POOL_SIZE: Int
      private final val placeholderPool: LruCache<FastestListPlaceholderType, FastestListPlaceholder>

      private fun FastestListPlaceholderType.create(): FastestListPlaceholder {
         val var2: Any;
         if (var1 is FastestListPlaceholderType.FeedItem) {
            var2 = new FastestListPlaceholderTypeFeedItem(var1 as FastestListPlaceholderType.FeedItem);
         } else if (var1 is FastestListPlaceholderType.Shape) {
            var2 = new FastestListPlaceholderTypeShape(var1 as FastestListPlaceholderType.Shape);
         } else {
            if (var1 !is FastestListPlaceholderType.None) {
               throw new p();
            }

            var2 = FastestListPlaceholderTypeNone.INSTANCE;
         }

         return (FastestListPlaceholder)var2;
      }

      public fun get(placeholderType: FastestListPlaceholderType): FastestListPlaceholder {
         q.h(var1, "placeholderType");
         var var2: FastestListPlaceholder = FastestListPlaceholder.access$getPlaceholderPool$cp().c(var1) as FastestListPlaceholder;
         if (var2 != null) {
            return var2;
         } else {
            var2 = this.create(var1);
            FastestListPlaceholder.access$getPlaceholderPool$cp().d(var1, var2);
            return var2;
         }
      }
   }
}

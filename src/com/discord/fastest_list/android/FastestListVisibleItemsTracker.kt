package com.discord.fastest_list.android

import kotlin.enums.EnumEntries
import kotlin.jvm.internal.q

internal class FastestListVisibleItemsTracker(layoutManager: FastestListLayoutManager,
   sections: FastestListSections,
   onVisibleItemsChanged: (String, Int, Int, Int, Int) -> Unit
) {
   private final val layoutManager: FastestListLayoutManager
   private final val sections: FastestListSections
   private final val onVisibleItemsChanged: (String, Int, Int, Int, Int) -> Unit
   private final var positionStartPrev: Int
   private final var positionEndPrev: Int
   private final var positionStartPrevRaw: Int
   private final var positionEndPrevRaw: Int
   private final var sectionsId: String

   private final val lastItemPosition: Int
      private final get() {
         return this.layoutManager.getItemCount() - 1;
      }


   private final val itemBuffer: Int
      private final get() {
         return (int)((float)Math.ceil((double)((float)this.layoutManager.getExtraLayoutSpace() / (float)this.sections.getItemSizeAverage())));
      }


   private final val scrollingForward: Boolean
      private final get() {
         return this.layoutManager.getScrollingForward();
      }


   init {
      q.h(var1, "layoutManager");
      q.h(var2, "sections");
      q.h(var3, "onVisibleItemsChanged");
      super();
      this.layoutManager = var1;
      this.sections = var2;
      this.onVisibleItemsChanged = var3;
      this.positionStartPrev = -1;
      this.positionEndPrev = -1;
      this.positionStartPrevRaw = -1;
      this.positionEndPrevRaw = -1;
      this.sectionsId = "";
   }

   private fun computeVisibleItems(itemEndPosition: Int, itemStartPosition: Int) {
      this.sectionsId = this.sections.getId();
      this.positionStartPrev = var2;
      this.positionEndPrev = var1;
      val var4: FastestListSections.Entry.SectionItem = this.sections.getItemAtPosition(var2, false);
      val var3: FastestListSections.Entry.SectionItem = this.sections.getItemAtPosition(var1, true);
      this.onVisibleItemsChanged.invoke(this.sectionsId, var4.getSection-sZRFyWU(), var3.getSection-sZRFyWU(), var4.getItem-JXkbwXs(), var3.getItem-JXkbwXs());
   }

   private fun isUnchanged(itemEndPosition: Int, itemStartPosition: Int): Boolean {
      val var3: Boolean;
      if (q.c(this.sectionsId, this.sections.getId()) && var1 == this.positionEndPrev && var2 == this.positionStartPrev) {
         var3 = true;
      } else {
         var3 = false;
      }

      return var3;
   }

   public fun updateVisibleItemPositions() {
      var var1: Int = this.layoutManager.findFirstVisibleItemPosition();
      var var2: Int = this.layoutManager.findLastVisibleItemPosition();
      if (var2 != -1 && var1 != -1) {
         if (this.positionEndPrevRaw == var2 && this.positionStartPrevRaw == var1 && q.c(this.sectionsId, this.sections.getId())) {
            return;
         }

         this.positionEndPrevRaw = var2;
         this.positionStartPrevRaw = var1;
         if (this.getLastItemPosition() < 0) {
            if (!this.isUnchanged(var2, var1)) {
               this.computeVisibleItems(var2, var1);
            }

            return;
         }

         if (this.getScrollingForward()) {
            var2 = Math.min(this.getLastItemPosition(), var2 + this.getItemBuffer());
         } else {
            var1 = Math.max(0, var1 - this.getItemBuffer());
         }

         if (this.isUnchanged(var2, var1)) {
            return;
         }

         val var6: Int = this.positionEndPrev - this.positionStartPrev;
         var var5: Int = this.positionEndPrev - this.positionStartPrev - (var2 - var1);
         var var3: Int = var1;
         var var4: Int = var2;
         if (var5 > 0) {
            var5 = Math.min(this.getLastItemPosition(), var2 + var5);
            var3 = var6 - (var5 - var1);
            var2 = var1;
            if (var3 > 0) {
               var2 = Math.max(0, var1 - var3);
            }

            var3 = var2;
            var4 = var5;
            if (this.isUnchanged(var5, var2)) {
               return;
            }
         }

         this.computeVisibleItems(var4, var3);
      }
   }

   public enum class RenderAhead(extraLayoutPercent: Float) {
      FULL(3.0F),
      HALF(2.0F),
      NOMINAL(1.0F)
      public final val extraLayoutPercent: Float
      @JvmStatic
      private EnumEntries $ENTRIES;
      @JvmStatic
      private FastestListVisibleItemsTracker.RenderAhead[] $VALUES;
      @JvmStatic
      public FastestListVisibleItemsTracker.RenderAhead.Companion Companion = new FastestListVisibleItemsTracker.RenderAhead.Companion(null);

      @JvmStatic
      fun {
         val var0: Array<FastestListVisibleItemsTracker.RenderAhead> = $values();
         $VALUES = var0;
         $ENTRIES = uh.a.a(var0);
      }

      init {
         this.extraLayoutPercent = var3;
      }

      @JvmStatic
      fun getEntries(): EnumEntries {
         return $ENTRIES;
      }

      public companion object {
         public fun create(value: String): com.discord.fastest_list.android.FastestListVisibleItemsTracker.RenderAhead {
            q.h(var1, "value");
            val var2: Int = var1.hashCode();
            if (var2 != 3154575) {
               if (var2 != 3194931) {
                  if (var2 == 2122893532 && var1.equals("nominal")) {
                     return FastestListVisibleItemsTracker.RenderAhead.NOMINAL;
                  }
               } else if (var1.equals("half")) {
                  return FastestListVisibleItemsTracker.RenderAhead.HALF;
               }
            } else if (var1.equals("full")) {
               return FastestListVisibleItemsTracker.RenderAhead.FULL;
            }

            val var3: StringBuilder = new StringBuilder();
            var3.append("Unknown item type: ");
            var3.append(var1);
            throw new IllegalArgumentException(var3.toString());
         }
      }
   }
}

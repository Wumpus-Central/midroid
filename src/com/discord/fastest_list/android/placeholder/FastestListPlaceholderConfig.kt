package com.discord.fastest_list.android.placeholder

import com.discord.fastest_list.android.FastestListSections
import com.discord.fastest_list.android.FastestListSections.Entry
import kh.p
import kotlin.jvm.internal.q

internal data class FastestListPlaceholderConfig(listFooter: FastestListPlaceholderType,
   listHeader: FastestListPlaceholderType,
   sectionFooter: FastestListPlaceholderType,
   sectionHeader: FastestListPlaceholderType,
   sectionItem: FastestListPlaceholderType,
   sectionItemAtFront: FastestListPlaceholderType,
   sectionItemAtRear: FastestListPlaceholderType,
   sectionItemSingleton: FastestListPlaceholderType
) {
   private final val listFooter: FastestListPlaceholderType
   private final val listHeader: FastestListPlaceholderType
   private final val sectionFooter: FastestListPlaceholderType
   private final val sectionHeader: FastestListPlaceholderType
   private final val sectionItem: FastestListPlaceholderType
   private final val sectionItemAtFront: FastestListPlaceholderType
   private final val sectionItemAtRear: FastestListPlaceholderType
   private final val sectionItemSingleton: FastestListPlaceholderType

   init {
      q.h(var1, "listFooter");
      q.h(var2, "listHeader");
      q.h(var3, "sectionFooter");
      q.h(var4, "sectionHeader");
      q.h(var5, "sectionItem");
      q.h(var6, "sectionItemAtFront");
      q.h(var7, "sectionItemAtRear");
      q.h(var8, "sectionItemSingleton");
      super();
      this.listFooter = var1;
      this.listHeader = var2;
      this.sectionFooter = var3;
      this.sectionHeader = var4;
      this.sectionItem = var5;
      this.sectionItemAtFront = var6;
      this.sectionItemAtRear = var7;
      this.sectionItemSingleton = var8;
   }

   private operator fun component1(): FastestListPlaceholderType {
      return this.listFooter;
   }

   private operator fun component2(): FastestListPlaceholderType {
      return this.listHeader;
   }

   private operator fun component3(): FastestListPlaceholderType {
      return this.sectionFooter;
   }

   private operator fun component4(): FastestListPlaceholderType {
      return this.sectionHeader;
   }

   private operator fun component5(): FastestListPlaceholderType {
      return this.sectionItem;
   }

   private operator fun component6(): FastestListPlaceholderType {
      return this.sectionItemAtFront;
   }

   private operator fun component7(): FastestListPlaceholderType {
      return this.sectionItemAtRear;
   }

   private operator fun component8(): FastestListPlaceholderType {
      return this.sectionItemSingleton;
   }

   public fun copy(
      listFooter: FastestListPlaceholderType = var0.listFooter,
      listHeader: FastestListPlaceholderType = var0.listHeader,
      sectionFooter: FastestListPlaceholderType = var0.sectionFooter,
      sectionHeader: FastestListPlaceholderType = var0.sectionHeader,
      sectionItem: FastestListPlaceholderType = var0.sectionItem,
      sectionItemAtFront: FastestListPlaceholderType = var0.sectionItemAtFront,
      sectionItemAtRear: FastestListPlaceholderType = var0.sectionItemAtRear,
      sectionItemSingleton: FastestListPlaceholderType = var0.sectionItemSingleton
   ): FastestListPlaceholderConfig {
      q.h(var1, "listFooter");
      q.h(var2, "listHeader");
      q.h(var3, "sectionFooter");
      q.h(var4, "sectionHeader");
      q.h(var5, "sectionItem");
      q.h(var6, "sectionItemAtFront");
      q.h(var7, "sectionItemAtRear");
      q.h(var8, "sectionItemSingleton");
      return new FastestListPlaceholderConfig(var1, var2, var3, var4, var5, var6, var7, var8);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is FastestListPlaceholderConfig) {
         return false;
      } else {
         var1 = var1;
         if (!q.c(this.listFooter, var1.listFooter)) {
            return false;
         } else if (!q.c(this.listHeader, var1.listHeader)) {
            return false;
         } else if (!q.c(this.sectionFooter, var1.sectionFooter)) {
            return false;
         } else if (!q.c(this.sectionHeader, var1.sectionHeader)) {
            return false;
         } else if (!q.c(this.sectionItem, var1.sectionItem)) {
            return false;
         } else if (!q.c(this.sectionItemAtFront, var1.sectionItemAtFront)) {
            return false;
         } else if (!q.c(this.sectionItemAtRear, var1.sectionItemAtRear)) {
            return false;
         } else {
            return q.c(this.sectionItemSingleton, var1.sectionItemSingleton);
         }
      }
   }

   public fun getForEntry(entry: Entry): FastestListPlaceholderType {
      q.h(var1, "entry");
      var var4: FastestListPlaceholderType;
      if (var1 is FastestListSections.Entry.SectionItem) {
         val var3: FastestListSections.Entry.SectionItem = var1 as FastestListSections.Entry.SectionItem;
         if ((var1 as FastestListSections.Entry.SectionItem).getAtFront() && (var1 as FastestListSections.Entry.SectionItem).getAtRear()) {
            var4 = this.sectionItemSingleton;
            if (this.sectionItemSingleton is FastestListPlaceholderType.None) {
               var4 = this.sectionItem;
            }
         } else if (var3.getAtFront()) {
            var4 = this.sectionItemAtFront;
            if (this.sectionItemAtFront is FastestListPlaceholderType.None) {
               var4 = this.sectionItem;
            }
         } else if (var3.getAtRear()) {
            var4 = this.sectionItemAtRear;
            if (this.sectionItemAtRear is FastestListPlaceholderType.None) {
               var4 = this.sectionItem;
            }
         } else {
            var4 = this.sectionItem;
         }
      } else if (var1 is FastestListSections.Entry.ListFooter) {
         var4 = this.listFooter;
      } else if (var1 is FastestListSections.Entry.ListHeader) {
         var4 = this.listHeader;
      } else if (var1 is FastestListSections.Entry.SectionFooter) {
         var4 = this.sectionFooter;
      } else {
         if (var1 !is FastestListSections.Entry.SectionHeader) {
            throw new p();
         }

         var4 = this.sectionHeader;
      }

      return var4;
   }

   public override fun hashCode(): Int {
      return (
               (
                        (
                                 (
                                          ((this.listFooter.hashCode() * 31 + this.listHeader.hashCode()) * 31 + this.sectionFooter.hashCode()) * 31
                                             + this.sectionHeader.hashCode()
                                       )
                                       * 31
                                    + this.sectionItem.hashCode()
                              )
                              * 31
                           + this.sectionItemAtFront.hashCode()
                     )
                     * 31
                  + this.sectionItemAtRear.hashCode()
            )
            * 31
         + this.sectionItemSingleton.hashCode();
   }

   public override fun toString(): String {
      val var5: FastestListPlaceholderType = this.listFooter;
      val var2: FastestListPlaceholderType = this.listHeader;
      val var8: FastestListPlaceholderType = this.sectionFooter;
      val var3: FastestListPlaceholderType = this.sectionHeader;
      val var4: FastestListPlaceholderType = this.sectionItem;
      val var7: FastestListPlaceholderType = this.sectionItemAtFront;
      val var1: FastestListPlaceholderType = this.sectionItemAtRear;
      val var9: FastestListPlaceholderType = this.sectionItemSingleton;
      val var6: StringBuilder = new StringBuilder();
      var6.append("FastestListPlaceholderConfig(listFooter=");
      var6.append(var5);
      var6.append(", listHeader=");
      var6.append(var2);
      var6.append(", sectionFooter=");
      var6.append(var8);
      var6.append(", sectionHeader=");
      var6.append(var3);
      var6.append(", sectionItem=");
      var6.append(var4);
      var6.append(", sectionItemAtFront=");
      var6.append(var7);
      var6.append(", sectionItemAtRear=");
      var6.append(var1);
      var6.append(", sectionItemSingleton=");
      var6.append(var9);
      var6.append(")");
      return var6.toString();
   }

   public companion object
}

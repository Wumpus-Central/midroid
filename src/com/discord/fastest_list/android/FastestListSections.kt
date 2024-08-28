package com.discord.fastest_list.android

import fh.p
import kotlin.jvm.internal.r

internal class FastestListSections(sectionsVersioned: com.discord.fastest_list.android.FastestListSections.Versioned) {
   private final var sectionEntries: List<com.discord.fastest_list.android.FastestListSections.Entry>
   private final var sectionOffsetAtPosition: List<Int>
   private final var sectionsCumulativeSize: Int
   private final var sectionsId: String

   init {
      r.h(var1, "sectionsVersioned");
      super();
      this.sectionsId = var1.getSectionsId();
      this.sectionEntries = var1.getSectionEntries();
      this.sectionsCumulativeSize = var1.getSectionsCumulativeSize();
      this.sectionOffsetAtPosition = var1.getSectionOffsetAtPosition();
   }

   public fun getId(): String {
      return this.sectionsId;
   }

   public fun getItem(position: Int): com.discord.fastest_list.android.FastestListSections.Entry {
      return this.sectionEntries.get(var1);
   }

   public fun getItemAtPosition(position: Int, atEnd: Boolean): com.discord.fastest_list.android.FastestListSections.Entry.SectionItem {
      var var4: FastestListSections.Entry = this.sectionEntries.get(var1);
      val var3: Boolean = var4 is FastestListSections.Entry.ListHeader;
      var var7: Any = null;
      var var6: Any = null;
      var var12: FastestListSections.Entry.SectionItem;
      if (var3) {
         var7 = h.j(this.sectionEntries).iterator();

         var var5: FastestListSections.Entry.SectionItem;
         while (true) {
            var5 = (FastestListSections.Entry.SectionItem)var6;
            if (!var7.hasNext()) {
               break;
            }

            var4 = this.sectionEntries.get((var7 as p).nextInt());
            val var11: FastestListSections.Entry.SectionItem;
            if (var4 is FastestListSections.Entry.SectionItem) {
               var11 = var4 as FastestListSections.Entry.SectionItem;
            } else {
               var11 = null;
            }

            if (var11 != null) {
               var5 = var11;
               break;
            }
         }

         var12 = var5;
         if (var5 == null) {
            var12 = FastestListSections.Entry.SectionItem.Companion.getDefaultItem(var2);
         }
      } else if (var4 is FastestListSections.Entry.ListFooter) {
         var6 = vh.h.o(h.j(this.sectionEntries)).iterator();

         var var17: FastestListSections.Entry.SectionItem;
         while (true) {
            var17 = (FastestListSections.Entry.SectionItem)var7;
            if (!var6.hasNext()) {
               break;
            }

            var4 = this.sectionEntries.get((var6 as p).nextInt());
            val var14: FastestListSections.Entry.SectionItem;
            if (var4 is FastestListSections.Entry.SectionItem) {
               var14 = var4 as FastestListSections.Entry.SectionItem;
            } else {
               var14 = null;
            }

            if (var14 != null) {
               var17 = var14;
               break;
            }
         }

         var12 = var17;
         if (var17 == null) {
            var12 = FastestListSections.Entry.SectionItem.Companion.getDefaultItem(var2);
         }
      } else if (var4 is FastestListSections.Entry.SectionHeader) {
         var4 = this.sectionEntries.get(var1 + 1);
         r.f(var4, "null cannot be cast to non-null type com.discord.fastest_list.android.FastestListSections.Entry.SectionItem");
         var12 = var4 as FastestListSections.Entry.SectionItem;
      } else if (var4 is FastestListSections.Entry.SectionFooter) {
         var4 = this.sectionEntries.get(var1 - 1);
         r.f(var4, "null cannot be cast to non-null type com.discord.fastest_list.android.FastestListSections.Entry.SectionItem");
         var12 = var4 as FastestListSections.Entry.SectionItem;
      } else {
         if (var4 !is FastestListSections.Entry.SectionItem) {
            throw new eh.p();
         }

         var12 = var4 as FastestListSections.Entry.SectionItem;
      }

      return var12;
   }

   public fun getItemCount(): Int {
      return this.sectionEntries.size();
   }

   public fun getItemCumulativeSize(): Int {
      return this.sectionsCumulativeSize;
   }

   public fun getItemOffset(position: Int): Int {
      return this.sectionOffsetAtPosition.get(var1).intValue();
   }

   public fun getItemPosition(offset: Int): Int {
      val var3: Int = this.sectionOffsetAtPosition.size();

      for (int var2 = 0; var2 < var3; var2++) {
         if (var1 <= this.sectionOffsetAtPosition.get(var2).intValue()) {
            return var2;
         }
      }

      val var4: StringBuilder = new StringBuilder();
      var4.append("Invalid offset ");
      var4.append(var1);
      var4.append(", out of bounds of sections.");
      throw new IllegalStateException(var4.toString().toString());
   }

   public fun getItemPosition(
      section: com.discord.fastest_list.android.FastestListSections.Section,
      item: com.discord.fastest_list.android.FastestListSections.Item
   ): Int? {
      val var6: java.util.Iterator = this.sectionEntries.iterator();
      var var3: Int = 0;

      while (true) {
         if (!var6.hasNext()) {
            var3 = -1;
            break;
         }

         val var5: FastestListSections.Entry = var6.next() as FastestListSections.Entry;
         val var4: Boolean;
         if (var5 is FastestListSections.Entry.SectionItem
            && FastestListSections.Item.equals-impl0((var5 as FastestListSections.Entry.SectionItem).getItem-JXkbwXs(), var2)
            && FastestListSections.Section.equals-impl0(var5.getSection-sZRFyWU(), var1)) {
            var4 = true;
         } else {
            var4 = false;
         }

         if (var4) {
            break;
         }

         var3++;
      }

      return if (var3 == -1) null else var3;
   }

   public fun getItemSizeAverage(): Int {
      val var1: Int;
      if (this.sectionEntries.isEmpty() xor true) {
         var1 = this.sectionsCumulativeSize / this.sectionEntries.size();
      } else {
         var1 = 0;
      }

      return var1;
   }

   public fun getItemViewType(position: Int): Int {
      val var2: FastestListSections.Entry = this.sectionEntries.get(var1);
      val var3: Byte;
      if (var2 is FastestListSections.Entry.SectionHeader) {
         var3 = 1;
      } else if (var2 is FastestListSections.Entry.SectionFooter) {
         var3 = 2;
      } else if (var2 is FastestListSections.Entry.SectionItem) {
         var3 = 0;
      } else if (var2 is FastestListSections.Entry.ListFooter) {
         var3 = 4;
      } else {
         if (var2 !is FastestListSections.Entry.ListHeader) {
            throw new eh.p();
         }

         var3 = 3;
      }

      return var3;
   }

   public fun setSectionsVersioned(sectionsVersioned: com.discord.fastest_list.android.FastestListSections.Versioned): Boolean {
      r.h(var1, "sectionsVersioned");
      if (!r.c(this.sectionsId, var1.getSectionsId())) {
         this.sectionsId = var1.getSectionsId();
         this.sectionEntries = var1.getSectionEntries();
         this.sectionsCumulativeSize = var1.getSectionsCumulativeSize();
         this.sectionOffsetAtPosition = var1.getSectionOffsetAtPosition();
         return true;
      } else {
         return false;
      }
   }

   public companion object {
      public const val VIEW_TYPE_ITEM: Int
      public const val VIEW_TYPE_LIST_FOOTER: Int
      public const val VIEW_TYPE_LIST_HEADER: Int
      public const val VIEW_TYPE_SECTION_FOOTER: Int
      public const val VIEW_TYPE_SECTION_HEADER: Int
   }

   public sealed class Entry protected constructor() {
      public abstract val key: String
      public abstract val section: com.discord.fastest_list.android.FastestListSections.Section
      public abstract val size: Int

      public data class ListFooter(key: String, section: com.discord.fastest_list.android.FastestListSections.Section, size: Int) : FastestListSections.Entry.ListFooter(
            var1, var2, var3
         ) {
         public open val key: String
         public open val section: com.discord.fastest_list.android.FastestListSections.Section
         public open val size: Int

         fun ListFooter(var1: java.lang.String, var2: Int, var3: Int) {
            super(null);
            this.key = var1;
            this.section = var2;
            this.size = var3;
         }

         public operator fun component1(): String {
            return this.getKey();
         }

         public operator fun component2(): com.discord.fastest_list.android.FastestListSections.Section {
            return this.getSection-sZRFyWU();
         }

         public operator fun component3(): Int {
            return this.getSize();
         }

         public fun copy(key: String = ..., section: com.discord.fastest_list.android.FastestListSections.Section = ..., size: Int = ...): com.discord.fastest_list.android.FastestListSections.Entry.ListFooter {
            r.h(var1, "key");
            return new FastestListSections.Entry.ListFooter(var1, var2, var3, null);
         }

         public override operator fun equals(other: Any?): Boolean {
            if (this === var1) {
               return true;
            } else if (var1 !is FastestListSections.Entry.ListFooter) {
               return false;
            } else {
               var1 = var1;
               if (!r.c(this.getKey(), var1.getKey())) {
                  return false;
               } else if (!FastestListSections.Section.equals-impl0(this.getSection-sZRFyWU(), var1.getSection-sZRFyWU())) {
                  return false;
               } else {
                  return this.getSize() == var1.getSize();
               }
            }
         }

         public override fun hashCode(): Int {
            return (this.getKey().hashCode() * 31 + FastestListSections.Section.hashCode-impl(this.getSection-sZRFyWU())) * 31
               + Integer.hashCode(this.getSize());
         }

         public override fun toString(): String {
            val var2: java.lang.String = this.getKey();
            val var4: java.lang.String = FastestListSections.Section.toString-impl(this.getSection-sZRFyWU());
            val var1: Int = this.getSize();
            val var3: StringBuilder = new StringBuilder();
            var3.append("ListFooter(key=");
            var3.append(var2);
            var3.append(", section=");
            var3.append(var4);
            var3.append(", size=");
            var3.append(var1);
            var3.append(")");
            return var3.toString();
         }

         public companion object {
            public fun createKey(listId: String, customKey: String): String {
               r.h(var1, "listId");
               r.h(var2, "customKey");
               var var3: java.lang.String = var2;
               if (f.x(var2)) {
                  var3 = "lf";
               }

               val var4: StringBuilder = new StringBuilder();
               var4.append(var1);
               var4.append("-");
               var4.append((Object)var3);
               return var4.toString();
            }
         }
      }

      public data class ListHeader(key: String, section: com.discord.fastest_list.android.FastestListSections.Section, size: Int) : FastestListSections.Entry.ListHeader(
            var1, var2, var3
         ) {
         public open val key: String
         public open val section: com.discord.fastest_list.android.FastestListSections.Section
         public open val size: Int

         fun ListHeader(var1: java.lang.String, var2: Int, var3: Int) {
            super(null);
            this.key = var1;
            this.section = var2;
            this.size = var3;
         }

         public operator fun component1(): String {
            return this.getKey();
         }

         public operator fun component2(): com.discord.fastest_list.android.FastestListSections.Section {
            return this.getSection-sZRFyWU();
         }

         public operator fun component3(): Int {
            return this.getSize();
         }

         public fun copy(key: String = ..., section: com.discord.fastest_list.android.FastestListSections.Section = ..., size: Int = ...): com.discord.fastest_list.android.FastestListSections.Entry.ListHeader {
            r.h(var1, "key");
            return new FastestListSections.Entry.ListHeader(var1, var2, var3, null);
         }

         public override operator fun equals(other: Any?): Boolean {
            if (this === var1) {
               return true;
            } else if (var1 !is FastestListSections.Entry.ListHeader) {
               return false;
            } else {
               var1 = var1;
               if (!r.c(this.getKey(), var1.getKey())) {
                  return false;
               } else if (!FastestListSections.Section.equals-impl0(this.getSection-sZRFyWU(), var1.getSection-sZRFyWU())) {
                  return false;
               } else {
                  return this.getSize() == var1.getSize();
               }
            }
         }

         public override fun hashCode(): Int {
            return (this.getKey().hashCode() * 31 + FastestListSections.Section.hashCode-impl(this.getSection-sZRFyWU())) * 31
               + Integer.hashCode(this.getSize());
         }

         public override fun toString(): String {
            val var3: java.lang.String = this.getKey();
            val var2: java.lang.String = FastestListSections.Section.toString-impl(this.getSection-sZRFyWU());
            val var1: Int = this.getSize();
            val var4: StringBuilder = new StringBuilder();
            var4.append("ListHeader(key=");
            var4.append(var3);
            var4.append(", section=");
            var4.append(var2);
            var4.append(", size=");
            var4.append(var1);
            var4.append(")");
            return var4.toString();
         }

         public companion object {
            public fun createKey(listId: String, customKey: String): String {
               r.h(var1, "listId");
               r.h(var2, "customKey");
               var var3: java.lang.String = var2;
               if (f.x(var2)) {
                  var3 = "lh";
               }

               val var4: StringBuilder = new StringBuilder();
               var4.append(var1);
               var4.append("-");
               var4.append((Object)var3);
               return var4.toString();
            }
         }
      }

      public data class SectionFooter(key: String, section: com.discord.fastest_list.android.FastestListSections.Section, size: Int) : FastestListSections.Entry.SectionFooter(
            var1, var2, var3
         ) {
         public open val key: String
         public open val section: com.discord.fastest_list.android.FastestListSections.Section
         public open val size: Int

         fun SectionFooter(var1: java.lang.String, var2: Int, var3: Int) {
            super(null);
            this.key = var1;
            this.section = var2;
            this.size = var3;
         }

         public operator fun component1(): String {
            return this.getKey();
         }

         public operator fun component2(): com.discord.fastest_list.android.FastestListSections.Section {
            return this.getSection-sZRFyWU();
         }

         public operator fun component3(): Int {
            return this.getSize();
         }

         public fun copy(key: String = ..., section: com.discord.fastest_list.android.FastestListSections.Section = ..., size: Int = ...): com.discord.fastest_list.android.FastestListSections.Entry.SectionFooter {
            r.h(var1, "key");
            return new FastestListSections.Entry.SectionFooter(var1, var2, var3, null);
         }

         public override operator fun equals(other: Any?): Boolean {
            if (this === var1) {
               return true;
            } else if (var1 !is FastestListSections.Entry.SectionFooter) {
               return false;
            } else {
               var1 = var1;
               if (!r.c(this.getKey(), var1.getKey())) {
                  return false;
               } else if (!FastestListSections.Section.equals-impl0(this.getSection-sZRFyWU(), var1.getSection-sZRFyWU())) {
                  return false;
               } else {
                  return this.getSize() == var1.getSize();
               }
            }
         }

         public override fun hashCode(): Int {
            return (this.getKey().hashCode() * 31 + FastestListSections.Section.hashCode-impl(this.getSection-sZRFyWU())) * 31
               + Integer.hashCode(this.getSize());
         }

         public override fun toString(): String {
            val var3: java.lang.String = this.getKey();
            val var2: java.lang.String = FastestListSections.Section.toString-impl(this.getSection-sZRFyWU());
            val var1: Int = this.getSize();
            val var4: StringBuilder = new StringBuilder();
            var4.append("SectionFooter(key=");
            var4.append(var3);
            var4.append(", section=");
            var4.append(var2);
            var4.append(", size=");
            var4.append(var1);
            var4.append(")");
            return var4.toString();
         }

         public companion object {
            public fun createKey(listId: String, sectionIndex: Int, sectionFooterKey: String?): String {
               r.h(var1, "listId");
               val var4: Boolean;
               if (var3 != null && !f.x(var3)) {
                  var4 = false;
               } else {
                  var4 = true;
               }

               if (var4) {
                  val var7: StringBuilder = new StringBuilder();
                  var7.append(var1);
                  var7.append("-sf");
                  var7.append(var2);
                  var1 = var7.toString();
               } else {
                  val var5: StringBuilder = new StringBuilder();
                  var5.append(var1);
                  var5.append("-");
                  var5.append(var3);
                  var1 = var5.toString();
               }

               return var1;
            }
         }
      }

      public data class SectionHeader(key: String, section: com.discord.fastest_list.android.FastestListSections.Section, size: Int) : FastestListSections.Entry.SectionHeader(
            var1, var2, var3
         ) {
         public open val key: String
         public open val section: com.discord.fastest_list.android.FastestListSections.Section
         public open val size: Int

         fun SectionHeader(var1: java.lang.String, var2: Int, var3: Int) {
            super(null);
            this.key = var1;
            this.section = var2;
            this.size = var3;
         }

         public operator fun component1(): String {
            return this.getKey();
         }

         public operator fun component2(): com.discord.fastest_list.android.FastestListSections.Section {
            return this.getSection-sZRFyWU();
         }

         public operator fun component3(): Int {
            return this.getSize();
         }

         public fun copy(key: String = ..., section: com.discord.fastest_list.android.FastestListSections.Section = ..., size: Int = ...): com.discord.fastest_list.android.FastestListSections.Entry.SectionHeader {
            r.h(var1, "key");
            return new FastestListSections.Entry.SectionHeader(var1, var2, var3, null);
         }

         public override operator fun equals(other: Any?): Boolean {
            if (this === var1) {
               return true;
            } else if (var1 !is FastestListSections.Entry.SectionHeader) {
               return false;
            } else {
               var1 = var1;
               if (!r.c(this.getKey(), var1.getKey())) {
                  return false;
               } else if (!FastestListSections.Section.equals-impl0(this.getSection-sZRFyWU(), var1.getSection-sZRFyWU())) {
                  return false;
               } else {
                  return this.getSize() == var1.getSize();
               }
            }
         }

         public override fun hashCode(): Int {
            return (this.getKey().hashCode() * 31 + FastestListSections.Section.hashCode-impl(this.getSection-sZRFyWU())) * 31
               + Integer.hashCode(this.getSize());
         }

         public override fun toString(): String {
            val var2: java.lang.String = this.getKey();
            val var4: java.lang.String = FastestListSections.Section.toString-impl(this.getSection-sZRFyWU());
            val var1: Int = this.getSize();
            val var3: StringBuilder = new StringBuilder();
            var3.append("SectionHeader(key=");
            var3.append(var2);
            var3.append(", section=");
            var3.append(var4);
            var3.append(", size=");
            var3.append(var1);
            var3.append(")");
            return var3.toString();
         }

         public companion object {
            public fun createKey(listId: String, sectionIndex: Int, sectionHeaderKey: String?): String {
               r.h(var1, "listId");
               val var4: Boolean;
               if (var3 != null && !f.x(var3)) {
                  var4 = false;
               } else {
                  var4 = true;
               }

               if (var4) {
                  val var7: StringBuilder = new StringBuilder();
                  var7.append(var1);
                  var7.append("-sh");
                  var7.append(var2);
                  var1 = var7.toString();
               } else {
                  val var5: StringBuilder = new StringBuilder();
                  var5.append(var1);
                  var5.append("-");
                  var5.append(var3);
                  var1 = var5.toString();
               }

               return var1;
            }
         }
      }

      public data class SectionItem(key: String,
         section: com.discord.fastest_list.android.FastestListSections.Section = ...,
         item: com.discord.fastest_list.android.FastestListSections.Item = ...,
         size: Int = ...,
         atFront: Boolean = ...,
         atRear: Boolean = ...
      ) : FastestListSections.Entry.SectionItem(var1, var2, var3, var4, var5, var6) {
         public final val atFront: Boolean
         public final val atRear: Boolean
         public final val item: com.discord.fastest_list.android.FastestListSections.Item
         public open val key: String
         public open val section: com.discord.fastest_list.android.FastestListSections.Section
         public open val size: Int

         fun SectionItem(var1: java.lang.String, var2: Int, var3: Int, var4: Int, var5: Boolean, var6: Boolean) {
            super(null);
            this.key = var1;
            this.section = var2;
            this.item = var3;
            this.size = var4;
            this.atFront = var5;
            this.atRear = var6;
         }

         public operator fun component1(): String {
            return this.getKey();
         }

         public operator fun component2(): com.discord.fastest_list.android.FastestListSections.Section {
            return this.getSection-sZRFyWU();
         }

         public operator fun component3(): com.discord.fastest_list.android.FastestListSections.Item {
            return this.item;
         }

         public operator fun component4(): Int {
            return this.getSize();
         }

         public operator fun component5(): Boolean {
            return this.atFront;
         }

         public operator fun component6(): Boolean {
            return this.atRear;
         }

         public fun copy(
            key: String = ...,
            section: com.discord.fastest_list.android.FastestListSections.Section = ...,
            item: com.discord.fastest_list.android.FastestListSections.Item = ...,
            size: Int = ...,
            atFront: Boolean = ...,
            atRear: Boolean = ...
         ): com.discord.fastest_list.android.FastestListSections.Entry.SectionItem {
            r.h(var1, "key");
            return new FastestListSections.Entry.SectionItem(var1, var2, var3, var4, var5, var6, null);
         }

         public override operator fun equals(other: Any?): Boolean {
            if (this === var1) {
               return true;
            } else if (var1 !is FastestListSections.Entry.SectionItem) {
               return false;
            } else {
               var1 = var1;
               if (!r.c(this.getKey(), var1.getKey())) {
                  return false;
               } else if (!FastestListSections.Section.equals-impl0(this.getSection-sZRFyWU(), var1.getSection-sZRFyWU())) {
                  return false;
               } else if (!FastestListSections.Item.equals-impl0(this.item, var1.item)) {
                  return false;
               } else if (this.getSize() != var1.getSize()) {
                  return false;
               } else if (this.atFront != var1.atFront) {
                  return false;
               } else {
                  return this.atRear == var1.atRear;
               }
            }
         }

         public override fun hashCode(): Int {
            val var7: Int = this.getKey().hashCode();
            val var6: Int = FastestListSections.Section.hashCode-impl(this.getSection-sZRFyWU());
            val var5: Int = FastestListSections.Item.hashCode-impl(this.item);
            val var4: Int = Integer.hashCode(this.getSize());
            var var2: Byte = 1;
            var var1: Byte = this.atFront;
            if (this.atFront != 0) {
               var1 = 1;
            }

            if (this.atRear == 0) {
               var2 = this.atRear;
            }

            return ((((var7 * 31 + var6) * 31 + var5) * 31 + var4) * 31 + var1) * 31 + var2;
         }

         public override fun toString(): String {
            val var5: java.lang.String = this.getKey();
            val var6: java.lang.String = FastestListSections.Section.toString-impl(this.getSection-sZRFyWU());
            val var7: java.lang.String = FastestListSections.Item.toString-impl(this.item);
            val var1: Int = this.getSize();
            val var3: Boolean = this.atFront;
            val var2: Boolean = this.atRear;
            val var4: StringBuilder = new StringBuilder();
            var4.append("SectionItem(key=");
            var4.append(var5);
            var4.append(", section=");
            var4.append(var6);
            var4.append(", item=");
            var4.append(var7);
            var4.append(", size=");
            var4.append(var1);
            var4.append(", atFront=");
            var4.append(var3);
            var4.append(", atRear=");
            var4.append(var2);
            var4.append(")");
            return var4.toString();
         }

         public companion object {
            private final val DEFAULT_AT_END: com.discord.fastest_list.android.FastestListSections.Entry.SectionItem
            private final val DEFAULT_AT_START: com.discord.fastest_list.android.FastestListSections.Entry.SectionItem

            public fun createKey(listId: String, sectionIndex: Int, sectionItemIndex: Int, sectionItemKey: String?): String {
               r.h(var1, "listId");
               val var5: Boolean;
               if (var4 != null && !f.x(var4)) {
                  var5 = false;
               } else {
                  var5 = true;
               }

               if (var5) {
                  val var8: StringBuilder = new StringBuilder();
                  var8.append(var1);
                  var8.append("-s");
                  var8.append(var2);
                  var8.append("-i");
                  var8.append(var3);
                  var1 = var8.toString();
               } else {
                  val var6: StringBuilder = new StringBuilder();
                  var6.append(var1);
                  var6.append("-");
                  var6.append(var4);
                  var1 = var6.toString();
               }

               return var1;
            }

            public fun getDefaultItem(atEnd: Boolean): com.discord.fastest_list.android.FastestListSections.Entry.SectionItem {
               val var2: FastestListSections.Entry.SectionItem;
               if (var1) {
                  var2 = FastestListSections.Entry.SectionItem.access$getDEFAULT_AT_END$cp();
               } else {
                  var2 = FastestListSections.Entry.SectionItem.access$getDEFAULT_AT_START$cp();
               }

               return var2;
            }
         }
      }
   }

   public inline class Item {
      public final val value: Int

      @JvmStatic
      fun `constructor-impl`(var0: Int): Int {
         return var0;
      }

      @JvmStatic
      public open operator fun equals(other: Any?): Boolean {
         if (var1 !is FastestListSections.Item) {
            return false;
         } else {
            return var0 == (var1 as FastestListSections.Item).unbox-impl();
         }
      }

      @JvmStatic
      fun `equals-impl0`(var0: Int, var1: Int): Boolean {
         val var2: Boolean;
         if (var0 == var1) {
            var2 = true;
         } else {
            var2 = false;
         }

         return var2;
      }

      @JvmStatic
      public open fun hashCode(): Int {
         return Integer.hashCode(var0);
      }

      @JvmStatic
      public open fun toString(): String {
         val var1: StringBuilder = new StringBuilder();
         var1.append("Item(value=");
         var1.append(var0);
         var1.append(")");
         return var1.toString();
      }

      override fun equals(var1: Any): Boolean {
         return equals-impl(this.value, var1);
      }

      override fun hashCode(): Int {
         return hashCode-impl(this.value);
      }

      override fun toString(): java.lang.String {
         return toString-impl(this.value);
      }
   }

   public inline class Section {
      public final val value: Int

      @JvmStatic
      fun `constructor-impl`(var0: Int): Int {
         return var0;
      }

      @JvmStatic
      public open operator fun equals(other: Any?): Boolean {
         if (var1 !is FastestListSections.Section) {
            return false;
         } else {
            return var0 == (var1 as FastestListSections.Section).unbox-impl();
         }
      }

      @JvmStatic
      fun `equals-impl0`(var0: Int, var1: Int): Boolean {
         val var2: Boolean;
         if (var0 == var1) {
            var2 = true;
         } else {
            var2 = false;
         }

         return var2;
      }

      @JvmStatic
      public open fun hashCode(): Int {
         return Integer.hashCode(var0);
      }

      @JvmStatic
      public open fun toString(): String {
         val var1: StringBuilder = new StringBuilder();
         var1.append("Section(value=");
         var1.append(var0);
         var1.append(")");
         return var1.toString();
      }

      override fun equals(var1: Any): Boolean {
         return equals-impl(this.value, var1);
      }

      override fun hashCode(): Int {
         return hashCode-impl(this.value);
      }

      override fun toString(): java.lang.String {
         return toString-impl(this.value);
      }
   }

   public data class Versioned(sectionsId: String,
      sectionEntries: List<com.discord.fastest_list.android.FastestListSections.Entry>,
      sectionsCumulativeSize: Int,
      sectionOffsetAtPosition: List<Int>
   ) {
      public final val sectionEntries: List<com.discord.fastest_list.android.FastestListSections.Entry>
      public final val sectionOffsetAtPosition: List<Int>
      public final val sectionsCumulativeSize: Int
      public final val sectionsId: String

      init {
         r.h(var1, "sectionsId");
         r.h(var2, "sectionEntries");
         r.h(var4, "sectionOffsetAtPosition");
         super();
         this.sectionsId = var1;
         this.sectionEntries = var2;
         this.sectionsCumulativeSize = var3;
         this.sectionOffsetAtPosition = var4;
      }

      public operator fun component1(): String {
         return this.sectionsId;
      }

      public operator fun component2(): List<com.discord.fastest_list.android.FastestListSections.Entry> {
         return this.sectionEntries;
      }

      public operator fun component3(): Int {
         return this.sectionsCumulativeSize;
      }

      public operator fun component4(): List<Int> {
         return this.sectionOffsetAtPosition;
      }

      public fun copy(
         sectionsId: String = var0.sectionsId,
         sectionEntries: List<com.discord.fastest_list.android.FastestListSections.Entry> = var0.sectionEntries,
         sectionsCumulativeSize: Int = var0.sectionsCumulativeSize,
         sectionOffsetAtPosition: List<Int> = var0.sectionOffsetAtPosition
      ): com.discord.fastest_list.android.FastestListSections.Versioned {
         r.h(var1, "sectionsId");
         r.h(var2, "sectionEntries");
         r.h(var4, "sectionOffsetAtPosition");
         return new FastestListSections.Versioned(var1, var2, var3, var4);
      }

      public override operator fun equals(other: Any?): Boolean {
         if (this === var1) {
            return true;
         } else if (var1 !is FastestListSections.Versioned) {
            return false;
         } else {
            var1 = var1;
            if (!r.c(this.sectionsId, var1.sectionsId)) {
               return false;
            } else if (!r.c(this.sectionEntries, var1.sectionEntries)) {
               return false;
            } else if (this.sectionsCumulativeSize != var1.sectionsCumulativeSize) {
               return false;
            } else {
               return r.c(this.sectionOffsetAtPosition, var1.sectionOffsetAtPosition);
            }
         }
      }

      public override fun hashCode(): Int {
         return ((this.sectionsId.hashCode() * 31 + this.sectionEntries.hashCode()) * 31 + Integer.hashCode(this.sectionsCumulativeSize)) * 31
            + this.sectionOffsetAtPosition.hashCode();
      }

      public override fun toString(): String {
         val var2: java.lang.String = this.sectionsId;
         val var4: java.util.List = this.sectionEntries;
         val var1: Int = this.sectionsCumulativeSize;
         val var5: java.util.List = this.sectionOffsetAtPosition;
         val var3: StringBuilder = new StringBuilder();
         var3.append("Versioned(sectionsId=");
         var3.append(var2);
         var3.append(", sectionEntries=");
         var3.append(var4);
         var3.append(", sectionsCumulativeSize=");
         var3.append(var1);
         var3.append(", sectionOffsetAtPosition=");
         var3.append(var5);
         var3.append(")");
         return var3.toString();
      }

      public companion object
   }
}

package com.discord.emoji_picker

import com.discord.misc.utilities.ids.IdUtilsKt
import java.util.LinkedHashMap
import kh.l
import kh.p
import kotlin.jvm.functions.Function0
import kotlin.jvm.internal.q

internal class EmojiPickerItemData(coreData: com.discord.emoji_picker.EmojiPickerItemData.CoreData) {
   private final var coreData: com.discord.emoji_picker.EmojiPickerItemData.CoreData
   private final var emojisUnset: Boolean
   private final var emojis: List<EmojiPickerItem>
   private final var emojisUnicode: List<EmojiPickerItem>
   private final val dataSets: Array<List<EmojiPickerItem>>

   init {
      q.h(var1, "coreData");
      super();
      this.coreData = var1;
      this.emojisUnset = true;
      this.emojis = i.k();
      this.emojisUnicode = i.k();
      this.dataSets = new java.util.List[]{
         this.coreData.getLeading(), this.coreData.getEmojisPlaceholderList(), this.coreData.getEmojisUnicodePlaceholderList(), this.coreData.getTrailing()
      };
   }

   public fun getItem(position: Int): EmojiPickerItem {
      val var6: Array<java.util.List> = this.dataSets;
      val var4: Int = this.dataSets.length;
      var var2: Int = 0;

      for (int var3 = 0; var2 < var4; var2++) {
         val var5: java.util.List = var6[var2];
         if (var1 < var6[var2].size() + var3) {
            return var5.get(var1 - var3) as EmojiPickerItem;
         }

         var3 += var5.size();
      }

      val var7: StringBuilder = new StringBuilder();
      var7.append("No item at position ");
      var7.append(var1);
      throw new IndexOutOfBoundsException(var7.toString());
   }

   public fun getItemCount(): Int {
      val var4: Array<java.util.List> = this.dataSets;
      val var3: Int = this.dataSets.length;
      var var2: Int = 0;

      var var1: Int;
      for (var1 = 0; var2 < var3; var2++) {
         var1 += var4[var2].size();
      }

      return var1;
   }

   public fun getItemIndex(position: Int): Int? {
      val var2: EmojiPickerItem = this.getItem(var1);
      if (var2 is EmojiPickerItem.Category) {
         return this.coreData.getCategoryIndices().get(var2.itemId());
      } else {
         var1 = var2.itemType();
         val var4: StringBuilder = new StringBuilder();
         var4.append("Unsupported item type ");
         var4.append(var1);
         throw new IllegalArgumentException(var4.toString());
      }
   }

   public fun getRowSize(): Int {
      return this.coreData.getRowSize();
   }

   public fun setCoreData(coreData: com.discord.emoji_picker.EmojiPickerItemData.CoreData, onChanged: () -> Unit) {
      q.h(var1, "coreData");
      q.h(var2, "onChanged");
      val var5: Array<java.util.List> = this.dataSets;
      var var3: java.util.List = var1.getLeading();
      var3.set(0, this.coreData.getLeading().get(0));
      var5[0] = var3;
      val var8: Array<java.util.List> = this.dataSets;
      var3 = var1.getTrailing();
      var3.set(i.m(var3), i.q0(this.coreData.getTrailing()));
      var8[3] = var3;
      if (var1.getHasSearchData()) {
         this.dataSets[1] = i.k();
         this.dataSets[2] = i.k();
      } else if (this.emojisUnset) {
         this.dataSets[1] = var1.getEmojisPlaceholderList();
         this.dataSets[2] = var1.getEmojisUnicodePlaceholderList();
      } else {
         this.dataSets[1] = this.emojis;
         this.dataSets[2] = this.emojisUnicode;
      }

      this.coreData = var1;
      var2.invoke();
   }

   public fun setEmojis(emojis: List<EmojiPickerItem>, emojisUnicode: List<EmojiPickerItem>, onChanged: () -> Unit) {
      q.h(var1, "emojis");
      q.h(var2, "emojisUnicode");
      q.h(var3, "onChanged");
      this.emojisUnset = false;
      this.emojis = var1;
      this.emojisUnicode = var2;
      this.dataSets[1] = var1;
      this.dataSets[2] = var2;
      var3.invoke();
   }

   public fun setSpacerBottomHeight(spacerBottomHeight: Int, onChanged: (Int) -> Unit) {
      q.h(var2, "onChanged");
      val var3: Any = i.q0(this.coreData.getTrailing());
      q.f(var3, "null cannot be cast to non-null type com.discord.emoji_picker.EmojiPickerItem.Spacer");
      if ((var3 as EmojiPickerItem.Spacer).getHeight() != var1) {
         this.coreData.getTrailing().set(i.m(this.coreData.getTrailing()), new EmojiPickerItem.Spacer("bottom", var1));
         var2.invoke(this.getItemCount() - 1);
      }
   }

   public fun setSpacerTopHeight(spacerTopHeight: Int, onChanged: (Int) -> Unit) {
      q.h(var2, "onChanged");
      val var3: Any = i.e0(this.coreData.getLeading());
      q.f(var3, "null cannot be cast to non-null type com.discord.emoji_picker.EmojiPickerItem.Spacer");
      if ((var3 as EmojiPickerItem.Spacer).getHeight() != var1) {
         this.coreData.getLeading().set(0, new EmojiPickerItem.Spacer("top", var1));
         var2.invoke(0);
      }
   }

   public companion object {
      private const val INDEX_EMOJIS: Int
      private const val INDEX_EMOJIS_UNICODE: Int
      private const val INDEX_LEADING: Int
      private const val INDEX_TRAILING: Int
   }

   public data class CoreData(rowSize: Int,
      hasGuildData: Boolean,
      hasSearchData: Boolean,
      hasPremiumInlineRoadblock: Boolean,
      leading: MutableList<EmojiPickerItem>,
      trailing: MutableList<EmojiPickerItem>,
      nativeSectionsEmojis: List<com.discord.emoji_picker.EmojiPickerItemData.CoreData.NativeSection.Guild>,
      nativeSectionsEmojisUnicode: List<com.discord.emoji_picker.EmojiPickerItemData.CoreData.NativeSection.Unicode>
   ) {
      public final val categoryIndices: MutableMap<Long, Int>
         public final get() {
            return this.categoryIndices$delegate.getValue() as MutableMap<java.lang.Long, Int>;
         }


      public final val emojisPlaceholderList: List<EmojiPickerItem>
         public final get() {
            return new EmojiPickerPlaceholderList(this.nativeSectionsEmojis, 0L);
         }


      public final val emojisUnicodePlaceholderList: List<EmojiPickerItem>
         public final get() {
            return new EmojiPickerPlaceholderList(this.nativeSectionsEmojisUnicode, 50000L);
         }


      public final val hasGuildData: Boolean
      public final val hasPremiumInlineRoadblock: Boolean
      public final val hasSearchData: Boolean
      public final val leading: MutableList<EmojiPickerItem>
      public final val nativeSectionsEmojis: List<com.discord.emoji_picker.EmojiPickerItemData.CoreData.NativeSection.Guild>
      public final val nativeSectionsEmojisUnicode: List<com.discord.emoji_picker.EmojiPickerItemData.CoreData.NativeSection.Unicode>
      public final val rowSize: Int
      public final val trailing: MutableList<EmojiPickerItem>

      init {
         q.h(var5, "leading");
         q.h(var6, "trailing");
         q.h(var7, "nativeSectionsEmojis");
         q.h(var8, "nativeSectionsEmojisUnicode");
         super();
         this.rowSize = var1;
         this.hasGuildData = var2;
         this.hasSearchData = var3;
         this.hasPremiumInlineRoadblock = var4;
         this.leading = var5;
         this.trailing = var6;
         this.nativeSectionsEmojis = var7;
         this.nativeSectionsEmojisUnicode = var8;
         this.categoryIndices$delegate = l.b(new Function0(this) {
            final EmojiPickerItemData.CoreData this$0;

            {
               super(0);
               this.this$0 = var1;
            }

            public final java.util.Map<java.lang.Long, Integer> invoke() {
               val var2: LinkedHashMap = new LinkedHashMap();
               val var3: EmojiPickerItemData.CoreData = this.this$0;
               val var4: java.util.Iterator = this.this$0.getLeading().iterator();
               var var1: Int = 0;

               while (var4.hasNext()) {
                  val var5: EmojiPickerItem = var4.next() as EmojiPickerItem;
                  if (var5 is EmojiPickerItem.Category) {
                     var2.put(IdUtilsKt.convertToId((var5 as EmojiPickerItem.Category).getTitle()), var1);
                     var1++;
                  }
               }

               for (java.util.Iterator var7 = var3.getNativeSectionsEmojis().iterator(); var7.hasNext(); var1++) {
                  var2.put(java.lang.Long.parseLong((var7.next() as EmojiPickerItemData.CoreData.NativeSection.Guild).getGuildId()), var1);
               }

               for (java.util.Iterator var8 = var3.getNativeSectionsEmojisUnicode().iterator(); var8.hasNext(); var1++) {
                  var2.put(IdUtilsKt.convertToId((var8.next() as EmojiPickerItemData.CoreData.NativeSection.Unicode).getTitle()), var1);
               }

               for (EmojiPickerItem var6 : var3.getTrailing()) {
                  if (var6 is EmojiPickerItem.Category) {
                     var2.put(IdUtilsKt.convertToId((var6 as EmojiPickerItem.Category).getTitle()), var1);
                     var1++;
                  }
               }

               return var2;
            }
         });
      }

      public operator fun component1(): Int {
         return this.rowSize;
      }

      public operator fun component2(): Boolean {
         return this.hasGuildData;
      }

      public operator fun component3(): Boolean {
         return this.hasSearchData;
      }

      public operator fun component4(): Boolean {
         return this.hasPremiumInlineRoadblock;
      }

      public operator fun component5(): MutableList<EmojiPickerItem> {
         return this.leading;
      }

      public operator fun component6(): MutableList<EmojiPickerItem> {
         return this.trailing;
      }

      public operator fun component7(): List<com.discord.emoji_picker.EmojiPickerItemData.CoreData.NativeSection.Guild> {
         return this.nativeSectionsEmojis;
      }

      public operator fun component8(): List<com.discord.emoji_picker.EmojiPickerItemData.CoreData.NativeSection.Unicode> {
         return this.nativeSectionsEmojisUnicode;
      }

      public fun copy(
         rowSize: Int = var0.rowSize,
         hasGuildData: Boolean = var0.hasGuildData,
         hasSearchData: Boolean = var0.hasSearchData,
         hasPremiumInlineRoadblock: Boolean = var0.hasPremiumInlineRoadblock,
         leading: MutableList<EmojiPickerItem> = var0.leading,
         trailing: MutableList<EmojiPickerItem> = var0.trailing,
         nativeSectionsEmojis: List<com.discord.emoji_picker.EmojiPickerItemData.CoreData.NativeSection.Guild> = var0.nativeSectionsEmojis,
         nativeSectionsEmojisUnicode: List<com.discord.emoji_picker.EmojiPickerItemData.CoreData.NativeSection.Unicode> = var0.nativeSectionsEmojisUnicode
      ): com.discord.emoji_picker.EmojiPickerItemData.CoreData {
         q.h(var5, "leading");
         q.h(var6, "trailing");
         q.h(var7, "nativeSectionsEmojis");
         q.h(var8, "nativeSectionsEmojisUnicode");
         return new EmojiPickerItemData.CoreData(var1, var2, var3, var4, var5, var6, var7, var8);
      }

      public override operator fun equals(other: Any?): Boolean {
         if (this === var1) {
            return true;
         } else if (var1 !is EmojiPickerItemData.CoreData) {
            return false;
         } else {
            var1 = var1;
            if (this.rowSize != var1.rowSize) {
               return false;
            } else if (this.hasGuildData != var1.hasGuildData) {
               return false;
            } else if (this.hasSearchData != var1.hasSearchData) {
               return false;
            } else if (this.hasPremiumInlineRoadblock != var1.hasPremiumInlineRoadblock) {
               return false;
            } else if (!q.c(this.leading, var1.leading)) {
               return false;
            } else if (!q.c(this.trailing, var1.trailing)) {
               return false;
            } else if (!q.c(this.nativeSectionsEmojis, var1.nativeSectionsEmojis)) {
               return false;
            } else {
               return q.c(this.nativeSectionsEmojisUnicode, var1.nativeSectionsEmojisUnicode);
            }
         }
      }

      public override fun hashCode(): Int {
         return (
                  (
                           (
                                    (
                                             (
                                                      (Integer.hashCode(this.rowSize) * 31 + java.lang.Boolean.hashCode(this.hasGuildData)) * 31
                                                         + java.lang.Boolean.hashCode(this.hasSearchData)
                                                   )
                                                   * 31
                                                + java.lang.Boolean.hashCode(this.hasPremiumInlineRoadblock)
                                          )
                                          * 31
                                       + this.leading.hashCode()
                                 )
                                 * 31
                              + this.trailing.hashCode()
                        )
                        * 31
                     + this.nativeSectionsEmojis.hashCode()
               )
               * 31
            + this.nativeSectionsEmojisUnicode.hashCode();
      }

      public override fun toString(): String {
         val var1: Int = this.rowSize;
         val var3: Boolean = this.hasGuildData;
         val var2: Boolean = this.hasSearchData;
         val var4: Boolean = this.hasPremiumInlineRoadblock;
         val var8: java.util.List = this.leading;
         val var5: java.util.List = this.trailing;
         val var9: java.util.List = this.nativeSectionsEmojis;
         val var6: java.util.List = this.nativeSectionsEmojisUnicode;
         val var7: StringBuilder = new StringBuilder();
         var7.append("CoreData(rowSize=");
         var7.append(var1);
         var7.append(", hasGuildData=");
         var7.append(var3);
         var7.append(", hasSearchData=");
         var7.append(var2);
         var7.append(", hasPremiumInlineRoadblock=");
         var7.append(var4);
         var7.append(", leading=");
         var7.append(var8);
         var7.append(", trailing=");
         var7.append(var5);
         var7.append(", nativeSectionsEmojis=");
         var7.append(var9);
         var7.append(", nativeSectionsEmojisUnicode=");
         var7.append(var6);
         var7.append(")");
         return var7.toString();
      }

      public companion object

      public sealed class NativeSection protected constructor() {
         public fun getCount(): Int {
            val var1: Int;
            if (this is EmojiPickerItemData.CoreData.NativeSection.Guild) {
               var1 = (this as EmojiPickerItemData.CoreData.NativeSection.Guild).getEmojiCount();
            } else {
               if (this !is EmojiPickerItemData.CoreData.NativeSection.Unicode) {
                  throw new p();
               }

               var1 = (this as EmojiPickerItemData.CoreData.NativeSection.Unicode).getEmojiCount();
            }

            return var1;
         }

         public class Guild(guildId: String,
               guildName: String,
               emojiCount: Int,
               emojisDisabled: Set<Long>,
               isNitroLocked: Boolean,
               hasPremiumInlineRoadblockHeader: Boolean,
               hasPremiumInlineRoadblockFooter: Boolean
            )
            : EmojiPickerItemData.CoreData.NativeSection {
            public final val emojiCount: Int
            public final val emojisDisabled: Set<Long>
            public final val guildId: String
            public final val guildName: String
            public final val hasPremiumInlineRoadblockFooter: Boolean
            public final val hasPremiumInlineRoadblockHeader: Boolean
            public final val isNitroLocked: Boolean

            init {
               q.h(var1, "guildId");
               q.h(var2, "guildName");
               q.h(var4, "emojisDisabled");
               super(null);
               this.guildId = var1;
               this.guildName = var2;
               this.emojiCount = var3;
               this.emojisDisabled = var4;
               this.isNitroLocked = var5;
               this.hasPremiumInlineRoadblockHeader = var6;
               this.hasPremiumInlineRoadblockFooter = var7;
            }
         }

         public class Unicode(title: String, emojiCount: Int) : EmojiPickerItemData.CoreData.NativeSection {
            public final val emojiCount: Int
            public final val title: String

            init {
               q.h(var1, "title");
               super(null);
               this.title = var1;
               this.emojiCount = var2;
            }
         }
      }
   }
}

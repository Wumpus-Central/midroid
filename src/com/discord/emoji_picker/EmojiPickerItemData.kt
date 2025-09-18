package com.discord.emoji_picker

import com.discord.misc.utilities.ids.IdUtilsKt
import java.util.LinkedHashMap
import kotlin.jvm.internal.SourceDebugExtension

@SourceDebugExtension(["SMAP\nEmojiPickerItemData.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EmojiPickerItemData.kt\ncom/discord/emoji_picker/EmojiPickerItemData\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,183:1\n1#2:184\n*E\n"])
internal class EmojiPickerItemData(coreData: com.discord.emoji_picker.EmojiPickerItemData.CoreData) {
   private final var coreData: com.discord.emoji_picker.EmojiPickerItemData.CoreData
   private final var emojisUnset: Boolean
   private final var emojis: List<EmojiPickerItem>
   private final var emojisUnicode: List<EmojiPickerItem>
   private final val dataSets: Array<List<EmojiPickerItem>>

   init {
      this.coreData = var1;
      this.emojisUnset = true;
      this.emojis = CollectionsKt.k();
      this.emojisUnicode = CollectionsKt.k();
      this.dataSets = new java.util.List[]{
         this.coreData.getLeading(), this.coreData.getEmojisPlaceholderList(), this.coreData.getEmojisUnicodePlaceholderList(), this.coreData.getTrailing()
      };
   }

   public fun getItem(position: Int): EmojiPickerItem {
      val var6: Array<java.util.List> = this.dataSets;
      val var4: Int = this.dataSets.length;
      var var3: Int = 0;

      for (int var2 = 0; var3 < var4; var3++) {
         val var5: java.util.List = var6[var3];
         if (var1 < var6[var3].size() + var2) {
            return var5.get(var1 - var2) as EmojiPickerItem;
         }

         var2 += var5.size();
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
         return this.coreData.getCategoryIndices().get((var2 as EmojiPickerItem.Category).itemId());
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
      var var4: Array<java.util.List> = this.dataSets;
      var var3: java.util.List = var1.getLeading();
      var3.set(0, this.coreData.getLeading().get(0));
      var4[0] = var3;
      var4 = this.dataSets;
      var3 = var1.getTrailing();
      var3.set(CollectionsKt.m(var3), CollectionsKt.r0(this.coreData.getTrailing()));
      var4[3] = var3;
      if (var1.getHasSearchData()) {
         this.dataSets[1] = CollectionsKt.k();
         this.dataSets[2] = CollectionsKt.k();
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
      this.emojisUnset = false;
      this.emojis = var1;
      this.emojisUnicode = var2;
      this.dataSets[1] = var1;
      this.dataSets[2] = var2;
      var3.invoke();
   }

   public fun setSpacerBottomHeight(spacerBottomHeight: Int, onChanged: (Int) -> Unit) {
      val var3: Any = CollectionsKt.r0(this.coreData.getTrailing());
      if ((var3 as EmojiPickerItem.Spacer).getHeight() != var1) {
         this.coreData.getTrailing().set(CollectionsKt.m(this.coreData.getTrailing()), new EmojiPickerItem.Spacer("bottom", var1));
         var2.invoke(this.getItemCount() - 1);
      }
   }

   public fun setSpacerTopHeight(spacerTopHeight: Int, onChanged: (Int) -> Unit) {
      val var3: Any = CollectionsKt.h0(this.coreData.getLeading());
      if ((var3 as EmojiPickerItem.Spacer).getHeight() != var1) {
         this.coreData.getLeading().set(0, new EmojiPickerItem.Spacer("top", var1));
         var2.invoke(0);
      }
   }

   public companion object {
      private const val INDEX_LEADING: Int
      private const val INDEX_EMOJIS: Int
      private const val INDEX_EMOJIS_UNICODE: Int
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
      public final val rowSize: Int
      public final val hasGuildData: Boolean
      public final val hasSearchData: Boolean
      public final val hasPremiumInlineRoadblock: Boolean
      public final val leading: MutableList<EmojiPickerItem>
      public final val trailing: MutableList<EmojiPickerItem>
      public final val nativeSectionsEmojis: List<com.discord.emoji_picker.EmojiPickerItemData.CoreData.NativeSection.Guild>
      public final val nativeSectionsEmojisUnicode: List<com.discord.emoji_picker.EmojiPickerItemData.CoreData.NativeSection.Unicode>

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


      init {
         this.rowSize = var1;
         this.hasGuildData = var2;
         this.hasSearchData = var3;
         this.hasPremiumInlineRoadblock = var4;
         this.leading = var5;
         this.trailing = var6;
         this.nativeSectionsEmojis = var7;
         this.nativeSectionsEmojisUnicode = var8;
         this.categoryIndices$delegate = A9.j.b(new b(this));
      }

      @JvmStatic
      fun `categoryIndices_delegate$lambda$1`(var0: EmojiPickerItemData.CoreData): java.util.Map {
         val var2: LinkedHashMap = new LinkedHashMap();
         val var3: java.util.Iterator = var0.leading.iterator();
         var var1: Int = 0;

         while (var3.hasNext()) {
            val var4: EmojiPickerItem = var3.next() as EmojiPickerItem;
            if (var4 is EmojiPickerItem.Category) {
               var2.put(IdUtilsKt.convertToId((var4 as EmojiPickerItem.Category).getTitle()), var1);
               var1++;
            }
         }

         for (java.util.Iterator var6 = var0.nativeSectionsEmojis.iterator(); var6.hasNext(); var1++) {
            var2.put(java.lang.Long.parseLong((var6.next() as EmojiPickerItemData.CoreData.NativeSection.Guild).getGuildId()), var1);
         }

         for (java.util.Iterator var7 = var0.nativeSectionsEmojisUnicode.iterator(); var7.hasNext(); var1++) {
            var2.put(IdUtilsKt.convertToId((var7.next() as EmojiPickerItemData.CoreData.NativeSection.Unicode).getTitle()), var1);
         }

         for (EmojiPickerItem var8 : var0.trailing) {
            if (var8 is EmojiPickerItem.Category) {
               var2.put(IdUtilsKt.convertToId((var8 as EmojiPickerItem.Category).getTitle()), var1);
               var1++;
            }
         }

         return var2;
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
            } else if (!(this.leading == var1.leading)) {
               return false;
            } else if (!(this.trailing == var1.trailing)) {
               return false;
            } else if (!(this.nativeSectionsEmojis == var1.nativeSectionsEmojis)) {
               return false;
            } else {
               return this.nativeSectionsEmojisUnicode == var1.nativeSectionsEmojisUnicode;
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
         val var2: Boolean = this.hasGuildData;
         val var3: Boolean = this.hasSearchData;
         val var4: Boolean = this.hasPremiumInlineRoadblock;
         val var7: java.util.List = this.leading;
         val var8: java.util.List = this.trailing;
         val var5: java.util.List = this.nativeSectionsEmojis;
         val var9: java.util.List = this.nativeSectionsEmojisUnicode;
         val var6: StringBuilder = new StringBuilder();
         var6.append("CoreData(rowSize=");
         var6.append(var1);
         var6.append(", hasGuildData=");
         var6.append(var2);
         var6.append(", hasSearchData=");
         var6.append(var3);
         var6.append(", hasPremiumInlineRoadblock=");
         var6.append(var4);
         var6.append(", leading=");
         var6.append(var7);
         var6.append(", trailing=");
         var6.append(var8);
         var6.append(", nativeSectionsEmojis=");
         var6.append(var5);
         var6.append(", nativeSectionsEmojisUnicode=");
         var6.append(var9);
         var6.append(")");
         return var6.toString();
      }

      public companion object

      public sealed class NativeSection protected constructor() {
         public fun getCount(): Int {
            val var1: Int;
            if (this is EmojiPickerItemData.CoreData.NativeSection.Guild) {
               var1 = (this as EmojiPickerItemData.CoreData.NativeSection.Guild).getEmojiCount();
            } else {
               if (this !is EmojiPickerItemData.CoreData.NativeSection.Unicode) {
                  throw new A9.n();
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
         ) : EmojiPickerItemData.CoreData.NativeSection() {
            public final val guildId: String
            public final val guildName: String
            public final val emojiCount: Int
            public final val emojisDisabled: Set<Long>
            public final val isNitroLocked: Boolean
            public final val hasPremiumInlineRoadblockHeader: Boolean
            public final val hasPremiumInlineRoadblockFooter: Boolean

            init {
               this.guildId = var1;
               this.guildName = var2;
               this.emojiCount = var3;
               this.emojisDisabled = var4;
               this.isNitroLocked = var5;
               this.hasPremiumInlineRoadblockHeader = var6;
               this.hasPremiumInlineRoadblockFooter = var7;
            }
         }

         public class Unicode(title: String, emojiCount: Int) : EmojiPickerItemData.CoreData.NativeSection() {
            public final val title: String
            public final val emojiCount: Int

            init {
               this.title = var1;
               this.emojiCount = var2;
            }
         }
      }
   }
}

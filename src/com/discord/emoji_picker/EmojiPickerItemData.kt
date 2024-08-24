package com.discord.emoji_picker

import com.discord.misc.utilities.ids.IdUtilsKt
import eh.l
import eh.p
import java.util.LinkedHashMap
import kotlin.jvm.functions.Function0
import kotlin.jvm.internal.r

internal class EmojiPickerItemData(coreData: com.discord.emoji_picker.EmojiPickerItemData.CoreData) {
   private final var coreData: com.discord.emoji_picker.EmojiPickerItemData.CoreData
   private final var emojisUnset: Boolean
   private final var emojis: List<EmojiPickerItem>
   private final var emojisUnicode: List<EmojiPickerItem>
   private final val dataSets: Array<List<EmojiPickerItem>>

   init {
      r.h(var1, "coreData");
      super();
      this.coreData = var1;
      this.emojisUnset = true;
      this.emojis = h.i();
      this.emojisUnicode = h.i();
      this.dataSets = new java.util.List[]{
         this.coreData.getLeading(), this.coreData.getEmojisPlaceholderList(), this.coreData.getEmojisUnicodePlaceholderList(), this.coreData.getTrailing()
      };
   }

   public fun getItem(position: Int): EmojiPickerItem {
      val var5: Array<java.util.List> = this.dataSets;
      val var4: Int = this.dataSets.length;
      var var2: Int = 0;

      for (int var3 = 0; var2 < var4; var2++) {
         val var6: java.util.List = var5[var2];
         if (var1 < var5[var2].size() + var3) {
            return var6.get(var1 - var3) as EmojiPickerItem;
         }

         var3 += var6.size();
      }

      val var7: StringBuilder = new StringBuilder();
      var7.append("No item at position ");
      var7.append(var1);
      throw new IndexOutOfBoundsException(var7.toString());
   }

   public fun getItemCount(): Int {
      val var4: Array<java.util.List> = this.dataSets;
      val var3: Int = this.dataSets.length;
      var var1: Int = 0;

      var var2: Int;
      for (var2 = 0; var1 < var3; var1++) {
         var2 += var4[var1].size();
      }

      return var2;
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
      r.h(var1, "coreData");
      r.h(var2, "onChanged");
      var var3: Array<java.util.List> = this.dataSets;
      val var5: java.util.List = var1.getLeading();
      var5.set(0, this.coreData.getLeading().get(0));
      var3[0] = var5;
      var3 = this.dataSets;
      val var8: java.util.List = var1.getTrailing();
      var8.set(h.k(var8), h.m0(this.coreData.getTrailing()));
      var3[3] = var8;
      if (var1.getHasSearchData()) {
         this.dataSets[1] = h.i();
         this.dataSets[2] = h.i();
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
      r.h(var1, "emojis");
      r.h(var2, "emojisUnicode");
      r.h(var3, "onChanged");
      this.emojisUnset = false;
      this.emojis = var1;
      this.emojisUnicode = var2;
      this.dataSets[1] = var1;
      this.dataSets[2] = var2;
      var3.invoke();
   }

   public fun setSpacerBottomHeight(spacerBottomHeight: Int, onChanged: (Int) -> Unit) {
      r.h(var2, "onChanged");
      val var3: Any = h.m0(this.coreData.getTrailing());
      r.f(var3, "null cannot be cast to non-null type com.discord.emoji_picker.EmojiPickerItem.Spacer");
      if ((var3 as EmojiPickerItem.Spacer).getHeight() != var1) {
         this.coreData.getTrailing().set(h.k(this.coreData.getTrailing()), new EmojiPickerItem.Spacer("bottom", var1));
         var2.invoke(this.getItemCount() - 1);
      }
   }

   public fun setSpacerTopHeight(spacerTopHeight: Int, onChanged: (Int) -> Unit) {
      r.h(var2, "onChanged");
      val var3: Any = h.a0(this.coreData.getLeading());
      r.f(var3, "null cannot be cast to non-null type com.discord.emoji_picker.EmojiPickerItem.Spacer");
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
            return this.categoryIndices$delegate.getValue() as java.util.Map<java.lang.Long, Integer>;
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
         r.h(var5, "leading");
         r.h(var6, "trailing");
         r.h(var7, "nativeSectionsEmojis");
         r.h(var8, "nativeSectionsEmojisUnicode");
         super();
         this.rowSize = var1;
         this.hasGuildData = var2;
         this.hasSearchData = var3;
         this.hasPremiumInlineRoadblock = var4;
         this.leading = var5;
         this.trailing = var6;
         this.nativeSectionsEmojis = var7;
         this.nativeSectionsEmojisUnicode = var8;
         this.categoryIndices$delegate = l.b(new Function0<java.util.Map<java.lang.Long, Integer>>(this) {
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

               for (EmojiPickerItem var9 : var3.getTrailing()) {
                  if (var9 is EmojiPickerItem.Category) {
                     var2.put(IdUtilsKt.convertToId((var9 as EmojiPickerItem.Category).getTitle()), var1);
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
         r.h(var5, "leading");
         r.h(var6, "trailing");
         r.h(var7, "nativeSectionsEmojis");
         r.h(var8, "nativeSectionsEmojisUnicode");
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
            } else if (!r.c(this.leading, var1.leading)) {
               return false;
            } else if (!r.c(this.trailing, var1.trailing)) {
               return false;
            } else if (!r.c(this.nativeSectionsEmojis, var1.nativeSectionsEmojis)) {
               return false;
            } else {
               return r.c(this.nativeSectionsEmojisUnicode, var1.nativeSectionsEmojisUnicode);
            }
         }
      }

      public override fun hashCode(): Int {
         val var5: Int = Integer.hashCode(this.rowSize);
         var var3: Byte = 1;
         var var1: Byte = this.hasGuildData;
         if (this.hasGuildData != 0) {
            var1 = 1;
         }

         var var6: Byte = this.hasSearchData;
         if (this.hasSearchData != 0) {
            var6 = 1;
         }

         if (this.hasPremiumInlineRoadblock == 0) {
            var3 = this.hasPremiumInlineRoadblock;
         }

         return (
                  (((((var5 * 31 + var1) * 31 + var6) * 31 + var3) * 31 + this.leading.hashCode()) * 31 + this.trailing.hashCode()) * 31
                     + this.nativeSectionsEmojis.hashCode()
               )
               * 31
            + this.nativeSectionsEmojisUnicode.hashCode();
      }

      public override fun toString(): String {
         val var1: Int = this.rowSize;
         val var4: Boolean = this.hasGuildData;
         val var2: Boolean = this.hasSearchData;
         val var3: Boolean = this.hasPremiumInlineRoadblock;
         val var6: java.util.List = this.leading;
         val var7: java.util.List = this.trailing;
         val var8: java.util.List = this.nativeSectionsEmojis;
         val var9: java.util.List = this.nativeSectionsEmojisUnicode;
         val var5: StringBuilder = new StringBuilder();
         var5.append("CoreData(rowSize=");
         var5.append(var1);
         var5.append(", hasGuildData=");
         var5.append(var4);
         var5.append(", hasSearchData=");
         var5.append(var2);
         var5.append(", hasPremiumInlineRoadblock=");
         var5.append(var3);
         var5.append(", leading=");
         var5.append(var6);
         var5.append(", trailing=");
         var5.append(var7);
         var5.append(", nativeSectionsEmojis=");
         var5.append(var8);
         var5.append(", nativeSectionsEmojisUnicode=");
         var5.append(var9);
         var5.append(")");
         return var5.toString();
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
               r.h(var1, "guildId");
               r.h(var2, "guildName");
               r.h(var4, "emojisDisabled");
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
               r.h(var1, "title");
               super(null);
               this.title = var1;
               this.emojiCount = var2;
            }
         }
      }
   }
}

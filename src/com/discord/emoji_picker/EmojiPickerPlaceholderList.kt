package com.discord.emoji_picker

import com.discord.emoji_picker.EmojiPickerItemData.CoreData.NativeSection
import com.discord.misc.utilities.collections.StubbedList
import eh.p
import java.util.ArrayList
import kotlin.jvm.internal.r

internal class EmojiPickerPlaceholderList(nativeSection: List<NativeSection>, offsetId: Long) : StubbedList<EmojiPickerItem> {
   private final val listHeaderIndices: List<Int>
   private final val listSize: Int
   private final val nativeSection: List<NativeSection>
   private final val offsetId: Long

   public open val size: Int
      public open get() {
         return this.listSize;
      }


   init {
      r.h(var1, "nativeSection");
      super();
      this.nativeSection = var1;
      this.offsetId = var2;
      val var8: java.util.Iterator = var1.iterator();
      var var4: Int = 0;

      while (var8.hasNext()) {
         var4 += (var8.next() as EmojiPickerItemData.CoreData.NativeSection).getCount() + 1;
      }

      this.listSize = var4;
      val var6: java.util.List = this.nativeSection;
      var var9: Int = 0;
      var4 = h.t(var6, 9);
      val var10: Any;
      if (var4 == 0) {
         var10 = h.d(var9);
      } else {
         val var5: ArrayList = new ArrayList(var4 + 1);
         var5.add(var9);

         for (EmojiPickerItemData.CoreData.NativeSection var7 : var6) {
            var9 = var9.intValue() + var7.getCount() + 1;
            var5.add(var9);
         }

         var10 = var5;
      }

      this.listHeaderIndices = h.T((java.util.List)var10, 1);
   }

   public open operator fun get(index: Int): EmojiPickerItem {
      val var2: Int = this.listHeaderIndices.indexOf(var1);
      if (var2 != -1) {
         val var3: EmojiPickerItemData.CoreData.NativeSection = this.nativeSection.get(var2);
         val var4: java.lang.String;
         if (var3 is EmojiPickerItemData.CoreData.NativeSection.Unicode) {
            var4 = (var3 as EmojiPickerItemData.CoreData.NativeSection.Unicode).getTitle();
         } else {
            if (var3 !is EmojiPickerItemData.CoreData.NativeSection.Guild) {
               throw new p();
            }

            var4 = (var3 as EmojiPickerItemData.CoreData.NativeSection.Guild).getGuildName();
         }

         return new EmojiPickerItem.Category(var4, 0L, false, 6, null);
      } else {
         return new EmojiPickerItem.EmojiPlaceholder(this.offsetId + var1);
      }
   }
}

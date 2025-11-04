package com.discord.emoji_picker

import com.discord.emoji_picker.EmojiPickerItemData.CoreData.NativeSection
import com.discord.misc.utilities.collections.StubbedList
import java.util.ArrayList
import kotlin.jvm.internal.SourceDebugExtension

@SourceDebugExtension(["SMAP\nEmojiPickerPlaceholderList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EmojiPickerPlaceholderList.kt\ncom/discord/emoji_picker/EmojiPickerPlaceholderList\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,36:1\n1#2:37\n1#2:41\n2853#3,3:38\n2856#3,6:42\n*S KotlinDebug\n*F\n+ 1 EmojiPickerPlaceholderList.kt\ncom/discord/emoji_picker/EmojiPickerPlaceholderList\n*L\n11#1:41\n11#1:38,3\n11#1:42,6\n*E\n"])
internal class EmojiPickerPlaceholderList(nativeSection: List<NativeSection>, offsetId: Long) : StubbedList<EmojiPickerItem> {
   private final val nativeSection: List<NativeSection>
   private final val offsetId: Long
   private final val listSize: Int
   private final val listHeaderIndices: List<Int>

   public open val size: Int
      public open get() {
         return this.listSize;
      }


   init {
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
      var4 = CollectionsKt.v(var6, 9);
      val var10: Any;
      if (var4 == 0) {
         var10 = CollectionsKt.e(var9);
      } else {
         val var5: ArrayList = new ArrayList(var4 + 1);
         var5.add(var9);

         for (EmojiPickerItemData.CoreData.NativeSection var7 : var6) {
            var9 = var9.intValue() + var7.getCount() + 1;
            var5.add(var9);
         }

         var10 = var5;
      }

      this.listHeaderIndices = CollectionsKt.c0((java.util.List)var10, 1);
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
               throw new xa.p();
            }

            var4 = (var3 as EmojiPickerItemData.CoreData.NativeSection.Guild).getGuildName();
         }

         return new EmojiPickerItem.Category(var4, 0L, false, 6, null);
      } else {
         return new EmojiPickerItem.EmojiPlaceholder(this.offsetId + var1);
      }
   }
}

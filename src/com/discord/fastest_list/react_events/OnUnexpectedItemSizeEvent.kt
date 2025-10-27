package com.discord.fastest_list.react_events

import com.discord.fastest_list.android.FastestListSections
import com.discord.fastest_list.android.FastestListSections.Entry
import com.discord.misc.utilities.size.SizeUtilsKt
import com.discord.react.utilities.NativeMapExtensionsKt
import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import xa.v

internal class OnUnexpectedItemSizeEvent(entry: Entry, size: Int) : ReactEvent {
   private final val entry: Entry
   private final val size: Int

   init {
      this.entry = var1;
      this.size = var2;
   }

   public open fun serialize(): WritableMap {
      val var2: Pair = v.a("section", this.entry.getSection-sZRFyWU());
      val var1: Int;
      if (this.entry is FastestListSections.Entry.SectionItem) {
         var1 = (this.entry as FastestListSections.Entry.SectionItem).getItem-JXkbwXs();
      } else {
         var1 = 0;
      }

      return NativeMapExtensionsKt.nativeMapOf(
         new Pair[]{
            var2,
            v.a("item", var1),
            v.a("isSectionHeader", this.entry is FastestListSections.Entry.SectionHeader),
            v.a("isSectionFooter", this.entry is FastestListSections.Entry.SectionFooter),
            v.a("size", SizeUtilsKt.getPxToDp(this.size)),
            v.a("sizeExpected", SizeUtilsKt.getPxToDp(this.entry.getSize()))
         }
      );
   }
}

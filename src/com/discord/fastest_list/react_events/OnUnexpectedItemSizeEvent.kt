package com.discord.fastest_list.react_events

import com.discord.fastest_list.android.FastestListSections
import com.discord.fastest_list.android.FastestListSections.Entry
import com.discord.misc.utilities.size.SizeUtilsKt
import com.discord.react.utilities.NativeMapExtensionsKt
import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import kotlin.jvm.internal.r
import r9.s

internal class OnUnexpectedItemSizeEvent(entry: Entry, size: Int) : ReactEvent {
   private final val entry: Entry
   private final val size: Int

   init {
      r.h(var1, "entry");
      super();
      this.entry = var1;
      this.size = var2;
   }

   public override fun serialize(): WritableMap {
      val var3: Pair = s.a("section", this.entry.getSection-sZRFyWU());
      val var1: Int;
      if (this.entry is FastestListSections.Entry.SectionItem) {
         var1 = (this.entry as FastestListSections.Entry.SectionItem).getItem-JXkbwXs();
      } else {
         var1 = 0;
      }

      return NativeMapExtensionsKt.nativeMapOf(
         var3,
         s.a("item", var1),
         s.a("isSectionHeader", this.entry is FastestListSections.Entry.SectionHeader),
         s.a("isSectionFooter", this.entry is FastestListSections.Entry.SectionFooter),
         s.a("size", SizeUtilsKt.getPxToDp(this.size)),
         s.a("sizeExpected", SizeUtilsKt.getPxToDp(this.entry.getSize()))
      );
   }
}

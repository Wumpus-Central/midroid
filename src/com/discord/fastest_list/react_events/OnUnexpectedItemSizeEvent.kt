package com.discord.fastest_list.react_events

import com.discord.fastest_list.android.FastestListSections
import com.discord.fastest_list.android.FastestListSections.Entry
import com.discord.misc.utilities.size.SizeUtilsKt
import com.discord.react.utilities.NativeMapExtensionsKt
import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import kotlin.jvm.internal.q
import vj.w

internal class OnUnexpectedItemSizeEvent(entry: Entry, size: Int) : ReactEvent {
   private final val entry: Entry
   private final val size: Int

   init {
      q.h(var1, "entry");
      super();
      this.entry = var1;
      this.size = var2;
   }

   public open fun serialize(): WritableMap {
      val var3: Pair = w.a("section", this.entry.getSection-sZRFyWU());
      var var1: Int = 0;
      if (this.entry is FastestListSections.Entry.SectionItem) {
         var1 = (this.entry as FastestListSections.Entry.SectionItem).getItem-JXkbwXs();
      }

      return NativeMapExtensionsKt.nativeMapOf(
         new Pair[]{
            var3,
            w.a("item", var1),
            w.a("isSectionHeader", this.entry is FastestListSections.Entry.SectionHeader),
            w.a("isSectionFooter", this.entry is FastestListSections.Entry.SectionFooter),
            w.a("size", SizeUtilsKt.getPxToDp(this.size)),
            w.a("sizeExpected", SizeUtilsKt.getPxToDp(this.entry.getSize()))
         }
      );
   }
}

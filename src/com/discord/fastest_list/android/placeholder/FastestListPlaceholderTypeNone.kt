package com.discord.fastest_list.android.placeholder

import android.view.ViewGroup
import com.discord.fastest_list.android.FastestListSections.Entry
import kotlin.jvm.internal.r

internal data object FastestListPlaceholderTypeNone : FastestListPlaceholder() {
   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else {
         return var1 is FastestListPlaceholderTypeNone;
      }
   }

   public override fun hashCode(): Int {
      return 179003907;
   }

   public override fun onPlaceholderShouldBind(view: ViewGroup, item: Entry) {
      r.h(var1, "view");
      r.h(var2, "item");
   }

   public override fun onPlaceholderShouldUnbind(view: ViewGroup) {
      r.h(var1, "view");
   }

   public override fun toString(): String {
      return "FastestListPlaceholderTypeNone";
   }
}

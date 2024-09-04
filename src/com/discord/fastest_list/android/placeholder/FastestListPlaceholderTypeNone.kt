package com.discord.fastest_list.android.placeholder

import android.view.ViewGroup
import com.discord.fastest_list.android.FastestListSections.Entry
import kotlin.jvm.internal.q

internal data object FastestListPlaceholderTypeNone : FastestListPlaceholder() {
   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is FastestListPlaceholderTypeNone) {
         return false;
      } else {
         var1 = var1;
         return true;
      }
   }

   public override fun hashCode(): Int {
      return 179003907;
   }

   public override fun onPlaceholderShouldBind(view: ViewGroup, item: Entry) {
      q.h(var1, "view");
      q.h(var2, "item");
   }

   public override fun onPlaceholderShouldUnbind(view: ViewGroup) {
      q.h(var1, "view");
   }

   public override fun toString(): String {
      return "FastestListPlaceholderTypeNone";
   }
}

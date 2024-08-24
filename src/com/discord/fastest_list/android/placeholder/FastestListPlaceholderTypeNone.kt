package com.discord.fastest_list.android.placeholder

import android.view.ViewGroup
import com.discord.fastest_list.android.FastestListSections.Entry
import kotlin.jvm.internal.r

internal object FastestListPlaceholderTypeNone : FastestListPlaceholder() {
   public override fun onPlaceholderShouldBind(view: ViewGroup, item: Entry) {
      r.h(var1, "view");
      r.h(var2, "item");
   }

   public override fun onPlaceholderShouldUnbind(view: ViewGroup) {
      r.h(var1, "view");
   }
}

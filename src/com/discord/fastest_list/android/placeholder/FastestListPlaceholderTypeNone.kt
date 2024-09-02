package com.discord.fastest_list.android.placeholder

import android.view.ViewGroup
import com.discord.fastest_list.android.FastestListSections.Entry
import kotlin.jvm.internal.q

internal object FastestListPlaceholderTypeNone : FastestListPlaceholder() {
   public override fun onPlaceholderShouldBind(view: ViewGroup, item: Entry) {
      q.h(var1, "view");
      q.h(var2, "item");
   }

   public override fun onPlaceholderShouldUnbind(view: ViewGroup) {
      q.h(var1, "view");
   }
}

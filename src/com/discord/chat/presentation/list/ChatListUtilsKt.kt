package com.discord.chat.presentation.list

import android.content.Context
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ItemDecoration
import com.discord.chat.presentation.message.decorations.BackgroundHighlightDecoration
import kotlin.jvm.internal.q

public fun RecyclerView.configureMessageRecyclerView(context: Context, vararg decorations: ItemDecoration) {
   q.h(var0, "<this>");
   q.h(var1, "context");
   q.h(var2, "decorations");
   var0.addItemDecoration(new BackgroundHighlightDecoration(var1));
   var0.setItemViewCacheSize(20);
   val var4: Int = var2.length;

   for (int var3 = 0; var3 < var4; var3++) {
      var0.addItemDecoration(var2[var3]);
   }

   var0.setItemAnimator(null);
}

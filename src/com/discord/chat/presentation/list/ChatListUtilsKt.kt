package com.discord.chat.presentation.list

import android.content.Context
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ItemDecoration
import androidx.recyclerview.widget.RecyclerView.RecycledViewPool
import com.discord.chat.presentation.message.decorations.BackgroundHighlightDecoration
import kotlin.jvm.internal.r

public fun RecyclerView.configureMessageRecyclerView(context: Context, vararg decorations: ItemDecoration) {
   r.h(var0, "<this>");
   r.h(var1, "context");
   r.h(var2, "decorations");
   var0.addItemDecoration(new BackgroundHighlightDecoration(var1));
   var0.setItemViewCacheSize(20);
   val var4: Int = var2.length;

   for (int var3 = 0; var3 < var4; var3++) {
      var0.addItemDecoration(var2[var3]);
   }

   var0.setItemAnimator(null);
}

public fun getMessageAccessoriesViewPool(): RecycledViewPool {
   val var0: RecycledViewPool = new RecycledViewPool();
   var0.m(0, 50);
   var0.m(26, 20);
   var0.m(1, 20);
   var0.m(4, 10);
   return var0;
}

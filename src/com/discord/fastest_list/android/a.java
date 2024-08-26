package com.discord.fastest_list.android;

import android.view.View;
import android.view.View.OnLayoutChangeListener;
import kotlin.jvm.functions.Function5;

public final class a implements OnLayoutChangeListener {
   public final FastestListView j;
   public final Function5 k;

   public final void onLayoutChange(View var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      FastestListView.b(this.j, this.k, var1, var2, var3, var4, var5, var6, var7, var8, var9);
   }
}

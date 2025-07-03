package com.discord.chat.input.views;

import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnKeyListener;
import kotlin.jvm.internal.Ref.BooleanRef;

// $VF: synthetic class
public final class j implements OnKeyListener {
   public final BooleanRef j;
   public final DCDChatInput k;

   public final boolean onKey(View var1, int var2, KeyEvent var3) {
      return DCDChatInput.b(this.j, this.k, var1, var2, var3);
   }
}

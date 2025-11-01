package com.discord.chat.input.views;

import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnKeyListener;
import kotlin.jvm.internal.Ref;

// $VF: synthetic class
public final class j implements OnKeyListener {
   public final Ref.BooleanRef d;
   public final DCDChatInput e;

   public final boolean onKey(View var1, int var2, KeyEvent var3) {
      return DCDChatInput.b(this.d, this.e, var1, var2, var3);
   }
}

package com.discord.chat.presentation.textutils;

import android.view.View;
import com.discord.chat.bridge.contentnode.EmojiContentNode;
import kotlin.jvm.functions.Function1;

// $VF: synthetic class
public final class i implements Function1 {
   public final RenderContext d;
   public final EmojiContentNode e;

   public final Object invoke(Object var1) {
      return EmojiRendererKt.a(this.d, this.e, (View)var1);
   }
}

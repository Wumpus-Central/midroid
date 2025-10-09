package com.discord.chat.presentation.message;

import android.view.View;
import com.discord.chat.presentation.message.messagepart.MessageAccessory;
import kotlin.jvm.functions.Function4;

// $VF: synthetic class
public final class r implements Function4 {
   public final MessageAccessory d;
   public final MessageAccessoriesAdapter e;

   public final Object invoke(Object var1, Object var2, Object var3, Object var4) {
      return MessageAccessoriesAdapter.b(this.d, this.e, (View)var1, (String)var2, (Integer)var3, (Double)var4);
   }
}

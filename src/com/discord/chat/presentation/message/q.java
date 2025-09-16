package com.discord.chat.presentation.message;

import com.discord.chat.bridge.MediaType;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function6;

// $VF: synthetic class
public final class q implements Function4 {
   public final Function6 d;
   public final MessageAccessoriesAdapter e;

   public final Object invoke(Object var1, Object var2, Object var3, Object var4) {
      return MessageAccessoriesAdapter.r(this.d, this.e, (MediaType)var1, (Integer)var2, (String)var3, (Integer)var4);
   }
}

package com.discord.chat.presentation.message.view.polls;

import com.discord.chat.presentation.message.messagepart.PollMessageAccessory;
import com.discord.chat.reactevents.ViewResizeMode;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.functions.Function8;

// $VF: synthetic class
public final class b implements Function6 {
   public final Function8 d;
   public final PollMessageAccessory e;

   public final Object invoke(Object var1, Object var2, Object var3, Object var4, Object var5, Object var6) {
      return BasePollWithRecyclerView.i(this.d, this.e, (String)var1, (Integer)var2, (Integer)var3, (Integer)var4, (Integer)var5, (ViewResizeMode)var6);
   }
}

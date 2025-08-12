package com.discord.chat.presentation.message.view;

import com.discord.chat.bridge.contentnode.LinkContentNode;
import com.discord.chat.presentation.message.messagepart.ReferralMessageAccessory;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

// $VF: synthetic class
public final class L0 implements Function1 {
   public final Function2 j;
   public final ReferralMessageAccessory k;

   public final Object invoke(Object var1) {
      return ReferralView.a(this.j, this.k, (LinkContentNode)var1);
   }
}

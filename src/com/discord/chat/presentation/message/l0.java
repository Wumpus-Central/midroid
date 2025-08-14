package com.discord.chat.presentation.message;

import java.util.Comparator;
import kotlin.jvm.functions.Function2;

// $VF: synthetic class
public final class l0 implements Comparator {
   public final Function2 d;

   @Override
   public final int compare(Object var1, Object var2) {
      return MessageView.j(this.d, var1, var2);
   }
}

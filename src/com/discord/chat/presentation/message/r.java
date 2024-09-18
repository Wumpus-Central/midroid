package com.discord.chat.presentation.message;

import java.util.Comparator;
import kotlin.jvm.functions.Function2;

// $VF: synthetic class
public final class r implements Comparator {
   public final Function2 j;

   @Override
   public final int compare(Object var1, Object var2) {
      return MessageView.f(this.j, var1, var2);
   }
}

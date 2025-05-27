package com.discord.chat.reactevents;

import android.content.Context;
import com.discord.reactevents.ReactEvent;
import com.discord.reactevents.ReactEvents;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

// $VF: synthetic class
public final class a implements Function1 {
   public final ReactEvents j;
   public final Context k;
   public final Function0 l;

   public final Object invoke(Object var1) {
      return ChatViewEventHandler.a(this.j, this.k, this.l, (ReactEvent)var1);
   }
}

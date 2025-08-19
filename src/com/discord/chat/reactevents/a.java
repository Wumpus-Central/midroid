package com.discord.chat.reactevents;

import android.content.Context;
import com.discord.reactevents.ReactEvent;
import com.discord.reactevents.ReactEvents;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

// $VF: synthetic class
public final class a implements Function1 {
   public final ReactEvents d;
   public final Context e;
   public final Function0 i;

   public final Object invoke(Object var1) {
      return ChatViewEventHandler.a(this.d, this.e, this.i, (ReactEvent)var1);
   }
}

package com.discord.misc.utilities.threading

import android.os.Handler
import android.os.Looper
import eh.l
import eh.o
import kotlin.jvm.functions.Function0
import kotlin.jvm.internal.r

public final val isOnMainThread: Boolean
   public final get() {
      return r.c(Looper.myLooper(), Looper.getMainLooper());
   }


public final val uiHandler: Handler by l.a(o.k, <unrepresentable>.INSTANCE)
   public final get() {
      return uiHandler$delegate.getValue() as Handler;
   }


public inline fun <T> assertOnUiThread(crossinline block: () -> T): T {
   r.h(var0, "block");
   if (isOnMainThread()) {
      return (T)var0.invoke();
   } else {
      val var2: Thread = Thread.currentThread();
      val var1: StringBuilder = new StringBuilder();
      var1.append("Expected to be on android main thread. Current: ");
      var1.append(var2);
      throw new IllegalStateException(var1.toString().toString());
   }
}

public inline fun postOrRunOnMainThread(crossinline block: () -> Unit) {
   r.h(var0, "block");
   if (isOnMainThread()) {
      var0.invoke();
   } else {
      getUiHandler().post(new Runnable(var0) {
         final Function0<Unit> $block;

         {
            this.$block = var1;
         }

         @Override
         public final void run() {
            this.$block.invoke();
         }
      });
   }
}

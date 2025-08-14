package com.discord.misc.utilities.threading

import B9.j
import B9.m
import android.os.Handler
import android.os.Looper
import kotlin.jvm.functions.Function0

public final val uiHandler: Handler by j.a(m.e, new a())
   public final get() {
      return uiHandler$delegate.getValue() as Handler;
   }


public final val isOnMainThread: Boolean
   public final get() {
      return Looper.myLooper() == Looper.getMainLooper();
   }


@JvmSynthetic
fun a(): Handler {
   return uiHandler_delegate$lambda$0();
}

public inline fun <T> assertOnUiThread(crossinline block: () -> T): T {
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

fun `uiHandler_delegate$lambda$0`(): Handler {
   return new Handler(Looper.getMainLooper());
}

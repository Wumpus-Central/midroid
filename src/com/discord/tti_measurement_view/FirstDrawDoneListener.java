package com.discord.tti_measurement_view;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Build.VERSION;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewTreeObserver.OnDrawListener;
import androidx.annotation.NonNull;
import java.util.concurrent.atomic.AtomicReference;

public class FirstDrawDoneListener implements OnDrawListener {
   private final Runnable callback;
   @SuppressLint({"ThreadPoolCreation"})
   private final Handler mainThreadHandler = new Handler(Looper.getMainLooper());
   private final AtomicReference<View> viewReference;

   private FirstDrawDoneListener(View var1, Runnable var2) {
      this.viewReference = new AtomicReference<>(var1);
      this.callback = var2;
   }

   private static boolean isAliveAndAttached(View var0) {
      return var0.getViewTreeObserver().isAlive() && var0.isAttachedToWindow();
   }

   public static void registerForNextDraw(View var0, Runnable var1) {
      FirstDrawDoneListener var2 = new FirstDrawDoneListener(var0, var1);
      if (VERSION.SDK_INT < 26 && !isAliveAndAttached(var0)) {
         var0.addOnAttachStateChangeListener(new OnAttachStateChangeListener(var2) {
            final FirstDrawDoneListener val$listener;

            {
               this.val$listener = var1;
            }

            public void onViewAttachedToWindow(@NonNull View var1) {
               var1.getViewTreeObserver().addOnDrawListener(this.val$listener);
               var1.removeOnAttachStateChangeListener(this);
            }

            public void onViewDetachedFromWindow(@NonNull View var1) {
               var1.removeOnAttachStateChangeListener(this);
            }
         });
      } else {
         var0.getViewTreeObserver().addOnDrawListener(var2);
      }
   }

   public void onDraw() {
      View var1 = this.viewReference.getAndSet(null);
      if (var1 != null) {
         var1.getViewTreeObserver().addOnGlobalLayoutListener(new a(this, var1));
         this.mainThreadHandler.postAtFrontOfQueue(this.callback);
      }
   }
}

package com.discord.misc.utilities.coroutines

import android.view.View
import android.view.View.OnAttachStateChangeListener
import fc.S
import kotlin.coroutines.CoroutineContext
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.v

public class AttachedViewCoroutineScope(view: View) : CoroutineScope {
   public open val coroutineContext: CoroutineContext

   init {
      var1.addOnAttachStateChangeListener(new OnAttachStateChangeListener(this) {
         final AttachedViewCoroutineScope this$0;

         {
            this.this$0 = var1;
         }

         public void onViewAttachedToWindow(View var1) {
         }

         public void onViewDetachedFromWindow(View var1) {
            val var2: AttachedViewCoroutineScope = this.this$0;
            val var3: StringBuilder = new StringBuilder();
            var3.append(var1);
            var3.append(" detached from window");
            AttachedViewCoroutineScope.cancelAllWork$default(var2, var3.toString(), null, 2, null);
         }
      });
   }

   public fun cancelAllWork(message: String, cause: Throwable? = null) {
      v.g(this.getCoroutineContext(), S.a(var1, var2));
   }
}
